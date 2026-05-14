package com.zircky.industrialsorcerygreg.data.lang;

import com.tterrag.registrate.providers.RegistrateLangProvider;

public class LangHandler {
  public static void init(RegistrateLangProvider provider) {
    ItemLang.init(provider);
    IntegrationLang.init(provider);
    RecipeLang.init(provider);


    provider.add("item.isg.wireless_energy_receive_cover.tooltip.1", "§bPull Energy§7 from EU network to the machine as §fCover§7.");
    provider.add("item.isg.wireless_energy_receive_cover.tooltip.2", "§7Can only used for §esingle block machine§7.Can't put on the machine blow the cover's voltage");
    provider.add("item.isg.wireless_energy_receive_cover.tooltip.3", "§bEnergy transfer speed: §f%s §7EU/t");
  }
}
