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
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.CHEMICAL_BATH_RECIPES;

public class ChemicalBath {
  public static void init(Consumer<FinishedRecipe> provider) {
    // Ca5(PO4)3Cl + H2SO4 -> 5 CaS(H2O)2O4 + [3 H3PO4 + HCl + ? + ?]
    CHEMICAL_BATH_RECIPES.recipeBuilder("apatite_acidic_leach").duration(260).EUt(500)
        .inputDust(Apatite, 9)
        .inputFluids(SulfuricAcid.getFluid(5000))
        .outputDust(Gypsum, 40)
        .outputFluids(ApatiteAcidicLeach.getFluid(4000))
        .save(provider);

    // Ca5(PO4)3Cl + H2SO4 -> 5 CaS(H2O)2O4 + [3 H3PO4 + HCl + ? + ?]
    CHEMICAL_BATH_RECIPES.recipeBuilder("fluoroapatite_acidic_leach").duration(260).EUt(500)
        .inputDust(FluoroApatite, 9)
        .inputFluids(SulfuricAcid.getFluid(5000))
        .outputDust(Gypsum, 40)
        .outputFluids(FluoroapatiteAcidicLeach.getFluid(4000))
        .save(provider);

    // 3 K4Fe(CN)6 + 4 FeCl3 -> Fe7(CN)18 + 12 KCl
    CHEMICAL_BATH_RECIPES.recipeBuilder("prussian_blue").duration(300).EUt(720)
        .outputDust(PotassiumFerrocyanide, 51)
        .inputFluids(IronChloride.getFluid(4000))
        .outputDust(PrussianBlue, 43)
        .outputDust(RockSalt, 24)
        .save(provider);
    testRecipes(provider);
  }

  private static void testRecipes(Consumer<FinishedRecipe> provider) {
    // TODO migrated disabled: unresolved old test symbol `ACRYLIC_YARN`.
    //     // Migrated from misc/test recipes.
    //         CHEMICAL_BATH_RECIPES.recipeBuilder("acrylic_yarn_amidoxime_to_heavy_metal_absorbing_yarn").duration(40).EUt(480)
    //                 .inputItems(ACRYLIC_YARN.asStack())
    //                 .inputFluids(Amidoxime.getFluid(100))
    //                 .outputItems(HEAVY_METAL_ABSORBING_YARN.asStack())
    //                 .save(provider);
    // 
    // 
    //         

// C12H22O11 + H2O -> C6H12O6 + C6H12O6
    // Input 2 sugar, 45 is too hard
    CHEMICAL_BATH_RECIPES.recipeBuilder("sugar_water_to_glucose_fructose").duration(300).EUt(480)
        .inputDust(Sugar, 2)
        .inputFluids(Water.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, Glucose, 24))
        .outputItems(ChemicalHelper.get(dust, Fructose, 24))
        .save(provider);


    // PdC73H15NFe + C80H21O2 -> [PdC73H15NFe + C80H21O2]
    CHEMICAL_BATH_RECIPES.recipeBuilder("pcbs_pd_fullerene_matrix_to_fullerene_polymer_matrix")
        .inputFluids(PCBS.getFluid(1000))
        .inputDust(PdFullereneMatrix)
        .outputDust(FullerenePolymerMatrix, 2)
        .EUt(8000000)
        .duration(40)
        .save(provider);

    // TODO migrated disabled: unresolved old test symbol `HIGHLY_INSULATING_FOIL`.
    //         CHEMICAL_BATH_RECIPES.recipeBuilder("peek_polyamide_foil_azafullerene_to_highly_insulating_foil").duration(30).EUt(7680)
    //                 .inputItems(PEEK_POLYAMIDE_FOIL.asStack())
    //                 .inputFluids(Azafullerene.getFluid(10))
    //                 .outputItems(HIGHLY_INSULATING_FOIL.asStack())
    //                 .save(provider);
    // 
    // 
    //         

// Combined Step - Lepidolite
    CHEMICAL_BATH_RECIPES.recipeBuilder("lepidolite_sulfuric_acid_to_lithium_fluoride_potash_aluminium_sulfate").EUt(1920).duration(200)
        .inputDust(Lepidolite, 8)
        .inputFluids(SulfuricAcid.getFluid(3000))
        .outputDust(LithiumFluoride, 4)
        .outputDust(Potash, 3)
        .outputItems(ChemicalHelper.get(dust, AluminiumSulfate, 17))
        .save(provider);


    // Combined Step - Spodumene
    CHEMICAL_BATH_RECIPES.recipeBuilder("spodumene_sulfuric_acid_to_silicon_dioxide_aluminium_sulfate_lithium").EUt(1920).duration(200)
        .inputDust(Spodumene, 8)
        .inputFluids(SulfuricAcid.getFluid(3000))
        .outputDust(SiliconDioxide, 12)
        .outputItems(ChemicalHelper.get(dust, AluminiumSulfate, 17))
        .outputDust(Lithium, 2)
        .save(provider);

    CHEMICAL_BATH_RECIPES.recipeBuilder("fused_columbite_sulfuric_acid_to_leached_columbite_iron_sulfate_sodium_sulfate").duration(240).EUt(30)
        .inputDust(FusedColumbite, 9)
        .inputFluids(SulfuricAcid.getFluid(4000))
        .outputItems(ChemicalHelper.get(dust, LeachedColumbite, 17))
        .outputItems(ChemicalHelper.get(dust, IronSulfate, 12))
        .outputDust(SodiumSulfate, 14)
        .save(provider);


    CHEMICAL_BATH_RECIPES.recipeBuilder("fused_tantalite_sulfuric_acid_to_leached_tantalite_sodium_sulfate_manganese_sulfate").duration(240).EUt(120)
        .inputDust(FusedTantalite, 9)
        .inputFluids(SulfuricAcid.getFluid(4000))
        .outputItems(ChemicalHelper.get(dust, LeachedTantalite, 17))
        .outputDust(SodiumSulfate, 14)
        .outputItems(ChemicalHelper.get(dust, ManganeseSulfate, 12))
        .save(provider);


    // [C10Nb2O20 + NH4] + 2LiNbO4 -> Nanoparticles
    CHEMICAL_BATH_RECIPES.recipeBuilder("lithium_niobate_ammonium_niobium_oxalate_solution_to_lithium_niobate_nanoparticles").duration(260).EUt(491520)
        .inputDust(LithiumNiobate, 12)
        .inputFluids(AmmoniumNiobiumOxalateSolution.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, LithiumNiobateNanoparticles, 3))
        .save(provider);


    // 2Cs + H2O2 -> 2CsOH
    CHEMICAL_BATH_RECIPES.recipeBuilder("caesium_hydrogen_peroxide_to_caesium_hydroxide").duration(180).EUt(120)
        .inputDust(Caesium, 2)
        .inputFluids(HydrogenPeroxide.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, CaesiumHydroxide, 6))
        .save(provider);

    CHEMICAL_BATH_RECIPES.recipeBuilder("hydroxyquinoline_aluminium_to_aluminium_complex").duration(350).EUt(1920)
        .inputFluids(Hydroxyquinoline.getFluid(1000))
        .inputDust(Aluminium)
        .outputItems(ChemicalHelper.get(dust, AluminiumComplex, 19))
        .save(provider);


    // Combined Step - Vanadium Magnetite
    CHEMICAL_BATH_RECIPES.recipeBuilder("vanadium_magnetite_sulfuric_acid_to_vanadium_magnetite_sulfur").EUt(1920).duration(200)
        .inputDust(VanadiumMagnetite, 4)
        .inputFluids(SulfuricAcid.getFluid(3000))
        .outputDust(Vanadium, 2)
        .outputDust(Magnetite, 7)
        .outputDust(Sulfur, 3)
        .save(provider);


    // Graphite + Oxidation Solution = Graphite Oxide + Residue
    CHEMICAL_BATH_RECIPES.recipeBuilder("graphite_graphene_oxidation_solution_to_graphite_oxide_dust").duration(100).EUt(480)
        .inputDust(Graphite, 3)
        .inputFluids(GrapheneOxidationSolution.getFluid(100))
        .outputItems(ChemicalHelper.get(dust, GraphiteOxide))
        .chancedOutput(dust, GrapheneOxidationResidue, 1, 8000)
        .save(provider);


    // Graphene + Oxidation Solution = Graphene Oxide + Residue
    CHEMICAL_BATH_RECIPES.recipeBuilder("graphene_graphene_oxidation_solution_to_graphene_oxide_dust").duration(20).EUt(24)
        .inputDust(Graphene)
        .inputFluids(GrapheneOxidationSolution.getFluid(100))
        .outputItems(ChemicalHelper.get(dust, GrapheneOxide, 3))
        .chancedOutput(dust, GrapheneOxidationResidue, 1, 8000)
        .save(provider);

    CHEMICAL_BATH_RECIPES.recipeBuilder("graphite_oxide_water_to_graphene_oxide").duration(100).EUt(24)
        .inputDust(GraphiteOxide)
        .inputFluids(Water.getFluid(100))
        .outputItems(ChemicalHelper.get(dust, GrapheneOxide, 3))
        .save(provider);

    CHEMICAL_BATH_RECIPES.recipeBuilder("piranha_solution_contaminated_petri_dish_to_petri_dish")
        .inputFluids(PiranhaSolution.getFluid(100))
        .inputItems(CONTAMINATED_PETRI_DISH.asStack())
        .outputItems(PETRI_DISH.asStack())
        .EUt(30)
        .duration(25)
        .save(provider);

    // TODO migrated disabled: unresolved old test symbol `TRIPLET_NEUTRONIUM_SPHERE`.
    // 
    //         CHEMICAL_BATH_RECIPES.recipeBuilder("triplet_neutronium_sphere_free_alpha_gas_to_charged_triplet_neutronium_sphere").duration(200).EUt(50000)
    //                 .inputItems(TRIPLET_NEUTRONIUM_SPHERE.asStack())
    //                 .inputFluids(FreeAlphaGas.getFluid(1000))
    //                 .outputItems(CHARGED_TRIPLET_NEUTRONIUM_SPHERE.asStack())
    //                 .save(provider);
    // 
    // 
    //         

// ZnO + 2H2SO4 = ZnSO4 + ZincLeachingResidue [Contains: (H2O)(H2SO4)]
    CHEMICAL_BATH_RECIPES.recipeBuilder("zincite_sulfuric_acid_to_zinc_sulfate_zinc_leaching_residue").duration(40).EUt(480)
        .inputDust(Zincite, 2)
        .inputFluids(SulfuricAcid.getFluid(2000))
        .outputDust(ZincSulfate, 6)
        .outputItems(ChemicalHelper.get(dust, ZincLeachingResidue))
        .save(provider);

    // Zinc Flue Dust + H2SO4 = Cadmium Zinc Dust [Contains: Cd + Zn + H2SO4]
    CHEMICAL_BATH_RECIPES.recipeBuilder("zinc_flue_sulfuric_acid_to_cadmium_zinc").duration(180).EUt(960)
        .inputDust(ZincFlue)
        .inputFluids(SulfuricAcid.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, CadmiumZinc, 3))
        .save(provider);
  }

}
