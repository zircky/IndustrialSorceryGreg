package com.zircky.industrialsorcerygreg.common.cover;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.capability.GTCapability;
import com.gregtechceu.gtceu.api.capability.ICoverable;
import com.gregtechceu.gtceu.api.capability.IEnergyContainer;
import com.gregtechceu.gtceu.api.cover.CoverBehavior;
import com.gregtechceu.gtceu.api.cover.CoverDefinition;
import com.gregtechceu.gtceu.api.machine.MetaMachine;
import com.gregtechceu.gtceu.api.machine.TickableSubscription;
import com.gregtechceu.gtceu.api.sync_system.annotations.SaveField;
import com.zircky.industrialsorcerygreg.api.data.wireless.WirelessEnergySavedData;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.util.LazyOptional;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

public final class WirelessEnergyReceiverCover extends CoverBehavior {

  private static final long TRANSFER_INTERVAL = 20L;

  @SaveField
  private int amperage;

  @SaveField
  private int tier;

  @Nullable
  private TickableSubscription tickableSubscription;

  public WirelessEnergyReceiverCover(
      final CoverDefinition definition,
      final ICoverable coverHolder,
      final Direction attachedSide,
      int tier,
      int amperage
  ) {
    super(definition, coverHolder, attachedSide);
    this.tier = tier;
    this.amperage = amperage;
  }

  @Override
  public void onAttached(final ItemStack itemStack, @Nullable final ServerPlayer player) {
    super.onAttached(itemStack, player);
    startTicking();
  }

  @Override
  public void onLoad() {
    super.onLoad();
    startTicking();
  }

  @Override
  public void onUnload() {
    stopTicking();

    coverHolder.scheduleRenderUpdate();

    super.onUnload();
  }

  @Override
  public void onRemoved() {
    stopTicking();

    coverHolder.notifyBlockUpdate();
    coverHolder.scheduleRenderUpdate();
    coverHolder.scheduleNeighborShapeUpdate();
    coverHolder.markAsChanged();


    super.onRemoved();
  }

  private void startTicking() {
    if (tickableSubscription != null) {
      return;
    }

    tickableSubscription = coverHolder.subscribeServerTick(this::serverTick);
  }

  private void stopTicking() {
    if (tickableSubscription == null) {
      return;
    }

    coverHolder.unsubscribe(tickableSubscription);
    tickableSubscription = null;
  }

  private void serverTick() {
    if (!(coverHolder.getLevel() instanceof ServerLevel serverLevel)) {
      return;
    }

    if (coverHolder.getOffsetTimer() % TRANSFER_INTERVAL != 0) {
      return;
    }

    final MetaMachine machine = MetaMachine.getMachine(
        coverHolder.getLevel(),
        coverHolder.getBlockPos()
    );

    if (machine == null) {
      return;
    }

    final IEnergyContainer energyContainer = getEnergyContainer(machine);

    if (energyContainer == null) {
      return;
    }

    final UUID owner = machine.getOwnerUUID();

    if (owner == null) {
      return;
    }

    final WirelessEnergySavedData data = WirelessEnergySavedData.getOrCreate(serverLevel);

    transferEnergy(energyContainer, data, owner);
  }

  private void transferEnergy(
      final IEnergyContainer energyContainer,
      final WirelessEnergySavedData data,
      final UUID owner
  ) {
    final long voltage = GTValues.V[tier];
    final long requestedEnergy = voltage * amperage;

    if (requestedEnergy <= 0) {
      return;
    }

    final long extracted = data.extractEnergy(owner, requestedEnergy);

    if (extracted <= 0) {
      return;
    }

    final long availableAmperage = extracted / voltage;

    if (availableAmperage <= 0) {
      data.insertEnergy(owner, extracted);
      return;
    }

    final long acceptedAmperage = energyContainer.acceptEnergyFromNetwork(
        attachedSide,
        voltage,
        availableAmperage
    );

    final long acceptedEnergy = acceptedAmperage * voltage;
    final long rejectedEnergy = extracted - acceptedEnergy;

    if (rejectedEnergy > 0) {
      data.insertEnergy(owner, rejectedEnergy);
    }
  }

  @Nullable
  private IEnergyContainer getEnergyContainer(final MetaMachine machine) {
    final IEnergyContainer sameSide = machine.getCapability(
        GTCapability.CAPABILITY_ENERGY_CONTAINER,
        attachedSide.getOpposite()
    ).orElse(null);

    if (sameSide != null) {
      return sameSide;
    }

    final IEnergyContainer oppositeSide = machine.getCapability(
        GTCapability.CAPABILITY_ENERGY_CONTAINER,
        attachedSide.getOpposite()
    ).orElse(null);

    if (oppositeSide != null) {
      return oppositeSide;
    }

    return machine.getCapability(
        GTCapability.CAPABILITY_ENERGY_CONTAINER,
        null
    ).orElse(null);
  }
}