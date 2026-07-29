package com.zircky.industrialsorcerygreg.data.recipe.misc.processecing;

import com.gregtechceu.gtceu.common.data.GTMaterials;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.LARGE_MIXER_RECIPES;

public class UltimateMaterials {
  private static void init(Consumer<FinishedRecipe> provider) {
    LARGE_MIXER_RECIPES.recipeBuilder("ultimate_materials")
        .inputDust(GTMaterials.Ruthenium)
        .inputDust(GTMaterials.Rhodium)
        .inputDust(GTMaterials.Palladium);
  }
}
