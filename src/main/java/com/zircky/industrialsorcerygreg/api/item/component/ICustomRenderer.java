package com.zircky.industrialsorcerygreg.api.item.component;

import com.gregtechceu.gtceu.api.item.component.IItemComponent;
import com.zircky.industrialsorcerygreg.client.renderer.item.ISGItemRenderer;

@FunctionalInterface
public interface ICustomRenderer extends IItemComponent {
  ISGItemRenderer getRenderer();
}
