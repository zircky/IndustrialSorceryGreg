package com.zircky.industrialsorcerygreg.common.machine.multiblock.electric.water;

import com.gregtechceu.gtceu.api.blockentity.BlockEntityCreationInfo;
import com.gregtechceu.gtceu.api.machine.multiblock.WorkableElectricMultiblockMachine;
import com.gregtechceu.gtceu.api.machine.trait.RecipeLogic;

public class PHNeutralizationPurificationUnitMachine extends WorkableElectricMultiblockMachine {
  public PHNeutralizationPurificationUnitMachine(BlockEntityCreationInfo info) {
    super(info);
  }

  public PHNeutralizationPurificationUnitMachine(BlockEntityCreationInfo info, RecipeLogic recipeLogic) {
    super(info, recipeLogic);
  }
}
