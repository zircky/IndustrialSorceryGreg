package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTItems.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGCasings.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGItems.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.*;

public class ExtractorRecipes {
  public static void init(Consumer<FinishedRecipe> provider) {
    // Migrated from misc/test recipes.
        EXTRACTOR_RECIPES.recipeBuilder("lead_bismuth_eutectic_to_lead_bismuth_eutectic").EUt(30).duration(200)
                .inputDust(LeadBismuthEutectic)
                .outputFluids(LeadBismuthEutectic.getFluid(144))
                .save(provider);

        EXTRACTOR_RECIPES.recipeBuilder("f_li_be_to_f_li_be").EUt(30).duration(200)
                .inputDust(FLiBe)
                .outputFluids(FLiBe.getFluid(144))
                .save(provider);

        EXTRACTOR_RECIPES.recipeBuilder("f_li_na_k_to_f_li_na_k").EUt(30).duration(100)
                .inputDust(FLiNaK)
                .outputFluids(FLiNaK.getFluid(144))
                .save(provider);

        EXTRACTOR_RECIPES.recipeBuilder("sodium_potassium_alloy_to_sodium_potassium_alloy").EUt(30).duration(160)
                .inputDust(SodiumPotassiumAlloy)
                .outputFluids(SodiumPotassiumAlloy.getFluid(144))
                .save(provider);


        // Graphene Oxidation Residue -> Graphene Oxidation Solution
        EXTRACTOR_RECIPES.recipeBuilder("graphene_oxidation_residue_to_graphene_oxidation_solution").duration(65).EUt(24)
                .inputDust(GrapheneOxidationResidue)
                .outputFluids(GrapheneOxidationSolution.getFluid(100))
                .save(provider);

        EXTRACTOR_RECIPES.recipeBuilder("pyrotheum_to_pyrotheum").duration(32).EUt(24)
                .inputDust(Pyrotheum)
                .outputFluids(Pyrotheum.getFluid(250))
                .save(provider);

        EXTRACTOR_RECIPES.recipeBuilder("cryotheum_to_cryotheum").duration(32).EUt(24)
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
