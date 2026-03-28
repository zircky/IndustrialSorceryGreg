package com.zircky.industrialsorcerygreg.data.lang;

import com.tterrag.registrate.providers.RegistrateLangProvider;

public class IntegrationLang {
  public static void init(RegistrateLangProvider provider) {
    initRecipeViewerLang(provider);
  }

  private static void initRecipeViewerLang(RegistrateLangProvider provider) {
    provider.add("industrialsorcerygreg.emi.category.material_tree", "Material Tree");
  }
}
