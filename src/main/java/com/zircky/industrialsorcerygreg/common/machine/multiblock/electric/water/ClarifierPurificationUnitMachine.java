package com.zircky.industrialsorcerygreg.common.machine.multiblock.electric.water;

import com.gregtechceu.gtceu.api.blockentity.BlockEntityCreationInfo;
import com.gregtechceu.gtceu.api.machine.multiblock.WorkableElectricMultiblockMachine;
import com.gregtechceu.gtceu.api.machine.trait.RecipeLogic;

public class ClarifierPurificationUnitMachine extends WorkableElectricMultiblockMachine {
  public ClarifierPurificationUnitMachine(BlockEntityCreationInfo info) {
    super(info);
  }

  public ClarifierPurificationUnitMachine(BlockEntityCreationInfo info, RecipeLogic recipeLogic) {
    super(info, recipeLogic);
  }
}
