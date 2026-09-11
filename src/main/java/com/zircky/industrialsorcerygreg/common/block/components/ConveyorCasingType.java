package com.zircky.industrialsorcerygreg.common.block.components;

import com.zircky.industrialsorcerygreg.api.machine.multiblock.component.casing.IConveyorData;
import org.jetbrains.annotations.NotNull;

public enum ConveyorCasingType implements IConveyorData {
  CONVEYOR_LV("conveyor_lv", 1),
  CONVEYOR_MV("conveyor_mv", 2),
  CONVEYOR_HV("conveyor_hv", 3),
  CONVEYOR_EV("conveyor_ev", 4),
  CONVEYOR_IV("conveyor_iv", 5),
  CONVEYOR_LUV("conveyor_luv", 6),
  CONVEYOR_ZPM("conveyor_zpm", 7),
  CONVEYOR_UV("conveyor_uv", 8),
  CONVEYOR_UHV("conveyor_uhv", 9),
  CONVEYOR_UEV("conveyor_uev", 10),
  CONVEYOR_UIV("conveyor_uiv", 11),
  CONVEYOR_UXV("conveyor_uxv", 12),
  CONVEYOR_OPV("conveyor_opv", 13),
  CONVEYOR_MAX("conveyor_max", 14);

  private final String name;
  private final int tier;

  ConveyorCasingType(String name, int tier) {
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
