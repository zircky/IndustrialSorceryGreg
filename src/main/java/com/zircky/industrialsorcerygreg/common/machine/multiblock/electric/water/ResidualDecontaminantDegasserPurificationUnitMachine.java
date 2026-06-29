package com.zircky.industrialsorcerygreg.common.machine.multiblock.electric.water;

import com.gregtechceu.gtceu.api.blockentity.BlockEntityCreationInfo;
import com.gregtechceu.gtceu.api.machine.multiblock.WorkableElectricMultiblockMachine;
import com.gregtechceu.gtceu.api.machine.trait.RecipeLogic;

public class ResidualDecontaminantDegasserPurificationUnitMachine extends WorkableElectricMultiblockMachine {
  public ResidualDecontaminantDegasserPurificationUnitMachine(BlockEntityCreationInfo info, RecipeLogic recipeLogic) {
    super(info, recipeLogic);
  }

  public ResidualDecontaminantDegasserPurificationUnitMachine(BlockEntityCreationInfo info) {
    super(info);
  }
}
