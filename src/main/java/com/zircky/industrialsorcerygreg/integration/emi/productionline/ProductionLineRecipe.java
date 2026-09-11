package com.zircky.industrialsorcerygreg.integration.emi.productionline;

import dev.emi.emi.api.recipe.BasicEmiRecipe;
import dev.emi.emi.api.render.EmiTexture;
import dev.emi.emi.api.stack.EmiStack;
import dev.emi.emi.api.widget.TextWidget;
import dev.emi.emi.api.widget.WidgetHolder;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

import java.util.List;

public class ProductionLineRecipe extends BasicEmiRecipe {
  private static final int COLUMNS = 5;
  private static final int STEP_X = 42;
  private static final int STEP_Y = 42;
  private static final int SLOT_Y_OFFSET = 12;
  private static final int TEXT_COLOR = 0x3f3f3f;

  private final String title;
  private final List<ProductionLineStep> steps;

  public ProductionLineRecipe(ResourceLocation id, String title, List<ProductionLineStep> steps) {
    super(ProductionLineCategory.NAQUADAH, id, 214, 28 + rows(steps.size()) * STEP_Y);
    this.title = title;
    this.steps = List.copyOf(steps);

    if (!steps.isEmpty()) {
      inputs.add(steps.get(0).stack());
      outputs.add(steps.get(steps.size() - 1).stack());
    }
  }

  @Override
  public void addWidgets(WidgetHolder widgets) {
    widgets.addText(Component.literal(title), width / 2, 3, TEXT_COLOR, false)
        .horizontalAlign(TextWidget.Alignment.CENTER);

    for (int i = 0; i < steps.size(); i++) {
      ProductionLineStep step = steps.get(i);
      int column = i % COLUMNS;
      int row = i / COLUMNS;
      int x = 3 + column * STEP_X;
      int y = 18 + row * STEP_Y;

      widgets.addText(Component.literal(step.machine()), x + 9, y, TEXT_COLOR, false)
          .horizontalAlign(TextWidget.Alignment.CENTER);
      widgets.addSlot(step.stack(), x, y + SLOT_Y_OFFSET)
          .drawBack(true)
          .recipeContext(this);

      if (i + 1 < steps.size()) {
        addArrow(widgets, column, row, x, y);
      }
    }
  }

  private void addArrow(WidgetHolder widgets, int column, int row, int x, int y) {
    if (column + 1 < COLUMNS) {
      widgets.addTexture(EmiTexture.EMPTY_ARROW, x + 19, y + SLOT_Y_OFFSET);
      return;
    }

    int nextY = 18 + (row + 1) * STEP_Y;
    widgets.addText(Component.literal("v"), width / 2, nextY - 13, TEXT_COLOR, false)
        .horizontalAlign(TextWidget.Alignment.CENTER);
  }

  private static int rows(int count) {
    return Math.max(1, (count + COLUMNS - 1) / COLUMNS);
  }
}
