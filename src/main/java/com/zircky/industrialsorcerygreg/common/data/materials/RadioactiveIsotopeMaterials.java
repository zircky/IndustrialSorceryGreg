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


public final class RadioactiveIsotopeMaterials {
  private RadioactiveIsotopeMaterials() {
  }

  public static void register() {
    UraniumRadioactive = builderISG("uranium_radioactive")
        .ore()
        .ingot(3).fluid()
        .color(GTMaterials.Uranium238.getMaterialRGB())
        .iconSet(METALLIC)
        .appendFlags(SNDART_FLAGS)
        .element(GTElements.U)
        .radioactiveHazard(1)
        .buildAndRegister();

    Neptunium = builderISG("neptunium")
        .ingot(3).fluid()
        .color(0x284D7B)
        .iconSet(METALLIC)
        .appendFlags(SNDART_FLAGS)
        .element(GTElements.Np)
        .radioactiveHazard(2)
        .buildAndRegister();

    PlutoniumRadioactive = builderISG("plutonium_radioactive")
        .ingot(3).fluid()
        .color(GTMaterials.Plutonium239.getMaterialRGB())
        .iconSet(METALLIC)
        .appendFlags(SNDART_FLAGS)
        .element(GTElements.Pu)
        .radioactiveHazard(2)
        .buildAndRegister();

    Thorium233 = builderISG("thorium233")
        .langValue("Thorium 233")
        .ingot().fluid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(1)
        .buildAndRegister();

    Protactinium233 = builderISG("protactinium233")
        .langValue("Protactinium 233")
        .ingot().fluid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(2)
        .buildAndRegister();

    Uranium233 = builderISG("uraniumRadioactive233")
        .langValue("Uranium 233")
        .ingot().fluid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(1)
        .buildAndRegister();

    Uranium234 = builderISG("uraniumRadioactive234")
        .langValue("Uranium 234")
        .ingot().fluid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(1)
        .buildAndRegister();

    Uranium239 = builderISG("uraniumRadioactive239")
        .langValue("Uranium 239")
        .ingot().fluid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(1)
        .buildAndRegister();

    Neptunium235 = builderISG("neptunium_235")
        .ingot().fluid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(2)
        .buildAndRegister();

    Neptunium237 = builderISG("neptunium_237")
        .ingot().fluid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(2)
        .buildAndRegister();

    Neptunium239 = builderISG("neptunium_239")
        .ingot().fluid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(2)
        .buildAndRegister();

//    Plutonium239 = builderISG("plutoniumRadioactive239")
//        .la
//        .ingot().fluid()
//        .flags(GENERATE_LONG_ROD)
//        .radioactiveHazard(2)
//        .buildAndRegister();

    Plutonium240 = builderISG("plutonium_240")
        .ingot().fluid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(2)
        .buildAndRegister();

    Plutonium245 = builderISG("plutonium_245")
        .ingot().fluid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(2)
        .buildAndRegister();

    Americium241 = builderISG("americium_241")
        .ingot().fluid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Americium241Ox = builderISG("americium_241_ox")
        .ingot().fluid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Americium241Ni = builderISG("americium_241_ni")
        .ingot().fluid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Americium241Za = builderISG("americium_241_za")
        .ingot().fluid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Americium243 = builderISG("americium_243")
        .ingot().fluid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Americium245 = builderISG("americium_245")
        .ingot().fluid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Curium245 = builderISG("curium_245")
        .ingot().fluid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Curium246 = builderISG("curium_246")
        .ingot().fluid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Curium247 = builderISG("curium_247")
        .ingot().fluid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Curium250 = builderISG("curium_250")
        .ingot().fluid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Curium251 = builderISG("curium_251")
        .ingot().fluid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Berkelium247 = builderISG("berkelium_247")
        .ingot().fluid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Berkelium249 = builderISG("berkelium_249")
        .ingot().fluid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Berkelium251 = builderISG("berkelium_251")
        .ingot().fluid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Californium251 = builderISG("californium_251")
        .ingot().fluid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Californium252 = builderISG("californium_252")
        .ingot().fluid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Californium253 = builderISG("californium_253")
        .ingot().fluid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Californium256 = builderISG("californium_256")
        .ingot().fluid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Californium257 = builderISG("californium_257")
        .ingot().fluid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Einsteinium253 = builderISG("einsteinium_253")
        .ingot().fluid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Einsteinium255 = builderISG("einsteinium_255")
        .ingot().fluid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Einsteinium257 = builderISG("einsteinium_257")
        .ingot().fluid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Fermium257 = builderISG("fermium_257")
        .ingot().fluid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Fermium258 = builderISG("fermium_258")
        .ingot().fluid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Fermium259 = builderISG("fermium_259")
        .ingot().fluid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Fermium262 = builderISG("fermium_262")
        .ingot().fluid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Fermium263 = builderISG("fermium_263")
        .ingot().fluid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Mendelevium259 = builderISG("mendelevium_259")
        .ingot().fluid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Mendelevium261 = builderISG("mendelevium_261")
        .ingot().fluid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

    Mendelevium263 = builderISG("mendelevium_263")
        .ingot().fluid()
        .flags(GENERATE_LONG_ROD)
        .radioactiveHazard(3)
        .buildAndRegister();

  }
}
