package com.zircky.industrialsorcerygreg.common.data;

import com.gregtechceu.gtceu.api.recipe.RecipeCondition;
import com.gregtechceu.gtceu.api.recipe.condition.RecipeConditionType;
import com.gregtechceu.gtceu.api.registry.GTRegistries;
import com.mojang.serialization.Codec;
import com.zircky.industrialsorcerygreg.ISGCore;
import com.zircky.industrialsorcerygreg.common.data.recipe.NeutronActivatorCondition;

public class ISGRecipeConditions {

  public static final RecipeConditionType<NeutronActivatorCondition> NEUTRON_ACTIVATOR = register("neutron_activator_condition", NeutronActivatorCondition::new, NeutronActivatorCondition.CODEC);

  public static void init() {}

  private static <T extends RecipeCondition<T>> RecipeConditionType<T> register(String name,
                                                                                RecipeConditionType.ConditionFactory<T> factory,
                                                                                Codec<T> codec) {
    return GTRegistries.RECIPE_CONDITIONS.register(ISGCore.id(name), new RecipeConditionType<>(factory, codec));
  }
}
