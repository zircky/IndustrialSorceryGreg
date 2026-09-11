package com.zircky.industrialsorcerygreg.common.block.components;

import com.zircky.industrialsorcerygreg.api.machine.multiblock.component.casing.IPistonData;
import org.jetbrains.annotations.NotNull;

public enum PistonCasingType implements IPistonData {
  PISTON_LV("piston_lv", 1),
  PISTON_MV("piston_mv", 2),
  PISTON_HV("piston_hv", 3),
  PISTON_EV("piston_ev", 4),
  PISTON_IV("piston_iv", 5),
  PISTON_LUV("piston_luv", 6),
  PISTON_ZPM("piston_zpm", 7),
  PISTON_UV("piston_uv", 8),
  PISTON_UHV("piston_uhv", 9),
  PISTON_UEV("piston_uev", 10),
  PISTON_UIV("piston_uiv", 11),
  PISTON_UXV("piston_uxv", 12),
  PISTON_OPV("piston_opv", 13),
  PISTON_MAX("piston_max", 14);


  private final String name;
  private final int tier;

  PistonCasingType(String name, int tier) {
    this.name = name;
    this.tier = tier;
  }

  @Override
  public int getTier() {
    return tier;
  }

  @Override
  public @NotNull String getSerializedName() {
    return this.name;
  }

  @Override
  public String toString() {
    return getSerializedName();
  }
}
