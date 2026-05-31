package com.zircky.industrialsorcerygreg.mixin.gregtech;

import com.gregtechceu.gtceu.common.machine.multiblock.electric.CleanroomMachine;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value = CleanroomMachine.class, remap = false)
public interface CleanroomMachineAccessor {
  @Accessor("cleanAmount")
  int industrialsorcerygreg$getCleanAmount();
}
