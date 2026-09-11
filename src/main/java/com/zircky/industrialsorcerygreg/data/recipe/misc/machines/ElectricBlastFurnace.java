package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTItems.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGCasings.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGItems.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.*;

import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.ingot;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.ingotHot;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.BLAST_RECIPES;

public class ElectricBlastFurnace {
  public static void init(Consumer<FinishedRecipe> provider) {
    // Ag2O + C -> 2Ag + CO
    BLAST_RECIPES.recipeBuilder("silver_oxide_silver")
        .inputDust(SilverOxide, 3)
        .inputDust(Carbon)
        .outputItems(ingot, Silver, 2)
        .outputFluids(CarbonMonoxide.getFluid(1000))
        .blastFurnaceTemp(1200)
        .duration(80).EUt(VA[MV]).save(provider);

    // GeS2 + 6O -> GeO2 + 2SO2
    BLAST_RECIPES.recipeBuilder("germanium_oxide")
        .inputDust(GermaniumSulfide, 3)
        .inputFluids(Oxygen.getFluid(6000))
        .outputDust(GermaniumOxide, 3)
        .outputFluids(SulfurDioxide.getFluid(2000))
        .blastFurnaceTemp(2500)
        .duration(240).EUt(VA[MV]).save(provider);

    // CdS + WO3 + 3O -> CdWO4 + SO2
    BLAST_RECIPES.recipeBuilder("cadmium_tungstate")
        .inputDust(CadmiumSulfide, 2)
        .inputDust(TungstenTrioxide, 4)
        .inputFluids(Oxygen.getFluid(3000))
        .outputDust(CadmiumTungstate, 6)
        .outputFluids(SulfurDioxide.getFluid(1000))
        .blastFurnaceTemp(2800)
        .duration(320).EUt(VA[MV]).save(provider);

    // CsI + Tm + Tl -> CsITmTl
    BLAST_RECIPES.recipeBuilder("tl_tm_cesium_iodide")
        .inputDust(CesiumIodide)
        .inputDust(Thulium, 1)
        .inputDust(Thallium, 1)
        .outputDust(TlTmCesiumIodide, 4)
        .blastFurnaceTemp(2853)
        .duration(520).EUt(VA[MV]).save(provider);

    // HgCl2 + 2I + 2K -> HgI2 + 2KCl
    BLAST_RECIPES.recipeBuilder("mercury_iodide").duration(240).EUt(720).blastFurnaceTemp(700)
        .inputDust(MercuryChloride, 3)
        .inputDust(Iodine, 2)
        .inputDust(Potassium, 2)
        .outputDust(MercuryIodide, 3)
        .outputDust(RockSalt, 4)
        .save(provider);

    // 4ZnO + CoO -> Zn4CoO5
    BLAST_RECIPES.recipeBuilder("cobalt_zinc_oxide").duration(240).EUt(125).blastFurnaceTemp(500)
        .inputDust(Zincite, 8)
        .inputDust(CobaltOxide, 2)
        .outputDust(CobaltZincOxide, 10)
        .save(provider);

    // 2CoO + Al2O3 -> Al2Co2O5
    BLAST_RECIPES.recipeBuilder("cobalt_aluminate").duration(240).EUt(125).blastFurnaceTemp(500)
        .inputDust(CobaltOxide, 4)
        .inputDust(Alumina, 5)
        .outputDust(CobaltAluminate, 9)
        .save(provider);

    // 20 TiO2 + Sb2O3 + NiO -> NiOÂ·Sb2O3Â·20TiO2
    BLAST_RECIPES.recipeBuilder("titanium_yellow").duration(240).EUt(125).blastFurnaceTemp(600)
        .inputDust(Rutile, 60)
        .inputDust(AntimonyTrioxide, 5)
        .inputDust(Garnierite, 2)
        .outputDust(TitaniumYellow, 67)
        .save(provider);

    // 2 MnO2 + Zn + H2SO4 -> ZnSO4 + Mn2O3 + H2O
    BLAST_RECIPES.recipeBuilder("manganese_iii_oxide").duration(340).EUt(500).blastFurnaceTemp(500)
        .inputDust(Pyrolusite, 6)
        .inputDust(Zinc)
        .inputFluids(SulfuricAcid.getFluid(1000))
        .outputDust(ZincSulfate, 6)
        .outputDust(ManganeseIIIOxide, 5)
        .outputFluids(Steam.getFluid(1000))
        .save(provider);

    // Cu2CH2O5 + 2BaCO3 + 4SiO2 -> 2BaCuSi2O6 + 3CO2 + H2O(lost)
    BLAST_RECIPES.recipeBuilder("han_purple_carbon_dioxide").duration(270).EUt(500).blastFurnaceTemp(1000)
        .inputDust(Malachite, 10)
        .inputDust(BariumCarbonate, 10)
        .inputDust(SiliconDioxide, 12)
        .outputDust(HanPurple, 20)
        .outputFluids(CarbonDioxide.getFluid(3000))
        .save(provider);

    //2 C14H9NO2 + 2 NaClO -> 2 NaCl + 2 H2O + C28H14N2O4
    BLAST_RECIPES.recipeBuilder("indanthrone_blue").duration(240).EUt(1400).blastFurnaceTemp(700)
        .inputDust(Aminoanthraquinone, 52)
        .notConsumableFluid(PotassiumHydroxide.getFluid(1000))
        .inputDust(SodiumHypochlorite, 6)
        .outputDust(Salt, 4)
        .outputDust(IndanthroneBlue, 48)
        .outputFluids(Water.getFluid(2000))
        .save(provider);

    // Ti(NO3)4 + 2NaOH + Li2CO3(H2O) -> 4HNO3 + Li2TiO3 + Na2CO3
    BLAST_RECIPES.recipeBuilder("lithium_titanate").duration(320).EUt(120).blastFurnaceTemp(3100)
        .inputDust(TitaniumNitrate, 17)
        .inputDust(SodiumHydroxide, 6)
        .inputFluids(LithiumCarbonateSolution.getFluid(1000))
        .outputFluids(NitricAcid.getFluid(4000))
        .outputItems(ingot, LithiumTitanate, 6)
        .outputDust(SodaAsh, 6)
        .save(provider);

    BLAST_RECIPES.recipeBuilder("titanium_50").duration(340).EUt(120)
        .blastFurnaceTemp(Titanium.getBlastTemperature())
        .inputFluids(Titanium50Tetrafluoride.getFluid(1000))
        .inputDust(Sodium, 4)
        .outputItems(ingotHot, Titanium50)
        .outputDust(SodiumFluoride, 8)
        .save(provider);

    BLAST_RECIPES.recipeBuilder("hafnium_carbide").duration(350).EUt(120).blastFurnaceTemp(3000)
        .inputDust(Hafnium)
        .inputDust(Graphite)
        .outputDust(HafniumCarbide, 2)
        .save(provider);

    BLAST_RECIPES.recipeBuilder("tantalum_carbide").duration(260).EUt(120).blastFurnaceTemp(2500)
        .inputDust(Tantalum)
        .inputDust(Graphite)
        .outputDust(TantalumCarbide, 2)
        .save(provider);

    // NaSgO3 + Cl + 4C -> SgC + NaCl + 3CO
    BLAST_RECIPES.recipeBuilder("seaborgium_carbide").duration(280).EUt(120).blastFurnaceTemp(3000)
        .inputDust(SodiumSeaborgate, 5)
        .inputFluids(Chlorine.getFluid(1000))
        .inputDust(Carbon, 4)
        .outputDust(SeaborgiumCarbide, 2)
        .outputDust(Salt, 2)
        .outputFluids(CarbonMonoxide.getFluid(3000))
        .save(provider);

    // 12TaC + 3HfC + SgC -> Ta12Hf3SgC16
    BLAST_RECIPES.recipeBuilder("tantalum_hafnium_seaborgium_carbide").duration(340).EUt(120).blastFurnaceTemp(6200)
        .inputDust(TantalumCarbide, 24)
        .inputDust(HafniumCarbide, 6)
        .inputDust(SeaborgiumCarbide, 2)
        .outputItems(ingotHot, TantalumHafniumSeaborgiumCarbide, 32)
        .save(provider);

    //(NH4)2SO4 + CaCO3 -> (NH4)2CO3 + CaSO4
    BLAST_RECIPES.recipeBuilder("ammonium_sulfate_calcite_to_gypsum_ammonium_carbonate").duration(270).EUt(120).blastFurnaceTemp(700)
        .inputFluids(AmmoniumSulfate.getFluid(1000))
        .inputDust(Calcite, 5)
        .outputDust(Gypsum, 6)
        .outputDust(AmmoniumCarbonate, 14)
        .save(provider);

    //KNO3 + Pb -> PbO + KNO2
    BLAST_RECIPES.recipeBuilder("saltpeter_lead_to_potassium_nitrite_massicot")
        .inputDust(Saltpeter, 5)
        .inputDust(Lead)
        .outputDust(PotassiumNitrite, 4)
        .outputDust(Massicot, 2)
        .blastFurnaceTemp(3000)
        .EUt(120)
        .duration(200)
        .save(provider);

    testRecipes(provider);
  }

  private static void testRecipes(Consumer<FinishedRecipe> provider) {
    // Migrated from misc/test recipes.

    // BaSO4 + 2C -> BaS + 2CO2
    BLAST_RECIPES.recipeBuilder("barite_carbon_to_barium_sulfide_carbon_dioxide").duration(220).EUt(120).blastFurnaceTemp(1200)
        .inputDust(Barite, 6)
        .inputDust(Carbon, 2)
        .outputItems(ChemicalHelper.get(dust, BariumSulfide, 2))
        .outputFluids(CarbonDioxide.getFluid(2000))
        .save(provider);


    // 4BaO + 2Al -> 3Ba + Al2BaO4
    BLAST_RECIPES.recipeBuilder("barium_oxide_aluminium_to_barium_barium_aluminate").duration(180).EUt(120).blastFurnaceTemp(700)
        .inputDust(BariumOxide, 8)
        .inputDust(Aluminium, 2)
        .outputItems(ingot, Barium, 3)
        .outputItems(ChemicalHelper.get(dust, BariumAluminate, 7))
        .save(provider);


    // [C3H3N]n -> NaSCN + (solidified)[C3H3N]n
    BLAST_RECIPES.recipeBuilder("polyacrylonitrile_solution_to_acrylic_fibers_sodium_thiocyanate").duration(180).EUt(120).blastFurnaceTemp(600)
        .notConsumable(RAPIDLY_ROTATING_CRUCIBLE.asStack())
        .inputFluids(PolyacrylonitrileSolution.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, AcrylicFibers))
        .outputFluids(SodiumThiocyanate.getFluid(1000))
        .save(provider);


//        // UO2(NO3)2 + H2O -> UO2 + 2HNO3(dil.)
//        BLAST_RECIPES.recipeBuilder("uranyl_nitrate_water_to_uranium_radioactive_dilute_nitric_acid").duration(200).EUt(120).blastFurnaceTemp(500)
//                .inputDust(UranylNitrate, 11)
//                .inputFluids(Water.getFluid(1000))
//                .outputItems(dioxide, UraniumRadioactive, 3)
//                .outputFluids(DiluteNitricAcid.getFluid(2000))
//                .save(provider);


    // C + 2S -> CS2
    BLAST_RECIPES.recipeBuilder("carbon_sulfur_to_carbon_sulfide_dust").duration(120).EUt(120).blastFurnaceTemp(1000)
        .inputDust(Carbon)
        .inputDust(Sulfur, 2)
        .outputFluids(CarbonSulfide.getFluid(1000))
        .chancedOutput(dust, Ash, 1, 1111)
        .save(provider);


    // SrSO4 + Na2CO3 + 2C -> SrCO3 + 2CO2 + Na2S
    BLAST_RECIPES.recipeBuilder("celestine_soda_ash_carbon_to_strontium_carbonate_carbon_dioxide_sodium_sulfide").duration(360).EUt(120).blastFurnaceTemp(1200)
        .inputDust(Celestine, 6)
        .inputDust(SodaAsh, 6)
        .inputDust(Carbon, 2)
        .outputItems(ChemicalHelper.get(dust, StrontiumCarbonate, 5))
        .outputFluids(CarbonDioxide.getFluid(2000))
        .outputDust(SodiumSulfide, 3)
        .save(provider);


    // C4H6O4 + NH3 -> C4H5NO2 + 2H2O
    BLAST_RECIPES.recipeBuilder("succinic_acid_ammonia_to_succinimide_water")
        .inputDust(SuccinicAcid, 14)
        .inputFluids(Ammonia.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, Succinimide, 12))
        .outputFluids(Water.getFluid(2000))
        .EUt(120)
        .duration(500)
        .blastFurnaceTemp(2100)
        .save(provider);

    BLAST_RECIPES.recipeBuilder("dry_graphene_gel_supercritical_co2_to_aerographene_carbon_dioxide").duration(400).EUt(120).blastFurnaceTemp(5000)
        .inputDust(DryGrapheneGel)
        .inputFluids(SupercriticalCO2.getFluid(1000))
        .outputItems(AEROGRAPHENE.asStack())
        .outputFluids(CarbonDioxide.getFluid(1000))
        .save(provider);


    // LiAlSi2O6 = LiAlSi2O6
    BLAST_RECIPES.recipeBuilder("spodumene_to_roasted_spodumene").duration(80).EUt(120).blastFurnaceTemp(1400)
        .inputDust(Spodumene, 4)
        .outputItems(ChemicalHelper.get(dust, RoastedSpodumene))
        .save(provider);


    // KLi3Al4F2O10 + CaO = CaF2 + (KLi3Al4O10)O
    BLAST_RECIPES.recipeBuilder("lepidolite_quicklime_to_roasted_lepidolite_fluorite").duration(160).EUt(120).blastFurnaceTemp(1400)
        .inputDust(Lepidolite, 8)
        .inputDust(Quicklime, 2)
        .outputItems(ChemicalHelper.get(dust, RoastedLepidolite))
        .outputDust(Fluorite, 3)
        .save(provider);


    // MnO2 + sugar(tiny) + H2SO4 -> + CO2 + MnSO4
    // weird, but probably fine
    BLAST_RECIPES.recipeBuilder("pyrolusite_sugar_sulfuric_acid_to_carbon_dioxide_manganese_sulfate").duration(340).EUt(120).blastFurnaceTemp(1500)
        .inputDust(Pyrolusite, 3)
        .inputItems(dustTiny, Sugar)
        .inputFluids(SulfuricAcid.getFluid(1000))
        .outputFluids(CarbonDioxide.getFluid(111))
        .outputItems(ChemicalHelper.get(dust, ManganeseSulfate, 6))
        .save(provider);


    // MnCO3 + sugar(tiny) + H2SO4 -> CO2 + MnSO4
    // weird, but probably fine
    BLAST_RECIPES.recipeBuilder("rhodocrosite_sugar_sulfuric_acid_to_carbon_dioxide_manganese_sulfate").duration(340).EUt(120).blastFurnaceTemp(1500)
        .inputDust(Rhodocrosite, 5)
        .inputItems(dustTiny, Sugar)
        .inputFluids(SulfuricAcid.getFluid(1000))
        .outputFluids(CarbonDioxide.getFluid(1111))
        .outputItems(ChemicalHelper.get(dust, ManganeseSulfate, 6))
        .save(provider);


    // CokePellets -> CO2 + 2Sn + slag
    BLAST_RECIPES.recipeBuilder("cassiterite_coke_pellets_to_carbon_dioxide_tin_tin_slag").duration(260).EUt(120).blastFurnaceTemp(1600)
        .inputDust(CassiteriteCokePellets, 5)
        .outputFluids(CarbonDioxide.getFluid(1000))
        .outputItems(ingot, Tin, 2)
        .outputItems(ChemicalHelper.get(dust, TinSlag))
        .save(provider);


    // ? + C + SiO2 -> CO2 + FeSiO3 + (Nb2O5)(Ta2O5)
    BLAST_RECIPES.recipeBuilder("nb_ta_containing_carbon_silicon_dioxide_to_carbon_dioxide_ferrosilite_niobium_tantalum_oxide").duration(260).EUt(120).blastFurnaceTemp(1600)
        .inputDust(NbTaContaining, 4)
        .inputDust(Carbon)
        .inputDust(SiliconDioxide, 3)
        .outputFluids(CarbonDioxide.getFluid(1000))
        .outputItems(ingot, Ferrosilite, 5)
        .outputItems(ChemicalHelper.get(dust, NiobiumTantalumOxide, 14))
        .save(provider);


    // BaO + O -> BaO2
    BLAST_RECIPES.recipeBuilder("barium_oxide_oxygen_to_barium_peroxide").duration(230).EUt(120).blastFurnaceTemp(2300)
        .inputDust(BariumOxide, 2)
        .inputFluids(Oxygen.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, BariumPeroxide, 3))
        .save(provider);

    BLAST_RECIPES.recipeBuilder("columbite_barium_peroxide_sodium_hydroxide_to_water_fused_columbite_columbite_minor_oxide_residue").duration(340).EUt(120).blastFurnaceTemp(3400)
        .inputDust(Columbite)
        .inputDust(BariumPeroxide, 3)
        .inputDust(SodiumHydroxide, 3)
        .outputFluids(Water.getFluid(500))
        .outputItems(ChemicalHelper.get(dust, FusedColumbite, 9))
        .outputItems(ChemicalHelper.get(dust, ColumbiteMinorOxideResidue, 4))
        .save(provider);


    // MnTa2O6 + BaO2 + NaOH -> 0.5H2O + (Fe2O3)(NaO)Ta2O5 + (BaO)(ZrO2)(TiO2)(SiO2)
    BLAST_RECIPES.recipeBuilder("tantalite_barium_peroxide_sodium_hydroxide_to_water_fused_tantalite_tantalite_minor_oxide_residue").duration(340).EUt(120).blastFurnaceTemp(3400)
        .inputDust(Tantalite, 5)
        .inputDust(BariumPeroxide, 3)
        .inputDust(SodiumHydroxide, 3)
        .outputFluids(Water.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, FusedTantalite, 9))
        .outputItems(ChemicalHelper.get(dust, TantaliteMinorOxideResidue, 4))
        .save(provider);

    BLAST_RECIPES.recipeBuilder("pyrochlore_sulfuric_acid_to_acidic_leached_pyrochlore_ree_th_u_sulfate_solution").duration(350).EUt(480).blastFurnaceTemp(2700)
        .inputDust(Pyrochlore, 6)
        .inputFluids(SulfuricAcid.getFluid(2000))
        .outputItems(ChemicalHelper.get(dust, AcidicLeachedPyrochlore, 6))
        .outputFluids(REEThUSulfateSolution.getFluid(1000))
        .save(provider);


    // NH4VO3 + NaCl + Na2O -> Na3VO4 + NH4Cl
    BLAST_RECIPES.recipeBuilder("ammonium_vanadate_salt_sodium_oxide_to_pure_sodium_vanadate_ammonium_chloride").duration(280).EUt(120).blastFurnaceTemp(700)
        .inputDust(AmmoniumVanadate, 9)
        .inputDust(Salt, 2)
        .inputDust(SodiumOxide, 3)
        .outputItems(ChemicalHelper.get(dust, PureSodiumVanadate, 8))
        .outputFluids(AmmoniumChloride.getFluid(1000))
        .save(provider);


    // (NH4)2CO3 + Ca + NaH + 2O -> 2NH3 + Ca(OH)2 + NaHCO3
    BLAST_RECIPES.recipeBuilder("ammonium_carbonate_sodium_hydride_calcium_oxygen_to_ammonia_sodium_bicarbonate_calcium_hydroxide").duration(270).EUt(120).blastFurnaceTemp(700)
        .inputDust(AmmoniumCarbonate, 14)
        .inputDust(SodiumHydride, 2)
        .inputDust(Calcium)
        .inputFluids(Oxygen.getFluid(2000))
        .outputFluids(Ammonia.getFluid(2000))
        .outputItems(ChemicalHelper.get(dust, SodiumBicarbonate, 6))
        .outputItems(ChemicalHelper.get(dust, CalciumHydroxide, 5))
        .save(provider);


    // LiAlH4 -> LiH + AlH3
    BLAST_RECIPES.recipeBuilder("lithium_aluminium_hydride_to_lithium_hydride_aluminium_hydride").duration(260).EUt(120).blastFurnaceTemp(1600)
        .inputDust(LithiumAluminiumHydride, 6)
        .outputItems(ChemicalHelper.get(dust, LithiumHydride, 2))
        .outputItems(ChemicalHelper.get(dust, AluminiumHydride, 4))
        .save(provider);


    // NbCl5 + LiH + 2H2O2 -> LiNbO4 + 5HCl
    BLAST_RECIPES.recipeBuilder("niobium_chloride_lithium_hydride_hydrogen_peroxide_to_lithium_niobate_hydrochloric_acid").duration(320).EUt(120).blastFurnaceTemp(4500)
        .inputDust(NiobiumChloride, 6)
        .inputDust(LithiumHydride, 2)
        .notConsumable(dust, Hafnium)
        .inputFluids(HydrogenPeroxide.getFluid(2000))
        .outputItems(ingotHot, LithiumNiobate, 6)
        .outputFluids(HydrochloricAcid.getFluid(5000))
        .save(provider);


    // P + I -> InP
    BLAST_RECIPES.recipeBuilder("phosphorus_indium_to_indium_phospide").duration(270).EUt(120).blastFurnaceTemp(4600)
        .inputDust(Phosphorus)
        .inputDust(Indium)
        .outputDust(IndiumPhospide, 2)
        .save(provider);


    // Zn + S -> ZnS
    BLAST_RECIPES.recipeBuilder("zinc_sulfur_to_zinc_sulfide").duration(270).EUt(120).blastFurnaceTemp(4600)
        .inputDust(Zinc)
        .inputDust(Sulfur)
        .outputItems(ChemicalHelper.get(dust, ZincSulfide, 2))
        .save(provider);


    // 3K2MnO4 + 2H2O -> MnO2 + 2KMnO4 + 4KOH
    BLAST_RECIPES.recipeBuilder("potassium_manganate_water_to_pyrolusite_potassium_permanganate_potassium_hydroxide").duration(250).EUt(120).blastFurnaceTemp(720)
        .inputDust(PotassiumManganate, 21)
        .inputFluids(Water.getFluid(2000))
        .outputDust(Pyrolusite, 3)
        .outputItems(ChemicalHelper.get(dust, PotassiumPermanganate, 12))
        .outputFluids(PotassiumHydroxide.getFluid(4000))
        .save(provider);

//        BLAST_RECIPES.recipeBuilder("hydrogen_californium_to_californium_trioxide_water").duration(1800).EUt(120) //2H + 2CfO2 -> Cf2O3 + H2O
//                .blastFurnaceTemp(2500)
//                .inputFluids(Hydrogen.getFluid(2000))
//                .inputItems(Californium.getItemStack(GAEnums.GAOrePrefix.dioxide, 6))
//                .outputItems(ChemicalHelper.get(dust, CaliforniumTrioxide, 5))
//                .outputFluids(Water.getFluid(1000))
//                .save(provider);


    // 3C + 2La2O3 -> 4La + 3CO2
    BLAST_RECIPES.recipeBuilder("carbon_lanthanum_oxide_to_lanthanum_carbon_dioxide")
        .blastFurnaceTemp(2500)
        .inputDust(Carbon, 3)
        .inputDust(LanthanumOxide, 10)
        .outputDust(Lanthanum, 4)
        .outputFluids(CarbonDioxide.getFluid(3000))
        .EUt(480)
        .duration(100)
        .save(provider);


    // 3C + 2Pr2O3 -> 4Pr + 3CO2
    BLAST_RECIPES.recipeBuilder("carbon_praseodymium_oxide_to_praseodymium_carbon_dioxide")
        .blastFurnaceTemp(2500)
        .inputDust(Carbon, 3)
        .inputDust(PraseodymiumOxide, 10)
        .outputDust(Praseodymium, 4)
        .outputFluids(CarbonDioxide.getFluid(3000))
        .EUt(480)
        .duration(100)
        .save(provider);


    // 3C + 2Nd2O3 -> 4Nd + 3CO2
    BLAST_RECIPES.recipeBuilder("carbon_neodymium_oxide_to_neodymium_carbon_dioxide")
        .blastFurnaceTemp(2500)
        .inputDust(Carbon, 3)
        .inputDust(NeodymiumOxide, 10)
        .outputDust(Neodymium, 4)
        .outputFluids(CarbonDioxide.getFluid(3000))
        .EUt(480)
        .duration(100)
        .save(provider);


    // 3C + 2Ce2O3 -> 4Ce + 3CO2
    BLAST_RECIPES.recipeBuilder("carbon_cerium_oxide_to_cerium_carbon_dioxide")
        .blastFurnaceTemp(2500)
        .inputDust(Carbon, 3)
        .inputDust(CeriumOxide, 10)
        .outputDust(Cerium, 4)
        .outputFluids(CarbonDioxide.getFluid(3000))
        .EUt(480)
        .duration(100)
        .save(provider);


    // 3C + 2Sc2O3 -> 4Sc + 3CO2
    BLAST_RECIPES.recipeBuilder("carbon_scandium_oxide_to_scandium_carbon_dioxide")
        .blastFurnaceTemp(2500)
        .inputDust(Carbon, 3)
        .inputDust(ScandiumOxide, 10)
        .outputDust(Scandium, 4)
        .outputFluids(CarbonDioxide.getFluid(3000))
        .EUt(480)
        .duration(100)
        .save(provider);


    // 3C + 2Eu2O3 -> 4Eu + 3CO2
    BLAST_RECIPES.recipeBuilder("carbon_europium_oxide_to_europium_carbon_dioxide")
        .blastFurnaceTemp(2500)
        .inputDust(Carbon, 3)
        .inputDust(EuropiumOxide, 10)
        .outputDust(Europium, 4)
        .outputFluids(CarbonDioxide.getFluid(3000))
        .EUt(480)
        .duration(100)
        .save(provider);


    // 3C + 2Gd2O3 -> 4Gd + 3CO2
    BLAST_RECIPES.recipeBuilder("carbon_gadolinium_oxide_to_gadolinium_carbon_dioxide")
        .blastFurnaceTemp(2500)
        .inputDust(Carbon, 3)
        .inputDust(GadoliniumOxide, 10)
        .outputDust(Gadolinium, 4)
        .outputFluids(CarbonDioxide.getFluid(3000))
        .EUt(480)
        .duration(100)
        .save(provider);


    // 3C + 2Sm2O3 -> 4Sm + 3CO2
    BLAST_RECIPES.recipeBuilder("carbon_samarium_oxide_to_samarium_carbon_dioxide")
        .blastFurnaceTemp(2500)
        .inputDust(Carbon, 3)
        .inputDust(SamariumOxide, 10)
        .outputDust(Samarium, 4)
        .outputFluids(CarbonDioxide.getFluid(3000))
        .EUt(480)
        .duration(100)
        .save(provider);


    // 3C + 2Y2O3 -> 4Y + 3CO2
    BLAST_RECIPES.recipeBuilder("carbon_yttrium_oxide_to_yttrium_carbon_dioxide")
        .blastFurnaceTemp(2500)
        .inputDust(Carbon, 3)
        .inputDust(YttriumOxide, 10)
        .outputDust(Yttrium, 4)
        .outputFluids(CarbonDioxide.getFluid(3000))
        .EUt(480)
        .duration(100)
        .save(provider);


    // 3C + 2Tb2O3 -> 4Tb + 3CO2
    BLAST_RECIPES.recipeBuilder("carbon_terbium_oxide_to_terbium_carbon_dioxide")
        .blastFurnaceTemp(2500)
        .inputDust(Carbon, 3)
        .inputDust(TerbiumOxide, 10)
        .outputDust(Terbium, 4)
        .outputFluids(CarbonDioxide.getFluid(3000))
        .EUt(480)
        .duration(100)
        .save(provider);


    // 3C + 2Dy2O3 -> 4Dy + 3CO2
    BLAST_RECIPES.recipeBuilder("carbon_dysprosium_oxide_to_dysprosium_carbon_dioxide")
        .blastFurnaceTemp(2500)
        .inputDust(Carbon, 3)
        .inputDust(DysprosiumOxide, 10)
        .outputDust(Dysprosium, 4)
        .outputFluids(CarbonDioxide.getFluid(3000))
        .EUt(480)
        .duration(100)
        .save(provider);


    // 3C + 2Ho2O3 -> 4Ho + 3CO2
    BLAST_RECIPES.recipeBuilder("carbon_holmium_oxide_to_holmium_carbon_dioxide")
        .blastFurnaceTemp(2500)
        .inputDust(Carbon, 3)
        .inputDust(HolmiumOxide, 10)
        .outputDust(Holmium, 4)
        .outputFluids(CarbonDioxide.getFluid(3000))
        .EUt(480)
        .duration(100)
        .save(provider);


    // 3C + 2Er2O3 -> 4Er + 3CO2
    BLAST_RECIPES.recipeBuilder("carbon_erbium_oxide_to_erbium_carbon_dioxide")
        .blastFurnaceTemp(2500)
        .inputDust(Carbon, 3)
        .inputDust(ErbiumOxide, 10)
        .outputDust(Erbium, 4)
        .outputFluids(CarbonDioxide.getFluid(3000))
        .EUt(480)
        .duration(100)
        .save(provider);


    // 3C + 2Tm2O3 -> 4Tm + 3CO2
    BLAST_RECIPES.recipeBuilder("carbon_thulium_oxide_to_thulium_carbon_dioxide")
        .blastFurnaceTemp(2500)
        .inputDust(Carbon, 3)
        .inputDust(ThuliumOxide, 10)
        .outputDust(Thulium, 4)
        .outputFluids(CarbonDioxide.getFluid(3000))
        .EUt(480)
        .duration(100)
        .save(provider);


    // 3C + Yt2O3 -> 4Yt + 3CO2
    BLAST_RECIPES.recipeBuilder("carbon_ytterbium_oxide_to_ytterbium_carbon_dioxide")
        .blastFurnaceTemp(2500)
        .inputDust(Carbon, 3)
        .inputDust(YtterbiumOxide, 10)
        .outputDust(Ytterbium, 4)
        .outputFluids(CarbonDioxide.getFluid(3000))
        .EUt(480)
        .duration(100)
        .save(provider);


    // 3C + 2Lu2O3 -> 4Lu + 3CO2
    BLAST_RECIPES.recipeBuilder("carbon_lutetium_oxide_to_lutetium_carbon_dioxide")
        .blastFurnaceTemp(2500)
        .inputDust(Carbon, 3)
        .inputDust(LutetiumOxide, 10)
        .outputDust(Lutetium, 4)
        .outputFluids(CarbonDioxide.getFluid(3000))
        .EUt(480)
        .duration(100)
        .save(provider);


    // ? + ~7O -> 3? + MoO3
    BLAST_RECIPES.recipeBuilder("molybdenum_concentrate_oxygen_to_molybdenum_flue_molybdenum_trioxide")
        .inputDust(MolybdenumConcentrate, 4)
        .inputFluids(Oxygen.getFluid(7250))
        .blastFurnaceTemp(8550)
        .EUt(120)
        .duration(340)
        .outputFluids(MolybdenumFlue.getFluid(3000))
        .outputItems(ChemicalHelper.get(dust, MolybdenumTrioxide, 4))
        .save(provider);


    // 6H + MoO3 -> Mo + 3H2O(steam)
    BLAST_RECIPES.recipeBuilder("hydrogen_molybdenum_trioxide_to_molybdenum_steam")
        .inputFluids(Hydrogen.getFluid(6000))
        .inputDust(MolybdenumTrioxide, 4)
        .outputDust(Molybdenum)
        .outputFluids(Steam.getFluid(3000))
        .blastFurnaceTemp(1000)
        .EUt(120)
        .duration(200)
        .save(provider);


    // CaC2 + N2 -> CaCN2 + C
    BLAST_RECIPES.recipeBuilder("calcium_carbide_nitrogen_to_calcium_cyanamide_carbon")
        .inputDust(CalciumCarbide, 3)
        .inputFluids(Nitrogen.getFluid(2000))
        .outputItems(ChemicalHelper.get(dust, CalciumCyanamide, 4))
        .outputDust(Carbon)
        .blastFurnaceTemp(2000)
        .EUt(120)
        .duration(360)
        .save(provider);


    // CuFeS2 + SiO2 + 5O -> Cu(EIC) + FeSiO3 + 2SO2
    BLAST_RECIPES.recipeBuilder("chalcopyrite_silicon_dioxide_oxygen_to_electrically_impure_copper_ferrosilite_sulfur_dioxide").duration(240).EUt(120).blastFurnaceTemp(1500)
        .inputItems(crushedPurified, Chalcopyrite)
        .inputDust(SiliconDioxide, 3)
        .inputFluids(Oxygen.getFluid(5000))
        .outputDust(ElectricallyImpureCopper)
        .outputDust(Ferrosilite, 5)
        .outputFluids(SulfurDioxide.getFluid(2000))
        .save(provider);


    // TeSe + 2Na2CO3 + 4O -> TeO2SeO2(Na2CO3)2
    BLAST_RECIPES.recipeBuilder("anodic_slime_soda_ash_oxygen_to_dust_selenite_tellurite_mix").duration(320).EUt(120).blastFurnaceTemp(2100)
        .inputDust(AnodicSlime)
        .inputDust(SodaAsh, 12)
        .inputFluids(Oxygen.getFluid(4000))
        .chancedOutput(dust, PreciousMetal, 1, 5555)
        .outputFluids(SeleniteTelluriteMix.getFluid(1000))
        .save(provider);


    // [2Pb(NO3)2 + 9Ca] + Ta2O5 + Sc2O3 + 3O -> 2Pb(ScTa)O3 + 9CaO + 4NO2
    BLAST_RECIPES.recipeBuilder("lead_nitrate_calcium_mixture_tantalum_oxide_scandium_oxide_oxygen_to_lead_scandium_tantalate_quicklime_nitrogen_dioxide").duration(350).EUt(120).blastFurnaceTemp(1350)
        .inputDust(LeadNitrateCalciumMixture, 18)
        .inputDust(TantalumOxide, 7)
        .inputDust(ScandiumOxide, 5)
        .inputFluids(Oxygen.getFluid(3000))
        .outputItems(ChemicalHelper.get(dust, LeadScandiumTantalate, 12))
        .outputDust(Quicklime, 18)
        .outputFluids(NitrogenDioxide.getFluid(4000))
        .save(provider);


    // Fr + Cs + 2Cd + 6Br -> FrCsCd2Br6
    BLAST_RECIPES.recipeBuilder("francium_caesium_cadmium_bromine_to_francium_caesium_cadmium_bromide").duration(350).EUt(120).blastFurnaceTemp(2200)
        .inputDust(Francium)
        .inputDust(Caesium)
        .inputDust(Cadmium, 2)
        .inputFluids(Bromine.getFluid(6000))
        .outputItems(ChemicalHelper.get(dust, FranciumCaesiumCadmiumBromide, 10))
        .save(provider);


    // K + NaTcO4 -> KTcO4 + Na
    BLAST_RECIPES.recipeBuilder("potassium_sodium_pertechnetate_to_potassium_pertechnate_sodium").duration(280).EUt(120).blastFurnaceTemp(6500)
        .inputDust(Potassium)
        .inputDust(SodiumPertechnetate, 6)
        .outputItems(ChemicalHelper.get(dust, PotassiumPertechnate, 6))
        .outputDust(Sodium)
        .save(provider);


    // La2O3 + 2CaO + 2K2MnO4 -> 2LaCaMnO3 + 2K2O + 5O
    BLAST_RECIPES.recipeBuilder("lanthanum_oxide_quicklime_potassium_manganate_to_lanthanum_calcium_manganate_potash_oxygen").duration(380).EUt(120).blastFurnaceTemp(900)
        .inputDust(LanthanumOxide, 5)
        .inputDust(Quicklime, 4)
        .inputDust(PotassiumManganate, 14)
        .outputItems(ChemicalHelper.get(dust, LanthanumCalciumManganate, 12))
        .outputDust(Potash, 6)
        .outputFluids(Oxygen.getFluid(5000))
        .save(provider);


    // Na2O4Ru + 2H -> RuO2 + 2NaOH
    BLAST_RECIPES.recipeBuilder("sodium_ruthenate_hydrogen_to_ruthenium_dioxide_sodium_hydroxide").duration(270).EUt(120).blastFurnaceTemp(1250)
        .inputDust(SodiumRuthenate, 7)
        .circuitMeta(2)
        .inputFluids(Hydrogen.getFluid(2000))
        .outputDust(RutheniumDioxide, 3)
        .outputDust(SodiumHydroxide, 6)
        .save(provider);

//        BLAST_RECIPES.recipeBuilder("tungsten_ga_enums_to_thorium_doped_tungsten").duration(500).EUt(120).blastFurnaceTemp(2400)
//                .inputDust(Tungsten, 9)
//                .inputItems(GAEnums.GAOrePrefix.oxide, Thorium)
//                .outputItems(ingot, ThoriumDopedTungsten, 10)
//                .save(provider);

    BLAST_RECIPES.recipeBuilder("quartzite_alumina_to_alumino_silicate_glass_tube").duration(270).EUt(120).blastFurnaceTemp(1800)
        .inputDust(Quartzite)
        .inputDust(Alumina, 5)
        .notConsumable(SHAPE_MOLD_CYLINDER.asItem())
        .outputItems(ALUMINO_SILICATE_GLASS_TUBE.asStack())
        .save(provider);


    // 2V + 5Na2CO3 + 4H2O -> 5CO + 2NaVO3 + 8NaOH
    BLAST_RECIPES.recipeBuilder("vanadium_soda_ash_water_to_carbon_monoxide_sodium_metavanadate_sodium_hydroxide").duration(180).EUt(120).blastFurnaceTemp(650)
        .inputDust(Vanadium, 2)
        .inputDust(SodaAsh, 30)
        .inputFluids(Water.getFluid(4000))
        .outputFluids(CarbonMonoxide.getFluid(5000))
        .outputItems(ChemicalHelper.get(dust, SodiumMetavanadate, 10))
        .outputDust(SodiumHydroxide, 24)
        .save(provider);


    // Y2O3 + Eu2O3 + V2O5 + 6H -> 2YEuVO4 + 3H2O
    BLAST_RECIPES.recipeBuilder("yttrium_oxide_europium_oxide_vanadium_oxide_hydrogen_to_yttrium_europium_vanadate_steam").duration(340).EUt(120).blastFurnaceTemp(1200)
        .inputDust(YttriumOxide, 5)
        .inputDust(EuropiumOxide, 5)
        .inputDust(VanadiumOxide, 7)
        .inputFluids(Hydrogen.getFluid(6000))
        .outputItems(ChemicalHelper.get(dust, YttriumEuropiumVanadate, 14))
        .outputFluids(Steam.getFluid(3000))
        .save(provider);


    // 2SrO + Eu2O3 + 2Al2O3 + 6H -> 2SrEuAl2O4 + 3H2O
    BLAST_RECIPES.recipeBuilder("strontium_oxide_europium_oxide_alumina_hydrogen_to_strontium_europium_aluminate_steam").duration(340).EUt(120).blastFurnaceTemp(1200)
        .inputDust(StrontiumOxide, 4)
        .inputDust(EuropiumOxide, 5)
        .inputDust(Alumina, 10)
        .inputFluids(Hydrogen.getFluid(6000))
        .outputItems(ChemicalHelper.get(dust, StrontiumEuropiumAluminate, 16))
        .outputFluids(Steam.getFluid(3000))
        .save(provider);


    // Ac(C2O4)2 + 3NaH + 13Na + 4CCl4 -> AcH3 + 16NaCl + 8CO
    BLAST_RECIPES.recipeBuilder("actinium_oxalate_sodium_hydride_sodium_carbon_tetrachloride_to_actinium_hydride_salt_carbon_dioxide").duration(530).EUt(120)
        .blastFurnaceTemp(10700)
        .inputDust(ActiniumOxalate, 13)
        .inputDust(SodiumHydride, 6)
        .inputDust(Sodium, 13)
        .inputFluids(CarbonTetrachloride.getFluid(4000))
        .outputItems(ChemicalHelper.get(dust, ActiniumHydride, 4))
        .outputDust(Salt, 32)
        .outputFluids(CarbonDioxide.getFluid(8000))
        .save(provider);


    // 3Rb + 3Cs + La2(C60)2 -> La2Cs3Rb3(C60)2
    BLAST_RECIPES.recipeBuilder("lanthanum_embedded_fullerene_rubidium_caesium_to_fullerene_superconductive").duration(680).EUt(120).blastFurnaceTemp(2400)
        .inputDust(LanthanumEmbeddedFullerene, 4)
        .inputDust(Rubidium, 3)
        .inputDust(Caesium, 3)
        .outputItems(ChemicalHelper.get(dust, FullereneSuperconductive, 10))
        .save(provider);


// 6NaOH + 4S -> 2Na2S + Na2S2O3 + 3H2O
    BLAST_RECIPES.recipeBuilder("sodium_hydroxide_sulfur_to_sodium_sulfide_sodium_thiosulfate_steam").duration(210).EUt(120).blastFurnaceTemp(4500)
        .inputDust(SodiumHydroxide, 18)
        .inputDust(Sulfur, 4)
        .outputDust(SodiumSulfide, 6)
        .outputItems(ChemicalHelper.get(dust, SodiumThiosulfate, 7))
        .outputFluids(Steam.getFluid(3000))
        .save(provider);


    // C2F4 + 2C4H4S2Li2Se2 -> C10H8S4Se4 + 4LiF
    BLAST_RECIPES.recipeBuilder("lithiumthiinediselenide_tetrafluoroethylene_to_lithium_fluoride_bets").duration(7920).EUt(120).blastFurnaceTemp(3500)
        .inputDust(Lithiumthiinediselenide, 28)
        .inputFluids(Tetrafluoroethylene.getFluid(1000))
        .notConsumable(ChemicalHelper.get(dust, TitaniumCyclopentadienyl))
        .outputDust(LithiumFluoride, 8)
        .outputItems(ChemicalHelper.get(dust, BETS, 26))
        .save(provider);


    // This is correct
    // > ok
    BLAST_RECIPES.recipeBuilder("bets_ammonium_perrhenate_to_ammonia_bets_perrhenate").duration(20250).EUt(120).blastFurnaceTemp(5000)
        .inputDust(BETS)
        .inputFluids(AmmoniumPerrhenate.getFluid(1000))
        .outputFluids(Ammonia.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, BETSPerrhenate))
        .save(provider);


    // 4B + 3C -> B4C3
    BLAST_RECIPES.recipeBuilder("boron_carbon_to_boron_carbide").duration(550).EUt(120).blastFurnaceTemp(4000)
        .inputDust(Boron, 4)
        .inputDust(Carbon, 3)
        .outputItems(ChemicalHelper.get(dust, BoronCarbide, 7))
        .save(provider);


    // Fr4B4C7 + 2[3At + Ho + Th + Cn + Fl] = B4C7Fr4At6Ho2Th2Fl2Cn2
    BLAST_RECIPES.recipeBuilder("boron_francium_carbide_mixed_astatide_salts_to_borocarbide").duration(15000).EUt(120).blastFurnaceTemp(11300)
        .inputDust(BoronFranciumCarbide, 15)
        .inputDust(MixedAstatideSalts, 14)
        .outputItems(ChemicalHelper.get(dust, Borocarbide, 29))
        .save(provider);


    // Na2O4Ru + Na2SgO4 + 2SrCl2 -> 4NaCl + RuSgSr2O8
    BLAST_RECIPES.recipeBuilder("sodium_ruthenate_sodium_seaborgate_strontium_chloride_to_salt_strontium_superconductor").duration(1360).EUt(120).blastFurnaceTemp(4500)
        .inputDust(SodiumRuthenate, 7)
        .inputDust(SodiumSeaborgate, 5)
        .inputDust(StrontiumChloride, 6)
        .outputDust(Salt, 8)
        .outputItems(ChemicalHelper.get(dust, StrontiumSuperconductor, 12))
        .save(provider);


    // Ir + 2O -> IrO2
    BLAST_RECIPES.recipeBuilder("iridium_oxygen_to_iridium_dioxide").duration(280).EUt(120).blastFurnaceTemp(700)
        .notConsumable(dust, Salt)
        .inputDust(Iridium)
        .inputFluids(Oxygen.getFluid(2000))
        .outputDust(IridiumDioxide, 3)
        .save(provider);


    // Hs + 4Cl -> HsCl4
    BLAST_RECIPES.recipeBuilder("metastable_hassium_chlorine_to_hassium_chloride").duration(930).EUt(120).blastFurnaceTemp(12000)
        .inputDust(MetastableHassium)
        .inputFluids(Chlorine.getFluid(4000))
        .outputItems(ChemicalHelper.get(dust, HassiumChloride, 5))
        .save(provider);


    // Re + 5Cl -> ReCl5
    BLAST_RECIPES.recipeBuilder("rhenium_chlorine_to_rhenium_chloride").duration(930).EUt(120).blastFurnaceTemp(12500)
        .inputDust(Rhenium)
        .inputFluids(Chlorine.getFluid(5000))
        .outputItems(ChemicalHelper.get(dust, RheniumChloride, 6))
        .save(provider);

    BLAST_RECIPES.recipeBuilder("oxidized_residues_hydrogen_to_metallic_residues_dilute_hydrofluoric_acid")
        .inputDust(OxidizedResidues, 10)
        .inputFluids(Hydrogen.getFluid(60000))
        .outputItems(ChemicalHelper.get(dust, MetallicResidues))
        .outputFluids(DiluteHydrofluoricAcid.getFluid(40000))
        .duration(1600)
        .EUt(2000)
        .blastFurnaceTemp(3500)
        .save(provider);

    BLAST_RECIPES.recipeBuilder("heavy_oxidized_residues_hydrogen_to_heavy_metallic_residues_dilute_hydrofluoric_acid")
        .inputDust(HeavyOxidizedResidues, 10)
        .inputFluids(Hydrogen.getFluid(60000))
        .outputItems(ChemicalHelper.get(dust, HeavyMetallicResidues))
        .outputFluids(DiluteHydrofluoricAcid.getFluid(40000))
        .duration(1600)
        .EUt(2000)
        .blastFurnaceTemp(3500)
        .save(provider);


    // [UO2(NO3)2 + Th(NO3)4] + 2H -> [UO2 + Th(NO3)4] + 2HNO3
    BLAST_RECIPES.recipeBuilder("uranyl_thorium_nitrate_hydrogen_to_uranium_oxide_thorium_nitrate_nitric_acid").duration(200).EUt(120).blastFurnaceTemp(500)
        .inputDust(UranylThoriumNitrate, 26)
        .inputFluids(Hydrogen.getFluid(2000))
        .outputItems(ChemicalHelper.get(dust, UraniumOxideThoriumNitrate, 18))
        .outputFluids(NitricAcid.getFluid(2000))
        .save(provider);


//        // UO2 + C -> U + CO2
//        BLAST_RECIPES.recipeBuilder("uranium_radioactive_carbon_to_uranium_radioactive_carbon_dioxide").duration(150).EUt(120).blastFurnaceTemp(1000)
//                .inputItems(dioxide, UraniumRadioactive)
//                .inputDust(Carbon)
//                .outputDust(UraniumRadioactive)
//                .outputFluids(CarbonDioxide.getFluid(1000))
//                .save(provider);


//        // ThO + CaCl2 -> Th + CaO + 2Cl
//        BLAST_RECIPES.recipeBuilder("thorium_calcium_chloride_to_thorium_radioactive_quicklime_chlorine").duration(150).EUt(120).blastFurnaceTemp(1000)
//                .inputItems(oxide, Thorium, 1)
//                .inputDust(CalciumChloride, 3)
//                .outputDust(ThoriumRadioactive)
//                .outputDust(Quicklime, 2)
//                .outputFluids(Chlorine.getFluid(2000))
//                .save(provider);


    // Fe3O4V + C = 3Fe + (VO)C(TiO2) + CO
    BLAST_RECIPES.recipeBuilder("vanadium_magnetite_carbon_to_iron_vanadium_slag_carbon_monoxide").duration(220).EUt(120).blastFurnaceTemp(1500)
        .inputDust(VanadiumMagnetite, 4)
        .inputDust(Carbon)
        .outputItems(ingot, Iron, 3)
        .outputItems(ChemicalHelper.get(dust, VanadiumSlag, 5))
        .outputFluids(CarbonMonoxide.getFluid(1000))
        .save(provider);


    // 2VO + 3Na2CO3 = 2Na3VO4 + 3CO
    BLAST_RECIPES.recipeBuilder("vanadium_slag_soda_ash_to_sodium_vanadate_carbon_monoxide").duration(150).EUt(120).blastFurnaceTemp(700)
        .inputDust(VanadiumSlag, 4)
        .inputDust(SodaAsh, 18)
        .outputItems(ChemicalHelper.get(dust, SodiumVanadate, 16))
        .outputFluids(CarbonMonoxide.getFluid(3000))
        .save(provider);


    // V2O5 + 2Al + C = Al2O3 + 2V + CO2
    BLAST_RECIPES.recipeBuilder("vanadium_oxide_aluminium_carbon_to_alumina_vanadium_carbon_dioxide").duration(200).EUt(120).blastFurnaceTemp(1200)
        .inputDust(VanadiumOxide, 7)
        .inputDust(Aluminium, 2)
        .inputDust(Carbon)
        .outputItems(ChemicalHelper.get(dust, Alumina, 5))
        .outputDust(Vanadium, 2)
        .outputFluids(CarbonDioxide.getFluid(1000))
        .save(provider);


    // GROWTH MEDIUM ===============================================================================================

    // 2CaO + 5C -> CO2 + 2CaC2
    BLAST_RECIPES.recipeBuilder("quicklime_carbon_to_carbon_monoxide_calcium_carbide")
        .inputDust(Quicklime, 4)
        .inputDust(Carbon, 5)
        .outputFluids(CarbonMonoxide.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, CalciumCarbide, 6))
        .blastFurnaceTemp(2500)
        .EUt(120)
        .duration(300)
        .save(provider);


    // CaC2 + 2H2O -> Ca(OH)2 + C2H2
    BLAST_RECIPES.recipeBuilder("calcium_carbide_steam_to_calcium_hydroxide_acetylene")
        .inputDust(CalciumCarbide, 3)
        .inputFluids(Steam.getFluid(2000))
        .outputItems(ChemicalHelper.get(dust, CalciumHydroxide, 5))
        .outputFluids(Acetylene.getFluid(1000))
        .blastFurnaceTemp(2300)
        .EUt(120)
        .duration(200)
        .save(provider);

    BLAST_RECIPES.recipeBuilder("silica_alumina_gel_to_zeolite_sieving_pellets")
        .inputDust(SilicaAluminaGel)
        .outputItems(ChemicalHelper.get(dust, ZeoliteSievingPellets))
        .blastFurnaceTemp(4500)
        .EUt(120)
        .duration(400)
        .save(provider);


    // 2[ZnS + C + H2O] + 6O = 2ZnO + Zinc Residual Slag + Zinc Exhaust [Contains: Dark Ash + CO2 + SO2]
    BLAST_RECIPES.recipeBuilder("zinc_coke_pellets_oxygen_to_zincite_zinc_residual_slag_zinc_exhaust_mixture").duration(120).EUt(120).blastFurnaceTemp(1500)
        .inputDust(ZincCokePellets, 6)
        .inputFluids(Oxygen.getFluid(6000))
        .outputDust(Zincite, 4)
        .outputItems(ChemicalHelper.get(dust, ZincResidualSlag))
        .outputFluids(ZincExhaustMixture.getFluid(1000))
        .save(provider);


    // In(OH)3 + 3H = In + 3H2O
    BLAST_RECIPES.recipeBuilder("indium_hydroxide_hydrogen_to_indium_steam").duration(240).EUt(120)
        .blastFurnaceTemp(4500)
        .inputDust(IndiumHydroxide, 7)
        .inputFluids(Hydrogen.getFluid(3000))
        .outputDust(Indium)
        .outputFluids(Steam.getFluid(3000))
        .save(provider);


    // 2TlCl + Zn = 2Tl + ZnCl2
    BLAST_RECIPES.recipeBuilder("thallium_chloride_zinc_to_thallium_zinc_chloride").duration(240).EUt(120).blastFurnaceTemp(750)
        .inputDust(ThalliumChloride, 4)
        .inputDust(Zinc)
        .outputDust(Thallium, 2)
        .outputItems(ChemicalHelper.get(dust, ZincChloride, 3))
        .save(provider);


    // GeO2 + 4H = Ge + 2H2O
    BLAST_RECIPES.recipeBuilder("germanium_oxide_hydrogen_to_germanium_water").duration(220).EUt(120).blastFurnaceTemp(1300)
        .inputDust(GermaniumOxide, 3)
        .inputFluids(Hydrogen.getFluid(4000))
        .outputDust(Germanium)
        .outputFluids(Water.getFluid(2000))
        .save(provider);


    // ZrCl4 + 2Mg = Zr + 2MgCl2
    BLAST_RECIPES.recipeBuilder("zirconium_tetrachloride_magnesium_to_zirconium_magnesium_chloride").duration(300).EUt(120).blastFurnaceTemp(2500)
        .inputDust(ZirconiumTetrachloride, 5)
        .inputDust(Magnesium, 2)
        .outputDust(Zirconium)
        .outputDust(MagnesiumChloride, 6)
        .save(provider);


    // HfCl4 + 2Mg = Hf + 2MgCl2
    BLAST_RECIPES.recipeBuilder("hafnium_chloride_magnesium_to_hafnium_magnesium_chloride").duration(300).EUt(120).blastFurnaceTemp(2500)
        .inputDust(HafniumChloride, 5)
        .inputDust(Magnesium, 2)
        .outputDust(Hafnium)
        .outputDust(MagnesiumChloride, 6)
        .save(provider);


    // C20H22N2O2 -> 2C3H8 + C14H6N2O2
    BLAST_RECIPES.recipeBuilder("pre_zylon_to_propane_zylon")
        .inputDust(PreZylon)
        .outputFluids(Propane.getFluid(2000))
        .outputDust(Zylon)
        .EUt(120)
        .duration(16000)
        .blastFurnaceTemp(10000)
        .save(provider);
  }

}
