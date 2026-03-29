package com.zircky.industrialsorcerygreg.data.recipe.integration.ae2;

import appeng.core.definitions.AEBlocks;
import com.gregtechceu.gtceu.api.GTValues;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.ASSEMBLER_RECIPES;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.CENTRIFUGE_RECIPES;

public class Misc {
  public static void init(Consumer<FinishedRecipe> provider) {
    misc(provider);
  }

  private static void misc(Consumer<FinishedRecipe> provider) {
    ASSEMBLER_RECIPES.recipeBuilder("ae2/misc/chests_sky_stone")
        .inputItems(new ItemStack(AEBlocks.SKY_STONE_BLOCK, 8))
        .inputItems(Tags.Items.CHESTS_WOODEN)
        .outputItems(new ItemStack(AEBlocks.SKY_STONE_CHEST))
        .duration(200).EUt(GTValues.VA[GTValues.LV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/misc/chests_smooth_sky_stone")
        .inputItems(new ItemStack(AEBlocks.SMOOTH_SKY_STONE_BLOCK, 8))
        .inputItems(Tags.Items.CHESTS_WOODEN)
        .outputItems(new ItemStack(AEBlocks.SMOOTH_SKY_STONE_CHEST))
        .duration(200).EUt(GTValues.VA[GTValues.LV]).save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("ae2/misc/tiny_tnt")
        .inputItems(new ItemStack(Blocks.TNT))
        .outputItems(new ItemStack(AEBlocks.TINY_TNT))
        .duration(20 * 30).EUt(5).save(provider);
  }
}
