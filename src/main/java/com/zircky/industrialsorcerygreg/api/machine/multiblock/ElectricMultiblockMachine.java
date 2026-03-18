package com.zircky.industrialsorcerygreg.api.machine.multiblock;

import com.gregtechceu.gtceu.api.machine.IMachineBlockEntity;
import com.gregtechceu.gtceu.api.machine.feature.IRecipeLogicMachine;
import com.gregtechceu.gtceu.api.machine.multiblock.WorkableElectricMultiblockMachine;
import com.zircky.industrialsorcerygreg.api.machine.feature.IElectricMachine;

public class ElectricMultiblockMachine extends WorkableElectricMultiblockMachine implements IElectricMachine, IRecipeLogicMachine {
  public ElectricMultiblockMachine(IMachineBlockEntity holder, Object... args) {
    super(holder, args);
  }
}
