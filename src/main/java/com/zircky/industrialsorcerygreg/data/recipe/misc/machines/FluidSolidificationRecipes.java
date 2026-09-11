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

public class FluidSolidificationRecipes {
  public static void init(Consumer<FinishedRecipe> provider) {
    // Migrated from misc/test recipes.
    // TODO migrated disabled: unresolved old test symbol `GAMetaBlocks`.
    //         FLUID_SOLIDFICATION_RECIPES.recipeBuilder("superheavy_mix_to_superheavy_block")
    //                 .notConsumable(MetaItems.SHAPE_MOLD_BLOCK)
    //                 .inputFluids(SuperheavyMix.getFluid(1000))
    //                 .outputItems(GAMetaBlocks.SIMPLE_BLOCK.getItemVariant(GASimpleBlock.BlockType.SUPERHEAVY_BLOCK))
    //                 .EUt(100000000)
    //                 .duration(40)
    //                 .save(provider);
    // 
    //         FLUID_SOLIDFICATION_RECIPES.recipeBuilder("viscoelastic_polyurethane_foam_to_memory_foam_block").duration(60).EUt(30)
    //                 .inputFluids(ViscoelasticPolyurethaneFoam.getFluid(1000))
    //                 .notConsumable(SHAPE_MOLD_BLOCK)
    //                 .outputItems(MEMORY_FOAM_BLOCK.asStack())
    //                 .save(provider);
    //   

}
}
