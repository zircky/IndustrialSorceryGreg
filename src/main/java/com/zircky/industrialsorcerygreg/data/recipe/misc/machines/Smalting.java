package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.chemical.material.event.MaterialEvent;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.dust;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;

public class Smalting {
  public static void init(Consumer<FinishedRecipe> provider) {
    VanillaRecipeHelper.addSmeltingRecipe(provider, "burned_sienna", ChemicalHelper.get(dust, RawSienna), ChemicalHelper.get(dust, BurnedSienna), 0);
    VanillaRecipeHelper.addSmeltingRecipe(provider, "scheeles_green", ChemicalHelper.get(dust, CopperArsenite), ChemicalHelper.get(dust, ScheelesGreen), 0);
  }

}

