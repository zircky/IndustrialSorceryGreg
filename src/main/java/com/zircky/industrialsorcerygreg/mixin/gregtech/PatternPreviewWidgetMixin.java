package com.zircky.industrialsorcerygreg.mixin.gregtech;

import com.lowdragmc.lowdraglib.client.scene.FBOWorldSceneRenderer;
import com.lowdragmc.lowdraglib.gui.widget.SceneWidget;
import net.minecraft.core.BlockPos;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

@Pseudo
@Mixin(targets = "com.gregtechceu.gtceu.api.gui.widget.PatternPreviewWidget", remap = false)
public abstract class PatternPreviewWidgetMixin {

  @Shadow
  @Final
  private SceneWidget sceneWidget;

  @Inject(method = "<init>", at = @At("TAIL"))
  private void industrialsorcerygreg$useFboSceneRenderer(CallbackInfo ci) {
    if (sceneWidget.getRenderer() instanceof FBOWorldSceneRenderer || sceneWidget.getDummyWorld() == null) {
      return;
    }

    List<BlockPos> renderedCore = List.copyOf(sceneWidget.getCore());
    sceneWidget.createScene(sceneWidget.getDummyWorld(), true);
    sceneWidget.setRenderedCore(renderedCore, null);
  }
}
