package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.zircky.industrialsorcerygreg.ISGCore;
import com.zircky.industrialsorcerygreg.api.ISGValues;
import com.zircky.industrialsorcerygreg.common.data.ISGItems;
import com.zircky.industrialsorcerygreg.common.data.ISGMaterials;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.MIXER_RECIPES;

public class MixerRecipes {
  public static void init(Consumer<FinishedRecipe> provider) {
    MIXER_RECIPES.recipeBuilder(ISGCore.id("lead_platinum"))
        .inputDust(GTMaterials.Lead, 5)
        .inputDust(GTMaterials.Platinum, 1)
        .circuitMeta(5)
        .outputDust(ISGMaterials.LeadPlatinum, 6)
        .EUt(ISGValues.VA[ISGValues.EV])
        .duration(1600)
        .save(provider);

    MIXER_RECIPES.recipeBuilder("mica_based_pulp")
        .inputDust(GTMaterials.Mica, 3)
        .inputDust(GTMaterials.RawRubber, 2)
        .outputItems(ISGItems.MICA_BASED_PULP, 5)
        .EUt(8)
        .duration(300)
        .save(provider);
  }
}
