package com.zircky.industrialsorcerygreg.common.block.components;

import com.zircky.industrialsorcerygreg.api.machine.multiblock.component.casing.IRobotArmData;
import org.jetbrains.annotations.NotNull;

public enum RobotArmCasingType implements IRobotArmData {
  ROBOT_ARM_LV("robot_arm_lv", 1),
  ROBOT_ARM_MV("robot_arm_mv", 2),
  ROBOT_ARM_HV("robot_arm_hv", 3),
  ROBOT_ARM_EV("robot_arm_ev", 4),
  ROBOT_ARM_IV("robot_arm_iv", 5),
  ROBOT_ARM_LUV("robot_arm_luv", 6),
  ROBOT_ARM_ZPM("robot_arm_zpm", 7),
  ROBOT_ARM_UV("robot_arm_uv", 8),
  ROBOT_ARM_UHV("robot_arm_uhv", 9),
  ROBOT_ARM_UEV("robot_arm_uev", 10),
  ROBOT_ARM_UIV("robot_arm_uiv", 11),
  ROBOT_ARM_UXV("robot_arm_uxv", 12),
  ROBOT_ARM_OPV("robot_arm_opv", 13),
  ROBOT_ARM_MAX("robot_arm_max", 14);

  private final String name;
  private final int tier;

  RobotArmCasingType(String name, int tier) {
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
