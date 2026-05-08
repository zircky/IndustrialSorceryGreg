package com.zircky.industrialsorcerygreg.data.recipe.integration.ae2.network;

import appeng.core.definitions.AEBlocks;
import appeng.core.definitions.AEItems;
import appeng.core.definitions.AEParts;
import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.MaterialEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.data.recipe.CustomTags;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;

import java.util.function.Consumer;

import static appeng.api.util.AEColor.TRANSPARENT;
import static appeng.core.definitions.AEParts.GLASS_CABLE;

public class Network {
  public static void init(Consumer<FinishedRecipe> provider) {
    network(provider);
  }

  private static void network(Consumer<FinishedRecipe> provider) {
    VanillaRecipeHelper.addShapedRecipe(provider, "ae2/network/wireless_access_point", new ItemStack(AEBlocks.WIRELESS_ACCESS_POINT.asItem()),
        " W ", "SCS", "dGw",
        'G', new ItemStack(GLASS_CABLE.item(TRANSPARENT)),
        'W', new ItemStack(AEItems.WIRELESS_RECEIVER.asItem()),
        'C', new ItemStack(AEItems.CALCULATION_PROCESSOR.asItem()),
        'S', new MaterialEntry(TagPrefix.screw, GTMaterials.TitaniumTungstenCarbide));

    VanillaRecipeHelper.addShapedRecipe(provider, "ae2/network/wireless_terminal", new ItemStack(AEItems.WIRELESS_TERMINAL.asItem()),
        "WTW", "PEP", "PDP",
        'W', new ItemStack(AEItems.WIRELESS_RECEIVER),
        'T', new ItemStack(AEParts.TERMINAL.asItem()),
        'P', new MaterialEntry(TagPrefix.plate, GTMaterials.NetherQuartz),
        'E', new ItemStack(AEItems.ENGINEERING_PROCESSOR),
        'D', new ItemStack(AEBlocks.DENSE_ENERGY_CELL));

    VanillaRecipeHelper.addShapedRecipe(provider, "ae2/network/wireless_crafting_terminal", new ItemStack(AEItems.WIRELESS_CRAFTING_TERMINAL.asItem()),
        "PAP", "FTF", "CSX",
        'P', new ItemStack(AEItems.FLUIX_PEARL),
        'T', new ItemStack(AEParts.CRAFTING_TERMINAL.asItem()),
        'A', new ItemStack(AEBlocks.WIRELESS_ACCESS_POINT),
        'F', new ItemStack(AEItems.FLUIX_CRYSTAL),
        'C', new ItemStack(AEItems.CELL_COMPONENT_64K),
        'S', new ItemStack(AEItems.SINGULARITY),
        'X', new ItemStack(AEItems.CELL_COMPONENT_16K));

    VanillaRecipeHelper.addShapedRecipe(provider, "ae2/network/wireless_part", new ItemStack(AEItems.WIRELESS_RECEIVER),
        "QFQ", " C ", "SES",
        'Q', new ItemStack(AEParts.QUARTZ_FIBER),
        'F', new ItemStack(AEItems.FLUIX_PEARL),
        'C', new MaterialEntry(TagPrefix.rod, GTMaterials.CertusQuartz),
        'S', new MaterialEntry(TagPrefix.plate, GTMaterials.StainlessSteel),
        'E', CustomTags.EV_CIRCUITS);

  }


}
