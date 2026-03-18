package com.zircky.industrialsorcerygreg.common.data;

import com.tterrag.registrate.providers.ProviderType;
import com.zircky.industrialsorcerygreg.api.registries.ISGRegistries;
import com.zircky.industrialsorcerygreg.common.data.tag.ISGTagHandler;

public class ISGDatagen {
  public static void init() {
    ISGRegistries.REGISTRATE.addDataGenerator(ProviderType.ITEM_TAGS, ISGTagHandler::initItem);
  }
}
