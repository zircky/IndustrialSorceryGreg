package com.zircky.industrialsorcerygreg.common.machine.multiblock.part;

import brachy.modularui.factory.PosGuiData;
import brachy.modularui.screen.UISettings;
import brachy.modularui.value.sync.BooleanSyncValue;
import brachy.modularui.value.sync.PanelSyncManager;
import brachy.modularui.api.widget.IWidget;
import brachy.modularui.widget.ParentWidget;
import brachy.modularui.widgets.TextWidget;
import brachy.modularui.widgets.ToggleButton;
import com.gregtechceu.gtceu.api.blockentity.BlockEntityCreationInfo;
import com.gregtechceu.gtceu.api.machine.feature.IMuiMachine;
import com.gregtechceu.gtceu.api.machine.multiblock.MultiblockControllerMachine;
import com.gregtechceu.gtceu.api.machine.multiblock.part.MultiblockPartMachine;
import com.gregtechceu.gtceu.api.sync_system.annotations.SaveField;
import com.gregtechceu.gtceu.api.sync_system.annotations.SyncToClient;
import com.gregtechceu.gtceu.common.mui.GTGuiTextures;
import com.zircky.industrialsorcerygreg.api.gui.widget.FloatInputWidget;
import lombok.Getter;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import org.jetbrains.annotations.Nullable;

import javax.annotation.ParametersAreNonnullByDefault;

@Getter
@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class SensorPartMachine extends MultiblockPartMachine implements IMuiMachine {

  @SaveField
  @SyncToClient
  private float min;
  @SaveField
  @SyncToClient
  private float max;
  @SaveField
  @SyncToClient
  private boolean isInverted;
  @SaveField
  @SyncToClient
  private int redstoneSignalOutput;

  public SensorPartMachine(BlockEntityCreationInfo info) {
    super(info);
  }

  public float getMin() {
    return min;
  }

  public float getMax() {
    return max;
  }

  public boolean isInverted() {
    return isInverted;
  }

  @Override
  public void buildMainUI(ParentWidget<?> main, PosGuiData guiData, PanelSyncManager syncManager,
                          UISettings uiSettings) {
    if (getDefinition().getId().getPath().contains("neutron_sensor")) {
      main.addChild(text("MeV", 105, 10, 45), 0);
    }
    main.addChild(text(Component.translatable("cover.advanced_energy_detector.min").append(":"), 35, 28, 65), 1);
    main.addChild(text(Component.translatable("cover.advanced_energy_detector.max").append(":"), 35, 74, 65), 2);
    main.addChild(new FloatInputWidget(80, 26, 85, 18, this::getMin, this::setMin), 3);
    main.addChild(new FloatInputWidget(80, 72, 85, 18, this::getMax, this::setMax), 4);
    main.addChild(new ToggleButton()
        .pos(8, 8)
        .size(20)
        .overlay(false, GTGuiTextures.BUTTON_DETECTOR_INVERT)
        .overlay(true, GTGuiTextures.BUTTON_DETECTOR_INVERT)
        .value(new BooleanSyncValue(this::isInverted, this::setInverted))
        .addTooltip(false, "isgcore.machine.sensor.invert.disabled")
        .addTooltip(true, "isgcore.machine.sensor.invert.enabled"), 5);
  }

  private static IWidget text(String text, int x, int y, int width) {
    TextWidget<?> widget = new TextWidget<>(text);
    widget.pos(x, y).size(width, 9);
    return widget;
  }

  private static IWidget text(Component text, int x, int y, int width) {
    TextWidget<?> widget = new TextWidget<>(text);
    widget.pos(x, y).size(width, 9);
    return widget;
  }

  public void update(float a) {
    int output = computeRedstoneBetweenValues(a, max, min, isInverted);
    if (redstoneSignalOutput != output) {
      redstoneSignalOutput = output;
      syncDataHolder.markClientSyncFieldDirty("redstoneSignalOutput");
      if (getLevel() != null && !getLevel().isClientSide) {
        getLevel().updateNeighbourForOutputSignal(getBlockPos(), getBlockState().getBlock());
      }
    }
  }

  private static int computeRedstoneBetweenValues(float value, float maxValue, float minValue, boolean isInverted) {
    if (maxValue <= minValue) {
      return isInverted ? 15 : 0;
    }
    if (value < minValue) {
      return isInverted ? 15 : 0;
    }
    if (value > maxValue) {
      return isInverted ? 15 : 0;
    }
    return (int) Math.ceil(15 * (isInverted ? (maxValue - value) : (value - minValue)) / (maxValue - minValue));
  }

  @Override
  public int getOutputSignal(@Nullable Direction side) {
    if (side == getFrontFacing().getOpposite()) {
      return redstoneSignalOutput;
    }
    return 0;
  }

  @Override
  public boolean canConnectRedstone(Direction side) {
    return side == getFrontFacing();
  }

  public void setMin(float min) {
    this.min = min;
    syncDataHolder.markClientSyncFieldDirty("min");
  }

  public void setMax(float max) {
    this.max = max;
    syncDataHolder.markClientSyncFieldDirty("max");
  }

  public void setInverted(boolean inverted) {
    isInverted = inverted;
    syncDataHolder.markClientSyncFieldDirty("isInverted");
  }

  @Override
  public boolean canShared(MultiblockControllerMachine controller, String substructureName) {
    return true;
  }
}
