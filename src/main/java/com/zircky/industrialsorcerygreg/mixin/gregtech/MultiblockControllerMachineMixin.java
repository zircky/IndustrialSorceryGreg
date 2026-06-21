package com.zircky.industrialsorcerygreg.mixin.gregtech;

import com.gregtechceu.gtceu.api.machine.multiblock.MultiblockControllerMachine;
import net.minecraft.server.level.ServerLevel;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = MultiblockControllerMachine.class, remap = false)
public abstract class MultiblockControllerMachineMixin {

  @Inject(method = "asyncCheckPattern", at = @At("HEAD"), cancellable = true)
  private void isgCore$skipAsyncPatternCheckWhenServerUnavailable(long periodID, CallbackInfo ci) {
    MultiblockControllerMachine machine = (MultiblockControllerMachine) (Object) this;
    if (!(machine.getLevel() instanceof ServerLevel serverLevel) || serverLevel.getServer() == null) {
      ci.cancel();
    }
  }
}
