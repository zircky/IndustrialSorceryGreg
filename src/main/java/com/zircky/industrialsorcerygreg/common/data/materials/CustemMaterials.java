package com.zircky.industrialsorcerygreg.common.data.materials;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.ToolProperty;
import com.gregtechceu.gtceu.api.fluids.FluidBuilder;
import com.gregtechceu.gtceu.common.data.GTElements;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.zircky.industrialsorcerygreg.api.data.material.ISGMaterialFlags;
import com.zircky.industrialsorcerygreg.common.data.ISGElement;
import com.zircky.industrialsorcerygreg.common.data.ISGMaterials;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.FLUID;
import static com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty.GasTier.HIGH;
import static com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty.GasTier.HIGHEST;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.SNDART_FLAGS;
import static com.zircky.industrialsorcerygreg.common.data.materials.ISGMaterialIconSet.CHAOS;
import static com.zircky.industrialsorcerygreg.common.data.materials.ISGMaterialIconSet.INFINITY;

public class CustemMaterials {
  public static void register() {
    Draconium = builderISG("draconium")
        .ingot(4)
        .fluid()
        .blastTemp(19200)
        .element(ISGElement.DRACONIUM)
        .color(0xa300cc)
        .iconSet(MaterialIconSet.RADIOACTIVE)
        .appendFlags(SNDART_FLAGS, NO_SMELTING)
        .buildAndRegister();

    Chaos = builderISG("chaos")
        .ingot()
        .liquid(new FluidBuilder().temperature(1000000).customStill())
        .plasma()
        .blastTemp(28000, BlastProperty.GasTier.HIGHEST, GTValues.VA[GTValues.UIV], 3000)
        .element(ISGElement.CHAOS)
        .iconSet(CHAOS)
        .color(0x000000)
        .flags(GENERATE_FOIL)
        .buildAndRegister();

    Infinity = builderISG("infinity")
        .ingot().langValue("Infinity")
        .liquid(new FluidBuilder().temperature(1000000).customStill())
        .blastTemp(32000, BlastProperty.GasTier.HIGHEST, GTValues.VA[GTValues.UEV], 900)
        .element(ISGElement.INFINITY)
        .iconSet(INFINITY)
        .appendFlags(SNDART_FLAGS)
        .cableProperties(Integer.MAX_VALUE, 8192, 0, true, 300)
        .toolStats(ToolProperty.Builder.of(0.1f, Float.POSITIVE_INFINITY, Integer.MAX_VALUE, 100).build())
        .buildAndRegister();

    Bedrockium = builderISG("bedrockium")
        .ingot().fluid().dust()
        .color(0x11111b).iconSet(SAND)
        .itemPipeProperties(512, 64)
        .appendFlags(SNDART_FLAGS)
        //.element(GTNNElement.SpNt)
        .cableProperties(GTValues.V[GTValues.UHV], 2, 32)
        .blastTemp(9900, BlastProperty.GasTier.HIGH, GTValues.VA[GTValues.ZPM], 17460)
        .buildAndRegister();

    SkySteel = builderISG("sky_steel")
        .ingot()
        .color(0x000000).secondaryColor(0xFFFFFF)
        .iconSet(DULL)
        .appendFlags(SNDART_FLAGS)
        .buildAndRegister()
        .setFormula("SkFe");

    MarM200Steel = builderISG("mar_m_200_steel")
        .ingot().fluid()
        .blastTemp(4600, HIGH, GTValues.VA[GTValues.IV], 300)
        .components(GTMaterials.Niobium, 2, GTMaterials.Chromium, 9, GTMaterials.Aluminium, 5, GTMaterials.Titanium, 2, GTMaterials.Cobalt, 10,
            GTMaterials.Tungsten, 13, GTMaterials.Nickel, 18)
        .color(0x515151)
        .iconSet(METALLIC)
        .flags(MaterialFlags.GENERATE_GEAR, MaterialFlags.DISABLE_DECOMPOSITION, MaterialFlags.GENERATE_FRAME)
        .buildAndRegister();

    CortenSteel = builderISG("corten_steel")
        .ingot().fluid()
        .color(0x7C370D).secondaryColor(0x8B4513)
        .iconSet(SHINY)
        .appendFlags(SNDART_FLAGS)
        .blastTemp(3870, HIGH, GTValues.VA[GTValues.IV], 2800)
        .buildAndRegister()
        .setFormula("", true);

    Taranium =  builderISG("taranium")
        .ingot().fluid()
        .color(0x0c0c0d)
        .iconSet(SHINY)
        .appendFlags(SNDART_FLAGS)
        .blastTemp(10000, HIGHEST)
        .buildAndRegister()
        .setFormula("Tn");

        MetastableOganesson = builderISG("metastable_oganesson")
        .ingot().liquid()
        .color(0xE61C24)
        .iconSet(SHINY)
        .appendFlags(SNDART_FLAGS)
        .element(GTElements.Og)
        .blastTemp(10380, HIGHEST)
        .buildAndRegister();

    MetastableFlerovium = builderISG("metastable_flerovium")
        .ingot().liquid()
        .color(0x521973)
        .iconSet(SHINY)
        .appendFlags(SNDART_FLAGS)
        .element(GTElements.Fl)
        .blastTemp(10990, HIGHEST)
        .buildAndRegister();

    MetastableHassium = builderISG("metastable_hassium")
        .ingot().liquid()
        .color(0x2d3a9d)
        .iconSet(SHINY)
        .appendFlags(SNDART_FLAGS)
        .element(GTElements.Hs)
        .blastTemp(11240, HIGHEST)
        .buildAndRegister();

    Krypton = builderISG("krypton")
        .liquid().plasma()
        .color(0x31C42F)
        .iconSet(FLUID)
        .flags(DISABLE_DECOMPOSITION)
        .element(GTElements.Kr)
        .buildAndRegister();

    Polonium = builderISG("polonium")
        .dust().liquid()
        .color(0xC9D47E)
        .iconSet(DULL)
        .radioactiveHazard(2)
        .flags(GENERATE_PLATE, ISGMaterialFlags.GENERATE_CURVED_PLATE)
        .buildAndRegister();

    UraniumRadioactive = builderISG("uranium_radioactive")
        .ore()
        .ingot(3).liquid()
        .color(GTMaterials.Uranium238.getMaterialRGB())
        .iconSet(METALLIC)
        .appendFlags(SNDART_FLAGS)
        .element(GTElements.U)
        .radioactiveHazard(1)
        .buildAndRegister();

    Neptunium = builderISG("neptunium")
        .ingot(3).liquid()
        .color(0x284D7B)
        .iconSet(METALLIC)
        .appendFlags(SNDART_FLAGS)
        .element(GTElements.Np)
        .radioactiveHazard(2)
        .buildAndRegister();

    PlutoniumRadioactive = builderISG("plutonium_radioactive")
        .ingot(3).liquid()
        .color(GTMaterials.Plutonium239.getMaterialRGB())
        .iconSet(METALLIC)
        .appendFlags(SNDART_FLAGS)
        .element(GTElements.Pu)
        .radioactiveHazard(2)
        .buildAndRegister();

    Thorium233 = builderISG("thorium233")
        .ingot().liquid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(1)
        .buildAndRegister();

    Protactinium233 = builderISG("protactinium233")
        .ingot().liquid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(2)
        .buildAndRegister();

    Uranium233 = builderISG("uraniumRadioactive233")
        .ingot().liquid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(1)
        .buildAndRegister();

    Uranium234 = builderISG("uraniumRadioactive234")
        .ingot().liquid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(1)
        .buildAndRegister();

    Uranium239 = builderISG("uraniumRadioactive239")
        .ingot().liquid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(1)
        .buildAndRegister();

    Neptunium235 = builderISG("neptunium235")
        .ingot().liquid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(2)
        .buildAndRegister();

    Neptunium237 = builderISG("neptunium237")
        .ingot().liquid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(2)
        .buildAndRegister();

    Neptunium239 = builderISG("neptunium239")
        .ingot().liquid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(2)
        .buildAndRegister();

    Plutonium239 = builderISG("plutoniumRadioactive239")
        .ingot().liquid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(2)
        .buildAndRegister();

    Plutonium240 = builderISG("plutoniumRadioactive240")
        .ingot().liquid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(2)
        .buildAndRegister();

    Plutonium245 = builderISG("plutoniumRadioactive245")
        .ingot().liquid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(2)
        .buildAndRegister();

    Americium241 = builderISG("americium241")
        .ingot().liquid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Americium243 = builderISG("americium243")
        .ingot().liquid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Americium245 = builderISG("americium245")
        .ingot().liquid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Curium245 = builderISG("curium245")
        .ingot().liquid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Curium246 = builderISG("curium246")
        .ingot().liquid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Curium247 = builderISG("curium247")
        .ingot().liquid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Curium250 = builderISG("curium250")
        .ingot().liquid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Curium251 = builderISG("curium251")
        .ingot().liquid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Berkelium247 = builderISG("berkelium247")
        .ingot().liquid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Berkelium249 = builderISG("berkelium249")
        .ingot().liquid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Berkelium251 = builderISG("berkelium251")
        .ingot().liquid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Californium251 = builderISG("californium251")
        .ingot().liquid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Californium252 = builderISG("californium252")
        .ingot().liquid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Californium253 = builderISG("californium253")
        .ingot().liquid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Californium256 = builderISG("californium256")
        .ingot().liquid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Californium257 = builderISG("californium257")
        .ingot().liquid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Einsteinium253 = builderISG("einsteinium253")
        .ingot().liquid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Einsteinium255 = builderISG("einsteinium255")
        .ingot().liquid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Einsteinium257 = builderISG("einsteinium257")
        .ingot().liquid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Fermium257 = builderISG("fermium257")
        .ingot().liquid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Fermium258 = builderISG("fermium258")
        .ingot().liquid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Fermium259 = builderISG("fermium259")
        .ingot().liquid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Fermium262 = builderISG("fermium262")
        .ingot().liquid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Fermium263 = builderISG("fermium263")
        .ingot().liquid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Mendelevium259 = builderISG("mendelevium259")
        .ingot().liquid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Mendelevium261 = builderISG("mendelevium261")
        .ingot().liquid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Mendelevium263 = builderISG("mendelevium263")
        .ingot().liquid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    NeutralMatter = builderISG("neutral_matter")
        .liquid()
        .color(3956968)
        .iconSet(FLUID)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    PositiveMatter = builderISG("positive_matter")
        .liquid()
        .color(11279131)
        .iconSet(FLUID)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    IronChloride = builderISG("iron_chloride")
        .liquid()
        .color(0x060b0b)
        .iconSet(FLUID)
        .components(GTMaterials.Iron, 1, GTMaterials.Chlorine, 3)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    HighPressureSteam = builderISG("high_pressure_steam")
        .gas(1000)
        .color(0xFFFFFF)
        .iconSet(FLUID)
        .components(GTMaterials.Water, 1)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    RocketFuelH8N4C2O4 = builderISG("rocket_fuel_a")
        .liquid()
        .color(0x5ECB22)
        .iconSet(FLUID)
        .components(GTMaterials.Hydrogen, 8, GTMaterials.Nitrogen, 4, GTMaterials.Carbon, 2, GTMaterials.Oxygen, 4)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    CoalTarOil = builderISG("coal_tar_oil")
        .liquid()
        .color(0xB5B553)
        .iconSet(FLUID)
        .components(GTMaterials.CoalTar, 1)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    SulfuricCoalTarOil = builderISG("sulfuric_coal_tar_oil")
        .liquid()
        .color(0xFFFFAD)
        .iconSet(FLUID)
        .components(ISGMaterials.CoalTarOil, 1, GTMaterials.SulfuricAcid, 1)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    Anthracene = builderISG("anthracene")
        .liquid()
        .color(0xA2ACA2)
        .iconSet(FLUID)
        .components(GTMaterials.Carbon, 14, GTMaterials.Hydrogen, 10)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    Kerosene = builderISG("kerosene")
        .liquid()
        .color(0xD570D5)
        .iconSet(FLUID)
        .components(GTMaterials.RareEarth, 1)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    EthylBenzene = builderISG("ethylbenzene")
        .liquid()
        .color(0xD5D5D5)
        .iconSet(FLUID)
        .components(GTMaterials.Carbon, 8, GTMaterials.Hydrogen, 10)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    MonoMethylHydrazine = builderISG("monomethylhydrazine")
        .liquid()
        .color(0xFFFFFF)
        .iconSet(FLUID)
        .components(GTMaterials.Carbon, 1, GTMaterials.Hydrogen, 6, GTMaterials.Nitrogen, 2)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    Hydrazine = builderISG("hydrazine")
        .liquid()
        .color(0xFFFFFF)
        .iconSet(FLUID)
        .components(GTMaterials.Nitrogen, 2, GTMaterials.Hydrogen, 4)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    EthylAnthraQuinone = builderISG("ethylanthraquinone")
        .liquid()
        .color(0xFFFF00)
        .iconSet(FLUID)
        .components(GTMaterials.Carbon, 16, GTMaterials.Hydrogen, 12, GTMaterials.Oxygen, 2)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    EthylAnthraHydroQuinone = builderISG("ethylanthrahydroquinone")
        .liquid()
        .color(0xFFFF47)
        .iconSet(FLUID)
        .components(ISGMaterials.EthylAnthraQuinone, 1, GTMaterials.Hydrogen, 2)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    DenseHydrazineFuelMixture = builderISG("dense_hydrazine_fuel_mixture")
        .liquid()
        .color(0x5E2B4A)
        .iconSet(FLUID)
        .components(ISGMaterials.Hydrazine, 1, GTMaterials.Methanol, 1)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    RocketFuelCN3H7O3 = builderISG("rocket_fuel_b")
        .liquid()
        .color(0xBE46C5)
        .iconSet(FLUID)
        .components(GTMaterials.Carbon, 1, GTMaterials.Nitrogen, 3, GTMaterials.Hydrogen, 7, GTMaterials.Oxygen, 3)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    RP1RocketFuel = builderISG("rocket_fuel_c")
        .liquid()
        .color(0xFF503C)
        .iconSet(FLUID)
        .components(GTMaterials.RareEarth, 1, GTMaterials.Oxygen, 1)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    RP1 = builderISG("rp")
        .liquid()
        .color(0xFF6E5D)
        .iconSet(FLUID)
        .components(GTMaterials.RareEarth, 1)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    LiquidOxygen = builderISG("liquid_oxygen")
        .liquid()
        .color(0x81FFFD)
        .iconSet(FLUID)
        .components(GTMaterials.Oxygen, 1)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    FermentationBase = builderISG("fermentation_base")
        .liquid()
        .color(0x3D5917)
        .iconSet(FLUID)
        .components(GTMaterials.RareEarth, 1)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    LiquidHydrogen = builderISG("liquid_hydrogen")
        .liquid()
        .color(0x3AFFC6)
        .iconSet(FLUID)
        .components(GTMaterials.Hydrogen, 1)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    Diphenylisophtalate = builderISG("diphenylisophtalate")
        .liquid()
        .color(0x246E57)
        .iconSet(DULL)
        .components(GTMaterials.Carbon, 20, GTMaterials.Hydrogen, 14, GTMaterials.Oxygen, 4)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    SodiumTungstate = builderISG("sodium_tungstate")
        .liquid()
        .color(0x7a7777)
        .iconSet(FLUID)
        .components(GTMaterials.Sodium, 2, GTMaterials.Tungsten, 1, GTMaterials.Oxygen, 4)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    IodizedOil = builderISG("iodized_oil")
        .liquid()
        .color(0x666666)
        .iconSet(FLUID)
        .buildAndRegister();

    Pyrotheum = builderISG("pyrotheum")
        .dust(1)
        .color(0xFF9A3C)
        .iconSet(SAND)
        .components(GTMaterials.Redstone, 1, GTMaterials.Blaze, 2, GTMaterials.Sulfur, 1)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    EglinSteelBase = builderISG("eglin_steel_base")
        .dust(6)
        .color(0x8B4513)
        .iconSet(SAND)
        .components(GTMaterials.Iron, 4, GTMaterials.Kanthal, 1, GTMaterials.Invar, 5)
        .buildAndRegister();

    MicaPulp = builderISG("mica_based")
        .dust(1)
        .color(0x917445)
        .iconSet(SAND)
        .components(GTMaterials.Mica, 1, GTMaterials.RareEarth, 1)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    AluminoSilicateWool = builderISG("alumino_silicate_wool")
        .dust(1)
        .color(0xbbbbbb)
        .iconSet(SAND)
        .components(GTMaterials.Aluminium, 2, GTMaterials.Silicon, 1, GTMaterials.Oxygen, 5)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    Blizz = builderISG("blizz")
        .dust(1)
        .color(0x01F3F6)
        .iconSet(DULL)
        .components(GTMaterials.Redstone, 1, GTMaterials.Water, 1)
        .buildAndRegister();

    Snow = builderISG("snow")
        .dust(1)
        .color(0xFFFFFF)
        .iconSet(OPAL)
        .components(GTMaterials.Hydrogen, 2, GTMaterials.Oxygen, 1)
        .buildAndRegister();

    Cryotheum = builderISG("cryotheum")
        .dust(1)
        .color(0x01F3F6)
        .iconSet(SAND)
        .components(GTMaterials.Redstone, 1, ISGMaterials.Blizz, 2, GTMaterials.Water, 1)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    PhthalicAnhydride = builderISG("phthalicanhydride")
        .dust(1)
        .color(0xD1D1D1)
        .iconSet(SAND)
        .components(GTMaterials.Carbon, 8, GTMaterials.Hydrogen, 4, GTMaterials.Oxygen, 3)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    Dibismusthydroborat = builderISG("dibismuthhydroborat")
        .dust(2)
        .color(0x00B749)
        .iconSet(SAND)
        .components(GTMaterials.Bismuth, 2, GTMaterials.Hydrogen, 1, GTMaterials.Boron, 1)
        .buildAndRegister();

    BismuthTellurite = builderISG("bismuth_tellurite")
        .dust(2)
        .color(0x006B38)
        .iconSet(SAND)
        .components(GTMaterials.Bismuth, 2, GTMaterials.Tellurium, 3)
        .buildAndRegister();

    CircuitCompoundMK3 = builderISG("circuit_compound_mkc")
        .dust(2)
        .color(0x003316)
        .iconSet(SAND)
        .components(GTMaterials.IndiumGalliumPhosphide, 1, ISGMaterials.Dibismusthydroborat, 3, ISGMaterials.BismuthTellurite, 2)
        .buildAndRegister();

    YttriumOxide = builderISG("yttrium_oxide")
        .dust(2)
        .color(0xC6EBB3)
        .iconSet(SAND)
        .components(GTMaterials.Yttrium, 2, GTMaterials.Oxygen, 3)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    Zirkelite = builderISG("zirkelite")
        .ore()
        .dust(2)
        .color(0x6B5E6A)
        .iconSet(DULL)
        .components(GTMaterials.Calcium, 2, GTMaterials.Thorium, 2, GTMaterials.Cerium, 1, GTMaterials.Zirconium, 7, GTMaterials.Rutile, 6, GTMaterials.Niobium, 4, GTMaterials.Oxygen, 10)
        .buildAndRegister();

    PlatinumResidue = builderISG("platinum_residue")
        .dust(2)
        .color(0x64632E)
        .iconSet(ROUGH)
        .components(GTMaterials.Iridium, 2, GTMaterials.RareEarth, 1, GTMaterials.RareEarth, 1, GTMaterials.RareEarth, 1)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    IrMetalResidue = builderISG("iridium_metal_residue")
        .ore()
        .dust(2)
        .color(0x846649)
        .iconSet(ROUGH)
        .components(GTMaterials.Iridium, 2, GTMaterials.Oxygen, 4, GTMaterials.SiliconDioxide, 2, GTMaterials.Gold, 3)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    Triniite = builderISG("triniite")
        .ore()
        .dust(7)
        .color(0x5F5A76)
        .iconSet(SHINY)
        .components(GTMaterials.Trinium, 3, GTMaterials.Actinium, 3, GTMaterials.Selenium, 4, GTMaterials.Astatine, 4)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    SilverOxide = builderISG("silver_oxide")
        .dust(2)
        .color(0x4D4D4D)
        .iconSet(DULL)
        .components(GTMaterials.Silver, 2, GTMaterials.Oxygen, 1)
        .buildAndRegister();

    SilverChloride = builderISG("silver_chloride")
        .dust(2)
        .color(0xFEFEFE)
        .iconSet(DULL)
        .components(GTMaterials.Silver, 1, GTMaterials.Chlorine, 1)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    PotassiumMetabisulfite = builderISG("potassium_metabisulfite")
        .dust(2)
        .color(0xFFFFFF)
        .iconSet(DULL)
        .components(GTMaterials.Potassium, 2, GTMaterials.Sulfur, 2, GTMaterials.Oxygen, 5)
        .buildAndRegister();

    LeadNitrate = builderISG("lead_nitrate")
        .dust(2)
        .color(0xFEFEFE)
        .iconSet(DULL)
        .components(GTMaterials.Lead, 1, GTMaterials.Nitrogen, 2, GTMaterials.Oxygen, 6)
        .buildAndRegister();

    SodiumPotassiumAlloy = builderISG("sodium_potassium_alloy")
        .dust(2)
        .color(0x252525)
        .iconSet(SHINY)
        .components(GTMaterials.Sodium, 7, GTMaterials.Potassium, 3)
        .buildAndRegister();

    SodiumFluoride = builderISG("sodium_fluoride")
        .dust(2)
        .color((GTMaterials.Sodium.getMaterialRGB()+GTMaterials.Fluorine.getMaterialRGB())/2)
        .iconSet(DULL)
        .components(GTMaterials.Sodium, 1, GTMaterials.Fluorine, 1)
        .buildAndRegister();

    PotassiumFluoride = builderISG("potassium_fluoride")
        .dust(2)
        .color(0xFDFDFD)
        .iconSet(DULL)
        .components(GTMaterials.Potassium, 1, GTMaterials.Fluorine, 1)
        .buildAndRegister();

    FLiNaK = builderISG("flinak")
        .dust(2)
        .color(0x252525)
        .iconSet(DULL)
        .components(GTMaterials.Fluorine, 3, GTMaterials.Lithium, 1, GTMaterials.Sodium, 1, GTMaterials.Potassium, 1)
        .buildAndRegister();

    FLiBe = builderISG("flibe")
        .dust(2)
        .color(0x252525)
        .iconSet(DULL)
        .components(GTMaterials.Fluorine, 3, GTMaterials.Lithium, 1, GTMaterials.Beryllium, 1)
        .buildAndRegister();

    OrganicFertilizer = builderISG("organic_fertilizer")
        .dust(2)
        .color(0xDDDDDD)
        .iconSet(SHINY)
        .components(GTMaterials.Calcium, 5, GTMaterials.Phosphate, 3, GTMaterials.Hydrogen, 1, GTMaterials.Oxygen, 1)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    CalciumTungstate = builderISG("calcium_tungstate")
        .dust(0)
        .color(0x6e6867)
        .iconSet(SHINY)
        .components(GTMaterials.Tungsten, 1, GTMaterials.Calcium, 1, GTMaterials.Oxygen, 4)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    TungstenTrioxide = builderISG("tungsten_trioxide")
        .dust(0)
        .color(0x99FF97)
        .iconSet(GTMaterials.Tungsten.getMaterialIconSet())
        .components(GTMaterials.Tungsten, 1, GTMaterials.Oxygen, 3)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    TungstenHexachloride = builderISG("tungsten_hexachloride")
        .dust(0)
        .color(0x533f75)
        .iconSet(METALLIC)
        .components(GTMaterials.Tungsten, 1, GTMaterials.Chlorine, 6)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    NaquadricCompound = builderISG("naquadric_compound")
        .ore()
        .dust()
        .color(GTMaterials.Naquadah.getMaterialRGB())
        .iconSet(GTMaterials.Naquadah.getMaterialIconSet())
        .buildAndRegister();

    EnrichedNaquadricCompound = builderISG("enriched_naquadric_compound")
        .ore().dust()
        .color(GTMaterials.NaquadahEnriched.getMaterialRGB())
        .iconSet(GTMaterials.NaquadahEnriched.getMaterialIconSet())
        .buildAndRegister();

    NaquadriaticCompound = builderISG("naquadriatic_compound")
        .ore()
        .dust(GTMaterials.Naquadria.getBlockHarvestLevel())
        .color(GTMaterials.Naquadria.getMaterialRGB())
        .iconSet(GTMaterials.Naquadria.getMaterialIconSet())
        .buildAndRegister();

    Caliche = builderISG("caliche")
        .ore()
        .dust(3)
        .color(0xeb9e3f)
        .iconSet(DULL)
        .components(/**SodiumNitrate, 1,*/ GTMaterials.Potassium, 1, GTMaterials.Nitrogen, 1, GTMaterials.Oxygen, 3, GTMaterials.RockSalt, 1, GTMaterials.Sodium, 1, GTMaterials.Iodine, 1, GTMaterials.Oxygen, 3)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    Rhodocrosite = builderISG("rhodocrosite")
        .ore()
        .dust(2)
        .color(0xff6699)
        .iconSet(SHINY)
        .components(GTMaterials.Manganese, 1, GTMaterials.Carbon, 1, GTMaterials.Oxygen, 3)
        .buildAndRegister();

    Columbite = builderISG("columbite")
        .ore()
        .dust(2)
        .color(0xCCCC00)
        .iconSet(SHINY)
        .components(GTMaterials.Iron, 1, GTMaterials.Niobium, 2, GTMaterials.Oxygen, 6)
        .buildAndRegister();

    FluoroApatite = builderISG("fluoroapatite")
        .ore()
        .dust(2)
        .color(GTMaterials.Apatite.getMaterialRGB())
        .iconSet(DULL)
        .components(GTMaterials.Calcium, 5, GTMaterials.Phosphate, 3, GTMaterials.Fluorine, 1)
        .buildAndRegister();

    NdYAG = builderISG("nd_yag")
        .dust(6)
        .color(0xcf8acf)
        .iconSet(SHINY)
        .buildAndRegister();

    PrHoYLF = builderISG("prho_ylf")
        .dust(6)
        .color(0x6f20af)
        .iconSet(SHINY)
        .buildAndRegister();

    LuTmYVO = builderISG("lutm_yvo")
        .dust(6)
        .color(0x206faf)
        .iconSet(SHINY)
        .buildAndRegister();

    IndiumPhospide = builderISG("indium_phosphide")
        .dust(6)
        .color(0x5c9c9c)
        .iconSet(SHINY)
        .components(GTMaterials.Indium, 1, GTMaterials.Phosphorus, 1)
        .buildAndRegister();

    Barytocalcite = builderISG("barytocalcite")
        .ore()
        .dust(2)
        .color(0xbf9c7c)
        .iconSet(SHINY)
        .components(GTMaterials.Barium, 1, GTMaterials.Calcium, 1, GTMaterials.Carbon, 2, GTMaterials.Oxygen, 6)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    Witherite = builderISG("witherite")
        .ore()
        .dust(2)
        .color(0xc6c29d)
        .iconSet(ROUGH)
        .components(GTMaterials.Barium, 1, GTMaterials.Carbon, 1, GTMaterials.Oxygen, 3)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    Arsenopyrite = builderISG("arsenopyrite")
        .ore()
        .dust(2)
        .color(0xaa9663)
        .iconSet(METALLIC)
        .components(GTMaterials.Iron, 1, GTMaterials.Arsenic, 1, GTMaterials.Sulfur, 1)
        .buildAndRegister();

    Gallite = builderISG("gallite")
        .ore()
        .dust(2)
        .color(0x7f7b9e)
        .iconSet(SHINY)
        .components(GTMaterials.Copper, 1, GTMaterials.Gallium, 1, GTMaterials.Sulfur, 2)
        .buildAndRegister();

    Bowieite = builderISG("bowieite")
        .ore()
        .dust(2)
        .color(0x8b8995)
        .iconSet(ROUGH)
        .components(GTMaterials.Rhodium, 1, GTMaterials.Iridium, 1, GTMaterials.Platinum, 1, GTMaterials.Sulfur, 3)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    Celestine = builderISG("celestine")
        .ore()
        .dust(2)
        .color(0x9db1b8)
        .iconSet(SHINY)
        .components(GTMaterials.Strontium, 1, GTMaterials.Sulfur, 1, GTMaterials.Oxygen, 4)
        .buildAndRegister();

    CubicZirconia = builderISG("cubic_zirconia")
        .gem(6)
        .color(0xFFDFE2)
        .iconSet(DIAMOND)
        .components(GTMaterials.Zirconium, 1, GTMaterials.Oxygen, 2)
        .buildAndRegister();

    Prasiolite = builderISG("prasiolite")
        .ore()
        .gem(2)
        .color(0x9EB749)
        .iconSet(QUARTZ)
        .components(GTMaterials.Silicon, 5, GTMaterials.Oxygen, 10, GTMaterials.Iron, 1)
        .buildAndRegister();

    MagnetoResonatic = builderISG("magneto_resonatic")
        .gem(2)
        .color(0xFF97FF)
        .iconSet(MAGNETIC)
        .components(ISGMaterials.Prasiolite, 3, ISGMaterials.BismuthTellurite, 6, ISGMaterials.CubicZirconia, 1, GTMaterials.SteelMagnetic, 1)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    Zircon = builderISG("zircon")
        .ore()
        .gem(3)
        .color(0xeb9e3f)
        .iconSet(GEM_VERTICAL)
        .components(GTMaterials.Zirconium, 1, GTMaterials.Silicon, 1, GTMaterials.Oxygen, 4)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    LeadZirconateTitanate = builderISG("lead_zirconate_titanate")
        .gem(3)
        .color(0x359ade)
        .iconSet(OPAL)
        .components(GTMaterials.Lead, 1, GTMaterials.Zirconium, 1, GTMaterials.Titanium, 1, GTMaterials.Oxygen, 3)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    EglinSteel = builderISG("eglin_steel")
        .ingot(6).liquid()
        .color(0x8B4513)
        .iconSet(METALLIC)
        .components(ISGMaterials.EglinSteelBase, 10, GTMaterials.Sulfur, 1, GTMaterials.Silicon, 1, GTMaterials.Carbon, 1)
        .appendFlags(SNDART_FLAGS)
        .blastTemp(1048)
        .buildAndRegister();

    Grisium = builderISG("grisium")
        .ingot(6).liquid()
        .color(0x355D6A)
        .iconSet(METALLIC)
        .components(GTMaterials.Titanium, 9, GTMaterials.Carbon, 9, GTMaterials.Potassium, 9, GTMaterials.Lithium, 9, GTMaterials.Sulfur, 9, GTMaterials.Hydrogen, 5)
        .appendFlags(SNDART_FLAGS)
        .blastTemp(3850)
        .buildAndRegister();

    Inconel625 = builderISG("inconel_a")
        .ingot(6).liquid()
        .color(0x80C880)
        .iconSet(METALLIC)
        .components(GTMaterials.Nickel, 3, GTMaterials.Chromium, 7, GTMaterials.Molybdenum, 10, GTMaterials.Invar, 10, GTMaterials.Nichrome, 13)
        .appendFlags(SNDART_FLAGS)
        .blastTemp(2425)
        .buildAndRegister();

    MaragingSteel250 = builderISG("maraging_steel_a")
        .ingot(6).liquid()
        .color(0x92918D)
        .iconSet(METALLIC)
        .components(GTMaterials.Steel, 16, GTMaterials.Molybdenum, 1, GTMaterials.Titanium, 1, GTMaterials.Nickel, 4, GTMaterials.Cobalt, 2)
        .appendFlags(SNDART_FLAGS)
        .blastTemp(2413)
        .buildAndRegister();

    Staballoy = builderISG("staballoy")
        .ingot(6).liquid()
        .color(0x444B42)
        .iconSet(METALLIC)
        .components(GTMaterials.Uranium238, 9, GTMaterials.Titanium, 1)
        .flags(DISABLE_DECOMPOSITION)
        .appendFlags(SNDART_FLAGS)
        .blastTemp(3450)
        .buildAndRegister();

    HastelloyN = builderISG("hastelloy_n")
        .ingot(6).liquid()
        .color(0xDDDDDD)
        .iconSet(METALLIC)
        .components(GTMaterials.Yttrium, 2, GTMaterials.Molybdenum, 4, GTMaterials.Chromium, 2, GTMaterials.Titanium, 2, GTMaterials.Nickel, 15)
        .appendFlags(SNDART_FLAGS)
        .blastTemp(4350)
        .buildAndRegister();

    Tumbaga = builderISG("tumbaga")
        .ingot(6).liquid()
        .color(0xFFB20F)
        .iconSet(METALLIC)
        .components(GTMaterials.Gold, 7, GTMaterials.Bronze, 3)
        .appendFlags(SNDART_FLAGS)
        .blastTemp(1200)
        .buildAndRegister();

    Stellite = builderISG("stellite")
        .ingot(6).liquid()
        .color(0x9991A5)
        .iconSet(METALLIC)
        .components(GTMaterials.Cobalt, 9, GTMaterials.Chromium, 9, GTMaterials.Manganese, 5, GTMaterials.Titanium, 2)
        .appendFlags(SNDART_FLAGS)
        .blastTemp(4310)
        .buildAndRegister();

    Talonite = builderISG("talonite")
        .ingot(6).liquid()
        .color(0x9991A5)
        .iconSet(SHINY)
        .components(GTMaterials.Cobalt, 4, GTMaterials.Chromium, 3, GTMaterials.Phosphorus, 2, GTMaterials.Molybdenum, 1)
        .appendFlags(SNDART_FLAGS)
        .blastTemp(3454)
        .buildAndRegister();

    Enderium = builderISG("enderium")
        .ingot(3).liquid()
        .color(0x23524a)
        .iconSet(METALLIC)
        .components(GTMaterials.Lead, 3, GTMaterials.Platinum, 1, GTMaterials.EnderPearl, 1)
        .flags(DISABLE_DECOMPOSITION)
        .appendFlags(SNDART_FLAGS)
        .toolStats(ToolProperty.Builder.of(8.0F, 3.0F, 1280, 3).build())
        .blastTemp(4500)
        .buildAndRegister();

    Nitinol60 = builderISG("nitinol_a")
        .ingot(4).liquid()
        .color(0xCCB0EC)
        .iconSet(METALLIC)
        .components(GTMaterials.Nickel, 2, GTMaterials.Titanium, 3)
        .appendFlags(SNDART_FLAGS)
        .buildAndRegister();

    BabbittAlloy = builderISG("babbitt_alloy")
        .ingot(4).liquid()
        .color(0xA19CA4)
        .iconSet(METALLIC)
        .components(GTMaterials.Tin, 5, GTMaterials.Lead, 36, GTMaterials.Antimony, 8, GTMaterials.Arsenic, 1)
        .appendFlags(SNDART_FLAGS)
        .blastTemp(737)
        .buildAndRegister();

    HG1223 = builderISG("hg_alloy")
        .ingot(4).liquid()
        .color(0x245397)
        .iconSet(METALLIC)
        .components(GTMaterials.Mercury, 1, GTMaterials.Barium, 2, GTMaterials.Calcium, 2, GTMaterials.Copper, 3, GTMaterials.Oxygen, 8)
        .appendFlags(SNDART_FLAGS)
        .blastTemp(5325)
        .buildAndRegister();

    ZirconiumCarbide = builderISG("zirconium_carbide")
        .ingot(2).liquid()
        .color(0xFFDACD)
        .iconSet(SHINY)
        .components(GTMaterials.Zirconium, 1, GTMaterials.Carbon, 1)
        .appendFlags(SNDART_FLAGS)
        .blastTemp(1200)
        .buildAndRegister();

    GoldAlloy = builderISG("gold_alloy")
        .ingot(2).liquid()
        .color(0xBBA52B)
        .iconSet(SHINY)
        .components(GTMaterials.Copper, 3, GTMaterials.Gold, 1, GTMaterials.RareEarth, 1)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    PreciousMetal = builderISG("precious_metal")
        .ore()
        .ingot(2).liquid()
        .color(0xB99023)
        .iconSet(SHINY)
        .components(GTMaterials.Gold, 1, GTMaterials.RareEarth, 1)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    LithiumFluoride = builderISG("lithium_fluoride")
        .ingot(2).liquid()
        .color(0x757575)
        .iconSet(SHINY)
        .components(GTMaterials.Lithium, 1, GTMaterials.Fluorine, 1)
        .buildAndRegister();

    LeadBismuthEutectic = builderISG("lead_bismuth_eutatic")
        .ingot(2).liquid()
        .color(0x757575)
        .iconSet(SHINY)
        .components(GTMaterials.Lead, 3, GTMaterials.Bismuth, 7)
        .buildAndRegister();

    AbyssalAlloy = builderISG("abyssal_alloy")
        .ingot(6).liquid()
        .color(0x9E706A)
        .iconSet(METALLIC)
        .components(GTMaterials.StainlessSteel, 5, GTMaterials.TungstenCarbide, 5, GTMaterials.Nichrome, 5, GTMaterials.Bronze, 5, GTMaterials.IncoloyMA956, 5, GTMaterials.Iodine, 1, GTMaterials.Germanium, 1, GTMaterials.Radon, 1)
        .flags(DISABLE_DECOMPOSITION)
        .appendFlags(SNDART_FLAGS)
        .blastTemp(9625)
        .buildAndRegister();

    ReactorSteel = builderISG("reactor_steel")
        .ingot(2).liquid()
        .color(0xB4B3B0)
        .iconSet(SHINY)
        .components(GTMaterials.Iron, 15, GTMaterials.Niobium, 1, GTMaterials.Vanadium, 4, GTMaterials.Carbon, 2)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    Incoloy813 = builderISG("incoloy813")
        .ingot(2).liquid()
        .color(0x37bf7e)
        .iconSet(SHINY)
        .components(GTMaterials.VanadiumSteel, 4, GTMaterials.Osmiridium, 2, GTMaterials.Technetium, 3, GTMaterials.Germanium, 4, GTMaterials.Iridium, 7, GTMaterials.Duranium, 5, ISGMaterials.Californium252, 1)
        .flags(DISABLE_DECOMPOSITION)
        .appendFlags(SNDART_FLAGS)
        .blastTemp(10000)
        .buildAndRegister();

    EnrichedNaquadahAlloy = builderISG("enriched_naquadah_alloy")
        .ingot(2).liquid()
        .color(0x403f3d)
        .iconSet(SHINY)
        .components(GTMaterials.NaquadahEnriched, 4, GTMaterials.Rhodium, 2, GTMaterials.Ruthenium, 2, GTMaterials.Dubnium, 1, GTMaterials.Rubidium, 2, ISGMaterials.Einsteinium255, 1)
        .flags(DISABLE_DECOMPOSITION)
        .appendFlags(SNDART_FLAGS)
        .blastTemp(10000)
        .buildAndRegister();

    HastelloyX78 = builderISG("hastelloy_x78")
        .ingot(2).liquid()
        .color(0x6ba3e3)
        .iconSet(SHINY)
        .components(GTMaterials.NaquadahAlloy, 10, GTMaterials.Rhenium, 5, GTMaterials.Naquadria, 4, GTMaterials.Gadolinium, 3, GTMaterials.Strontium, 2, GTMaterials.Polonium, 3, GTMaterials.Rutherfordium, 2, ISGMaterials.Fermium258, 1)
        .flags(DISABLE_DECOMPOSITION)
        .appendFlags(SNDART_FLAGS)
        .blastTemp(12000)
        .buildAndRegister();

    HastelloyK243 = builderISG("hastelloy_k243")
        .ingot(2).liquid()
        .color(0xa5f564)
        .iconSet(SHINY)
        .components(ISGMaterials.HastelloyX78, 5, GTMaterials.NiobiumNitride, 2, GTMaterials.Tritanium, 4, GTMaterials.TungstenCarbide, 4, GTMaterials.Promethium, 4, ISGMaterials.Mendelevium261, 1)
        .flags(DISABLE_DECOMPOSITION)
        .appendFlags(SNDART_FLAGS)
        .blastTemp(12100)
        .buildAndRegister();

    Polyetheretherketone = builderISG("polyetheretherketone")
        .ingot(2).liquid()
        .color(0x403e37)
        .iconSet(DULL)
        .components(GTMaterials.Carbon, 20, GTMaterials.Hydrogen, 12, GTMaterials.Oxygen, 3)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    Zylon = builderISG("zylon")
        .ingot(2).liquid()
        .color(0xFFE000)
        .iconSet(SHINY)
        .components(GTMaterials.Carbon, 14, GTMaterials.Hydrogen, 6, GTMaterials.Nitrogen, 2, GTMaterials.Oxygen, 2)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    FullerenePolymerMatrix = builderISG("fullerene_polymer_matrix")
        .ingot(2).liquid()
        .color(0x403e37)
        .iconSet(DULL)
        .components(GTMaterials.Palladium, 1, GTMaterials.Iron, 1, GTMaterials.Carbon, 153, GTMaterials.Hydrogen, 36, GTMaterials.Nitrogen, 1, GTMaterials.Oxygen, 2)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    CarbonNanotubes = builderISG("carbon_nanotubes")
        .ingot(5).liquid()
        .color(0x2c2c2c)
        .iconSet(SHINY)
        .components(GTMaterials.Carbon, 1)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    BlackTitanium = builderISG("black_titanium")
        .ingot(7).liquid()
        .color(0x6C003B)
        .iconSet(SHINY)
        .components(GTMaterials.Titanium, 26, GTMaterials.Lanthanum, 6, GTMaterials.Tungsten, 4, GTMaterials.Cobalt, 3, GTMaterials.Manganese, 2, GTMaterials.Phosphorus, 2, GTMaterials.Palladium, 2, GTMaterials.Niobium, 1, GTMaterials.Argon, 5)
        .flags(DISABLE_DECOMPOSITION)
        .blastTemp(11500)
        .buildAndRegister();

    TungstenTitaniumCarbide = builderISG("tungsten_titanium_carbide")
        .ingot(7).liquid()
        .color(0x800d0d)
        .iconSet(SHINY)
        .components(GTMaterials.TungstenCarbide, 7, GTMaterials.Titanium, 3)
        .flags(DISABLE_DECOMPOSITION)
        .blastTemp(4422)
        .buildAndRegister();

    TitanSteel = builderISG("titan_steel")
        .ingot(7).liquid()
        .color(0xAA0d0d)
        .iconSet(SHINY)
        .components(ISGMaterials.TungstenTitaniumCarbide, 3, GTMaterials.Steel, 6) // Jasper
        .flags(DISABLE_DECOMPOSITION)
        .blastTemp(9200)
        .buildAndRegister();

    Inconel792 = builderISG("inconel_b")
        .ingot(5).liquid()
        .color(0x6CF076)
        .iconSet(SHINY)
        .components(GTMaterials.Nickel, 2, GTMaterials.Niobium, 1, GTMaterials.Aluminium, 2, GTMaterials.Nichrome, 1)
        .flags(DISABLE_DECOMPOSITION)
        .blastTemp(6200)
        .buildAndRegister();

    Pikyonium = builderISG("pikyonium")
        .ingot(7).liquid()
        .color(0x3467BA)
        .iconSet(SHINY)
        .components(ISGMaterials.Inconel792, 8, ISGMaterials.EglinSteel, 5, GTMaterials.NaquadahEnriched, 4, GTMaterials.Cerium, 3, GTMaterials.Antimony, 2, GTMaterials.Platinum, 2, GTMaterials.Ytterbium, 1, GTMaterials.TungstenSteel, 4)
        .flags(DISABLE_DECOMPOSITION)
        .blastTemp(10400)
        .buildAndRegister();

    Lafium = builderISG("lafium")
        .ingot(7).liquid()
        .color(0x0d0d60)
        .iconSet(SHINY)
        .components(ISGMaterials.HastelloyN, 8, GTMaterials.Naquadah, 4, GTMaterials.Samarium, 2, GTMaterials.Tungsten, 4, GTMaterials.Argon, 2, GTMaterials.Aluminium, 6, GTMaterials.Nickel, 8, GTMaterials.Carbon, 2)
        .flags(DISABLE_DECOMPOSITION)
        .blastTemp(9865)
        .buildAndRegister();

    Cinobite = builderISG("cinobite")
        .ingot(5).liquid()
        .color(0x010101)
        .iconSet(SHINY)
        .components(GTMaterials.Zeron100, 8, GTMaterials.Naquadria, 4, GTMaterials.Gadolinium, 3, GTMaterials.Aluminium, 2, GTMaterials.Mercury, 1, GTMaterials.Tin, 1, GTMaterials.Titanium, 6, GTMaterials.Osmiridium, 1)
        .flags(DISABLE_DECOMPOSITION)
        .blastTemp(11465)
        .buildAndRegister();

    HDCS = builderISG("hdcs")
        .ingot(5).liquid()
        .color(0x334433)
        .iconSet(SHINY)
        .components(GTMaterials.TungstenSteel, 12, GTMaterials.HSSS, 9, GTMaterials.HSSG, 6, GTMaterials.Ruridit, 3, ISGMaterials.MagnetoResonatic, 2, GTMaterials.Plutonium241, 1)
        .flags(DISABLE_DECOMPOSITION)
        .blastTemp(9900)
        .buildAndRegister();

    ProtoAdamantium = builderISG("proto_adamantium")
        .ingot(7).liquid()
        .color(0x4662d4)
        .iconSet(SHINY)
        .components(/**ISGMaterials.Adamantium, 3,*/ GTMaterials.Promethium, 2)
        .blastTemp(11244)
        .buildAndRegister()
        .setFormula("Ad3Pm2", true);

    TriniumTitanium = builderISG("trinium_titanium")
        .ingot(7).liquid()
        .color(0x9986a3)
        .iconSet(SHINY)
        .components(GTMaterials.Trinium, 2, GTMaterials.Titanium, 1)
        .blastTemp(11000)
        .buildAndRegister();

    LithiumTitanate = builderISG("lithium_titanate")
        .ingot(5).liquid()
        .color(0xfe71a9)
        .iconSet(SHINY)
        .components(GTMaterials.Lithium, 2, GTMaterials.Titanium, 1, GTMaterials.Oxygen, 3)
        .flags(DISABLE_DECOMPOSITION)
        .blastTemp(2500)
        .buildAndRegister();

    Titanium50 = builderISG("titanium50")
        .ingot(5).liquid()
        .color(GTMaterials.Titanium.getMaterialRGB())
        .iconSet(SHINY)
        .blastTemp(2000)
        .buildAndRegister();

    ElectricallyImpureCopper = builderISG("electrically_impure_copper")
        .ingot(2).liquid()
        .color(0x765A30)
        .iconSet(DULL)
        .components(GTMaterials.Copper, 1, GTMaterials.RareEarth, 1)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    Polyurethane = builderISG("polyurethane")
        .ingot(2).liquid()
        .color(0xeffcef)
        .iconSet(DULL)
        .components(GTMaterials.Carbon, 17, GTMaterials.Hydrogen, 16, GTMaterials.Nitrogen, 2, GTMaterials.Oxygen, 4)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    ThoriumDopedTungsten = builderISG("thoria_doped_tungsten")
        .ingot(2).liquid()
        .color(GTMaterials.Tungsten.getMaterialRGB())
        .iconSet(SHINY)
        .components(GTMaterials.Thorium, 1, GTMaterials.Tungsten, 9)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    WoodsGlass = builderISG("woods_glass")
        .ingot(2).liquid()
        .color(0x730099)
        .iconSet(SHINY)
        .components(GTMaterials.SiliconDioxide, 1, GTMaterials.Barium, 1, GTMaterials.Oxygen, 1, GTMaterials.Garnierite, 1, GTMaterials.SodaAsh, 1)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    BariumTitanate = builderISG("barium_titanate")
        .ingot(2).liquid()
        .color(0x99FF99)
        .iconSet(SHINY)
        .components(GTMaterials.Barium, 1, GTMaterials.Titanium, 1, GTMaterials.Oxygen, 3)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    TantalumHafniumSeaborgiumCarbide = builderISG("tantalum_hafnium_seaborgium_carbide")
        .ingot(6).liquid()
        .color(0x2c2c2c)
        .iconSet(SHINY)
        .components(GTMaterials.Tantalum, 12, GTMaterials.Hafnium, 3, GTMaterials.Seaborgium, 1, GTMaterials.Carbon, 16)
        .flags(DISABLE_DECOMPOSITION)
        .blastTemp(5200)
        .buildAndRegister();

    BismuthRuthenate = builderISG("bismuth_ruthenate")
        .ingot(2).liquid()
        .color(0x94cf5c)
        .iconSet(DULL)
        .components(GTMaterials.Bismuth, 2, GTMaterials.Ruthenium, 2, GTMaterials.Oxygen, 7)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    BismuthIridiate = builderISG("bismuth_iridiate")
        .ingot(5).liquid()
        .color(0x478a6b)
        .iconSet(DULL)
        .components(GTMaterials.Bismuth, 2, GTMaterials.Iridium, 2, GTMaterials.Oxygen, 7)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    PEDOT = builderISG("pedot")
        .ingot(5).liquid()
        .color(0x5cef20)
        .iconSet(DULL)
        .components(GTMaterials.Carbon, 6, GTMaterials.Hydrogen, 6, GTMaterials.Oxygen, 2, GTMaterials.Sulfur, 1)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    RutheniumDioxide = builderISG("ruthenium_dioxide")
        .ingot(2).liquid()
        .color(GTMaterials.RutheniumTetroxide.getMaterialRGB())
        .iconSet(DULL)
        .components(GTMaterials.Ruthenium, 1, GTMaterials.Oxygen, 2)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    GermaniumTungstenNitride = builderISG("germanium_tungsten_nitride")
        .ingot(2).liquid()
        .color(0x8f8fcf)
        .iconSet(DULL)
        .components(GTMaterials.Germanium, 3, GTMaterials.Tungsten, 3, GTMaterials.Nitrogen, 10)
        .blastTemp(5400)
        .buildAndRegister();

    LithiumNiobate = builderISG("lithium_niobate")
        .ingot(6).liquid()
        .color(0xcfcf3a)
        .iconSet(SHINY)
        .components(GTMaterials.Lithium, 1, GTMaterials.Niobium, 1, GTMaterials.Oxygen, 4)
        .flags(DISABLE_DECOMPOSITION)
        .blastTemp(6700)
        .buildAndRegister();

    HeavyQuarkDegenerateMatter = builderISG("heavy_quark_degenerate_matter")
        .ingot(6).liquid()
        .color(0x5dbd3a)
        .iconSet(SHINY)
        .blastTemp(13000)
        .buildAndRegister();

    SuperheavyHAlloy = builderISG("superheavy_h_alloy")
        .ingot(6).liquid()
        .color(0xE84B36)
        .iconSet(SHINY)
        .components(GTMaterials.Copernicium, 1, GTMaterials.Nihonium, 1, ISGMaterials.MetastableFlerovium, 1, GTMaterials.Moscovium, 1, GTMaterials.Livermorium, 1, GTMaterials.Tennessine, 1, ISGMaterials.MetastableOganesson, 1)
        .flags(DISABLE_DECOMPOSITION)
        .blastTemp(10600)
        .buildAndRegister();

    SuperheavyLAlloy = builderISG("superheavy_l_alloy")
        .ingot(6).liquid()
        .color(0x2B45DF)
        .iconSet(SHINY)
        .components(GTMaterials.Rutherfordium, 1, GTMaterials.Dubnium, 1, GTMaterials.Seaborgium, 1, GTMaterials.Bohrium, 1, ISGMaterials.MetastableHassium, 1, GTMaterials.Meitnerium, 1, GTMaterials.Roentgenium, 1)
        .flags(DISABLE_DECOMPOSITION)
        .blastTemp(10600)
        .buildAndRegister();

    QCDMatter = builderISG("qcd_confined_matter")
        .ingot(7).liquid()
        .color(0xeb9e3f)
        .iconSet(SHINY)
        .blastTemp(13100)
        .buildAndRegister();

    Periodicium = builderISG("periodicium")
        .ingot(6).liquid()
        .color(0x3d4bf6)
        .iconSet(SHINY)
        .components(GTMaterials.Hydrogen, 1, GTMaterials.Helium, 1, GTMaterials.Lithium, 1, GTMaterials.Beryllium, 1, GTMaterials.Boron, 1, GTMaterials.Carbon, 1, GTMaterials.Nitrogen, 1, GTMaterials.Oxygen, 1, GTMaterials.Fluorine, 1, GTMaterials.Neon, 1, GTMaterials.Sodium, 1, GTMaterials.Magnesium, 1, GTMaterials.Aluminium, 1, GTMaterials.Silicon, 1, GTMaterials.Phosphorus, 1, GTMaterials.Sulfur, 1, GTMaterials.Chlorine, 1, GTMaterials.Argon, 1, GTMaterials.Potassium, 1, GTMaterials.Calcium, 1, GTMaterials.Scandium, 1, GTMaterials.Titanium, 1, GTMaterials.Vanadium, 1, GTMaterials.Chromium, 1, GTMaterials.Manganese, 1, GTMaterials.Iron, 1, GTMaterials.Cobalt, 1, GTMaterials.Nickel, 1, GTMaterials.Copper, 1, GTMaterials.Zinc, 1, GTMaterials.Gallium, 1, GTMaterials.Germanium, 1, GTMaterials.Arsenic, 1, GTMaterials.Selenium, 1, GTMaterials.Bromine, 1, GTMaterials.Krypton, 1, GTMaterials.Rubidium, 1, GTMaterials.Strontium, 1, GTMaterials.Yttrium, 1, GTMaterials.Zirconium, 1, GTMaterials.Niobium, 1, GTMaterials.Molybdenum, 1, GTMaterials.Technetium, 1, GTMaterials.Ruthenium, 1, GTMaterials.Rhodium, 1, GTMaterials.Palladium, 1, GTMaterials.Silver, 1, GTMaterials.Cadmium, 1, GTMaterials.Indium, 1, GTMaterials.Tin, 1, GTMaterials.Antimony, 1, GTMaterials.Tellurium, 1, GTMaterials.Iodine, 1, GTMaterials.Xenon, 1, GTMaterials.Caesium, 1, GTMaterials.Barium, 1, GTMaterials.Lanthanum, 1, GTMaterials.Cerium, 1, GTMaterials.Praseodymium, 1, GTMaterials.Neodymium, 1, GTMaterials.Promethium, 1, GTMaterials.Samarium, 1, GTMaterials.Europium, 1, GTMaterials.Gadolinium, 1, GTMaterials.Terbium, 1, GTMaterials.Dysprosium, 1, GTMaterials.Holmium, 1, GTMaterials.Erbium, 1, GTMaterials.Thulium, 1, GTMaterials.Ytterbium, 1, GTMaterials.Lutetium, 1, GTMaterials.Hafnium, 1, GTMaterials.Tantalum, 1, GTMaterials.Tungsten, 1, GTMaterials.Rhenium, 1, GTMaterials.Osmium, 1, GTMaterials.Iridium, 1, GTMaterials.Platinum, 1, GTMaterials.Gold, 1, GTMaterials.Mercury, 1, GTMaterials.Thallium, 1, GTMaterials.Lead, 1, GTMaterials.Bismuth, 1, GTMaterials.Polonium, 1, GTMaterials.Astatine, 1, GTMaterials.Radon, 1, GTMaterials.Francium, 1, GTMaterials.Radium, 1, GTMaterials.Actinium, 1, GTMaterials.Thorium, 1, GTMaterials.Protactinium, 1, GTMaterials.Uranium238, 1, GTMaterials.Neptunium, 1, GTMaterials.Plutonium241, 1, GTMaterials.Americium, 1, GTMaterials.Curium, 1, GTMaterials.Berkelium, 1, GTMaterials.Californium, 1, GTMaterials.Einsteinium, 1, GTMaterials.Fermium, 1, GTMaterials.Mendelevium, 1, GTMaterials.Rutherfordium, 1, GTMaterials.Dubnium, 1, GTMaterials.Seaborgium, 1, GTMaterials.Bohrium, 1, ISGMaterials.MetastableHassium, 1, GTMaterials.Meitnerium, 1, GTMaterials.Roentgenium, 1, GTMaterials.Copernicium, 1, GTMaterials.Nihonium, 1, ISGMaterials.MetastableFlerovium, 1, GTMaterials.Moscovium, 1, GTMaterials.Livermorium, 1, GTMaterials.Tennessine, 1, ISGMaterials.MetastableOganesson, 1)
        .flags(DISABLE_DECOMPOSITION)
        .blastTemp(13500)
        .buildAndRegister();

    CosmicNeutronium = builderISG("cosmic_neutronium")
        .ingot(7).liquid()
        .color(0x323232)
        .iconSet(SHINY)
        .components(GTMaterials.Neutronium, 1)
        .flags(DISABLE_DECOMPOSITION)
        .blastTemp(14100)
        .buildAndRegister();

    NaquadriaticTaranium = builderISG("naquadriatic_taranium")
        .ingot(1).liquid()
        .color((GTMaterials.Naquadria.getMaterialRGB()+ISGMaterials.Taranium.getMaterialRGB()) / 2)
        .iconSet(SHINY)
        .components(GTMaterials.Naquadria, 1, ISGMaterials.Taranium, 1)
        .blastTemp(11200)
        .buildAndRegister();

    Polyimide = builderISG("polyimide")
        .ingot(1).liquid()
        .color(0xFF7F50)
        .iconSet(DULL)
        .components(GTMaterials.Carbon, 22, GTMaterials.Hydrogen, 12, GTMaterials.Nitrogen, 2, GTMaterials.Oxygen, 6)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    FluorinatedEthylenePropylene = builderISG("fluorinated_ethylene_propylene")
        .ingot(1).liquid()
        .color(0xC8C8C8)
        .iconSet(DULL)
        .components(GTMaterials.Carbon, 5, GTMaterials.Fluorine, 10)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    NaquadricSolution = builderISG("naquadric_solution")
        .liquid()
        .color(0x232225)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("NqNO2", true);

    EnrichedNaquadricSolution = builderISG("enriched_naquadric_solution")
        .liquid()
        .color(0x312735)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq+NO2", true);

    NaquadriaticSolution = builderISG("naquadriatic_solution")
        .liquid()
        .color(0x312735)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("*Nq*NO2", true);

    AntimonyPentafluoride = builderISG("antimony_pentafluoride")
        .liquid()
        .color(GTMaterials.Antimony.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("SbF5", true);

    FluoronaquadricAcid = builderISG("fluoronaquadric_acid")
        .liquid()
        .color(0x485d60)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2NqF4", true);

    EnrichedFluoronaquadricAcid = builderISG("enriched_fluoronaquadric_acid")
        .liquid()
        .color(0x485d60)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2Nq+F4", true);

    FluoronaquadriaticAcid = builderISG("fluoronaquadriatic_acid")
        .liquid()
        .color(0x485d60)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2*Nq*F4");

    NaquadahDifluoride = builderISG("naquadah_difluoride")
        .liquid()
        .color(0x324649)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("NqF2", true);

    EnrichedNaquadahDifluoride = builderISG("enriched_naquadah_difluoride")
        .liquid()
        .color(0x141e1f)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq+F2", true);

    NaquadriaDifluoride = builderISG("naquadria_difluoride")
        .liquid()
        .color(0x141e1f)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("*Nq*F2", true);

    NaquadriaHexafluoride = builderISG("naquadria_hexafluoride")
        .liquid()
        .color(0x111c27)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("*Nq*F6", true);

    RadonDifluoride = builderISG("radon_difluoride")
        .liquid()
        .color(0x9966ff)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("RnF2", true);

    RadonNaquadriaoctafluoride = builderISG("radon_naquadriaoctafluoride")
        .liquid()
        .color(0x111c27)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Rd*Nq*F8", true);

    XenonTrioxide = builderISG("xenon_trioxide")
        .liquid()
        .color(0x432791)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("XeO3", true);

    CesiumFluoride = builderISG("cesium_fluoride")
        .liquid()
        .color(0xabab69)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("CsF");

    CesiumXenontrioxideFluoride = builderISG("cesium_xenontrioxide_fluoride")
        .liquid()
        .color(0x3333cc)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("CsXeO3F", true);

    RadonTrioxide = builderISG("radon_trioxide")
        .liquid()
        .color(0x9966ff)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("RnO3", true);

    NaquadriaCesiumXenonNonfluoride = builderISG("naquadria_cesium_xenon_nonfluoride")
        .liquid()
        .color(0x1c1c5e)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("*Nq*CsXeF9", true);

    NitrylFluoride = builderISG("nitryl_fluoride")
        .liquid()
        .color(GTMaterials.NitricOxide.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("NO2F", true);

    NitrosoniumOctafluoroxenate = builderISG("nitrosonium_octafluoroxenate")
        .liquid()
        .color(0x3f3f83)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(NO2)2XeF8", true);

    NaquadriaCesiumfluoride = builderISG("naquadria_cesiumfluoride")
        .liquid()
        .color(0x636379)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("*Nq*F2CsF", true);

    EnrichedNaquadahhexafluoride = builderISG("enriched_naquadahhexafluoride")
        .liquid()
        .color(0x030330)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq+F6", true);

    EnrichedXenonHexafluoronaquadate = builderISG("enriched_xenon_hexafluoronaquadate")
        .liquid()
        .color(0x1e1ec2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("XeNq+F6", true);

    AuricChloride = builderISG("auric_chloride")
        .liquid()
        .color(0xdffb50)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Au2Cl6", true);

    BromineTrifluoride = builderISG("bromine_trifluoride")
        .liquid()
        .color(0xfcde1d)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("BrF3", true);

    XenoauricFluoroantimonicAcid = builderISG("xenoauric_fluoroantimonic_acid")
        .liquid()
        .color(0x685b08)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("XeAuSbF6", true);

    NaquadahSulfate = builderISG("naquadah_sulfate")
        .liquid()
        .color(0x38330f)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("NqSO4", true);

    NaquadahSolution = builderISG("naquadah_solution")
        .liquid()
        .color(0x523b3a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("NqNH4NO3", true);

    ClearNaquadahLiquid = builderISG("clear_naquadah_liquid")
        .liquid()
        .color(0xa89f9e)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq?");

    ComplicatedNaquadahGas = builderISG("complicated_naquadah_gas")
        .liquid()
        .color(0x403d3d)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq??");

    ComplicatedHeavyNaquadah = builderISG("complicated_heavy_naquadah")
        .liquid()
        .color(0x403d3d)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq??");

    ComplicatedMediumNaquadah = builderISG("complicated_medium_naquadah")
        .liquid()
        .color(0x403d3d)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq??");

    ComplicatedLightNaquadah = builderISG("complicated_light_naquadah")
        .liquid()
        .color(0x403d3d)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq??");

    NaquadahGas = builderISG("naquadah_gas")
        .liquid()
        .color(0x575757)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq");

    LightNaquadah = builderISG("light_naquadah")
        .liquid()
        .color(0x2e2e2e)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq");

    MediumNaquadah = builderISG("medium_naquadah")
        .liquid()
        .color(0x2e2e2e)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq");

    HeavyNaquadah = builderISG("heavy_naquadah")
        .liquid()
        .color(0x2e2e2e)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq");

    FCrackedLightNaquadah = builderISG("fl_cracked_light_naquadah")
        .liquid()
        .color(0x505e5b)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("FlNq");

    FCrackedMediumNaquadah = builderISG("fl_cracked_medium_naquadah")
        .liquid()
        .color(0x505e5b)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("FlNq");

    FCrackedHeavyNaquadah = builderISG("fl_cracked_heavy_naquadah")
        .liquid()
        .color(0x505e5b)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("FlNq");

    LightNaquadahFuel = builderISG("light_naquadah_fuel")
        .liquid()
        .color(0x2e2e2e)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq");

    MediumNaquadahFuel = builderISG("medium_naquadah_fuel")
        .liquid()
        .color(0x2e2e2e)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq");

    HeavyNaquadahFuel = builderISG("heavy_naquadah_fuel")
        .liquid()
        .color(0x2e2e2e)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq");

    AmmoniumNitrate = builderISG("ammonium_nitrate")
        .liquid()
        .color(GTMaterials.Ammonia.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("NH4NO3", true);

    ENaquadahSolution = builderISG("e_naquadah_solution")
        .liquid()
        .color(0x523b3a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq+?");

    ClearENaquadahLiquid = builderISG("clear_e_naquadah_liquid")
        .liquid()
        .color(0xa89f9e)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq+?");

    ComplicatedHeavyENaquadah = builderISG("complicated_heavy_e_naquadah")
        .liquid()
        .color(0x403d3d)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq+??");

    ComplicatedMediumENaquadah = builderISG("complicated_medium_e_naquadah")
        .liquid()
        .color(0x403d3d)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq+??");

    ComplicatedLightENaquadah = builderISG("complicated_light_e_naquadah")
        .liquid()
        .color(0x403d3d)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq+??");

    LightENaquadah = builderISG("light_e_naquadah")
        .liquid()
        .color(0x2e2e2e)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq+");

    MediumENaquadah = builderISG("medium_e_naquadah")
        .liquid()
        .color(0x2e2e2e)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq+");

    HeavyENaquadah = builderISG("heavy_e_naquadah")
        .liquid()
        .color(0x2e2e2e)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq+");

    RnCrackedLightNaquadah = builderISG("rn_cracked_light_e_naquadah")
        .liquid()
        .color(0x505e5b)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("RnNq+");

    RnCrackedMediumENaquadah = builderISG("rn_cracked_medium_e_naquadah")
        .liquid()
        .color(0x505e5b)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("RnNq+");

    RnCrackedHeavyENaquadah = builderISG("rn_cracked_heavy_e_naquadah")
        .liquid()
        .color(0x505e5b)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("RnNq+");

    LightENaquadahFuel = builderISG("light_e_naquadah_fuel")
        .liquid()
        .color(0x2e2e2e)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq+");

    MediumENaquadahFuel = builderISG("medium_e_naquadah_fuel")
        .liquid()
        .color(0x2e2e2e)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq+");

    HeavyENaquadahFuel = builderISG("heavy_e_naquadah_fuel")
        .liquid()
        .color(0x2e2e2e)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq+");

    HyperFuelI = builderISG("hyper_fluid_i")
        .liquid()
        .color(0xfaff5e)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq(Nq+)(*Nq*)RfPu");

    HyperFuelII = builderISG("hyper_fluid_ii")
        .liquid()
        .color(0xd8db67)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq(Nq+)(*Nq*)DbCm");

    HyperFuelIII = builderISG("hyper_fluid_iii")
        .liquid()
        .color(0x8f9146)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq(Nq+)(*Nq*)AdCf");

    HyperFuelIV = builderISG("hyper_fluid_iv")
        .liquid()
        .color(0x4d4e31)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq(Nq+)(*Nq*)AdCfNtTn");

    AcidicSaltWater = builderISG("acidic_salt_water")
        .liquid()
        .color(0x006960)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2SO4(NaCl)3(H2O)3Cl2", true);

    SulfuricBromineSolution = builderISG("sulfuric_bromine_solution")
        .liquid()
        .color(0xff5100)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2SO4Br(H2O)Cl2", true);

    HotVapourMixture = builderISG("hot_vapour_mixture")
        .liquid()
        .color(0xff5100)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2SO4Br(H2O)2Cl2", true);

    DampBromine = builderISG("damp_bromine")
        .liquid()
        .color(0xe17594)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Br(H2O)", true);

    Ethylhexanol = builderISG("ethylhexanol")
        .liquid()
        .color(0xfeea9a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C8H18O", true);

    DiethylhexylPhosphoricAcid = builderISG("di_ethylhexyl_phosphoric_acid")
        .liquid()
        .color(0xffff99)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C16H35O4P", true);

    RareEarthHydroxidesSolution = builderISG("rare_earth_hydroxides_solution")
        .liquid()
        .color(0xcfb37d)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("NaOH(H2O)?(OH)3", true);

    RareEarthChloridesSolution = builderISG("rare_earth_chlorides_solution")
        .liquid()
        .color(0x164b45)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(?Cl3)H2O", true);

    LaNdOxidesSolution = builderISG("la_nd_oxides_solution")
        .liquid()
        .color(0x9ce3db)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(La2O3)(Pr2O3)(Nd2O3)(Ce2O3)", true);

    SmGdOxidesSolution = builderISG("sm_gd_oxides_solution")
        .liquid()
        .color(0xffff99)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(Sc2O3)(Eu2O3)(Gd2O3)(Sm2O3)", true);

    TbHoOxidesSolution = builderISG("tb_ho_oxides_solution")
        .liquid()
        .color(0x99ff99)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(Y2O3)(Tb2O3)(Dy2O3)(Ho2O3)", true);

    ErLuOxidesSolution = builderISG("er_lu_oxides_solution")
        .liquid()
        .color(0xffb3ff)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(Er2O3)(Tm2O3)(Yb2O3)(Lu2O3)", true);

    SupercooledCryotheum = builderISG("supercooled_cryotheum")
        .liquid()
        .color(ISGMaterials.Cryotheum.getMaterialRGB()-10)
        .iconSet(FLUID)
        .buildAndRegister();

    Turpentine = builderISG("turpentine")
        .liquid()
        .color(0x93bd46)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C10H16", true);

    Acetylene = builderISG("acetylene")
        .liquid()
        .color(0x959c60)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C2H2", true);

    PropargylAlcohol = builderISG("propargyl_alcohol")
        .liquid()
        .color(0xbfb32a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("CHCCH2OH", true);

    PropargylChloride = builderISG("propargyl_chloride")
        .liquid()
        .color(0x918924)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("HC2CH2Cl", true);

    Citral = builderISG("citral")
        .liquid()
        .color(0xf2e541)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C10H16O", true);

    BetaIonone = builderISG("beta_ionone")
        .liquid()
        .color(0xdc5ce6)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C13H20O", true);

    VitaminA = builderISG("vitamin_a")
        .liquid()
        .color(0x8d5c91)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C20H30O", true);

    EthyleneOxide = builderISG("ethylene_oxide")
        .liquid()
        .color(0xa0c3de)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C2H4O", true);

    Ethanolamine = builderISG("ethanolamine")
        .liquid()
        .color(0x6f7d87)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("HOCH2CH2NH2", true);

    Biotin = builderISG("biotin")
        .liquid()
        .color(0x68cc6a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C10H16N2O3S", true);

    B27Supplement = builderISG("b27_supplement")
        .liquid()
        .color(0x386939)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C142H230N36O44S", true);

    CleanAmmoniaSolution = builderISG("clear_ammonia_solution")
        .liquid()
        .color(0x53c9a0)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("NH3(H2O)", true);

    Catalase = builderISG("catalase")
        .liquid()
        .color(0xdb6596)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

    Blood = builderISG("blood")
        .liquid()
        .color(0x5c0606)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Blood");

    BloodCells = builderISG("blood_cells")
        .liquid()
        .color(0xad2424)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("???");

    BloodPlasma = builderISG("blood_plasma")
        .liquid()
        .color(0xe37171)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("???");

    BFGF = builderISG("bfgf")
        .liquid()
        .color(0xb365e0)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("bFGF");

    EGF = builderISG("egf")
        .liquid()
        .color(0x815799)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C257H381N73O83S7", true);

    NitroBenzene = builderISG("nitro_benzene")
        .liquid()
        .color(0x81c951)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6H5NO2", true);

    Aniline = builderISG("aniline")
        .liquid()
        .color(0x4c911d)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6H5NH2", true);

    ChlorosulfonicAcid = builderISG("chlorosulfonic_acid")
        .liquid()
        .color(0x916c1d)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("HSO3Cl", true);

    Sulfanilamide = builderISG("sulfanilamide")
        .liquid()
        .color(0x523b0a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6H8N2O2S", true);

    SilicaGelBase = builderISG("silica_gel_base")
        .liquid()
        .color(0x27a176)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("SiO2(HCl)(NaOH)(H2O)", true);

    Ethanol100 = builderISG("ethanol_100")
        .liquid()
        .color(GTMaterials.Ethanol.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C2H5OH", true);

    PiranhaSolution = builderISG("piranha_solution")
        .liquid()
        .color(0x4820ab)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2SO4)H2O2", true);

    WaterAgarMix = builderISG("water_agar_mix")
        .liquid()
        .color(0x48dbbe)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2O?", true);

    BacterialGrowthMedium = builderISG("bacterial_growth_medium")
        .liquid()
        .color(0x0b2e12)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("For Bacteria");

    DepletedGrowthMedium = builderISG("depleted_growth_medium")
        .liquid()
        .color(0x071209)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Depleted");

    AnimalCells = builderISG("animal_cells")
        .liquid()
        .color(0xc94996)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("???");

    RapidlyReplicatingAnimalCells = builderISG("rapidly_replicating_animal_cells")
        .liquid()
        .color(0x7a335e)
        .iconSet(FLUID)
        .buildAndRegister();

    MycGene = builderISG("myc_gene")
        .liquid()
        .color(0x445724)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

    Oct4Gene = builderISG("oct_4_gene")
        .liquid()
        .color(0x374f0d)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

    SOX2Gene = builderISG("sox_2_gene")
        .liquid()
        .color(0x5d8714)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

    KFL4Gene = builderISG("kfl_4_gene")
        .liquid()
        .color(0x759143)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

    Cas9 = builderISG("cas_9")
        .liquid()
        .color(0x5f6e46)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

    GenePlasmids = builderISG("pluripotency_induction_gene_plasmids")
        .liquid()
        .color(0xabe053)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

    Chitin = builderISG("chitin")
        .liquid()
        .color(0xcbd479)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

    Chitosan = builderISG("chitosan")
        .liquid()
        .color(0xb1bd42)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

    GeneTherapyFluid = builderISG("pluripotency_induction_gene_therapy_fluid")
        .liquid()
        .color(0x6b2f66)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

    Resin = builderISG("resin")
        .liquid()
        .color(0x3d2f11)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

    LinoleicAcid = builderISG("linoleic_acid")
        .liquid()
        .color(0xD5D257)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C18H32O2", true);

    SiliconFluoride = builderISG("silicon_fluoride")
        .liquid()
        .color(0xB2B4B4)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("SiF4", true);

    CarbonFluoride = builderISG("carbone_fluoride")
        .liquid()
        .color(0xE6E6E6)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("CF4", true);

    PhosphorusTrichloride = builderISG("phosphorus_trichloride")
        .liquid()
        .color((GTMaterials.Phosphorus.getMaterialRGB()+GTMaterials.Chlorine.getMaterialRGB())/2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("PCl3", true);

    PhosphorylChloride = builderISG("phosphoryl_chloride")
        .liquid()
        .color(0xE6E6E6)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("POCl3", true);

    TributylPhosphate = builderISG("tributyl_phosphate")
        .liquid()
        .color(0x7C5B2C)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(C4H9)3PO4", true);

    Butanol = builderISG("butanol")
        .liquid()
        .color((GTMaterials.FermentedBiomass.getMaterialRGB()+20))
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C4H9OH", true);

    RedOil = builderISG("red_oil")
        .liquid()
        .color(0x7C1500)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2N4(RP-1)NiZnFe4", true);

    SodiumCyanide = builderISG("sodium_cyanide")
        .liquid()
        .color(0x5f7c8c)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("NaCN");

    GoldCyanide = builderISG("gold_cyanide")
        .liquid()
        .color(0x8c8761)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("AuCN");

    ChlorideLeachedSolution = builderISG("chloride_leached_solution")
        .liquid()
        .color(0x41472e)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("CaCl2(CuCl2)(PbCl2)(BiCl3)(FeCl2)", true);

    MolybdenumFlue = builderISG("molybdenum_flue_gas")
        .liquid()
        .color(0x333338)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2OReS?", true);

    RheniumSulfuricSolution = builderISG("rhenium_sulfuric_solution")
        .liquid()
        .color(0xbabaff)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("ReS?");

    AmmoniumSulfate = builderISG("ammonium_sulfate")
        .liquid()
        .color(0x6464f5)
        .iconSet(FLUID)
        .buildAndRegister();

    AmmoniumPerrhenate = builderISG("ammonium_perrhenate")
        .liquid()
        .color(0x1c1c45)
        .iconSet(FLUID)
        .buildAndRegister();

    ElectronDegenerateRheniumPlasma = builderISG("degenerate_rhenium_plasma")
        .plasma()
        .color(0x6666FF)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Rh");

    LiquidHelium = builderISG("liquid_helium")
        .liquid()
        .color(GTMaterials.Helium.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("He");

    BoricAcid = builderISG("boric_acid")
        .liquid()
        .color(0xD5D2D7)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H3BO3", true);

    FluoroBoricAcid = builderISG("fluoroboric_acid")
        .liquid()
        .color(0xD5D2D7)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("HBF4", true);

    BenzenediazoniumTetrafluoroborate = builderISG("benzenediazonium_tetrafluoroborate")
        .liquid()
        .color(0xD5D2D7)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6H5BF4N2", true);

    BoronFluoride = builderISG("boron_fluoride")
        .liquid()
        .color(0xD5D2D7)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("BF3", true);

    FluoroBenzene = builderISG("fluoro_benzene")
        .liquid()
        .color(0xD5D2D7)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6H5F", true);

    SodiumNitrateSolution = builderISG("sodium_nitrate_solution")
        .liquid()
        .color(0xA09ED7)
        .iconSet(FLUID)
        .buildAndRegister();

    Fluorotoluene = builderISG("fluorotoluene")
        .liquid()
        .color(0xE0DA99)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C7H7F", true);

    OrthoXylene = builderISG("ortho_xylene")
        .liquid()
        .color(0xB9575E)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6H4(CH3)2", true);

    OrthoXyleneZeoliteMixture = builderISG("ortho_xylene_zeolite")
        .liquid()
        .color(0xB9785E)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(NaC4Si27Al9(H2O)28O72)C6H4(CH3)2", true);

    ParaXylene = builderISG("para_xylene")
        .liquid()
        .color(0xB9575E)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6H4(CH3)2", true);

    Dibromomethylbenzene = builderISG("dibromomethylbenzene")
        .liquid()
        .color(0x0A1D2C)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C7H6Br2", true);

    Isochloropropane = builderISG("isochloropropane")
        .liquid()
        .color(0xD5DD95)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("CH3CClCH3", true);

    Resorcinol = builderISG("resorcinol")
        .liquid()
        .color(0xD5DDBE)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6H6O2", true);

    Dinitrodipropanyloxybenzene = builderISG("dinitrodipropanyloxybenzene")
        .liquid()
        .color(0x83945F)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C12H16O2(NO2)2", true);

    Naphthaldehyde = builderISG("napthaldehyde")
        .liquid()
        .color(0xBCA853)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C10H7CHO", true);

    HydrobromicAcid = builderISG("hydrobromic_acid")
        .liquid()
        .color(0xBC6C53)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("HBr");

    ThionylChloride = builderISG("thionyl_chloride")
        .liquid()
        .color(0xF9F7E5)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("SOCl2", true);

    Diisopropylcarbodiimide = builderISG("diisopropylcarbodiimide")
        .liquid()
        .color(0xA0CFFE)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C7H14N2", true);

    Pyridine = builderISG("pyridine")
        .liquid()
        .color((GTMaterials.Ammonia.getMaterialRGB()+GTMaterials.Formaldehyde.getMaterialRGB())/2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C5H5N", true);

    Phenylpentanoicacid = builderISG("phenylpentanoicacid")
        .liquid()
        .color((GTMaterials.Butene.getMaterialRGB()+GTMaterials.CarbonMonoxide.getMaterialRGB())/2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C11H14O2", true);

    Dimethylsulfide = builderISG("dimethylsulfide")
        .liquid()
        .color((GTMaterials.Methanol.getMaterialRGB()+GTMaterials.HydrogenSulfide.getMaterialRGB())/2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(CH3)2S", true);

    BenzoylChloride = builderISG("benzoyl_chloride")
        .liquid()
        .color((GTMaterials.Toluene.getMaterialRGB()+ISGMaterials.ThionylChloride.getMaterialRGB())/2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C7H5ClO", true);

    Silvertetrafluoroborate = builderISG("silvertetrafluoroborate")
        .liquid()
        .color((ISGMaterials.SilverOxide.getMaterialRGB()+ISGMaterials.BoronFluoride.getMaterialRGB())/2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("AgBF4", true);

    PCBA = builderISG("pcba")
        .liquid()
        .color((GTMaterials.Chlorobenzene.getMaterialRGB()+Dimethylsulfide.getMaterialRGB()+Phenylpentanoicacid.getMaterialRGB())/3)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C72H14O2", true);

    PCBS = builderISG("pcbs")
        .liquid()
        .color((GTMaterials.Styrene.getMaterialRGB()+PCBA.getMaterialRGB()-40)/2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C80H21O2", true);

    Ferrocene = builderISG("ferrocene")
        .liquid()
        .color((GTMaterials.Water.getMaterialRGB()+GTMaterials.Chlorine.getMaterialRGB()+GTMaterials.Iron.getMaterialRGB())/3)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C10H10Fe", true);

    Ferrocenylfulleropyrrolidine = builderISG("ferrocenylfulleropyrddolidine")
        .liquid()
        .color((Ferrocene.getMaterialRGB()+GTMaterials.Ethylene.getMaterialRGB()+ GTMaterials.CarbonMonoxide.getMaterialRGB())/3)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C74H19FeN", true);

    Hydroquinone = builderISG("hydroquinone")
        .liquid()
        .color((GTMaterials.Oxygen.getMaterialRGB()+GTMaterials.Propene.getMaterialRGB())/2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6H4(OH)2", true);

    SodiumAcetate = builderISG("sodium_acetate")
        .liquid()
        .color((GTMaterials.Sodium.getMaterialRGB()+GTMaterials.AceticAnhydride.getMaterialRGB())/2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C2H3NaO2", true);

    Methylamine = builderISG("methylamine")
        .liquid()
        .color((GTMaterials.Methanol.getMaterialRGB()+GTMaterials.Ammonia.getMaterialRGB())/2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("CH3NH2", true);

    Phosgene = builderISG("phosgene")
        .liquid()
        .color((GTMaterials.Chlorine.getMaterialRGB()+GTMaterials.CarbonMonoxide.getMaterialRGB())/2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("COCl2", true);

    IsopropylAlcohol = builderISG("isopropyl_alcohol")
        .liquid()
        .color((GTMaterials.Water.getMaterialRGB()+GTMaterials.Propene.getMaterialRGB())/2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C3H8O", true);

    VanadiumWasteSolution = builderISG("vanadium_waste_solution")
        .liquid()
        .color(0xbf95f5)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("NaCl(Na2SO4)(SiO2)(Al(OH)3)", true);

    UranylChlorideSolution = builderISG("uranyl_chloride_solution")
        .liquid()
        .color(0xdfe018)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("UO2Cl2(H2O)?", true);

    UranylNitrateSolution = builderISG("uranyl_nitrate_solution")
        .liquid()
        .color(0xdfe018)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("UO2(NO3)2(H2O)?]", true);

    UraniumSulfateWasteSolution = builderISG("uranium_sulfate_waste_solution")
        .liquid()
        .color(0xdfe018)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("PbRaSr(H2SO4)", true);

    PurifiedUranylNitrate = builderISG("purified_uranyl_nitrate_solution")
        .liquid()
        .color(0xeff028)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("UO2(NO3)2(H2O)", true);

    UraniumDiuranate = builderISG("uranium_diuranate")
        .liquid()
        .color(0xeff028)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(NH4)2U2O7", true);

    UraniumRefinementWasteSolution = builderISG("uranium_refinement_waste_solution")
        .liquid()
        .color(0xeff028)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2SO4C?", true);

    ThoriumNitrateSolution = builderISG("thorium_nitrate_solution")
        .liquid()
        .color(0x33bd45)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Th(NO3)4(H2O)", true);

    SodiumHexafluoroaluminate = builderISG("sodium_hexafluoroaluminate")
        .liquid()
        .color((GTMaterials.Sodium.getMaterialRGB()+GTMaterials.Aluminium.getMaterialRGB()+GTMaterials.Fluorine.getMaterialRGB())/3)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Na3AlF6", true);

    SodiumSulfateSolution = builderISG("sodium_sulfate_solution")
        .liquid()
        .color((ISGMaterials.SodiumSulfate.getMaterialRGB()+30))
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Na2SO4(H2O) ", true);

    RichNitrogenMix = builderISG("rich_nitrogen_mix")
        .liquid()
        .color(0x6891d8)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2O(CH4)?", true);

    OxidisedNitrogenMix = builderISG("oxidised_nitrogen_mix")
        .liquid()
        .color(0x708ACD)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)2(CH4)??", true);

    PurifiedNitrogenMix = builderISG("purified_nitrogen_mix")
        .liquid()
        .color(0x6891d8)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)2(CH4)?", true);

    CarbonatedEthanolamine = builderISG("carbonated_ethanolamine")
        .liquid()
        .color(0x6f7d87)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2NCH2CH2OHC", true);

    AmmoniaRichMix = builderISG("ammonia_rich_mix")
        .liquid()
        .color(0x2f5d99)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("NH3((H2O)2(CH4)?)", true);

    DissolvedLithiumOre = builderISG("dissolved_lithium_ores")
        .liquid()
        .color(0x664850)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("LiAlO2(H2SO4)", true);

    LithiumCarbonateSolution = builderISG("lithium_carbonate_solution")
        .liquid()
        .color((GTMaterials.Lithium.getMaterialRGB()+GTMaterials.Carbon.getMaterialRGB()+GTMaterials.Oxygen.getMaterialRGB())/3)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Li2CO3(H2O)", true);

    LithiumChlorideSolution = builderISG("lithium_chloride_solution")
        .liquid()
        .color((GTMaterials.Lithium.getMaterialRGB()+GTMaterials.Chlorine.getMaterialRGB()))
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("LiCl(H2O)", true);

    CalicheIodateBrine = builderISG("caliche_iodate_brine")
        .liquid()
        .color(0xffe6660)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)NaNO3KNO3KClNaIO3", true);

    IodideSolution = builderISG("iodide_solution")
        .liquid()
        .color(0x08081c)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)NaNO3KNO3KClNaI", true);

    CalicheNitrateSolution = builderISG("caliche_nitrate_solution")
        .liquid()
        .color(0xffe6660)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)NaNO3KNO3KClNaOH", true);

    CalicheIodineBrine = builderISG("caliche_iodine_brine")
        .liquid()
        .color(0xffe6660)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)NaNO3KNO3KClNaOHI", true);

    KeroseneIodineSolution = builderISG("kerosene_iodine_solution")
        .liquid()
        .color(0x08081c)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C12H26I", true);

    IodizedBrine = builderISG("iodized_brine")
        .liquid()
        .color(0x525242)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("I?");

    IodineBrineMix = builderISG("iodine_brine_mix")
        .liquid()
        .color(0x525242)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("I??");

    IodineSlurry = builderISG("iodine_slurry")
        .liquid()
        .color(0x08081c)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("I?");

    Brine = builderISG("brine")
        .liquid()
        .color(0xfcfc8a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

    MesitylOxide = builderISG("mesityl_oxide")
        .liquid()
        .color(GTMaterials.Acetone.getMaterialRGB()-10)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6H10O", true);

    MethylIsobutylKetone = builderISG("methyl_isobutyl_ketone")
        .liquid()
        .color((MesitylOxide.getMaterialRGB()+WaterAgarMix.getMaterialRGB())/2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6H12O", true);

    ThiocyanicAcid = builderISG("thiocyanic_acid")
        .liquid()
        .color(0xfcfc30)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("HSCN");

    ZrHfSeparationMix = builderISG("zrhf_separation_mix")
        .liquid()
        .color(0xfcfc95)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

    ZrHfChloride = builderISG("zrhf_chloride")
        .liquid()
        .color(0x51d351)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("ZrHfCl4", true);

    ZrHfOxyChloride = builderISG("zrhf_oxychloride")
        .liquid()
        .color(0x51d351)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Cl2HfOZr", true);

    ZirconChlorinatingResidue = builderISG("zircon_chlorinating_residue")
        .liquid()
        .color(0x51d351)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(SiCl4)Co?", true);

    ZincExhaustMixture = builderISG("zinc_exhaust_mixture")
        .liquid()
        .color((GTMaterials.CarbonDioxide.getMaterialRGB()+GTMaterials.SulfurDioxide.getMaterialRGB())/2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(SO2)(CO2)?", true);

    ZincSlagSlurry = builderISG("zinc_slag_slurry")
        .liquid()
        .color((GTMaterials.Zinc.getMaterialRGB()-20))
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2O?", true);

    MetalRichSlagSlurry = builderISG("metal_slag_slurry")
        .liquid()
        .color((GTMaterials.Zinc.getMaterialRGB()-10))
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

    AcidicMetalSlurry = builderISG("acidic_metal_slurry")
        .liquid()
        .color((GTMaterials.Zinc.getMaterialRGB()-10+GTMaterials.PhosphoricAcid.getMaterialRGB())/2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H3PO4?", true);

    SeparatedMetalSlurry = builderISG("separated_metal_slurry")
        .liquid()
        .color((GTMaterials.Zinc.getMaterialRGB()-20))
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H3PO4?", true);

    MetalHydroxideMix = builderISG("metal_hydroxide_mix")
        .liquid()
        .color((GTMaterials.Zinc.getMaterialRGB()-30))
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?ZnOH");

    ZincPoorMix = builderISG("zinc_poor_mix")
        .liquid()
        .color((GTMaterials.Iron.getMaterialRGB()-10))
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?Fe");

    IronPoorMix = builderISG("iron_poor_mix")
        .liquid()
        .color((GTMaterials.Copper.getMaterialRGB()+10))
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?In");

    IndiumHydroxideConcentrate = builderISG("indium_hydroxide_concentrate")
        .liquid()
        .color((GTMaterials.Indium.getMaterialRGB()+GTMaterials.Hydrogen.getMaterialRGB()+10)/2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("In(OH)3", true);

    CadmiumThalliumLiquor = builderISG("cdtl_liquor")
        .liquid()
        .color((GTMaterials.Cadmium.getMaterialRGB()+GTMaterials.Thallium.getMaterialRGB()+GTMaterials.RareEarth.getMaterialRGB())/3)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2SO4)CdTl", true);

    ZincAmalgam = builderISG("zinc_amalgam")
        .liquid()
        .color((GTMaterials.Zinc.getMaterialRGB()-20))
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("ZnHg");

    CadmiumSulfateSolution = builderISG("cadmium_sulfate")
        .liquid()
        .color((GTMaterials.Cadmium.getMaterialRGB()+GTMaterials.SulfuricAcid.getMaterialRGB())/2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("CdSO4?", true);

    ThalliumSulfateSolution = builderISG("thallium_sulfate")
        .liquid()
        .color((GTMaterials.Thallium.getMaterialRGB()+GTMaterials.SulfuricAcid.getMaterialRGB())/2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Tl2SO4?", true);

    PolyphenolMix = builderISG("polyphenol_mix")
        .liquid()
        .color((GTMaterials.Phenol.getMaterialRGB()+10))
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

    AcidifiedPolyphenolMix = builderISG("acidified_polyphenol_mix")
        .liquid()
        .color((PolyphenolMix.getMaterialRGB()+GTMaterials.SulfuricAcid.getMaterialRGB())/2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

    Diethylether = builderISG("diethylether")
        .liquid()
        .color(AcidifiedPolyphenolMix.getMaterialRGB()-20)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(C2H5)2O", true);

    TannicAcid = builderISG("tannic_acid")
        .liquid()
        .color((Diethylether.getMaterialRGB()+AcidifiedPolyphenolMix.getMaterialRGB())/4)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C76H52O46", true);

    GermanicAcidSolution = builderISG("germanic_acid_solution")
        .liquid()
        .color((GTMaterials.Germanium.getMaterialRGB()-10))
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H4GeO4", true);

    GermaniumChloride = builderISG("germanium_chloride")
        .liquid()
        .color((GTMaterials.Germanium.getMaterialRGB()+GTMaterials.Chlorine.getMaterialRGB())/2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("GeCl4", true);

    SodiumHydroxideSolution = builderISG("sodium_hydroxide_solution")
        .liquid()
        .color(GTMaterials.SodiumHydroxide.getMaterialRGB()+50)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)NaOH", true);

    LithiumHydroxideSolution = builderISG("lithium_hydroxide_solution")
        .liquid()
        .color((GTMaterials.Lithium.getMaterialRGB()+GTMaterials.Oxygen.getMaterialRGB()+GTMaterials.Hydrogen.getMaterialRGB())/3)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)LiOH", true);

    LithiumPeroxideSolution = builderISG("lithium_peroxide")
        .liquid()
        .color((GTMaterials.Lithium.getMaterialRGB()+GTMaterials.Oxygen.getMaterialRGB())/2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)Li2O2", true);

    Ozone = builderISG("ozone")
        .liquid()
        .color(0x0099FF)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("O3", true);

    NitrogenPentoxide = builderISG("nitrogen_pentoxide")
        .liquid()
        .color(0x0033C0)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("N2O5", true);

    AcryloNitrile = builderISG("acrylonitrile")
        .liquid()
        .color(0x9999ff)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("CH2CHCN", true);

    SodiumThiocyanate = builderISG("sodium_thiocyanate")
        .liquid()
        .color((GTMaterials.Sodium.getMaterialRGB()+GTMaterials.Sulfur.getMaterialRGB())/2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("NaSCN");

    PolyacrylonitrileSolution = builderISG("polyacrylonitrile_solution")
        .liquid()
        .color(0x9999ff)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(C3H3N)n(NaSCN)", true);

    MethylFormate = builderISG("methyl_formate")
        .liquid()
        .color(0Xff9999)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("HCOOCH3", true);

    WetFormamide = builderISG("wet_formamide")
        .liquid()
        .color(0x33CCFF)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)CH3NO", true);

    HydroxylamineDisulfate = builderISG("hydroxylamine_disulfate")
        .liquid()
        .color(0x99add6)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(NH3OH)2(NH4)2(SO4)2", true);

    Hydroxylamine = builderISG("hydroxylamine")
        .liquid()
        .color(0x99cc99)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H3NO", true);

    Amidoxime = builderISG("amidoxime")
        .liquid()
        .color(0x66ff33)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H3N2O(CH)", true);

    PureUranylNitrateSolution = builderISG("pure_uranyl_nitrate")
        .liquid()
        .color(0x33bd45)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)UO2(NO3)2", true);

    CarbonSulfide = builderISG("carbon_sulfide")
        .liquid()
        .color(0x40ffbf)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("CS2", true);

    AmineMixture = builderISG("amine_mixture")
        .liquid()
        .color((GTMaterials.Methanol.getMaterialRGB()-20+GTMaterials.Ammonia.getMaterialRGB()-10)/2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(NH3)CH4", true);

    DimethylthiocarbamoilChloride = builderISG("dimethylthiocarbamoil_chloride")
        .liquid()
        .color(0xd9ff26)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(CH3)2NC(S)Cl", true);

    Trimethylamine = builderISG("trimetylamine")
        .liquid()
        .color((GTMaterials.Dimethylamine.getMaterialRGB()+20))
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(CH3)3N", true);

    Mercaptophenol = builderISG("mercaptophenol")
        .liquid()
        .color(0xbaaf18)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6H6OS", true);

    Dimethylformamide = builderISG("dimethylformamide")
        .liquid()
        .color(0x42bdff)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(CH3)2NCH", true);

    Oct1ene = builderISG("1_octene")
        .liquid()
        .color(0x7e8778)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C8H16", true);

    CetaneTrimethylAmmoniumBromide = builderISG("cetane_trimethyl_ammonium_bromide")
        .liquid()
        .color(0xb9c1c9)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C19H42BrN", true);

    AmmoniumPersulfate = builderISG("ammonium_persulfate")
        .liquid()
        .color(0x6464f5)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(NH4)2S2O8", true);

    DebrominatedWater = builderISG("debrominated_brine")
        .liquid()
        .color(0x0000ff)
        .iconSet(FLUID)
        .buildAndRegister();

    SeaWater = builderISG("sea_water")
        .liquid()
        .color(0x0000FF)
        .iconSet(FLUID)
        .buildAndRegister();

    ConcentratedBrine = builderISG("concentrated_brine")
        .liquid()
        .color(0xfcfc95)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

    CalciumFreeBrine = builderISG("calcium_free_brine")
        .liquid()
        .color(0xfcfca6)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

    SodiumFreeBrine = builderISG("sodium_free_brine")
        .liquid()
        .color(0xfcfcb1)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

    PotassiumFreeBrine = builderISG("potassium_free_brine")
        .liquid()
        .color(0xfcfcbc)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

    BoronFreeSolution = builderISG("boron_free_solution")
        .liquid()
        .color(0xfcfccd)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

    SodiumLithiumSolution = builderISG("sodium_lithium_solution")
        .liquid()
        .color(0xfcfccd)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("NaLi?");

    ChilledBrine = builderISG("chilled_brine")
        .liquid()
        .color(0xfcfc95)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

    MagnesiumContainingBrine = builderISG("magnesium_containing_brine")
        .liquid()
        .color(0xfcfcbc)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Mg?");

    BrominatedBrine = builderISG("brominated_brine")
        .liquid()
        .color(0xfdd48d)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Br?");

    AcidicBrominatedBrine = builderISG("acidic_brominated_brine")
        .liquid()
        .color(0xfdd48d)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2SO4)Cl?", true);

    ButylLithium = builderISG("butyl_lithium")
        .liquid()
        .color((GTMaterials.Butane.getMaterialRGB()+GTMaterials.Lithium.getMaterialRGB())/2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C4H9Li", true);

    Acetaldehyde = builderISG("acetaldehyde")
        .liquid()
        .color(0xFF9933)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C2H4O", true);

    Benzaldehyde = builderISG("benzaldehyde")
        .liquid()
        .color(0xb26f22)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C7H6O", true);

    Dibenzylideneacetone = builderISG("dibenzylideneacetone")
        .liquid()
        .color(0Xcc6699)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C17H14O", true);

    TrimethyltinChloride = builderISG("trimethyltin_chloride")
        .liquid()
        .color(0x8c8075)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(CH3)3SnCl", true);

    ChloroPlatinicAcid = builderISG("chloroplatinic_acid")
        .liquid()
        .color(0xffba54)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2PtCl6", true);

    Cyclooctadiene = builderISG("cyclooctadiene")
        .liquid()
        .color(0x33CC33)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C8H12", true);

    Cycloparaphenylene = builderISG("cycloparaphenylene")
        .liquid()
        .color(0x333333)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("CPP");

    SuperheavyMix = builderISG("superheavy_mix")
        .liquid()
        .color(0x403737)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("SgBhRfDb");

    NeutronPlasma = builderISG("neutron_plasma")
        .liquid()
        .color(0xf0e9e9)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("n");

    HotMetastableOganesson = builderISG("hot_oganesson")
        .liquid()
        .color(0x521973)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Og");

    TitaniumTetrafluoride = builderISG("titanium_tetrafluoride")
        .liquid()
        .color(GTMaterials.Titanium.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister();

    Titanium50Tetrafluoride = builderISG("titanium50_tetrafluoride")
        .liquid()
        .color(GTMaterials.Titanium.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister();

    Carbon12 = builderISG("carbon_12")
        .liquid()
        .color(GTMaterials.Carbon.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C_12", true);

    Carbon13 = builderISG("carbon_13")
        .liquid()
        .color(GTMaterials.Carbon.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C_13", true);

    Nitrogen14 = builderISG("nitrogen_14")
        .liquid()
        .color(GTMaterials.Nitrogen.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("N_14", true);

    NItrogen15 = builderISG("nitrogen_15")
        .liquid()
        .color(GTMaterials.Nitrogen.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("N_15", true);

    CNOcatalyst = builderISG("cno_catalyst")
        .liquid()
        .color((GTMaterials.Nitrogen.getMaterialRGB() + GTMaterials.Carbon.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(C_12)(C_13)(N_14)(N_15)", true);

    Calcium44 = builderISG("calcium_44")
        .liquid()
        .color(GTMaterials.Calcium.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Ca_44", true);

    OgannesonBreedingBase = builderISG("og_breeding_base")
        .liquid()
        .color(((GTMaterials.Titanium.getMaterialRGB() + 0xA85A12) / 2))
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(Ti_50)Cf_252", true);

    QuassifissioningPlasma = builderISG("quasifissioning_plasma")
        .liquid()
        .color(0xD5CB54)
        .iconSet(FLUID)
        .buildAndRegister();

    Ytterbium178 = builderISG("ytterbium_178")
        .liquid()
        .color(GTMaterials.Ytterbium.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Yb_178", true);

    FlYbPlasma = builderISG("flyb_plasma")
        .liquid()
        .color((GTMaterials.Ytterbium.getMaterialRGB() + 0x521973) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("FlYb");

    Chromium48 = builderISG("chromium48")
        .liquid()
        .plasma()
        .color(GTMaterials.Chromium.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Cr_48", true);

    Iron52 = builderISG("iron52")
        .liquid()
        .plasma()
        .color(GTMaterials.Iron.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Fe_52", true);

    Nickel56 = builderISG("nickel56")
        .liquid()
        .plasma()
        .color(GTMaterials.Nickel.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Ni_56", true);

    Titanium44 = builderISG("titanium44")
        .liquid()
        .plasma()
        .color(GTMaterials.Titanium.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Ti_44", true);

    HeliumCNO = builderISG("helium_rich_cno")
        .liquid()
        .plasma()
        .color(0x59ffa6)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("He?");

    SeleniteTelluriteMix = builderISG("selenite_tellurite_mixture")
        .liquid()
        .color(0x765A30)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("TeO2SeO2(Na2CO3)2", true);

    SeleniteSolution = builderISG("selenite_solution")
        .liquid()
        .color(0xc1c46a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Na2SeO3", true);

    CopperRefiningSolution = builderISG("copper_refining_solution")
        .liquid()
        .color(0x765A30)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("CuH2SO4", true);

    SodiumHydroxideBauxite = builderISG("sodium_hydroxide_bauxite")
        .liquid()
        .color(0xbf731a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Al2H2O4", true);

    ImpureAluminiumHydroxideSolution = builderISG("impure_aloh3_soution")
        .liquid()
        .color(0xd8653e)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)Al(OH)3?");

    PureAluminiumHydroxideSolution = builderISG("pure_aloh3_soution")
        .liquid()
        .color((GTMaterials.Aluminium.getMaterialRGB()+GTMaterials.Oxygen.getMaterialRGB()+ GTMaterials.Hydrogen.getMaterialRGB()+40)/2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)Al2(OH)6", true);

    RedMud = builderISG("red_mud")
        .liquid()
        .color(0xcc3300)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("HCl?");

    NeutralisedRedMud = builderISG("neutralised_red_mud")
        .liquid()
        .color(0xcc3300)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Fe??");

    FerricREEChloride = builderISG("ferric_ree_chloride")
        .liquid()
        .color(0x30301a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Fe?");

    RedSlurry = builderISG("red_slurry")
        .liquid()
        .color(0xcc3300)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("TiO2?", true);

    TitanylSulfate = builderISG("titanyl_sulfate")
        .liquid()
        .color(0xdc3d7c)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("TiO(SO4)", true);

    DiluteNitricAcid = builderISG("dilute_nitric_acid")
        .liquid()
        .color((GTMaterials.NitricAcid.getMaterialRGB() + GTMaterials.Water.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)HNO3", true);

    NbTaSeparationMixture = builderISG("nbta_separation_mixture")
        .liquid()
        .color(0xbcac93)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C18H39O5P", true);

    FluoroniobicAcid = builderISG("fluroniobic_acid")
        .liquid()
        .color(0x73ff00)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("NbHF7", true);

    FluorotantalicAcid = builderISG("flurotantalic_acid")
        .liquid()
        .color(0x73ff00)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("TaHF7", true);

    NbTaFluorideMix = builderISG("nbta_fluoride_mix")
        .liquid()
        .color(0xbcac93)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2NbOF5)(H2TaF7)", true);

    OxypentafluoroNiobate = builderISG("oxypentafluoroniobate")
        .liquid()
        .color(0x73ff00)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2NbOF5", true);

    HeptafluoroTantalate = builderISG("heptafluorotantalate")
        .liquid()
        .color(0x73ff00)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2TaF7", true);

    REEThUSulfateSolution = builderISG("reethu_sulfate_solution")
        .liquid()
        .color(0x89be5c)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?SO4", true);

    RareEarthNitrateSolution = builderISG("rare_earth_nitrate_solution")
        .liquid()
        .color(0xcfb37d)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?NO3", true);

    AlkalineEarthSulfateSolution = builderISG("alkalineearth_sulfate")
        .liquid()
        .color(0xe6ebff)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?SO4", true);

    WetEthyleneOxide = builderISG("wet_etylene_oxide")
        .liquid()
        .color(0x90b3ff)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)C2H4O", true);

    EthyleneGlycol = builderISG("ethylene_glycol")
        .liquid()
        .color(0x8080fa)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C2H6O2", true);

    Chloroethanol = builderISG("chloroethanol")
        .liquid()
        .color(0xcfb050)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C2H5ClO", true);

    Choline = builderISG("choline")
        .liquid()
        .color(0x63e45f)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C5H14NO", true);

    ATL = builderISG("atl")
        .liquid()
        .color(0x709c4a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("ATL");

    HotNitrogen = builderISG("hot_nitrogen")
        .liquid()
        .color(GTMaterials.Nitrogen.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("N");

    ViscoelasticPolyurethane = builderISG("viscoelastic_polyurethane")
        .liquid()
        .color(0xeffcef)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C17H16N2O4?", true);

    ViscoelasticPolyurethaneFoam = builderISG("viscoelastic_polyurethane_foam")
        .liquid()
        .color(0xeffcef)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C17H16N2O4?", true);

    CalciumCarbonateSolution = builderISG("calcium_carbonate_solution")
        .liquid()
        .color(GTMaterials.Calcite.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)CaCO3", true);

    BariumSulfateSolution = builderISG("barium_sulfate_solution")
        .liquid()
        .color(GTMaterials.Barite.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)BaSO4", true);

    BentoniteClaySlurry = builderISG("bentonite_clay_solution")
        .liquid()
        .color(0xdbc9c5)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2O?", true);

    DrillingMud = builderISG("drilling_mud")
        .liquid()
        .color(0x996600)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("For the Void Miner");

    UsedDrillingMud = builderISG("used_drilling_mud")
        .liquid()
        .color(0x998833)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Used Mud");

    TolueneDiisocyanate = builderISG("toluene_diisocyanate")
        .liquid()
        .color(0xbaf6ca)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C9H6N2O2", true);

    HydroselenicAcid = builderISG("hydroselenic_acid")
        .liquid()
        .color(GTMaterials.Selenium.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2Se", true);

    Aminophenol = builderISG("aminophenol")
        .liquid()
        .color(0xafca3a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6H4(OH)(NH2)", true);

    Hydroxyquinoline = builderISG("hydroxyquinoline")
        .liquid()
        .color(0x3a9a71)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C9H7NO", true);

    Perbromothiophene = builderISG("perbromothiophene")
        .liquid()
        .color(0x87cc17)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C4Br4S", true);

    Diethoxythiophene = builderISG("dietoxythiophene")
        .liquid()
        .color(0x90ff43)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C4H2(OC2H5)2S", true);

    EDOT = builderISG("ethylenedioxythiophene")
        .liquid()
        .color(0x7a9996)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C2H4O2C4H2S", true);

    CitricAcid = builderISG("citric_acid")
        .liquid()
        .color(0xffcc00)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6H8O7", true);

    OxalicAcid = builderISG("oxalic_acid")
        .liquid()
        .color(0x4aaae2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("HOOCCOOH");

    Trimethylchlorosilane = builderISG("trimethylchlorosilane")
        .liquid()
        .color(GTMaterials.Dimethyldichlorosilane.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(CH3)3SiCl", true);

    Dibromoacrolein = builderISG("dibromoacrolein")
        .liquid()
        .color(0x4a4a4a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C2H2Br2O2", true);

    Bromohydrothiine = builderISG("bromodihydrothiine")
        .liquid()
        .color(0x40ff3a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C4H4S2Br2", true);

    Bromobutane = builderISG("bromobutane")
        .liquid()
        .color(0xff3333)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("CH3(CH2)3Br", true);

    AstatideSolution = builderISG("astatide_solution")
        .liquid()
        .color(0x6df63f)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("At(H2O)(SO3)", true);

    Biperfluoromethanedisulfide = builderISG("biperfluoromethanedisulfide")
        .liquid()
        .color(0x3ada40)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C2F6S2", true);

    BariumTriflateSolution = builderISG("barium_triflate_solution")
        .liquid()
        .color((GTMaterials.Barium.getMaterialRGB()+GTMaterials.Fluorine.getMaterialRGB())/2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)3(Hg)C2BaF6O6S2", true);

    BariumStrontiumAcetateSolution = builderISG("basr_acetate_solution")
        .liquid()
        .color(0x9a9b98)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C2H3BaO2Sr", true);

    TitaniumIsopropoxide = builderISG("titanium_isopropoxide")
        .liquid()
        .color(0xFF0066)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Ti(OCH(CH3)2)4", true);

    BariumChlorideSolution = builderISG("barium_chloride_solution")
        .liquid()
        .color((GTMaterials.Barium.getMaterialRGB()+GTMaterials.Chlorine.getMaterialRGB())/2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)BaCl3", true);

    IronCarbonyl = builderISG("iron_carbonyl")
        .liquid()
        .color(0xff8000)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Fe?");

    PurifiedIronCarbonyl = builderISG("purified_iron_carbonyl")
        .liquid()
        .color(0xff8000)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Fe");

    BismuthNitrateSoluton = builderISG("bismuth_nitrate_solution")
        .liquid()
        .color((GTMaterials.Bismuth.getMaterialRGB()+GTMaterials.Chlorine.getMaterialRGB())/2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)Bi(NO3)3", true);

    BariumTitanatePreparation = builderISG("barium_titanate_preparation")
        .liquid()
        .color(0x99FF99)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("BaTiO3", true);

    BariumStrontiumTitanatePreparation = builderISG("basr_titanate_preparation")
        .liquid()
        .color(0xFF0066)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(BaTiO3)C2H3BaO2Sr", true);

    CarbonTetrachloride = builderISG("carbon_tetrachloride")
        .liquid()
        .color(0x2d8020)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("CCl4", true);

    Chloroethane = builderISG("chloroethane")
        .liquid()
        .color(0x33aa33)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("CH3CH2Cl", true);

    ActiniumSuperhydridePlasma = builderISG("actinium_superhydride_plasma")
        .liquid()
        .color(GTMaterials.Actinium.getMaterialRGB() * 9 / 8)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("AcH12", true);

    Diborane = builderISG("diborane")
        .liquid()
        .color(GTMaterials.Boron.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(BH3)2");

    IsopropylAcetate = builderISG("isopropyl_acetate")
        .liquid()
        .color((GTMaterials.Strontium.getMaterialRGB()+IsopropylAlcohol.getMaterialRGB()+GTMaterials.Water.getMaterialRGB())/3)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(CH3)2CHCOOCH3", true);

    ChlorinatedSolvents = builderISG("chlorinated_solvents")
        .liquid()
        .color(0x40804c)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(CH4)2Cl5", true);

    Dichloromethane = builderISG("dichloromethane")
        .liquid()
        .color(GTMaterials.Chloromethane.getMaterialRGB()-10)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("CH2Cl2", true);

    ButanolGas = builderISG("butanol_gas")
        .liquid()
        .color(Butanol.getMaterialRGB()+20)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C4H9OH", true);

    Tributylamine = builderISG("tributylamine")
        .liquid()
        .color(0x801a80)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(C4H9)3N", true);

    CrudeAluminaSolution = builderISG("crude_alumina_solution")
        .liquid()
        .color((GTMaterials.Aluminium.getMaterialRGB()-30))
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(Al(NO3)3)2(CH2Cl2)(C12H27N)", true);

    AluminaSolution = builderISG("alumina_solution")
        .liquid()
        .color((GTMaterials.Aluminium.getMaterialRGB()-15))
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(Al2O3)(CH2Cl2)(C12H27N)2", true);

    UnprocessedNdYAGSolution = builderISG("unprocessed_ndyag_solution")
        .liquid()
        .color(0xcf8acf)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nd:YAG");

    AmmoniumCyanate = builderISG("ammonium_cyanate")
        .liquid()
        .color(0x3a5dcf)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("NH4CNO", true);

    Ethylenediamine = builderISG("ethylenediamine")
        .liquid()
        .color(Ethanolamine.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C2H4(NH2)2", true);

    EDTASolution = builderISG("edta_solution")
        .liquid()
        .color(0x0026d9)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(C10H16N2O8)3(C2H8N2)O2", true);

    EDTA = builderISG("edta")
        .liquid()
        .color(0x0026d9)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C10H16N2O8", true);

    Glycine = builderISG("glycine")
        .liquid()
        .color((Ethylenediamine.getMaterialRGB()+GTMaterials.Formaldehyde.getMaterialRGB())/2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("NH2CH2COOH", true);

    PrYHoNitrateSolution = builderISG("pryho_nitrate_solution")
        .liquid()
        .color(0x00f2b2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(Y(NO3)3)6(Pr(NO3)3)2(Nd(NO3)3)2(H2O)15", true);

    PhosphorousArsenicSolution = builderISG("phosphorous_arsenic_solution")
        .liquid()
        .color(GTMaterials.PhosphoricAcid.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("AsCd(HPO4)10", true);

    FluorosilicicAcid = builderISG("fluorosilicic_acid")
        .liquid()
        .color(0x2ccf2a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2SiF6", true);

    AmmoniumFluoride = builderISG("ammonium_fluoride")
        .liquid()
        .color(GTMaterials.AmmoniumChloride.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("NH4F", true);

    AmmoniumBifluorideSolution = builderISG("ammonium_bifluoride_solution")
        .liquid()
        .color((GTMaterials.Ammonia.getMaterialRGB()+GTMaterials.Fluorine.getMaterialRGB())/2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)NH4FHF", true);

    LuTmYChlorideSolution = builderISG("lutmy_chloride_solution")
        .liquid()
        .color(0x00f2b2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(YCl3)6(LuCl3)2(TmCl3)2(H2O)15", true);

    MercuryNitrate = builderISG("mercury_nitrate")
        .liquid()
        .color(0xd6b8ad)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Hg(NO3)2", true);

    BismuthVanadateSolution = builderISG("bismuth_vanadate_solution")
        .liquid()
        .color(0xffff00)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)BiVO4", true);

    Nitrotoluene = builderISG("nitrotoluene")
        .liquid()
        .color(0xfcca00)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C7H7NO2", true);

    Naphthylamine = builderISG("naphthylamine")
        .liquid()
        .color(0xe3e81c)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C10H9N", true);

    Acetoacetanilide = builderISG("acetoacetanilide")
        .liquid()
        .color(0xffffc2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C10H11NO2", true);

    Quinizarin = builderISG("quinizarin")
        .liquid()
        .color(0x3c5a2c0)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C14H8O4", true);

    Toluenesulfonate = builderISG("toluenesulfonate")
        .liquid()
        .color(0x8f8f00)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C7H7SO3Na", true);

    Isopropylsuccinate = builderISG("isopropylsuccinate")
        .liquid()
        .color(0xb26680)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C7H12O4", true);

    MaleicAnhydride = builderISG("maleic_anhydride")
        .liquid()
        .color(0x3c20ad)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C4H2O3", true);

    Benzonitrile = builderISG("benzonitrile")
        .liquid()
        .color(0x2c2c9c)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C7H5N", true);

    SeaborgiumDopedNanotubes = builderISG("seaborgium_doped_nanotubes")
        .liquid()
        .color(0x2c2c8c)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("SgCNT");

    FullereneDopedNanotubes = builderISG("fullerene_doped_nanotubes")
        .liquid()
        .color(0x6c2c6c)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C60CNT", true);

    AmmoniumNiobiumOxalateSolution = builderISG("ammonium_niobium_oxalate_solution")
        .liquid()
        .color(0x6c6cac)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(NH4)C10Nb2O20", true);

    DielectricMirrorFormationMix = builderISG("dielectric_mirror_formation_mix")
        .liquid()
        .color(0xff992c)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("MgF2ZnSTa2Ti(C2H6O8)", true);

    LiquidZBLAN = builderISG("molten_zblan")
        .liquid()
        .color((GTMaterials.Zirconium.getMaterialRGB()+GTMaterials.Barium.getMaterialRGB()+GTMaterials.Lanthanum.getMaterialRGB()+GTMaterials.Aluminium.getMaterialRGB()+GTMaterials.Fluorine.getMaterialRGB())/5)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(ZrF4)18(BaF2)7(LaF3)2(AlF3)(NaF)7", true);

    ChlorousAcid = builderISG("chlorous_acid")
        .liquid()
        .color(0x2d6e8a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("HClO2", true);

    Amino3phenol = builderISG("3_aminophenol")
        .liquid()
        .color(Aminophenol.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6H7NO", true);

    Dimethylnaphthalene = builderISG("dimethylnaphthalene")
        .liquid()
        .color(0xe34fb0)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C12H12", true);

    IodineMonochloride = builderISG("iodine_monochloride")
        .liquid()
        .color(0x004c4c)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("ICl");

    AcetylatingReagent = builderISG("acetylating_reagent")
        .liquid()
        .color(0x8d5e63)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C9H12Si(MgBr)2", true);

    Dihydroiodotetracene = builderISG("dihydroiodotetracene")
        .liquid()
        .color(0x5c4d38)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2C18H11I", true);

    Dichlorodicyanobenzoquinone = builderISG("dichlorodicyanobenzoquinone")
        .liquid()
        .color(0x3a2aba)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C8Cl2N2O2", true);

    Dichlorodicyanohydroquinone = builderISG("dichlorodicyanohidroquinone")
        .liquid()
        .color(0x3a2aba)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C8Cl2N2(OH)2", true);

    IodobenzoicAcid = builderISG("iodobenzoic_acid")
        .liquid()
        .color(0x2cac6c0)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C7H5IO2", true);

    Methoxybenzaldehyde = builderISG("methoxybenzaldehyde")
        .liquid()
        .color(0x3c3a7a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C8H8O2", true);

    Butylaniline = builderISG("butylaniline")
        .liquid()
        .color(Aniline.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C10H15N", true);

    MBBA = builderISG("mbba")
        .liquid()
        .color(0xfa30fa)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C18H21NO", true);

    LiquidCrystalDetector = builderISG("liquid_crystal_detector")
        .liquid()
        .color(0xda20da)
        .iconSet(FLUID)
        .buildAndRegister();

    PotassiumEthoxide = builderISG("potassium_ethoxide")
        .liquid()
        .color(GTMaterials.Ethanol.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C2H5KO", true);

    TetraethylammoniumBromide = builderISG("tetraethylammonium_bromide")
        .liquid()
        .color(0xcc33ff)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C8H20NBr", true);

    Hexanediol = builderISG("hexanediol")
        .liquid()
        .color(EthyleneGlycol.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6H14O2", true);

    Hexamethylenediamine = builderISG("hexamethylenediamine")
        .liquid()
        .color(Ethylenediamine.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6H16N2", true);

    Tertbutanol = builderISG("tertbutanol")
        .liquid()
        .color(0xcccc2c)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C4H10O", true);

    Triaminoethaneamine = builderISG("triaminoethaneamine")
        .liquid()
        .color(0x6f7d87)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(NH2CH2CH2)3N", true);

    TertButylAzidoformate = builderISG("tertbuthylcarbonylazide")
        .liquid()
        .color(0x888818)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C5H9N3O2", true);

    AminatedFullerene = builderISG("aminated_fullerene")
        .liquid()
        .color(0x2c2caa)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C60N12H12", true);

    Azafullerene = builderISG("azafullerene")
        .liquid()
        .color(0x8a7a1a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C60N12H12", true);

    Ethylamine = builderISG("ethylamine")
        .liquid()
        .color(Ethylenediamine.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C2H5NH2", true);

    Trimethylsilane = builderISG("trimethylsilane")
        .liquid()
        .color(Trimethylchlorosilane.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C3H10Si", true);

    KryptonDifluoride = builderISG("krypton_difluoride")
        .liquid()
        .color(GTMaterials.Krypton.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("KrF2");

    QuarkGluonPlasma = builderISG("quark_gluon_plasma")
        .plasma()
        .color(0x8f00ff)
        .iconSet(FLUID)
        .buildAndRegister();

    HeavyQuarks = builderISG("heavy_quarks")
        .plasma()
        .color(0x008800)
        .iconSet(FLUID)
        .buildAndRegister();

    LightQuarks = builderISG("light_quarks")
        .liquid()
        .plasma()
        .color(0x0000ff)
        .iconSet(FLUID)
        .buildAndRegister();

    Gluons = builderISG("gluons")
        .liquid()
        .plasma()
        .color(0xfcfcfa)
        .iconSet(FLUID)
        .buildAndRegister();

    HeavyLeptonMix = builderISG("heavy_lepton_mix")
        .liquid()
        .plasma()
        .color(0x5adf52)
        .iconSet(FLUID)
        .buildAndRegister();

    CosmicComputingMix = builderISG("cosmic_computing_mix")
        .liquid()
        .plasma()
        .color(0xafad2f)
        .iconSet(FLUID)
        .buildAndRegister();

    HeavyQuarkEnrichedMix = builderISG("heavy_quark_enriched_mix")
        .liquid()
        .plasma()
        .color(0xefefef)
        .iconSet(FLUID)
        .buildAndRegister();

    DeuteriumSuperheavyMix = builderISG("deuterium_superheavy_mix")
        .liquid()
        .color(0xa2d2a4)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H_2)FlHsOg", true);

    ScandiumTitanium50Mix = builderISG("scandium_titanium50_mix")
        .liquid()
        .color((GTMaterials.Scandium.getMaterialRGB()+GTMaterials.Titanium.getMaterialRGB())/2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("ScTi_50");

    RadonRadiumMix = builderISG("radon_radium_mix")
        .liquid()
        .color((GTMaterials.Radium.getMaterialRGB()+GTMaterials.Radon.getMaterialRGB())/2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("RnRa");

    Phenylsodium = builderISG("phenylsodium")
        .liquid()
        .color(0x2c2cc8)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6H5Na", true);

    Difluoroaniline = builderISG("difluoroaniline")
        .liquid()
        .color(0x3fac4a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6H5F2N", true);

    Succinaldehyde = builderISG("succinaldehyde")
        .liquid()
        .color(0x7c6d9a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C4H6O2", true);

    NDifluorophenylpyrrole = builderISG("n_difluorophenylpyrrole")
        .liquid()
        .color(0x3a9aa9)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C10H7F2N", true);

    PhotopolymerSolution = builderISG("photopolymer_solution")
        .liquid()
        .color(0x8a526d)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C149H97N10O2(TiBF20)", true);

    Trichloroferane = builderISG("trichloroferane")
        .liquid()
        .color(0x521973)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("FlCl3", true);

    GlucoseIronSolution = builderISG("glucose_iron_solution")
        .liquid()
        .color((GTMaterials.Sugar.getMaterialRGB()+GTMaterials.Iron.getMaterialRGB())/2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(C6H12O6)FeCl3", true);

    GrapheneOxidationSolution = builderISG("graphene_oxidation_solution")
        .liquid()
        .color(0x96821a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(KMnO4)(NaNO3)(H2SO4)", true);

    SupercriticalCO2 = builderISG("supercritcal_co2")
        .liquid()
        .color(GTMaterials.CarbonDioxide.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("CO2", true);

    NobleGases = builderISG("noble_gases_mixture")
        .liquid()
        .color((GTMaterials.Helium.getMaterialRGB()+GTMaterials.Neon.getMaterialRGB()+GTMaterials.Argon.getMaterialRGB()+GTMaterials.Krypton.getMaterialRGB()+GTMaterials.Xenon.getMaterialRGB()+GTMaterials.Radon.getMaterialRGB()))
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("HeNeArKrXeRn");

    NonMetals = builderISG("non_metals")
        .liquid()
        .color((GTMaterials.Hydrogen.getMaterialRGB()+GTMaterials.Boron.getMaterialRGB()+GTMaterials.Carbon.getMaterialRGB()+GTMaterials.Nitrogen.getMaterialRGB()+GTMaterials.Oxygen.getMaterialRGB()+GTMaterials.Fluorine.getMaterialRGB()+GTMaterials.Phosphorus.getMaterialRGB()+GTMaterials.Sulfur.getMaterialRGB()+GTMaterials.Chlorine.getMaterialRGB()+GTMaterials.Arsenic.getMaterialRGB()+GTMaterials.Selenium.getMaterialRGB()+GTMaterials.Bromine.getMaterialRGB()+GTMaterials.Tellurium.getMaterialRGB()+GTMaterials.Iodine.getMaterialRGB()+GTMaterials.Astatine.getMaterialRGB()))
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("BCPSAsSeTeIAtONHFClBr");

    DenseNeutronPlasma = builderISG("dense_neutron_plasma")
        .liquid()
        .color(0xacecac)
        .iconSet(FLUID)
        .buildAndRegister();

    CosmicMeshPlasma = builderISG("cosmic_mesh_plasma")
        .liquid()
        .color(0x1c1c8c)
        .iconSet(FLUID)
        .buildAndRegister();

    SuperfluidHelium = builderISG("superfluid_helium")
        .liquid()
        .color(GTMaterials.Helium.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("He");

    LiquidEnrichedHelium = builderISG("liquid_enriched_helium")
        .liquid()
        .color(GTMaterials.Helium.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("HeHe-3");

    LiquidNitrogen = builderISG("liquid_nitrogen")
        .liquid()
        .color(GTMaterials.Nitrogen.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("N");

    Methylethanolamine = builderISG("methylethanolamine")
        .liquid()
        .color(0x6a3baa)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C3H9NO", true);

    Methylguanidine = builderISG("methylguanidine")
        .liquid()
        .color(0x5a9a3c)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C2H7N3", true);

    Methylnitronitrosoguanidine = builderISG("methylnitronitrosoguanidine")
        .liquid()
        .color(0x68b15d)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C2H5N5O3", true);

    IsoamylAlcohol = builderISG("isoamyl_alcohol")
        .liquid()
        .color(0xcaba77)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C5H12O", true);

    Octanol = builderISG("octanol")
        .liquid()
        .color(0xa2b8c2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C8H18O", true);

    Trioctylamine = builderISG("trioctylamine")
        .liquid()
        .color(0x87a2bc)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C24H51N", true);

    RheniumSeparationMixture = builderISG("rhenium_separation_mixture")
        .liquid()
        .color(0xed2c3a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C11H24", true);

    RheniumScrubbedSolution = builderISG("rhenium_scrubbed_solution")
        .liquid()
        .color(0xedccca)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Re?");

    NeutroniumDopedNanotubes = builderISG("neutronium_doped_nanotubes")
        .liquid()
        .color((GTMaterials.Neutronium.getMaterialRGB()+ISGMaterials.CarbonNanotubes.getMaterialRGB())/2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nt?");

    SupercriticalSteam = builderISG("supercritical_steam")
        .liquid()
        .color(GTMaterials.Steam.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2O", true);

    SupercriticalDeuterium = builderISG("supercritical_deuterium")
        .liquid()
        .color(GTMaterials.Deuterium.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H-2");

    SupercriticalSodiumPotassiumAlloy = builderISG("supercritical_sodium_potassium_alloy")
        .liquid()
        .color(ISGMaterials.SodiumPotassiumAlloy.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Na7K3", true);

    SupercriticalSodium = builderISG("supercritical_sodium")
        .liquid()
        .color(GTMaterials.Sodium.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Na");

    SupercriticalFLiNaK = builderISG("supercritical_flinak")
        .liquid()
        .color(ISGMaterials.FLiNaK.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("FLiNaK");

    SupercriticalFLiBe = builderISG("supercritical_flibe")
        .liquid()
        .color(ISGMaterials.FLiBe.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("FLiBe");

    SupercriticalLeadBismuthEutectic = builderISG("supercritical_lead_bismuth_eutectic")
        .liquid()
        .color(ISGMaterials.LeadBismuthEutectic.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Pb3Bi7", true);

    FreeAlphaGas = builderISG("free_alpha_gas")
        .liquid()
        .color(0xe0d407)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("a");

    FreeElectronGas = builderISG("free_electron_gas")
        .liquid()
        .color(0x044c4c)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("e-");

    HighEnergyQGP = builderISG("high_energy_qgp")
        .liquid()
        .plasma()
        .color(0x8f00ff)
        .iconSet(FLUID)
        .buildAndRegister();

    AcetylsulfanilylChloride = builderISG("acetylsulfanilyl_chloride")
        .liquid()
        .color((Aniline.getMaterialRGB() + GTMaterials.AceticAnhydride.getMaterialRGB() + ChlorosulfonicAcid.getMaterialRGB())/3)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C8H8ClNO3S", true);

    BenzoylPeroxide = builderISG("benzoyl_peroxide")
        .liquid()
        .color((GTMaterials.Barium.getMaterialRGB() + ISGMaterials.BenzoylChloride.getMaterialRGB())/2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C14H10O4", true);

    Propadiene = builderISG("propadiene")
        .liquid()
        .color((Butanol.getMaterialRGB()-20))
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C3H4", true);

    FluorophosphoricAcid = builderISG("fluorophosphoric_acid")
        .liquid()
        .color(PhosphorusTrichloride.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("HPF6", true);

    PhenylenedioxydiaceticAcid = builderISG("phenylenedioxydiacetic_acid")
        .liquid()
        .color(0x99546a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C10H10O6", true);

    Diethylthiourea = builderISG("diethylthiourea")
        .liquid()
        .color(0x2acaa4)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(C2H5NH)2CS", true);

    Isophthaloylbisdiethylthiourea = builderISG("isophthaloylbisdiethylthiourea")
        .liquid()
        .color(0x8a7b9c)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C18H26N4O2S2", true);

    SodiumAlginateSolution = builderISG("sodium_alginate_solution")
        .liquid()
        .color(0xca8642)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("NaC6H7O6", true);

    AscorbicAcid = builderISG("ascorbic_acid")
        .liquid()
        .color(0xe6cd00)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6H8O6", true);

    DehydroascorbicAcid = builderISG("dehydroascorbic_acid")
        .liquid()
        .color(0xe6cd00)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6H6O6", true);

    CaCBaSMixture = builderISG("cacbas_mixture")
        .liquid()
        .color((CalciumCarbonateSolution.getMaterialRGB() + BariumSulfateSolution.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister();

    LubricantClaySlurry = builderISG("lubricant_clay_slurry")
        .liquid()
        .color((GTMaterials.Lubricant.getMaterialRGB() + BentoniteClaySlurry.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister();

    ATLEthylene = builderISG("atl_ethylene_mixture")
        .liquid()
        .color((ATL.getMaterialRGB() + EthyleneGlycol.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister();

    DrillingMudMixture = builderISG("drilling_mud_mixture")
        .liquid()
        .color((CaCBaSMixture.getMaterialRGB() + LubricantClaySlurry.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister();

    Cyclopentadiene = builderISG("cyclopentadiene")
        .liquid()
        .color(Cyclooctadiene.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C5H6", true);

    ChloroauricAcid = builderISG("chloroauric_acid")
        .liquid()
        .color(0xDFD11F)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("HAuCl?");

    Helium4 = builderISG("helium4")
        .liquid()
        .color(GTMaterials.Helium.getMaterialRGB()-10)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("He-4");

    FermionicUUMatter = builderISG("fermionic_uu_matter")
        .liquid()
        .color(GTMaterials.UUMatter.getMaterialRGB() / 3)
        .iconSet(FLUID)
        .buildAndRegister();

    BosonicUUMatter = builderISG("bosonic_uu_matter")
        .liquid()
        .color(GTMaterials.UUMatter.getMaterialRGB() - FermionicUUMatter.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister();

    Oxydianiline = builderISG("oxydianiline")
        .liquid()
        .color(0xF0E130)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C12H12N2O", true);

    PolyamicAcid = builderISG("polyamic_acid")
        .liquid()
        .color(0xFFAE42)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C22H14N2O7", true);

    Hexafluoropropylene = builderISG("hexafluoropropylene")
        .liquid()
        .color(0x111111)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C3F6", true);

    Dimethylether = builderISG("dimethylether")
        .liquid()
        .color(0xe6cd11)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C2H6O", true);

    Dimethoxyethane = builderISG("dimethoxyethane")
        .liquid()
        .color(0x2acbb4)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C4H10O2", true);

    LithiumCyclopentadienide = builderISG("lithiumcyclopentadienide")
        .liquid()
        .color(0x95556a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("LiC5H5", true);

    CaliforniumCyclopentadienide = builderISG("californiumcyclopentadienide")
        .liquid()
        .color(0x94445b)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C15H15Cf", true);

    Soap = builderISG("soap")
        .liquid()
        .color(0xFFAE42)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

    DeglyceratedSoap = builderISG("deglyceratedsoap")
        .liquid()
        .color(0xFFAE41)
        .iconSet(FLUID)
        .buildAndRegister();

    StearicAcid = builderISG("stearicacid")
        .liquid()
        .color(0x2bbbb4)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C18H36O2", true);

    Trioctylphosphine = builderISG("trioctylphosphine")
        .liquid()
        .color(0xF1E130)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C24H51P", true);

    QuantumDots = builderISG("quantumdots")
        .liquid()
        .plasma()
        .color(0xff0000)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("CdSe");

    IridiumTrichlorideSolution = builderISG("iridiumtrichloridesolution")
        .liquid()
        .color(0x96821a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("IrCl3", true);

    SemisolidHydrogen = builderISG("semisolidhydrogen")
        .liquid()
        .color(0x044c4b)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H");

    MicrocrystallizingHydrogen = builderISG("microcrystallizinghydrogen")
        .liquid()
        .color(0x155d5c)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H");

    Toluidine = builderISG("toluidine")
        .liquid()
        .color((GTMaterials.Toluene.getMaterialRGB()+ Aniline.getMaterialRGB())/2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C7H9N", true);

    ApatiteAcidicLeach = builderISG("apatite_acidic_leach")
        .liquid()
        .color(GTMaterials.PhosphoricAcid.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H10P3O12Cl??", true);

    FluoroapatiteAcidicLeach = builderISG("fluoroapatite_acidic_leach")
        .liquid()
        .color(GTMaterials.PhosphoricAcid.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H10P3O12F??", true);

    NitrousAcid = builderISG("nitrous_acid")
        .liquid()
        .color(0x1e73b0)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("HNO2", true);

    HydroxylamineHydrochloride = builderISG("hydroxylamine_hydrochloride")
        .liquid()
        .color(((GTMaterials.Barium.getMaterialRGB()+GTMaterials.Chlorine.getMaterialRGB())/2 + 0xF0EAD6)/2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("HONH2HCl", true);

    SelenousAcid = builderISG("selenous_acid")
        .liquid()
        .color((0xFFFF66 + GTMaterials.Water.getMaterialRGB())/2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2SeO3", true);

    Glyoxal = builderISG("glyoxal")
        .liquid()
        .color(0xf2f068)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C2H2O2", true);

    BenzylChloride = builderISG("benzyl_chloride")
        .liquid()
        .color(0xaef7fc)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C7H7Cl", true);

    Benzylamine = builderISG("benzylamine")
        .liquid()
        .color(0x5c8082)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C7H9N", true);

    Tetrahydrofuran = builderISG("tetrahydrofuran")
        .liquid()
        .color(0xb7ebcd)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(CH2)4O", true);

    Triethylamine = builderISG("triethylamine")
        .liquid()
        .color(Ethylenediamine.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("N(CH2CH3)3", true);

    TetrafluoroboricAcid = builderISG("tetrafluoroboric_acid")
        .liquid()
        .color(Silvertetrafluoroborate.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("HBF4", true);

    BoronTrifluorideEtherate = builderISG("boron_trifluoride_etherate")
        .liquid()
        .color((BoronFluoride.getMaterialRGB()+Diethylether.getMaterialRGB())/2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(BF3)(C2H5)2O", true);

    BoraneDimethylsulfide = builderISG("borane_dimethylsulfide")
        .liquid()
        .color((Diborane.getMaterialRGB()+Dimethylsulfide.getMaterialRGB())/2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(BH3)(CH3)2S", true);

    Perfluorobenzene = builderISG("perfluorobenzene")
        .liquid()
        .color(0x226E22)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6F6", true);

    NitratedTriniiteSolution = builderISG("nitrated_triniite_solution")
        .liquid()
        .color(0x428c9f)
        .iconSet(FLUID)
        .buildAndRegister();

    ResidualTriniiteSolution = builderISG("residual_triniite_solution")
        .liquid()
        .color(0x219daf)
        .iconSet(FLUID)
        .buildAndRegister();

    HeavilyFluorinatedTriniumSolution = builderISG("heavily_fluorinated_trinium_solution")
        .liquid()
        .color(0x348d41)
        .iconSet(FLUID)
        .buildAndRegister();

    MoltenCalciumSalts = builderISG("molten_calcium_salts")
        .liquid()
        .color((ISGMaterials.Fluorite.getMaterialRGB()+GTMaterials.Calcium.getMaterialRGB())/2)
        .iconSet(FLUID)
        .buildAndRegister();

    EthylTrifluoroacetate = builderISG("ethyl_trifluoroacetate")
        .liquid()
        .color(0x88a12d)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C4H5F3O2", true);

    Acetothienone = builderISG("acetothieone")
        .liquid()
        .color(0x79882a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6H6SO", true);

    TheonylTrifluoroacetate = builderISG("theonyl_trifluoroacetate")
        .liquid()
        .color(0x88882b)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C8H5F3O2S", true);

    ActiniumRadiumNitrateSolution = builderISG("actinium_radium_nitrate_solution")
        .liquid()
        .color(0xd2f0df)
        .iconSet(FLUID)
        .buildAndRegister();

    ActiniumRadiumHydroxideSolution = builderISG("actinium_radium_hydroxide_solution")
        .liquid()
        .color(0xe2f5ef)
        .iconSet(FLUID)
        .buildAndRegister();

    FumingNitricAcid = builderISG("fuming_nitric_acid")
        .liquid()
        .color(GTMaterials.NitricAcid.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("HNO3", true);

    AcetylChloride = builderISG("acetyl_chloride")
        .liquid()
        .color(GTMaterials.AceticAcid.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C2H3OCl", true);

    DirtyHexafluorosilicicAcid = builderISG("dirty_hexafluorosilicic_acid")
        .liquid()
        .color((GTMaterials.Stone.getMaterialRGB()+FluorosilicicAcid.getMaterialRGB()/2))
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2SiF6?", true);

    DiluteHexafluorosilicicAcid = builderISG("dilute_hexafluorosilicic_acid")
        .liquid()
        .color((GTMaterials.Water.getMaterialRGB()*2+FluorosilicicAcid.getMaterialRGB())/3)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)2(H2SiF6)", true);

    Dioxygendifluoride = builderISG("dioxygen_difluoride")
        .liquid()
        .color(0x32bdaf)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("FOOF");

    DiluteHydrofluoricAcid = builderISG("dilute_hydrofluoric_acid")
        .liquid()
        .color((GTMaterials.Water.getMaterialRGB()+GTMaterials.HydrofluoricAcid.getMaterialRGB())/3)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)(HF)", true);

    OxidizedResidualSolution = builderISG("oxidized_residual_solution")
        .liquid()
        .color(0x23ad7f)
        .iconSet(FLUID)
        .buildAndRegister();

    TritiumHydride = builderISG("tritium_hydride")
        .liquid()
        .color(GTMaterials.Tritium.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("TH");

    Helium3Hydride = builderISG("helium_iii_hydride")
        .liquid()
        .color(GTMaterials.Helium3.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("He-3H");

    UltraacidicResidueSolution = builderISG("ultraacidic_residue_solution")
        .liquid()
        .color((GTMaterials.FluoroantimonicAcid.getMaterialRGB()+Helium3Hydride.getMaterialRGB())/2)
        .iconSet(FLUID)
        .buildAndRegister();

    XenicAcid = builderISG("xenic_acid")
        .liquid()
        .color(0x5a4c9c)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2XeO4", true);

    DustyLiquidHelium3 = builderISG("dusty_liquid_helium3")
        .liquid()
        .color(2*GTMaterials.Helium3.getMaterialRGB()/3+ISGMaterials.Taranium.getMaterialRGB()/5)
        .iconSet(FLUID)
        .buildAndRegister();

    TaraniumEnrichedLHelium3 = builderISG("taranium_enriched_liquid_helium3")
        .liquid()
        .color(GTMaterials.Helium3.getMaterialRGB()/2+ISGMaterials.Taranium.getMaterialRGB()/2)
        .iconSet(FLUID)
        .buildAndRegister();

    TaraniumSemidepletedLHelium3 = builderISG("taranium_semidepleted_liquid_helium3")
        .liquid()
        .color(2*GTMaterials.Helium3.getMaterialRGB()/3+ISGMaterials.Taranium.getMaterialRGB()/5)
        .iconSet(FLUID)
        .buildAndRegister();

    TaraniumDepletedLHelium3 = builderISG("taranium_depleted_liquid_helium3")
        .liquid()
        .color(GTMaterials.Helium3.getMaterialRGB()*5/6+ISGMaterials.Taranium.getMaterialRGB()/8)
        .iconSet(FLUID)
        .buildAndRegister();

    TaraniumRichDustyHeliumPlasma = builderISG("taranium_rich_dusty_helium_plasma")
        .liquid()
        .color(GTMaterials.Helium.getMaterialRGB()/2+ISGMaterials.Taranium.getMaterialRGB()/2)
        .iconSet(FLUID)
        .buildAndRegister();

    TaraniumDepletedHeliumPlasma = builderISG("taranium_depleted_helium_plasma")
        .liquid()
        .color(GTMaterials.Helium.getMaterialRGB()/2+ISGMaterials.Taranium.getMaterialRGB()/2)
        .iconSet(FLUID)
        .buildAndRegister();

    TaraniumRichHelium4 = builderISG("taranium_rich_helium_4")
        .liquid()
        .plasma()
        .color(GTMaterials.Helium.getMaterialRGB()/2+ISGMaterials.Taranium.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister();

    TaraniumPoorLiquidHelium = builderISG("taranium_poor_liquid_helium")
        .liquid()
        .color(GTMaterials.Helium3.getMaterialRGB()*6/7+ISGMaterials.Taranium.getMaterialRGB()/14)
        .iconSet(FLUID)
        .buildAndRegister();

    LiquidFluorine = builderISG("liquid_fluorine")
        .liquid()
        .color(GTMaterials.Fluorine.getMaterialRGB()-0x303030)
        .iconSet(FLUID)
        .buildAndRegister();

    LiquidXenon = builderISG("liquid_xenon")
        .liquid()
        .color(GTMaterials.Xenon.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister();

    TaraniumPoorLiquidHeliumMix = builderISG("taranium_poor_liquid_helium_mix")
        .liquid()
        .color(TaraniumPoorLiquidHelium.getMaterialRGB()*10/11+LiquidHelium.getMaterialRGB()/11)
        .iconSet(FLUID)
        .buildAndRegister();

    HydroiodicAcid = builderISG("hydroiodic_acid")
        .liquid()
        .color(GTMaterials.Hydrogen.getMaterialRGB()/2+GTMaterials.Iodine.getMaterialRGB()/2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("HI");

    ChlorodiisopropylPhosphine = builderISG("chlorodiisopropyl_phosphine")
        .liquid()
        .color(0xa2c122)
        .iconSet(FLUID)
        .buildAndRegister();

    CesiumBromideSolution = builderISG("cesium_bromide_solution")
        .liquid()
        .color((GTMaterials.Caesium.getMaterialRGB()-10+GTMaterials.SaltWater.getMaterialRGB())/2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("CsBr(H2O)", true);

    IndiumTrifluoride = builderISG("indium_trifluoride")
        .dust()
        .color(0x2b0f48)
        .iconSet(GTMaterials.Indium.getMaterialIconSet())
        .buildAndRegister()
        .setFormula("InF3", true);

    IndiumTrioxide = builderISG("indium_trioxide")
        .dust()
        .color(0x2b0f48)
        .iconSet(GTMaterials.Indium.getMaterialIconSet())
        .buildAndRegister()
        .setFormula("In2O3", true);

    NaquadahConcentrate = builderISG("naquadah_concentrate")
        .dust()
        .color(GTMaterials.Naquadah.getMaterialRGB())
        .iconSet(GTMaterials.Naquadah.getMaterialIconSet())
        .buildAndRegister()
        .setFormula("Nq?");

    EnrichedNaquadahConcentrate = builderISG("enriched_naquadah_concentrate")
        .dust()
        .color(GTMaterials.NaquadahEnriched.getMaterialRGB())
        .iconSet(GTMaterials.NaquadahEnriched.getMaterialIconSet())
        .buildAndRegister()
        .setFormula("Nq+?");

    NaquadriaConcentrate = builderISG("naquadria_concentrate")
        .dust()
        .color(GTMaterials.Naquadria.getMaterialRGB())
        .iconSet(GTMaterials.Naquadria.getMaterialIconSet())
        .buildAndRegister()
        .setFormula("*Nq*?");

    AuricFluoride = builderISG("auric_fluoride")
        .dust()
        .color(0xdffb50)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("AuF3", true);

    ThUSludge = builderISG("thorium_uranium_sludge")
        .dust()
        .color(0x002908)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("ThU");

    LanthanumOxide = builderISG("lanthanum_oxide")
        .dust()
        .color(GTMaterials.Lanthanum.getMaterialRGB())
        .iconSet(GTMaterials.Lanthanum.getMaterialIconSet())
        .buildAndRegister()
        .setFormula("La2O3", true);

    PraseodymiumOxide = builderISG("praseodymium_oxide")
        .dust()
        .color(GTMaterials.Praseodymium.getMaterialRGB())
        .iconSet(GTMaterials.Praseodymium.getMaterialIconSet())
        .buildAndRegister()
        .setFormula("Pr2O3", true);

    NeodymiumOxide = builderISG("neodymium_oxide")
        .dust()
        .color(GTMaterials.Neodymium.getMaterialRGB())
        .iconSet(GTMaterials.Neodymium.getMaterialIconSet())
        .buildAndRegister()
        .setFormula("Nd2O3", true);

    CeriumOxide = builderISG("cerium_oxide")
        .dust()
        .color(GTMaterials.Cerium.getMaterialRGB())
        .iconSet(GTMaterials.Cerium.getMaterialIconSet())
        .buildAndRegister()
        .setFormula("Ce2O3", true);

    EuropiumOxide = builderISG("europium_oxide")
        .dust()
        .color(GTMaterials.Europium.getMaterialRGB())
        .iconSet(GTMaterials.Europium.getMaterialIconSet())
        .buildAndRegister()
        .setFormula("Eu2O3", true);

    GadoliniumOxide = builderISG("gadolinium_oxide")
        .dust()
        .color(GTMaterials.Gadolinium.getMaterialRGB())
        .iconSet(GTMaterials.Gadolinium.getMaterialIconSet())
        .buildAndRegister()
        .setFormula("Gd2O3", true);

    SamariumOxide = builderISG("samarium_oxide")
        .dust()
        .color(GTMaterials.Samarium.getMaterialRGB())
        .iconSet(GTMaterials.Samarium.getMaterialIconSet())
        .buildAndRegister()
        .setFormula("Sm2O3", true);

    TerbiumOxide = builderISG("terbium_oxide")
        .dust()
        .color(GTMaterials.Terbium.getMaterialRGB())
        .iconSet(GTMaterials.Terbium.getMaterialIconSet())
        .buildAndRegister()
        .setFormula("Tb2O3", true);

    DysprosiumOxide = builderISG("dysprosium_oxide")
        .dust()
        .color(GTMaterials.Dysprosium.getMaterialRGB())
        .iconSet(GTMaterials.Dysprosium.getMaterialIconSet())
        .buildAndRegister()
        .setFormula("Dy2O3");

    HolmiumOxide = builderISG("holmium_oxide")
        .dust()
        .color(GTMaterials.Holmium.getMaterialRGB())
        .iconSet(GTMaterials.Holmium.getMaterialIconSet())
        .buildAndRegister()
        .setFormula("Ho2O3", true);

    ErbiumOxide = builderISG("erbium_oxide")
        .dust()
        .color(GTMaterials.Erbium.getMaterialRGB())
        .iconSet(GTMaterials.Erbium.getMaterialIconSet())
        .buildAndRegister()
        .setFormula("Er2O3", true);

    ThuliumOxide = builderISG("thulium_oxide")
        .dust()
        .color(GTMaterials.Thulium.getMaterialRGB())
        .iconSet(GTMaterials.Thulium.getMaterialIconSet())
        .buildAndRegister()
        .setFormula("Tm2O3", true);

    YtterbiumOxide = builderISG("ytterbium_oxide")
        .dust()
        .color(GTMaterials.Ytterbium.getMaterialRGB())
        .iconSet(GTMaterials.Ytterbium.getMaterialIconSet())
        .buildAndRegister()
        .setFormula("Yb2O3", true);

    LutetiumOxide = builderISG("lutetium_oxide")
        .dust()
        .color(GTMaterials.Lutetium.getMaterialRGB())
        .iconSet(GTMaterials.Lutetium.getMaterialIconSet())
        .buildAndRegister()
        .setFormula("Lu2O3", true);

    ScandiumOxide = builderISG("scandium_oxide")
        .dust()
        .color(GTMaterials.Scandium.getMaterialRGB())
        .iconSet(GTMaterials.Scandium.getMaterialIconSet())
        .buildAndRegister()
        .setFormula("Sc2O3", true);

    CalciumCarbide = builderISG("calcium_carbide")
        .dust()
        .color(0x807b70)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("CaC2", true);

    BetaPinene = builderISG("beta_pinene")
        .dust()
        .color(0x61ad6b)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C10H16", true);

    Yeast = builderISG("yeast")
        .dust()
        .color(0xf0e660)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("???");

    Glutamine = builderISG("glutamine")
        .dust()
        .color(0xede9b4)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C5H10N2O3", true);

    SilicaGel = builderISG("silica_gel")
        .dust()
        .color(0x61daff)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("SiO2", true);

    SilicaAluminaGel = builderISG("silica_alumina_gel")
        .dust()
        .color(0x558d9e)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Al2O3SiO2", true);

    ZeoliteSievingPellets = builderISG("zeolite_sieving_pellets")
        .dust()
        .color(0xa17bd1)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Al2O3SiO2", true);

    WetZeoliteSievingPellets = builderISG("wet_zeolite_sieving_pellets")
        .dust()
        .color(0x392f45)
        .iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("Al2O3SiO2?", true);

    GreenAlgae = builderISG("green_algae")
        .dust()
        .color(0x228b22)
        .iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("An Algae");

    BrownAlgae = builderISG("brown_algae")
        .dust()
        .color(0xa52a2a)
        .iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("An Algae");

    RedAlgae = builderISG("red_algae")
        .dust()
        .color(0xf08080)
        .iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("An Algae");

    DryRedAlgae = builderISG("dry_red_algae")
        .dust()
        .color(0xff7f50)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("A Dry Algae");

    RedAlgaePowder = builderISG("red_algae_powder")
        .dust()
        .color(0xcc2f2f)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("A Powdered Algae");

    PreFreezeAgar = builderISG("pre_freeze_agar")
        .dust()
        .color(0x132b0d)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Warm Agar");

    FrozenAgarCrystals = builderISG("frozen_agar_crystals")
        .dust()
        .color(0x68db4b)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Cold Agar");

    BrevibacteriumFlavium = builderISG("brevibacterium_flavium")
        .dust()
        .color(0x2c4d24)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Bacteria");

    StreptococcusPyogenes = builderISG("streptococcus_pyogenes")
        .dust()
        .color(0x1c3b15)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Bacteria");

    EschericiaColi = builderISG("eschericia_coli")
        .dust()
        .color(0x2d4228)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Bacteria");

    BifidobacteriumBreve = builderISG("bifidobacterium_breve")
        .dust()
        .color(0x377528)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Bacteria");

    CupriavidusNecator = builderISG("cupriavidus_necator")
        .dust()
        .color(0x22704f)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Bacteria");

    Shewanella = builderISG("shewanella")
        .dust()
        .color(0x8752ab)
        .iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("Bacteria");

    ZirconiumTetrachloride = builderISG("zirconium_tetrachloride")
        .dust()
        .color(0xF0F0F0)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("ZrCl4", true);

    SiliconCarbide = builderISG("silicon_carbide")
        .dust()
        .color((GTMaterials.Silicon.getMaterialRGB()+GTMaterials.Carbon.getMaterialRGB())/2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("SiC");

    GoldDepleteMolybdenite = builderISG("gold_deplete_molybdenite")
        .dust()
        .color(0x7c7c8f)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("MoS2?", true);

    MolybdenumConcentrate = builderISG("molybdenum_concentrate")
        .dust()
        .color(0x565666)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("MoS2Re", true);

    MolybdenumTrioxide = builderISG("molybdenum_trioxide")
        .dust()
        .color(0x666685)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("MoO3", true);

    CopperChloride = builderISG("copper_chloride")
        .dust()
        .color(0xf5b35d)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("CuCl2", true);

    BismuthChloride = builderISG("bismuth_chloride")
        .dust()
        .color(0x95f5d7)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("BiCl3", true);

    LeadChloride = builderISG("lead_chloride")
        .dust()
        .color((GTMaterials.Lead.getMaterialRGB()+GTMaterials.Chlorine.getMaterialRGB())/2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("PbCl2", true);

    ZirconiumTetrafluoride = builderISG("zirconium_tetrafluoride")
        .dust()
        .color((GTMaterials.Zirconium.getMaterialRGB()+GTMaterials.Fluorine.getMaterialRGB())/2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("ZrF4", true);

    BariumDifluoride = builderISG("barium_difluoride")
        .dust()
        .color((GTMaterials.Barium.getMaterialRGB()+GTMaterials.Fluorine.getMaterialRGB())/2)
        .iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("BaF2", true);

    LanthanumTrifluoride = builderISG("lanthanum_trifluoride")
        .dust()
        .color((GTMaterials.Lanthanum.getMaterialRGB()+GTMaterials.Fluorine.getMaterialRGB())/2)
        .iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("LaF3", true);

    AluminiumTrifluoride = builderISG("aluminium_trifluoride")
        .dust()
        .color((GTMaterials.Aluminium.getMaterialRGB()+GTMaterials.Fluorine.getMaterialRGB())/2)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("AlF3", true);

    ErbiumTrifluoride = builderISG("erbium_trifluoride")
        .dust()
        .color((GTMaterials.Erbium.getMaterialRGB()+GTMaterials.Fluorine.getMaterialRGB())/2)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("ErF3", true);

    ZBLANDust = builderISG("zblan_dust")
        .dust()
        .color((ZirconiumTetrafluoride.getMaterialRGB()+BariumDifluoride.getMaterialRGB()+LanthanumTrifluoride.getMaterialRGB()+AluminiumTrifluoride.getMaterialRGB())/4)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("(ZrF4)18(BaF2)7(LaF3)2(AlF3)(NaF)7", true);

    ErbiumDopedZBLANDust = builderISG("erbium_doped_zblan_dust")
        .dust()
        .color((ZBLANDust.getMaterialRGB()+ErbiumTrifluoride.getMaterialRGB())/2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("(ErF3)(ZrF4)18(BaF2)7(LaF3)2(AlF3)(NaF)7");

    SuccinicAcid = builderISG("succinic_acid")
        .dust()
        .color((MaleicAnhydride.getMaterialRGB()+GTMaterials.Water.getMaterialRGB()+GTMaterials.Hydrogen.getMaterialRGB())/3)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("C4H6O4", true);

    Succinimide = builderISG("succinimide")
        .dust()
        .color((SuccinicAcid.getMaterialRGB()+GTMaterials.Ammonia.getMaterialRGB())/2)
        .iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("C4H5NO2", true);

    Bromosuccinimide = builderISG("bromo_succinimide")
        .dust()
        .color((Succinimide.getMaterialRGB()+GTMaterials.Bromine.getMaterialRGB())/2)
        .iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("C4H4BrNO2", true);

    Benzophenanthrenylacetonitrile = builderISG("benzophenanthrenylacetonitrile")
        .dust()
        .color((Naphthaldehyde.getMaterialRGB()+GTMaterials.Ethylene.getMaterialRGB()-20)/2)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("C20H13N", true);

    UnfoldedFullerene = builderISG("unfolded_fullerene")
        .dust()
        .color((Benzophenanthrenylacetonitrile.getMaterialRGB()+GTMaterials.Oxygen.getMaterialRGB())/2)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C60H30", true);

    Fullerene = builderISG("fullerene")
        .dust()
        .color((UnfoldedFullerene.getMaterialRGB()-20))
        .iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("C60", true);

    TiAlChloride = builderISG("tial_chloride")
        .dust()
        .color((GTMaterials.Titanium.getMaterialRGB()+GTMaterials.Aluminium.getMaterialRGB()+GTMaterials.Chlorine.getMaterialRGB())/3)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("TiAlCl7", true);

    Dimethylaminopyridine = builderISG("dimethylaminopyridine")
        .dust()
        .color((GTMaterials.Dimethylamine.getMaterialRGB()+Pyridine.getMaterialRGB())/2)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("(CH3)2NC5H4N", true);

    PdIrReOCeOS = builderISG("pdirreoceos")
        .dust()
        .color((GTMaterials.Palladium.getMaterialRGB()+GTMaterials.Iridium.getMaterialRGB()+GTMaterials.Rhenium.getMaterialRGB()+GTMaterials.Cerium.getMaterialRGB()+GTMaterials.Osmium.getMaterialRGB()+GTMaterials.Silicon.getMaterialRGB()+GTMaterials.Oxygen.getMaterialRGB())/7)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("PdIrReCeOsSiO4", true);

    SodiumEthoxide = builderISG("sodium_ethoxide")
        .dust()
        .color((GTMaterials.Ethanol.getMaterialRGB()+ GTMaterials.SodiumHydroxide.getMaterialRGB())/2)
        .iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("C2H5ONa", true);

    MgClBromide = builderISG("mgcl_bromide")
        .dust()
        .color((GTMaterials.MagnesiumChloride.getMaterialRGB()+GTMaterials.Bromine.getMaterialRGB())/2)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("MgClBr");

    Sarcosine = builderISG("sarcosine")
        .dust()
        .color((Glycine.getMaterialRGB()+GTMaterials.Oxygen.getMaterialRGB())/2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("C3H7NO2", true);

    ZnFeAlClCatalyst = builderISG("znfealcl_catalyst")
        .dust()
        .color((GTMaterials.Zinc.getMaterialRGB()+GTMaterials.Iron.getMaterialRGB()+GTMaterials.Aluminium.getMaterialRGB()+GTMaterials.Chlorine.getMaterialRGB())/4)
        .iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("ZnFeAlCl");

    Difluorobenzophenone = builderISG("difluorobenzophenone")
        .dust()
        .color((FluoroBenzene.getMaterialRGB()+Fluorotoluene.getMaterialRGB())/2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("(FC6H4)2CO", true);

    AluminiumChloride = builderISG("aluminium_chloride")
        .dust()
        .color((GTMaterials.Aluminium.getMaterialRGB()+GTMaterials.Chlorine.getMaterialRGB())/2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("AlCl3", true);

    PdFullereneMatrix = builderISG("pd_fullerene_matrix")
        .dust()
        .color((GTMaterials.Palladium.getMaterialRGB()+Fullerene.getMaterialRGB())/2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("PdC73H15NFe", true);

    Terephthalaldehyde = builderISG("terephthalaldehyde")
        .dust()
        .color((Dibromomethylbenzene.getMaterialRGB()+GTMaterials.SulfuricAcid.getMaterialRGB())/2)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("C8H6O2", true);

    PreZylon = builderISG("pre_zylon")
        .dust()
        .color((Terephthalaldehyde.getMaterialRGB()+Dinitrodipropanyloxybenzene.getMaterialRGB())/2)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("C20H22N2O2", true);

    AuPdCCatalyst = builderISG("aupdc_catalyst")
        .dust()
        .color((GTMaterials.Gold.getMaterialRGB()+GTMaterials.Palladium.getMaterialRGB()+GTMaterials.Carbon.getMaterialRGB())/3)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("AuPdC");

    Cyanonaphthalene = builderISG("cyanonaphthalene")
        .dust()
        .color((SodiumCyanide.getMaterialRGB()+ GTMaterials.Naphthalene.getMaterialRGB())/2)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("C11H7N", true);

    TinChloride = builderISG("tin_chloride")
        .dust()
        .color((GTMaterials.Tin.getMaterialRGB()+GTMaterials.Chlorine.getMaterialRGB())/2)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("SnCl2", true);

    Triphenylphosphine = builderISG("triphenylphosphine")
        .dust()
        .color((GTMaterials.Chlorobenzene.getMaterialRGB()+PhosphorusTrichloride.getMaterialRGB())/2)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("(C6H5)3P", true);

    Methylbenzophenanthrene = builderISG("methylbenzophenanthrene")
        .dust()
        .color((Naphthaldehyde.getMaterialRGB()+ISGMaterials.EthylBenzene.getMaterialRGB())/2)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("C19H14", true);

    VanadiumSlag = builderISG("vanadium_slag")
        .dust()
        .color((GTMaterials.Vanadium.getMaterialRGB()+GTMaterials.Titanium.getMaterialRGB())/2)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("(VO)C(TiO2)", true);

    VanadiumSlagDust = builderISG("vanadium_slag_dust")
        .dust()
        .color(0xf2ef1b)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("VO");

    SodiumVanadate = builderISG("sodium_vanadate")
        .dust()
        .color(0xf2df1d)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Na3VO4", true);

    AmmoniumVanadate = builderISG("ammonium_vanadate")
        .dust()
        .color(0xf2ff1c)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("NH4VO3", true);

    VanadiumOxide = builderISG("vanadium_oxide")
        .dust()
        .color(0xf2ef1b)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("V2O5", true);

    BariumCarbonate = builderISG("barium_carbonate")
        .dust()
        .color(GTMaterials.Salt.getMaterialRGB()+10)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("BaCO3", true);

    BariumOxide = builderISG("barium_oxide")
        .dust()
        .color((GTMaterials.Barium.getMaterialRGB()+GTMaterials.Oxygen.getMaterialRGB())/2)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("BaO");

    BariumAluminate = builderISG("barium_aluminate")
        .dust()
        .color(GTMaterials.Saltpeter.getMaterialRGB()+10)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("BaAl2O4", true);

    PotassiumUranylTricarbonate = builderISG("potassium_uranyl_carbonate")
        .dust()
        .color(0xeff028)
        .iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("(UO2)CO3", true);

    UraniumPeroxideThoriumOxide = builderISG("uranium_peroxide_thorium_oxide")
        .dust()
        .color(0x202020)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("(UO3)(H2O2)ThO2", true);

    UraniumThoriumOxide = builderISG("uranium_thorium_oxide")
        .dust()
        .color(0x202020)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("UO2ThO2", true);

    UranylThoriumSulfate = builderISG("uranium_thorium_sulfate")
        .dust()
        .color(0xe7e848)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("(UO2)SO4ThO2", true);

    UranylThoriumNitrate = builderISG("uranium_thorium_nitrate")
        .dust()
        .color(0xe7e848)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("UO2(NO3)2Th(NO3)4", true);

    UraniumOxideThoriumNitrate = builderISG("uranium_oxide_thorium_nitrate")
        .dust()
        .color(0x33bd45)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("UO2Th(NO3)4", true);

    CaesiumHydroxide = builderISG("caesium_hydroxide")
        .dust()
        .color(GTMaterials.Caesium.getMaterialRGB()-10)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("CsOH");

    AluminiumHydroxide = builderISG("aluminium_hydroxide")
        .dust()
        .color(GTMaterials.Aluminium.getMaterialRGB()-25)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("Al(OH)3", true);

    GrapheneOxidationResidue = builderISG("graphene_oxidation_residue")
        .dust()
        .color(0x96821a)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("(KMnO4)(NaNO3)(H2SO4)", true);

    NiAlOCatalyst = builderISG("nialo_catalyst")
        .dust()
        .color(0x0af0af)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("NiAl2O4", true);

    FeCrOCatalyst = builderISG("fecro_catalyst")
        .dust()
        .color(0x8C4517)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("FeCrO3", true);

    RoastedSpodumene = builderISG("roasted_spodumene")
        .dust()
        .color(0x3d3d29)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("LiAlSi2O6", true);

    RoastedLepidolite = builderISG("roasted_lepidolite")
        .dust()
        .color(0x470024)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("KLi3Al4O11", true);

    Lithiumthiinediselenide = builderISG("lithiumthiinediselenide")
        .dust()
        .color(0x7ada00)
        .iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("C4H4S2Li2Se2", true);

    NickelChloride = builderISG("nickel_chloride")
        .dust()
        .color(GTMaterials.Nickel.getMaterialRGB()+10)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("NiCl2", true);

    AluminiumSulfate = builderISG("aluminium_sulfate")
        .dust()
        .color((GTMaterials.Aluminium.getMaterialRGB()+GTMaterials.Sulfur.getMaterialRGB())/2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Al2(SO4)3", true);

    BariumHydroxide = builderISG("barium_hydroxide")
        .dust()
        .color((GTMaterials.Barium.getMaterialRGB()+GTMaterials.Hydrogen.getMaterialRGB()+GTMaterials.Oxygen.getMaterialRGB())/3)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("Ba(OH)2", true);

    HafniumOxide = builderISG("hafnium_oxide")
        .dust()
        .color(0x404040)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("HfO2", true);

    SiliconChloride = builderISG("silicon_chloride")
        .dust()
        .color(GTMaterials.Silicon.getMaterialRGB()-15)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("SiCl4", true);

    HafniumChloride = builderISG("hafnium_chloride")
        .dust()
        .color(GTMaterials.Hafnium.getMaterialRGB()+20)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("HfCl4", true);

    ZincCokePellets = builderISG("zinc_coke_pellets")
        .dust()
        .color((GTMaterials.Zinc.getMaterialRGB()+GTMaterials.Coke.getMaterialRGB())/2)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("(H2O)(ZnS)C", true);

    ZincResidualSlag = builderISG("zinc_residual_slag")
        .dust()
        .color((GTMaterials.Zinc.getMaterialRGB()-20))
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("?");

    ZincFlueDust = builderISG("zinc_flue_dust")
        .dust()
        .color(0xfcfca)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("?");

    ZincLeachingResidue = builderISG("zinc_leaching_residue")
        .dust()
        .color((GTMaterials.Germanium.getMaterialRGB()+GTMaterials.Oxygen.getMaterialRGB())/2)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("Ge?");

    FineZincSlagDust = builderISG("fine_zinc_slag_dust")
        .dust()
        .color((GTMaterials.Zinc.getMaterialRGB()-10))
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("?");

    IndiumHydroxide = builderISG("indium_hydroxide")
        .dust()
        .color((GTMaterials.Indium.getMaterialRGB()+GTMaterials.SodiumHydroxide.getMaterialRGB())/2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("In(OH)3", true);

    CadmiumZincDust = builderISG("cadmium_zinc_dust")
        .dust()
        .color((GTMaterials.Cadmium.getMaterialRGB()+GTMaterials.Zinc.getMaterialRGB())/2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("(H2SO4)CdZn?", true);

    ThalliumResidue = builderISG("thallium_residue")
        .dust()
        .color((GTMaterials.Thallium.getMaterialRGB()-10))
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Tl?");

    ThalliumChloride = builderISG("thallium_chloride")
        .dust()
        .color((GTMaterials.Thallium.getMaterialRGB()+GTMaterials.Chlorine.getMaterialRGB())/2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("TlCl");

    ZincChloride = builderISG("zinc_chloride")
        .dust()
        .color((GTMaterials.Zinc.getMaterialRGB()+GTMaterials.Chlorine.getMaterialRGB())/2)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("ZnCl2", true);

    SodiumSulfite = builderISG("sodium_sulfite")
        .dust()
        .color((GTMaterials.SodiumHydroxide.getMaterialRGB()+GTMaterials.Sulfur.getMaterialRGB())/2)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("Na2SO3", true);

    Cellulose = builderISG("cellulose")
        .dust()
        .color((0xfefefc))
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C6H10O5", true);

    GermaniumOxide = builderISG("germanium_oxide")
        .dust()
        .color((GTMaterials.Germanium.getMaterialRGB()+10))
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("GeO2", true);

    DisodiumPhosphate = builderISG("sodium_diphosphate")
        .dust()
        .color((GTMaterials.Sodium.getMaterialRGB()+GTMaterials.Phosphorus.getMaterialRGB())/2)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Na2HPO4", true);

    AcrylicFibers = builderISG("acrylic_fibers")
        .dust()
        .color(0xfdfdfb)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("(C5O2H8)n", true);

    UranylNitrate = builderISG("uranyl_nitrate")
        .dust()
        .color(0x33bd45)
        .iconSet(SHINY)
        .buildAndRegister();

    CalciumSalts = builderISG("calcium_salts")
        .dust()
        .color(GTMaterials.Calcium.getMaterialRGB()-10)
        .iconSet(ROUGH)
        .components(GTMaterials.Calcite, 1, GTMaterials.Gypsum, 1)
        .buildAndRegister();

    SodiumSalts = builderISG("sodium_salts")
        .dust()
        .color(GTMaterials.Sodium.getMaterialRGB()-5)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("NaCl?");

    PotassiumMagnesiumSalts = builderISG("kmg_salts")
        .dust()
        .color(0xcacac8)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("KClMgSO4K2SO4KF", true);

    CalciumMagnesiumSalts = builderISG("camg_salts")
        .dust()
        .color(0xcacac8)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("CaCO3(SrCO3)(CO2)MgO", true);

    SodiumAluminiumHydride = builderISG("sodium_aluminium_hydride")
        .dust()
        .color(0x98cafc)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("NaAlH4", true);

    LithiumAluminiumHydride = builderISG("lithium_aluminium_hydride")
        .dust()
        .color(0xc0defc)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("LiAlH4", true);

    SodiumAzanide = builderISG("sodium_azanide")
        .dust()
        .color((GTMaterials.Sodium.getMaterialRGB()+GTMaterials.Hydrogen.getMaterialRGB()+GTMaterials.Nitrogen.getMaterialRGB())/3)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("NaNH2", true);

    SodiumAzide = builderISG("sodium_azide")
        .dust()
        .color((GTMaterials.Sodium.getMaterialRGB()+GTMaterials.Nitrogen.getMaterialRGB())/2)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("NaN3", true);

    Glucosamine = builderISG("glucosamine")
        .dust()
        .color((Cellulose.getMaterialRGB()+GTMaterials.Water.getMaterialRGB())/2)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("C6H13NO5", true);

    AluminiumHydride = builderISG("aluminium_hydride")
        .dust()
        .color(0x0b585c)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("AlH3", true);

    SodiumHydride = builderISG("sodium_hydride")
        .dust()
        .color(0xcacac8)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("NaH");

    DehydrogenationCatalyst = builderISG("dehydrogenation_catalyst")
        .dust()
        .color(0x6464f5)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("?");

    PolystyreneNanoParticles = builderISG("polystryrene_nanoparticles")
        .dust()
        .color(0x888079)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("(C8H8)n", true);

    MagnesiumSulfate = builderISG("magnesium_sulfate")
        .dust()
        .color(0xcacac8)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("MgSO4", true);

    SodiumMolybdate = builderISG("sodium_molybdate")
        .dust()
        .color(0xfcfc00)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Na2MoO4", true);

    SodiumPhosphomolybdate = builderISG("sodium_phosphomolybdate")
        .dust()
        .color(0xfcfc00)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("(MoO3)12Na3PO4", true);

    SodiumPhosphotungstate = builderISG("sodium_phosphotungstate")
        .dust()
        .color(0x7a7777)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("(WO3)12Na3PO4", true);

    Fructose = builderISG("fructose")
        .dust()
        .color((Cellulose.getMaterialRGB()+GTMaterials.Sugar.getMaterialRGB())/2)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("C6H12O6", true);

    Glucose = builderISG("glucose")
        .dust()
        .color((GTMaterials.Sugar.getMaterialRGB()+5))
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("C6H12O6", true);

    LeadNitrateCalciumMixture = builderISG("lead_nitrate_calcium_mixture")
        .dust()
        .color((ISGMaterials.LeadNitrate.getMaterialRGB()+GTMaterials.Calcium.getMaterialRGB())/2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("(Pb(NO3)2)Ca9", true);

    StrontiumOxide = builderISG("strontium_oxide")
        .dust()
        .color(0xcacac8)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("SrO");

    Diiodobiphenyl = builderISG("diiodobiphenyl")
        .dust()
        .color(0x000f66)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("C12H8I2", true);

    Bipyridine = builderISG("bipyridine")
        .dust()
        .color(0X978662)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("C10H8N2", true);

    PalladiumChloride = builderISG("palladium_chloride")
        .dust()
        .color(0xb9c0c7)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("PdCl2", true);

    PalladiumBisDibenzylidieneacetone = builderISG("palladium_bisdibenzylidieneacetone")
        .dust()
        .color(0Xbe81a0)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("C51H42O3Pd2", true);

    PotassiumTetrachloroplatinate = builderISG("potassium_tetrachloroplatinate")
        .dust()
        .color(0xffba54)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("K2PtCl4", true);

    NickelTriphenylPhosphite = builderISG("nickel_triphenyl_phosphite")
        .dust()
        .color(0xd9d973)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("C36H30Cl2NiP2", true);

    Dichlorocycloctadieneplatinium = builderISG("dichlorocyclooctadieneplatinium")
        .dust()
        .color(0xe0f78a)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("C8H12Cl2Pt", true);

    GrapheneNanotubeMix = builderISG("graphene_nanotube_mix")
        .dust()
        .color(0x2c2c2c)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("(C)C?");

    GrapheneAlignedCNT = builderISG("graphene_aligned_cnt")
        .dust()
        .color(0x2c2c2c)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("(C)C30H20", true);

    NiAlCatalyst = builderISG("nial_catalyst")
        .dust()
        .color(0x6ea2ff)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("NiAl");

    TitaniumNitrate = builderISG("titanium_nitrate")
        .dust()
        .color(0xFF0066)
        .iconSet(FINE)
        .buildAndRegister();

    SilverNitrate = builderISG("silver_nitrate")
        .dust()
        .color(0xfdfdca)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("AgNO3", true);

    AnodicSlime = builderISG("anodic_slime")
        .dust()
        .color(0x765A30)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("SeTe??");

    TelluriumOxide = builderISG("tellurium_oxide")
        .dust()
        .color(0xFFFF66)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("TeO2", true);

    SeleniumOxide = builderISG("selenium_oxide")
        .dust()
        .color(0xFFFF66)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("SeO2", true);

    ManganeseSulfate = builderISG("manganese_sulfate")
        .dust()
        .color((GTMaterials.Manganese.getMaterialRGB()+GTMaterials.Sulfur.getMaterialRGB())/2)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("MnSO4", true);

    TinSlag = builderISG("tin_slag")
        .dust()
        .color(0xc8b9a9)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("NbTa?");

    NbTaContainingDust = builderISG("nbta_containing_dust")
        .dust()
        .color(0xc8b9a9)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("NbTa");

    NiobiumTantalumOxide = builderISG("niobium_tantalum_oxide")
        .dust()
        .color((GTMaterials.Niobium.getMaterialRGB()+GTMaterials.Tantalum.getMaterialRGB())/2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("(Nb2O5)(Ta2O5)", true);

    FusedColumbite = builderISG("fused_columbite")
        .dust()
        .color(0xCCCC00)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("(Fe2O3)(NaO)Nb2O5", true);

    LeachedColumbite = builderISG("leached_columbite")
        .dust()
        .color(0xCCCC00)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("(Nb2O5)9Ta2O5?", true);

    FusedTantalite = builderISG("fused_tantalite")
        .dust()
        .color(0x915028)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("(Fe2O3)(NaO)Ta2O5", true);

    LeachedTantalite = builderISG("leached_tantalite")
        .dust()
        .color(0x915028)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("(Ta2O5)9Nb2O5?", true);

    ColumbiteMinorOxideResidue = builderISG("columbite_minor_oxide_residue")
        .dust()
        .color(0x915028)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("(BaO)(SnO2)(WO3)(Al2O3)", true);

    TantaliteMinorOxideResidue = builderISG("tantalite_minor_oxide_residue")
        .dust()
        .color(0xCCCC00)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("(BaO)(ZrO2)(TiO2)(SiO2)", true);

    LeachedPyrochlore = builderISG("leached_pyrochlore")
        .dust()
        .color(0x996633)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("(Nb2O5)9Ta2O5?", true);

    AcidicLeachedPyrochlore = builderISG("acidic_leached_pyrochlore")
        .dust()
        .color(0x996633)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("(H2SO4)Ca12Sr6Ba6?ThUNb26O78F26", true);

    PotasssiumFluoroNiobate = builderISG("potassium_fluoroniobate")
        .dust()
        .color(0x73ff00)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("K2NbF7", true);

    PotasssiumFluoroTantalate = builderISG("potassium_fluorotantalate")
        .dust()
        .color(0x73ff00)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("K2TaF7", true);

    BariumPeroxide = builderISG("barium_peroxide")
        .dust()
        .color((GTMaterials.Barium.getMaterialRGB()+GTMaterials.Oxygen.getMaterialRGB()-30)/2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("BaO2", true);

    CassiteriteCokePellets = builderISG("cassiterite_coke_pellets")
        .dust()
        .color(0x8f8f8f)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("SnO2C?", true);

    IronSulfateDust = builderISG("iron_sulfate_dust")
        .dust()
        .color((GTMaterials.Iron.getMaterialRGB()+GTMaterials.Sulfur.getMaterialRGB())/2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("FeSO4", true);

    StrontiumCarbonate = builderISG("strontium_carbonate")
        .dust()
        .color(0xcacac8)
        .iconSet(ROUGH)
        .buildAndRegister();

    SodiumHypochlorite = builderISG("sodium_hypochlorite")
        .dust()
        .color(0x6cff50)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("NaClO");

    DehydratedLignite = builderISG("dehydrated_lignite")
        .dust()
        .color(0x5c4020)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C2(H2O)4C?", true);

    BCEPellet = builderISG("bce_pellet")
        .dust()
        .color(0x3c3020)
        .iconSet(LIGNITE)
        .buildAndRegister()
        .setFormula("C2(H2O)4C", true);

    CopperGalliumIndiumMix = builderISG("copper_gallium_indium_mix")
        .dust()
        .color((GTMaterials.Indium.getMaterialRGB() + GTMaterials.Copper.getMaterialRGB() + GTMaterials.Gallium.getMaterialRGB()) / 3)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("CuGaIn");

    CopperGalliumIndiumSelenide = builderISG("copper_gallium_indium_selenide")
        .dust()
        .color((CopperGalliumIndiumMix.getMaterialRGB() + GTMaterials.Selenium.getMaterialRGB()) / 2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("CuGaInSe2", true);

    LanthanumCalciumManganate = builderISG("lanthanum_gallium_manganate")
        .dust()
        .color(0x8aa07b)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("LaCaMnO3", true);

    AluminiumComplex = builderISG("aluminium_complex")
        .dust()
        .color(0x3f5a9f)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("AlC9H7NO", true);

    IronPlatinumCatalyst = builderISG("iron_platinum_catalyst")
        .dust()
        .color(GTMaterials.Iron.getMaterialRGB() / 2 + GTMaterials.Platinum.getMaterialRGB() / 2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("FePt");

    YttriumNitrate = builderISG("yttrium_nitrate")
        .dust()
        .color(0xdadafc)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Y(NO3)3", true);

    CopperNitrate = builderISG("copper_nitrate")
        .dust()
        .color(0xcaecec)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Cu(NO3)2", true);

    BariumNitrate = builderISG("barium_nitrate")
        .dust()
        .color((GTMaterials.Barium.getMaterialRGB()+GTMaterials.NitricAcid.getMaterialRGB())/2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Ba(NO3)2", true);

    WellMixedYBCOxides = builderISG("well_mixed_ybc_oxides")
        .dust()
        .color(0x2c3429)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("YBa2Cu3O6", true);

    PiledTBCC = builderISG("piled_tbcc")
        .dust()
        .color(0x669900)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Tl2Ba2Cu3Ca2", true);

    ActiniumOxalate = builderISG("actinium_oxalate")
        .dust()
        .color(GTMaterials.Actinium.getMaterialRGB())
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Ac(CO2)4", true);

    ActiniumHydride = builderISG("actinium_hydride")
        .dust()
        .color(GTMaterials.Actinium.getMaterialRGB())
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("AcH3", true);

    LanthanumFullereneMix = builderISG("lanthanum_fullerene_mix")
        .dust()
        .color(0xdfcafa)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("(C60)2La2?", true);

    LanthanumEmbeddedFullerene = builderISG("lanthanum_embedded_fullerene")
        .dust()
        .color(0x99cc00)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("(C60)2La2", true);

    IronIodide = builderISG("iron_iodide")
        .dust()
        .color((GTMaterials.Iron.getMaterialRGB()+GTMaterials.Iodine.getMaterialRGB())/2)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("FeI2", true);

    ThalliumIodide = builderISG("thallium_iodide")
        .dust()
        .color((GTMaterials.Thallium.getMaterialRGB()+GTMaterials.Iodine.getMaterialRGB())/2)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("TlI");

    ScandiumIodide = builderISG("scandium_iodide")
        .dust()
        .color((GTMaterials.Scandium.getMaterialRGB()+GTMaterials.Iodine.getMaterialRGB())/2)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("ScI3", true);

    RubidiumIodide = builderISG("rubidium_iodide")
        .dust()
        .color((GTMaterials.Rubidium.getMaterialRGB()+GTMaterials.Iodine.getMaterialRGB())/2)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("RbI");

    IndiumIodide = builderISG("indium_iodide")
        .dust()
        .color((GTMaterials.Indium.getMaterialRGB()+GTMaterials.Iodine.getMaterialRGB())/2)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("InI3", true);

    GalliumIodide = builderISG("gallium_iodide")
        .dust()
        .color((GTMaterials.Gallium.getMaterialRGB()+GTMaterials.Iodine.getMaterialRGB())/2)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("GaI3", true);

    UVAHalideMix = builderISG("uva_halide_mix")
        .dust()
        .color((GalliumIodide.getMaterialRGB()+GTMaterials.PotassiumIodide.getMaterialRGB()+GTMaterials.Mercury.getMaterialRGB())/3)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Hg(GaI3)KI", true);

    WhiteHalideMix = builderISG("white_halide_mix")
        .dust()
        .color((ScandiumIodide.getMaterialRGB()+GTMaterials.PotassiumIodide.getMaterialRGB()+GTMaterials.Mercury.getMaterialRGB())/3)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Hg(ScI3)KI", true);

    BlueHalideMix = builderISG("blue_halide_mix")
        .dust()
        .color((IndiumIodide.getMaterialRGB()+GTMaterials.PotassiumIodide.getMaterialRGB()+GTMaterials.Mercury.getMaterialRGB())/3)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Hg(InI3)KI", true);

    GreenHalideMix = builderISG("green_halide_mix")
        .dust()
        .color((ThalliumIodide.getMaterialRGB()+GTMaterials.PotassiumIodide.getMaterialRGB()+GTMaterials.Mercury.getMaterialRGB())/3)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Hg(TlI)KI");

    RedHalideMix = builderISG("red_halide_mix")
        .dust()
        .color((RubidiumIodide.getMaterialRGB()+GTMaterials.PotassiumIodide.getMaterialRGB()+GTMaterials.Mercury.getMaterialRGB())/3)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Hg(RbI)KI");

    CarbonylPurifiedIron = builderISG("carbonyl_purified_iron")
        .dust()
        .color(GTMaterials.Iron.getMaterialRGB())
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Fe");

    BariumTriflate = builderISG("barium_triflate")
        .dust()
        .color((GTMaterials.Barium.getMaterialRGB()+GTMaterials.Fluorine.getMaterialRGB())/2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Ba(OSO2CF3)2", true);

    ScandiumTriflate = builderISG("scandium_triflate")
        .dust()
        .color(0xdfcfcf)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Sc(OSO2CF3)3", true);

    SodiumThiosulfate = builderISG("sodium_thiosulfate")
        .dust()
        .color(0x2090fc)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("Na2S2O3", true);

    TitaniumCyclopentadienyl = builderISG("titanium_cyclopentadienyl")
        .dust()
        .color(0xbc30bc)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("(C5H5)2Cl2Ti", true);

    SodiumBromide = builderISG("sodium_bromide")
        .dust()
        .color(0xfeaffc)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("NaBr");

    FranciumCarbide = builderISG("francium_carbide")
        .dust()
        .color(GTMaterials.Francium.getMaterialRGB())
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Fr2C2", true);

    BoronCarbide = builderISG("boron_carbide")
        .dust()
        .color(0x303030)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("B4C3", true);

    BoronFranciumCarbide = builderISG("boron_francium_carbide")
        .dust()
        .color(0x808080)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Fr4B4C7", true);

    MixedAstatideSalts = builderISG("mixed_astatide_salts")
        .dust()
        .color(0x6df63f)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("(At3)(Ho)(Th)(Cn)(Fl)", true);

    SodiumIodide = builderISG("sodium_iodide")
        .dust()
        .color(0x555588)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("NaI");

    SodiumIodate = builderISG("sodium_iodate")
        .dust()
        .color(0x11116d)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("NaIO3", true);

    SodiumPeriodate = builderISG("sodium_periodate")
        .dust()
        .color(0x11116d)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("NaIO4", true);

    SodiumSeaborgate = builderISG("sodium_seaborgate")
        .dust()
        .color(0x55bbd4)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Na2SgO4", true);

    StrontiumChloride = builderISG("strontium_chloride")
        .dust()
        .color(0x3a9aba)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("SrCl2", true);

    YttriumEuropiumVanadate = builderISG("yttrium_europium_vanadate")
        .dust()
        .color((GTMaterials.Yttrium.getMaterialRGB()+ GTMaterials.Europium.getMaterialRGB()+GTMaterials.Vanadium.getMaterialRGB())/3)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("YEuVO4", true);

    StrontiumEuropiumAluminate = builderISG("strontium_europium_aluminate")
        .dust()
        .color((GTMaterials.Strontium.getMaterialRGB()+ GTMaterials.Europium.getMaterialRGB()+GTMaterials.Aluminium.getMaterialRGB())/3)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("SrEuAl2O4", true);

    BariumStrontiumTitanate = builderISG("barium_strontium_titanate")
        .dust()
        .color(0xFF0066)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("BaO4SrTi", true);

    PotassiumManganate = builderISG("potassium_manganate")
        .dust()
        .color(0xaf20af)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("K2MnO4", true);

    BariumChloride = builderISG("barium_chloride")
        .dust()
        .color((GTMaterials.Barium.getMaterialRGB()+GTMaterials.Chlorine.getMaterialRGB())/2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("BaCl2", true);

    TantalumOxide = builderISG("tantalum_oxide")
        .dust()
        .color((GTMaterials.Tantalum.getMaterialRGB()+GTMaterials.Oxygen.getMaterialRGB())/2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Ta2O5", true);

    ZirconylChloride = builderISG("zirconyl_chloride")
        .dust()
        .color(ZirconiumTetrachloride.getMaterialRGB())
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("ZrOCl2", true);

    LeadSenenide = builderISG("lead_selenide")
        .dust()
        .color((GTMaterials.Lead.getMaterialRGB()+GTMaterials.Selenium.getMaterialRGB())/2)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("PbSe");

    LeadScandiumTantalate = builderISG("lead_scandium_tantalate")
        .dust()
        .color((GTMaterials.Lead.getMaterialRGB()+GTMaterials.Scandium.getMaterialRGB()+GTMaterials.Tantalum.getMaterialRGB())/3)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Pb(ScTa)O3", true);

    BETS = builderISG("bets")
        .dust()
        .color(0x7ada00)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("C10H8S4Se4", true);

    MagnetorestrictiveAlloy = builderISG("magnetorestrictive_alloy")
        .dust()
        .color(0xafefef)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Tb4Dy7Fe10Co5B2SiC", true);

    BoronOxide = builderISG("boron_oxide")
        .dust()
        .color((GTMaterials.Boron.getMaterialRGB()+GTMaterials.Oxygen.getMaterialRGB())/2)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("B2O3", true);

    LithiumAluminiumFluoride = builderISG("lithium_aluminium_fluoride")
        .dust()
        .color((GTMaterials.Lithium.getMaterialRGB()+GTMaterials.Aluminium.getMaterialRGB()+GTMaterials.Fluorine.getMaterialRGB())/3)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("AlF4Li", true);

    HafniumCarbide = builderISG("hafnium_carbide")
        .dust()
        .color(0x2c2c2c)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("HfC");

    SeaborgiumCarbide = builderISG("seaborgium_carbide")
        .dust()
        .color(0x2c2c2c)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("SgC");

    AluminiumNitrate = builderISG("aluminium_nitrate")
        .dust()
        .color(Alumina.getMaterialRGB())
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Al(NO3)3", true);

    NeodymiumDopedYttrium = builderISG("neodymium_doped_yttrium")
        .dust()
        .color(ISGMaterials.YttriumOxide.getMaterialRGB())
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("Nd:Y?");

    NdYAGNanoparticles = builderISG("nd_yag_nanoparticles")
        .dust()
        .color(0xcf8acf)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Nd:YAG");

    PotassiumPermanganate = builderISG("potassium_permanganate")
        .dust()
        .color(PotassiumManganate.getMaterialRGB()-15)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("KMnO4", true);

    Urea = builderISG("urea")
        .dust()
        .color(0x30cf20)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("CH4N2O", true);

    FluoroapatiteSolidResidue = builderISG("fluoroapatite_solid_residue")
        .dust()
        .color(0x3cb290)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Ca6PO4SiO3F", true);

    ApatiteSolidResidue = builderISG("apatite_solid_residue")
        .dust()
        .color(0x3cb290)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("Ca6PO4SiO3", true);

    AmmoniumBifluoride = builderISG("ammonium_bifluoride")
        .dust()
        .color(0x20cfcf)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("NH4HF2", true);

    SodiumArsenate = builderISG("sodium_arsenate")
        .dust()
        .color(0xbffabf)
        .iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("Na3AsO4", true);

    PrHoYLFNanoparticles = builderISG("prho_ylf_nanoparticles")
        .dust()
        .color(0x6f20af)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Pr/Ho:YLF");

    LuTmYVONanoparticles = builderISG("lutm_yvo_nanoparticles")
        .dust()
        .color(0x206faf)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Lu/Tm:YVO");

    PureSodiumVanadate = builderISG("pure_sodium_vanadate")
        .dust()
        .color(SodiumVanadate.getMaterialRGB())
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Na3VO4", true);

    AmmoniumCarbonate = builderISG("ammonium_carbonate")
        .dust()
        .color(AmmoniumSulfate.getMaterialRGB())
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("(NH4)2CO3", true);

    CadmiumSulfide = builderISG("cadmium_sulfide")
        .dust()
        .color(0xffff00)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("CdS");

    UnprocessedNdYAGDust = builderISG("unprocessed_ndyag_dust")
        .dust()
        .color(0xcf8acf)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("Nd:YAG?");

    LuTmYVOPrecipitate = builderISG("lutm_yvo_precipitate")
        .dust()
        .color(0x6f20af)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("Lu/Tm:YVO?");

    RawSienna = builderISG("raw_siena")
        .dust()
        .color(0x663300)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("SiO2(MnO2)(FeO2)", true);

    BurnedSienna = builderISG("burned_siena")
        .dust()
        .color(0xff0000)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("SiO2(MnO2)(FeO2)", true);

    BismuthVanadate = builderISG("bismuth_vanadate")
        .dust()
        .color(0xffff00)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("BiVO4", true);

    CopperArsenite = builderISG("copper_arsenite")
        .dust()
        .color(0x66ff66)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Cu3(AsO4)2", true);

    MercuryIodide = builderISG("mercury_iodide")
        .dust()
        .color(0xff0000)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("HgI2", true);

    TitaniumYellow = builderISG("titanium_yellow")
        .dust()
        .color(0xffff00)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("NiO(Sb2O3)(TiO2)20", true);

    CobaltZincOxide = builderISG("cobalt_zinc_oxide")
        .dust()
        .color(0x00ffff)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("CoZn4O5", true);

    ScheelesGreen = builderISG("scheeles_green")
        .dust()
        .color(0x00ff00)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("AsCuHO3", true);

    CobaltAluminate = builderISG("cobalt_aluminate")
        .dust()
        .color(0x0000ff)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("Al2Co2O5", true);

    AmmoniumManganesePhosphate = builderISG("ammonium_manganese_phosphate")
        .dust()
        .color(0x660066)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("NH4MnPO4", true);

    HanPurple = builderISG("hans_purple")
        .dust()
        .color(0x660066)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("BaCuSi2O6", true);

    DiaminostilbenedisulfonicAcid = builderISG("diaminostilbenedisulfonic_acid")
        .dust()
        .color(0xffffff)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C14H14N2O6S2", true);

    Nigrosin = builderISG("nigrosin")
        .dust()
        .color(0x000000)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C36H26N5ClNa2S2O6", true);

    DirectBrown = builderISG("direct_brown")
        .dust()
        .color(0x663300)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C26H19N6NaO3S", true);

    DianilineterephthalicAcid = builderISG("dianilineterephthalic_acid")
        .dust()
        .color(0xff0000)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C20H16N2O4", true);

    Quinacridone = builderISG("quinacridone")
        .dust()
        .color(0xff0000)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C20H12N2O2", true);

    DiarylideYellow = builderISG("diarylide_yellow")
        .dust()
        .color(0xffff00)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C32H26Cl2N6O4", true);

    AlizarineCyanineGreen = builderISG("alizarine_cyanine_green")
        .dust()
        .color(0x00ff00)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C28H20N2Na2O8S2", true);

    Aminoanthraquinone = builderISG("aminoanthraquinone")
        .dust()
        .color(0x0000ff)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C14H9NO2", true);

    IndanthroneBlue = builderISG("indanthrone_blue")
        .dust()
        .color(0x0000ff)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C28H14N2O2", true);

    Diketopyrrolopyrrole = builderISG("diketopyrrolopyrrole")
        .dust()
        .color(0xff6600)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C18H12N2O2", true);

    Mauveine = builderISG("mauveine")
        .dust()
        .color(0x660066)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C26H23N4", true);

    Indigo = builderISG("indigo")
        .dust()
        .color(0x0000ff)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C16H10N2O2", true);

    Tetrabromoindigo = builderISG("tetrabromoindigo")
        .dust()
        .color(0x00ff00)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C16H6Br2N2O2", true);

    CyanIndigoDye = builderISG("cyan_indigo_dye")
        .dust()
        .color(0x009999)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("(C16H10N2O2)2Br2", true);

    Fluorescein = builderISG("fluorescein")
        .dust()
        .color(0x990000)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C20H12O5", true);

    Erythrosine = builderISG("erythrosine")
        .dust()
        .color(0xff00ff)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C20H6I4Na2O5", true);

    ManganeseIIIOxide = builderISG("manganese_iii_oxide")
        .dust()
        .color(GTMaterials.Pyrolusite.getMaterialRGB())
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("Mn2O3", true);

    MercuryChloride = builderISG("mercury_chloride")
        .dust()
        .color(0xd6b8ad)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("HgCl2", true);

    SodiumSulfanilate = builderISG("sodium_sulfanilate")
        .dust()
        .color(0xe49879)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("C6H6NNaO3S", true);

    Anthraquinone = builderISG("anthraquinone")
        .dust()
        .color(0xfff782)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("C14H8O2", true);

    LithiumHydride = builderISG("lithium_hydride")
        .dust()
        .color((GTMaterials.Lithium.getMaterialRGB()+GTMaterials.Hydrogen.getMaterialRGB())/2)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("LiH");

    NiobiumChloride = builderISG("niobium_chloride")
        .dust()
        .color(GTMaterials.Niobium.getMaterialRGB())
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("NbCl5", true);

    NiobiumHydroxide = builderISG("niobium_hydroxide")
        .dust()
        .color(0x7c7c7c)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Nb(OH)5", true);

    MagnesiumFluoride = builderISG("magnesium_fluoride")
        .dust()
        .color(0xcfcfcf)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("MgF2", true);

    LithiumNiobateNanoparticles = builderISG("lithium_niobate_nanoparticles")
        .dust()
        .color(ISGMaterials.LithiumNiobate.getMaterialRGB()-10)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("LiNbO4", true);

    LithiumHydroxide = builderISG("lithium_hydroxide")
        .dust()
        .color((GTMaterials.Lithium.getMaterialRGB()+GTMaterials.Oxygen.getMaterialRGB()+GTMaterials.Hydrogen.getMaterialRGB())/3)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("LiOH");

    RhReNqCatalyst = builderISG("rhrenq_catalyst")
        .dust()
        .color((GTMaterials.Rhenium.getMaterialRGB()+GTMaterials.Rhodium.getMaterialRGB()+GTMaterials.Naquadah.getMaterialRGB())/3)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("ReRhNq");

    PalladiumAcetate = builderISG("palladium_acetate")
        .dust()
        .color(0xcc3300)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("C4H6O4Pd", true);

    FranciumCaesiumCadmiumBromide = builderISG("francium_caesium_cadmium_bromide")
        .dust()
        .color((GTMaterials.Francium.getMaterialRGB()+GTMaterials.Caesium.getMaterialRGB()+GTMaterials.Cadmium.getMaterialRGB()+GTMaterials.Bromine.getMaterialRGB())/4)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("FrCsCf2Br6");

    ZincSelenide = builderISG("zinc_selenide")
        .dust()
        .color(0xfcfc00)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("ZnSe");

    RhodamineB = builderISG("rhodamine_b")
        .dust()
        .color(0xfc2020)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("C28H31ClN2O3", true);

    Stilbene = builderISG("stilbene")
        .dust()
        .color(0x3c9c3c)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("C14H12", true);

    Tetracene = builderISG("tetracene")
        .dust()
        .color(0x99801a)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("C18H12", true);

    DitertbutylDicarbonate = builderISG("ditertbutyl_dicarbonate")
        .dust()
        .color(0xccccf6)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("C10H18O5", true);

    PotassiumBromide = builderISG("potassium_bromide")
        .dust()
        .color(0xe066a3)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("KBr");

    PotassiumBromate = builderISG("potassium_bromate")
        .dust()
        .color(0x8a4cd1)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("KBrO3", true);

    IBX = builderISG("ibx")
        .dust()
        .color(0x20208c)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("C7H5IO4", true);

    SodiumPertechnetate = builderISG("sodium_pertechnetate")
        .dust()
        .color(0x6162c4)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("NaTcO4", true);

    PotassiumPertechnate = builderISG("potassium_pertechnate")
        .dust()
        .color(0xdec451)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("KTcO4", true);

    PotassiumPerrhenate = builderISG("potassium_perrhenate")
        .dust()
        .color(0xdec451)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("KReO4", true);

    PotassiumNonahydridotechnetate = builderISG("potassium_nonahydridotechnetate")
        .dust()
        .color(0xede2a4)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("H9K2TcO4", true);

    PotassiumNonahydridorhenate = builderISG("potassium_nonahydridorhenate")
        .dust()
        .color(0xeae2a8)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("H9K2ReO4", true);

    LithiumIodide = builderISG("lithium_iodide")
        .dust()
        .color((GTMaterials.Lithium.getMaterialRGB()+GTMaterials.Iodine.getMaterialRGB()))
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("LiI");

    PalladiumLoadedRutileNanoparticles = builderISG("palladium_loaded_rutile_nanoparticles")
        .dust()
        .color((GTMaterials.Palladium.getMaterialRGB()+GTMaterials.Rutile.getMaterialRGB()))
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("PdTiO2", true);

    SaccharicAcid = builderISG("saccharic_acid")
        .dust()
        .color(Glucose.getMaterialRGB())
        .iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("C6H10O8");

    AdipicAcid = builderISG("adipic_acid")
        .dust()
        .color(0xda9288)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("C6H10O4");

    TetraethylammoniumNonahydridides = builderISG("tetraethylammonium_nonahydrides")
        .dust()
        .color(0xbee8b9)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("(C8H20N)(ReH9)(TcH9)", true);

    ManganeseFluoride = builderISG("manganese_fluoride")
        .dust()
        .color(GTMaterials.Pyrolusite.getMaterialRGB())
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("MnF2", true);

    GermaniumSulfide = builderISG("germanium_sulfide")
        .dust()
        .color(GermaniumOxide.getMaterialRGB())
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("GeS2", true);

    BismuthGermanate = builderISG("bismuth_germanate")
        .dust()
        .color(0x94cf5c)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Bi12GeO20", true);

    CesiumIodide = builderISG("cesium_iodide")
        .dust()
        .color(CaesiumHydroxide.getMaterialRGB())
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("CsI");

    TlTmCesiumIodide = builderISG("tl_tm_cesium_iodide")
        .dust()
        .color(CaesiumHydroxide.getMaterialRGB()*9/10+GTMaterials.Thallium.getMaterialRGB()/10)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("CsITlTm");

    CadmiumTungstate = builderISG("cadmium_tungstate")
        .dust()
        .color(ISGMaterials.CalciumTungstate.getMaterialRGB())
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("CdWO4", true);

    PolycyclicAromaticMix = builderISG("polycyclic_aromatic_mix")
        .dust()
        .color(Tetracene.getMaterialRGB())
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("C18H12", true);

    SodiumOxide = builderISG("sodium_oxide")
        .dust()
        .color(0x0373fc)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Na2O", true);

    GrapheneOxide = builderISG("graphene_oxide")
        .dust()
        .color(GTMaterials.Graphene.getMaterialRGB())
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("C(O2)", true);

    GraphiteOxide = builderISG("graphite_oxide")
        .dust()
        .color(GTMaterials.Graphite.getMaterialRGB())
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("C(O2)", true);

    GrapheneGelSuspension = builderISG("graphene_gel_suspension")
        .dust()
        .color(0xadadad)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("C");

    DryGrapheneGel = builderISG("dry_graphene_gel")
        .dust()
        .color(0x3a3ada)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C");

    SodiumPerchlorate = builderISG("sodium_perchlorate")
        .dust()
        .color(GTMaterials.Salt.getMaterialRGB())
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("NaClO4", true);

    Lanthanoids = builderISG("lanthanoids")
        .dust()
        .color((GTMaterials.Lanthanum.getMaterialRGB()+GTMaterials.Cerium.getMaterialRGB()+GTMaterials.Praseodymium.getMaterialRGB()+GTMaterials.Neodymium.getMaterialRGB()+GTMaterials.Promethium.getMaterialRGB()+GTMaterials.Samarium.getMaterialRGB()+GTMaterials.Europium.getMaterialRGB()+GTMaterials.Gadolinium.getMaterialRGB()+GTMaterials.Terbium.getMaterialRGB()+GTMaterials.Dysprosium.getMaterialRGB()+GTMaterials.Holmium.getMaterialRGB()+GTMaterials.Erbium.getMaterialRGB()+GTMaterials.Thulium.getMaterialRGB()+GTMaterials.Ytterbium.getMaterialRGB()+GTMaterials.Lutetium.getMaterialRGB())/15)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("LaPrNdPmSmEuGdTbDyHoErTmYbLu");

    Actinoids = builderISG("actinoids")
        .dust()
        .color((GTMaterials.Actinium.getMaterialRGB()+GTMaterials.Thorium.getMaterialRGB()+GTMaterials.Protactinium.getMaterialRGB()+GTMaterials.Uranium238.getMaterialRGB()+ISGMaterials.Neptunium.getMaterialRGB()+GTMaterials.Plutonium241.getMaterialRGB()+GTMaterials.Americium.getMaterialRGB()+GTMaterials.Curium.getMaterialRGB()+GTMaterials.Berkelium.getMaterialRGB()+GTMaterials.Californium.getMaterialRGB()+GTMaterials.Einsteinium.getMaterialRGB()+GTMaterials.Fermium.getMaterialRGB()+GTMaterials.Mendelevium.getMaterialRGB())/13)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("AcThPaNpPuAmCmBkCfEsFmMd");

    Alkalis = builderISG("alkalis")
        .dust()
        .color((GTMaterials.Lithium.getMaterialRGB()+GTMaterials.Beryllium.getMaterialRGB()+GTMaterials.Sodium.getMaterialRGB()+GTMaterials.Magnesium.getMaterialRGB()+GTMaterials.Potassium.getMaterialRGB()+GTMaterials.Calcium.getMaterialRGB()+GTMaterials.Scandium.getMaterialRGB()+GTMaterials.Rubidium.getMaterialRGB()+GTMaterials.Strontium.getMaterialRGB()+GTMaterials.Yttrium.getMaterialRGB()+GTMaterials.Caesium.getMaterialRGB()+GTMaterials.Barium.getMaterialRGB()+GTMaterials.Francium.getMaterialRGB()+GTMaterials.Radium.getMaterialRGB())/12)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("LiBeNaMgKCaScRbSrYCeBaFrRa");

    PreciousMetals = builderISG("precious_metals")
        .dust()
        .color((GTMaterials.Ruthenium.getMaterialRGB()+GTMaterials.Rhodium.getMaterialRGB()+GTMaterials.Palladium.getMaterialRGB()+GTMaterials.Silver.getMaterialRGB()+GTMaterials.Rhenium.getMaterialRGB()+GTMaterials.Osmium.getMaterialRGB()+GTMaterials.Iridium.getMaterialRGB()+GTMaterials.Platinum.getMaterialRGB()+GTMaterials.Gold.getMaterialRGB())/9)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("RuRhPdAgReOsIrPtAu");

    LightTranstionMetals = builderISG("light_transition_metals")
        .dust()
        .color((GTMaterials.Titanium.getMaterialRGB()+GTMaterials.Vanadium.getMaterialRGB()+GTMaterials.Chromium.getMaterialRGB()+GTMaterials.Manganese.getMaterialRGB()+GTMaterials.Iron.getMaterialRGB()+GTMaterials.Cobalt.getMaterialRGB()+GTMaterials.Nickel.getMaterialRGB()+GTMaterials.Copper.getMaterialRGB())/8)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("TiVCrMnFeCoNiCu");

    RefractoryMetals = builderISG("refractory_metals")
        .dust()
        .color((GTMaterials.Zirconium.getMaterialRGB()+ GTMaterials.Niobium.getMaterialRGB()+GTMaterials.Molybdenum.getMaterialRGB()+GTMaterials.Technetium.getMaterialRGB()+GTMaterials.Hafnium.getMaterialRGB()+GTMaterials.Tantalum.getMaterialRGB()+GTMaterials.Tungsten.getMaterialRGB())/7)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("ZrNbMoTcHfTaW");

    PostTransitionMetals = builderISG("post_transition_metals")
        .dust()
        .color((GTMaterials.Aluminium.getMaterialRGB()+GTMaterials.Silicon.getMaterialRGB()+GTMaterials.Zinc.getMaterialRGB()+GTMaterials.Gallium.getMaterialRGB()+GTMaterials.Germanium.getMaterialRGB()+GTMaterials.Cadmium.getMaterialRGB()+GTMaterials.Indium.getMaterialRGB()+GTMaterials.Tin.getMaterialRGB()+GTMaterials.Antimony.getMaterialRGB()+GTMaterials.Mercury.getMaterialRGB()+GTMaterials.Thallium.getMaterialRGB()+GTMaterials.Lead.getMaterialRGB()+GTMaterials.Bismuth.getMaterialRGB()+GTMaterials.Polonium.getMaterialRGB())/14)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("AlSiZnGaGeCdInSnSbHgTlPbBiPo");

    MercuryAcetate = builderISG("mercury_acetate")
        .dust()
        .color(0xcc8562)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Hg(CH3COO)2", true);

    CalciumCyanamide = builderISG("calcium_cyanamide")
        .dust()
        .color(CalciumCarbide.getMaterialRGB())
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("CaCN2", true);

    SelectivelyMutatedCupriavidiusNecator = builderISG("selectively_mutated_cupriavidius_necator")
        .dust()
        .color(CupriavidusNecator.getMaterialRGB() * 5 / 4)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Bacteria");

    PurifiedColumbite = builderISG("purified_columbite")
        .dust()
        .color(LeachedColumbite.getMaterialRGB())
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Ta2O5Nb18O45", true);

    PurifiedPyrochlore = builderISG("purified_pyrochlore")
        .dust()
        .color(LeachedPyrochlore.getMaterialRGB())
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Ta2O5Nb18O45", true);

    ChargedCesiumCeriumCobaltIndium = builderISG("charged_cesium_cerium_cobalt_indium")
        .dust()
        .color(0x52ad25)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("CsCeCo2In10", true);

    RheniumChloride = builderISG("rhenium_chloride")
        .dust()
        .color(0x3c2a5c)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("ReCl5", true);

    AntimonyTrichloride = builderISG("antimony_trichloride")
        .dust()
        .color(GTMaterials.AntimonyTrifluoride.getMaterialRGB())
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("SbCl3", true);

    LithiumCobaltOxide = builderISG("lithium_cobalt_oxide")
        .dust()
        .color(0xd2a4f3)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("LiCoO");

    LithiumTriflate = builderISG("lithium_triflate")
        .dust()
        .color(0xe2dae3)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("LiCSO3F3", true);

    Xylose = builderISG("xylose")
        .dust()
        .color(Glucose.getMaterialRGB())
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("C5H10O5", true);

    SiliconNanoparticles = builderISG("silicon_nanoparticles")
        .dust()
        .color(GTMaterials.Silicon.getMaterialRGB())
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Si?");

    Halloysite = builderISG("halloysite")
        .dust()
        .color(0x23423a)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Al9Si10O50Ga", true);

    GalliumChloride = builderISG("gallium_chloride")
        .dust()
        .color(0x92867a)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("GaCl3", true);

    SulfurCoatedHalloysite = builderISG("sulfur_coated_halloysite")
        .dust()
        .color(0x23973a)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("S2C2(Al9Si10O50Ga)", true);

    FluorideBatteryElectrolyte = builderISG("fluoride_battery_electrolyte")
        .dust()
        .color(0x9a628a)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("La9BaF29(C8H7F)", true);

    LanthanumNickelOxide = builderISG("lanthanum_nickel_oxide")
        .dust()
        .color(GTMaterials.Garnierite.getMaterialRGB()/2+GTMaterials.Lanthanum.getMaterialRGB()/2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("La2NiO4", true);

    Sorbose = builderISG("sorbose")
        .dust()
        .color(Glucose.getMaterialRGB())
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C6H12O6", true);

    CalciumAlginate = builderISG("calcium_alginate")
        .dust()
        .color(0x654321)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("CaC12H14O12", true);

    NickelOxideHydroxide = builderISG("nickel_oxide_hydroxide")
        .dust()
        .color(0xa2f2a2)
        .iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("NiO(OH)");

    BETSPerrhenate = builderISG("bets_perrhenate")
        .dust()
        .color(0x7ada00)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("ReC10H8S4Se4O4", true);

    TBCCODust = builderISG("tbcco_dust")
        .dust()
        .color(0x669900)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("TlBa2Ca2Cu3O10", true);

    BorocarbideDust = builderISG("borocarbide_dust")
        .dust()
        .color(0x9a9a2a)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("B4C7Fr4At6Ho2Th2Fl2Cn2", true);

    ActiniumSuperhydride = builderISG("actinium_superhydride")
        .dust()
        .color(GTMaterials.Actinium.getMaterialRGB() * 9 / 8)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("AcH12", true);

    StrontiumSuperconductorDust = builderISG("strontium_superconductor_dust")
        .dust()
        .color(0x45abf4)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Sr2RuSgO8", true);

    FullereneSuperconductiveDust = builderISG("fullerene_superconductor_dust")
        .dust()
        .color(0x99cc00)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("LaCsRb(C60)2", true);

    HassiumChloride = builderISG("hassium_chloride")
        .dust()
        .color(0x5d2abc)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("HsCl4", true);

    RheniumHassiumThalliumIsophtaloylbisdiethylthioureaHexafluorophosphate = builderISG("rhenium_hassium_thallium_isophtaloylbisdiethylthiourea")
        .dust()
        .color(0xa26a8b)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("ReHsTlC60PN12H84S6O12F6", true);

    Legendarium = builderISG("legendarium")
        .dust()
        .color(0xffffff)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("NqNq+*Nq*DrTrKeTnAdVb");

    LanthanumFullereneNanotubes = builderISG("lanthanum_fullerene_nanotubes")
        .dust()
        .color(LanthanumFullereneMix.getMaterialRGB()*3/5)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("La2(C60)2CNT", true);

    SodiumMetavanadate = builderISG("sodium_metavanadate")
        .dust()
        .color(GTMaterials.SodaAsh.getMaterialRGB())
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("NaVO3", true);

    PotassiumPeroxymonosulfate = builderISG("potassium_peroxymonosulfate")
        .dust()
        .color((ISGMaterials.PotassiumMetabisulfite.getMaterialRGB() + 20))
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("KHSO5", true);

    CoAcABCatalyst = builderISG("coacab_catalyst")
        .dust()
        .color(0x755f30)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("Co/AC-AB");

    SilverPerchlorate = builderISG("silver_perchlorate")
        .dust()
        .color(ISGMaterials.SilverChloride.getMaterialRGB())
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("AgClO4", true);

    SodiumChlorate = builderISG("sodium_chlorate")
        .dust()
        .color(GTMaterials.Salt.getMaterialRGB())
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("NaClO3", true);

    CopperLeach = builderISG("copper_leach")
        .dust()
        .color(0x765A30)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Cu3?", true);

    GoldLeach = builderISG("gold_leach")
        .dust()
        .color(0xBBA52B)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Cu3Au?", true);

    Durene = builderISG("durene")
        .dust()
        .color(0xA39C95)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("C6H2(CH3)4", true);

    PyromelliticDianhydride = builderISG("pyromellitic_dianhydride")
        .dust()
        .color(0xF0EAD6)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("C6H2(C2O3)2", true);

    CaliforniumTrioxide = builderISG("californiumtrioxide")
        .dust()
        .color(0x7cc922)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Cf2O3", true);

    CaliforniumTrichloride = builderISG("californiumtrichloride")
        .dust()
        .color(0x3e9837)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("CfCl3", true);

    IridiumTrioxide = builderISG("iridiumtrioxide")
        .dust()
        .color(0x9a9a2b)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Ir2O3", true);

    PotassiumHydroxylaminedisulfonate = builderISG("potassium_hydroxylaminedisulfonate")
        .dust()
        .color((0xF0EAD6 + NitrousAcid.getMaterialRGB())/2)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("KHSO3", true);

    SuccinicAnhydride = builderISG("succinic_anhydride")
        .dust()
        .color((SuccinicAcid.getMaterialRGB() + GTMaterials.AceticAnhydride.getMaterialRGB())/2)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("(CH2CO)2O", true);

    AmmoniumAcetate = builderISG("ammonium_acetate")
        .dust()
        .color(0xb6dee0)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("NH4CH3CO2", true);

    Acetamide = builderISG("acetamide")
        .dust()
        .color(0xa6bebf)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("CH3CONH2", true);

    Acetonitrile = builderISG("acetonitrile")
        .dust()
        .color(0xa2afb0)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("CH3CN", true);

    NHydroxysuccinimide = builderISG("n-hydroxysuccinimide")
        .dust()
        .color(0xdbcae3)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("(CH2CO)2NOH", true);

    Hexabenzylhexaazaisowurtzitane = builderISG("hexabenzylhexaazaisowurtzitane")
        .dust()
        .color(0x624573)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C48N6H48", true);

    SuccinimidylAcetate = builderISG("succinimidyl_acetate")
        .dust()
        .color(0xbd93a6)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C6H7NO4", true);

    DibenzylTetraacetylhexaazaisowurtzitane = builderISG("dibenzyltetraacetylhexaazaisowurtzitane")
        .dust()
        .color(0xb3c98b)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C28N6H32O4", true);

    HexanitroHexaazaisowurtzitane = builderISG("hexanitrohexaazaisowurtzitane")
        .dust()
        .color(0x414a4f)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("C6H6N12O12", true);

    NitroniumTetrafluoroborate = builderISG("nitronium_tetrafluoroborate")
        .dust()
        .color(0x686c6e)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("NO2BF4", true);

    NitrosoniumTetrafluoroborate = builderISG("nitrosonium_tetrafluoroborate")
        .dust()
        .color(0x7e8d94)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("NOBF4", true);

    Hexamethylenetetramine = builderISG("hexamethylenetetramine")
        .dust()
        .color(0x7e8d94)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("(CH2)6N4", true);

    PdCCatalyst = builderISG("pdc_catalyst")
        .dust()
        .color((GTMaterials.Palladium.getMaterialRGB() + GTMaterials.Carbon.getMaterialRGB())/2)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("PdC");

    Tetraacetyldinitrosohexaazaisowurtzitane = builderISG("tetraacetyldinitrosohexaazaisowurtzitane")
        .dust()
        .color((DibenzylTetraacetylhexaazaisowurtzitane.getMaterialRGB()+Hexabenzylhexaazaisowurtzitane.getMaterialRGB())/2)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C14N8H18O6", true);

    CrudeHexanitroHexaazaisowurtzitane = builderISG("crude_hexanitrohexaazaisowurtzitane")
        .dust()
        .color(HexanitroHexaazaisowurtzitane.getMaterialRGB()*5/7)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C6H6N12O12", true);

    PotassiumBisulfite = builderISG("potassium_bisulfite")
        .dust()
        .color(0xF0EAD6)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("KHSO3", true);

    PotassiumNitrite = builderISG("potassium_nitrite")
        .dust()
        .color(0xF0EAD6)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("KNO2", true);

    HydroxylammoniumSulfate = builderISG("hydroxylammonium_sulfate")
        .dust()
        .color(0xF0EAD6)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("(NH3OH)2SO4", true);

    SodiumBorohydride = builderISG("sodium_borohydride")
        .dust()
        .color(0xc2c2fa)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("NaBH4", true);

    SodiumTetrafluoroborate = builderISG("sodium_tetrafluoroborate")
        .dust()
        .color((SodiumBorohydride.getMaterialRGB()+GTMaterials.Fluorine.getMaterialRGB())/2)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("NaBF4", true);

    Decaborane = builderISG("decaborane")
        .dust()
        .color(Diborane.getMaterialRGB())
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("B10H14", true);

    CesiumCarboranePrecusor = builderISG("cesium_carborane_precursor")
        .dust()
        .color(0xb56487)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("CsB10H12CN(CH3)3Cl", true);

    CesiumCarborane = builderISG("cesium_carborane")
        .dust()
        .color(CesiumCarboranePrecusor.getMaterialRGB()*6/5)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("CsCB11H12", true);

    Fluorocarborane = builderISG("fluorocarborane")
        .dust()
        .color(0x20EB7A)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("HCHB11F11", true);

    CaesiumNitrate = builderISG("caesium_nitrate")
        .dust()
        .color(0x7452DC)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("CsNO3", true);

    SilverIodide = builderISG("silver_iodide")
        .dust()
        .color((ISGMaterials.SilverChloride.getMaterialRGB()*2+GTMaterials.Iodine.getMaterialRGB())/3)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("AgI");

    ActiniumTriniumHydroxides = builderISG("actinium_trinium_hydroxides")
        .dust()
        .color((ActiniumOxalate.getMaterialRGB()+GTMaterials.Trinium.getMaterialRGB())/2)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Ke3Ac2(OH)12", true);

    TriniumTetrafluoride = builderISG("trinium_tetrafluoride")
        .dust()
        .color(0x477347)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("KeF4", true);

    ActiniumNitrate = builderISG("actinium_nitrate")
        .dust()
        .color(YttriumNitrate.getMaterialRGB())
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Ac(NO3)3", true);

    RadiumNitrate = builderISG("radium_nitrate")
        .dust()
        .color(BariumNitrate.getMaterialRGB())
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("Ra(NO3)2", true);

    PhosphorousPentasulfide = builderISG("phosphorous_pentasulfide")
        .dust()
        .color(0xEBAD24)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("P4S10", true);

    PureCrystallineNitricAcid = builderISG("crystalline_nitric_acid")
        .dust()
        .color(GTMaterials.NitricAcid.getMaterialRGB())
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("HNO3", true);

    StoneResidueDust = builderISG("stone_residue_dust")
        .dust()
        .color(GTMaterials.Stone.getMaterialRGB()/5*3)
        .iconSet(ROUGH)
        .buildAndRegister();

    DiamagneticResidues = builderISG("diamagnetic_residues")
        .dust()
        .color((GTMaterials.Calcium.getMaterialRGB()+GTMaterials.Zinc.getMaterialRGB()+GTMaterials.Copper.getMaterialRGB()+GTMaterials.Gallium.getMaterialRGB()+GTMaterials.Beryllium.getMaterialRGB()+GTMaterials.Tin.getMaterialRGB())/15)
        .iconSet(DULL)
        .buildAndRegister();

    HeavyDiamagneticResidues = builderISG("heavy_diamagnetic_residues")
        .dust()
        .color((GTMaterials.Lead.getMaterialRGB()+GTMaterials.Mercury.getMaterialRGB()+GTMaterials.Cadmium.getMaterialRGB()+GTMaterials.Indium.getMaterialRGB()+GTMaterials.Gold.getMaterialRGB()+GTMaterials.Bismuth.getMaterialRGB())/15)
        .iconSet(DULL)
        .buildAndRegister();

    ParamagneticResidues = builderISG("paramagnetic_residues")
        .dust()
        .color((GTMaterials.Sodium.getMaterialRGB()+GTMaterials.Potassium.getMaterialRGB()+GTMaterials.Magnesium.getMaterialRGB()+GTMaterials.Titanium.getMaterialRGB()+GTMaterials.Vanadium.getMaterialRGB()+GTMaterials.Manganese.getMaterialRGB())/15)
        .iconSet(DULL)
        .buildAndRegister();

    HeavyParamagneticResidues = builderISG("heavy_paramagnetic_residues")
        .dust()
        .color((GTMaterials.Thorium.getMaterialRGB()+GTMaterials.Thallium.getMaterialRGB()+GTMaterials.Uranium238.getMaterialRGB()+GTMaterials.Tungsten.getMaterialRGB()+GTMaterials.Hafnium.getMaterialRGB()+GTMaterials.Tantalum.getMaterialRGB())/15)
        .iconSet(DULL)
        .buildAndRegister();

    FerromagneticResidues = builderISG("ferromagnetic_residues")
        .dust()
        .color((GTMaterials.Iron.getMaterialRGB()+GTMaterials.Nickel.getMaterialRGB()+GTMaterials.Cobalt.getMaterialRGB())/7)
        .iconSet(DULL)
        .buildAndRegister();

    HeavyFerromagneticResidues = builderISG("heavy_ferromagnetic_residues")
        .dust()
        .color(DysprosiumOxide.getMaterialRGB()*3/11)
        .iconSet(DULL)
        .buildAndRegister();

    UncommonResidues = builderISG("uncommon_residues")
        .dust()
        .color((ISGMaterials.Triniite.getMaterialRGB()+ISGMaterials.NaquadriaticTaranium.getMaterialRGB()+PreciousMetals.getMaterialRGB())/5)
        .iconSet(FINE)
        .buildAndRegister();

    PartiallyOxidizedResidues = builderISG("partially_oxidized_residues")
        .dust()
        .color(StoneResidueDust.getMaterialRGB()+Dioxygendifluoride.getMaterialRGB())
        .iconSet(DULL)
        .buildAndRegister();

    MetallicResidues = builderISG("metallic_residues")
        .dust()
        .color((DiamagneticResidues.getMaterialRGB()+ParamagneticResidues.getMaterialRGB()+ FerromagneticResidues.getMaterialRGB()+UncommonResidues.getMaterialRGB()/3)/4)
        .iconSet(DULL)
        .buildAndRegister();

    HeavyMetallicResidues = builderISG("heavy_metallic_residues")
        .dust()
        .color((HeavyDiamagneticResidues.getMaterialRGB()+HeavyParamagneticResidues.getMaterialRGB()+HeavyFerromagneticResidues.getMaterialRGB()+UncommonResidues.getMaterialRGB()/3)/4)
        .iconSet(DULL)
        .buildAndRegister();

    OxidizedResidues = builderISG("oxidized_residues")
        .dust()
        .color((DiamagneticResidues.getMaterialRGB()+ParamagneticResidues.getMaterialRGB()+ FerromagneticResidues.getMaterialRGB()+0x9f0000)/4)
        .iconSet(DULL)
        .buildAndRegister();

    HeavyOxidizedResidues = builderISG("heavy_oxidized_residues")
        .dust()
        .color((DiamagneticResidues.getMaterialRGB()+ParamagneticResidues.getMaterialRGB()+ FerromagneticResidues.getMaterialRGB()+0x9f0000)/4)
        .iconSet(DULL)
        .buildAndRegister();

    ExoticHeavyResidues = builderISG("exotic_heavy_residues")
        .dust()
        .color(NitratedTriniiteSolution.getMaterialRGB())
        .iconSet(SHINY)
        .buildAndRegister();

    CleanInertResidues = builderISG("clean_inert_residues")
        .dust()
        .color((ISGMaterials.Taranium.getMaterialRGB()+GTMaterials.Xenon.getMaterialRGB())/2)
        .iconSet(SHINY)
        .buildAndRegister();

    IridiumCyclooctadienylChlorideDimer = builderISG("iridium_cyclooctadienyl_chloride_dimer")
        .dust()
        .color((Dichlorocycloctadieneplatinium.getMaterialRGB()+GTMaterials.Iridium.getMaterialRGB())/2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Ir2(C8H12)2Cl2", true);

    FinelyPowderedRutile = builderISG("finely_powdered_rutile")
        .dust()
        .color(0xffffff)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("TiO2", true);

    InertResidues = builderISG("inert_residues")
        .dust()
        .color(0x61587a)
        .iconSet(SHINY)
        .buildAndRegister();
  }
}
