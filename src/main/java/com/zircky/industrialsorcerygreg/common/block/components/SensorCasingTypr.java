package com.zircky.industrialsorcerygreg.common.block.components;

import com.zircky.industrialsorcerygreg.api.machine.multiblock.component.casing.ISensorData;
import org.jetbrains.annotations.NotNull;

public enum SensorCasingTypr implements ISensorData {
  SENSOR_LV("sensor_lv", 1),
  SENSOR_MV("sensor_mv", 2),
  SENSOR_HV("sensor_hv", 3),
  SENSOR_EV("sensor_ev", 4),
  SENSOR_IV("sensor_iv", 5),
  SENSOR_LUV("sensor_luv", 6),
  SENSOR_ZPM("sensor_zpm", 7),
  SENSOR_UV("sensor_uv", 8),
  SENSOR_UHV("sensor_uhv", 9),
  SENSOR_UEV("sensor_uev", 10),
  SENSOR_UIV("sensor_uiv", 11),
  SENSOR_UXV("sensor_uxv", 12),
  SENSOR_OPV("sensor_opv", 13),
  SENSOR_MAX("sensor_max", 14);

  private final String name;
  private final int tier;

  SensorCasingTypr(String name, int tier) {
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
