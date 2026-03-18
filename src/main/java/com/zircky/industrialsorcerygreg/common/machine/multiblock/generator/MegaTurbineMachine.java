package com.zircky.industrialsorcerygreg.common.machine.multiblock.generator;

import com.gregtechceu.gtceu.api.machine.IMachineBlockEntity;
import com.gregtechceu.gtceu.api.machine.multiblock.WorkableElectricMultiblockMachine;

public class MegaTurbineMachine extends WorkableElectricMultiblockMachine {
  private final long baseEUOutput;
  private final int tier;

  public MegaTurbineMachine(IMachineBlockEntity holder, long baseEUOutput, int tier) {
    super(holder);
    this.baseEUOutput = baseEUOutput;
    this.tier = tier;
  }


}
