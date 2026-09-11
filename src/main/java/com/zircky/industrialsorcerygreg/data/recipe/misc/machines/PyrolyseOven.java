package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTItems.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGCasings.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGItems.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.*;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.PYROLYSE_RECIPES;

public class PyrolyseOven {
  public static void init(Consumer<FinishedRecipe> provider) {
    // 3C2F4 -> 2C3F6
    PYROLYSE_RECIPES.recipeBuilder("hexafluoropropylene")
        .circuitMeta(1)
        .notConsumable(TagPrefix.rod, Steel)
        .inputFluids(Tetrafluoroethylene.getFluid(3000))
        .outputFluids(Hexafluoropropylene.getFluid(2000))
        .EUt(96)
        .duration(460)
        .save(provider);
    testRecipes(provider);
  }

  private static void testRecipes(Consumer<FinishedRecipe> provider) {
    // Migrated from misc/test recipes.
    // TODO migrated disabled: unresolved old test symbol `Lignite`.
    //         PYROLYSE_RECIPES.recipeBuilder("lignite_to_ash_coal_tar").duration(1080).EUt(60)
    //                 .circuitMeta(20)
    //                 .inputItems(gem, Lignite, 16)
    //                 .outputDust(Ash, 4)
    //                 .outputFluids(CoalTar.getFluid(800))
    //                 .save(provider);
    // 
    //         

PYROLYSE_RECIPES.recipeBuilder("charcoal_to_ash_coal_tar").duration(360).EUt(120)
                .circuitMeta(20)
                .inputItems(gem, Charcoal, 32)
                .outputDust(Ash, 4)
                .outputFluids(CoalTar.getFluid(800))
                .save(provider);

        PYROLYSE_RECIPES.recipeBuilder("coal_to_ash_coal_tar").duration(720).EUt(120)
                .circuitMeta(20)
                .inputItems(gem, Coal, 12)
                .outputDust(Ash, 4)
                .outputFluids(CoalTar.getFluid(2200))
                .save(provider);

        PYROLYSE_RECIPES.recipeBuilder("coke_to_ash_coal_tar").duration(360).EUt(240)
                .circuitMeta(20)
                .inputItems(gem, Coke, 8)
                .outputDust(Ash, 4)
                .outputFluids(CoalTar.getFluid(3400))
                .save(provider);
  }

}
