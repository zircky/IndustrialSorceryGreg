package com.zircky.industrialsorcerygreg.data.recipe.misc.processecing;

import com.gregtechceu.gtceu.GTCEu;
import com.zircky.industrialsorcerygreg.ISGCore;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.dust;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.ingot;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.*;
import static com.zircky.industrialsorcerygreg.api.ISGValues.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.DEHYDRATOR_RECIPES;

public class ChromiumLine {
  public static void init(Consumer<FinishedRecipe> provider) {
    BLAST_RECIPES.recipeBuilder(ISGCore.id("alumina_to_aluminum"))
        .inputItems(dust, Alumina, 10)
        .inputItems(dust, Carbon, 3)
        .outputItems(ingot, Aluminium, 4)
        .outputFluids(CarbonDioxide.getFluid(3000))
        .blastFurnaceTemp(1200)
        .duration(SECONDS * 60).EUt(VA[MV]).save(provider);
    MIXER_RECIPES.recipeBuilder(ISGCore.id("sodium_carbonate_solution"))
        .inputItems(dust, SodaAsh, 6)
        .inputFluids(Water.getFluid(1000))
        .outputFluids(SodiumCarbonateSolution.getFluid(1000))
        .duration(SECONDS * 3).EUt(VA[LV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder(ISGCore.id("sodium_chromate_from_sodium_carbonate"))
        .inputItems(dust, Chromite, 14)
        .inputFluids(Oxygen.getFluid(7000))
        .inputFluids(SodiumCarbonateSolution.getFluid(4000))
        .outputItems(dust, Magnetite, 7)
        .outputFluids(CarbonDioxide.getFluid(4000))
        .outputFluids(SodiumChromateSolution.getFluid(4000))
        .duration(SECONDS * 6).EUt(VA[MV]).save(provider);

    DEHYDRATOR_RECIPES.recipeBuilder(ISGCore.id("sodium_dichromate_from_sodium_chromate"))
        .inputFluids(SulfuricAcid.getFluid(1000))
        .inputFluids(SodiumChromateSolution.getFluid(2000))
        .outputItems(dust, SodiumSulfate, 7)
        .outputFluids(SodiumDichromateSolution.getFluid(1000))
        .duration(SECONDS * 10).EUt(VA[MV]).save(provider);

    DEHYDRATOR_RECIPES.recipeBuilder(ISGCore.id("chromium_iii_oxide_dust_from_sodium_dichromate"))
        .inputItems(dust, Carbon, 2)
        .inputFluids(SodiumDichromateSolution.getFluid(1000))
        .outputItems(dust, SodaAsh, 6)
        .outputItems(dust, ChromiumIIIOxide, 5)
        .outputFluids(CarbonMonoxide.getFluid(1000))
        .duration(SECONDS * 10).EUt(VA[MV]).save(provider);

    BLAST_RECIPES.recipeBuilder(ISGCore.id("chrome_from_chromium_3"))
        .inputItems(dust, ChromiumIIIOxide, 5)
        .inputItems(dust, Aluminium, 2)
        .outputItems(dust, Chromium, 2)
        .outputItems(dust, Alumina, 5)
        .blastFurnaceTemp(1200)
        .duration(SECONDS * 10).EUt(VA[MV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder(ISGCore.id("sodium_sulfide_from_sodium_sulfate"))
        .inputItems(dust, SodiumSulfate, 7)
        .inputItems(dust, Carbon, 2)
        .outputItems(dust, SodiumSulfate, 3)
        .outputFluids(CarbonDioxide.getFluid(2000))
        .duration(SECONDS * 3).EUt(VA[MV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder(ISGCore.id("soda_ash_from_sodium_sulfide"))
        .inputItems(dust, SodiumSulfate, 3)
        .inputItems(dust, Quicklime, 2)
        .inputFluids(CarbonDioxide.getFluid(1000))
        .outputItems(dust, SodaAsh, 6)
        .outputItems(dust, CalciumSulfide, 2)
        .duration(SECONDS * 3).EUt(VA[MV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder(ISGCore.id("calcite_fix"))
        .inputItems(dust, Quicklime, 2)
        .inputFluids(CarbonDioxide.getFluid(1000))
        .outputItems(dust, Calcite, 5)
        .circuitMeta(3).duration(SECONDS * 4).EUt(VA[LV]).save(provider);
  }

  public static void remove(Consumer<ResourceLocation> consumer) {
    consumer.accept(GTCEu.id("chemical_reactor/calcite_from_quicklime"));
    consumer.accept(GTCEu.id("large_chemical_reactor/calcite_from_quicklime"));
  }
}
