package com.zircky.industrialsorcerygreg.utils;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.item.ComponentItem;
import com.tterrag.registrate.util.nullness.NonNullConsumer;
import com.zircky.industrialsorcerygreg.api.item.component.ICustomRenderer;

import java.util.function.Predicate;

public class ISGUtils {

  public static boolean isGeneration(TagPrefix tagPrefix, Material material) {
    Predicate<Material> condition = tagPrefix.generationCondition();
    if (condition == null) return true;
    return condition.test(material);
  }

  public static <T extends ComponentItem> NonNullConsumer<T> attachRenderer(ICustomRenderer customRenderer) {
    return !GTCEu.isClientSide() ? NonNullConsumer.noop() : (item) -> item.attachComponents(customRenderer);
  }
}
