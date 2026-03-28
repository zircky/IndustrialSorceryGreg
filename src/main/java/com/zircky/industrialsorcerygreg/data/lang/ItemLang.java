package com.zircky.industrialsorcerygreg.data.lang;

import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.tterrag.registrate.providers.RegistrateLangProvider;
import com.zircky.industrialsorcerygreg.api.data.tag.ISGTagPrefix;

public class ItemLang {
  public static void init(RegistrateLangProvider provider) {
    initGeneratedNames(provider);
  }

  private static void initGeneratedNames(RegistrateLangProvider provider) {
    for (TagPrefix tagPrefix : ISGTagPrefix.values()) {
      provider.add(tagPrefix.getUnlocalizedName(), tagPrefix.langValue);
    }
  }
}
