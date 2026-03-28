package com.zircky.industrialsorcerygreg.data;

import com.tterrag.registrate.providers.ProviderType;
import com.zircky.industrialsorcerygreg.api.registries.ISGRegistries;
import com.zircky.industrialsorcerygreg.common.data.tag.ISGTagHandler;
import com.zircky.industrialsorcerygreg.data.lang.LangHandler;

public class ISGDatagen {
  public static void initPost() {
    ISGRegistries.REGISTRATE.addDataGenerator(ProviderType.ITEM_TAGS, ISGTagHandler::initItem);
    ISGRegistries.REGISTRATE.addDataGenerator(ProviderType.LANG, LangHandler::init);
  }
}
