package com.zircky.industrialsorcerygreg.common.data;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.ItemMaterialData;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.ItemMaterialInfo;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.MaterialStack;
import com.gregtechceu.gtceu.api.item.ComponentItem;
import com.gregtechceu.gtceu.api.item.component.ElectricStats;
import com.gregtechceu.gtceu.api.item.component.IItemComponent;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.common.item.armor.*;
import com.gregtechceu.gtceu.common.item.behavior.CoverPlaceBehavior;
import com.gregtechceu.gtceu.common.item.behavior.DataItemBehavior;
import com.gregtechceu.gtceu.common.item.behavior.TooltipBehavior;
import com.gregtechceu.gtceu.config.ConfigHolder;
import com.gregtechceu.gtceu.data.recipe.CustomTags;
import com.tterrag.registrate.util.entry.ItemEntry;
import com.tterrag.registrate.util.nullness.NonNullBiConsumer;
import com.tterrag.registrate.util.nullness.NonNullConsumer;
import com.zircky.industrialsorcerygreg.api.registries.ISGRegistries;
import com.zircky.industrialsorcerygreg.client.renderer.item.MaterialsColorMap;
import com.zircky.industrialsorcerygreg.common.data.tag.item.ISGItemTag;
import com.zircky.industrialsorcerygreg.common.item.armor.SpaceArmorComponentItem;
import com.zircky.industrialsorcerygreg.utils.StringUtils;
import earth.terrarium.adastra.common.tags.ModItemTags;
import net.minecraft.ChatFormatting;
import net.minecraft.client.resources.language.I18n;
import net.minecraft.network.chat.Component;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.Tags;

import java.util.Locale;
import java.util.function.Supplier;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.common.data.GTItems.modelPredicate;
import static com.gregtechceu.gtceu.utils.FormattingUtil.toEnglishName;
import static com.zircky.industrialsorcerygreg.utils.register.ItemRegisterUtils.attach;
import static com.zircky.industrialsorcerygreg.utils.register.ItemRegisterUtils.item;

public class ISGItems {

  static {
    ISGRegistries.REGISTRATE.creativeModeTab(() -> ISGCreativeModeTabs.ISG_ITEM);
  }

  public static void init() {
    ISGMaterialItems.generateMaterialItems();
  }

  public static final ItemEntry<Item> SHAPE_EXTRUDER_ROD_LONG = ISGRegistries.REGISTRATE.item("long_rod_extruder_mold", Item::new)
      .lang("Extruder Mold (Long Rod)")
//      .model((ctx, prov) -> prov.generated(ctx, prov.modLoc("item/long_rod_extruder_mold")))
      .onRegister(materialInfo(() -> new ItemMaterialInfo(new MaterialStack(GTMaterials.Steel, GTValues.M << 2))))
      .register();

  ItemEntry<ComponentItem> REALLY_MAX_BATTERY = item("really_max_battery", ComponentItem::create)
      .lang("Really MAX Battery")
      .onRegister(attach(new TooltipBehavior(lines -> lines.add(Component.translatable("isgcore.tooltip.item.really_max_battery").withStyle(ChatFormatting.GRAY)))))
      .onRegister(modelPredicate(GTCEu.id("battery"), ElectricStats::getStoredPredicate))
      .onRegister(attach(ElectricStats.createRechargeableBattery(Long.MAX_VALUE, GTValues.UEV)))
      .register();
  ItemEntry<ComponentItem> TRANSCENDENT_MAX_BATTERY = item("transcendent_max_battery", ComponentItem::create)
      .lang("Transcendent MAX Battery")
      .onRegister(attach(new TooltipBehavior(lines -> lines.add(Component.translatable("isgcore.tooltip.item.transcendent_max_battery").withStyle(ChatFormatting.GRAY)))))
      .onRegister(modelPredicate(GTCEu.id("battery"), ElectricStats::getStoredPredicate))
      .onRegister(attach((IItemComponent) ElectricStats.createRechargeableBattery(Long.MAX_VALUE, UIV)))
      .register();
  ItemEntry<ComponentItem> EXTREMELY_MAX_BATTERY = item("extremely_max_battery", ComponentItem::create)
      .lang("Extremely MAX Battery")
      .onRegister(attach(new TooltipBehavior(lines -> lines.add(Component.translatable("isgcore.tooltip.item.extremely_max_battery").withStyle(ChatFormatting.GRAY)))))
      .onRegister(modelPredicate(GTCEu.id("battery"), ElectricStats::getStoredPredicate))
      .onRegister(attach(ElectricStats.createRechargeableBattery(Long.MAX_VALUE, GTValues.UXV)))
      .register();
  ItemEntry<ComponentItem> INSANELY_MAX_BATTERY = item("insanely_max_battery", ComponentItem::create)
      .lang("Insanely MAX Battery")
      .onRegister(attach(new TooltipBehavior(lines -> lines.add(Component.literal(StringUtils.dark_purplish_red(I18n.get("isgcore.tooltip.item.insanely_max_battery")))))))
      .onRegister(modelPredicate(GTCEu.id("battery"), ElectricStats::getStoredPredicate))
      .onRegister(attach(ElectricStats.createRechargeableBattery(Long.MAX_VALUE, GTValues.OpV)))
      .register();
  ItemEntry<ComponentItem> MEGA_MAX_BATTERY = item("mega_max_battery",  ComponentItem::create)
      .lang("Mega MAX Battery")
      .onRegister(attach(new TooltipBehavior(lines -> lines.add(Component.literal(StringUtils.full_color(I18n.get("isgcore.tooltip.item.mega_max_battery")))))))
      .onRegister(modelPredicate(GTCEu.id("battery"), ElectricStats::getStoredPredicate))
      .onRegister(attach(ElectricStats.createRechargeableBattery(Long.MAX_VALUE, GTValues.MAX)))
      .register();

  ItemEntry<ComponentItem> SUPER_CAPACITOR = item("super_capacitor", ComponentItem::create)
      .onRegister(attach(ElectricStats.createRechargeableBattery(100000, GTValues.ULV)))
      .tag(CustomTags.ULV_BATTERIES).register();

  ItemEntry<ComponentItem> MAX_ELECTRIC_PUMP = item("max_electric_pump", ComponentItem::create)
      .lang("MAX Electric Pump")
      .onRegister(attach(new CoverPlaceBehavior(ISGCovers.ELECTRIC_PUMP_MAX)))
      .onRegister(attach(new TooltipBehavior(lines -> {
        lines.add(Component.translatable("item.gtceu.electric.pump.tooltip"));
        lines.add(Component.translatable("gtceu.universal.tooltip.fluid_transfer_rate",
            1280 * 64 * 64 * 4 / 20));
      })))
      .register();

  ItemEntry<ComponentItem> MAX_CONVEYOR_MODULE = item("max_conveyor_module", ComponentItem::create)
      .lang("MAX Conveyor Module")
      .onRegister(attach(new CoverPlaceBehavior(ISGCovers.CONVEYOR_MODULE_MAX)))
      .onRegister(attach(new TooltipBehavior(lines -> {
        lines.add(Component.translatable("item.gtceu.conveyor.module.tooltip"));
        lines.add(Component.translatable("gtceu.universal.tooltip.item_transfer_rate_stacks", 16));
      })))
      .register();

  ItemEntry<ComponentItem> MAX_ROBOT_ARM = item("max_robot_arm", ComponentItem::create)
      .lang("MAX Robot Arm")
      .onRegister(attach(new CoverPlaceBehavior(ISGCovers.ROBOT_ARM_MAX)))
      .onRegister(attach(new TooltipBehavior(lines -> {
        lines.add(Component.translatable("item.gtceu.robot.arm.tooltip"));
        lines.add(Component.translatable("gtceu.universal.tooltip.item_transfer_rate_stacks", 16));
      })))
      .register();

  ItemEntry<Item> MAX_ELECTRIC_MOTOR = registerLang("max_electric_motor", "MAX Electric Motor");
  ItemEntry<Item> MAX_ELECTRIC_PISTON = registerLang("max_electric_piston", "MAX Electric Piston");
  ItemEntry<Item> MAX_FIELD_GENERATOR = registerLang("max_field_generator", "MAX Field Generator");
  ItemEntry<Item> MAX_EMITTER = registerLang("max_emitter", "MAX Emitte");
  ItemEntry<Item> MAX_SENSOR = registerLang("max_sensor", "MAX Sensor");
  

//  public static final ItemEntry<Item> SMD_CAPACITOR_REFINED = registerLang("smd_capacitor_refined", "Refined SMD Capacitor");
//  public static final ItemEntry<Item> SMD_DIODE_REFINED = registerSmd("smd_diode_refined", "Refined SMD Diode");
//  public static final ItemEntry<Item> SMD_RESISTOR_REFINED = registerLang("smd_resistor_refined", "Refined SMD Resistor");
//  public static final ItemEntry<Item> SMD_TRANSISTOR_REFINED = registerLang("smd_transistor_refined", "Refined SMD Transistor");
//  public static final ItemEntry<Item> SMD_INDUCTOR_REFINED = registerLang("smd_inductor_refined", "Refined SMD Inductor");
//
//  public static final ItemEntry<Item> SMD_CAPACITOR_MICRO = registerLang("smd_capacitor_micro", "Micro SMD Capacitor");
//  public static final ItemEntry<Item> SMD_DIODE_MICRO = registerLang("smd_diode_micro", "Micro SMD Diode");
//  public static final ItemEntry<Item> SMD_RESISTOR_MICRO = registerLang("smd_resistor_micro", "Micro SMD Resistor");
//  public static final ItemEntry<Item> SMD_TRANSISTOR_MICRO = registerLang("smd_transistor_micro", "Micro SMD Transistor");
//  public static final ItemEntry<Item> SMD_INDUCTOR_MICRO = registerLang("smd_inductor_micro", "Micro SMD Inductor");
//
//  public static final ItemEntry<Item> SMD_CAPACITOR_NANO = registerLang("smd_capacitor_nano", "Nano SMD Capacitor");
//  public static final ItemEntry<Item> SMD_DIODE_NANO = registerLang("smd_diode_nano", "Nano SMD Diode");
//  public static final ItemEntry<Item> SMD_RESISTOR_NANO = registerLang("smd_resistor_nano", "Nano SMD Resistor");
//  public static final ItemEntry<Item> SMD_TRANSISTOR_NANO = registerLang("smd_transistor_nano", "Nano SMD Transistor");
//  public static final ItemEntry<Item> SMD_INDUCTOR_NANO = registerLang("smd_inductor_nano", "Nano SMD Inductor");
//
//  public static final ItemEntry<Item> SMD_CAPACITOR_QUANTUM = registerLang("smd_capacitor_quantum", "Quantum SMD Capacitor");
//  public static final ItemEntry<Item> SMD_DIODE_QUANTUM = registerLang("smd_diode_quantum", "Quantum SMD Diode");
//  public static final ItemEntry<Item> SMD_RESISTOR_QUANTUM = registerLang("smd_resistor_quantum", "Quantum SMD Resistor");
//  public static final ItemEntry<Item> SMD_TRANSISTOR_QUANTUM = registerLang("smd_transistor_quantum", "Quantum SMD Transistor");
//  public static final ItemEntry<Item> SMD_INDUCTOR_QUANTUM = registerLang("smd_inductor_quantum", "Quantum SMD Inductor");
//
//  public static final ItemEntry<Item> SMD_CAPACITOR_CRYSTAL = registerLang("smd_capacitor_crystal", "Crystal SMD Capacitor");
//  public static final ItemEntry<Item> SMD_DIODE_CRYSTAL = registerLang("smd_diode_crystal", "Crystal SMD Diode");
//  public static final ItemEntry<Item> SMD_RESISTOR_CRYSTAL = registerLang("smd_resistor_crystal", "Crystal SMD Resistor");
//  public static final ItemEntry<Item> SMD_TRANSISTOR_CRYSTAL = registerLang("smd_transistor_crystal", "Crystal SMD Transistor");
//  public static final ItemEntry<Item> SMD_INDUCTOR_CRYSTAL = registerLang("smd_inductor_crystal", "Crystal SMD Inductor");
//
//  public static final ItemEntry<Item> SMD_CAPACITOR_WETWARE = registerLang("smd_capacitor_wetware", "Wetware SMD Capacitor");
//  public static final ItemEntry<Item> SMD_DIODE_WETWARE = registerLang("smd_diode_wetware", "Wetware SMD Diode");
//  public static final ItemEntry<Item> SMD_RESISTOR_WETWARE = registerLang("smd_resistor_wetware", "Wetware SMD Resistor");
//  public static final ItemEntry<Item> SMD_TRANSISTOR_WETWARE = registerLang("smd_transistor_wetware", "Wetware SMD Transistor");
//  public static final ItemEntry<Item> SMD_INDUCTOR_WETWARE = registerLang("smd_inductor_wetware", "Wetware SMD Inductor");


  public static final ItemEntry<Item> QUANTUM_ANOMALY = register("quantum_anomaly");
  public static final ItemEntry<Item> QUANTUMCHROMODYNAMIC_PROTECTIVE_PLATING = register("quantumchromodynamic_protective_plating");
  public static final ItemEntry<Item> RECURSIVELY_FOLDED_NEGATIVE_SPACE = register("recursively_folded_negative_space");

  public static final ItemEntry<Item> BIOWARE_CIRCUIT_BOARD = registerLang("bioware_circuit_board", "Bioware Circuit Board");
  public static final ItemEntry<Item> BIOWARE_PRINTED_CIRCUIT_BOARD = registerLang("bioware_printed_circuit_board", "Bioware Printed Circuit Board");
  public static final ItemEntry<Item> SMD_CAPACITOR_BIOWARE = registerLang("smd_capacitor_bioware", "Bioware SMD Capacitor");
  public static final ItemEntry<Item> SMD_DIODE_BIOWARE = registerLang("smd_diode_bioware", "Bioware SMD Diode");
  public static final ItemEntry<Item> SMD_RESISTOR_BIOWARE = registerLang("smd_resistor_bioware", "Bioware SMD Resistor");
  public static final ItemEntry<Item> SMD_TRANSISTOR_BIOWARE = registerLang("smd_transistor_bioware", "Bioware SMD Transistor");
  public static final ItemEntry<Item> SMD_INDUCTOR_BIOWARE = registerLang("smd_inductor_bioware", "Bioware SMD Inductor");

  public static final ItemEntry<Item> OPTICAL_CIRCUIT_BOARD = registerLang("optical_circuit_board", "Optical Circuit Board");
  public static final ItemEntry<Item> OPTICAL_PRINTED_CIRCUIT_BOARD = registerLang("optical_printed_circuit_board", "Optical Printed Circuit Board");
  public static final ItemEntry<Item> OPTICAL_RAM_WAFER = registerLang("optical_ram_wafer", "Optical Ram Wafer");
  public static final ItemEntry<Item> OPTICAL_RAM_CHIP = registerLang("optical_ram_chip", "Optical Ram Chip");
  public static final ItemEntry<Item> SMD_CAPACITOR_OPTICAL = registerLang("smd_capacitor_optical", "Optical SMD Capacitor");
  public static final ItemEntry<Item> SMD_DIODE_OPTICAL = registerLang("smd_diode_optical", "Optical SMD Diode");
  public static final ItemEntry<Item> SMD_RESISTOR_OPTICAL = registerLang("smd_resistor_optical", "Optical SMD Resistor");
  public static final ItemEntry<Item> SMD_TRANSISTOR_OPTICAL = registerLang("smd_transistor_optical", "Optical SMD Transistor");
  public static final ItemEntry<Item> SMD_INDUCTOR_OPTICAL = registerLang("smd_inductor_optical", "Optical SMD Inductor");

  public static final ItemEntry<Item> EXOTIC_CIRCUIT_BOARD = registerLang("exotic_circuit_board", "Exotic Circuit Board");
  public static final ItemEntry<Item> EXOTIC_PRINTED_CIRCUIT_BOARD = registerLang("exotic_printed_circuit_board", "Exotic Printed Circuit Board");
  public static final ItemEntry<Item> EXOTIC_RAM_WAFER = registerLang("exotic_ram_wafer", "Exotic Ram Wafer");
  public static final ItemEntry<Item> EXOTIC_RAM_CHIP = registerLang("exotic_ram_chip", "Exotic Ram Chip");
  public static final ItemEntry<Item> SMD_CAPACITOR_EXOTIC = registerLang("smd_capacitor_exotic", "Exotic SMD Capacitor");
  public static final ItemEntry<Item> SMD_DIODE_EXOTIC = registerLang("smd_diode_exotic", "Exotic SMD Diode");
  public static final ItemEntry<Item> SMD_RESISTOR_EXOTIC = registerLang("smd_resistor_exotic", "Exotic SMD Resistor");
  public static final ItemEntry<Item> SMD_TRANSISTOR_EXOTIC = registerLang("smd_transistor_exotic", "Exotic SMD Transistor");
  public static final ItemEntry<Item> SMD_INDUCTOR_EXOTIC = registerLang("smd_inductor_exotic", "Exotic SMD Inductor");

  public static final ItemEntry<Item> COSMIC_CIRCUIT_BOARD = registerLang("cosmic_circuit_board", "Cosmic Circuit Board");
  public static final ItemEntry<Item> COSMIC_PRINTED_CIRCUIT_BOARD = registerLang("cosmic_printed_circuit_board", "Cosmic Printed Circuit Board");
  public static final ItemEntry<Item> COSMIC_RAM_WAFER = registerLang("cosmic_ram_wafer", "Cosmic Ram Wafer");
  public static final ItemEntry<Item> COSMIC_RAM_CHIP = registerLang("cosmic_ram_chip", "Cosmic Ram Chip");
  public static final ItemEntry<Item> SMD_CAPACITOR_COSMIC = registerLang("smd_capacitor_cosmic", "Cosmic SMD Capacitor");
  public static final ItemEntry<Item> SMD_DIODE_COSMIC = registerLang("smd_diode_cosmic", "Cosmic SMD Diode");
  public static final ItemEntry<Item> SMD_RESISTOR_COSMIC = registerLang("smd_resistor_cosmic", "Cosmic SMD Resistor");
  public static final ItemEntry<Item> SMD_TRANSISTOR_COSMIC = registerLang("smd_transistor_cosmic", "Cosmic SMD Transistor");
  public static final ItemEntry<Item> SMD_INDUCTOR_COSMIC = registerLang("smd_inductor_cosmic", "Cosmic SMD Inductor");

  public static final ItemEntry<Item> SUPRACAUSAL_CIRCUIT_BOARD = registerLang("supracausal_circuit_board", "Supracausal Circuit Board");
  public static final ItemEntry<Item> SUPRACAUSAL_PRINTED_CIRCUIT_BOARD = registerLang("supracausal_printed_circuit_board", "Supracausal Printed Circuit Board");
  public static final ItemEntry<Item> SUPRACAUSAL_RAM_WAFER = registerLang("supracausal_ram_wafer", "Supracausal Ram Wafer");
  public static final ItemEntry<Item> SUPRACAUSAL_RAM_CHIP = registerLang("supracausal_ram_chip", "Supracausal Ram Chip");
  public static final ItemEntry<Item> SMD_CAPACITOR_SUPRACAUSAL = registerLang("smd_capacitor_supracausal", "Supracausal SMD Capacitor");
  public static final ItemEntry<Item> SMD_DIODE_SUPRACAUSAL = registerLang("smd_diode_supracausal", "Supracausal SMD Diode");
  public static final ItemEntry<Item> SMD_RESISTOR_SUPRACAUSAL = registerLang("smd_resistor_supracausal", "Supracausal SMD Resistor");
  public static final ItemEntry<Item> SMD_TRANSISTOR_SUPRACAUSAL = registerLang("smd_transistor_supracausal", "Supracausal SMD Transistor");
  public static final ItemEntry<Item> SMD_INDUCTOR_SUPRACAUSAL = registerLang("smd_inductor_supracausal", "Supracausal SMD Inductor");

  public static final ItemEntry<Item> UNIVERSAL_CIRCUIT_LV = registerCircuit("universal_circuit_lv", "Universal Circuit LV", CustomTags.LV_CIRCUITS);
  public static final ItemEntry<Item> UNIVERSAL_CIRCUIT_MV = registerCircuit("universal_circuit_mv", "Universal Circuit MV", CustomTags.MV_CIRCUITS);
  public static final ItemEntry<Item> UNIVERSAL_CIRCUIT_HV = registerCircuit("universal_circuit_hv", "Universal Circuit HV", CustomTags.HV_CIRCUITS);
  public static final ItemEntry<Item> UNIVERSAL_CIRCUIT_EV = registerCircuit("universal_circuit_ev", "Universal Circuit EV", CustomTags.EV_CIRCUITS);
  public static final ItemEntry<Item> UNIVERSAL_CIRCUIT_IV = registerCircuit("universal_circuit_iv", "Universal Circuit IV", CustomTags.IV_CIRCUITS);
  public static final ItemEntry<Item> UNIVERSAL_CIRCUIT_LuV = registerCircuit("universal_circuit_luv", "Universal Circuit LuV", CustomTags.LuV_CIRCUITS);
  public static final ItemEntry<Item> UNIVERSAL_CIRCUIT_ZPM = registerCircuit("universal_circuit_zpm", "Universal Circuit ZPM", CustomTags.ZPM_CIRCUITS);
  public static final ItemEntry<Item> UNIVERSAL_CIRCUIT_UV = registerCircuit("universal_circuit_uv", "Universal Circuit UV", CustomTags.UV_CIRCUITS);
  public static final ItemEntry<Item> UNIVERSAL_CIRCUIT_UHV = registerCircuit("universal_circuit_uhv", "Universal Circuit UHV", CustomTags.UHV_CIRCUITS);
  public static final ItemEntry<Item> UNIVERSAL_CIRCUIT_UEV = registerCircuit("universal_circuit_uev", "Universal Circuit UEV", CustomTags.UEV_CIRCUITS);
  public static final ItemEntry<Item> UNIVERSAL_CIRCUIT_UIV = registerCircuit("universal_circuit_uiv", "Universal Circuit UIV", CustomTags.UIV_CIRCUITS);
  public static final ItemEntry<Item> UNIVERSAL_CIRCUIT_UXV = registerCircuit("universal_circuit_uxv", "Universal Circuit UXV", CustomTags.UXV_CIRCUITS);
  public static final ItemEntry<Item> UNIVERSAL_CIRCUIT_OpV = registerCircuit("universal_circuit_opv", "Universal Circuit OpV", CustomTags.OpV_CIRCUITS);
  public static final ItemEntry<Item> UNIVERSAL_CIRCUIT_MAX = registerCircuit("universal_circuit_max", "Universal Circuit MAX", CustomTags.MAX_CIRCUITS);

  public static final ItemEntry<Item> BIOWARE_PROCESSOR = registerCircuit("bioware_processor", CustomTags.ZPM_CIRCUITS);
  public static final ItemEntry<Item> BIOWARE_ASSEMBLY = registerCircuit("bioware_assembly", CustomTags.UV_CIRCUITS);
  public static final ItemEntry<Item> BIOWARE_COMPUTER = registerCircuit("bioware_computer", CustomTags.UHV_CIRCUITS);
  public static final ItemEntry<Item> BIOWARE_MAINFRAME = registerCircuit("bioware_mainframe", CustomTags.UEV_CIRCUITS);
  public static final ItemEntry<Item> BIOWARE_PROCESSING_CORE = register("bioware_processing_core");

  public static final ItemEntry<Item> OPTICAL_PROCESSOR = registerCircuit("optical_processor", CustomTags.UV_CIRCUITS);
  public static final ItemEntry<Item> OPTICAL_ASSEMBLY = registerCircuit("optical_assembly", CustomTags.UHV_CIRCUITS);
  public static final ItemEntry<Item> OPTICAL_COMPUTER = registerCircuit("optical_computer", CustomTags.UEV_CIRCUITS);
  public static final ItemEntry<Item> OPTICAL_MAINFRAME = registerCircuit("optical_mainframe", CustomTags.UIV_CIRCUITS);
  public static final ItemEntry<Item> OPTICAL_SLICE = register("optical_slice");
  public static final ItemEntry<Item> OPTICAL_PROCESSING_CORE = register("optical_processing_core");
  public static final ItemEntry<ComponentItem> OPTICAL_DATA_STICK = item("optical_data_stick", ComponentItem::create)
      .onRegister(attach(new DataItemBehavior(true, 1)))
      .register();
  public static final ItemEntry<Item> OPTICAL_WAFER = register("optical_wafer");

  public static final ItemEntry<Item> EXOTIC_PROCESSOR = registerCircuit("exotic_processor", CustomTags.UHV_CIRCUITS);
  public static final ItemEntry<Item> EXOTIC_ASSEMBLY = registerCircuit("exotic_assembly", CustomTags.UEV_CIRCUITS);
  public static final ItemEntry<Item> EXOTIC_COMPUTER = registerCircuit("exotic_computer", CustomTags.UIV_CIRCUITS);
  public static final ItemEntry<Item> EXOTIC_MAINFRAME = registerCircuit("exotic_mainframe", CustomTags.UXV_CIRCUITS);
  public static final ItemEntry<Item> EXOTIC_PROCESSING_CORE = register("exotic_processing_core");

  public static final ItemEntry<Item> COSMIC_PROCESSOR = registerCircuit("cosmic_processor", CustomTags.UEV_CIRCUITS);
  public static final ItemEntry<Item> COSMIC_ASSEMBLY = registerCircuit("cosmic_assembly", CustomTags.UIV_CIRCUITS);
  public static final ItemEntry<Item> COSMIC_COMPUTER = registerCircuit("cosmic_computer", CustomTags.UXV_CIRCUITS);
  public static final ItemEntry<Item> COSMIC_MAINFRAME = registerCircuit("cosmic_mainframe", CustomTags.OpV_CIRCUITS);
  public static final ItemEntry<Item> COSMIC_PROCESSING_CORE = register("cosmic_processing_core");
  public static final ItemEntry<Item> COSMIC_PROCESSING_UNIT_CORE = register("cosmic_processing_unit_core");

  public static final ItemEntry<Item> SUPRACAUSAL_PROCESSOR = registerCircuit("supracausal_processor", CustomTags.UIV_CIRCUITS);
  public static final ItemEntry<Item> SUPRACAUSAL_ASSEMBLY = registerCircuit("supracausal_assembly", CustomTags.UXV_CIRCUITS);
  public static final ItemEntry<Item> SUPRACAUSAL_COMPUTER = registerCircuit("supracausal_computer", CustomTags.OpV_CIRCUITS);
  public static final ItemEntry<Item> SUPRACAUSAL_MAINFRAME = registerCircuit("supracausal_mainframe", CustomTags.MAX_CIRCUITS);


  public static final ItemEntry<Item> ROTATING_TRANSPARENT_SURFACE = register("rotating_transparent_surface");
  public static final ItemEntry<Item> LOW_FREQUENCY_LASER = registerLang("low_frequency_laser", "Low frequency laser");
  public static final ItemEntry<Item> MEDIUM_FREQUENCY_LASER = registerLang("medium_frequency_laser", "Medium Frequency Laser");
  public static final ItemEntry<Item> HIGH_FREQUENCY_LASER  = registerLang("high_frequency_laser", "High Frequency Laser");
  public static final ItemEntry<Item> RED_HALIDE_LAMP = register("red_halide_lamp");
  public static final ItemEntry<Item> GREEN_HALIDE_LAMP = register("green_halide_lamp");
  public static final ItemEntry<Item> BLUE_HALIDE_LAMP = register("blue_halide_lamp");

  public static final ItemEntry<Item> LASER_COOLING_UNIT = register("laser_cooling_unit");
  public static final ItemEntry<Item> LASER_DIODE = register("laser_diode");

  public static final ItemEntry<Item> INSULATION_WIRE_ASSEMBLY = register("insulation_wire_assembly");
  public static final ItemEntry<Item> INVERTER = register("inverter");
  public static final ItemEntry<Item> INGOT_FIELD_SHAPE = register("ingot_field_shape");

  public static final ItemEntry<Item> PLASMA_CONTAINMENT_CELL = registerLang("plasma_containment_cell", "Plasma Containment Cell");
  public static final ItemEntry<Item> RHENIUM_PLASMA_CONTAINMENT_CELL = registerLang("rhenium_plasma_containment_cell", "Rhenium Plasma Containment Cell");
  public static final ItemEntry<Item> ACTINIUM_SUPERHYDRIDE_PLASMA_CONTAINMENT_CELL = registerLang("actinium_superhydride_plasma_containment_cell", "Actinium Auperhydride Plasma Containment Cell");
  public static final ItemEntry<Item> OPTICAL_SOC_CONTAINMENT_HOUSING = registerLang("optical_soc_containment_housing", "Optical SoC Containment Housing");

  public static final ItemEntry<Item> RUTHERFORDIUM_AMPROSIUM_BOULE = register("rutherfordium_amprosium_boule");
  public static final ItemEntry<Item> RUTHERFORDIUM_AMPROSIUM_WAFER = register("rutherfordium_amprosium_wafer");
  public static final ItemEntry<Item> GRAPHENE_IRON_PLATE = register("graphene_iron_plate");

  public static final ItemEntry<Item> NEUTRON_PLASMA_CONTAINMENT_CELL = register("neutron_plasma_containment_cell");
  public static final ItemEntry<Item> CRYSTAL_MATRIX_PLASMA_CONTAINMENT_CELL = register("crystal_matrix_plasma_containment_cell");
  public static final ItemEntry<Item> AWAKENED_DRACONIUM_PLASMA_CONTAINMENT_CELL = register("awakened_draconium_plasma_containment_cell");

  public static final ItemEntry<Item> EMPTY_LASER_COOLING_CONTAINER = register("empty_laser_cooling_container");
  public static final ItemEntry<Item> BOSE_EINSTEIN_COOLING_CONTAINER = register("bose_einstein_cooling_container");
  public static final ItemEntry<Item> TIME_DILATION_CONTAINMENT_UNIT = register("time_dilation_containment_unit");
  public static final ItemEntry<Item> CONTAINED_HIGH_DENSITY_PROTONIC_MATTER = register("contained_high_density_protonic_matter");
  public static final ItemEntry<Item> CHAOS_CONTAINMENT_UNIT = register("chaos_containment_unit");
  public static final ItemEntry<Item> COSMIC_MESH_CONTAINMENT_UNIT = register("cosmic_mesh_containment_unit");

  public static final ItemEntry<Item> DIAMOND_CRYSTAL_CIRCUIT = register("diamond_crystal_circuit");
  public static final ItemEntry<Item> RUBY_CRYSTAL_CIRCUIT = register("ruby_crystal_circuit");
  public static final ItemEntry<Item> EMERALD_CRYSTAL_CIRCUIT = register("emerald_crystal_circuit");
  public static final ItemEntry<Item> SAPPHIRE_CRYSTAL_CIRCUIT = register("sapphire_crystal_circuit");

  public static final ItemEntry<Item> EXTREMELY_DURABLE_PLASMA_CELL = register("extremely_durable_plasma_cell");
  public static final ItemEntry<Item> DENSE_NEUTRON_PLASMA_CELL = register("dense_neutron_plasma_cell");
  public static final ItemEntry<Item> COSMIC_NEUTRON_PLASMA_CELL = register("cosmic_neutron_plasma_cell");
  public static final ItemEntry<Item> CONTAINED_REISSNER_NORDSTROM_SINGULARITY = register("contained_reissner_nordstrom_singularity");
  public static final ItemEntry<Item> CONTAINED_KERR_NEWMANN_SINGULARITY = register("contained_kerr_newmann_singularity");
  public static final ItemEntry<Item> CONTAINED_KERR_SINGULARITY = register("contained_kerr_singularity");
  public static final ItemEntry<Item> CONTAINED_EXOTIC_MATTER = register("contained_exotic_matter");
  public static final ItemEntry<Item> CLOSED_TIMELIKE_CURVE_COMPUTATIONAL_UNIT_CONTAINER = register("closed_timelike_curve_computational_unit_container");
  public static final ItemEntry<Item> CLOSED_TIMELIKE_CURVE_COMPUTATIONAL_UNIT = register("closed_timelike_curve_computational_unit");
  public static final ItemEntry<Item> CONTAMINATED_PETRI_DISH = register("contaminated_petri_dish");

  public static final ItemEntry<Item> EMPTY_QUARK_RELEASE_CATALYST_HOUSING = register("empty_quark_release_catalyst_housing");
  public static final ItemEntry<Item> DOWN_QUARK_RELEASING_CATALYST = register("down_quark_releasing_catalyst");
  public static final ItemEntry<Item> STRANGE_QUARK_RELEASING_CATALYST = register("strange_quark_releasing_catalyst");
  public static final ItemEntry<Item> BOTTOM_QUARK_RELEASING_CATALYST = register("bottom_quark_releasing_catalyst");
  public static final ItemEntry<Item> CHARM_QUARK_RELEASING_CATALYST = register("charm_quark_releasing_catalyst");


  public static final ItemEntry<Item> SIMPLE_OPTICAL_SOC = registerLang("simple_optical_soc", "Simple Optical SoC");

  public static final ItemEntry<Item> ACTIVATED_CARBON_FILTER_MESH = register("activated_carbon_filter_mesh");

  public static ItemEntry<Item> INFINITY_SINGULARITY = ISGRegistries.REGISTRATE.item("infinity_singularity", Item::new)
      .model(NonNullBiConsumer.noop())
      .color(() -> () -> (item, i) -> MaterialsColorMap.getCurrentRainbowColor())
      .register();

  public static final ItemEntry<Item> COMBINED_SINGULARITY_0 = registerCustomModel("combined_singularity_0");
  public static final ItemEntry<Item> COMBINED_SINGULARITY_1 = registerCustomModel("combined_singularity_1");
  public static final ItemEntry<Item> COMBINED_SINGULARITY_2 = registerCustomModel("combined_singularity_2");
  public static final ItemEntry<Item> COMBINED_SINGULARITY_3 = registerCustomModel("combined_singularity_3");
  public static final ItemEntry<Item> COMBINED_SINGULARITY_4 = registerCustomModel("combined_singularity_4");
  public static final ItemEntry<Item> COMBINED_SINGULARITY_5 = registerCustomModel("combined_singularity_5");
  public static final ItemEntry<Item> COMBINED_SINGULARITY_6 = registerCustomModel("combined_singularity_6");
  public static final ItemEntry<Item> COMBINED_SINGULARITY_7 = registerCustomModel("combined_singularity_7");
  public static final ItemEntry<Item> COMBINED_SINGULARITY_8 = registerCustomModel("combined_singularity_8");
  public static final ItemEntry<Item> COMBINED_SINGULARITY_9 = registerCustomModel("combined_singularity_9");
  public static final ItemEntry<Item> COMBINED_SINGULARITY_10 = registerCustomModel("combined_singularity_10");
  public static final ItemEntry<Item> COMBINED_SINGULARITY_11 = registerCustomModel("combined_singularity_11");
  public static final ItemEntry<Item> COMBINED_SINGULARITY_12 = registerCustomModel("combined_singularity_12");
  public static final ItemEntry<Item> COMBINED_SINGULARITY_13 = registerCustomModel("combined_singularity_13");
  public static final ItemEntry<Item> COMBINED_SINGULARITY_14 = registerCustomModel("combined_singularity_14");
  public static final ItemEntry<Item> COMBINED_SINGULARITY_15 = registerCustomModel("combined_singularity_15");

  public static final ItemEntry<Item> HUI_CIRCUIT_1 = registerLang("hui_circuit_1", "High Calculation Workstation MK I");
  public static final ItemEntry<Item> HUI_CIRCUIT_2 = registerLang("hui_circuit_2", "High Calculation Workstation MK II");
  public static final ItemEntry<Item> HUI_CIRCUIT_3 = registerLang("hui_circuit_3", "High Calculation Workstation MK III");
  public static final ItemEntry<Item> HUI_CIRCUIT_4 = registerLang("hui_circuit_4", "High Calculation Workstation MK IV");
  public static final ItemEntry<Item> HUI_CIRCUIT_5 = registerLang("hui_circuit_5", "High Calculation Workstation MK V");

  public static final ItemEntry<Item> SEPARATION_ELECTROMAGNET = register("separation_electromagnet");
  public static final ItemEntry<Item> MICROFOCUS_X_RAY_TUBE = register("microfocus_x_ray_tube");


  public static final ItemEntry<Item> MICA_BASED_PULP = register("mica_based_pulp");
  public static final ItemEntry<Item> MICA_BASED_SHEET = register("mica_based_sheet");
  public static final ItemEntry<Item> MICA_INSULATOR_SHEET = register("mica_insulator_sheet");
  public static final ItemEntry<Item> MICA_INSULATOR_FOIL = register("mica_insulator_foil");

  public static ItemEntry<SpaceArmorComponentItem> SPACE_NANOMUSCLE_CHESTPLATE = ISGRegistries.REGISTRATE.item("space_nanomuscle_chestplate",
          (p) -> new SpaceArmorComponentItem(GTArmorMaterials.ARMOR,
              ArmorItem.Type.CHESTPLATE, 8000, p)
              .setArmorLogic(new NanoMuscleSuite(
                  ArmorItem.Type.CHESTPLATE,
                  (int) GTValues.V[HV],
                  6_400_000L * (long) Math.max(1, Math.pow(4, ConfigHolder.INSTANCE.tools.voltageTierNanoSuit - 3)),
                  ConfigHolder.INSTANCE.tools.voltageTierNanoSuit)))
      .lang("NanoMuscle™ Space Suite Chestplate")
      .properties(p -> p.rarity(Rarity.RARE))
      .tag(ISGItemTag.NANOMUSCLE_SPACE_SUITE, ModItemTags.SPACE_SUITS, ModItemTags.FREEZE_RESISTANT_ARMOR,
          ModItemTags.HEAT_RESISTANT_ARMOR, Tags.Items.ARMORS_CHESTPLATES, CustomTags.PPE_ARMOR)
      .register();

  public static ItemEntry<SpaceArmorComponentItem> SPACE_ADVANCED_NANOMUSCLE_CHESTPLATE = ISGRegistries.REGISTRATE.item("space_advanced_nanomuscle_chestplate",
          (p) -> new SpaceArmorComponentItem(GTArmorMaterials.ARMOR, ArmorItem.Type.CHESTPLATE, 16000, p)
              .setArmorLogic(new AdvancedNanoMuscleSuite(
                  (int) GTValues.V[HV],
                  12_800_000L * (long) Math.max(1, Math.pow(4,
                      ConfigHolder.INSTANCE.tools.voltageTierAdvNanoSuit - 3)),
                  ConfigHolder.INSTANCE.tools.voltageTierAdvNanoSuit)))
      .lang("Advanced NanoMuscle™ Space Suite Chestplate")
      .properties(p -> p.rarity(Rarity.EPIC))
      .tag(ISGItemTag.NANOMUSCLE_SPACE_SUITE, ModItemTags.SPACE_SUITS, ModItemTags.FREEZE_RESISTANT_ARMOR,
          ModItemTags.HEAT_RESISTANT_ARMOR, Tags.Items.ARMORS_CHESTPLATES, CustomTags.PPE_ARMOR)
      .register();

  public static ItemEntry<SpaceArmorComponentItem> SPACE_QUARKTECH_CHESTPLATE = ISGRegistries.REGISTRATE.item("space_quarktech_chestplate",
          (p) -> new SpaceArmorComponentItem(GTArmorMaterials.ARMOR, ArmorItem.Type.CHESTPLATE, 32000, p)
              .setArmorLogic(new QuarkTechSuite(
                  ArmorItem.Type.CHESTPLATE,
                  (int) GTValues.V[GTValues.IV],
                  100_000_000L * (long) Math.max(1, Math.pow(4,
                      ConfigHolder.INSTANCE.tools.voltageTierQuarkTech - 5)),
                  ConfigHolder.INSTANCE.tools.voltageTierQuarkTech)))
      .lang("QuarkTech™ Space Suite Chestplate")
      .properties(p -> p.rarity(Rarity.RARE))
      .tag(ISGItemTag.QUARKTECH_SPACE_SUITE, ModItemTags.SPACE_SUITS, ModItemTags.FREEZE_RESISTANT_ARMOR,
          ModItemTags.HEAT_RESISTANT_ARMOR, Tags.Items.ARMORS_CHESTPLATES, CustomTags.PPE_ARMOR)
      .register();

  public static ItemEntry<SpaceArmorComponentItem> SPACE_ADVANCED_QUARKTECH_CHESTPLATE = ISGRegistries.REGISTRATE.item("space_advanced_quarktech_chestplate",
          (p) -> new SpaceArmorComponentItem(GTArmorMaterials.ARMOR, ArmorItem.Type.CHESTPLATE, 128000, p)
              .setArmorLogic(new AdvancedQuarkTechSuite(
                  (int) GTValues.V[GTValues.IV],
                  1_000_000_000L * (long) Math.max(1, Math.pow(4,
                      ConfigHolder.INSTANCE.tools.voltageTierAdvQuarkTech - 6)),
                  ConfigHolder.INSTANCE.tools.voltageTierAdvQuarkTech)))
      .lang("Advanced QuarkTech™ Space Suite Chestplate")
      .properties(p -> p.rarity(Rarity.EPIC))
      .tag(ISGItemTag.QUARKTECH_SPACE_SUITE, ModItemTags.SPACE_SUITS, ModItemTags.FREEZE_RESISTANT_ARMOR,
          ModItemTags.HEAT_RESISTANT_ARMOR, Tags.Items.ARMORS_CHESTPLATES, CustomTags.PPE_ARMOR)
      .register();

  public static ItemEntry<Item> RADIOACTIVE_WASTE = ISGRegistries.REGISTRATE.item("radioactive_waste", Item::new)
      .lang("Radioactive Waste")
      .properties(p -> p.rarity(Rarity.UNCOMMON))
      .register();

  public static ItemEntry<ComponentItem> WIRELESS_ENERGY_RECEIVE_COVER_LV = registerTieredCover(LV, 1);
  public static ItemEntry<ComponentItem> WIRELESS_ENERGY_RECEIVE_COVER_MV = registerTieredCover(MV, 1);
  public static ItemEntry<ComponentItem> WIRELESS_ENERGY_RECEIVE_COVER_HV = registerTieredCover(HV, 1);
  public static ItemEntry<ComponentItem> WIRELESS_ENERGY_RECEIVE_COVER_EV = registerTieredCover(EV, 1);
  public static ItemEntry<ComponentItem> WIRELESS_ENERGY_RECEIVE_COVER_IV = registerTieredCover(IV, 1);
  public static ItemEntry<ComponentItem> WIRELESS_ENERGY_RECEIVE_COVER_LUV = registerTieredCover(LuV, 1);
  public static ItemEntry<ComponentItem> WIRELESS_ENERGY_RECEIVE_COVER_ZPM = registerTieredCover(ZPM, 1);
  public static ItemEntry<ComponentItem> WIRELESS_ENERGY_RECEIVE_COVER_UV = registerTieredCover(UV, 1);
  public static ItemEntry<ComponentItem> WIRELESS_ENERGY_RECEIVE_COVER_UHV = GTCEuAPI.isHighTier() ?
      registerTieredCover(UHV, 1) : null;
  public static ItemEntry<ComponentItem> WIRELESS_ENERGY_RECEIVE_COVER_UEV = GTCEuAPI.isHighTier() ?
      registerTieredCover(UEV, 1) : null;
  public static ItemEntry<ComponentItem> WIRELESS_ENERGY_RECEIVE_COVER_UIV = GTCEuAPI.isHighTier() ?
      registerTieredCover(UIV, 1) : null;
  public static ItemEntry<ComponentItem> WIRELESS_ENERGY_RECEIVE_COVER_UXV = GTCEuAPI.isHighTier() ?
      registerTieredCover(UXV, 1) : null;
  public static ItemEntry<ComponentItem> WIRELESS_ENERGY_RECEIVE_COVER_OPV = GTCEuAPI.isHighTier() ?
      registerTieredCover(OpV, 1) : null;

  public static ItemEntry<ComponentItem> WIRELESS_ENERGY_RECEIVE_COVER_LV_4A = registerTieredCover(LV, 4);
  public static ItemEntry<ComponentItem> WIRELESS_ENERGY_RECEIVE_COVER_MV_4A = registerTieredCover(MV, 4);
  public static ItemEntry<ComponentItem> WIRELESS_ENERGY_RECEIVE_COVER_HV_4A = registerTieredCover(HV, 4);
  public static ItemEntry<ComponentItem> WIRELESS_ENERGY_RECEIVE_COVER_EV_4A = registerTieredCover(EV, 4);
  public static ItemEntry<ComponentItem> WIRELESS_ENERGY_RECEIVE_COVER_IV_4A = registerTieredCover(IV, 4);
  public static ItemEntry<ComponentItem> WIRELESS_ENERGY_RECEIVE_COVER_LUV_4A = registerTieredCover(LuV, 4);
  public static ItemEntry<ComponentItem> WIRELESS_ENERGY_RECEIVE_COVER_ZPM_4A = registerTieredCover(ZPM, 4);
  public static ItemEntry<ComponentItem> WIRELESS_ENERGY_RECEIVE_COVER_UV_4A = registerTieredCover(UV, 4);
  public static ItemEntry<ComponentItem> WIRELESS_ENERGY_RECEIVE_COVER_UHV_4A = GTCEuAPI.isHighTier() ?
      registerTieredCover(UHV, 4) : null;
  public static ItemEntry<ComponentItem> WIRELESS_ENERGY_RECEIVE_COVER_UEV_4A = GTCEuAPI.isHighTier() ?
      registerTieredCover(UEV, 4) : null;
  public static ItemEntry<ComponentItem> WIRELESS_ENERGY_RECEIVE_COVER_UIV_4A = GTCEuAPI.isHighTier() ?
      registerTieredCover(UIV, 4) : null;
  public static ItemEntry<ComponentItem> WIRELESS_ENERGY_RECEIVE_COVER_UXV_4A = GTCEuAPI.isHighTier() ?
      registerTieredCover(UXV, 4) : null;
  public static ItemEntry<ComponentItem> WIRELESS_ENERGY_RECEIVE_COVER_OPV_4A = GTCEuAPI.isHighTier() ?
      registerTieredCover(OpV, 4) : null;

  public static final ItemEntry<Item> CATALYST_BASE = register("catalyst_base");


  private static ItemEntry<Item> register(String id) {
    return ISGRegistries.REGISTRATE.item(id, Item::new)
        .model((ctx, prov) -> prov.generated(ctx, prov.modLoc(String.format("item/%s", id))))
        .register();
  }

  private static ItemEntry<Item> registerLang(String id, String name) {
    return ISGRegistries.REGISTRATE.item(id, Item::new)
        .lang(name)
        .model((ctx, prov) -> prov.generated(ctx, prov.modLoc(String.format("item/%s", id))))
        .register();
  }

  private static ItemEntry<Item> registerSmd(String id) {
    return ISGRegistries.REGISTRATE.item(id, Item::new)
        .model((ctx, prov) -> prov.generated(ctx, prov.modLoc(String.format("item/smd/%s", id))))
        .register();
  }

  private static ItemEntry<Item> registerCustomModel(String id) {
    return ISGRegistries.REGISTRATE.item(id, Item::new)
        .model(NonNullBiConsumer.noop())
        .register();
  }

  private static ItemEntry<ComponentItem> registerTieredCover(int tier, int amperage) {
    String id = GTValues.VN[tier].toLowerCase(Locale.ROOT) + "_" + (amperage == 1 ? "" : amperage + "a_") + "wireless_energy_receive_cover";
    return ISGRegistries.REGISTRATE
        .item(id, ComponentItem::create)
        .lang(VNF[tier] + " " + "Wireless Energy Receive Cover")
        .onRegister(item -> item.attachComponents(new TooltipBehavior(lines -> {
          lines.add(Component.translatable("item.isg.wireless_energy_receive_cover.tooltip.1"));
          lines.add(Component.translatable("item.isg.wireless_energy_receive_cover.tooltip.2"));
          lines.add(Component.translatable("item.isg.wireless_energy_receive_cover.tooltip.3", GTValues.VEX[tier] * amperage));
        }), new CoverPlaceBehavior(amperage == 1 ? ISGCovers.WIRELESS_ENERGY_RECEIVE[tier - 1] : ISGCovers.WIRELESS_ENERGY_RECEIVE_4A[tier - 1])))
        .model((ctx, prov) -> prov.generated(ctx, prov.modLoc(String.format("item/wireless/%s", id)))).register();
  }
  private static ItemEntry<Item> registerCircuit(String paramString1, String paramString2, TagKey<Item> paramTagKey) {
    return ISGRegistries.REGISTRATE.item(paramString1, Item::new)
        .lang(paramString2)
        .tag(paramTagKey)
        .model((ctx, prov) -> prov.generated(ctx, prov.modLoc("item/circuit/%s".formatted(paramString1))))
        .register();
  }

  private static ItemEntry<Item> registerCircuit(String paramString1, TagKey<Item> paramTagKey) {
    return ISGRegistries.REGISTRATE.item(paramString1, Item::new)
        .lang(toEnglishName(paramString1))
        .tag(paramTagKey)
        .model((ctx, prov) -> prov.generated(ctx, prov.modLoc("item/circuit/%s".formatted(paramString1))))
        .register();
  }

  public static <T extends ItemLike> NonNullConsumer<T> materialInfo(Supplier<ItemMaterialInfo> materialInfo) {
    return item -> ItemMaterialData.registerMaterialInfo(item, materialInfo.get());
  }
}
