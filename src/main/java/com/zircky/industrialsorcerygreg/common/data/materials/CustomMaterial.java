package com.zircky.industrialsorcerygreg.common.data.materials;

import com.gregtechceu.gtceu.api.fluids.FluidBuilder;
import com.gregtechceu.gtceu.api.fluids.FluidState;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;

public class CustomMaterial {
  public static void register() {
    Kaminskycatalyst = builderISG("kaminskycatalyst")
        .dust()
        .color(0x372927)
        .iconSet(DULL)
        .buildAndRegister();

    Philipscatalyst = builderISG("philipscatalyst")
        .dust()
        .color(0xB45D83)
        .iconSet(DULL)
        .buildAndRegister();

    Zieglernattacatalyst = builderISG("zieglernattacatalyst")
        .dust()
        .color(0x8BC34A)
        .iconSet(DULL)
        .buildAndRegister();

    Blackirondust = builderISG("blackirondust")
        .dust()
        .color(0x1c1b1c)
        .iconSet(DULL)
        .buildAndRegister();

    Darksteeldust = builderISG("darksteeldust")
        .dust()
        .color(0x2b2b2b)
        .iconSet(DULL)
        .buildAndRegister();

    Nichromerichblend = builderISG("nichromerichblend")
        .dust()
        .color(0xb7b0d1)
        .iconSet(DULL)
        .buildAndRegister();

    Greensteeldust = builderISG("greensteeldust")
        .dust()
        .color(0x379953)
        .iconSet(SHINY)
        .buildAndRegister();

    Cryolitedust = builderISG("cryolitedust")
        .dust()
        .color(0x658af0)
        .iconSet(DULL)
        .buildAndRegister();

    Energeticblend = builderISG("energeticblend")
        .dust()
        .color(0xbd642a)
        .iconSet(DULL)
        .buildAndRegister();

    Resonantseaborgiumdust = builderISG("resonantseaborgiumdust")
        .dust()
        .color(0x1f6612)
        .iconSet(DULL)
        .buildAndRegister();

    Uraniumconcentrate = builderISG("uraniumconcentrate")
        .dust()
        .color(0x299912)
        .iconSet(DULL)
        .buildAndRegister();

    Uraniumfiltrate = builderISG("uraniumfiltrate")
        .dust()
        .color(0x3d9e29)
        .iconSet(DULL)
        .buildAndRegister();

    Bulatsteeldust = builderISG("bulatsteeldust")
        .dust()
        .color(0x736D62)
        .iconSet(SHINY)
        .buildAndRegister();

    Silversteeldust = builderISG("silversteeldust")
        .dust()
        .color(0x828180)
        .iconSet(SHINY)
        .buildAndRegister();

    Silveralloydust = builderISG("silveralloydust")
        .dust()
        .color(0xD6D3D2)
        .iconSet(SHINY)
        .buildAndRegister();

    Electricalsteeldust = builderISG("electricalsteeldust")
        .dust()
        .color(0x757473)
        .iconSet(DULL)
        .buildAndRegister();

    SuperCooled = builderISG("super_cooled")
        .dust().fluid()
        .color(0x0F5C6E)
        .iconSet(DULL)
        .buildAndRegister();

    Bisphenolbdust = builderISG("bisphenolbdust")
        .dust()
        .color(0x59330D)
        .iconSet(DULL)
        .buildAndRegister();

    Titaniumtetrachloridedust = builderISG("titaniumtetrachloridedust")
        .dust()
        .color(0x701a31)
        .iconSet(SHINY)
        .buildAndRegister();

    Graphiteuraniummixturedust = builderISG("graphiteuraniummixturedust")
        .dust()
        .color(0x2F5407)
        .iconSet(DULL)
        .buildAndRegister();

    Unprocessedborondust = builderISG("unprocessedborondust")
        .dust()
        .color(0x5487FF)
        .iconSet(DULL)
        .buildAndRegister();

    Radioactivesludge = builderISG("radioactivesludge")
        .dust()
        .color(0x704c0a)
        .iconSet(SHINY)
        .buildAndRegister();

    Thoriadust = builderISG("thoriadust")
        .dust()
        .color(0x004B1A)
        .iconSet(DULL)
        .buildAndRegister();

    Sunnariumoxide = builderISG("sunnariumoxide")
        .dust()
        .color(0xB4AD6A)
        .iconSet(DULL)
        .buildAndRegister();

    Sunnariumdioxide = builderISG("sunnariumdioxide")
        .dust()
        .color(0xB4AD6A)
        .iconSet(DULL)
        .buildAndRegister();

    Vanadiumtitaniumconentratedust = builderISG("vanadiumtitaniumconentratedust")
        .dust()
        .color(0x3C3C3C)
        .iconSet(DULL)
        .buildAndRegister();

    Sunaricoreresiduedust = builderISG("sunaricoreresiduedust")
        .dust()
        .color(0xB9B272)
        .iconSet(DULL)
        .buildAndRegister();

    Samaricinfusedresiduedust = builderISG("samaricinfusedresiduedust")
        .dust()
        .color(0xE5E5E4)
        .iconSet(DULL)
        .buildAndRegister();

    Infusedgoldtrioxide = builderISG("infusedgoldtrioxide")
        .dust()
        .color(0xA8801B)
        .iconSet(SHINY)
        .buildAndRegister();

    Plutoniumoxideuraniummixturedust = builderISG("plutoniumoxideuraniummixturedust")
        .dust()
        .color(0xC40424)
        .iconSet(SHINY)
        .buildAndRegister();

    Boronnanoparticles = builderISG("boronnanoparticles")
        .dust()
        .color(0x6593FF)
        .iconSet(SHINY)
        .buildAndRegister();

    Tungsticnaquadah = builderISG("tungsticnaquadah")
        .dust()
        .color(0x1F1F1F)
        .iconSet(DULL)
        .buildAndRegister();

    Endsteelconcentrate = builderISG("endsteelconcentrate")
        .dust()
        .color(0xC9C172)
        .iconSet(DULL)
        .buildAndRegister();

    Protoadamantiumalloycatalystdust = builderISG("protoadamantiumalloycatalystdust")
        .dust()
        .color(0x333AA4)
        .iconSet(DULL)
        .buildAndRegister();

    Circuitcompundmk1 = builderISG("circuitcompundmk1")
        .dust()
        .color(0x0E000B)
        .iconSet(DULL)
        .buildAndRegister();

    Circuitcompundmk2 = builderISG("circuitcompundmk2")
        .dust()
        .color(0x0E000B)
        .iconSet(DULL)
        .buildAndRegister();

    Circuitcompundmk3 = builderISG("circuitcompundmk3")
        .dust()
        .color(0x0E000B)
        .iconSet(DULL)
        .buildAndRegister();

    Silicongradedust = builderISG("silicongradedust")
        .dust()
        .color(0x585858)
        .iconSet(SHINY)
        .buildAndRegister();

    Rawneutroniumdust = builderISG("rawneutroniumdust")
        .dust()
        .color(0xE9F5F5)
        .iconSet(SHINY)
        .buildAndRegister();

    Plutoniumuraniumferitemixturedust = builderISG("plutoniumuraniumferitemixturedust")
        .dust()
        .color(0x8F041C)
        .iconSet(SHINY)
        .buildAndRegister();

    Dehydratedaluminiumcatalyst = builderISG("dehydratedaluminiumcatalyst")
        .dust()
        .color(0x5D87E8)
        .iconSet(DULL)
        .buildAndRegister();

    Aluminiumcatalyst = builderISG("aluminiumcatalyst")
        .dust()
        .color(0x5487FF)
        .iconSet(DULL)
        .buildAndRegister();

    Rdxdust = builderISG("rdxdust")
        .dust()
        .color(0xEEE559)
        .iconSet(SHINY)
        .buildAndRegister();

    Hdxdust = builderISG("hdxdust")
        .dust()
        .color(0xE0D9B8)
        .iconSet(SHINY)
        .buildAndRegister();

    Formaldehydedust = builderISG("formaldehydedust")
        .dust()
        .color(0x88BD3D)
        .iconSet(SHINY)
        .buildAndRegister();

    Hexaminedust = builderISG("hexaminedust")
        .dust()
        .color(0xA1A1A1)
        .iconSet(SHINY)
        .buildAndRegister();

    Dialuminiumtrioxide = builderISG("dialuminiumtrioxide")
        .dust()
        .color(0x0a7080)
        .iconSet(SHINY)
        .buildAndRegister();

    Dialuminiumcobalttetroxidedust = builderISG("dialuminiumcobalttetroxidedust")
        .dust()
        .color(0x0c616e)
        .iconSet(SHINY)
        .buildAndRegister();

    Thoriumleachdust = builderISG("thoriumleachdust")
        .dust()
        .color(0x374a27)
        .iconSet(SHINY)
        .buildAndRegister();

    Enhancedenderiumdust = builderISG("enhancedenderiumdust")
        .dust()
        .color(0x184229)
        .iconSet(DULL)
        .buildAndRegister();

    Compressedmetaldust = builderISG("compressedmetaldust")
        .dust()
        .color(0x1A1A1A)
        .iconSet(DULL)
        .buildAndRegister();

    Bastnasiterarerearthoxidemixturedust = builderISG("bastnasiterarerearthoxidemixturedust")
        .dust()
        .color(0xB97A57)
        .iconSet(DULL)
        .buildAndRegister();

    Fourdiphenylmethanediiscocyanatedust = builderISG("fourdiphenylmethanediiscocyanatedust")
        .dust()
        .color(0xB576B8)
        .iconSet(DULL)
        .buildAndRegister();

    MonaziteSulfate = builderISG("monazite_sulfate")
        .dust()
        .color(0x145922)
        .iconSet(DULL)
        .buildAndRegister();

    ThoriumPhosphateCake = builderISG("thorium_phosphate_cake")
        .dust()
        .color(0x20452a)
        .iconSet(DULL)
        .buildAndRegister();

    ThoriumPhosphateConcentrate = builderISG("thorium_phosphate_concentrate")
        .dust()
        .color(0x223b29)
        .iconSet(DULL)
        .buildAndRegister();

    RareEarthFiltrate = builderISG("rare_earth_filtrate")
        .dust()
        .color(0x3b2d22)
        .iconSet(DULL)
        .buildAndRegister();

    NeutralizedRareEarthFiltrate = builderISG("neutralized_rare_earth_filtrate")
        .dust()
        .color(0x3b2d22)
        .iconSet(DULL)
        .buildAndRegister();

    UraniumFiltrateDust = builderISG("uranium_filtrate_dust")
        .dust()
        .color(0x274d0a)
        .iconSet(DULL)
        .buildAndRegister();

    UraniumConcentrateDust = builderISG("uranium_concentrate_dust")
        .dust()
        .color(0x214703)
        .iconSet(DULL)
        .buildAndRegister();

    Zircalloydust = builderISG("zircalloydust")
        .dust()
        .color(0xB5B5B5)
        .iconSet(SHINY)
        .buildAndRegister();

    Neodymiumrareearthconcentrate = builderISG("neodymiumrareearthconcentrate")
        .dust()
        .color(0x3C3C3C)
        .iconSet(DULL)
        .buildAndRegister();

    Samaricrareearthconcentrate = builderISG("samaricrareearthconcentrate")
        .dust()
        .color(0xB9B272)
        .iconSet(DULL)
        .buildAndRegister();

    Fluorinatedsamariccompound = builderISG("fluorinatedsamariccompound")
        .dust()
        .color(0xB5B5B5)
        .iconSet(SHINY)
        .buildAndRegister();

    Calciumfluoride = builderISG("calciumfluoride")
        .dust()
        .color(0x5f7f87)
        .iconSet(DULL)
        .buildAndRegister();

    Samariumterbiumconcentrate = builderISG("samariumterbiumconcentrate")
        .dust()
        .color(0x82875f)
        .iconSet(DULL)
        .buildAndRegister();

    Samaricresidues = builderISG("samaricresidues")
        .dust()
        .color(0x82875f)
        .iconSet(SHINY)
        .buildAndRegister();

    Bastnasiteoxidecomposite = builderISG("bastnasiteoxidecomposite")
        .dust()
        .color(0x8a643a)
        .iconSet(SHINY)
        .buildAndRegister();

    Dirtdust = builderISG("dirtdust")
        .dust()
        .color(0x79553A)
        .iconSet(DULL)
        .buildAndRegister();

    Hydrogeniodide = builderISG("hydrogeniodide")
        .dust()
        .color(0x3e2f47)
        .iconSet(DULL)
        .buildAndRegister();

    Calcinatedbastnasite = builderISG("calcinatedbastnasite")
        .dust()
        .color(0x473c2f)
        .iconSet(DULL)
        .buildAndRegister();

    Roastedbastnasite = builderISG("roastedbastnasite")
        .dust()
        .color(0x3d2a14)
        .iconSet(SHINY)
        .buildAndRegister();

    Crackingcatalystpreparation = builderISG("crackingcatalystpreparation")
        .dust()
        .color(0x7d7d3c)
        .iconSet(DULL)
        .buildAndRegister();

    Pentaerythritoldust = builderISG("pentaerythritoldust")
        .dust()
        .color(0xd61542)
        .iconSet(DULL)
        .buildAndRegister();

    Oranorhodiumcatalystdust = builderISG("oranorhodiumcatalystdust")
        .dust()
        .color(0x942942)
        .iconSet(SHINY)
        .buildAndRegister();

    Polyurethanecatalystbdust = builderISG("polyurethanecatalystbdust")
        .dust()
        .color(0x946f29)
        .iconSet(DULL)
        .buildAndRegister();

    Polyurethanecatalystadust = builderISG("polyurethanecatalystadust")
        .dust()
        .color(0x946f29)
        .iconSet(SHINY)
        .buildAndRegister();

    Leadmetallicpowder = builderISG("leadmetallicpowder")
        .dust()
        .color(0x75516e)
        .iconSet(DULL)
        .buildAndRegister();

    Binap = builderISG("binap")
        .dust()
        .color(0x8b8c87)
        .iconSet(DULL)
        .buildAndRegister();

    Paraphenylenediamine = builderISG("paraphenylenediamine")
        .dust()
        .color(0x317c87)
        .iconSet(SHINY)
        .buildAndRegister();

    Muddustresidues = builderISG("muddustresidues")
        .dust()
        .color(0x8c878b)
        .iconSet(DULL)
        .buildAndRegister();

    Terephthaloylchloride = builderISG("terephthaloylchloride")
        .dust()
        .color(0x5e240c)
        .iconSet(DULL)
        .buildAndRegister();

    Lapotrondust = builderISG("lapotrondust")
        .dust()
        .color(0x392d75)
        .iconSet(DULL)
        .buildAndRegister();

    Radium202Dust = builderISG("radium_202_dust")
        .dust()
        .color(0x75412d)
        .iconSet(DULL)
        .buildAndRegister();

    RadiumCakeDust = builderISG("radium_cake_dust")
        .dust()
        .color(0x94914a)
        .iconSet(SHINY)
        .buildAndRegister();

    RadiumMetallicPowder = builderISG("radium_metallic_powder")
        .dust()
        .color(0xab7141)
        .iconSet(DULL)
        .buildAndRegister();

    Thorium233Dust = builderISG("thorium_233_dust")
        .dust()
        .color(0x7a4920)
        .iconSet(SHINY)
        .buildAndRegister();

    ThoriumRadioactiveDust = builderISG("thorium_radioactive_dust")
        .dust()
        .color(0x6e3d15)
        .iconSet(DULL)
        .buildAndRegister();

    ThoriumRadioactivePowder = builderISG("thorium_radioactive_powder")
        .dust()
        .color(0x436e15)
        .iconSet(DULL)
        .buildAndRegister();

    ThoriumSalt = builderISG("thorium_salt")
        .dust()
        .color(0x756e09)
        .iconSet(SHINY)
        .buildAndRegister();

    ThoriumMetallicPowder = builderISG("thorium_metallic_powder")
        .dust()
        .color(0x3e7009)
        .iconSet(DULL)
        .buildAndRegister();

    RefinedThoriumSalts = builderISG("refined_thorium_salts")
        .dust()
        .color(0x385717)
        .iconSet(SHINY)
        .buildAndRegister();

    ThoriumResidues = builderISG("thorium_residues")
        .dust()
        .color(0x425e23)
        .iconSet(DULL)
        .buildAndRegister();

    ThoriumCrudeMetal = builderISG("thorium_crude_metal")
        .dust()
        .color(0x3e4d2f)
        .iconSet(DULL)
        .buildAndRegister();

    Lanthanumyttriumdust = builderISG("lanthanumyttriumdust")
        .dust()
        .color(0x2D2D2D)
        .iconSet(DULL)
        .buildAndRegister();

    Lanthanumyttriumcuprite = builderISG("lanthanumyttriumcuprite")
        .dust()
        .color(0x74744A)
        .iconSet(DULL)
        .buildAndRegister();

    Lanthanumdopedyttrium = builderISG("lanthanumdopedyttrium")
        .dust()
        .color(0x9E9D24)
        .iconSet(DULL)
        .buildAndRegister();

    Lanthanum2dopedyttriumbarium = builderISG("lanthanum2dopedyttriumbarium")
        .dust()
        .color(0x092A21)
        .iconSet(DULL)
        .buildAndRegister();

    Enrichedgraphitedust = builderISG("enrichedgraphitedust")
        .dust()
        .color(0xB3B385)
        .iconSet(SHINY)
        .buildAndRegister();

    IrradiatedBorax = builderISG("irradiated_borax")
        .dust()
        .color(0xCCCCCC)
        .iconSet(SHINY)
        .buildAndRegister();

    Rhodium3 = builderISG("rhodium3")
        .dust()
        .color(0x6E2A2B)
        .iconSet(DULL)
        .buildAndRegister();

    Rhodium2a = builderISG("rhodium2a")
        .dust()
        .color(0x949335)
        .iconSet(DULL)
        .buildAndRegister();

    Bariumsludgedustresidue = builderISG("bariumsludgedustresidue")
        .dust()
        .color(0x7E5D4B)
        .iconSet(SHINY)
        .buildAndRegister();

    Yttriumlanthanumceriummixturedust = builderISG("yttriumlanthanumceriummixturedust")
        .dust()
        .color(0x888675)
        .iconSet(SHINY)
        .buildAndRegister();

    Ceriumlanthanumcompound = builderISG("ceriumlanthanumcompound")
        .dust()
        .color(0x514F3F)
        .iconSet(DULL)
        .buildAndRegister();

    Ceriumlanthanumsaturatedcompound = builderISG("ceriumlanthanumsaturatedcompound")
        .dust()
        .color(0xD81B60)
        .iconSet(DULL)
        .buildAndRegister();

    Ceriumlanthanumsaturatedsamaritecompound = builderISG("ceriumlanthanumsaturatedsamaritecompound")
        .dust()
        .color(0x7B1FA2)
        .iconSet(SHINY)
        .buildAndRegister();

    Ceriumlanthanumsaturatedcompounddust = builderISG("ceriumlanthanumsaturatedcompounddust")
        .dust()
        .color(0x7F5D8D)
        .iconSet(SHINY)
        .buildAndRegister();

    Ceriumdopedlanthanumdust = builderISG("ceriumdopedlanthanumdust")
        .dust()
        .color(0x6A1B9A)
        .iconSet(DULL)
        .buildAndRegister();

    Celananoparticle = builderISG("celananoparticle")
        .dust()
        .color(0x290E3A)
        .iconSet(DULL)
        .buildAndRegister();

    Celananocarbides = builderISG("celananocarbides")
        .dust()
        .color(0x261133)
        .iconSet(SHINY)
        .buildAndRegister();

    Yttriumsludgedustresidue = builderISG("yttriumsludgedustresidue")
        .dust()
        .color(0x905529)
        .iconSet(SHINY)
        .buildAndRegister();

    Unprocessedceladust = builderISG("unprocessedceladust")
        .dust()
        .color(0x4A148C)
        .iconSet(DULL)
        .buildAndRegister();

    Ceriumlanthanumdust = builderISG("ceriumlanthanumdust")
        .dust()
        .color(0xFDD835)
        .iconSet(DULL)
        .buildAndRegister();

    Radium202 = builderISG("radium202")
        .dust()
        .color(0xFFCA28)
        .iconSet(SHINY)
        .buildAndRegister();

    Titaniumiodine = builderISG("titaniumiodine")
        .dust()
        .color(0xC4A5D1)
        .iconSet(SHINY)
        .buildAndRegister();

    ReprepRadium202 = builderISG("reprep_radium_202")
        .dust()
        .color(0xD4AF7F)
        .iconSet(SHINY)
        .buildAndRegister();

    Terephtaladehyde = builderISG("terephtaladehyde")
        .dust()
        .color(0xFBC02D)
        .iconSet(DULL)
        .buildAndRegister();

    Sunnariumxenontrioxidedust = builderISG("sunnariumxenontrioxidedust")
        .dust()
        .color(0x977C39)
        .iconSet(DULL)
        .buildAndRegister();

    LiquidWetTailing = builderISG("liquid_wet_tailing")
        .dust()
        .color(0x5D5A5A)
        .iconSet(DULL)
        .buildAndRegister();

    SolidWetTailing = builderISG("solid_wet_tailing")
        .dust()
        .color(0x5D5A5A)
        .iconSet(DULL)
        .buildAndRegister();

    SolidDryTailing = builderISG("solid_dry_tailing")
        .dust()
        .color(0x5D5A5A)
        .iconSet(DULL)
        .buildAndRegister();

    Limestone = builderISG("limestone")
        .dust()
        .color(0xBBB79C)
        .iconSet(DULL)
        .buildAndRegister();

    Sodiumsilicate = builderISG("sodiumsilicate")
        .dust()
        .color(0x8B8D8B)
        .iconSet(SHINY)
        .buildAndRegister();

    WetBedrock = builderISG("wet_bedrock")
        .dust()
        .color(0x121212)
        .iconSet(SHINY)
        .buildAndRegister();

    OilyBedrock = builderISG("oily_bedrock")
        .dust()
        .color(0x1E1C1C)
        .iconSet(SHINY)
        .buildAndRegister();

    FineBedrockDust = builderISG("fine_bedrock_dust")
        .dust()
        .color(0x151515)
        .iconSet(DULL)
        .buildAndRegister();

    Adamantite = builderISG("adamantite")
        .dust()
        .color(0x243D63)
        .iconSet(DULL)
        .buildAndRegister();

    DarmstadtiumCatalyst = builderISG("darmstadtium_catalyst")
        .dust()
        .color(0x202122)
        .iconSet(SHINY)
        .buildAndRegister();

    AdamantiumPentoxide = builderISG("adamantium_pentoxide")
        .dust()
        .color(0x323F52)
        .iconSet(SHINY)
        .buildAndRegister();

    EnrichedNaquadahNitrate = builderISG("enriched_naquadah_nitrate")
        .dust()
        .color(0x1F2021)
        .iconSet(SHINY)
        .buildAndRegister();

    NaquadriaNitrate = builderISG("naquadria_nitrate")
        .dust()
        .color(0x181818)
        .iconSet(SHINY)
        .buildAndRegister();

    TriniumSulfide = builderISG("trinium_sulfide")
        .dust()
        .color(0x7A807A)
        .iconSet(SHINY)
        .buildAndRegister();

    Pxylene = builderISG("pxylene")
        .dust()
        .color(0x252525)
        .iconSet(DULL)
        .buildAndRegister();

    Amococatalyst = builderISG("amococatalyst")
        .dust()
        .color(0xB0583E)
        .iconSet(SHINY)
        .buildAndRegister();

    IsophthalicAcid = builderISG("isophthalic_acid")
        .dust()
        .color(0xB0583E)
        .iconSet(DULL)
        .buildAndRegister();

    TerephthalicAcid = builderISG("terephthalic_acid")
        .dust()
        .color(0xB0583E)
        .iconSet(DULL)
        .buildAndRegister();

    RawAtomicSeperationCatalyst = builderISG("raw_atomic_seperation_catalyst")
        .dust()
        .color(0xBF360C)
        .iconSet(DULL)
        .buildAndRegister();

    SoulariumMetallicPowder = builderISG("soularium_metallic_powder")
        .dust()
        .color(0x665653)
        .iconSet(DULL)
        .buildAndRegister();

    RefinedSoulariumPowder = builderISG("refined_soularium_powder")
        .dust()
        .color(0x665653)
        .iconSet(SHINY)
        .buildAndRegister();

    BronzeBlend = builderISG("bronze_blend")
        .dust()
        .color(0xD56C12)
        .iconSet(DULL)
        .buildAndRegister();

    Enhancedenderiumrefinedmetalresidues = builderISG("enhancedenderiumrefinedmetalresidues")
        .dust()
        .color(0x004D40)
        .iconSet(SHINY)
        .buildAndRegister();

    Hmx = builderISG("hmx")
        .dust()
        .color(0xB3B5B5)
        .iconSet(SHINY)
        .buildAndRegister();

    SodiumIsobutylXanthate = builderISG("sodium_isobutyl_xanthate")
        .dust()
        .color(0x86987A)
        .iconSet(DULL)
        .buildAndRegister();

    Zsmfive = builderISG("zsmfive")
        .dust()
        .color(0x9EAE90)
        .iconSet(DULL)
        .buildAndRegister();

    Cuproquin = builderISG("cuproquin")
        .dust()
        .color(0x667267)
        .iconSet(SHINY)
        .buildAndRegister();

    Quinoline = builderISG("quinoline")
        .dust()
        .color(0x986E4C)
        .iconSet(SHINY)
        .buildAndRegister();

    BcEcoli = builderISG("bc_ecoli")
        .dust()
        .color(0x153462)
        .iconSet(SHINY)
        .buildAndRegister();

    BcRhizobium = builderISG("bc_rhizobium")
        .dust()
        .color(0x82CD47)
        .iconSet(SHINY)
        .buildAndRegister();

    BcNitrosomanos = builderISG("bc_nitrosomanos")
        .dust()
        .color(0x4FA095)
        .iconSet(SHINY)
        .buildAndRegister();

    VrRetrovirus = builderISG("vr_retrovirus")
        .dust()
        .color(0x964B00)
        .iconSet(SHINY)
        .buildAndRegister();

    PrDiatom = builderISG("pr_diatom")
        .dust()
        .color(0x82CD47)
        .iconSet(SHINY)
        .buildAndRegister();

    PrChlorophyte = builderISG("pr_chlorophyte")
        .dust()
        .color(0x82CD47)
        .iconSet(SHINY)
        .buildAndRegister();

    PrEuglena = builderISG("pr_euglena")
        .dust()
        .color(0x82CD47)
        .iconSet(SHINY)
        .buildAndRegister();

    Biphenyltetracarboxylicaciddianhydride = builderISG("biphenyltetracarboxylicaciddianhydride")
        .dust()
        .color(0x1520b3)
        .iconSet(SHINY)
        .buildAndRegister();

    Pyromelliticdianhydride = builderISG("pyromelliticdianhydride")
        .dust()
        .color(0x4d6964)
        .iconSet(DULL)
        .buildAndRegister();

    Cupriavidusnecator = builderISG("cupriavidusnecator")
        .dust()
        .color(0xa69e30)
        .iconSet(SHINY)
        .buildAndRegister();

    CucrmgbaCatalyst = builderISG("cucrmgba_catalyst")
        .dust()
        .color(0x512DA8)
        .iconSet(SHINY)
        .buildAndRegister();

    DefattedSoybeanFlour = builderISG("defatted_soybean_flour")
        .dust()
        .color(0xB2B395)
        .iconSet(DULL)
        .buildAndRegister();

    CrushedSoybean = builderISG("crushed_soybean")
        .dust()
        .color(0xB2B395)
        .iconSet(DULL)
        .buildAndRegister();

    Ceramics = builderISG("ceramics")
        .dust()
        .color(0x3E2D2A)
        .iconSet(DULL)
        .buildAndRegister();

    PapicDigestOfSoybeanMeal = builderISG("papic_digest_of_soybean_meal")
        .dust()
        .color(0xFDD835)
        .iconSet(DULL)
        .buildAndRegister();

    PancreaticDigestOfCasein = builderISG("pancreatic_digest_of_casein")
        .dust()
        .color(0xBFBCAF)
        .iconSet(DULL)
        .buildAndRegister();

    Caesin = builderISG("caesin")
        .dust()
        .color(0xCDDC39)
        .iconSet(DULL)
        .buildAndRegister();

    SolidifiedSterileDefibrinatedSheepBlood = builderISG("solidified_sterile_defibrinated_sheep_blood")
        .dust()
        .color(0x572828)
        .iconSet(DULL)
        .buildAndRegister();

    PhenylethylAlcoholAgar = builderISG("phenylethyl_alcohol_agar")
        .dust()
        .color(0xA37672)
        .iconSet(SHINY)
        .buildAndRegister();

    NeodymiumAlloy = builderISG("neodymium_alloy")
        .dust()
        .color(0x605F5F)
        .iconSet(SHINY)
        .buildAndRegister();

    SupraFertilizer = builderISG("supra_fertilizer")
        .dust()
        .color(0xB3929E)
        .iconSet(SHINY)
        .buildAndRegister();

    GristPowder = builderISG("grist_powder")
        .dust()
        .color(0x886054)
        .iconSet(DULL)
        .buildAndRegister();

    SolidGrain = builderISG("solid_grain")
        .dust()
        .color(0xE6D5AF)
        .iconSet(DULL)
        .buildAndRegister();

    ActivatedCarbon = builderISG("activated_carbon")
        .dust()
        .color(0x272727)
        .iconSet(SHINY)
        .buildAndRegister();

    YeastExtractMannitolMedium = builderISG("yeast_extract_mannitol_medium")
        .dust()
        .color(0x66468C)
        .iconSet(SHINY)
        .buildAndRegister();

    TitaniumSludge = builderISG("titanium_sludge")
        .dust()
        .color(0xC08C9D)
        .iconSet(SHINY)
        .buildAndRegister();

    RefabricatedDraconiumDust = builderISG("refabricated_draconium_dust")
        .dust()
        .color(0x311B92)
        .iconSet(SHINY)
        .buildAndRegister();

    LeachedRefabricatedDraconiumDust = builderISG("leached_refabricated_draconium_dust")
        .dust()
        .color(0x8E24AA)
        .iconSet(DULL)
        .buildAndRegister();

    ManaDust = builderISG("mana_dust")
        .dust()
        .color(0x8C24A7)
        .iconSet(SHINY)
        .buildAndRegister();

    AerotheumDust = builderISG("aerotheum_dust")
        .dust()
        .color(0xFFEB3B)
        .iconSet(SHINY)
        .buildAndRegister();

    PetrotheumDust = builderISG("petrotheum_dust")
        .dust()
        .color(0x383838)
        .iconSet(SHINY)
        .buildAndRegister();

    ResonantClathrate = builderISG("resonant_clathrate")
        .dust()
        .color(0x1B5E20)
        .iconSet(SHINY)
        .buildAndRegister();

    DestabilizedClathrate = builderISG("destabilized_clathrate")
        .dust()
        .color(0xB71C1C)
        .iconSet(SHINY)
        .buildAndRegister();

    EnergizedClathrate = builderISG("energized_clathrate")
        .dust()
        .color(0xFFEB3B)
        .iconSet(SHINY)
        .buildAndRegister();

    SolidMilkResidues = builderISG("solid_milk_residues")
        .dust()
        .color(0xFFEBEE)
        .iconSet(SHINY)
        .buildAndRegister();

    PrecipitateMithrilDust = builderISG("precipitate_mithril_dust")
        .dust()
        .color(0xAED2F2)
        .iconSet(DULL)
        .buildAndRegister();

    RoughenMithrilDust = builderISG("roughen_mithril_dust")
        .dust()
        .color(0xAED2F2)
        .iconSet(DULL)
        .buildAndRegister();

    ExcitedRoughenMithrilDust = builderISG("excited_roughen_mithril_dust")
        .dust()
        .color(0xAED2F2)
        .iconSet(SHINY)
        .buildAndRegister();

    ExcitedMithrilDust = builderISG("excited_mithril_dust")
        .dust()
        .color(0xAED2F2)
        .iconSet(SHINY)
        .buildAndRegister();

    Cobalt60Dust = builderISG("cobalt_60_dust")
        .dust()
        .color(0x091175)
        .iconSet(DULL)
        .buildAndRegister();

    Magnesiumtetrachloride = builderISG("magnesiumtetrachloride")
        .dust()
        .color(0xBA68C8)
        .iconSet(DULL)
        .buildAndRegister();

    WhitePhosporus = builderISG("white_phosporus")
        .dust()
        .color(0xfffbc7)
        .iconSet(SHINY)
        .buildAndRegister();

    PhosphorusPentoxide = builderISG("phosphorus_pentoxide")
        .dust()
        .color(0xBA68C8)
        .iconSet(SHINY)
        .buildAndRegister();

    FloatedAndesite = builderISG("floated_andesite")
        .dust()
        .color(0x787575)
        .iconSet(SHINY)
        .buildAndRegister();

    DigestedAndesite = builderISG("digested_andesite")
        .dust()
        .color(0x787575)
        .iconSet(DULL)
        .buildAndRegister();

    Iriditus = builderISG("iriditus")
        .dust()
        .color(0x00BCD4)
        .iconSet(SHINY)
        .buildAndRegister();

    RoastedDeshite = builderISG("roasted_deshite")
        .dust()
        .color(0x6D6662)
        .iconSet(SHINY)
        .buildAndRegister();

    EvaporatedDeshiteCompound = builderISG("evaporated_deshite_compound")
        .dust()
        .color(0x4B4A4A)
        .iconSet(DULL)
        .buildAndRegister();

    SilverBromide = builderISG("silver_bromide")
        .dust()
        .color(0x4B4A4A)
        .iconSet(DULL)
        .buildAndRegister();

    HafniumPlatinumTitaniumComposite = builderISG("hafnium_platinum_titanium_composite")
        .dust()
        .color(0x4B4A4A)
        .iconSet(DULL)
        .buildAndRegister();

    MuddyMonaziteOreByproducts = builderISG("muddy_monazite_ore_byproducts")
        .dust()
        .color(0x514442)
        .iconSet(SHINY)
        .buildAndRegister();

    HighPurityArsenic = builderISG("high_purity_arsenic")
        .dust()
        .color(0xB0B0B1)
        .iconSet(SHINY)
        .buildAndRegister();

    IndiumChloride = builderISG("indium_chloride")
        .dust()
        .color(0x311B92)
        .iconSet(SHINY)
        .buildAndRegister();

    NickelNitride = builderISG("nickel_nitride")
        .dust()
        .color(0x2F4F4F)
        .iconSet(DULL)
        .buildAndRegister();

    RubyLeach = builderISG("ruby_leach")
        .dust()
        .color(0xF5C9C8)
        .iconSet(SHINY)
        .buildAndRegister();

    VanadiumTrichloride = builderISG("vanadium_trichloride")
        .dust()
        .color(0xFB8C00)
        .iconSet(SHINY)
        .buildAndRegister();

    NanotubeDepositionMix = builderISG("nanotube_deposition_mix")
        .dust()
        .color(0x2F4F4F)
        .iconSet(SHINY)
        .buildAndRegister();

    DopedNanotubeDepositionMix = builderISG("doped_nanotube_deposition_mix")
        .dust()
        .color(0xF5C9C8)
        .iconSet(SHINY)
        .buildAndRegister();

    NanotubeInsulationDepositionMix = builderISG("nanotube_insulation_deposition_mix")
        .dust()
        .color(0xFB8C00)
        .iconSet(SHINY)
        .buildAndRegister();

    DopedCarbonNanotubes = builderISG("doped_carbon_nanotubes")
        .dust()
        .color(0x2F4F4F)
        .iconSet(SHINY)
        .buildAndRegister();

    HslaSteel = builderISG("hsla_steel")
        .dust()
        .color(0xD5D8E8)
        .iconSet(DULL)
        .buildAndRegister();

    HeatedHslaSteel = builderISG("heated_hsla_steel")
        .dust()
        .color(0xECE7BF)
        .iconSet(SHINY)
        .buildAndRegister();

    QuenchedHslaSteel = builderISG("quenched_hsla_steel")
        .dust()
        .color(0xE9E3B7)
        .iconSet(SHINY)
        .buildAndRegister();

    NaquadahWaste = builderISG("naquadah_waste")
        .dust()
        .color(0x301b1b)
        .iconSet(DULL)
        .buildAndRegister();

    ConcentratedNaquatitaniumHydroxide = builderISG("concentrated_naquatitanium_hydroxide")
        .dust()
        .color(0x503a3a)
        .iconSet(SHINY)
        .buildAndRegister();

    ImpureNaquahamericiumHydroxide = builderISG("impure_naquahamericium_hydroxide")
        .dust()
        .color(0x684b4b)
        .iconSet(SHINY)
        .buildAndRegister();

    NaquahamericiumHydroxide = builderISG("naquahamericium_hydroxide")
        .dust()
        .color(0x8f6161)
        .iconSet(SHINY)
        .buildAndRegister();

    ChromiumSlagMud = builderISG("chromium_slag_mud")
        .dust()
        .color(0x874141)
        .iconSet(DULL)
        .buildAndRegister();

    ImpureNaquadahWaste = builderISG("impure_naquadah_waste")
        .dust()
        .color(0x281414)
        .iconSet(DULL)
        .buildAndRegister();

    PlatinumNanopowder = builderISG("platinum_nanopowder")
        .dust()
        .color(0xE0DAC0)
        .iconSet(SHINY)
        .buildAndRegister();

    RutheniumChloride = builderISG("ruthenium_chloride")
        .dust()
        .color(0x71736E)
        .iconSet(SHINY)
        .buildAndRegister();

    PlatinumRutheniumPowder = builderISG("platinum_ruthenium_powder")
        .dust()
        .color(0x616CA5)
        .iconSet(SHINY)
        .buildAndRegister();

    DenseMatter = builderISG("dense_matter")
        .dust()
        .color(0xD9B4E0)
        .iconSet(SHINY)
        .buildAndRegister();

    PureDenseMatter = builderISG("pure_dense_matter")
        .dust()
        .color(0x9DC8E9)
        .iconSet(SHINY)
        .buildAndRegister();

    DenseCarbonOxygenMatter = builderISG("dense_carbon_oxygen_matter")
        .dust()
        .color(0x559ED8)
        .iconSet(SHINY)
        .buildAndRegister();

    DenseExoticMatter = builderISG("dense_exotic_matter")
        .dust()
        .color(0x66BB6A)
        .iconSet(SHINY)
        .buildAndRegister();

    Lafeaso1CatalystPreparation = builderISG("lafeaso1_catalyst_preparation")
        .dust()
        .color(0x987064)
        .iconSet(SHINY)
        .buildAndRegister();

    RaneyNickel = builderISG("raney_nickel")
        .dust()
        .color(0xC7E4F0)
        .iconSet(SHINY)
        .buildAndRegister();

    CarbonDisulfide = builderISG("carbon_disulfide")
        .dust()
        .color(0xC2BE9D)
        .iconSet(DULL)
        .buildAndRegister();

    EnrichedNaquadahChloride = builderISG("enriched_naquadah_chloride")
        .dust()
        .color(0x4C5554)
        .iconSet(DULL)
        .buildAndRegister();

    EnrichedNaquadahOxide = builderISG("enriched_naquadah_oxide")
        .dust()
        .color(0x434847)
        .iconSet(DULL)
        .buildAndRegister();

    ManganeseDiacetate = builderISG("manganese_diacetate")
        .dust()
        .color(0xF8CBDA)
        .iconSet(SHINY)
        .buildAndRegister();

    CompressedDiamondDust = builderISG("compressed_diamond_dust")
        .dust()
        .color(0x72A8D4)
        .iconSet(DULL)
        .buildAndRegister();

    CobaltNitrate = builderISG("cobalt_nitrate")
        .dust()
        .color(0x6d392e)
        .iconSet(DULL)
        .buildAndRegister();

    SodiumCyandiamide = builderISG("sodium_cyandiamide")
        .dust()
        .color(0xfffba6)
        .iconSet(DULL)
        .buildAndRegister();

    IndiumGalliumArsenide = builderISG("indium_gallium_arsenide")
        .dust()
        .color(0x928894)
        .iconSet(DULL)
        .buildAndRegister();

    SiliconNitride = builderISG("silicon_nitride")
        .dust()
        .color(0xE7C8BE)
        .iconSet(DULL)
        .buildAndRegister();

    Amberlyst15 = builderISG("amberlyst_15")
        .dust()
        .color(0x744EA1)
        .iconSet(SHINY)
        .buildAndRegister();

    TrimethylammoniumSalts = builderISG("trimethylammonium_salts")
        .dust()
        .color(0xE0A542)
        .iconSet(SHINY)
        .buildAndRegister();

    CadmiumOxide = builderISG("cadmium_oxide")
        .dust()
        .color(0xff6630)
        .iconSet(DULL)
        .buildAndRegister();

    Borane = builderISG("borane")
        .dust()
        .color(0x78A9A5)
        .iconSet(DULL)
        .buildAndRegister();

    HighPurityAluminium = builderISG("high_purity_aluminium")
        .dust()
        .color(0x7EBFDC)
        .iconSet(SHINY)
        .buildAndRegister();

    HighPurityGallium = builderISG("high_purity_gallium")
        .dust()
        .color(0x6B6B6B)
        .iconSet(SHINY)
        .buildAndRegister();

    HighPurityCadmium = builderISG("high_purity_cadmium")
        .dust()
        .color(0x3D3D3D)
        .iconSet(SHINY)
        .buildAndRegister();

    PotassiumPersulfate = builderISG("potassium_persulfate")
        .dust()
        .color(0x3D3D39)
        .iconSet(DULL)
        .buildAndRegister();

    PotassiumHydrofluoride = builderISG("potassium_hydrofluoride")
        .dust()
        .color(0xcdcdcd)
        .iconSet(DULL)
        .buildAndRegister();

    ManganeseNitride = builderISG("manganese_nitride")
        .dust()
        .color(0xAAB7C4)
        .iconSet(DULL)
        .buildAndRegister();

    SilverFluoride = builderISG("silver_fluoride")
        .dust()
        .color(0xfac8c8)
        .iconSet(SHINY)
        .buildAndRegister();

    NickelBoride = builderISG("nickel_boride")
        .dust()
        .color(0xff9b00)
        .iconSet(DULL)
        .buildAndRegister();

    MagnesiumSilicate = builderISG("magnesium_silicate")
        .dust()
        .color(0xa46681)
        .iconSet(DULL)
        .buildAndRegister();

    CobaltManganeseOxide = builderISG("cobalt_manganese_oxide")
        .dust()
        .color(0x64a47a)
        .iconSet(SHINY)
        .buildAndRegister();

    NiobiumOxide = builderISG("niobium_oxide")
        .dust()
        .color(0xA483AA)
        .iconSet(SHINY)
        .buildAndRegister();

    CadmiumMagnesiumTellurium = builderISG("cadmium_magnesium_tellurium")
        .dust()
        .color(0x529CC3)
        .iconSet(SHINY)
        .buildAndRegister();

    AlkaliCellulose = builderISG("alkali_cellulose")
        .dust()
        .color(0x594846)
        .iconSet(DULL)
        .buildAndRegister();

    SodiumCelluloseXanthate = builderISG("sodium_cellulose_xanthate")
        .dust()
        .color(0x6D4C41)
        .iconSet(DULL)
        .buildAndRegister();

    DensePerovskiteClusters = builderISG("dense_perovskite_clusters")
        .dust()
        .color(0x5f6a6a)
        .iconSet(SHINY)
        .buildAndRegister();

    RegolithMartian = builderISG("regolith_martian")
        .dust()
        .color(0x8b4513)
        .iconSet(DULL)
        .buildAndRegister();

    SulfuricMineral = builderISG("sulfuric_mineral")
        .dust()
        .color(0xa4a417)
        .iconSet(DULL)
        .buildAndRegister();

    CatherdralPyrite = builderISG("catherdral_pyrite")
        .dust()
        .color(0xffd700)
        .iconSet(SHINY)
        .buildAndRegister();

    AmorphousIcePowder = builderISG("amorphous_ice_powder")
        .dust()
        .color(0xd3d3d3)
        .iconSet(SHINY)
        .buildAndRegister();

    SaturnRingFragment = builderISG("saturn_ring_fragment")
        .dust()
        .color(0xd2b48c)
        .iconSet(SHINY)
        .buildAndRegister();

    CarbonRichClayPowder = builderISG("carbon_rich_clay_powder")
        .dust()
        .color(0x333333)
        .iconSet(DULL)
        .buildAndRegister();

    RawBuckfullereneDust = builderISG("raw_buckfullerene_dust")
        .dust()
        .color(0x000000)
        .iconSet(SHINY)
        .buildAndRegister();

    AmorphousGraphite = builderISG("amorphous_graphite")
        .dust()
        .color(0x2f4f4f)
        .iconSet(DULL)
        .buildAndRegister();

    UranusNitriles = builderISG("uranus_nitriles")
        .dust()
        .color(0x4682b4)
        .iconSet(SHINY)
        .buildAndRegister();

    UranusHydrocarbonDust = builderISG("uranus_hydrocarbon_dust")
        .dust()
        .color(0x5dadec)
        .iconSet(DULL)
        .buildAndRegister();

    SuperionicIceCrystal = builderISG("superionic_ice_crystal")
        .dust()
        .color(0xaddbe6)
        .iconSet(SHINY)
        .buildAndRegister();

    SasteroidEnstatiteDiamondDust = builderISG("sasteroid_enstatite_diamond_dust")
        .dust()
        .color(0x8a9a5b)
        .iconSet(SHINY)
        .buildAndRegister();

    PlutoTholinDust = builderISG("pluto_tholin_dust")
        .dust()
        .color(0x804000)
        .iconSet(DULL)
        .buildAndRegister();

    CryotholinCrystalDustPluto = builderISG("cryotholin_crystal_dust_pluto")
        .dust()
        .color(0xffa500)
        .iconSet(DULL)
        .buildAndRegister();

    ImpureSubsurfaceClathrate = builderISG("impure_subsurface_clathrate")
        .dust()
        .color(0xffd700)
        .iconSet(DULL)
        .buildAndRegister();

    TholinIceEris = builderISG("tholin_ice_eris")
        .dust()
        .color(0xa0522d)
        .iconSet(DULL)
        .buildAndRegister();

    DeepCarbonSilicate = builderISG("deep_carbon_silicate")
        .dust()
        .color(0x704214)
        .iconSet(SHINY)
        .buildAndRegister();

    HaumeanQuartzIce = builderISG("haumean_quartz_ice")
        .dust()
        .color(0xf5f5f5)
        .iconSet(SHINY)
        .buildAndRegister();

    HaumeanSilicateIcecrystalDust = builderISG("haumean_silicate_icecrystal_dust")
        .dust()
        .color(0xb0c4de)
        .iconSet(SHINY)
        .buildAndRegister();

    HydrocarbonComplexMm = builderISG("hydrocarbon_complex_mm")
        .dust()
        .color(0xe0ffff)
        .iconSet(DULL)
        .buildAndRegister();

    VolatileIceCrystalDust = builderISG("volatile_ice_crystal_dust")
        .dust()
        .color(0xb0e0e6)
        .iconSet(SHINY)
        .buildAndRegister();

    ScatteredKboDust = builderISG("scattered_kbo_dust")
        .dust()
        .color(0x8a3324)
        .iconSet(DULL)
        .buildAndRegister();

    PtnDust = builderISG("ptn_dust")
        .dust()
        .color(0x7b3f00)
        .iconSet(DULL)
        .buildAndRegister();

    CeresianSubsurfaceAmmoniaDust = builderISG("ceresian_subsurface_ammonia_dust")
        .dust()
        .color(0xa1a8b6)
        .iconSet(SHINY)
        .buildAndRegister();

    AncientInterstellarCoreDust = builderISG("ancient_interstellar_core_dust")
        .dust()
        .color(0x2f4f4f)
        .iconSet(SHINY)
        .buildAndRegister();

    SulfideNodesOc = builderISG("sulfide_nodes_oc")
        .dust()
        .color(0x9c7c5d)
        .iconSet(SHINY)
        .buildAndRegister();

    RegolithLunar = builderISG("regolith_lunar")
        .dust()
        .color(0xddd4af)
        .iconSet(DULL)
        .buildAndRegister();

    ImpureHe3 = builderISG("impure_he3")
        .dust()
        .color(0xa9a9a9)
        .iconSet(SHINY)
        .buildAndRegister();

    MolecularSieve = builderISG("molecular_sieve")
        .dust()
        .color(0x666666)
        .iconSet(SHINY)
        .buildAndRegister();

    OleicAcid = builderISG("oleic_acid")
        .dust()
        .color(0x9fcc9d)
        .iconSet(DULL)
        .buildAndRegister();

    CalcinatedZircon = builderISG("calcinated_zircon")
        .dust()
        .color(0xdb7332)
        .iconSet(SHINY)
        .buildAndRegister();

    ZirconiumSulfate = builderISG("zirconium_sulfate")
        .dust()
        .color(0xF9C085)
        .iconSet(DULL)
        .buildAndRegister();

    TridecylphosphineOxide = builderISG("tridecylphosphine_oxide")
        .fluid()
        .color(0x4BA1E6)
        .iconSet(FLUID)
        .buildAndRegister();

    TridecylphosphineSolution = builderISG("tridecylphosphine_solution")
        .fluid()
        .color(0x5A98CA)
        .iconSet(FLUID)
        .buildAndRegister();

    TridecanoicAcid = builderISG("tridecanoic_acid")
        .fluid()
        .color(0x749FC1)
        .iconSet(FLUID)
        .buildAndRegister();

    Tridecylphosphine = builderISG("tridecylphosphine")
        .fluid()
        .color(0x85A1B8)
        .iconSet(FLUID)
        .buildAndRegister();

    Tridecanol = builderISG("tridecanol")
        .fluid()
        .color(0x505DAB)
        .iconSet(FLUID)
        .buildAndRegister();

    Bromotridecane = builderISG("bromotridecane")
        .fluid()
        .color(0x838BBE)
        .iconSet(FLUID)
        .buildAndRegister();

    Tridecane = builderISG("tridecane")
        .fluid()
        .color(0x9FA5CA)
        .iconSet(FLUID)
        .buildAndRegister();

    TrioctylphosphineOxide = builderISG("trioctylphosphine_oxide")
        .fluid()
        .color(0xB0CBE3)
        .iconSet(FLUID)
        .buildAndRegister();

    TrioctylphosphineSolution = builderISG("trioctylphosphine_solution")
        .fluid()
        .color(0x60A0D3)
        .iconSet(FLUID)
        .buildAndRegister();

    Bromooctane = builderISG("bromooctane")
        .fluid()
        .color(0xD27979)
        .iconSet(FLUID)
        .buildAndRegister();

    ZirkeliteSlurry = builderISG("zirkelite_slurry")
        .fluid()
        .color(0x918593)
        .iconSet(FLUID)
        .buildAndRegister();

    ZirconiumHafniumFluorideSolution = builderISG("zirconium_hafnium_fluoride_solution")
        .fluid()
        .color(0xB8B8B8)
        .iconSet(FLUID)
        .buildAndRegister();

    Oleum = builderISG("oleum")
        .fluid()
        .color(0x7CB342)
        .iconSet(FLUID)
        .buildAndRegister();

    DriedDowex50Suspension = builderISG("dried_dowex_50_suspension")
        .fluid()
        .color(0x8263A8)
        .iconSet(FLUID)
        .buildAndRegister();

    ZirconiumHafniumFluorideExtract = builderISG("zirconium_hafnium_fluoride_extract")
        .fluid()
        .color(0x616C6A)
        .iconSet(FLUID)
        .buildAndRegister();

    HafniumFluorideSolution = builderISG("hafnium_fluoride_solution")
        .fluid()
        .color(0x6F8C88)
        .iconSet(FLUID)
        .buildAndRegister();

    ZirconiumFluorideSolution = builderISG("zirconium_fluoride_solution")
        .fluid()
        .color(0xA6C6C3)
        .iconSet(FLUID)
        .buildAndRegister();

    ZirconiumFluorideExtract = builderISG("zirconium_fluoride_extract")
        .fluid()
        .color(0xA5B9B7)
        .iconSet(FLUID)
        .buildAndRegister();

    HafniumFluorideExtract = builderISG("hafnium_fluoride_extract")
        .fluid()
        .color(0x546A68)
        .iconSet(FLUID)
        .buildAndRegister();

    Dowex50Suspension = builderISG("dowex_50_suspension")
        .fluid()
        .color(0x9C88C4)
        .iconSet(FLUID)
        .buildAndRegister();

    Dowex50Solution = builderISG("dowex_50_solution")
        .fluid()
        .color(0x836CB2)
        .iconSet(FLUID)
        .buildAndRegister();

    Dowex50 = builderISG("dowex_50")
        .fluid()
        .color(0x5D4097)
        .iconSet(FLUID)
        .buildAndRegister();

    HafniumFluoride = builderISG("hafnium_fluoride")
        .fluid()
        .color(0x5D6F6D)
        .iconSet(FLUID)
        .buildAndRegister();

    ZirconiumFluoride = builderISG("zirconium_fluoride")
        .fluid()
        .color(0x829795)
        .iconSet(FLUID)
        .buildAndRegister();

    ZirconiumHafniumExtractionMixture = builderISG("zirconium_hafnium_extraction_mixture")
        .fluid()
        .color(0xFCEA4E)
        .iconSet(FLUID)
        .buildAndRegister();

    Alamine336 = builderISG("alamine_336")
        .fluid()
        .color(0x907EB5)
        .iconSet(FLUID)
        .buildAndRegister();

    Cyanex923 = builderISG("cyanex_923")
        .fluid()
        .color(0x90CBE8)
        .iconSet(FLUID)
        .buildAndRegister();

    PurifiedZirconSlurry = builderISG("purified_zircon_slurry")
        .fluid()
        .color(0xD66F1A)
        .iconSet(FLUID)
        .buildAndRegister();

    PurifiedZrChloride = builderISG("purified_zr_chloride")
        .fluid()
        .color(0xD98C4C)
        .iconSet(FLUID)
        .buildAndRegister();

    ZirconSlurry = builderISG("zircon_slurry")
        .fluid()
        .color(0xE99239)
        .iconSet(FLUID)
        .buildAndRegister();

    SodaAshSolution = builderISG("soda_ash_solution")
        .fluid()
        .color(0x7A8693)
        .iconSet(FLUID)
        .buildAndRegister();

    AklalineSodiumOleateSolution = builderISG("aklaline_sodium_oleate_solution")
        .fluid()
        .color(0x9DC370)
        .iconSet(FLUID)
        .buildAndRegister();

    HafniumSulfateSolution = builderISG("hafnium_sulfate_solution")
        .fluid()
        .color(0x5e5e5e)
        .iconSet(FLUID)
        .buildAndRegister();

    HafniumExtract = builderISG("hafnium_extract")
        .fluid()
        .color(0x292929)
        .iconSet(FLUID)
        .buildAndRegister();

    LightWater = builderISG("light_water")
        .fluid()
        .color(0x5084B8)
        .iconSet(FLUID)
        .buildAndRegister();

    TritiatedWater = builderISG("tritiated_water")
        .fluid()
        .color(0xDE9897)
        .iconSet(FLUID)
        .buildAndRegister();

    SupercriticalUltrapureWaterGrade1 = builderISG("supercritical_ultrapure_water_grade_1")
        .fluid()
        .color(0x98BDE4)
        .iconSet(FLUID)
        .buildAndRegister();

    HighPressureUltrapureWaterGrade1 = builderISG("high_pressure_ultrapure_water_grade_1")
        .fluid()
        .color(0x73A6D8)
        .iconSet(FLUID)
        .buildAndRegister();

    UltrapureWaterGrade8 = builderISG("ultrapure_water_grade_8")
        .fluid()
        .color(0xE5EDF3)
        .iconSet(FLUID)
        .buildAndRegister();

    UltrapureWaterGrade7 = builderISG("ultrapure_water_grade_7")
        .fluid()
        .color(0xD9E7F5)
        .iconSet(FLUID)
        .buildAndRegister();

    UltrapureWaterGrade6 = builderISG("ultrapure_water_grade_6")
        .fluid()
        .color(0xD2E2F3)
        .iconSet(FLUID)
        .buildAndRegister();

    UltrapureWaterGrade5 = builderISG("ultrapure_water_grade_5")
        .fluid()
        .color(0xCEE1F4)
        .iconSet(FLUID)
        .buildAndRegister();

    UltrapureWaterGrade4 = builderISG("ultrapure_water_grade_4")
        .fluid()
        .color(0xC7DCF0)
        .iconSet(FLUID)
        .buildAndRegister();

    UltrapureWaterGrade3 = builderISG("ultrapure_water_grade_3")
        .fluid()
        .color(0xC3DAF1)
        .iconSet(FLUID)
        .buildAndRegister();

    UltrapureWaterGrade2 = builderISG("ultrapure_water_grade_2")
        .fluid()
        .color(0xBBD4EE)
        .iconSet(FLUID)
        .buildAndRegister();

    UltrapureWaterGrade1 = builderISG("ultrapure_water_grade_1")
        .fluid()
        .color(0xB6D1ED)
        .iconSet(FLUID)
        .buildAndRegister();

    DemineralizedWater = builderISG("demineralized_water")
        .fluid()
        .color(0x7AA1C0)
        .iconSet(FLUID)
        .buildAndRegister();

    DeaeratedWater = builderISG("deaerated_water")
        .fluid()
        .color(0x7FABCE)
        .iconSet(FLUID)
        .buildAndRegister();

    SterilizedWater = builderISG("sterilized_water")
        .fluid()
        .color(0x81B5DC)
        .iconSet(FLUID)
        .buildAndRegister();

    UltrapureWater = builderISG("ultrapure_water")
        .fluid()
        .color(0xC3DFF5)
        .iconSet(FLUID)
        .buildAndRegister();

    ManganeseSulfateSolution = builderISG("manganese_sulfate_solution")
        .fluid()
        .color(0xF5CCDA)
        .iconSet(FLUID)
        .buildAndRegister();

    SodiumCelluloseXanthateSolution = builderISG("sodium_cellulose_xanthate_solution")
        .fluid()
        .color(0x79B27C)
        .iconSet(FLUID)
        .buildAndRegister();

    CarbonDisulfideSolution = builderISG("carbon_disulfide_solution")
        .fluid()
        .color(0xBBB692)
        .iconSet(FLUID)
        .buildAndRegister();

    Rayon = builderISG("rayon")
        .fluid()
        .color(0x9BBFBB)
        .iconSet(FLUID)
        .buildAndRegister();

    Pentene = builderISG("pentene")
        .fluid()
        .color(0xF1B29F)
        .iconSet(FLUID)
        .buildAndRegister();

    WetPmmaEmulsion = builderISG("wet_pmma_emulsion")
        .fluid()
        .color(0x0ee3d5)
        .iconSet(FLUID)
        .buildAndRegister();

    DriedPmmaEmulsion = builderISG("dried_pmma_emulsion")
        .fluid()
        .color(0x86BFC7)
        .iconSet(FLUID)
        .buildAndRegister();

    AcetoneCyanohydrin = builderISG("acetone_cyanohydrin")
        .fluid()
        .color(0x73A5D6)
        .iconSet(FLUID)
        .buildAndRegister();

    MethacrylamideSulfate = builderISG("methacrylamide_sulfate")
        .fluid()
        .color(0x374494)
        .iconSet(FLUID)
        .buildAndRegister();

    MethylMethacrylate = builderISG("methyl_methacrylate")
        .fluid()
        .color(0x5AB1BB)
        .iconSet(FLUID)
        .buildAndRegister();

    MethylMethacrylateEmulsion = builderISG("methyl_methacrylate_emulsion")
        .fluid()
        .color(0x2496A5)
        .iconSet(FLUID)
        .buildAndRegister();

    PotassiumAmylXanthate = builderISG("potassium_amyl_xanthate")
        .fluid()
        .color(0xE8D743)
        .iconSet(FLUID)
        .buildAndRegister();

    NaquadahConcentrateSlurry = builderISG("naquadah_concentrate_slurry")
        .fluid()
        .color(0x454444)
        .iconSet(FLUID)
        .buildAndRegister();

    NaquadahOxideSolution = builderISG("naquadah_oxide_solution")
        .fluid()
        .color(0x5A5B5B)
        .iconSet(FLUID)
        .buildAndRegister();

    AcidicNaquadahConcentrate = builderISG("acidic_naquadah_concentrate")
        .fluid()
        .color(0x474F4F)
        .iconSet(FLUID)
        .buildAndRegister();

    NaquadahExtractionMixture = builderISG("naquadah_extraction_mixture")
        .fluid()
        .color(0xAE6EBF)
        .iconSet(FLUID)
        .buildAndRegister();

    NaquadahExtract = builderISG("naquadah_extract")
        .fluid()
        .color(0x3F3E3E)
        .iconSet(FLUID)
        .buildAndRegister();

    NaquadahMotherLiqour = builderISG("naquadah_mother_liqour")
        .fluid()
        .color(0x504E4E)
        .iconSet(FLUID)
        .buildAndRegister();

    ArsenicSolution = builderISG("arsenic_solution")
        .fluid()
        .color(0xD5D0D0)
        .iconSet(FLUID)
        .buildAndRegister();

    Pmma = builderISG("pmma")
        .fluid()
        .color(0xA9C9E4)
        .iconSet(FLUID)
        .buildAndRegister();

    DilutedHydrofluoricAcid = builderISG("diluted_hydrofluoric_acid")
        .fluid()
        .color(0x638CAD)
        .iconSet(FLUID)
        .buildAndRegister();

    DeionizedWater = builderISG("deionized_water")
        .fluid()
        .color(0x1C5480)
        .iconSet(FLUID)
        .buildAndRegister();

    HighPressureWater = builderISG("high_pressure_water")
        .fluid()
        .color(0x5F87AE)
        .iconSet(FLUID)
        .buildAndRegister();

    NiobiumOxideSolution = builderISG("niobium_oxide_solution")
        .fluid()
        .color(0x95729C)
        .iconSet(FLUID)
        .buildAndRegister();

    TantalumOxideSolution = builderISG("tantalum_oxide_solution")
        .fluid()
        .color(0x6C8AA7)
        .iconSet(FLUID)
        .buildAndRegister();

    ArsenicVapor = builderISG("arsenic_vapor")
        .fluid()
        .color(0xDDD9D9)
        .iconSet(FLUID)
        .buildAndRegister();

    ChromicAcid = builderISG("chromic_acid")
        .fluid()
        .color(0xE7C8C8)
        .iconSet(FLUID)
        .buildAndRegister();

    Nitrophenol4 = builderISG("IV-nitrophenol")
        .langValue("4 Nitrophenol")
        .fluid()
        .color(0xC69E9E)
        .iconSet(FLUID)
        .buildAndRegister();

    PbiPreparationMixture = builderISG("pbi_preparation_mixture")
        .fluid()
        .color(0x141515)
        .iconSet(FLUID)
        .buildAndRegister();

    PbiPreparationMixturePrecurser = builderISG("pbi_preparation_mixture_precurser")
        .fluid()
        .color(0x242525)
        .iconSet(FLUID)
        .buildAndRegister();

    NMethylpyrrolidone = builderISG("n-methylpyrrolidone")
        .fluid()
        .color(0x535242)
        .iconSet(FLUID)
        .buildAndRegister();

    Pyrrolidone2 = builderISG("2_pyrrolidone")
        .langValue("2 Pyrrolidone")
        .fluid()
        .color(0x509993)
        .iconSet(FLUID)
        .buildAndRegister();

    Benzimidazole = builderISG("benzimidazole")
        .fluid()
        .color(0x2C2F30)
        .iconSet(FLUID)
        .buildAndRegister();

    FluorinatedIsophthalicAcid = builderISG("fluorinated_isophthalic_acid")
        .fluid()
        .color(0x77A67A)
        .iconSet(FLUID)
        .buildAndRegister();

    FluorinatedBenzimidazoleMixture = builderISG("fluorinated_benzimidazole_mixture")
        .fluid()
        .color(0x3E3F40)
        .iconSet(FLUID)
        .buildAndRegister();

    Trifluorotoluene = builderISG("trifluorotoluene")
        .fluid()
        .color(0x56B05A)
        .iconSet(FLUID)
        .buildAndRegister();

    FluorinatedDiaminodiphenylEther = builderISG("fluorinated_diaminodiphenyl_ether")
        .fluid()
        .color(0x9BBBCC)
        .iconSet(FLUID)
        .buildAndRegister();

    DinitrofluorodiphenylEther44 = builderISG("4-4_dinitrofluorodiphenyl_ether")
        .langValue("4,4-Dinitrofluorodiphenyl Ether")
        .fluid()
        .color(0x80C3E4)
        .iconSet(FLUID)
        .buildAndRegister();

    Tetranitrofluorophenol = builderISG("tetranitrofluorophenol")
        .fluid()
        .color(0xAD5D1C)
        .iconSet(FLUID)
        .buildAndRegister();

    Trinitrofluorophenol = builderISG("trinitrofluorophenol")
        .fluid()
        .color(0xDC8945)
        .iconSet(FLUID)
        .buildAndRegister();

    Nitrofluorophenol4 = builderISG("4-nitrofluorophenol")
        .langValue("4 Nitrofluorophenol")
        .fluid()
        .color(0xEFC098)
        .iconSet(FLUID)
        .buildAndRegister();

    FluorinatedNitrophenolResidue = builderISG("fluorinated_nitrophenol_residue")
        .fluid()
        .color(0xB7B287)
        .iconSet(FLUID)
        .buildAndRegister();

    Dinitrofluorophenol = builderISG("dinitrofluorophenol")
        .fluid()
        .color(0x92B094)
        .iconSet(FLUID)
        .buildAndRegister();

    FluorinatedBenzimidazole = builderISG("fluorinated_benzimidazole")
        .fluid()
        .color(0xBB7292)
        .iconSet(FLUID)
        .buildAndRegister();

    TantaliteSlurry = builderISG("tantalite_slurry")
        .fluid()
        .color(0x965E4D)
        .iconSet(FLUID)
        .buildAndRegister();

    RadonRichAir = builderISG("radon_rich_air")
        .fluid()
        .color(0xB17BBA)
        .iconSet(FLUID)
        .buildAndRegister();

    ChilledRadonRichAir = builderISG("chilled_radon_rich_air")
        .fluid()
        .color(0x9863A2)
        .iconSet(FLUID)
        .buildAndRegister();

    RadonContainingNobleGasses = builderISG("radon_containing_noble_gasses")
        .fluid()
        .color(0x86618C)
        .iconSet(FLUID)
        .buildAndRegister();

    DilutedIronConcentrate = builderISG("diluted_iron_concentrate")
        .fluid()
        .color(0x5A5857)
        .iconSet(FLUID)
        .buildAndRegister();

    DilutedLeachResidue = builderISG("diluted_leach_residue")
        .fluid()
        .color(0x5B463F)
        .iconSet(FLUID)
        .buildAndRegister();

    PlatinumResidueSolution = builderISG("platinum_residue_solution")
        .fluid()
        .color(0x706F61)
        .iconSet(FLUID)
        .buildAndRegister();

    PurifiedOlefin = builderISG("purified_olefin")
        .fluid()
        .color(0xCCABD5)
        .iconSet(FLUID)
        .buildAndRegister();

    Hexene1 = builderISG("1_hexene")
        .fluid()
        .color(0xCCABD5)
        .iconSet(FLUID)
        .buildAndRegister();

    Tetradecanol = builderISG("tetradecanol")
        .fluid()
        .color(0xCCABD5)
        .iconSet(FLUID)
        .buildAndRegister();

    HydrogenatedOlefin = builderISG("hydrogenated_olefin")
        .fluid()
        .color(0xCCABD5)
        .iconSet(FLUID)
        .buildAndRegister();

    SuccinimidylAcetateSolution = builderISG("succinimidyl_acetate_solution")
        .fluid()
        .color(0xCCABD5)
        .iconSet(FLUID)
        .buildAndRegister();

    OlefinDrillingMud = builderISG("olefin_drilling_mud")
        .fluid()
        .color(0xAA4020)
        .iconSet(FLUID)
        .buildAndRegister();

    UsedOlefinDrillingMud = builderISG("used_olefin_drilling_mud")
        .fluid()
        .color(0x8E361B)
        .iconSet(FLUID)
        .buildAndRegister();

    Purified1Decene = builderISG("purified_1_decene")
        .fluid()
        .color(0x9D3331)
        .iconSet(FLUID)
        .buildAndRegister();

    Purified1Dodecene = builderISG("purified_1_dodecene")
        .fluid()
        .color(0x832422)
        .iconSet(FLUID)
        .buildAndRegister();

    Decene1 = builderISG("1_decene")
        .fluid()
        .color(0xAC2D2A)
        .iconSet(FLUID)
        .buildAndRegister();

    Dodecene1 = builderISG("1_dodecene")
        .fluid()
        .color(0x962826)
        .iconSet(FLUID)
        .buildAndRegister();

    OlefinMixture = builderISG("olefin_mixture")
        .fluid()
        .color(0xCE6867)
        .iconSet(FLUID)
        .buildAndRegister();

    BoronTrichloride = builderISG("boron_trichloride")
        .fluid()
        .color(0x88C7C1)
        .iconSet(FLUID)
        .buildAndRegister();

    Dichloroethane = builderISG("dichloroethane")
        .fluid()
        .color(0xA9BBCA)
        .iconSet(FLUID)
        .buildAndRegister();

    DissolvedChalcociteSolution = builderISG("dissolved_chalcocite_solution")
        .fluid()
        .color(0x171312)
        .iconSet(FLUID)
        .buildAndRegister();

    NPropylChloride = builderISG("n_propyl_chloride")
        .fluid()
        .color(0xE7C87A)
        .iconSet(FLUID)
        .buildAndRegister();

    PropeneEmulsion = builderISG("propene_emulsion")
        .fluid()
        .color(0x6D551A)
        .iconSet(FLUID)
        .buildAndRegister();

    PropylBaseLiqour = builderISG("propyl_base_liqour")
        .fluid()
        .color(0xE0C584)
        .iconSet(FLUID)
        .buildAndRegister();

    NpropanolBase = builderISG("npropanol_base")
        .fluid()
        .color(0xFAC33C)
        .iconSet(FLUID)
        .buildAndRegister();

    Dimethylacetamide = builderISG("dimethylacetamide")
        .fluid()
        .color(0x64AC68)
        .iconSet(FLUID)
        .buildAndRegister();

    PbiPolymerizationMix = builderISG("pbi_polymerization_mix")
        .fluid()
        .color(0x588C35)
        .iconSet(FLUID)
        .buildAndRegister();

    PolycyclopenteneSolution = builderISG("polycyclopentene_solution")
        .fluid()
        .color(0x5B7C43)
        .iconSet(FLUID)
        .buildAndRegister();

    PolystyreneSuspension = builderISG("polystyrene_suspension")
        .fluid()
        .color(0x98978D)
        .iconSet(FLUID)
        .buildAndRegister();

    PolyethyleneNaphthalateSolution = builderISG("polyethylene_naphthalate_solution")
        .fluid()
        .color(0xE3DFBE)
        .iconSet(FLUID)
        .buildAndRegister();

    ChromiumTrioxideSolution = builderISG("chromium_trioxide_solution")
        .fluid()
        .color(0xDBC6CD)
        .iconSet(FLUID)
        .buildAndRegister();

    PolypropeleneSuspension = builderISG("polypropelene_suspension")
        .fluid()
        .color(0xCCA362)
        .iconSet(FLUID)
        .buildAndRegister();

    PotassiumPersulfateSolution = builderISG("potassium_persulfate_solution")
        .fluid()
        .color(0x97BCCD)
        .iconSet(FLUID)
        .buildAndRegister();

    RockSaltSolution = builderISG("rock_salt_solution")
        .fluid()
        .color(0xDBC0C0)
        .iconSet(FLUID)
        .buildAndRegister();

    StyreneSuspension = builderISG("styrene_suspension")
        .fluid()
        .color(0x558DC0)
        .iconSet(FLUID)
        .buildAndRegister();

    PolyvinylChlorideSolution = builderISG("polyvinyl_chloride_solution")
        .fluid()
        .color(0xCDDBE7)
        .iconSet(FLUID)
        .buildAndRegister();

    HighPurityCadmiumSolution = builderISG("high_purity_cadmium_solution")
        .fluid()
        .color(0x505458)
        .iconSet(FLUID)
        .buildAndRegister();

    CadmiumRichSolution = builderISG("cadmium_rich_solution")
        .fluid()
        .color(0x323232)
        .iconSet(FLUID)
        .buildAndRegister();

    PolyvinylAcetateSolution = builderISG("polyvinyl_acetate_solution")
        .fluid()
        .color(0xEB9D72)
        .iconSet(FLUID)
        .buildAndRegister();

    TrifluoroethyleneMixture = builderISG("trifluoroethylene_mixture")
        .fluid()
        .color(0x979EA5)
        .iconSet(FLUID)
        .buildAndRegister();

    GraphiticAnodeMixture = builderISG("graphitic_anode_mixture")
        .fluid()
        .color(0x666565)
        .iconSet(FLUID)
        .buildAndRegister();

    CryoliteSolution = builderISG("cryolite_solution")
        .fluid()
        .color(0x6B91B8)
        .iconSet(FLUID)
        .buildAndRegister();

    SublimedGalliumVapour = builderISG("sublimed_gallium_vapour")
        .fluid()
        .color(0xD9DADB)
        .iconSet(FLUID)
        .buildAndRegister();

    AluminiumGalliumArsenide = builderISG("aluminium_gallium_arsenide")
        .fluid()
        .color(0x87A9B9)
        .iconSet(FLUID)
        .buildAndRegister();

    BisTrimethylammoniumEthane = builderISG("bis_trimethylammonium_ethane")
        .fluid()
        .color(0x687E8A)
        .iconSet(FLUID)
        .buildAndRegister();

    ChloromethylMethylEther = builderISG("chloromethyl_methyl_ether")
        .fluid()
        .color(0xA2BBA3)
        .iconSet(FLUID)
        .buildAndRegister();

    TrimethylgalliumMixture = builderISG("trimethylgallium_mixture")
        .fluid()
        .color(0xCCC8C8)
        .iconSet(FLUID)
        .buildAndRegister();

    Triborane = builderISG("triborane")
        .fluid()
        .color(0x7BB2AD)
        .iconSet(FLUID)
        .buildAndRegister();

    Heptaborane = builderISG("heptaborane")
        .fluid()
        .color(0x6DA9A3)
        .iconSet(FLUID)
        .buildAndRegister();

    BoraneMixture = builderISG("borane_mixture")
        .fluid()
        .color(0xC4E6E2)
        .iconSet(FLUID)
        .buildAndRegister();

    HydrogenFluoride = builderISG("hydrogen_fluoride")
        .fluid()
        .color(0xABDAD6)
        .iconSet(FLUID)
        .buildAndRegister();

    FormylFluoride = builderISG("formyl_fluoride")
        .fluid()
        .color(0xECB1B0)
        .iconSet(FLUID)
        .buildAndRegister();

    AluminiumSaltSolution = builderISG("aluminium_salt_solution")
        .fluid()
        .color(0x9BB4D1)
        .iconSet(FLUID)
        .buildAndRegister();

    Vinyltoluene = builderISG("vinyltoluene")
        .fluid()
        .color(0xDFA5BA)
        .iconSet(FLUID)
        .buildAndRegister();

    PMethylstyrene = builderISG("p_methylstyrene")
        .fluid()
        .color(0xE1DBE3)
        .iconSet(FLUID)
        .buildAndRegister();

    AmmoniaSolution = builderISG("ammonia_solution")
        .fluid()
        .color(0x6F879D)
        .iconSet(FLUID)
        .buildAndRegister();

    ChloromethylstyreneMixture = builderISG("chloromethylstyrene_mixture")
        .fluid()
        .color(0x636E70)
        .iconSet(FLUID)
        .buildAndRegister();

    IspBromobenzylbromide = builderISG("isp_bromobenzylbromide")
        .fluid()
        .color(0x95859C)
        .iconSet(FLUID)
        .buildAndRegister();

    Divinylbenzenemixture = builderISG("divinylbenzenemixture")
        .fluid()
        .color(0x9FC0DD)
        .iconSet(FLUID)
        .buildAndRegister();

    Divinylbenzene13 = builderISG("1_3_divinylbenzene")
        .fluid()
        .color(0x9DB3C7)
        .iconSet(FLUID)
        .buildAndRegister();

    NButylBromide = builderISG("n_butyl_bromide")
        .fluid()
        .color(0xB05E5E)
        .iconSet(FLUID)
        .buildAndRegister();

    PotassiumHydrogenCarbonate = builderISG("potassium_hydrogen_carbonate")
        .fluid()
        .color(0x7A868F)
        .iconSet(FLUID)
        .buildAndRegister();

    DimethylamineSolution = builderISG("dimethylamine_solution")
        .fluid()
        .color(0xD78989)
        .iconSet(FLUID)
        .buildAndRegister();

    Chlorodifluoromethane = builderISG("chlorodifluoromethane")
        .fluid()
        .color(0x74597b)
        .iconSet(FLUID)
        .buildAndRegister();

    Trifluoroethylene = builderISG("trifluoroethylene")
        .fluid()
        .color(0xbac8c8)
        .iconSet(FLUID)
        .buildAndRegister();

    TetrafluoroethyleneMixture = builderISG("tetrafluoroethylene_mixture")
        .fluid()
        .color(0x8e9696)
        .iconSet(FLUID)
        .buildAndRegister();

    Nonanol = builderISG("nonanol")
        .fluid()
        .color(0xdbc782)
        .iconSet(FLUID)
        .buildAndRegister();

    PegAlkylphenol = builderISG("peg_alkylphenol")
        .fluid()
        .color(0xb6af94)
        .iconSet(FLUID)
        .buildAndRegister();

    TritonX100 = builderISG("triton_x100")
        .fluid()
        .color(0xe4dfcd)
        .iconSet(FLUID)
        .buildAndRegister();

    PtfePreparationMixture = builderISG("ptfe_preparation_mixture")
        .fluid()
        .color(0x88df97)
        .iconSet(FLUID)
        .buildAndRegister();

    PolyStyreneCoChloromethylstyreneCopolymeris = builderISG("poly_styrene_co_chloromethylstyrene_copolymeris")
        .fluid()
        .color(0x5AB0A8)
        .iconSet(FLUID)
        .buildAndRegister();

    Chloromethylstyrene = builderISG("chloromethylstyrene")
        .fluid()
        .color(0xC9A6D8)
        .iconSet(FLUID)
        .buildAndRegister();

    Divinylbenzene = builderISG("divinylbenzene")
        .fluid()
        .color(0x88A9BD)
        .iconSet(FLUID)
        .buildAndRegister();

    PyromelliticDianhydrideOxydianilin = builderISG("pyromellitic_dianhydride_oxydianilin")
        .fluid()
        .color(0x7E887F)
        .iconSet(FLUID)
        .buildAndRegister();

    IndiumGalliumArsenideSubstrate = builderISG("indium_gallium_arsenide_substrate")
        .fluid()
        .color(0xAC96B1)
        .iconSet(FLUID)
        .buildAndRegister();

    Bcl3Cl2ArEtchant = builderISG("bcl3_cl2_ar_etchant")
        .fluid()
        .color(0x464646)
        .iconSet(FLUID)
        .buildAndRegister();

    Trimethylgallium = builderISG("trimethylgallium")
        .fluid()
        .color(0x464646)
        .iconSet(FLUID)
        .buildAndRegister();

    Diethylzinc = builderISG("diethylzinc")
        .fluid()
        .color(0xFF6600)
        .iconSet(FLUID)
        .buildAndRegister();

    Glycidol = builderISG("glycidol")
        .fluid()
        .color(0xfeffa8)
        .iconSet(FLUID)
        .buildAndRegister();

    GlycidolEther = builderISG("glycidol_ether")
        .fluid()
        .color(0xd0d15b)
        .iconSet(FLUID)
        .buildAndRegister();

    Hexafluoroacetone = builderISG("hexafluoroacetone")
        .fluid()
        .color(0xe8e8e8)
        .iconSet(FLUID)
        .buildAndRegister();

    Toluene = builderISG("toluene")
        .fluid()
        .color(0x9b9b9b)
        .iconSet(FLUID)
        .buildAndRegister();

    GlycidolPreparationMixture = builderISG("glycidol_preparation_mixture")
        .fluid()
        .color(0xb6b69c)
        .iconSet(FLUID)
        .buildAndRegister();

    UnrefinedEpoxyResin = builderISG("unrefined_epoxy_resin")
        .fluid()
        .color(0xb47ac4)
        .iconSet(FLUID)
        .buildAndRegister();

    ResinEnhancer = builderISG("resin_enhancer")
        .fluid()
        .color(0x965959)
        .iconSet(FLUID)
        .buildAndRegister();

    Cyandiamide = builderISG("cyandiamide")
        .fluid()
        .color(0xdbdbdb)
        .iconSet(FLUID)
        .buildAndRegister();

    SulfurHexafluoride = builderISG("sulfur_hexafluoride")
        .fluid()
        .color(0xc4b763)
        .iconSet(FLUID)
        .buildAndRegister();

    Dicyandiamide = builderISG("dicyandiamide")
        .fluid()
        .color(0xdbdbdb)
        .iconSet(FLUID)
        .buildAndRegister();

    SulfurDichloride = builderISG("sulfur_dichloride")
        .fluid()
        .color(0x813232)
        .iconSet(FLUID)
        .buildAndRegister();

    GalliumVapor = builderISG("gallium_vapor")
        .fluid()
        .color(0xEFEBEB)
        .iconSet(FLUID)
        .buildAndRegister();

    ArsineVapor = builderISG("arsine_vapor")
        .fluid()
        .color(0xB0B0B0)
        .iconSet(FLUID)
        .buildAndRegister();

    Arsine = builderISG("arsine")
        .fluid()
        .color(0xA3A2A2)
        .iconSet(FLUID)
        .buildAndRegister();

    TinLeadSolution6040 = builderISG("6040_tin_lead_solution")
        .fluid()
        .color(0xAA9BAD)
        .iconSet(FLUID)
        .buildAndRegister();

    CopperSulfateSolution = builderISG("copper_sulfate_solution")
        .fluid()
        .color(0xE08E3C)
        .iconSet(FLUID)
        .buildAndRegister();

    PolyethyleneNaphthalate = builderISG("polyethylene_naphthalate")
        .fluid()
        .color(0xFCF7E1)
        .iconSet(FLUID)
        .buildAndRegister();

    NaphthaleneDicarboxaldehyde = builderISG("naphthalene_dicarboxaldehyde")
        .fluid()
        .color(0xF6E493)
        .iconSet(FLUID)
        .buildAndRegister();

    DielectricPaste = builderISG("dielectric_paste")
        .fluid()
        .color(0xBAA650)
        .iconSet(FLUID)
        .buildAndRegister();

    Propanal = builderISG("propanal")
        .fluid()
        .color(0xDAC25C)
        .iconSet(FLUID)
        .buildAndRegister();

    PropanalMixture = builderISG("propanal_mixture")
        .fluid()
        .color(0xF0DCA9)
        .iconSet(FLUID)
        .buildAndRegister();

    CarboxylicAcidMixture = builderISG("carboxylic_acid_mixture")
        .fluid()
        .color(0x71B1AA)
        .iconSet(FLUID)
        .buildAndRegister();

    NPropylAlcohol = builderISG("n_propyl_alcohol")
        .fluid()
        .color(0xD7B258)
        .iconSet(FLUID)
        .buildAndRegister();

    Propylamine = builderISG("propylamine")
        .fluid()
        .color(0xFAE7CF)
        .iconSet(FLUID)
        .buildAndRegister();

    N6Aminohexylsebacamide = builderISG("n-6-aminohexylsebacamide")
        .fluid()
        .color(0xD2D2B2)
        .iconSet(FLUID)
        .buildAndRegister();

    HeatedDecanedioicAcid = builderISG("heated_decanedioic_acid")
        .fluid()
        .color(0xD34E4E)
        .iconSet(FLUID)
        .buildAndRegister();

    DihydroxystearicAcid = builderISG("dihydroxystearic_acid")
        .fluid()
        .color(0xD7EBFC)
        .iconSet(FLUID)
        .buildAndRegister();

    DecanedioicAcid = builderISG("decanedioic_acid")
        .fluid()
        .color(0xC44E4E)
        .iconSet(FLUID)
        .buildAndRegister();

    OleicAcidMixture = builderISG("oleic_acid_mixture")
        .fluid()
        .color(0xE8B846)
        .iconSet(FLUID)
        .buildAndRegister();

    GlacialAceticAcid = builderISG("glacial_acetic_acid")
        .fluid()
        .color(0xCECCBA)
        .iconSet(FLUID)
        .buildAndRegister();

    PurifiedOleicAcid = builderISG("purified_oleic_acid")
        .fluid()
        .color(0xD0DFBF)
        .iconSet(FLUID)
        .buildAndRegister();

    PeraceticAcidMixture = builderISG("peracetic_acid_mixture")
        .fluid()
        .color(0xBBA6C9)
        .iconSet(FLUID)
        .buildAndRegister();

    Diethylketone = builderISG("diethylketone")
        .fluid()
        .color(0x80BDDB)
        .iconSet(FLUID)
        .buildAndRegister();

    IIHydroxypropionimidamide = builderISG("2-hydroxypropionimidamide")
        .fluid()
        .color(0x87ACA9)
        .iconSet(FLUID)
        .buildAndRegister();

    OxygenReducedOsmiumSolution = builderISG("oxygen_reduced_osmium_solution")
        .fluid()
        .color(0x3948A6)
        .iconSet(FLUID)
        .buildAndRegister();

    PotassiumEthylXanthateSolution = builderISG("potassium_ethyl_xanthate_solution")
        .fluid()
        .color(0xF5D750)
        .iconSet(FLUID)
        .buildAndRegister();

    PotassiumCarbonateMixture = builderISG("potassium_carbonate_mixture")
        .fluid()
        .color(0xD3C867)
        .iconSet(FLUID)
        .buildAndRegister();

    Decene = builderISG("decene")
        .fluid()
        .color(0x9B9983)
        .iconSet(FLUID)
        .buildAndRegister();

    FumingHydrogen = builderISG("fuming_hydrogen")
        .fluid()
        .color(0xC59773)
        .iconSet(FLUID)
        .buildAndRegister();

    Lafeaso1Mixture = builderISG("lafeaso1_mixture")
        .fluid()
        .color(0x987064)
        .iconSet(FLUID)
        .buildAndRegister();

    NeodymiumSolution = builderISG("neodymium_solution")
        .fluid()
        .color(0x454545)
        .iconSet(FLUID)
        .buildAndRegister();

    Cyclopentene = builderISG("cyclopentene")
        .fluid()
        .color(0x38777D)
        .iconSet(FLUID)
        .buildAndRegister();

    PmdaSolution = builderISG("pmda_solution")
        .fluid()
        .color(0x637867)
        .iconSet(FLUID)
        .buildAndRegister();

    RutheniumPlatinumColloid = builderISG("ruthenium_platinum_colloid")
        .fluid()
        .color(0x616CA5)
        .iconSet(FLUID)
        .buildAndRegister();

    DecrepitatedNeodymium = builderISG("decrepitated_neodymium")
        .fluid()
        .color(0x767676)
        .iconSet(FLUID)
        .buildAndRegister();

    NaquadahRichSterileGrowthMedium = builderISG("naquadah_rich_sterile_growth_medium")
        .fluid()
        .color(0x7D7878)
        .iconSet(FLUID)
        .buildAndRegister();

    LiquidHelium4 = builderISG("liquid_helium_4")
        .fluid()
        .color(0xFBC02D)
        .iconSet(FLUID)
        .buildAndRegister();

    Hotic2coolant = builderISG("hotic2coolant")
        .fluid()
        .color(0xF0CFCF)
        .iconSet(FLUID)
        .buildAndRegister();

    RubySolution = builderISG("ruby_solution")
        .fluid()
        .color(0xEF5350)
        .iconSet(FLUID)
        .buildAndRegister();

    SuperfluidHelium4 = builderISG("superfluid_helium_4")
        .fluid()
        .color(0xFBC02D)
        .iconSet(FLUID)
        .buildAndRegister();

    LiquidEnrichedHelium4 = builderISG("liquid_enriched_helium_4")
        .fluid()
        .color(0xADFF2F)
        .iconSet(FLUID)
        .buildAndRegister();

    VeryHotXenon = builderISG("very_hot_xenon")
        .fluid()
        .color(0x00008B)
        .iconSet(FLUID)
        .buildAndRegister();

    MonaziteOreByproductSlurry = builderISG("monazite_ore_byproduct_slurry")
        .fluid()
        .color(0x67824C)
        .iconSet(FLUID)
        .buildAndRegister();

    ImpureMonaziteOreByproductSlurry = builderISG("impure_monazite_ore_byproduct_slurry")
        .fluid()
        .color(0x7F936B)
        .iconSet(FLUID)
        .buildAndRegister();

    NeodymiumPreExtractEmulsion = builderISG("neodymium_pre_extract_emulsion")
        .fluid()
        .color(0x474746)
        .iconSet(FLUID)
        .buildAndRegister();

    PalmaticAcid = builderISG("palmatic_acid")
        .fluid()
        .color(0xB6D2D5)
        .iconSet(FLUID)
        .buildAndRegister();

    CaprylicAcid = builderISG("caprylic_acid")
        .fluid()
        .color(0xFEF9CC)
        .iconSet(FLUID)
        .buildAndRegister();

    ZieglerAlfolMixture = builderISG("ziegler_alfol_mixture")
        .fluid()
        .color(0xC07259)
        .iconSet(FLUID)
        .buildAndRegister();

    NeodymiumRichMonaziteSolution = builderISG("neodymium_rich_monazite_solution")
        .fluid()
        .color(0x388E3C)
        .iconSet(FLUID)
        .buildAndRegister();

    DilutedNeodymiumRichMonaziteSolution = builderISG("diluted_neodymium_rich_monazite_solution")
        .fluid()
        .color(0x59605A)
        .iconSet(FLUID)
        .buildAndRegister();

    NDecanol = builderISG("n-decanol")
        .fluid()
        .color(0x987F77)
        .iconSet(FLUID)
        .buildAndRegister();

    NTetradecanol = builderISG("n-tetradecanol")
        .fluid()
        .color(0x866E66)
        .iconSet(FLUID)
        .buildAndRegister();

    NDodecanol = builderISG("n-dodecanol")
        .fluid()
        .color(0x7E6D68)
        .iconSet(FLUID)
        .buildAndRegister();

    NHexadecanol = builderISG("n-hexadecanol")
        .fluid()
        .color(0x735E57)
        .iconSet(FLUID)
        .buildAndRegister();

    MethylIsobutylCarbonyl = builderISG("methyl_isobutyl_carbonyl")
        .fluid()
        .color(0x7C9AB2)
        .iconSet(FLUID)
        .buildAndRegister();

    IAmidolEthyl2Alkyl2Imidazoline = builderISG("1_amidol_ethyl_2_alkyl_2_imidazoline")
        .fluid()
        .color(0x705195)
        .iconSet(FLUID)
        .buildAndRegister();

    ArsenicTrichloride = builderISG("arsenic_trichloride")
        .fluid()
        .color(0x631531)
        .iconSet(FLUID)
        .buildAndRegister();

    VanadiumTetrochloride = builderISG("vanadium_tetrochloride")
        .fluid()
        .color(0x6E5DA1)
        .iconSet(FLUID)
        .buildAndRegister();

    Trichloroflerane = builderISG("trichloroflerane")
        .fluid()
        .color(0x6E5DA1)
        .iconSet(FLUID)
        .buildAndRegister();

    ChloronaquadicAcid = builderISG("chloronaquadic_acid")
        .fluid()
        .color(0x32302D)
        .iconSet(FLUID)
        .buildAndRegister();

    VeryHotAquaRegia = builderISG("very_hot_aqua_regia")
        .fluid()
        .color(0xFFA000)
        .iconSet(FLUID)
        .buildAndRegister();

    VeryHotKrypton = builderISG("very_hot_krypton")
        .fluid()
        .color(0x9FAD90)
        .iconSet(FLUID)
        .buildAndRegister();

    PlatinumSolution = builderISG("platinum_solution")
        .fluid()
        .color(0xC7C18E)
        .iconSet(FLUID)
        .buildAndRegister();

    PalladiumExtract = builderISG("palladium_extract")
        .fluid()
        .color(0x3A3B3B)
        .iconSet(FLUID)
        .buildAndRegister();

    PlatinumExtractionMixture = builderISG("platinum_extraction_mixture")
        .fluid()
        .color(0x009688)
        .iconSet(FLUID)
        .buildAndRegister();

    PlatinumExtract = builderISG("platinum_extract")
        .fluid()
        .color(0xDEC587)
        .iconSet(FLUID)
        .buildAndRegister();

    PalladiumMotherLiqour = builderISG("palladium_mother_liqour")
        .fluid()
        .color(0x6B7271)
        .iconSet(FLUID)
        .buildAndRegister();

    DraconiumMotherLiqour = builderISG("draconium_mother_liqour")
        .fluid()
        .color(0x6A1B9A)
        .iconSet(FLUID)
        .buildAndRegister();

    DraconiumExtract = builderISG("draconium_extract")
        .fluid()
        .color(0x6A1B9A)
        .iconSet(FLUID)
        .buildAndRegister();

    DraconiumExtractionMixture = builderISG("draconium_extraction_mixture")
        .fluid()
        .color(0x4527A0)
        .iconSet(FLUID)
        .buildAndRegister();

    VeryHotArgon = builderISG("very_hot_argon")
        .fluid()
        .color(0x746D4C)
        .iconSet(FLUID)
        .buildAndRegister();

    DesulfurizedDeshiteCompound = builderISG("desulfurized_deshite_compound")
        .fluid()
        .color(0x746D4C)
        .iconSet(FLUID)
        .buildAndRegister();

    EthoxylatedNonylphenol = builderISG("ethoxylated_nonylphenol")
        .fluid()
        .color(0x42322E)
        .iconSet(FLUID)
        .buildAndRegister();

    Nonoxynol9Solution = builderISG("nonoxynol-9_solution")
        .fluid()
        .color(0x43A047)
        .iconSet(FLUID)
        .buildAndRegister();

    Nonoxynol9 = builderISG("nonoxynol-9")
        .fluid()
        .color(0x43A047)
        .iconSet(FLUID)
        .buildAndRegister();

    Xerizin = builderISG("xerizin")
        .fluid()
        .color(0x43A047)
        .iconSet(FLUID)
        .buildAndRegister();

    FermentedSuperlubricenttinctureSolution = builderISG("fermented_superlubricenttincture_solution")
        .fluid()
        .color(0xEF6C00)
        .iconSet(FLUID)
        .buildAndRegister();

    FermentedSuperlubricenttincture = builderISG("fermented_superlubricenttincture")
        .fluid()
        .color(0x864109)
        .iconSet(FLUID)
        .buildAndRegister();

    SteamCrackedKerosene = builderISG("steam_cracked_kerosene")
        .fluid()
        .color(0xB89E61)
        .iconSet(FLUID)
        .buildAndRegister();

    HydroCrackedKerosene = builderISG("hydro_cracked_kerosene")
        .fluid()
        .color(0xB89E61)
        .iconSet(FLUID)
        .buildAndRegister();

    Hexane = builderISG("hexane")
        .fluid()
        .color(0xEDE7F6)
        .iconSet(FLUID)
        .buildAndRegister();

    Pentane = builderISG("pentane")
        .fluid()
        .color(0xEDE7F6)
        .iconSet(FLUID)
        .buildAndRegister();

    Propylene = builderISG("propylene")
        .fluid()
        .color(0xC6B58E)
        .iconSet(FLUID)
        .buildAndRegister();

    Trypsin = builderISG("trypsin")
        .fluid()
        .color(0xEDCC3C)
        .iconSet(FLUID)
        .buildAndRegister();

    AlkylatedNonylphenolMixture = builderISG("alkylated_nonylphenol_mixture")
        .fluid()
        .color(0xA87C6E)
        .iconSet(FLUID)
        .buildAndRegister();

    Nonylphenol = builderISG("nonylphenol")
        .fluid()
        .color(0x796E69)
        .iconSet(FLUID)
        .buildAndRegister();

    Nonene = builderISG("nonene")
        .fluid()
        .color(0x634F4B)
        .iconSet(FLUID)
        .buildAndRegister();

    YeemSolution = builderISG("yeem_solution")
        .fluid()
        .color(0x6A1B9A)
        .iconSet(FLUID)
        .buildAndRegister();

    HomogenizedPancreasMixture = builderISG("homogenized_pancreas_mixture")
        .fluid()
        .color(0x004D40)
        .iconSet(FLUID)
        .buildAndRegister();

    FuelOil = builderISG("fuel_oil")
        .fluid()
        .color(0x827717)
        .iconSet(FLUID)
        .buildAndRegister();

    SulfuricOilResidues = builderISG("sulfuric_oil_residues")
        .fluid()
        .color(0x827717)
        .iconSet(FLUID)
        .buildAndRegister();

    SulfuricFuelOil = builderISG("sulfuric_fuel_oil")
        .fluid()
        .color(0xB89E61)
        .iconSet(FLUID)
        .buildAndRegister();

    SulfuricKerosene = builderISG("sulfuric_kerosene")
        .fluid()
        .color(0xB89E61)
        .iconSet(FLUID)
        .buildAndRegister();

    SulfuricGasoline = builderISG("sulfuric_gasoline")
        .fluid()
        .color(0xA8A374)
        .iconSet(FLUID)
        .buildAndRegister();

    SulfuricDiesel = builderISG("sulfuric_diesel")
        .fluid()
        .color(0xA19355)
        .iconSet(FLUID)
        .buildAndRegister();

    AlkylatedNaturalGas = builderISG("alkylated_natural_gas")
        .fluid()
        .color(0xE6BFBD)
        .iconSet(FLUID)
        .buildAndRegister();

    Syngas = builderISG("syngas")
        .fluid()
        .color(0xAFA6C2)
        .iconSet(FLUID)
        .buildAndRegister();

    Trichlorosilane = builderISG("trichlorosilane")
        .fluid()
        .color(0x646464)
        .iconSet(FLUID)
        .buildAndRegister();

    HydrogenChloride = builderISG("hydrogen_chloride")
        .fluid()
        .color(0x43A047)
        .iconSet(FLUID)
        .buildAndRegister();

    IronChlorideSolution = builderISG("iron_chloride_solution")
        .fluid()
        .color(0x848484)
        .iconSet(FLUID)
        .buildAndRegister();

    AndesiteLeachSlurry = builderISG("andesite_leach_slurry")
        .fluid()
        .color(0x4F4F4F)
        .iconSet(FLUID)
        .buildAndRegister();

    AndesiteSlurry = builderISG("andesite_slurry")
        .fluid()
        .color(0x646464)
        .iconSet(FLUID)
        .buildAndRegister();

    MuddyAndesiteSlurry = builderISG("muddy_andesite_slurry")
        .fluid()
        .color(0x5D5D5D)
        .iconSet(FLUID)
        .buildAndRegister();

    PurifiedAndesiteSlurry = builderISG("purified_andesite_slurry")
        .fluid()
        .color(0x2F2F2F)
        .iconSet(FLUID)
        .buildAndRegister();

    VeryHotNitrogen = builderISG("very_hot_nitrogen")
        .fluid()
        .color(0xE6BECC)
        .iconSet(FLUID)
        .buildAndRegister();

    SiliconCarbideVapor = builderISG("silicon_carbide_vapor")
        .fluid()
        .color(0x706866)
        .iconSet(FLUID)
        .buildAndRegister();

    SulfuricAcidSolution = builderISG("sulfuric_acid_solution")
        .fluid()
        .color(0xE64A19)
        .iconSet(FLUID)
        .buildAndRegister();

    Butanone = builderISG("butanone")
        .fluid()
        .color(0x806A62)
        .iconSet(FLUID)
        .buildAndRegister();

    TwoButanol = builderISG("two_butanol")
        .fluid()
        .color(0x6A544C)
        .iconSet(FLUID)
        .buildAndRegister();

    TwoButanolSolution = builderISG("two_butanol_solution")
        .fluid()
        .color(0x6D4C41)
        .iconSet(FLUID)
        .buildAndRegister();

    TwoButene = builderISG("two_butene")
        .fluid()
        .color(0x873F3F)
        .iconSet(FLUID)
        .buildAndRegister();

    Silicontetrachloride = builderISG("silicontetrachloride")
        .fluid()
        .color(0x4A4544)
        .iconSet(FLUID)
        .buildAndRegister();

    GlueyResidues = builderISG("gluey_residues")
        .fluid()
        .color(0xF9A825)
        .iconSet(FLUID)
        .buildAndRegister();

    RefinedGlueMixture = builderISG("refined_glue_mixture")
        .fluid()
        .color(0xFBC02D)
        .iconSet(FLUID)
        .buildAndRegister();

    TreatedWasteWater = builderISG("treated_waste_water")
        .fluid()
        .color(0x9499e0)
        .iconSet(FLUID)
        .buildAndRegister();

    RarestEarthMixture = builderISG("rarest_earth_mixture")
        .fluid()
        .color(0x9C3D1F)
        .iconSet(FLUID)
        .buildAndRegister();

    ReeGroupMud = builderISG("ree_group_mud")
        .fluid()
        .color(0x603D32)
        .iconSet(FLUID)
        .buildAndRegister();

    LanthanumLeachSolution = builderISG("lanthanum_leach_solution")
        .fluid()
        .color(0x9F8E89)
        .iconSet(FLUID)
        .buildAndRegister();

    RarerEarthConcentrate = builderISG("rarer_earth_concentrate")
        .fluid()
        .color(0x5A4A4A)
        .iconSet(FLUID)
        .buildAndRegister();

    AquaRegiaSolution = builderISG("aqua_regia_solution")
        .fluid()
        .color(0xC4602A)
        .iconSet(FLUID)
        .buildAndRegister();

    GadoliniumLeach = builderISG("gadolinium_leach")
        .fluid()
        .color(0xD3C7C1)
        .iconSet(FLUID)
        .buildAndRegister();

    NeodymiumOxideSolution = builderISG("neodymium_oxide_solution")
        .fluid()
        .color(0x586168)
        .iconSet(FLUID)
        .buildAndRegister();

    GadoliniteLeachSolution = builderISG("gadolinite_leach_solution")
        .fluid()
        .color(0xA4A0A0)
        .iconSet(FLUID)
        .buildAndRegister();

    MithrilFluoride = builderISG("mithril_fluoride")
        .fluid()
        .color(0x3f48cc)
        .iconSet(FLUID)
        .buildAndRegister();

    SulfurCarbonMixture = builderISG("sulfur_carbon_mixture")
        .fluid()
        .color(0x686853)
        .iconSet(FLUID)
        .buildAndRegister();

    ParaffinWax = builderISG("paraffin_wax")
        .fluid()
        .color(0x805e4e)
        .iconSet(FLUID)
        .buildAndRegister();

    Silane = builderISG("silane")
        .fluid()
        .color(0x574f57)
        .iconSet(FLUID)
        .buildAndRegister();

    Heatedmilkslurry = builderISG("heatedmilkslurry")
        .fluid()
        .color(0xC3C0C1)
        .iconSet(FLUID)
        .buildAndRegister();

    MilkOil = builderISG("milk_oil")
        .fluid()
        .color(0xC3C0C1)
        .iconSet(FLUID)
        .buildAndRegister();

    HighlyStrainedEthylenePrepolymerFoam = builderISG("highly_strained_ethylene_prepolymer_foam")
        .fluid()
        .color(0xC7C1C2)
        .iconSet(FLUID)
        .buildAndRegister();

    AlphaLinolenicAcid = builderISG("alpha_linolenic_acid")
        .fluid()
        .color(0xFDD835)
        .iconSet(FLUID)
        .buildAndRegister();

    Dilutedmilkslurry = builderISG("dilutedmilkslurry")
        .fluid()
        .color(0xFFEBEE)
        .iconSet(FLUID)
        .buildAndRegister();

    Draconiumsolution = builderISG("draconiumsolution")
        .fluid()
        .color(0xAB47BC)
        .iconSet(FLUID)
        .buildAndRegister();

    Mana = builderISG("mana")
        .fluid()
        .color(0x01579B)
        .iconSet(FLUID)
        .buildAndRegister();

    PurifiedDraconiumSlurry = builderISG("purified_draconium_slurry")
        .fluid()
        .color(0x8E24AA)
        .iconSet(FLUID)
        .buildAndRegister();

    Draconiumimpureslurry = builderISG("draconiumimpureslurry")
        .fluid()
        .color(0x8E24AA)
        .iconSet(FLUID)
        .buildAndRegister();

    Draconiumslurry = builderISG("draconiumslurry")
        .fluid()
        .color(0x311B92)
        .iconSet(FLUID)
        .buildAndRegister();

    LivingMutationMedium = builderISG("living_mutation_medium")
        .fluid()
        .color(0xBBDEFB)
        .iconSet(FLUID)
        .buildAndRegister();

    ColdAir = builderISG("cold_air")
        .fluid()
        .color(0xBBDEFB)
        .iconSet(FLUID)
        .buildAndRegister();

    SupercooledLiquidNitrogen = builderISG("supercooled_liquid_nitrogen")
        .fluid()
        .color(0x4FC3F7)
        .iconSet(FLUID)
        .buildAndRegister();

    UntreatedLiquidOxygen = builderISG("untreated_liquid_oxygen")
        .fluid()
        .color(0x6CA4BE)
        .iconSet(FLUID)
        .buildAndRegister();

    ColdWasteGaseousNitrogen = builderISG("cold_waste_gaseous_nitrogen")
        .fluid()
        .color(0x5C7884)
        .iconSet(FLUID)
        .buildAndRegister();

    ColdGaseousNitrogen = builderISG("cold_gaseous_nitrogen")
        .fluid()
        .color(0x5C7884)
        .iconSet(FLUID)
        .buildAndRegister();

    ArgonRichGas = builderISG("argon_rich_gas")
        .fluid()
        .color(0x6B976D)
        .iconSet(FLUID)
        .buildAndRegister();

    CrudeArgonVapor = builderISG("crude_argon_vapor")
        .fluid()
        .color(0x388E3C)
        .iconSet(FLUID)
        .buildAndRegister();

    SupercooledOxygen = builderISG("supercooled_oxygen")
        .fluid()
        .color(0xE0F7FA)
        .iconSet(FLUID)
        .buildAndRegister();

    LiquidWasteNitrogen = builderISG("liquid_waste_nitrogen")
        .fluid()
        .color(0x29B6F6)
        .iconSet(FLUID)
        .buildAndRegister();

    RareGasRichGaseousNitrogen = builderISG("rare_gas_rich_gaseous_nitrogen")
        .fluid()
        .color(0x7E57C2)
        .iconSet(FLUID)
        .buildAndRegister();

    RareGasMixture = builderISG("rare_gas_mixture")
        .fluid()
        .color(0x8F78B6)
        .iconSet(FLUID)
        .buildAndRegister();

    NitrogenStrippedRareGasMixture = builderISG("nitrogen_stripped_rare_gas_mixture")
        .fluid()
        .color(0x7B1FA2)
        .iconSet(FLUID)
        .buildAndRegister();

    CrudeKrypton = builderISG("crude_krypton")
        .fluid()
        .color(0x81C784)
        .iconSet(FLUID)
        .buildAndRegister();

    CrudeNeon = builderISG("crude_neon")
        .fluid()
        .color(0xF9A825)
        .iconSet(FLUID)
        .buildAndRegister();

    CrudeHelium = builderISG("crude_helium")
        .fluid()
        .color(0xDCE775)
        .iconSet(FLUID)
        .buildAndRegister();

    CrudeXenon = builderISG("crude_xenon")
        .fluid()
        .color(0xD32F2F)
        .iconSet(FLUID)
        .buildAndRegister();

    CrudeArgon = builderISG("crude_argon")
        .fluid()
        .color(0xD32F2F)
        .iconSet(FLUID)
        .buildAndRegister();

    PartiallyLiquidKrypton = builderISG("partially_liquid_krypton")
        .fluid()
        .color(0xAED5B0)
        .iconSet(FLUID)
        .buildAndRegister();

    PartiallyLiquidNeon = builderISG("partially_liquid_neon")
        .fluid()
        .color(0xFBC02D)
        .iconSet(FLUID)
        .buildAndRegister();

    PartiallyLiquidHelium = builderISG("partially_liquid_helium")
        .fluid()
        .color(0xFFEE58)
        .iconSet(FLUID)
        .buildAndRegister();

    PartiallyLiquidXenon = builderISG("partially_liquid_xenon")
        .fluid()
        .color(0x03A9F4)
        .iconSet(FLUID)
        .buildAndRegister();

    PartiallyLiquidArgon = builderISG("partially_liquid_argon")
        .fluid()
        .color(0x66BB6A)
        .iconSet(FLUID)
        .buildAndRegister();

    ColdGaseousOxygen = builderISG("cold_gaseous_oxygen")
        .fluid()
        .color(0xAED2F2)
        .iconSet(FLUID)
        .buildAndRegister();

    LiquidKrypton = builderISG("liquid_krypton")
        .fluid()
        .color(0x0277BD)
        .iconSet(FLUID)
        .buildAndRegister();

    LiquidNeon = builderISG("liquid_neon")
        .fluid()
        .color(0xFF8F00)
        .iconSet(FLUID)
        .buildAndRegister();

    LiquidArgon = builderISG("liquid_argon")
        .fluid()
        .color(0x689F38)
        .iconSet(FLUID)
        .buildAndRegister();

    RedVitriol = builderISG("red_vitriol")
        .fluid()
        .color(0xD32F2F)
        .iconSet(FLUID)
        .buildAndRegister();

    CyanVitriol = builderISG("cyan_vitriol")
        .fluid()
        .color(0x578AB4)
        .iconSet(FLUID)
        .buildAndRegister();

    ClayVitriol = builderISG("clay_vitriol")
        .fluid()
        .color(0x6D8191)
        .iconSet(FLUID)
        .buildAndRegister();

    WhiteVitriol = builderISG("white_vitriol")
        .fluid()
        .color(0xFFFFFF)
        .iconSet(FLUID)
        .buildAndRegister();

    GreenVitriol = builderISG("green_vitriol")
        .fluid()
        .color(0x66BB6A)
        .iconSet(FLUID)
        .buildAndRegister();

    PinkVitriol = builderISG("pink_vitriol")
        .fluid()
        .color(0xF48FB1)
        .iconSet(FLUID)
        .buildAndRegister();

    GrayVitriol = builderISG("gray_vitriol")
        .fluid()
        .color(0x616161)
        .iconSet(FLUID)
        .buildAndRegister();

    PumpkinOil = builderISG("pumpkin_oil")
        .fluid()
        .color(0xAFB42B)
        .iconSet(FLUID)
        .buildAndRegister();

    MelonOil = builderISG("melon_oil")
        .fluid()
        .color(0xDDB8C4)
        .iconSet(FLUID)
        .buildAndRegister();

    ModeratelySteamCrackedMethane = builderISG("moderately_steam_cracked_methane")
        .fluid()
        .color(0xCC4A75)
        .iconSet(FLUID)
        .buildAndRegister();

    SeverelySteamCrackedMethane = builderISG("severely_steam_cracked_methane")
        .fluid()
        .color(0xDF7197)
        .iconSet(FLUID)
        .buildAndRegister();

    LightlySteamCrackedMethane = builderISG("lightly_steam_cracked_methane")
        .fluid()
        .color(0xD4517D)
        .iconSet(FLUID)
        .buildAndRegister();

    BeanSlurry = builderISG("bean_slurry")
        .fluid()
        .color(0xD6C7A3)
        .iconSet(FLUID)
        .buildAndRegister();

    YeastExtractMannitolAgarSolution = builderISG("yeast_extract_mannitol_agar_solution")
        .fluid()
        .color(0x381D59)
        .iconSet(FLUID)
        .buildAndRegister();

    DissolvedYeastExtractMannitolMixture = builderISG("dissolved_yeast_extract_mannitol_mixture")
        .fluid()
        .color(0x0288D1)
        .iconSet(FLUID)
        .buildAndRegister();

    Mannitol = builderISG("mannitol")
        .fluid()
        .color(0x4A148C)
        .iconSet(FLUID)
        .buildAndRegister();

    YeastExtract = builderISG("yeast_extract")
        .fluid()
        .color(0x9D9A7D)
        .iconSet(FLUID)
        .buildAndRegister();

    YeastMixture = builderISG("yeast_mixture")
        .fluid()
        .color(0xB7B5A8)
        .iconSet(FLUID)
        .buildAndRegister();

    NutrientRichSolution = builderISG("nutrient_rich_solution")
        .fluid()
        .color(0x43A047)
        .iconSet(FLUID)
        .buildAndRegister();

    Peptone = builderISG("peptone")
        .fluid()
        .color(0xAFABA3)
        .iconSet(FLUID)
        .buildAndRegister();

    MaltExtract = builderISG("malt_extract")
        .fluid()
        .color(0x796841)
        .iconSet(FLUID)
        .buildAndRegister();

    Wort = builderISG("wort")
        .fluid()
        .color(0x3E2723)
        .iconSet(FLUID)
        .buildAndRegister();

    HotGristSolution = builderISG("hot_grist_solution")
        .fluid()
        .color(0x8D6A5F)
        .iconSet(FLUID)
        .buildAndRegister();

    HotWater = builderISG("hot_water")
        .fluid()
        .color(0x6988AA)
        .iconSet(FLUID)
        .buildAndRegister();

    OrthophosphoricAcidSolution = builderISG("orthophosphoric_acid_solution")
        .fluid()
        .color(0x4a0715)
        .iconSet(FLUID)
        .buildAndRegister();

    DefibrinatedSheepBlood = builderISG("defibrinated_sheep_blood")
        .fluid()
        .color(0x154cb3)
        .iconSet(FLUID)
        .buildAndRegister();

    PhosphoricAnyhidride = builderISG("phosphoric_anyhidride")
        .fluid()
        .color(0x4ecfa2)
        .iconSet(FLUID)
        .buildAndRegister();

    MethyleneDiphosphonicAcid = builderISG("methylene_diphosphonic_acid")
        .fluid()
        .color(0x146348)
        .iconSet(FLUID)
        .buildAndRegister();

    OrthophosphoricAcid = builderISG("orthophosphoric_acid")
        .fluid()
        .color(0xcfc04e)
        .iconSet(FLUID)
        .buildAndRegister();

    EdeticAcid = builderISG("edetic_acid")
        .fluid()
        .color(0xd9d9d9)
        .iconSet(FLUID)
        .buildAndRegister();

    SheepBlood = builderISG("sheep_blood")
        .fluid()
        .color(0x880015)
        .iconSet(FLUID)
        .buildAndRegister();

    SheepBloodCells = builderISG("sheep_blood_cells")
        .fluid()
        .color(0xa3142c)
        .iconSet(FLUID)
        .buildAndRegister();

    PhenylethylAlcoholAgarSolution = builderISG("phenylethyl_alcohol_agar_solution")
        .fluid()
        .color(0x5D3131)
        .iconSet(FLUID)
        .buildAndRegister();

    DissolvedPhenylethylAlcoholAgar = builderISG("dissolved_phenylethyl_alcohol_agar")
        .fluid()
        .color(0xA65353)
        .iconSet(FLUID)
        .buildAndRegister();

    CaseinEnzymicHydrolysate = builderISG("casein_enzymic_hydrolysate")
        .fluid()
        .color(0xD7D3D3)
        .iconSet(FLUID)
        .buildAndRegister();

    UnpreperatedLightNaquadahFuel = builderISG("unpreperated_light_naquadah_fuel")
        .fluid()
        .color(0x1D1C1A)
        .iconSet(FLUID)
        .buildAndRegister();

    UnpreperatedMediumNaquadahFuel = builderISG("unpreperated_medium_naquadah_fuel")
        .fluid()
        .color(0x1F1E1E)
        .iconSet(FLUID)
        .buildAndRegister();

    UnpreperatedLightEnrichedNaquadahFuel = builderISG("unpreperated_light_enriched_naquadah_fuel")
        .fluid()
        .color(0x201F1C)
        .iconSet(FLUID)
        .buildAndRegister();

    UnpreperatedHeavyNaquadahFuel = builderISG("unpreperated_heavy_naquadah_fuel")
        .fluid()
        .color(0x131210)
        .iconSet(FLUID)
        .buildAndRegister();

    UnpreperatedMediumEnrichedNaquadahFuel = builderISG("unpreperated_medium_enriched_naquadah_fuel")
        .fluid()
        .color(0x212120)
        .iconSet(FLUID)
        .buildAndRegister();

    UnpreperatedHeavyEnrichedNaquadahFuel = builderISG("unpreperated_heavy_enriched_naquadah_fuel")
        .fluid()
        .color(0x333333)
        .iconSet(FLUID)
        .buildAndRegister();

    NovolacsPhotoresist = builderISG("novolacs_photoresist")
        .fluid()
        .color(0x997E3D)
        .iconSet(FLUID)
        .buildAndRegister();

    NeutralizedMatter = builderISG("neutralized_matter")
        .plasma()
        .color(0x0277BD)
        .iconSet(FLUID)
        .buildAndRegister();

    SoyBeanOil = builderISG("soy_bean_oil")
        .fluid()
        .color(0xB6B18A)
        .iconSet(FLUID)
        .buildAndRegister();

    SterileDefibrinatedSheepBlood = builderISG("sterile_defibrinated_sheep_blood")
        .fluid()
        .color(0x622424)
        .iconSet(FLUID)
        .buildAndRegister();

    BPhenylethylAlcohol = builderISG("b_phenylethyl_alcohol")
        .fluid()
        .color(0x00695C)
        .iconSet(FLUID)
        .buildAndRegister();

    Nhexadecane = builderISG("nhexadecane")
        .fluid()
        .color(0x3F3F1D)
        .iconSet(FLUID)
        .buildAndRegister();

    Nheptane = builderISG("nheptane")
        .fluid()
        .color(0x383725)
        .iconSet(FLUID)
        .buildAndRegister();

    Noctane = builderISG("noctane")
        .fluid()
        .color(0x6F6E56)
        .iconSet(FLUID)
        .buildAndRegister();

    PhenylethylAlcoholBloodAgar = builderISG("phenylethyl_alcohol_blood_agar")
        .fluid()
        .color(0x9E4545)
        .iconSet(FLUID)
        .buildAndRegister();

    PalmOil = builderISG("palm_oil")
        .fluid()
        .color(0xCEC787)
        .iconSet(FLUID)
        .buildAndRegister();

    YButyrolactone = builderISG("y-butyrolactone")
        .fluid()
        .color(0xAFA6C2)
        .iconSet(FLUID)
        .buildAndRegister();

    Nitroaniline = builderISG("nitroaniline")
        .fluid()
        .color(0x9B4D35)
        .iconSet(FLUID)
        .buildAndRegister();

    ImpureKaptonKSolution = builderISG("impure_kapton_k_solution")
        .fluid()
        .color(0x5D5B49)
        .iconSet(FLUID)
        .buildAndRegister();

    Polyhydroxyalkanoate = builderISG("polyhydroxyalkanoate")
        .fluid()
        .color(0xA55A5A)
        .iconSet(FLUID)
        .buildAndRegister();

    Tripropylamine = builderISG("tripropylamine")
        .fluid()
        .color(0xA55A5A)
        .iconSet(FLUID)
        .buildAndRegister();

    TetraPropylAmmoniumBromide = builderISG("tetra_propyl_ammonium_bromide")
        .fluid()
        .color(0x788B68)
        .iconSet(FLUID)
        .buildAndRegister();

    IsobutylAlcohol = builderISG("isobutyl_alcohol")
        .fluid()
        .color(0xB4BEAC)
        .iconSet(FLUID)
        .buildAndRegister();

    DilutedAceticAcid = builderISG("diluted_acetic_acid")
        .fluid()
        .color(0x7A6D69)
        .iconSet(FLUID)
        .buildAndRegister();

    Tetrabromethane = builderISG("tetrabromethane")
        .fluid()
        .color(0x381F18)
        .iconSet(FLUID)
        .buildAndRegister();

    Mxylene = builderISG("mxylene")
        .fluid()
        .color(0x313130)
        .iconSet(FLUID)
        .buildAndRegister();

    Mpxylene = builderISG("mpxylene")
        .fluid()
        .color(0x191818)
        .iconSet(FLUID)
        .buildAndRegister();

    PurifiedBedrockSlurry = builderISG("purified_bedrock_slurry")
        .fluid()
        .color(0x171716)
        .iconSet(FLUID)
        .buildAndRegister();

    SolderingAdamantane = builderISG("soldering_adamantane")
        .fluid()
        .color(0x26464A)
        .iconSet(FLUID)
        .buildAndRegister();

    AdamantaneLubricant = builderISG("adamantane_lubricant")
        .fluid()
        .color(0xA7A27C)
        .iconSet(FLUID)
        .buildAndRegister();

    Perfluorotributylamine = builderISG("perfluorotributylamine")
        .fluid()
        .color(0x880E4F)
        .iconSet(FLUID)
        .buildAndRegister();

    AdamantaneRichOilSolution = builderISG("adamantane_rich_oil_solution")
        .fluid()
        .color(0x092D41)
        .iconSet(FLUID)
        .buildAndRegister();

    TetraHydroDicyclopentadiene = builderISG("tetra_hydro_dicyclopentadiene")
        .fluid()
        .color(0x515557)
        .iconSet(FLUID)
        .buildAndRegister();

    AlkylatedAdamantanes = builderISG("alkylated_adamantanes")
        .fluid()
        .color(0x114A6A)
        .iconSet(FLUID)
        .buildAndRegister();

    Isooctane = builderISG("isooctane")
        .fluid()
        .color(0x33691E)
        .iconSet(FLUID)
        .buildAndRegister();

    DarmstadtiumHexafluoride = builderISG("darmstadtium_hexafluoride")
        .fluid()
        .color(0x2D2F31)
        .iconSet(FLUID)
        .buildAndRegister();

    FluorodarmstadticAcid = builderISG("fluorodarmstadtic_acid")
        .fluid()
        .color(0x2D2E2F)
        .iconSet(FLUID)
        .buildAndRegister();

    AdamantiumDioxide = builderISG("adamantium_dioxide")
        .fluid(FluidStorageKeys.MOLTEN, FluidState.LIQUID)
        .color(0x132E58)
        .iconSet(FLUID)
        .buildAndRegister();

    GaseousAdamantium = builderISG("gaseous_adamantium")
        .fluid()
        .color(0x4A6083)
        .iconSet(FLUID)
        .buildAndRegister();

    AdamantiumPhosphorusHydrogen = builderISG("adamantium_phosphorus_hydrogen")
        .plasma()
        .color(0x0D47A1)
        .iconSet(FLUID)
        .buildAndRegister();

    TriniumSolution = builderISG("trinium_solution")
        .fluid()
        .color(0xAEAFB1)
        .iconSet(FLUID)
        .buildAndRegister();

    BedrockSlurry = builderISG("bedrock_slurry")
        .fluid()
        .color(0x212321)
        .iconSet(FLUID)
        .buildAndRegister();

    BedrockContaminatedOil = builderISG("bedrock_contaminated_oil")
        .fluid()
        .color(0x6B956E)
        .iconSet(FLUID)
        .buildAndRegister();

    LiquidOzone = builderISG("liquid_ozone")
        .fluid()
        .color(0x2196F3)
        .iconSet(FLUID)
        .buildAndRegister();

    Adamantane = builderISG("adamantane")
        .fluid()
        .color(0x1565C0)
        .iconSet(FLUID)
        .buildAndRegister();

    Furfural = builderISG("furfural")
        .fluid()
        .color(0x3949AB)
        .iconSet(FLUID)
        .buildAndRegister();

    Btex = builderISG("btex")
        .fluid()
        .color(0x605C35)
        .iconSet(FLUID)
        .buildAndRegister();

    Eternity = builderISG("eternity")
        .fluid()
        .color(0x46008b)
        .iconSet(FLUID)
        .buildAndRegister();

    UsedFrothFlotationFluid = builderISG("used_froth_flotation_fluid")
        .fluid()
        .color(0x281D1D)
        .iconSet(FLUID)
        .buildAndRegister();

    Galliteslurry = builderISG("galliteslurry")
        .fluid()
        .color(0x525066)
        .iconSet(FLUID)
        .buildAndRegister();

    Stibniteslurry = builderISG("stibniteslurry")
        .fluid()
        .color(0x282828)
        .iconSet(FLUID)
        .buildAndRegister();

    Sheldoniteslurry = builderISG("sheldoniteslurry")
        .fluid()
        .color(0xB8B890)
        .iconSet(FLUID)
        .buildAndRegister();

    Pyriteslurry = builderISG("pyriteslurry")
        .fluid()
        .color(0x745D1F)
        .iconSet(FLUID)
        .buildAndRegister();

    Cobaltiteslurry = builderISG("cobaltiteslurry")
        .fluid()
        .color(0x3A3AB4)
        .iconSet(FLUID)
        .buildAndRegister();

    Enargiteslurry = builderISG("enargiteslurry")
        .fluid()
        .color(0x919191)
        .iconSet(FLUID)
        .buildAndRegister();

    Bowieiteslurry = builderISG("bowieiteslurry")
        .fluid()
        .color(0x5A5960)
        .iconSet(FLUID)
        .buildAndRegister();

    Tennaniteslurry = builderISG("tennaniteslurry")
        .fluid()
        .color(0x5D5D5D)
        .iconSet(FLUID)
        .buildAndRegister();

    Chalcopyriteslurry = builderISG("chalcopyriteslurry")
        .fluid()
        .color(0x73571D)
        .iconSet(FLUID)
        .buildAndRegister();

    Sylvaniteslurry = builderISG("sylvaniteslurry")
        .fluid()
        .color(0xB2AD9D)
        .iconSet(FLUID)
        .buildAndRegister();

    Stanniteslurry = builderISG("stanniteslurry")
        .fluid()
        .color(0xC0BAA8)
        .iconSet(FLUID)
        .buildAndRegister();

    Arsenopyriteslurry = builderISG("arsenopyriteslurry")
        .fluid()
        .color(0x7B6C47)
        .iconSet(FLUID)
        .buildAndRegister();

    Borniteslurry = builderISG("borniteslurry")
        .fluid()
        .color(0x7D1000)
        .iconSet(FLUID)
        .buildAndRegister();

    Carroliteslurry = builderISG("carroliteslurry")
        .fluid()
        .color(0x807404)
        .iconSet(FLUID)
        .buildAndRegister();

    Aikiniteslurry = builderISG("aikiniteslurry")
        .fluid()
        .color(0xA58442)
        .iconSet(FLUID)
        .buildAndRegister();

    Cinnabarslurry = builderISG("cinnabarslurry")
        .fluid()
        .color(0x740000)
        .iconSet(FLUID)
        .buildAndRegister();

    Molybdeniteslurry = builderISG("molybdeniteslurry")
        .fluid()
        .color(0x0E0E0E)
        .iconSet(FLUID)
        .buildAndRegister();

    Rheniiteslurry = builderISG("rheniiteslurry")
        .fluid()
        .color(0x534536)
        .iconSet(FLUID)
        .buildAndRegister();

    Sphaleriteslurry = builderISG("sphaleriteslurry")
        .fluid()
        .color(0xC6C6C6)
        .iconSet(FLUID)
        .buildAndRegister();

    Solardistilledwater = builderISG("solardistilledwater")
        .fluid()
        .color(0x0277BD)
        .iconSet(FLUID)
        .buildAndRegister();

    Npropanol = builderISG("npropanol")
        .fluid()
        .color(0xad9113)
        .iconSet(FLUID)
        .buildAndRegister();

    Nbutanol = builderISG("nbutanol")
        .fluid()
        .color(0x8ac294)
        .iconSet(FLUID)
        .buildAndRegister();

    FuselOil = builderISG("fusel_oil")
        .fluid()
        .color(0xa62403)
        .iconSet(FLUID)
        .buildAndRegister();

    LubricatingOil = builderISG("lubricating_oil")
        .fluid()
        .color(0x858146)
        .iconSet(FLUID)
        .buildAndRegister();

    Polybenzimidazoleprepolymerfoam = builderISG("polybenzimidazoleprepolymerfoam")
        .fluid()
        .color(0x1b1b1c)
        .iconSet(FLUID)
        .buildAndRegister();

    Triethylaluminium = builderISG("triethylaluminium")
        .fluid()
        .color(0x4d4de3)
        .iconSet(FLUID)
        .buildAndRegister();

    Polybenzimidazolesolution = builderISG("polybenzimidazolesolution")
        .fluid()
        .color(0x1a1a1c)
        .iconSet(FLUID)
        .buildAndRegister();

    Impurepolybenzimidazolesolution = builderISG("impurepolybenzimidazolesolution")
        .fluid()
        .color(0x1a1a1c)
        .iconSet(FLUID)
        .buildAndRegister();

    Polybenzimidazolewaste = builderISG("polybenzimidazolewaste")
        .fluid()
        .color(0x070708)
        .iconSet(FLUID)
        .buildAndRegister();

    EhtanolWaterAzeotrope = builderISG("ehtanol_water_azeotrope")
        .fluid()
        .color(0xD88267)
        .iconSet(FLUID)
        .buildAndRegister();

    GrainSolution = builderISG("grain_solution")
        .fluid()
        .color(0xCDCDC8)
        .iconSet(FLUID)
        .buildAndRegister();

    ImpureEthanol = builderISG("impure_ethanol")
        .fluid()
        .color(0x6F6936)
        .iconSet(FLUID)
        .buildAndRegister();

    DilutedMonaziteSulfate = builderISG("diluted_monazite_sulfate")
        .fluid()
        .color(0x374f36)
        .iconSet(FLUID)
        .buildAndRegister();

    NeutralizedMonazite = builderISG("neutralized_monazite")
        .fluid()
        .color(0x273b26)
        .iconSet(FLUID)
        .buildAndRegister();

    MuddyMonaziteSolution = builderISG("muddy_monazite_solution")
        .fluid()
        .color(0x353626)
        .iconSet(FLUID)
        .buildAndRegister();

    MonaziteSolution = builderISG("monazite_solution")
        .fluid()
        .color(0x192418)
        .iconSet(FLUID)
        .buildAndRegister();

    Ic2distilledWater = builderISG("ic2distilled_water")
        .fluid()
        .color(0x66b8cc)
        .iconSet(FLUID)
        .buildAndRegister();

    Rawradox = builderISG("rawradox")
        .fluid()
        .color(0x8E24AA)
        .iconSet(FLUID)
        .buildAndRegister();

    Lightradox = builderISG("lightradox")
        .fluid()
        .color(0xD0AADB)
        .iconSet(FLUID)
        .buildAndRegister();

    Heavyradox = builderISG("heavyradox")
        .fluid()
        .color(0x633C7A)
        .iconSet(FLUID)
        .buildAndRegister();

    Crackedlightradox = builderISG("crackedlightradox")
        .fluid()
        .color(0xB9A1C7)
        .iconSet(FLUID)
        .buildAndRegister();

    Purifiedradox = builderISG("purifiedradox")
        .fluid()
        .color(0x8E24AA)
        .iconSet(FLUID)
        .buildAndRegister();

    Crackedheavyradox = builderISG("crackedheavyradox")
        .fluid()
        .color(0x6A1B9A)
        .iconSet(FLUID)
        .buildAndRegister();

    Geneticmutagen = builderISG("geneticmutagen")
        .fluid()
        .color(0x448247)
        .iconSet(FLUID)
        .buildAndRegister();

    Xenoxene = builderISG("xenoxene")
        .fluid()
        .color(0x4D4C4C)
        .iconSet(FLUID)
        .buildAndRegister();

    Bastnasiteoxidecompositeliquid = builderISG("bastnasiteoxidecompositeliquid")
        .fluid()
        .color(0x827717)
        .iconSet(FLUID)
        .buildAndRegister();

    Diethylamine = builderISG("diethylamine")
        .fluid()
        .color(0x827717)
        .iconSet(FLUID)
        .buildAndRegister();

    Bastnasiterarerearthconcentrate = builderISG("bastnasiterarerearthconcentrate")
        .fluid()
        .color(0x5A3125)
        .iconSet(FLUID)
        .buildAndRegister();

    Nitrogenatedbastnasiterarerearthoxides = builderISG("nitrogenatedbastnasiterarerearthoxides")
        .fluid()
        .color(0x471E11)
        .iconSet(FLUID)
        .buildAndRegister();

    Ceriumcontainingbastnasiteconcentrate = builderISG("ceriumcontainingbastnasiteconcentrate")
        .fluid()
        .color(0x3C1F17)
        .iconSet(FLUID)
        .buildAndRegister();

    Bastnasiterarerearthoxidemixture = builderISG("bastnasiterarerearthoxidemixture")
        .fluid()
        .color(0x4C190A)
        .iconSet(FLUID)
        .buildAndRegister();

    Acidicbastnasiteconcentrate = builderISG("acidicbastnasiteconcentrate")
        .fluid()
        .color(0x7B280D)
        .iconSet(FLUID)
        .buildAndRegister();

    Bastnasiterarerearthoxidesemulsion = builderISG("bastnasiterarerearthoxidesemulsion")
        .fluid()
        .color(0x302624)
        .iconSet(FLUID)
        .buildAndRegister();

    Bastnasiterarerearthoxidessolution = builderISG("bastnasiterarerearthoxidessolution")
        .fluid()
        .color(0x1E1817)
        .iconSet(FLUID)
        .buildAndRegister();

    Ethanolgasoline = builderISG("ethanolgasoline")
        .fluid()
        .color(0xE65100)
        .iconSet(FLUID)
        .buildAndRegister();

    Impureferrocenemixture = builderISG("impureferrocenemixture")
        .fluid()
        .color(0x8E24AA)
        .iconSet(FLUID)
        .buildAndRegister();

    Ether = builderISG("ether")
        .fluid()
        .color(0xE65100)
        .iconSet(FLUID)
        .buildAndRegister();

    Ferrocenesolution = builderISG("ferrocenesolution")
        .fluid()
        .color(0xB0BEC5)
        .iconSet(FLUID)
        .buildAndRegister();

    Roastedbastnasiteconcentrate = builderISG("roastedbastnasiteconcentrate")
        .fluid()
        .color(0x652F1E)
        .iconSet(FLUID)
        .buildAndRegister();

    Jetfuel = builderISG("jetfuel")
        .fluid()
        .color(0x429D46)
        .iconSet(FLUID)
        .buildAndRegister();

    Combustionpromoter = builderISG("combustionpromoter")
        .fluid()
        .color(0x4CAF50)
        .iconSet(FLUID)
        .buildAndRegister();

    Muddybastnasitesolution = builderISG("muddybastnasitesolution")
        .fluid()
        .color(0x842508)
        .iconSet(FLUID)
        .buildAndRegister();

    Conditionedbastnasitemud = builderISG("conditionedbastnasitemud")
        .fluid()
        .color(0x544340)
        .iconSet(FLUID)
        .buildAndRegister();

    Dilutedbastnasitemud = builderISG("dilutedbastnasitemud")
        .fluid()
        .color(0x708692)
        .iconSet(FLUID)
        .buildAndRegister();

    Filteredbsatnasitemud = builderISG("filteredbsatnasitemud")
        .fluid()
        .color(0xBFA782)
        .iconSet(FLUID)
        .buildAndRegister();

    Wetbastnasiterareearthconcentrate = builderISG("wetbastnasiterareearthconcentrate")
        .fluid()
        .color(0x6F6B4E)
        .iconSet(FLUID)
        .buildAndRegister();

    Bastnasiteconcentrate = builderISG("bastnasiteconcentrate")
        .fluid()
        .color(0x76624F)
        .iconSet(FLUID)
        .buildAndRegister();

    Wastewater = builderISG("wastewater")
        .fluid()
        .color(0x004D40)
        .iconSet(FLUID)
        .buildAndRegister();

    Treatedsulfuricfractions = builderISG("treatedsulfuricfractions")
        .fluid()
        .color(0x121010)
        .iconSet(FLUID)
        .buildAndRegister();

    Richamine = builderISG("richamine")
        .fluid()
        .color(0x121010)
        .iconSet(FLUID)
        .buildAndRegister();

    Fractionatedoil = builderISG("fractionatedoil")
        .fluid()
        .color(0x181816)
        .iconSet(FLUID)
        .buildAndRegister();

    Tar = builderISG("tar")
        .fluid()
        .color(0x222121)
        .iconSet(FLUID)
        .buildAndRegister();

    Oilgas = builderISG("oilgas")
        .fluid()
        .color(0x121010)
        .iconSet(FLUID)
        .buildAndRegister();

    Vacuumflashedtar = builderISG("vacuumflashedtar")
        .fluid()
        .color(0x121010)
        .iconSet(FLUID)
        .buildAndRegister();

    Heavyoilresidues = builderISG("heavyoilresidues")
        .fluid()
        .color(0x181816)
        .iconSet(FLUID)
        .buildAndRegister();

    Desaltedoil = builderISG("desaltedoil")
        .fluid()
        .color(0x2C2C2C)
        .iconSet(FLUID)
        .buildAndRegister();

    Dilutedoil = builderISG("dilutedoil")
        .fluid()
        .color(0x141414)
        .iconSet(FLUID)
        .buildAndRegister();

    Hexanoldehyde = builderISG("hexanoldehyde")
        .fluid()
        .color(0xB71C1C)
        .iconSet(FLUID)
        .buildAndRegister();

    Isohexanoldehyde = builderISG("isohexanoldehyde")
        .fluid()
        .color(0xB71C1C)
        .iconSet(FLUID)
        .buildAndRegister();

    Sterilebiomedium = builderISG("sterilebiomedium")
        .fluid()
        .color(0x1B5E20)
        .iconSet(FLUID)
        .buildAndRegister();

    Siliconoil = builderISG("siliconoil")
        .fluid()
        .color(0xD4D4D4)
        .iconSet(FLUID)
        .buildAndRegister();

    Pentanol = builderISG("pentanol")
        .fluid()
        .color(0xEF9A9A)
        .iconSet(FLUID)
        .buildAndRegister();

    Pentoldehyde = builderISG("pentoldehyde")
        .fluid()
        .color(0xEF9A9A)
        .iconSet(FLUID)
        .buildAndRegister();

    Isopentoldehyde = builderISG("isopentoldehyde")
        .fluid()
        .color(0xEF9A9A)
        .iconSet(FLUID)
        .buildAndRegister();

    Diphenylmethanediiscocyanatemixture = builderISG("diphenylmethanediiscocyanatemixture")
        .fluid()
        .color(0xDFC9E2)
        .iconSet(FLUID)
        .buildAndRegister();

    Diaminodiphenylmethanemixture = builderISG("diaminodiphenylmethanemixture")
        .fluid()
        .color(0xE1BEE7)
        .iconSet(FLUID)
        .buildAndRegister();

    PolyurethaneResin = builderISG("polyurethane_resin")
        .fluid()
        .color(0xC3B640)
        .iconSet(FLUID)
        .buildAndRegister();

    PropionicAcid = builderISG("propionic_acid")
        .fluid()
        .color(0xE0E0E0)
        .iconSet(FLUID)
        .buildAndRegister();

    NickelTetracarbonyl = builderISG("nickel_tetracarbonyl")
        .fluid()
        .color(0xB7D7F0)
        .iconSet(FLUID)
        .buildAndRegister();

    Vinegar = builderISG("vinegar")
        .fluid()
        .color(0xc3c4b3)
        .iconSet(FLUID)
        .buildAndRegister();

    Hexanol = builderISG("hexanol")
        .fluid()
        .color(0xc3c4b3)
        .iconSet(FLUID)
        .buildAndRegister();

    Pvtchs = builderISG("pvtchs")
        .fluid()
        .color(0xC1D111)
        .iconSet(FLUID)
        .buildAndRegister();

    HighlyComplicatedCosmicRubber = builderISG("highly_complicated_cosmic_rubber")
        .fluid()
        .color(0x6C706E)
        .iconSet(FLUID)
        .buildAndRegister();

    PrimalQuarkDegenerateMatter = builderISG("primal_quark_degenerate_matter")
        .plasma()
        .color(0xA39090)
        .iconSet(FLUID)
        .buildAndRegister();

    Compressediron = builderISG("compressediron")
        .fluid(FluidStorageKeys.MOLTEN, FluidState.LIQUID)
        .color(0x363636)
        .iconSet(FLUID)
        .buildAndRegister();

    Modularium = builderISG("modularium")
        .fluid(FluidStorageKeys.MOLTEN, FluidState.LIQUID)
        .color(0xFFFFFF)
        .iconSet(FLUID)
        .buildAndRegister();

    Resonantseaborgium = builderISG("resonantseaborgium")
        .fluid(FluidStorageKeys.MOLTEN, FluidState.LIQUID)
        .color(0x54D66B)
        .iconSet(FLUID)
        .buildAndRegister();

    Cryogeniccoolant = builderISG("cryogeniccoolant")
        .fluid()
        .color(0xBDECFC)
        .iconSet(FLUID)
        .buildAndRegister();

    Plutoniumbasedliquidfuel = builderISG("plutoniumbasedliquidfuel")
        .fluid()
        .color(0xEB1010)
        .iconSet(FLUID)
        .buildAndRegister();

    Plutoniumbasedliquidfuele = builderISG("plutoniumbasedliquidfuele")
        .fluid()
        .color(0xC41010)
        .iconSet(FLUID)
        .buildAndRegister();

    Unprocessedboronsolution = builderISG("unprocessedboronsolution")
        .fluid()
        .color(0x739993)
        .iconSet(FLUID)
        .buildAndRegister();

    Borontrioxide = builderISG("borontrioxide")
        .fluid()
        .color(0x64695D)
        .iconSet(FLUID)
        .buildAndRegister();

    Liquidboronnanoparticles = builderISG("liquidboronnanoparticles")
        .fluid()
        .color(0x739993)
        .iconSet(FLUID)
        .buildAndRegister();

    Uraniumbasedliquidfuel = builderISG("uraniumbasedliquidfuel")
        .fluid()
        .color(0x034314)
        .iconSet(FLUID)
        .buildAndRegister();

    Uraniumbasedliquidfuele = builderISG("uraniumbasedliquidfuele")
        .fluid()
        .color(0x034b16)
        .iconSet(FLUID)
        .buildAndRegister();

    Rawsterilizedbiocatalystmedium = builderISG("rawsterilizedbiocatalystmedium")
        .fluid()
        .color(0x2E871A)
        .iconSet(FLUID)
        .buildAndRegister();

    Sterilizedbiocatalystmedium = builderISG("sterilizedbiocatalystmedium")
        .fluid()
        .color(0x237A10)
        .iconSet(FLUID)
        .buildAndRegister();

    Naqudahasphalt = builderISG("naqudahasphalt")
        .fluid()
        .color(0x137009)
        .iconSet(FLUID)
        .buildAndRegister();

    Moderatelycrackednaquadahasphalt = builderISG("moderatelycrackednaquadahasphalt")
        .fluid()
        .color(0x227033)
        .iconSet(FLUID)
        .buildAndRegister();

    Acidnaquadahemulsion = builderISG("acidnaquadahemulsion")
        .fluid()
        .color(0x444A45)
        .iconSet(FLUID)
        .buildAndRegister();

    Naquadahemulsion = builderISG("naquadahemulsion")
        .fluid()
        .color(0x2C2E2C)
        .iconSet(FLUID)
        .buildAndRegister();

    Protoadamantiumplatedalloy = builderISG("protoadamantiumplatedalloy")
        .fluid(FluidStorageKeys.MOLTEN, FluidState.LIQUID)
        .color(0x252b7a)
        .iconSet(FLUID)
        .buildAndRegister();

    Protoadamantiumalloycatalyst = builderISG("protoadamantiumalloycatalyst")
        .fluid()
        .color(0x2c3393)
        .iconSet(FLUID)
        .buildAndRegister();

    Refinedglue = builderISG("refinedglue")
        .fluid()
        .color(0xA9AD21)
        .iconSet(FLUID)
        .buildAndRegister();

    Naquadahactivationliquid = builderISG("naquadahactivationliquid")
        .fluid()
        .color(0x2b1303)
        .iconSet(FLUID)
        .buildAndRegister();

    Infnite = builderISG("infnite")
        .fluid(FluidStorageKeys.MOLTEN, FluidState.LIQUID)
        .color(0x6099C4)
        .iconSet(FLUID)
        .buildAndRegister();

    Zeliusactivationfluid = builderISG("zeliusactivationfluid")
        .fluid()
        .color(0xF5F2D6)
        .iconSet(FLUID)
        .buildAndRegister();

    Rawneutronium = builderISG("rawneutronium")
        .fluid(FluidStorageKeys.MOLTEN, FluidState.LIQUID)
        .color(0x734ca4)
        .iconSet(FLUID)
        .buildAndRegister();

    Hyperreactiveliquid = builderISG("hyperreactiveliquid")
        .fluid()
        .color(0x773693)
        .iconSet(FLUID)
        .buildAndRegister();

    Lanthanumfullerenenanotubes = builderISG("lanthanumfullerenenanotubes")
        .fluid(FluidStorageKeys.MOLTEN, FluidState.LIQUID)
        .color(0x6099C4)
        .iconSet(FLUID)
        .buildAndRegister();

    Actiniumsuperhydride = builderISG("actiniumsuperhydride")
        .fluid(FluidStorageKeys.MOLTEN, FluidState.LIQUID)
        .color(0x8c273f)
        .iconSet(FLUID)
        .buildAndRegister();

    Rheniumhassiumthalliumisophtaloylbisdiethylthiourea = builderISG("rheniumhassiumthalliumisophtaloylbisdiethylthiourea")
        .fluid(FluidStorageKeys.MOLTEN, FluidState.LIQUID)
        .color(0x85428a)
        .iconSet(FLUID)
        .buildAndRegister();

    Chargedcesiumceriumcobaltindium = builderISG("chargedcesiumceriumcobaltindium")
        .fluid(FluidStorageKeys.MOLTEN, FluidState.LIQUID)
        .color(0x296b0a)
        .iconSet(FLUID)
        .buildAndRegister();

    Fullerenesuperconductor = builderISG("fullerenesuperconductor")
        .fluid(FluidStorageKeys.MOLTEN, FluidState.LIQUID)
        .color(0x74eb1a)
        .iconSet(FLUID)
        .buildAndRegister();

    Creatium = builderISG("creatium")
        .fluid()
        .color(0x7B1FA2)
        .iconSet(FLUID)
        .buildAndRegister();

    Thoriumleach = builderISG("thoriumleach")
        .fluid()
        .color(0xB1CADD)
        .iconSet(FLUID)
        .buildAndRegister();

    Activatedthoriumsolution = builderISG("activatedthoriumsolution")
        .fluid()
        .color(0x004D40)
        .iconSet(FLUID)
        .buildAndRegister();

    Tetraethylene = builderISG("tetraethylene")
        .fluid()
        .color(0x4a4a4a)
        .iconSet(FLUID)
        .buildAndRegister();

    Lumin = builderISG("lumin")
        .fluid()
        .color(0xbab709)
        .iconSet(FLUID)
        .buildAndRegister();

    Bisphenolb = builderISG("bisphenolb")
        .fluid()
        .color(0x6B5802)
        .iconSet(FLUID)
        .buildAndRegister();

    Blackfluid = builderISG("blackfluid")
        .fluid()
        .color(0x090909)
        .iconSet(FLUID)
        .buildAndRegister();

    Ferrocenewaste = builderISG("ferrocenewaste")
        .fluid()
        .color(0x827717)
        .iconSet(FLUID)
        .buildAndRegister();

    Hundretbutanol = builderISG("hundretbutanol")
        .fluid()
        .color(0x827722)
        .iconSet(FLUID)
        .buildAndRegister();

    Hundretmethanol = builderISG("hundretmethanol")
        .fluid()
        .color(0x827722)
        .iconSet(FLUID)
        .buildAndRegister();

    Enhancedenderium = builderISG("enhancedenderium")
        .fluid(FluidStorageKeys.MOLTEN, FluidState.LIQUID)
        .color(0x113817)
        .iconSet(FLUID)
        .buildAndRegister();

    Awakenedcompressedmetal = builderISG("awakenedcompressedmetal")
        .fluid(FluidStorageKeys.MOLTEN, FluidState.LIQUID)
        .color(0xab4b1b)
        .iconSet(FLUID)
        .buildAndRegister();

    Explosivehydrazine = builderISG("explosivehydrazine")
        .fluid()
        .color(0x827722)
        .iconSet(FLUID)
        .buildAndRegister();

    Livingsolder = builderISG("livingsolder")
        .fluid()
        .color(0x886C62)
        .iconSet(FLUID)
        .buildAndRegister();

    Mutatedlivingsolder = builderISG("mutatedlivingsolder")
        .fluid()
        .color(0x694653)
        .iconSet(FLUID)
        .buildAndRegister();

    Liquidrawneutronium = builderISG("liquidrawneutronium")
        .fluid()
        .color(0xF5F2D6)
        .iconSet(FLUID)
        .buildAndRegister();

    Photopolymer = builderISG("photopolymer")
        .fluid()
        .color(0x4CAF50)
        .iconSet(FLUID)
        .buildAndRegister();

    Pcbb = builderISG("pcbb")
        .fluid()
        .color(0x9C27B0)
        .iconSet(FLUID)
        .buildAndRegister();

    Fluorohydrideammoniumcarbamat = builderISG("fluorohydrideammoniumcarbamat")
        .fluid()
        .color(0x2E7D32)
        .iconSet(FLUID)
        .buildAndRegister();

    Lanthanumyttriumsolution = builderISG("lanthanumyttriumsolution")
        .fluid()
        .color(0x615263)
        .iconSet(FLUID)
        .buildAndRegister();

    Lanthanumceriumacidicsolution = builderISG("lanthanumceriumacidicsolution")
        .fluid()
        .color(0xA1887F)
        .iconSet(FLUID)
        .buildAndRegister();

    Ceriumlanthanumsaturatedcompoundsolution = builderISG("ceriumlanthanumsaturatedcompoundsolution")
        .fluid()
        .color(0xFFE0B2)
        .iconSet(FLUID)
        .buildAndRegister();

    Ceriumdopedlanthanum = builderISG("ceriumdopedlanthanum")
        .fluid(FluidStorageKeys.MOLTEN, FluidState.LIQUID)
        .color(0xF3EDBF)
        .iconSet(FLUID)
        .buildAndRegister();

    Unprocessedcelasolution = builderISG("unprocessedcelasolution")
        .fluid()
        .color(0xD9DF95)
        .iconSet(FLUID)
        .buildAndRegister();

    Celananoparticles = builderISG("celananoparticles")
        .fluid(FluidStorageKeys.MOLTEN, FluidState.LIQUID)
        .color(0x9C27B0)
        .iconSet(FLUID)
        .buildAndRegister();

    Ceriumlanthanum = builderISG("ceriumlanthanum")
        .fluid(FluidStorageKeys.MOLTEN, FluidState.LIQUID)
        .color(0xD9DF95)
        .iconSet(FLUID)
        .buildAndRegister();

    Lanthanumceriumsolution = builderISG("lanthanumceriumsolution")
        .fluid()
        .color(0xE2E7B3)
        .iconSet(FLUID)
        .buildAndRegister();

    Usedphotopolymersolution = builderISG("usedphotopolymersolution")
        .fluid()
        .color(0xCE93D8)
        .iconSet(FLUID)
        .buildAndRegister();

    Extradistilledwater = builderISG("extradistilledwater")
        .fluid()
        .color(0xBBDEFB)
        .iconSet(FLUID)
        .buildAndRegister();

    Quaternaryammonium = builderISG("quaternaryammonium")
        .fluid()
        .color(0xCFD8DC)
        .iconSet(FLUID)
        .buildAndRegister();

    Dissolvingfluid = builderISG("dissolvingfluid")
        .fluid()
        .color(0xCFD8DC)
        .iconSet(FLUID)
        .buildAndRegister();

    Aluminosilicatewoolsolution = builderISG("aluminosilicatewoolsolution")
        .fluid()
        .color(0x8A8A8A)
        .iconSet(FLUID)
        .buildAndRegister();

    RadioactiveSludge = builderISG("radioactive_sludge")
        .fluid()
        .color(0x495B49)
        .iconSet(FLUID)
        .buildAndRegister();

    LowThoriumSolution = builderISG("low_thorium_solution")
        .fluid()
        .color(0x0C220C)
        .iconSet(FLUID)
        .buildAndRegister();

    ThoriumEmulsion = builderISG("thorium_emulsion")
        .fluid()
        .color(0x885B49)
        .iconSet(FLUID)
        .buildAndRegister();

    RadiumEmulsion = builderISG("radium_emulsion")
        .fluid()
        .color(0x7E7E85)
        .iconSet(FLUID)
        .buildAndRegister();

    RadiumCakeSolution = builderISG("radium_cake_solution")
        .fluid()
        .color(0x666B66)
        .iconSet(FLUID)
        .buildAndRegister();

    RadiumSodiumSolution = builderISG("radium_sodium_solution")
        .fluid()
        .color(0x7E7E97)
        .iconSet(FLUID)
        .buildAndRegister();

    Dirtywater = builderISG("dirtywater")
        .fluid()
        .color(0x6e3415)
        .iconSet(FLUID)
        .buildAndRegister();

    Superlubricenttincture = builderISG("superlubricenttincture")
        .fluid()
        .color(0x5a5c00)
        .iconSet(FLUID)
        .buildAndRegister();

    Pyrrolidone2 = builderISG("nmethyl2pyrrolidone")
        .fluid()
        .color(0x81D4FA)
        .iconSet(FLUID)
        .buildAndRegister();

    Bbutyrolactone = builderISG("bbutyrolactone")
        .fluid()
        .color(0xC8E6C9)
        .iconSet(FLUID)
        .buildAndRegister();

    Twonaphthol = builderISG("twonaphthol")
        .fluid()
        .color(0xFFAB91)
        .iconSet(FLUID)
        .buildAndRegister();

    Binol = builderISG("binol")
        .fluid()
        .color(0x37474F)
        .iconSet(FLUID)
        .buildAndRegister();

    Diketene = builderISG("diketene")
        .fluid()
        .color(0xB0BEC5)
        .iconSet(FLUID)
        .buildAndRegister();

    Chlorodiphenylphosphine = builderISG("chlorodiphenylphosphine")
        .fluid()
        .color(0x666B66)
        .iconSet(FLUID)
        .buildAndRegister();

    Naphtalene = builderISG("naphtalene")
        .fluid()
        .color(0xFF8F00)
        .iconSet(FLUID)
        .buildAndRegister();

    Butylithium = builderISG("butylithium")
        .fluid()
        .color(0xC2185B)
        .iconSet(FLUID)
        .buildAndRegister();

    Liquidbinap = builderISG("liquidbinap")
        .fluid()
        .color(0x263238)
        .iconSet(FLUID)
        .buildAndRegister();

    Crystalkevlar = builderISG("crystalkevlar")
        .fluid()
        .color(0xcba3cc)
        .iconSet(FLUID)
        .buildAndRegister();

    Supra = builderISG("supra")
        .plasma()
        .color(0xcba3cc)
        .iconSet(FLUID)
        .buildAndRegister();

    Metastableenergeticalalloy = builderISG("metastableenergeticalalloy")
        .fluid()
        .color(0xdb4234)
        .iconSet(FLUID)
        .buildAndRegister();

    SuperCooledThoriumSolution = builderISG("super_cooled_thorium_solution")
        .fluid()
        .color(0xB3E5FC)
        .iconSet(FLUID)
        .buildAndRegister();

    Heatedthoriumsolution = builderISG("heatedthoriumsolution")
        .fluid()
        .color(0xDCE775)
        .iconSet(FLUID)
        .buildAndRegister();

    Thoriumsolution = builderISG("thoriumsolution")
        .fluid()
        .color(0x2E7D32)
        .iconSet(FLUID)
        .buildAndRegister();

    Hydrocrackedthoriumsolution = builderISG("hydrocrackedthoriumsolution")
        .fluid()
        .color(0xA5D6A7)
        .iconSet(FLUID)
        .buildAndRegister();

    Sulfuricthoriumsolution = builderISG("sulfuricthoriumsolution")
        .fluid()
        .color(0xFF7043)
        .iconSet(FLUID)
        .buildAndRegister();

    Driedthoriumemulsion = builderISG("driedthoriumemulsion")
        .fluid()
        .color(0x305731)
        .iconSet(FLUID)
        .buildAndRegister();

    Purifiedthoriumemulsion = builderISG("purifiedthoriumemulsion")
        .fluid()
        .color(0x388E3C)
        .iconSet(FLUID)
        .buildAndRegister();

    Paraphenylenediaminesolution = builderISG("paraphenylenediaminesolution")
        .fluid()
        .color(0xBA68C8)
        .iconSet(FLUID)
        .buildAndRegister();

    Unrefinedkevlar = builderISG("unrefinedkevlar")
        .fluid()
        .color(0xFFEB3B)
        .iconSet(FLUID)
        .buildAndRegister();

    Thoriumleachsolution = builderISG("thoriumleachsolution")
        .fluid()
        .color(0x06521c)
        .iconSet(FLUID)
        .buildAndRegister();

    Ic2coolant = builderISG("ic2coolant")
        .fluid()
        .color(0x2f6bb5)
        .iconSet(FLUID)
        .buildAndRegister();

    Teflon = builderISG("teflon")
        .fluid()
        .color(0xa1a1a1)
        .iconSet(FLUID)
        .buildAndRegister();

    Wolframiteimpureslurry = builderISG("wolframiteimpureslurry")
        .fluid()
        .color(0x39593C)
        .iconSet(FLUID)
        .buildAndRegister();

    Wolframiteslurry = builderISG("wolframiteslurry")
        .fluid()
        .color(0x355D38)
        .iconSet(FLUID)
        .buildAndRegister();

    HotTreatedWastewater = builderISG("hot_treated_wastewater")
        .fluid()
        .color(0x515151)
        .iconSet(FLUID)
        .buildAndRegister();

    LiquidSalt = builderISG("liquid_salt")
        .fluid()
        .color(0xD3D4D5)
        .iconSet(FLUID)
        .buildAndRegister();

    LiquidCryolite = builderISG("liquid_cryolite")
        .fluid()
        .color(0x42A5F5)
        .iconSet(FLUID)
        .buildAndRegister();

    PreNylonMix = builderISG("pre_nylon_mix")
        .fluid()
        .color(0xE5AF58)
        .iconSet(FLUID)
        .buildAndRegister();

    NaquatitaniumTrioxide = builderISG("naquatitanium_trioxide")
        .fluid()
        .color(0x301b1b)
        .iconSet(FLUID)
        .buildAndRegister();

    TitaniumTetrachloride = builderISG("titanium_tetrachloride")
        .fluid()
        .color(0x701a31)
        .iconSet(FLUID)
        .buildAndRegister();

    NaquatitaniumHydroxide = builderISG("naquatitanium_hydroxide")
        .fluid()
        .color(0x382121)
        .iconSet(FLUID)
        .buildAndRegister();

    DilutedImpureNaquahamericiumHydroxide = builderISG("diluted_impure_naquahamericium_hydroxide")
        .fluid()
        .color(0x684b4b)
        .iconSet(FLUID)
        .buildAndRegister();

    SuperfluidCarbonOxygenMixture = builderISG("superfluid_carbon_oxygen_mixture")
        .plasma()
        .color(0xBDC0DB)
        .iconSet(FLUID)
        .buildAndRegister();

    Butene1 = builderISG("1_butene")
        .fluid()
        .color(0xB75B5B)
        .iconSet(FLUID)
        .buildAndRegister();

    Prisma = builderISG("prisma")
        .liquid(new FluidBuilder().state(FluidState.LIQUID).customStill())
        .formula("֍")
        .buildAndRegister();
  }
}
