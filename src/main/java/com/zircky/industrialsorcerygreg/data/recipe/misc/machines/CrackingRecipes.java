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

public class CrackingRecipes {
  public static void init(Consumer<FinishedRecipe> provider) {
    // Migrated from misc/test recipes.
        CRACKING_RECIPES.recipeBuilder("hydrogen_dimethylformamide_to_formaldehyde_dimethylamine").duration(40).EUt(120)
                .inputFluids(Hydrogen.getFluid(250))
                .inputFluids(Dimethylformamide.getFluid(750))
                .outputFluids(Formaldehyde.getFluid(120))
                .outputFluids(Dimethylamine.getFluid(160))
                .save(provider);
  }
}
