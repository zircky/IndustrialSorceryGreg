package com.zircky.industrialsorcerygreg.data.recipe.integration.ae2;

import appeng.core.definitions.AEBlocks;
import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.MaterialEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;

import java.util.function.Consumer;

public class Slabs {
    public static void init(Consumer<FinishedRecipe> provider) {
        slabs(provider);
    }

    private static void slabs(Consumer<FinishedRecipe> provider) {
        recipeSlabs(provider, "ae2/shaped/slabs/chiseled_quartz_block", new ItemStack(AEBlocks.CHISELED_QUARTZ_SLAB), new ItemStack(AEBlocks.CHISELED_QUARTZ_BLOCK));
        recipeSlabs(provider, "ae2/shaped/slabs/cut_quartz_block", new ItemStack(AEBlocks.CUT_QUARTZ_SLAB), new ItemStack(AEBlocks.CUT_QUARTZ_BLOCK));
        recipeSlabs(provider, "ae2/shaped/slabs/fluix_block", new ItemStack(AEBlocks.FLUIX_SLAB), new ItemStack(AEBlocks.FLUIX_BLOCK));
        recipeSlabs(provider, "ae2/shaped/slabs/quartz_block", new ItemStack(AEBlocks.QUARTZ_SLAB), new MaterialEntry(TagPrefix.block, GTMaterials.CertusQuartz));
        recipeSlabs(provider, "ae2/shaped/slabs/quartz_bricks", new ItemStack(AEBlocks.QUARTZ_BRICK_SLAB), new ItemStack(AEBlocks.QUARTZ_BRICKS));
        recipeSlabs(provider, "ae2/shaped/slabs/quartz_pillar", new ItemStack(AEBlocks.QUARTZ_PILLAR_SLAB), new ItemStack(AEBlocks.QUARTZ_PILLAR));
        recipeSlabs(provider, "ae2/shaped/slabs/sky_stone_block", new ItemStack(AEBlocks.SKY_STONE_SLAB), new ItemStack(AEBlocks.SKY_STONE_BLOCK));
        recipeSlabs(provider, "ae2/shaped/slabs/sky_stone_brick", new ItemStack(AEBlocks.SKY_STONE_BRICK_SLAB), new ItemStack(AEBlocks.SKY_STONE_BRICK));
        recipeSlabs(provider, "ae2/shaped/slabs/sky_stone_small_brick", new ItemStack(AEBlocks.SKY_STONE_SMALL_BRICK_SLAB), new ItemStack(AEBlocks.SKY_STONE_SMALL_BRICK));
        recipeSlabs(provider, "ae2/shaped/slabs/smooth_quartz_block", new ItemStack(AEBlocks.SMOOTH_QUARTZ_SLAB), new ItemStack(AEBlocks.SMOOTH_QUARTZ_BLOCK));
        recipeSlabs(provider, "ae2/shaped/slabs/smooth_sky_stone_block", new ItemStack(AEBlocks.SMOOTH_SKY_STONE_SLAB), new ItemStack(AEBlocks.SMOOTH_SKY_STONE_BLOCK));
    }

    private static void recipeSlabs(Consumer<FinishedRecipe> provider, String regName, ItemStack output, ItemStack input) {
        VanillaRecipeHelper.addShapedRecipe(provider, regName + "_slabs_saw", output,
                "sS",
                'S', input);
    }

    private static void recipeSlabs(Consumer<FinishedRecipe> provider, String regName, ItemStack output, MaterialEntry input) {
        VanillaRecipeHelper.addShapedRecipe(provider, regName + "_slabs_saw", output,
                "sS",
                'S', input);
    }
}
