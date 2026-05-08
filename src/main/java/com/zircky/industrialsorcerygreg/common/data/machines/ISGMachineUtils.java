package com.zircky.industrialsorcerygreg.common.data.machines;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.blockentity.BlockEntityCreationInfo;
import com.gregtechceu.gtceu.api.machine.MachineDefinition;
import com.gregtechceu.gtceu.api.machine.MetaMachine;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import com.gregtechceu.gtceu.api.registry.registrate.MachineBuilder;
import com.gregtechceu.gtceu.common.data.machines.GTMachineUtils;
import com.zircky.industrialsorcerygreg.api.ISGValues;
import com.zircky.industrialsorcerygreg.api.registries.ISGRegistries;

import java.util.Locale;
import java.util.function.BiFunction;

import static com.zircky.industrialsorcerygreg.api.registries.ISGRegistries.REGISTRATE;

public class ISGMachineUtils extends GTMachineUtils {
  public static final int[] NUCLER_TIARS = ISGValues.tiersBetween(ISGValues.EV, ISGValues.LuV);

  public static MachineDefinition[] registerTieredMachines(String name,
                                                           BiFunction<BlockEntityCreationInfo, Integer, MetaMachine> factory,
                                                           BiFunction<Integer, MachineBuilder<MachineDefinition, ?>, MachineDefinition> builder,
                                                           int... tiers) {
    return registerTieredMachines(ISGRegistries.REGISTRATE, name, factory, builder, tiers);
  }

  public static MachineDefinition[] registerTieredMachines(GTRegistrate registrate,
                                                           String name,
                                                           BiFunction<BlockEntityCreationInfo, Integer, MetaMachine> factory,
                                                           BiFunction<Integer, MachineBuilder<MachineDefinition, ?>, MachineDefinition> builder,
                                                           int... tiers) {
    MachineDefinition[] definitions = new MachineDefinition[GTValues.TIER_COUNT];
    for (int tier : tiers) {
      var register = registrate
          .machine(GTValues.VN[tier].toLowerCase(Locale.ROOT) + "_" + name,
              info -> factory.apply(info, tier))
          .tier(tier);
      definitions[tier] = builder.apply(tier, register);
    }
    return definitions;
  }
}
