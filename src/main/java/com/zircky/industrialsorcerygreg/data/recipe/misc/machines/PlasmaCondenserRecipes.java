package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTItems.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGCasings.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGItems.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.*;

public class PlasmaCondenserRecipes {
  public static void init(Consumer<FinishedRecipe> provider) {
    // TODO migrated disabled: unresolved old test symbols.
    //     // TODO migrated disabled: unresolved old test symbols.
    //     //     // TODO migrated disabled: unresolved old test symbols.
    //     //     //     // Migrated from misc/test recipes.
    //     //     //         PLASMA_CONDENSER_RECIPES.recipeBuilder("actinium_plasma_containment_cell_liquid_helium_to_actinium_superhydride_plasma_containment_cell_helium").duration(340).EUt(8380000)
    //     //     //                 .inputItems(ACTINIUM_PLASMA_CONTAINMENT_CELL.asStack())
    //     //     //                 .inputFluids(LiquidHelium.getFluid(24000))
    //     //     //                 .outputItems(ChemicalHelper.get(dust, ActiniumSuperhydride, 13))
    //     //     //                 .outputItems(PLASMA_CONTAINMENT_CELL.asStack())
    //     //     //                 .outputFluids(Helium.getFluid(24000))
    //     //     //                 .save(provider);
    //     //
    //     //
    PLASMA_CONDENSER_RECIPES.recipeBuilder("liquid_helium_plasma_taranium_rich_helium4_to_taranium_rich_helium4_helium")
        .inputFluids(Helium.getFluid(FluidStorageKeys.LIQUID, 100))
        .inputFluids(TaraniumRichHelium4.getFluid(FluidStorageKeys.PLASMA, 1000))
        .outputFluids(TaraniumRichHelium4.getFluid(1000))
        .outputFluids(Helium.getFluid(100))
        .circuitMeta(1)
        .duration(80)
        .EUt(8000)
        .save(provider);

    PLASMA_CONDENSER_RECIPES.recipeBuilder("liquid_helium_plasma_hydrogen_to_hydrogen_helium")
        .inputFluids(Helium.getFluid(FluidStorageKeys.LIQUID, 100))
        .inputFluids(Hydrogen.getFluid(FluidStorageKeys.PLASMA, 1000))
        .outputFluids(Hydrogen.getFluid(1000))
        .outputFluids(Helium.getFluid(100))
        .circuitMeta(1)
        .duration(80)
        .EUt(8000)
        .save(provider);


    // TODO migrated disabled: unresolved old test symbol `DEGENERATE_RHENIUM_PLATE`.
    //         PLASMA_CONDENSER_RECIPES.recipeBuilder("rhenium_plasma_containment_cell_liquid_helium_to_helium_degenerate_rhenium_plate_plasma_containment_cell")
    //                 .inputItems(RHENIUM_PLASMA_CONTAINMENT_CELL.asStack())
    //                 .inputFluids(LiquidHelium.getFluid(16000))
    //                 .outputFluids(Helium.getFluid(16000))
    //                 .notConsumable(PLATE_FIELD_SHAPE.asStack())
    //                 .outputItems(DEGENERATE_RHENIUM_PLATE.asStack())
    //                 .outputItems(PLASMA_CONTAINMENT_CELL.asStack())
    //                 .EUt(122880)
    //                 .duration(250)
    //                 .save(provider);
    // 
    //         

    PLASMA_CONDENSER_RECIPES.recipeBuilder("neutron_plasma_containment_cell_liquid_helium_to_helium_neutronium_plasma_containment_cell")
        .inputItems(NEUTRON_PLASMA_CONTAINMENT_CELL.asStack())
        .inputFluids(Helium.getFluid(FluidStorageKeys.LIQUID, 32000))
        .outputFluids(Helium.getFluid(32000))
        .notConsumable(INGOT_FIELD_SHAPE.asStack())
        .outputItems(ingot, Neutronium)
        .outputItems(PLASMA_CONTAINMENT_CELL.asStack())
        .EUt(10000000)
        .duration(500)
        .save(provider);


    PLASMA_CONDENSER_RECIPES.recipeBuilder("cosmic_neutron_plasma_cell_superfluid_helium_to_helium_cosmic_neutronium_extremely_durable_plasma_cell").duration(500).EUt(10000000)
        .inputItems(COSMIC_NEUTRON_PLASMA_CELL.asStack())
        .inputFluids(SuperfluidHelium.getFluid(48000))
        .outputFluids(Helium.getFluid(48000))
        .notConsumable(INGOT_FIELD_SHAPE.asStack())
        .outputItems(ingot, CosmicNeutronium)
        .outputItems(EXTREMELY_DURABLE_PLASMA_CELL.asStack())
        .save(provider);

    // TODO migrated disabled: unresolved old test symbols.
    //     // TODO migrated disabled: unresolved old test symbols.
    //     //
    //     //         PLASMA_CONDENSER_RECIPES.recipeBuilder("cosmic_mesh_containment_unit_superfluid_helium_to_helium_cosmic_mesh_time_dilation_containment_unit").duration(500).EUt(10000000)
    //     //                 .inputItems(COSMIC_MESH_CONTAINMENT_UNIT.asStack())
    //     //                 .inputFluids(SuperfluidHelium.getFluid(24000))
    //     //                 .outputFluids(Helium.getFluid(24000))
    //     //                 .notConsumable(PLATE_FIELD_SHAPE.asStack())
    //     //                 .outputItems(COSMIC_MESH.asStack())
    //     //                 .outputItems(TIME_DILATION_CONTAINMENT_UNIT.asStack())
    //     //                 .save(provider);
    //
    //
    //         PLASMA_CONDENSER_RECIPES.recipeBuilder("cosmic_mesh_containment_unit_superfluid_helium_xenon_to_helium_cosmic_fabric_time_dilation_containment_unit").duration(500).EUt(10000000)
    //                 .inputItems(COSMIC_MESH_CONTAINMENT_UNIT.asStack())
    //                 .inputFluids(SuperfluidHelium.getFluid(24000))
    //                 .inputFluids(Xenon.getFluid(500))
    //                 .outputFluids(Helium.getFluid(24000))
    //                 .notConsumable(WIRE_FIELD_SHAPE.asStack())
    //                 .outputItems(COSMIC_FABRIC.asStack())
    //                 .outputItems(TIME_DILATION_CONTAINMENT_UNIT.asStack())
    //                 .save(provider);

//             PLASMA_CONDENSER_RECIPES.recipeBuilder("neutron_plasma_containment_cell_liquid_helium_to_neutronium_sphere_plasma_containment_cell_helium").duration(500).EUt(400000)
//                     .inputItems(NEUTRON_PLASMA_CONTAINMENT_CELL.asStack())
//                     .notConsumable(SPHERE_FIELD_SHAPE.asStack())
//                     .inputFluids(Helium.getFluid(FluidStorageKeys.LIQUID, 32000))
//                     .outputItems(NEUTRONIUM_SPHERE.asStack(4))
//                     .outputItems(PLASMA_CONTAINMENT_CELL.asStack())
//                     .outputFluids(Helium.getFluid(32000))
//                     .save(provider);


  }
}
