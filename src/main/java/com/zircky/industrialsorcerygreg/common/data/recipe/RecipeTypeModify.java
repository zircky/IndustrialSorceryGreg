package com.zircky.industrialsorcerygreg.common.data.recipe;

import com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes;

import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.*;

public final class RecipeTypeModify {
  public static void init() {
    LARGE_CHEMICAL_RECIPES.onRecipeBuild((recipeBuilder, provider) -> ISGRecipeTypes.CHEMICAL_PLANT_RECIPES.copyFrom(recipeBuilder).save(provider));
    MIXER_RECIPES.onRecipeBuild((recipe, provider) -> ISGRecipeTypes.LARGE_MIXER_RECIPES.copyFrom(recipe).save(provider));
  }
}
