package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTItems.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGCasings.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGItems.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.*;

import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.DEHYDRATOR_RECIPES;

public class Dehydrator {
  public static void init(Consumer<FinishedRecipe> provider) {
    // BiVO4(H2O) -> BiVO4 (H2O lost because it is a dehydration step)
    DEHYDRATOR_RECIPES.recipeBuilder("bismuth_vanadate").duration(190).EUt(600)
        .inputFluids(BismuthVanadateSolution.getFluid(1000))
        .outputDust(BismuthVanadate, 6)
        .save(provider);

    // 	C20H16N2O4  -> C20H12N2O2 (2H2O lost)
    DEHYDRATOR_RECIPES.recipeBuilder("dianilineterephthalic_acid_quinacridone").duration(220).EUt(1200)
        .inputDust(DianilineterephthalicAcid, 7)
        .outputDust(Quinacridone, 6)
        .save(provider);

    // Lose water
    // This should not gain water output ever, due to
    // the 1B -> 144mb recipe change with the above recipe.
    DEHYDRATOR_RECIPES.recipeBuilder("polyimide")
        .inputFluids(PolyamicAcid.getFluid(144))
        .outputFluids(Polyimide.getFluid(144))
        .EUt(30)
        .duration(270)
        .save(provider);

    // 2LiOH(H2O) + H2O2 -> Li2O2(H2O) + 3H2O (H2O lost to Dehydrator)
    DEHYDRATOR_RECIPES.recipeBuilder("lithium_peroxide").duration(180).EUt(120)
        .inputFluids(LithiumHydroxideSolution.getFluid(2000))
        .inputFluids(HydrogenPeroxide.getFluid(1000))
        .outputFluids(LithiumPeroxideSolution.getFluid(1000))
        .save(provider);

    // Pt + 4HNO3 + 6HCl -> H2PtCl6 + 4NO2 + 4H2O (H2O lost to dehydrator)
    DEHYDRATOR_RECIPES.recipeBuilder("platinum_nitric_acid_hydrochloric_acid_to_chloro_platinic_acid_nitrogen_dioxide").duration(115).EUt(1920)
        .inputDust(Platinum)
        .inputFluids(NitricAcid.getFluid(4000))
        .inputFluids(HydrochloricAcid.getFluid(6000))
        .outputFluids(ChloroPlatinicAcid.getFluid(1000))
        .outputFluids(NitrogenDioxide.getFluid(4000))
        .save(provider);

    //CH3COONH4 -> CH3CONH2 + H2O (H2O lost in dehydrator)
    DEHYDRATOR_RECIPES.recipeBuilder("ammonium_acetate_to_acetamide")
        .inputDust(AmmoniumAcetate, 12)
        .outputDust(Acetamide, 9)
        .EUt(480)
        .duration(100)
        .save(provider);

    //CH3CONH2 -> CH3CN + H2O (H2O lost in dehydrator)
    DEHYDRATOR_RECIPES.recipeBuilder("acetamide_to_acetonitrile")
        .inputDust(Acetamide, 9)
        .outputDust(Acetonitrile, 6)
        .EUt(480)
        .duration(100)
        .save(provider);

    testRecipes(provider);
  }

  private static void testRecipes(Consumer<FinishedRecipe> provider) {
    // Migrated from misc/test recipes.

    // ? -> UO2(NO3)2
    DEHYDRATOR_RECIPES.recipeBuilder("pure_uranyl_nitrate_solution_to_uranyl_nitrate").duration(120).EUt(30)
        .inputFluids(PureUranylNitrateSolution.getFluid(900))
        .outputItems(ChemicalHelper.get(dust, UranylNitrate, 11))
        .save(provider);

    DEHYDRATOR_RECIPES.recipeBuilder("debrominated_water_to_brine").duration(200).EUt(480)
        .inputFluids(DebrominatedWater.getFluid(1000))
        .outputFluids(Brine.getFluid(100))
        .save(provider);

    DEHYDRATOR_RECIPES.recipeBuilder("salt_water_to_brine").duration(200).EUt(480)
        .circuitMeta(2)
        .inputFluids(SaltWater.getFluid(1000))
        .outputFluids(Brine.getFluid(100))
        .save(provider);

    DEHYDRATOR_RECIPES.recipeBuilder("sea_water_to_brine").duration(200).EUt(480)
        .inputFluids(SeaWater.getFluid(1000))
        .outputFluids(Brine.getFluid(100))
        .save(provider);

    DEHYDRATOR_RECIPES.recipeBuilder("brine_to_concentrated_brine").duration(160).EUt(480)
        .inputFluids(Brine.getFluid(1000))
        .outputFluids(ConcentratedBrine.getFluid(800))
        .save(provider);


    // 2H3BO3 -> 3H2O + B2O3 (H2O lost to dehydrator)
    DEHYDRATOR_RECIPES.recipeBuilder("boric_acid_to_boron_oxide").duration(100).EUt(120)
        .notConsumable(dust, Boron)
        .inputFluids(BoricAcid.getFluid(2000))
        .outputItems(ChemicalHelper.get(dust, BoronOxide, 5))
        .save(provider);


    // B2H6 -> 2B + 6H (H lost to dehydrator)
    DEHYDRATOR_RECIPES.recipeBuilder("diborane_to_boron_2").duration(60).EUt(480)
        .notConsumable(dust, Boron)
        .inputFluids(Diborane.getFluid(1000))
        .outputDust(Boron, 2)
        .save(provider);


    // 12Na2MoO4 + H3PO4 -> Mo12Na3O40P + 10 Na2O + H2O + NaOH (H2O lost to dehydrator)
    DEHYDRATOR_RECIPES.recipeBuilder("sodium_molybdate_phosphoric_acid_to_sodium_phosphomolybdate_sodium_hydroxide_sodium_oxide").duration(180).EUt(1920)
        .inputDust(SodiumMolybdate, 84)
        .inputFluids(PhosphoricAcid.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, SodiumPhosphomolybdate, 56))
        .outputDust(SodiumHydroxide, 3)
        .outputItems(ChemicalHelper.get(dust, SodiumOxide, 30))
        .save(provider);


    // 12Na2WO4 + H3PO4 -> Na3O40PW12 + 10 Na2O + H2O + NaOH (H2O lost to dehydrator)
    DEHYDRATOR_RECIPES.recipeBuilder("sodium_tungstate_phosphoric_acid_to_sodium_phosphotungstate_sodium_hydroxide_sodium_oxide").duration(180).EUt(1920)
        .inputFluids(SodiumTungstate.getFluid(12000))
        .inputFluids(PhosphoricAcid.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, SodiumPhosphotungstate, 56))
        .outputDust(SodiumHydroxide, 3)
        .outputItems(ChemicalHelper.get(dust, SodiumOxide, 30))
        .save(provider);


    // CaCO3, CaSO4(H2O)2, NaCl, KCl
    DEHYDRATOR_RECIPES.recipeBuilder("chilled_brine_to_magnesium_containing_brine_calcite_gypsum_salt_rock_salt").duration(190).EUt(480)
        .inputFluids(ChilledBrine.getFluid(2000))
        .outputFluids(MagnesiumContainingBrine.getFluid(1000))
        .outputDust(Calcite, 5)
        .outputDust(Gypsum, 8)
        .outputDust(Salt, 2)
        .outputDust(RockSalt, 2)
        .save(provider);


    // MgCl2, MgSO4
    DEHYDRATOR_RECIPES.recipeBuilder("magnesium_containing_brine_to_magnesium_chloride_magnesium_sulfate_lithium_chloride_solution").duration(270).EUt(480)
        .inputFluids(MagnesiumContainingBrine.getFluid(1000))
        .outputDust(MagnesiumChloride, 3)
        .outputItems(ChemicalHelper.get(dust, MagnesiumSulfate, 6))
        .outputFluids(LithiumChlorideSolution.getFluid(200))
        .save(provider);


    // Step 3 recovery
    // This step does not directly process Chloroauric Acid, and instead is processing
    // other byproducts from the chain, which are compacted from the older versions of the chain.
    // Cu3? -> 3Cu + Fe + Ni + Ag + Pb
    DEHYDRATOR_RECIPES.recipeBuilder("copper_leach_to_copper_dust").EUt(30).duration(80)
        .inputDust(CopperLeach, 4)
        .outputDust(Copper, 3)
        .chancedOutput(dust, Lead, 1, 1500)
        .chancedOutput(dust, Iron, 1, 1200)
        .chancedOutput(dust, Nickel, 1, 1000)
        .chancedOutput(dust, Silver, 1, 800)
        .save(provider);


    // [LiCl + H2O] = LiCl + H2O (H2O Voided - Dehydrator)
    DEHYDRATOR_RECIPES.recipeBuilder("lithium_chloride_solution_to_chlorine_lithium").duration(180).EUt(120)
        .inputFluids(LithiumChlorideSolution.getFluid(1000))
        .outputFluids(Chlorine.getFluid(1000))
        .outputDust(Lithium)
        .save(provider);

    // TODO migrated disabled: unresolved old test symbol `NUCLEAR_WASTE`.
    // 
    //         DEHYDRATOR_RECIPES.recipeBuilder("nuclear_waste_to_nuclear_waste_lanthanide_a_nuclear_waste_lanthanide_b_nuclear_waste_alkaline_nuclear_waste_heavy_metal_nuclear_waste_metal_a_nuclear_waste_metal_b_nuclear_waste_metal_c_nuclear_waste_reactive_nonmetal_nuclear_waste_metaloid").EUt(32).duration(300)
    //                 .inputItems(NUCLEAR_WASTE.asStack())
    //                 .chancedOutput(NUCLEAR_WASTE_LANTHANIDE_A.asStack(), 1111)
    //                 .chancedOutput(NUCLEAR_WASTE_LANTHANIDE_B.asStack(), 1111)
    //                 .chancedOutput(NUCLEAR_WASTE_ALKALINE.asStack(), 1111)
    //                 .chancedOutput(NUCLEAR_WASTE_HEAVY_METAL.asStack(), 1111)
    //                 .chancedOutput(NUCLEAR_WASTE_METAL_A.asStack(), 1111)
    //                 .chancedOutput(NUCLEAR_WASTE_METAL_B.asStack(), 1111)
    //                 .chancedOutput(NUCLEAR_WASTE_METAL_C.asStack(), 1111)
    //                 .chancedOutput(NUCLEAR_WASTE_REACTIVE_NONMETAL.asStack(), 1111)
    //                 .chancedOutput(NUCLEAR_WASTE_METALOID.asStack(), 1111).save(provider);
    // 
    //         DEHYDRATOR_RECIPES.recipeBuilder("nuclear_waste_heavy_metal_to_mercury_dust").EUt(32).duration(300)
    //                 .inputItems(NUCLEAR_WASTE_HEAVY_METAL.asStack(9))
    //                 .outputFluids(Mercury.getFluid(250 * 9) )
    //                 .chancedOutput(dust, Zinc, 2, 5555)
    //                 .chancedOutput(dust, Gallium, 2, 5555)
    //                 .chancedOutput(dust, Cadmium, 2, 5555)
    //                 .chancedOutput(dust, Indium, 2, 5555)
    //                 .chancedOutput(dust, Tin, 2, 5555)
    //                 .chancedOutput(dust, Thallium, 2, 5555)
    //                 .chancedOutput(dust, Lead, 2, 5555)
    //                 .chancedOutput(dust, Bismuth, 2, 5555)
    //                 .chancedOutput(dust, Polonium, 2, 5555)
    //                 .save(provider);
    // 
    //         DEHYDRATOR_RECIPES.recipeBuilder("nuclear_waste_lanthanide_a_to_dust").EUt(32).duration(300)
    //                 .inputItems(NUCLEAR_WASTE_LANTHANIDE_A.asStack(9))
    //                 .chancedOutput(dust, Dysprosium, 2, 8333)
    //                 .chancedOutput(dust, Holmium, 2, 8333)
    //                 .chancedOutput(dust, Erbium, 2, 8333)
    //                 .chancedOutput(dust, Thulium, 2, 8333)
    //                 .chancedOutput(dust, Ytterbium, 2, 8333)
    //                 .chancedOutput(dust, Lutetium, 2, 8333)
    //                 .save(provider);
    // 
    //         DEHYDRATOR_RECIPES.recipeBuilder("nuclear_waste_lanthanide_b_to_dust").EUt(32).duration(300)
    //                 .inputItems(NUCLEAR_WASTE_LANTHANIDE_B.asStack(9))
    //                 .chancedOutput(dust, Lanthanum, 2, 5555)
    //                 .chancedOutput(dust, Cerium, 2, 5555)
    //                 .chancedOutput(dust, Praseodymium, 2, 5555)
    //                 .chancedOutput(dust, Neodymium, 2, 5555)
    //                 .chancedOutput(dust, Promethium, 2, 5555)
    //                 .chancedOutput(dust, Samarium, 2, 5555)
    //                 .chancedOutput(dust, Europium, 2, 5555)
    //                 .chancedOutput(dust, Gadolinium, 2, 5555)
    //                 .chancedOutput(dust, Terbium, 2, 5555)
    //                 .save(provider);
    // 
    //         DEHYDRATOR_RECIPES.recipeBuilder("nuclear_waste_metal_a_to_dust").EUt(32).duration(300)
    //                 .inputItems(NUCLEAR_WASTE_METAL_A.asStack(9))
    //                 .chancedOutput(dust, Hafnium, 2, 6250)
    //                 .chancedOutput(dust, Tantalum, 2, 6250)
    //                 .chancedOutput(dust, Tungsten, 2, 6250)
    //                 .chancedOutput(dust, Osmium, 2, 6250)
    //                 .chancedOutput(dust, Iridium, 2, 6250)
    //                 .chancedOutput(dust, Platinum, 2, 6250)
    //                 .chancedOutput(dust, Gold, 2, 6250)
    //                 .save(provider);
    // 
    //         DEHYDRATOR_RECIPES.recipeBuilder("nuclear_waste_metal_b_to_dust").EUt(32).duration(300)
    //                 .inputItems(NUCLEAR_WASTE_METAL_B.asStack(9))
    //                 .chancedOutput(dust, Yttrium, 2, 5555)
    //                 .chancedOutput(dust, Zirconium, 2, 5555)
    //                 .chancedOutput(dust, Niobium, 2, 5555)
    //                 .chancedOutput(dust, Molybdenum, 2, 5555)
    //                 .chancedOutput(dust, Technetium, 2, 5555)
    //                 .chancedOutput(dust, Ruthenium, 2, 5555)
    //                 .chancedOutput(dust, Rhodium, 2, 5555)
    //                 .chancedOutput(dust, Palladium, 2, 5555)
    //                 .chancedOutput(dust, Silver, 2, 5555)
    //                 .save(provider);
    // 
    //         DEHYDRATOR_RECIPES.recipeBuilder("nuclear_waste_metal_c_to_iron_cobalt_nickel_copper").EUt(32).duration(300)
    //                 .inputItems(NUCLEAR_WASTE_METAL_C.asStack(9))
    //                 .outputDust(Iron, 2)
    //                 .outputDust(Cobalt, 2)
    //                 .outputDust(Nickel, 2)
    //                 .outputDust(Copper, 2)
    //                 .save(provider);
    // 
    //         DEHYDRATOR_RECIPES.recipeBuilder("nuclear_waste_metaloid_to_dust").EUt(32).duration(300)
    //                 .inputItems(NUCLEAR_WASTE_METALOID.asStack(9))
    //                 .chancedOutput(dust, Germanium, 2, 6250)
    //                 .chancedOutput(dust, Arsenic, 2, 6250)
    //                 .chancedOutput(dust, Antimony, 2, 6250)
    //                 .chancedOutput(dust, Tellurium, 2, 6250)
    //                 .chancedOutput(dust, Astatine, 2, 6250)
    //                 .chancedOutput(dust, Actinium, 2, 6250)
    //                 .save(provider);
    // 
    //         DEHYDRATOR_RECIPES.recipeBuilder("nuclear_waste_alkaline_to_dust").EUt(32).duration(300)
    //                 .inputItems(NUCLEAR_WASTE_ALKALINE.asStack(9))
    //                 .chancedOutput(dust, Rubidium, 2, 6250)
    //                 .chancedOutput(dust, Strontium, 2, 6250)
    //                 .chancedOutput(dust, Caesium, 2, 6250)
    //                 .chancedOutput(dust, Barium, 2, 6250)
    //                 .chancedOutput(dust, Francium, 2, 6250)
    //                 .chancedOutput(dust, Radium, 2, 6250)
    //                 .save(provider);
    // 
    // 
    //         

// LuTmYVO Precipitate + C2H6O -> LuTmYVO Nanoparticles + 3NaCl + (NH4)2CO3 + C3H6
    DEHYDRATOR_RECIPES.recipeBuilder("lu_tm_yvo_precipitate_ethanol100_to_lu_tm_yvo_nanoparticles_salt_ammonium_carbonate_propene").duration(200).EUt(7680)
        .inputDust(LuTmYVOPrecipitate)
        .inputFluids(Ethanol100.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, LuTmYVONanoparticles))
        .outputDust(Salt, 6)
        .outputItems(ChemicalHelper.get(dust, AmmoniumCarbonate, 14))
        .outputFluids(Propene.getFluid(1000))
        .save(provider);


    // NH4CNO -> CH4N2O
    DEHYDRATOR_RECIPES.recipeBuilder("ammonium_cyanate_to_urea").duration(320).EUt(480)
        .inputFluids(AmmoniumCyanate.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, Urea, 8))
        .save(provider);

    DEHYDRATOR_RECIPES.recipeBuilder("deglycerated_soap_to_salt_stearic_acid").duration(160).EUt(2000)
        .inputFluids(DeglyceratedSoap.getFluid(1000))
        .outputDust(Salt, 1)
        .outputFluids(StearicAcid.getFluid(800))
        .save(provider);


    // Br(H2O) -> Br
    DEHYDRATOR_RECIPES.recipeBuilder("damp_bromine_to_bromine")
        .inputFluids(DampBromine.getFluid(1000))
        .outputFluids(Bromine.getFluid(1000))
        .EUt(480)
        .duration(400)
        .save(provider);


    // Na2SeO3 + 2HCl -> 2NaCl + SeO2 + H2O
    DEHYDRATOR_RECIPES.recipeBuilder("selenite_solution_hydrochloric_acid_to_salt_selenium_oxide").duration(240).EUt(480)
        .inputFluids(SeleniteSolution.getFluid(1000))
        .inputFluids(HydrochloricAcid.getFluid(2000))
        .outputDust(Salt, 4)
        .outputItems(ChemicalHelper.get(dust, SeleniumOxide, 3))
        .save(provider);


    // 0.1Prep -> 0.2Titanate, 2:1 ratio
    DEHYDRATOR_RECIPES.recipeBuilder("barium_titanate_preparation_to_barium_titanate").duration(58).EUt(1920)
        .inputFluids(BariumTitanatePreparation.getFluid(100))
        .outputDust(BariumTitanate)
        .save(provider);

    DEHYDRATOR_RECIPES.recipeBuilder("oxidized_residual_solution_to_oxidized_residues_heavy_oxidized_residues")
        .inputFluids(OxidizedResidualSolution.getFluid(2000))
        .outputItems(ChemicalHelper.get(dust, OxidizedResidues))
        .outputItems(ChemicalHelper.get(dust, HeavyOxidizedResidues))
        .duration(80)
        .EUt(3000)
        .save(provider);

    DEHYDRATOR_RECIPES.recipeBuilder("salt_water_to_salt").duration(80).EUt(30)
        .circuitMeta(1)
        .inputFluids(SaltWater.getFluid(1000))
        .outputDust(Salt, 2)
        .save(provider);


    // H2WO4 -> WO3 + H2O (H2O lost to dehydrator)
    DEHYDRATOR_RECIPES.recipeBuilder("tungstic_acid_to_tungsten_trioxide")
        .inputDust(TungsticAcid, 7)
        .outputDust(TungstenTrioxide, 4)
        .EUt(120)
        .duration(150)
        .save(provider);


    // [Cl + 3Na + O + H2SO4] = SiO2 + Al(OH)3 + NaCl + Na2SO4 + H2O (H2O lost to dehydrator)
    DEHYDRATOR_RECIPES.recipeBuilder("vanadium_waste_solution_to_salt_sodium_sulfate_dust").duration(120).EUt(30)
        .inputFluids(VanadiumWasteSolution.getFluid(4000))
        .outputDust(Salt, 2)
        .outputDust(SodiumSulfate, 7)
        .chancedOutput(dust, SiliconDioxide, 3, 5000)
        .chancedOutput(dust, AluminiumHydroxide, 7, 5000)
        .save(provider);


    // 2NH4VO3 = V2O5 + 2NH3 + H2O (H2O lost to dehydrator)
    DEHYDRATOR_RECIPES.recipeBuilder("ammonium_vanadate_to_vanadium_oxide_ammonia").duration(240).EUt(120)
        .inputDust(AmmoniumVanadate, 18)
        .outputItems(ChemicalHelper.get(dust, VanadiumOxide, 7))
        .outputFluids(Ammonia.getFluid(2000))
        .save(provider);

//    // C2(H2O)4C + N(hot) -> N + 3C + 4H2O (H2O lost to dehydrator)
//    DEHYDRATOR_RECIPES.recipeBuilder("coal_hot_nitrogen_to_nitrogen_dehydrated_lignite").duration(190).EUt(120)
//        .inputDust(Coal)
//        .inputFluids(HotNitrogen.getFluid(1000))
//        .outputFluids(Nitrogen.getFluid(1000))
//        .outputItems(ChemicalHelper.get(dust, DehydratedLignite, 3))
//        .save(provider);


// [FeCl3 + C6H12O6] -> [6CO + Fe] + 3Cl + 5H2O + H2 (H2O and H2 lost to dehydrator)
    DEHYDRATOR_RECIPES.recipeBuilder("glucose_iron_solution_to_graphene_iron_plate_chlorine").duration(40).EUt(120)
        .notConsumable(rodLong, YttriumBariumCuprate)
        .inputFluids(GlucoseIronSolution.getFluid(1000))
        .outputItems(GRAPHENE_IRON_PLATE.asStack())
        .outputFluids(Chlorine.getFluid(3000))
        .save(provider);


    // C8H6O4 -> C8H4O3 + H2O (H2O voided - Dehydrator)
    DEHYDRATOR_RECIPES.recipeBuilder("phthalic_acid_to_phthalic_anhydride").duration(600).EUt(120)
        .inputFluids(PhthalicAcid.getFluid(1000))
        .outputDust(PhthalicAnhydride, 15)
        .save(provider);


    // C + 2H + N2H4 = CH3(NH)NH2
    DEHYDRATOR_RECIPES.recipeBuilder("carbon_hydrogen_hydrazine_to_mono_methyl_hydrazine").duration(480).EUt(240)
        .inputDust(Carbon)
        .inputFluids(Hydrogen.getFluid(2000))
        .inputFluids(Hydrazine.getFluid(1000))
        .outputFluids(MonoMethylHydrazine.getFluid(1000))
        .save(provider);

    DEHYDRATOR_RECIPES.recipeBuilder("silica_gel_base_to_silica_gel_salt")
        .inputFluids(SilicaGelBase.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, SilicaGel, 3))
        .outputDust(Salt, 2)
        .EUt(480)
        .duration(125)
        .save(provider);

    DEHYDRATOR_RECIPES.recipeBuilder("wet_zeolite_sieving_pellets_to_zeolite_sieving_pellets")
        .inputDust(WetZeoliteSievingPellets)
        .outputItems(ChemicalHelper.get(dust, ZeoliteSievingPellets))
        .EUt(120)
        .duration(50)
        .save(provider);


    // Indium Hydroxide Concentrate [Contains: In(OH)3] = In(OH)3
    DEHYDRATOR_RECIPES.recipeBuilder("indium_hydroxide_concentrate_to_indium_hydroxide").duration(230).EUt(120)
        .inputFluids(IndiumHydroxideConcentrate.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, IndiumHydroxide, 7))
        .save(provider);


    // 2C2H5OH = (C2H5)2O + H2O (H2O lost to dehydrator)
    DEHYDRATOR_RECIPES.recipeBuilder("ethanol_sulfuric_acid_to_diethylether").duration(120).EUt(750)
        .inputFluids(Ethanol.getFluid(2000))
        .inputFluids(SulfuricAcid.getFluid(0))
        .circuitMeta(1)
        .outputFluids(Diethylether.getFluid(1000))
        .save(provider);


    // [GeCl4 + 4H2O] = 4HCl + GeO2 + 2H2O (lost to dehydrator)
    DEHYDRATOR_RECIPES.recipeBuilder("germanium_chloride_to_hydrochloric_acid_germanium_oxide").duration(60).EUt(1920)
        .inputFluids(GermaniumChloride.getFluid(1000))
        .outputFluids(HydrochloricAcid.getFluid(4000))
        .outputItems(ChemicalHelper.get(dust, GermaniumOxide, 3))
        .save(provider);


    // SiCl4? = SiCl4 + Co + RareEarth
    DEHYDRATOR_RECIPES.recipeBuilder("zircon_chlorinating_residue_to_silicon_chloride_dust").duration(140).EUt(120)
        .inputFluids(ZirconChlorinatingResidue.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, SiliconChloride, 5))
        .chancedOutput(dust, Cobalt, 1, 7500)
        .chancedOutput(dust, RareEarth, 1, 200)
        .save(provider);
  }

}
