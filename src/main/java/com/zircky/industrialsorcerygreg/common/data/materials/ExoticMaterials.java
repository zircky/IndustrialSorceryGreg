package com.zircky.industrialsorcerygreg.common.data.materials;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.ToolProperty;
import com.gregtechceu.gtceu.api.fluids.FluidBuilder;
import com.gregtechceu.gtceu.api.fluids.attribute.FluidAttributes;
import com.gregtechceu.gtceu.common.data.GTElements;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.zircky.industrialsorcerygreg.api.ISGValues;
import com.zircky.industrialsorcerygreg.api.data.material.ISGMaterialFlags;
import com.zircky.industrialsorcerygreg.common.data.ISGElement;
import com.zircky.industrialsorcerygreg.common.data.ISGMaterials;

import java.awt.*;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.FLUID;
import static com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty.GasTier.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.Plutonium239;
import static com.zircky.industrialsorcerygreg.api.data.material.ISGMaterialFlags.GENERATE_CURVED_PLATE;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.SNDART_FLAGS;
import static com.zircky.industrialsorcerygreg.common.data.materials.ISGMaterialIconSet.*;
import static com.zircky.industrialsorcerygreg.utils.register.MaterialsRegisterUtils.material;


public final class ExoticMaterials {
  private ExoticMaterials() {
  }

  public static void register() {
    Echoite = builderISG("echoite")
        .ingot()
        .fluid()
        .plasma()
        .radioactiveHazard(20)
        .blastTemp(17300, HIGHER)
        .element(ISGElement.ECHOITE)
        .color(0x26734d)
        .iconSet(METALLIC)
        .flags(GENERATE_ROD, GENERATE_FINE_WIRE)
        .cableProperties(GTValues.V[GTValues.UIV], 32, 0, true)
        .buildAndRegister();

    Mithril = builderISG("mithril")
        .ingot()
        .fluid()
        .plasma()
        .ore()
        .addOreByproducts(Actinium, Technetium)
        .blastTemp(14800, HIGHER)
        .element(ISGElement.MITHRIL)
        .color(0x4da6ff)
        .iconSet(METALLIC)
        .flags(GENERATE_PLATE, GENERATE_SPRING, GENERATE_FRAME, GENERATE_SPRING_SMALL, GENERATE_FOIL)
        .cableProperties(GTValues.V[GTValues.UEV], 2, 64)
        .buildAndRegister();

    EnergeticNetherite = builderISG("energetic_netherite")
        .ingot()
        .color(0x4b4042)
        .blastTemp(10200, HIGHEST, GTValues.VA[GTValues.ZPM], 600)
        .flags(IS_MAGNETIC, GENERATE_LONG_ROD)
        .iconSet(MAGNETIC)
        .buildAndRegister();

    Draconium = builderISG("draconium")
        .ingot()
        .fluid()
        .blastTemp(19200)
        .element(ISGElement.DRACONIUM)
        .color(0xa300cc)
        .iconSet(RADIOACTIVE)
        .flags(ISGMaterialFlags.GENERATE_NANITES, GENERATE_PLATE, GENERATE_DENSE, GENERATE_ROTOR, GENERATE_FRAME, GENERATE_GEAR, GENERATE_BOLT_SCREW, NO_SMELTING)
        .buildAndRegister();

    Quantanium = builderISG("quantanium")
        .ingot()
        .fluid()
        .blastTemp(12500, HIGHER)
        .element(ISGElement.QUANTANIUM)
        .color(0x0dff02)
        .iconSet(METALLIC)
        .flags(GENERATE_PLATE, GENERATE_ROTOR, GENERATE_GEAR, GENERATE_SMALL_GEAR, GENERATE_FRAME, GENERATE_DENSE)
        .buildAndRegister();

    CrystalMatrix = builderISG("crystal_matrix")
        .ingot()
        .fluid()
        .plasma()
        .radioactiveHazard(40)
        .blastTemp(19600, HIGHEST)
        .element(ISGElement.CRYSTALMATRIX)
        .color(0x33ffff)
        .iconSet(RADIOACTIVE)
        .flags(GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_FOIL)
        .cableProperties(GTValues.V[GTValues.OpV], 2, 128)
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

    TranscendentMetal = builderISG("transcendent_metal")
        .ingot()
        .fluid()
        .element(ISGElement.TRANSCENDENTMETAL)
        .color(0xffffff)
        .iconSet(TRANSCENDENT)
        .flags(ISGMaterialFlags.GENERATE_COMPONENT, ISGMaterialFlags.GENERATE_NANITES, GENERATE_ROUND, GENERATE_ROTOR, GENERATE_GEAR, GENERATE_BOLT_SCREW,
            GENERATE_SMALL_GEAR, GENERATE_LONG_ROD)
        .buildAndRegister();

    Infinity = builderISG("infinity")
        .ingot().langValue("Infinity")
        .liquid(new FluidBuilder().temperature(1000000).customStill())
        .blastTemp(32000, BlastProperty.GasTier.HIGHEST, GTValues.VA[GTValues.UEV], 900)
        .element(ISGElement.INFINITY)
        .iconSet(INFINITY)
        .flags(GENERATE_PLATE, ISGMaterialFlags.GENERATE_DOUBLE_PLATE, GENERATE_ROD, GENERATE_BOLT_SCREW, GENERATE_GEAR)
        .cableProperties(Integer.MAX_VALUE, 8192, 0, true, 300)
        .buildAndRegister();

    SpaceTime = builderISG("spacetime")
        .ingot()
        .liquid(new FluidBuilder().temperature(1).customStill())
        .fluidPipeProperties(2147483647, 33554431, true)
        .element(ISGElement.SPACETIME)
        .iconSet(SPACETIME)
        .flags(ISGMaterialFlags.GENERATE_NANITES, NO_UNIFICATION)
        .cableProperties(Integer.MAX_VALUE, 524288, 0, true)
        .buildAndRegister();

    WhiteDwarfMatter = builderISG("white_dwarf_mtter")
        .ingot()
        .fluid()
        .radioactiveHazard(10)
        .element(ISGElement.STAR_MATTER)
        .flags(ISGMaterialFlags.GENERATE_NANITES, GENERATE_FINE_WIRE)
        .iconSet(WHITE_DWARF_MATTER)
        .buildAndRegister();

    BlackDwarfMatter = builderISG("black_dwarf_mtter")
        .ingot()
        .fluid()
        .radioactiveHazard(10)
        .element(ISGElement.STAR_MATTER)
        .flags(ISGMaterialFlags.GENERATE_NANITES, GENERATE_FINE_WIRE)
        .iconSet(BLACK_DWARF_MATTER)
        .buildAndRegister();

    Magmatter = builderISG("magmatter")
        .ingot()
        .liquid(new FluidBuilder().customStill())
        .element(ISGElement.MAGMATTER)
        .iconSet(MAGMATTER)
        .flags(GENERATE_LONG_ROD, NO_UNIFICATION)
        .buildAndRegister();

    Eternity = builderISG("eternity")
        .ingot()
        .radioactiveHazard(100)
        .liquid(new FluidBuilder().customStill())
        .blastTemp(36000, null, GTValues.VA[GTValues.MAX], 3600)
        .element(ISGElement.ETERNITY)
        .iconSet(ETERNITY)
        .flags(ISGMaterialFlags.GENERATE_NANITES, GENERATE_FOIL, GENERATE_FRAME, GENERATE_ROD)
        .buildAndRegister();

    ChaosInfinityAlloy = material("chaos_infinity_alloy")
        .ingot()
        .radioactiveHazard(100)
        .liquid(new FluidBuilder().customStill())
        .color(0x1f0f1f)
        .blastTemp(32000, HIGHEST)
        .element(ISGElement.INFINITY)
        .iconSet(INFINITY_CHAOS)
        .flags(GENERATE_FRAME, GENERATE_GEAR, GENERATE_BOLT_SCREW, GENERATE_PLATE)
        .buildAndRegister()
        .setFormula("§8§kc§r§8∞§r§8§kc", false);

    AwakenedDraconium = material("awakened_draconium")
        .ingot().fluid().plasma()
        .radioactiveHazard(60)
        .blastTemp(22600, HIGHEST)
        .element(ISGElement.AWAKENEDDRACONIUM)
        .color(0xcc6600)
        .iconSet(METALLIC)
        .flags(GENERATE_FINE_WIRE)
        .cableProperties(GTValues.V[GTValues.OpV], 64, 0, true)
        .buildAndRegister();

    MagnetohydrodynamicallyConstrainedStarMatter = builderISG("magnetohydrodynamically_constrained_star_matter")
        .ingot()
        .radioactiveHazard(100)
        .liquid(new FluidBuilder().temperature(100).customStill())
        .element(ISGElement.RAW_STAR_MATTER)
        .iconSet(MAGNETOHYDRODYNAMICALLY_CONSTRAINED_STAR_MATTER)
        .flags(GENERATE_FRAME, GENERATE_FOIL, NO_UNIFICATION)
        .buildAndRegister();

    QuantumChromoDynamicallyConfinedMatter = builderISG("quantum_chromo_dynamically_confined_matter")
        .ingot()
        .fluid()
        .plasma()
        .radioactiveHazard(10)
        .element(ISGElement.QUANTUM_CHROMO_DYNAMICALLY_CONFINED_MATTER)
        .blastTemp(13100, HIGHER)
        .color(0xd08c38)
        .iconSet(QUANTUM_CHROMO_DYNAMICALLY)
        .itemPipeProperties(1000000, 1000000)
        .flags(GENERATE_FRAME, GENERATE_PLATE, GENERATE_CURVED_PLATE)
        .buildAndRegister();

    HexaphaseCopper = builderISG("hexaphasecopper")
        .ingot()
        .fluid()
        .plasma()
        .radioactiveHazard(100)
        .color(0xec7916)
        .element(ISGElement.HEXAPHASECOPPER)
        .blastTemp(75000, HIGHER)
        .iconSet(METALLIC)
        .flags(ISGMaterialFlags.GENERATE_NANITES, GENERATE_ROTOR, GENERATE_FRAME, GENERATE_GEAR, GENERATE_SMALL_GEAR, GENERATE_LONG_ROD)
        .buildAndRegister();

    Hypogen = builderISG("hypogen")
        .ingot()
        .fluid()
        .color(0xda916b)
        .secondaryColor(0x8f993b)
        .blastTemp(34000, HIGHEST)
        .element(ISGElement.HYPogen)
        .iconSet(RADIOACTIVE)
        .flags(GENERATE_PLATE)
        .cableProperties(Integer.MAX_VALUE, 32768, 0, true)
        .buildAndRegister();

    ChromaticGlass = builderISG("chromatic_glass")
        .gem()
        .fluid()
        .plasma()
        .radioactiveHazard(100)
        .element(ISGElement.CHROMATICGLASS)
        .flags(GENERATE_LENS)
        .iconSet(GLASS)
        .buildAndRegister();


    Etrium = builderISG("etrium")
        .ingot()
        .fluid()
        .blastTemp(11800, HIGHER)
        .element(ISGElement.ETRIUM)
        .color(new Color(123, 252, 215).getRGB())
        .iconSet(SHINY)
        .flags(GENERATE_FRAME, GENERATE_PLATE, GENERATE_FOIL, GENERATE_ROD)
        .buildAndRegister();

    Bedrockium = builderISG("bedrockium")
        .ingot().fluid().dust()
        .color(0x808080).iconSet(BEDROCKIUM)
        .itemPipeProperties(512, 64)
        .appendFlags(SNDART_FLAGS)
        .element(ISGElement.BEDROCKIUM)
        .cableProperties(GTValues.V[GTValues.UHV], 2, 32)
        .blastTemp(9900, BlastProperty.GasTier.HIGH, GTValues.VA[GTValues.ZPM], 17460)
        .buildAndRegister();

    Starmetal = builderISG("starmetal")
        .ingot()
        .fluid()
        .plasma()
        .radioactiveHazard(30)
//        .addOreByproducts(Sapphire, Polonium)
        .blastTemp(21800, HIGHEST)
        .element(ISGElement.STARMETAL)
        .color(0x0000e6)
        .iconSet(METALLIC)
        .flags(ISGMaterialFlags.GENERATE_NANITES, GENERATE_FINE_WIRE)
        .cableProperties(GTValues.V[GTValues.OpV], 4, 256)
        .buildAndRegister();

    Uruium = builderISG("uruium")
        .ingot()
        .fluid()
        .ore()
        .radioactiveHazard(10)
        .addOreByproducts(Europium, Etrium)
        .blastTemp(14600, HIGHER, GTValues.VA[GTValues.UIV], 1200)
        .element(ISGElement.URUIUM)
        .color(0x87ceeb)
        .flags(ISGMaterialFlags.GENERATE_NANITES)
        .iconSet(METALLIC)
        .cableProperties(Integer.MAX_VALUE, 16, 536870912)
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

    Vibranium = builderISG("vibranium")
        .ingot()
        .fluid()
        .plasma()
        .ore()
        .addOreByproducts(Plutonium239, Plutonium241)
        .blastTemp(18500, HIGHER)
        .element(ISGElement.VIBRANIUM)
        .color(0xff0000)
        .iconSet(METALLIC)
        .flags(ISGMaterialFlags.GENERATE_NANITES, GENERATE_PLATE, GENERATE_ROTOR, GENERATE_FRAME, GENERATE_DENSE)
        .buildAndRegister();

    Taranium = builderISG("taranium")
        .ingot()
        .fluid()
        .radioactiveHazard(5)
        .blastTemp(16200, HIGHEST, GTValues.VA[GTValues.UIV], 1440)
        .element(ISGElement.TARANIUM)
        .color(0x000033)
        .iconSet(RADIOACTIVE)
        .flags(GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_FOIL)
        .cableProperties(GTValues.V[GTValues.UXV], 2, 64)
        .buildAndRegister();

    MetastableOganesson = builderISG("metastable_oganesson")
        .ingot().fluid()
        .color(0xE61C24)
        .iconSet(SHINY)
        .appendFlags(SNDART_FLAGS)
        .element(GTElements.Og)
        .blastTemp(10380, HIGHEST)
        .buildAndRegister();

    MetastableFlerovium = builderISG("metastable_flerovium")
        .ingot().fluid()
        .color(0x521973)
        .iconSet(SHINY)
        .appendFlags(SNDART_FLAGS)
        .element(GTElements.Fl)
        .blastTemp(10990, HIGHEST)
        .buildAndRegister();

    MetastableHassium = builderISG("metastable_hassium")
        .ingot().fluid()
        .color(0x2d3a9d)
        .iconSet(SHINY)
        .appendFlags(SNDART_FLAGS)
        .element(GTElements.Hs)
        .blastTemp(11240, HIGHEST)
        .buildAndRegister();

    Orichalcum = builderISG("orichalcum")
        .ingot()
        .fluid()
        .plasma()
        .ore()
        .blastTemp(15300, HIGHER)
        .element(ISGElement.ORICHALCUM)
        .color(0xff78c9)
        .iconSet(METALLIC)
        .flags(ISGMaterialFlags.GENERATE_COMPONENT, ISGMaterialFlags.GENERATE_NANITES, GENERATE_ROUND, GENERATE_ROTOR, GENERATE_GEAR,
            GENERATE_SMALL_GEAR, GENERATE_LONG_ROD)
        .buildAndRegister();

    Infuscolium = material("infuscolium")
        .ingot()
        .fluid()
        .plasma()
        .radioactiveHazard(20)
        .blastTemp(17500, HIGHER)
        .element(ISGElement.INFUSCOLIUM)
        .color(0xff77ff)
        .iconSet(RADIOACTIVE)
        .flags(ISGMaterialFlags.GENERATE_COMPONENT, ISGMaterialFlags.GENERATE_NANITES, GENERATE_ROUND, GENERATE_ROTOR, GENERATE_GEAR,
            GENERATE_SMALL_GEAR, GENERATE_LONG_ROD)
        .buildAndRegister();

    AstralTitanium = material("astral_titanium")
        .ingot()
        .fluid()
        .plasma()
        .radioactiveHazard(10)
        .element(ISGElement.ASTRALTITANIUM)
        .color(0xf6cbf6)
        .flags(GENERATE_GEAR)
        .iconSet(BRIGHT)
        .buildAndRegister();

    CelestialTungsten = material("celestial_tungsten")
        .ingot()
        .fluid()
        .plasma()
        .radioactiveHazard(10)
        .element(ISGElement.CELESTIALTUNGSTEN)
        .color(0x303030)
        .flags(GENERATE_GEAR)
        .iconSet(BRIGHT)
        .buildAndRegister();

    Vibramantium = material("vibramantium")
        .ingot()
        .fluid()
        .blastTemp(18800, HIGHER, GTValues.VA[GTValues.UXV], 1800)
        .components(Vibranium, 1, Adamantium, 3)
        .color(0xff009c)
        .iconSet(METALLIC)
        .flags(ISGMaterialFlags.GENERATE_COMPONENT, GENERATE_ROUND, GENERATE_ROTOR, GENERATE_GEAR, GENERATE_SMALL_GEAR, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW,
            DISABLE_DECOMPOSITION)
        .buildAndRegister();

    Kevlar = material("kevlar")
        .polymer()
        .fluid()
        .color(0x9f9f53)
        .iconSet(DULL)
        .flags(GENERATE_FOIL)
        .buildAndRegister();
  }
}
