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
import com.gregtechceu.gtceu.api.recipe.OverclockingLogic;
import com.gregtechceu.gtceu.common.data.*;
import com.zircky.industrialsorcerygreg.api.ISGValues;
import com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes;
import com.zircky.industrialsorcerygreg.common.machine.multiblock.electric.DissolvingTankMachine;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Blocks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static com.gregtechceu.gtceu.api.machine.multiblock.PartAbility.*;
import static com.gregtechceu.gtceu.api.pattern.Predicates.*;
import static com.gregtechceu.gtceu.common.data.GCYMBlocks.CASING_CORROSION_PROOF;
import static com.gregtechceu.gtceu.common.data.GCYMBlocks.CASING_WATERTIGHT;
import static com.gregtechceu.gtceu.common.data.GTBlocks.*;
import static com.gregtechceu.gtceu.common.data.GTMachines.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeModifiers.BATCH_MODE;
import static com.gregtechceu.gtceu.common.data.GTRecipeModifiers.ELECTRIC_OVERCLOCK;
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
              .or(abilities(MAINTENANCE).setExactLimit(1)))
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
              .or(abilities(PARALLEL_HATCH).setMaxGlobalLimited(1)))
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

//  public static final MultiblockMachineDefinition DIGESTION_TANK = REGISTRATE.multiblock("digestion_tank", CoilWorkableElectricMultiblockMachine::new)
//      .rotationState(RotationState.NON_Y_AXIS)
//      .recipeTypes(ISGRecipeTypes.DIGESTION_TREATMENT_RECIPES)
//      .recipeModifiers(GTRecipeModifiers.PARALLEL_HATCH, BATCH_MODE)
//      .appearanceBlock(GTBlocks.CASING_TUNGSTENSTEEL_ROBUST)
//      .pattern(definition -> FactoryBlockPattern.start()
//          .where('S', controller(blocks(definition.get())))
//          .where('X', blocks(GTBlocks.CASING_STAINLESS_CLEAN.get()))
//          .where('K', blocks(GTBlocks.CASING_INVAR_HEATPROOF.get()))
//          .where('Y', blocks(GTBlocks.CASING_TUNGSTENSTEEL_ROBUST.get()))
//          .where('M', heatingCoils())
//          .where('O', blocks(GTBlocks.CASING_TUNGSTENSTEEL_ROBUST.get())
//              .or(autoAbilities(definition.getRecipeTypes()))
//              .or(abilities(PARALLEL_HATCH).setMaxGlobalLimited(1))
//              .or(abilities(MAINTENANCE).setExactLimit(1)))
//          .where('A', air())
//          .where('#', any())
//          .build())
//      .workableCasingModel(GTCEu.id("block/casings/solid/machine_casing_robust_tungstensteel"), GTCEu.id("block/multiblock/gcym/large_maceration_tower"))
//      .register();

  public static final MultiblockMachineDefinition DISSOLVING_TANK = REGISTRATE.multiblock("dissolving_tank", DissolvingTankMachine::new)
      .rotationState(RotationState.NON_Y_AXIS)
      .recipeTypes(ISGRecipeTypes.DISSOLUTION_TREATMENT_RECIPES)
      .appearanceBlock(GTBlocks.CASING_STAINLESS_CLEAN)
      .pattern(definition -> FactoryBlockPattern.start()
          .aisle("X###X", "OOOOO", "XGGGX", "XGGGX", "#XXX#")
          .aisle("#####", "OKKKO", "G###G", "G###G", "XXXXX")
          .aisle("#####", "OKKKO", "G###G", "G###G", "XXXXX")
          .aisle("#####", "OKKKO", "G###G", "G###G", "XXXXX")
          .aisle("X###X", "OOSOO", "XGGGX", "XGGGX", "#XXX#")
          .where('S', controller(blocks(definition.get())))
          .where('X', blocks(GTBlocks.CASING_STAINLESS_CLEAN.get()))
          .where('K', blocks(GTBlocks.CASING_INVAR_HEATPROOF.get()))
          .where('O', blocks(GTBlocks.CASING_STAINLESS_CLEAN.get())
              .or(autoAbilities(definition.getRecipeTypes()))
              .or(autoAbilities(true, false, true)))
          .where('G', blocks(GTBlocks.CASING_TEMPERED_GLASS.get()))
          .where('#', any())
          .build())
      .workableCasingModel(GTCEu.id("block/casings/solid/machine_casing_clean_stainless_steel"), GTCEu.id("block/multiblock/generator/large_gas_turbine"))
      .register();

  public static final MultiblockMachineDefinition LEACHING_PLANT = REGISTRATE.multiblock("leaching_plant", WorkableElectricMultiblockMachine::new)
      .rotationState(RotationState.NON_Y_AXIS)
      .recipeType(ISGRecipeTypes.LEACHING_PLANT_RECIPES)
      .recipeModifiers(ELECTRIC_OVERCLOCK.apply(OverclockingLogic.NON_PERFECT_OVERCLOCK), GTRecipeModifiers.PARALLEL_HATCH, BATCH_MODE)
      .appearanceBlock(CASING_STAINLESS_CLEAN)
      .pattern(definition -> FactoryBlockPattern.start()
          .aisle("AAAAA", "AAAAA", "AAAAA")
          .aisle("AAAAA", "ACCCA", "A   A")
          .aisle("AAAAA", "ACCCA", "A   A")
          .aisle("AAAAA", "AAAAA", "AAAAA")
          .aisle("AAAAA", "ACCCA", "     ")
          .aisle("AAAAA", "S   A", "     ")
          .aisle("AAAAA", "AAAAA", "     ")
          .where('S', controller(blocks(definition.get())))
          .where('A', blocks(CASING_STAINLESS_CLEAN.get()).or(autoAbilities(definition.getRecipeTypes()))
              .or(autoAbilities(true, false, true)))
          .where('C', blocks(CASING_STEEL_PIPE.get()))
          .where(' ', any())
          .build())
      .workableCasingModel(GTCEu.id("block/casings/solid/machine_casing_clean_stainless_steel"), GTCEu.id("block/multiblock/generator/large_gas_turbine"))
      .register();

  public static final MultiblockMachineDefinition CHROMATIC_FLOTATION_PLANT = REGISTRATE
      .multiblock("chromatic_flotation_plant", WorkableElectricMultiblockMachine::new)
      .rotationState(RotationState.NON_Y_AXIS)
      .recipeType(ISGRecipeTypes.CHROMATIC_FLOTATION_PLANT_RECIPES)
      .recipeModifiers(ELECTRIC_OVERCLOCK.apply(OverclockingLogic.NON_PERFECT_OVERCLOCK),
          GTRecipeModifiers.PARALLEL_HATCH, GTRecipeModifiers.BATCH_MODE)
      .appearanceBlock(CASING_WATERTIGHT)
      .pattern(definition -> FactoryBlockPattern.start()
          .aisle("AAAAAAA", "AAAAAAA", "AAAAAAA", "AAAAAAA", "AAAAAAA")
          .aisle("AAAAAAA", "ABCBCBA", "ABBBBBA", "ABBBBBA", "ABBBBBA")
          .aisle("AAAAAAA", "ABCBCBA", "ABBBBBA", "ABBBBBA", "ABBBBBA")
          .aisle("AAAAAAA", "ABCBCBA", "ABBBBBA", "ABBBBBA", "ABBBBBA")
          .aisle("AAAAAAA", "ABCBCBA", "ABBBBBA", "ABBBBBA", "ABBBBBA")
          .aisle("AAAAAAA", "AACACAA", "AAAAAAA", "AAAAAAA", "AAAAAAA")
          .aisle("       ", "  C C  ", "       ", "       ", "       ")
          .aisle(" DDDDD ", " DCDCD ", " DDDDD ", "       ", "       ")
          .aisle(" DDDDD ", " DEEED ", " DDDDD ", "       ", "       ")
          .aisle(" DDDDD ", " DEEED ", " DDDDD ", "       ", "       ")
          .aisle(" DDDDD ", " DDFDD ", " DDDDD ", "       ", "       ")
          .aisle("       ", "       ", "       ", "       ", "       ")
          .where(' ', any())
          .where("F", controller(blocks(definition.getBlock())))
          .where('C', blocks(CASING_TUNGSTENSTEEL_PIPE.get()))
          .where('A', blocks(CASING_CORROSION_PROOF.get()))
          .where('E', blocks(CASING_STEEL_SOLID.get()))
          .where('B', blocks(Blocks.WATER))
          .where('D', blocks(CASING_WATERTIGHT.get())
              .or(Predicates.abilities(PartAbility.EXPORT_ITEMS).setMaxGlobalLimited(1))
              .or(Predicates.abilities(PartAbility.EXPORT_FLUIDS).setMaxGlobalLimited(1))
              .or(Predicates.abilities(PartAbility.INPUT_ENERGY).setMinGlobalLimited(1)
                  .setMaxGlobalLimited(2))
              .or(Predicates.abilities(PartAbility.IMPORT_FLUIDS).setExactLimit(1))
              .or(Predicates.abilities(PartAbility.IMPORT_ITEMS).setExactLimit(1)))
          .build())
      .workableCasingModel(GTCEu.id("block/casings/gcym/watertight_casing"),
          GTCEu.id("block/multiblock/generator/large_gas_turbine"))
      .register();

}
