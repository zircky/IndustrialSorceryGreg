package com.zircky.industrialsorcerygreg.common.data;

import com.gregtechceu.gtceu.api.machine.IMachineBlockEntity;
import com.gregtechceu.gtceu.api.machine.MetaMachine;
import com.gregtechceu.gtceu.api.machine.feature.multiblock.IMultiPart;
import com.gregtechceu.gtceu.api.machine.feature.multiblock.IRotorHolderMachine;
import com.gregtechceu.gtceu.api.machine.multiblock.MultiblockControllerMachine;
import com.gregtechceu.gtceu.api.placeholder.*;
import com.gregtechceu.gtceu.api.placeholder.exceptions.PlaceholderException;
import com.gregtechceu.gtceu.common.machine.multiblock.generator.LargeCombustionEngineMachine;
import com.gregtechceu.gtceu.common.machine.multiblock.generator.LargeTurbineMachine;
import com.gregtechceu.gtceu.utils.FormattingUtil;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.world.level.block.entity.BlockEntity;

import java.util.List;

import static com.gregtechceu.gtceu.common.machine.multiblock.generator.LargeTurbineMachine.MIN_DURABILITY_TO_WARN;

public class ISGLargeTurbinePlaceholder {
  public static void largeTurbinePlaceholder() {
    PlaceholderHandler.addPlaceholder(new Placeholder("ltRototrSpeed") {
      @Override
      public MultiLineComponent apply(PlaceholderContext ctx, List<MultiLineComponent> args) throws PlaceholderException {
        PlaceholderUtils.checkArgs(args, 0);

        final LargeTurbineMachine machine = getLargeTurbineMachine(ctx);
        return MultiLineComponent.of(Component.translatable("gtceu.multiblock.turbine.rotor_speed",
            FormattingUtil.formatNumbers(machine.getRotorSpeed()),
            FormattingUtil.formatNumbers(machine.getMaxRotorHolderSpeed())));

      }
    });

//    PlaceholderHandler.addPlaceholder(new Placeholder("ltMaxRototrSpeed") {
//      @Override
//      public MultiLineComponent apply(PlaceholderContext ctx, List<MultiLineComponent> args) throws PlaceholderException {
//        PlaceholderUtils.checkArgs(args, 0);
//
//        final LargeTurbineMachine machine = getLargeTurbineMachine(ctx);
//
//        return MultiLineComponent.of(Component.translatable("Max " + "gtceu.multiblock.turbine.rotor_speed", FormattingUtil.formatNumbers(machine.getMaxRotorHolderSpeed())));
//
//      }
//    });

    PlaceholderHandler.addPlaceholder(new Placeholder("ltEfficiency") {
      @Override
      public MultiLineComponent apply(PlaceholderContext ctx, List<MultiLineComponent> args) throws PlaceholderException {
        PlaceholderUtils.checkArgs(args, 0);

        final LargeTurbineMachine machine = getLargeTurbineMachine(ctx);

        return MultiLineComponent.of(Component.translatable("gtceu.multiblock.turbine.efficiency",
            machine.getTotalEfficiency()));

      }
    });

    PlaceholderHandler.addPlaceholder(new Placeholder("ltEnergyPerTick") {
      @Override
      public MultiLineComponent apply(PlaceholderContext ctx, List<MultiLineComponent> args) throws PlaceholderException {
        PlaceholderUtils.checkArgs(args, 0);

        final LargeTurbineMachine machine = getLargeTurbineMachine(ctx);

        return MultiLineComponent.of(Component.translatable("gtceu.multiblock.turbine.energy_per_tick",
            FormattingUtil.formatNumbers(machine.getCurrentProduction()),
            FormattingUtil.formatNumbers(machine.getOverclockVoltage())));
      }
    });

//    PlaceholderHandler.addPlaceholder(new Placeholder("ltMaxEnergyPerTick") {
//      @Override
//      public MultiLineComponent apply(PlaceholderContext ctx, List<MultiLineComponent> args) throws PlaceholderException {
//        PlaceholderUtils.checkArgs(args, 0);
//
//        final LargeTurbineMachine machine = getLargeTurbineMachine(ctx);
//
//        return MultiLineComponent.of(Component.translatable("gtceu.multiblock.turbine.energy_per_tick",
//            FormattingUtil.formatNumbers(machine.getOverclockVoltage())));
//      }
//    });

    PlaceholderHandler.addPlaceholder(new Placeholder("ltRotorDurability") {
      @Override
      public MultiLineComponent apply(PlaceholderContext ctx, List<MultiLineComponent> args) throws PlaceholderException {
        PlaceholderUtils.checkArgs(args, 0);

        final LargeTurbineMachine machine = getLargeTurbineMachine(ctx);
        int rotorDurability = machine.getRotorDurabilityPercent();
        if (rotorDurability > MIN_DURABILITY_TO_WARN) {
          return MultiLineComponent.of(Component.translatable("gtceu.multiblock.turbine.rotor_durability", rotorDurability));
        } else {
          return MultiLineComponent.of(Component.translatable("gtceu.multiblock.turbine.rotor_durability", rotorDurability).setStyle(Style.EMPTY.withColor(ChatFormatting.RED)));
        }
      }
    });
  }

  private static LargeTurbineMachine getLargeTurbineMachine(final PlaceholderContext ctx) throws PlaceholderException {

    final BlockEntity blockEntity = ctx.level().getBlockEntity(ctx.pos());
    if (!(blockEntity instanceof IMachineBlockEntity machineBlockEntity)) {
      throw new PlaceholderException("Block is not a GT machine");
    }

    final MetaMachine machine = machineBlockEntity.getMetaMachine();
    if (!(machine instanceof LargeTurbineMachine largeTurbineMachine)) {
      throw new PlaceholderException("Machine is not Large Turbine Machine ");
    }

    return largeTurbineMachine;
  }


}
