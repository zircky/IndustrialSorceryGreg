package com.zircky.industrialsorcerygreg.common.machine.multiblock.electric.water;

import com.gregtechceu.gtceu.api.blockentity.BlockEntityCreationInfo;
import com.gregtechceu.gtceu.api.machine.multiblock.WorkableElectricMultiblockMachine;
import com.gregtechceu.gtceu.api.machine.trait.RecipeLogic;

public class FlocculationPurificationUnitMachine extends WorkableElectricMultiblockMachine {
  public FlocculationPurificationUnitMachine(BlockEntityCreationInfo info) {
    super(info);
  }

  public FlocculationPurificationUnitMachine(BlockEntityCreationInfo info, RecipeLogic recipeLogic) {
    super(info, recipeLogic);
  }
}
