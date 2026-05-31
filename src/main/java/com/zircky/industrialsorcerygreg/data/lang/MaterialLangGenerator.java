package com.zircky.industrialsorcerygreg.data.lang;

import com.gregtechceu.gtceu.api.registry.GTRegistries;
import com.tterrag.registrate.providers.RegistrateLangProvider;

public class MaterialLangGenerator {
  private MaterialLangGenerator() {
    /* This utility class should not be instantiated */
  }

  public static void generate(RegistrateLangProvider provider, String modId) {
    for (var material : GTRegistries.MATERIALS) {
      if (material.getModid().equals(modId)) {
        provider.add(material.getUnlocalizedName(), material.getDefaultTranslation());
      }
    }
  }
}
