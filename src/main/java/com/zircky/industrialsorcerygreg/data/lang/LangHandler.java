package com.zircky.industrialsorcerygreg.data.lang;

import com.tterrag.registrate.providers.RegistrateLangProvider;

public class LangHandler {
  public static void init(RegistrateLangProvider provider) {
    ItemLang.init(provider);
    IntegrationLang.init(provider);
    RecipeLang.init(provider);
  }
}
