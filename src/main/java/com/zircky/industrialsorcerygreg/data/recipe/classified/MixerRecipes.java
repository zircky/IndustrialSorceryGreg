package com.zircky.industrialsorcerygreg.data.recipe.classified;

import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import com.zircky.industrialsorcerygreg.ISGCore;
import com.zircky.industrialsorcerygreg.api.ISGValues;
import com.zircky.industrialsorcerygreg.common.data.ISGMaterials;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

public class MixerRecipes {
  public static void init(Consumer<FinishedRecipe> provider) {
    GTRecipeTypes.MIXER_RECIPES.recipeBuilder(ISGCore.id("lead_platinum"))
        .inputItems(TagPrefix.dust, GTMaterials.Lead, 5)
        .inputItems(TagPrefix.dust, GTMaterials.Platinum, 1)
        .circuitMeta(5)
        .outputItems(TagPrefix.dust, ISGMaterials.LeadPlatinum, 6)
        .EUt(ISGValues.VA[ISGValues.EV])
        .duration(1600)
        .save(provider);
  }
}
