package com.zircky.industrialsorcerygreg.common.block.components;

import com.zircky.industrialsorcerygreg.api.machine.multiblock.component.casing.IEmitterData;
import org.jetbrains.annotations.NotNull;

public enum EmitterCasingType implements IEmitterData {
  EMITTER_LV("emitter_lv", 1),
  EMITTER_MV("emitter_mv", 2),
  EMITTER_HV("emitter_hv", 3),
  EMITTER_EV("emitter_ev", 4),
  EMITTER_IV("emitter_iv", 5),
  EMITTER_LUV("emitter_luv", 6),
  EMITTER_ZPM("emitter_zpm", 7),
  EMITTER_UV("emitter_uv", 8),
  EMITTER_UHV("emitter_uhv", 9),
  EMITTER_UEV("emitter_uev", 10),
  EMITTER_UIV("emitter_uiv", 11),
  EMITTER_UXV("emitter_uxv", 12),
  EMITTER_OPV("emitter_opv", 13),
  EMITTER_MAX("emitter_max", 14);

  private final String name;
  private final int tier;

  EmitterCasingType(String name, int tier) {
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
