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

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.FLUID;
import static com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty.GasTier.HIGH;
import static com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty.GasTier.HIGHEST;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.SNDART_FLAGS;
import static com.zircky.industrialsorcerygreg.common.data.materials.ISGMaterialIconSet.CHAOS;
import static com.zircky.industrialsorcerygreg.common.data.materials.ISGMaterialIconSet.INFINITY;


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
        .flags(GENERATE_PLATE, ISGMaterialFlags.GENERATE_CURVED_PLATE)
        .buildAndRegister();

  }
}
