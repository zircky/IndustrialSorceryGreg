package com.zircky.industrialsorcerygreg.common.machine.multiblock.part;

import com.gregtechceu.gtceu.api.blockentity.BlockEntityCreationInfo;
import com.gregtechceu.gtceu.api.machine.multiblock.MultiblockControllerMachine;
import com.gregtechceu.gtceu.api.machine.multiblock.part.MultiblockPartMachine;
import com.gregtechceu.gtceu.api.sync_system.annotations.SaveField;
import com.gregtechceu.gtceu.api.sync_system.annotations.SyncToClient;
import lombok.Getter;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.Direction;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@Getter
@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class IndicatorHatchPartMachine extends MultiblockPartMachine {
  @SaveField
  @SyncToClient
  private int redstoneSignalOutput;

  public IndicatorHatchPartMachine(BlockEntityCreationInfo info) {
    super(info);
  }

  public void setRedstoneSignalOutput(int redstoneSignalOutput) {
    if (this.redstoneSignalOutput != redstoneSignalOutput) {
      this.redstoneSignalOutput = redstoneSignalOutput;
      syncDataHolder.markClientSyncFieldDirty("redstoneSignalOutput");
      if (getLevel() != null && !getLevel().isClientSide) {
        getLevel().updateNeighbourForOutputSignal(getBlockPos(), getBlockState().getBlock());
      }
    }
  }

  @Override
  public int getOutputSignal(@Nullable Direction side) {
    if (side == getFrontFacing().getOpposite()) {
      return redstoneSignalOutput;
    }
    return 0;
  }

  @Override
  public boolean canConnectRedstone(Direction side) {
    return side == getFrontFacing();
  }


  @Override
  public boolean canShared(MultiblockControllerMachine controller, String substructureName) {
    return false;
  }

}
