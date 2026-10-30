package com.zircky.industrialsorcerygreg.common.item.module;

import com.gregtechceu.gtceu.api.capability.GTCapabilityHelper;
import com.gregtechceu.gtceu.api.item.armor.ModularArmorItem;
import com.gregtechceu.gtceu.api.item.module.CapabilityProviderItemModule;
import com.gregtechceu.gtceu.api.item.module.ModuleContext;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.fluids.capability.IFluidHandlerItem;

import earth.terrarium.adastra.api.systems.OxygenApi;
import earth.terrarium.adastra.common.items.armor.SpaceSuitItem;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public final class OxygenTankModule extends CapabilityProviderItemModule<IFluidHandlerItem> {
  private static final int CONSUMPTION_INTERVAL = 12;
  private static final int OXYGEN_PER_USE = 2;

  public OxygenTankModule(ResourceLocation id) {
    super(id);
  }

  @Override
  public Component getInfo() {
    return Component.translatable(getDescriptionLanguageKey(), OxygenTankFluidHandler.CAPACITY);
  }

  @Override
  public boolean canApplyTo(ItemStack stack) {
    if (!(stack.getItem() instanceof ModularArmorItem armor) || armor.getEquipmentSlot() != EquipmentSlot.CHEST ||
        !super.canApplyTo(stack)) return false;
    final var modular = GTCapabilityHelper.getModularItem(stack);
    for (final var installed : modular.getAllModuleInstances()) {
      if (installed.getModule() instanceof CapabilityProviderItemModule<?> provider &&
          provider.getCapability() == ForgeCapabilities.FLUID_HANDLER_ITEM) return false;
    }
    return true;
  }

  @Override
  public Capability<IFluidHandlerItem> getCapability() {
    return ForgeCapabilities.FLUID_HANDLER_ITEM;
  }

  @Override
  public IFluidHandlerItem createCapabilityForStack(ModuleContext context, ItemStack stack) {
    return new OxygenTankFluidHandler(context);
  }

  // The tank item inside ModuleData owns the fluid, so attaching/removing never copies or clears it.
  @Override
  public void applyInitialCapabilityData(IFluidHandlerItem capability, ModuleContext context) {}

  @Override
  public void clearCapabilityFromStack(ModuleContext context, ItemStack stack) {}

  @Override
  public ItemStack copyCapabilityDataToModuleItem(IFluidHandlerItem capability, ModuleContext context) {
    return context.getData().getModuleItem().copy();
  }

  @Override
  public void updateModuleItem(ModuleContext context) {}

  @Override
  public void onArmorTick(ModuleContext context, LivingEntity entity) {
    if (!isEnabled(context) || entity.level().isClientSide || !(entity instanceof Player player) ||
        player.isCreative() || player.isSpectator() || !SpaceSuitItem.hasFullSet(player)) return;
    player.setTicksFrozen(0);
    if (player.tickCount % CONSUMPTION_INTERVAL != 0) return;
    final var tank = new OxygenTankFluidHandler(context);
    if (!OxygenApi.API.hasOxygen(player)) tank.drain(OXYGEN_PER_USE, IFluidHandler.FluidAction.EXECUTE);
    if (player.isEyeInFluidType(ForgeMod.WATER_TYPE.get()) &&
        tank.drain(OXYGEN_PER_USE, IFluidHandler.FluidAction.EXECUTE).getAmount() == OXYGEN_PER_USE) {
      player.setAirSupply(Math.min(player.getMaxAirSupply(), player.getAirSupply() + 40));
    }
  }

  @Override
  public void appendHoverText(ModuleContext context, @Nullable Level level, List<Component> tooltips, TooltipFlag flag) {
    tooltips.add(Component.translatable("module.industrialsorcerygreg.oxygen_tank.stored",
        new OxygenTankFluidHandler(context).getOxygenAmount(), OxygenTankFluidHandler.CAPACITY));
  }
}
