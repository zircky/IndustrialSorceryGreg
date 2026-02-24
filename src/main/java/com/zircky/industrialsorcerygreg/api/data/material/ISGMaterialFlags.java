package com.zircky.industrialsorcerygreg.api.data.material;

import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlag;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;

public class ISGMaterialFlags {
  public static final MaterialFlag GENERATE_NANITES = new MaterialFlag.Builder("generate_nanites")
      .build();

  public static final MaterialFlag GENERATE_CURVED_PLATE = new MaterialFlag.Builder("generate_curved_plate")
      .build();

  public static final MaterialFlag GENERATE_COMPONENT = new MaterialFlag.Builder("generate_component")
      .requireFlags(GENERATE_CURVED_PLATE, MaterialFlags.GENERATE_RING, MaterialFlags.GENERATE_ROUND)
      .build();
}
