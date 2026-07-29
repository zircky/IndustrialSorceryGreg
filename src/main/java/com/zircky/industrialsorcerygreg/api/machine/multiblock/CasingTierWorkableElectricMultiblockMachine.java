package com.zircky.industrialsorcerygreg.api.machine.multiblock;

import com.gregtechceu.gtceu.api.blockentity.BlockEntityCreationInfo;
import com.gregtechceu.gtceu.api.machine.multiblock.WorkableElectricMultiblockMachine;
import net.minecraft.MethodsReturnNonnullByDefault;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class CasingTierWorkableElectricMultiblockMachine extends WorkableElectricMultiblockMachine {
  public CasingTierWorkableElectricMultiblockMachine(BlockEntityCreationInfo info) {
    super(info);
  }


}
