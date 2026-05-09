package com.zircky.industrialsorcerygreg.common.machine.multiblock.part;

import com.gregtechceu.gtceu.api.blockentity.BlockEntityCreationInfo;
import com.gregtechceu.gtceu.api.gui.GuiTextures;
import com.gregtechceu.gtceu.api.gui.widget.LongInputWidget;
import com.gregtechceu.gtceu.api.gui.widget.ToggleButtonWidget;
import com.gregtechceu.gtceu.api.machine.multiblock.part.MultiblockPartMachine;
import com.lowdragmc.lowdraglib.gui.widget.TextBoxWidget;
import com.lowdragmc.lowdraglib.gui.widget.Widget;
import com.lowdragmc.lowdraglib.gui.widget.WidgetGroup;
import com.lowdragmc.lowdraglib.syncdata.annotation.DescSynced;
import com.lowdragmc.lowdraglib.syncdata.annotation.Persisted;
import com.lowdragmc.lowdraglib.utils.LocalizationUtils;
import com.lowdragmc.lowdraglib.utils.Position;
import com.lowdragmc.lowdraglib.utils.Size;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.Direction;
import org.jetbrains.annotations.Nullable;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;

import static com.gregtechceu.gtceu.utils.RedstoneUtil.computeRedstoneBetweenValues;

@Getter
@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class NeutronSensorPartMachine extends MultiblockPartMachine {

  @Setter
  @Persisted
  @DescSynced
  private long min;
  @Setter
  @Persisted
  @DescSynced
  private long max;
  @Setter
  @Persisted
  private boolean isInverted;
  @Persisted
  private int redstoneSignalOutput;

  public NeutronSensorPartMachine(BlockEntityCreationInfo info) {
    super(info);
  }

  @Override
  public Widget createUIWidget() {
    WidgetGroup group = new WidgetGroup(Position.ORIGIN, new Size(176, 112));
    group.addWidget(new TextBoxWidget(35, 28, 65, List.of(LocalizationUtils.format("industrialsorcerygreg.desc.neutron_kinetic_energy.min") + "KeV")));
    group.addWidget(new TextBoxWidget(35, 74, 65, List.of(LocalizationUtils.format("industrialsorcerygreg.desc.neutron_kinetic_energy.max") + "KeV")));
    group.addWidget(new LongInputWidget(80, 26, 85, 18, this::getMin, this::setMin));
    group.addWidget(new LongInputWidget(80, 26, 85, 18, this::getMax, this::setMax));
    group.addWidget(new MyToggleButtonWidget());
    return group;
  }

  public void update(float a) {
    int output = computeRedstoneBetweenValues(a, max, min, isInverted);
  }

  private static int computeRedstoneBetweenValues(float value, float maxValue, float minValue, boolean isInverted) {
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

  @Override
  public boolean canShared() {
    return false;
  }

  private class MyToggleButtonWidget extends ToggleButtonWidget {
    MyToggleButtonWidget() {
      super(8, 8, 20, 20, GuiTextures.INVERT_REDSTONE_BUTTON, NeutronSensorPartMachine.this::isInverted, NeutronSensorPartMachine.this::setInverted);
    }

    @Override
    public void updateScreen() {
      super.updateScreen();
      setHoverTooltips("industrialsorcerygreg.machine.sensor.invert." + (isPressed ? "enabled" : "disabled"));
    }
  }

}
