package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.dust;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.ingotHot;
import static com.gregtechceu.gtceu.common.data.GTItems.SHAPE_MOLD_INGOT;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.VACUUM_RECIPES;

public class Vacuum {
  public static void init(Consumer<FinishedRecipe> provider) {
    VACUUM_RECIPES.recipeBuilder("ingot_hot_metastable_oganesson").duration(3800).EUt(120)
        .notConsumable(SHAPE_MOLD_INGOT)
        .inputFluids(HotMetastableOganesson.getFluid(125))
        .outputItems(ingotHot, MetastableOganesson)
        .save(provider);

    VACUUM_RECIPES.recipeBuilder("concentrated_brine_to_calcium_free_brine_calcium_salts").duration(150).EUt(120)
        .inputFluids(ConcentratedBrine.getFluid(1000))
        .outputFluids(CalciumFreeBrine.getFluid(1000))
        .outputItems(CalciumSalts, 13)
        .save(provider);

    VACUUM_RECIPES.recipeBuilder("calcium_free_brine_to_sodium_free_brine_sodium_salts").duration(160).EUt(120)
        .inputFluids(CalciumFreeBrine.getFluid(1000))
        .outputFluids(SodiumFreeBrine.getFluid(1000))
        .outputItems(SodiumSalts, 4)
        .save(provider);

    VACUUM_RECIPES.recipeBuilder("sodium_free_brine_to_potassium_free_brine_potassium_magnesium_salts").duration(200).EUt(120)
        .inputFluids(SodiumFreeBrine.getFluid(1000))
        .outputFluids(PotassiumFreeBrine.getFluid(1000))
        .outputItems(PotassiumMagnesiumSalts, 30)
        .save(provider);

    VACUUM_RECIPES.recipeBuilder("brine_to_chilled_brine").duration(260).EUt(120)
        .inputFluids(Brine.getFluid(6400))
        .outputFluids(ChilledBrine.getFluid(3000))
        .save(provider);

    VACUUM_RECIPES.recipeBuilder("fluorine_to_liquid_fluorine").duration(30).EUt(480)
        .inputFluids(Fluorine.getFluid(1000))
        .outputFluids(LiquidFluorine.getFluid(1000))
        .save(provider);

    VACUUM_RECIPES.recipeBuilder("xenon_to_liquid_xenon").duration(30).EUt(480)
        .inputFluids(Xenon.getFluid(1000))
        .outputFluids(LiquidXenon.getFluid(1000))
        .save(provider);

//    VACUUM_RECIPES.recipeBuilder("helium3_to_liquid_helium3").duration(20).EUt(30720)
//        .inputFluids(Helium3.getFluid(5000))
//        .outputFluids(Helium3.getFluid(FluidStorageKeys.LIQUID, 5000))
//        .save(provider);
//
//    VACUUM_RECIPES.recipeBuilder("nitrogen_to_liquid_nitrogen").duration(20).EUt(480)
//        .inputFluids(Nitrogen.getFluid(5000))
//        .outputFluids(LiquidNitrogen.getFluid(5000))
//        .save(provider);

    VACUUM_RECIPES.recipeBuilder("cryotheum_to_supercooled_cryotheum").duration(200).EUt(480)
        .circuitMeta(0)
        .inputFluids(Cryotheum.getFluid(10000))
        .outputFluids(SupercooledCryotheum.getFluid(10000))
        .save(provider);

    // Liquid Hydrogen
    VACUUM_RECIPES.recipeBuilder("hydrogen_to_liquid_hydrogen").duration(16).EUt(540)
        .inputFluids(Hydrogen.getFluid(500))
        .outputFluids(LiquidHydrogen.getFluid(500))
        .save(provider);

  }


}
