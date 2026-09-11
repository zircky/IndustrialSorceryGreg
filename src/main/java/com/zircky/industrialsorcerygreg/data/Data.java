package com.zircky.industrialsorcerygreg.data;

import com.zircky.industrialsorcerygreg.data.recipe.classified.WaterPurificationPlant;
import com.zircky.industrialsorcerygreg.data.recipe.misc.machines.*;
import com.zircky.industrialsorcerygreg.data.recipe.generated.ForEachMaterial;
import com.zircky.industrialsorcerygreg.data.recipe.RecipeRemoval;
import com.zircky.industrialsorcerygreg.data.recipe.integration.ae2.AppliedEnergistics2Recipe;
import com.zircky.industrialsorcerygreg.data.recipe.misc.MetaTileEntityLoader;
import com.zircky.industrialsorcerygreg.data.recipe.misc.component.ComponentRecipe;
import com.zircky.industrialsorcerygreg.data.recipe.misc.processecing.*;
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
    AppliedEnergistics2Recipe.init(provider);
    AlloyBlast.init(provider);
    AlloySmelterRecipes.init(provider);
    ArcFurnaceRecipes.init(provider);
//    AssemblerRecipes.init(provider);
//    AssemblyLine.init(provider);
    BioReactor.init(provider);
    CannerRecipes.init(provider);
    Centrifuge.init(provider);
    ChemicalBath.init(provider);
//    ChemicalReactorRecipes.init(provider);
    ClusterRecipes.init(provider);
    ComponentRecipe.init(provider);
    DecayChamber.init(provider);
    Dehydrator.init(provider);
//    DistillationTower.init(provider);
//    ElectricBlastFurnace.init(provider);
//    Electrolyzer.init(provider);
//    ElectromagneticSeparator.init(provider);
//    ImplosionCompressor.init(provider);
//    IndustrialProcessMaterialsRecipe.init(provider);
//    HighEnergyMaterialsRecipe.init(provider);
//    FormingPressRecipes.init(provider);
    FuelReprocessorRecipes.init(provider);
//    FusionReactor.init(provider);
//    GasCentrifuge.init(provider);
//    Macerator.init(provider);
    MachineRecipe.init(provider);
//    MixerRecipes.init(provider);
//    PolymerizationReactor.init(provider);
//    PyrolyseOven.init(provider);
//    Smalting.init(provider);
//    StellarForge.init(provider);
//    Vacuum.init(provider);
//    AutoclaveRecipes.init(provider);
//    CompressorRecipes.init(provider);
//    CrackingRecipes.init(provider);
//    DistilleryRecipes.init(provider);
//    ExtractorRecipes.init(provider);
//    FermentingRecipes.init(provider);
//    FluidHeaterRecipes.init(provider);
//    FluidSolidificationRecipes.init(provider);
//    LargeEngraverRecipes.init(provider);
//    PlasmaCondenserRecipes.init(provider);
//    PolarizerRecipes.init(provider);
//    ThermalCentrifugeRecipes.init(provider);
    MetaTileEntityLoader.init(provider);
    WaterPurificationPlant.init(provider);
    processecing(provider);
    ForEachMaterial.init(provider);
  }

  private static void processecing(Consumer<FinishedRecipe> provider) {
    AluminiumLine.init(provider);
    PlatinumLine.init(provider);
    ChromiumLine.init(provider);
    NaquadahLine.init(provider);
    TriniumLine.init(provider);
  }
}
