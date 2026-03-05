package com.zircky.industrialsorcerygreg.common.data.machines;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.machine.MultiblockMachineDefinition;
import com.gregtechceu.gtceu.api.machine.multiblock.PartAbility;
import com.gregtechceu.gtceu.api.machine.multiblock.WorkableElectricMultiblockMachine;
import com.gregtechceu.gtceu.api.pattern.FactoryBlockPattern;
import com.gregtechceu.gtceu.api.pattern.Predicates;
import com.gregtechceu.gtceu.common.data.GTBlocks;
import com.gregtechceu.gtceu.common.data.GTMaterials;

import static com.gregtechceu.gtceu.api.pattern.Predicates.*;
import static com.zircky.industrialsorcerygreg.api.registries.ISGRegistries.REGISTRATE;
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
}
