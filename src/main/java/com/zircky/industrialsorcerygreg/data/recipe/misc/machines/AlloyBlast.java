package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.ALLOY_BLAST_RECIPES;

public class AlloyBlast {
  public static void init(Consumer<FinishedRecipe> provider) {
    ALLOY_BLAST_RECIPES.recipeBuilder(GTCEu.id("yttrium_barium_cuprate"))
        .inputItems(TagPrefix.dust, GTMaterials.Yttrium)
        .inputItems(TagPrefix.dust, GTMaterials.Barium, 2)
        .inputItems(TagPrefix.dust, GTMaterials.Copper, 3)
        .circuitMeta(3)
        .inputFluids(GTMaterials.Oxygen, 7000)
        .outputFluids(GTMaterials.YttriumBariumCuprate.getFluid(1872))
        .EUt(524288)
        .blastFurnaceTemp(12288)
        .duration(3450)
        .save(provider);
  }
}
