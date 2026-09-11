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
import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.ALLOY_BLAST_RECIPES;

public class AlloyBlast {
  public static void init(Consumer<FinishedRecipe> provider) {
    ALLOY_BLAST_RECIPES.recipeBuilder(GTCEu.id("yttrium_barium_cuprate"))
        .inputDust(GTMaterials.Yttrium)
        .inputDust(GTMaterials.Barium, 2)
        .inputDust(GTMaterials.Copper, 3)
        .circuitMeta(3)
        .inputFluids(GTMaterials.Oxygen, 7000)
        .outputFluids(GTMaterials.YttriumBariumCuprate.getFluid(FluidStorageKeys.MOLTEN, 1872))
        .EUt(524288)
        .blastFurnaceTemp(12288)
        .duration(3450)
        .save(provider);
    testRecipes(provider);
  }

  private static void testRecipes(Consumer<FinishedRecipe> provider) {
        ALLOY_BLAST_RECIPES.recipeBuilder("silicon_dioxide_barium_oxide_garnierite_soda_ash_to_woods_glass").duration(290).EUt(1920)
                .inputDust(SiliconDioxide, 3)
                .inputDust(BariumOxide, 2)
                .inputDust(Garnierite, 2)
                .inputDust(SodaAsh, 6)
                .outputFluids(WoodsGlass.getFluid(1296))
                .blastFurnaceTemp(1400)
                .save(provider);

        ALLOY_BLAST_RECIPES.recipeBuilder("seaborgium_bohrium_rutherfordium_dubnium_to_superheavy_mix")
                .inputDust(Seaborgium)
                .inputDust(Bohrium)
                .inputDust(Rutherfordium)
                .inputDust(Dubnium)
                .circuitMeta(1)
                .outputFluids(SuperheavyMix.getFluid(4000))
                .EUt(25_000_000)
                .duration(40)
                .blastFurnaceTemp(11000)
                .save(provider);
  }

}
