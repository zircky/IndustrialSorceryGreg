package com.zircky.industrialsorcerygreg.mixin.gregtech;

import com.gregtechceu.gtceu.common.machine.multiblock.electric.CleanroomMachine;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(value = CleanroomMachine.class, remap = false)
public class CleanroomMachineMixin {
  @ModifyConstant(method = "adjustCleanAmount", constant = @Constant(intValue = CleanroomMachine.CLEAN_AMOUNT_THRESHOLD))
  private int industrialsorcerygreg$activateWithAnyCleanliness(int original) {
    return 1;
  }
}
