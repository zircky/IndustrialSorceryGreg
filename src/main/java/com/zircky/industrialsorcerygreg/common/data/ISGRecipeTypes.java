package com.zircky.industrialsorcerygreg.common.data;

import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.block.ICoilType;
import com.gregtechceu.gtceu.api.capability.recipe.IO;
import com.gregtechceu.gtceu.api.gui.GuiTextures;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import com.gregtechceu.gtceu.common.data.GTSoundEntries;
import com.gregtechceu.gtceu.common.data.GTSoundTypes;
import com.gregtechceu.gtceu.utils.FormattingUtil;
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
      .setSlotOverlay(false, false, GuiTextures.SLOT)
      .setProgressBar(GuiTextures.PROGRESS_BAR_ASSEMBLER, LEFT_TO_RIGHT)
      .setSound(GTSoundEntries.ASSEMBLER);

  public static final GTRecipeType LIQUEFACTION_FURNACE_RECIPES = GTRecipeTypes.register("liquefaction_furnace", MULTIBLOCK)
      .setMaxIOSize(1, 0, 0, 1)
      .setEUIO(IO.IN)
      .setProgressBar(GuiTextures.PROGRESS_BAR_EXTRACT, LEFT_TO_RIGHT)
      .setSound(GTSoundEntries.ARC)
      .addDataInfo(data -> {
        int temp = data.getInt("ebf_temp");
        return LocalizationUtils.format("gtceu.recipe.temperature", FormattingUtil.formatTemperature(temp));
      })
      .addDataInfo(data -> {
        int temp = data.getInt("ebf_temp");
        ICoilType requiredCoil = ICoilType.getMinRequiredType(temp);

        if (requiredCoil != null && !requiredCoil.getMaterial().isNull()) {
          return LocalizationUtils.format("gtceu.recipe.coil.tier", I18n.get(requiredCoil.getMaterial().getUnlocalizedName()));
        }
        return "";
      })
      .setUiBuilder((recipe, widgetGroup) -> {
        int temp = recipe.data.getInt("ebf_temp");
        List<List<ItemStack>> items = new ArrayList<>();
        items.add(GTCEuAPI.HEATING_COILS.entrySet().stream()
            .filter(coil -> coil.getKey().getCoilTemperature() >= temp)
            .map(coil -> new ItemStack(coil.getValue().get())).toList());
        widgetGroup.addWidget(new SlotWidget(new CycleItemStackHandler(items), 0,
            widgetGroup.getSize().width - 25, widgetGroup.getSize().height - 32, false, false));
      });

  public static final GTRecipeType DISSOLUTION_TREATMENT_RECIPES = GTRecipeTypes.register("dissolution_treatment", MULTIBLOCK)
      .setMaxIOSize(2, 2, 2, 1)
      .setEUIO(IO.IN)
      .setProgressBar(GuiTextures.PROGRESS_BAR_EXTRACT, LEFT_TO_RIGHT)
      .setSound(GTSoundEntries.ARC);

  public static final GTRecipeType DIGESTION_TREATMENT_RECIPES = GTRecipeTypes.register("digestion_treatment", MULTIBLOCK)
      .setMaxIOSize(1, 1, 1, 1)
      .setEUIO(IO.IN)
      .setProgressBar(GuiTextures.PROGRESS_BAR_EXTRACT, LEFT_TO_RIGHT)
      .setSound(GTSoundEntries.COOLING)
      .addDataInfo(data -> {
        int temp = data.getInt("ebf_temp");
        return LocalizationUtils.format("gtceu.recipe.temperature", FormattingUtil.formatTemperature(temp));
      })
      .addDataInfo(data -> {
        int temp = data.getInt("ebf_temp");
        ICoilType requiredCoil = ICoilType.getMinRequiredType(temp);

        if (requiredCoil != null && !requiredCoil.getMaterial().isNull()) {
          return LocalizationUtils.format("gtceu.recipe.coil.tier", I18n.get(requiredCoil.getMaterial().getUnlocalizedName()));
        }
        return "";
      });

  public static final GTRecipeType FUEL_REPROCESSOR_RECIPES = GTRecipeTypes.register("fuel_reprocessor", MULTIBLOCK)
      .setMaxIOSize(1, 6, 1, 6)
      .setEUIO(IO.IN)
      .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, LEFT_TO_RIGHT)
      .setSound(GTSoundEntries.CENTRIFUGE);

  public static final GTRecipeType DEHYDRATOR_RECIPES = GTRecipeTypes.register("dehydrator", ELECTRIC)
      .setMaxIOSize(2, 6, 2, 2)
      .setEUIO(IO.IN)
      .setProgressBar(GuiTextures.PROGRESS_BAR_EXTRACT, LEFT_TO_RIGHT)
      .setSound(GTSoundEntries.ARC);



  public static void init() {
    RecipeTypesModify.init();
  }
}
