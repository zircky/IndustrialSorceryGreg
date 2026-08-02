package com.zircky.industrialsorcerygreg.data;

import com.zircky.industrialsorcerygreg.data.recipe.classified.WaterPurificationPlant;
import com.zircky.industrialsorcerygreg.data.recipe.misc.CosmicChain;
import com.zircky.industrialsorcerygreg.data.recipe.misc.machines.*;
import com.zircky.industrialsorcerygreg.data.recipe.generated.ForEachMaterial;
import com.zircky.industrialsorcerygreg.data.recipe.RecipeRemoval;
import com.zircky.industrialsorcerygreg.data.recipe.integration.ae2.AppliedEnergistics2Recipe;
import com.zircky.industrialsorcerygreg.data.recipe.misc.MetaTileEntityLoader;
import com.zircky.industrialsorcerygreg.data.recipe.misc.component.ComponentRecipe;
import com.zircky.industrialsorcerygreg.data.recipe.misc.processecing.ChromiumLine;
import com.zircky.industrialsorcerygreg.data.recipe.misc.processecing.NaquadahLine;
import com.zircky.industrialsorcerygreg.data.recipe.misc.processecing.platinum.PlatinumLine;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class Data {
  private Data() {
    /* This utility class should not be instantiated */
  }

  public static void init(Consumer<FinishedRecipe> provider) {
    commonInit(provider);
  }

  public static void removeInit(Consumer<ResourceLocation> consumer) {
    RecipeRemoval.init(consumer);
    AppliedEnergistics2Recipe.removeInit(consumer);
    ChromiumLine.remove(consumer);
  }

  private static void commonInit(Consumer<FinishedRecipe> provider) {
    MachineRecipe.init(provider);

    AppliedEnergistics2Recipe.init(provider);
    AssemblerRecipes.init(provider);
    MixerRecipes.init(provider);
    ComponentRecipe.init(provider);
    CosmicChain.init(provider);
    ChemicalReactorRecipes.init(provider);
    IndustrialProcessMaterialsRecipe.init(provider);
    HighEnergyMaterialsRecipe.init(provider);
    PlatinumLine.init(provider);
    ChromiumLine.init(provider);
    NaquadahLine.init(provider);
    FuelReprocessorRecipes.init(provider);
    //CannerRecipes.init(provider);
    MetaTileEntityLoader.init(provider);
    WaterPurificationPlant.init(provider);
    ForEachMaterial.init(provider);
  }
}
