package com.zircky.industrialsorcerygreg.api.recipe;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.recipe.GTRecipe;
import com.gregtechceu.gtceu.api.recipe.GTRecipeSerializer;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.gregtechceu.gtceu.api.registry.GTRegistries;
import com.gregtechceu.gtceu.utils.FormattingUtil;
import com.zircky.industrialsorcerygreg.ISGCore;
import com.zircky.industrialsorcerygreg.api.gui.LayeredRecipeUIHelper;
import com.zircky.industrialsorcerygreg.data.recipe.builder.ISGRecipeBuilder;
import lombok.Getter;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeType;

import java.util.Arrays;

public class ISGRecipeType extends GTRecipeType {
  @Getter
  private boolean layered;

  public ISGRecipeType(ResourceLocation registryName, String group, RecipeType<?>... proxyRecipes) {
    super(registryName, group, proxyRecipes);
    setRecipeBuilder(new ISGRecipeBuilder(registryName, this));
  }

  public ISGRecipeType setLayered() {
    setUiLayout(LayeredRecipeUIHelper.createRecipeUI(this));
    addCustomRecipeLogic(new ICustomRecipeLogic() {
      @Override
      public GTRecipe createCustomRecipe(com.gregtechceu.gtceu.api.capability.recipe.IRecipeCapabilityHolder holder) {
        return null;
      }

      @Override
      public void buildRepresentativeRecipes() {
        LayeredRecipeHelper.buildRepresentativeRecipes(ISGRecipeType.this);
      }
    });
    layered = true;
    return this;
  }

  public static ISGRecipeType register(String name, String group, RecipeType<?>... proxyRecipes) {
    var recipeType = new ISGRecipeType(GTCEu.id(name), group, proxyRecipes);
    GTRegistries.register(BuiltInRegistries.RECIPE_TYPE, recipeType.registryName, recipeType);
    GTRegistries.register(BuiltInRegistries.RECIPE_SERIALIZER, recipeType.registryName, new GTRecipeSerializer());
    GTRegistries.RECIPE_TYPES.register(recipeType.registryName, recipeType);
    return recipeType;
  }

  @Override
  public ISGRecipeBuilder recipeBuilder(ResourceLocation id) {
    return new ISGRecipeBuilder(id, this);
  }

  @Override
  public ISGRecipeBuilder recipeBuilder(ResourceLocation id, Object... append) {
    if (append.length > 0) {
      String toAppend = Arrays.stream(append)
          .map(Object::toString)
          .map(FormattingUtil::toLowerCaseUnderscore)
          .reduce("", (a, b) -> a + "_" + b);
      id = id.withSuffix(toAppend);
    }
    return recipeBuilder(id);
  }

  @Override
  public ISGRecipeBuilder recipeBuilder(String id) {
    return recipeBuilder(ISGCore.id(id));
  }

  @Override
  public ISGRecipeBuilder recipeBuilder(String id, Object... append) {
    return recipeBuilder(ISGCore.id(id), append);
  }
}
