package com.zircky.industrialsorcerygreg.data.lang;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.registry.GTRegistries;
import com.tterrag.registrate.providers.RegistrateLangProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.HashSet;
import java.util.Set;

public class MaterialLangGenerator {
  private MaterialLangGenerator() {
    /* This utility class should not be instantiated */
  }

  public static void generate(RegistrateLangProvider provider, String modId) {
    Set<String> addedTagKeys = new HashSet<>();

    for (var material : GTRegistries.MATERIALS) {
      if (material.getModid().equals(modId)) {
        provider.add(material.getUnlocalizedName(), material.getDefaultTranslation());
      }

      addForgeTagTranslation(provider, addedTagKeys, material.getName(), material.getDefaultTranslation());
      addGeneratedItemTagTranslations(provider, addedTagKeys, material);
      addGeneratedBlockTagTranslations(provider, addedTagKeys, material);
    }
  }

  private static void addGeneratedItemTagTranslations(RegistrateLangProvider provider, Set<String> addedKeys, Material material) {
    for (TagPrefix tagPrefix : TagPrefix.values()) {
      if (!tagPrefix.doGenerateItem(material)) continue;
      String translation = tagPrefix.langValue.formatted(materialNameForPrefix(tagPrefix, material));
      for (TagKey<Item> tag : tagPrefix.getItemTags(material)) {
        addTagTranslation(provider, addedKeys, "tag.item.", tag.location(), translation);
      }
      for (TagKey<Item> tag : tagPrefix.getItemParentTags()) {
        addTagTranslation(provider, addedKeys, "tag.item.", tag.location(), toEnglishName(tag.location().getPath()));
      }
    }
  }

  private static void addGeneratedBlockTagTranslations(RegistrateLangProvider provider, Set<String> addedKeys, Material material) {
    for (TagPrefix tagPrefix : TagPrefix.values()) {
      if (!tagPrefix.doGenerateBlock(material)) continue;
      String translation = tagPrefix.langValue.formatted(materialNameForPrefix(tagPrefix, material));
      for (TagKey<Block> tag : tagPrefix.getBlockTags(material)) {
        addTagTranslation(provider, addedKeys, "tag.block.", tag.location(), translation);
      }
    }
  }

  private static void addForgeTagTranslation(RegistrateLangProvider provider, Set<String> addedKeys, String path, String translation) {
    addTagTranslation(provider, addedKeys, "tag.item.forge." + path, translation);
    addTagTranslation(provider, addedKeys, "tag.fluid.forge." + path, translation);
    addTagTranslation(provider, addedKeys, "tag.forge." + path, translation);
  }

  private static void addTagTranslation(RegistrateLangProvider provider, Set<String> addedKeys, String prefix, ResourceLocation id, String translation) {
    addTagTranslation(provider, addedKeys, prefix + id.getNamespace() + "." + id.getPath().replace('/', '.'), translation);
    addTagTranslation(provider, addedKeys, "tag." + id.getNamespace() + "." + id.getPath().replace('/', '.'), translation);
  }

  private static void addTagTranslation(RegistrateLangProvider provider, Set<String> addedKeys, String key, String translation) {
    if (addedKeys.add(key)) {
      provider.add(key, translation);
    }
  }

  private static String toEnglishName(String path) {
    String[] words = path.replace('/', '_').split("_");
    StringBuilder builder = new StringBuilder();
    for (String word : words) {
      if (word.isEmpty()) continue;
      if (!builder.isEmpty()) {
        builder.append(' ');
      }
      builder.append(Character.toUpperCase(word.charAt(0)));
      if (word.length() > 1) {
        builder.append(word.substring(1));
      }
    }
    return builder.toString();
  }

  private static String materialNameForPrefix(TagPrefix tagPrefix, Material material) {
    String translation = material.getDefaultTranslation();
    if (tagPrefix == TagPrefix.dust || tagPrefix == TagPrefix.dustSmall || tagPrefix == TagPrefix.dustTiny) {
      return removeSuffix(translation, " Dust");
    }
    return translation;
  }

  private static String removeSuffix(String value, String suffix) {
    if (value.endsWith(suffix)) {
      return value.substring(0, value.length() - suffix.length());
    }
    return value;
  }
}
