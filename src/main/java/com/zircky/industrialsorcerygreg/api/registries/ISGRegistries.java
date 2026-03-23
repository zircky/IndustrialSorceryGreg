package com.zircky.industrialsorcerygreg.api.registries;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.recipe.condition.RecipeConditionType;
import com.gregtechceu.gtceu.api.registry.GTRegistry;
import com.zircky.industrialsorcerygreg.IndustrialSorceryGreg;

public class ISGRegistries {
  public static final ISGRegistrate REGISTRATE = ISGRegistrate.create(IndustrialSorceryGreg.MODID);
  public static final GTRegistry.String<RecipeConditionType<?>> RECIPE_CONDITIONS = new GTRegistry.String<>(
      IndustrialSorceryGreg.id("recipe_condition"));

  public ISGRegistries() {
  }
}
