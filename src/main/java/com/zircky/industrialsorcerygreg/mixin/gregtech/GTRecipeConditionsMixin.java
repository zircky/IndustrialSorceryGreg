package com.zircky.industrialsorcerygreg.mixin.gregtech;

import com.gregtechceu.gtceu.common.data.GTRecipeConditions;
import com.zircky.industrialsorcerygreg.common.data.ISGRecipeConditions;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GTRecipeConditions.class)
public class GTRecipeConditionsMixin {
  @Inject(method = "init", at = @At("HEAD"), remap = false)
  private static void register(CallbackInfo ci) {
    ISGRecipeConditions.init();
  }
}
