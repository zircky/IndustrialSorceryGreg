package com.zircky.industrialsorcerygreg.common.data.machines;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.capability.recipe.IO;
import com.gregtechceu.gtceu.api.data.RotationState;
import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.machine.MachineDefinition;
import com.gregtechceu.gtceu.api.machine.multiblock.PartAbility;
import com.gregtechceu.gtceu.api.machine.property.GTMachineModelProperties;
import com.gregtechceu.gtceu.common.data.GTMachines;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import com.gregtechceu.gtceu.common.data.machines.GTMachineUtils;
import com.gregtechceu.gtceu.common.machine.multiblock.part.ItemBusPartMachine;
import com.zircky.industrialsorcerygreg.ISGCore;
import com.zircky.industrialsorcerygreg.api.machine.part.WirelessEnergyHatchPartMachine;
import com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes;
import com.zircky.industrialsorcerygreg.common.machine.multiblock.part.IndicatorHatchPartMachine;
import com.zircky.industrialsorcerygreg.common.machine.multiblock.part.SensorPartMachine;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.common.data.machines.GTMachineUtils.HIGH_TIERS;
import static com.zircky.industrialsorcerygreg.api.registries.ISGRegistries.REGISTRATE;
import static com.zircky.industrialsorcerygreg.common.data.machines.ISGMachineUtils.registerSimpleMachines;
import static com.zircky.industrialsorcerygreg.common.data.machines.ISGMachineUtils.registerTieredMachines;

public class ISGSimpleMachines {

  public static final MachineDefinition[] DEHYDRATOR = registerSimpleMachines("dehydrator", ISGRecipeTypes.DEHYDRATOR_RECIPES, GTMachineUtils.defaultTankSizeFunction);
  public static final MachineDefinition[] UNPACKER = registerSimpleMachines("unpacker", ISGRecipeTypes.UNPACKER_RECIPES, GTMachineUtils.defaultTankSizeFunction);
  public static final MachineDefinition[] CLUSTER = registerSimpleMachines("cluster", ISGRecipeTypes.CLUSTER_RECIPES, GTMachineUtils.defaultTankSizeFunction);
  public static final MachineDefinition[] ROLLING = registerSimpleMachines("rolling", ISGRecipeTypes.ROLLING_RECIPES, GTMachineUtils.defaultTankSizeFunction);
  public static final MachineDefinition[] LAMINATOR = registerSimpleMachines("laminator", ISGRecipeTypes.LAMINATOR_RECIPES, GTMachineUtils.defaultTankSizeFunction);
  public static final MachineDefinition[] LOOM = registerSimpleMachines("loom", ISGRecipeTypes.LOOM_RECIPES, GTMachineUtils.defaultTankSizeFunction);
  public static final MachineDefinition[] LASER_WELDER = registerSimpleMachines("laser_welder", ISGRecipeTypes.LASER_WELDER_RECIPES, GTMachineUtils.defaultTankSizeFunction);


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


  public static final MachineDefinition PH_SENSOR = REGISTRATE.machine("ph_sensor", SensorPartMachine::new)
      .langValue("pH Sensor")
      .tier(EV)
      .rotationState(RotationState.ALL)
      .tooltips()
      .colorOverlayTieredHullModel("overlay_neutron_sensor", null, "overlay_neutron_sensor_emissive")
      .register();

  public static final MachineDefinition HEAT_SENSOR = REGISTRATE.machine("heat_sensor", SensorPartMachine::new)
      .tier(LV)
      .rotationState(RotationState.ALL)
      .tooltips()
      .colorOverlayTieredHullModel("overlay_neutron_sensor", null, "overlay_neutron_sensor_emissive")
      .register();

  public static final MachineDefinition LENS_HOUSING = REGISTRATE.machine("lens_housing", (holder) -> new ItemBusPartMachine(holder, 1, IO.IN))
      .tier(EV)
      .rotationState(RotationState.ALL)
      .appearanceBlock(GTMachines.ITEM_IMPORT_BUS[EV])
      .colorOverlayTieredHullModel(GTCEu.id("block/overlay/machine/overlay_item_hatch_input"), GTCEu.id("block/overlay/machine/overlay_pipe"), GTCEu.id("block/overlay/machine/overlay_pipe_in_emissive"))
      .register();

  public static final MachineDefinition LENS_INDICATOR_HATCH = REGISTRATE.machine("lens_indicator_hatch", IndicatorHatchPartMachine::new)
      .tier(HV)
      .rotationState(RotationState.ALL)
      .colorOverlayTieredHullModel("overlay_neutron_sensor", null, "overlay_neutron_sensor_emissive")
      .register();

  public static final MachineDefinition DEGASSING_CONTROL_HATCH = REGISTRATE.machine("degassing_control_hatch", IndicatorHatchPartMachine::new)
      .tier(LuV)
      .rotationState(RotationState.ALL)
      .colorOverlayTieredHullModel("overlay_neutron_sensor", null, "overlay_neutron_sensor_emissive")
      .register();

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
