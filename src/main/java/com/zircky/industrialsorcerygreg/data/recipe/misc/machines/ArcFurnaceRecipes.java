package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.WellMixedYBCOxides;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.ARC_FURNACE_RECIPES;

public class ArcFurnaceRecipes {
  public static void init(Consumer<FinishedRecipe> provider) {
    // 2Sb + 3O = Sb2O3
    ARC_FURNACE_RECIPES.recipeBuilder("antimony_trioxide").EUt(30).duration(60)
        .inputDust(Antimony, 2)
        .inputFluids(Oxygen.getFluid(3000))
        .outputDust(AntimonyTrioxide, 5)
        .save(provider);

    // NiZnFe4 + 8O = NiZnFe4O8
    ARC_FURNACE_RECIPES.recipeBuilder("nickel_zinc_ferrite").EUt(120 ,2).duration(600)
        .inputDust(FerriteMixture, 6)
        .inputFluids(Oxygen.getFluid(8000))
        .outputItems(ingot, NickelZincFerrite, 14)
        .save(provider);

    // YBa2Cu3O6 + O -> YBa2Cu3O7
        ARC_FURNACE_RECIPES.recipeBuilder("yttrium_barium_cuprate").duration(2509).EUt(7680,3)
        .inputDust(WellMixedYBCOxides, 12)
        .inputFluids(Oxygen.getFluid(1000))
        .outputItems(ingotHot, YttriumBariumCuprate, 13)
        .save(provider);

    ARC_FURNACE_RECIPES.recipeBuilder("cobalt_oxide").EUt(30).duration(100)
        .inputDust(Cobalt)
        .inputFluids(Oxygen.getFluid(1000))
        .outputDust(CobaltOxide, 2)
        .save(provider);
  }
}
