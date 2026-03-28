package com.zircky.industrialsorcerygreg.data;

import com.zircky.industrialsorcerygreg.data.recipe.classified.Assembler;
import com.zircky.industrialsorcerygreg.data.recipe.classified.Mixer;
import com.zircky.industrialsorcerygreg.data.recipe.generated.ForEachMaterial;
import com.zircky.industrialsorcerygreg.data.recipe.RecipeRemoval;
import com.zircky.industrialsorcerygreg.data.recipe.misc.component.ComponentRecipe;
import com.zircky.industrialsorcerygreg.data.recipe.misc.machines.ChemicalReactor;
import com.zircky.industrialsorcerygreg.data.recipe.misc.machines.FuelReprocessor;
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
  }

  private static void commonInit(Consumer<FinishedRecipe> provider) {
    Assembler.init(provider);
    Mixer.init(provider);
    ComponentRecipe.init(provider);
    ChemicalReactor.init(provider);
    PlatinumLine.init(provider);
    FuelReprocessor.init(provider);
    ForEachMaterial.init(provider);
  }
}
