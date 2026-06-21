package com.zircky.industrialsorcerygreg.data.recipe.misc.processecing.platinum;

import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.zircky.industrialsorcerygreg.common.data.ISGMaterials;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.*;


public class PlatinumLine {
  public static void init(Consumer<FinishedRecipe> provider) {
    CHEMICAL_RECIPES.recipeBuilder("platline_chalcopyrite_concentrate")
        .inputItems(TagPrefix.crushedPurified, GTMaterials.Chalcopyrite, 9)
        .inputItems(TagPrefix.dust, ISGMaterials.PlatinumMetallicPowder, 9)
        .inputFluids(GTMaterials.AquaRegia.getFluid(20700))
        .outputFluids(ISGMaterials.PlatinumConcentrate.getFluid(20700))
        .duration((int) (MINUTES + 52 * SECONDS + 10))
        .EUt(VA[MV])
        .save(provider);
    CHEMICAL_RECIPES.recipeBuilder("platline_pentlandite_concentrate")
        .inputItems(TagPrefix.crushedPurified, GTMaterials.Pentlandite, 9)
        .inputItems(TagPrefix.dust, ISGMaterials.PlatinumMetallicPowder, 9)
        .inputFluids(GTMaterials.AquaRegia.getFluid(20700))
        .outputFluids(ISGMaterials.PlatinumConcentrate.getFluid(20700))
        .duration((int) (MINUTES + 52 * SECONDS + 10))
        .EUt(VA[MV])
        .save(provider);
    CHEMICAL_RECIPES.recipeBuilder("platline_pentlandite_concentrate")
        .inputItems(TagPrefix.crushedPurified, GTMaterials.Pentlandite, 9)
        .inputItems(TagPrefix.dust, ISGMaterials.PlatinumMetallicPowder, 9)
        .inputFluids(GTMaterials.AquaRegia.getFluid(20700))
        .outputFluids(ISGMaterials.PlatinumConcentrate.getFluid(20700))
        .duration((int) (MINUTES + 52 * SECONDS + 10))
        .EUt(VA[MV])
        .save(provider);
  }
}
