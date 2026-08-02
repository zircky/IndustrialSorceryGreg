package com.zircky.industrialsorcerygreg.common.data.materials;

import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.zircky.industrialsorcerygreg.common.data.ISGMaterials;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.GENERATE_LONG_ROD;
import static com.zircky.industrialsorcerygreg.utils.register.MaterialsRegisterUtils.material;

public class UnsortedMaterials {
  public static void register() {
    ISGMaterials.Plutonium244Isotope = material("plutonium_244")
        .ingot().liquid()
        .color(GTMaterials.Plutonium239.getMaterialRGB())
        .iconSet(MaterialIconSet.RADIOACTIVE)
        .radioactiveHazard(2)
        .flags(GENERATE_LONG_ROD)
        .buildAndRegister();
  }
}
