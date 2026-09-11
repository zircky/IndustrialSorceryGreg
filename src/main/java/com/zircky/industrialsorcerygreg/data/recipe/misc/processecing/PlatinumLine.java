package com.zircky.industrialsorcerygreg.data.recipe.misc.processecing;

import com.gregtechceu.gtceu.common.data.GTItems;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.*;


public class PlatinumLine {
  public static void init(Consumer<FinishedRecipe> provider) {
    platinumInit(provider);
    palladiumInit(provider);
    rhodiumInit(provider);
    rutheniumInit(provider);
    osmiumInit(provider);

    // Bowieite Ore
    CENTRIFUGE_RECIPES.recipeBuilder("platinum_line_bowieite_processing").duration(984).EUt(VA[MV])
        .inputDust(Bowieite, 5)
        .outputDust(Sulfur, 3)
        .chancedOutput(dust, PlatinumMetallicPowder, 2, 3300)
        .chancedOutput(dust, IrMetalResidue, 2, 3300)
        .chancedOutput(dust, CrudeRhodiumMetal, 2, 3300)
        .save(provider);
  }

  public static void platinumInit(Consumer<FinishedRecipe> provider) {

    // Ir2O4(SiO2)2Au3 -> 2IrO2 + (SiO2)2Au3
    BLAST_RECIPES.recipeBuilder("platinum_line_iridium_dioxide")
        .blastFurnaceTemp(775)
        .inputDust(IrMetalResidue)
        .outputDust(IridiumDioxide, 6)
        .outputDust(SludgeResidue, 5)
        .EUt(VA[MV])
        .duration(200)
        .save(provider);

    // (SiO2)2Au3 -> 2SiO2 + 3Au
    THERMAL_CENTRIFUGE_RECIPES.recipeBuilder("platinum_line_sludge_residue_separation")
        .inputDust(SludgeResidue, 5)
        .outputDust(SiliconDioxide, 6)
        .outputDust(Gold, 3)
        .EUt(10)
        .duration(226)
        .save(provider);

    // 2IrO2 + HCl -> (HCl)2(IrO2)2
    CHEMICAL_RECIPES.recipeBuilder("platinum_line_acidic_iridium_solution")
        .inputDust(IridiumDioxide, 6)
        .inputFluids(HydrochloricAcid.getFluid(2000))
        .outputFluids(AcidicIridiumSolution.getFluid(1000))
        .duration(300)
        .EUt(VA[MV])
        .save(provider);

    // (HCl)2(IrO2)2 + 4NH4Cl -> 4NH3 + 2IrCl3 + 3H2O
    // loses 1 Oxygen
    CHEMICAL_RECIPES.recipeBuilder("platinum_line_iridium_chloride")
        .inputFluids(AcidicIridiumSolution.getFluid(1000))
        .inputFluids(AmmoniumChloride.getFluid(4000))
        .outputFluids(Ammonia.getFluid(4000))
        .outputFluids(Water.getFluid(3000))
        .outputDust(IridiumChloride, 8)
        .duration(300)
        .EUt(VA[MV])
        .save(provider);

    // IrCl3 + 3H -> 3HCl + Ir + (CuNi)
    LARGE_CHEMICAL_RECIPES.recipeBuilder("platinum_line_iridium_from_chloride")
        .inputDust(IridiumChloride, 4)
        .inputFluids(Hydrogen.getFluid(3000))
        .outputFluids(HydrochloricAcid.getFluid(3000))
        .outputDust(MetallicSludgeResidue, 2)
        .outputDust(Iridium)
        .duration(300)
        .EUt(VA[EV])
        .save(provider);

    // Pt[REE] + [HNO3 + HCl] -> Pt[REE] + Ir2[REE]3
    // tiny dust version
    CHEMICAL_RECIPES.recipeBuilder("platinum_line_platinum_concentrate_tiny")
        .circuitMeta(1)
        .inputDust(PlatinumMetallicPowder, 2)
        .inputFluids(AquaRegia.getFluid(1000))
        .outputFluids(PlatinumConcentrate.getFluid(1000))
        .outputItems(dustTiny, PlatinumResidue, 5)
        .EUt(VA[HV])
        .duration(250)
        .save(provider);

    // Pt[REE] + [HNO3 + HCl] -> Pt[REE] + Ir2[REE]3
    // full dust version
    CHEMICAL_RECIPES.recipeBuilder("platinum_line_platinum_concentrate")
        .circuitMeta(9)
        .inputDust(PlatinumMetallicPowder, 18)
        .inputFluids(AquaRegia.getFluid(9000))
        .outputFluids(PlatinumConcentrate.getFluid(9000))
        .outputDust(PlatinumResidue, 5)
        .EUt(VA[HV])
        .duration(2250)
        .save(provider);

    // HNO3 + HCl -> [HNO3 + HCl]
    MIXER_RECIPES.recipeBuilder("platinum_line_aqua_regia")
        .inputFluids(NitricAcid.getFluid(1000))
        .inputFluids(HydrochloricAcid.getFluid(1000))
        .outputFluids(AquaRegia.getFluid(2000))
        .EUt(VA[MV])
        .duration(30)
        .save(provider);

    // [HNO3 + HCl] -> HNO3 + HCl
    CENTRIFUGE_RECIPES.recipeBuilder("platinum_line_aqua_regia_separation")
        .inputFluids(AquaRegia.getFluid(2000))
        .outputFluids(NitricAcid.getFluid(1000))
        .outputFluids(HydrochloricAcid.getFluid(1000))
        .EUt(VA[MV])
        .duration(192) // copied duration from Nitration Mixture
        .save(provider);

    // 2K + 2S + 7O -> K2S2O7
    MIXER_RECIPES.recipeBuilder("platinum_line_potassium_disulfate")
        
        .inputDust(Potassium, 2)
        .inputDust(Sulfur, 2)
        .inputFluids(Oxygen.getFluid(7000))
        .outputDust(PotassiumDisulfate, 11)
        .EUt(96)
        .duration(42)
        .save(provider);

    // Ir2[REE]3 + K2S2O7 + O -> Ir2[REE]2 + K2SO4 + RhSO4
    BLAST_RECIPES.recipeBuilder("platinum_line_leach_residue")
        .inputDust(PlatinumResidue, 5)
        .inputDust(PotassiumDisulfate, 11)
        .inputFluids(Oxygen.getFluid(1000))
        .outputDust(LeachResidue, 4)
        .outputDust(PotassiumSulfate, 7)
        .outputFluids(RhodiumSulfate.getFluid(1000))
        .blastFurnaceTemp(775)
        .EUt(VA[MV])
        .duration(200)
        .save(provider);

    // 3Na2CO3 + 10Ir2[REE]2 + 3O -> 6Ir2O2(SiO2)2Au3[REE] + 3Na2O4Ru + 3CO
    // 10 -> 6 of Leaches is to maintain previous balance
    // probably the worst recipe in the chain, most needing of a rework
    BLAST_RECIPES.recipeBuilder("platinum_line_rarest_metal_residue")
        .inputDust(SodaAsh, 18)
        .inputDust(LeachResidue, 40)
        .inputFluids(Oxygen.getFluid(3000))
        .outputDust(RarestMetalResidue, 6)
        .outputDust(SodiumRuthenate, 21)
        .outputFluids(CarbonMonoxide.getFluid(3000))
        .blastFurnaceTemp(775)
        .EUt(VA[MV])
        .duration(200)
        .save(provider);

    // HCl + 2Ir2O2(SiO2)2Au3[REE] -> OsO4(H2O)(HCl) + 2Ir2O2(SiO2)2Au3
    BLAST_RECIPES.recipeBuilder("platinum_line_acidic_osmium_solution")
        .inputFluids(HydrochloricAcid.getFluid(1000))
        .inputDust(RarestMetalResidue, 2)
        .outputFluids(AcidicOsmiumSolution.getFluid(2000))
        .outputDust(IrMetalResidue, 2)
        .blastFurnaceTemp(775)
        .EUt(VA[MV])
        .duration(100)
        .save(provider);

    // HCl + NH3 -> NH4Cl
    CHEMICAL_RECIPES.recipeBuilder("platinum_line_ammonium_chloride")
        .inputFluids(HydrochloricAcid.getFluid(1000))
        .inputFluids(Ammonia.getFluid(1000))
        .outputFluids(AmmoniumChloride.getFluid(1000))
        .EUt(VA[MV])
        .duration(15)
        .save(provider);

    // This recipe is "good", but its formula is pretty dumb so I'm not gonna bother with it
    // could use a rework eventually
    // tiny dust version
    LARGE_CHEMICAL_RECIPES.recipeBuilder("platinum_line_platinum_salt_tiny")
        .circuitMeta(1)
        .inputFluids(PlatinumConcentrate.getFluid(2000))
        .inputFluids(AmmoniumChloride.getFluid(200))
        .outputItems(dustSmall, PlatinumSalt, 10)
        .outputDust(PlatinumRaw, 2)
        .outputFluids(PalladiumEnrichedAmmonia.getFluid(200))
        .outputFluids(NitricAcid.getFluid(1000))
        .outputFluids(Hydrogen.getFluid(1200))
        .EUt(VA[MV])
        .duration(1200)
        .save(provider);

    // full dust version
    LARGE_CHEMICAL_RECIPES.recipeBuilder("platinum_line_platinum_salt")
        .circuitMeta(9)
        .inputFluids(PlatinumConcentrate.getFluid(8000))
        .inputFluids(AmmoniumChloride.getFluid(800))
        .outputDust(PlatinumSalt, 10)
        .outputDust(PlatinumRaw, 8)
        .outputFluids(PalladiumEnrichedAmmonia.getFluid(800))
        .outputFluids(NitricAcid.getFluid(4000))
        .outputFluids(Hydrogen.getFluid(4800))
        .EUt(VA[MV])
        .duration(4800)
        .save(provider);

    SIFTER_RECIPES.recipeBuilder("platinum_line_refined_platinum_salt")
        .inputDust(PlatinumSalt, 2)
        .chancedOutput(dust, RefinedPlatinumSalt, 2, 9500)
        .EUt(24)
        .duration(300)
        .save(provider);

    BLAST_RECIPES.recipeBuilder("platinum_line_platinum_metallic_powder_from_salt")
        .inputDust(RefinedPlatinumSalt, 2)
        .outputDust(PlatinumMetallicPowder, 2)
        .outputFluids(Chlorine.getFluid(133))
        .EUt(VA[MV])
        .blastFurnaceTemp(775)
        .duration(200)
        .save(provider);

    // PtCl2 + Ca -> Pt + CaCl2
    LARGE_CHEMICAL_RECIPES.recipeBuilder("platinum_line_platinum_from_raw")
        .inputDust(PlatinumRaw, 3)
        .inputDust(Calcium)
        .outputDust(Platinum)
        .outputDust(CalciumChloride, 3)
        .EUt(VA[MV])
        .duration(250)
        .save(provider);
  }

  public static void palladiumInit(Consumer<FinishedRecipe> provider) {

    // NH3 + Pd? -> NH3Pd?
    CHEMICAL_RECIPES.recipeBuilder("platinum_line_palladium_enriched_ammonia")
        .inputFluids(Ammonia.getFluid(1000))
        .inputDust(PalladiumMetallicPowder, 2)
        .outputFluids(PalladiumEnrichedAmmonia.getFluid(1000))
        .EUt(VA[MV])
        .duration(250)
        .save(provider);

    // NH3Pd? -> Pd?
    CHEMICAL_RECIPES.recipeBuilder("platinum_line_palladium_salt")
        .circuitMeta(1)
        .inputFluids(PalladiumEnrichedAmmonia.getFluid(1000))
        .outputDust(PalladiumSalt, 2)
        .EUt(VA[MV])
        .duration(250)
        .save(provider);

    // Pd? -> Pd?
    SIFTER_RECIPES.recipeBuilder("platinum_line_palladium_metallic_powder")
        .inputDust(PalladiumSalt, 2)
        .chancedOutput(dust, PalladiumMetallicPowder, 2, 3500)
        .EUt(VA[HV])
        .duration(300)
        .save(provider);

    // NH3Pd? + Pd? ->
    // tiny dust version
    LARGE_CHEMICAL_RECIPES.recipeBuilder("platinum_line_palladium_raw_tiny")
        .inputFluids(PalladiumEnrichedAmmonia.getFluid(6000))
        .inputDust(PalladiumMetallicPowder, 12)
        .outputItems(dust, PalladiumSalt, 15)
        .outputItems(dust, PalladiumRaw, 8)
        .EUt(VA[HV])
        .duration(250)
        .save(provider);

    // NH3Pd? + Pd? ->
    // full dust version
    LARGE_CHEMICAL_RECIPES.recipeBuilder("platinum_line_palladium_raw")
        .circuitMeta(9)
        .inputFluids(PalladiumEnrichedAmmonia.getFluid(6000))
        .inputDust(PalladiumMetallicPowder, 12)
        .outputDust(PalladiumSalt, 15)
        .outputDust(PalladiumRaw, 8)
        .EUt(VA[MV])
        .duration(1500)
        .save(provider);

    CHEMICAL_RECIPES.recipeBuilder("platinum_line_palladium_from_raw")
        .inputDust(PalladiumRaw, 2)
        .inputFluids(FormicAcid.getFluid(2000))
        .outputFluids(Ammonia.getFluid(3000))
        .outputFluids(AceticAcid.getFluid(1000))
        .outputDust(Palladium, 2)
        .EUt(VA[EV])
        .duration(300)
        .save(provider);
  }

  public static void rhodiumInit(Consumer<FinishedRecipe> provider) {

    // tiny dust version
    CHEMICAL_RECIPES.recipeBuilder("platinum_line_rhodium_sulfate_solution_tiny")
        .circuitMeta(1)
        .inputFluids(RhodiumSulfate.getFluid(3000))
        .inputFluids(Water.getFluid(1000))
        .outputFluids(RhodiumSulfateSolution.getFluid(3000))
        .outputItems(dustTiny, LeachResidue, 4)
        .EUt(VA[MV])
        .duration(400)
        .save(provider);

    // full dust version
    CHEMICAL_RECIPES.recipeBuilder("platinum_line_rhodium_sulfate_solution")
        .circuitMeta(9)
        .inputFluids(RhodiumSulfate.getFluid(27000))
        .inputFluids(Water.getFluid(9000))
        .outputFluids(RhodiumSulfateSolution.getFluid(27000))
        .outputDust(LeachResidue, 4)
        .EUt(VA[MV])
        .duration(3600)
        .save(provider);

    DEHYDRATOR_RECIPES.recipeBuilder("platinum_line_crude_rhodium_metal")
        .inputFluids(RhodiumSulfateSolution.getFluid(1000))
        .inputDust(Zinc)
        .outputDust(ZincSulfate, 6)
        .outputDust(CrudeRhodiumMetal, 2)
        .EUt(VA[MV])
        .duration(300)
        .save(provider);

    // Rh[NaCl] + NaCl -> Rh(NaCl)2
    BLAST_RECIPES.recipeBuilder("platinum_line_rhodium_salt")
        .inputDust(CrudeRhodiumMetal, 2)
        .inputDust(Salt, 2)
        .outputDust(RhodiumSalt, 3)
        .blastFurnaceTemp(775)
        .EUt(VA[MV])
        .duration(300)
        .save(provider);

    // Rh(NaCl)2 + Cl -> Rh(NaCl)2Cl
    MIXER_RECIPES.recipeBuilder("platinum_line_rhodium_salt_solution")
        .inputDust(RhodiumSalt, 3)
        .inputFluids(Chlorine.getFluid(1000))
        .outputFluids(RhodiumSaltSolution.getFluid(1000))
        .EUt(VA[MV])
        .duration(30)
        .save(provider);

    // 2Na + 2HNO3 + O -> 2NaNO3 + H2O
    CHEMICAL_RECIPES.recipeBuilder("platinum_line_sodium_nitrate")
        .inputDust(Sodium, 2)
        .inputFluids(NitricAcid.getFluid(2000))
        .inputFluids(Oxygen.getFluid(1000))
        .outputDust(SodiumNitrate, 10)
        .outputFluids(Water.getFluid(1000))
        .EUt(VHA[MV])
        .duration(8)
        .save(provider);

    // Rh(NaCl)2Cl + NaNO3 + 2NO2 + 2O -> 3NaCl + Rh(NH3)3
    LARGE_CHEMICAL_RECIPES.recipeBuilder("platinum_line_rhodium_nitrate")
        .inputFluids(RhodiumSaltSolution.getFluid(1000))
        .inputFluids(NitrogenDioxide.getFluid(2000))
        .inputFluids(Oxygen.getFluid(2000))
        .inputDust(SodiumNitrate, 5)
        .outputDust(Salt, 6)
        .outputDust(RhodiumNitrate, 13)
        .EUt(VA[MV])
        .duration(300)
        .save(provider);

    // Rh(NH3)3 -> Rh(NH3)3
    SIFTER_RECIPES.recipeBuilder("platinum_line_rhodium_filter_cake")
        .inputDust(RhodiumNitrate, 13)
        .chancedOutput(dust, RhodiumFilterCake, 2, 9500)
        .EUt(VA[MV])
        .duration(600)
        .save(provider);

    // Rh(NH3)3 + 2H2O -> Rh(NH3)3(H2O)2
    MIXER_RECIPES.recipeBuilder("platinum_line_rhodium_filter_cake_solution")
        .inputDust(RhodiumFilterCake, 2)
        .inputFluids(Water.getFluid(2000))
        .outputFluids(RhodiumFilterCakeSolution.getFluid(1000))
        .EUt(VA[MV])
        .duration(300)
        .save(provider);

    // Rh(NH3)2(H2O)2 -> Rh + 2NH3 + 2H2O (H2O lost to dehydrator)
    DEHYDRATOR_RECIPES.recipeBuilder("platinum_line_rhodium_from_filter_cake_solution")
        .inputFluids(RhodiumFilterCakeSolution.getFluid(1000))
        .outputDust(Rhodium)
        .outputFluids(Ammonia.getFluid(2000))
        .EUt(VA[MV])
        .duration(500)
        .save(provider);
  }

  public static void rutheniumInit(Consumer<FinishedRecipe> provider) {

    // Na2O4Ru + 2Cl -> (NaCl)2RuO4
    CHEMICAL_RECIPES.recipeBuilder("platinum_line_ruthenium_tetroxide_solution")
        .inputDust(SodiumRuthenate, 14)
        .inputFluids(Chlorine.getFluid(4000))
        .outputFluids(RutheniumTetroxideSolution.getFluid(2000))
        .EUt(VA[MV])
        .duration(100)
        .save(provider);

    // (NaCl)2RuO4 + H2O -> (NaCl)2RuO4(H2O)
    CRACKING_RECIPES.recipeBuilder("platinum_line_hot_ruthenium_tetroxide_solution")
        .inputFluids(Steam.getFluid(1000))
        .inputFluids(RutheniumTetroxideSolution.getFluid(1000))
        .outputFluids(HotRutheniumTetroxideSolution.getFluid(2000))
        .EUt(VHA[HV])
        .duration(150)
        .save(provider);

    // Multiplying the mixture out
    // (NaCl)2RuO4(H2O) -> 2NaCl + RuO4 + H2O
    DISTILLATION_RECIPES.recipeBuilder("platinum_line_ruthenium_tetroxide_distillation")
        .inputFluids(HotRutheniumTetroxideSolution.getFluid(2000))
        .outputDust(Salt, 4)
        .outputFluids(RutheniumTetroxide.getFluid(1000))
        .outputFluids(Water.getFluid(1000))
        .duration(1500)
        .EUt(VHA[HV])
        .save(provider);

    FLUID_SOLIDFICATION_RECIPES.recipeBuilder("platinum_line_ruthenium_tetroxide_dust")
        .notConsumable(GTItems.SHAPE_MOLD_BALL)
        .inputFluids(RutheniumTetroxide.getFluid(1000))
        .outputDust(RutheniumTetroxide, 5)
        .EUt(VHA[MV])
        .duration(16)
        .save(provider);

    // RuO4 + 8HCl -> 4H2O + 8Cl + Ru
    CHEMICAL_RECIPES.recipeBuilder("platinum_line_ruthenium_from_tetroxide")
        .inputDust(RutheniumTetroxide, 5)
        .inputFluids(HydrochloricAcid.getFluid(8000))
        .outputFluids(Water.getFluid(4000))
        .outputFluids(Chlorine.getFluid(8000))
        .outputDust(Ruthenium)
        .EUt(VA[MV])
        .duration(300)
        .save(provider);
  }

  public static void osmiumInit(Consumer<FinishedRecipe> provider) {

    // OsO4(H2O)(HCl) -> OsO4(H2O) + HCl
    DISTILLATION_RECIPES.recipeBuilder("platinum_line_osmium_solution")
        .inputFluids(AcidicOsmiumSolution.getFluid(2000))
        .outputFluids(OsmiumSolution.getFluid(1000))
        .outputFluids(HydrochloricAcid.getFluid(1000))
        .EUt(VHA[IV])
        .duration(150)
        .save(provider);

    // OsO4(H2O) + 8HCl -> Os + 8Cl + 5H2O
    CHEMICAL_RECIPES.recipeBuilder("platinum_line_osmium_from_solution")
        .inputFluids(OsmiumSolution.getFluid(1000))
        .inputFluids(HydrochloricAcid.getFluid(8000))
        .outputDust(Osmium)
        .outputFluids(Chlorine.getFluid(8000))
        .outputFluids(Water.getFluid(5000))
        .EUt(VA[MV])
        .duration(300)
        .save(provider);

    FLUID_SOLIDFICATION_RECIPES.recipeBuilder("platinum_line_hot_rhodium_plated_palladium")
        .inputItems(ingot, Palladium, 3)
        .inputFluids(Rhodium.getFluid(144))
        .outputItems(ingotHot, RhodiumPlatedPalladium, 4)
        .EUt(VHA[IV])
        .duration(200)
        .save(provider);
  }
  
}
