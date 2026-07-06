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
import static com.gregtechceu.gtceu.common.data.GTMaterials.Europium;
import static com.gregtechceu.gtceu.common.data.GTMaterials.Sapphire;
import static com.zircky.industrialsorcerygreg.api.data.material.ISGMaterialFlags.GENERATE_CURVED_PLATE;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.SNDART_FLAGS;
import static com.zircky.industrialsorcerygreg.common.data.materials.ISGMaterialIconSet.*;


public final class ExoticMaterials {
  private ExoticMaterials() {
  }

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
        .flags(ISGMaterialFlags.GENERATE_NANITES, GENERATE_FOIL, GENERATE_FRAME)
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
        .ingot().fluid()
        .color(0x828aad).iconSet(SHINY)
        .appendFlags(SNDART_FLAGS)
        .blastTemp(11220, HIGHEST, GTValues.VA[GTValues.UEV], ISGValues.HOURS * 4)
        .buildAndRegister().setFormula("Vb");

    Taranium = builderISG("taranium")
        .ingot().fluid()
        .color(0x0c0c0d)
        .iconSet(SHINY)
        .appendFlags(SNDART_FLAGS)
        .blastTemp(10000, HIGHEST)
        .buildAndRegister()
        .setFormula("Tn");

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

    Krypton = builderISG("krypton")
        .fluid().plasma()
        .color(0x31C42F)
        .iconSet(FLUID)
        .flags(DISABLE_DECOMPOSITION)
        .element(GTElements.Kr)
        .buildAndRegister();

    Polonium = builderISG("polonium")
        .dust().fluid()
        .color(0xC9D47E)
        .iconSet(DULL)
        .radioactiveHazard(2)
        .flags(GENERATE_PLATE, GENERATE_CURVED_PLATE)
        .buildAndRegister();

  }
}
