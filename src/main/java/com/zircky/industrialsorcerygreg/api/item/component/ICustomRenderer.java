package com.zircky.industrialsorcerygreg.api.item.component;

import com.zircky.industrialsorcerygreg.client.renderer.item.ISGItemRenderer;

import com.gregtechceu.gtceu.api.item.component.IItemComponent;

@FunctionalInterface
public interface ICustomRenderer extends IItemComponent {

    ISGItemRenderer getRenderer();
}
