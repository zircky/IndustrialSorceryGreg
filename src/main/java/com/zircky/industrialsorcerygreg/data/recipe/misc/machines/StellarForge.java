package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.UIV;
import static com.gregtechceu.gtceu.api.GTValues.VH;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.plate;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.STELLAR_FORGE_RECIPES;

public class StellarForge {
  public static void init(Consumer<FinishedRecipe> provider) {
    STELLAR_FORGE_RECIPES.recipeBuilder("quark_gluon_plasma_from_degenerate_rhenium_dust")
        .inputDust(ElectronDegenerateRhenium)
        .circuitMeta(1)
        .outputFluids(QuarkGluon.getFluid(FluidStorageKeys.PLASMA, 4000))
        .duration(60).EUt(VH[UIV])
        .save(provider);

    STELLAR_FORGE_RECIPES.recipeBuilder("quark_gluon_plasma_from_degenerate_rhenium_plate")
        .inputItems(plate, ElectronDegenerateRhenium)
        .circuitMeta(2)
        .outputFluids(QuarkGluon.getFluid(FluidStorageKeys.PLASMA, 2000))
        .duration(60).EUt(VH[UIV])
        .save(provider);


  }
}
