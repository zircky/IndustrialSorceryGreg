package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.zircky.industrialsorcerygreg.common.data.ISGMaterials;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.Items;

import java.util.function.Consumer;

import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.IMPLOSION_RECIPES;

public class ImplosionCompressor {
  public static void init(Consumer<FinishedRecipe> provider) {
    IMPLOSION_RECIPES.recipeBuilder("pyrolitic_carbon")
        .inputDust(GTMaterials.Granite, 9)
        .inputItems(Items.TNT, 9)
        .outputDust(ISGMaterials.PyroliticCarbon, 2)
        .duration(1).EUt(GTValues.VA[GTValues.HV]).save(provider);
  }
}
