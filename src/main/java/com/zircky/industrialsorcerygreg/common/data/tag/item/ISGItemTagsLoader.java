package com.zircky.industrialsorcerygreg.common.data.tag.item;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTItems;
import com.gregtechceu.gtceu.common.data.GTMaterialItems;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.tterrag.registrate.providers.RegistrateTagsProvider;
import com.tterrag.registrate.util.entry.ItemEntry;
import com.zircky.industrialsorcerygreg.api.data.tag.ISGTagPrefix;
import com.zircky.industrialsorcerygreg.common.data.ISGMaterials;
import earth.terrarium.adastra.common.tags.ModItemTags;
import net.minecraft.tags.TagEntry;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import java.util.stream.Stream;

public class ISGItemTagsLoader {
  public static ItemEntry<?>[] NANO_SPACE_SUITE = { GTItems.NANO_HELMET, GTItems.NANO_LEGGINGS, GTItems.NANO_BOOTS };
  public static ItemEntry<?>[] QUANTUM_SPACE_SUITE = { GTItems.QUANTUM_HELMET, GTItems.QUANTUM_LEGGINGS,
      GTItems.QUANTUM_BOOTS };
  public static ItemEntry<?>[] SPACE_SUITES = Stream.of(NANO_SPACE_SUITE, QUANTUM_SPACE_SUITE).flatMap(Stream::of)
      .toArray(ItemEntry<?>[]::new);

  public static void init(RegistrateTagsProvider<Item> provider) {
    reactorFuelAndDepleted(provider);
    isotopes(provider);
    create(provider, ISGItemTag.NANOMUSCLE_SPACE_SUITE, NANO_SPACE_SUITE);
    create(provider, ISGItemTag.QUARKTECH_SPACE_SUITE, QUANTUM_SPACE_SUITE);

    create(provider, ModItemTags.SPACE_SUITS, SPACE_SUITES);
    create(provider, ModItemTags.FREEZE_RESISTANT_ARMOR, SPACE_SUITES);
    create(provider, ModItemTags.HEAT_RESISTANT_ARMOR, SPACE_SUITES);
  }

  private static void reactorFuelAndDepleted(RegistrateTagsProvider<Item> provider) {
    createTagFuel(provider, ISGItemTag.FUEL_NEPTUNIUM_LEN_236, ISGItemTag.DEPLETED_NEPTUNIUM_LEN_236,
        ISGMaterials.NeptuniumLEN236, ISGMaterials.NeptuniumLEN236Ox, ISGMaterials.NeptuniumLEN236Ni,
        ISGMaterials.NeptuniumLEN236Za, ISGMaterials.NeptuniumLEN236TR);
    createTagFuel(provider, ISGItemTag.FUEL_NEPTUNIUM_HEN_236, ISGItemTag.DEPLETED_NEPTUNIUM_HEN_236,
        ISGMaterials.NeptuniumHEN236, ISGMaterials.NeptuniumHEN236Ox, ISGMaterials.NeptuniumHEN236Ni,
        ISGMaterials.NeptuniumHEN236Za, ISGMaterials.NeptuniumHEN236TR);
    createTagFuel(provider, ISGItemTag.FUEL_CURIUM_LECM_243, ISGItemTag.DEPLETED_CURIUM_LECM_243,
        ISGMaterials.CuriumLECM243, ISGMaterials.CuriumLECM243Ox, ISGMaterials.CuriumLECM243Ni,
        ISGMaterials.CuriumLECM243Za, ISGMaterials.CuriumLECM243TR);
    createTagFuel(provider, ISGItemTag.FUEL_CURIUM_HECM_243, ISGItemTag.DEPLETED_CURIUM_HECM_243,
        ISGMaterials.CuriumHECM243, ISGMaterials.CuriumHECM243Ox, ISGMaterials.CuriumHECM243Ni,
        ISGMaterials.CuriumHECM243Za, ISGMaterials.CuriumHECM243TR);
    createTagFuel(provider, ISGItemTag.FUEL_CURIUM_LECM_245, ISGItemTag.DEPLETED_CURIUM_LECM_245,
        ISGMaterials.CuriumLECM245, ISGMaterials.CuriumLECM245Ox, ISGMaterials.CuriumLECM245Ni,
        ISGMaterials.CuriumLECM245Za, ISGMaterials.CuriumLECM245TR);
    createTagFuel(provider, ISGItemTag.FUEL_CURIUM_HECM_245, ISGItemTag.DEPLETED_CURIUM_HECM_245,
        ISGMaterials.CuriumHECM245, ISGMaterials.CuriumHECM245Ox, ISGMaterials.CuriumHECM245Ni,
        ISGMaterials.CuriumHECM245Za, ISGMaterials.CuriumHECM245TR);
    createTagFuel(provider, ISGItemTag.FUEL_CURIUM_LECM_247, ISGItemTag.DEPLETED_CURIUM_LECM_247,
        ISGMaterials.CuriumLECM247, ISGMaterials.CuriumLECM247Ox, ISGMaterials.CuriumLECM247Ni,
        ISGMaterials.CuriumLECM247Za, ISGMaterials.CuriumLECM247TR);
    createTagFuel(provider, ISGItemTag.FUEL_CURIUM_HECM_247, ISGItemTag.DEPLETED_CURIUM_HECM_247,
        ISGMaterials.CuriumHECM247, ISGMaterials.CuriumHECM247Ox, ISGMaterials.CuriumHECM247Ni,
        ISGMaterials.CuriumHECM247Za, ISGMaterials.CuriumHECM247TR);
    createTagFuel(provider, ISGItemTag.FUEL_BERKELIUM_LEB_248, ISGItemTag.DEPLETED_BERKELIUM_LEB_248,
        ISGMaterials.BerkeliumLEB248, ISGMaterials.BerkeliumLEB248Ox, ISGMaterials.BerkeliumLEB248Ni,
        ISGMaterials.BerkeliumLEB248Za, ISGMaterials.BerkeliumLEB248TR);
    createTagFuel(provider, ISGItemTag.FUEL_BERKELIUM_HEB_248, ISGItemTag.DEPLETED_BERKELIUM_HEB_248,
        ISGMaterials.BerkeliumHEB248, ISGMaterials.BerkeliumHEB248Ox, ISGMaterials.BerkeliumHEB248Ni,
        ISGMaterials.BerkeliumHEB248Za, ISGMaterials.BerkeliumHEB248TR);
    createTagFuel(provider, ISGItemTag.FUEL_THORIUM_TBU, ISGItemTag.DEPLETED_THORIUM_TBU,
        ISGMaterials.ThoriumTBU, ISGMaterials.ThoriumTBUOx, ISGMaterials.ThoriumTBUNi,
        ISGMaterials.ThoriumTBUZa, ISGMaterials.ThoriumTBUTR);
    createTagFuel(provider, ISGItemTag.FUEL_MIXED_MIX_239, ISGItemTag.DEPLETED_MIXED_MIX_239,
        ISGMaterials.MixedMIX239, ISGMaterials.MixedMIX239Ox, ISGMaterials.MixedMIX239Ni,
        ISGMaterials.MixedMIX239Za, ISGMaterials.MixedMIX239TR);
    createTagFuel(provider, ISGItemTag.FUEL_MIXED_MIX_241, ISGItemTag.DEPLETED_MIXED_MIX_241,
        ISGMaterials.MixedMIX241, ISGMaterials.MixedMIX241Ox, ISGMaterials.MixedMIX241Ni,
        ISGMaterials.MixedMIX241Za, ISGMaterials.MixedMIX241TR);
    createTagFuel(provider, ISGItemTag.FUEL_URANIUM_LEU_233, ISGItemTag.DEPLETED_URANIUM_LEU_233,
        ISGMaterials.UraniumLEU233, ISGMaterials.UraniumLEU233Ox, ISGMaterials.UraniumLEU233Ni,
        ISGMaterials.UraniumLEU233Za, ISGMaterials.UraniumLEU233TR);
    createTagFuel(provider, ISGItemTag.FUEL_URANIUM_LEU_235, ISGItemTag.DEPLETED_URANIUM_LEU_235,
        ISGMaterials.UraniumLEU235, ISGMaterials.UraniumLEU235Ox, ISGMaterials.UraniumLEU235Ni,
        ISGMaterials.UraniumLEU235Za, ISGMaterials.UraniumLEU235TR);
    createTagFuel(provider, ISGItemTag.FUEL_URANIUM_HEU_235, ISGItemTag.DEPLETED_URANIUM_HEU_235,
        ISGMaterials.UraniumHEU235, ISGMaterials.UraniumHEU235Ox, ISGMaterials.UraniumHEU235Ni,
        ISGMaterials.UraniumHEU235Za, ISGMaterials.UraniumHEU235TR);
    createTagFuel(provider, ISGItemTag.FUEL_URANIUM_HEU_233, ISGItemTag.DEPLETED_URANIUM_HEU_233,
        ISGMaterials.UraniumHEU233, ISGMaterials.UraniumHEU233Ox, ISGMaterials.UraniumHEU233Ni,
        ISGMaterials.UraniumHEU233Za, ISGMaterials.UraniumHEU233TR);
    createTagFuel(provider, ISGItemTag.FUEL_AMERICIUM_HEA_242, ISGItemTag.DEPLETED_AMERICIUM_HEA_242,
        ISGMaterials.AmericiumHEA242, ISGMaterials.AmericiumHEA242Ox, ISGMaterials.AmericiumHEA242Ni,
        ISGMaterials.AmericiumHEA242Za, ISGMaterials.AmericiumHEA242TR);
    createTagFuel(provider, ISGItemTag.FUEL_AMERICIUM_LEA_242, ISGItemTag.DEPLETED_AMERICIUM_LEA_242,
        ISGMaterials.AmericiumLEA242, ISGMaterials.AmericiumLEA242Ox, ISGMaterials.AmericiumLEA242Ni,
        ISGMaterials.AmericiumLEA242Za, ISGMaterials.AmericiumLEA242TR);
    createTagFuel(provider, ISGItemTag.FUEL_PLUTONIUM_LEP_241, ISGItemTag.DEPLETED_PLUTONIUM_LEP_241,
        ISGMaterials.PlutoniumLEP241, ISGMaterials.PlutoniumLEP241Ox, ISGMaterials.PlutoniumLEP241Ni,
        ISGMaterials.PlutoniumLEP241Za, ISGMaterials.PlutoniumLEP241TR);
    createTagFuel(provider, ISGItemTag.FUEL_PLUTONIUM_HEP_241, ISGItemTag.DEPLETED_PLUTONIUM_HEP_241,
        ISGMaterials.PlutoniumHEP241, ISGMaterials.PlutoniumHEP241Ox, ISGMaterials.PlutoniumHEP241Ni,
        ISGMaterials.PlutoniumHEP241Za, ISGMaterials.PlutoniumHEP241TR);
    createTagFuel(provider, ISGItemTag.FUEL_PLUTONIUM_HEP_239, ISGItemTag.DEPLETED_PLUTONIUM_HEP_239,
        ISGMaterials.PlutoniumHEP239, ISGMaterials.PlutoniumHEP239Ox, ISGMaterials.PlutoniumHEP239Ni,
        ISGMaterials.PlutoniumHEP239Za, ISGMaterials.PlutoniumHEP239TR);
    createTagFuel(provider, ISGItemTag.FUEL_PLUTONIUM_LEP_239, ISGItemTag.DEPLETED_PLUTONIUM_LEP_239,
        ISGMaterials.PlutoniumLEP239, ISGMaterials.PlutoniumLEP239Ox, ISGMaterials.PlutoniumLEP239Ni,
        ISGMaterials.PlutoniumLEP239Za, ISGMaterials.PlutoniumLEP239TR);
    createTagFuel(provider, ISGItemTag.FUEL_CALIFORNIUM_LECF_251, ISGItemTag.DEPLETED_CALIFORNIUM_LECF_251,
        ISGMaterials.CaliforniumLECF251, ISGMaterials.CaliforniumLECF251Ox, ISGMaterials.CaliforniumLECF251Ni,
        ISGMaterials.CaliforniumLECF251Za, ISGMaterials.CaliforniumLECF251TR);
    createTagFuel(provider, ISGItemTag.FUEL_CALIFORNIUM_HECF_251, ISGItemTag.DEPLETED_CALIFORNIUM_HECF_251,
        ISGMaterials.CaliforniumHECF251, ISGMaterials.CaliforniumHECF251Ox, ISGMaterials.CaliforniumHECF251Ni,
        ISGMaterials.CaliforniumHECF251Za, ISGMaterials.CaliforniumHECF251TR);
    createTagFuel(provider, ISGItemTag.FUEL_CALIFORNIUM_LECF_249, ISGItemTag.DEPLETED_CALIFORNIUM_LECF_249,
        ISGMaterials.CaliforniumLECF249, ISGMaterials.CaliforniumLECF249Ox, ISGMaterials.CaliforniumLECF249Ni,
        ISGMaterials.CaliforniumLECF249Za, ISGMaterials.CaliforniumLECF249TR);
    createTagFuel(provider, ISGItemTag.FUEL_CALIFORNIUM_HECF_249, ISGItemTag.DEPLETED_CALIFORNIUM_HECF_249,
        ISGMaterials.CaliforniumHECF249, ISGMaterials.CaliforniumHECF249Ox, ISGMaterials.CaliforniumHECF249Ni,
        ISGMaterials.CaliforniumHECF249Za, ISGMaterials.CaliforniumHECF249TR);
    createTagFuel(provider, ISGItemTag.FUEL_XENORIUM_XEN_298, ISGItemTag.DEPLETED_XENORIUM_XEN_298,
        ISGMaterials.XenoriumXEN298);
  }

  private static void isotopes(RegistrateTagsProvider<Item> provider) {
    createMaterialTag(provider, ISGItemTag.ISOTOPE_THORIUM_230, TagPrefix.ingot,
        ISGMaterials.Thorium230, ISGMaterials.Thorium230Ox, ISGMaterials.Thorium230Ni, ISGMaterials.Thorium230Za);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_THORIUM_232, TagPrefix.ingot,
        ISGMaterials.Thorium232, ISGMaterials.Thorium232Ox, ISGMaterials.Thorium232Ni, ISGMaterials.Thorium232Za);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_THORIUM_233, TagPrefix.ingot, ISGMaterials.Thorium233);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_PROTACTINIUM_233, TagPrefix.ingot, ISGMaterials.Protactinium233);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_URANIUM_233, TagPrefix.ingot,
        ISGMaterials.Uranium233, ISGMaterials.Uranium233Ox, ISGMaterials.Uranium233Ni, ISGMaterials.Uranium233Za);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_URANIUM_234, TagPrefix.ingot,
        ISGMaterials.Uranium234, ISGMaterials.Uranium234Ox, ISGMaterials.Uranium234Ni, ISGMaterials.Uranium234Za);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_URANIUM_235, TagPrefix.ingot,
        GTMaterials.Uranium235, ISGMaterials.Uranium235Ox, ISGMaterials.Uranium235Ni, ISGMaterials.Uranium235Za);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_URANIUM_238, TagPrefix.ingot,
        GTMaterials.Uranium238, ISGMaterials.Uranium238Ox, ISGMaterials.Uranium238Ni, ISGMaterials.Uranium238Za);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_URANIUM_239, TagPrefix.ingot, ISGMaterials.Uranium239);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_NEPTUNIUM_235, TagPrefix.ingot, ISGMaterials.Neptunium235);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_NEPTUNIUM_236, TagPrefix.ingot,
        ISGMaterials.Neptunium236, ISGMaterials.Neptunium236Ox, ISGMaterials.Neptunium236Ni, ISGMaterials.Neptunium236Za);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_NEPTUNIUM_237, TagPrefix.ingot,
        ISGMaterials.Neptunium237, ISGMaterials.Neptunium237Ox, ISGMaterials.Neptunium237Ni, ISGMaterials.Neptunium237Za);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_NEPTUNIUM_239, TagPrefix.ingot, ISGMaterials.Neptunium239);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_PLUTONIUM_239, TagPrefix.ingot,
        ISGMaterials.Plutonium239Ox, ISGMaterials.Plutonium239Ni, ISGMaterials.Plutonium239Za);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_PLUTONIUM_240, TagPrefix.ingot, ISGMaterials.Plutonium240);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_PLUTONIUM_241, TagPrefix.ingot,
        ISGMaterials.Plutonium241Ox, ISGMaterials.Plutonium241Ni, ISGMaterials.Plutonium241Za);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_PLUTONIUM_242, TagPrefix.ingot,
        ISGMaterials.Plutonium242, ISGMaterials.Plutonium242Ox, ISGMaterials.Plutonium242Ni, ISGMaterials.Plutonium242Za);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_PLUTONIUM_244, TagPrefix.ingot, ISGMaterials.Plutonium244);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_PLUTONIUM_245, TagPrefix.ingot, ISGMaterials.Plutonium245);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_AMERICIUM_241, TagPrefix.ingot,
        ISGMaterials.Americium241, ISGMaterials.Americium241Ox, ISGMaterials.Americium241Ni, ISGMaterials.Americium241Za);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_AMERICIUM_242, TagPrefix.ingot,
        ISGMaterials.Americium242, ISGMaterials.Americium242Ox, ISGMaterials.Americium242Ni, ISGMaterials.Americium242Za);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_AMERICIUM_243, TagPrefix.ingot,
        ISGMaterials.Americium243, ISGMaterials.Americium243Ox, ISGMaterials.Americium243Ni, ISGMaterials.Americium243Za);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_AMERICIUM_245, TagPrefix.ingot, ISGMaterials.Americium245);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_CURIUM_243, TagPrefix.ingot,
        ISGMaterials.Curium243, ISGMaterials.Curium243Ox, ISGMaterials.Curium243Ni, ISGMaterials.Curium243Za);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_CURIUM_245, TagPrefix.ingot,
        ISGMaterials.Curium245, ISGMaterials.Curium245Ox, ISGMaterials.Curium245Ni, ISGMaterials.Curium245Za);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_CURIUM_246, TagPrefix.ingot,
        ISGMaterials.Curium246, ISGMaterials.Curium246Ox, ISGMaterials.Curium246Ni, ISGMaterials.Curium246Za);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_CURIUM_247, TagPrefix.ingot,
        ISGMaterials.Curium247, ISGMaterials.Curium247Ox, ISGMaterials.Curium247Ni, ISGMaterials.Curium247Za);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_CURIUM_250, TagPrefix.ingot, ISGMaterials.Curium250);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_CURIUM_251, TagPrefix.ingot, ISGMaterials.Curium251);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_BERKELIUM_247, TagPrefix.ingot,
        ISGMaterials.Berkelium247, ISGMaterials.Berkelium247Ox, ISGMaterials.Berkelium247Ni, ISGMaterials.Berkelium247Za);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_BERKELIUM_248, TagPrefix.ingot,
        ISGMaterials.Berkelium248, ISGMaterials.Berkelium248Ox, ISGMaterials.Berkelium248Ni, ISGMaterials.Berkelium248Za);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_BERKELIUM_249, TagPrefix.ingot, ISGMaterials.Berkelium249);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_BERKELIUM_251, TagPrefix.ingot, ISGMaterials.Berkelium251);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_CALIFORNIUM_249, TagPrefix.ingot,
        ISGMaterials.Californium249, ISGMaterials.Californium249Ox, ISGMaterials.Californium249Ni, ISGMaterials.Californium249Za);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_CALIFORNIUM_250, TagPrefix.ingot,
        ISGMaterials.Californium250, ISGMaterials.Californium250Ox, ISGMaterials.Californium250Ni, ISGMaterials.Californium250Za);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_CALIFORNIUM_251, TagPrefix.ingot,
        ISGMaterials.Californium251, ISGMaterials.Californium251Ox, ISGMaterials.Californium251Ni, ISGMaterials.Californium251Za);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_CALIFORNIUM_252, TagPrefix.ingot,
        ISGMaterials.Californium252, ISGMaterials.Californium252Ox, ISGMaterials.Californium252Ni, ISGMaterials.Californium252Za);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_CALIFORNIUM_253, TagPrefix.ingot, ISGMaterials.Californium253);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_CALIFORNIUM_256, TagPrefix.ingot, ISGMaterials.Californium256);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_CALIFORNIUM_257, TagPrefix.ingot, ISGMaterials.Californium257);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_EINSTEINIUM_253, TagPrefix.ingot, ISGMaterials.Einsteinium253);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_EINSTEINIUM_255, TagPrefix.ingot, ISGMaterials.Einsteinium255);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_EINSTEINIUM_257, TagPrefix.ingot, ISGMaterials.Einsteinium257);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_FERMIUM_257, TagPrefix.ingot, ISGMaterials.Fermium257);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_FERMIUM_258, TagPrefix.ingot, ISGMaterials.Fermium258);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_FERMIUM_259, TagPrefix.ingot, ISGMaterials.Fermium259);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_FERMIUM_262, TagPrefix.ingot, ISGMaterials.Fermium262);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_FERMIUM_263, TagPrefix.ingot, ISGMaterials.Fermium263);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_MENDELEVIUM_259, TagPrefix.ingot, ISGMaterials.Mendelevium259);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_MENDELEVIUM_261, TagPrefix.ingot, ISGMaterials.Mendelevium261);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_MENDELEVIUM_263, TagPrefix.ingot, ISGMaterials.Mendelevium263);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_COPERNICIUM_291, TagPrefix.ingot,
        ISGMaterials.Copernicium291, ISGMaterials.Copernicium291Ox, ISGMaterials.Copernicium291Ni, ISGMaterials.Copernicium291Za);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_IRIDIUM_192, TagPrefix.ingot, ISGMaterials.Iridium192);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_XENORIUM_298, TagPrefix.ingot, ISGMaterials.Xenorium298);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_LITHIUM_6, TagPrefix.ingot,
        ISGMaterials.Lithium6, ISGMaterials.Lithium6Ox, ISGMaterials.Lithium6Ni, ISGMaterials.Lithium6Za);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_LITHIUM_7, TagPrefix.ingot,
        ISGMaterials.Lithium7, ISGMaterials.Lithium7Ox, ISGMaterials.Lithium7Ni, ISGMaterials.Lithium7Za);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_QUANTITE, TagPrefix.ingot, ISGMaterials.Quantite);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_SODIUM_22, TagPrefix.ingot, ISGMaterials.Sodium22);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_BORON_10, TagPrefix.ingot, ISGMaterials.Boron10);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_BORON_11, TagPrefix.ingot, ISGMaterials.Boron11);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_BERYLLIUM_7, TagPrefix.ingot, ISGMaterials.Beryllium7);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_MAGNESIUM_24, TagPrefix.ingot, ISGMaterials.Magnesium24);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_MAGNESIUM_26, TagPrefix.ingot, ISGMaterials.Magnesium26);
    createMaterialTag(provider, ISGItemTag.ISOTOPE_CALCIUM_48, TagPrefix.ingot, ISGMaterials.Calcium48);
  }

  private static void create(RegistrateTagsProvider<Item> provider, TagKey<Item> tagKey, ItemEntry<?>... items) {
    var builder = provider.addTag(tagKey);
    for (ItemEntry<?> itemEntry : items) builder.add(TagEntry.element(itemEntry.getId()));
  }

  private static void createTagFuel(RegistrateTagsProvider<Item> provider, TagKey<Item> fuelTagKey,
                                   TagKey<Item> depletedTagKey, Material... materials) {
    var depletedBuilder = provider.addTag(depletedTagKey);
    var fuelBuilder = provider.addTag(fuelTagKey);

    for (Material material : materials) {
      depletedBuilder.add(TagEntry.element(GTMaterialItems.MATERIAL_ITEMS.get(ISGTagPrefix.DEPLETED, material).getId()));
      fuelBuilder.add(TagEntry.element(GTMaterialItems.MATERIAL_ITEMS.get(ISGTagPrefix.FUEL, material).getId()));
    }
  }

  private static void createMaterialTag(RegistrateTagsProvider<Item> provider, TagKey<Item> tagKey, TagPrefix prefix,
                                        Material... materials) {
    var builder = provider.addTag(tagKey);
    for (Material material : materials) {
      builder.add(TagEntry.element(GTMaterialItems.MATERIAL_ITEMS.get(prefix, material).getId()));
    }
  }
}
