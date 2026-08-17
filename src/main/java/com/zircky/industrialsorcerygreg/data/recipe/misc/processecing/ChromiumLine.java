package com.zircky.industrialsorcerygreg.data.recipe.misc.processecing;

import com.gregtechceu.gtceu.GTCEu;
import com.zircky.industrialsorcerygreg.ISGCore;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.industrialsorcerygreg.api.ISGValues.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.DEHYDRATOR_RECIPES;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.*;

public class ChromiumLine {
  public static void init(Consumer<FinishedRecipe> provider) {
    rubyRecipe(provider);
    // Na2CO3 + H2O -> Na2CO3(H2O)
    MIXER_RECIPES.recipeBuilder(ISGCore.id("sodium_carbonate_solution"))
        .inputItems(dust, SodaAsh, 6)
        .inputFluids(Water.getFluid(1000))
        .outputFluids(SodiumCarbonateSolution.getFluid(1000))
        .duration(SECONDS * 3).EUt(VA[LV]).save(provider);

    // 2NaOH + CO2 -> Na2CO3 + H2O
    CHEMICAL_RECIPES.recipeBuilder("soda_ash").duration(80).EUt(480)
        .inputDust(SodiumHydroxide, 6)
        .inputFluids(CarbonDioxide.getFluid(1000))
        .outputDust(SodaAsh, 6)
        .inputFluids(Water.getFluid(1000))
        .save(provider);

    // CaCO3 + 2NaCl -> Na2CO3 + CaCl2
    BLAST_RECIPES.recipeBuilder("calcium_chloride").duration(120).EUt(120).blastFurnaceTemp(700)
        .inputDust(Calcite, 5)
        .inputDust(Salt, 4)
        .outputDust(SodaAsh, 6)
        .outputDust(CalciumChloride, 3)
        .save(provider);

    BLAST_RECIPES.recipeBuilder(ISGCore.id("alumina_to_aluminum"))
        .inputItems(dust, Alumina, 10)
        .inputItems(dust, Carbon, 3)
        .outputItems(ingot, Aluminium, 4)
        .outputFluids(CarbonDioxide.getFluid(3000))
        .blastFurnaceTemp(1200)
        .duration(SECONDS * 60).EUt(VA[MV]).save(provider);

    // 2Cr2FeO4 + 4Na2CO3(H2O) + 7O -> Fe2O3 + 4CO2 + 4Na2CrO4(H2O)
    CHEMICAL_RECIPES.recipeBuilder(ISGCore.id("sodium_chromate_from_sodium_carbonate"))
        .inputDust(Chromite, 14)
        .inputFluids(Oxygen.getFluid(7000))
        .inputFluids(SodiumCarbonateSolution.getFluid(4000))
        .outputDust(Magnetite, 7)
        .outputFluids(CarbonDioxide.getFluid(4000))
        .outputFluids(SodiumChromateSolution.getFluid(4000))
        .duration(SECONDS * 6).EUt(VA[MV]).save(provider);

    // 2Na2CrO4(H2O) + H2SO4 -> Na2Cr2O7(H2O) + Na2SO4 + 2H2O (H2O lost to dehydrator)
    DEHYDRATOR_RECIPES.recipeBuilder(ISGCore.id("sodium_dichromate_from_sodium_chromate"))
        .inputFluids(SulfuricAcid.getFluid(1000))
        .inputFluids(SodiumChromateSolution.getFluid(2000))
        .outputItems(dust, SodiumSulfate, 7)
        .outputFluids(SodiumDichromateSolution.getFluid(1000))
        .duration(SECONDS * 10).EUt(VA[MV]).save(provider);

    // 2C + Na2Cr2O7(H2O) -> Na2CO3 + Cr2O3 + CO + H2O (H2O lost to dehydrator)
    DEHYDRATOR_RECIPES.recipeBuilder(ISGCore.id("chromium_iii_oxide_dust_from_sodium_dichromate"))
        .inputItems(dust, Carbon, 2)
        .inputFluids(SodiumDichromateSolution.getFluid(1000))
        .outputItems(dust, SodaAsh, 6)
        .outputItems(dust, ChromiumIIIOxide, 5)
        .outputFluids(CarbonMonoxide.getFluid(1000))
        .duration(SECONDS * 10).EUt(VA[MV]).save(provider);

    // Cr2O3 + 2Al -> 2 Cr + Al2O3
    BLAST_RECIPES.recipeBuilder(ISGCore.id("chrome_from_chromium_3"))
        .inputItems(dust, ChromiumIIIOxide, 5)
        .inputItems(dust, Aluminium, 2)
        .outputItems(dust, Chromium, 2)
        .outputItems(dust, Alumina, 5)
        .blastFurnaceTemp(1200)
        .duration(SECONDS * 10).EUt(VA[MV]).save(provider);

// Combined Step - Chromite
    CHEMICAL_BATH_RECIPES.recipeBuilder("magnetite_and_sulfur_and_chromium").EUt(30720).duration(200)
        .inputDust(Chromite, 7)
        .inputFluids(SulfuricAcid.getFluid(3000))
        .outputDust(Magnetite, 5)
        .outputDust(Sulfur, 3)
        .outputDust(Chromium, 4)
        .save(provider);

    // Na2SO4(H2O) -> Na2SO4
    DEHYDRATOR_RECIPES.recipeBuilder("sodium_sulfate").duration(120).EUt(120)
        .inputFluids(SodiumSulfateSolution.getFluid(1000))
        .outputDust(SodiumSulfate, 7)
        .save(provider);

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

  private static void rubyRecipe(Consumer<FinishedRecipe> provider) {
    // Al2O3Cr + (HNO3 + HCl) -> Al2O3Cr(HNO3HCl)
    MIXER_RECIPES.recipeBuilder("ruby_slurry").duration(280).EUt(1920)
        .inputDust(Ruby, 6)
        .inputFluids(AquaRegia.getFluid(2000))
        .outputFluids(RubySlurry.getFluid(2000))
        .save(provider);

    // Al2O3Cr(HNO3HCl) -> 2Al + Cr + 3O + Ti + Fe + V + HNO3 + HCl
    CENTRIFUGE_RECIPES.recipeBuilder("ruby_slurry_from_al_cr_ti_fe_v").duration(320).EUt(480)
        .inputFluids(RubySlurry.getFluid(2000))
        .outputDust(Aluminium, 2)
        .outputDust(Chromium)
        .chancedOutput(dustTiny, Titanium, 2000)
        .chancedOutput(dustTiny, Iron, 2000)
        .chancedOutput(dustTiny, Vanadium, 2000)
        .outputFluids(Oxygen.getFluid(3000))
        .outputFluids(NitricAcid.getFluid(1000))
        .outputFluids(HydrochloricAcid.getFluid(1000))
        .save(provider);

    // Al2O3 + (HNO3 + HCl) -> Al2O3(HNO3HCl)
    MIXER_RECIPES.recipeBuilder("sapphire_slurry").duration(280).EUt(1920)
        .inputDust(Sapphire, 5)
        .inputFluids(AquaRegia.getFluid(2000))
        .outputFluids(SapphireSlurry.getFluid(2000))
        .save(provider);

    // Al2O3(HNO3HCl) -> 2Al + 3O + Ti + Fe + V + HNO3 + HCl
    CENTRIFUGE_RECIPES.recipeBuilder("sapphire_slurry_from_al_cr_ti_fe_v").duration(320).EUt(480)
        .inputFluids(SapphireSlurry.getFluid(2000))
        .outputDust(Aluminium, 2)
        .chancedOutput(dustTiny, Titanium, 2000)
        .chancedOutput(dustTiny, Iron, 2000)
        .chancedOutput(dustTiny, Vanadium, 2000)
        .outputFluids(Oxygen.getFluid(3000))
        .outputFluids(NitricAcid.getFluid(1000))
        .outputFluids(HydrochloricAcid.getFluid(1000))
        .save(provider);

    // Al2O3 + (HNO3 + HCl) -> Al2O3(HNO3HCl)
    MIXER_RECIPES.recipeBuilder("green_sapphire_slurry").duration(280).EUt(1920)
        .inputDust(GreenSapphire, 5)
        .inputFluids(AquaRegia.getFluid(2000))
        .outputFluids(GreenSapphireSlurry.getFluid(2000))
        .save(provider);

    // Al2O3(HNO3HCl) -> 2Al + 3O + Be + Ti + Fe + V + HNO3 + HCl
    CENTRIFUGE_RECIPES.recipeBuilder("sapphire_slurry_from_al_cr_be_ti_fe_v").duration(320).EUt(480)
        .inputFluids(GreenSapphireSlurry.getFluid(2000))
        .outputDust(Aluminium, 2)
        .chancedOutput(dustTiny, Beryllium, 2000)
        .chancedOutput(dustTiny, Titanium, 2000)
        .chancedOutput(dustTiny, Iron, 2000)
        .chancedOutput(dustTiny, Vanadium, 2000)
        .outputFluids(Oxygen.getFluid(3000))
        .outputFluids(NitricAcid.getFluid(1000))
        .outputFluids(HydrochloricAcid.getFluid(1000))
        .save(provider);
  }

  public static void remove(Consumer<ResourceLocation> consumer) {
    consumer.accept(GTCEu.id("chemical_reactor/calcite_from_quicklime"));
    consumer.accept(GTCEu.id("large_chemical_reactor/calcite_from_quicklime"));
  }
}
