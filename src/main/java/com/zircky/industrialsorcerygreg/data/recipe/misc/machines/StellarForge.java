package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTItems.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGCasings.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGItems.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.*;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.UIV;
import static com.gregtechceu.gtceu.api.GTValues.VH;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.plate;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.STELLAR_FORGE_RECIPES;

public class StellarForge {
  public static void init(Consumer<FinishedRecipe> provider) {
    STELLAR_FORGE_RECIPES.recipeBuilder("quark_gluon_plasma_from_degenerate_rhenium_dust")
        .inputDust(ElectronDegenerateRhenium)
        .circuitMeta(1)
        .outputFluids(QuarkGluon.getFluid(FluidStorageKeys.PLASMA, 4000))
        .duration(60).EUt(VH[UIV])
        .save(provider);

    STELLAR_FORGE_RECIPES.recipeBuilder("quark_gluon_plasma_from_degenerate_rhenium_plate")
        .inputItems(plate, ElectronDegenerateRhenium)
        .circuitMeta(2)
        .outputFluids(QuarkGluon.getFluid(FluidStorageKeys.PLASMA, 2000))
        .duration(60).EUt(VH[UIV])
        .save(provider);


    testRecipes(provider);
  }

  private static void testRecipes(Consumer<FinishedRecipe> provider) {
    // TODO migrated disabled: unresolved old test symbol `GAExplosive`.
    //     // Migrated from misc/test recipes.
    // 
    //         // AcH3 + 9H -> AcH12 (multiplied by 18)
    //         STELLAR_FORGE_RECIPES.recipeBuilder("naquadria_charge_actinium_hydride_hydrogen_to_actinium_superhydride_plasma").duration(260).EUt(7800000)
    //                 .inputItems(GAMetaBlocks.EXPLOSIVE.getItemVariant(GAExplosive.ExplosiveType.NAQUADRIA_CHARGE))
    //                 .inputDust(ActiniumHydride, 72)
    //                 .inputFluids(Hydrogen.getFluid(162000))
    //                 .outputFluids(ActiniumSuperhydridePlasma.getFluid(72000))
    //                 .save(provider);
    // 
    //         STELLAR_FORGE_RECIPES.recipeBuilder("ingot_rhenium_naquadria_charge_to_electron_degenerate_rhenium_plasma")
    //                 .inputItems(ingot, Rhenium)
    //                 .inputItems(GAMetaBlocks.EXPLOSIVE.getItemVariant(GAExplosive.ExplosiveType.NAQUADRIA_CHARGE))
    //                 .outputFluids(ElectronDegenerateRheniumPlasma.getFluid(1000))
    //                 .EUt(1966080)
    //                 .duration(20)
    //                 .save(provider);
    // 
    //         STELLAR_FORGE_RECIPES.recipeBuilder("plate_dense_rhenium_naquadria_charge_to_electron_degenerate_rhenium_plasma")
    //                 .inputItems(plateDense, Rhenium)
    //                 .inputItems(GAMetaBlocks.EXPLOSIVE.getItemVariant(GAExplosive.ExplosiveType.NAQUADRIA_CHARGE))
    //                 .outputFluids(ElectronDegenerateRheniumPlasma.getFluid(10000))
    //                 .EUt(1966080 * 4)
    //                 .duration(100)
    //                 .save(provider);
    // 
    //         STELLAR_FORGE_RECIPES.recipeBuilder("superheavy_block_taranium_charge_to_neutron_plasma")
    //                 .inputItems(GAMetaBlocks.SIMPLE_BLOCK.getItemVariant(GASimpleBlock.BlockType.SUPERHEAVY_BLOCK))
    //                 .inputItems(GAMetaBlocks.EXPLOSIVE.getItemVariant(GAExplosive.ExplosiveType.TARANIUM_CHARGE))
    //                 .outputFluids(NeutronPlasma.getFluid(1000))
    //                 .EUt(100000000)
    //                 .duration(10)
    //                 .save(provider);
    // 
    //         STELLAR_FORGE_RECIPES.recipeBuilder("neutronium_heavy_quark_degenerate_matter_qcd_charge_heavy_lepton_mix_gluons_periodicium_to_dense_neutron_plasma").duration(10).EUt(125000000)
    //                 .inputItems(block, Neutronium, 5)
    //                 .inputItems(block, HeavyQuarkDegenerateMatter, 5)
    //                 .inputItems(GAMetaBlocks.EXPLOSIVE.getItemVariant(GAExplosive.ExplosiveType.QCD_CHARGE))
    //                 .inputFluids(HeavyLeptonMix.getFluid(6000))
    //                 .inputFluids(Gluons.getFluid(6000))
    //                 .inputFluids(Periodicium.getFluid(2736))
    //                 .outputFluids(DenseNeutronPlasma.getFluid(18000))
    //                 .save(provider);
    // 
    //         STELLAR_FORGE_RECIPES.recipeBuilder("dense_neutron_plasma_cell_qcd_charge_to_cosmic_neutron_plasma_cell").duration(10).EUt(125000000)
    //                 .inputItems(DENSE_NEUTRON_PLASMA_CELL.asStack())
    //                 .inputItems(GAMetaBlocks.EXPLOSIVE.getItemVariant(GAExplosive.ExplosiveType.QCD_CHARGE,2))
    //                 .outputItems(COSMIC_NEUTRON_PLASMA_CELL.asStack())
    //                 .save(provider);
    // 
    //         STELLAR_FORGE_RECIPES.recipeBuilder("highly_dense_polymer_plate_qcd_charge_to_cosmic_mesh_plasma").duration(10).EUt(100000000)
    //                 .inputItems(HIGHLY_DENSE_POLYMER_PLATE.asStack())
    //                 .inputItems(GAMetaBlocks.EXPLOSIVE.getItemVariant(GAExplosive.ExplosiveType.QCD_CHARGE))
    //                 .outputFluids(CosmicMeshPlasma.getFluid(1000))
    //                 .save(provider);
    // 
    //         STELLAR_FORGE_RECIPES.recipeBuilder("cosmic_fabric_qcd_charge_to_cosmic_mesh_plasma").duration(10).EUt(10000000)
    //                 .inputItems(COSMIC_FABRIC.asStack())
    //                 .circuitMeta(1)
    //                 .inputItems(GAMetaBlocks.EXPLOSIVE.getItemVariant(GAExplosive.ExplosiveType.QCD_CHARGE))
    //                 .outputFluids(CosmicMeshPlasma.getFluid(1000))
    //                 .save(provider);
    // 
    //         STELLAR_FORGE_RECIPES.recipeBuilder("cosmic_mesh_qcd_charge_to_cosmic_mesh_plasma").duration(10).EUt(10000000)
    //                 .inputItems(COSMIC_MESH.asStack())
    //                 .circuitMeta(1)
    //                 .inputItems(GAMetaBlocks.EXPLOSIVE.getItemVariant(GAExplosive.ExplosiveType.QCD_CHARGE))
    //                 .outputFluids(CosmicMeshPlasma.getFluid(1000))
    //                 .save(provider);
    // 
    //         STELLAR_FORGE_RECIPES.recipeBuilder("taranium_charge_time_dilation_containment_unit_charged_triplet_neutronium_sphere_to_contained_reissner_nordstrom_singularity").duration(200).EUt(288566)
    //                 .inputItems(GAMetaBlocks.EXPLOSIVE.getItemVariant(GAExplosive.ExplosiveType.TARANIUM_CHARGE))
    //                 .inputItems(TIME_DILATION_CONTAINMENT_UNIT.asStack(64))
    //                 .inputItems(CHARGED_TRIPLET_NEUTRONIUM_SPHERE.asStack(64))
    //                 .outputItems(CONTAINED_REISSNER_NORDSTROM_SINGULARITY.asStack(64))
    //                 .save(provider);
    // 
    //         

STELLAR_FORGE_RECIPES.recipeBuilder("contained_reissner_nordstrom_singularity_to_contained_kerr_newmann_singularity_time_dilation_containment_unit").duration(600).EUt(6000000)
                .inputItems(CONTAINED_REISSNER_NORDSTROM_SINGULARITY.asStack(64))
                .outputItems(CONTAINED_KERR_NEWMANN_SINGULARITY.asStack())
                .outputItems(TIME_DILATION_CONTAINMENT_UNIT.asStack(63))
                .save(provider);
    // TODO migrated disabled: unresolved old test symbol `NEUTRONIUM_SPHERE`.
    // 
    //         STELLAR_FORGE_RECIPES.recipeBuilder("neutronium_sphere_time_dilation_containment_unit_to_contained_high_density_protonic_matter").duration(400).EUt(1000000)
    //                 .inputItems(NEUTRONIUM_SPHERE.asStack())
    //                 .inputItems(TIME_DILATION_CONTAINMENT_UNIT.asStack())
    //                 .outputItems(CONTAINED_HIGH_DENSITY_PROTONIC_MATTER.asStack())
    //                 .save(provider);
    //     

// TODO migrated disabled: unresolved old test symbol `DEGENERATE_RHENIUM_DUST`.
    // 
    //         STELLAR_FORGE_RECIPES.recipeBuilder("degenerate_rhenium_dust_leptonic_charge_contained_high_density_protonic_matter_to_contained_exotic_matter").duration(600).EUt(5000000)
    //                 .inputItems(DEGENERATE_RHENIUM_DUST.asStack())
    //                 .inputItems(GAMetaBlocks.EXPLOSIVE.getItemVariant(GAExplosive.ExplosiveType.LEPTONIC_CHARGE))
    //                 .inputItems(CONTAINED_HIGH_DENSITY_PROTONIC_MATTER.asStack())
    //                 .outputItems(CONTAINED_EXOTIC_MATTER.asStack())
    //                 .save(provider);
    //   

}

}
