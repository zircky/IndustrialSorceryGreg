package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.GTValues.IV;
import static com.gregtechceu.gtceu.api.GTValues.MV;
import static com.gregtechceu.gtceu.api.GTValues.VA;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.Hafnium;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.Ytterbium178;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.DECAY_CHAMBERS_RECIPES;

public class DecayChamber {
  public static void init(Consumer<FinishedRecipe> provider) {
    DECAY_CHAMBERS_RECIPES.recipeBuilder("calcium_44")
        .inputFluids(Titanium44.getFluid(144))
        .outputFluids(Calcium44.getFluid(144))
        .duration(180).EUt(VA[IV]).save(provider);

    DECAY_CHAMBERS_RECIPES.recipeBuilder("radon").duration(180).EUt(480)
        .inputDust(Radium)
        .outputFluids(Radon.getFluid(1000))
        .save(provider);

    DECAY_CHAMBERS_RECIPES.recipeBuilder("chromium_48_decay")
        .inputFluids(Chromium48.getFluid(144))
        .outputFluids(Titanium.getFluid(144))
        .duration(180).EUt(VA[IV]).save(provider);

    DECAY_CHAMBERS_RECIPES.recipeBuilder("iron_52_decay")
        .inputFluids(Iron52.getFluid(144))
        .outputFluids(Chromium.getFluid(144))
        .duration(180).EUt(VA[IV]).save(provider);

    DECAY_CHAMBERS_RECIPES.recipeBuilder("nickel_56_decay")
        .inputFluids(Nickel56.getFluid(144))
        .outputFluids(Iron.getFluid(144))
        .duration(180).EUt(VA[IV]).save(provider);

    DECAY_CHAMBERS_RECIPES.recipeBuilder("flyb_plasma")
        .inputFluids(Quassifissioning.getFluid(1000))
        .outputFluids(FlYb.getFluid(FluidStorageKeys.PLASMA, 1000))
        .duration(160).EUt(VA[LuV]).save(provider);

    DECAY_CHAMBERS_RECIPES.recipeBuilder("ytterbium_178_decay")
        .inputFluids(Ytterbium178.getFluid(144))
        .outputFluids(Hafnium.getFluid(144))
        .duration(VA[MV]).EUt(VA[IV]).save(provider);
  }
}
