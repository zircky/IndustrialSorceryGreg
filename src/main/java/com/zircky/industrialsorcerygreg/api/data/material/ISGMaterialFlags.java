package com.zircky.industrialsorcerygreg.api.data.material;

import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlag;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.GENERATE_PLATE;

public class ISGMaterialFlags {
  public static final MaterialFlag RECIPE_MIXER = new MaterialFlag.Builder("recipe_mixer").build();

  public static final MaterialFlag GENERATE_CATALYST = new MaterialFlag.Builder("generate_catalyst")
      .build();

  public static final MaterialFlag GENERATE_NANITES = new MaterialFlag.Builder("generate_nanites")
      .build();

  public static final MaterialFlag GENERATE_CURVED_PLATE = new MaterialFlag.Builder("generate_curved_plate")
      .build();

  public static final MaterialFlag GENERATE_DOUBLE_INGOT = new MaterialFlag.Builder("generate_double_ingot")
      .requireProps(PropertyKey.INGOT)
      .build();

  public static final MaterialFlag GENERATE_TRIPLE_INGOT = new MaterialFlag.Builder("generate_triple_ingot")
      .requireProps(PropertyKey.INGOT)
      .build();

  public static final MaterialFlag GENERATE_QUADRUPLE_INGOT = new MaterialFlag.Builder("generate_quadruple_ingot")
      .requireProps(PropertyKey.INGOT)
      .build();

  public static final MaterialFlag GENERATE_QUINTUPLE_INGOT = new MaterialFlag.Builder("generate_quintuple_ingot")
      .requireProps(PropertyKey.INGOT)
      .build();

  public static final MaterialFlag GENERATE_DOUBLE_PLATE = new MaterialFlag.Builder("generate_double_plate")
      .requireFlags(GENERATE_PLATE)
      .requireProps(PropertyKey.DUST)
      .build();

  public static final MaterialFlag GENERATE_TRIPLE_PLATE = new MaterialFlag.Builder("generate_triple_plate")
      .requireFlags(GENERATE_PLATE)
      .requireProps(PropertyKey.DUST)
      .build();

  public static final MaterialFlag GENERATE_QUADRUPLE_PLATE = new MaterialFlag.Builder("generate_quadruple_plate")
      .requireFlags(GENERATE_PLATE)
      .requireProps(PropertyKey.DUST)
      .build();

  public static final MaterialFlag GENERATE_QUINTUPLE_PLATE = new MaterialFlag.Builder("generate_quintuple_plate")
      .requireFlags(GENERATE_PLATE)
      .requireProps(PropertyKey.DUST)
      .build();

  public static final MaterialFlag GENERATE_SUPERDENSE = new MaterialFlag.Builder("generate_superdense")
      .requireFlags(GENERATE_PLATE)
      .requireProps(PropertyKey.DUST)
      .build();

  public static final MaterialFlag GENERATE_SINGULARITY = new MaterialFlag.Builder("generate_singularity")
      .build();


  public static final MaterialFlag GENERATE_COMPONENT = new MaterialFlag.Builder("generate_component")
      .requireFlags(GENERATE_CURVED_PLATE, MaterialFlags.GENERATE_RING, MaterialFlags.GENERATE_ROUND)
      .build();

  public static final MaterialFlag CAN_BE_COOLED_DOWN_BY_BATHING = new MaterialFlag.Builder("can_be_cooled_down_by_bathing")
      .build();

  public static final MaterialFlag MAGICAL = new MaterialFlag.Builder("magical")
      .build();
}
