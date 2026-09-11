package com.zircky.industrialsorcerygreg.common.block;

import com.gregtechceu.gtceu.api.block.ICoilType;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.zircky.industrialsorcerygreg.ISGCore;
import com.zircky.industrialsorcerygreg.common.data.ISGMaterials;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.StringRepresentable;
import org.jetbrains.annotations.NotNull;

public enum CoilType implements StringRepresentable, ICoilType {

  ABYSSALALLOY("abyssalalloy", 12600, 16, 8, ISGMaterials.AbyssalAlloy, ISGCore.id("block/coil/abyssalalloy_coil_block")),
  TITANSTEEL("titansteel", 14400, 32, 8, ISGMaterials.TitanSteel, ISGCore.id("block/coil/titansteel_coil_block")),
  ADAMANTINE("adamantine", 16200, 32, 8, ISGMaterials.Adamantine, ISGCore.id("block/coil/adamantine_coil_block")),
  NAQUADRIATICTARANIUM("naquadriatictaranium", 18900, 64, 8, ISGMaterials.NaquadriaticTaranium, ISGCore.id("block/coil/naquadriatictaranium_coil_block")),
  STARMETAL("starmetal", 21600, 64, 8, ISGMaterials.Starmetal, ISGCore.id("block/coil/starmetal_coil_block")),
  INFINITY("infinity", 36000, 128, 9, ISGMaterials.Infinity, ISGCore.id("block/coil/infinity_coil_block")),
  HYPOGEN("hypogen", 62000, 256, 9, ISGMaterials.Hypogen, ISGCore.id("block/coil/hypogen_coil_block")),
  ETERNITY("eternity", 96000, 512, 9, ISGMaterials.Eternity, ISGCore.id("block/coil/eternity_coil_block")),
  URUIUM("uruium", 273, 1, 1, ISGMaterials.Uruium, ISGCore.id("block/coil/uruium_coil_block"));

  @NotNull
  private final String name;
  // electric blast furnace properties
  private final int coilTemperature;
  // multi smelter properties
  private final int level;
  private final int energyDiscount;
  @NotNull
  private final Material material;
  @NotNull
  private final ResourceLocation texture;

  CoilType(String name, int coilTemperature, int level, int energyDiscount, Material material,
           ResourceLocation texture) {
    this.name = name;
    this.coilTemperature = coilTemperature;
    this.level = level;
    this.energyDiscount = energyDiscount;
    this.material = material;
    this.texture = texture;
  }

  public int getTier() {
    return this.ordinal();
  }

  @Override
  public @NotNull String getName() {
    return name;
  }

  @Override
  public int getCoilTemperature() {
    return coilTemperature;
  }

  @Override
  public int getLevel() {
    return level;
  }

  @Override
  public int getEnergyDiscount() {
    return energyDiscount;
  }

  @Override
  public @NotNull Material getMaterial() {
    return material;
  }

  @Override
  public @NotNull ResourceLocation getTexture() {
    return texture;
  }

  @NotNull
  @Override
  public String toString() {
    return getName();
  }

  @Override
  @NotNull
  public String getSerializedName() {
    return name;
  }
}

