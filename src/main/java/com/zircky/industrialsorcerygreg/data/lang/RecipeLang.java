package com.zircky.industrialsorcerygreg.data.lang;

import com.tterrag.registrate.providers.RegistrateLangProvider;

public class RecipeLang {
  public static void init(RegistrateLangProvider provider) {
    initRecipe(provider);
  }

  private static void initRecipe(RegistrateLangProvider provider) {
    provider.add("gtceu.fuel_reprocessor", "Fuel Reprocessor");
    provider.add("gtceu.liquefaction_furnace", "Liquefaction Furnace");
    provider.add("gtceu.cluster", "Cluster");
    provider.add("gtceu.dehydrator", "Dehydrator");
    provider.add("gtceu.unpacker", "Unpacker");
    provider.add("gtceu.rolling", "Rolling");
    provider.add("gtceu.laminator", "Laminator");
    provider.add("gtceu.loom", "Loom");
    provider.add("gtceu.laser_welder", "Laser Welder");
    provider.add("gtceu.plasma_condenser", "Plasma Condenser");
    provider.add("gtceu.leaching_plant", "Leaching Pplant");
    provider.add("gtceu.chromatic_flotation_plant", "Chromatic Flotation Plant");
    provider.add("gtceu.gas_centrifuge", "Gas Centrifuge");
    provider.add("gtceu.decay_chamber", "Decay Chamber");
    provider.add("gtceu.stellar_forge", "Stellar Forge");
    provider.add("gtceu.neutron_activator", "Neutron Activator");
    provider.add("gtceu.vacuum_distillation_tower", "Vacuum Distillation Tower");
    provider.add("gtceu.polymerization_reactor", "Polymerization Reactor");
    provider.add("gtceu.chemical_plant", "Chemical Plant");
    provider.add("gtceu.bio_reactor", "Bio Reactor");
    provider.add("gtceu.rocket_assembler", "Rocket Assembler");

  }
}
