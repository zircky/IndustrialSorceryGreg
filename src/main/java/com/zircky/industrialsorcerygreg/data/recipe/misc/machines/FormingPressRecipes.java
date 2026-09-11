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
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.*;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.zircky.industrialsorcerygreg.common.data.ISGItems;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.FORMING_PRESS_RECIPES;

public class FormingPressRecipes {
  public static void init(Consumer<FinishedRecipe> provider) {
    FORMING_PRESS_RECIPES.recipeBuilder("mica_based_sheet")
        .inputItems(ISGItems.MICA_BASED_PULP, 3)
        .inputDust(GTMaterials.Asbestos, 2)
        .outputItems(ISGItems.MICA_BASED_SHEET, 2)
        .EUt(30)
        .duration(400)
        .save(provider);
    testRecipes(provider);
  }

  private static void testRecipes(Consumer<FinishedRecipe> provider) {
    // Migrated from misc/test recipes.
        FORMING_PRESS_RECIPES.recipeBuilder("cellulose_to_paper").duration(250).EUt(30)
                .inputDust(Cellulose)
                .notConsumable(SHAPE_MOLD_PLATE)
                .outputItems(new ItemStack(Items.PAPER))
                .save(provider);
  }

}
