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

public class AutoclaveRecipes {
  public static void init(Consumer<FinishedRecipe> provider) {
    // Migrated from misc/test recipes.
        AUTOCLAVE_RECIPES.recipeBuilder("graphene_gel_suspension_acetone_to_dry_graphene_gel").duration(260).EUt(480)
                .inputDust(GrapheneGelSuspension)
                .inputFluids(Acetone.getFluid(100))
                .outputItems(ChemicalHelper.get(dust, DryGrapheneGel))
                .save(provider);

    // TODO migrated disabled: unresolved old test symbol `STERILIZED_PETRI_DISH`.
    //         AUTOCLAVE_RECIPES.recipeBuilder("petri_dish_ethanol100_to_sterilized_petri_dish")
    //                 .inputItems(PETRI_DISH.asStack())
    //                 .inputFluids(Ethanol100.getFluid(100))
    //                 .outputItems(STERILIZED_PETRI_DISH.asStack())
    //                 .EUt(7680)
    //                 .duration(25)
    //                 .save(provider);
    //   

}
}
