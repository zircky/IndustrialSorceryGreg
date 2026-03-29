package com.zircky.industrialsorcerygreg.common.data;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.item.ComponentItem;
import com.gregtechceu.gtceu.common.item.armor.*;
import com.gregtechceu.gtceu.config.ConfigHolder;
import com.gregtechceu.gtceu.data.recipe.CustomTags;
import com.tterrag.registrate.util.entry.ItemEntry;
import com.zircky.industrialsorcerygreg.api.registries.ISGRegistries;
import com.zircky.industrialsorcerygreg.common.data.tag.item.ISGItemTag;
import com.zircky.industrialsorcerygreg.common.item.armor.SpaceArmorComponentItem;
import earth.terrarium.adastra.common.tags.ModItemTags;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.common.Tags;

import static com.gregtechceu.gtceu.common.data.GTItems.attach;

public class ISGItems {

  static {
    ISGRegistries.REGISTRATE.creativeModeTab(() -> ISGCreativeModeTabs.ISG_ITEM);
  }

  public static void init() {
  }

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
                  (int) GTValues.V[GTValues.HV],
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
                  (int) GTValues.V[GTValues.HV],
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


  private static ItemEntry<Item> registerLang(String id, String name) {
    return ISGRegistries.REGISTRATE.item(id, Item::new)
        .lang(name)
        .model((ctx, prov) -> prov.generated(ctx, prov.modLoc(String.format("item/%s", id))))
        .register();
  }
}
