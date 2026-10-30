package com.zircky.industrialsorcerygreg.mixin.adastra;

import com.zircky.industrialsorcerygreg.common.data.ISGItemModules;
import com.zircky.industrialsorcerygreg.common.item.module.OxygenTankFluidHandler;
import earth.terrarium.botarium.common.fluid.FluidConstants;
import earth.terrarium.adastra.common.items.armor.SpaceSuitItem;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = SpaceSuitItem.class, remap = false)
public class AdAstraSpaceSuitItemMixin {
  @Inject(method = "getOxygenAmount", at = @At("HEAD"), cancellable = true)
  private static void isg$getModuleOxygen(Entity entity, CallbackInfoReturnable<Long> cir) {
    if (!(entity instanceof LivingEntity livingEntity)) return;
    var stack = livingEntity.getItemBySlot(EquipmentSlot.CHEST);
    final var context = ISGItemModules.getOxygenTank(stack);
    if (context != null) {
      cir.setReturnValue(FluidConstants.fromMillibuckets(new OxygenTankFluidHandler(context).getOxygenAmount()));
    }
  }
}
