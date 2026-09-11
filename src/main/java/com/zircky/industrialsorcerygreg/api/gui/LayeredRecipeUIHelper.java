package com.zircky.industrialsorcerygreg.api.gui;

import brachy.modularui.api.drawable.IDrawable;
import brachy.modularui.api.drawable.Text;
import brachy.modularui.api.widget.IWidget;
import brachy.modularui.drawable.GuiTextures;
import brachy.modularui.integration.recipeviewer.RecipeSlotRole;
import brachy.modularui.integration.recipeviewer.RecipeViewerSlotWidget;
import brachy.modularui.integration.recipeviewer.entry.fluid.FluidStackList;
import brachy.modularui.integration.recipeviewer.entry.item.ItemStackList;
import brachy.modularui.utils.Alignment;
import brachy.modularui.value.DoubleValue;
import brachy.modularui.widgets.ProgressWidget;
import brachy.modularui.widgets.TextWidget;
import brachy.modularui.widgets.TransformWidget;
import brachy.modularui.widgets.layout.Flow;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.capability.recipe.FluidRecipeCapability;
import com.gregtechceu.gtceu.api.capability.recipe.IO;
import com.gregtechceu.gtceu.api.capability.recipe.ItemRecipeCapability;
import com.gregtechceu.gtceu.api.capability.recipe.RecipeCapability;
import com.gregtechceu.gtceu.api.recipe.GTRecipe;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.gregtechceu.gtceu.api.recipe.RecipeHelper;
import com.gregtechceu.gtceu.api.recipe.content.Content;
import com.gregtechceu.gtceu.api.recipe.gui.CapabilityContentBuilder;
import com.gregtechceu.gtceu.api.recipe.gui.GTRecipeTypeUILayout;
import com.gregtechceu.gtceu.common.mui.GTGuiTextures;
import com.gregtechceu.gtceu.utils.FormattingUtil;
import com.gregtechceu.gtceu.utils.GTUtil;
import com.zircky.industrialsorcerygreg.api.recipe.LayeredRecipeHelper;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LayeredRecipeUIHelper {

  public static GTRecipeTypeUILayout createRecipeUI(GTRecipeType recipeType) {
    return new GTRecipeTypeUILayout.Builder(recipeType)
        .customRecipeTypeUI(LayeredRecipeUIHelper::createLayeredRecipeViewerUI)
        .addRecipeUIModifier((recipe, widget) -> getLayerSummaryWidgets(recipe)
            .forEach(widget.textComponents::child))
        .build();
  }

  private static Flow createLayeredRecipeViewerUI(GTRecipe rootRecipe) {
    var steps = LayeredRecipeHelper.getLayeredSteps(rootRecipe);
    if (steps == null || steps.isEmpty()) {
      return Flow.row().coverChildren();
    }

    var root = Flow.row()
        .coverChildren()
        .crossAxisAlignment(Alignment.CrossAxis.START)
        .childPadding(3);

    for (int i = 0; i < steps.size(); i++) {
      if (i == steps.size() - 1) {
        root.child(createFinalLayerColumn(steps.get(i), i));
      } else {
        root.child(createLayerColumn(steps.get(i), i));
      }
    }

    return root;
  }

  private static IWidget createDownProgressArrow() {
    int size = GTGuiTextures.PROGRESS_ARROW.progressSize();
    var progress = new ProgressWidget()
        .value(DoubleValue.simulateProgress(2000))
        .name("progressBar")
        .texture(GTGuiTextures.PROGRESS_ARROW.get(null), GTGuiTextures.PROGRESS_ARROW.fillDirection())
        .size(size)
        .marginRight(3);
    return new TransformWidget(progress)
        .translate(size, 0)
        .rotate((float) (Math.PI / 2), 0, 0, 1);
  }

  private static Flow createLayerColumn(GTRecipe recipe, int layerIndex) {
    var column = Flow.col()
        .coverChildren()
        .crossAxisAlignment(Alignment.CrossAxis.CENTER)
        .childPadding(1);
    column.child(createLayerHeader(recipe, layerIndex));

    addContentSlots(column, recipe, recipe.inputs, IO.IN, false);
    addContentSlots(column, recipe, recipe.tickInputs, IO.IN, true);
    return column;
  }

  private static Flow createFinalLayerColumn(GTRecipe recipe, int layerIndex) {
    return Flow.col()
        .coverChildren()
        .crossAxisAlignment(Alignment.CrossAxis.CENTER)
        .childPadding(2)
        .child(createLayerColumn(recipe, layerIndex))
        .child(createDownProgressArrow())
        .child(createOutputColumn(recipe));
  }

  private static IWidget createLayerHeader(GTRecipe recipe, int layerIndex) {
    var usage = RecipeHelper.getRealEUt(recipe).getTotalEU();
    return new TextWidget<>(Text.str(toRoman(layerIndex + 1)).withStyle(ChatFormatting.WHITE))
        .size(18, 10)
        .alignment(Alignment.Center)
        .background(GuiTextures.MC_BUTTON_DISABLED)
        .tooltipBuilder(tooltip -> {
          tooltip.addLine(Component.literal("Step %s".formatted(layerIndex + 1)).withStyle(ChatFormatting.WHITE));
          tooltip.addLine(Component.literal("Duration: %s secs".formatted(
              FormattingUtil.formatNumbers(recipe.duration / 20f))).withStyle(ChatFormatting.WHITE));
          tooltip.addLine(Component.literal("Total: %s EU".formatted(
              FormattingUtil.formatNumbers(usage * recipe.duration))).withStyle(ChatFormatting.WHITE));
        });
  }

  private static Flow createOutputColumn(GTRecipe recipe) {
    var column = Flow.col()
        .coverChildren()
        .crossAxisAlignment(Alignment.CrossAxis.CENTER)
        .childPadding(1);
    addContentSlots(column, recipe, recipe.outputs, IO.OUT, false);
    addContentSlots(column, recipe, recipe.tickOutputs, IO.OUT, true);
    return column;
  }

  private static void addContentSlots(Flow column, GTRecipe recipe,
                                      Map<RecipeCapability<?>, List<Content>> contentMap,
                                      IO io, boolean perTick) {
    addSlotsForCapability(column, recipe, ItemRecipeCapability.CAP, contentMap, io, perTick);
    addSlotsForCapability(column, recipe, FluidRecipeCapability.CAP, contentMap, io, perTick);
  }

  private static <T> void addSlotsForCapability(Flow column, GTRecipe recipe, RecipeCapability<T> capability,
                                                Map<RecipeCapability<?>, List<Content>> contentMap,
                                                IO io, boolean perTick) {
    var contents = contentMap.get(capability);
    if (contents == null || contents.isEmpty()) return;

    int recipeTier = RecipeHelper.getRecipeEUtTier(recipe);
    var contentBuilder = capability == ItemRecipeCapability.CAP ? CapabilityContentBuilder.ITEM :
        capability == FluidRecipeCapability.CAP ? CapabilityContentBuilder.FLUID : null;
    if (contentBuilder == null) return;

    for (var content : contents) {
      var slot = createEmptySlot(capability, io);
      contentBuilder.buildWidgetContent(slot, content, io, perTick, recipe.recipeType, recipe, recipeTier, recipeTier);
      column.child(slot);
    }
  }

  private static RecipeViewerSlotWidget<?, ?> createEmptySlot(RecipeCapability<?> capability, IO io) {
    if (capability == ItemRecipeCapability.CAP) {
      var slot = RecipeViewerSlotWidget.create(ItemStack.class)
          .recipeSlotRole(io == IO.IN ? RecipeSlotRole.INPUT : RecipeSlotRole.OUTPUT);
      slot.value(ItemStackList.of(ItemStack.EMPTY)).background(GuiTextures.SLOT_ITEM, IDrawable.EMPTY);
      return slot;
    } else if (capability == FluidRecipeCapability.CAP) {
      var slot = RecipeViewerSlotWidget.create(FluidStack.class)
          .recipeSlotRole(io == IO.IN ? RecipeSlotRole.INPUT : RecipeSlotRole.OUTPUT);
      slot.value(FluidStackList.of(FluidStack.EMPTY)).background(GuiTextures.SLOT_FLUID, IDrawable.EMPTY);
      return slot;
    }
    throw new IllegalArgumentException("Unsupported recipe capability: " + capability);
  }

  private static List<IWidget> getLayerSummaryWidgets(GTRecipe rootRecipe) {
    var steps = LayeredRecipeHelper.getLayeredSteps(rootRecipe);
    if (steps == null || steps.isEmpty()) {
      return List.of();
    }

    var result = new ArrayList<IWidget>();
    long totalEU = steps.stream()
        .mapToLong(step -> RecipeHelper.getRealEUt(step).getTotalEU() * (long) step.duration)
        .sum();
    var usage = RecipeHelper.getRealEUt(rootRecipe);
    int minVoltageTier = GTUtil.getTierByVoltage(usage.voltage());
    float minAmperage = (float) usage.getTotalEU() / GTValues.V[minVoltageTier];

    result.add(Text.lang("gtceu.recipe.total", FormattingUtil.formatNumbers(totalEU))
        .asWidget()
        .name("max_eu"));
    result.add(Text.lang("gtceu.recipe.eu", FormattingUtil.formatNumber2Places(minAmperage),
            GTValues.VN[minVoltageTier])
        .withStyle(ChatFormatting.UNDERLINE)
        .asWidget()
        .name("eu"));
    return result;
  }

  private static String toRoman(int value) {
    return switch (value) {
      case 1 -> "I";
      case 2 -> "II";
      case 3 -> "III";
      case 4 -> "IV";
      case 5 -> "V";
      case 6 -> "VI";
      case 7 -> "VII";
      case 8 -> "VIII";
      case 9 -> "IX";
      case 10 -> "X";
      default -> Integer.toString(value);
    };
  }
}
