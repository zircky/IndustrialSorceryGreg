package com.zircky.industrialsorcerygreg.mixin.gregtech;

import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.zircky.industrialsorcerygreg.api.data.material.ISGMaterialFlags;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = TagPrefix.class, remap = false)
public class DoublePlatesTagPrefix {

  @Inject(method = "<clinit>", at = @At("TAIL"))
  private static void cmme$overridePlateDouble(CallbackInfo ci) {
    TagPrefix.plateDouble.generationCondition(mat ->
        (mat.hasProperty(PropertyKey.INGOT) && mat.hasFlag(MaterialFlags.GENERATE_PLATE) && !mat.hasFlag(MaterialFlags.NO_SMASHING))
            || mat.hasFlag(ISGMaterialFlags.GENERATE_DOUBLE_PLATE)
    );
  }
}
