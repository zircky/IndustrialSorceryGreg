package com.zircky.industrialsorcerygreg.mixin.gregtech;

import com.gregtechceu.gtceu.api.capability.recipe.IO;
import com.gregtechceu.gtceu.api.machine.MetaMachine;
import com.gregtechceu.gtceu.api.machine.trait.recipe.RecipeLogic;
import com.gregtechceu.gtceu.api.recipe.ActionResult;
import com.gregtechceu.gtceu.api.recipe.GTRecipe;
import com.gregtechceu.gtceu.common.machine.multiblock.electric.CleanroomMachine;
import com.gregtechceu.gtceu.common.machine.trait.CleanroomProviderTrait;
import com.gregtechceu.gtceu.common.machine.trait.CleanroomReceiverTrait;
import com.gregtechceu.gtceu.common.recipe.condition.CleanroomCondition;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = RecipeLogic.class, remap = false)
public abstract class RecipeLogicMixin {
  @Inject(method = "handleRecipeIO", at = @At("HEAD"), cancellable = true)
  private void industrialsorcerygreg$rollCleanroomOutput(GTRecipe recipe, IO io,
                                                         CallbackInfoReturnable<ActionResult> cir) {
    if (io != IO.OUT) {
      return;
    }

    CleanroomCondition condition = getCleanroomCondition(recipe);
    if (condition == null || condition.isReverse()) {
      return;
    }

    MetaMachine recipeMachine = ((RecipeLogic) (Object) this).getRLMachine().self();
    CleanroomReceiverTrait receiver = recipeMachine.getTraitHolder().getTrait(CleanroomReceiverTrait.TYPE);
    if (receiver == null) {
      return;
    }

    CleanroomProviderTrait provider =
        ((CleanroomReceiverTraitAccessor) receiver).industrialsorcerygreg$getCleanroomProvider();
    if (provider == null || !provider.getProvidedTypes().contains(condition.getCleanroom())) {
      return;
    }

    MetaMachine providerMachine = provider.getMachine();
    if (!(providerMachine instanceof CleanroomMachine cleanroom)) {
      return;
    }

    int cleanAmount = ((CleanroomMachineAccessor) cleanroom).industrialsorcerygreg$getCleanAmount();
    if (cleanAmount >= 100 || cleanAmount <= 0) {
      return;
    }

    Level level = cleanroom.getLevel();
    if (level != null && level.getRandom().nextInt(100) >= cleanAmount) {
      cir.setReturnValue(ActionResult.SUCCESS);
    }
  }

  private static CleanroomCondition getCleanroomCondition(GTRecipe recipe) {
    for (var condition : recipe.conditions) {
      if (condition instanceof CleanroomCondition cleanroomCondition) {
        return cleanroomCondition;
      }
    }
    return null;
  }
}
