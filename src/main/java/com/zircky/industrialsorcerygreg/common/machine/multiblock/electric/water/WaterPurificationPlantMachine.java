package com.zircky.industrialsorcerygreg.common.machine.multiblock.electric.water;

import com.gregtechceu.gtceu.api.blockentity.BlockEntityCreationInfo;
import com.gregtechceu.gtceu.api.machine.multiblock.WorkableElectricMultiblockMachine;
import com.gregtechceu.gtceu.api.machine.trait.RecipeLogic;

import static com.zircky.industrialsorcerygreg.api.ISGValues.SECONDS;

public class WaterPurificationPlantMachine extends WorkableElectricMultiblockMachine {

  public static final int CYCLE_TIME_TICKS = 120 * SECONDS;

  public WaterPurificationPlantMachine(BlockEntityCreationInfo info) {
    super(info);
  }

  public WaterPurificationPlantMachine(BlockEntityCreationInfo info, RecipeLogic recipeLogic) {
    super(info, recipeLogic);
  }
}
