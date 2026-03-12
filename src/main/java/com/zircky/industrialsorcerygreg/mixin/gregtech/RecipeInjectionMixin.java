package com.zircky.industrialsorcerygreg.mixin.gregtech;

import com.gregtechceu.gtceu.common.data.GTRecipes;
import com.zircky.industrialsorcerygreg.data.recipe.generated.ISGMaterialRecipeHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value = GTRecipes.class)
public class RecipeInjectionMixin {
  @Redirect(method = "recipeAddition",
      at = @At(value = "INVOKE", target = "Lcom/gregtechceu/gtceu/data/recipe/generated/MaterialRecipeHandler;run(Ljava/util/function/Consumer;Lcom/gregtechceu/gtceu/api/data/chemical/material/Material;)V"
      ),
      remap = false,
      require = 0
  )
  private static void cmme$recipeAddition(
      java.util.function.Consumer<net.minecraft.data.recipes.FinishedRecipe> consumer,
      com.gregtechceu.gtceu.api.data.chemical.material.Material material
  ){
    ISGMaterialRecipeHandler.run(consumer,material);
    com.gregtechceu.gtceu.data.recipe.generated.MaterialRecipeHandler.run(consumer, material);
  }
}
