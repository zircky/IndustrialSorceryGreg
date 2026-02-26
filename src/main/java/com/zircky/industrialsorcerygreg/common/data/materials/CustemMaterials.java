package com.zircky.industrialsorcerygreg.common.data.materials;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.ToolProperty;
import com.gregtechceu.gtceu.api.fluids.FluidBuilder;
import com.zircky.industrialsorcerygreg.common.data.ISGElement;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.GENERATE_FOIL;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.NO_SMELTING;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.SNDART_FLAGS;
import static com.zircky.industrialsorcerygreg.integration.emi.ISGMaterialIconSet.CHAOS;
import static com.zircky.industrialsorcerygreg.integration.emi.ISGMaterialIconSet.INFINITY;

public class CustemMaterials {
  public static void register() {
    Draconium = new Material.Builder(GTCEu.id("draconium"))
        .ingot(4)
        .fluid()
        .blastTemp(19200)
        .element(ISGElement.DRACONIUM)
        .color(0xa300cc)
        .iconSet(MaterialIconSet.RADIOACTIVE)
        .appendFlags(SNDART_FLAGS, NO_SMELTING)
        .buildAndRegister();

    Chaos = new Material.Builder(GTCEu.id("chaos"))
        .ingot()
        .liquid(new FluidBuilder().temperature(1000000).customStill())
        .plasma()
        .blastTemp(28000, BlastProperty.GasTier.HIGHEST, GTValues.VA[GTValues.UIV], 3000)
        .element(ISGElement.CHAOS)
        .iconSet(CHAOS)
        .color(0x000000)
        .flags(GENERATE_FOIL)
        .buildAndRegister();

    Infinity = new Material.Builder(GTCEu.id("infinity"))
        .ingot().dust()
        .liquid(new FluidBuilder().temperature(1000000).customStill())
        .blastTemp(32000, BlastProperty.GasTier.HIGHEST, GTValues.VA[GTValues.UEV], 900)
        .element(ISGElement.INFINITY)
        .iconSet(INFINITY)
        .appendFlags(SNDART_FLAGS)
        .cableProperties(Integer.MAX_VALUE, 8192, 0, true, 300)
        .toolStats(ToolProperty.Builder.of(0.1f, Float.MAX_VALUE, Integer.MAX_VALUE, 100).build())
        .buildAndRegister();
  }
}
