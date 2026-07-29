package com.zircky.industrialsorcerygreg.common.data.recipe;

import com.gregtechceu.gtceu.common.data.GTRecipeTypes;

public class RecipeTypesModify {
  public static void init() {
    GTRecipeTypes.GAS_TURBINE_FUELS.setMaxIOSize(0, 0, 2, 0);
    GTRecipeTypes.COMBUSTION_GENERATOR_FUELS.setMaxIOSize(0, 0, 2, 0);
    GTRecipeTypes.LASER_ENGRAVER_RECIPES.setMaxIOSize(2, 1, 2, 1);
  }
}
