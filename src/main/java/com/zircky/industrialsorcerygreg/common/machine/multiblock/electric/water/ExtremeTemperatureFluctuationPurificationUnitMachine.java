package com.zircky.industrialsorcerygreg.common.machine.multiblock.electric.water;

import com.gregtechceu.gtceu.api.blockentity.BlockEntityCreationInfo;
import com.gregtechceu.gtceu.api.machine.multiblock.WorkableElectricMultiblockMachine;
import com.gregtechceu.gtceu.api.machine.trait.RecipeLogic;

public class ExtremeTemperatureFluctuationPurificationUnitMachine extends WorkableElectricMultiblockMachine {
  public ExtremeTemperatureFluctuationPurificationUnitMachine(BlockEntityCreationInfo info) {
    super(info);
  }

  public ExtremeTemperatureFluctuationPurificationUnitMachine(BlockEntityCreationInfo info, RecipeLogic recipeLogic) {
    super(info, recipeLogic);
  }
}
