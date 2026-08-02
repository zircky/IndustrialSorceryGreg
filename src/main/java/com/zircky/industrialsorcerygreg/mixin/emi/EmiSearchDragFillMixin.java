package com.zircky.industrialsorcerygreg.mixin.emi;

import com.zircky.industrialsorcerygreg.integration.search.SearchFillHelper;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import dev.emi.emi.api.stack.EmiStack;
import dev.emi.emi.screen.EmiScreenManager;

@Mixin(value = EmiScreenManager.class, remap = false)
public abstract class EmiSearchDragFillMixin {

  @Inject(method = "mouseReleased", at = @At("HEAD"), cancellable = true, require = 0)
  private static void industrialsorcerygreg$fillSearchFromDraggedStackNamed(
      double mouseX, double mouseY, int button, CallbackInfoReturnable<Boolean> cir) {
    industrialsorcerygreg$fillSearchFromDraggedStack(mouseX, mouseY, button, cir);
  }

  @Inject(method = "m_6375_", at = @At("HEAD"), cancellable = true, require = 0)
  private static void industrialsorcerygreg$fillSearchFromDraggedStackObfuscated(
      double mouseX, double mouseY, int button, CallbackInfoReturnable<Boolean> cir) {
    industrialsorcerygreg$fillSearchFromDraggedStack(mouseX, mouseY, button, cir);
  }

  private static void industrialsorcerygreg$fillSearchFromDraggedStack(
      double mouseX, double mouseY, int button, CallbackInfoReturnable<Boolean> cir) {
    if (button != 0 || !EmiScreenManager.search.isMouseOver(mouseX, mouseY)) return;

    SearchFillHelper.emiIngredientName(EmiScreenManager.draggedStack)
        .or(() -> SearchFillHelper.emiIngredientName(EmiScreenManager.pressedStack))
        .ifPresent(name -> {
          EmiScreenManager.search.setValue(name);
          EmiScreenManager.search.setFocused(true);
          EmiScreenManager.pressedStack = EmiStack.EMPTY;
          EmiScreenManager.draggedStack = EmiStack.EMPTY;
          cir.setReturnValue(true);
        });
  }
}
