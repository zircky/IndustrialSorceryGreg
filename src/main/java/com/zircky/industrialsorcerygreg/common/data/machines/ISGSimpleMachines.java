package com.zircky.industrialsorcerygreg.common.data.machines;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.capability.recipe.IO;
import com.gregtechceu.gtceu.api.data.RotationState;
import com.gregtechceu.gtceu.api.machine.MachineDefinition;
import com.gregtechceu.gtceu.api.machine.multiblock.PartAbility;
import com.gregtechceu.gtceu.common.data.GTMachines;
import com.gregtechceu.gtceu.common.data.machines.GTMachineUtils;
import com.gregtechceu.gtceu.common.machine.multiblock.part.DualHatchPartMachine;
import com.gregtechceu.gtceu.common.machine.multiblock.part.EnergyHatchPartMachine;
import com.gregtechceu.gtceu.common.machine.multiblock.part.ItemBusPartMachine;
import com.gregtechceu.gtceu.utils.FormattingUtil;
import com.zircky.industrialsorcerygreg.api.machine.multiblock.ISGPartAbility;
import com.zircky.industrialsorcerygreg.api.machine.part.WirelessEnergyHatchPartMachine;
import com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes;
import com.zircky.industrialsorcerygreg.common.machine.multiblock.part.IndicatorHatchPartMachine;
import com.zircky.industrialsorcerygreg.common.machine.multiblock.part.NeutronAcceleratorPartMachine;
import com.zircky.industrialsorcerygreg.common.machine.multiblock.part.SensorPartMachine;
import net.minecraft.network.chat.Component;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.capability.recipe.IO.IN;
import static com.gregtechceu.gtceu.api.capability.recipe.IO.OUT;
import static com.gregtechceu.gtceu.api.machine.property.GTMachineModelProperties.IS_FORMED;
import static com.gregtechceu.gtceu.common.data.machines.GTMachineUtils.HIGH_TIERS;
import static com.zircky.industrialsorcerygreg.api.registries.ISGRegistries.REGISTRATE;
import static com.zircky.industrialsorcerygreg.utils.register.MachineRegisterUtils.registerSimpleMachines;
import static com.zircky.industrialsorcerygreg.utils.register.MachineRegisterUtils.registerTieredMachines;

public class ISGSimpleMachines {

  public static final MachineDefinition[] DEHYDRATOR = registerSimpleMachines("dehydrator", ISGRecipeTypes.DEHYDRATOR_RECIPES, GTMachineUtils.defaultTankSizeFunction);
  public static final MachineDefinition[] UNPACKER = registerSimpleMachines("unpacker", ISGRecipeTypes.UNPACKER_RECIPES, GTMachineUtils.defaultTankSizeFunction);
  public static final MachineDefinition[] CLUSTER = registerSimpleMachines("cluster", ISGRecipeTypes.CLUSTER_RECIPES, GTMachineUtils.defaultTankSizeFunction);
  public static final MachineDefinition[] ROLLING = registerSimpleMachines("rolling", ISGRecipeTypes.ROLLING_RECIPES, GTMachineUtils.defaultTankSizeFunction);
  public static final MachineDefinition[] LAMINATOR = registerSimpleMachines("laminator", ISGRecipeTypes.LAMINATOR_RECIPES, GTMachineUtils.defaultTankSizeFunction);
  public static final MachineDefinition[] LOOM = registerSimpleMachines("loom", ISGRecipeTypes.LOOM_RECIPES, GTMachineUtils.defaultTankSizeFunction);
  public static final MachineDefinition[] LASER_WELDER = registerSimpleMachines("laser_welder", ISGRecipeTypes.LASER_WELDER_RECIPES, GTMachineUtils.defaultTankSizeFunction);
  public static final MachineDefinition[] DECAY_CHAMBER = registerSimpleMachines("decay_chamber", ISGRecipeTypes.DECAY_CHAMBERS_RECIPES, GTMachineUtils.defaultTankSizeFunction);

  public static final MachineDefinition[] WIRELESS_ENERGY_INPUT_HATCH = registerWirelessEnergyTieredHatch(
      "wireless_energy_hatch", "Wireless Energy Hatch", "wireless_energy_1a",
      IN, HIGH_TIERS, 2, PartAbility.INPUT_ENERGY);
  public static final MachineDefinition[] WIRELESS_ENERGY_OUTPUT_DYNAMO = registerWirelessEnergyTieredHatch(
      "wireless_energy_dynamo", "Wireless Energy Dynamo", "wireless_energy_1a",
      OUT, HIGH_TIERS, 2, PartAbility.OUTPUT_ENERGY);
  public static final MachineDefinition[] WIRELESS_ENERGY_INPUT_HATCH_4A = registerWirelessEnergyTieredHatch(
      "4a_wireless_energy_hatch", "4A Wireless Energy Hatch", "wireless_energy_4a",
      IN, HIGH_TIERS, 4, PartAbility.INPUT_ENERGY);
  public static final MachineDefinition[] WIRELESS_ENERGY_OUTPUT_DYNAMO_4A = registerWirelessEnergyTieredHatch(
      "4a_wireless_energy_dynamo", "4A Wireless Energy Dynamo", "wireless_energy_4a",
      OUT, HIGH_TIERS, 4, PartAbility.OUTPUT_ENERGY);
  public static final MachineDefinition[] WIRELESS_ENERGY_INPUT_HATCH_16A = registerWirelessEnergyTieredHatch(
      "16a_wireless_energy_hatch", "16A Wireless Energy Hatch", "wireless_energy_16a",
      IN, HIGH_TIERS, 16, PartAbility.INPUT_ENERGY);
  public static final MachineDefinition[] WIRELESS_ENERGY_OUTPUT_DYNAMO_16A = registerWirelessEnergyTieredHatch(
      "16a_wireless_energy_dynamo", "16A Wireless Energy Dynamo", "wireless_energy_16a",
      OUT, HIGH_TIERS, 16, PartAbility.OUTPUT_ENERGY);

  public static final MachineDefinition[] SUBSTATION_ENERGY_INPUT_HATCH = registerWirelessEnergyTieredHatch(
      "substation_wireless_energy_hatch_64a", "64A Substation Wireless Energy Hatch", "wireless_energy_16a",
      IN, HIGH_TIERS, 64, PartAbility.SUBSTATION_INPUT_ENERGY);
  public static final MachineDefinition[] SUBSTATION_ENERGY_OUTPUT_DYNAMO = registerWirelessEnergyTieredHatch(
      "substation_wireless_energy_dynamo_64a", "64A Substation Wireless Energy Dynamo", "wireless_energy_16a",
      OUT, HIGH_TIERS, 64, PartAbility.SUBSTATION_OUTPUT_ENERGY);

  public static final MachineDefinition[] SUBSTATION_ENERGY_INPUT_HATCH_256A = registerTieredMachines(REGISTRATE,
      "substation_input_hatch_256a",
      (holder, tier) -> new EnergyHatchPartMachine(holder, tier, IN, 256),
      (tier, builder) -> builder
          .langValue(VNF[tier] + " 256A Substation Energy Hatch")
          .rotationState(RotationState.ALL)
          .abilities(PartAbility.SUBSTATION_INPUT_ENERGY)
          .modelProperty(IS_FORMED, false)
          .tooltips(Component.translatable("gtceu.universal.tooltip.voltage_in",
                  FormattingUtil.formatNumbers(V[tier]), VNF[tier]),
              Component.translatable("gtceu.universal.tooltip.amperage_in", 256),
              Component.translatable("gtceu.universal.tooltip.energy_storage_capacity",
                  FormattingUtil
                      .formatNumbers(EnergyHatchPartMachine.getHatchEnergyCapacity(tier, 256))),
              Component.translatable("gtceu.machine.substation_hatch.input.tooltip"))
          .overlayTieredHullModel("energy_input_hatch_64a")
          .register(),
      GTValues.tiersBetween(IV, GTCEuAPI.isHighTier() ? MAX : UHV));

  public static final MachineDefinition[] SUBSTATION_ENERGY_OUTPUT_HATCH_256A = registerTieredMachines(REGISTRATE,
      "substation_output_hatch_256a",
      (holder, tier) -> new EnergyHatchPartMachine(holder, tier, OUT, 256),
      (tier, builder) -> builder
          .langValue(VNF[tier] + " 256A Substation Dynamo Hatch")
          .rotationState(RotationState.ALL)
          .abilities(PartAbility.SUBSTATION_OUTPUT_ENERGY)
          .modelProperty(IS_FORMED, false)
          .tooltips(Component.translatable("gtceu.universal.tooltip.voltage_out",
                  FormattingUtil.formatNumbers(V[tier]), VNF[tier]),
              Component.translatable("gtceu.universal.tooltip.amperage_out", 256),
              Component.translatable("gtceu.universal.tooltip.energy_storage_capacity",
                  FormattingUtil
                      .formatNumbers(EnergyHatchPartMachine.getHatchEnergyCapacity(tier, 256))),
              Component.translatable("gtceu.machine.substation_hatch.output.tooltip"))
          .overlayTieredHullModel("energy_output_hatch_64a")
          .register(),
      GTValues.tiersBetween(IV, GTCEuAPI.isHighTier() ? MAX : UHV));

  public static final MachineDefinition[] NEUTRON_ACCELERATOR = registerTieredMachines(REGISTRATE, "neutron_accelerator",
      NeutronAcceleratorPartMachine::new,
      (tier, builder) -> builder
          .langValue(VNF[tier] + " Neutron Accelerator")
          .rotationState(RotationState.ALL)
          .abilities(ISGPartAbility.NEUTRON_ACCELERATOR)
          .tooltips(Component.translatable("gtceu.universal.tooltip.max_voltage_in", V[tier], VNF[tier]),
              Component.translatable("isgcore.machine.neutron_accelerator.tooltip.0", (V[tier] << 3) / 10),
              Component.translatable("isgcore.machine.neutron_accelerator.tooltip.1"),
              Component.translatable("gtceu.universal.tooltip.energy_storage_capacity", 2 * V[tier]))
          .overlayTieredHullModel("neutron_accelerator")
          .register(),
      GTMachineUtils.ALL_TIERS);

  public static final MachineDefinition NEUTRON_SENSOR = REGISTRATE.machine("neutron_sensor", SensorPartMachine::new)
      .tier(IV)
      .rotationState(RotationState.ALL)
//      .tooltips(GTOMachineTooltips.SensorTooltips)
//      .notAllowSharedTooltips()
      .colorOverlayTieredHullModel("overlay_neutron_sensor", null, "overlay_neutron_sensor_emissive")
      .register();

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

  public static final MachineDefinition LENS_HOUSING = REGISTRATE.machine("lens_housing", (holder) -> new ItemBusPartMachine(holder, 1, IN))
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
            .modelProperty(IS_FORMED, false)
            .rotationState(RotationState.ALL)
            .tooltips(WirelessEnergyHatchPartMachine.getTooltipComponents(tier, io, amperage))
            .overlayTieredHullModel(model)
            .register(),
        tiers);
  }

}
