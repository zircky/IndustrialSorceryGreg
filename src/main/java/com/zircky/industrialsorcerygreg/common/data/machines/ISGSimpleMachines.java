package com.zircky.industrialsorcerygreg.common.data.machines;

import com.gregtechceu.gtceu.api.capability.recipe.IO;
import com.gregtechceu.gtceu.api.data.RotationState;
import com.gregtechceu.gtceu.api.machine.MachineDefinition;
import com.gregtechceu.gtceu.api.machine.multiblock.PartAbility;
import com.gregtechceu.gtceu.api.machine.property.GTMachineModelProperties;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import com.gregtechceu.gtceu.common.data.machines.GTMachineUtils;
import com.zircky.industrialsorcerygreg.api.machine.part.WirelessEnergyHatchPartMachine;
import com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes;

import static com.gregtechceu.gtceu.api.GTValues.VNF;
import static com.gregtechceu.gtceu.common.data.machines.GTMachineUtils.HIGH_TIERS;
import static com.zircky.industrialsorcerygreg.common.data.machines.ISGMachineUtils.registerSimpleMachines;
import static com.zircky.industrialsorcerygreg.common.data.machines.ISGMachineUtils.registerTieredMachines;

public class ISGSimpleMachines {

  public static final MachineDefinition[] DEHYDRATOR = registerSimpleMachines("dehydrator", ISGRecipeTypes.DEHYDRATOR_RECIPES, GTMachineUtils.defaultTankSizeFunction);

  public static final MachineDefinition[] WIRELESS_ENERGY_INPUT_HATCH = registerWirelessEnergyTieredHatch(
      "wireless_energy_hatch", "Wireless Energy Hatch", "wireless_energy_1a",
      IO.IN, HIGH_TIERS, 2, PartAbility.INPUT_ENERGY);
  public static final MachineDefinition[] WIRELESS_ENERGY_OUTPUT_DYNAMO = registerWirelessEnergyTieredHatch(
      "wireless_energy_dynamo", "Wireless Energy Dynamo", "wireless_energy_1a",
      IO.OUT, HIGH_TIERS, 2, PartAbility.OUTPUT_ENERGY);
  public static final MachineDefinition[] WIRELESS_ENERGY_INPUT_HATCH_4A = registerWirelessEnergyTieredHatch(
      "4a_wireless_energy_hatch", "4A Wireless Energy Hatch", "wireless_energy_4a",
      IO.IN, HIGH_TIERS, 4, PartAbility.INPUT_ENERGY);
  public static final MachineDefinition[] WIRELESS_ENERGY_OUTPUT_DYNAMO_4A = registerWirelessEnergyTieredHatch(
      "4a_wireless_energy_dynamo", "4A Wireless Energy Dynamo", "wireless_energy_4a",
      IO.OUT, HIGH_TIERS, 4, PartAbility.OUTPUT_ENERGY);
  public static final MachineDefinition[] WIRELESS_ENERGY_INPUT_HATCH_16A = registerWirelessEnergyTieredHatch(
      "16a_wireless_energy_hatch", "16A Wireless Energy Hatch", "wireless_energy_16a",
      IO.IN, HIGH_TIERS, 16, PartAbility.INPUT_ENERGY);
  public static final MachineDefinition[] WIRELESS_ENERGY_OUTPUT_DYNAMO_16A = registerWirelessEnergyTieredHatch(
      "16a_wireless_energy_dynamo", "16A Wireless Energy Dynamo", "wireless_energy_16a",
      IO.OUT, HIGH_TIERS, 16, PartAbility.OUTPUT_ENERGY);

  public static final MachineDefinition[] SUBSTATION_ENERGY_INPUT_HATCH = registerWirelessEnergyTieredHatch(
      "substation_wireless_energy_hatch_64a", "64A Substation Wireless Energy Hatch", "wireless_energy_16a",
      IO.IN, HIGH_TIERS, 64, PartAbility.SUBSTATION_INPUT_ENERGY);
  public static final MachineDefinition[] SUBSTATION_ENERGY_OUTPUT_DYNAMO = registerWirelessEnergyTieredHatch(
      "substation_wireless_energy_dynamo_64a", "64A Substation Wireless Energy Dynamo", "wireless_energy_16a",
      IO.OUT, HIGH_TIERS, 64, PartAbility.SUBSTATION_OUTPUT_ENERGY);


  public static void init() {}

  private static MachineDefinition[] registerWirelessEnergyTieredHatch(String name, String displayName, String model,
                                                                       IO io, int[] tiers, int amperage,
                                                                       PartAbility... abilities) {
    return registerTieredMachines(name,
        (holder, tier) -> new WirelessEnergyHatchPartMachine(holder, tier, io, amperage),
        (tier, builder) -> builder
            .langValue(VNF[tier] + ' ' + displayName)
            .abilities(abilities)
            .modelProperty(GTMachineModelProperties.IS_FORMED, false)
            .rotationState(RotationState.ALL)
            .tooltips(WirelessEnergyHatchPartMachine.getTooltipComponents(tier, io, amperage))
            .overlayTieredHullModel(model)
            .register(),
        tiers);
  }

}
