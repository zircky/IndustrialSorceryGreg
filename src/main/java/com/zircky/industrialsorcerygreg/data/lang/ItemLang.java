package com.zircky.industrialsorcerygreg.data.lang;

import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.tterrag.registrate.providers.RegistrateLangProvider;
import com.zircky.industrialsorcerygreg.api.data.tag.ISGTagPrefix;

public class ItemLang {
  public static void init(RegistrateLangProvider provider) {
    initGeneratedNames(provider);
    provider.add("module.industrialsorcerygreg.oxygen_tank", "Oxygen Tank");
    provider.add("module.industrialsorcerygreg.oxygen_tank.description", "Stores %s mB of oxygen for breathing in space and underwater.");
    provider.add("module.industrialsorcerygreg.oxygen_tank.stored", "Oxygen: %s/%s mB");

    provider.add("isgcore.tooltip.item.tier_circuit", "%s Tier Circuit");

  }

  private static void initGeneratedNames(RegistrateLangProvider provider) {
    for (TagPrefix tagPrefix : ISGTagPrefix.values()) {
      provider.add(tagPrefix.getUnlocalizedName(), tagPrefix.langValue);
    }
  }
}
