package com.zircky.industrialsorcerygreg.client.renderer.item;

import com.zircky.industrialsorcerygreg.api.item.component.ICustomRenderer;
import net.minecraft.world.item.ItemStack;

public interface ItemRendererProvider {

  ICustomRenderer getRenderInfo(ItemStack itemStack);

  default ISGItemRenderer getRenderer(ItemStack itemStack) {
    ICustomRenderer info = getRenderInfo(itemStack);
    return info != null ? info.getRenderer() : null;
  }
}
