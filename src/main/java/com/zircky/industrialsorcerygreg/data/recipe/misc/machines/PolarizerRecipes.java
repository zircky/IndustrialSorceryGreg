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

public class PolarizerRecipes {
  public static void init(Consumer<FinishedRecipe> provider) {
    // Migrated from misc/test recipes.
    // TODO migrated disabled: unresolved old test symbol `TRIPLET_NEUTRONIUM_SPHERE`.
    //         POLARIZER_RECIPES.recipeBuilder("neutronium_sphere_to_triplet_neutronium_sphere").duration(200).EUt(500000)
    //                 .inputItems(NEUTRONIUM_SPHERE.asStack())
    //                 .outputItems(TRIPLET_NEUTRONIUM_SPHERE.asStack())
    //                 .save(provider);
    //   

}
}
