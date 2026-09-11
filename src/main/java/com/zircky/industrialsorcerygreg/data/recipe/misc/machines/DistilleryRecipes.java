package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.*;

public class DistilleryRecipes {
  public static void init(Consumer<FinishedRecipe> provider) {

        // RP1
        DISTILLERY_RECIPES.recipeBuilder("kerosene_to_rp1").duration(16).EUt(120)
                .circuitMeta(0)
                .inputFluids(Kerosene.getFluid(50))
                .outputFluids(RP1.getFluid(25))
                .save(provider);

        DISTILLERY_RECIPES.recipeBuilder("sulfuric_coal_tar_oil_to_naphthalene").duration(80).EUt(30)
                .circuitMeta(0)
                .inputFluids(SulfuricCoalTarOil.getFluid(50))
                .outputFluids(Naphthalene.getFluid(50))
                .save(provider);

        DISTILLERY_RECIPES.recipeBuilder("sulfuric_coal_tar_oil_to_naphthalene_circuit_1").duration(5).EUt(480)
                .circuitMeta(1)
                .inputFluids(SulfuricCoalTarOil.getFluid(800))
                .outputFluids(Naphthalene.getFluid(800))
                .save(provider);
  }
}
