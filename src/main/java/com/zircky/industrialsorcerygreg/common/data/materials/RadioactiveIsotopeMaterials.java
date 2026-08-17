package com.zircky.industrialsorcerygreg.common.data.materials;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlag;
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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.FLUID;
import static com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty.GasTier.HIGH;
import static com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty.GasTier.HIGHEST;
import static com.zircky.industrialsorcerygreg.api.data.material.ISGMaterialFlags.GENERATE_DOUBLE_PLATE;
import static com.zircky.industrialsorcerygreg.api.data.material.ISGMaterialFlags.GENERATE_PARTICLE_SOURCE;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.SNDART_FLAGS;
import static com.zircky.industrialsorcerygreg.common.data.materials.ISGMaterialIconSet.CHAOS;
import static com.zircky.industrialsorcerygreg.common.data.materials.ISGMaterialIconSet.INFINITY;


public final class RadioactiveIsotopeMaterials {
  private static final List<MaterialFlag> RADIOACTIVE = new ArrayList<>();

  static {
    RADIOACTIVE.addAll(Arrays.asList(GENERATE_PLATE, GENERATE_DENSE, GENERATE_ROD, GENERATE_BOLT_SCREW, GENERATE_GEAR, GENERATE_FOIL, GENERATE_FINE_WIRE, GENERATE_LONG_ROD, GENERATE_DOUBLE_PLATE, GENERATE_FRAME, GENERATE_PARTICLE_SOURCE));
  }

  private RadioactiveIsotopeMaterials() {
  }

  public static void register() {
    Thorium233 = builderISG("thorium_233")
        .langValue("Thorium 233")
        .ingot().fluid()
        .color(GTMaterials.Thorium.getMaterialARGB()).secondaryColor(GTMaterials.Thorium.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(1)
        .buildAndRegister();

    Protactinium233 = builderISG("protactinium_233")
        .langValue("Protactinium 233")
        .ingot().fluid()
        .color(GTMaterials.Protactinium.getMaterialARGB()).secondaryColor(GTMaterials.Protactinium.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(2)
        .buildAndRegister();

    Uranium233 = builderISG("uranium_233")
        .ingot().fluid()
        .color(GTMaterials.Uranium238.getMaterialARGB()).secondaryColor(GTMaterials.Uranium238.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(1)
        .buildAndRegister();

    Uranium233Ox = builderISG("uranium_233_ox")
        .ingot().fluid()
        .color(GTMaterials.Uranium238.getMaterialARGB()).secondaryColor(GTMaterials.Uranium238.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(1)
        .buildAndRegister();

    Uranium233Ni = builderISG("uranium_233_ni")
        .ingot().fluid()
        .color(GTMaterials.Uranium238.getMaterialARGB()).secondaryColor(GTMaterials.Uranium238.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(1)
        .buildAndRegister();

    Uranium233Za = builderISG("uranium_233_za")
        .ingot().fluid()
        .color(GTMaterials.Uranium238.getMaterialARGB()).secondaryColor(GTMaterials.Uranium238.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(1)
        .buildAndRegister();


    Uranium234 = builderISG("uranium_234")
        .ingot().fluid()
        .color(GTMaterials.Uranium238.getMaterialARGB()).secondaryColor(GTMaterials.Uranium238.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(1)
        .buildAndRegister();

    Uranium234Ox = builderISG("uranium_234_ox")
        .ingot().fluid()
        .color(GTMaterials.Uranium238.getMaterialARGB()).secondaryColor(GTMaterials.Uranium238.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(1)
        .buildAndRegister();

    Uranium234Ni = builderISG("uranium_234_ni")
        .ingot().fluid()
        .color(GTMaterials.Uranium238.getMaterialARGB()).secondaryColor(GTMaterials.Uranium238.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(1)
        .buildAndRegister();

    Uranium234Za = builderISG("uranium_234_za")
        .ingot().fluid()
        .color(GTMaterials.Uranium238.getMaterialARGB()).secondaryColor(GTMaterials.Uranium238.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(1)
        .buildAndRegister();

    Uranium239 = builderISG("uranium_239")
        .ingot().fluid()
        .color(GTMaterials.Uranium238.getMaterialARGB()).secondaryColor(GTMaterials.Uranium238.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(1)
        .buildAndRegister();

    Neptunium235 = builderISG("neptunium_235")
        .ingot().fluid()
        .color(GTMaterials.Neptunium.getMaterialARGB()).secondaryColor(GTMaterials.Neptunium.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(2)
        .buildAndRegister();

    Neptunium237 = builderISG("neptunium_237")
        .ingot().fluid()
        .color(GTMaterials.Neptunium.getMaterialARGB()).secondaryColor(GTMaterials.Neptunium.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(2)
        .buildAndRegister();

    Neptunium239 = builderISG("neptunium_239")
        .ingot().fluid()
        .color(GTMaterials.Neptunium.getMaterialARGB()).secondaryColor(GTMaterials.Neptunium.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(2)
        .buildAndRegister();

    Plutonium240 = builderISG("plutonium_240")
        .ingot().fluid()
        .color(GTMaterials.Plutonium241.getMaterialARGB()).secondaryColor(GTMaterials.Plutonium241.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(2)
        .buildAndRegister();

    Plutonium245 = builderISG("plutonium_245")
        .ingot().fluid()
        .color(GTMaterials.Plutonium241.getMaterialARGB()).secondaryColor(GTMaterials.Plutonium241.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(2)
        .buildAndRegister();

    Americium241 = builderISG("americium_241")
        .ingot().fluid()
        .color(GTMaterials.Americium.getMaterialARGB()).secondaryColor(GTMaterials.Americium.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(3)
        .buildAndRegister();

    Americium241Ox = builderISG("americium_241_ox")
        .ingot().fluid()
        .color(GTMaterials.Americium.getMaterialARGB()).secondaryColor(GTMaterials.Americium.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(3)
        .buildAndRegister();

    Americium241Ni = builderISG("americium_241_ni")
        .ingot().fluid()
        .color(GTMaterials.Americium.getMaterialARGB()).secondaryColor(GTMaterials.Americium.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(3)
        .buildAndRegister();

    Americium241Za = builderISG("americium_241_za")
        .ingot().fluid()
        .color(GTMaterials.Americium.getMaterialARGB()).secondaryColor(GTMaterials.Americium.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(3)
        .buildAndRegister();

    Americium243 = builderISG("americium_243")
        .ingot().fluid()
        .color(GTMaterials.Americium.getMaterialARGB()).secondaryColor(GTMaterials.Americium.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(3)
        .buildAndRegister();

    Americium245 = builderISG("americium_245")
        .ingot().fluid()
        .color(GTMaterials.Americium.getMaterialARGB()).secondaryColor(GTMaterials.Americium.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(3)
        .buildAndRegister();

    Curium245 = builderISG("curium_245")
        .ingot().fluid()
        .color(GTMaterials.Curium.getMaterialARGB()).secondaryColor(GTMaterials.Curium.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(3)
        .buildAndRegister();

    Curium246 = builderISG("curium_246")
        .ingot().fluid()
        .color(GTMaterials.Curium.getMaterialARGB()).secondaryColor(GTMaterials.Curium.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(3)
        .buildAndRegister();

    Curium247 = builderISG("curium_247")
        .ingot().fluid()
        .color(GTMaterials.Curium.getMaterialARGB()).secondaryColor(GTMaterials.Curium.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(3)
        .buildAndRegister();

    Curium250 = builderISG("curium_250")
        .ingot().fluid()
        .color(GTMaterials.Curium.getMaterialARGB()).secondaryColor(GTMaterials.Curium.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(3)
        .buildAndRegister();

    Curium251 = builderISG("curium_251")
        .ingot().fluid()
        .color(GTMaterials.Curium.getMaterialARGB()).secondaryColor(GTMaterials.Curium.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(3)
        .buildAndRegister();

    Berkelium247 = builderISG("berkelium_247")
        .ingot().fluid()
        .color(GTMaterials.Berkelium.getMaterialARGB()).secondaryColor(GTMaterials.Berkelium.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(3)
        .buildAndRegister();

    Berkelium249 = builderISG("berkelium_249")
        .ingot().fluid()
        .color(GTMaterials.Berkelium.getMaterialARGB()).secondaryColor(GTMaterials.Berkelium.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(3)
        .buildAndRegister();

    Berkelium251 = builderISG("berkelium_251")
        .ingot().fluid()
        .color(GTMaterials.Berkelium.getMaterialARGB()).secondaryColor(GTMaterials.Berkelium.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(3)
        .buildAndRegister();

    Californium251 = builderISG("californium_251")
        .ingot().fluid()
        .color(GTMaterials.Californium.getMaterialARGB()).secondaryColor(GTMaterials.Californium.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(3)
        .buildAndRegister();

    Californium252 = builderISG("californium_252")
        .ingot().fluid()
        .color(GTMaterials.Californium.getMaterialARGB()).secondaryColor(GTMaterials.Californium.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(3)
        .buildAndRegister();

    Californium253 = builderISG("californium_253")
        .ingot().fluid()
        .color(GTMaterials.Californium.getMaterialARGB()).secondaryColor(GTMaterials.Californium.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(3)
        .buildAndRegister();

    Californium256 = builderISG("californium_256")
        .ingot().fluid()
        .color(GTMaterials.Californium.getMaterialARGB()).secondaryColor(GTMaterials.Californium.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(3)
        .buildAndRegister();

    Californium257 = builderISG("californium_257")
        .ingot().fluid()
        .color(GTMaterials.Californium.getMaterialARGB()).secondaryColor(GTMaterials.Californium.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(3)
        .buildAndRegister();

    Einsteinium253 = builderISG("einsteinium_253")
        .ingot().fluid()
        .color(GTMaterials.Einsteinium.getMaterialARGB()).secondaryColor(GTMaterials.Einsteinium.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(3)
        .buildAndRegister();

    Einsteinium255 = builderISG("einsteinium_255")
        .ingot().fluid()
        .color(GTMaterials.Einsteinium.getMaterialARGB()).secondaryColor(GTMaterials.Einsteinium.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(3)
        .buildAndRegister();

    Einsteinium257 = builderISG("einsteinium_257")
        .ingot().fluid()
        .color(GTMaterials.Einsteinium.getMaterialARGB()).secondaryColor(GTMaterials.Einsteinium.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(3)
        .buildAndRegister();

    Fermium257 = builderISG("fermium_257")
        .ingot().fluid()
        .color(GTMaterials.Fermium.getMaterialARGB()).secondaryColor(GTMaterials.Fermium.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(3)
        .buildAndRegister();

    Fermium258 = builderISG("fermium_258")
        .ingot().fluid()
        .color(GTMaterials.Fermium.getMaterialARGB()).secondaryColor(GTMaterials.Fermium.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(3)
        .buildAndRegister();

    Fermium259 = builderISG("fermium_259")
        .ingot().fluid()
        .color(GTMaterials.Fermium.getMaterialARGB()).secondaryColor(GTMaterials.Fermium.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(3)
        .buildAndRegister();

    Fermium262 = builderISG("fermium_262")
        .ingot().fluid()
        .color(GTMaterials.Fermium.getMaterialARGB()).secondaryColor(GTMaterials.Fermium.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(3)
        .buildAndRegister();

    Fermium263 = builderISG("fermium_263")
        .ingot().fluid()
        .color(GTMaterials.Fermium.getMaterialARGB()).secondaryColor(GTMaterials.Fermium.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(3)
        .buildAndRegister();

    Mendelevium259 = builderISG("mendelevium_259")
        .ingot().fluid()
        .color(GTMaterials.Mendelevium.getMaterialARGB()).secondaryColor(GTMaterials.Mendelevium.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(3)
        .buildAndRegister();

    Mendelevium261 = builderISG("mendelevium_261")
        .ingot().fluid()
        .color(GTMaterials.Mendelevium.getMaterialARGB()).secondaryColor(GTMaterials.Mendelevium.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(3)
        .buildAndRegister();

    Mendelevium263 = builderISG("mendelevium_263")
        .ingot().fluid()
        .color(GTMaterials.Mendelevium.getMaterialARGB()).secondaryColor(GTMaterials.Mendelevium.getMaterialSecondaryARGB())
        .appendFlags(RADIOACTIVE)
        .radioactiveHazard(3)
        .buildAndRegister();

  }
}
