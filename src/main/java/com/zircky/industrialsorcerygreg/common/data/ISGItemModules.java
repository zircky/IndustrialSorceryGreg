package com.zircky.industrialsorcerygreg.common.data;

import com.zircky.industrialsorcerygreg.common.item.module.OxygenTankModule;
import com.zircky.industrialsorcerygreg.ISGCore;

import com.gregtechceu.gtceu.api.capability.GTCapabilityHelper;
import com.gregtechceu.gtceu.api.item.module.ModuleContext;
import com.gregtechceu.gtceu.api.registry.GTRegistries;

import net.minecraft.world.item.ItemStack;

import org.jetbrains.annotations.Nullable;

public final class ISGItemModules {
  public static final OxygenTankModule OXYGEN_TANK = new OxygenTankModule(ISGCore.id("oxygen_tank"));

  private ISGItemModules() {}

  public static void init() {
    GTRegistries.ITEM_MODULES.register(OXYGEN_TANK.getId(), OXYGEN_TANK);
  }

  public static @Nullable ModuleContext getOxygenTank(ItemStack stack) {
    final var modular = GTCapabilityHelper.getModularItem(stack);
    if (modular == null) return null;
    final var context = modular.getModuleContext(OXYGEN_TANK);
    return context != null && OXYGEN_TANK.isEnabled(context) ? context : null;
  }
}
