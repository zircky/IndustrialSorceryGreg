package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import com.zircky.industrialsorcerygreg.common.data.ISGMaterials;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.Items;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.CHEMICAL_RECIPES;

public class ChemicalReactorRecipes {
  public static void init(Consumer<FinishedRecipe> provider) {
    recipesChem(provider);

    GTRecipeTypes.IMPLOSION_RECIPES.recipeBuilder("pyrolitic_carbon")
        .inputItems(GTMaterials.Granite, 9)
        .inputItems(Items.TNT, 9)
        .outputItems(TagPrefix.dust, ISGMaterials.PyroliticCarbon, 2)
        .duration(1).EUt(GTValues.VA[GTValues.HV]).save(provider);
  }

  private static void recipesChem(Consumer<FinishedRecipe> provider) {
    CHEMICAL_RECIPES.recipeBuilder("manganese_oxide_dioxide")
        .inputItems(TagPrefix.dust, ISGMaterials.ManganeseOxide)
        .inputFluids(GTMaterials.Oxygen.getFluid(1000))
        .outputItems(TagPrefix.dust, ISGMaterials.ManganeseDioxide)
        .duration(230).EUt(GTValues.VA[GTValues.HV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder("manganese_dioxide")
        .inputItems(TagPrefix.dust, GTMaterials.Manganese)
        .inputFluids(GTMaterials.Oxygen.getFluid(2000))
        .outputItems(TagPrefix.dust, ISGMaterials.ManganeseDioxide)
        .duration(230).EUt(GTValues.VA[GTValues.EV]).save(provider);
  }
}
