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

import static com.gregtechceu.gtceu.common.data.GTMaterials.Rutile;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.MACERATOR_RECIPES;

public class Macerator {
  public static void init(Consumer<FinishedRecipe> provider) {
    MACERATOR_RECIPES.recipeBuilder("finely_powdered_rutile").duration(190).EUt(120)
        .inputDust(Rutile)
        .outputDust(FinelyPowderedRutile)
        .save(provider);
    testRecipes(provider);
  }

  private static void testRecipes(Consumer<FinishedRecipe> provider) {
    // TODO migrated disabled: unresolved old test symbol `DEGENERATE_RHENIUM_PLATE`.
    //     // Migrated from misc/test recipes.
    //         MACERATOR_RECIPES.recipeBuilder("degenerate_rhenium_plate_to_degenerate_rhenium_dust")
    //                 .inputItems(DEGENERATE_RHENIUM_PLATE.asStack())
    //                 .outputItems(DEGENERATE_RHENIUM_DUST.asStack(4))
    //                 .duration(100)
    //                 .EUt(62_914_560)
    //                 .save(provider);
    // 
    // 
    //         

// (VO)C(TiO2) = Dark Ash + TiO2 + VO
    MACERATOR_RECIPES.recipeBuilder("vanadium_slag_to_dark_ash_dust_vanadium_slag").duration(80).EUt(24)
        .inputDust(VanadiumSlag, 5)
        .outputDust(DarkAsh)
        .chancedOutput(dust, Rutile, 1, 2500)
        .outputItems(ChemicalHelper.get(dust, VanadiumSlag, 2))
        .save(provider);


// This needs to be better, Zalgo was working on something
    MACERATOR_RECIPES.recipeBuilder("apple_to_dust")
        .inputItems(new ItemStack(Items.APPLE))
        .chancedOutput(dust, Yeast, 1, 500)
        .EUt(30)
        .duration(50)
        .save(provider);

    // Zinc Residual Slag = Fine Zinc Slag Dust
    MACERATOR_RECIPES.recipeBuilder("zinc_residual_slag_to_fine_zinc_slag").duration(80).EUt(120)
        .inputDust(ZincResidualSlag)
        .outputItems(ChemicalHelper.get(dust, FineZincSlag))
        .save(provider);

  }

}
