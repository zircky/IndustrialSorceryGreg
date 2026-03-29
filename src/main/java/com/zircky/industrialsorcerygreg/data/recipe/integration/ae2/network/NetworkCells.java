package com.zircky.industrialsorcerygreg.data.recipe.integration.ae2.network;

import appeng.core.definitions.AEItems;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.machine.multiblock.CleanroomType;
import com.gregtechceu.gtceu.common.data.GTItems;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.data.recipe.CustomTags;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import com.zircky.industrialsorcerygreg.common.data.ISGItems;
import com.zircky.industrialsorcerygreg.common.data.ISGMaterials;
import gripe._90.megacells.definition.MEGAItems;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.ASSEMBLER_RECIPES;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.CIRCUIT_ASSEMBLER_RECIPES;

public class NetworkCells {
  public static void init(Consumer<FinishedRecipe> provider) {
    cells(provider);
  }

  private static void cells(Consumer<FinishedRecipe> provider) {
    vanillaRecipeHelper(provider, "ae2/network/cells/item_storage_components_cell_1k_part", new ItemStack(AEItems.CELL_COMPONENT_1K), ChemicalHelper.get(TagPrefix.plate, GTMaterials.CertusQuartz), new ItemStack(ISGItems.LOGIC_CHIP), CustomTags.ULV_CIRCUITS);
    vanillaRecipeHelper(provider, "ae2/network/cells/item_storage_components_cell_4k_part", new ItemStack(AEItems.CELL_COMPONENT_4K), new ItemStack(AEItems.CELL_COMPONENT_1K), new ItemStack(ISGItems.LOGIC_CHIP), CustomTags.LV_CIRCUITS);
    vanillaRecipeHelper(provider, "ae2/network/cells/item_storage_components_cell_16k_part", new ItemStack(AEItems.CELL_COMPONENT_16K), new ItemStack(AEItems.CELL_COMPONENT_4K), new ItemStack(ISGItems.LOGIC_CHIP), CustomTags.MV_CIRCUITS);
    vanillaRecipeHelper(provider, "ae2/network/cells/item_storage_components_cell_64k_part", new ItemStack(AEItems.CELL_COMPONENT_64K), new ItemStack(AEItems.CELL_COMPONENT_16K), new ItemStack(ISGItems.LOGIC_CHIP), CustomTags.HV_CIRCUITS);
    vanillaRecipeHelper(provider, "ae2/network/cells/item_storage_components_cell_256k_part", new ItemStack(AEItems.CELL_COMPONENT_256K), new ItemStack(AEItems.CELL_COMPONENT_64K), new ItemStack(ISGItems.LOGIC_CHIP), CustomTags.EV_CIRCUITS);
    vanillaRecipeHelper(provider, "megacell/cells/cell_component_1m", new ItemStack(MEGAItems.CELL_COMPONENT_1M), new ItemStack(AEItems.CELL_COMPONENT_256K), new ItemStack(ISGItems.LOGIC_CHIP), CustomTags.IV_CIRCUITS);
    vanillaRecipeHelper(provider, "megacell/cells/cell_component_4m", new ItemStack(MEGAItems.CELL_COMPONENT_4M), new ItemStack(MEGAItems.CELL_COMPONENT_1M), new ItemStack(ISGItems.LOGIC_CHIP), CustomTags.LuV_CIRCUITS);
    vanillaRecipeHelper(provider, "megacell/cells/cell_component_16m", new ItemStack(MEGAItems.CELL_COMPONENT_16M), new ItemStack(MEGAItems.CELL_COMPONENT_4M), new ItemStack(ISGItems.LOGIC_CHIP), CustomTags.ZPM_CIRCUITS);
    vanillaRecipeHelper(provider, "megacell/cells/cell_component_64m", new ItemStack(MEGAItems.CELL_COMPONENT_64M), new ItemStack(MEGAItems.CELL_COMPONENT_16M), new ItemStack(ISGItems.LOGIC_CHIP), CustomTags.UV_CIRCUITS);
    vanillaRecipeHelper(provider, "megacell/cells/cell_component_256m", new ItemStack(MEGAItems.CELL_COMPONENT_256M), new ItemStack(MEGAItems.CELL_COMPONENT_64M), new ItemStack(ISGItems.LOGIC_CHIP), CustomTags.UHV_CIRCUITS);

    vanillaRecipeHelper(provider, "ae2/network/cells/spatial_components", new ItemStack(AEItems.SPATIAL_2_CELL_COMPONENT), new ItemStack(AEItems.FLUIX_PEARL), new ItemStack(ISGItems.LOGIC_CHIP), ChemicalHelper.get(TagPrefix.plate, GTMaterials.Glowstone));
    vanillaRecipeHelper(provider, "ae2/network/cells/spatial_components_0", new ItemStack(AEItems.SPATIAL_16_CELL_COMPONENT), new ItemStack(AEItems.SPATIAL_2_CELL_COMPONENT), new ItemStack(ISGItems.LOGIC_CHIP), ChemicalHelper.get(TagPrefix.plate, GTMaterials.EnderPearl));
    vanillaRecipeHelper(provider, "ae2/network/cells/spatial_components_1", new ItemStack(AEItems.SPATIAL_128_CELL_COMPONENT), new ItemStack(AEItems.SPATIAL_16_CELL_COMPONENT), new ItemStack(ISGItems.LOGIC_CHIP), ChemicalHelper.get(TagPrefix.plate, GTMaterials.EnderPearl));


    CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder("ae2/network/cells/item_storage_components_cell_1k_part_cir_ass")
        .inputItems(CustomTags.ULV_CIRCUITS, 2)
        .inputItems(TagPrefix.plate, GTMaterials.CertusQuartz, 2)
        .inputItems(ISGItems.LOGIC_CHIP)
        .inputItems(GTItems.COATED_BOARD)
        .circuitMeta(1)
        .outputItems(AEItems.CELL_COMPONENT_1K)
        .duration(400).EUt(GTValues.VA[GTValues.HV]).save(provider);

    CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder("ae2/network/cells/item_storage_components_cell_4k_part_cir_ass")
        .inputItems(CustomTags.LV_CIRCUITS, 4)
        .inputItems(CustomTags.ULV_CIRCUITS, 16)
        .inputItems(ISGItems.LOGIC_CHIP)
        .inputItems(GTItems.BASIC_CIRCUIT_BOARD)
        .circuitMeta(1)
        .outputItems(AEItems.CELL_COMPONENT_4K)
        .duration(400).EUt(GTValues.VA[GTValues.HV]).save(provider);

    CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder("ae2/network/cells/item_storage_components_cell_4k_part_cir_ass")
        .inputItems(CustomTags.MV_CIRCUITS, 4)
        .inputItems(CustomTags.LV_CIRCUITS, 16)
        .inputItems(ISGItems.LOGIC_CHIP)
        .inputItems(GTItems.GOOD_CIRCUIT_BOARD)
        .circuitMeta(1)
        .outputItems(AEItems.CELL_COMPONENT_16K)
        .duration(400).EUt(GTValues.VA[GTValues.HV]).save(provider);

    CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder("ae2/network/cells/item_storage_components_cell_64k_part_cir_ass")
        .inputItems(CustomTags.HV_CIRCUITS, 4)
        .inputItems(CustomTags.MV_CIRCUITS, 16)
        .inputItems(ISGItems.LOGIC_CHIP)
        .inputItems(GTItems.ADVANCED_CIRCUIT_BOARD)
        .circuitMeta(1)
        .outputItems(AEItems.CELL_COMPONENT_64K)
        .duration(400).EUt(GTValues.VA[GTValues.EV]).save(provider);

    CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder("ae2/network/cells/item_storage_components_cell_256k_part_cir_ass")
        .inputItems(CustomTags.EV_CIRCUITS, 4)
        .inputItems(CustomTags.HV_CIRCUITS, 16)
        .inputItems(ISGItems.LOGIC_CHIP)
        .inputItems(GTItems.FIBER_BOARD)
        .circuitMeta(1)
        .outputItems(AEItems.CELL_COMPONENT_256K)
        .duration(400).EUt(GTValues.VA[GTValues.IV]).save(provider);

    CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder("megacell/cells/cell_component_1m_cir_ass")
        .inputItems(CustomTags.IV_CIRCUITS, 4)
        .inputItems(CustomTags.EV_CIRCUITS, 16)
        .inputItems(ISGItems.LOGIC_CHIP)
        .inputItems(GTItems.ELITE_CIRCUIT_BOARD)
        .circuitMeta(1)
        .outputItems(MEGAItems.CELL_COMPONENT_1M)
        .duration(400).EUt(GTValues.VA[GTValues.LuV]).save(provider);

    CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder("megacell/cells/cell_component_4m_cir_ass")
        .inputItems(CustomTags.LuV_CIRCUITS, 4)
        .inputItems(CustomTags.IV_CIRCUITS, 16)
        .inputItems(ISGItems.LOGIC_CHIP)
        .inputItems(GTItems.WETWARE_BOARD)
        .circuitMeta(1)
        .outputItems(MEGAItems.CELL_COMPONENT_4M)
        .duration(400).EUt(GTValues.VA[GTValues.ZPM]).save(provider);

    CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder("megacell/cells/cell_component_16m_cir_ass")
        .inputItems(CustomTags.ZPM_CIRCUITS, 4)
        .inputItems(CustomTags.LuV_CIRCUITS, 16)
        .inputItems(ISGItems.LOGIC_CHIP)
        .inputItems(GTItems.WETWARE_BOARD)
        .circuitMeta(1)
        .outputItems(MEGAItems.CELL_COMPONENT_16M)
        .duration(400).EUt(GTValues.VA[GTValues.UV]).save(provider);

    CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder("megacell/cells/cell_component_64m_cir_ass")
        .inputItems(CustomTags.UV_CIRCUITS, 4)
        .inputItems(CustomTags.ZPM_CIRCUITS, 16)
        .inputItems(ISGItems.LOGIC_CHIP)
        .inputItems(GTItems.WETWARE_BOARD)
        .circuitMeta(1)
        .outputItems(MEGAItems.CELL_COMPONENT_64M)
        .duration(400).EUt(GTValues.VA[GTValues.UHV]).save(provider);

    CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder("megacell/cells/cell_component_256m_cir_ass")
        .inputItems(CustomTags.UHV_CIRCUITS, 4)
        .inputItems(CustomTags.UV_CIRCUITS, 16)
        .inputItems(ISGItems.LOGIC_CHIP)
        .inputItems(GTItems.WETWARE_BOARD)
        .circuitMeta(1)
        .outputItems(MEGAItems.CELL_COMPONENT_256M)
        .duration(400).EUt(GTValues.VA[GTValues.UEV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/cells/item_cell_housing_ass")
        .inputItems(new ItemStack(Blocks.GLASS_PANE))
        .inputItems(ChemicalHelper.get(TagPrefix.plate, GTMaterials.CertusQuartz))
        .inputItems(ChemicalHelper.get(TagPrefix.plate, GTMaterials.Tantalum))
        .inputItems(ChemicalHelper.get(TagPrefix.plate, GTMaterials.StainlessSteel), 2)
        .outputItems(new ItemStack(AEItems.ITEM_CELL_HOUSING))
        .duration(250).EUt(GTValues.VA[GTValues.HV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/cells/fluid_cell_housing_ass")
        .inputItems(new ItemStack(Blocks.GLASS_PANE))
        .inputItems(ChemicalHelper.get(TagPrefix.plate, GTMaterials.CertusQuartz))
        .inputItems(ChemicalHelper.get(TagPrefix.plate, GTMaterials.AnnealedCopper))
        .inputItems(ChemicalHelper.get(TagPrefix.plate, ISGMaterials.CortenSteel), 2)
        .outputItems(new ItemStack(AEItems.FLUID_CELL_HOUSING))
        .duration(250).EUt(GTValues.VA[GTValues.HV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("megacells/cells/mega_item_cell_housing_ass")
        .inputItems(new ItemStack(Blocks.GLASS_PANE))
        .inputItems(ChemicalHelper.get(TagPrefix.plate, GTMaterials.CertusQuartz))
        .inputItems(ChemicalHelper.get(TagPrefix.plate, ISGMaterials.Bedrockium))
        .inputItems(ChemicalHelper.get(TagPrefix.plate, ISGMaterials.SkySteel), 2)
        .circuitMeta(1)
        .outputItems(new ItemStack(MEGAItems.MEGA_ITEM_CELL_HOUSING))
        .duration(580).EUt(GTValues.VA[GTValues.ZPM]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("megacells/cells/mega_fluid_cell_housing_ass")
        .inputItems(new ItemStack(Blocks.GLASS_PANE))
        .inputItems(ChemicalHelper.get(TagPrefix.plate, GTMaterials.CertusQuartz))
        .inputItems(ChemicalHelper.get(TagPrefix.plate, ISGMaterials.Bedrockium))
        .inputItems(ChemicalHelper.get(TagPrefix.plate, ISGMaterials.SkySteel), 2)
        .circuitMeta(2)
        .outputItems(new ItemStack(MEGAItems.MEGA_FLUID_CELL_HOUSING))
        .duration(580).EUt(GTValues.VA[GTValues.ZPM]).save(provider);


    vanillaRecipeHelperItemCell(provider, "ae2/network/cells/item_cell_housing", new ItemStack(AEItems.ITEM_CELL_HOUSING), new ItemStack(Blocks.GLASS_PANE));
    vanillaRecipeHelperItemCell(provider, "ae2/network/cells/item_storage_cell_1k", new ItemStack(AEItems.ITEM_CELL_1K), new ItemStack(AEItems.CELL_COMPONENT_1K));
    vanillaRecipeHelperItemCell(provider, "ae2/network/cells/item_storage_cell_4k", new ItemStack(AEItems.ITEM_CELL_4K), new ItemStack(AEItems.CELL_COMPONENT_4K));
    vanillaRecipeHelperItemCell(provider, "ae2/network/cells/item_storage_cell_16k", new ItemStack(AEItems.ITEM_CELL_16K), new ItemStack(AEItems.CELL_COMPONENT_16K));
    vanillaRecipeHelperItemCell(provider, "ae2/network/cells/item_storage_cell_64k", new ItemStack(AEItems.ITEM_CELL_64K), new ItemStack(AEItems.CELL_COMPONENT_64K));
    vanillaRecipeHelperItemCell(provider, "ae2/network/cells/item_storage_cell_256k", new ItemStack(AEItems.ITEM_CELL_256K), new ItemStack(AEItems.CELL_COMPONENT_256K));
    vanillaRecipeHelperItemCell(provider, "ae2/network/cells/view_cell", new ItemStack(AEItems.VIEW_CELL), ChemicalHelper.get(TagPrefix.gem, GTMaterials.CertusQuartz));

    vanillaRecipeHelperItemCell(provider, "ae2/network/cells/spatial_storage_cell_2_cubed", new ItemStack(AEItems.SPATIAL_CELL2), new ItemStack(AEItems.SPATIAL_2_CELL_COMPONENT));
    vanillaRecipeHelperItemCell(provider, "ae2/network/cells/spatial_storage_cell_16_cubed", new ItemStack(AEItems.SPATIAL_CELL16), new ItemStack(AEItems.SPATIAL_16_CELL_COMPONENT));
    vanillaRecipeHelperItemCell(provider, "ae2/network/cells/spatial_storage_cell_128_cubed", new ItemStack(AEItems.SPATIAL_CELL128), new ItemStack(AEItems.SPATIAL_128_CELL_COMPONENT));

    vanillaRecipeHelperFluidCell(provider, "ae2/network/cells/fluid_cell_housing", new ItemStack(AEItems.FLUID_CELL_HOUSING), new ItemStack(Blocks.GLASS_PANE));
    vanillaRecipeHelperFluidCell(provider, "ae2/network/cells/fluid_storage_cell_1k", new ItemStack(AEItems.FLUID_CELL_1K), new ItemStack(AEItems.CELL_COMPONENT_1K));
    vanillaRecipeHelperFluidCell(provider, "ae2/network/cells/fluid_storage_cell_4k", new ItemStack(AEItems.FLUID_CELL_4K), new ItemStack(AEItems.CELL_COMPONENT_4K));
    vanillaRecipeHelperFluidCell(provider, "ae2/network/cells/fluid_storage_cell_16k", new ItemStack(AEItems.FLUID_CELL_16K), new ItemStack(AEItems.CELL_COMPONENT_16K));
    vanillaRecipeHelperFluidCell(provider, "ae2/network/cells/fluid_storage_cell_64k", new ItemStack(AEItems.FLUID_CELL_64K), new ItemStack(AEItems.CELL_COMPONENT_64K));
    vanillaRecipeHelperFluidCell(provider, "ae2/network/cells/fluid_storage_cell_256k", new ItemStack(AEItems.FLUID_CELL_256K), new ItemStack(AEItems.CELL_COMPONENT_256K));

    vanillaRecipeHelperItemMEGACell(provider, "megacells/cells/mega_item_cell_housing", new ItemStack(MEGAItems.MEGA_ITEM_CELL_HOUSING), new ItemStack(Blocks.GLASS_PANE));
    vanillaRecipeHelperItemMEGACell(provider, "megacells/cells/mega_item_storage_cell_1k", new ItemStack(MEGAItems.ITEM_CELL_1M), new ItemStack(MEGAItems.CELL_COMPONENT_1M));
    vanillaRecipeHelperItemMEGACell(provider, "megacells/cells/mega_item_storage_cell_4k", new ItemStack(MEGAItems.ITEM_CELL_4M), new ItemStack(MEGAItems.CELL_COMPONENT_4M));
    vanillaRecipeHelperItemMEGACell(provider, "megacells/cells/mega_item_storage_cell_16k", new ItemStack(MEGAItems.ITEM_CELL_16M), new ItemStack(MEGAItems.CELL_COMPONENT_16M));
    vanillaRecipeHelperItemMEGACell(provider, "megacells/cells/mega_item_storage_cell_64k", new ItemStack(MEGAItems.ITEM_CELL_64M), new ItemStack(MEGAItems.CELL_COMPONENT_64M));
    vanillaRecipeHelperItemMEGACell(provider, "megacells/cells/mega_item_storage_cell_256k", new ItemStack(MEGAItems.ITEM_CELL_256M), new ItemStack(MEGAItems.CELL_COMPONENT_256M));

    vanillaRecipeHelperFluidMEGACell(provider, "megacells/cells/mega_fluid_cell_housing", new ItemStack(MEGAItems.MEGA_FLUID_CELL_HOUSING), new ItemStack(Blocks.GLASS_PANE));
    vanillaRecipeHelperFluidMEGACell(provider, "megacells/cells/standard/fluid_storage_cell_1m", new ItemStack(MEGAItems.FLUID_CELL_1M), new ItemStack(MEGAItems.CELL_COMPONENT_1M));
    vanillaRecipeHelperFluidMEGACell(provider, "megacells/cells/standard/fluid_storage_cell_4m", new ItemStack(MEGAItems.FLUID_CELL_4M), new ItemStack(MEGAItems.CELL_COMPONENT_4M));
    vanillaRecipeHelperFluidMEGACell(provider, "megacells/cells/standard/fluid_storage_cell_16m", new ItemStack(MEGAItems.FLUID_CELL_16M), new ItemStack(MEGAItems.CELL_COMPONENT_16M));
    vanillaRecipeHelperFluidMEGACell(provider, "megacells/cells/standard/fluid_storage_cell_64m", new ItemStack(MEGAItems.FLUID_CELL_64M), new ItemStack(MEGAItems.CELL_COMPONENT_64M));
    vanillaRecipeHelperFluidMEGACell(provider, "megacells/cells/standard/fluid_storage_cell_256m", new ItemStack(MEGAItems.FLUID_CELL_256M), new ItemStack(MEGAItems.CELL_COMPONENT_256M));

  }
  private static void vanillaRecipeHelperItemCell(Consumer<FinishedRecipe> provider, String id, ItemStack result, ItemStack input1) {
    VanillaRecipeHelper.addShapedRecipe(provider, id, result,
        "hQS", "GCG", "STd",
        'Q', ChemicalHelper.get(TagPrefix.plate, GTMaterials.CertusQuartz),
        'S', ChemicalHelper.get(TagPrefix.screw, GTMaterials.CertusQuartz),
        'G', ChemicalHelper.get(TagPrefix.plate, GTMaterials.StainlessSteel),
        'C', input1,
        'T', ChemicalHelper.get(TagPrefix.plate, GTMaterials.Tantalum)
    );
  }
  private static void vanillaRecipeHelperItemCell(Consumer<FinishedRecipe> provider, String id, ItemStack result, ChemicalHelper input1) {
    VanillaRecipeHelper.addShapedRecipe(provider, id, result,
        "hQS", "GCG", "STd",
        'Q', ChemicalHelper.get(TagPrefix.plate, GTMaterials.CertusQuartz),
        'S', ChemicalHelper.get(TagPrefix.screw, GTMaterials.CertusQuartz),
        'G', ChemicalHelper.get(TagPrefix.plate, GTMaterials.StainlessSteel),
        'C', input1,
        'T', ChemicalHelper.get(TagPrefix.plate, GTMaterials.Tantalum)
    );
  }

  private static void vanillaRecipeHelperItemMEGACell(Consumer<FinishedRecipe> provider, String id, ItemStack result, ItemStack input1) {
    VanillaRecipeHelper.addShapedRecipe(provider, id, result,
        "hQS", "GCG", "STd",
        'Q', ChemicalHelper.get(TagPrefix.plate, GTMaterials.CertusQuartz),
        'S', ChemicalHelper.get(TagPrefix.screw, ISGMaterials.Bedrockium),
        'G', ChemicalHelper.get(TagPrefix.plate, ISGMaterials.SkySteel),
        'C', input1,
        'T', ChemicalHelper.get(TagPrefix.plate, ISGMaterials.Bedrockium)
    );
  }
  private static void vanillaRecipeHelperFluidCell(Consumer<FinishedRecipe> provider, String id, ItemStack result, ItemStack input1) {
    VanillaRecipeHelper.addShapedRecipe(provider, id, result,
        "hQS", "GCG", "STd",
        'Q', ChemicalHelper.get(TagPrefix.plate, GTMaterials.CertusQuartz),
        'S', ChemicalHelper.get(TagPrefix.screw, GTMaterials.CertusQuartz),
        'G', ChemicalHelper.get(TagPrefix.plate, ISGMaterials.CortenSteel),
        'C', input1,
        'T', ChemicalHelper.get(TagPrefix.plate, GTMaterials.AnnealedCopper)
    );
  }
  private static void vanillaRecipeHelperFluidMEGACell(Consumer<FinishedRecipe> provider, String id, ItemStack result, ItemStack input1) {
    VanillaRecipeHelper.addShapedRecipe(provider, id, result,
        "hQS", "GCG", "STd",
        'Q', ChemicalHelper.get(TagPrefix.plate, GTMaterials.CertusQuartz),
        'S', ChemicalHelper.get(TagPrefix.screw, ISGMaterials.Bedrockium),
        'G', ChemicalHelper.get(TagPrefix.plate, ISGMaterials.SkySteel),
        'C', input1,
        'T', ChemicalHelper.get(TagPrefix.plate, GTMaterials.AnnealedCopper)
    );
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
