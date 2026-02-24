package com.zircky.industrialsorcerygreg.common.data;

import com.zircky.industrialsorcerygreg.data.Data;
import com.zircky.industrialsorcerygreg.data.recipe.misc.component.ComponentRecipe;
import com.zircky.industrialsorcerygreg.data.recipe.RecipeRemoval;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class ISGRecipes {
  public static int seconds = 20;
  public static int hour = seconds * 60;
  public static int day = 24 * hour;

  public static void recipeAddition(Consumer<FinishedRecipe> provider) {
    Data.init(provider);
  }

  public static void recipeRemoval(Consumer<ResourceLocation> consumer) {
    Data.removeInit(consumer);
  }
}
