package com.zircky.industrialsorcerygreg.data.recipe.misc.component;

import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.data.recipe.builder.GTRecipeBuilder;
import com.zircky.industrialsorcerygreg.api.data.tag.ISGTagPrefix;
import com.zircky.industrialsorcerygreg.data.recipe.ISGCraftingComponents;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTItems.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.*;
import static com.gregtechceu.gtceu.data.recipe.GTCraftingComponents.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.MarM200Steel;


public class ComponentRecipe {
  public static void init(Consumer<FinishedRecipe> provider) {
    recipeCompotent(provider);
  }

  public static void recipeCompotent(Consumer<FinishedRecipe> provider) {
    assembler(provider, LV, ChemicalHelper.get(gem, Quartzite).getItem(), ChemicalHelper.get(gem, EnderPearl).getItem(), Steel, Tin, SteelMagnetic, Copper, Rubber, Bronze, Tin, Brass, ManganesePhosphide);
    assembler(provider, MV, ChemicalHelper.get(gemFlawless, Emerald).getItem(), ChemicalHelper.get(gem, EnderEye).getItem(), Aluminium, Copper, SteelMagnetic, Cupronickel, Rubber, Steel, Bronze, Electrum, MagnesiumDiboride);
    assembler(provider, HV, ChemicalHelper.get(gem, EnderEye).getItem(), QUANTUM_EYE.asItem(), StainlessSteel, Silver, SteelMagnetic, Electrum, Rubber, VanadiumSteel, Steel, Chromium, MercuryBariumCalciumCuprate);
    assembler(provider, EV, QUANTUM_EYE.asItem(), ChemicalHelper.get(gem, NetherStar).getItem(), Titanium, Aluminium, NeodymiumMagnetic, Kanthal, SiliconeRubber, StainlessSteel, Aluminium, Platinum, UraniumTriplatinum);
    assembler(provider, IV, QUANTUM_STAR.asItem(), QUANTUM_STAR.asItem(), TungstenSteel, Tungsten, NeodymiumMagnetic, Graphene, SiliconeRubber, TungstenCarbide, Titanium, Iridium, SamariumIronArsenicOxide);

    assembly_line(provider, LuV, ChemicalHelper.get(pipeSmallFluid, NiobiumTitanium).getItem(), QUANTUM_STAR.asItem(), ChemicalHelper.get(rodLong, SamariumMagnetic).getItem(), HSSS, Ruridit, NiobiumTitanium, SolderingAlloy, Lubricant, HSSE, SiliconeRubber, HSSS, Palladium, Ruthenium, IndiumTinBariumTitaniumCuprate);
    assembly_line(provider, ZPM, ChemicalHelper.get(pipeNormalFluid, Polybenzimidazole).getItem(), QUANTUM_STAR.asItem(), ChemicalHelper.get(rodLong, SamariumMagnetic).getItem(), Osmiridium, Europium, VanadiumGallium, SolderingAlloy, Lubricant, MarM200Steel, StyreneButadieneRubber, NaquadahAlloy, Trinium, Duranium, UraniumRhodiumDinaquadide);
    assembly_line(provider, UV, ChemicalHelper.get(pipeLargeFluid, Naquadah).getItem(), GRAVI_STAR.asItem(), ChemicalHelper.get(rodLong, SamariumMagnetic).getItem(), Tritanium, Americium, YttriumBariumCuprate, SolderingAlloy, Lubricant, Naquadria, StyreneButadieneRubber, Tritanium, Naquadah, Tritanium, EnrichedNaquadahTriniumEuropiumDuranide);

  }

  private static void assembler(Consumer<FinishedRecipe> provider, int tier, Item emitter_gem, Item field_gem, Material... material) {
    ItemStack motor = (ItemStack) MOTOR.get(tier);
    ItemStack conveyor = (ItemStack) CONVEYOR.get(tier);
    ItemStack pump = (ItemStack) PUMP.get(tier);
    ItemStack piston = (ItemStack) PISTON.get(tier);
    ItemStack robot_arm = (ItemStack) ROBOT_ARM.get(tier);
    ItemStack emitter = (ItemStack) EMITTER.get(tier);
    ItemStack sensor = (ItemStack) SENSOR.get(tier);
    ItemStack field_generator = (ItemStack) FIELD_GENERATOR.get(tier);
    TagKey<ItemStack> circuit = (TagKey<ItemStack>) CIRCUIT.get(tier);
    ASSEMBLER_RECIPES.recipeBuilder(String.format("motor_%s", VN[tier].toLowerCase()))
        .inputItems(ISGTagPrefix.MOTOR_ENCLOSURE, material[0])
        .inputItems(rod, material[0], 2)
        .inputItems(rod, material[2])
        .inputItems(round, material[0], 4)
        .inputItems(wireGtDouble, material[3], 4)
        .inputItems(cableGtSingle, material[1], 2)
        .outputItems(motor)
        .duration(100).EUt(VA[tier - 1]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder(String.format("conveyor_%s", VN[tier].toLowerCase()))
        .inputItems(motor, 2)
        .inputItems(rod, material[0], 2)
        .inputItems(ring, material[0], 4)
        .inputItems(cableGtSingle, material[1], 2)
        .inputFluids(material[4], L * 6)
        .outputItems(conveyor)
        .duration(100).EUt(VA[tier - 1]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder(String.format("pump_%s", VN[tier].toLowerCase()))
        .inputItems(ISGTagPrefix.PUMP_BARREL, material[0])
        .inputItems(pipeNormalFluid, material[5])
        .inputItems(motor, 1)
        .inputItems(screw, material[6], 2)
        .inputItems(rotor, material[6])
        .inputItems(ring, material[4], 2)
        .inputItems(cableGtSingle, material[1], 2)
        .outputItems(pump)
        .duration(100).EUt(VA[tier - 1]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder(String.format("fluid_regulator_%s", VN[tier].toLowerCase()))
        .inputItems(pump)
        .inputItems(circuit, 2)
        .inputItems(ISGTagPrefix.CURVED_PLATE, material[0], 2)
        .circuitMeta(1)
        .outputItems(ISGCraftingComponents.FLUID_REGULATOR.get(tier))
        .EUt(VA[tier])
        .duration(100)
        .save(provider);

    ASSEMBLER_RECIPES.recipeBuilder(String.format("piston_%s", VN[tier].toLowerCase()))
        .inputItems(ISGTagPrefix.PISTON_HOUSING, material[0])
        .inputItems(rod, material[0], 2)
        .inputItems(cableGtSingle, material[1], 2)
        .inputItems(plate, material[0])
        .inputItems(gearSmall, material[0])
        .inputItems(motor)
        .outputItems(piston)
        .duration(100).EUt(VA[tier - 1]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder(String.format("arm_%s", VN[tier].toLowerCase()))
        .inputItems(cableGtSingle, material[1], 3)
        .inputItems(rod, material[0], 2)
        .inputItems(motor, 2)
        .inputItems(piston)
        .inputItems(circuit)
        .outputItems(robot_arm)
        .duration(100).EUt(VA[tier - 1]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder(String.format("emitter_%s", VN[tier].toLowerCase()))
        .inputItems(ISGTagPrefix.EMITTER_BASES, material[0])
        .inputItems(rod, material[7], 2)
        .inputItems(cableGtSingle, material[1], 2)
        .inputItems(circuit, 2)
        .inputItems(emitter_gem.asItem())
        .outputItems(emitter)
        .duration(100).EUt(VA[tier - 1]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder(String.format("sensor_%s", VN[tier].toLowerCase()))
        .inputItems(ISGTagPrefix.SENSOR_CASING, material[0])
        .inputItems(rod, material[7])
        .inputItems(cableGtSingle, material[1])
        .inputItems(circuit, 2)
        .inputItems(emitter_gem.asItem())
        .outputItems(sensor)
        .duration(100).EUt(VA[tier - 1]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder(String.format("field_generator_%s", VN[tier].toLowerCase()))
        .inputItems(ISGTagPrefix.FIELD_GENERATOR_CASING, material[0])
        .inputItems(emitter)
        .inputItems(field_gem.asItem())
        .inputItems(circuit, 2)
        .inputItems(wireGtQuadruple, material[8], 4)
        .outputItems(field_generator)
        .duration(100).EUt(VA[tier - 1]).save(provider);
  }

  private static void assembly_line(Consumer<FinishedRecipe> provider, int tier, Item pipe, Item emitter_gem, Item magnetic, Material... material) {
    int fluidMultiplier = getFluidMultiplier(tier);
    ItemStack motor = (ItemStack) MOTOR.get(tier);
    ItemStack conveyor = (ItemStack) CONVEYOR.get(tier);
    ItemStack pump = (ItemStack) PUMP.get(tier);
    ItemStack piston = (ItemStack) PISTON.get(tier);
    ItemStack robot_arm = (ItemStack) ROBOT_ARM.get(tier);
    ItemStack emitter = (ItemStack) EMITTER.get(tier);
    ItemStack sensor = (ItemStack) SENSOR.get(tier);
    ItemStack field_generator = (ItemStack) FIELD_GENERATOR.get(tier);
    ItemStack fluid_regulator = (ItemStack) ISGCraftingComponents.FLUID_REGULATOR.get(tier);
    TagKey<Item> circuit = (TagKey<Item>) CIRCUIT.get(tier);

    GTRecipeBuilder builder_motor = ASSEMBLY_LINE_RECIPES.recipeBuilder(String.format("motor_%s", VN[tier].toLowerCase()))
        .inputItems(ISGTagPrefix.MOTOR_ENCLOSURE, material[0])
        .inputItems(magnetic)
        .inputItems(rodLong, material[0], 4)
        .inputItems(ring, material[0], 4)
        .inputItems(round, material[0], 8)
        .inputFluids(material[3], L * fluidMultiplier)
        .inputFluids(material[4], 250 * fluidMultiplier)
        .inputFluids(material[5], L * fluidMultiplier)
        .outputItems(motor)
        .duration(600).EUt(VA[tier]);

    if (tier > ZPM) {
      builder_motor.inputItems(wireFine, material[1], 64)
          .inputItems(wireFine, material[1], 64)
          .inputItems(wireFine, material[1], 64)
          .inputItems(wireFine, material[1], 64)
          .stationResearch(b -> b
              .researchStack(((ItemStack) MOTOR.get(tier - 1)))
              .CWUt(1 << (tier - 3))
              .EUt(VA[tier - 1]));
    } else if (tier == ZPM) {
      builder_motor.inputItems(wireFine, material[1], 64)
          .inputItems(wireFine, material[1], 64)
          .scannerResearch(b -> b
              .researchStack(ELECTRIC_MOTOR_LuV.asItem().getDefaultInstance())
              .duration(1200)
              .EUt(VA[IV]));
    } else {
      builder_motor.inputItems(wireFine, material[1], 64)
          .scannerResearch(b -> b
              .researchStack(ELECTRIC_MOTOR_IV.asItem().getDefaultInstance())
              .duration(900)
              .EUt(VA[EV]));
    }
    builder_motor.inputItems(cableGtSingle, material[2], 2).save(provider);

    GTRecipeBuilder builder_conveyor = ASSEMBLY_LINE_RECIPES.recipeBuilder(String.format("conveyor_%s", VN[tier].toLowerCase()))
        .inputItems(motor, 2)
        .inputItems(plate, material[0], 2)
        .inputItems(ring, material[0], 4)
        .inputItems(round, material[0], 16)
        .inputItems(screw, material[0], 4)
        .inputItems(cableGtSingle, material[2], 2)
        .inputFluids(material[3], L * fluidMultiplier)
        .inputFluids(material[4], 250 * fluidMultiplier)
        .inputFluids(material[6], L * 8 * fluidMultiplier)
        .inputFluids(material[5], L * fluidMultiplier)
        .outputItems(conveyor)
        .duration(600).EUt(VA[tier]);

    if (tier > ZPM) {
      builder_conveyor.stationResearch(b -> b
          .researchStack(((ItemStack) CONVEYOR.get(tier - 1)))
          .CWUt(1 << (tier - 3))
          .EUt(VA[tier - 1]));
    } else if (tier == ZPM) {
      builder_conveyor.scannerResearch(b -> b
          .researchStack(CONVEYOR_MODULE_LuV.asItem().getDefaultInstance())
          .duration(1200)
          .EUt(VA[IV]));
    } else {
      builder_conveyor.scannerResearch(b -> b
          .researchStack(CONVEYOR_MODULE_IV.asItem().getDefaultInstance())
          .duration(900)
          .EUt(VA[EV]));
    }
    builder_conveyor.save(provider);

    GTRecipeBuilder builder_pump = ASSEMBLY_LINE_RECIPES.recipeBuilder(String.format("pump_%s", VN[tier].toLowerCase()))
        .inputItems(ISGTagPrefix.PUMP_BARREL, material[0])
        .inputItems(motor)
        .inputItems(pipe)
        .inputItems(screw, material[0], 8)
        .inputItems(rotor, material[0])
        .inputItems(cableGtSingle, material[2], 2)
        .inputFluids(material[3], L * fluidMultiplier)
        .inputFluids(material[4], 250 * fluidMultiplier)
        .inputFluids(material[6], L * fluidMultiplier)
        .inputFluids(material[5], L * fluidMultiplier)
        .outputItems(pump)
        .duration(600).EUt(VA[tier]);

    if (tier > ZPM) {
      builder_pump.stationResearch(b -> b
          .researchStack((ItemStack) PUMP.get(tier - 1))
          .CWUt(1 << (tier - 3))
          .EUt(VA[tier - 1]));
    } else if (tier == ZPM) {
      builder_pump.scannerResearch(b -> b
          .researchStack(ELECTRIC_PUMP_LuV.asStack())
          .duration(1200)
          .EUt(VA[IV]));
    } else {
      builder_pump.scannerResearch(b -> b
          .researchStack(ELECTRIC_PUMP_IV.asStack())
          .duration(900)
          .EUt(VA[EV]));
    }
    builder_pump.save(provider);

    ASSEMBLER_RECIPES.recipeBuilder(String.format("fluid_regulator_%s", VN[tier].toLowerCase()))
        .inputItems(pump)
        .inputItems(circuit, 2)
        .inputItems(ISGTagPrefix.CURVED_PLATE, material[0], 2)
        .circuitMeta(1)
        .outputItems(fluid_regulator)
        .EUt(VA[tier])
        .duration(100)
        .save(provider);

    GTRecipeBuilder builder_piston = ASSEMBLY_LINE_RECIPES.recipeBuilder(String.format("piston_%s", VN[tier].toLowerCase()))
        .inputItems(ISGTagPrefix.PISTON_HOUSING, material[0])
        .inputItems(motor)
        .inputItems(plate, material[0], 2)
        .inputItems(ring, material[0], 4)
        .inputItems(round, material[0], 16)
        .inputItems(rod, material[0], 4)
        .inputItems(gear, material[0])
        .inputItems(gearSmall, material[0], 2)
        .inputItems(cableGtSingle, material[2], 2)
        .inputFluids(material[3], L * fluidMultiplier)
        .inputFluids(material[4], 250 * fluidMultiplier)
        .inputFluids(material[5], L * fluidMultiplier)
        .outputItems(piston)
        .duration(600).EUt(VA[tier]);

    if (tier > ZPM) {
      builder_piston.stationResearch(b -> b
          .researchStack((ItemStack) PISTON.get(tier - 1))
          .CWUt(1 << (tier - 3))
          .EUt(VA[tier - 1]));
    } else if (tier == ZPM) {
      builder_piston.scannerResearch(b -> b
          .researchStack(ELECTRIC_PISTON_LuV.asStack())
          .duration(1200)
          .EUt(VA[IV]));
    } else {
      builder_piston.scannerResearch(b -> b
          .researchStack(ELECTRIC_PISTON_IV.asStack())
          .duration(900)
          .EUt(VA[EV]));
    }
    builder_piston.save(provider);

    GTRecipeBuilder builder_arm = ASSEMBLY_LINE_RECIPES.recipeBuilder(String.format("arm_%s", VN[tier].toLowerCase()))
        .inputItems(rodLong, material[0], 4)
        .inputItems(gear, material[0])
        .inputItems(gearSmall, material[0], 3)
        .inputItems(motor, 2)
        .inputItems(piston)
        .inputItems(circuit)
        .inputItems((TagKey<Item>) CIRCUIT.get(tier - 1), 2)
        .inputItems((TagKey<Item>) CIRCUIT.get(tier - 2), 4)
        .inputItems(cableGtSingle, material[2], 4)
        .inputFluids(material[3], L * 2 * fluidMultiplier)
        .inputFluids(material[4], 250 * fluidMultiplier)
        .inputFluids(material[5], L * fluidMultiplier)
        .outputItems(robot_arm)
        .duration(600).EUt(VA[tier]);

    if (tier > ZPM) {
      builder_arm.stationResearch(b -> b
          .researchStack((ItemStack) ROBOT_ARM.get(tier - 1))
          .CWUt(1 << (tier - 3))
          .EUt(VA[tier - 1]));
    } else if (tier == ZPM) {
      builder_arm.scannerResearch(b -> b
          .researchStack(ROBOT_ARM_LuV.asStack())
          .duration(1200)
          .EUt(VA[IV]));
    } else {
      builder_arm.scannerResearch(b -> b
          .researchStack(ROBOT_ARM_IV.asStack())
          .duration(900)
          .EUt(VA[EV]));
    }
    builder_arm.save(provider);

    GTRecipeBuilder builder_emitter = ASSEMBLY_LINE_RECIPES.recipeBuilder(String.format("emitter_%s", VN[tier].toLowerCase()))
        .inputItems(frameGt, material[7])
        .inputItems(ISGTagPrefix.EMITTER_BASES, material[0])
        .inputItems(motor)
        .inputItems(rodLong, material[0], 2)
        .inputItems(emitter_gem, 2)
        .inputItems(circuit, 2)
        .inputItems(foil, material[8], 64)
        .inputItems(foil, material[9], 64)
        .inputItems(cableGtSingle, material[2], 4)
        .inputFluids(material[3], L * 2 * fluidMultiplier)
        .inputFluids(material[5], L * fluidMultiplier)
        .outputItems(emitter)
        .duration(600).EUt(VA[tier]);

    if (tier > ZPM) {
      builder_emitter.stationResearch(b -> b
          .researchStack((ItemStack) EMITTER.get(tier - 1))
          .CWUt((int) ((1 << (tier - 3)) * 1.5))
          .EUt(VA[tier - 1]));
    } else if (tier == ZPM) {
      builder_emitter.stationResearch(b -> b
          .researchStack((ItemStack) EMITTER.get(ZPM - 1))
          .CWUt(1 << (tier - 4))
          .EUt(VA[tier - 1]));
    } else {
      builder_emitter.scannerResearch(b -> b
          .researchStack(EMITTER_IV.asStack())
          .duration(600)
          .EUt(VA[IV]));
    }
    builder_emitter.save(provider);

    GTRecipeBuilder builder_sensor = ASSEMBLY_LINE_RECIPES.recipeBuilder(String.format("sensor_%s", VN[tier].toLowerCase()))
        .inputItems(frameGt, material[7])
        .inputItems(ISGTagPrefix.SENSOR_CASING, material[0])
        .inputItems(motor)
        .inputItems(plate, material[0], 2)
        .inputItems(emitter_gem, 2)
        .inputItems(circuit, 2)
        .inputItems(foil, material[8], 64)
        .inputItems(foil, material[9], 64)
        .inputItems(cableGtSingle, material[2], 4)
        .inputFluids(material[3], L * 2 * fluidMultiplier)
        .inputFluids(material[5], L * fluidMultiplier)
        .outputItems(sensor)
        .duration(600).EUt(VA[tier]);

    if (tier > ZPM) {
      builder_sensor.stationResearch(b -> b
          .researchStack((ItemStack) SENSOR.get(tier - 1))
          .CWUt((int) ((1 << (tier - 3)) * 1.5))
          .EUt(VA[tier - 1]));
    } else if (tier == ZPM) {
      builder_sensor.stationResearch(b -> b
          .researchStack((ItemStack) SENSOR.get(ZPM - 1))
          .CWUt(1 << (tier - 4))
          .EUt(VA[tier - 1]));
    } else {
      builder_sensor.scannerResearch(b -> b
          .researchStack(SENSOR_IV.asStack())
          .duration(600)
          .EUt(VA[IV]));
    }
    builder_sensor.save(provider);

//    COMPONENT_ASSEMBLY_RECIPES.recipeBuilder(String.format("sensor_%s", VN[tier].toLowerCase()))
//        .circuitMeta(7)
//        .inputItems(motor, 12)
//        .inputItems(emitter_gem, 24)
//        .inputItems(circuit, 24)
//        .inputItems(cableGtSingle, material[2], 48)
//        .inputFluids(material[0], L * 78)
//        .inputFluids(material[3], L * 24 * fluidMultiplier)
//        .inputFluids(material[5], L * 12 * fluidMultiplier)
//        .inputFluids(material[7], L * 24)
//        .inputFluids(material[8], L * 192)
//        .inputFluids(material[9], L * 192)
//        .outputItems(sensor, 16)
//        .addData(COMPONENT_ASSEMBLY_CASING_TIER, tier)
//        .duration(2400).EUt(VA[tier]).save();

    GTRecipeBuilder builder_field_generator = ASSEMBLY_LINE_RECIPES.recipeBuilder(String.format("field_generator_%s", VN[tier].toLowerCase()))
        .inputItems(frameGt, material[7])
        .inputItems(ISGTagPrefix.FIELD_GENERATOR_CASING, material[0])
        .inputItems(emitter_gem)
        .inputItems(emitter, 2)
        .inputItems(circuit, 2)
        .inputItems(wireFine, material[10], 64)
        .inputItems(wireFine, material[10], 64)
        .inputItems(cableGtSingle, material[2], 4)
        .inputFluids(material[3], L * 2 * fluidMultiplier)
        .inputFluids(material[5], L * fluidMultiplier)
        .outputItems(field_generator)
        .duration(600).EUt(VA[tier]);

    if (tier > ZPM) {
      builder_field_generator.stationResearch(b -> b
          .researchStack((ItemStack) FIELD_GENERATOR.get(tier - 1))
          .CWUt((int) ((1 << (tier - 3)) * 1.5))
          .EUt(VA[tier - 1]));
    } else if (tier == ZPM) {
      builder_field_generator.stationResearch(b -> b
          .researchStack((ItemStack) FIELD_GENERATOR.get(ZPM - 1))
          .CWUt(1 << (tier - 4))
          .EUt(VA[tier - 1]));
    } else {
      builder_field_generator.scannerResearch(b -> b
          .researchStack(FIELD_GENERATOR_IV.asStack())
          .duration(600)
          .EUt(VA[IV]));
    }
    builder_field_generator.save(provider);

//    COMPONENT_ASSEMBLY_RECIPES.recipeBuilder(String.format("field_generator_%s", VN[tier].toLowerCase()))
//        .circuitMeta(8)
//        .inputItems(emitter, 24)
//        .inputItems(emitter_gem, 12)
//        .inputItems(circuit, 24)
//        .inputItems(cableGtSingle, material[2], 48)
//        .inputFluids(material[0], L * 96)
//        .inputFluids(material[3], L * 24 * fluidMultiplier)
//        .inputFluids(material[5], L * 12 * fluidMultiplier)
//        .inputFluids(material[7], L * 24)
//        .inputFluids(material[10], L * 384)
//        .outputItems(field_generator, 16)
//        .addData(COMPONENT_ASSEMBLY_CASING_TIER, tier)
//        .duration(2400).EUt(VA[tier]).save();
  }

  private static int getFluidMultiplier(int tier) {
    return switch (tier) {
      case 12, 13, 14, 15, 16 -> 16;
      case 9, 10, 11 -> 8;
      case 8, 7 -> 4;
      case 6 -> 2;
      default -> 1;
    };
  }
}
