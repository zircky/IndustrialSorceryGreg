package com.zircky.industrialsorcerygreg.data.recipe;

import com.gregtechceu.gtceu.common.data.GTItems;
import com.gregtechceu.gtceu.data.recipe.CraftingComponent;
import com.gregtechceu.gtceu.data.recipe.GTCraftingComponents;

public class ISGCraftingComponents {
  public static CraftingComponent FLUID_REGULATOR;

  public static void init() {
    GTCraftingComponents.init();

    FLUID_REGULATOR = CraftingComponent.of("fluid_regulator", GTItems.FLUID_REGULATOR_LV.asStack())
        .add(1, GTItems.FLUID_REGULATOR_LV.asStack())
        .add(2, GTItems.FLUID_REGULATOR_MV.asStack())
        .add(3, GTItems.FLUID_REGULATOR_HV.asStack())
        .add(4, GTItems.FLUID_REGULATOR_EV.asStack())
        .add(5, GTItems.FLUID_REGULATOR_IV.asStack())
        .add(6, GTItems.FLUID_REGULATOR_LuV.asStack())
        .add(7, GTItems.FLUID_REGULATOR_ZPM.asStack())
        .add(8, GTItems.FLUID_REGULATOR_UV.asStack())
        .add(9, GTItems.FLUID_REGULATOR_UHV.asStack())
        .add(10, GTItems.FLUID_REGULATOR_UEV.asStack())
        .add(11, GTItems.FLUID_REGULATOR_UIV.asStack())
        .add(12, GTItems.FLUID_REGULATOR_UXV.asStack())
        .add(13, GTItems.FLUID_REGULATOR_OpV.asStack());
  }


}
