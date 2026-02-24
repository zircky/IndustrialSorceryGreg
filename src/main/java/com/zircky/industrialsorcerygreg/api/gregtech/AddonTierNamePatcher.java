package com.zircky.industrialsorcerygreg.api.gregtech;

import com.gregtechceu.gtceu.api.GTValues;
import com.zircky.industrialsorcerygreg.mixin.gregtech.GTValuesAccessor;
import net.minecraft.ChatFormatting;

public final class AddonTierNamePatcher {
  private AddonTierNamePatcher() {}

  public static void apply() {
    final int size = GTValues.MAX_TRUE + 1;     // 31
    final int errorTier = GTValues.MAX + 1;     // 15

    final String[] vn = extend(GTValuesAccessor.industrialsorcerygreg$getVN(), size);
    final String[] vnf = extend(GTValuesAccessor.industrialsorcerygreg$getVNF(), size);

    vn[errorTier] = "ERROR";
    vnf[errorTier] = ChatFormatting.DARK_RED + "ERROR";

    for (int i = 0; i < size; i++) {
      if (vn[i] == null || vn[i].isBlank()) vn[i] = "TIER_" + i;
      if (vnf[i] == null || vnf[i].isBlank()) vnf[i] = ChatFormatting.GRAY + ("TIER_" + i);
    }

    GTValuesAccessor.industrialsorcerygreg$setVN(vn);
    GTValuesAccessor.industrialsorcerygreg$setVNF(vnf);
  }

  private static String[] extend(final String[] src, final int newSize) {
    if (src.length >= newSize) return src;
    final String[] out = new String[newSize];
    System.arraycopy(src, 0, out, 0, src.length);
    return out;
  }
}
