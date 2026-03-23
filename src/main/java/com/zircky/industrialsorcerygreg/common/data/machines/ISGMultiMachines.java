package com.zircky.industrialsorcerygreg.common.data.machines;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.data.RotationState;
import com.gregtechceu.gtceu.api.machine.MultiblockMachineDefinition;
import com.gregtechceu.gtceu.api.machine.multiblock.CoilWorkableElectricMultiblockMachine;
import com.gregtechceu.gtceu.api.machine.multiblock.PartAbility;
import com.gregtechceu.gtceu.api.machine.multiblock.WorkableElectricMultiblockMachine;
import com.gregtechceu.gtceu.api.pattern.FactoryBlockPattern;
import com.gregtechceu.gtceu.api.pattern.util.RelativeDirection;
import com.gregtechceu.gtceu.common.data.GTBlocks;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.common.data.GTRecipeModifiers;

import static com.gregtechceu.gtceu.api.pattern.Predicates.*;
import static com.zircky.industrialsorcerygreg.api.registries.ISGRegistries.REGISTRATE;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.LIQUEFACTION_FURNACE_RECIPES;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.ROCKET_ASSEMBLER_RECIPES;

public class ISGMultiMachines {
  public static void init() {}

  public final static MultiblockMachineDefinition ROCKET_ASSEMBLER = REGISTRATE
      .multiblock("rocket_assembler", WorkableElectricMultiblockMachine::new)
      .langValue("Rocker Assembler")
      .recipeType(ROCKET_ASSEMBLER_RECIPES)
      .appearanceBlock(GTBlocks.CASING_STAINLESS_CLEAN)
      .pattern(definition -> FactoryBlockPattern.start()
          .aisle("     AABABAA     ", "     AA   AA     ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ")
          .aisle("    AAABABAAA    ", "    AC     CA    ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ")
          .aisle("   AAAABABAAAA   ", "    AC     CA    ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ")
          .aisle("  AAAAABABAAAAA  ", "   ADC     CDA   ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ")
          .aisle("  AAAAABABAAAAA  ", "  ADCC     CCDA  ", "     C     C     ", "     C     C     ", "     C     C     ", "     C     C     ", "     C     C     ", "     C     C     ", "     C     C     ", "     C     C     ", "     C     C     ", "     C     C     ", "     C     C     ", "     C     C     ", "   CCCCCCCCCCC   ", "     C     C     ", "     C     C     ", "     C     C     ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ")
          .aisle(" AAAAAABABAAAAAA ", " AAD         DAA ", " AAA         AAA ", "  AE         EA  ", "  AE         EA  ", "  AE         EA  ", "  AE         EA  ", "  AE         EA  ", "  AE         EA  ", "  AE         EA  ", "   A         A   ", "   A         A   ", "   A         A   ", "   A         A   ", "   C         C   ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ")
          .aisle("AAAAAAABABAAAAAAA", "AAAD         DAAA", " AAA         AAA ", " AAA         AAA ", " AAA         AAA ", " AAAFF     FFAAA ", " AAA         AAA ", " AAA         AAA ", " AAA         AAA ", " AAAFF     FFAAA ", "  AA         AA  ", "  AA         AA  ", "  AA         AA  ", "  AA         AA  ", "  AAFF     FFAA  ", "  AAF       FAA  ", "  AAF       FAA  ", "   AF       FA   ", "   AFF     FFA   ", "                 ", "                 ", "                 ", "                 ", "                 ")
          .aisle("AAAAAAABABAAAAAAA", "AAGHI       IHGAA", " DGHI       IHGD ", " DGHI       IHGD ", " DGHI       IHGD ", " DGHI       IHGD ", " DGHI       IHGD ", " DGHI       IHGD ", " DGHI       IHGD ", " DGHI       IHGD ", "  DAI       IAD  ", "  DHI       IHD  ", "  DHI       IHD  ", "  DHI       IHD  ", "  DHI       IHD  ", "  DHI       IHD  ", "  DHI       IHD  ", "  DHI       IHD  ", "  AAA       AAA  ", "   AC       CA   ", "   AC       CA   ", "   AC       CA   ", "   A         A   ", "   A         A   ")
          .aisle("AAAAAAABABAAAAAAA", "AAAD         DAAA", " AAA         AAA ", " AAA         AAA ", " AAA         AAA ", " AAAFF     FFAAA ", " AAA         AAA ", " AAA         AAA ", " AAA         AAA ", " AAAFF     FFAAA ", "  AA         AA  ", "  AA         AA  ", "  AA         AA  ", "  AA         AA  ", "  AAFF     FFAA  ", "  AAF       FAA  ", "  AAF       FAA  ", "   AF       FA   ", "   AFF     FFA   ", "                 ", "                 ", "                 ", "                 ", "                 ")
          .aisle(" AAAAAABABAAAAAA ", " AAD         DAA ", " AAA         AAA ", "  AE         EA  ", "  AE         EA  ", "  AE         EA  ", "  AE         EA  ", "  AE         EA  ", "  AE         EA  ", "  AE         EA  ", "   A         A   ", "   A         A   ", "   A         A   ", "   A         A   ", "   C         C   ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ")
          .aisle("  AAAAABABAAAAA  ", "  ADCC     CCDA  ", "     C     C     ", "     C     C     ", "     C     C     ", "     C     C     ", "     C     C     ", "     C     C     ", "     C     C     ", "     C     C     ", "     C     C     ", "     C     C     ", "     C     C     ", "     C     C     ", "   CCCCCCCCCCC   ", "     C     C     ", "     C     C     ", "     C     C     ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ")
          .aisle("  AAAAABABAAAAA  ", "   ADD     DDA   ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ")
          .aisle("   AAAAAAAAAAA   ", "    AADDDDDAA    ", "       JJJ       ", "       JJJ       ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ")
          .aisle("    AAAAAAAAA    ", "      ABBBA      ", "       JJJ       ", "       JJJ       ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ")
          .aisle("     AAAAAAA     ", "       JJJ       ", "       JKJ       ", "       JJJ       ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ")
          .where('A', blocks(GTBlocks.CASING_STEEL_SOLID.get()))
          .where('B', blocks(GTBlocks.CASING_STEEL_GEARBOX.get()))
          .where('C', frames(GTMaterials.Steel))
          .where('D', blocks(GTBlocks.CASING_GRATE.get()))
          .where('E', blocks(GTBlocks.HERMETIC_CASING_LV.get()))
          .where('F', frames(GTMaterials.StainlessSteel))
          .where('G', blocks(GTBlocks.HERMETIC_CASING_HV.get()))
          .where('H', blocks(GTBlocks.CASING_STAINLESS_STEEL_GEARBOX.get()))
          .where('I', blocks(GTBlocks.CASING_STEEL_PIPE.get()))
          .where('J', blocks(GTBlocks.CASING_STAINLESS_CLEAN.get())
              .or(autoAbilities(definition.getRecipeTypes()))
              .or(autoAbilities(true, false, true)))
          .where('K', controller(blocks(definition.get())))
          .where(' ', any())
          .build())
      .workableCasingModel(GTCEu.id("block/casings/solid/machine_casing_clean_stainless_steel"), GTCEu.id("block/multiblock/gcym/large_assembler"))
      .register();


  public final static MultiblockMachineDefinition LIQUEFACTION_FURNACE = REGISTRATE.multiblock("liquefaction_furnace", CoilWorkableElectricMultiblockMachine::new)
      .rotationState(RotationState.NON_Y_AXIS)
      .recipeType(LIQUEFACTION_FURNACE_RECIPES)
      .recipeModifiers(GTRecipeModifiers::ebfOverclock, GTRecipeModifiers.PARALLEL_HATCH, GTRecipeModifiers.BATCH_MODE)
      .appearanceBlock(GTBlocks.CASING_INVAR_HEATPROOF)
      .pattern(definition -> FactoryBlockPattern.start(RelativeDirection.FRONT, RelativeDirection.UP, RelativeDirection.RIGHT)
          .aisle("AAAAA", " BBB ", " AAA ")
          .aisle("AAAAA", "B B B", "ACCCA")
          .aisle("AAAAS", "BBEBB", "ACFCA")
          .aisle("AAAAA", "B B B", "ACCCA")
          .aisle("AAAAA", " BBB ", " AAA ")
          .where('B', heatingCoils())
          .where('C', blocks(GTBlocks.CASING_STEEL_SOLID.get()))
          .where('E', blocks(GTBlocks.CASING_STEEL_PIPE.get()))
          .where('A', blocks(GTBlocks.CASING_INVAR_HEATPROOF.get())
              .setMinGlobalLimited(20)
              .or(autoAbilities(definition.getRecipeTypes()))
              .or(abilities(PartAbility.MAINTENANCE).setExactLimit(1)))
          .where('F', abilities(PartAbility.MUFFLER))
          .where('S', controller(blocks(definition.getBlock())))
          .where(' ', any())
          .build())
      .subPattern(definition -> FactoryBlockPattern.start()
          .aisle("AAA    ", "AAA    ", "AAA    ")
          .aisle("BBB    ", "BDB    ", "BBB    ")
          .aisle("BEBF   ", "E EF   ", "BEBF   ")
          .aisle("BEBG   ", "E E    ", "BEBG   ")
          .aisle("BEBF   ", "E EF   ", "BEBF   ")
          .aisle("BBB   C", "BDB    ", "BBB    ")
          .aisle("AAA    ", "AAA    ", "AAA    ")
          .where('A', blocks(GTBlocks.CASING_INVAR_HEATPROOF.get())
              .or(autoAbilities(definition.getRecipeTypes(), false, false, true, true, true, true))
              .or(abilities(PartAbility.PARALLEL_HATCH).setMaxGlobalLimited(1)))
          .where('B', blocks(GTBlocks.CASING_STAINLESS_TURBINE.get()))
          .where('C', controller(blocks(definition.getBlock())))
          .where('D', blocks(GTBlocks.CASING_STAINLESS_STEEL_GEARBOX.get()))
          .where('E', blocks(GTBlocks.CASING_STAINLESS_CLEAN.get()))
          .where('F', frames(GTMaterials.StainlessSteel))
          .where('G', blocks(GTBlocks.CASING_TITANIUM_PIPE.get()))
          .where(' ', any())
          .build())
      .workableCasingModel(GTCEu.id("block/casings/solid/machine_casing_heatproof"), GTCEu.id("block/multiblock/multi_furnace"))
      .register();

}
