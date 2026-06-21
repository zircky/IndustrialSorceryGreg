package com.zircky.industrialsorcerygreg.common.data;

import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlag;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.*;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.fluids.FluidBuilder;
import com.gregtechceu.gtceu.api.fluids.FluidState;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKey;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.zircky.industrialsorcerygreg.api.data.material.ISGMaterialFlags;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.GENERATE_BOLT_SCREW;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.GENERATE_FINE_WIRE;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.GENERATE_FRAME;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.GENERATE_GEAR;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.GENERATE_LONG_ROD;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.GENERATE_RING;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.GENERATE_ROD;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.GENERATE_ROTOR;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.GENERATE_ROUND;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.GENERATE_SMALL_GEAR;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.GENERATE_SPRING;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.GENERATE_SPRING_SMALL;
import static com.zircky.industrialsorcerygreg.api.data.material.ISGMaterialFlags.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.SNDART_FLAGS;

public class ISGModifyMaterials {
  public static void init() {
//    TagPrefix.ore.setIgnored(GTMaterials.Lithium, ()->);

    GTMaterials.Hafnium.addFlags(GENERATE_PLATE, GENERATE_FOIL, GENERATE_DENSE, GENERATE_ROD, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_RING, GENERATE_ROUND, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_GEAR, GENERATE_SMALL_GEAR, GENERATE_ROTOR, GENERATE_FRAME, GENERATE_FINE_WIRE);
    GTMaterials.Zirconium.addFlags(GENERATE_PLATE, GENERATE_FOIL, GENERATE_DENSE, GENERATE_ROD, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_RING, GENERATE_ROUND, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_GEAR, GENERATE_SMALL_GEAR, GENERATE_ROTOR, GENERATE_FRAME, GENERATE_FINE_WIRE);
    GTMaterials.Strontium.addFlags(GENERATE_PLATE, GENERATE_FOIL, GENERATE_DENSE, GENERATE_ROD, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_RING, GENERATE_ROUND, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_GEAR, GENERATE_SMALL_GEAR, GENERATE_ROTOR, GENERATE_FRAME, GENERATE_FINE_WIRE);

    GTMaterials.Platinum.addFlags(NO_SMELTING, NO_ORE_SMELTING);

    GTMaterials.Iron.addFlags(GENERATE_DOUBLE_INGOT, GENERATE_TRIPLE_INGOT, GENERATE_QUADRUPLE_INGOT, GENERATE_QUINTUPLE_INGOT, GENERATE_TRIPLE_PLATE, GENERATE_QUADRUPLE_PLATE, GENERATE_QUINTUPLE_PLATE, GENERATE_SUPERDENSE, GENERATE_SINGULARITY);
    GTMaterials.Aluminium.addFlags(GENERATE_DOUBLE_INGOT, GENERATE_TRIPLE_INGOT, GENERATE_QUADRUPLE_INGOT, GENERATE_QUINTUPLE_INGOT, GENERATE_TRIPLE_PLATE, GENERATE_QUADRUPLE_PLATE, GENERATE_QUINTUPLE_PLATE, GENERATE_SUPERDENSE, GENERATE_SINGULARITY);
    GTMaterials.Steel.addFlags(GENERATE_DOUBLE_INGOT, GENERATE_TRIPLE_INGOT, GENERATE_QUADRUPLE_INGOT, GENERATE_QUINTUPLE_INGOT, GENERATE_TRIPLE_PLATE, GENERATE_QUADRUPLE_PLATE, GENERATE_QUINTUPLE_PLATE, GENERATE_SUPERDENSE, GENERATE_SINGULARITY);
    GTMaterials.Silver.addFlags(GENERATE_DOUBLE_INGOT, GENERATE_TRIPLE_INGOT, GENERATE_QUADRUPLE_INGOT, GENERATE_QUINTUPLE_INGOT, GENERATE_TRIPLE_PLATE, GENERATE_QUADRUPLE_PLATE, GENERATE_QUINTUPLE_PLATE, GENERATE_SUPERDENSE, GENERATE_SINGULARITY);
    GTMaterials.Diamond.addFlags(GENERATE_DOUBLE_PLATE, GENERATE_TRIPLE_PLATE, GENERATE_QUADRUPLE_PLATE, GENERATE_QUINTUPLE_PLATE, GENERATE_SUPERDENSE, GENERATE_SINGULARITY);
    GTMaterials.TitaniumTungstenCarbide.addFlags(GENERATE_DENSE);
    GTMaterials.CertusQuartz.addFlags(GENERATE_BOLT_SCREW);

    GTMaterials.Steel.addFlags(ISGMaterialFlags.GENERATE_COMPONENT);
    GTMaterials.Aluminium.addFlags(ISGMaterialFlags.GENERATE_COMPONENT);
    GTMaterials.StainlessSteel.addFlags(ISGMaterialFlags.GENERATE_COMPONENT);
    GTMaterials.Titanium.addFlags(ISGMaterialFlags.GENERATE_COMPONENT);
    GTMaterials.TungstenSteel.addFlags(ISGMaterialFlags.GENERATE_COMPONENT);
    GTMaterials.HSSS.addFlags(ISGMaterialFlags.GENERATE_COMPONENT);
    GTMaterials.Osmiridium.addFlags(ISGMaterialFlags.GENERATE_COMPONENT);
    GTMaterials.Tritanium.addFlags(ISGMaterialFlags.GENERATE_COMPONENT);

    GTMaterials.Ruby.addFlags(DECOMPOSITION_BY_ELECTROLYZING, DISABLE_DECOMPOSITION);
    GTMaterials.RubySlurry.addFlags(DECOMPOSITION_BY_CENTRIFUGING);
    GTMaterials.Chromite.addFlags(DECOMPOSITION_BY_ELECTROLYZING, DISABLE_DECOMPOSITION);

    ISGMaterials.addIngot(GTMaterials.Potassium);
    ISGMaterials.addIngot(GTMaterials.Hafnium);
    ISGMaterials.addIngot(GTMaterials.Zirconium);
    ISGMaterials.addIngot(GTMaterials.Strontium);
    ISGMaterials.addIngot(GTMaterials.Scandium);
    ISGMaterials.addFluid(GTMaterials.Scandium);
    ISGMaterials.addFluid(GTMaterials.Radium);
//    GTMaterials.Scandium.setProperty(PropertyKey.DUST, new DustProperty());


//    ISGMaterials.addIngot(GTMaterials.Berkelium);
//    ISGMaterials.addIngot(GTMaterials.Californium);
//    ISGMaterials.addIngot(GTMaterials.Einsteinium);
//    ISGMaterials.addIngot(GTMaterials.Fermium);
//    ISGMaterials.addIngot(GTMaterials.Mendelevium);
//    ISGMaterials.addIngot(GTMaterials.Francium);
//    ISGMaterials.addIngot(GTMaterials.Curium);
//    ISGMaterials.addIngot(GTMaterials.Radium);
//    ISGMaterials.addIngot(GTMaterials.Actinium);
//    ISGMaterials.addIngot(GTMaterials.Hafnium);
//    ISGMaterials.addIngot(GTMaterials.Rhenium);
//    ISGMaterials.addIngot(GTMaterials.Technetium);
//    ISGMaterials.addIngot(GTMaterials.Thallium);
//    ISGMaterials.addIngot(GTMaterials.Germanium);
//    ISGMaterials.addIngot(GTMaterials.Selenium);
//    ISGMaterials.addIngot(GTMaterials.Astatine);
//    ISGMaterials.addIngot(GTMaterials.Rutherfordium);
//    ISGMaterials.addIngot(GTMaterials.Dubnium);
//    ISGMaterials.addIngot(GTMaterials.Seaborgium);
//    ISGMaterials.addIngot(GTMaterials.Bohrium);
//    ISGMaterials.addIngot(GTMaterials.Tennessine);
//    ISGMaterials.addIngot(GTMaterials.Livermorium);
//    ISGMaterials.addIngot(GTMaterials.Moscovium);
//    ISGMaterials.addIngot(GTMaterials.Nihonium);
//    ISGMaterials.addIngot(GTMaterials.Roentgenium);
//    ISGMaterials.addIngot(GTMaterials.Meitnerium);

//    GTMaterials.Berkelium.addFlags((MaterialFlag) SNDART_FLAGS);
//    GTMaterials.Californium.addFlags((MaterialFlag) SNDART_FLAGS);
//    GTMaterials.Einsteinium.addFlags((MaterialFlag) SNDART_FLAGS);
//    GTMaterials.Fermium.addFlags((MaterialFlag) SNDART_FLAGS);
//    GTMaterials.Mendelevium.addFlags((MaterialFlag) SNDART_FLAGS);
//    GTMaterials.Francium.addFlags((MaterialFlag) SNDART_FLAGS);
//    GTMaterials.Curium.addFlags((MaterialFlag) SNDART_FLAGS);
//    GTMaterials.Radium.addFlags((MaterialFlag) SNDART_FLAGS);
//    GTMaterials.Hafnium.addFlags((MaterialFlag) SNDART_FLAGS);
//    GTMaterials.Rhenium.addFlags((MaterialFlag) SNDART_FLAGS);
//    GTMaterials.Technetium.addFlags((MaterialFlag) SNDART_FLAGS);
//    GTMaterials.Thallium.addFlags((MaterialFlag) SNDART_FLAGS);
//    GTMaterials.Germanium.addFlags((MaterialFlag) SNDART_FLAGS);
//    GTMaterials.Selenium.addFlags((MaterialFlag) SNDART_FLAGS);
//    GTMaterials.Dubnium.addFlags((MaterialFlag) SNDART_FLAGS);
//    GTMaterials.Seaborgium.addFlags((MaterialFlag) SNDART_FLAGS);
//    GTMaterials.Bohrium.addFlags((MaterialFlag) SNDART_FLAGS);
//    GTMaterials.Livermorium.addFlags((MaterialFlag) SNDART_FLAGS);

  }
}
