package com.zircky.industrialsorcerygreg.common.data.recipe;

import com.gregtechceu.gtceu.api.machine.MetaMachine;
import com.gregtechceu.gtceu.api.machine.trait.RecipeLogic;
import com.gregtechceu.gtceu.api.recipe.GTRecipe;
import com.gregtechceu.gtceu.api.recipe.RecipeCondition;
import com.gregtechceu.gtceu.api.recipe.condition.RecipeConditionType;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.zircky.industrialsorcerygreg.common.data.ISGRecipeConditions;
import com.zircky.industrialsorcerygreg.common.machine.multiblock.NeutronActivatorMachine;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.network.chat.Component;
import org.jetbrains.annotations.NotNull;

@Setter
@Getter
public class NeutronActivatorCondition extends RecipeCondition<NeutronActivatorCondition> {
  private static final int RANGE_MULTIPLIER = 10_000;

  public static final Codec<NeutronActivatorCondition> CODEC = RecordCodecBuilder.create(instance -> isReverse(instance)
      .and(Codec.INT.fieldOf("evRange").forGetter(condition -> condition.evRange))
      .apply(instance, NeutronActivatorCondition::new));

  private int evRange = 0;

  public int getEvRange() {
    return evRange;
  }

  public NeutronActivatorCondition() {
    this(0, 0);
  }



  public NeutronActivatorCondition(final int max, final int min) {
    this.evRange = max * RANGE_MULTIPLIER + min;
  }

  public NeutronActivatorCondition(final int evRange) {
    this.evRange = evRange;
  }

  public NeutronActivatorCondition(boolean isReverse, int evRange) {
    super(isReverse);
    this.evRange = evRange;
  }

  @Override
  public RecipeConditionType getType() {
    return ISGRecipeConditions.NEUTRON_ACTIVATOR;
  }

  @Override
  public Component getTooltips() {
    final int max = evRange / RANGE_MULTIPLIER;
    final int min = evRange % RANGE_MULTIPLIER;
    return Component.translatable("industrialsorcerygreg.recipe.condition.neutron_activator_condition_tooltip", max, min);
  }

  @Override
  protected boolean testCondition(@NotNull GTRecipe recipe, @NotNull RecipeLogic recipeLogic) {
    return NeutronActivatorMachine.checkNeutronActivatorCondition(
        (MetaMachine) recipeLogic.getMachine(), recipe
    );
  }

  @Override
  public NeutronActivatorCondition createTemplate() {
    return new NeutronActivatorCondition();
  }

}
