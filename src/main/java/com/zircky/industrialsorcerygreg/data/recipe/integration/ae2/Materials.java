package com.zircky.industrialsorcerygreg.data.recipe.integration.ae2;

import appeng.core.definitions.AEBlocks;
import appeng.core.definitions.AEItems;
import appeng.core.definitions.AEParts;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.MaterialEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTItems;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.ASSEMBLER_RECIPES;

public class Materials {
  public static void init(Consumer<FinishedRecipe> provider) {
    materials(provider);
  }

  private static void materials(Consumer<FinishedRecipe> provider) {
    ASSEMBLER_RECIPES.recipeBuilder("ae2/materials/annihilationcore")
        .inputItems(new ItemStack(AEItems.LOGIC_PROCESSOR, 4))
        .inputItems(TagPrefix.rod, GTMaterials.NetherQuartz, 4)
        .inputItems(new ItemStack(AEItems.FLUIX_CRYSTAL, 2))
        .outputItems(new ItemStack(AEItems.ANNIHILATION_CORE))
        .duration(400).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/materials/formationcore")
        .inputItems(new ItemStack(AEItems.LOGIC_PROCESSOR, 4))
        .inputItems(TagPrefix.rod, GTMaterials.CertusQuartz, 4)
        .inputItems(new ItemStack(AEItems.FLUIX_CRYSTAL, 2))
        .outputItems(new ItemStack(AEItems.FORMATION_CORE))
        .duration(400).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/materials/basiccard")
        .inputItems(new ItemStack(AEItems.CALCULATION_PROCESSOR))
        .inputItems(TagPrefix.plate, GTMaterials.BlueAlloy, 3)
        .inputItems(TagPrefix.plate, GTMaterials.RedAlloy)
        .inputItems(TagPrefix.plate, GTMaterials.RoseGold)
        .circuitMeta(2)
        .outputItems(new ItemStack(AEItems.BASIC_CARD))
        .duration(120).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/materials/advancedcard")
        .inputItems(new ItemStack(AEItems.CALCULATION_PROCESSOR))
        .inputItems(TagPrefix.plate, GTMaterials.TitaniumTungstenCarbide, 3)
        .inputItems(TagPrefix.plate, GTMaterials.RedAlloy)
        .inputItems(TagPrefix.plate, GTMaterials.Platinum)
        .circuitMeta(2)
        .outputItems(new ItemStack(AEItems.ADVANCED_CARD))
        .duration(120).EUt(GTValues.VA[GTValues.EV]).save(provider);

    VanillaRecipeHelper.addShapelessRecipe(provider, "ae2/materials/cardredstone", new ItemStack(AEItems.REDSTONE_CARD), new ItemStack(AEItems.BASIC_CARD), new ItemStack(Blocks.REDSTONE_TORCH), new ItemStack(AEItems.CALCULATION_PROCESSOR));
    VanillaRecipeHelper.addShapelessRecipe(provider, "ae2/materials/cardcapacity", new ItemStack(AEItems.CAPACITY_CARD), new ItemStack(AEItems.BASIC_CARD), new ItemStack(AEItems.CELL_COMPONENT_1K), new MaterialEntry(TagPrefix.gem, GTMaterials.CertusQuartz));
    VanillaRecipeHelper.addShapelessRecipe(provider, "ae2/materials/cardfuzzy", new ItemStack(AEItems.FUZZY_CARD), new ItemStack(AEItems.ADVANCED_CARD), new ItemStack(AEItems.CALCULATION_PROCESSOR), new ItemStack(AEItems.LOGIC_PROCESSOR), new ItemStack(AEItems.ENGINEERING_PROCESSOR));
    VanillaRecipeHelper.addShapelessRecipe(provider, "ae2/materials/cardspeed", new ItemStack(AEItems.SPEED_CARD), new ItemStack(AEItems.ADVANCED_CARD), new ItemStack(AEItems.ENGINEERING_PROCESSOR), new ItemStack(AEItems.LOGIC_PROCESSOR), new ItemStack(AEItems.FLUIX_CRYSTAL));
    VanillaRecipeHelper.addShapelessRecipe(provider, "ae2/materials/cardinverter", new ItemStack(AEItems.INVERTER_CARD), new ItemStack(AEItems.ADVANCED_CARD), new ItemStack(AEParts.INVERTED_TOGGLE_BUS), new ItemStack(AEItems.CALCULATION_PROCESSOR));
    VanillaRecipeHelper.addShapelessRecipe(provider, "ae2/materials/cardcrafting", new ItemStack(AEItems.CRAFTING_CARD), new ItemStack(AEItems.BASIC_CARD), new ItemStack(AEItems.CELL_COMPONENT_1K), new ItemStack(Blocks.CRAFTING_TABLE));
    VanillaRecipeHelper.addShapelessRecipe(provider, "ae2/materials/carddistribution", new ItemStack(AEItems.EQUAL_DISTRIBUTION_CARD), new ItemStack(AEItems.ADVANCED_CARD), new ItemStack(AEItems.CALCULATION_PROCESSOR), new ItemStack(AEItems.ENGINEERING_PROCESSOR), new ItemStack(GTItems.ITEM_FILTER));
    VanillaRecipeHelper.addShapelessRecipe(provider, "ae2/materials/cardvoid", new ItemStack(AEItems.VOID_CARD), new ItemStack(AEItems.BASIC_CARD), new ItemStack(AEItems.CALCULATION_PROCESSOR), new ItemStack(AEItems.ENGINEERING_PROCESSOR), new ItemStack(GTItems.COVER_ITEM_VOIDING_ADVANCED));
    VanillaRecipeHelper.addShapelessRecipe(provider, "ae2/materials/cardenergy", new ItemStack(AEItems.ENERGY_CARD), new ItemStack(AEItems.ADVANCED_CARD), new ItemStack(AEBlocks.DENSE_ENERGY_CELL), new ItemStack(GTItems.COVER_ENERGY_DETECTOR_ADVANCED));
  }

}
