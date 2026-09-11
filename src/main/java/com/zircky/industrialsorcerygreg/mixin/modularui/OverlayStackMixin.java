package com.zircky.industrialsorcerygreg.mixin.modularui;

import brachy.modularui.overlay.OverlayStack;
import brachy.modularui.screen.ClientScreenHandler;
import brachy.modularui.screen.ModularScreen;
import com.mojang.blaze3d.platform.Lighting;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.GuiGraphics;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.ArrayList;
import java.util.List;

@Mixin(value = OverlayStack.class, remap = false)
public abstract class OverlayStackMixin {

  @Shadow
  @Final
  private static List<ModularScreen> overlay;

  @Inject(method = "draw", at = @At("HEAD"), cancellable = true)
  private static void isg$drawSnapshot(GuiGraphics graphics, int mouseX, int mouseY, float partialTicks, CallbackInfo ci) {
    ModularScreen hovered = null;
    ModularScreen fallback = null;

    for (ModularScreen screen : new ArrayList<>(overlay)) {
      screen.getContext().setGraphics(graphics);
      screen.getContext().updateState(mouseX, mouseY, partialTicks);
      screen.getContext().reset();
      RenderSystem.enableBlend();
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      screen.render(graphics, mouseX, mouseY, partialTicks);
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      screen.drawForeground(graphics);

      if (screen.getContext().isHovered()) {
        hovered = screen;
      }
      fallback = screen;
    }

    ClientScreenHandler.drawDebugScreen(graphics, hovered, fallback);
    RenderSystem.enableDepthTest();
    Lighting.setupFor3DItems();
    ci.cancel();
  }
}
