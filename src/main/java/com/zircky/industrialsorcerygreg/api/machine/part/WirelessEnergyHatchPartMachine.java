package com.zircky.industrialsorcerygreg.api.machine.part;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.blockentity.BlockEntityCreationInfo;
import com.gregtechceu.gtceu.api.capability.recipe.IO;
import com.gregtechceu.gtceu.api.machine.TickableSubscription;
import com.gregtechceu.gtceu.api.machine.multiblock.part.TieredIOPartMachine;
import com.gregtechceu.gtceu.api.machine.trait.NotifiableEnergyContainer;
import com.gregtechceu.gtceu.common.machine.owner.FTBOwner;
import com.gregtechceu.gtceu.common.machine.trait.EnvironmentalExplosionTrait;
import com.gregtechceu.gtceu.utils.FormattingUtil;
import com.gregtechceu.gtceu.utils.ISubscription;

import com.lowdragmc.lowdraglib.syncdata.annotation.Persisted;

import com.zircky.industrialsorcerygreg.IndustrialSorceryGreg;
import com.zircky.industrialsorcerygreg.api.data.wireless.WirelessEnergySavedData;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.TickTask;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.BlockHitResult;

import lombok.Getter;

import java.util.ArrayList;
import java.util.UUID;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class WirelessEnergyHatchPartMachine extends TieredIOPartMachine {

  protected static final long TICKS_BETWEEN_SAVE_DATA_OPERATIONS = 5 * 20L;

  @Persisted
  public final NotifiableEnergyContainer energyContainer;
  protected TickableSubscription wirelessSub;
  @Nullable
  protected ISubscription energyListener;
  @Getter
  protected int amperage;

  public WirelessEnergyHatchPartMachine(BlockEntityCreationInfo info, int tier, IO io, int amperage) {
    super(info, tier, io);
    this.amperage = amperage;
    this.energyContainer = attachTrait(createEnergyContainer());
    attachTrait(new EnvironmentalExplosionTrait(tier, tier * 10, () -> energyContainer.getEnergyStored() > 0));
  }

  protected NotifiableEnergyContainer createEnergyContainer() {
    NotifiableEnergyContainer container;
    if (io == IO.OUT) {
      container = NotifiableEnergyContainer.emitterContainer(getEnergyCapacity(tier, amperage),
          GTValues.V[tier], amperage);
      container.setSideOutputCondition(s -> s == getFrontFacing() && isWorkingEnabled());
      container.setCapabilityValidator(s -> s == null || s == getFrontFacing());
    } else {
      container = NotifiableEnergyContainer.receiverContainer(getEnergyCapacity(tier, amperage),
          GTValues.V[tier], amperage);
      container.setSideInputCondition(s -> s == getFrontFacing() && isWorkingEnabled());
      container.setCapabilityValidator(s -> s == null || s == getFrontFacing());
    }
    return container;
  }

  public static long getEnergyCapacity(final int tier, final int amperage) {
    final long voltage = GTValues.V[tier];
    final long ticks = (long) (TICKS_BETWEEN_SAVE_DATA_OPERATIONS * 1.1D);

    return voltage * amperage * ticks;
  }

  @Override
  public boolean shouldOpenUI(Player player, InteractionHand hand, BlockHitResult hit) {
    return false;
  }

  @Override
  public void onLoad() {
    super.onLoad();
    if (getLevel() instanceof ServerLevel serverLevel) {
      serverLevel.getServer().tell(new TickTask(0, this::updateWirelessSubscription));
    }
    energyListener = energyContainer.addChangedListener(this::updateWirelessSubscription);
  }

  @Override
  public void onUnload() {
    super.onUnload();

    if (energyListener != null) {
      energyListener.unsubscribe();
      energyListener = null;
    }

    if (wirelessSub != null) {
      wirelessSub.unsubscribe();
      wirelessSub = null;
    }

    clearWirelessStats();
  }

  private void clearWirelessStats() {
    if (!(getLevel() instanceof ServerLevel serverLevel)) {
      return;
    }

    final WirelessEnergySavedData data = WirelessEnergySavedData.getOrCreate(serverLevel);
    final UUID owner = getTeamUUID();
    final BlockPos pos = getBlockPos();

    data.removeEnergyInput(owner, pos);
    data.removeEnergyOutput(owner, pos);
    data.removeEnergyBuffered(owner, pos);
    data.removePassiveDrain(owner, pos);
  }

  protected void updateWirelessSubscription() {
    if (isWorkingEnabled()) wirelessSub = subscribeServerTick(wirelessSub, this::wirelessHandler);
    else if (wirelessSub != null) {
      wirelessSub.unsubscribe();
      wirelessSub = null;
    }
  }

  protected UUID getTeamUUID() {
    final UUID ownerUuid = getOwnerUUID();

    if (ownerUuid == null) {
      return Util.NIL_UUID;
    }

    final Object owner = getOwner();

    if (!(owner instanceof FTBOwner ftbOwner)) {
      return ownerUuid;
    }

    final var team = ftbOwner.getPlayerTeam(ownerUuid);

    if (team == null) {
      return ownerUuid;
    }

    return team.getTeamId();
  }

  protected void wirelessHandler() {
    if (!(getLevel() instanceof ServerLevel serverLevel)) {
      return;
    }

    if (!isWorkingEnabled()) {
      return;
    }

    final WirelessEnergySavedData data = WirelessEnergySavedData.getOrCreate(serverLevel);
    final UUID owner = getTeamUUID();

    updateNetworkStats(data, owner);

    if (getOffsetTimer() % TICKS_BETWEEN_SAVE_DATA_OPERATIONS != 0) {
      return;
    }

    if (!data.isActive(owner)) {
      return;
    }

    transferEnergy(data, owner);

  }

  private void updateNetworkStats(final WirelessEnergySavedData data, final UUID owner) {
    if (getOffsetTimer() % 20 != 0) {
      return;
    }

    data.setEnergyBuffered(owner, getBlockPos(), energyContainer.getEnergyStored());

    if (io == IO.OUT) {
      data.setEnergyInput(owner, getBlockPos(), energyContainer.getInputPerSec() / 20);
      return;
    }

    if (io == IO.IN) {
      data.setEnergyOutput(owner, getBlockPos(), energyContainer.getOutputPerSec() / 20);
    }
  }

  private void transferEnergy(final WirelessEnergySavedData data, final UUID owner) {
    if (io == IO.OUT) {
      transferToNetwork(data, owner);
    }

    if (io == IO.IN) {
      transferFromNetwork(data, owner);
    }
  }

  private void transferFromNetwork(final WirelessEnergySavedData data, final UUID owner) {
    final long canInsert = energyContainer.getEnergyCapacity() - energyContainer.getEnergyStored();
    final long extracted = data.extractEnergy(owner, canInsert);

    energyContainer.changeEnergy(extracted);
  }

  private void transferToNetwork(final WirelessEnergySavedData data, final UUID owner) {
    final long stored = energyContainer.getEnergyStored();
    final long inserted = data.insertEnergy(owner, stored);

    energyContainer.changeEnergy(-inserted);
  }


  public static Component[] getTooltipComponents(int tier, IO io, int amperage) {
    var tooltip = new ArrayList<Component>();

    if (io == IO.IN) {
      tooltip.add(Component.translatable("gtceu.universal.tooltip.voltage_in",
          FormattingUtil.formatNumbers(GTValues.V[tier]), GTValues.VNF[tier]));
      tooltip.add(Component.translatable("gtceu.universal.tooltip.amperage_in", amperage));
    } else if (io == IO.OUT) {
      tooltip.add(Component.translatable("gtceu.universal.tooltip.voltage_out",
          FormattingUtil.formatNumbers(GTValues.V[tier]), GTValues.VNF[tier]));
      tooltip.add(Component.translatable("gtceu.universal.tooltip.amperage_out", amperage));
    }

    tooltip.add(Component.translatable("gtceu.universal.tooltip.energy_storage_capacity",
        FormattingUtil.formatNumbers(getEnergyCapacity(tier, amperage))));

    if (io == IO.IN) {
      tooltip.add(Component.translatable(amperage > 1 ? "gtceu.machine.energy_hatch.input_hi_amp.tooltip" :
          "gtceu.machine.energy_hatch.input.tooltip"));
    } else if (io == IO.OUT) {
      tooltip.add(Component.translatable(amperage > 1 ? "gtceu.machine.energy_hatch.output_hi_amp.tooltip" :
          "gtceu.machine.energy_hatch.output.tooltip"));
    }

    return tooltip.toArray(new Component[0]);
  }
}
