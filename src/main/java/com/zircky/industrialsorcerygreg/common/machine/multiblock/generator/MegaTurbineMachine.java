package com.zircky.industrialsorcerygreg.common.machine.multiblock.generator;

import com.gregtechceu.gtceu.api.blockentity.BlockEntityCreationInfo;
import com.gregtechceu.gtceu.api.machine.multiblock.WorkableElectricMultiblockMachine;
import com.gregtechceu.gtceu.api.machine.multiblock.WorkableMultiblockMachine;
import com.gregtechceu.gtceu.api.machine.trait.RecipeLogic;

import java.util.function.Function;

public class MegaTurbineMachine extends WorkableElectricMultiblockMachine {
  private final long baseEUOutput;
  private final int tier;


  public MegaTurbineMachine(BlockEntityCreationInfo info, Function<WorkableMultiblockMachine, RecipeLogic> recipeLogicSupplier, long baseEUOutput, int tier) {
    super(info, recipeLogicSupplier);
    this.baseEUOutput = baseEUOutput;
    this.tier = tier;
  }
}
