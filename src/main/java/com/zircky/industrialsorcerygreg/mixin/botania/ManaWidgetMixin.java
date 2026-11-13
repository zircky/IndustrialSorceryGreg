package com.zircky.industrialsorcerygreg.mixin.botania;

import com.gregtechceu.gtceu.utils.FormattingUtil;

import net.minecraft.client.gui.screens.inventory.tooltip.ClientTooltipComponent;
import net.minecraft.network.chat.Component;

import dev.emi.emi.api.render.EmiTooltipComponents;
import dev.emi.emi.api.widget.Widget;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import vazkii.botania.client.integration.emi.ManaWidget;

import java.util.List;

@Mixin(value = ManaWidget.class, remap = false)
public abstract class ManaWidgetMixin extends Widget {

    @Shadow
    @Final
    private int mana;

    @Override
    public List<ClientTooltipComponent> getTooltip(int mouseX, int mouseY) {
        if (!getBounds().contains(mouseX, mouseY)) {
            return List.of();
        }
        return List.of(EmiTooltipComponents.of(Component.translatable("botaniamisc.manaUsage")
                .append(": ").append(FormattingUtil.formatNumbers(mana))));
    }
}
