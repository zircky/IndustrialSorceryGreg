package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import com.gregtechceu.gtceu.GTCEu;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.*;

public class LiquefactionFurnace {
  public static void init(Consumer<FinishedRecipe> provider) {
        // Graphene Oxidation Residue -> Graphene Oxidation Solution
        LIQUEFACTION_FURNACE_RECIPES.recipeBuilder("graphene_oxidation_residue_to_graphene_oxidation_solution").duration(65).EUt(24)
                .inputDust(GrapheneOxidationResidue)
                .outputFluids(GrapheneOxidationSolution.getFluid(100))
                .save(provider);

        LIQUEFACTION_FURNACE_RECIPES.recipeBuilder(GTCEu.id("extract_pyrotheum_dust")).duration(32).EUt(24)
                .inputDust(Pyrotheum)
                .outputFluids(Pyrotheum.getFluid(250))
                .save(provider);

        LIQUEFACTION_FURNACE_RECIPES.recipeBuilder("cryotheum_to_cryotheum").duration(32).EUt(24)
                .inputDust(Cryotheum)
                .outputFluids(Cryotheum.getFluid(250))
                .save(provider);

    // TODO migrated disabled: unresolved old test symbol `RUBBER_DROP`.
    // 
    //         EXTRACTOR_RECIPES.recipeBuilder("rubber_drop_to_resin")
    //                 .inputItems(RUBBER_DROP.asStack())
    //                 .outputFluids(Resin.getFluid(100))
    //                 .EUt(24)
    //                 .duration(100)
    //                 .save(provider);
    //   

}
}
