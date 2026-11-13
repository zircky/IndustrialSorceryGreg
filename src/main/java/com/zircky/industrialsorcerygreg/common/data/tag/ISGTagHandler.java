package com.zircky.industrialsorcerygreg.common.data.tag;

import com.zircky.industrialsorcerygreg.common.data.tag.item.ISGItemTagsLoader;

import net.minecraft.world.item.Item;

import com.tterrag.registrate.providers.RegistrateTagsProvider;

public class ISGTagHandler {

    public static void initItem(RegistrateTagsProvider<Item> provider) {
        ISGItemTagsLoader.init(provider);
    }
}
