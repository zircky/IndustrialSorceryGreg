package com.zircky.industrialsorcerygreg.mixin.gregtech.chemical;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.item.TagPrefixItem;
import com.zircky.industrialsorcerygreg.api.item.component.ICustomRenderer;
import com.zircky.industrialsorcerygreg.client.renderer.item.ItemRendererProvider;
import com.zircky.industrialsorcerygreg.common.data.materials.ISGMaterialIconSet;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = TagPrefixItem.class, remap = false)
public class TagPrefixItemMixin  extends Item implements ItemRendererProvider {
  @Shadow
  @Final
  public TagPrefix tagPrefix;
  @Final
  public Material material;

  @Unique
  private ICustomRenderer isgcore$customRenderer;

  public TagPrefixItemMixin(Properties properties) {
    super(properties);
  }

  @Inject(method = "<init>(Lnet/minecraft/world/item/Item$Properties;Lcom/gregtechceu/gtceu/api/data/tag/TagPrefix;Lcom/gregtechceu/gtceu/api/data/chemical/material/Material;)V",
      at = @At(value = "RETURN"),
      remap = false)
  private void TagPrefixItem(Item.Properties properties, TagPrefix tagPrefix, Material material, CallbackInfo ci) {
    if (GTCEu.isClientSide()) {
      if (material.getMaterialIconSet() instanceof ISGMaterialIconSet iconSet) {
        isgcore$customRenderer = iconSet.getCustomRender();
      }
    }
  }

  @Override
  public ICustomRenderer getRenderInfo(ItemStack itemStack) {
    return isgcore$customRenderer;
  }

  // getRenderer(ItemStack) -> IRenderer is the shared CosmicCoreItemRendererProvider default (delegates to
  // getRenderInfo).
}
