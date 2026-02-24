package com.zircky.industrialsorcerygreg.common.data;

import com.gregtechceu.gtceu.common.data.GTCreativeModeTabs;
import com.tterrag.registrate.util.entry.RegistryEntry;
import com.zircky.industrialsorcerygreg.IndustrialSorceryGreg;
import com.zircky.industrialsorcerygreg.api.registries.ISGRegistries;
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

  public static void init() {}
}
