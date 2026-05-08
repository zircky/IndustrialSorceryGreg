package com.zircky.industrialsorcerygreg.data;

import com.zircky.industrialsorcerygreg.data.recipe.classified.AssemblerRecipes;
import com.zircky.industrialsorcerygreg.data.recipe.classified.MixerRecipes;
import com.zircky.industrialsorcerygreg.data.recipe.generated.ForEachMaterial;
import com.zircky.industrialsorcerygreg.data.recipe.RecipeRemoval;
import com.zircky.industrialsorcerygreg.data.recipe.integration.ae2.AppliedEnergistics2Recipe;
import com.zircky.industrialsorcerygreg.data.recipe.misc.component.ComponentRecipe;
import com.zircky.industrialsorcerygreg.data.recipe.misc.machines.CannerRecipes;
import com.zircky.industrialsorcerygreg.data.recipe.misc.machines.ChemicalReactorRecipes;
import com.zircky.industrialsorcerygreg.data.recipe.misc.machines.FuelReprocessorRecipes;
import com.zircky.industrialsorcerygreg.data.recipe.misc.processecing.platinum.PlatinumLine;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class Data {
  public static void init(Consumer<FinishedRecipe> provider) {
    commonInit(provider);
  }

  public static void removeInit(Consumer<ResourceLocation> consumer) {
    RecipeRemoval.init(consumer);
    AppliedEnergistics2Recipe.removeInit(consumer);
  }

  private static void commonInit(Consumer<FinishedRecipe> provider) {
    AppliedEnergistics2Recipe.init(provider);
    AssemblerRecipes.init(provider);
    MixerRecipes.init(provider);
    ComponentRecipe.init(provider);
    ChemicalReactorRecipes.init(provider);
    PlatinumLine.init(provider);
    FuelReprocessorRecipes.init(provider);
    //CannerRecipes.init(provider);
    ForEachMaterial.init(provider);
  }
}
