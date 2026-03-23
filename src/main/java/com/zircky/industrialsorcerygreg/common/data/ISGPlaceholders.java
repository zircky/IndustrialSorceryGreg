package com.zircky.industrialsorcerygreg.common.data;

import com.gregtechceu.gtceu.api.machine.MetaMachine;
import com.gregtechceu.gtceu.api.machine.feature.IMachineFeature;
import com.gregtechceu.gtceu.api.placeholder.*;
import com.gregtechceu.gtceu.api.placeholder.exceptions.PlaceholderException;
import com.gregtechceu.gtceu.common.machine.multiblock.electric.PowerSubstationMachine;
import com.gregtechceu.gtceu.utils.FormattingUtil;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.Style;
import net.minecraft.world.level.block.entity.BlockEntity;

import java.math.BigInteger;
import java.time.Duration;
import java.util.List;

public class ISGPlaceholders {
  private static final BigInteger BIG_INTEGER_MAX_LONG = BigInteger.valueOf(Long.MAX_VALUE);
  public static void register() {
    energyStored();
  }

  private static void energyStored() {
    PlaceholderHandler.addPlaceholder(new Placeholder("psEnergyStored") {
      @Override
      public MultiLineComponent apply(PlaceholderContext ctx, List<MultiLineComponent> args) throws PlaceholderException {
        PlaceholderUtils.checkArgs(args, 0);

        final PowerSubstationMachine machine = getPowerSubstationMachine(ctx);
        var STYLE_GOLD = Style.EMPTY.withColor(ChatFormatting.GOLD);
        var storedComponent = Component.literal(FormattingUtil.formatNumbers(machine.getEnergyInfo().stored()));
        return MultiLineComponent.of(Component.translatable("gtceu.multiblock.power_substation.stored", storedComponent.setStyle(STYLE_GOLD)));
      }
    });
    PlaceholderHandler.addPlaceholder(new Placeholder("psEnergyCapacity") {
      @Override
      public MultiLineComponent apply(PlaceholderContext ctx, List<MultiLineComponent> args) throws PlaceholderException {
        PlaceholderUtils.checkArgs(args, 0);

        final PowerSubstationMachine machine = getPowerSubstationMachine(ctx);
        var STYLE_GOLD = Style.EMPTY.withColor(ChatFormatting.GOLD);
        var storedComponent = Component.literal(FormattingUtil.formatNumbers(machine.getEnergyInfo().capacity()));
        return MultiLineComponent.of(Component.translatable("gtceu.multiblock.power_substation.stored", storedComponent.setStyle(STYLE_GOLD)));
      }
    });
    PlaceholderHandler.addPlaceholder(new Placeholder("psInTicks") {
      @Override
      public MultiLineComponent apply(PlaceholderContext ctx, List<MultiLineComponent> args) throws PlaceholderException {
        PlaceholderUtils.checkArgs(args, 0);

        var STYLE_GREEN = Style.EMPTY.withColor(ChatFormatting.GREEN);
        final PowerSubstationMachine machine = getPowerSubstationMachine(ctx);
        var avgInComponent = Component.literal(FormattingUtil.formatNumbers(machine.getInputPerSec()/20));
        return MultiLineComponent.of(Component.translatable("gtceu.multiblock.power_substation.average_in", avgInComponent.setStyle(STYLE_GREEN)));
      }
    });
    PlaceholderHandler.addPlaceholder(new Placeholder("psOutTicks") {
      @Override
      public MultiLineComponent apply(PlaceholderContext ctx, List<MultiLineComponent> args) throws PlaceholderException {
        PlaceholderUtils.checkArgs(args, 0);

        var STYLE_RED = Style.EMPTY.withColor(ChatFormatting.RED);
        final PowerSubstationMachine machine = getPowerSubstationMachine(ctx);
        var avgOutComponent = Component.literal(FormattingUtil.formatNumbers(Math.abs(machine.getOutputPerSec()/20)));
        return MultiLineComponent.of(Component.translatable("gtceu.multiblock.power_substation.average_out", avgOutComponent.setStyle(STYLE_RED)));
      }
    });
    PlaceholderHandler.addPlaceholder(new Placeholder("psPassiveDrain") {
      @Override
      public MultiLineComponent apply(PlaceholderContext ctx, List<MultiLineComponent> args) throws PlaceholderException {
        PlaceholderUtils.checkArgs(args, 0);

        var STYLE_DARK_RED = Style.EMPTY.withColor(ChatFormatting.DARK_RED);
        final PowerSubstationMachine machine = getPowerSubstationMachine(ctx);
        var passiveDrainComponent = Component.literal(FormattingUtil.formatNumbers(machine.getPassiveDrain()));
        return MultiLineComponent.of(Component.translatable("gtceu.multiblock.power_substation.passive_drain", passiveDrainComponent.setStyle(STYLE_DARK_RED)));
      }
    });
    PlaceholderHandler.addPlaceholder(new Placeholder("psTimeToFillDrainText") {
      @Override
      public MultiLineComponent apply(
          final PlaceholderContext ctx,
          final List<MultiLineComponent> args
      ) throws PlaceholderException {
        PlaceholderUtils.checkArgs(args, 0);

        final PowerSubstationMachine machine = getPowerSubstationMachine(ctx);
        return buildTimeToFillDrainComponent(machine);
      }
    });
  }

  private static PowerSubstationMachine getPowerSubstationMachine(
      final PlaceholderContext ctx
  ) throws PlaceholderException {

    final BlockEntity blockEntity = ctx.level().getBlockEntity(ctx.pos());
    if (!(blockEntity instanceof IMachineFeature machineBlockEntity)) {
      throw new PlaceholderException("Block is not a GT machine");
    }

    final MetaMachine machine = machineBlockEntity.self();
    if (!(machine instanceof PowerSubstationMachine powerSubstationMachine)) {
      throw new PlaceholderException("Machine is not Power Substation");
    }

    return powerSubstationMachine;
  }

  private static MultiLineComponent buildTimeToFillDrainComponent(
      final PowerSubstationMachine machine
  ) {
    final long inputPerSec = machine.getInputPerSec();
    final long outputPerSec = machine.getOutputPerSec();

    final BigInteger energyCapacity = machine.getEnergyInfo().capacity();
    final BigInteger energyStored = machine.getEnergyInfo().stored();

    if (inputPerSec > outputPerSec) {
      return buildTimeToFillComponent(
          energyCapacity,
          energyStored,
          inputPerSec - outputPerSec
      );
    }

    if (inputPerSec < outputPerSec) {
      return buildTimeToDrainComponent(
          energyStored,
          outputPerSec - inputPerSec
      );
    }

    return MultiLineComponent.empty();
  }

  private static MultiLineComponent buildTimeToFillComponent(
      final BigInteger energyCapacity,
      final BigInteger energyStored,
      final long netInputPerSec
  ) {
    var STYLE_GREEN = Style.EMPTY.withColor(ChatFormatting.GREEN);
    final BigInteger energyLeftToFill = energyCapacity.subtract(energyStored).max(BigInteger.ZERO);
    final BigInteger timeToFillSeconds = energyLeftToFill.divide(BigInteger.valueOf(netInputPerSec));

    return MultiLineComponent.of(
        Component.translatable(
            "gtceu.multiblock.power_substation.time_to_fill",
            getTimeToFillDrainText(timeToFillSeconds).setStyle(STYLE_GREEN)
        )
    );
  }

  private static MultiLineComponent buildTimeToDrainComponent(
      final BigInteger energyStored,
      final long netOutputPerSec
  ) {
    final BigInteger safeStoredEnergy = energyStored.max(BigInteger.ZERO);
    final BigInteger timeToDrainSeconds = safeStoredEnergy.divide(BigInteger.valueOf(netOutputPerSec));
    var STYLE_RED = Style.EMPTY.withColor(ChatFormatting.RED);

    return MultiLineComponent.of(
        Component.translatable(
            "gtceu.multiblock.power_substation.time_to_drain",
            getTimeToFillDrainText(timeToDrainSeconds).setStyle(STYLE_RED)
        )
    );
  }

  private static MutableComponent getTimeToFillDrainText(BigInteger secondsValue) {
    final BigInteger clampedSeconds = secondsValue.min(BIG_INTEGER_MAX_LONG).max(BigInteger.ZERO);
    final Duration duration = Duration.ofSeconds(clampedSeconds.longValue());

    final long seconds = duration.getSeconds();
    final long minutes = duration.toMinutes();
    final long hours = duration.toHours();
    final long days = duration.toDays();

    final String key;
    final long value;

    if (seconds <= 180) {
      key = "gtceu.multiblock.power_substation.time_seconds";
      value = seconds;
    } else if (minutes <= 180) {
      key = "gtceu.multiblock.power_substation.time_minutes";
      value = minutes;
    } else if (hours <= 72) {
      key = "gtceu.multiblock.power_substation.time_hours";
      value = hours;
    } else if (days <= 730) {
      key = "gtceu.multiblock.power_substation.time_days";
      value = days;
    } else {
      final long years = days / 365;
      if (years < 1_000_000) {
        return Component.translatable(
            "gtceu.multiblock.power_substation.time_years",
            FormattingUtil.formatNumbers(years)
        );
      }

      return Component.translatable("gtceu.multiblock.power_substation.time_forever");
    }

    return Component.translatable(key, FormattingUtil.formatNumbers(value));
  }


}
