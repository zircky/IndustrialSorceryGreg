package com.zircky.industrialsorcerygreg.common.block.components;

import com.zircky.industrialsorcerygreg.api.machine.multiblock.component.casing.IMotorData;
import org.jetbrains.annotations.NotNull;

public enum MotorCasingType implements IMotorData {
  MOTOR_LV("motor_lv", 1),
  MOTOR_MV("motor_mv", 2),
  MOTOR_HV("motor_hv", 3),
  MOTOR_EV("motor_ev", 4),
  MOTOR_IV("motor_iv", 5),
  MOTOR_LUV("motor_luv", 6),
  MOTOR_ZPM("motor_zpm", 7),
  MOTOR_UV("motor_uv", 8),
  MOTOR_UHV("motor_uhv", 9),
  MOTOR_UEV("motor_uev", 10),
  MOTOR_UIV("motor_uiv", 11),
  MOTOR_UXV("motor_uxv", 12),
  MOTOR_OPV("motor_opv", 13),
  MOTOR_MAX("motor_max", 14);

  private final String name;
  private final int tier;

  MotorCasingType(String name, int tier) {
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
