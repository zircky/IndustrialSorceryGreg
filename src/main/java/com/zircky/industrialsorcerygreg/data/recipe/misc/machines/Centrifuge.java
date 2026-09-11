package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTItems.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGCasings.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGItems.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.*;

import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGItems.SEPARATION_ELECTROMAGNET;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.CENTRIFUGE_RECIPES;

public class Centrifuge {
  public static void init(Consumer<FinishedRecipe> provider) {
    CENTRIFUGE_RECIPES.recipeBuilder("heavy_quarks").duration(200).EUt(VA[UHV])
        .inputFluids(QuarkGluon.getFluid(FluidStorageKeys.PLASMA, 1000 * 5))
        .notConsumable(SEPARATION_ELECTROMAGNET.asItem())
        .outputFluids(HeavyQuarks.getFluid(750 * 5))
        .outputFluids(Gluons.getFluid(500 * 5))
        .outputFluids(LightQuarks.getFluid(250 * 5))
        .save(provider);

    // [Na2SiCl6 + 0.25 Fe2O3] + 1.5 HCl -> SiCl4 + 2 NaCl + 0.5 FeCl3 + 0.75 H2O
    CENTRIFUGE_RECIPES.recipeBuilder("silicon_chloride_iron_chloride").duration(320).EUt(500)
        .inputFluids(HydrochloricAcid.getFluid(1500))
        .inputDust(ApatiteSolidResidue, 11)
        .outputDust(SiliconChloride, 5)
        .outputDust(Salt, 2)
        .outputFluids(IronChloride.getFluid(500))
        .outputFluids(Water.getFluid(750))
        .save(provider);

    // [Na2SiF6 + 0.25 Fe2O3] + 3.5 HCl -> H2SiF6 + 2 NaCl + 0.5 FeCl3 + 0.75 H2O
    CENTRIFUGE_RECIPES.recipeBuilder("hydrochloric_acid_fluoroapatite_solid_residue_fluorosilicic_acid_to_salt_iron_chloride_water").duration(320).EUt(500)
        .inputFluids(HydrochloricAcid.getFluid(3500))
        .inputDust(FluoroapatiteSolidResidue, 11)
        .outputFluids(FluorosilicicAcid.getFluid(1000))
        .outputDust(Salt, 2)
        .outputFluids(IronChloride.getFluid(500))
        .outputFluids(Water.getFluid(750))
        .save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("carbon_12_and_carbon_13")
        .inputFluids(Carbon.getFluid(10_000))
        .outputFluids(Carbon12.getFluid(9893), Carbon13.getFluid(107))
        .duration(340).EUt(VA[EV]).save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("nitrogen_14_and_nitrogen_15")
        .inputFluids(Nitrogen.getFluid(100_000))
        .outputFluids(Nitrogen14.getFluid(99636), Nitrogen15.getFluid(364))
        .duration(340).EUt(VA[EV]).save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("helium_cno_separation")
        .inputFluids(HeliumCNO.getFluid(800))
        .outputFluids(Helium.getFluid(640), CNOcatalyst.getFluid(160))
        .duration(150).EUt(VA[IV]).save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("flyb_separation")
        .inputFluids(FlYb.getFluid(1000))
        .outputFluids(MetastableFlerovium.getFluid(288), Ytterbium178.getFluid(288))
        .duration(290).EUt(VA[EV]).save(provider);

    // treat this as 1 full mol, not 1 dust
    CENTRIFUGE_RECIPES.recipeBuilder("barium_sulfate_solution_to_barite_water")
        .inputFluids(BariumSulfateSolution.getFluid(1000))
        .outputDust(Barite, 6)
        .outputFluids(Water.getFluid(1000))
        .EUt(480)
        .duration(320)
        .save(provider);

    // 2[NH4] -> NH4 + [0.5H2O + NH4 + H4]
    CENTRIFUGE_RECIPES.recipeBuilder("ammonia_rich_mix_to_ammonia_purified_nitrogen_mix").duration(120).EUt(120)
        .inputFluids(AmmoniaRichMix.getFluid(2000))
        .outputFluids(Ammonia.getFluid(1000))
        .outputFluids(PurifiedNitrogenMix.getFluid(1000))
        .save(provider);

    // 2Al2BaO4 -> BaO + Al2O3
    CENTRIFUGE_RECIPES.recipeBuilder("barium_aluminate_to_barium_oxide_alumina").duration(300).EUt(30)
        .inputDust(BariumAluminate, 14)
        .outputItems(ChemicalHelper.get(dust, BariumOxide, 2))
        .outputItems(ChemicalHelper.get(dust, Alumina, 5))
        .save(provider);

    // (H20)CaCO3 -> H2O + CaCO3
    CENTRIFUGE_RECIPES.recipeBuilder("calcium_carbonate_solution_to_calcite_water").duration(200).EUt(30)
        .inputFluids(CalciumCarbonateSolution.getFluid(1000))
        .outputDust(Calcite, 1)
        .outputFluids(Water.getFluid(1000))
        .save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("witherite_to_barium_carbonate_dust").duration(50).EUt(80)
        .inputDust(Witherite, 5)
        .outputItems(ChemicalHelper.get(dust, BariumCarbonate, 5))
        .chancedOutput(dust, Calcite, 1, 1000)
        .chancedOutput(dust, Galena, 1, 777)
        .chancedOutput(dust, Barite, 1, 444)
        .save(provider);

    // CaCO3, CaSO4(H2O)2
    CENTRIFUGE_RECIPES.recipeBuilder("calcium_salts_to_calcite_gypsum").duration(200).EUt(120)
        .inputDust(CalciumSalts, 13)
        .outputDust(Calcite, 5)
        .outputDust(Gypsum, 8)
        .save(provider);


    // NaCl, NaF
    CENTRIFUGE_RECIPES.recipeBuilder("sodium_salts_to_salt_dust").duration(200).EUt(120)
        .inputDust(SodiumSalts, 2)
        .outputDust(Salt, 2)
        .chancedOutput(dust, SodiumFluoride, 1, 88)
        .save(provider);


    // KCl, MgSO4, K2SO4
    CENTRIFUGE_RECIPES.recipeBuilder("potassium_magnesium_salts_to_rock_salt_magnesium_sulfate_potassium_sulfate_dust").duration(200).EUt(120)
        .inputDust(PotassiumMagnesiumSalts, 15)
        .outputDust(RockSalt, 2)
        .outputItems(ChemicalHelper.get(dust, MagnesiumSulfate, 6))
        .outputItems(ChemicalHelper.get(dust, PotassiumSulfate, 7))
        .chancedOutput(dust, PotassiumFluoride, 1, 88)
        .save(provider);


    // CaCO3, CO2, MgO
    CENTRIFUGE_RECIPES.recipeBuilder("calcium_magnesium_salts_to_calcite_dust_carbon_dioxide_magnesia").duration(200).EUt(120)
        .inputDust(CalciumMagnesiumSalts, 8)
        .outputDust(Calcite, 5)
        .chancedOutput(dust, StrontiumCarbonate, 5, 40)
        .outputFluids(CarbonDioxide.getFluid(1000))
        .outputDust(Magnesia, 2)
        .save(provider);


    // Step 1 recovery (8 nuggets per PM)
    CENTRIFUGE_RECIPES.recipeBuilder("gold_alloy_to_copper_dust")
        .inputDust(GoldAlloy, 4)
        .outputDust(Copper, 3)
        .chancedOutput(dust, Gold, 1, 4444)
        .duration(500)
        .EUt(30)
        .save(provider);


    // 6slag -> ash + ?
    CENTRIFUGE_RECIPES.recipeBuilder("tin_slag_to_dark_ash_nb_ta_containing").duration(180).EUt(120)
        .inputDust(TinSlag, 6)
        .outputDust(DarkAsh)
        .outputDust(NbTaContaining, 4)
        .save(provider);


    CENTRIFUGE_RECIPES.recipeBuilder("columbite_minor_oxide_residue_to_barium_oxide_dust").duration(260).EUt(120)
        .inputDust(ColumbiteMinorOxideResidue, 4)
        .outputItems(ChemicalHelper.get(dust, BariumOxide, 2))
        .chancedOutput(dust, Cassiterite, 2, 1000)
        .chancedOutput(dust, TungstenTrioxide, 4, 1000)
        .chancedOutput(dust, Alumina, 5, 1000)
        .save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("tantalite_minor_oxide_residue_to_barium_oxide_dust").duration(260).EUt(480)
        .inputDust(TantaliteMinorOxideResidue, 4)
        .outputItems(ChemicalHelper.get(dust, BariumOxide, 2))
        .chancedOutput(dust, CubicZirconia, 3, 1000)
        .chancedOutput(dust, Rutile, 3, 1000)
        .chancedOutput(dust, SiliconDioxide, 3, 1000)
        .save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("alkaline_earth_sulfate_solution_to_water_barite_gypsum_celestine_dust").duration(250).EUt(1920)
        .inputFluids(AlkalineEarthSulfateSolution.getFluid(4000))
        .outputFluids(Water.getFluid(4000))
        .outputDust(Barite, 3)
        .outputDust(Gypsum, 8)
        .outputDust(Celestine, 6)
        .chancedOutput(dust, Radium, 1, 5000)
        .save(provider);


    // 2NH4F -> NH3 + NH4HF2
    CENTRIFUGE_RECIPES.recipeBuilder("ammonium_fluoride_to_ammonia_ammonium_bifluoride").duration(340).EUt(120)
        .inputFluids(AmmoniumFluoride.getFluid(2000))
        .outputFluids(Ammonia.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, AmmoniumBifluoride, 8))
        .save(provider);


    // [NH4HF2 + H2O] -> NH3 + 2HF + H2O
    CENTRIFUGE_RECIPES.recipeBuilder("ammonium_bifluoride_solution_to_ammonia_hydrofluoric_acid_water").duration(260).EUt(120)
        .inputFluids(AmmoniumBifluorideSolution.getFluid(2000))
        .outputFluids(Ammonia.getFluid(1000))
        .outputFluids(HydrofluoricAcid.getFluid(2000))
        .outputFluids(Water.getFluid(1000))
        .save(provider);


    // H2SO4(NaCl)3(H2O)3Cl2 -> 3NaCl + H2SO4Br(H2O)Cl2 + 2H2O
    CENTRIFUGE_RECIPES.recipeBuilder("acidic_salt_water_to_salt_sulfuric_bromine_solution_debrominated_water")
        .inputFluids(AcidicSaltWater.getFluid(6000))
        .outputDust(Salt, 6)
        .outputFluids(SulfuricBromineSolution.getFluid(2000))
        .outputFluids(DebrominatedWater.getFluid(2000))
        .EUt(480)
        .duration(180)
        .save(provider);


    // H2SO4Br(H2O)2Cl2 -> H2SO4 + H2O + 2Cl + Br(H2O)
    CENTRIFUGE_RECIPES.recipeBuilder("hot_vapour_mixture_to_sulfuric_acid_debrominated_water_chlorine_damp_bromine")
        .inputFluids(HotVapourMixture.getFluid(3000))
        .outputFluids(SulfuricAcid.getFluid(1000))
        .outputFluids(DebrominatedWater.getFluid(1000))
        .outputFluids(Chlorine.getFluid(2000))
        .outputFluids(DampBromine.getFluid(1000))
        .EUt(480)
        .duration(180)
        .save(provider);


    CENTRIFUGE_RECIPES.recipeBuilder("sodium_hydroxide_solution_to_water_sodium_hydroxide").duration(100).EUt(30)
        .inputFluids(SodiumHydroxideSolution.getFluid(1000))
        .outputFluids(Water.getFluid(1000))
        .outputDust(SodiumHydroxide, 3)
        .save(provider);


    // 2 [REECl3 + 3 H2O] + C16H35O4P(cat.) -> [REE2O3](sep.) + 6 HCl + 3 H2O
    CENTRIFUGE_RECIPES.recipeBuilder("rare_earth_chlorides_solution_diethylhexyl_phosphoric_acid_to_la_nd_oxides_solution_sm_gd_oxides_solution_tb_ho_oxides_solution_er_lu_oxides_solution_hydrochloric_acid")
        .inputFluids(RareEarthChloridesSolution.getFluid(6000))
        .inputFluids(DiethylhexylPhosphoricAcid.getFluid(10))
        .outputFluids(LaNdOxidesSolution.getFluid(250))
        .outputFluids(SmGdOxidesSolution.getFluid(250))
        .outputFluids(TbHoOxidesSolution.getFluid(250))
        .outputFluids(ErLuOxidesSolution.getFluid(250))
        .outputFluids(HydrochloricAcid.getFluid(6000))
        .EUt(480)
        .duration(600)
        .save(provider);


    // 4LaPrNdCeOx -> La2O3 + Pr2O3 + Nd2O3 + Ce2O3 (each 43% +2.75%)
    CENTRIFUGE_RECIPES.recipeBuilder("la_nd_oxides_solution_to_dust")
        .inputFluids(LaNdOxidesSolution.getFluid(4000))
        .chancedOutput(dust, LanthanumOxide, 5, 4300)
        .chancedOutput(dust, PraseodymiumOxide, 5, 4300)
        .chancedOutput(dust, NeodymiumOxide, 5, 4300)
        .chancedOutput(dust, CeriumOxide, 5, 4300)
        .EUt(480)
        .duration(220)
        .save(provider);


    // 4ScEuGdSmOx -> Sc2O3 + Eu2O3 + Gd2O3 + Sm2O3 (each 43% +2.75%)
    CENTRIFUGE_RECIPES.recipeBuilder("sm_gd_oxides_solution_to_dust")
        .inputFluids(SmGdOxidesSolution.getFluid(4000))
        .chancedOutput(dust, ScandiumOxide, 5, 4300)
        .chancedOutput(dust, EuropiumOxide, 5, 4300)
        .chancedOutput(dust, GadoliniumOxide, 5, 4300)
        .chancedOutput(dust, SamariumOxide, 5, 4300)
        .EUt(480)
        .duration(220)
        .save(provider);


    // 4YTbDyHoOx -> Y2O3 + Tb2O3 + Dy2O3 + Ho2O3 (each 43% +2.75%)
    CENTRIFUGE_RECIPES.recipeBuilder("tb_ho_oxides_solution_to_dust")
        .inputFluids(TbHoOxidesSolution.getFluid(4000))
        .chancedOutput(dust, YttriumOxide, 5, 4300)
        .chancedOutput(dust, TerbiumOxide, 5, 4300)
        .chancedOutput(dust, DysprosiumOxide, 5, 4300)
        .chancedOutput(dust, HolmiumOxide, 5, 4300)
        .EUt(480)
        .duration(220)
        .save(provider);


    // 4ErTmYtLuOx -> Er2O3 + Tm2O3 + Yt2O3 + Lu2O3 (each 43% +2.75%)
    CENTRIFUGE_RECIPES.recipeBuilder("er_lu_oxides_solution_to_dust")
        .inputFluids(ErLuOxidesSolution.getFluid(4000))
        .chancedOutput(dust, ErbiumOxide, 5, 4300)
        .chancedOutput(dust, ThuliumOxide, 5, 4300)
        .chancedOutput(dust, YtterbiumOxide, 5, 4300)
        .chancedOutput(dust, LutetiumOxide, 5, 4300)
        .EUt(480)
        .duration(220)
        .save(provider);


// 8? -> CaCl2 + CuCl2 + PbCl2 + BiCl3 + 8FeCl2
    CENTRIFUGE_RECIPES.recipeBuilder("chloride_leached_solution_to_calcium_chloride_copper_chloride_lead_chloride_bismuth_chloride_iron2_chloride")
        .inputFluids(ChlorideLeachedSolution.getFluid(8000))
        .outputDust(CalciumChloride, 3)
        .outputItems(ChemicalHelper.get(dust, CopperChloride, 3))
        .outputItems(ChemicalHelper.get(dust, LeadChloride, 3))
        .outputItems(ChemicalHelper.get(dust, BismuthChloride, 4))
        .outputFluids(Iron2Chloride.getFluid(8000))
        .EUt(480)
        .duration(200)
        .save(provider);


    // ? + RSM -> ? + ?(20%) + Re
    CENTRIFUGE_RECIPES.recipeBuilder("platinum_salt_rhenium_separation_mixture_to_dust_rhenium_scrubbed_solution_rhenium_separation_mixture")
        .inputDust(PlatinumSalt, 2)
        .inputFluids(RheniumSeparationMixture.getFluid(250))
        .chancedOutput(dust, RefinedPlatinumSalt, 2, 9500)
        .outputFluids(RheniumScrubbedSolution.getFluid(250))
        .outputFluids(RheniumSeparationMixture.getFluid(200))
        .EUt(7680)
        .duration(50)
        .save(provider);


// ? + 0.2? -> ? + Re
    CENTRIFUGE_RECIPES.recipeBuilder("leached_columbite_rhenium_separation_mixture_to_purified_columbite_rhenium_scrubbed_solution_rhenium_separation_mixture")
        .inputDust(LeachedColumbite, 17)
        .inputFluids(RheniumSeparationMixture.getFluid(250))
        .outputItems(ChemicalHelper.get(dust, PurifiedColumbite))
        .outputFluids(RheniumScrubbedSolution.getFluid(250))
        .outputFluids(RheniumSeparationMixture.getFluid(200))
        .EUt(7680)
        .duration(50)
        .save(provider);


    //  + 0.2? -> ? + Re
    CENTRIFUGE_RECIPES.recipeBuilder("leached_pyrochlore_rhenium_separation_mixture_to_purified_pyrochlore_rhenium_scrubbed_solution_rhenium_separation_mixture")
        .inputDust(LeachedPyrochlore)
        .inputFluids(RheniumSeparationMixture.getFluid(250))
        .outputItems(ChemicalHelper.get(dust, PurifiedPyrochlore))
        .outputFluids(RheniumScrubbedSolution.getFluid(250))
        .outputFluids(RheniumSeparationMixture.getFluid(200))
        .EUt(7680)
        .duration(50)
        .save(provider);

// [C2BaF6O6S2 + 3H2O + Hg] -> C2BaF6O6S2 + 3H2O + Hg
    CENTRIFUGE_RECIPES.recipeBuilder("barium_triflate_solution_to_barium_triflate_mercury_water").duration(320).EUt(1920)
        .inputFluids(BariumTriflateSolution.getFluid(3000))
        .outputItems(ChemicalHelper.get(dust, BariumTriflate, 17))
        .outputFluids(Mercury.getFluid(1000))
        .outputFluids(Water.getFluid(3000))
        .save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("dirty_hexafluorosilicic_acid_to_dilute_hexafluorosilicic_acid_stone_residue")
        .inputFluids(DirtyHexafluorosilicicAcid.getFluid(3000))
        .outputFluids(DiluteHexafluorosilicicAcid.getFluid(3000))
        .outputItems(ChemicalHelper.get(dust, StoneResidue, 12))
        .duration(40)
        .EUt(100)
        .save(provider);


    CENTRIFUGE_RECIPES.recipeBuilder("distilled_water_partially_oxidized_residues_to_oxidized_residual_solution_inert_residues")
        .inputFluids(DistilledWater.getFluid(10000))
        .inputDust(PartiallyOxidizedResidues, 10)
        .outputFluids(OxidizedResidualSolution.getFluid(10000))
        .outputItems(ChemicalHelper.get(dust, InertResidues))
        .duration(200)
        .EUt(100)
        .save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("metallic_residues_to_diamagnetic_residues_paramagnetic_residues_ferromagnetic_residues_uncommon_residues")
        .inputDust(MetallicResidues, 10)
        .notConsumable(SEPARATION_ELECTROMAGNET)
        .outputItems(ChemicalHelper.get(dust, DiamagneticResidues, 3))
        .outputItems(ChemicalHelper.get(dust, ParamagneticResidues, 3))
        .outputItems(ChemicalHelper.get(dust, FerromagneticResidues, 3))
        .outputItems(ChemicalHelper.get(dust, UncommonResidues))
        .duration(80)
        .EUt(8000)
        .save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("heavy_metallic_residues_to_heavy_diamagnetic_residues_heavy_paramagnetic_residues_heavy_ferromagnetic_residues_exotic_heavy_residues")
        .inputDust(HeavyMetallicResidues, 10)
        .notConsumable(SEPARATION_ELECTROMAGNET)
        .outputItems(ChemicalHelper.get(dust, HeavyDiamagneticResidues, 3))
        .outputItems(ChemicalHelper.get(dust, HeavyParamagneticResidues, 3))
        .outputItems(ChemicalHelper.get(dust, HeavyFerromagneticResidues, 3))
        .outputItems(ChemicalHelper.get(dust, ExoticHeavyResidues))
        .duration(80)
        .EUt(8000)
        .save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("ferromagnetic_residues_to_dust")
        .inputDust(FerromagneticResidues, 6)
        .chancedOutput(dust, Iron, 1, 2500)
        .chancedOutput(dust, Nickel, 1, 2500)
        .chancedOutput(dust, Cobalt, 1, 2500)
        .duration(100)
        .EUt(3000)
        .save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("diamagnetic_residues_to_dust")
        .inputDust(DiamagneticResidues, 6)
        .chancedOutput(dust, Calcium, 1, 2500)
        .chancedOutput(dust, Zinc, 1, 2500)
        .chancedOutput(dust, Copper, 1, 2500)
        .chancedOutput(dust, Gallium, 1, 2500)
        .chancedOutput(dust, Beryllium, 1, 2500)
        .chancedOutput(dust, Tin, 1, 2500)
        .duration(100)
        .EUt(3000)
        .save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("paramagnetic_residues_to_dust")
        .inputDust(ParamagneticResidues, 6)
        .chancedOutput(dust, Sodium, 1, 2500)
        .chancedOutput(dust, Potassium, 1, 2500)
        .chancedOutput(dust, Magnesium, 1, 2500)
        .chancedOutput(dust, Titanium, 1, 2500)
        .chancedOutput(dust, Vanadium, 1, 2500)
        .chancedOutput(dust, Manganese, 1, 2500)
        .duration(100)
        .EUt(3000)
        .save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("heavy_paramagnetic_residues_to_thorium_uranium238_dust")
        .inputDust(HeavyParamagneticResidues, 6)
        .chancedOutput(ChemicalHelper.get(dust, Thorium, 1), 2500)
        .chancedOutput(ChemicalHelper.get(dust, Uranium238, 1), 2500)
        .chancedOutput(dust, Tungsten, 1, 2500)
        .chancedOutput(dust, Hafnium, 1, 2500)
        .chancedOutput(dust, Tantalum, 1, 2500)
        .chancedOutput(dust, Thallium, 1, 2500)
        .duration(120)
        .EUt(3000)
        .save(provider);


    CENTRIFUGE_RECIPES.recipeBuilder("heavy_diamagnetic_residues_to_dust_mercury")
        .inputDust(HeavyDiamagneticResidues, 6)
        .chancedOutput(dust, Lead, 1, 2500)
        .chancedOutput(dust, Cadmium, 1, 2500)
        .chancedOutput(dust, Indium, 1, 2500)
        .chancedOutput(dust, Gold, 1, 2500)
        .chancedOutput(dust, Bismuth, 1, 2500)
        .outputFluids(Mercury.getFluid(36))
        .duration(120)
        .EUt(3000)
        .save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("heavy_ferromagnetic_residues_to_dust")
        .inputDust(HeavyFerromagneticResidues, 6)
        .chancedOutput(dust, Dysprosium, 1, 2500)
        .duration(120)
        .EUt(3000)
        .save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("dusty_liquid_helium3_to_taranium_enriched_l_helium3_taranium_semidepleted_l_helium3_taranium_depleted_l_helium3")
        .inputFluids(DustyLiquidHelium3.getFluid(FluidStorageKeys.PLASMA, 1000))
        .outputFluids(TaraniumEnrichedLHelium3.getFluid(100))
        .outputFluids(TaraniumSemidepletedLHelium3.getFluid(300))
        .outputFluids(TaraniumDepletedLHelium3.getFluid(600))
        .duration(400)
        .EUt(3000)
        .save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("plasma_taranium_rich_dusty_helium_to_plasma_taranium_rich_helium4_plasma_hydrogen_plasma_taranium_depleted_helium")
        .inputFluids(TaraniumRichDustyHelium.getFluid(FluidStorageKeys.PLASMA, 3000))
        .notConsumable(SEPARATION_ELECTROMAGNET.asStack())
        .outputFluids(TaraniumRichHelium4.getFluid(FluidStorageKeys.PLASMA, 500))
        .outputFluids(Hydrogen.getFluid(FluidStorageKeys.PLASMA, 2000))
        .outputFluids(TaraniumDepletedHelium.getFluid(FluidStorageKeys.PLASMA, 500))
        .duration(80)
        .EUt(2000)
        .save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("plasma_taranium_depleted_helium_to_plasma_helium3_clean_inert_residues")
        .inputFluids(TaraniumDepletedHelium.getFluid(FluidStorageKeys.PLASMA, 10000))
        .notConsumable(SEPARATION_ELECTROMAGNET.asStack())
        .outputFluids(Helium3.getFluid(FluidStorageKeys.PLASMA, 5000))
        .outputItems(ChemicalHelper.get(dust, CleanInertResidues, 2))
        .duration(160)
        .EUt(2000)
        .save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("taranium_semidepleted_l_helium3_to_taranium_enriched_l_helium3_taranium_depleted_l_helium3")
        .inputFluids(TaraniumSemidepletedLHelium3.getFluid(1000))
        .outputFluids(TaraniumEnrichedLHelium3.getFluid(100))
        .outputFluids(TaraniumDepletedLHelium3.getFluid(900))
        .duration(400)
        .EUt(3000)
        .save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("taranium_rich_helium4_to_taranium_taranium_poor_liquid_helium")
        .inputFluids(TaraniumRichHelium4.getFluid(400))
        .outputDust(Taranium, 4)
        .outputFluids(TaraniumPoorLiquidHelium.getFluid(400))
        .duration(20)
        .EUt(8000)
        .save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("stone_to_dust")
        .inputDust(Stone, 3)
        .chancedOutput(dust, Taranium, 1, 1000)
        .chancedOutput(dust, Taranium, 1, 1000)
        .chancedOutput(dust, Taranium, 1, 1000)
        .duration(50)
        .EUt(VA[UXV])
        .save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("taranium_poor_liquid_helium_mix_to_liquid_helium_dusty_liquid_helium3")
        .inputFluids(TaraniumPoorLiquidHeliumMix.getFluid(1200))
        .outputFluids(Helium.getFluid(FluidStorageKeys.LIQUID, 1000))
        .outputFluids(DustyLiquidHelium3.getFluid(200))
        .duration(80)
        .EUt(8000)
        .save(provider);


    CENTRIFUGE_RECIPES.recipeBuilder("used_drilling_mud_to_drilling_mud_gravel").duration(120).EUt(30)
        .inputFluids(UsedDrillingMud.getFluid(1000))
        .outputFluids(DrillingMud.getFluid(990))
        .outputItems(Blocks.GRAVEL.asItem())
        .save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("meat_to_blood")
        .inputDust(Meat)
        .outputFluids(Blood.getFluid(1000))
        .EUt(30)
        .duration(50)
        .save(provider);


    CENTRIFUGE_RECIPES.recipeBuilder("blood_to_blood_cells_blood_plasma")
        .inputFluids(Blood.getFluid(1000))
        .outputFluids(BloodCells.getFluid(500))
        .outputFluids(BloodPlasma.getFluid(500))
        .EUt(480)
        .duration(200)
        .save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("blood_plasma_to_catalase_bfgf_egf")
        .inputFluids(BloodPlasma.getFluid(1000))
        .outputFluids(Catalase.getFluid(200))
        .outputFluids(BFGF.getFluid(200))
        .outputFluids(EGF.getFluid(200))
        .EUt(480)
        .duration(50)
        .save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("plasma_helium_to_free_alpha_gas_free_electron_gas").duration(40).EUt(100000)
        .notConsumable(SEPARATION_ELECTROMAGNET.asStack())
        .inputFluids(Helium.getFluid(FluidStorageKeys.PLASMA, 1000))
        .outputFluids(FreeAlphaGas.getFluid(1000))
        .outputFluids(FreeElectronGas.getFluid(1000))
        .save(provider);


    // Zinc Exhaust = Dark Ash + Zinc Flue Dust + CO2 + SO2
    CENTRIFUGE_RECIPES.recipeBuilder("zinc_exhaust_mixture_to_dust_carbon_dioxide_sulfur_dioxide").duration(140).EUt(120)
        .inputFluids(ZincExhaustMixture.getFluid(1000))
        .chancedOutput(dust, ZincFlue, 1, 4500)
        .chancedOutput(dust, DarkAsh, 1, 2500)
        .outputFluids(CarbonDioxide.getFluid(1000))
        .outputFluids(SulfurDioxide.getFluid(1000))
        .save(provider);

// Zinc Amalgam [Contains: Zn + Hg] = Zn + Hg
    CENTRIFUGE_RECIPES.recipeBuilder("zinc_amalgam_to_mercury_dust").duration(220).EUt(120)
        .inputFluids(ZincAmalgam.getFluid(1000))
        .outputFluids(Mercury.getFluid(1000))
        .chancedOutput(dust, Zinc, 1, 6500)
        .save(provider);


    // 9 Cadmium Thallium Liquor [Contains: Cd + Tl + H2SO4] = Thallium Residue [Contains: 2 Tl] + 9 Cadmium Sulfate Solution [Contains: CdSO4]
    CENTRIFUGE_RECIPES.recipeBuilder("cadmium_thallium_liquor_to_thallium_residue_cadmium_sulfate_solution").duration(110).EUt(1920)
        .inputFluids(CadmiumThalliumLiquor.getFluid(9000))
        .outputItems(ChemicalHelper.get(dust, ThalliumResidue))
        .outputFluids(CadmiumSulfateSolution.getFluid(9000))
        .save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("ortho_xylene_zeolite_mixture_to_zeolite_para_xylene")
        .inputFluids(OrthoXyleneZeoliteMixture.getFluid(1000))
        .outputDust(Zeolite)
        .outputFluids(ParaXylene.getFluid(1000))
        .EUt(480)
        .duration(100)
        .save(provider);

    // Migrated from misc/test recipes.


    // TODO migrated disabled: unresolved old test symbol `NUCLEAR_WASTE_REACTIVE_NONMETAL`.
    //         CENTRIFUGE_RECIPES.recipeBuilder("nuclear_waste_reactive_nonmetal_to_krypton_xenon_radon_dust").EUt(32).duration(300)
    //                 .inputItems(NUCLEAR_WASTE_REACTIVE_NONMETAL.asStack(9))
    //                 .outputFluids(Krypton.getFluid(250 * 9))
    //                 .outputFluids(Xenon.getFluid(500 * 9))
    //                 .outputFluids(Radon.getFluid(9000))
    //                 .chancedOutput(dust, Selenium, 2, 6250)
    //                 .chancedOutput(dust, Bromine, 2, 6250)
    //                 .chancedOutput(dust, Iodine, 2, 6250)
    //                 .save(provider);
    //
    //
    //

//    // 2ThU + O -> 0.5ThO + Th(20%) + U(20%)
//    CENTRIFUGE_RECIPES.recipeBuilder("th_u_sludge_oxygen_to_dust_uranium_radioactive_thorium")
//        .inputDust(ThUSludge, 4)
//        .inputFluids(Oxygen.getFluid(500))
//        .chancedOutput(dust, Thorium, 1, 222)
//        .chancedOutput(ChemicalHelper.get(dust, UraniumRadioactive), 222, 150)
//        .outputItems(oxide, Thorium)
//        .EUt(480)
//        .duration(250)
//        .save(provider);
  }
}
