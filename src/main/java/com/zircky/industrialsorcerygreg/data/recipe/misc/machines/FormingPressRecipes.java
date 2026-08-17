package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.zircky.industrialsorcerygreg.common.data.ISGItems;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.FORMING_PRESS_RECIPES;

public class FormingPressRecipes {
  public static void init(Consumer<FinishedRecipe> provider) {
    FORMING_PRESS_RECIPES.recipeBuilder("mica_based_sheet")
        .inputItems(ISGItems.MICA_BASED_PULP, 3)
        .inputDust(GTMaterials.Asbestos, 2)
        .outputItems(ISGItems.MICA_BASED_SHEET, 2)
        .EUt(30)
        .duration(400)
        .save(provider);
  }
}
