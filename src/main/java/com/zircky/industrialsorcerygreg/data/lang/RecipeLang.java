package com.zircky.industrialsorcerygreg.data.lang;

import com.tterrag.registrate.providers.RegistrateLangProvider;

public class RecipeLang {
  public static void init(RegistrateLangProvider provider) {
    initRecipe(provider);
  }

  private static void initRecipe(RegistrateLangProvider provider) {
    provider.add("gtceu.fuel_reprocessor", "Fuel Reprocessor");
    provider.add("gtceu.liquefaction_furnace", "Liquefaction Furnace");
  }
}
