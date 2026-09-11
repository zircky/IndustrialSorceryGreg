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
    provider.add("isgcore.machine.eut_multiplier.tooltip", "Energy Consumption Multiplier: %s");
    provider.add("isgcore.machine.duration_multiplier.tooltip", "Duration Multiplication: %s");
    provider.add("isgcore.machine.me_wildcard_pattern_buffer.desc.1", "Allows the use of wildcards to generate patterns");
    provider.add("isgcore.machine.me_wildcard_pattern_buffer.desc.2", "Encode patterns with wildcards in the Pattern Terminal to use");
    provider.add("isgcore.machine.me_wildcard_pattern_buffer.desc.3", "The machine will automatically generate all craftable recipes");
    provider.add("isgcore.machine.me_wildcard_pattern_buffer.desc.4", "For example, write a §6any ingot -> any plate§r pattern");
    provider.add("isgcore.machine.me_wildcard_pattern_buffer.desc.5", "The machine will automatically generate all craftable §6ingot -> plate§r recipes like §6iron ingot -> iron plate§r, §6gold ingot -> gold plate§r, etc.");
    provider.add("isgcore.machine.me_wildcard_pattern_buffer.desc.6", "Note: When generating, the machine will check whether the current recipe type matches the stored circuit/mold, etc. with the pattern");
    provider.add("isgcore.machine.me_wildcard_pattern_buffer.desc.7", "Mismatched recipes will not be generated");
    provider.add("isgcore.machine.me_wildcard_pattern_buffer.desc.8", "Set blacklist materials in the machine to skip recipe generation related to that material");
    provider.add("isgcore.multiblock.pattern.error.motors", "§cAll motors must be the same§r");
    provider.add("isgcore.multiblock.pattern.error.conveyors", "§cAll conveyors must be the same§r");
    provider.add("isgcore.multiblock.pattern.error.emitters", "§cAll emitters must be the same§r");
    provider.add("isgcore.multiblock.pattern.error.field_generators", "§cAll field_generators must be the same§r");
    provider.add("isgcore.multiblock.pattern.error.pistons", "§cAll pistons must be the same§r");
    provider.add("isgcore.multiblock.pattern.error.pumps", "§cAll pumps must be the same§r");
    provider.add("isgcore.multiblock.pattern.error.robot_arms", "§cAll robot arm must be the same§r");
    provider.add("isgcore.multiblock.pattern.error.sensors", "§cAll sensors must be the same§r");

  }
}
