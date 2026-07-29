package com.zircky.industrialsorcerygreg.api.machine.multiblock;

import brachy.modularui.api.drawable.Text;
import brachy.modularui.api.widget.IWidget;
import brachy.modularui.value.sync.PanelSyncManager;
import com.gregtechceu.gtceu.api.blockentity.BlockEntityCreationInfo;
import com.gregtechceu.gtceu.api.machine.multiblock.WorkableElectricMultiblockMachine;
import com.zircky.industrialsorcerygreg.api.machine.trait.LayeredRecipeLogic;
import net.minecraft.ChatFormatting;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.network.chat.Component;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.ArrayList;
import java.util.List;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class LayeredWorkableElectricMultiblockMachine extends WorkableElectricMultiblockMachine {

  public LayeredWorkableElectricMultiblockMachine(BlockEntityCreationInfo info) {
    super(info, new LayeredRecipeLogic());
  }

  @Override
  public LayeredRecipeLogic getRecipeLogic() {
    return (LayeredRecipeLogic) super.getRecipeLogic();
  }

  @Override
  public List<IWidget> getWidgetsForDisplay(PanelSyncManager syncManager) {
    List<IWidget> widgets = new ArrayList<>(super.getWidgetsForDisplay(syncManager));
    var logic = getRecipeLogic();

    widgets.add(Text.dynamic(() -> {
      int totalLayers = logic.getLayeredRecipeSize();
      if (totalLayers <= 0) return Component.empty();
      int currentLayer = logic.getLayeredRecipeLayerIndex() + (logic.getLastRecipe() == null ? 0 : 1);
      return Component.translatable("gtceu.multiblock.layered.steps", currentLayer, totalLayers)
          .withStyle(ChatFormatting.GRAY);
    }).asWidget());
    widgets.add(Text.dynamic(() -> {
      var nextLayer = logic.getNextLayeredRecipe();
      if (nextLayer == null) return Component.empty();
      return Component.translatable("gtceu.multiblock.layered.next_step", nextLayer.getId().toString())
          .withStyle(ChatFormatting.GRAY);
    }).asWidget());
    return widgets;
  }
}
