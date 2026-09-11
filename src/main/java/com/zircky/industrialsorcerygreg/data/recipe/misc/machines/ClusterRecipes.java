package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import com.zircky.industrialsorcerygreg.common.data.ISGItems;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.CLUSTER_RECIPES;

public class ClusterRecipes {
  public static void init(Consumer<FinishedRecipe> provider) {
    CLUSTER_RECIPES.recipeBuilder("mica_insulator_foil")
        .inputItems(ISGItems.MICA_INSULATOR_SHEET)
        .outputItems(ISGItems.MICA_INSULATOR_FOIL, 4)
        .EUt(30)
        .duration(100)
        .save(provider);
  }
}
