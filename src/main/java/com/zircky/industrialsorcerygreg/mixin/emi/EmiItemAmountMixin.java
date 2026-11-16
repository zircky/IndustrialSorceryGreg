package com.zircky.industrialsorcerygreg.mixin.emi;

import com.zircky.industrialsorcerygreg.integration.emi.EmiAmountRenderer;

import com.gregtechceu.gtceu.utils.FormattingUtil;

import net.minecraft.client.gui.screens.inventory.tooltip.ClientTooltipComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;

import dev.emi.emi.api.stack.EmiIngredient;
import dev.emi.emi.api.stack.ItemEmiStack;
import dev.emi.emi.api.stack.TagEmiIngredient;
import dev.emi.emi.runtime.EmiDrawContext;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.ArrayList;
import java.util.List;

@Mixin(value = { ItemEmiStack.class, TagEmiIngredient.class }, remap = false)
public abstract class EmiItemAmountMixin {

    @Redirect(method = "render",
              at = @At(value = "INVOKE",
                       target = "Ldev/emi/emi/EmiRenderHelper;renderAmount(Ldev/emi/emi/runtime/EmiDrawContext;IILnet/minecraft/network/chat/Component;)V"))
    private void isg$renderAmount(EmiDrawContext context, int x, int y, Component original) {
        EmiAmountRenderer.render(context, x, y, ((EmiIngredient) (Object) this).getAmount());
    }

    @Inject(method = "getTooltip", at = @At("RETURN"), cancellable = true)
    private void isg$addExactAmount(CallbackInfoReturnable<List<ClientTooltipComponent>> cir) {
        final EmiIngredient ingredient = (EmiIngredient) (Object) this;
        if (ingredient.isEmpty() || ingredient.getAmount() <= 1 ||
                !(ingredient.getEmiStacks().get(0).getKey() instanceof Item)) {
            return;
        }
        final List<ClientTooltipComponent> tooltip = new ArrayList<>(cir.getReturnValue());
        final Component amount = Component.literal(FormattingUtil.formatNumbers(ingredient.getAmount()));
        tooltip.add(Math.min(1, tooltip.size()), ClientTooltipComponent.create(amount.getVisualOrderText()));
        cir.setReturnValue(tooltip);
    }
}
