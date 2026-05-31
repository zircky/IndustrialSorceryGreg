package com.zircky.industrialsorcerygreg.common.data;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.item.ComponentItem;
import com.gregtechceu.gtceu.common.item.armor.*;
import com.gregtechceu.gtceu.common.item.behavior.CoverPlaceBehavior;
import com.gregtechceu.gtceu.common.item.behavior.TooltipBehavior;
import com.gregtechceu.gtceu.config.ConfigHolder;
import com.gregtechceu.gtceu.data.recipe.CustomTags;
import com.tterrag.registrate.util.entry.ItemEntry;
import com.zircky.industrialsorcerygreg.api.registries.ISGRegistries;
import com.zircky.industrialsorcerygreg.common.data.tag.item.ISGItemTag;
import com.zircky.industrialsorcerygreg.common.item.armor.SpaceArmorComponentItem;
import earth.terrarium.adastra.common.tags.ModItemTags;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.common.Tags;

import java.util.Locale;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.common.data.GTItems.attach;

public class ISGItems {

  static {
    ISGRegistries.REGISTRATE.creativeModeTab(() -> ISGCreativeModeTabs.ISG_ITEM);
  }

  public static void init() {
  }

//  public static final ItemEntry<Item> SMD_CAPACITOR_REFINED = registerLang("smd_capacitor_refined", "Refined SMD Capacitor");
//  public static final ItemEntry<Item> SMD_DIODE_REFINED = registerLang("smd_diode_refined", "Refined SMD Diode");
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

  public static final ItemEntry<Item> LOGIC_CHIP = registerLang("logic_chip", "Logic Chip");

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


  private static ItemEntry<Item> registerLang(String id, String name) {
    return ISGRegistries.REGISTRATE.item(id, Item::new)
        .lang(name)
        .model((ctx, prov) -> prov.generated(ctx, prov.modLoc(String.format("item/%s", id))))
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
}
