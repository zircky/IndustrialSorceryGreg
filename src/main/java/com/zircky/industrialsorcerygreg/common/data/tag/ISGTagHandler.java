package com.zircky.industrialsorcerygreg.common.data.tag;

import com.tterrag.registrate.providers.RegistrateTagsProvider;
import com.zircky.industrialsorcerygreg.common.data.tag.item.ISGItemTagsLoader;
import net.minecraft.world.item.Item;

public class ISGTagHandler {
  public static void initItem(RegistrateTagsProvider<Item> provider) {
    ISGItemTagsLoader.init(provider);
  }
}
