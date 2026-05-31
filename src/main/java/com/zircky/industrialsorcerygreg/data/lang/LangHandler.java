package com.zircky.industrialsorcerygreg.data.lang;

import com.tterrag.registrate.providers.RegistrateLangProvider;
import com.zircky.industrialsorcerygreg.ISGCore;

public class LangHandler {
  public static void init(RegistrateLangProvider provider) {
    MaterialLangGenerator.generate(provider, ISGCore.MODID);

    ItemLang.init(provider);
    IntegrationLang.init(provider);
    RecipeLang.init(provider);


    provider.add("item.isg.wireless_energy_receive_cover.tooltip.1", "§bPull Energy§7 from EU network to the machine as §fCover§7.");
    provider.add("item.isg.wireless_energy_receive_cover.tooltip.2", "§7Can only used for §esingle block machine§7.Can't put on the machine blow the cover's voltage");
    provider.add("item.isg.wireless_energy_receive_cover.tooltip.3", "§bEnergy transfer speed: §f%s §7EU/t");
    provider.add("industrialsorcerygreg.machine.drone_station.tooltip.0", "Services nearby formed multiblocks in loaded chunks.");
    provider.add("industrialsorcerygreg.machine.drone_station.tooltip.1", "Consumes EU to fix maintenance hatches, clear muffler snow obstruction, and reduce muffler hazards.");
    provider.add("industrialsorcerygreg.machine.drone_maintenance_hatch.loaded_drones", "Loaded Drones");
    provider.add("industrialsorcerygreg.machine.drone_maintenance_hatch.tooltip.range", "Range: %s blocks");
    provider.add("industrialsorcerygreg.machine.drone_maintenance_hatch.tooltip.consumption_chance", "Drone consumption chance: %s%% per service cycle");
    provider.add("industrialsorcerygreg.machine.drone_maintenance_hatch.tooltip.eut", "Energy usage: %s EU/t while servicing");
  }
}
