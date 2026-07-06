package com.zircky.industrialsorcerygreg.common.data.machines;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.RotationState;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.machine.MultiblockMachineDefinition;
import com.gregtechceu.gtceu.api.machine.multiblock.CoilWorkableElectricMultiblockMachine;
import com.gregtechceu.gtceu.api.machine.multiblock.PartAbility;
import com.gregtechceu.gtceu.api.machine.multiblock.WorkableElectricMultiblockMachine;
import com.gregtechceu.gtceu.api.multiblock.Predicates;
import com.gregtechceu.gtceu.api.multiblock.pattern.MultiblockPatternBuilder;
import com.gregtechceu.gtceu.api.recipe.OverclockingLogic;
import com.gregtechceu.gtceu.common.data.*;
import com.gregtechceu.gtceu.utils.FormattingUtil;
import com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes;
import com.zircky.industrialsorcerygreg.common.machine.multiblock.electric.DissolvingTankMachine;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.world.level.block.Blocks;

import static com.gregtechceu.gtceu.api.machine.multiblock.PartAbility.*;
import static com.gregtechceu.gtceu.api.multiblock.Predicates.*;
import static com.gregtechceu.gtceu.api.multiblock.util.RelativeDirection.*;
import static com.gregtechceu.gtceu.common.data.GCYMBlocks.CASING_CORROSION_PROOF;
import static com.gregtechceu.gtceu.common.data.GCYMBlocks.CASING_WATERTIGHT;
import static com.gregtechceu.gtceu.common.data.GTBlocks.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeModifiers.BATCH_MODE;
import static com.gregtechceu.gtceu.common.data.GTRecipeModifiers.ELECTRIC_OVERCLOCK;
import static com.gregtechceu.gtceu.common.data.GTRecipeModifiers.OC_NON_PERFECT_SUBTICK;
import static com.zircky.industrialsorcerygreg.api.registries.ISGRegistries.REGISTRATE;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.LIQUEFACTION_FURNACE_RECIPES;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.ROCKET_ASSEMBLER_RECIPES;
import static com.zircky.industrialsorcerygreg.utils.register.MachineRegisterUtils.multiblock;

public class ISGMultiMachines {
  public static void init() {}

  public final static MultiblockMachineDefinition ROCKET_ASSEMBLER = multiblock("rocket_assembler", WorkableElectricMultiblockMachine::new)
      .langValue("Rocker Assembler")
      .recipeType(ROCKET_ASSEMBLER_RECIPES)
      .appearanceBlock(GTBlocks.CASING_STAINLESS_CLEAN)
      .pattern(definition -> MultiblockPatternBuilder.start(FRONT, UP, RIGHT)
          .slice("     AABABAA     ", "     AA   AA     ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ")
          .slice("    AAABABAAA    ", "    AC     CA    ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ")
          .slice("   AAAABABAAAA   ", "    AC     CA    ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ")
          .slice("  AAAAABABAAAAA  ", "   ADC     CDA   ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ")
          .slice("  AAAAABABAAAAA  ", "  ADCC     CCDA  ", "     C     C     ", "     C     C     ", "     C     C     ", "     C     C     ", "     C     C     ", "     C     C     ", "     C     C     ", "     C     C     ", "     C     C     ", "     C     C     ", "     C     C     ", "     C     C     ", "   CCCCCCCCCCC   ", "     C     C     ", "     C     C     ", "     C     C     ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ")
          .slice(" AAAAAABABAAAAAA ", " AAD         DAA ", " AAA         AAA ", "  AE         EA  ", "  AE         EA  ", "  AE         EA  ", "  AE         EA  ", "  AE         EA  ", "  AE         EA  ", "  AE         EA  ", "   A         A   ", "   A         A   ", "   A         A   ", "   A         A   ", "   C         C   ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ")
          .slice("AAAAAAABABAAAAAAA", "AAAD         DAAA", " AAA         AAA ", " AAA         AAA ", " AAA         AAA ", " AAAFF     FFAAA ", " AAA         AAA ", " AAA         AAA ", " AAA         AAA ", " AAAFF     FFAAA ", "  AA         AA  ", "  AA         AA  ", "  AA         AA  ", "  AA         AA  ", "  AAFF     FFAA  ", "  AAF       FAA  ", "  AAF       FAA  ", "   AF       FA   ", "   AFF     FFA   ", "                 ", "                 ", "                 ", "                 ", "                 ")
          .slice("AAAAAAABABAAAAAAA", "AAGHI       IHGAA", " DGHI       IHGD ", " DGHI       IHGD ", " DGHI       IHGD ", " DGHI       IHGD ", " DGHI       IHGD ", " DGHI       IHGD ", " DGHI       IHGD ", " DGHI       IHGD ", "  DAI       IAD  ", "  DHI       IHD  ", "  DHI       IHD  ", "  DHI       IHD  ", "  DHI       IHD  ", "  DHI       IHD  ", "  DHI       IHD  ", "  DHI       IHD  ", "  AAA       AAA  ", "   AC       CA   ", "   AC       CA   ", "   AC       CA   ", "   A         A   ", "   A         A   ")
          .slice("AAAAAAABABAAAAAAA", "AAAD         DAAA", " AAA         AAA ", " AAA         AAA ", " AAA         AAA ", " AAAFF     FFAAA ", " AAA         AAA ", " AAA         AAA ", " AAA         AAA ", " AAAFF     FFAAA ", "  AA         AA  ", "  AA         AA  ", "  AA         AA  ", "  AA         AA  ", "  AAFF     FFAA  ", "  AAF       FAA  ", "  AAF       FAA  ", "   AF       FA   ", "   AFF     FFA   ", "                 ", "                 ", "                 ", "                 ", "                 ")
          .slice(" AAAAAABABAAAAAA ", " AAD         DAA ", " AAA         AAA ", "  AE         EA  ", "  AE         EA  ", "  AE         EA  ", "  AE         EA  ", "  AE         EA  ", "  AE         EA  ", "  AE         EA  ", "   A         A   ", "   A         A   ", "   A         A   ", "   A         A   ", "   C         C   ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ")
          .slice("  AAAAABABAAAAA  ", "  ADCC     CCDA  ", "     C     C     ", "     C     C     ", "     C     C     ", "     C     C     ", "     C     C     ", "     C     C     ", "     C     C     ", "     C     C     ", "     C     C     ", "     C     C     ", "     C     C     ", "     C     C     ", "   CCCCCCCCCCC   ", "     C     C     ", "     C     C     ", "     C     C     ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ")
          .slice("  AAAAABABAAAAA  ", "   ADD     DDA   ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ")
          .slice("   AAAAAAAAAAA   ", "    AADDDDDAA    ", "       JJJ       ", "       JJJ       ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ")
          .slice("    AAAAAAAAA    ", "      ABBBA      ", "       JJJ       ", "       JJJ       ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ")
          .slice("     AAAAAAA     ", "       JJJ       ", "       JKJ       ", "       JJJ       ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ", "                 ")
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


  public static final MultiblockMachineDefinition LIQUEFACTION_FURNACE = multiblock("liquefaction_furnace", CoilWorkableElectricMultiblockMachine::new)
      .rotationState(RotationState.ALL)
      .recipeType(LIQUEFACTION_FURNACE_RECIPES)
      .recipeModifiers(GTRecipeModifiers::ebfOverclock, GTRecipeModifiers.PARALLEL_HATCH, GTRecipeModifiers.BATCH_MODE)
      .appearanceBlock(GTBlocks.CASING_INVAR_HEATPROOF)
      .pattern(definition -> MultiblockPatternBuilder.start(FRONT, UP, RIGHT)
          .slice("AAAAA", " BBB ", " AAA ")
          .slice("AAAAA", "B#B#B", "ACCCA")
          .slice("AAAAA", "BBEBB", "ACFCA")
          .slice("AAAAA", "B#B#B", "ACCCA")
          .slice("AASAA", " BBB ", " AAA ")
          .where('B', heatingCoils())
          .where('C', blocks(GTBlocks.CASING_STEEL_SOLID.get()))
          .where('E', blocks(GTBlocks.CASING_STEEL_PIPE.get()))
          .where('A', blocks(GTBlocks.CASING_INVAR_HEATPROOF.get())
              .setMinGlobalLimited(20)
              .or(autoAbilities(definition.getRecipeTypes()))
              .or(abilities(MAINTENANCE).setExactLimit(1)))
          .where('F', abilities(PartAbility.MUFFLER))
          .where('S', controller(blocks(definition.getBlock())))
          .where('#', air())
          .where(' ', any())
          .build())
      .workableCasingModel(GTCEu.id("block/casings/solid/machine_casing_heatproof"), GTCEu.id("block/multiblock/multi_furnace"))
      .additionalDisplay((controller, components) -> {
        // spotless:off
        if (controller instanceof CoilWorkableElectricMultiblockMachine coilMachine && controller.isFormed()) {
          components.add(Component.translatable("gtceu.multiblock.blast_furnace.max_temperature",
              Component.translatable(
                      FormattingUtil.formatNumbers(coilMachine.getCoilType().getCoilTemperature() +
                          100L * Math.max(0, coilMachine.getTier() - GTValues.MV)) + "K")
                  .setStyle(Style.EMPTY.withColor(ChatFormatting.RED))));
        }
        // spotless:on
      })
      .register();

  public static final MultiblockMachineDefinition FUEL_REPROCESSOR = multiblock("fuel_reprocessor", WorkableElectricMultiblockMachine::new)
      .rotationState(RotationState.ALL)
      .recipeType(ISGRecipeTypes.FUEL_REPROCESSOR_RECIPES)
      .recipeModifiers(GTRecipeModifiers.PARALLEL_HATCH, OC_NON_PERFECT_SUBTICK, BATCH_MODE)
      .appearanceBlock(GCYMBlocks.CASING_ATOMIC)
      .pattern(definition -> MultiblockPatternBuilder.start(FRONT, UP, RIGHT)
          .slice("#XXX#", "XXCXX", "#XXX#")
          .slice("XXXXX", "XAPAX", "XXXXX")
          .slice("XXXXX", "CPRPC", "XXXXX")
          .slice("XXXXX", "XAPAX", "XXXXX")
          .slice("#XXX#", "XXSXX", "#XXX#")
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

  public static final MultiblockMachineDefinition DISSOLVING_TANK = multiblock("dissolving_tank", DissolvingTankMachine::new)
      .rotationState(RotationState.NON_Y_AXIS)
      .recipeTypes(ISGRecipeTypes.DISSOLUTION_TREATMENT_RECIPES)
      .appearanceBlock(GTBlocks.CASING_STAINLESS_CLEAN)
      .pattern(definition -> MultiblockPatternBuilder.start(FRONT, UP, RIGHT)
          .slice("X###X", "OOOOO", "XGGGX", "XGGGX", "#XXX#")
          .slice("#####", "OKKKO", "G###G", "G###G", "XXXXX")
          .slice("#####", "OKKKO", "G###G", "G###G", "XXXXX")
          .slice("#####", "OKKKO", "G###G", "G###G", "XXXXX")
          .slice("X###X", "OOSOO", "XGGGX", "XGGGX", "#XXX#")
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

  public static final MultiblockMachineDefinition LEACHING_PLANT = multiblock("leaching_plant", WorkableElectricMultiblockMachine::new)
      .rotationState(RotationState.NON_Y_AXIS)
      .recipeType(ISGRecipeTypes.LEACHING_PLANT_RECIPES)
      .recipeModifiers(ELECTRIC_OVERCLOCK.apply(OverclockingLogic.NON_PERFECT_OVERCLOCK), GTRecipeModifiers.PARALLEL_HATCH, BATCH_MODE)
      .appearanceBlock(CASING_STAINLESS_CLEAN)
      .pattern(definition -> MultiblockPatternBuilder.start()
          .slice("AAAAA", "AAAAA", "AAAAA")
          .slice("AAAAA", "ACCCA", "A   A")
          .slice("AAAAA", "ACCCA", "A   A")
          .slice("AAAAA", "AAAAA", "AAAAA")
          .slice("AAAAA", "ACCCA", "     ")
          .slice("AAAAA", "S   A", "     ")
          .slice("AAAAA", "AAAAA", "     ")
          .where('S', controller(blocks(definition.get())))
          .where('A', blocks(CASING_STAINLESS_CLEAN.get()).or(autoAbilities(definition.getRecipeTypes()))
              .or(autoAbilities(true, false, true)))
          .where('C', blocks(CASING_STEEL_PIPE.get()))
          .where(' ', any())
          .build())
      .workableCasingModel(GTCEu.id("block/casings/solid/machine_casing_clean_stainless_steel"), GTCEu.id("block/multiblock/generator/large_gas_turbine"))
      .register();

  public static final MultiblockMachineDefinition CHROMATIC_FLOTATION_PLANT = multiblock("chromatic_flotation_plant", WorkableElectricMultiblockMachine::new)
      .rotationState(RotationState.NON_Y_AXIS)
      .recipeType(ISGRecipeTypes.CHROMATIC_FLOTATION_PLANT_RECIPES)
      .recipeModifiers(ELECTRIC_OVERCLOCK.apply(OverclockingLogic.NON_PERFECT_OVERCLOCK),
          GTRecipeModifiers.PARALLEL_HATCH, GTRecipeModifiers.BATCH_MODE)
      .appearanceBlock(CASING_WATERTIGHT)
      .pattern(definition -> MultiblockPatternBuilder.start(FRONT, UP, RIGHT)
          .slice("AAAAAAA", "AAAAAAA", "AAAAAAA", "AAAAAAA", "AAAAAAA")
          .slice("AAAAAAA", "ABCBCBA", "ABBBBBA", "ABBBBBA", "ABBBBBA")
          .slice("AAAAAAA", "ABCBCBA", "ABBBBBA", "ABBBBBA", "ABBBBBA")
          .slice("AAAAAAA", "ABCBCBA", "ABBBBBA", "ABBBBBA", "ABBBBBA")
          .slice("AAAAAAA", "ABCBCBA", "ABBBBBA", "ABBBBBA", "ABBBBBA")
          .slice("AAAAAAA", "AACACAA", "AAAAAAA", "AAAAAAA", "AAAAAAA")
          .slice("       ", "  C C  ", "       ", "       ", "       ")
          .slice(" DDDDD ", " DCDCD ", " DDDDD ", "       ", "       ")
          .slice(" DDDDD ", " DEEED ", " DDDDD ", "       ", "       ")
          .slice(" DDDDD ", " DEEED ", " DDDDD ", "       ", "       ")
          .slice(" DDDDD ", " DDFDD ", " DDDDD ", "       ", "       ")
          .slice("       ", "       ", "       ", "       ", "       ")
          .where(' ', any())
          .where('F', controller(blocks(definition.getBlock())))
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

//  MultiblockMachineDefinition COMPONENT_ASSEMBLER = REGISTRATE.multiblock("component_assembler", TierCasingMultiblockMachine.createMachine(COMPONENT_ASSEMBLY_CASING_TIER))
//      .allRotation()
//      .tooltipsText("Can only run recipes up to IV tier", "只能运行IV及以下配方")
//      .recipe(ISGRecipeTypes.COMPONENT_ASSEMBLY_RECIPES)
//      .overclock()
//      .block(GTBlocks.CASING_STEEL_SOLID)
//      .pattern(definition -> FactoryBlockPattern.start()
//          .aisle("AaaaaaA", "ACDDDCA", "ACDDDCA", "ACDDDCA", "AAAAAAA")
//          .aisle("aAEEEAa", "FG   GF", "FG   GF", "FG   GF", "AACACAA")
//          .aisle("aAEEEAa", "FHI IHF", "FJI IJF", "FG   GF", "AACACAA")
//          .aisle("aAEEEAa", "FG   GF", "FG   GF", "FG   GF", "AACACAA")
//          .aisle("AaaBaaA", "ACDDDCA", "ACDDDCA", "ACDDDCA", "AAAAAAA")
//          .where('A', blocks(GTBlocks.CASING_STEEL_SOLID.get()))
//          .where('a', blocks(GTBlocks.CASING_STEEL_SOLID.get())
//              .or(autoAbilities(definition.getRecipeTypes()))
//              .or(abilities(MAINTENANCE).setExactLimit(1)))
//          .where('B', controller(blocks(definition.get())))
//          .where('C', blocks(GTBlocks.CASING_GRATE.get()))
//          .where('D', blocks(GTBlocks.CASING_TEMPERED_GLASS.get()))
//          .where('E', blocks(GTBlocks.STEEL_HULL.get()))
//          .where('F', GTEPredicates.tierBlock(CALMAP, COMPONENT_ASSEMBLY_CASING_TIER))
//          .where('G', blocks(GTEBlocks.MULTI_FUNCTIONAL_CASING.get()))
//          .where('H', blocks(TagPrefix.frameGt, GTMaterials.Steel))
//          .where('I', blocks(Blocks.IRON_BARS))
//          .where('J', blocks(GTBlocks.CASING_STEEL_GEARBOX.get()))
//          .where(' ', any())
//          .build())
//      .beforeWorking((m, r) -> ((ITierCasingMachine) m).getCasingTier(COMPONENT_ASSEMBLY_CASING_TIER) < GTValues.LuV)
//      .workableCasingRenderer(GTCEu.id("block/casings/solid/machine_casing_solid_steel"), GTCEu.id("block/multiblock/gcym/large_assembler"))
//      .register();


}
