package com.zircky.industrialsorcerygreg.mixin.gregtech;

import com.gregtechceu.gtceu.common.machine.multiblock.electric.CleanroomMachine;
import com.gregtechceu.gtceu.common.machine.trait.CleanroomLogic;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = CleanroomLogic.class, remap = false)
public abstract class CleanroomLogicMixin {
  @Inject(method = "serverTick", at = @At("TAIL"))
  private void industrialsorcerygreg$decreaseCleanlinessWhenDoorOpen(CallbackInfo ci) {
    CleanroomMachine machine = ((CleanroomLogic) (Object) this).getMachine();
    if (!machine.isFormed() || machine.self().getOffsetTimer() % 20 != 0) {
      return;
    }

    Level level = machine.getLevel();
    if (level == null) {
      return;
    }

    for (var posLong : machine.getDefaultPatternState().getCache().keySet()) {
      BlockPos pos = BlockPos.of(posLong);
      BlockState state = level.getBlockState(pos);
      if (state.getBlock() instanceof DoorBlock && state.hasProperty(DoorBlock.OPEN) && state.getValue(DoorBlock.OPEN)) {
        machine.adjustCleanAmount(-50);
        return;
      }
    }
  }
}
