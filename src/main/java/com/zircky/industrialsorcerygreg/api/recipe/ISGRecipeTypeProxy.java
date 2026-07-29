package com.zircky.industrialsorcerygreg.api.recipe;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.gregtechceu.gtceu.utils.FormattingUtil;
import com.zircky.industrialsorcerygreg.data.recipe.builder.ISGRecipeBuilder;
import net.minecraft.resources.ResourceLocation;

import java.util.Arrays;

public class ISGRecipeTypeProxy {
  private final GTRecipeType recipeType;

  public ISGRecipeTypeProxy(GTRecipeType recipeType) {
    this.recipeType = recipeType;
  }

  public GTRecipeType recipeType() {
    return recipeType;
  }

  public ISGRecipeBuilder recipeBuilder(ResourceLocation id) {
    return new ISGRecipeBuilder(id, recipeType);
  }

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

  public ISGRecipeBuilder recipeBuilder(String id) {
    return recipeBuilder(GTCEu.id(id));
  }

  public ISGRecipeBuilder recipeBuilder(String id, Object... append) {
    return recipeBuilder(GTCEu.id(id), append);
  }
}
