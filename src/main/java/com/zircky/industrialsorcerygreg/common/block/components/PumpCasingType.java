package com.zircky.industrialsorcerygreg.common.block.components;

import com.zircky.industrialsorcerygreg.api.machine.multiblock.component.casing.IPumpData;
import org.jetbrains.annotations.NotNull;

public enum PumpCasingType implements IPumpData {
  PUMP_LV("pump_lv", 1),
  PUMP_MV("pump_mv", 2),
  PUMP_HV("pump_hv", 3),
  PUMP_EV("pump_ev", 4),
  PUMP_IV("pump_iv", 5),
  PUMP_LUV("pump_luv", 6),
  PUMP_ZPM("pump_zpm", 7),
  PUMP_UV("pump_uv", 8),
  PUMP_UHV("pump_uhv", 9),
  PUMP_UEV("pump_uev", 10),
  PUMP_UIV("pump_uiv", 11),
  PUMP_UXV("pump_uxv", 12),
  PUMP_OPV("pump_opv", 13),
  PUMP_MAX("pump_max", 14);

  private final String name;
  private final int tier;

  PumpCasingType(String name, int tier) {
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
