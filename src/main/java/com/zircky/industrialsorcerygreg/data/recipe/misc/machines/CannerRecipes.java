package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.common.data.GTBlocks;
import com.gregtechceu.gtceu.common.data.GTItems;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.VA;
import static com.zircky.industrialsorcerygreg.common.data.ISGItems.CONTAINED_KERR_NEWMANN_SINGULARITY;
import static com.zircky.industrialsorcerygreg.common.data.ISGItems.CONTAINED_KERR_SINGULARITY;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.FreeElectronGas;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.CANNER_RECIPES;

public class CannerRecipes {
    public static void init(Consumer<FinishedRecipe> provider) {
        batteryBlock(provider);
    }

    private static void batteryBlock(Consumer<FinishedRecipe> provider) {
        CANNER_RECIPES.recipeBuilder("ev_lapotronic_battery")
                .inputItems(GTBlocks.BATTERY_EMPTY_TIER_I.asStack(1))
                .inputItems(GTItems.LAPOTRON_CRYSTAL, 6)
                .outputItems(GTBlocks.BATTERY_LAPOTRONIC_EV.asStack(1))
                .duration(200).EUt(GTValues.VA[GTValues.EV]).save(provider);

        CANNER_RECIPES.recipeBuilder("iv_lapotronic_battery")
                .inputItems(GTBlocks.BATTERY_EMPTY_TIER_I.asStack(1))
                .inputItems(GTItems.ENERGY_LAPOTRONIC_ORB, 6)
                .outputItems(GTBlocks.BATTERY_LAPOTRONIC_IV.asStack(1))
                .duration(200).EUt(GTValues.VA[GTValues.IV]).save(provider);

        CANNER_RECIPES.recipeBuilder("luv_lapotronic_battery")
                .inputItems(GTBlocks.BATTERY_EMPTY_TIER_II.asStack(1))
                .inputItems(GTItems.ENERGY_LAPOTRONIC_ORB_CLUSTER, 6)
                .outputItems(GTBlocks.BATTERY_LAPOTRONIC_LuV.asStack(1))
                .duration(200).EUt(GTValues.VA[GTValues.LuV]).save(provider);

        CANNER_RECIPES.recipeBuilder("zpm_lapotronic_battery")
                .inputItems(GTBlocks.BATTERY_EMPTY_TIER_II.asStack(1))
                .inputItems(GTItems.ENERGY_MODULE, 6)
                .outputItems(GTBlocks.BATTERY_LAPOTRONIC_ZPM.asStack(1))
                .duration(200).EUt(GTValues.VA[GTValues.ZPM]).save(provider);

        CANNER_RECIPES.recipeBuilder("zpm_lapotronic_battery")
                .inputItems(GTBlocks.BATTERY_EMPTY_TIER_III.asStack(1))
                .inputItems(GTItems.ENERGY_CLUSTER, 6)
                .outputItems(GTBlocks.BATTERY_LAPOTRONIC_UV.asStack(1))
                .duration(200).EUt(GTValues.VA[GTValues.UV]).save(provider);

        CANNER_RECIPES.recipeBuilder("uhv_ultimate_battery")
                .inputItems(GTBlocks.BATTERY_EMPTY_TIER_III.asStack(1))
                .inputItems(GTItems.ULTIMATE_BATTERY)
                .outputItems(GTBlocks.BATTERY_ULTIMATE_UHV)
                .duration(400).EUt(VA[GTValues.UHV]).save(provider);

        // Migrated from misc/test recipes.
        // TODO migrated disabled: unresolved old test symbol `ACTINIUM_PLASMA_CONTAINMENT_CELL`.
        //         CANNER_RECIPES.recipeBuilder("plasma_containment_cell_actinium_superhydride_plasma_to_actinium_plasma_containment_cell")
        //                 .inputItems(PLASMA_CONTAINMENT_CELL.asStack())
        //                 .inputFluids(ActiniumSuperhydridePlasma.getFluid(1000))
        //                 .outputItems(ACTINIUM_PLASMA_CONTAINMENT_CELL.asStack())
        //                 .EUt(750000)
        //                 .duration(20)
        //                 .save(provider);
        //
        //         CANNER_RECIPES.recipeBuilder("plasma_containment_cell_electron_degenerate_rhenium_plasma_to_rhenium_plasma_containment_cell")
        //                 .inputItems(PLASMA_CONTAINMENT_CELL.asStack())
        //                 .inputFluids(ElectronDegenerateRheniumPlasma.getFluid(1000))
        //                 .outputItems(RHENIUM_PLASMA_CONTAINMENT_CELL.asStack())
        //                 .EUt(30720)
        //                 .duration(20)
        //                 .save(provider);
        //
        //         CANNER_RECIPES.recipeBuilder("plasma_containment_cell_neutron_plasma_to_neutron_plasma_containment_cell")
        //                 .inputItems(PLASMA_CONTAINMENT_CELL.asStack())
        //                 .inputFluids(NeutronPlasma.getFluid(1000))
        //                 .outputItems(NEUTRON_PLASMA_CONTAINMENT_CELL.asStack())
        //                 .EUt(25000000)
        //                 .duration(80)
        //                 .save(provider);
        //
        //         CANNER_RECIPES.recipeBuilder("extremely_durable_plasma_cell_dense_neutron_plasma_to_dense_neutron_plasma_cell").duration(90).EUt(62500000)
        //                 .inputItems(EXTREMELY_DURABLE_PLASMA_CELL.asStack())
        //                 .inputFluids(DenseNeutronPlasma.getFluid(1000))
        //                 .outputItems(DENSE_NEUTRON_PLASMA_CELL.asStack())
        //                 .save(provider);
        //
        //         CANNER_RECIPES.recipeBuilder("time_dilation_containment_unit_cosmic_mesh_plasma_to_cosmic_mesh_containment_unit").duration(90).EUt(125000000)
        //                 .inputItems(TIME_DILATION_CONTAINMENT_UNIT.asStack())
        //                 .inputFluids(CosmicMeshPlasma.getFluid(1000))
        //                 .outputItems(COSMIC_MESH_CONTAINMENT_UNIT.asStack())
        //                 .save(provider);
        //
        //

        CANNER_RECIPES.recipeBuilder("free_electron_gas_contained_kerr_newmann_singularity_to_contained_kerr_singularity").duration(40).EUt(100000)
            .inputFluids(FreeElectronGas.getFluid(1000))
            .inputItems(CONTAINED_KERR_NEWMANN_SINGULARITY.asStack())
            .outputItems(CONTAINED_KERR_SINGULARITY.asStack())
            .save(provider);
    }
}
