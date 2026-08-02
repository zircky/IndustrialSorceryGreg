package com.zircky.industrialsorcerygreg.data.recipe.misc.processecing;

import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.dust;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.Plutonium239;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.*;

public class NaquadahLine {
  public static void init(Consumer<FinishedRecipe> provider) {
    registerOreTapProcessing(provider);

    // Nq + 2[HNO3 + HCl] -> Naquadric Solution [Nq + NO2] + [H2O + HNO3] + HCl + Cl
    LARGE_CHEMICAL_RECIPES.recipeBuilder("naquadah_line_naquadric_solution")
        .inputDust(NaquadricCompound)
        .inputFluids(AquaRegia.getFluid(4000))
        .outputFluids(NaquadricSolution.getFluid(1000))
        .outputFluids(DiluteNitricAcid.getFluid(2000))
        .outputFluids(HydrochloricAcid.getFluid(1000))
        .outputFluids(Chlorine.getFluid(1000))
        .EUt(480)
        .duration(100)
        .save(provider);

    // Nq + 2[HNO3 + HCl] = Enriched Naquadric Solution [Nq + NO2] + [H2O + HNO3] + HCl + Cl
    LARGE_CHEMICAL_RECIPES.recipeBuilder("naquadah_line_enriched_naquadric_solution")
        .inputDust(EnrichedNaquadricCompound)
        .inputFluids(AquaRegia.getFluid(4000))
        .outputFluids(EnrichedNaquadricSolution.getFluid(1000))
        .outputFluids(DiluteNitricAcid.getFluid(2000))
        .outputFluids(HydrochloricAcid.getFluid(1000))
        .outputFluids(Chlorine.getFluid(1000))
        .EUt(480)
        .duration(100)
        .save(provider);

    // Nq + 2[HNO3 + HCl] = Naquadriatic Solution [Nq + NO2] + [H2O + HNO3] + HCl + Cl
    LARGE_CHEMICAL_RECIPES.recipeBuilder("naquadah_line_naquadriatic_solution")
        .inputDust(NaquadriaticCompound)
        .inputFluids(AquaRegia.getFluid(4000))
        .outputFluids(NaquadriaticSolution.getFluid(1000))
        .outputFluids(DiluteNitricAcid.getFluid(2000))
        .outputFluids(HydrochloricAcid.getFluid(1000))
        .outputFluids(Chlorine.getFluid(1000))
        .EUt(480)
        .duration(100)
        .save(provider);

    // Sb2O3 + 6HF = 2SbF3 + 3H2O
    CHEMICAL_RECIPES.recipeBuilder("naquadah_line_antimony_trifluoride")
        .inputDust(AntimonyTrioxide, 5)
        .inputFluids(HydrofluoricAcid.getFluid(6000))
        .outputDust(AntimonyTrifluoride, 8 )
        .outputFluids(Water.getFluid(3000))
        .EUt(480)
        .duration(200)
        .save(provider);

    // SbF3 + 2F = SbF5
    CHEMICAL_RECIPES.recipeBuilder("naquadah_line_antimony_pentafluoride")
        .inputDust(AntimonyTrifluoride, 4)
        .inputFluids(Fluorine.getFluid(2000))
        .outputFluids(AntimonyPentafluoride.getFluid(1000))
        .EUt(480)
        .duration(100)
        .save(provider);

    // SbF5 + 2HF = H2SbF7
    LARGE_CHEMICAL_RECIPES.recipeBuilder("naquadah_line_fluoroantimonic_acid")
        .inputFluids(AntimonyPentafluoride.getFluid(1000))
        .inputFluids(HydrofluoricAcid.getFluid(2000))
        .outputFluids(FluoroantimonicAcid.getFluid(1000))
        .EUt(480)
        .duration(200)
        .save(provider);

    // Naquadric Solution [Nq + NO2] + H2SbF7 = SbF3 + Fluoronaquadric Acid [H2NqF4] + NO2
    CHEMICAL_RECIPES.recipeBuilder("naquadah_line_fluoronaquadric_acid")
        .inputFluids(NaquadricSolution.getFluid(1000))
        .inputFluids(FluoroantimonicAcid.getFluid(1000))
        .outputDust(AntimonyTrifluoride, 4)
        .outputFluids(FluoronaquadricAcid.getFluid(1000))
        .outputFluids(NitrogenDioxide.getFluid(1000))
        .EUt(480)
        .duration(200)
        .save(provider);

    // Enriched Naquadric Solution [Nq + NO2] + H2SbF7 = SbF3 + Enriched Fluoronaquadric Acid [H2NqF4] + NO2
    CHEMICAL_RECIPES.recipeBuilder("naquadah_line_enriched_fluoronaquadric_acid")
        .inputFluids(EnrichedNaquadricSolution.getFluid(1000))
        .inputFluids(FluoroantimonicAcid.getFluid(1000))
        .outputDust(AntimonyTrifluoride, 4)
        .outputFluids(EnrichedFluoronaquadricAcid.getFluid(1000))
        .outputFluids(NitrogenDioxide.getFluid(1000))
        .EUt(480)
        .duration(200)
        .save(provider);

    // Naquadriatic Solution [Nq + NO2] + H2SbF7 = SbF3 + Fluoronaquadriatic Acid [H2NqF4] + NO2
    CHEMICAL_RECIPES.recipeBuilder("naquadah_line_fluoronaquadriatic_acid")
        .inputFluids(NaquadriaticSolution.getFluid(1000))
        .inputFluids(FluoroantimonicAcid.getFluid(1000))
        .outputDust(AntimonyTrifluoride, 4)
        .outputFluids(FluoronaquadriaticAcid.getFluid(1000))
        .outputFluids(NitrogenDioxide.getFluid(1000))
        .EUt(480)
        .duration(200)
        .save(provider);

    // Fluoronaquadric Acid [H2NqF4] = 2HF + Naquadah Difluoride [NqF2]
    ELECTROLYZER_RECIPES.recipeBuilder("naquadah_line_naquadah_difluoride")
        .inputFluids(FluoronaquadricAcid.getFluid(1000))
        .outputFluids(HydrofluoricAcid.getFluid(2000))
        .outputFluids(NaquadahDifluoride.getFluid(1000))
        .EUt(7680)
        .duration(100)
        .save(provider);

    // Enriched Fluoronaquadric Acid [H2NqF4] = 2HF + Enriched Naquadah Difluoride [NqF2]
    ELECTROLYZER_RECIPES.recipeBuilder("naquadah_line_enriched_naquadah_difluoride")
        .inputFluids(EnrichedFluoronaquadricAcid.getFluid(1000))
        .outputFluids(HydrofluoricAcid.getFluid(2000))
        .outputFluids(EnrichedNaquadahDifluoride.getFluid(1000))
        .EUt(7680)
        .duration(100)
        .save(provider);

    // Fluoronaquadriatic Acid [H2NqF4] = 2HF + Naquadria Difluoride [NqF2]
    ELECTROLYZER_RECIPES.recipeBuilder("naquadah_line_naquadria_difluoride")
        .inputFluids(FluoronaquadriaticAcid.getFluid(1000))
        .outputFluids(HydrofluoricAcid.getFluid(2000))
        .outputFluids(NaquadriaDifluoride.getFluid(1000))
        .EUt(7680)
        .duration(100)
        .save(provider);

    // 3 Naquadah Difluoride [NqF2] + 2In = 2InF3 + 3 Naquadah Concentrate [Nq]
    BLAST_RECIPES.recipeBuilder("naquadah_line_naquadah_concentrate")
        .inputFluids(NaquadahDifluoride.getFluid(3000))
        .inputDust(Indium, 2)
        .outputDust(IndiumTrifluoride, 8)
        .outputDust(NaquadahConcentrate, 3)
        .EUt(30720)
        .duration(100)
        .blastFurnaceTemp(4500)
        .save(provider);

    // 3 Enriched Naquadah Difluoride [NqF2] + 2In = 2InF3 + 3 Enriched Naquadah Concentrate [Nq]
    BLAST_RECIPES.recipeBuilder("naquadah_line_enriched_naquadah_concentrate")
        .inputFluids(EnrichedNaquadahDifluoride.getFluid(3000))
        .inputDust(Indium, 2)
        .outputDust(IndiumTrifluoride, 8)
        .outputDust(EnrichedNaquadahConcentrate, 3)
        .EUt(30720)
        .duration(100)
        .blastFurnaceTemp(4500)
        .save(provider);

    // 3 Naquadria Difluoride [NqF2] + 2In = 2InF3 + 3 Naquadria Concentrate [Nq]
    BLAST_RECIPES.recipeBuilder("naquadah_line_naquadria_concentrate")
        .inputFluids(NaquadriaDifluoride.getFluid(3000))
        .inputDust(Indium, 2)
        .outputDust(IndiumTrifluoride, 8)
        .outputDust(NaquadriaConcentrate, 3)
        .EUt(30720)
        .duration(100)
        .blastFurnaceTemp(4500)
        .save(provider);

    // 6F + Naquadria Concentrate [Nq] = Naquadria Hexafluoride [NqF6]
    CHEMICAL_RECIPES.recipeBuilder("naquadah_line_naquadria_hexafluoride")
        .inputFluids(Fluorine.getFluid(6000))
        .inputDust(NaquadriaConcentrate)
        .outputFluids(NaquadriaHexafluoride.getFluid(1000))
        .EUt(480)
        .duration(100)
        .save(provider);

    // Rn + 2F = RnF2
    CHEMICAL_RECIPES.recipeBuilder("naquadah_line_radon_difluoride")
        .inputFluids(Radon.getFluid(1000))
        .inputFluids(Fluorine.getFluid(2000))
        .outputFluids(RadonDifluoride.getFluid(1000))
        .EUt(120)
        .duration(200)
        .save(provider);

    // RnF2 + Naquadria Hexafluoride [NqF6] = Radon Naquadriaoctafluoride [RnNqF8]
    CHEMICAL_RECIPES.recipeBuilder("naquadah_line_radon_naquadriaoctafluoride")
        .inputFluids(RadonDifluoride.getFluid(1000))
        .inputFluids(NaquadriaHexafluoride.getFluid(1000))
        .outputFluids(RadonNaquadriaoctafluoride.getFluid(1000))
        .EUt(480)
        .duration(100)
        .save(provider);

    // Xe + 3O = XeO3
    CHEMICAL_RECIPES.recipeBuilder("naquadah_line_xenon_trioxide")
        .inputFluids(Xenon.getFluid(1000))
        .inputFluids(Oxygen.getFluid(3000))
        .outputFluids(XenonTrioxide.getFluid(1000))
        .EUt(120)
        .duration(100)
        .save(provider);

    // XeO3 -> Xe + O3
    ELECTROLYZER_RECIPES.recipeBuilder("naquadah_line_xenon_trioxide_electrolysis")
        .inputFluids(XenonTrioxide.getFluid(1000))
        .outputFluids(Xenon.getFluid(1000))
        .outputFluids(Oxygen.getFluid(3000))
        .EUt(30)
        .duration(370)
        .save(provider);

    // Cs + F = CsF
    CHEMICAL_RECIPES.recipeBuilder("naquadah_line_cesium_fluoride")
        .inputDust(Caesium)
        .inputFluids(Fluorine.getFluid(1000))
        .outputFluids(CesiumFluoride.getFluid(1000))
        .EUt(120)
        .duration(100)
        .save(provider);

    // CsF + XeO3 = CsXeO3F
    CHEMICAL_RECIPES.recipeBuilder("naquadah_line_cesium_xenontrioxide_fluoride")
        .inputFluids(CesiumFluoride.getFluid(1000))
        .inputFluids(XenonTrioxide.getFluid(1000))
        .outputFluids(CesiumXenontrioxideFluoride.getFluid(1000))
        .EUt(120)
        .duration(100)
        .save(provider);

    // CsXeO3F + Radon Naquadriaoctafluoride [RnNqF8] = RnO3 + NqCsXeF9
    CHEMICAL_RECIPES.recipeBuilder("naquadah_line_radon_trioxide")
        .inputFluids(CesiumXenontrioxideFluoride.getFluid(1000))
        .inputFluids(RadonNaquadriaoctafluoride.getFluid(1000))
        .outputFluids(RadonTrioxide.getFluid(1000))
        .outputFluids(NaquadriaCesiumXenonNonfluoride.getFluid(1000))
        .EUt(7680)
        .duration(200)
        .save(provider);

    // NO2 + F = NO2F
    CHEMICAL_RECIPES.recipeBuilder("naquadah_line_nitryl_fluoride")
        .inputFluids(NitrogenDioxide.getFluid(1000))
        .inputFluids(Fluorine.getFluid(1000))
        .outputFluids(NitrylFluoride.getFluid(1000))
        .EUt(120)
        .duration(120)
        .save(provider);

    // 2NO2F + NqCsXeF9 = (NO2)2XeF8 + NqF2CsF
    CHEMICAL_RECIPES.recipeBuilder("naquadah_line_nitrosonium_octafluoroxenate")
        .inputFluids(NitrylFluoride.getFluid(2000))
        .inputFluids(NaquadriaCesiumXenonNonfluoride.getFluid(1000))
        .outputFluids(NitrosoniumOctafluoroxenate.getFluid(1000))
        .outputFluids(NaquadriaCesiumfluoride.getFluid(1000))
        .EUt(480)
        .duration(400)
        .save(provider);

    // NqF2CsF = Nq + 3F + Cs
    ELECTROLYZER_RECIPES.recipeBuilder("naquadah_line_naquadria_cesiumfluoride_electrolysis")
        .inputFluids(NaquadriaCesiumfluoride.getFluid(1000))
        .outputDust(NaquadriaSulfate, 6)
        .outputFluids(Fluorine.getFluid(3000))
        .outputDust(Caesium)
        .EUt(30720)
        .duration(120)
        .save(provider);

    // RnO3 = Rn + O3
    ELECTROLYZER_RECIPES.recipeBuilder("naquadah_line_radon_trioxide_electrolysis")
        .inputFluids(RadonTrioxide.getFluid(1000))
        .outputFluids(Radon.getFluid(1000))
        .outputFluids(Oxygen.getFluid(3000))
        .EUt(120)
        .duration(100)
        .save(provider);

    // (NO2)2XeF8 = 8F + Xe + 2NO2
    ELECTROLYZER_RECIPES.recipeBuilder("naquadah_line_nitrosonium_octafluoroxenate_electrolysis")
        .inputFluids(NitrosoniumOctafluoroxenate.getFluid(1000))
        .outputFluids(Fluorine.getFluid(8000))
        .outputFluids(Xenon.getFluid(1000))
        .outputFluids(NitrogenDioxide.getFluid(2000))
        .EUt(120)
        .duration(100)
        .save(provider);

    // Enriched Naquadah Concentrate [Nq] + 6F = NqF6
    CHEMICAL_RECIPES.recipeBuilder("naquadah_line_enriched_naquadahhexafluoride")
        .inputDust(EnrichedNaquadahConcentrate)
        .inputFluids(Fluorine.getFluid(6000))
        .outputFluids(EnrichedNaquadahhexafluoride.getFluid(1000))
        .EUt(480)
        .duration(175)
        .save(provider);

    // NqF6 + Xe = XeNqF6
    CHEMICAL_RECIPES.recipeBuilder("naquadah_line_enriched_xenon_hexafluoronaquadate")
        .inputFluids(EnrichedNaquadahhexafluoride.getFluid(1000))
        .inputFluids(Xenon.getFluid(1000))
        .outputFluids(EnrichedXenonHexafluoronaquadate.getFluid(1000))
        .EUt(480)
        .duration(200)
        .save(provider);

    // 2Au + 3Cl2 -> Au2Cl6
    ELECTROLYZER_RECIPES.recipeBuilder("naquadah_line_auric_chloride")
        .inputDust(Gold, 2)
        .inputFluids(Chlorine.getFluid(6000))
        .outputFluids(AuricChloride.getFluid(1000))
        .EUt(120)
        .duration(100)
        .save(provider);

    // Br + 3F = BrF3
    CHEMICAL_RECIPES.recipeBuilder("naquadah_line_bromine_trifluoride")
        .inputFluids(Bromine.getFluid(1000))
        .inputFluids(Fluorine.getFluid(3000))
        .outputFluids(BromineTrifluoride.getFluid(1000))
        .EUt(30)
        .duration(150)
        .save(provider);

    // 2BrF3 + Au2Cl6 = 2AuF3 + 2Br + 6Cl
    CHEMICAL_RECIPES.recipeBuilder("naquadah_line_auric_fluoride")
        .inputFluids(BromineTrifluoride.getFluid(2000))
        .inputFluids(AuricChloride.getFluid(1000))
        .outputDust(AuricFluoride, 8)
        .outputFluids(Bromine.getFluid(2000))
        .outputFluids(Chlorine.getFluid(6000))
        .EUt(120)
        .duration(100)
        .save(provider);

    // H2SbF7 + AuF3 + XeNqF6 + 9H = Nq + 9HF + [AuXe + H2SbF7]
    CHEMICAL_RECIPES.recipeBuilder("naquadah_line_xenoauric_fluoroantimonic_acid")
        .inputDust(AuricFluoride, 4)
        .inputFluids(FluoroantimonicAcid.getFluid(1000))
        .inputFluids(EnrichedXenonHexafluoronaquadate.getFluid(1000))
        .inputFluids(Hydrogen.getFluid(9000))
        .outputDust(EnrichedNaquadahSulfate, 6)
        .outputFluids(XenoauricFluoroantimonicAcid.getFluid(1000))
        .outputFluids(HydrofluoricAcid.getFluid(9000))
        .EUt(480)
        .duration(125)
        .save(provider);

    // [AuXe + H2SbF7] = Au + Xe + 2HF + SbF5
    ELECTROLYZER_RECIPES.recipeBuilder("naquadah_line_xenoauric_fluoroantimonic_acid_electrolysis")
        .inputFluids(XenoauricFluoroantimonicAcid.getFluid(1000))
        .outputDust(Gold)
        .outputFluids(Xenon.getFluid(1000))
        .outputFluids(HydrofluoricAcid.getFluid(2000))
        .outputFluids(AntimonyPentafluoride.getFluid(1000))
        .EUt(7680)
        .duration(200)
        .save(provider);

    // 2H2SO4 + 3H2O2 + 2K = 2KHSO5 + 4H2O
    CHEMICAL_RECIPES.recipeBuilder("naquadah_line_potassium_peroxymonosulfate_from_peroxide")
        .inputFluids(SulfuricAcid.getFluid(2000))
        .inputFluids(HydrogenPeroxide.getFluid(3000))
        .inputDust(Potassium, 2)
        .outputDust(PotassiumPeroxymonosulfate, 16)
        .outputFluids(Water.getFluid(4000))
        .EUt(480)
        .duration(100)
        .save(provider);

    // KOH + O + H2SO4 -> KHSO5 + H2O
    CHEMICAL_RECIPES.recipeBuilder("naquadah_line_potassium_peroxymonosulfate_from_hydroxide")
        .inputFluids(PotassiumHydroxide.getFluid(1000))
        .inputFluids(Oxygen.getFluid(1000))
        .inputFluids(SulfuricAcid.getFluid(1000))
        .outputFluids(Water.getFluid(1000))
        .outputDust(PotassiumPeroxymonosulfate, 8)
        .EUt(480)
        .duration(100)
        .save(provider);

    // HF + KHSO5 + Nq = H2O + KF + NqSO4
    CHEMICAL_RECIPES.recipeBuilder("naquadah_line_naquadah_sulfate")
        .inputFluids(HydrofluoricAcid.getFluid(1000))
        .inputDust(PotassiumPeroxymonosulfate, 8)
        .inputDust(NaquadahConcentrate)
        .outputFluids(Water.getFluid(1000))
        .outputDust(PotassiumFluoride, 2)
        .outputFluids(NaquadahSulfate.getFluid(1000))
        .EUt(480)
        .duration(200)
        .save(provider);

    // NqSO4 + 2H = H2SO4 + Nq
    CHEMICAL_RECIPES.recipeBuilder("naquadah_line_naquadah_from_sulfate")
        .inputFluids(NaquadahSulfate.getFluid(1000))
        .inputFluids(Hydrogen.getFluid(2000))
        .outputFluids(SulfuricAcid.getFluid(1000))
        .outputDust(Naquadah)
        .EUt(7680)
        .duration(200)
        .save(provider);

    // 2InF3 + 3H2O = In2O3 + 6HF
    CHEMICAL_RECIPES.recipeBuilder("naquadah_line_indium_trioxide")
        .inputDust(IndiumTrifluoride, 8)
        .inputFluids(Water.getFluid(3000))
        .outputDust(IndiumTrioxide, 5)
        .outputFluids(HydrofluoricAcid.getFluid(6000))
        .EUt(480)
        .duration(200)
        .save(provider);

    // In2O3 + 3C = 2In + 3CO
    BLAST_RECIPES.recipeBuilder("naquadah_line_indium_from_trioxide")
        .inputDust(IndiumTrioxide, 5)
        .inputDust(Carbon, 3)
        .outputDust(Indium, 2)
        .outputFluids(CarbonMonoxide.getFluid(3000))
        .EUt(480)
        .duration(100)
        .blastFurnaceTemp(4500)
        .save(provider);

    // NH3 + HNO3 = NH4NO3
    CHEMICAL_RECIPES.recipeBuilder("naquadah_line_ammonium_nitrate")
        .inputFluids(Ammonia.getFluid(1000))
        .inputFluids(NitricAcid.getFluid(1000))
        .outputFluids(AmmoniumNitrate.getFluid(1000))
        .EUt(480)
        .duration(120)
        .save(provider);

    // Nq + NH4NO3 = Naquadah Solution [Nq + NH4NO3]
    MIXER_RECIPES.recipeBuilder("naquadah_line_naquadah_solution")
        .inputDust(Naquadah)
        .inputFluids(AmmoniumNitrate.getFluid(1000))
        .outputFluids(NaquadahSolution.getFluid(1000))
        .EUt(7680)
        .duration(200)
        .save(provider);

    // 2 Naquadah Solution [Nq + NH4NO3] = Clear Naquadah Liquid + NH3 + HNO3
    CENTRIFUGE_RECIPES.recipeBuilder("naquadah_line_clear_naquadah_liquid")
        .inputFluids(NaquadahSolution.getFluid(2000))
        .outputFluids(ClearNaquadahLiquid.getFluid(1000))
        .outputFluids(Ammonia.getFluid(1000))
        .outputFluids(NitricAcid.getFluid(1000))
        .chancedOutput(dust, PlatinumRaw, 3, 3333)
        .chancedOutput(dust, IridiumChloride, 2, 6666)
        .chancedOutput(dust, NaquadahConcentrate, 1, 1111)
        .EUt(7680)
        .duration(150)
        .save(provider);

    DISTILLATION_RECIPES.recipeBuilder("naquadah_line_clear_naquadah_liquid_distillation")
        .inputFluids(ClearNaquadahLiquid.getFluid(1000))
        .outputFluids(ComplicatedNaquadahGas.getFluid(100))
        .outputFluids(ComplicatedLightNaquadah.getFluid(180))
        .outputFluids(ComplicatedMediumNaquadah.getFluid(300))
        .outputFluids(ComplicatedHeavyNaquadah.getFluid(420))
        .EUt(7680)
        .duration(500)
        .save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("naquadah_line_naquadah_gas")
        .inputFluids(ComplicatedNaquadahGas.getFluid(2000))
        .outputFluids(NaquadahGas.getFluid(1400))
        .chancedOutput(dust, IridiumChloride, 1, 4444)
        .EUt(7680)
        .duration(200)
        .save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("naquadah_line_heavy_naquadah")
        .inputFluids(ComplicatedHeavyNaquadah.getFluid(2000))
        .outputFluids(HeavyNaquadah.getFluid(1000))
        .chancedOutput(dust, IridiumChloride, 1, 4444)
        .EUt(7680)
        .duration(200)
        .save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("naquadah_line_light_naquadah")
        .inputFluids(ComplicatedLightNaquadah.getFluid(2000))
        .outputFluids(LightNaquadah.getFluid(1000))
        .chancedOutput(dust, IridiumChloride, 1, 4444)
        .EUt(7680)
        .duration(200)
        .save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("naquadah_line_medium_naquadah")
        .inputFluids(ComplicatedMediumNaquadah.getFluid(2000))
        .outputFluids(MediumNaquadah.getFluid(1000))
        .chancedOutput(dust, IridiumChloride, 1, 4444)
        .EUt(7680)
        .duration(200)
        .save(provider);

    CRACKING_RECIPES.recipeBuilder("naquadah_line_f_cracked_medium_naquadah")
        .inputFluids(MediumNaquadah.getFluid(1000))
        .inputFluids(Fluorine.getFluid(400))
        .outputFluids(FCrackedMediumNaquadah.getFluid(1400))
        .EUt(7680)
        .duration(200)
        .save(provider);

    CRACKING_RECIPES.recipeBuilder("naquadah_line_f_cracked_light_naquadah")
        .inputFluids(LightNaquadah.getFluid(1000))
        .inputFluids(Fluorine.getFluid(200))
        .outputFluids(FCrackedLightNaquadah.getFluid(1200))
        .EUt(7680)
        .duration(200)
        .save(provider);

    CRACKING_RECIPES.recipeBuilder("naquadah_line_f_cracked_heavy_naquadah")
        .inputFluids(HeavyNaquadah.getFluid(1000))
        .inputFluids(Fluorine.getFluid(600))
        .outputFluids(FCrackedHeavyNaquadah.getFluid(1600))
        .EUt(7680)
        .duration(200)
        .save(provider);

    DISTILLATION_RECIPES.recipeBuilder("naquadah_line_f_cracked_light_naquadah_distillation")
        .inputFluids(FCrackedLightNaquadah.getFluid(1200))
        .outputFluids(NaquadahGas.getFluid(400))
        .outputFluids(LightNaquadahFuel.getFluid(400))
        .outputFluids(MediumNaquadahFuel.getFluid(150))
        .outputFluids(HeavyNaquadahFuel.getFluid(50))
        .outputFluids(Fluorine.getFluid(200))
        .EUt(7680)
        .duration(200)
        .save(provider);

    DISTILLATION_RECIPES.recipeBuilder("naquadah_line_f_cracked_medium_naquadah_distillation")
        .inputFluids(FCrackedMediumNaquadah.getFluid(1400))
        .outputFluids(NaquadahGas.getFluid(300))
        .outputFluids(LightNaquadahFuel.getFluid(200))
        .outputFluids(MediumNaquadahFuel.getFluid(400))
        .outputFluids(HeavyNaquadahFuel.getFluid(100))
        .outputFluids(Fluorine.getFluid(400))
        .EUt(7680)
        .duration(200)
        .save(provider);

    DISTILLATION_RECIPES.recipeBuilder("naquadah_line_f_cracked_heavy_naquadah_distillation")
        .inputFluids(FCrackedHeavyNaquadah.getFluid(1600))
        .outputFluids(NaquadahGas.getFluid(300))
        .outputFluids(LightNaquadahFuel.getFluid(100))
        .outputFluids(MediumNaquadahFuel.getFluid(200))
        .outputFluids(HeavyNaquadahFuel.getFluid(400))
        .outputFluids(Fluorine.getFluid(600))
        .EUt(7680)
        .duration(200)
        .save(provider);

    // Cu + O + H2SO4 = [CuSO4 + H2O]
    CHEMICAL_RECIPES.recipeBuilder("copper_sulfate_solution")
        .inputDust(Copper)
        .inputFluids(Oxygen.getFluid(1000))
        .inputFluids(SulfuricAcid.getFluid(1000))
        .outputFluids(CopperSulfateSolution.getFluid(1000))
        .EUt(480)
        .duration(300)
        .save(provider);

    CHEMICAL_RECIPES.recipeBuilder("e_naquadah_solution")
        .inputFluids(CopperSulfateSolution.getFluid(900))
        .inputFluids(NaquadahGas.getFluid(100))
        .inputDust(NaquadahEnriched)
        .outputFluids(ENaquadahSolution.getFluid(1000))
        .EUt(7680)
        .duration(200)
        .save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("clear_e_naquadah_liquid")
        .inputFluids(ENaquadahSolution.getFluid(2000))
        .chancedOutput(dust, PlatinumRaw, 1, 3333)
        .outputFluids(OsmiumSolution.getFluid(350))
        .chancedOutput(dust, EnrichedNaquadahConcentrate, 1, 1111)
        .outputFluids(ClearENaquadahLiquid.getFluid(1000))
        .EUt(7680)
        .duration(200)
        .save(provider);

    DISTILLATION_RECIPES.recipeBuilder("clear_e_naquadah_liquid_from_c_l_e_n_from_c_m_e_n_from_c_h_e_n")
        .inputFluids(ClearENaquadahLiquid.getFluid(1000))
        .outputFluids(ComplicatedNaquadahGas.getFluid(100))
        .outputFluids(ComplicatedLightENaquadah.getFluid(180))
        .outputFluids(ComplicatedMediumENaquadah.getFluid(320))
        .outputFluids(ComplicatedHeavyENaquadah.getFluid(400))
        .EUt(7680)
        .duration(500)
        .save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("heavy_enriched_naquadah")
        .inputFluids(ComplicatedHeavyENaquadah.getFluid(2000))
        .outputFluids(HeavyENaquadah.getFluid(1000))
        .chancedOutput(dust, NaquadriaConcentrate, 1, 1111)
        .chancedOutput(dust, IridiumChloride, 1, 8888)
        .outputFluids(OsmiumSolution.getFluid(350))
        .EUt(7680)
        .duration(200)
        .save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("light_enriched_naquadah")
        .inputFluids(ComplicatedLightENaquadah.getFluid(2000))
        .outputFluids(LightENaquadah.getFluid(1000))
        .chancedOutput(dust, NaquadriaConcentrate, 1, 1111)
        .chancedOutput(dust, IridiumChloride, 1, 8888)
        .outputFluids(OsmiumSolution.getFluid(350))
        .EUt(7680)
        .duration(200)
        .save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("medium_enriched_naquadah")
        .inputFluids(ComplicatedMediumENaquadah.getFluid(2000))
        .outputFluids(MediumENaquadah.getFluid(1000))
        .chancedOutput(dust, NaquadriaConcentrate, 1, 1111)
        .chancedOutput(dust, IridiumChloride, 1, 8888)
        .outputFluids(OsmiumSolution.getFluid(350))
        .EUt(7680)
        .duration(200)
        .save(provider);

    CRACKING_RECIPES.recipeBuilder("rn_cracked_light_e_naquadah")
        .inputFluids(MediumENaquadah.getFluid(1000))
        .inputFluids(Radon.getFluid(400))
        .outputFluids(RnCrackedMediumENaquadah.getFluid(1400))
        .EUt(7680)
        .duration(200)
        .save(provider);

    CRACKING_RECIPES.recipeBuilder("rn_cracked_medium_e_naquadah")
        .inputFluids(LightENaquadah.getFluid(1000))
        .inputFluids(Radon.getFluid(200))
        .outputFluids(RnCrackedLightNaquadah.getFluid(1200))
        .EUt(7680)
        .duration(200)
        .save(provider);

    CRACKING_RECIPES.recipeBuilder("rn_cracked_heavy_e_naquadah")
        .inputFluids(HeavyENaquadah.getFluid(1000))
        .inputFluids(Radon.getFluid(600))
        .outputFluids(RnCrackedHeavyENaquadah.getFluid(1600))
        .EUt(7680)
        .duration(200)
        .save(provider);

    DISTILLATION_RECIPES.recipeBuilder("rn_cracked_light_e_naquadah_from_l_e_n_from_m_e_n_from_h_e_n")
        .inputFluids(RnCrackedLightNaquadah.getFluid(1200))
        .outputFluids(NaquadahGas.getFluid(500))
        .outputFluids(LightENaquadahFuel.getFluid(400))
        .outputFluids(MediumENaquadahFuel.getFluid(170))
        .outputFluids(HeavyENaquadahFuel.getFluid(100))
        .outputFluids(Radon.getFluid(200))
        .EUt(7680)
        .duration(200)
        .save(provider);

    DISTILLATION_RECIPES.recipeBuilder("rn_cracked_medium_e_naquadah_from_l_e_n_from_m_e_n_from_h_e_n")
        .inputFluids(RnCrackedMediumENaquadah.getFluid(1400))
        .outputFluids(NaquadahGas.getFluid(150))
        .outputFluids(LightENaquadahFuel.getFluid(200))
        .outputFluids(MediumENaquadahFuel.getFluid(400))
        .outputFluids(HeavyENaquadahFuel.getFluid(100))
        .outputFluids(Radon.getFluid(400))
        .EUt(7680)
        .duration(200)
        .save(provider);

    DISTILLATION_RECIPES.recipeBuilder("rn_cracked_heavy_e_naquadah_from_l_e_n_from_m_e_n_from_h_e_n")
        .inputFluids(RnCrackedHeavyENaquadah.getFluid(1600))
        .outputFluids(NaquadahGas.getFluid(200))
        .outputFluids(LightENaquadahFuel.getFluid(200))
        .outputFluids(MediumENaquadahFuel.getFluid(200))
        .outputFluids(HeavyENaquadahFuel.getFluid(400))
        .outputFluids(Radon.getFluid(600))
        .EUt(7680)
        .duration(200)
        .save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("naquadria_solution")
        .inputDust(Naquadria)
        .inputFluids(NitrogenDioxide.getFluid(500))
        .inputFluids(SulfuricAcid.getFluid(500))
        .outputFluids(NaquadriaSolution.getFluid(1000))
        .chancedOutput(dust, Lutetium, 1, 1111)
        .chancedOutput(dust, Uranium238, 1, 1111)
        .chancedOutput(dust, EnrichedNaquadahConcentrate, 1, 1111)
        .chancedOutput(dust, Plutonium239, 1, 1111)
        .EUt(7680)
        .duration(100)
        .save(provider);

    LARGE_MIXER_RECIPES.recipeBuilder("hyper_fluid_i")
        .inputFluids(LightNaquadahFuel.getFluid(500))
        .inputFluids(LightENaquadahFuel.getFluid(300))
        .inputFluids(NaquadriaSolution.getFluid(200))
        .inputDust(Rutherfordium)
        .inputFluids(Plutonium244Isotope.getFluid(144))
        .outputFluids(HyperFuelI.getFluid(2000))
        .EUt(1920)
        .duration(200)
        .save(provider);

    LARGE_MIXER_RECIPES.recipeBuilder("hyper_fluid_ii")
        .inputFluids(MediumNaquadahFuel.getFluid(400))
        .inputFluids(MediumENaquadahFuel.getFluid(350))
        .inputFluids(NaquadriaSolution.getFluid(250))
        .inputDust(Dubnium)
        .inputFluids(Curium250.getFluid(144))
        .outputFluids(HyperFuelII.getFluid(2000))
        .EUt(7680)
        .duration(200)
        .save(provider);

    LARGE_MIXER_RECIPES.recipeBuilder("hyper_fluid_iii")
        .inputFluids(HeavyNaquadahFuel.getFluid(300))
        .inputFluids(HeavyENaquadahFuel.getFluid(400))
        .inputFluids(NaquadriaSolution.getFluid(300))
        .inputDust(Adamantium)
        .inputFluids(Fermium258.getFluid(144))
        .outputFluids(HyperFuelIII.getFluid(2000))
        .EUt(30720)
        .duration(200)
        .save(provider);

    LARGE_MIXER_RECIPES.recipeBuilder("hyper_fluid_iv")
        .inputFluids(HyperFuelIII.getFluid(1000))
        .inputDust(Neutronium)
        .inputDust(Taranium)
        .outputFluids(HyperFuelIV.getFluid(3000))
        .EUt(8000000)
        .duration(1)
        .save(provider);
  }

  private static void registerOreTapProcessing(Consumer<FinishedRecipe> provider) {
    registerBaseNaquadahTap(provider);
    registerEnrichedNaquadahTap(provider);
    registerNaquadriaTap(provider);
    registerNaquadahTapRecycling(provider);
  }

  private static void registerBaseNaquadahTap(Consumer<FinishedRecipe> provider) {
    LEACHING_PLANT_RECIPES.recipeBuilder("naquadah_line_naquadah_emulsion")
        .inputDust(NaquadahOxideMixture, 4)
        .inputDust(SodiumHydroxide, 3)
        .inputFluids(SulfuricAcid.getFluid(2000))
        .inputFluids(Water.getFluid(4000))
        .outputDust(GalliumHydroxide, 7)
        .outputFluids(LowQualityNaquadahEmulsion.getFluid(3000))
        .outputFluids(WasteLiquid.getFluid(1000))
        .EUt(1920)
        .duration(300)
        .save(provider);

    CHEMICAL_RECIPES.recipeBuilder("naquadah_line_low_quality_naquadah_solution")
        .inputFluids(LowQualityNaquadahEmulsion.getFluid(3000))
        .inputFluids(NitricAcid.getFluid(2000))
        .outputFluids(LowQualityNaquadahSolution.getFluid(2000))
        .outputFluids(DiluteNitricAcid.getFluid(1000))
        .EUt(1920)
        .duration(240)
        .save(provider);

    LARGE_MIXER_RECIPES.recipeBuilder("naquadah_line_naquadah_extraction_mixture")
        .inputFluids(P507.getFluid(1000))
        .inputFluids(TowEthyl1Hexanol.getFluid(1000))
        .inputFluids(Kerosene.getFluid(2000))
        .outputFluids(NaquadahExtractionMixture.getFluid(4000))
        .EUt(480)
        .duration(160)
        .save(provider);

    CHEMICAL_RECIPES.recipeBuilder("naquadah_line_naquadah_extract")
        .inputFluids(LowQualityNaquadahSolution.getFluid(2000))
        .inputFluids(NaquadahExtractionMixture.getFluid(1000))
        .outputFluids(NaquadahExtract.getFluid(1000))
        .outputFluids(NaquadahMotherLiqour.getFluid(2000))
        .EUt(7680)
        .duration(260)
        .save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("naquadah_line_naquadah_rich_solution")
        .inputFluids(NaquadahExtract.getFluid(1000))
        .inputFluids(Ammonia.getFluid(1000))
        .outputFluids(NaquadahRichSolution.getFluid(1000))
        .outputFluids(NaquadahExtractionMixture.getFluid(750))
        .EUt(7680)
        .duration(220)
        .save(provider);

    DEHYDRATOR_RECIPES.recipeBuilder("naquadah_line_naquadah_concentrate_slurry")
        .inputFluids(NaquadahRichSolution.getFluid(1000))
        .inputFluids(HydrogenPeroxide.getFluid(1000))
        .outputDust(Naquadahine, 3)
        .outputFluids(NaquadahConcentrateSlurry.getFluid(1000))
        .EUt(7680)
        .duration(240)
        .duration(240)
        .save(provider);

    DIGESTION_TREATMENT_RECIPES.recipeBuilder("naquadah_line_naquadah_oxide_solution")
        .inputDust(Naquadahine, 3)
        .inputFluids(NaquadahConcentrateSlurry.getFluid(1000))
        .inputFluids(HydrochloricAcid.getFluid(2000))
        .outputFluids(NaquadahOxideSolution.getFluid(1000))
        .EUt(7680)
        .duration(260)
        .blastFurnaceTemp(2400)
        .save(provider);

    CHEMICAL_RECIPES.recipeBuilder("naquadah_line_acidic_naquadah_concentrate")
        .inputFluids(NaquadahOxideSolution.getFluid(1000))
        .inputFluids(HydrofluoricAcid.getFluid(1000))
        .outputFluids(AcidicNaquadahConcentrate.getFluid(1000))
        .outputFluids(Water.getFluid(1000))
        .EUt(7680)
        .duration(180)
        .save(provider);

    CHEMICAL_RECIPES.recipeBuilder("naquadah_line_naquadah_adamantium_solution")
        .inputFluids(AcidicNaquadahConcentrate.getFluid(1000))
        .inputDust(Adamantine, 5)
        .outputFluids(NaquadahAdamantiumSolution.getFluid(1000))
        .outputFluids(FluorineRichWasteLiquid.getFluid(500))
        .EUt(30720)
        .duration(260)
        .save(provider);

    BLAST_RECIPES.recipeBuilder("naquadah_line_naquadah_concentrate_from_adamantium_solution")
        .inputFluids(NaquadahAdamantiumSolution.getFluid(1000))
        .inputDust(Carbon, 2)
        .outputDust(NaquadahConcentrate, 2)
        .outputDust(Adamantium)
        .outputFluids(CarbonDioxide.getFluid(2000))
        .EUt(30720)
        .duration(300)
        .blastFurnaceTemp(4500)
        .save(provider);
  }

  private static void registerEnrichedNaquadahTap(Consumer<FinishedRecipe> provider) {
    LEACHING_PLANT_RECIPES.recipeBuilder("naquadah_line_impure_enriched_naquadah_solution")
        .inputDust(EnrichedNaquadahOxideMixture, 4)
        .inputDust(TriniumSulphate, 6)
        .inputFluids(SulfuricAcid.getFluid(3000))
        .inputFluids(HydrogenPeroxide.getFluid(1000))
        .outputDust(ConcentratedEnrichedNaquadahSludge, 3)
        .outputFluids(ImpureEnrichedNaquadahSolution.getFluid(2000))
        .outputFluids(EnrichedNaquadahWaste.getFluid(1000))
        .EUt(7680)
        .duration(360)
        .save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("naquadah_line_enriched_naquadah_solution_from_impure")
        .inputFluids(ImpureEnrichedNaquadahSolution.getFluid(2000))
        .inputFluids(Ammonia.getFluid(1000))
        .outputFluids(EnrichedNaquadahSolution.getFluid(1000))
        .outputFluids(EnrichedNaquadahWaste.getFluid(1000))
        .EUt(7680)
        .duration(220)
        .save(provider);

    CHEMICAL_RECIPES.recipeBuilder("naquadah_line_acidic_enriched_naquadah_solution")
        .inputFluids(EnrichedNaquadahSolution.getFluid(1000))
        .inputFluids(SulfuricAcid.getFluid(1000))
        .outputFluids(AcidicEnrichedNaquadahSolution.getFluid(1000))
        .EUt(7680)
        .duration(180)
        .save(provider);

    DEHYDRATOR_RECIPES.recipeBuilder("naquadah_line_enriched_naquadah_sulphate")
        .inputDust(ConcentratedEnrichedNaquadahSludge, 3)
        .inputFluids(AcidicEnrichedNaquadahSolution.getFluid(1000))
        .outputDust(EnrichedNaquadahSulphate, 11)
        .outputFluids(Water.getFluid(1000))
        .EUt(7680)
        .duration(260)
        .save(provider);

    CHEMICAL_RECIPES.recipeBuilder("naquadah_line_enriched_naquadah_chloride")
        .inputDust(EnrichedNaquadahSulphate, 11)
        .inputFluids(HydrochloricAcid.getFluid(2000))
        .outputDust(EnrichedNaquadahChloride, 3)
        .outputFluids(SulfuricAcid.getFluid(1000))
        .EUt(7680)
        .duration(200)
        .save(provider);

    BLAST_RECIPES.recipeBuilder("naquadah_line_enriched_naquadah_concentrate_from_chloride")
        .inputDust(EnrichedNaquadahChloride, 3)
        .inputDust(Lithium, 2)
        .outputDust(EnrichedNaquadahConcentrate, 2)
        .outputDust(LithiumChloride, 4)
        .EUt(30720)
        .duration(320)
        .blastFurnaceTemp(5400)
        .save(provider);

    MIXER_RECIPES.recipeBuilder("naquadah_line_enriched_naquadah_fuel_solution")
        .inputFluids(EnrichedNaquadahSolution.getFluid(900))
        .inputFluids(NaquadahGas.getFluid(100))
        .inputDust(NaquadahEnriched)
        .outputFluids(ENaquadahSolution.getFluid(1000))
        .EUt(7680)
        .duration(200)
        .save(provider);
  }

  private static void registerNaquadriaTap(Consumer<FinishedRecipe> provider) {
    CHEMICAL_RECIPES.recipeBuilder("naquadah_line_low_quality_naquadria_phosphate")
        .inputDust(NaquadriaOxideMixture, 4)
        .inputDust(IndiumPhosphate, 6)
        .inputFluids(PhosphoricAcid.getFluid(2000))
        .outputDust(LowQualityNaquadriaPhosphate, 8)
        .outputFluids(Water.getFluid(1000))
        .EUt(7680)
        .duration(260)
        .save(provider);

    DIGESTION_TREATMENT_RECIPES.recipeBuilder("naquadah_line_impure_naquadria_solution")
        .inputDust(LowQualityNaquadriaPhosphate, 8)
        .inputFluids(HydrofluoricAcid.getFluid(3000))
        .inputFluids(NitricAcid.getFluid(1000))
        .outputDust(IndiumPhosphate, 3)
        .outputFluids(ImpureNaquadriaSolution.getFluid(1000))
        .EUt(30720)
        .duration(300)
        .blastFurnaceTemp(3600)
        .save(provider);

    CHEMICAL_RECIPES.recipeBuilder("naquadah_line_acidic_naquadria_solution")
        .inputFluids(ImpureNaquadriaSolution.getFluid(1000))
        .inputFluids(SulfuricAcid.getFluid(2000))
        .outputFluids(AcidicNaquadriaSolution.getFluid(1000))
        .outputFluids(NaquadriaWaste.getFluid(1000))
        .EUt(30720)
        .duration(240)
        .save(provider);

    LEACHING_PLANT_RECIPES.recipeBuilder("naquadah_line_naquadria_solution_from_acidic")
        .inputFluids(AcidicNaquadriaSolution.getFluid(1000))
        .inputDust(Barium, 2)
        .inputFluids(Water.getFluid(3000))
        .outputDust(Barite, 6)
        .outputFluids(NaquadriaSolution.getFluid(1000))
        .EUt(30720)
        .duration(300)
        .save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("naquadah_line_naquadria_sulphate")
        .inputFluids(NaquadriaSolution.getFluid(2000))
        .inputFluids(HydrogenPeroxide.getFluid(1000))
        .outputDust(NaquadriaSulphate, 11)
        .outputFluids(NaquadriaWaste.getFluid(1000))
        .EUt(30720)
        .duration(260)
        .save(provider);

    CHEMICAL_RECIPES.recipeBuilder("naquadah_line_naquadria_concentrate_from_sulphate")
        .inputDust(NaquadriaSulphate, 11)
        .inputFluids(Hydrogen.getFluid(4000))
        .outputDust(NaquadriaConcentrate)
        .outputFluids(SulfuricAcid.getFluid(2000))
        .EUt(122880)
        .duration(360)
        .save(provider);
  }

  private static void registerNaquadahTapRecycling(Consumer<FinishedRecipe> provider) {
    CENTRIFUGE_RECIPES.recipeBuilder("naquadah_line_mother_liqour_recovery")
        .inputFluids(NaquadahMotherLiqour.getFluid(2000))
        .outputFluids(NaquadahExtractionMixture.getFluid(500))
        .outputFluids(ArsenicSolution.getFluid(500))
        .outputDust(GalliumHydroxide, 2)
        .EUt(1920)
        .duration(180)
        .save(provider);

    ELECTROLYZER_RECIPES.recipeBuilder("naquadah_line_fluorine_waste_recovery")
        .inputFluids(FluorineRichWasteLiquid.getFluid(1000))
        .outputFluids(HydrofluoricAcid.getFluid(500))
        .outputFluids(Fluorine.getFluid(500))
        .outputFluids(WasteLiquid.getFluid(250))
        .EUt(7680)
        .duration(160)
        .save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("naquadah_line_enriched_waste_recovery")
        .inputFluids(EnrichedNaquadahWaste.getFluid(2000))
        .outputFluids(ImpureEnrichedNaquadahSolution.getFluid(500))
        .outputFluids(WasteLiquid.getFluid(1000))
        .chancedOutput(dust, EnrichedNaquadahConcentrate, 1, 1111)
        .EUt(7680)
        .duration(200)
        .save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("naquadah_line_naquadria_waste_recovery")
        .inputFluids(NaquadriaWaste.getFluid(2000))
        .outputFluids(ImpureNaquadriaSolution.getFluid(500))
        .outputFluids(WasteLiquid.getFluid(1000))
        .chancedOutput(dust, NaquadriaConcentrate, 1, 1111)
        .EUt(30720)
        .duration(220)
        .save(provider);

    DEHYDRATOR_RECIPES.recipeBuilder("naquadah_line_arsenic_solution")
        .inputFluids(ArsenicSolution.getFluid(1000))
        .outputDust(Arsenic, 2)
        .outputFluids(Water.getFluid(1000))
        .EUt(480)
        .duration(120)
        .save(provider);
  }
}
