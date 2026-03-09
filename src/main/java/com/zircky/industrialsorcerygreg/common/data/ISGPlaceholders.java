package com.zircky.industrialsorcerygreg.common.data;


import com.gregtechceu.gtceu.api.capability.GTCapabilityHelper;
import com.gregtechceu.gtceu.api.capability.IWorkable;
import com.gregtechceu.gtceu.api.machine.feature.multiblock.IMaintenanceMachine;
import com.gregtechceu.gtceu.api.placeholder.*;
import com.gregtechceu.gtceu.api.placeholder.exceptions.NotSupportedException;
import com.gregtechceu.gtceu.api.placeholder.exceptions.PlaceholderException;
import net.minecraft.network.chat.Component;

import java.util.List;

import static com.zircky.industrialsorcerygreg.common.data.ISGLargeCombustionEnginePlaceholder.largeCombustionEnginePlaceholder;
import static com.zircky.industrialsorcerygreg.common.data.ISGLargeTurbinePlaceholder.largeTurbinePlaceholder;
import static com.zircky.industrialsorcerygreg.common.data.ISGPowerSubstationPlaceholder.powerSubstationPlaceholder;


public class ISGPlaceholders {
  public static void register() {
    powerSubstationPlaceholder();
    largeCombustionEnginePlaceholder();
    largeTurbinePlaceholder();
    all();
  }

  public static void all() {
    PlaceholderHandler.addPlaceholder(new Placeholder("isgActive") {
      @Override
      public MultiLineComponent apply(PlaceholderContext ctx,
                                      List<MultiLineComponent> args) throws PlaceholderException {
        PlaceholderUtils.checkArgs(args, 0);
        IWorkable workable = GTCapabilityHelper.getWorkable(ctx.level(),
            ctx.pos(), ctx.side());
        if (workable == null) throw new NotSupportedException();
        if (!workable.isWorkingEnabled()) {
          return MultiLineComponent.of(Component.translatable("gtceu.multiblock.work_paused"));
        } else if (workable.isActive()) {
          return MultiLineComponent.of(Component.translatable("gtceu.multiblock.running"));
        } else {
          return MultiLineComponent.of(Component.translatable("gtceu.multiblock.idling"));
        }
      }
    });
    PlaceholderHandler.addPlaceholder(new Placeholder("isgMaintenance") {
      @Override
      public MultiLineComponent apply(PlaceholderContext ctx,
                                      List<MultiLineComponent> args) throws PlaceholderException {
        PlaceholderUtils.checkArgs(args, 0);
        IMaintenanceMachine maintenance = GTCapabilityHelper.getMaintenanceMachine(ctx.level(),
            ctx.pos(), ctx.side());
        if (maintenance == null) throw new NotSupportedException();
        return MultiLineComponent.literal(maintenance.hasMaintenanceProblems() ? "Needs Maintenance" : "No Maintenance issues");
      }
    });
  }

}
