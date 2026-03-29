package com.zircky.industrialsorcerygreg.data.recipe.integration.ae2.network;

import appeng.core.definitions.AEBlocks;
import appeng.core.definitions.AEItems;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMachines;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.data.recipe.CustomTags;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import gripe._90.megacells.definition.MEGABlocks;
import gripe._90.megacells.definition.MEGAItems;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.function.Consumer;

import static appeng.core.definitions.AEParts.STORAGE_MONITOR;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.ASSEMBLER_RECIPES;

public class Crafting {
  public static void init(Consumer<FinishedRecipe> provider) {
    crafting(provider);
  }

  private static void crafting(Consumer<FinishedRecipe> provider) {
    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/crafting/cpu_crafting_unit")
        .inputItems(TagPrefix.plateDouble, GTMaterials.TitaniumTungstenCarbide, 4)
        .inputItems(CustomTags.LV_CIRCUITS, 2)
        .inputItems(new ItemStack(AEItems.LOGIC_PROCESSOR))
        .inputItems(new ItemStack(AEItems.CALCULATION_PROCESSOR))
        .inputItems(new ItemStack(AEItems.ENGINEERING_PROCESSOR))
        .circuitMeta(2)
        .outputItems(new ItemStack(AEBlocks.CRAFTING_UNIT))
        .duration(100).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/crafting/cpu_crafting_accelerator")
        .inputItems(new ItemStack(AEBlocks.CRAFTING_UNIT))
        .inputItems(new ItemStack(AEItems.ENGINEERING_PROCESSOR, 2))
        .inputItems(CustomTags.EV_CIRCUITS,2)
        .outputItems(new ItemStack(AEBlocks.CRAFTING_ACCELERATOR))
        .duration(400).EUt(GTValues.VA[GTValues.EV]).save(provider);

    crefting("ae2/network/crafting/cpu_crafting_monitor", new ItemStack(AEBlocks.CRAFTING_UNIT), new ItemStack(STORAGE_MONITOR), new ItemStack(AEBlocks.CRAFTING_MONITOR), 400, GTValues.VA[GTValues.EV], provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/crafting/molecular_assembler")
        .inputItems(GTMachines.ASSEMBLER[5])
        .inputItems(TagPrefix.plateDouble, GTMaterials.TitaniumTungstenCarbide, 4)
        .inputItems(new ItemStack(AEItems.ANNIHILATION_CORE))
        .inputItems(new ItemStack(AEItems.FORMATION_CORE))
        .circuitMeta(3)
        .inputFluids(GTMaterials.Glass.getFluid(288))
        .outputItems(new ItemStack(AEBlocks.MOLECULAR_ASSEMBLER))
        .duration(100).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/crafting/1k_cpu_crafting_storage")
        .inputItems(new ItemStack(AEBlocks.CRAFTING_UNIT))
        .inputItems(new ItemStack(AEItems.CELL_COMPONENT_1K))
        .outputItems(new ItemStack(AEBlocks.CRAFTING_STORAGE_1K))
        .duration(400).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/crafting/4k_cpu_crafting_storage")
        .inputItems(new ItemStack(AEBlocks.CRAFTING_UNIT))
        .inputItems(new ItemStack(AEItems.CELL_COMPONENT_4K))
        .outputItems(new ItemStack(AEBlocks.CRAFTING_STORAGE_4K))
        .duration(400).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/crafting/16k_cpu_crafting_storage")
        .inputItems(new ItemStack(AEBlocks.CRAFTING_UNIT))
        .inputItems(new ItemStack(AEItems.CELL_COMPONENT_16K))
        .outputItems(new ItemStack(AEBlocks.CRAFTING_STORAGE_16K))
        .duration(400).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/crafting/64k_cpu_crafting_storage")
        .inputItems(new ItemStack(AEBlocks.CRAFTING_UNIT))
        .inputItems(new ItemStack(AEItems.CELL_COMPONENT_64K))
        .outputItems(new ItemStack(AEBlocks.CRAFTING_STORAGE_64K))
        .duration(400).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/crafting/256k_cpu_crafting_storage")
        .inputItems(new ItemStack(AEBlocks.CRAFTING_UNIT))
        .inputItems(new ItemStack(AEItems.CELL_COMPONENT_256K))
        .outputItems(new ItemStack(AEBlocks.CRAFTING_STORAGE_256K))
        .duration(400).EUt(GTValues.VA[GTValues.EV]).save(provider);

    VanillaRecipeHelper.addShapedRecipe(provider, "ae2/network/crafting/patterns_blank", new ItemStack(AEItems.BLANK_PATTERN),
        "GPG", "PCP", "ATA",
        'P', ChemicalHelper.get(TagPrefix.plateDouble, GTMaterials.TitaniumTungstenCarbide),
        'G', new ItemStack(AEBlocks.QUARTZ_GLASS),
        'C', ChemicalHelper.get(TagPrefix.gem, GTMaterials.CertusQuartz),
        'A', ChemicalHelper.get(TagPrefix.plateDouble, GTMaterials.Aluminium),
        'T', ChemicalHelper.get(TagPrefix.plate, GTMaterials.TantalumCarbide));

    ASSEMBLER_RECIPES.recipeBuilder("megacells/crafting/1m_crafting_storage")
        .inputItems(new ItemStack(MEGABlocks.MEGA_CRAFTING_UNIT))
        .inputItems(new ItemStack(MEGAItems.CELL_COMPONENT_1M))
        .outputItems(new ItemStack(MEGABlocks.CRAFTING_STORAGE_1M))
        .duration(1200).EUt(GTValues.VA[GTValues.ZPM]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("megacells/crafting/4m_crafting_storage")
        .inputItems(new ItemStack(MEGABlocks.MEGA_CRAFTING_UNIT))
        .inputItems(new ItemStack(MEGAItems.CELL_COMPONENT_4M))
        .outputItems(new ItemStack(MEGABlocks.CRAFTING_STORAGE_4M))
        .duration(1200).EUt(GTValues.VA[GTValues.ZPM]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("megacells/crafting/16m_crafting_storage")
        .inputItems(new ItemStack(MEGABlocks.MEGA_CRAFTING_UNIT))
        .inputItems(new ItemStack(MEGAItems.CELL_COMPONENT_16M))
        .outputItems(new ItemStack(MEGABlocks.CRAFTING_STORAGE_16M))
        .duration(1200).EUt(GTValues.VA[GTValues.ZPM]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("megacells/crafting/64m_crafting_storage")
        .inputItems(new ItemStack(MEGABlocks.MEGA_CRAFTING_UNIT))
        .inputItems(new ItemStack(MEGAItems.CELL_COMPONENT_64M))
        .outputItems(new ItemStack(MEGABlocks.CRAFTING_STORAGE_64M))
        .duration(1200).EUt(GTValues.VA[GTValues.ZPM]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("megacells/crafting/256m_crafting_storage")
        .inputItems(new ItemStack(MEGABlocks.MEGA_CRAFTING_UNIT))
        .inputItems(new ItemStack(MEGAItems.CELL_COMPONENT_256M))
        .outputItems(new ItemStack(MEGABlocks.CRAFTING_STORAGE_256M))
        .duration(1200).EUt(GTValues.VA[GTValues.ZPM]).save(provider);

  }


  private static void crefting(String id, ItemStack input1, ItemStack input2, ItemStack output, int time, int eut, Consumer<FinishedRecipe> provider) {
    ASSEMBLER_RECIPES.recipeBuilder(id)
        .inputItems(input1)
        .inputItems(input2)
        .outputItems(output)
        .duration(time).EUt(eut).save(provider);
  }
  private static void crefting(String id, ItemStack input1, Item input2, ItemStack output, int time, int eut, Consumer<FinishedRecipe> provider) {
    ASSEMBLER_RECIPES.recipeBuilder(id)
        .inputItems(input1)
        .inputItems(input2)
        .outputItems(output)
        .duration(time).EUt(eut).save(provider);
  }
}
