package com.zircky.industrialsorcerygreg.common.data;

import com.gregtechceu.gtceu.api.capability.recipe.IO;
import com.gregtechceu.gtceu.api.gui.GuiTextures;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import com.gregtechceu.gtceu.common.data.GTSoundEntries;
import com.lowdragmc.lowdraglib.gui.texture.ProgressTexture;
import com.zircky.industrialsorcerygreg.api.registries.ISGRegistries;

public class ISGRecipeTypes {

  public final static GTRecipeType ROCKET_ASSEMBLER_RECIPES = GTRecipeTypes.register("rocket_assembler", GTRecipeTypes.MULTIBLOCK).setEUIO(IO.IN)
      .setMaxIOSize(9, 1, 3, 0)
      .setSlotOverlay(false, false, GuiTextures.SLOT)
      .setProgressBar(GuiTextures.PROGRESS_BAR_ASSEMBLER, ProgressTexture.FillDirection.LEFT_TO_RIGHT)
      .setSound(GTSoundEntries.ASSEMBLER);


  public static void init() {}
}
