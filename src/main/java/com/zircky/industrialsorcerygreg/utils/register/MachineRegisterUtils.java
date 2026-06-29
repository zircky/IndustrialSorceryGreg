package com.zircky.industrialsorcerygreg.utils.register;

import com.gregtechceu.gtceu.api.blockentity.BlockEntityCreationInfo;
import com.gregtechceu.gtceu.api.machine.MetaMachine;
import com.gregtechceu.gtceu.api.machine.MultiblockMachineDefinition;
import com.zircky.industrialsorcerygreg.api.registries.ISGMultiblockMachineBuilder;

import java.util.function.Function;

import static com.zircky.industrialsorcerygreg.api.registries.ISGRegistries.REGISTRATE;

public class MachineRegisterUtils {
  private MachineRegisterUtils() {
    /* This utility class should not be instantiated */
  }

  public static ISGMultiblockMachineBuilder<MultiblockMachineDefinition> multiblock(String name, Function<BlockEntityCreationInfo, MetaMachine> metaMachine) {
    return REGISTRATE.multiblock(name, metaMachine);
  }
}
