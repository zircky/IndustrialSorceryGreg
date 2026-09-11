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
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.ELECTROLYZER_RECIPES;

public class Electrolyzer {
  public static void init(Consumer<FinishedRecipe> provider) {
    // 3NaClO -> 2NaCl + NaClO3
    ELECTROLYZER_RECIPES.recipeBuilder("sodium_hypochlorite_from_salt_sodium_chlorate").duration(210).EUt(120)
        .inputDust(SodiumHypochlorite, 9)
        .outputDust(Salt, 4)
        .outputDust(SodiumChlorate, 5)
        .save(provider);

    // Na2O -> 2Na + O
    ELECTROLYZER_RECIPES.recipeBuilder("sodium_oxide_from_sodium_oxygen").duration(240).EUt(30)
        .inputDust(SodiumOxide, 3)
        .outputDust(Sodium, 2)
        .outputFluids(Oxygen.getFluid(1000))
        .save(provider);

    // CdS -> Cd + S
    ELECTROLYZER_RECIPES.recipeBuilder("cadmium_sulfide_from_sulfur_cadmium").duration(320).EUt(500)
        .inputDust(CadmiumSulfide, 2)
        .outputDust(Sulfur)
        .outputDust(Cadmium)
        .save(provider);

    ELECTROLYZER_RECIPES.recipeBuilder("ozone").duration(120).EUt(480)
        .inputFluids(Oxygen.getFluid(6000))
        .outputFluids(Ozone.getFluid(2000))
        .save(provider);

    testRecipes(provider);
  }

  private static void testRecipes(Consumer<FinishedRecipe> provider) {
    // Migrated from misc/test recipes.

    // BaO -> Ba + O
    ELECTROLYZER_RECIPES.recipeBuilder("barium_oxide_to_barium_oxygen").duration(220).EUt(30)
        .inputDust(BariumOxide, 2)
        .outputDust(Barium)
        .outputFluids(Oxygen.getFluid(1000))
        .save(provider);


    // BaCa(CO3)2 -> BaCO3 + CaCO3
    ELECTROLYZER_RECIPES.recipeBuilder("barytocalcite_to_barium_carbonate_calcite").duration(1040).EUt(60)
        .inputDust(Barytocalcite, 10)
        .outputItems(ChemicalHelper.get(dust, BariumCarbonate, 5))
        .outputDust(Calcite, 5)
        .save(provider);


    // B2O3 -> 2B + 3O
    ELECTROLYZER_RECIPES.recipeBuilder("boron_oxide_to_boron_oxygen").duration(400).EUt(120)
        .inputDust(BoronOxide, 5)
        .outputDust(Boron, 2)
        .outputFluids(Oxygen.getFluid(3000))
        .save(provider);


    // LiAlF4 -> AlF3 + LiF
    ELECTROLYZER_RECIPES.recipeBuilder("lithium_aluminium_fluoride_to_aluminium_trifluoride_lithium_fluoride").duration(250).EUt(120)
        .inputDust(LithiumAluminiumFluoride, 6)
        .outputItems(ChemicalHelper.get(dust, AluminiumTrifluoride, 4))
        .outputDust(LithiumFluoride, 2)
        .save(provider);


    // MgSO4 -> Mg + S + 4O
    ELECTROLYZER_RECIPES.recipeBuilder("magnesium_sulfate_to_magnesium_sulfur_oxygen").duration(180).EUt(120)
        .inputDust(MagnesiumSulfate, 6)
        .outputDust(Magnesium)
        .outputDust(Sulfur)
        .outputFluids(Oxygen.getFluid(4000))
        .save(provider);


    // SrO -> Sr + O
    ELECTROLYZER_RECIPES.recipeBuilder("strontium_oxide_to_strontium_oxygen").duration(300).EUt(120)
        .inputDust(StrontiumOxide, 2)
        .outputDust(Strontium)
        .outputFluids(Oxygen.getFluid(1000))
        .save(provider);


    // NH4Cl -> HCl + NH3
    ELECTROLYZER_RECIPES.recipeBuilder("ammonium_chloride_to_hydrochloric_acid_ammonia")
        .inputFluids(AmmoniumChloride.getFluid(1000))
        .outputFluids(HydrochloricAcid.getFluid(1000))
        .outputFluids(Ammonia.getFluid(1000))
        .duration(200)
        .EUt(120)
        .save(provider);


    // C4H4BrNO2 -> HBr + NO2 + 4C + 3H
    ELECTROLYZER_RECIPES.recipeBuilder("bromosuccinimide_to_carbon_hydrogen_hydrobromic_acid_nitrogen_dioxide")
        .inputDust(Bromosuccinimide, 12)
        .outputDust(Carbon, 4)
        .outputFluids(Hydrogen.getFluid(3000))
        .outputFluids(HydrobromicAcid.getFluid(1000))
        .outputFluids(NitrogenDioxide.getFluid(1000))
        .duration(158)
        .EUt(120)
        .save(provider);


    // KCN -> K + C + N
    ELECTROLYZER_RECIPES.recipeBuilder("potassium_cyanide_to_potassium_carbon_nitrogen")
        .inputDust(PotassiumCyanide, 3)
        .outputDust(Potassium)
        .outputDust(Carbon)
        .outputFluids(Nitrogen.getFluid(1000))
        .duration(150)
        .EUt(120)
        .save(provider);


    // Step 2 recovery (16 nuggets per PM)
    ELECTROLYZER_RECIPES.recipeBuilder("gold_leach_hydrogen_to_water_copper_dust")
        .inputDust(GoldLeach, 4)
        .inputFluids(Hydrogen.getFluid(1000))
        .outputFluids(Water.getFluid(1000))
        .outputDust(Copper, 3)
        .chancedOutput(dust, Gold, 1, 8888)
        .duration(300)
        .EUt(30)
        .save(provider);


    // K2SO4 -> 2K + S + 4O
    ELECTROLYZER_RECIPES.recipeBuilder("potassium_sulfate_to_potassium_sulfur_oxygen").duration(180).EUt(120)
        .inputDust(PotassiumSulfate, 7)
        .outputDust(Potassium, 2)
        .outputDust(Sulfur)
        .outputFluids(Oxygen.getFluid(4000))
        .save(provider);


    // Al2(SO4)3 = 2Al + 3S + 12O
    ELECTROLYZER_RECIPES.recipeBuilder("aluminium_sulfate_to_aluminium_sulfur_oxygen").duration(180).EUt(120)
        .inputDust(AluminiumSulfate, 17)
        .outputDust(Aluminium, 2)
        .outputDust(Sulfur, 3)
        .outputFluids(Oxygen.getFluid(12000))
        .save(provider);


    // MnSO4 -> Mn + S + 4O
    ELECTROLYZER_RECIPES.recipeBuilder("manganese_sulfate_to_manganese_sulfur_oxygen").duration(120).EUt(500)
        .inputDust(ManganeseSulfate, 6)
        .outputDust(Manganese)
        .outputDust(Sulfur)
        .outputFluids(Oxygen.getFluid(4000))
        .save(provider);

    // FeSO4 -> Fe + S + 4O
    ELECTROLYZER_RECIPES.recipeBuilder("iron_sulfate_to_iron_sulfur_oxygen").duration(400).EUt(120)
        .inputDust(IronSulfate, 6)
        .outputDust(Iron)
        .outputDust(Sulfur)
        .outputFluids(Oxygen.getFluid(4000))
        .save(provider);


// K2NbF7 + 5Na -> 5NaF + 2KF + Nb
    ELECTROLYZER_RECIPES.recipeBuilder("potasssium_fluoro_niobate_sodium_to_sodium_fluoride_potassium_fluoride_niobium").duration(120).EUt(120)
        .inputDust(PotasssiumFluoroNiobate, 10)
        .inputFluids(Sodium.getFluid(720)) // kekw sodium is an ingot
        .outputDust(SodiumFluoride, 10)
        .outputDust(PotassiumFluoride, 4)
        .outputDust(Niobium)
        .save(provider);


    // K2TaF7 + 5Na -> 5NaF + 2KF + Ta
    ELECTROLYZER_RECIPES.recipeBuilder("potasssium_fluoro_tantalate_sodium_to_sodium_fluoride_potassium_fluoride_tantalum").duration(170).EUt(120)
        .inputDust(PotasssiumFluoroTantalate, 10)
        .inputFluids(Sodium.getFluid(720))
        .outputDust(SodiumFluoride, 10)
        .outputDust(PotassiumFluoride, 4)
        .outputDust(Tantalum)
        .save(provider);


    // NaH -> Na + H
    ELECTROLYZER_RECIPES.recipeBuilder("sodium_hydride_to_sodium_hydrogen").duration(240).EUt(30)
        .inputDust(SodiumHydride, 2)
        .outputDust(Sodium)
        .outputFluids(Hydrogen.getFluid(1000))
        .save(provider);


    // NH4NO3 -> NH3 + HNO3
    ELECTROLYZER_RECIPES.recipeBuilder("ammonium_nitrate_to_ammonia_nitric_acid").duration(220).EUt(120)
        .inputFluids(AmmoniumNitrate.getFluid(1000))
        .outputFluids(Ammonia.getFluid(1000))
        .outputFluids(NitricAcid.getFluid(1000))
        .save(provider);


    // [CsBr + H2O] -> CsOH + Br + H
    ELECTROLYZER_RECIPES.recipeBuilder("cesium_bromide_solution_to_bromine_hydrogen_caesium_hydroxide").duration(250).EUt(120)
        .inputFluids(CesiumBromideSolution.getFluid(1000))
        .outputFluids(Bromine.getFluid(1000))
        .outputFluids(Hydrogen.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, CaesiumHydroxide, 3))
        .save(provider);


    // SbF3 -> Sb + 3F
    ELECTROLYZER_RECIPES.recipeBuilder("antimony_trifluoride_to_antimony_fluorine")
        .inputDust(AntimonyTrifluoride, 4)
        .outputDust(Antimony)
        .outputFluids(Fluorine.getFluid(3000))
        .EUt(120)
        .duration(160)
        .save(provider);


    // MgClBr -> Mg + Cl + Br
    ELECTROLYZER_RECIPES.recipeBuilder("mg_cl_bromide_to_magnesium_chlorine_bromine")
        .inputDust(MgClBromide, 3)
        .outputDust(Magnesium)
        .outputFluids(Chlorine.getFluid(1000))
        .outputFluids(Bromine.getFluid(1000))
        .EUt(120)
        .duration(160)
        .save(provider);


    // CuCl2 -> Cu + Cl2
    ELECTROLYZER_RECIPES.recipeBuilder("copper_chloride_to_copper_chlorine")
        .inputDust(CopperChloride, 3)
        .outputDust(Copper)
        .outputFluids(Chlorine.getFluid(2000))
        .EUt(120)
        .duration(100)
        .save(provider);


    // PbCl2 -> Pb + Cl2
    ELECTROLYZER_RECIPES.recipeBuilder("lead_chloride_to_lead_chlorine")
        .inputDust(LeadChloride, 3)
        .outputDust(Lead)
        .outputFluids(Chlorine.getFluid(2000))
        .EUt(120)
        .duration(100)
        .save(provider);


    // BiCl3 -> Bi + 3Cl
    ELECTROLYZER_RECIPES.recipeBuilder("bismuth_chloride_to_bismuth_chlorine")
        .inputDust(BismuthChloride, 4)
        .outputDust(Bismuth)
        .outputFluids(Chlorine.getFluid(3000))
        .EUt(120)
        .duration(100)
        .save(provider);


    // 2Cu + CuH2SO4 -> H2SO4 + 3Cu + TeSe(75%)
    ELECTROLYZER_RECIPES.recipeBuilder("electrically_impure_copper_copper_refining_solution_to_sulfuric_acid_copper_dust").duration(450).EUt(120)
        .inputItems(plate, ElectricallyImpureCopper, 2)
        .inputFluids(CopperRefiningSolution.getFluid(1000))
        .outputFluids(SulfuricAcid.getFluid(1000))
        .outputItems(ingot, Copper, 3)
        .chancedOutput(dust, AnodicSlime, 1, 7500)
        .save(provider);


    // LiI -> Li + I
    ELECTROLYZER_RECIPES.recipeBuilder("lithium_iodide_to_lithium_iodine").duration(224).EUt(30)
        .inputDust(LithiumIodide, 2)
        .outputDust(Lithium)
        .outputDust(Iodine)
        .save(provider);


    // KBr -> K + Br
    ELECTROLYZER_RECIPES.recipeBuilder("potassium_bromide_to_potassium_bromine").duration(224).EUt(30)
        .inputDust(PotassiumBromide, 2)
        .outputDust(Potassium)
        .outputFluids(Bromine.getFluid(1000))
        .save(provider);


    // NaNO3 -> Na + N + 3O
    ELECTROLYZER_RECIPES.recipeBuilder("sodium_nitrate_to_sodium_nitrogen_oxygen").duration(270).EUt(30)
        .inputDust(SodiumNitrate, 5)
        .outputDust(Sodium)
        .outputFluids(Nitrogen.getFluid(1000))
        .outputFluids(Oxygen.getFluid(3000))
        .save(provider);

    ELECTROLYZER_RECIPES.recipeBuilder("purified_iron_carbonyl_to_carbonyl_purified_iron_carbon_monoxide").duration(340).EUt(480)
        .inputFluids(PurifiedIronCarbonyl.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, CarbonylPurifiedIron))
        .outputFluids(CarbonMonoxide.getFluid(5000))
        .save(provider);


    // NaBr -> Na + Br
    ELECTROLYZER_RECIPES.recipeBuilder("sodium_bromide_to_sodium_bromine").duration(260).EUt(120)
        .inputDust(SodiumBromide, 2)
        .outputDust(Sodium)
        .outputFluids(Bromine.getFluid(1000))
        .save(provider);


    // 6I + 6[NaOH + H2O] -> NaIO3 + 5NaI + 9H2O
    ELECTROLYZER_RECIPES.recipeBuilder("iodine_sodium_hydroxide_solution_to_sodium_iodate_sodium_iodide_water").duration(260).EUt(1920)
        .inputDust(Iodine, 6)
        .inputFluids(SodiumHydroxideSolution.getFluid(6000))
        .outputItems(ChemicalHelper.get(dust, SodiumIodate, 5))
        .outputItems(ChemicalHelper.get(dust, SodiumIodide, 10))
        .outputFluids(Water.getFluid(9000))
        .save(provider);


    // 2 H2XeO4 -> 2 Xe + H2O + H2O2 + O3 + 2 O
    ELECTROLYZER_RECIPES.recipeBuilder("xenic_acid_to_xenon_water_ozone_hydrogen_peroxide_oxygen")
        .inputFluids(XenicAcid.getFluid(2000))
        .outputFluids(Xenon.getFluid(2000))
        .outputFluids(Water.getFluid(1000))
        .outputFluids(Ozone.getFluid(1000))
        .outputFluids(HydrogenPeroxide.getFluid(1000))
        .outputFluids(Oxygen.getFluid(2000))
        .duration(120)
        .EUt(500)
        .save(provider);


    // [? + SO4] -> Pb + 0.111Ra + 0.111Sr + H2SO4
    // Lead is okay here because of uranium decay
    ELECTROLYZER_RECIPES.recipeBuilder("uranium_sulfate_waste_solution_to_sulfuric_acid_lead_dust").duration(200).EUt(480)
        .inputFluids(UraniumSulfateWasteSolution.getFluid(1000))
        .outputFluids(SulfuricAcid.getFluid(1000))
        .outputDust(Lead)
        .chancedOutput(dust, Radium, 1, 1111)
        .chancedOutput(dust, Strontium, 1, 1111)
        .chancedOutput(dust, Barium, 1, 1111)
        .save(provider);


    // [? + C + H2SO4] -> H2SO4 + CsOH + MoO3 + V2O5 (carbon voided, multiplied by 20 for game balance)
    ELECTROLYZER_RECIPES.recipeBuilder("uranium_refinement_waste_solution_to_sulfuric_acid_caesium_hydroxide_molybdenum_trioxide_vanadium_oxide").duration(200).EUt(1920)
        .inputFluids(UraniumRefinementWasteSolution.getFluid(20000))
        .outputFluids(SulfuricAcid.getFluid(20000))
        .outputItems(ChemicalHelper.get(dust, CaesiumHydroxide, 3))
        .outputItems(ChemicalHelper.get(dust, MolybdenumTrioxide, 4))
        .outputItems(ChemicalHelper.get(dust, VanadiumOxide, 7))
        .save(provider);


    // KOH -> K + O + H
    ELECTROLYZER_RECIPES.recipeBuilder("potassium_hydroxide_to_potassium_hydrogen_oxygen").duration(100).EUt(120)
        .inputFluids(PotassiumHydroxide.getFluid(1000))
        .outputDust(Potassium)
        .outputFluids(Hydrogen.getFluid(1000))
        .outputFluids(Oxygen.getFluid(1000))
        .save(provider);


    // CsOH -> Cs + O + H
    ELECTROLYZER_RECIPES.recipeBuilder("caesium_hydroxide_to_caesium_hydrogen_oxygen").duration(100).EUt(120)
        .inputDust(CaesiumHydroxide, 3)
        .outputDust(Caesium)
        .outputFluids(Hydrogen.getFluid(1000))
        .outputFluids(Oxygen.getFluid(1000))
        .save(provider);


    // [UO3â€¢H2O2 + ThO2] -> [UO2 + ThO2] + H2O + 2O
    ELECTROLYZER_RECIPES.recipeBuilder("uranium_peroxide_thorium_oxide_to_uranium_thorium_oxide_hydrogen_peroxide_oxygen").duration(100).EUt(30)
        .inputDust(UraniumPeroxideThoriumOxide, 8)
        .outputItems(ChemicalHelper.get(dust, UraniumThoriumOxide, 6))
        .outputFluids(HydrogenPeroxide.getFluid(1000))
        .outputFluids(Oxygen.getFluid(1000))
        .save(provider);


    // [H2O + Th(NO3)4] + 2Na -> ThO + 2NaNO3 + 2HNO3
    // TODO migrated disabled: unresolved old test symbol `oxide`.
    //         ELECTROLYZER_RECIPES.recipeBuilder("sodium_thorium_nitrate_solution_to_thorium_sodium_nitrate_nitric_acid").duration(150).EUt(120)
    //                 .inputDust(Sodium, 2)
    //                 .inputFluids(ThoriumNitrateSolution.getFluid(1000))
    //                 .outputItems(oxide, Thorium, 2)
    //                 .outputDust(SodiumNitrate, 10)
    //                 .outputFluids(NitricAcid.getFluid(2000))
    //                 .save(provider);
    // 
    // 
    //         

// ZrCl4 -> Zr + 4Cl
    ELECTROLYZER_RECIPES.recipeBuilder("zirconium_tetrachloride_to_zirconium_chlorine").duration(100).EUt(120)
        .inputDust(ZirconiumTetrachloride, 5)
        .outputDust(Zirconium)
        .outputFluids(Chlorine.getFluid(4000))
        .save(provider);


    // SiF4 -> Si + 4F
    ELECTROLYZER_RECIPES.recipeBuilder("silicon_fluoride_to_silicon_fluorine").duration(100).EUt(120)
        .inputFluids(SiliconFluoride.getFluid(1000))
        .outputDust(Silicon)
        .outputFluids(Fluorine.getFluid(4000))
        .save(provider);


    // CF4 -> C + 4F
    ELECTROLYZER_RECIPES.recipeBuilder("carbon_fluoride_to_carbon_fluorine").duration(100).EUt(120)
        .inputFluids(CarbonFluoride.getFluid(1000))
        .outputDust(Carbon)
        .outputFluids(Fluorine.getFluid(4000))
        .save(provider);


    // LiCl -> Li + Cl
    ELECTROLYZER_RECIPES.recipeBuilder("lithium_chloride_to_chlorine_lithium").duration(110).EUt(120)
        .inputDust(LithiumChloride, 2)
        .outputFluids(Chlorine.getFluid(1000))
        .outputDust(Lithium)
        .save(provider);


    // NaHCO3 -> NaOH + CO2
    ELECTROLYZER_RECIPES.recipeBuilder("sodium_bicarbonate_to_sodium_hydroxide_carbon_dioxide").duration(145).EUt(120)
        .inputDust(SodiumBicarbonate, 6)
        .outputDust(SodiumHydroxide, 3)
        .outputFluids(CarbonDioxide.getFluid(1000))
        .save(provider);


    // [Fine Zinc Slag Dust + H2O] = Metal Rich Slag Slurry [Contains: H2O] + Zinc ResidualS lag
    ELECTROLYZER_RECIPES.recipeBuilder("zinc_slag_slurry_to_metal_rich_slag_slurry_dust").duration(130).EUt(30)
        .inputFluids(ZincSlagSlurry.getFluid(1000))
        .outputFluids(MetalRichSlagSlurry.getFluid(1000))
        .chancedOutput(dust, ZincResidualSlag, 1, 2500)
        .save(provider);


    // Na2HPO4 = H + 4O + P + 2Na
    ELECTROLYZER_RECIPES.recipeBuilder("disodium_phosphate_to_hydrogen_oxygen_phosphorus_sodium").duration(50).EUt(120)
        .inputDust(DisodiumPhosphate, 8)
        .outputFluids(Hydrogen.getFluid(1000))
        .outputFluids(Oxygen.getFluid(4000))
        .outputDust(Phosphorus)
        .outputDust(Sodium, 2)
        .save(provider);


    // Metal Hydroxide Mix = 0.25Zn + Zinc Poor Mix
    //
    // People were regularly confused about these three recipes, as it essentially just gave 0.5 of the metal per
    // recipe, so I changed it to not consume the fine wire, and output 2 Small Dusts of the metal instead.
    ELECTROLYZER_RECIPES.recipeBuilder("metal_hydroxide_mix_to_dust_zinc_poor_mix").duration(130).EUt(120)
        .inputFluids(MetalHydroxideMix.getFluid(1000))
        .notConsumable(wireFine, Zinc)
        .chancedOutput(dust, Zinc, 1, 5000)
        .outputFluids(ZincPoorMix.getFluid(1000))
        .save(provider);


    // Zinc Poor Mix = 0.25Fe + Iron Poor Mix
    ELECTROLYZER_RECIPES.recipeBuilder("zinc_poor_mix_to_dust_iron_poor_mix").duration(130).EUt(120)
        .inputFluids(ZincPoorMix.getFluid(1000))
        .notConsumable(wireFine, Iron)
        .chancedOutput(dust, Iron, 1, 5000)
        .outputFluids(IronPoorMix.getFluid(1000))
        .save(provider);


    // Iron Poor Mix = 0.25Cu + Indium Hydroxide Concentrate [Contains: In(OH)3]
    ELECTROLYZER_RECIPES.recipeBuilder("iron_poor_mix_to_dust_indium_hydroxide_concentrate").duration(50).EUt(480)
        .inputFluids(IronPoorMix.getFluid(1000))
        .notConsumable(wireFine, Copper)
        .chancedOutput(dust, Copper, 1, 5000)
        .outputFluids(IndiumHydroxideConcentrate.getFluid(1000))
        .save(provider);


    // 9 Cadmium Sulfate Solution [Contains: CdSO4] = 9 H2SO4 + Cd
    ELECTROLYZER_RECIPES.recipeBuilder("cadmium_sulfate_solution_to_sulfuric_acid_cadmium").duration(110).EUt(120)
        .inputFluids(CadmiumSulfateSolution.getFluid(9000))
        .outputFluids(SulfuricAcid.getFluid(9000))
        .outputDust(Cadmium)
        .save(provider);


    // ZnCl2 = Zn + 2Cl
    ELECTROLYZER_RECIPES.recipeBuilder("zinc_chloride_to_zinc_chlorine").duration(150).EUt(120)
        .inputDust(ZincChloride, 3)
        .outputDust(Zinc)
        .outputFluids(Chlorine.getFluid(2000))
        .save(provider);


    // SiCl4 = Si + 4Cl
    ELECTROLYZER_RECIPES.recipeBuilder("silicon_chloride_to_silicon_chlorine").duration(240).EUt(120)
        .inputDust(SiliconChloride, 5)
        .outputDust(Silicon)
        .outputFluids(Chlorine.getFluid(4000))
        .save(provider);


    // NH4Cl = NH3 + HCl
    ELECTROLYZER_RECIPES.recipeBuilder("ammonium_chloride_to_ammonia_hydrochloric_acid").duration(160).EUt(120)
        .inputFluids(AmmoniumChloride.getFluid(1000))
        .outputFluids(Ammonia.getFluid(1000))
        .outputFluids(HydrochloricAcid.getFluid(1000))
        .save(provider);

    ELECTROLYZER_RECIPES.recipeBuilder("ammonium_sulfate_to_ammonia_sulfuric_acid").duration(80).EUt(120)
        .inputFluids(AmmoniumSulfate.getFluid(1000))
        .outputFluids(Ammonia.getFluid(2000))
        .outputFluids(SulfuricAcid.getFluid(1000))
        .save(provider);


    // C2H3NaO2 -> NaOH + C2H2O
    ELECTROLYZER_RECIPES.recipeBuilder("sodium_acetate_to_sodium_hydroxide_ethenone").duration(80).EUt(120)
        .inputFluids(SodiumAcetate.getFluid(1000))
        .outputDust(SodiumHydroxide, 3)
        .outputFluids(Ethenone.getFluid(1000))
        .save(provider);
  }

}
