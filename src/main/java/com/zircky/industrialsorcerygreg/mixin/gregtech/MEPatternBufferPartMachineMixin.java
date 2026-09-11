package com.zircky.industrialsorcerygreg.mixin.gregtech;

import com.gregtechceu.gtceu.integration.ae2.machine.MEPatternBufferPartMachine;
import com.zircky.industrialsorcerygreg.integration.ae2.machine.MEPatternBufferSizeProvider;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(value = MEPatternBufferPartMachine.class, remap = false)
public class MEPatternBufferPartMachineMixin {
  @ModifyConstant(
      method = {"<init>", "syncWorkerCount", "addWorker", "buildMainUI", "getAvailablePatterns"},
      constant = @Constant(intValue = 27))
  private int industrialsorcerygreg$useExtendedPatternBufferSize(int original) {
    if ((Object) this instanceof MEPatternBufferSizeProvider sizeProvider) {
      return sizeProvider.getPatternBufferSize();
    }
    return original;
  }
}
