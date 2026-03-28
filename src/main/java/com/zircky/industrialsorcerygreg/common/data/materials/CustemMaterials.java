package com.zircky.industrialsorcerygreg.common.data.materials;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.ToolProperty;
import com.gregtechceu.gtceu.api.fluids.FluidBuilder;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.zircky.industrialsorcerygreg.common.data.ISGElement;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.GENERATE_FOIL;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.NO_SMELTING;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.METALLIC;
import static com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty.GasTier.HIGH;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.SNDART_FLAGS;
import static com.zircky.industrialsorcerygreg.integration.emi.materialtree.ISGMaterialIconSet.CHAOS;
import static com.zircky.industrialsorcerygreg.integration.emi.materialtree.ISGMaterialIconSet.INFINITY;

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
        .ingot().dust()
        .liquid(new FluidBuilder().temperature(1000000).customStill())
        .blastTemp(32000, BlastProperty.GasTier.HIGHEST, GTValues.VA[GTValues.UEV], 900)
        .element(ISGElement.INFINITY)
        .iconSet(INFINITY)
        .appendFlags(SNDART_FLAGS)
        .cableProperties(Integer.MAX_VALUE, 8192, 0, true, 300)
        .toolStats(ToolProperty.Builder.of(0.1f, Float.POSITIVE_INFINITY, Integer.MAX_VALUE, 100).build())
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
