package com.zircky.industrialsorcerygreg.common.data;

import brachy.modularui.drawable.progress.CircularProgressDrawable;
import brachy.modularui.drawable.progress.ProgressDrawable;
import brachy.modularui.widgets.ProgressWidget;
import brachy.modularui.widgets.layout.Flow;
import com.gregtechceu.gtceu.api.capability.recipe.IO;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.gregtechceu.gtceu.api.recipe.gui.GTRecipeTypeUILayout;
import com.gregtechceu.gtceu.common.data.GCYMRecipeTypes;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import com.gregtechceu.gtceu.common.data.GTSoundEntries;
import com.gregtechceu.gtceu.common.mui.GTGuiTextures;
import com.gregtechceu.gtceu.common.recipe.gui.GTRecipeUIModifiers;
import com.gregtechceu.gtceu.utils.ResearchManager;
import com.zircky.industrialsorcerygreg.common.data.recipe.RecipeTypesModify;
import com.zircky.industrialsorcerygreg.common.recipe.gui.ISGRecipeUIModifiers;
import com.zircky.industrialsorcerygreg.api.recipe.ISGRecipeType;
import com.zircky.industrialsorcerygreg.api.recipe.ISGRecipeTypeProxy;

import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.ELECTRIC;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.MULTIBLOCK;


public class ISGRecipeTypes {

  public final static ISGRecipeTypeProxy STEAM_BOILER_RECIPES = gt(GTRecipeTypes.STEAM_BOILER_RECIPES);
  public final static ISGRecipeTypeProxy FURNACE_RECIPES = gt(GTRecipeTypes.FURNACE_RECIPES);
  public final static ISGRecipeTypeProxy ALLOY_SMELTER_RECIPES = gt(GTRecipeTypes.ALLOY_SMELTER_RECIPES);
  public final static ISGRecipeTypeProxy ARC_FURNACE_RECIPES = gt(GTRecipeTypes.ARC_FURNACE_RECIPES);
  public final static ISGRecipeTypeProxy ASSEMBLER_RECIPES = gt(GTRecipeTypes.ASSEMBLER_RECIPES);
  public final static ISGRecipeTypeProxy AUTOCLAVE_RECIPES = gt(GTRecipeTypes.AUTOCLAVE_RECIPES);
  public final static ISGRecipeTypeProxy BENDER_RECIPES = gt(GTRecipeTypes.BENDER_RECIPES);
  public final static ISGRecipeTypeProxy BREWING_RECIPES = gt(GTRecipeTypes.BREWING_RECIPES);
  public final static ISGRecipeTypeProxy MACERATOR_RECIPES = gt(GTRecipeTypes.MACERATOR_RECIPES);
  public final static ISGRecipeTypeProxy CANNER_RECIPES = gt(GTRecipeTypes.CANNER_RECIPES);
  public final static ISGRecipeTypeProxy CENTRIFUGE_RECIPES = gt(GTRecipeTypes.CENTRIFUGE_RECIPES.setMaxIOSize(2, 6, 2, 6));
  public final static ISGRecipeTypeProxy CHEMICAL_BATH_RECIPES = gt(GTRecipeTypes.CHEMICAL_BATH_RECIPES);
  public final static ISGRecipeTypeProxy CHEMICAL_RECIPES = gt(GTRecipeTypes.CHEMICAL_RECIPES);
  public final static ISGRecipeTypeProxy COMPRESSOR_RECIPES = gt(GTRecipeTypes.COMPRESSOR_RECIPES);
  public final static ISGRecipeTypeProxy CUTTER_RECIPES = gt(GTRecipeTypes.CUTTER_RECIPES);
  public final static ISGRecipeTypeProxy DISTILLERY_RECIPES = gt(GTRecipeTypes.DISTILLERY_RECIPES);
  public final static ISGRecipeTypeProxy ELECTROLYZER_RECIPES = gt(GTRecipeTypes.ELECTROLYZER_RECIPES);
  public final static ISGRecipeTypeProxy ELECTROMAGNETIC_SEPARATOR_RECIPES = gt(GTRecipeTypes.ELECTROMAGNETIC_SEPARATOR_RECIPES);
  public final static ISGRecipeTypeProxy EXTRACTOR_RECIPES = gt(GTRecipeTypes.EXTRACTOR_RECIPES);
  public final static ISGRecipeTypeProxy EXTRUDER_RECIPES = gt(GTRecipeTypes.EXTRUDER_RECIPES);
  public final static ISGRecipeTypeProxy FERMENTING_RECIPES = gt(GTRecipeTypes.FERMENTING_RECIPES.setMaxIOSize(2, 1, 1, 1));
  public final static ISGRecipeTypeProxy FLUID_HEATER_RECIPES = gt(GTRecipeTypes.FLUID_HEATER_RECIPES);
  public final static ISGRecipeTypeProxy FLUID_SOLIDFICATION_RECIPES = gt(GTRecipeTypes.FLUID_SOLIDFICATION_RECIPES);
  public final static ISGRecipeTypeProxy FORGE_HAMMER_RECIPES = gt(GTRecipeTypes.FORGE_HAMMER_RECIPES);
  public final static ISGRecipeTypeProxy FORMING_PRESS_RECIPES = gt(GTRecipeTypes.FORMING_PRESS_RECIPES);
  public final static ISGRecipeTypeProxy LATHE_RECIPES = gt(GTRecipeTypes.LATHE_RECIPES);
  public final static ISGRecipeTypeProxy MIXER_RECIPES = gt(GTRecipeTypes.MIXER_RECIPES.setMaxIOSize(6, 1, 6, 1));
  public final static ISGRecipeTypeProxy ORE_WASHER_RECIPES = gt(GTRecipeTypes.ORE_WASHER_RECIPES);
  public final static ISGRecipeTypeProxy PACKER_RECIPES = gt(GTRecipeTypes.PACKER_RECIPES);
  public final static ISGRecipeTypeProxy POLARIZER_RECIPES = gt(GTRecipeTypes.POLARIZER_RECIPES);
  public final static ISGRecipeTypeProxy LASER_ENGRAVER_RECIPES = gt(GTRecipeTypes.LASER_ENGRAVER_RECIPES);
  public final static ISGRecipeTypeProxy SIFTER_RECIPES = gt(GTRecipeTypes.SIFTER_RECIPES);
  public final static ISGRecipeTypeProxy THERMAL_CENTRIFUGE_RECIPES = gt(GTRecipeTypes.THERMAL_CENTRIFUGE_RECIPES);
  public final static ISGRecipeTypeProxy WIREMILL_RECIPES = gt(GTRecipeTypes.WIREMILL_RECIPES);
  public final static ISGRecipeTypeProxy CIRCUIT_ASSEMBLER_RECIPES = gt(GTRecipeTypes.CIRCUIT_ASSEMBLER_RECIPES);
  public final static ISGRecipeTypeProxy GAS_COLLECTOR_RECIPES = gt(GTRecipeTypes.GAS_COLLECTOR_RECIPES);
  public final static ISGRecipeTypeProxy AIR_SCRUBBER_RECIPES = gt(GTRecipeTypes.AIR_SCRUBBER_RECIPES);
  public final static ISGRecipeTypeProxy RESEARCH_STATION_RECIPES = gt(GTRecipeTypes.RESEARCH_STATION_RECIPES);
  public final static ISGRecipeTypeProxy ROCK_BREAKER_RECIPES = gt(GTRecipeTypes.ROCK_BREAKER_RECIPES);
  public final static ISGRecipeTypeProxy SCANNER_RECIPES = gt(GTRecipeTypes.SCANNER_RECIPES);
  public final static ISGRecipeTypeProxy COMBUSTION_GENERATOR_FUELS = gt(GTRecipeTypes.COMBUSTION_GENERATOR_FUELS);
  public final static ISGRecipeTypeProxy GAS_TURBINE_FUELS = gt(GTRecipeTypes.GAS_TURBINE_FUELS);
  public final static ISGRecipeTypeProxy STEAM_TURBINE_FUELS = gt(GTRecipeTypes.STEAM_TURBINE_FUELS);
  public final static ISGRecipeTypeProxy PLASMA_GENERATOR_FUELS = gt(GTRecipeTypes.PLASMA_GENERATOR_FUELS);
  public final static ISGRecipeTypeProxy LARGE_BOILER_RECIPES = gt(GTRecipeTypes.LARGE_BOILER_RECIPES);
  public final static ISGRecipeTypeProxy COKE_OVEN_RECIPES = gt(GTRecipeTypes.COKE_OVEN_RECIPES);
  public final static ISGRecipeTypeProxy PRIMITIVE_BLAST_FURNACE_RECIPES = gt(GTRecipeTypes.PRIMITIVE_BLAST_FURNACE_RECIPES);
  public final static ISGRecipeTypeProxy BLAST_RECIPES = gt(GTRecipeTypes.BLAST_RECIPES);
  public final static ISGRecipeTypeProxy DISTILLATION_RECIPES = gt(GTRecipeTypes.DISTILLATION_RECIPES);
  public final static ISGRecipeTypeProxy PYROLYSE_RECIPES = gt(GTRecipeTypes.PYROLYSE_RECIPES);
  public final static ISGRecipeTypeProxy CRACKING_RECIPES = gt(GTRecipeTypes.CRACKING_RECIPES);
  public final static ISGRecipeTypeProxy IMPLOSION_RECIPES = gt(GTRecipeTypes.IMPLOSION_RECIPES);
  public final static ISGRecipeTypeProxy VACUUM_RECIPES = gt(GTRecipeTypes.VACUUM_RECIPES);
  public final static ISGRecipeTypeProxy ASSEMBLY_LINE_RECIPES = gt(GTRecipeTypes.ASSEMBLY_LINE_RECIPES);
  public final static ISGRecipeTypeProxy LARGE_CHEMICAL_RECIPES = gt(GTRecipeTypes.LARGE_CHEMICAL_RECIPES);
  public final static ISGRecipeTypeProxy FUSION_RECIPES = gt(GTRecipeTypes.FUSION_RECIPES.setMaxIOSize(0, 0 , 2, 2));
  public final static ISGRecipeTypeProxy DUMMY_RECIPES = gt(GTRecipeTypes.DUMMY_RECIPES);
  public final static ISGRecipeTypeProxy ALLOY_BLAST_RECIPES = gt(GCYMRecipeTypes.ALLOY_BLAST_RECIPES);

  public final static ISGRecipeType LARGE_MIXER_RECIPES = (ISGRecipeType) ISGRecipeType.register("large_mixer_recipes", MULTIBLOCK)
      .setMaxIOSize(9, 1, 6, 1)
      .setEUIO(IO.IN)
      .UI(builder -> builder
          .setProgressBarSupplier((l, v, m) -> {
            return new CircularProgressDrawable()
                .emptyTexture(GTGuiTextures.PROGRESS_MIXER[0])
                .filledTexture(GTGuiTextures.PROGRESS_MIXER[1])
                .clockwise()
                .asWidget()
                .value(v);
          })
          .setItemSlotsOverlay(IO.IN, 0, 8, GTGuiTextures.DUST_OVERLAY)
          .setItemSlotOverlay(IO.OUT, 0, GTGuiTextures.DUST_OVERLAY))
      .setSound(GTSoundEntries.MIXER)
      .setSmallRecipeMap(MIXER_RECIPES.recipeType());

  public final static ISGRecipeType ROCKET_ASSEMBLER_RECIPES = (ISGRecipeType) ISGRecipeType.register("rocket_assembler", MULTIBLOCK).setEUIO(IO.IN)
      .setMaxIOSize(9, 1, 3, 0)
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_ARROW))
      .setSound(GTSoundEntries.ASSEMBLER);

  public static final ISGRecipeType LIQUEFACTION_FURNACE_RECIPES = (ISGRecipeType) ISGRecipeType.register("liquefaction_furnace", MULTIBLOCK)
      .setMaxIOSize(1, 0, 0, 1)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_EXTRACT)
          .addRecipeUIModifier(GTRecipeUIModifiers.TEMP_COIL_INFO));

  public static final ISGRecipeType DISSOLUTION_TREATMENT_RECIPES = (ISGRecipeType) ISGRecipeType.register("dissolution_treatment", MULTIBLOCK)
      .setMaxIOSize(2, 2, 2, 1)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_EXTRACT))
      .setSound(GTSoundEntries.ARC);

  public static final ISGRecipeType DIGESTION_TREATMENT_RECIPES = (ISGRecipeType) ISGRecipeType.register("digestion_treatment", MULTIBLOCK)
      .setMaxIOSize(1, 2, 2, 1)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_ARROW)
          .addRecipeUIModifier(GTRecipeUIModifiers.TEMP_COIL_INFO))
      .setSound(GTSoundEntries.COOLING);

  public static final ISGRecipeType FUEL_REPROCESSOR_RECIPES = (ISGRecipeType) ISGRecipeType.register("fuel_reprocessor", MULTIBLOCK)
      .setMaxIOSize(1, 6, 1, 6)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_ARROW))
      .setSound(GTSoundEntries.CENTRIFUGE);

  public static final ISGRecipeType DEHYDRATOR_RECIPES = (ISGRecipeType) ISGRecipeType.register("dehydrator", ELECTRIC)
      .setMaxIOSize(2, 6, 2, 2)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_EXTRACT))
      .setSound(GTSoundEntries.ARC);

  public static final ISGRecipeType UNPACKER_RECIPES = (ISGRecipeType) ISGRecipeType.register("unpacker", ELECTRIC)
      .setMaxIOSize(2, 2, 0, 0)
      .setEUIO(IO.IN)
      .prepareBuilder(recipeBuilder -> recipeBuilder.EUt(12).duration(10))
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_PACKER)
          .setItemSlotOverlay(IO.IN, 0, GTGuiTextures.BOX_OVERLAY)
          .setItemSlotOverlay(IO.IN, 0, GTGuiTextures.BOXED_OVERLAY))
      .setSound(GTSoundEntries.ASSEMBLER);

  public static final ISGRecipeType CLUSTER_RECIPES = (ISGRecipeType) ISGRecipeType.register("cluster", ELECTRIC)
      .setMaxIOSize(1, 1, 0, 0)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_ARROW))
      .setSound(GTSoundEntries.MOTOR);

  public static final ISGRecipeType ROLLING_RECIPES = (ISGRecipeType) ISGRecipeType.register("rolling", ELECTRIC)
      .setMaxIOSize(2, 1, 0, 0)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_BENDING))
      .setSound(GTSoundEntries.MOTOR);

  public static final ISGRecipeType LAMINATOR_RECIPES = (ISGRecipeType) ISGRecipeType.register("laminator", ELECTRIC)
      .setMaxIOSize(3, 1, 1, 0)
      .setEUIO(IO.IN)
      .UI(builder -> builder
          .setProgressBar(GTGuiTextures.PROGRESS_CIRCUIT_ASSEMBLER)
          .setItemSlotOverlay(IO.IN, 0, GTGuiTextures.CIRCUIT_OVERLAY))
      .setSound(GTSoundEntries.BATH);

  public static final ISGRecipeType LOOM_RECIPES = (ISGRecipeType) ISGRecipeType.register("loom", ELECTRIC)
      .setMaxIOSize(2, 1, 0, 0)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_WIREMILL))
      .setSound(GTSoundEntries.MOTOR);

  public static final ISGRecipeType LASER_WELDER_RECIPES = (ISGRecipeType) ISGRecipeType.register("laser_welder", ELECTRIC)
      .setMaxIOSize(3, 1, 0, 0)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_WIREMILL))
      .setSound(GTSoundEntries.ARC)
      .setHasResearchSlot(true)
      .onRecipeBuild(ResearchManager::createDefaultResearchRecipe);

  public static final ISGRecipeType PLASMA_CONDENSER_RECIPES = (ISGRecipeType) ISGRecipeType.register("plasma_condenser", MULTIBLOCK)
      .setEUIO(IO.IN)
      .setMaxIOSize(2, 2, 2, 2)
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_ARROW))
      .setSound(GTSoundEntries.COOLING);


  public static final ISGRecipeType LEACHING_PLANT_RECIPES = (ISGRecipeType) ISGRecipeType.register("leaching_plant", MULTIBLOCK)
      .setMaxIOSize(3, 6, 3, 3)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_ARROW))
      .setSound(GTSoundEntries.BATH);

  public static final ISGRecipeType CHROMATIC_FLOTATION_PLANT_RECIPES = (ISGRecipeType) ISGRecipeType
      .register("chromatic_flotation_plant", MULTIBLOCK)
      .setMaxIOSize(3, 6, 3, 3)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_ARROW));

  public static final ISGRecipeType WATER_PURIFICATION_PLANT_RECIPES = (ISGRecipeType) ISGRecipeType.register("water_purification_plant", MULTIBLOCK)
      .setMaxIOSize(0, 0, 0, 0)
      .setEUIO(IO.IN);

  public static final ISGRecipeType CLARIFIER_PURIFICATION_RECIPES = (ISGRecipeType) ISGRecipeType.register("clarifier_purification", MULTIBLOCK)
      .setMaxIOSize(1,4, 1, 1)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures. PROGRESS_ARROW));

  public static final ISGRecipeType OZONATION_PURIFICATION_RECIPES = (ISGRecipeType) ISGRecipeType.register("ozonation_purification", MULTIBLOCK)
      .setMaxIOSize(0,4, 2, 1)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures. PROGRESS_ARROW));

  public static final ISGRecipeType FLOCCULATION_PURIFICATION_RECIPES = (ISGRecipeType) ISGRecipeType.register("flocculation_purification", MULTIBLOCK)
      .setMaxIOSize(0,4, 2, 1)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_ARROW));

  public static final ISGRecipeType PH_NEUTRALIZATION_PURIFICATION_RECIPES = (ISGRecipeType) ISGRecipeType.register("ph_neutralization_purification", MULTIBLOCK)
      .setMaxIOSize(1,0, 2, 1)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_ARROW));

  public static final ISGRecipeType EXTREME_TEMPERATURE_FLUCTUATION_PURIFICATION_RECIPES = (ISGRecipeType) ISGRecipeType.register("extreme_temperature_fluctuation_purification", MULTIBLOCK)
      .setMaxIOSize(0,0, 3, 1)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_ARROW));

  public static final ISGRecipeType HIGH_ENERGY_LASER_PURIFICATION_RECIPES = (ISGRecipeType) ISGRecipeType.register("high_energy_laser_purification", MULTIBLOCK)
      .setMaxIOSize(9,0, 1, 1)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_ARROW));

  public static final ISGRecipeType RESIDUAL_DECONTAMINANT_DEGASSER_PURIFICATION_RECIPES = (ISGRecipeType) ISGRecipeType.register("residual_decontaminant_degasser_purification", MULTIBLOCK)
      .setMaxIOSize(0,3, 1, 2)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_ARROW));

  public static final ISGRecipeType ABSOLUTE_BARYONIC_PERFECTION_PURIFICATION_RECIPES = (ISGRecipeType) ISGRecipeType.register("absolute_baryonic_perfection_purification", MULTIBLOCK)
      .setMaxIOSize(6,2, 1, 2)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_ARROW));

  public static final ISGRecipeType COMPONENT_ASSEMBLY_RECIPES = (ISGRecipeType) ISGRecipeType.register("component_assembly", MULTIBLOCK)
      .setMaxIOSize(9, 1, 9, 0)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_ASSEMBLER)
          .addRecipeUIModifier(ISGRecipeUIModifiers.COMPONENT_ASSEMBLY_CASING_TIER))
      .setSound(GTSoundEntries.ASSEMBLER);

  public static final ISGRecipeType GAS_CENTRIFUGE_RECIPES = (ISGRecipeType) ISGRecipeType.register("gas_centrifuge", MULTIBLOCK)
      .setMaxIOSize(1, 0, 1, 3)
      .setEUIO(IO.IN)
      .UI(builder -> builder
          .setProgressBarSupplier((l, v, m) -> {
            return new CircularProgressDrawable()
                .emptyTexture(GTGuiTextures.PROGRESS_MIXER[0])
                .filledTexture(GTGuiTextures.PROGRESS_MIXER[1])
                .clockwise()
                .asWidget()
                .value(v);
          }))
      .setSound(GTSoundEntries.MIXER);

  private static final GTRecipeTypeUILayout.ProgressWidgetSupplier forgeHammerProgressBar = (layout, value,
                                                                                             machine) -> Flow.col()
      .coverChildren()
      .child(new ProgressWidget()
          .value(value)
          .name("progressBar")
          .texture(
              GTGuiTextures.PROGRESS_HAMMER
                  .get(machine),
              ProgressDrawable.Direction.DOWN)
          .size(20))
      .child(GTGuiTextures.PROGRESS_HAMMER_BASE
          .get(machine)
          .asWidget()
          .height(5));

  public static final ISGRecipeType DECAY_CHAMBERS_RECIPES = (ISGRecipeType) ISGRecipeType.register("decay_chamber", ELECTRIC)
      .setMaxIOSize(1, 1, 1, 1)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_HAMMER)
          .setItemSlotOverlay(IO.IN, 0, GTGuiTextures.HAMMER_OVERLAY)
          .setProgressBarSupplier(forgeHammerProgressBar))
      .setSound(GTSoundEntries.FORGE_HAMMER);

  public static final ISGRecipeType STELLAR_FORGE_RECIPES = (ISGRecipeType) ISGRecipeType.register("stellar_forge", MULTIBLOCK)
      .setMaxIOSize(3,3,3,3)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_ARROW))
      .setSound(GTSoundEntries.ARC);

  public static final ISGRecipeType NEUTRON_ACTIVATOR_RECIPES = (ISGRecipeType) ISGRecipeType.register("neutron_activator", MULTIBLOCK)
      .setMaxIOSize(9, 9, 1, 1)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_ARROW)
          .addRecipeUIModifier(ISGRecipeUIModifiers.NEUTRON_ACTIVATOR_INFO))
      .setSound(GTSoundEntries.COOLING);

  public static final ISGRecipeType VACUUM_DISTILLATION_RECIPES = (ISGRecipeType) ISGRecipeType.register("vacuum_distillation_tower", MULTIBLOCK)
      .setMaxIOSize(1, 3, 2, 5)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_ARROW_MULTIPLE))
      .setSound(GTSoundEntries.COOLING);

  public static final ISGRecipeType POLYMERIZATION_REACTOR_RECIPES = (ISGRecipeType) ISGRecipeType.register("polymerization_reactor", MULTIBLOCK)
      .setMaxIOSize(2, 1, 3, 3)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_ARROW)
          .addRecipeUIModifier(GTRecipeUIModifiers.TEMP_COIL_INFO))
      .setSound(GTSoundEntries.CHEMICAL);

  public static final ISGRecipeType CHEMICAL_PLANT_RECIPES = (ISGRecipeType) ISGRecipeType.register("chemical_plant", MULTIBLOCK)
      .setMaxIOSize(6, 4, 6,4)
      .setEUIO(IO.IN)
      .UI(builder -> builder
          .setItemSlotsOverlay(IO.IN, 0, 1, GTGuiTextures.MOLECULAR_OVERLAY_1)
          .setItemSlotOverlay(IO.IN, 2, GTGuiTextures.MOLECULAR_OVERLAY_2)
          .setFluidSlotsOverlay(IO.IN, 0, 1, GTGuiTextures.MOLECULAR_OVERLAY_3)
          .setFluidSlotOverlay(IO.IN, 2, GTGuiTextures.MOLECULAR_OVERLAY_4)
          .setItemSlotOverlay(IO.OUT, 0, GTGuiTextures.VIAL_OVERLAY_1)
          .setFluidSlotOverlay(IO.OUT, 0, GTGuiTextures.VIAL_OVERLAY_1)
          .setProgressBar(GTGuiTextures.PROGRESS_ARROW_MULTIPLE))
      .setSound(GTSoundEntries.CHEMICAL)
      .setSmallRecipeMap(LARGE_CHEMICAL_RECIPES.recipeType());

  public static final ISGRecipeType BIO_REACTOR_RECIPES = (ISGRecipeType) ISGRecipeType.register("bio_reactor", MULTIBLOCK)
      .setMaxIOSize(3, 3, 5, 2)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_ARROW));

  public static final ISGRecipeType TEST_RECIPES = ((ISGRecipeType) ISGRecipeType.register("test", MULTIBLOCK)
      .setMaxIOSize(6, 6, 6, 6)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_ARROW)))
      .setLayered();

  private static ISGRecipeTypeProxy gt(GTRecipeType recipeType) {
    return new ISGRecipeTypeProxy(recipeType);
  }

  public static void init() {
    RecipeTypesModify.init();
  }

}
