package com.zircky.industrialsorcerygreg.common.data;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTCreativeModeTabs;
import com.gregtechceu.gtceu.common.data.GTMachines;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.common.registry.GTRegistration;
import com.tterrag.registrate.util.entry.RegistryEntry;
import com.zircky.industrialsorcerygreg.IndustrialSorceryGreg;
import com.zircky.industrialsorcerygreg.api.registries.ISGRegistries;
import com.zircky.industrialsorcerygreg.common.data.machines.ISGMultiMachines;
import net.minecraft.world.item.CreativeModeTab;

import static com.zircky.industrialsorcerygreg.api.registries.ISGRegistries.REGISTRATE;

public class ISGCreativeModeTabs {
  public static final RegistryEntry<CreativeModeTab> ISG_ITEM = REGISTRATE
      .defaultCreativeTab( "item",builder -> builder
          .displayItems(new GTCreativeModeTabs.RegistrateDisplayItemsGenerator("item", REGISTRATE))
          .icon(() -> ISGItems.SMD_CAPACITOR_SUPRACAUSAL.asStack())
          .title(REGISTRATE.addLang("itemGroup", IndustrialSorceryGreg.id("item"), IndustrialSorceryGreg.NAME + " | Items"))
          .build())
      .register();

  public static RegistryEntry<CreativeModeTab> ISG_MACHINE = REGISTRATE.defaultCreativeTab("machine",
          builder -> builder.displayItems(new GTCreativeModeTabs.RegistrateDisplayItemsGenerator("machine", REGISTRATE))
              .icon(ISGMultiMachines.FUEL_REPROCESSOR::asStack)
              .title(REGISTRATE.addLang("itemGroup", IndustrialSorceryGreg.id("machine"), IndustrialSorceryGreg.NAME + " | Machines"))
              .build())
      .register();

  public static RegistryEntry<CreativeModeTab> MATERIAL_ITEM = REGISTRATE.defaultCreativeTab("material_item",
          builder -> builder.displayItems(new GTCreativeModeTabs.RegistrateDisplayItemsGenerator("material_item", REGISTRATE))
              .icon(() -> ChemicalHelper.get(TagPrefix.ingot, ISGMaterials.Infinity))
              .title(REGISTRATE.addLang("itemGroup", IndustrialSorceryGreg.id("material_item"), IndustrialSorceryGreg.NAME + " | Material Items"))
              .build())
      .register();

  public static void init() {}
}
