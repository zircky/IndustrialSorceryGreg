package com.zircky.industrialsorcerygreg.data.recipe.integration.ae2.network;

import appeng.core.definitions.AEItems;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTItems;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.data.recipe.CustomTags;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import com.zircky.industrialsorcerygreg.ISGCore;
import com.zircky.industrialsorcerygreg.common.data.ISGItems;
import com.zircky.industrialsorcerygreg.common.data.ISGMaterials;
import gripe._90.megacells.definition.MEGAItems;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.*;

public class NetworkCells {
  public static void init(Consumer<FinishedRecipe> provider) {
    cells(provider);
  }

  private static void cells(Consumer<FinishedRecipe> provider) {
    CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder(ISGCore.id("ae2/network/cells/item_storage_components_cell_1k_part"))
        .inputItems(CustomTags.ULV_CIRCUITS, 2)
        .inputItems(TagPrefix.plate, GTMaterials.CertusQuartz, 2)
        .inputItems(ISGItems.LOGIC_CHIP)
        .inputItems(GTItems.COATED_BOARD)
        .circuitMeta(1)
        .outputItems(AEItems.CELL_COMPONENT_1K.asItem())
        .duration(400).EUt(GTValues.VA[GTValues.HV]).save(provider);

    CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder("ae2/network/cells/item_storage_components_cell_4k_part")
        .inputItems(CustomTags.LV_CIRCUITS, 4)
        .inputItems(CustomTags.ULV_CIRCUITS, 16)
        .inputItems(ISGItems.LOGIC_CHIP)
        .inputItems(GTItems.BASIC_CIRCUIT_BOARD)
        .circuitMeta(1)
        .outputItems(AEItems.CELL_COMPONENT_4K.asItem())
        .duration(400).EUt(GTValues.VA[GTValues.HV]).save(provider);

    CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder("ae2/network/cells/item_storage_components_cell_16k_part")
        .inputItems(CustomTags.MV_CIRCUITS, 4)
        .inputItems(CustomTags.LV_CIRCUITS, 16)
        .inputItems(ISGItems.LOGIC_CHIP)
        .inputItems(GTItems.GOOD_CIRCUIT_BOARD)
        .circuitMeta(1)
        .outputItems(AEItems.CELL_COMPONENT_16K.asItem())
        .duration(400).EUt(GTValues.VA[GTValues.HV]).save(provider);

    CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder("ae2/network/cells/item_storage_components_cell_64k_part")
        .inputItems(CustomTags.HV_CIRCUITS, 4)
        .inputItems(CustomTags.MV_CIRCUITS, 16)
        .inputItems(ISGItems.LOGIC_CHIP)
        .inputItems(GTItems.ADVANCED_CIRCUIT_BOARD)
        .circuitMeta(1)
        .outputItems(AEItems.CELL_COMPONENT_64K.asItem())
        .duration(400).EUt(GTValues.VA[GTValues.EV]).save(provider);

    CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder("ae2/network/cells/item_storage_components_cell_256k_part")
        .inputItems(CustomTags.EV_CIRCUITS, 4)
        .inputItems(CustomTags.HV_CIRCUITS, 16)
        .inputItems(ISGItems.LOGIC_CHIP)
        .inputItems(GTItems.FIBER_BOARD)
        .circuitMeta(1)
        .outputItems(AEItems.CELL_COMPONENT_256K.asItem())
        .duration(400).EUt(GTValues.VA[GTValues.IV]).save(provider);

    CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder("megacell/cells/cell_component_1m")
        .inputItems(CustomTags.IV_CIRCUITS, 4)
        .inputItems(CustomTags.EV_CIRCUITS, 16)
        .inputItems(ISGItems.LOGIC_CHIP)
        .inputItems(GTItems.ELITE_CIRCUIT_BOARD)
        .circuitMeta(1)
        .outputItems(MEGAItems.CELL_COMPONENT_1M.asItem())
        .duration(400).EUt(GTValues.VA[GTValues.LuV]).save(provider);

    CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder("megacell/cells/cell_component_4m")
        .inputItems(CustomTags.LuV_CIRCUITS, 4)
        .inputItems(CustomTags.IV_CIRCUITS, 16)
        .inputItems(ISGItems.LOGIC_CHIP)
        .inputItems(GTItems.WETWARE_BOARD)
        .circuitMeta(1)
        .outputItems(MEGAItems.CELL_COMPONENT_4M.asItem())
        .duration(400).EUt(GTValues.VA[GTValues.ZPM]).save(provider);

    CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder("megacell/cells/cell_component_16m")
        .inputItems(CustomTags.ZPM_CIRCUITS, 4)
        .inputItems(CustomTags.LuV_CIRCUITS, 16)
        .inputItems(ISGItems.LOGIC_CHIP)
        .inputItems(GTItems.WETWARE_BOARD)
        .circuitMeta(1)
        .outputItems(MEGAItems.CELL_COMPONENT_16M.asItem())
        .duration(400).EUt(GTValues.VA[GTValues.UV]).save(provider);

    CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder("megacell/cells/cell_component_64m")
        .inputItems(CustomTags.UV_CIRCUITS, 4)
        .inputItems(CustomTags.ZPM_CIRCUITS, 16)
        .inputItems(ISGItems.LOGIC_CHIP)
        .inputItems(GTItems.WETWARE_BOARD)
        .circuitMeta(1)
        .outputItems(MEGAItems.CELL_COMPONENT_64M.asItem())
        .duration(400).EUt(GTValues.VA[GTValues.UHV]).save(provider);

    CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder("megacell/cells/cell_component_256m")
        .inputItems(CustomTags.UHV_CIRCUITS, 4)
        .inputItems(CustomTags.UV_CIRCUITS, 16)
        .inputItems(ISGItems.LOGIC_CHIP)
        .inputItems(GTItems.WETWARE_BOARD)
        .circuitMeta(1)
        .outputItems(MEGAItems.CELL_COMPONENT_256M.asItem())
        .duration(400).EUt(GTValues.VA[GTValues.UEV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/cells/item_cell_housing")
        .inputItems(Blocks.GLASS_PANE.asItem())
        .inputItems(TagPrefix.plate, GTMaterials.CertusQuartz)
        .inputItems(TagPrefix.plate, GTMaterials.Tantalum)
        .inputItems(TagPrefix.plate, GTMaterials.StainlessSteel, 2)
        .outputItems(AEItems.ITEM_CELL_HOUSING.asItem())
        .duration(250).EUt(GTValues.VA[GTValues.HV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/cells/fluid_cell_housing")
        .inputItems(Blocks.GLASS_PANE.asItem())
        .inputItems(TagPrefix.plate, GTMaterials.CertusQuartz)
        .inputItems(TagPrefix.plate, GTMaterials.AnnealedCopper)
        .inputItems(TagPrefix.plate, ISGMaterials.CortenSteel, 2)
        .outputItems(AEItems.FLUID_CELL_HOUSING.asItem())
        .duration(250).EUt(GTValues.VA[GTValues.HV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("megacells/cells/mega_item_cell_housing")
        .inputItems(Blocks.GLASS_PANE.asItem())
        .inputItems(TagPrefix.plate, GTMaterials.CertusQuartz)
        .inputItems(TagPrefix.plate, ISGMaterials.Bedrockium)
        .inputItems(TagPrefix.plate, ISGMaterials.SkySteel, 2)
        .circuitMeta(1)
        .outputItems(MEGAItems.MEGA_ITEM_CELL_HOUSING.asItem())
        .duration(580).EUt(GTValues.VA[GTValues.ZPM]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("megacells/cells/mega_fluid_cell_housing")
        .inputItems(Blocks.GLASS_PANE.asItem())
        .inputItems(TagPrefix.plate, GTMaterials.CertusQuartz)
        .inputItems(TagPrefix.plate, ISGMaterials.Bedrockium)
        .inputItems(TagPrefix.plate, ISGMaterials.SkySteel, 2)
        .circuitMeta(2)
        .outputItems(MEGAItems.MEGA_FLUID_CELL_HOUSING.asItem())
        .duration(580).EUt(GTValues.VA[GTValues.ZPM]).save(provider);

    PACKER_RECIPES.recipeBuilder("ae2/network/cells/item_storage_cell_1k")
        .inputItems(AEItems.CELL_COMPONENT_1K.asItem())
        .inputItems(AEItems.ITEM_CELL_HOUSING.asItem())
        .outputItems(AEItems.ITEM_CELL_1K.asItem())
        .duration(5).EUt(GTValues.VA[GTValues.HV]).save(provider);

    PACKER_RECIPES.recipeBuilder("ae2/network/cells/item_storage_cell_4k")
        .inputItems(AEItems.CELL_COMPONENT_4K.asItem())
        .inputItems(AEItems.ITEM_CELL_HOUSING.asItem())
        .outputItems(AEItems.ITEM_CELL_4K.asItem())
        .duration(5).EUt(GTValues.VA[GTValues.HV]).save(provider);

    PACKER_RECIPES.recipeBuilder("ae2/network/cells/item_storage_cell_16k")
        .inputItems(AEItems.CELL_COMPONENT_16K.asItem())
        .inputItems(AEItems.ITEM_CELL_HOUSING.asItem())
        .outputItems(AEItems.ITEM_CELL_16K.asItem())
        .duration(5).EUt(GTValues.VA[GTValues.EV]).save(provider);

    PACKER_RECIPES.recipeBuilder("ae2/network/cells/item_storage_cell_64k")
        .inputItems(AEItems.CELL_COMPONENT_64K.asItem())
        .inputItems(AEItems.ITEM_CELL_HOUSING.asItem())
        .outputItems(AEItems.ITEM_CELL_64K.asItem())
        .duration(5).EUt(GTValues.VA[GTValues.EV]).save(provider);

    PACKER_RECIPES.recipeBuilder("ae2/network/cells/item_storage_cell_256k")
        .inputItems(AEItems.CELL_COMPONENT_256K.asItem())
        .inputItems(AEItems.ITEM_CELL_HOUSING.asItem())
        .outputItems(AEItems.ITEM_CELL_256K.asItem())
        .duration(5).EUt(GTValues.VA[GTValues.IV]).save(provider);

    PACKER_RECIPES.recipeBuilder("ae2/network/cells/spatial_storage_cell_2_cubed")
        .inputItems(AEItems.SPATIAL_2_CELL_COMPONENT.asItem())
        .inputItems(AEItems.ITEM_CELL_HOUSING.asItem())
        .outputItems(AEItems.SPATIAL_CELL2.asItem())
        .duration(5).EUt(GTValues.VA[GTValues.HV]).save(provider);

    PACKER_RECIPES.recipeBuilder("ae2/network/cells/spatial_storage_cell_16_cubed")
        .inputItems(AEItems.SPATIAL_16_CELL_COMPONENT.asItem())
        .inputItems(AEItems.ITEM_CELL_HOUSING.asItem())
        .outputItems(AEItems.SPATIAL_CELL16.asItem())
        .duration(5).EUt(GTValues.VA[GTValues.EV]).save(provider);

    PACKER_RECIPES.recipeBuilder("ae2/network/cells/spatial_storage_cell_128_cubed")
        .inputItems(AEItems.SPATIAL_128_CELL_COMPONENT.asItem())
        .inputItems(AEItems.ITEM_CELL_HOUSING.asItem())
        .outputItems(AEItems.SPATIAL_CELL128.asItem())
        .duration(5).EUt(GTValues.VA[GTValues.IV]).save(provider);

    PACKER_RECIPES.recipeBuilder("ae2/network/cells/fluid_storage_cell_1k")
        .inputItems(AEItems.CELL_COMPONENT_1K.asItem())
        .inputItems(AEItems.ITEM_CELL_HOUSING.asItem())
        .outputItems(AEItems.FLUID_CELL_1K.asItem())
        .duration(5).EUt(GTValues.VA[GTValues.HV]).save(provider);

    PACKER_RECIPES.recipeBuilder("ae2/network/cells/fluid_storage_cell_4k")
        .inputItems(AEItems.CELL_COMPONENT_4K.asItem())
        .inputItems(AEItems.ITEM_CELL_HOUSING.asItem())
        .outputItems(AEItems.FLUID_CELL_4K.asItem())
        .duration(5).EUt(GTValues.VA[GTValues.HV]).save(provider);

    PACKER_RECIPES.recipeBuilder("ae2/network/cells/fluid_storage_cell_16k")
        .inputItems(AEItems.CELL_COMPONENT_16K.asItem())
        .inputItems(AEItems.ITEM_CELL_HOUSING.asItem())
        .outputItems(AEItems.FLUID_CELL_16K.asItem())
        .duration(5).EUt(GTValues.VA[GTValues.EV]).save(provider);

    PACKER_RECIPES.recipeBuilder("ae2/network/cells/fluid_storage_cell_64k")
        .inputItems(AEItems.CELL_COMPONENT_64K.asItem())
        .inputItems(AEItems.ITEM_CELL_HOUSING.asItem())
        .outputItems(AEItems.FLUID_CELL_64K.asItem())
        .duration(5).EUt(GTValues.VA[GTValues.EV]).save(provider);

    PACKER_RECIPES.recipeBuilder("ae2/network/cells/fluid_storage_cell_256k")
        .inputItems(AEItems.CELL_COMPONENT_256K.asItem())
        .inputItems(AEItems.ITEM_CELL_HOUSING.asItem())
        .outputItems(AEItems.FLUID_CELL_256K.asItem())
        .duration(5).EUt(GTValues.VA[GTValues.IV]).save(provider);

    PACKER_RECIPES.recipeBuilder("megacells/cells/mega_item_storage_cell_1m")
        .inputItems(MEGAItems.CELL_COMPONENT_1M.asItem())
        .inputItems(MEGAItems.MEGA_ITEM_CELL_HOUSING.asItem())
        .outputItems(MEGAItems.ITEM_CELL_1M.asItem())
        .duration(5).EUt(GTValues.VA[GTValues.LuV]).save(provider);

    PACKER_RECIPES.recipeBuilder("megacells/cells/mega_item_storage_cell_4m")
        .inputItems(MEGAItems.CELL_COMPONENT_4M.asItem())
        .inputItems(MEGAItems.MEGA_ITEM_CELL_HOUSING.asItem())
        .outputItems(MEGAItems.ITEM_CELL_4M.asItem())
        .duration(5).EUt(GTValues.VA[GTValues.LuV]).save(provider);

    PACKER_RECIPES.recipeBuilder("megacells/cells/mega_item_storage_cell_16m")
        .inputItems(MEGAItems.CELL_COMPONENT_16M.asItem())
        .inputItems(MEGAItems.MEGA_ITEM_CELL_HOUSING.asItem())
        .outputItems(MEGAItems.ITEM_CELL_16M.asItem())
        .duration(5).EUt(GTValues.VA[GTValues.ZPM]).save(provider);

    PACKER_RECIPES.recipeBuilder("megacells/cells/mega_item_storage_cell_64")
        .inputItems(MEGAItems.CELL_COMPONENT_64M.asItem())
        .inputItems(MEGAItems.MEGA_ITEM_CELL_HOUSING.asItem())
        .outputItems(MEGAItems.ITEM_CELL_64M.asItem())
        .duration(5).EUt(GTValues.VA[GTValues.ZPM]).save(provider);

    PACKER_RECIPES.recipeBuilder("megacells/cells/mega_item_storage_cell_256m")
        .inputItems(MEGAItems.CELL_COMPONENT_256M.asItem())
        .inputItems(MEGAItems.MEGA_ITEM_CELL_HOUSING.asItem())
        .outputItems(MEGAItems.ITEM_CELL_256M.asItem())
        .duration(5).EUt(GTValues.VA[GTValues.UV]).save(provider);

    PACKER_RECIPES.recipeBuilder("megacells/cells/fluid_storage_cell_1m")
        .inputItems(MEGAItems.CELL_COMPONENT_1M.asItem())
        .inputItems(MEGAItems.MEGA_ITEM_CELL_HOUSING.asItem())
        .outputItems(MEGAItems.ITEM_CELL_1M.asItem())
        .duration(5).EUt(GTValues.VA[GTValues.LuV]).save(provider);

    PACKER_RECIPES.recipeBuilder("megacells/cells/fluid_storage_cell_4m")
        .inputItems(MEGAItems.CELL_COMPONENT_4M.asItem())
        .inputItems(MEGAItems.MEGA_ITEM_CELL_HOUSING.asItem())
        .outputItems(MEGAItems.ITEM_CELL_4M.asItem())
        .duration(5).EUt(GTValues.VA[GTValues.LuV]).save(provider);

    PACKER_RECIPES.recipeBuilder("megacells/cells/fluid_storage_cell_16m")
        .inputItems(MEGAItems.CELL_COMPONENT_16M.asItem())
        .inputItems(MEGAItems.MEGA_ITEM_CELL_HOUSING.asItem())
        .outputItems(MEGAItems.ITEM_CELL_16M.asItem())
        .duration(5).EUt(GTValues.VA[GTValues.ZPM]).save(provider);

    PACKER_RECIPES.recipeBuilder("megacells/cells/fluid_storage_cell_64m")
        .inputItems(MEGAItems.CELL_COMPONENT_64M.asItem())
        .inputItems(MEGAItems.MEGA_ITEM_CELL_HOUSING.asItem())
        .outputItems(MEGAItems.ITEM_CELL_64M.asItem())
        .duration(5).EUt(GTValues.VA[GTValues.ZPM]).save(provider);

    PACKER_RECIPES.recipeBuilder("megacells/cells/fluid_storage_cell_256m")
        .inputItems(MEGAItems.CELL_COMPONENT_256M.asItem())
        .inputItems(MEGAItems.MEGA_ITEM_CELL_HOUSING.asItem())
        .outputItems(MEGAItems.ITEM_CELL_256M.asItem())
        .duration(5).EUt(GTValues.VA[GTValues.UV]).save(provider);

  }

  private static void vanillaRecipeHelper(Consumer<FinishedRecipe> provider, String id, ItemStack result, ItemStack input1, ItemStack input2, ItemStack input3) {
    VanillaRecipeHelper.addShapedRecipe(provider, id, result,
        "UPU", "PIP", "UPU",
        'P', input1,
        'I', input2,
        'U', input3);
  }

  private static void vanillaRecipeHelper(Consumer<FinishedRecipe> provider, String id, ItemStack result, ItemStack input1, ItemStack input2, TagKey<Item> input3) {
    VanillaRecipeHelper.addShapedRecipe(provider, id, result,
        "UPU", "PIP", "UPU",
        'P', input1,
        'I', input2,
        'U', input3);
  }


}
