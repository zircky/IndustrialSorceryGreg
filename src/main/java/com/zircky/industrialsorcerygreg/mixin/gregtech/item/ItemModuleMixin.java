package com.zircky.industrialsorcerygreg.mixin.gregtech.item;

import com.zircky.industrialsorcerygreg.common.data.ISGItemModules;

import com.gregtechceu.gtceu.api.capability.GTCapabilityHelper;
import com.gregtechceu.gtceu.api.item.module.ItemModule;
import com.gregtechceu.gtceu.common.module.FluidStorageModule;

import net.minecraft.world.item.ItemStack;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = ItemModule.class, remap = false)
public abstract class ItemModuleMixin {
  @Inject(method = "canApplyTo", at = @At("HEAD"), cancellable = true)
  private void isg$preventConflictingFluidTank(ItemStack stack, CallbackInfoReturnable<Boolean> cir) {
    if (!((Object) this instanceof FluidStorageModule)) return;
    final var modular = GTCapabilityHelper.getModularItem(stack);
    if (modular != null && modular.getModuleContext(ISGItemModules.OXYGEN_TANK) != null) {
      cir.setReturnValue(false);
    }
  }
}
