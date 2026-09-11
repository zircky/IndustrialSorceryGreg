package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.LuV;
import static com.gregtechceu.gtceu.api.GTValues.VA;
import static com.gregtechceu.gtceu.common.data.GTMaterials.Fluorine;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.Titanium50Tetrafluoride;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.TitaniumTetrafluoride;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.GAS_CENTRIFUGE_RECIPES;

public class GasCentrifuge {
  public static void init(Consumer<FinishedRecipe> provider) {
    GAS_CENTRIFUGE_RECIPES.recipeBuilder("titanium_50_tetrafluoride")
        .circuitMeta(0)
        .inputFluids(TitaniumTetrafluoride.getFluid(10000))
        .outputFluids(Titanium50Tetrafluoride.getFluid(518), Fluorine.getFluid(9482))
        .duration(210).EUt(VA[LuV]).save(provider);
  }
}
