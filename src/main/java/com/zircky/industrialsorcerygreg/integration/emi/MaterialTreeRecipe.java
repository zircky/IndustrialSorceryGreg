package com.zircky.industrialsorcerygreg.integration.emi;

import dev.emi.emi.api.recipe.BasicEmiRecipe;
import dev.emi.emi.api.recipe.EmiRecipeCategory;
import dev.emi.emi.api.stack.EmiStack;
import dev.emi.emi.api.widget.WidgetHolder;
import net.minecraft.resources.ResourceLocation;

import java.util.List;

public final class MaterialTreeRecipe extends BasicEmiRecipe {

  private final EmiStack materialKey;
  private final List<EmiStack> forms;

  public MaterialTreeRecipe(
      final EmiRecipeCategory category,
      final ResourceLocation id,
      final EmiStack materialKey,
      final List<EmiStack> forms
  ) {
    super(category, id, 176, 120);

    this.materialKey = materialKey;
    this.forms = List.copyOf(forms);

    this.inputs.addAll(this.forms);
    this.outputs.addAll(this.forms);
  }

  @Override
  public void addWidgets(final WidgetHolder widgets) {

    widgets.addSlot(materialKey, 8, 8).drawBack(true);

    int x = 32;
    int y = 8;
    int col = 0;

    for (final EmiStack form : forms) {

      widgets.addSlot(form, x, y)
          .drawBack(true)
          .recipeContext(this);

      col++;
      x += 18;

      if (col >= 7) {
        col = 0;
        x = 32;
        y += 18;
      }
    }
  }
}
