package com.zircky.industrialsorcerygreg.mixin.emi;

import com.zircky.industrialsorcerygreg.integration.search.SearchFillHelper;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import dev.emi.emi.api.stack.EmiStackInteraction;
import dev.emi.emi.screen.EmiScreenManager;
import dev.emi.emi.screen.widget.EmiSearchWidget;

@Mixin(value = EmiSearchWidget.class, remap = false)
public abstract class EmiSearchFillMixin {

  @Inject(method = "mouseClicked", at = @At("HEAD"), cancellable = true, require = 0)
  private void industrialsorcerygreg$fillSearchFromItemNamed(
      double mouseX, double mouseY, int button, CallbackInfoReturnable<Boolean> cir) {
    industrialsorcerygreg$fillSearchFromItem(mouseX, mouseY, button, cir);
  }

  @Inject(method = "m_6375_", at = @At("HEAD"), cancellable = true, require = 0)
  private void industrialsorcerygreg$fillSearchFromItemObfuscated(
      double mouseX, double mouseY, int button, CallbackInfoReturnable<Boolean> cir) {
    industrialsorcerygreg$fillSearchFromItem(mouseX, mouseY, button, cir);
  }

  private void industrialsorcerygreg$fillSearchFromItem(
      double mouseX, double mouseY, int button, CallbackInfoReturnable<Boolean> cir) {
    EmiSearchWidget search = (EmiSearchWidget) (Object) this;
    if (button != 0 || !search.isMouseOver(mouseX, mouseY)) return;

    String name = SearchFillHelper.emiIngredientName(EmiScreenManager.draggedStack)
        .or(() -> SearchFillHelper.emiIngredientName(EmiScreenManager.pressedStack))
        .or(SearchFillHelper::carriedItemName)
        .or(() -> {
          EmiStackInteraction hovered = EmiScreenManager.getHoveredStack(
              EmiScreenManager.lastMouseX, EmiScreenManager.lastMouseY, true);
          return SearchFillHelper.emiIngredientName(hovered.getStack());
        })
        .orElse(null);

    if (name == null) return;

    search.setValue(name);
    search.setFocused(true);
    cir.setReturnValue(true);
  }
}
