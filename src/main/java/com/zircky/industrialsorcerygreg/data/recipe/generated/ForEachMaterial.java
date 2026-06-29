package com.zircky.industrialsorcerygreg.data.recipe.generated;

import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;
import com.gregtechceu.gtceu.api.registry.GTRegistries;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

public class ForEachMaterial {
  public static void init(Consumer<FinishedRecipe> provider) {
    for (Material material : GTRegistries.MATERIALS.values()) {
      if (material.hasFlag(MaterialFlags.NO_UNIFICATION)) {
        continue;
      }

      ISGPartsRecipeHandler.init(provider, material);
      ISGOreRecipeHandler.run(provider, material);
      ISGRecyclingRecipeHandler.run(provider, material);
      ISGRecipeMixerHandler.run(provider, material);
      ISGWireCombiningHandler.run(provider, material);
    }
  }
}
