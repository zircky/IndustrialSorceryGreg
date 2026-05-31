package com.zircky.industrialsorcerygreg.common.data.machines;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.data.RotationState;
import com.gregtechceu.gtceu.api.machine.MultiblockMachineDefinition;
import com.gregtechceu.gtceu.api.machine.multiblock.CoilWorkableElectricMultiblockMachine;
import com.gregtechceu.gtceu.api.machine.multiblock.PartAbility;
import com.gregtechceu.gtceu.api.machine.multiblock.WorkableElectricMultiblockMachine;
import com.gregtechceu.gtceu.api.pattern.FactoryBlockPattern;
import com.gregtechceu.gtceu.api.pattern.MultiblockShapeInfo;
import com.gregtechceu.gtceu.api.pattern.Predicates;
import com.gregtechceu.gtceu.api.pattern.util.RelativeDirection;
import com.gregtechceu.gtceu.common.data.*;
import com.zircky.industrialsorcerygreg.api.ISGValues;
import com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Blocks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static com.gregtechceu.gtceu.api.pattern.Predicates.*;
import static com.gregtechceu.gtceu.common.data.GTBlocks.*;
import static com.gregtechceu.gtceu.common.data.GTMachines.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeModifiers.BATCH_MODE;
import static com.gregtechceu.gtceu.common.data.GTRecipeModifiers.OC_NON_PERFECT_SUBTICK;
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


  public static final MultiblockMachineDefinition LIQUEFACTION_FURNACE = REGISTRATE.multiblock("liquefaction_furnace", CoilWorkableElectricMultiblockMachine::new)
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
      .shapeInfos(definition -> {
        List<MultiblockShapeInfo> shapeInfo = new ArrayList<>();
        var builder = MultiblockShapeInfo.builder()
            .aisle("AISOA", "#BBB#", "#AMA#")
            .aisle("AAAAA", "B#B#B", "ACCCA")
            .aisle("AAAAA", "BBPBB", "ACHCA")
            .aisle("AAAAA", "B#B#B", "ACCCA")
            .aisle("AAAEE", "#BBB#", "#AAA#")
            .where('A', CASING_INVAR_HEATPROOF.getDefaultState())
            .where('C', CASING_STEEL_SOLID.getDefaultState())
            .where('P', CASING_STEEL_PIPE.getDefaultState())
            .where('S', definition, Direction.NORTH)
            .where('#', Blocks.AIR.defaultBlockState())
            .where('E', ENERGY_INPUT_HATCH[ISGValues.LV], Direction.SOUTH)
            .where('I', ITEM_IMPORT_BUS[ISGValues.LV], Direction.NORTH)
            .where('O', FLUID_EXPORT_HATCH[ISGValues.LV], Direction.NORTH)
            .where('H', MUFFLER_HATCH[ISGValues.LV], Direction.UP)
            .where('M', MAINTENANCE_HATCH, Direction.NORTH);
        GTCEuAPI.HEATING_COILS.entrySet().stream()
            .sorted(Comparator.comparingInt(entry -> entry.getKey().getTier()))
            .forEach(coil -> shapeInfo.add(builder.shallowCopy().where('B', coil.getValue().get()).build()));
        return shapeInfo;
      })
      .workableCasingModel(GTCEu.id("block/casings/solid/machine_casing_heatproof"), GTCEu.id("block/multiblock/multi_furnace"))
      .register();

  public static final MultiblockMachineDefinition FUEL_REPROCESSOR = REGISTRATE.multiblock("fuel_reprocessor", WorkableElectricMultiblockMachine::new)
      .rotationState(RotationState.ALL)
      .recipeType(ISGRecipeTypes.FUEL_REPROCESSOR_RECIPES)
      .recipeModifiers(GTRecipeModifiers.PARALLEL_HATCH, OC_NON_PERFECT_SUBTICK, BATCH_MODE)
      .appearanceBlock(GCYMBlocks.CASING_ATOMIC)
      .pattern(definition -> FactoryBlockPattern.start()
          .aisle("#XXX#", "XXCXX", "#XXX#")
          .aisle("XXXXX", "XAPAX", "XXXXX")
          .aisle("XXXXX", "CPRPC", "XXXXX")
          .aisle("XXXXX", "XAPAX", "XXXXX")
          .aisle("#XXX#", "XXSXX", "#XXX#")
          .where('S', controller(blocks(definition.get())))
          .where('X', blocks(GCYMBlocks.CASING_ATOMIC.get()).setMinGlobalLimited(40)
              .or(Predicates.autoAbilities(definition.getRecipeTypes()))
              .or(Predicates.autoAbilities(true, false, true)))
          .where('R', Predicates.blocks(GTBlocks.CASING_TITANIUM_GEARBOX.get()))
          .where('C', Predicates.blocks(GTBlocks.CASING_ENGINE_INTAKE.get()))
          .where('P', Predicates.blocks(GTBlocks.CASING_TITANIUM_PIPE.get()))
          .where('A', Predicates.air())
          .where('#', Predicates.any())
          .build())
      .workableCasingModel(GTCEu.id("block/casings/gcym/atomic_casing"),
          GTCEu.id("block/multiblock/gcym/large_centrifuge"))
      .register();

}
