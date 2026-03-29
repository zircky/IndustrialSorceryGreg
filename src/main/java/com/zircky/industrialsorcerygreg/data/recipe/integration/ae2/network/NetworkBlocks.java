package com.zircky.industrialsorcerygreg.data.recipe.integration.ae2.network;

import appeng.core.definitions.AEBlocks;
import appeng.core.definitions.AEItems;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTBlocks;
import com.gregtechceu.gtceu.common.data.GTItems;
import com.gregtechceu.gtceu.common.data.GTMachines;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.data.recipe.CustomTags;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

import static appeng.api.util.AEColor.TRANSPARENT;
import static appeng.core.definitions.AEParts.GLASS_CABLE;
import static appeng.core.definitions.AEParts.SMART_DENSE_CABLE;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.ASSEMBLER_RECIPES;

public class NetworkBlocks {
  public static void init(Consumer<FinishedRecipe> provider) {
    blocks(provider);
  }

  private static void blocks(Consumer<FinishedRecipe> provider) {
    VanillaRecipeHelper.addShapedRecipe(provider, "ae2/network/blocks/inscribers", new ItemStack(AEBlocks.INSCRIBER.asItem()),
        "FPF", "CMC", "FPF",
        'F', ChemicalHelper.get(TagPrefix.plateDouble, GTMaterials.TitaniumTungstenCarbide),
        'P', new ItemStack(GTItems.ELECTRIC_PISTON_EV.asItem()),
        'M', GTMachines.FORMING_PRESS[4].asStack(),
        'C', new ItemStack(GTItems.VOLTAGE_COIL_MV.asItem()));

    VanillaRecipeHelper.addShapedRecipe(provider, "ae2/network/blocks/crystal_processing_charger", new ItemStack(AEBlocks.CHARGER.asItem()),
        "PFP", "CMC", "PFP",
        'P', ChemicalHelper.get(TagPrefix.plateDouble, GTMaterials.TitaniumTungstenCarbide),
        'F', new ItemStack(AEItems.FLUIX_CRYSTAL),
        'C', ChemicalHelper.get(TagPrefix.cableGtSingle, GTMaterials.Copper),
        'M', GTMachines.ELECTROLYZER[4].asStack());

    VanillaRecipeHelper.addShapedRecipe(provider, "ae2/network/blocks/io_condenser", new ItemStack(AEBlocks.CONDENSER.asItem()),
        "DPD", "PMP", "DPD",
        'P', ChemicalHelper.get(TagPrefix.plateDouble, GTMaterials.TitaniumTungstenCarbide),
        'D', new ItemStack(GTItems.ELECTRIC_PISTON_IV),
        'M', new ItemStack(GTMachines.HULL[5].getBlock()));

    VanillaRecipeHelper.addShapedRecipe(provider, "ae2/network/blocks/energy_energy_acceptor", new ItemStack(AEBlocks.ENERGY_ACCEPTOR.asItem()),
        "DPD", "PMP", "DPD",
        'P', ChemicalHelper.get(TagPrefix.plateDouble, GTMaterials.TitaniumTungstenCarbide),
        'D', ChemicalHelper.get(TagPrefix.plateDouble, GTMaterials.TitaniumTungstenCarbide),
        'M', ChemicalHelper.get(TagPrefix.plate, GTMaterials.Glowstone));

    VanillaRecipeHelper.addShapedRecipe(provider, "ae2/network/blocks/energy_vibration_chamber", new ItemStack(AEBlocks.VIBRATION_CHAMBER.asItem()),
        "DSD", "sMw", "DED",
        'D', ChemicalHelper.get(TagPrefix.plateDouble, GTMaterials.TitaniumTungstenCarbide),
        'S', ChemicalHelper.get(TagPrefix.screw, GTMaterials.TitaniumTungstenCarbide),
        'E', new ItemStack(AEBlocks.ENERGY_ACCEPTOR),
        'M', GTMachines.ELECTRIC_FURNACE[4].asStack());

    VanillaRecipeHelper.addShapedRecipe(provider, "ae2/network/blocks/crystal_processing_growth_accelerator", new ItemStack(AEBlocks.GROWTH_ACCELERATOR.asItem()),
        "DGD", "CMC", "DED",
        'D', ChemicalHelper.get(TagPrefix.plateDouble, GTMaterials.TitaniumTungstenCarbide),
        'G', new ItemStack(AEBlocks.QUARTZ_GLASS),
        'C', new ItemStack(GLASS_CABLE.item(TRANSPARENT)),
        'E', new ItemStack(AEItems.ENGINEERING_PROCESSOR),
        'M', GTMachines.AUTOCLAVE[5].asStack());

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/blocks/quantum_ring")
        .inputItems(new ItemStack(AEBlocks.ENERGY_CELL))
        .inputItems(ChemicalHelper.get(TagPrefix.plateDense, GTMaterials.TitaniumTungstenCarbide), 4)
        .inputItems(new ItemStack(AEItems.ENGINEERING_PROCESSOR))
        .inputItems(new ItemStack(AEItems.LOGIC_PROCESSOR, 2))
        .inputItems(new ItemStack(SMART_DENSE_CABLE.item(TRANSPARENT)))
        .circuitMeta(2)
        .outputItems(new ItemStack(AEBlocks.QUANTUM_RING))
        .duration(100).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/blocks/quantum_link")
        .inputItems(ChemicalHelper.get(TagPrefix.plateDense, GTMaterials.TitaniumTungstenCarbide), 4)
        .inputItems(new ItemStack(AEItems.FLUIX_PEARL, 4))
        .inputItems(new ItemStack(AEBlocks.QUARTZ_GLASS))
        .circuitMeta(2)
        .outputItems(new ItemStack(AEBlocks.QUANTUM_LINK))
        .duration(100).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/blocks/spatial_io_pylon")
        .inputItems(ChemicalHelper.get(TagPrefix.plateDouble, GTMaterials.TitaniumTungstenCarbide), 4)
        .inputItems(new ItemStack(GLASS_CABLE.item(TRANSPARENT), 2))
        .inputItems(new ItemStack(AEItems.FLUIX_DUST, 2))
        .inputItems(new ItemStack(AEItems.FLUIX_CRYSTAL))
        .circuitMeta(2)
        .outputItems(new ItemStack(AEBlocks.SPATIAL_PYLON))
        .duration(100).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/blocks/spatial_io_port")
        .inputItems(ChemicalHelper.get(TagPrefix.plateDouble, GTMaterials.TitaniumTungstenCarbide), 4)
        .inputItems(new ItemStack(GLASS_CABLE.item(TRANSPARENT), 2))
        .inputItems(new ItemStack(AEItems.ENGINEERING_PROCESSOR))
        .inputItems(new ItemStack(AEBlocks.IO_PORT))
        .inputItems(new ItemStack(AEBlocks.SPATIAL_PYLON))
        .circuitMeta(2)
        .outputItems(new ItemStack(AEBlocks.SPATIAL_IO_PORT))
        .duration(100).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/blocks/controller")
        .inputItems(ChemicalHelper.get(TagPrefix.plateDense, GTMaterials.TitaniumTungstenCarbide), 4)
        .inputItems(CustomTags.EV_CIRCUITS, 2)
        .inputItems(new ItemStack(AEItems.ENGINEERING_PROCESSOR, 2))
        .inputItems(new ItemStack(GTBlocks.MACHINE_CASING_IV))
        .circuitMeta(2)
        .outputItems(new ItemStack(AEBlocks.CONTROLLER))
        .duration(100).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/blocks/storage_drive")
        .inputItems(ChemicalHelper.get(TagPrefix.plateDense, GTMaterials.TitaniumTungstenCarbide), 4)
        .inputItems(new ItemStack(GLASS_CABLE.item(TRANSPARENT), 2))
        .inputItems(CustomTags.EV_CIRCUITS)
        .inputItems(new ItemStack(AEBlocks.CHEST))
        .inputItems(new ItemStack(AEItems.ENGINEERING_PROCESSOR))
        .circuitMeta(2)
        .outputItems(new ItemStack(AEBlocks.DRIVE))
        .duration(100).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/blocks/storage_chest")
        .inputItems(ChemicalHelper.get(TagPrefix.plateDouble, GTMaterials.TitaniumTungstenCarbide), 4)
        .inputItems(new ItemStack(GLASS_CABLE.item(TRANSPARENT), 2))
        .inputItems(CustomTags.EV_CIRCUITS, 2)
        .inputItems(Tags.Items.CHESTS_WOODEN)
        .circuitMeta(2)
        .outputItems(new ItemStack(AEBlocks.CHEST))
        .duration(100).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/blocks/interfaces_interface")
        .inputItems(ChemicalHelper.get(TagPrefix.plateDouble, GTMaterials.TitaniumTungstenCarbide), 4)
        .inputItems(new ItemStack(GLASS_CABLE.item(TRANSPARENT), 2))
        .inputItems(new ItemStack(AEItems.FORMATION_CORE))
        .inputItems(new ItemStack(AEItems.ANNIHILATION_CORE))
        .inputItems(new ItemStack(GTBlocks.MACHINE_CASING_IV))
        .circuitMeta(2)
        .outputItems(new ItemStack(AEBlocks.INTERFACE))
        .duration(100).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/blocks/pattern_providers_interface")
        .inputItems(ChemicalHelper.get(TagPrefix.plateDouble, GTMaterials.TitaniumTungstenCarbide), 4)
        .inputItems(new ItemStack(GLASS_CABLE.item(TRANSPARENT), 2))
        .inputItems(new ItemStack(AEItems.FORMATION_CORE))
        .inputItems(new ItemStack(AEItems.ANNIHILATION_CORE))
        .inputItems(new ItemStack(GTBlocks.MACHINE_CASING_IV))
        .inputItems(net.minecraft.world.level.block.Blocks.CRAFTING_TABLE.asItem(), 2)
        .circuitMeta(2)
        .outputItems(new ItemStack(AEBlocks.PATTERN_PROVIDER))
        .duration(100).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/blocks/cell_workbench")
        .inputItems(ChemicalHelper.get(TagPrefix.plateDouble, GTMaterials.TitaniumTungstenCarbide), 4)
        .inputItems(new ItemStack(AEItems.CALCULATION_PROCESSOR))
        .inputItems(new ItemStack(GTItems.COVER_SCREEN))
        .inputItems(Tags.Items.CHESTS_WOODEN)
        .circuitMeta(2)
        .outputItems(new ItemStack(AEBlocks.CELL_WORKBENCH))
        .duration(100).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/blocks/io_port")
        .inputItems(ChemicalHelper.get(TagPrefix.plateDouble, GTMaterials.TitaniumTungstenCarbide), 3)
        .inputItems(new ItemStack(GLASS_CABLE.item(TRANSPARENT), 3))
        .inputItems(new ItemStack(AEItems.LOGIC_PROCESSOR))
        .inputItems(new ItemStack(AEBlocks.DRIVE, 2))
        .circuitMeta(2)
        .outputItems(new ItemStack(AEBlocks.IO_PORT))
        .duration(100).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/blocks/energy_energy_cell")
        .inputItems(ChemicalHelper.get(TagPrefix.plateDouble, GTMaterials.TitaniumTungstenCarbide), 4)
        .inputItems(CustomTags.EV_CIRCUITS, 2)
        .inputItems(new ItemStack(AEItems.FLUIX_DUST))
        .inputItems(new ItemStack(AEBlocks.FLUIX_BLOCK))
        .inputItems(ChemicalHelper.get(TagPrefix.cableGtQuadruple, GTMaterials.Aluminium))
        .circuitMeta(2)
        .outputItems(new ItemStack(AEBlocks.ENERGY_CELL))
        .duration(100).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/blocks/energy_dense_energy_cell")
        .inputItems(CustomTags.LuV_CIRCUITS, 2)
        .inputItems(new ItemStack(AEBlocks.ENERGY_CELL, 5))
        .inputItems(GTMachines.BATTERY_BUFFER_16[4])
        .inputItems(new ItemStack(AEItems.ENGINEERING_PROCESSOR))
        .circuitMeta(2)
        .outputItems(new ItemStack(AEBlocks.DENSE_ENERGY_CELL))
        .duration(100).EUt(GTValues.VA[GTValues.EV]).save(provider);
  }
}
