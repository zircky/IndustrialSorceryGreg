package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

import static com.gregtechceu.gtceu.common.data.GTItems.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGCasings.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGItems.*;

import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.zircky.industrialsorcerygreg.ISGCore;
import com.zircky.industrialsorcerygreg.api.ISGValues;
import com.zircky.industrialsorcerygreg.common.data.ISGItems;
import com.zircky.industrialsorcerygreg.common.data.ISGMaterials;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.industrialsorcerygreg.api.ISGValues.SECONDS;
import static com.zircky.industrialsorcerygreg.common.data.ISGItems.NANOTOME;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.*;

public class MixerRecipes {
  public static void init(Consumer<FinishedRecipe> provider) {
    large(provider);
    MIXER_RECIPES.recipeBuilder(ISGCore.id("lead_platinum"))
        .inputDust(GTMaterials.Lead, 5)
        .inputDust(GTMaterials.Platinum, 1)
        .circuitMeta(5)
        .outputDust(ISGMaterials.LeadPlatinum, 6)
        .EUt(VA[EV])
        .duration(1600)
        .save(provider);

    MIXER_RECIPES.recipeBuilder("mica_based_pulp")
        .inputDust(GTMaterials.Mica, 3)
        .inputDust(GTMaterials.RawRubber, 2)
        .outputItems(ISGItems.MICA_BASED_PULP, 5)
        .EUt(8)
        .duration(300)
        .save(provider);

    MIXER_RECIPES.recipeBuilder("heavy_quark_enriched_mix").duration(100).EUt(3250000)
        .inputFluids(HeavyQuarks.getFluid(750))
        .inputFluids(LightQuarks.getFluid(250))
        .outputFluids(HeavyQuarkEnrichedMix.getFluid(1000))
        .save(provider);

    MIXER_RECIPES.recipeBuilder("scandium_titanium50_mix").duration(130).EUt(450000)
        .inputFluids(Titanium50.getFluid(144))
        .inputFluids(Scandium.getFluid(144))
        .outputFluids(ScandiumTitanium50Mix.getFluid(288))
        .save(provider);

    MIXER_RECIPES.recipeBuilder("radon_radium_mix").duration(130).EUt(450000)
        .inputFluids(Radon.getFluid(1000))
        .inputFluids(Radium.getFluid(144))
        .outputFluids(RadonRadiumMix.getFluid(288))
        .save(provider);

    MIXER_RECIPES.recipeBuilder("polycyclic_aromatic_mix")
        .inputFluids(Anthracene.getFluid(1000))
        .inputDust(Tetracene, 2)
        .outputItems(PolycyclicAromaticMix, 3)
        .duration(240).EUt(7680).save(provider);

    MIXER_RECIPES.recipeBuilder("yellow_limonite_from_silicon_dioxide_pyrolusite").duration(320).EUt(32)
        .inputDust(YellowLimonite, 2)
        .inputItems(dustTiny, SiliconDioxide)
        .inputItems(dustTiny, Pyrolusite)
        .outputDust(RawSienna, 2)
        .save(provider);

    MIXER_RECIPES.recipeBuilder("cyan_indigo_dye").duration(270).EUt(250)
        .inputDust(Indigo)
        .inputDust(Tetrabromoindigo)
        .outputDust(CyanIndigoDye, 2)
        .save(provider);

    // CO + Li2O2(H2O) -> Li2CO3(H2O)
    MIXER_RECIPES.recipeBuilder("lithium_carbonate_solution").duration(240).EUt(30)
        .inputFluids(CarbonMonoxide.getFluid(1000))
        .inputFluids(LithiumPeroxideSolution.getFluid(1000))
        .outputFluids(LithiumCarbonateSolution.getFluid(1000))
        .save(provider);

    MIXER_RECIPES.recipeBuilder("oganeson_breeding_base")
        .inputFluids(Titanium50.getFluid(288), Californium252.getFluid(2000))
        .outputFluids(OganesonBreedingBase.getFluid(4000))
        .duration(SECONDS * 6).EUt(VA[IV]).save(provider);

    // Ni + Al -> NiAl
    MIXER_RECIPES.recipeBuilder("nickel_aluminium").duration(150).EUt(120)
        .inputDust(Nickel)
        .inputDust(Aluminium)
        .outputDust(NiAlCatalyst, 2)
        .save(provider);

    MIXER_RECIPES.recipeBuilder("graphene_nanotube_mix").duration(240).EUt(122880)
        .inputItems(foil, Graphene)
        .inputDust(CarbonNanotubes)
        .outputItems(GrapheneNanotubeMix)
        .save(provider);

    MIXER_RECIPES.recipeBuilder("cycloparaphenylene").duration(200).EUt(983040)
        .notConsumable(NANOTOME)
        .inputItems(GrapheneAlignedCNT)
        .outputItems(foil, Graphene)
        .outputFluids(Cycloparaphenylene.getFluid(250))
        .save(provider);

    // NH4C(H2O) + H2O -> NH4C(H2O)2
    MIXER_RECIPES.recipeBuilder("titanium_water_rich_nitrogen_mix_oxidised_nitrogen_mix").duration(60).EUt(120)
        .notConsumableDust(FeCrOCatalyst)
        .notConsumable(rodLong, Titanium)
        .inputFluids(Water.getFluid(1000))
        .inputFluids(RichNitrogenMix.getFluid(1000))
        .outputFluids(OxidisedNitrogenMix.getFluid(2000))
        .save(provider);

    MIXER_RECIPES.recipeBuilder("garnierite_alumina_to_ni_al_o").duration(100).EUt(30)
        .inputDust(Garnierite, 2)
        .inputDust(Alumina, 5)
        .outputDust(NiAlOCatalyst, 7)
        .save(provider);

    MIXER_RECIPES.recipeBuilder("iron_chromium_trioxide_fe_cr_o").duration(100).EUt(30)
        .inputDust(Iron)
        .inputDust(ChromiumTrioxide, 4)
        .outputDust(FeCrOCatalyst, 5)
        .save(provider);

    testRecipes(provider);
  }

  private static void large(Consumer<FinishedRecipe> provider) {
    LARGE_MIXER_RECIPES.recipeBuilder("cosmic_computing_mix").duration(100).EUt(VHA[UEV])
        .inputFluids(HeavyLeptonMix.getFluid(1000))
        .inputFluids(HeavyQuarks.getFluid(1000))
        .inputFluids(Gluons.getFluid(1000))
        .outputFluids(CosmicComputingMix.getFluid(3000))
        .save(provider);

    LARGE_MIXER_RECIPES.recipeBuilder("deuterium_superheavy_mix").duration(140).EUt(4500000)
        .inputFluids(Deuterium.getFluid(2000))
        .inputFluids(MetastableHassium.getFluid(144))
        .inputFluids(MetastableFlerovium.getFluid(144))
        .inputFluids(MetastableOganesson.getFluid(144))
        .outputFluids(DeuteriumSuperheavyMix.getFluid(2592))
        .save(provider);

    LARGE_MIXER_RECIPES.recipeBuilder("cno_catalyst")
        .inputFluids(
            Nitrogen14.getFluid(1000),
            Nitrogen15.getFluid(1000),
            Carbon12.getFluid(1000),
            Carbon13.getFluid(1000))
        .outputFluids(CNOcatalyst.getFluid(4000))
        .duration(340).EUt(VA[IV]).save(provider);

  }

  private static void testRecipes(Consumer<FinishedRecipe> provider) {
    // Migrated from misc/test recipes.
    MIXER_RECIPES.recipeBuilder("brominated_brine_sulfuric_acid_to_acidic_brominated_brine").duration(200).EUt(480)
        .inputFluids(BrominatedBrine.getFluid(1000))
        .inputFluids(SulfuricAcid.getFluid(1000))
        .outputFluids(AcidicBrominatedBrine.getFluid(1000))
        .save(provider);


    // Na2CO3, CaO
    MIXER_RECIPES.recipeBuilder("soda_ash_quicklime_boron_free_solution_to_calcium_magnesium_salts_sodium_lithium_solution").duration(80).EUt(1920)
        .inputDust(SodaAsh, 6)
        .inputDust(Quicklime, 2)
        .inputFluids(BoronFreeSolution.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, CalciumMagnesiumSalts, 16))
        .outputFluids(SodiumLithiumSolution.getFluid(1000))
        .save(provider);


    // NaH + AlH3 -> NaAlH4
    MIXER_RECIPES.recipeBuilder("sodium_hydride_aluminium_hydride_to_sodium_aluminium_hydride").duration(190).EUt(30)
        .inputDust(SodiumHydride, 2)
        .inputDust(AluminiumHydride, 4)
        .outputItems(ChemicalHelper.get(dust, SodiumAluminiumHydride, 6))
        .save(provider);


    // NaOH + H2O -> NaOH(H2O)
    MIXER_RECIPES.recipeBuilder("sodium_hydroxide_water_to_sodium_hydroxide_solution").duration(60).EUt(30)
        .circuitMeta(0)
        .inputDust(SodiumHydroxide, 3)
        .inputFluids(Water.getFluid(1000))
        .outputFluids(SodiumHydroxideSolution.getFluid(1000))
        .save(provider);


    // CH3OH + NH3 -> CH3OH(NH3)
    MIXER_RECIPES.recipeBuilder("methanol_ammonia_to_amine_mixture").duration(160).EUt(960)
        .notConsumable(dust, Nickel)
        .inputFluids(Methanol.getFluid(1000))
        .inputFluids(Ammonia.getFluid(1000))
        .outputFluids(AmineMixture.getFluid(2000))
        .save(provider);


    // TiCl4 + AlCl3 -> TiAlCl7
    MIXER_RECIPES.recipeBuilder("titanium_tetrachloride_aluminium_chloride_to_ti_al_chloride")
        .inputFluids(TitaniumTetrachloride.getFluid(1000))
        .inputDust(AluminiumChloride, 4)
        .EUt(7680)
        .duration(50)
        .outputItems(ChemicalHelper.get(dust, TiAlChloride, 9))
        .save(provider);

    LARGE_MIXER_RECIPES.recipeBuilder("palladium_iridium_rhenium_cerium_osmium_silicon_oxygen_to_pd_ir_re_o_ce_os_si_catalyst")
        .inputDust(Palladium)
        .inputDust(Iridium)
        .inputDust(Rhenium)
        .inputDust(Cerium)
        .inputDust(Osmium)
        .inputDust(Silicon)
        .inputFluids(Oxygen.getFluid(4000))
        .outputItems(ChemicalHelper.get(dust, PdIrReOCeOsSiCatalyst, 10))
        .EUt(7680)
        .duration(50)
        .save(provider);


    // SIDE INGREDIENTS ============================================================================================

    // NOT CONSUMED INGREDIENT
    MIXER_RECIPES.recipeBuilder("potassium_sulfur_oxygen_to_potassium_metabisulfite").duration(100).EUt(30)
        .circuitMeta(1)
        .inputDust(Potassium, 2)
        .inputDust(Sulfur, 2)
        .inputFluids(Oxygen.getFluid(5000))
        .outputDust(PotassiumMetabisulfite, 9)
        .save(provider);

    MIXER_RECIPES.recipeBuilder("resorcinol_formaldehyde_graphene_oxide_to_graphene_gel_suspension").duration(100).EUt(120)
        .inputFluids(Resorcinol.getFluid(500))
        .inputFluids(Formaldehyde.getFluid(1000))
        .inputDust(GrapheneOxide, 3)
        .outputItems(ChemicalHelper.get(dust, GrapheneGelSuspension))
        .save(provider);


    // SnO2 + C + H2O -> (SnO2)C
    MIXER_RECIPES.recipeBuilder("cassiterite_coke_distilled_water_to_cassiterite_coke_pellets").duration(340).EUt(30)
        .inputDust(Cassiterite, 2)
        .inputDust(Coke)
        .inputFluids(DistilledWater.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, CassiteriteCokePellets, 5))
        .save(provider);


    // C12H27O4P + C6H12O -> C18H39O5P
    MIXER_RECIPES.recipeBuilder("tributyl_phosphate_methyl_isobutyl_ketone_to_nb_ta_separation_mixture").duration(220).EUt(30)
        .inputFluids(TributylPhosphate.getFluid(1000))
        .inputFluids(MethylIsobutylKetone.getFluid(1000))
        .outputFluids(NbTaSeparationMixture.getFluid(2000))
        .save(provider);


    // 3K + 7Na -> Na7K3
    MIXER_RECIPES.recipeBuilder("potassium_sodium_to_sodium_potassium_alloy").duration(300).EUt(120)
        .inputDust(Potassium, 3)
        .inputDust(Sodium, 7)
        .outputDust(SodiumPotassiumAlloy, 10)
        .save(provider);


    // LiF + NaF + KF -> LiNaKF3
    MIXER_RECIPES.recipeBuilder("lithium_fluoride_sodium_fluoride_potassium_fluoride_to_f_li_na_k").EUt(64).duration(480)
        .inputDust(LithiumFluoride, 2)
        .inputDust(SodiumFluoride, 2)
        .inputDust(PotassiumFluoride, 2)
        .outputDust(FLiNaK, 6)
        .save(provider);


    // LiF + BeF2 -> F3LiBe
    MIXER_RECIPES.recipeBuilder("lithium_fluoride_beryllium_fluoride_to_f_li_be").duration(600).EUt(120)
        .inputDust(LithiumFluoride, 2)
        .inputDust(BerylliumFluoride, 3)
        .outputDust(FLiBe, 5)
        .save(provider);


    // H2O + NH4HF2 -> [NH4HF2 + H2O]
    MIXER_RECIPES.recipeBuilder("distilled_water_ammonium_bifluoride_to_ammonium_bifluoride_solution").duration(140).EUt(30)
        .inputFluids(DistilledWater.getFluid(1000))
        .inputDust(AmmoniumBifluoride, 8)
        .outputFluids(AmmoniumBifluorideSolution.getFluid(2000))
        .save(provider);


    // MgF2 + ZnS + Ta2O5 + TiO2 + C2H5OH -> Dielectric Mirror Formation Mix
    MIXER_RECIPES.recipeBuilder("magnesium_fluoride_zinc_sulfide_tantalum_oxide_rutile_ethanol_to_dielectric_mirror_formation_mix").duration(270).EUt(983040)
        .inputDust(MagnesiumFluoride, 3)
        .inputDust(ZincSulfide, 2)
        .inputDust(TantalumOxide, 7)
        .inputDust(Rutile, 3)
        .inputFluids(Ethanol.getFluid(1000))
        .outputFluids(DielectricMirrorFormationMix.getFluid(1000))
        .save(provider);


    // 2CH4 + 5Cl -> [2CH4 + 5Cl]
    MIXER_RECIPES.recipeBuilder("methane_chlorine_to_chlorinated_solvents").duration(240).EUt(1920)
        .inputFluids(Methane.getFluid(2000))
        .inputFluids(Chlorine.getFluid(5000))
        .outputFluids(ChlorinatedSolvents.getFluid(7000))
        .save(provider);


    // H2O + NaNO3 -> NaNO3(H2O)
    MIXER_RECIPES.recipeBuilder("water_sodium_nitrate_to_sodium_nitrate_solution")
        .inputFluids(Water.getFluid(1000))
        .inputDust(SodiumNitrate, 5)
        .outputFluids(SodiumNitrateSolution.getFluid(1000))
        .EUt(120)
        .duration(80)
        .save(provider);


    // Zn + Fe + Al + Cl -> ZnFeAlCl
    MIXER_RECIPES.recipeBuilder("zinc_iron_aluminium_chlorine_to_zn_fe_al_cl_catalyst")
        .inputDust(Zinc)
        .inputDust(Iron)
        .inputDust(Aluminium)
        .inputFluids(Chlorine.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, ZnFeAlClCatalyst, 4))
        .EUt(15360)
        .duration(250)
        .save(provider);


    // 3? + 0.5NH3 -> 3SO2 + 0.5NH4ReO4
    MIXER_RECIPES.recipeBuilder("molybdenum_flue_water_to_rhenium_sulfuric_solution")
        .inputFluids(MolybdenumFlue.getFluid(3000))
        .inputFluids(Water.getFluid(250))
        .outputFluids(RheniumSulfuricSolution.getFluid(3000))
        .EUt(491520)
        .duration(30)
        .save(provider);


    // 2C12H26 + 0.5C24H51N + 0.25C8H18O + 0.5C6H12O + 0.375CH3COOH + 0.375C5H12O -> ~4C11H24
    LARGE_MIXER_RECIPES.recipeBuilder("kerosene_trioctylamine_octanol_methyl_isobutyl_ketone_acetic_acid_isoamyl_alcohol_to_rhenium_separation_mixture")
        .inputFluids(Kerosene.getFluid(8000))
        .inputFluids(Trioctylamine.getFluid(500))
        .inputFluids(Octanol.getFluid(500))
        .inputFluids(MethylIsobutylKetone.getFluid(250))
        .inputFluids(AceticAcid.getFluid(250))
        .inputFluids(IsoamylAlcohol.getFluid(250))
        .outputFluids(RheniumSeparationMixture.getFluid(10000))
        .EUt(7680)
        .duration(90)
        .save(provider);


    // Sr + BaO + 2CH3COOH -> [C4H6BaSrO4 + H2O]
    MIXER_RECIPES.recipeBuilder("strontium_barium_oxide_acetic_acid_to_barium_strontium_acetate_solution").duration(420).EUt(120)
        .inputDust(Strontium)
        .inputDust(BariumOxide, 2)
        .inputFluids(AceticAcid.getFluid(2000))
        .outputFluids(BariumStrontiumAcetateSolution.getFluid(1000))
        .save(provider);


    // [C4H6BaSrO4 + H2O] + C12H28O4Ti + 2C -> [C4H6BaSrO4 + C12H28O4Ti + H2O + 2C]
    MIXER_RECIPES.recipeBuilder("barium_strontium_acetate_solution_titanium_isopropoxide_carbon_to_barium_strontium_titanate_preparation").duration(280).EUt(120)
        .inputFluids(BariumStrontiumAcetateSolution.getFluid(1000))
        .inputFluids(TitaniumIsopropoxide.getFluid(1000))
        .inputDust(Carbon, 2)
        .outputFluids(BariumStrontiumTitanatePreparation.getFluid(2000))
        .save(provider);


    // Pb(NO3)2 + 9Ca -> [Pb(NO3)2 + 9Ca]
    MIXER_RECIPES.recipeBuilder("lead_nitrate_calcium_to_lead_nitrate_calcium_mixture").duration(200).EUt(30)
        .inputDust(LeadNitrate, 9)
        .inputDust(Calcium, 9)
        .outputItems(ChemicalHelper.get(dust, LeadNitrateCalciumMixture, 18))
        .save(provider);


    // 4Tb + 7Ds + 10Fe + 5Co + 2B + Si + C -> [4Tb + 7Ds + 10Fe + 5Co + 2B + Si + C]
    LARGE_MIXER_RECIPES.recipeBuilder("terbium_dysprosium_iron_cobalt_boron_silicon_carbon_to_magnetorestrictive_alloy").duration(940).EUt(30)
        .inputDust(Terbium, 4)
        .inputDust(Dysprosium, 7)
        .inputDust(Iron, 10)
        .inputDust(Cobalt, 5)
        .inputDust(Boron, 2)
        .inputDust(Silicon)
        .inputDust(Carbon)
        .outputItems(ChemicalHelper.get(dust, MagnetorestrictiveAlloy, 30))
        .save(provider);

    MIXER_RECIPES.recipeBuilder("carbon_nanotubes_mbba_to_liquid_crystal_detector").duration(320).EUt(480)
        .inputDust(CarbonNanotubes)
        .inputFluids(MBBA.getFluid(1000))
        .outputFluids(LiquidCrystalDetector.getFluid(1000))
        .save(provider);


    // Re + Rh + Nq -> ReRhNq
    MIXER_RECIPES.recipeBuilder("rhenium_rhodium_naquadah_to_rh_re_nq_catalyst").duration(260).EUt(84500)
        .inputDust(Rhenium)
        .inputDust(Rhodium)
        .inputDust(Naquadah)
        .outputItems(ChemicalHelper.get(dust, RhodiumRheniumNaquadahCatalyst, 3))
        .save(provider);


// Cu + In + Ga -> CuGaIn
    MIXER_RECIPES.recipeBuilder("copper_indium_gallium_to_copper_gallium_indium_mix").duration(240).EUt(120)
        .inputDust(Copper)
        .inputDust(Indium)
        .inputDust(Gallium)
        .outputItems(ChemicalHelper.get(dust, CopperGalliumIndiumMix, 3))
        .save(provider);


    // Fe + Pt -> FePt
    MIXER_RECIPES.recipeBuilder("iron_platinum_to_iron_platinum_catalyst").duration(230).EUt(240)
        .inputDust(Iron)
        .inputDust(Platinum)
        .outputItems(ChemicalHelper.get(dust, IronPlatinumCatalyst, 2))
        .save(provider);


    // BaCl3 + H2O -> [BaCl3 + H2O]
    MIXER_RECIPES.recipeBuilder("barium_chloride_distilled_water_to_barium_chloride_solution").duration(230).EUt(120)
        .inputDust(BariumChloride, 3)
        .inputFluids(DistilledWater.getFluid(1000))
        .outputFluids(BariumChlorideSolution.getFluid(1000))
        .save(provider);

    // TODO migrated disabled: unresolved old test symbol `mixtures`.
    //             MIXER_RECIPES.recipeBuilder("i_potassium_iodide_mercury_to_mixtures").duration(320).EUt(30)
    //                     .inputItems(halides[i])
    //                     .inputDust(PotassiumIodide, 2)
    //                     .inputFluids(Mercury.getFluid(1000))
    //                     .outputItems(mixtures[i].getItemStack(2))
    //                     .save(provider);
    // 
    // 
    //         

// 2La + 2 C60H30 -> La2(C60H30)2
    MIXER_RECIPES.recipeBuilder("lanthanum_unfolded_fullerene_to_lanthanum_fullerene_mix").duration(140).EUt(30720)
        .inputDust(Lanthanum, 2)
        .inputDust(UnfoldedFullerene, 2)
        .outputItems(ChemicalHelper.get(dust, LanthanumFullereneMix, 4))
        .save(provider);


    // At + H2SO4 -> [At + H2O + SO3]
    MIXER_RECIPES.recipeBuilder("astatine_sulfuric_acid_to_astatide_solution").duration(140).EUt(7680)
        .inputDust(Astatine)
        .inputFluids(SulfuricAcid.getFluid(1000))
        .outputFluids(AstatideSolution.getFluid(1000))
        .save(provider);


    // 3[At + H2O + SO3] + Ho + Th + Cn + Fl -> 3H2SO4 + [3At + Ho + Th + Cn + Fl]
    MIXER_RECIPES.recipeBuilder("astatide_solution_holmium_thulium_copernicium_metastable_flerovium_to_sulfuric_acid_mixed_astatide_salts").duration(380).EUt(30720)
        .inputFluids(AstatideSolution.getFluid(3000))
        .inputDust(Holmium)
        .inputDust(Thulium)
        .inputDust(Copernicium)
        .inputDust(MetastableFlerovium)
        .outputFluids(SulfuricAcid.getFluid(3000))
        .outputItems(ChemicalHelper.get(dust, MixedAstatideSalts, 7))
        .save(provider);

    LARGE_MIXER_RECIPES.recipeBuilder("naquadah_naquadah_enriched_naquadria_vibranium_adamantium_taranium_trinium_duranium_tritanium_to_legendarium").duration(270).EUt(250000)
        .inputDust(Naquadah)
        .inputDust(NaquadahEnriched)
        .inputDust(Naquadria)
        .inputDust(Vibranium)
        .inputDust(Adamantium)
        .inputDust(Taranium)
        .inputDust(Trinium)
        .inputDust(Duranium)
        .inputDust(Tritanium)
        .outputItems(ChemicalHelper.get(dust, Legendarium, 9))
        .save(provider);

    MIXER_RECIPES.recipeBuilder("stone_hydrofluoric_acid_to_dirty_hexafluorosilicic_acid")
        .inputDust(Stone, 24)
        .inputFluids(HydrofluoricAcid.getFluid(6000))
        .outputFluids(DirtyHexafluorosilicicAcid.getFluid(3000))
        .duration(40)
        .EUt(100)
        .save(provider);

    MIXER_RECIPES.recipeBuilder("distilled_water_exotic_heavy_residues_sodium_hydroxide_protonated_fullerene_sieving_matrix_to_sodium_hydroxide_solution_saturated_fullerene_sieving_matrix")
        .inputFluids(DistilledWater.getFluid(2000))
        .inputDust(ExoticHeavyResidues, 16)
        .inputDust(SodiumHydroxide, 3)
        .inputItems(PROTONATED_FULLERENE_SIEVING_MATRIX.asStack())
        .outputFluids(SodiumHydroxideSolution.getFluid(1000))
        .outputItems(SATURATED_FULLERENE_SIEVING_MATRIX.asStack())
        .duration(40)
        .EUt(2000000)
        .save(provider);

    MIXER_RECIPES.recipeBuilder("clean_inert_residues_helium3_hydride_to_ultraacidic_residue_solution")
        .inputDust(CleanInertResidues)
        .inputFluids(Helium3Hydride.getFluid(1000))
        .outputFluids(UltraacidicResidueSolution.getFluid(1000))
        .duration(160)
        .EUt(2000)
        .save(provider);

    // TODO migrated disabled: unresolved old test symbol `TaraniumDepletedHeliumPlasma`.
    //         MIXER_RECIPES.recipeBuilder("plasma_helium3_taranium_depleted_l_helium3_to_taranium_depleted_helium_plasma")
    //                 .inputFluids(Helium3.getFluid(FluidStorageKeys.PLASMA, 1000))
    //                 .inputFluids(TaraniumDepletedLHelium3.getFluid(1000))
    //                 .outputFluids(TaraniumDepletedHeliumPlasma.getFluid(2000))
    //                 .duration(160)
    //                 .EUt(2000)
    //                 .save(provider);
    // 
    //         MIXER_RECIPES.recipeBuilder("taranium_poor_liquid_helium_liquid_helium3_to_taranium_poor_liquid_helium_mix")
    //                 .inputFluids(TaraniumPoorLiquidHelium.getFluid(1000))
    //                 .inputFluids(LiquidHelium3.getFluid(200))
    //                 .outputFluids(TaraniumPoorLiquidHeliumMix.getFluid(1200))
    //                 .duration(80)
    //                 .EUt(8000)
    //                 .save(provider);
    // 
    // 
    // 
    //             

// WCa2O4 + 2NaOH + H2O2 -> 2Ca(OH)2 + Na2WO4
    MIXER_RECIPES.recipeBuilder("scheelite_sodium_hydroxide_hydrogen_peroxide_to_calcium_hydroxide_sodium_tungstate")
        .inputDust(Scheelite, 7)
        .inputDust(SodiumHydroxide, 6)
        .inputFluids(HydrogenPeroxide.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, CalciumHydroxide, 10))
        .outputFluids(SodiumTungstate.getFluid(1000))
        .EUt(480)
        .duration(110)
        .save(provider);


    // WLi2O4 + 2NaOH -> 2LiOH + Na2WO4
    MIXER_RECIPES.recipeBuilder("tungstate_sodium_hydroxide_to_lithium_hydroxide_sodium_tungstate")
        .inputDust(Tungstate, 7)
        .inputDust(SodiumHydroxide, 6)
        .outputItems(ChemicalHelper.get(dust, LithiumHydroxide, 6))
        .outputFluids(SodiumTungstate.getFluid(1000))
        .EUt(480)
        .duration(160)
        .save(provider);


    // LiOH + H2O -> LiOH(H2O)
    MIXER_RECIPES.recipeBuilder("water_lithium_hydroxide_to_lithium_hydroxide_solution")
        .inputFluids(Water.getFluid(1000))
        .inputDust(LithiumHydroxide, 3)
        .outputFluids(LithiumHydroxideSolution.getFluid(1000))
        .EUt(30)
        .duration(60)
        .save(provider);

    LARGE_MIXER_RECIPES.recipeBuilder("ruthenium_rhodium_palladium_silver_rhenium_osmium_iridium_platinum_gold_to_precious_metals").duration(270).EUt(250000)
        .inputDust(Ruthenium)
        .inputDust(Rhodium)
        .inputDust(Palladium)
        .inputDust(Silver)
        .inputDust(Rhenium)
        .inputDust(Osmium)
        .inputDust(Iridium)
        .inputDust(Platinum)
        .inputDust(Gold)
        .outputItems(ChemicalHelper.get(dust, PreciousMetals, 9))
        .save(provider);

    LARGE_MIXER_RECIPES.recipeBuilder("zirconium_hafnium_niobium_tantalum_molybdenum_tungsten_technetium_to_refractory_metals").duration(210).EUt(250000)
        .inputDust(Zirconium)
        .inputDust(Hafnium)
        .inputDust(Niobium)
        .inputDust(Tantalum)
        .inputDust(Molybdenum)
        .inputDust(Tungsten)
        .inputDust(Technetium)
        .outputItems(ChemicalHelper.get(dust, RefractoryMetals, 7))
        .save(provider);

    LARGE_MIXER_RECIPES.recipeBuilder("titanium_vanadium_manganese_chromium_iron_nickel_cobalt_copper_to_light_transtion_metals").duration(240).EUt(250000)
        .inputDust(Titanium)
        .inputDust(Vanadium)
        .inputDust(Manganese)
        .inputDust(Chromium)
        .inputDust(Iron)
        .inputDust(Nickel)
        .inputDust(Cobalt)
        .inputDust(Copper)
        .outputItems(ChemicalHelper.get(dust, LightTranstionMetals, 8))
        .save(provider);

    LARGE_MIXER_RECIPES.recipeBuilder("beryllium_magnesium_calcium_strontium_barium_radium_scandium_yttrium_lithium_sodium_potassium_rubidium_caesium_francium_to_alkalis").duration(420).EUt(250000)
        .inputDust(Beryllium)
        .inputDust(Magnesium)
        .inputDust(Calcium)
        .inputDust(Strontium)
        .inputDust(Barium)
        .inputDust(Radium)
        .inputDust(Scandium)
        .inputDust(Yttrium)
        .inputFluids(Lithium.getFluid(144))
        .inputFluids(Sodium.getFluid(144))
        .inputFluids(Potassium.getFluid(144))
        .inputFluids(Rubidium.getFluid(144))
        .inputFluids(Caesium.getFluid(144))
        .inputFluids(Francium.getFluid(144))
        .outputDust(Alkalis, 14)
        .save(provider);

    LARGE_MIXER_RECIPES.recipeBuilder("zinc_cadmium_aluminium_silicon_germanium_antimony_thallium_lead_mercury_tin_gallium_indium_bismuth_polonium_to_post_transition_metals").duration(420).EUt(250000)
        .inputDust(Zinc)
        .inputDust(Cadmium)
        .inputDust(Aluminium)
        .inputDust(Silicon)
        .inputDust(Germanium)
        .inputDust(Antimony)
        .inputDust(Thallium)
        .inputDust(Lead)
        .inputFluids(Mercury.getFluid(144))
        .inputFluids(Tin.getFluid(144))
        .inputFluids(Gallium.getFluid(144))
        .inputFluids(Indium.getFluid(144))
        .inputFluids(Bismuth.getFluid(144))
        .inputFluids(Polonium.getFluid(144))
        .outputItems(ChemicalHelper.get(dust, PostTransitionMetals, 14))
        .save(provider);

    LARGE_MIXER_RECIPES.recipeBuilder("samarium_gadolinium_terbium_thulium_holmium_lutetium_promethium_erbium_dysprosium_lanthanum_cerium_praseodymium_neodymium_europium_ytterbium_to_lanthanoids").duration(450).EUt(250000)
        .inputDust(Samarium)
        .inputDust(Gadolinium)
        .inputDust(Terbium)
        .inputDust(Thulium)
        .inputDust(Holmium)
        .inputDust(Lutetium)
        .inputDust(Promethium)
        .inputDust(Erbium)
        .inputDust(Dysprosium)
        .inputFluids(Lanthanum.getFluid(144))
        .inputFluids(Cerium.getFluid(144))
        .inputFluids(Praseodymium.getFluid(144))
        .inputFluids(Neodymium.getFluid(144))
        .inputFluids(Europium.getFluid(144))
        .inputFluids(Ytterbium.getFluid(144))
        .outputItems(ChemicalHelper.get(dust, Lanthanoids, 15))
        .save(provider);

    LARGE_MIXER_RECIPES.recipeBuilder("actinium_thorium_protactinium_uranium238_americium_curium_berkelium_fermium_californium_neptunium_plutonium239_mendelevium_einsteinium_to_actinoids").duration(390).EUt(250000)
        .inputDust(Actinium)
        .inputDust(Thorium)
        .inputDust(Protactinium)
        .inputDust(Uranium238)
        .inputDust(Americium)
        .inputDust(Curium)
        .inputDust(Berkelium)
        .inputDust(Fermium)
        .inputDust(Californium)
        .inputFluids(Neptunium.getFluid(144))
        .inputFluids(Plutonium239.getFluid(144))
        .inputFluids(Mendelevium.getFluid(144))
        .inputFluids(Einsteinium.getFluid(144))
        .outputItems(ChemicalHelper.get(dust, Actinoids, 13))
        .save(provider);


    LARGE_MIXER_RECIPES.recipeBuilder("boron_carbon_phosphorus_sulfur_arsenic_selenium_tellurium_iodine_astatine_oxygen_nitrogen_hydrogen_fluorine_chlorine_bromine_to_non_metals").duration(450).EUt(250000)
        .inputDust(Boron)
        .inputDust(Carbon)
        .inputDust(Phosphorus)
        .inputDust(Sulfur)
        .inputDust(Arsenic)
        .inputDust(Selenium)
        .inputDust(Tellurium)
        .inputDust(Iodine)
        .inputDust(Astatine)
        .inputFluids(Oxygen.getFluid(1000))
        .inputFluids(Nitrogen.getFluid(1000))
        .inputFluids(Hydrogen.getFluid(1000))
        .inputFluids(Fluorine.getFluid(1000))
        .inputFluids(Chlorine.getFluid(1000))
        .inputFluids(Bromine.getFluid(1000))
        .outputFluids(NonMetals.getFluid(15000))
        .save(provider);

    LARGE_MIXER_RECIPES.recipeBuilder("helium_neon_argon_krypton_xenon_radon_to_noble_gases").duration(180).EUt(250000)
        .inputFluids(Helium.getFluid(1000))
        .inputFluids(Neon.getFluid(1000))
        .inputFluids(Argon.getFluid(1000))
        .inputFluids(Krypton.getFluid(1000))
        .inputFluids(Xenon.getFluid(1000))
        .inputFluids(Radon.getFluid(1000))
        .outputFluids(NobleGases.getFluid(6000))
        .save(provider);

    LARGE_MIXER_RECIPES.recipeBuilder("superheavy_l_alloy_superheavy_h_alloy_alkalis_refractory_metals_light_transtion_metals_precious_metals_post_transition_metals_lanthanoids_actinoids_non_metals_noble_gases_to_periodicium").duration(360).EUt(5400000)
        .inputDust(SuperheavyLAlloy, 7)
        .inputDust(SuperheavyHAlloy, 7)
        .inputDust(Alkalis, 14)
        .inputDust(RefractoryMetals, 7)
        .inputDust(LightTranstionMetals, 8)
        .inputDust(PreciousMetals, 9)
        .inputDust(PostTransitionMetals, 14)
        .inputDust(Lanthanoids, 15)
        .inputDust(Actinoids, 13)
        .inputFluids(NonMetals.getFluid(15000))
        .inputFluids(NobleGases.getFluid(6000))
        .outputDust(Periodicium, 115)
        .save(provider);

    MIXER_RECIPES.recipeBuilder("liquid_helium_liquid_helium3_to_liquid_enriched_helium").duration(60).EUt(7680)
        .inputFluids(Helium.getFluid(FluidStorageKeys.LIQUID, 1000))
        .inputFluids(Helium3.getFluid(FluidStorageKeys.LIQUID, 1000))
        .outputFluids(LiquidEnrichedHelium.getFluid(2000))
        .save(provider);

    // [UO2 + Th(NO3)4] + H2O -> UO2 + [H2O + Th(NO3)4]
//             MIXER_RECIPES.recipeBuilder("uranium_oxide_thorium_nitrate_distilled_water_to_uranium_radioactive_thorium_nitrate_solution").duration(100).EUt(30)
//                     .inputDust(UraniumOxideThoriumNitrate, 18)
//                     .inputFluids(DistilledWater.getFluid(1000))
//                     .outputItems(dioxide, UraniumRadioactive, 3)
//                     .outputFluids(ThoriumNitrateSolution.getFluid(1000))
//                     .save(provider);

// UU-Matter ===================================================================================================
    LARGE_MIXER_RECIPES.recipeBuilder("bosonic_uu_matter_fermionic_uu_matter_free_electron_gas_to_uu_matter").duration(50).EUt(491520)
        .inputFluids(BosonicUUMatter.getFluid(1000))
        .inputFluids(FermionicUUMatter.getFluid(1000))
        .inputFluids(FreeElectronGas.getFluid(2000))
        .outputFluids(UUMatter.getFluid(1000))
        .save(provider);


    // Graphene ====================================================================================================
    // FeCl3 + C6H12O6 = [FeCl3 + C6H12O6]
    MIXER_RECIPES.recipeBuilder("iron_chloride_glucose_to_glucose_iron_solution").duration(80).EUt(30)
        .inputFluids(IronChloride.getFluid(1000))
        .inputDust(Glucose, 24)
        .outputFluids(GlucoseIronSolution.getFluid(1000))
        .save(provider);


    // KMnO4 + NaNO3 + H2SO4 = Graphene Oxidation Solution
    MIXER_RECIPES.recipeBuilder("potassium_permanganate_sodium_nitrate_sulfuric_acid_to_graphene_oxidation_solution").duration(260).EUt(120)
        .inputDust(PotassiumPermanganate, 6)
        .inputDust(SodiumNitrate, 5)
        .inputFluids(SulfuricAcid.getFluid(1000))
        .outputFluids(GrapheneOxidationSolution.getFluid(1000))
        .save(provider);

    MIXER_RECIPES.recipeBuilder("redstone_sulfur_blaze_to_pyrotheum").duration(100).EUt(120)
        .inputDust(Redstone)
        .inputDust(Sulfur)
        .inputDust(Blaze, 2)
        .outputDust(Pyrotheum, 4)
        .save(provider);

    MIXER_RECIPES.recipeBuilder("redstone_snow_blizz_to_cryotheum").duration(100).EUt(120)
        .inputDust(Redstone)
        .inputDust(Snow)
        .inputDust(Blizz, 2)
        .outputDust(Cryotheum, 4)
        .save(provider);


    // BaSO4 + H2O -> [BaSO4 + H2O]
    MIXER_RECIPES.recipeBuilder("barite_water_to_barium_sulfate_solution").duration(120).EUt(30)
        .inputDust(Barite, 6) // full mols
        .inputFluids(Water.getFluid(1000))
        .outputFluids(BariumSulfateSolution.getFluid(1000))
        .save(provider);


    // CaCO3 + H2O -> [CaCO3 + H2O]
    MIXER_RECIPES.recipeBuilder("calcite_water_to_calcium_carbonate_solution").duration(120).EUt(30)
        .inputDust(Calcite)
        .circuitMeta(0)
        .inputFluids(Water.getFluid(1000))
        .outputFluids(CalciumCarbonateSolution.getFluid(1000))
        .save(provider);


    // Bentonite + Clay + 2H2O -> 2[H2O + 0.5 Bentonite + 0.5 Clay]
    MIXER_RECIPES.recipeBuilder("bentonite_clay_water_to_bentonite_clay_slurry").duration(120).EUt(30)
        .inputDust(Bentonite)
        .inputDust(Clay)
        .inputFluids(Water.getFluid(2000))
        .outputFluids(BentoniteClaySlurry.getFluid(2000))
        .save(provider);

    LARGE_MIXER_RECIPES.recipeBuilder("barium_sulfate_solution_calcium_carbonate_solution_bentonite_clay_slurry_lubricant_atl_ethylene_glycol_to_drilling_mud").duration(120).EUt(480)
        .inputFluids(BariumSulfateSolution.getFluid(1000))
        .inputFluids(CalciumCarbonateSolution.getFluid(1000))
        .inputFluids(BentoniteClaySlurry.getFluid(1000))
        .inputFluids(Lubricant.getFluid(1000))
        .inputFluids(ATL.getFluid(1000))
        .inputFluids(EthyleneGlycol.getFluid(1000))
        .outputFluids(DrillingMud.getFluid(6000))
        .save(provider);

    MIXER_RECIPES.recipeBuilder("barium_sulfate_solution_calcium_carbonate_solution_to_ca_c_ba_s_mixture").duration(120).EUt(30)
        .inputFluids(BariumSulfateSolution.getFluid(1000))
        .inputFluids(CalciumCarbonateSolution.getFluid(1000))
        .outputFluids(CaCBaSMixture.getFluid(2000))
        .save(provider);

    MIXER_RECIPES.recipeBuilder("bentonite_clay_slurry_lubricant_to_lubricant_clay_slurry").duration(120).EUt(30)
        .inputFluids(BentoniteClaySlurry.getFluid(1000))
        .inputFluids(Lubricant.getFluid(1000))
        .outputFluids(LubricantClaySlurry.getFluid(2000))
        .save(provider);

    MIXER_RECIPES.recipeBuilder("atl_ethylene_glycol_to_atl_ethylene").duration(120).EUt(30)
        .inputFluids(ATL.getFluid(1000))
        .inputFluids(EthyleneGlycol.getFluid(1000))
        .outputFluids(ATLEthylene.getFluid(2000))
        .save(provider);

    MIXER_RECIPES.recipeBuilder("ca_c_ba_s_mixture_lubricant_clay_slurry_to_drilling_mud_mixture").duration(60).EUt(120)
        .inputFluids(CaCBaSMixture.getFluid(2000))
        .inputFluids(LubricantClaySlurry.getFluid(2000))
        .outputFluids(DrillingMudMixture.getFluid(4000))
        .save(provider);

    MIXER_RECIPES.recipeBuilder("drilling_mud_mixture_atl_ethylene_to_drilling_mud").duration(60).EUt(120)
        .inputFluids(DrillingMudMixture.getFluid(4000))
        .inputFluids(ATLEthylene.getFluid(2000))
        .outputFluids(DrillingMud.getFluid(6000))
        .save(provider);


    // C2H4O + H2O -> [C2H4O + H2O]
    MIXER_RECIPES.recipeBuilder("ethylene_oxide_water_to_wet_ethylene_oxide").duration(140).EUt(120)
        .inputFluids(EthyleneOxide.getFluid(1000))
        .inputFluids(Water.getFluid(1000))
        .outputFluids(WetEthyleneOxide.getFluid(1000))
        .save(provider);

    MIXER_RECIPES.recipeBuilder("polyurethane_ethylene_glycol_calcite_to_viscoelastic_polyurethane").duration(110).EUt(120)
        .inputFluids(Polyurethane.getFluid(1000))
        .inputFluids(EthyleneGlycol.getFluid(1000))
        .inputDust(Calcite, 5)
        .outputFluids(ViscoelasticPolyurethane.getFluid(2000))
        .save(provider);

    MIXER_RECIPES.recipeBuilder("viscoelastic_polyurethane_air_to_viscoelastic_polyurethane_foam").duration(150).EUt(120)
        .inputFluids(ViscoelasticPolyurethane.getFluid(1000))
        .inputFluids(Air.getFluid(1000))
        .outputFluids(ViscoelasticPolyurethaneFoam.getFluid(2000))
        .save(provider);


    // Rocket Fuel Tier T4
    // C2H8N2 + N2O4 = H8N4C2O4 (treat like chem reactor recipes)
    MIXER_RECIPES.recipeBuilder("dimethylhydrazine_dinitrogen_tetroxide_to_rocket_fuel_h8_n4_c2_o4").duration(280).EUt(480)
        .inputFluids(Dimethylhydrazine.getFluid(1000))
        .inputFluids(DinitrogenTetroxide.getFluid(1000))
        .outputFluids(RocketFuelH8N4C2O4.getFluid(1000))
        .save(provider);


    // Rocket Fuel Tier 3
    // HNO3 + CH3(NH)NH2 = CN3H7O3 (treat like chem reactor recipes)
    MIXER_RECIPES.recipeBuilder("nitric_acid_mono_methyl_hydrazine_to_rocket_fuel_cn3_h7_o3").duration(200).EUt(240)
        .inputFluids(NitricAcid.getFluid(1000))
        .inputFluids(MonoMethylHydrazine.getFluid(1000))
        .outputFluids(RocketFuelCN3H7O3.getFluid(1000))
        .save(provider);


    // Rocket Fuel Tier 2
    // N2H4 + CH3OH = [N2H4 + CH3OH] (treat like chem reactor recipes)
    MIXER_RECIPES.recipeBuilder("hydrazine_methanol_to_dense_hydrazine_fuel_mixture").duration(120).EUt(240)
        .inputFluids(Hydrazine.getFluid(1000))
        .inputFluids(Methanol.getFluid(1000))
        .outputFluids(DenseHydrazineFuelMixture.getFluid(1000))
        .save(provider);


    // Rocket Fuel Tier 1
    // O + RP-1 = [O + RP-1] (treat like chem reactor recipes)
    MIXER_RECIPES.recipeBuilder("liquid_oxygen_rp1_to_rp1_rocket_fuel").duration(16).EUt(240)
        .inputFluids(Oxygen.getFluid(FluidStorageKeys.LIQUID, 1000))
        .inputFluids(RP1.getFluid(1000))
        .outputFluids(RP1RocketFuel.getFluid(1000))
        .save(provider);

    MIXER_RECIPES.recipeBuilder("sulfuric_acid_coal_tar_oil_to_sulfuric_coal_tar_oil").duration(320).EUt(30)
        .inputFluids(SulfuricAcid.getFluid(8000))
        .inputFluids(CoalTarOil.getFluid(8000))
        .outputFluids(SulfuricCoalTarOil.getFluid(16000))
        .save(provider);

    MIXER_RECIPES.recipeBuilder("ammonia_distilled_water_to_clean_ammonia_solution")
        .inputFluids(Ammonia.getFluid(1000))
        .inputFluids(DistilledWater.getFluid(1000))
        .outputFluids(CleanAmmoniaSolution.getFluid(2000))
        .EUt(480)
        .duration(100)
        .save(provider);

    LARGE_MIXER_RECIPES.recipeBuilder("b27_supplement_ammonium_nitrate_glutamine_bfgf_egf_to_raw_growth_medium")
        .inputFluids(B27Supplement.getFluid(1000))
        .inputFluids(AmmoniumNitrate.getFluid(1000))
        .inputDust(Glutamine, 20)
        .inputFluids(BFGF.getFluid(1000))
        .inputFluids(EGF.getFluid(1000))
        .outputFluids(RawGrowthMedium.getFluid(4000))
        .EUt(480)
        .duration(500)
        .save(provider);

    // TODO migrated disabled: unresolved old test symbol `ULTRASONIC_HOMOGENIZER`.
    //         MIXER_RECIPES.recipeBuilder("blood_cells_distilled_water_to_bacterial_growth_medium")
    //                 .inputFluids(BloodCells.getFluid(1000))
    //                 .notConsumable(ULTRASONIC_HOMOGENIZER.asStack())
    //                 .inputFluids(DistilledWater.getFluid(1000))
    //                 .outputFluids(BacterialGrowthMedium.getFluid(2000))
    //                 .EUt(120)
    //                 .duration(100)
    //                 .save(provider);
    // 
    // 
    //         

// STERILIZED GROWTH MEDIUM ====================================================================================

    MIXER_RECIPES.recipeBuilder("silicon_dioxide_hydrochloric_acid_sodium_hydroxide_steam_to_silica_gel_base")
        .inputDust(SiliconDioxide, 3)
        .inputFluids(HydrochloricAcid.getFluid(1000))
        .inputDust(SodiumHydroxide, 3)
        .inputFluids(Steam.getFluid(1000))
        .outputFluids(SilicaGelBase.getFluid(1000))
        .EUt(120)
        .duration(120)
        .save(provider);

    MIXER_RECIPES.recipeBuilder("silica_gel_alumina_to_silica_alumina_gel")
        .inputDust(SilicaGel, 3)
        .inputDust(Alumina, 5)
        .outputItems(ChemicalHelper.get(dust, SilicaAluminaGel, 8))
        .EUt(30)
        .duration(60)
        .save(provider);

    MIXER_RECIPES.recipeBuilder("zeolite_sieving_pellets_ethanol_to_ethanol100_wet_zeolite_sieving_pellets")
        .inputDust(ZeoliteSievingPellets)
        .inputFluids(Ethanol.getFluid(1000))
        .outputFluids(Ethanol100.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, WetZeoliteSievingPellets))
        .EUt(120)
        .duration(100)
        .save(provider);

    MIXER_RECIPES.recipeBuilder("hydrogen_peroxide_sulfuric_acid_to_piranha_solution")
        .inputFluids(HydrogenPeroxide.getFluid(1000))
        .inputFluids(SulfuricAcid.getFluid(1000))
        .outputFluids(PiranhaSolution.getFluid(2000))
        .EUt(30)
        .duration(50)
        .save(provider);

    MIXER_RECIPES.recipeBuilder("raw_growth_medium_sulfanilamide_to_sterile_growth_medium")
        .inputFluids(RawGrowthMedium.getFluid(1000))
        .inputFluids(Sulfanilamide.getFluid(250))
        .outputFluids(SterileGrowthMedium.getFluid(1250))
        .EUt(7680)
        .duration(100)
        .save(provider);


    // STEM CELLS ==================================================================================================

    MIXER_RECIPES.recipeBuilder("meat_distilled_water_to_animal_cells")
        .inputDust(Meat)
        .inputFluids(DistilledWater.getFluid(1000))
        .outputFluids(AnimalCells.getFluid(1000))
        .EUt(480)
        .duration(100)
        .save(provider);

    // TODO migrated disabled: unresolved old test symbol `ULTRASONIC_HOMOGENIZER`.
    // 
    //         MIXER_RECIPES.recipeBuilder("list_allmushroom_to_chitin")
    //                 .notConsumable(ULTRASONIC_HOMOGENIZER.asStack())
    //                 .inputItems("listAllmushroom", 1)
    //                 .outputFluids(Chitin.getFluid(100))
    //                 .EUt(30)
    //                 .duration(100)
    //                 .save(provider);
    // 
    //         MIXER_RECIPES.recipeBuilder("brown_mushroom_to_chitin")
    //                 .notConsumable(ULTRASONIC_HOMOGENIZER.asStack())
    //                 .inputItems(new ItemStack(Blocks.BROWN_MUSHROOM))
    //                 .outputFluids(Chitin.getFluid(100))
    //                 .EUt(30)
    //                 .duration(100)
    //                 .save(provider);
    // 
    //         MIXER_RECIPES.recipeBuilder("red_mushroom_to_chitin")
    //                 .notConsumable(ULTRASONIC_HOMOGENIZER.asStack())
    //                 .inputItems(new ItemStack(Blocks.RED_MUSHROOM))
    //                 .outputFluids(Chitin.getFluid(100))
    //                 .EUt(30)
    //                 .duration(100)
    //                 .save(provider);
    // 
    //         

    MIXER_RECIPES.recipeBuilder("gene_plasmids_chitosan_to_gene_therapy_fluid")
        .inputFluids(GenePlasmids.getFluid(1000))
        .inputFluids(Chitosan.getFluid(1000))
        .outputFluids(GeneTherapyFluid.getFluid(2000))
        .EUt(7680)
        .duration(25)
        .save(provider);


    // ZnS + C + H2O = [ZnS + C + H2O]
    MIXER_RECIPES.recipeBuilder("sphalerite_coke_distilled_water_to_zinc_coke_pellets").duration(50).EUt(120)
        .inputDust(Sphalerite)
        .inputDust(Coke)
        .inputFluids(DistilledWater.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, ZincCokePellets, 3))
        .save(provider);

    // Fine Zinc Slag Dust + H2O = Zinc Slag Slurry [Contains: Fine Zinc Slag Dust + H2O]
    MIXER_RECIPES.recipeBuilder("fine_zinc_slag_distilled_water_to_zinc_slag_slurry").duration(80).EUt(30)
        .inputDust(FineZincSlag)
        .inputFluids(DistilledWater.getFluid(1000))
        .outputFluids(ZincSlagSlurry.getFluid(1000))
        .save(provider);

    // C6H12O + HSCN = [C6H12O + HSCN]
    MIXER_RECIPES.recipeBuilder("methyl_isobutyl_ketone_thiocyanic_acid_to_zr_hf_separation_mix").duration(80).EUt(120)
        .inputFluids(MethylIsobutylKetone.getFluid(1000))
        .inputFluids(ThiocyanicAcid.getFluid(1000))
        .outputFluids(ZrHfSeparationMix.getFluid(2000))
        .save(provider);

    MIXER_RECIPES.recipeBuilder("ortho_xylene_zeolite_to_ortho_xylene_zeolite_mixture")
        .inputFluids(OrthoXylene.getFluid(1000))
        .inputDust(Zeolite)
        .outputFluids(OrthoXyleneZeoliteMixture.getFluid(1000))
        .EUt(480)
        .duration(50)
        .save(provider);

    // Au + Pd + C -> AuPdC
    MIXER_RECIPES.recipeBuilder("gold_pd_c_catalyst_to_au_pd_c_catalyst")
        .inputDust(Gold)
        .inputDust(PdCCatalyst, 2)
        .outputItems(ChemicalHelper.get(dust, AuPdCCatalyst, 3))
        .EUt(2000000)
        .duration(60)
        .save(provider);
  }

}
