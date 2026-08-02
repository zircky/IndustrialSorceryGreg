package com.zircky.industrialsorcerygreg.common.data;

import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.item.TagPrefixItem;
import com.gregtechceu.gtceu.api.registry.GTRegistries;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import com.gregtechceu.gtceu.common.data.GTItems;
import com.tterrag.registrate.providers.ProviderType;
import com.tterrag.registrate.util.entry.ItemEntry;
import com.tterrag.registrate.util.nullness.NonNullBiConsumer;
import com.zircky.industrialsorcerygreg.api.data.tag.ISGTagPrefix;
import net.minecraft.world.item.Item;

import static com.zircky.industrialsorcerygreg.api.registries.ISGRegistries.REGISTRATE;
import static com.zircky.industrialsorcerygreg.common.data.ISGCreativeModeTabs.ISG_MATERIAL_ITEM;

@SuppressWarnings("UnstableApiUsage")
public class ISGMaterialItems {

  static ImmutableTable.Builder<TagPrefix, Material, ItemEntry<? extends Item>> MATERIAL_ITEMS_BUILDER = ImmutableTable
      .builder();

  public static Table<TagPrefix, Material, ItemEntry<? extends Item>> MATERIAL_ITEMS;

  // Material Items
  public static void generateMaterialItems() {
    REGISTRATE.creativeModeTab(() -> ISG_MATERIAL_ITEM);
    for (TagPrefix tagPrefix : GTRegistries.TAG_PREFIXES.values()) {
      if (tagPrefix.doGenerateItem()) {
        for (Material material : GTRegistries.MATERIALS) {
          if (tagPrefix.doGenerateItem(material)) {
            generateMaterialItem(tagPrefix, material,
                GTRegistrate.createIgnoringListenerErrors(material.getModid()));
          }
        }
      }
    }
    MATERIAL_ITEMS = MATERIAL_ITEMS_BUILDER.build();
  }

  private static void generateMaterialItem(TagPrefix tagPrefix, Material material, GTRegistrate registrate) {
    registrate.creativeModeTab(() -> ISG_MATERIAL_ITEM);
    MATERIAL_ITEMS_BUILDER.put(tagPrefix, material, registrate
        .item(tagPrefix.idPattern().formatted(material.getName()),
            properties -> tagPrefix.itemConstructor()
                .create(material.hasFlag(MaterialFlags.FIRE_RESISTANT) ? properties.fireResistant() :
                    properties, tagPrefix, material))
        .setData(ProviderType.LANG, NonNullBiConsumer.noop())
        .transform(GTItems.unificationItem(tagPrefix, material))
        .properties(p -> {
          p.stacksTo(tagPrefix.maxStackSize());
          if (tagPrefix instanceof ISGTagPrefix prefix && prefix.getMaxDamageProvider() != null) {
            int maxDamage = prefix.getMaxDamageProvider().applyAsInt(material);
            if (maxDamage > 0) p.durability(maxDamage);
          }
          return p;
        })
        .model(NonNullBiConsumer.noop())
        .color(() -> () -> TagPrefixItem.tintColor(material))
        .onRegister(GTItems::cauldronInteraction)
        .register());
  }

}
