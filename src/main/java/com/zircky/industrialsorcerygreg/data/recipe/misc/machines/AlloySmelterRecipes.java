package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.zircky.industrialsorcerygreg.common.data.ISGItems;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.ALLOY_SMELTER_RECIPES;

public class AlloySmelterRecipes {
  public static void init(Consumer<FinishedRecipe> provider) {
    ALLOY_SMELTER_RECIPES.recipeBuilder("mica_insulator_sheet")
        .inputItems(ISGItems.MICA_BASED_SHEET, 5)
        .inputDust(GTMaterials.SiliconDioxide, 3)
        .outputItems(ISGItems.MICA_INSULATOR_SHEET, 5)
        .EUt(30)
        .duration(400)
        .save(provider);
  }
}
