package com.zircky.industrialsorcerygreg.common.machine.multiblock.generator;

import com.gregtechceu.gtceu.api.blockentity.BlockEntityCreationInfo;
import com.gregtechceu.gtceu.api.machine.multiblock.WorkableElectricMultiblockMachine;

public class MegaTurbineMachine extends WorkableElectricMultiblockMachine {

    private final long baseEUOutput;
    private final int tier;

    public MegaTurbineMachine(BlockEntityCreationInfo info, long baseEUOutput, int tier) {
        super(info);
        this.baseEUOutput = baseEUOutput;
        this.tier = tier;
    }
}
