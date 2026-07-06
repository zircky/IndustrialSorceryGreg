package com.zircky.industrialsorcerygreg.utils;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;

import java.util.function.Predicate;

public class ISGUtils {

  public static boolean isGeneration(TagPrefix tagPrefix, Material material) {
    Predicate<Material> condition = tagPrefix.generationCondition();
    if (condition == null) return true;
    return condition.test(material);
  }
}
