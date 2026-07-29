package com.zircky.industrialsorcerygreg.utils.register;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.utils.FormattingUtil;
import com.zircky.industrialsorcerygreg.ISGCore;

public final class MaterialsRegisterUtils {
  public static Material.Builder material(String name, String en) {
    return new Material.Builder(ISGCore.id(name))
        .langValue(en);
  }

  public static Material.Builder material(String name) {
    return new Material.Builder(ISGCore.id(name));
  }
}
