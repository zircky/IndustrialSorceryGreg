package com.zircky.industrialsorcerygreg.common.item;

import com.gregtechceu.gtceu.api.item.component.IAddInformation;
import com.gregtechceu.gtceu.api.item.component.IMonitorModuleItem;
import com.gregtechceu.gtceu.api.placeholder.PlaceholderContext;
import com.gregtechceu.gtceu.client.renderer.monitor.IMonitorRenderer;
import com.gregtechceu.gtceu.common.machine.multiblock.electric.CentralMonitorMachine;
import com.gregtechceu.gtceu.common.machine.multiblock.electric.monitor.MonitorGroup;
import brachy.modularui.api.IPanelHandler;
import brachy.modularui.value.sync.PanelSyncManager;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MachineMonitorModuleBehaviour implements IMonitorModuleItem, IAddInformation {
  @Override
  public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltipComponents, TooltipFlag isAdvanced) {

  }

  @Override
  public void tick(ItemStack stack, CentralMonitorMachine machine, MonitorGroup group) {
    IMonitorModuleItem.super.tick(stack, machine, group);
  }

  @Override
  public void tickInPlaceholder(ItemStack stack, PlaceholderContext context) {
    IMonitorModuleItem.super.tickInPlaceholder(stack, context);
  }

  @Override
  public IMonitorRenderer getRenderer(ItemStack stack, CentralMonitorMachine machine, MonitorGroup group) {
    return null;
  }

  @Override
  public IPanelHandler createModularPanel(ItemStack stack, CentralMonitorMachine machine, MonitorGroup group,
                                          PanelSyncManager syncManager) {
    return null;
  }

  @Override
  public String getType() {
    return IMonitorModuleItem.super.getType();
  }
}
