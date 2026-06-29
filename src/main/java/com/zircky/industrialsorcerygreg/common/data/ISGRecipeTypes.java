package com.zircky.industrialsorcerygreg.common.data;

import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.block.ICoilType;
import com.gregtechceu.gtceu.api.capability.recipe.IO;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import com.gregtechceu.gtceu.common.data.GTSoundEntries;
import com.gregtechceu.gtceu.common.mui.GTGuiTextures;
import com.gregtechceu.gtceu.common.recipe.gui.GTRecipeUIModifiers;
import com.gregtechceu.gtceu.utils.FormattingUtil;
import com.lowdragmc.lowdraglib.gui.texture.ProgressTexture;
import com.lowdragmc.lowdraglib.gui.widget.SlotWidget;
import com.lowdragmc.lowdraglib.utils.CycleItemStackHandler;
import com.lowdragmc.lowdraglib.utils.LocalizationUtils;
import com.zircky.industrialsorcerygreg.common.data.recipe.RecipeTypesModify;
import net.minecraft.client.resources.language.I18n;
import net.minecraft.world.item.ItemStack;


import java.util.ArrayList;
import java.util.List;

import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.ELECTRIC;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.MULTIBLOCK;
import static com.lowdragmc.lowdraglib.gui.texture.ProgressTexture.FillDirection.LEFT_TO_RIGHT;


public class ISGRecipeTypes {

  public final static GTRecipeType LARGE_MIXER_RECIPES = GTRecipeTypes.MIXER_RECIPES.setMaxIOSize(6, 1, 6, 1);

  public final static GTRecipeType ROCKET_ASSEMBLER_RECIPES = GTRecipeTypes.register("rocket_assembler", MULTIBLOCK).setEUIO(IO.IN)
      .setMaxIOSize(9, 1, 3, 0)
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_ARROW))
      .setSound(GTSoundEntries.ASSEMBLER);

  public static final GTRecipeType LIQUEFACTION_FURNACE_RECIPES = GTRecipeTypes.register("liquefaction_furnace", MULTIBLOCK)
      .setMaxIOSize(1, 0, 0, 1)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_EXTRACT)
          .addRecipeUIModifier(GTRecipeUIModifiers.TEMP_COIL_INFO));

  public static final GTRecipeType DISSOLUTION_TREATMENT_RECIPES = GTRecipeTypes.register("dissolution_treatment", MULTIBLOCK)
      .setMaxIOSize(2, 2, 2, 1)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_EXTRACT))
      .setSound(GTSoundEntries.ARC);

  public static final GTRecipeType DIGESTION_TREATMENT_RECIPES = GTRecipeTypes.register("digestion_treatment", MULTIBLOCK)
      .setMaxIOSize(1, 1, 1, 1)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_ARROW)
          .addRecipeUIModifier(GTRecipeUIModifiers.TEMP_COIL_INFO))
      .setSound(GTSoundEntries.COOLING);

  public static final GTRecipeType FUEL_REPROCESSOR_RECIPES = GTRecipeTypes.register("fuel_reprocessor", MULTIBLOCK)
      .setMaxIOSize(1, 6, 1, 6)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_ARROW))
      .setSound(GTSoundEntries.CENTRIFUGE);

  public static final GTRecipeType DEHYDRATOR_RECIPES = GTRecipeTypes.register("dehydrator", ELECTRIC)
      .setMaxIOSize(2, 6, 2, 2)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_EXTRACT))
      .setSound(GTSoundEntries.ARC);

  public static final GTRecipeType UNPACKER_RECIPES = GTRecipeTypes.register("unpacker", ELECTRIC)
      .setMaxIOSize(2, 2, 0, 0)
      .setEUIO(IO.IN)
      .prepareBuilder(recipeBuilder -> recipeBuilder.EUt(12).duration(10))
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_PACKER)
          .setItemSlotOverlay(IO.IN, 0, GTGuiTextures.BOX_OVERLAY)
          .setItemSlotOverlay(IO.IN, 0, GTGuiTextures.BOXED_OVERLAY))
      .setSound(GTSoundEntries.ASSEMBLER);

  public static final GTRecipeType CLUSTER_RECIPES = GTRecipeTypes.register("cluster", ELECTRIC)
      .setMaxIOSize(1, 1, 0, 0)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_ARROW))
      .setSound(GTSoundEntries.MOTOR);

  public static final GTRecipeType ROLLING_RECIPES = GTRecipeTypes.register("rolling", ELECTRIC)
      .setMaxIOSize(2, 1, 0, 0)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_BENDING))
      .setSound(GTSoundEntries.MOTOR);

  public static final GTRecipeType LAMINATOR_RECIPES = GTRecipeTypes.register("laminator", ELECTRIC)
      .setMaxIOSize(3, 1, 1, 0)
      .setEUIO(IO.IN)
      .UI(builder -> builder
          .setProgressBar(GTGuiTextures.PROGRESS_CIRCUIT_ASSEMBLER)
          .setItemSlotOverlay(IO.IN, 0, GTGuiTextures.CIRCUIT_OVERLAY))
      .setSound(GTSoundEntries.BATH);

  public static final GTRecipeType LOOM_RECIPES = GTRecipeTypes.register("loom", ELECTRIC)
      .setMaxIOSize(2, 1, 0, 0)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_WIREMILL))
      .setSound(GTSoundEntries.MOTOR);

  public static final GTRecipeType LASER_WELDER_RECIPES = GTRecipeTypes.register("laser_welder", ELECTRIC)
      .setMaxIOSize(3, 1, 0, 0)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_WIREMILL))
      .setSound(GTSoundEntries.ARC);


  public static final GTRecipeType LEACHING_PLANT_RECIPES = GTRecipeTypes.register("leaching_plant", MULTIBLOCK)
      .setMaxIOSize(3, 6, 3, 3)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_ARROW))
      .setSound(GTSoundEntries.BATH);

  public static final GTRecipeType CHROMATIC_FLOTATION_PLANT_RECIPES = GTRecipeTypes
      .register("chromatic_flotation_plant", MULTIBLOCK)
      .setMaxIOSize(3, 4, 3, 3)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_ARROW));

  public static final GTRecipeType WATER_PURIFICATION_PLANT_RECIPES = GTRecipeTypes.register("water_purification_plant", MULTIBLOCK)
      .setMaxIOSize(0, 0, 0, 0)
      .setEUIO(IO.IN);

  public static final GTRecipeType CLARIFIER_PURIFICATION_RECIPES = GTRecipeTypes.register("clarifier_purification", MULTIBLOCK)
      .setMaxIOSize(1,4, 1, 1)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures. PROGRESS_ARROW));

  public static final GTRecipeType OZONATION_PURIFICATION_RECIPES = GTRecipeTypes.register("ozonation_purification", MULTIBLOCK)
      .setMaxIOSize(0,4, 2, 1)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures. PROGRESS_ARROW));

  public static final GTRecipeType FLOCCULATION_PURIFICATION_RECIPES = GTRecipeTypes.register("flocculation_purification", MULTIBLOCK)
      .setMaxIOSize(0,4, 2, 1)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_ARROW));

  public static final GTRecipeType PH_NEUTRALIZATION_PURIFICATION_RECIPES = GTRecipeTypes.register("ph_neutralization_purification", MULTIBLOCK)
      .setMaxIOSize(1,0, 2, 1)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_ARROW));

  public static final GTRecipeType EXTREME_TEMPERATURE_FLUCTUATION_PURIFICATION_RECIPES = GTRecipeTypes.register("extreme_temperature_fluctuation_purification", MULTIBLOCK)
      .setMaxIOSize(0,0, 3, 1)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_ARROW));

  public static final GTRecipeType HIGH_ENERGY_LASER_PURIFICATION_RECIPES = GTRecipeTypes.register("high_energy_laser_purification", MULTIBLOCK)
      .setMaxIOSize(9,0, 1, 1)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_ARROW));

  public static final GTRecipeType RESIDUAL_DECONTAMINANT_DEGASSER_PURIFICATION_RECIPES = GTRecipeTypes.register("residual_decontaminant_degasser_purification", MULTIBLOCK)
      .setMaxIOSize(0,3, 1, 2)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_ARROW));

  public static final GTRecipeType ABSOLUTE_BARYONIC_PERFECTION_PURIFICATION_RECIPES = GTRecipeTypes.register("absolute_baryonic_perfection_purification", MULTIBLOCK)
      .setMaxIOSize(6,2, 1, 2)
      .setEUIO(IO.IN)
      .UI(builder -> builder.setProgressBar(GTGuiTextures.PROGRESS_ARROW));




  public static void init() {
    RecipeTypesModify.init();
  }
}
