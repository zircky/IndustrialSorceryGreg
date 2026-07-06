package com.zircky.industrialsorcerygreg.data.lang;

import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.tterrag.registrate.providers.RegistrateLangProvider;
import com.zircky.industrialsorcerygreg.api.data.tag.ISGTagPrefix;

public class ItemLang {
  public static void init(RegistrateLangProvider provider) {
    initGeneratedNames(provider);

    provider.add("isgcore.tooltip.item.tier_circuit", "%s Tier Circuit");
    provider.add("isgcore.tooltip.item.catalyst.1", "§7When not in the catalyst hatch or pattern buffer, §cthe recipe process will completely consume the catalyst§r");
    provider.add("isgcore.tooltip.item.catalyst.2", "§7When in the catalyst hatch, §bthe recipe process will consume 1 durability point per use§r");
    provider.add("isgcore.tooltip.item.catalyst.3", "§7When in the catalyst pattern buffer, §athe recipe process will not consume the catalyst§r");

  }

  private static void initGeneratedNames(RegistrateLangProvider provider) {
    for (TagPrefix tagPrefix : ISGTagPrefix.values()) {
      provider.add(tagPrefix.getUnlocalizedName(), tagPrefix.langValue);
    }
  }
}
