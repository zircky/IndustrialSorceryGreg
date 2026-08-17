package com.zircky.industrialsorcerygreg.data.lang;

import com.tterrag.registrate.providers.RegistrateLangProvider;
import com.zircky.industrialsorcerygreg.ISGCore;
import com.zircky.industrialsorcerygreg.api.ISGValues;

public class LangHandler {
  public static void init(RegistrateLangProvider provider) {
    MaterialLangGenerator.generate(provider, ISGCore.MODID);

    ItemLang.init(provider);
    IntegrationLang.init(provider);
    RecipeLang.init(provider);


    provider.add("isgcore.tier.%s".formatted(ISGValues.COMPONENT_ASSEMBLY_CASING_TIER), "Casing Tier: %s");
    provider.add("item.isg.wireless_energy_receive_cover.tooltip.1", "§bPull Energy§7 from EU network to the machine as §fCover§7.");
    provider.add("item.isg.wireless_energy_receive_cover.tooltip.2", "§7Can only used for §esingle block machine§7.Can't put on the machine blow the cover's voltage");
    provider.add("item.isg.wireless_energy_receive_cover.tooltip.3", "§bEnergy transfer speed: §f%s §7EU/t");
    provider.add("industrialsorcerygreg.machine.drone_station.tooltip.0", "Services nearby formed multiblocks in loaded chunks.");
    provider.add("industrialsorcerygreg.machine.drone_station.tooltip.1", "Consumes EU to fix maintenance hatches, clear muffler snow obstruction, and reduce muffler hazards.");
    provider.add("industrialsorcerygreg.machine.drone_maintenance_hatch.loaded_drones", "Loaded Drones");
    provider.add("industrialsorcerygreg.machine.drone_maintenance_hatch.tooltip.range", "Range: %s blocks");
    provider.add("industrialsorcerygreg.machine.drone_maintenance_hatch.tooltip.consumption_chance", "Drone consumption chance: %s%% per service cycle");
    provider.add("industrialsorcerygreg.machine.drone_maintenance_hatch.tooltip.eut", "Energy usage: %s EU/t while servicing");
    provider.add("isgcore.machine.sensor.invert.disabled", "Redstone Output: Normal");
    provider.add("isgcore.machine.sensor.invert.enabled", "Redstone Output: Inverted");
    provider.add("isgcore.machine.neutron_accelerator.tooltip.0", "§6Max EU Consumption: §r%s");
    provider.add("isgcore.machine.neutron_accelerator.tooltip.1", "§bEach point of EU converts to §e10~20-eV§b neutron kinetic energy");
    provider.add("isgcore.machine.neutron_activator.efficiency", "Kinetic Energy Consumption Multiplier: %s");
    provider.add("isgcore.machine.neutron_activator.ev", "Current Neutron Kinetic Energy: %seV");
    provider.add("isgcore.recipe.neutron_activator.ev_min", "Minimum Neutron Kinetic Energy: %s MeV");
    provider.add("isgcore.recipe.neutron_activator.ev_max", "Maximum Neutron Kinetic Energy: %s MeV");
    provider.add("isgcore.recipe.neutron_activator.evt", "Neutron Kinetic Energy Consumption: %s eV/t");
    provider.add("isgcore.recipe.condition.neutron_activator_condition_tooltip", "Neutron Kinetic Energy: %s-%s MeV");
  }
}
