package com.zircky.industrialsorcerygreg.common.recipe.gui;

import brachy.modularui.api.drawable.Text;
import brachy.modularui.widgets.TextWidget;
import brachy.modularui.widgets.layout.Flow;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.recipe.gui.RecipeUIModifier;
import com.zircky.industrialsorcerygreg.api.ISGValues;

public class ISGRecipeUIModifiers {
  public static final RecipeUIModifier COMPONENT_ASSEMBLY_CASING_TIER = (recipe, widget) -> {
    if (recipe.data.contains(ISGValues.COMPONENT_ASSEMBLY_CASING_TIER)) {
      int tier = recipe.data.getInt(ISGValues.COMPONENT_ASSEMBLY_CASING_TIER);

      widget.textComponents.child(new TextWidget<>(
          Text.lang("isgcore.tier.%s".formatted(ISGValues.COMPONENT_ASSEMBLY_CASING_TIER), GTValues.VN[tier])
      ));

      Flow coalRow = Flow.row().coverChildrenHeight();


    }
  };
}
