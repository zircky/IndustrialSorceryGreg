package com.zircky.industrialsorcerygreg.common.data.materials;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty;
import com.gregtechceu.gtceu.common.data.GTMaterials;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.METALLIC;
import static com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty.GasTier.HIGH;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.SNDART_FLAGS;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;

public class NuclearMaterials {
  public static void register() {
    ManganeseOxide = builderISG("manganese_oxide")
        .ingot().dust().fluid()
        .color(0x1A3F0D).secondaryColor(0x425E17).iconSet(METALLIC)
        .appendFlags(SNDART_FLAGS)
        .blastTemp(1924)
        .components(GTMaterials.Manganese, 1, GTMaterials.Oxygen, 1000)
        .buildAndRegister()
        .setFormula("MnO", true);

    NiobiumTin = builderISG("niobium_tin")
        .ingot().dust()
        .color(0xC4C4C4).secondaryColor(0xC0C0C0).iconSet(METALLIC)
        .appendFlags(SNDART_FLAGS)
        .blastTemp(2403)
        .components(GTMaterials.Niobium, 3, GTMaterials.Tin, 1)
        .buildAndRegister()
        .setFormula("Nb3Sn", true);

    Zircaloy = builderISG("zircaloy")
        .ingot().dust()
        .color(0xF6FAF5).secondaryColor(0xFFCC00).iconSet(METALLIC)
        .appendFlags(SNDART_FLAGS)
        .blastTemp(2130)
        .components(GTMaterials.Zirconium, 7, GTMaterials.Tin, 2, GTMaterials.Iron, 1, GTMaterials.Chromium, 1)
        .buildAndRegister();

    Thermoconducting = builderISG("thermoconducting")
        .ingot().dust()
        .color(0x354630).secondaryColor(0x343B29).iconSet(METALLIC)
        .appendFlags(SNDART_FLAGS)
        .blastTemp(1500)
//        .components(Extreme, 3, BoronArsenide, 2, GTMaterials.Niobium, 1)
        .buildAndRegister();

    ZirconiumMolybdenum = builderISG("zirconium_molybdenum")
        .ingot().dust()
        .color(0x3C3B3E).secondaryColor(0x6B6A73).iconSet(METALLIC)
        .appendFlags(SNDART_FLAGS)
        .blastTemp(2373)
        .components(GTMaterials.Zirconium, 19, GTMaterials.Molybdenum, 1)
        .buildAndRegister();

    Extreme = builderISG("extreme")
        .ingot().dust()
        .color(0x130F14).secondaryColor(0x353654).iconSet(METALLIC)
        .appendFlags(SNDART_FLAGS)
        .blastTemp(3500, BlastProperty.GasTier.HIGHER)
        .components(GTMaterials.Tungsten, 4, GTMaterials.Rhenium, 2, GTMaterials.Tantalum, 2, GTMaterials.Niobium, 1)
        .buildAndRegister();

    TinSilver = builderISG("tin_silver")
        .ingot().dust()
        .color(0x747670).secondaryColor(0xA2A49D).iconSet(METALLIC)
        .appendFlags(SNDART_FLAGS)
        .components(GTMaterials.Tin, 29, GTMaterials.Silver, 1)
        .buildAndRegister();

    PyroliticCarbon = builderISG("pyrolitic_carbon")
        .ingot().dust().fluid()
        .color(0x3C3C3C).secondaryColor(0x5A5A5A).iconSet(METALLIC)
        .appendFlags(SNDART_FLAGS)
        .components(GTMaterials.Carbon, 1)
        .buildAndRegister();

    ManganeseDioxide = builderISG("manganese_dioxide")
        .ingot().dust()
        .color(0x2E2C35).secondaryColor(0x5B556E).iconSet(METALLIC)
        .appendFlags(SNDART_FLAGS)
        .components(GTMaterials.Manganese, 1, GTMaterials.Oxygen, 2)
        .buildAndRegister();

    ToughAlloy = builderISG("tough_alloy")
        .ingot().dust()
        .color(0x2B1F20).secondaryColor(0x5C4A4C).iconSet(METALLIC)
        .appendFlags(SNDART_FLAGS)
//        .components(Ferroboron, 3, GTMaterials.Lithium, 1)
        .buildAndRegister();

    Ferroboron = builderISG("ferroboron")
        .ingot().dust()
        .color(0x535C76).secondaryColor(0x8190AB).iconSet(METALLIC)
        .appendFlags(SNDART_FLAGS)
        .components(GTMaterials.Boron, 1, GTMaterials.Steel, 1)
        .buildAndRegister();

    SuperAlloy = builderISG("super_alloy")
        .ingot().dust()
        .color(0x2E232F).secondaryColor(0x4B4668).iconSet(METALLIC)
        .appendFlags(SNDART_FLAGS)
        .buildAndRegister();

    Aluminum = builderISG("aluminum")
        .ingot().dust()
        .color(0x8BA296).secondaryColor(0xABEBCB).iconSet(METALLIC)
        .appendFlags(SNDART_FLAGS)
        .buildAndRegister();

    SicSicCmc = builderISG("sic_sic_cmc")
        .ingot().dust()
        .color(0x6A5040).secondaryColor(0xAE8463).iconSet(METALLIC)
        .appendFlags(SNDART_FLAGS)
        .buildAndRegister();

    HardCarbon = builderISG("hard_carbon")
        .ingot().dust().fluid()
        .color(0x1C1C1C).secondaryColor(0x343434).iconSet(METALLIC)
        .appendFlags(SNDART_FLAGS)
        .buildAndRegister();

    LithiumManganeseDioxide = builderISG("lithium_manganese_dioxide")
        .ingot().dust()
        .color(0x2E2C35).secondaryColor(0x5B556E).iconSet(METALLIC)
        .appendFlags(SNDART_FLAGS)
        .buildAndRegister();

    LeadPlatinum = builderISG("lead_platinum")
        .ingot().dust()
        .color(0xC9BEB9).secondaryColor(0xC3C3CA).iconSet(METALLIC)
        .appendFlags(SNDART_FLAGS)
        .buildAndRegister();

    Strontium90 = builderISG("strontium_90")
        .dust()
        .color(0x6A6162).secondaryColor(0xAA9A9D).iconSet(METALLIC)
        .buildAndRegister();

    BoronArsenide = builderISG("boron_arsenide")
        .gem().dust()
        .color(0xFFFFFF).secondaryColor(0xFFFFFF).iconSet(METALLIC)
        .appendFlags(GEM_FLAGS)
        .buildAndRegister();

    Carobbiite = builderISG("carobbiite")
        .gem().dust()
        .color(0xFFFFFF).secondaryColor(0xFFFFFF).iconSet(METALLIC)
        .appendFlags(GEM_FLAGS)
        .buildAndRegister();

    Villiaumite = builderISG("villiaumite")
        .gem().dust()
        .color(0xFFFFFF).secondaryColor(0xFFFFFF).iconSet(METALLIC)
        .appendFlags(GEM_FLAGS)
        .buildAndRegister();

    Fluorite = builderISG("fluorite")
        .gem().dust()
        .color(0xFFFFFF).secondaryColor(0xFFFFFF).iconSet(METALLIC)
        .appendFlags(GEM_FLAGS)
        .buildAndRegister();

    BoronNitride = builderISG("boron_nitride")
        .gem().dust()
        .color(0xFFFFFF).secondaryColor(0xFFFFFF).iconSet(METALLIC)
        .appendFlags(GEM_FLAGS)
        .buildAndRegister();

    Rhodochrosite = builderISG("rhodochrosite")
        .gem().dust()
        .color(0xFFFFFF).secondaryColor(0xFFFFFF).iconSet(METALLIC)
        .appendFlags(GEM_FLAGS)
        .buildAndRegister();

    MarM200Steel = builderISG("mar_m_200_steel")
        .ingot().dust()
        .fluid()
        .blastTemp(4600, HIGH, GTValues.VA[GTValues.IV], 300)
        .components(GTMaterials.Niobium, 2, GTMaterials.Chromium, 9, GTMaterials.Aluminium, 5, GTMaterials.Titanium, 2, GTMaterials.Cobalt, 10,
            GTMaterials.Tungsten, 13, GTMaterials.Nickel, 18)
        .color(0x515151)
        .iconSet(METALLIC)
        .flags(MaterialFlags.GENERATE_GEAR, MaterialFlags.DISABLE_DECOMPOSITION, MaterialFlags.GENERATE_FRAME)
        .buildAndRegister();


  }


}
