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
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.DISTILLATION_RECIPES;

public class DistillationTower {
  public static void init(Consumer<FinishedRecipe> provider) {
    // [C2H7NO + 0.5CO2 + 0.5H2O] -> C2H7NO + 0.5CO2 + 0.5H2O
    DISTILLATION_RECIPES.recipeBuilder("carbonated_ethanolamine_to_ethanolamine_carbon_dioxide_water").duration(100).EUt(120)
        .inputFluids(CarbonatedEthanolamine.getFluid(2000))
        .outputFluids(Ethanolamine.getFluid(1000))
        .outputFluids(CarbonDioxide.getFluid(500))
        .outputFluids(Water.getFluid(500))
        .save(provider);
    testRecipes(provider);
  }

  private static void testRecipes(Consumer<FinishedRecipe> provider) {
    // Migrated from misc/test recipes.

        // CH3NO(H2O) -> CH3NO + H2O
        DISTILLATION_RECIPES.recipeBuilder("wet_formamide_to_water_formamide").duration(200).EUt(120)
                .inputFluids(WetFormamide.getFluid(1000))
                .outputFluids(Water.getFluid(1000))
                .outputFluids(Formamide.getFluid(1000))
                .save(provider);

        DISTILLATION_RECIPES.recipeBuilder("dilute_nitric_acid_to_water_nitric_acid").duration(300).EUt(480)
                .inputFluids(DiluteNitricAcid.getFluid(2000))
                .outputFluids(Water.getFluid(1000))
                .outputFluids(NitricAcid.getFluid(1000))
                .save(provider);

        DISTILLATION_RECIPES.recipeBuilder("amine_mixture_to_trimethylamine_dimethylamine_methylamine").duration(200).EUt(480)
                .inputFluids(AmineMixture.getFluid(2000))
                .outputFluids(Trimethylamine.getFluid(500))
                .outputFluids(Dimethylamine.getFluid(800))
                .outputFluids(Methylamine.getFluid(700))
                .save(provider);


        // [3[C10H16N2O8 + C2H8N2 + 2O] + 8NaCl] -> 8NaCl + 3C10H16N2O8 + 3[C2H8N2 + 2O]
        // 3[C2H8N2 + 2O] -> 3C2H5NO2 + 3NH3
        DISTILLATION_RECIPES.recipeBuilder("edta_solution_to_salt_ammonia_edta_glycine").duration(240).EUt(1920)
                .inputFluids(EDTASolution.getFluid(15000))
                .outputDust(Salt, 16)
                .outputFluids(Ammonia.getFluid(3000))
                .outputFluids(EDTA.getFluid(3000))
                .outputFluids(Glycine.getFluid(3000))
                .save(provider);


        // 2[2CH4 + 5Cl] -> 1.33CH3Cl + 2.17CH2Cl2 + 2.17CHCl3 + 1.33CCl4
        // Not chemically balanced, but is a convenient, not too OP recipe
        DISTILLATION_RECIPES.recipeBuilder("chlorinated_solvents_to_chloromethane_dichloromethane_chloroform_carbon_tetrachloride").duration(240).EUt(1920)
                .inputFluids(ChlorinatedSolvents.getFluid(14000))
                .outputFluids(Chloromethane.getFluid(1330))
                .outputFluids(Dichloromethane.getFluid(2170))
                .outputFluids(Chloroform.getFluid(2170))
                .outputFluids(CarbonTetrachloride.getFluid(1330))
                .save(provider);


        // C6H5BF4N2 -> BF3 + 2N + C6H5F
        DISTILLATION_RECIPES.recipeBuilder("benzenediazonium_tetrafluoroborate_to_boron_fluoride_nitrogen_fluoro_benzene")
                .inputFluids(BenzenediazoniumTetrafluoroborate.getFluid(1000))
                .outputFluids(BoronFluoride.getFluid(1000))
                .outputFluids(Nitrogen.getFluid(2000))
                .outputFluids(FluoroBenzene.getFluid(1000))
                .EUt(500000)
                .duration(100)
                .save(provider);

        DISTILLATION_RECIPES.recipeBuilder("dilute_hexafluorosilicic_acid_to_water_fluorosilicic_acid")
                .inputFluids(DiluteHexafluorosilicicAcid.getFluid(3000))
                .outputFluids(Water.getFluid(2000))
                .outputFluids(FluorosilicicAcid.getFluid(1000))
                .duration(160)
                .EUt(200)
                .save(provider);

        DISTILLATION_RECIPES.recipeBuilder("dilute_hydrofluoric_acid_to_water_hydrofluoric_acid")
                .inputFluids(DiluteHydrofluoricAcid.getFluid(2000))
                .outputFluids(Water.getFluid(1000))
                .outputFluids(HydrofluoricAcid.getFluid(1000))
                .duration(80)
                .EUt(200)
                .save(provider);

        DISTILLATION_RECIPES.recipeBuilder("tritium_hydride_to_helium3_hydride_tritium_hydride")
                .inputFluids(TritiumHydride.getFluid(10000))
                .outputFluids(Helium3Hydride.getFluid(100))
                .outputFluids(TritiumHydride.getFluid(9900))
                .duration(800)
                .EUt(200)
                .save(provider);


        // Liquid Air Distillation =====================================================================================
        DISTILLATION_RECIPES.recipeBuilder("liquid_air_to_nitrogen_oxygen_argon_carbon_dioxide_neon_helium_methane_krypton_hydrogen_xenon").duration(7500).EUt(1920)
                .inputFluids(LiquidAir.getFluid(100000))
                .outputFluids(Nitrogen.getFluid(78000))
                .outputFluids(Oxygen.getFluid(20000))
                .outputFluids(Argon.getFluid(1000))
                .outputFluids(CarbonDioxide.getFluid(500))
                .outputFluids(Neon.getFluid(100))
                .outputFluids(Helium.getFluid(50))
                .outputFluids(Methane.getFluid(20))
                .outputFluids(Krypton.getFluid(10))
                .outputFluids(Hydrogen.getFluid(5))
                .outputFluids(Xenon.getFluid(1))
                .save(provider);


        // Nuclear Process Distillation ================================================================================
        DISTILLATION_RECIPES.recipeBuilder("red_oil_to_ferrite_mixture_hydrazine_rp1_tributyl_phosphate").duration(75).EUt(120)
                .inputFluids(RedOil.getFluid(3000))
                .outputDust(FerriteMixture)
                .outputFluids(Hydrazine.getFluid(1000))
                .outputFluids(RP1.getFluid(1000))
                .outputFluids(TributylPhosphate.getFluid(1000))
                .save(provider);

        DISTILLATION_RECIPES.recipeBuilder("coal_tar_to_coal_tar_oil_kerosene_ethylbenzene_naphtha_anthracene").duration(900).EUt(60)
                .inputFluids(CoalTar.getFluid(1000))
                .outputFluids(CoalTarOil.getFluid(500))
                .outputFluids(Kerosene.getFluid(200))
                .outputFluids(Ethylbenzene.getFluid(150))
                .outputFluids(Naphtha.getFluid(100))
                .outputFluids(Anthracene.getFluid(50))
                .save(provider);

        DISTILLATION_RECIPES.recipeBuilder("resin_to_raw_rubber_turpentine_isoprene")
                .chancedOutput(ChemicalHelper.get(dust, RawRubber, 1), 5000)
                .inputFluids(Resin.getFluid(1000))
                .outputFluids(Turpentine.getFluid(200))
                .outputFluids(Isoprene.getFluid(20))
                .EUt(480)
                .duration(500)
                .save(provider);
  }

}
