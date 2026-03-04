package com.zircky.industrialsorcerygreg.integration.emi.materialtree;

import dev.emi.emi.api.recipe.BasicEmiRecipe;
import dev.emi.emi.api.recipe.EmiRecipeCategory;
import dev.emi.emi.api.stack.EmiStack;
import dev.emi.emi.api.widget.WidgetHolder;
import net.minecraft.resources.ResourceLocation;

import java.util.List;

public final class MaterialTreeRecipe extends BasicEmiRecipe {

  private final List<FormEntry> forms;

  public MaterialTreeRecipe(
      final EmiRecipeCategory category,
      final ResourceLocation id,
      final EmiStack materialKey,
      final List<FormEntry> forms
  ) {
    super(category, id, 176, 180);

//    this.materialKey = materialKey;
    this.forms = List.copyOf(forms);

    for(FormEntry e : this.forms) {
      this.inputs.add(e.stack());
      this.outputs.add(e.stack());
    }
  }

  @Override
  public void addWidgets(final WidgetHolder widgets) {
    for (final FormEntry e : forms) {
      final var pos = MaterialTreeLayout.pos(e.prefix());
      if (pos.hidden()) continue;

      widgets.addSlot(e.stack(), pos.x(), pos.y())
          .drawBack(true)
          .recipeContext(this);
    }
  }
}
