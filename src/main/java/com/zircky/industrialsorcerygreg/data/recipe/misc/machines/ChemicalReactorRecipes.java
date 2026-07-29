package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.zircky.industrialsorcerygreg.common.data.ISGMaterials;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.Items;

import java.util.function.Consumer;

import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.*;

public class ChemicalReactorRecipes {
  public static void init(Consumer<FinishedRecipe> provider) {
    recipesChem(provider);

    IMPLOSION_RECIPES.recipeBuilder("pyrolitic_carbon")
        .inputDust(GTMaterials.Granite, 9)
        .inputItems(Items.TNT, 9)
        .outputDust(ISGMaterials.PyroliticCarbon, 2)
        .duration(1).EUt(GTValues.VA[GTValues.HV]).save(provider);
  }

  private static void recipesChem(Consumer<FinishedRecipe> provider) {
    CHEMICAL_RECIPES.recipeBuilder("manganese_oxide_dioxide")
        .inputDust(ISGMaterials.ManganeseOxide)
        .inputFluids(GTMaterials.Oxygen.getFluid(1000))
        .outputDust(ISGMaterials.ManganeseDioxide)
        .duration(230).EUt(GTValues.VA[GTValues.HV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder("manganese_dioxide")
        .inputDust(GTMaterials.Manganese)
        .inputFluids(GTMaterials.Oxygen.getFluid(2000))
        .outputDust(ISGMaterials.ManganeseDioxide)
        .duration(230).EUt(GTValues.VA[GTValues.EV]).save(provider);
  }

}
