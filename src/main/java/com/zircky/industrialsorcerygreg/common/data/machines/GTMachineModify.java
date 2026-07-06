package com.zircky.industrialsorcerygreg.common.data.machines;

import com.gregtechceu.gtceu.api.multiblock.pattern.MultiblockPatternBuilder;

import static com.gregtechceu.gtceu.api.multiblock.Predicates.blocks;
import static com.gregtechceu.gtceu.api.multiblock.Predicates.controller;
import static com.gregtechceu.gtceu.api.multiblock.util.RelativeDirection.*;
import static com.gregtechceu.gtceu.common.data.GTBlocks.*;
import static com.gregtechceu.gtceu.common.data.machines.GTMultiMachines.LARGE_BOILER_BRONZE;

public class GTMachineModify {
  public static void init() {
//    LARGE_BOILER_BRONZE.setPattern(LARGE_BOILER_BRONZE.getName(),
//        definition -> MultiblockPatternBuilder.start(FRONT, UP, RIGHT)
//            .slice("FFFFF", "CCCCC", " CCC ", "   C ", "   C ", "   C ")
//            .slice("FFFFF", "C   C", "PCC P", "PPC C", "  C C", "  CCC")
//            .slice("FFFFF", "CCSCC", " CCC ", "   C ", "   C ", "   C ")
//            .where('S', controller(blocks(LARGE_BOILER_BRONZE.getBlock())))
//            .where('F', blocks(FIREBOX_BRONZE.get()))
//            .where('C', blocks(CASING_BRONZE_BRICKS.get()))
//            .where('P', blocks(CASING_BRONZE_PIPE.get()))
//            .build());
  }
}
