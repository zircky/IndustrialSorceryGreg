package com.zircky.industrialsorcerygreg.common.data;

import com.gregtechceu.gtceu.api.machine.IMachineBlockEntity;
import com.gregtechceu.gtceu.api.machine.MetaMachine;
import com.gregtechceu.gtceu.api.placeholder.*;
import com.gregtechceu.gtceu.api.placeholder.exceptions.PlaceholderException;
import com.gregtechceu.gtceu.common.machine.multiblock.generator.LargeCombustionEngineMachine;
import com.gregtechceu.gtceu.utils.FormattingUtil;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.block.entity.BlockEntity;

import java.util.List;

public class ISGLargeCombustionEnginePlaceholder {
  public static void largeCombustionEnginePlaceholder() {
    PlaceholderHandler.addPlaceholder(new Placeholder("lceOutTotalTick") {
      @Override
      public MultiLineComponent apply(PlaceholderContext ctx, List<MultiLineComponent> args) throws PlaceholderException {
        PlaceholderUtils.checkArgs(args, 0);

        final LargeCombustionEngineMachine machine = getLargeCombustionEngineMachine(ctx);
        assert machine.recipeLogic.getLastRecipe() != null;
        long lastEUt = machine.recipeLogic.getLastRecipe() != null ?
            machine.recipeLogic.getLastRecipe().getOutputEUt().getTotalEU() : 0;

        return MultiLineComponent.of(Component.translatable("gtceu.multiblock.turbine.energy_per_tick_maxed",
            FormattingUtil.formatNumbers(lastEUt)).withStyle(ChatFormatting.GRAY));

      }
    });
  }

  private static LargeCombustionEngineMachine getLargeCombustionEngineMachine(
      final PlaceholderContext ctx
  ) throws PlaceholderException {

    final BlockEntity blockEntity = ctx.level().getBlockEntity(ctx.pos());
    if (!(blockEntity instanceof IMachineBlockEntity machineBlockEntity)) {
      throw new PlaceholderException("Block is not a GT machine");
    }

    final MetaMachine machine = machineBlockEntity.getMetaMachine();
    if (!(machine instanceof LargeCombustionEngineMachine largeCombustionEngineMachine)) {
      throw new PlaceholderException("Machine is not Power Substation");
    }

    return largeCombustionEngineMachine;
  }
}
