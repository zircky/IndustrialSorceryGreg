package com.zircky.industrialsorcerygreg;

import net.minecraftforge.fml.ModList;

import static com.zircky.industrialsorcerygreg.api.ISGValues.*;

public class ISGIntegration {
  public static boolean isAdAstraLoaded() {
    return isLoaded(MODID_AD_ASTRA);
  }

  public static boolean isAE2Loaded() {
    return isLoaded(MODID_APPENG);
  }

  private static boolean isLoaded(String mod) {
    return ModList.get().isLoaded(mod);
  }
}
