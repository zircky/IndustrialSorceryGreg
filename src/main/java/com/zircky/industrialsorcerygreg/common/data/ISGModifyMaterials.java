package com.zircky.industrialsorcerygreg.common.data;

import com.gregtechceu.gtceu.api.data.chemical.material.properties.FluidPipeProperties;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.ItemPipeProperties;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
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

    GTMaterials.Steel.addFlags(ISGMaterialFlags.GENERATE_COMPONENT);
    GTMaterials.Aluminium.addFlags(ISGMaterialFlags.GENERATE_COMPONENT);
    GTMaterials.StainlessSteel.addFlags(ISGMaterialFlags.GENERATE_COMPONENT);
    GTMaterials.Titanium.addFlags(ISGMaterialFlags.GENERATE_COMPONENT);
    GTMaterials.TungstenSteel.addFlags(ISGMaterialFlags.GENERATE_COMPONENT);
    GTMaterials.HSSS.addFlags(ISGMaterialFlags.GENERATE_COMPONENT);
    GTMaterials.Osmiridium.addFlags(ISGMaterialFlags.GENERATE_COMPONENT);
    GTMaterials.Tritanium.addFlags(ISGMaterialFlags.GENERATE_COMPONENT);

    ISGMaterials.addIngot(GTMaterials.Potassium);
    ISGMaterials.addIngot(GTMaterials.Hafnium);
    ISGMaterials.addIngot(GTMaterials.Zirconium);
    ISGMaterials.addIngot(GTMaterials.Strontium);


  }
}
