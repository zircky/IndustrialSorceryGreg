package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTItems.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGCasings.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGItems.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.*;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.dust;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.ELECTROMAGNETIC_SEPARATOR_RECIPES;

public class ElectromagneticSeparator {
  public static void init(Consumer<FinishedRecipe> provider) {
    ELECTROMAGNETIC_SEPARATOR_RECIPES.recipeBuilder("graphene_aligned_cnt").duration(260).EUt(122880)
        .inputDust(GrapheneNanotubeMix)
        .chancedOutput(dust, CarbonNanotubes, 1, 7500)
        .outputItems(GrapheneAlignedCNT)
        .save(provider);
    testRecipes(provider);
  }

  private static void testRecipes(Consumer<FinishedRecipe> provider) {
    // Migrated from misc/test recipes.

        // [6CO + Fe] -> C6O + Fe
        ELECTROMAGNETIC_SEPARATOR_RECIPES.recipeBuilder("graphene_iron_plate_to_graphene_oxide_iron").duration(120).EUt(30)
                .inputItems(GRAPHENE_IRON_PLATE.asStack())
                .outputItems(ChemicalHelper.get(dust, GrapheneOxide, 3))
                .outputDust(Iron)
                .save(provider);
  }

}
