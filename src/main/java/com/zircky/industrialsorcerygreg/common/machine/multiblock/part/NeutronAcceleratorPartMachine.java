package com.zircky.industrialsorcerygreg.common.machine.multiblock.part;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.blockentity.BlockEntityCreationInfo;
import com.gregtechceu.gtceu.api.capability.recipe.IO;
import com.gregtechceu.gtceu.api.machine.TickableSubscription;
import com.gregtechceu.gtceu.api.machine.trait.notifiable.NotifiableEnergyContainer;
import com.gregtechceu.gtceu.common.machine.multiblock.part.EnergyHatchPartMachine;
import com.gregtechceu.gtceu.utils.ISubscription;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.BlockHitResult;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.concurrent.ThreadLocalRandom;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public final class NeutronAcceleratorPartMachine extends EnergyHatchPartMachine {

  private ISubscription powerListener;
  private TickableSubscription powerSubs;

  public NeutronAcceleratorPartMachine(BlockEntityCreationInfo info, int tier) {
    super(info, tier, IO.IN, 1);
  }

  @Override
  protected NotifiableEnergyContainer createEnergyContainer() {
    NotifiableEnergyContainer container;
    container = NotifiableEnergyContainer.receiverContainer(
            GTValues.V[tier] << 1, GTValues.V[tier], 1);
    container.setSideInputCondition((s) -> s == getFrontFacing() && isWorkingEnabled());
    container.setCapabilityValidator((s) -> s == null || s == getFrontFacing());
    return container;
  }


  public long consumeEnergy() {
    if (!isWorkingEnabled() || energyContainer.getEnergyStored() <= 0) {
      return 0L;
    }

    final long consumed = Math.abs(energyContainer.changeEnergy(-getMaxEUConsume()));
    final int multiplier = 10 + ThreadLocalRandom.current().nextInt(11);
    return consumed * multiplier;
  }

  @Override
  public void onLoad() {
    super.onLoad();
    powerListener = energyContainer.addChangedListener(this::updateSubscription);
    updateSubscription();
  }

  private void updateSubscription() {
    if (energyContainer.getEnergyStored() > 0) {
      powerSubs = subscribeServerTick(powerSubs, this::energyChanged);
      return;
    }
    if (powerSubs != null) {
      powerSubs.unsubscribe();
      powerSubs = null;
    }
  }

  private void energyChanged() {
    if (energyContainer.getEnergyStored() > 0 && !isWorkingEnabled()) {
      energyContainer.changeEnergy(-GTValues.V[tier]);
    }
  }

  public boolean shouldOpenUI(Player player, InteractionHand hand, BlockHitResult hit) {
    return true;
  }

  private long getMaxEUConsume() {
    return Math.round(GTValues.V[tier] * 0.8D);
  }

  public boolean canShared() {
    return false;
  }
}
