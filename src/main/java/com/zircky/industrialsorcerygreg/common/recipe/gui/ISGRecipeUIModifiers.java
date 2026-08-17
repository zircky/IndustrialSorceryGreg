package com.zircky.industrialsorcerygreg.common.recipe.gui;

import brachy.modularui.api.drawable.Text;
import brachy.modularui.widgets.TextWidget;
import brachy.modularui.widgets.layout.Flow;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.recipe.gui.RecipeUIModifier;
import com.zircky.industrialsorcerygreg.api.ISGValues;
import com.zircky.industrialsorcerygreg.common.data.recipe.NeutronActivatorCondition;

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

  public static final RecipeUIModifier NEUTRON_ACTIVATOR_INFO = (recipe, widget) -> {
    if (recipe.data.contains(NeutronActivatorCondition.KEY_EV_MIN)) {
      widget.textComponents.child(new TextWidget<>(
          Text.lang("isgcore.recipe.neutron_activator.ev_min",
              recipe.data.getInt(NeutronActivatorCondition.KEY_EV_MIN))
      ));
    }
    if (recipe.data.contains(NeutronActivatorCondition.KEY_EV_MAX)) {
      widget.textComponents.child(new TextWidget<>(
          Text.lang("isgcore.recipe.neutron_activator.ev_max",
              recipe.data.getInt(NeutronActivatorCondition.KEY_EV_MAX))
      ));
    }
    if (recipe.data.contains(NeutronActivatorCondition.KEY_EVT)) {
      widget.textComponents.child(new TextWidget<>(
          Text.lang("isgcore.recipe.neutron_activator.evt",
              recipe.data.getInt(NeutronActivatorCondition.KEY_EVT))
      ));
    }
  };
}
