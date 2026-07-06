package com.zircky.industrialsorcerygreg.data.recipe.generated;

import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.MaterialEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.machine.multiblock.CleanroomType;
import com.gregtechceu.gtceu.common.data.GTItems;
import com.gregtechceu.gtceu.config.ConfigHolder;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import com.gregtechceu.gtceu.data.recipe.builder.GTRecipeBuilder;
import com.zircky.industrialsorcerygreg.api.data.material.ISGMaterialFlags;
import com.zircky.industrialsorcerygreg.api.data.tag.ISGTagPrefix;
import com.zircky.industrialsorcerygreg.common.data.ISGItems;
import com.zircky.industrialsorcerygreg.common.data.ISGMaterials;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.*;
import static com.zircky.industrialsorcerygreg.api.data.material.ISGMaterialFlags.*;
import static com.zircky.industrialsorcerygreg.api.data.tag.ISGTagPrefix.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.*;

public class ISGPartsRecipeHandler {
  private ISGPartsRecipeHandler() {}


  public static void init(Consumer<FinishedRecipe> provider, @NotNull Material material) {

    processStick(provider, material);
    processLongStick(provider, material);

    processPlate(provider, material);
    processPlateDouble(provider, material);
    processPlateTriple(provider, material);
    processPlateQuadruple(provider, material);
    processPlateQuintuple(provider, material);
    processPlateDense(provider, material);
    processPlateSuperdense(provider, material);

    ISGMaterialRecipeHandler.run(provider, material);

//    processTurbine(provider, material);

    processRotor(provider, material);

    processBolt(provider, material);
    processScrew(provider, material);

    processFineWire(provider, material);

    processFoil(provider, material);

    processLens(provider, material);

    processGear(provider, gear, material);

    processGear(provider, gearSmall, material);

    processRing(provider, material);

    processSpringSmall(provider, material);

    processSpring(provider, material);

    processRound(provider, material);

    processManoswarm(provider, material);

    processcurvedPlate(provider, material);

    if (material.hasFlag(ISGMaterialFlags.GENERATE_COMPONENT)) {
      processMotorEnclosure(provider, material);
      processPumpBarrel(provider, material);
      processPistonHousing(provider, material);
      processEmitterBases(provider, material);
      processSensorCasing(provider, material);
      processFieldGeneratorCasing(provider, material);
    }

    processCatalyst(provider, material);

//    processroughBlank(provider, material);

//    processCrystallization(provider, material);
  }


  private static void processScrew(Consumer<FinishedRecipe> provider, Material material) {
    ItemStack screwStack = ChemicalHelper.get(TagPrefix.screw, material);
    if (screwStack.isEmpty()) return;
    int mass = (int) material.getMass();
    ItemStack stack = ChemicalHelper.get(bolt, material);
    LATHE_RECIPES.recipeBuilder("lathe_" + material.getName() + "_bolt_to_screw")
        .inputItems(stack)
        .outputItems(screwStack)
        .duration(Math.max(1, mass / 8))
        .EUt(4)
        .save(provider);

    if (mass < 240 && material.getBlastTemperature() < 3600)
      VanillaRecipeHelper.addShapedRecipe(provider, String.format("screw_%s", material.getName()), screwStack, "fX", "X ", 'X', stack);
  }

  private static void processFoil(Consumer<FinishedRecipe> provider, Material material) {
    ItemStack stack = ChemicalHelper.get(TagPrefix.foil, material, 4);
    if (stack.isEmpty()) return;
    int mass = (int) material.getMass();
    ItemStack stack1 = ChemicalHelper.get(TagPrefix.plate, material);
    if (!material.hasFlag(NO_SMASHING) && mass < 240 && material.getBlastTemperature() < 3600)
      VanillaRecipeHelper.addShapedRecipe(provider, String.format("foil_%s", material.getName()),
          stack.copyWithCount(2), "hP ", 'P', stack1);

    CLUSTER_RECIPES.recipeBuilder("bend_" + material.getName() + "_plate_to_foil")
        .inputItems(stack1)
        .outputItems(stack)
        .duration(mass)
        .EUt(24)
        .save(provider);

    if (material.hasFlag(NO_SMASHING)) {
      EXTRUDER_RECIPES.recipeBuilder("extrude_" + material.getName() + "_ingot_to_foil")
          .inputItems(ingot, material)
          .notConsumable(GTItems.SHAPE_EXTRUDER_FOIL)
          .outputItems(stack)
          .duration(mass)
          .EUt((long) getVoltageMultiplier(material) << 3)
          .save(provider);
    }
  }

  private static void processLens(Consumer<FinishedRecipe> provider, @NotNull Material material) {
    ItemStack stack = ChemicalHelper.get(lens, material);
    if (stack.isEmpty()) return;
    LATHE_RECIPES.recipeBuilder("lathe_" + material.getName() + "_plate_to_lens")
        .inputItems(plate, material)
        .outputItems(stack)
        .outputItems(dustSmall, material)
        .duration(1200).EUt(120).save(provider);

    if (!ChemicalHelper.get(gemExquisite, material).isEmpty()) {
      LATHE_RECIPES.recipeBuilder("lathe_" + material.getName() + "_gem_to_lens")
          .inputItems(gemExquisite, material)
          .outputItems(stack)
          .outputItems(dust, material, 2)
          .duration(2400).EUt(30).save(provider);
    }
  }

  private static void processFineWire(Consumer<FinishedRecipe> provider, Material material) {
    ItemStack fineWireStack = ChemicalHelper.get(TagPrefix.wireFine, material);
    if (fineWireStack.isEmpty()) return;
    int mass = (int) material.getMass();
    if (!ChemicalHelper.get(foil, material).isEmpty() && mass < 240 && material.getBlastTemperature() < 3600)
      VanillaRecipeHelper.addShapelessRecipe(provider, String.format("fine_wire_%s", material.getName()),
          fineWireStack, 'x', new MaterialEntry(foil, material));
    int voltageMultiplier = getVoltageMultiplier(material);
    if (material.hasProperty(PropertyKey.WIRE)) {
      WIREMILL_RECIPES.recipeBuilder("mill_" + material.getName() + "_wire_to_fine_wire")
          .inputItems(wireGtSingle, material)
          .outputItems(fineWireStack.copyWithCount(4))
          .duration(mass * 3 / 2)
          .EUt(voltageMultiplier)
          .save(provider);
    } else {
      WIREMILL_RECIPES.recipeBuilder("mill_" + material.getName() + "ingot_to_fine_wire")
          .inputItems(ingot, material)
          .outputItems(fineWireStack.copyWithCount(8))
          .duration(mass * 3)
          .EUt(voltageMultiplier)
          .save(provider);
    }
  }

  private static void processGear(Consumer<FinishedRecipe> provider, TagPrefix gearPrefix, Material material) {
    ItemStack stack = ChemicalHelper.get(gearPrefix, material);
    if (stack.isEmpty()) return;
    int mass = (int) material.getMass();
    if (gearPrefix == gear && material.hasProperty(PropertyKey.INGOT)) {
      int voltageMultiplier = getVoltageMultiplier(material);
      EXTRUDER_RECIPES.recipeBuilder("extrude_" + material.getName() + "_ingot_to_gear")
          .inputItems(ingot, material, 4)
          .notConsumable(GTItems.SHAPE_EXTRUDER_GEAR)
          .outputItems(gearPrefix, material)
          .duration(mass * 5)
          .EUt(8L * voltageMultiplier)
          .save(provider);

      if (material.hasFlag(NO_SMASHING)) {
        EXTRUDER_RECIPES.recipeBuilder("extrude_" + material.getName() + "_dust_to_gear")
            .inputItems(dust, material, 4)
            .notConsumable(GTItems.SHAPE_EXTRUDER_GEAR)
            .outputItems(gearPrefix, material)
            .duration(mass * 5)
            .EUt(8L * voltageMultiplier)
            .save(provider);
      }
    }

    if (material.hasFluid()) {
      boolean isSmall = gearPrefix == gearSmall;
      FLUID_SOLIDFICATION_RECIPES.recipeBuilder("solidify_" + material.getName() + "_" + gearPrefix.name)
          .notConsumable(isSmall ? GTItems.SHAPE_MOLD_GEAR_SMALL : GTItems.SHAPE_MOLD_GEAR)
          .inputFluids(material.getFluid(L * (isSmall ? 1 : 4)))
          .outputItems(stack)
          .duration(mass * (isSmall ? 2 : 8))
          .EUt(VA[LV])
          .save(provider);
    }

    if (material.hasFlag(GENERATE_PLATE) && material.hasFlag(GENERATE_ROD)) {
      if (gearPrefix == gearSmall) {
        if (mass < 240 && material.getBlastTemperature() < 3600)
          VanillaRecipeHelper.addShapedRecipe(provider, String.format("small_gear_%s", material.getName()),
              ChemicalHelper.get(gearSmall, material),
              " R ", "hPx", " R ", 'R', new MaterialEntry(rod, material), 'P',
              new MaterialEntry(plate, material));

        EXTRUDER_RECIPES.recipeBuilder("extrude_" + material.getName() + "_ingot_to_small_gear")
            .inputItems(ingot, material)
            .notConsumable(GTItems.SHAPE_EXTRUDER_GEAR_SMALL)
            .outputItems(stack)
            .duration(mass)
            .EUt((long) getVoltageMultiplier(material) << 3)
            .save(provider);

        if (material.hasFlag(NO_SMASHING)) {
          EXTRUDER_RECIPES.recipeBuilder("extrude_" + material.getName() + "_dust_to_small_gear")
              .inputItems(dust, material)
              .notConsumable(GTItems.SHAPE_EXTRUDER_GEAR_SMALL)
              .outputItems(stack)
              .duration(mass)
              .EUt((long) getVoltageMultiplier(material) << 3)
              .save(provider);
        }
      } else if (mass < 240 && material.getBlastTemperature() < 3600) {
        VanillaRecipeHelper.addShapedRecipe(provider, String.format("gear_%s", material.getName()), stack,
            "RPR", "PwP", "RPR",
            'P', new MaterialEntry(plate, material),
            'R', new MaterialEntry(rod, material));
      }
    }
  }

  private static void processPlate(Consumer<FinishedRecipe> provider, Material material) {
    ItemStack stack = ChemicalHelper.get(plate, material);
    if (stack.isEmpty()) return;
    if (material.hasFluid()) {
      FluidStack fluidStack = material.getProperty(PropertyKey.FLUID).solidifiesFrom(L);
      if (!fluidStack.isEmpty()) {
        FLUID_SOLIDFICATION_RECIPES.recipeBuilder("solidify_" + material.getName() + "_to_plate")
            .notConsumable(GTItems.SHAPE_MOLD_PLATE)
            .inputFluids(fluidStack)
            .outputItems(stack)
            .duration((int) material.getMass())
            .EUt(VA[ULV])
            .save(provider);
      }
    }
  }

  private static void processPlateDouble(Consumer<FinishedRecipe> provider, Material material) {
    ItemStack stack = ChemicalHelper.get(TagPrefix.plateDouble, material);
    if (stack.isEmpty()) return;
    int mass = (int) material.getMass();
    if (!material.hasFlag(NO_SMASHING) && mass < 240 && material.getBlastTemperature() < 2800) {
      VanillaRecipeHelper.addShapedRecipe(provider, String.format("plate_double_%s", material.getName()),
          stack, "h", "P", "P", 'P', new MaterialEntry(plate, material));
    }

    ROLLING_RECIPES.recipeBuilder("bend_" + material.getName() + "_plate_to_double_plate")
        .EUt(96).duration(mass << 1)
        .inputItems(ingot, material, 2)
        .outputItems(stack)
        .circuitMeta(2)
        .save(provider);
  }

  private static void processPlateTriple(@NotNull Consumer<FinishedRecipe> provider, @NotNull Material material) {
    ItemStack stack = ChemicalHelper.get(TagPrefix.plateDouble, material);
    if (stack.isEmpty()) return;
    int mass = (int) material.getMass();
    if (!material.shouldGenerateRecipesFor(triplePlate) || !material.hasProperty(PropertyKey.INGOT)){
      return;
    }

    var magMaterial = material.hasFlag(IS_MAGNETIC) ?
        material.getProperty(PropertyKey.INGOT).getMacerateInto() : material;
    if (material.hasFlag(GENERATE_PLATE)) {
      if (!material.hasFlag(NO_SMASHING) && mass < 240 && material.getBlastTemperature() < 2800) {
        VanillaRecipeHelper.addShapedRecipe(provider, String.format("%s_plates_to_triple_plate_1", material.getName()),
            ChemicalHelper.get(triplePlate, magMaterial),
            "h", "P", "D",
            'P', new MaterialEntry(plate, material),
            'D', new MaterialEntry(plateDouble,material)
        );
        VanillaRecipeHelper.addShapedRecipe(provider, String.format("%s_plates_to_triple_plate_2", material.getName()),
            ChemicalHelper.get(triplePlate, magMaterial),
            "h", "D", "P",
            'D', new MaterialEntry(plateDouble,material),
            'P', new MaterialEntry(plate, material)
        );
        if(material.hasFlag(GENERATE_TRIPLE_INGOT)) {
          VanillaRecipeHelper.addShapedRecipe(provider, String.format("%s_ingots_to_triple_plate", material.getName()),
              ChemicalHelper.get(triplePlate, magMaterial),
              "h", "I", "I",
              'I', new MaterialEntry(tripleIngot, material)
          );
        }

      }

      ROLLING_RECIPES.recipeBuilder("bend_" + material.getName() + "_ingot_to_triple_plate")
          .inputItems(ingot, material, 3)
          .circuitMeta(3)
          .outputItems(triplePlate, magMaterial)
          .duration((int) material.getMass() * 3)
          .EUt(96)
          .save(provider);

      if(material.hasFlag(GENERATE_TRIPLE_INGOT)){
        ROLLING_RECIPES.recipeBuilder("bend_" + material.getName() + "_triple_ingot_to_triple_plate")
            .EUt(96).duration((int) material.getMass() * 3)
            .inputItems(tripleIngot, material)
            .outputItems(triplePlate, magMaterial)
            .circuitMeta(1)
            .save(provider);

      }

    }
  }

  private static void processPlateQuadruple(@NotNull Consumer<FinishedRecipe> provider, @NotNull Material material) {
    int mass = (int) material.getMass();
    if (!material.shouldGenerateRecipesFor(quadruplePlate) || !material.hasProperty(PropertyKey.INGOT)){
      return;
    }

    var magMaterial = material.hasFlag(IS_MAGNETIC) ?
        material.getProperty(PropertyKey.INGOT).getMacerateInto() : material;
    if (material.hasFlag(GENERATE_PLATE)) {
      if (!material.hasFlag(NO_SMASHING) && mass < 240 && material.getBlastTemperature() < 2800) {

        VanillaRecipeHelper.addShapedRecipe(provider, String.format("%s_plates_to_quadruple_plate_1", material.getName()),
            ChemicalHelper.get(quadruplePlate, magMaterial),
            "h", "P", "D",
            'P', new MaterialEntry(plate, material),
            'D', new MaterialEntry(triplePlate,material)
        );

        VanillaRecipeHelper.addShapedRecipe(provider, String.format("%s_plates_to_quadruple_plate_2", material.getName()),
            ChemicalHelper.get(quadruplePlate, magMaterial),
            "h", "D", "P",
            'D', new MaterialEntry(triplePlate,material),
            'P', new MaterialEntry(plate, material)
        );

        VanillaRecipeHelper.addShapedRecipe(provider, String.format("%s_double_plates_to_quadruple_plate", material.getName()),
            ChemicalHelper.get(quadruplePlate, magMaterial),
            "h", "P", "P",
            'P', new MaterialEntry(plateDouble, material)
        );
        if(material.hasFlag(GENERATE_QUADRUPLE_INGOT)) {
          VanillaRecipeHelper.addShapedRecipe(provider, String.format("%s_ingots_to_quadruple_plate", material.getName()),
              ChemicalHelper.get(quadruplePlate, magMaterial),
              "h", "P", "P",
              'P', new MaterialEntry(quadrupleIngot, material)
          );
        }

      }

      ROLLING_RECIPES.recipeBuilder("bend_" + material.getName() + "_ingot_to_quadruple_plate")
          .inputItems(ingot, material, 4)
          .circuitMeta(4)
          .outputItems(quadruplePlate, magMaterial)
          .duration(mass * 4)
          .EUt(96)
          .save(provider);

      if(material.hasFlag(GENERATE_QUADRUPLE_PLATE)){
        ROLLING_RECIPES.recipeBuilder("bend_" + material.getName() + "_quadruple_ingot_to_quadruple_plate")
            .EUt(96).duration(mass * 4)
            .inputItems(quadrupleIngot, material)
            .outputItems(quadruplePlate, magMaterial)
            .circuitMeta(1)
            .save(provider);
        ROLLING_RECIPES.recipeBuilder("bend_" + material.getName() + "_double_ingots_to_quadruple_plate")
            .EUt(96).duration(mass * 4)
            .inputItems(doubleIngot, material,2)
            .outputItems(quadruplePlate, magMaterial)
            .circuitMeta(2)
            .save(provider);

      }
    }
  }

  private static void processPlateQuintuple(Consumer<FinishedRecipe> provider, @NotNull Material material) {
    ItemStack stack = ChemicalHelper.get(quintuplePlate, material);
    if (stack.isEmpty()) return;
    int mass = (int) material.getMass();
    if (!material.shouldGenerateRecipesFor(quintuplePlate) || !material.hasProperty(PropertyKey.INGOT)){
      return;
    }

    var magMaterial = material.hasFlag(IS_MAGNETIC) ?
        material.getProperty(PropertyKey.INGOT).getMacerateInto() : material;
    if (material.hasFlag(GENERATE_PLATE)) {
      if (!material.hasFlag(NO_SMASHING) && mass < 240 && material.getBlastTemperature() < 2800) {

        VanillaRecipeHelper.addShapedRecipe(provider, String.format("%s_plates_to_quintuple_plate_1", material.getName()),
            ChemicalHelper.get(quintuplePlate, magMaterial),
            "h", "P", "D",
            'P', new MaterialEntry(plate, material),
            'D', new MaterialEntry(quadruplePlate,material));
        VanillaRecipeHelper.addShapedRecipe(provider, String.format("%s_plates_to_quintuple_plate_2", material.getName()),
            ChemicalHelper.get(quintuplePlate, magMaterial),
            "h", "D", "P",
            'P', new MaterialEntry(plate, material),
            'D', new MaterialEntry(quadruplePlate,material));

        VanillaRecipeHelper.addShapedRecipe(provider, String.format("%s_double_plates_to_quintuple_plate_1", material.getName()),
            ChemicalHelper.get(quintuplePlate, magMaterial),
            "h", "P", "D",
            'P', new MaterialEntry(plateDouble, material),
            'D', new MaterialEntry(triplePlate,material));
        VanillaRecipeHelper.addShapedRecipe(provider, String.format("%s_double_plates_to_quintuple_plate_2", material.getName()),
            ChemicalHelper.get(quintuplePlate, magMaterial),
            "h", "D", "P",
            'P', new MaterialEntry(plateDouble, material),
            'D', new MaterialEntry(triplePlate,material));
        if(material.hasFlag(GENERATE_QUINTUPLE_INGOT)) {
          VanillaRecipeHelper.addShapedRecipe(provider, String.format("%s_ingots_to_quintuple_plate", material.getName()),
              ChemicalHelper.get(quadruplePlate, magMaterial),
              "h", "P", "P",
              'P', new MaterialEntry(quintupleIngot, material)
          );
        }
      }

      ROLLING_RECIPES.recipeBuilder("bend_" + material.getName() + "_ingot_to_quintuple_plate")
          .inputItems(ingot, material, 5)
          .circuitMeta(5)
          .outputItems(quintuplePlate, magMaterial)
          .duration(mass * 5)
          .EUt(96)
          .save(provider);

      if(material.hasFlag(GENERATE_QUINTUPLE_PLATE)){
        ROLLING_RECIPES.recipeBuilder("bend_" + material.getName() + "_quintuple_ingot_to_quintuple_plate")
            .EUt(96).duration(mass * 5)
            .inputItems(quintupleIngot, material)
            .outputItems(quintuplePlate, magMaterial)
            .circuitMeta(1)
            .save(provider);
      }
    }
  }

  private static void processPlateDense(Consumer<FinishedRecipe> provider, Material material) {
    if (!material.hasFlag(MaterialFlags.GENERATE_DENSE)) return;
    ItemStack stack = ChemicalHelper.get(TagPrefix.plateDense, material);
    if (stack.isEmpty()) return;
    int mass = (int) material.getMass();
    if (material.hasProperty(PropertyKey.INGOT)) {
      ROLLING_RECIPES.recipeBuilder("rolling_" + material.getName() + "_block_to_dense_plate")
          .inputItems(block, material)
          .outputItems(stack)
          .duration(mass * 11)
          .circuitMeta(9)
          .EUt(96)
          .save(provider);
    } else {
      ROLLING_RECIPES.recipeBuilder("rolling_" + material.getName() + "_plate_to_dense_plate")
          .inputItems(plate, material, 9)
          .outputItems(stack)
          .duration(mass * 11)
          .circuitMeta(9)
          .EUt(96)
          .save(provider);
    }
  }

  private static void processPlateSuperdense(Consumer<FinishedRecipe> provider, @NotNull Material material) {
    int mass = (int) material.getMass();
    if (!material.shouldGenerateRecipesFor(superdensePlate) || !material.hasProperty(PropertyKey.DUST)) {
      return;
    }

    var magMaterial = material.hasFlag(IS_MAGNETIC) && material.hasProperty(PropertyKey.INGOT) ?
        material.getProperty(PropertyKey.INGOT).getMacerateInto() : material;
    BENDER_RECIPES.recipeBuilder("bend_" + material.getName() + "_plate_to_superdense_plate")
        .inputItems(plate, material, 64)
        .circuitMeta(6)
        .outputItems(superdensePlate, magMaterial)
        .duration((int) Math.max(mass * 64L, 1L))
        .EUt(96)
        .save(provider);

    if (material.hasProperty(PropertyKey.INGOT)) {
      BENDER_RECIPES.recipeBuilder("bend_" + material.getName() + "_ingot_to_superdense_plate")
          .inputItems(ingot, material, 64)
          .circuitMeta(6)
          .outputItems(superdensePlate, magMaterial)
          .duration((int) Math.max(mass * 64L, 1L))
          .EUt(96)
          .save(provider);
    }
  }

  private static void processRing(Consumer<FinishedRecipe> provider, Material material) {
    ItemStack stack = ChemicalHelper.get(TagPrefix.ring, material, 4);
    if (stack.isEmpty()) return;
    int mass = (int) material.getMass();
    EXTRUDER_RECIPES.recipeBuilder("extrude_" + material.getName() + "_ingot_to_ring")
        .inputItems(ingot, material)
        .notConsumable(GTItems.SHAPE_EXTRUDER_RING)
        .outputItems(stack)
        .duration(mass << 1)
        .EUt(6L * getVoltageMultiplier(material))
        .save(provider);

    if (material.hasFlag(GENERATE_ROD)) {
      BENDER_RECIPES.recipeBuilder("bender_" + material.getName() + "_rod_to_ring")
          .inputItems(rod, material)
          .outputItems(stack.copyWithCount(2))
          .duration(mass)
          .EUt(16)
          .circuitMeta(2)
          .save(provider);
    }

    if (!material.hasFlag(NO_SMASHING)) {
      if (mass < 240 && material.getBlastTemperature() < 3600)
        VanillaRecipeHelper.addShapedRecipe(provider, String.format("ring_%s", material.getName()),
            stack.copyWithCount(1),
            "h ", " X",
            'X', new MaterialEntry(rod, material));
    } else {
      EXTRUDER_RECIPES.recipeBuilder("extrude_" + material.getName() + "_dust_to_ring")
          .inputItems(dust, material)
          .notConsumable(GTItems.SHAPE_EXTRUDER_RING)
          .outputItems(stack)
          .duration(mass << 1)
          .EUt(6L * getVoltageMultiplier(material))
          .save(provider);
    }
  }

  private static void processSpringSmall(Consumer<FinishedRecipe> provider, Material material) {
    ItemStack springstack = ChemicalHelper.get(TagPrefix.springSmall, material);
    if (springstack.isEmpty()) return;
    int mass = (int) material.getMass();
    ItemStack stack = ChemicalHelper.get(rod, material);
    if (mass < 240 && material.getBlastTemperature() < 3600)
      VanillaRecipeHelper.addShapedRecipe(provider, String.format("spring_small_%s", material.getName()),
          springstack,
          " s ", "fRx", 'R', stack);

    BENDER_RECIPES.recipeBuilder("bend_" + material.getName() + "_rod_to_small_spring")
        .duration(Math.max(1, mass / 2)).EUt(VA[ULV])
        .inputItems(stack)
        .outputItems(springstack.copyWithCount(2))
        .circuitMeta(1)
        .save(provider);
  }

  private static void processSpring(Consumer<FinishedRecipe> provider, Material material) {
    ItemStack springstack = ChemicalHelper.get(TagPrefix.spring, material);
    if (springstack.isEmpty()) return;
    int mass = (int) material.getMass();
    ItemStack stack = ChemicalHelper.get(rodLong, material);
    BENDER_RECIPES.recipeBuilder(material.getName() + "_long_rod_to_spring")
        .inputItems(stack)
        .outputItems(springstack)
        .circuitMeta(1)
        .duration(mass)
        .EUt(16)
        .save(provider);

    if (mass < 240 && material.getBlastTemperature() < 3600)
      VanillaRecipeHelper.addShapedRecipe(provider, String.format("spring_%s", material.getName()),
          springstack, " s ", "fRx", " R ", 'R', stack);
  }

  private static void processRotor(Consumer<FinishedRecipe> provider, Material material) {
    ItemStack stack = ChemicalHelper.get(TagPrefix.rotor, material);
    if (stack.isEmpty()) return;
    int mass = (int) material.getMass();
    ItemStack curvedPlateStack = ChemicalHelper.get(ISGTagPrefix.CURVED_PLATE, material);
    ItemStack ringStack = ChemicalHelper.get(ring, material);
    if (mass < 240 && material.getBlastTemperature() < 3600)
      VanillaRecipeHelper.addShapedRecipe(provider, String.format("rotor_%s", material.getName()), stack,
          "ChC", "SRf", "CdC",
          'C', curvedPlateStack,
          'S', new MaterialEntry(screw, material),
          'R', ringStack);

    if (material.hasFluid()) {
      FLUID_SOLIDFICATION_RECIPES.recipeBuilder("solidify_" + material.getName() + "_to_rotor")
          .notConsumable(GTItems.SHAPE_MOLD_ROTOR)
          .inputFluids(material.getFluid(L * 5))
          .outputItems(stack)
          .duration(mass * 6)
          .EUt(VA[LV])
          .save(provider);
    }

    EXTRUDER_RECIPES.recipeBuilder("extrude_" + material.getName() + "_ingot_to_rotor")
        .inputItems(ingot, material, 5)
        .notConsumable(GTItems.SHAPE_EXTRUDER_ROTOR)
        .outputItems(stack)
        .duration(mass << 2)
        .EUt((long) getVoltageMultiplier(material) << 3)
        .save(provider);

    LASER_WELDER_RECIPES.recipeBuilder(material.getName() + "_to_rotor")
        .inputItems(curvedPlateStack.copyWithCount(4))
        .inputItems(ringStack)
        .circuitMeta(1)
        .outputItems(stack)
        .duration(mass)
        .EUt(30)
        .save(provider);

    if (material.hasFlag(NO_SMASHING)) {
      EXTRUDER_RECIPES.recipeBuilder("extrude_" + material.getName() + "_dust_to_rotor")
          .inputItems(dust, material, 5)
          .notConsumable(GTItems.SHAPE_EXTRUDER_ROTOR)
          .outputItems(stack)
          .duration(mass << 2)
          .EUt((long) getVoltageMultiplier(material) << 3)
          .save(provider);
    }
  }

  private static void processBolt(Consumer<FinishedRecipe> provider, @NotNull Material material) {
    if (!material.shouldGenerateRecipesFor(bolt)) {
      return;
    }

    ItemStack boltStack = ChemicalHelper.get(bolt,
        material.hasFlag(IS_MAGNETIC) && material.hasProperty(PropertyKey.INGOT) ?
            material.getProperty(PropertyKey.INGOT).getMacerateInto() : material,
        8);
    ItemStack ingotStack = ChemicalHelper.get(ingot, material);

    CUTTER_RECIPES.recipeBuilder("cut_" + material.getName() + "_screw_to_bolt")
        .inputItems(screw, material)
        .outputItems(boltStack.copyWithCount(1))
        .duration(20)
        .EUt(24)
        .save(provider);

    if (!boltStack.isEmpty() && !ingotStack.isEmpty()) {
      EXTRUDER_RECIPES.recipeBuilder("extrude_" + material.getName() + "_ingot_to_bolt")
          .inputItems(ingot, material)
          .notConsumable(GTItems.SHAPE_EXTRUDER_BOLT)
          .outputItems(boltStack)
          .duration(15)
          .EUt((long) getVoltageMultiplier(material) << 2)
          .save(provider);

      if (material.hasFlag(NO_SMASHING)) {
        EXTRUDER_RECIPES.recipeBuilder("extrude_" + material.getName() + "_dust_to_bolt")
            .inputItems(dust, material)
            .notConsumable(GTItems.SHAPE_EXTRUDER_BOLT)
            .outputItems(boltStack)
            .duration(15)
            .EUt((long) getVoltageMultiplier(material) << 2)
            .save(provider);
      }
    }
  }

  private static void processStick(Consumer<FinishedRecipe> provider, Material material) {
    ItemStack stack = ChemicalHelper.get(rod, material);
    if (stack.isEmpty()) return;
    int mass = (int) material.getMass();
    if (material.hasProperty(PropertyKey.GEM) || material.hasProperty(PropertyKey.INGOT)) {
      LATHE_RECIPES.recipeBuilder("lathe_" + material.getName() + "_to_rod")
          .inputItems(material.hasProperty(PropertyKey.GEM) ? gem : ingot, material)
          .outputItems(stack.copyWithCount(2))
          .duration(mass << 1)
          .EUt(getVoltageMultiplier(material)).save(provider);
    }

    if (material.hasFlag(GENERATE_BOLT_SCREW)) {
      ItemStack boltStack = ChemicalHelper.get(bolt, material, 4);
      CUTTER_RECIPES.recipeBuilder("cut_" + material.getName() + "_rod_to_bolt")
          .inputItems(stack)
          .outputItems(boltStack)
          .duration(mass << 1)
          .EUt(4)
          .save(provider);

      if (mass < 240 && material.getBlastTemperature() < 3600)
        VanillaRecipeHelper.addShapedRecipe(provider, String.format("bolt_saw_%s", material.getName()), boltStack.copyWithCount(2), "s ", " X", 'X', stack);
    }
  }

  private static void processLongStick(Consumer<FinishedRecipe> provider, Material material) {
    ItemStack stack = ChemicalHelper.get(TagPrefix.rodLong, material);
    if (stack.isEmpty()) return;
    ItemStack stickStack = ChemicalHelper.get(rod, material, 2);
    int mass = (int) material.getMass();
    GTRecipeBuilder builder = CUTTER_RECIPES.recipeBuilder("cut_" + material.getName() + "_long_rod_to_rod")
        .inputItems(stack)
        .duration(mass).EUt(4);
    if (ConfigHolder.INSTANCE.recipes.harderRods) {
      builder.outputItems(stickStack.copyWithCount(1));
      builder.outputItems(dustSmall, material, 2);
    } else {
      builder.outputItems(stickStack);
    }
    builder.save(provider);

    if (mass < 240 && material.getBlastTemperature() < 3600)
      VanillaRecipeHelper.addShapedRecipe(provider, String.format("stick_long_%s", material.getName()), stickStack, "s", "X", 'X', stack);

    if (mass < 240 && material.getBlastTemperature() < 3600)
      VanillaRecipeHelper.addShapedRecipe(provider, String.format("stick_long_stick_%s", material.getName()), stack, "ShS", 'S', stickStack.copyWithCount(1));

    if (!material.hasProperty(PropertyKey.WOOD)) {
      LASER_WELDER_RECIPES.recipeBuilder(material.getName() + "_rod_to_long_rod")
          .inputItems(stickStack)
          .circuitMeta(2)
          .outputItems(stack)
          .duration(mass)
          .EUt(16)
          .save(provider);

      if (material.hasProperty(PropertyKey.INGOT)) {
        EXTRUDER_RECIPES.recipeBuilder("extrude_" + material.getName() + "_ingot_to_long_rod")
            .inputItems(ingot, material)
            .notConsumable(ISGItems.SHAPE_EXTRUDER_ROD_LONG)
            .outputItems(stack)
            .duration(mass)
            .EUt((long) getVoltageMultiplier(material) << 3)
            .save(provider);

        if (material.hasFlag(NO_SMASHING)) {
          EXTRUDER_RECIPES.recipeBuilder("extrude_" + material.getName() + "_dust_to_long_rod")
              .inputItems(dust, material)
              .notConsumable(ISGItems.SHAPE_EXTRUDER_ROD_LONG)
              .outputItems(stack)
              .duration(mass)
              .EUt((long) getVoltageMultiplier(material) << 3)
              .save(provider);
        }
      }
    } else {
      EXTRUDER_RECIPES.recipeBuilder("extrude_" + material.getName() + "_dust_to_long_rod")
          .inputItems(dust, material)
          .notConsumable(ISGItems.SHAPE_EXTRUDER_ROD_LONG)
          .outputItems(stack)
          .duration(mass)
          .EUt((long) getVoltageMultiplier(material) << 3)
          .save(provider);
    }
  }

//  private static void processTurbine(Consumer<FinishedRecipe> provider, Material material) {
//    ItemStack stack = ChemicalHelper.get(turbineBlade, material);
//    if (stack.isEmpty()) return;
//    int mass = (int) material.getMass();
//
//    ASSEMBLER_RECIPES.recipeBuilder("assemble_" + material.getName() + "_turbine_blade")
//        .inputItems(stack.copyWithCount(8))
//        .inputItems(rodLong, GTMaterials.Magnalium)
//        .outputItems(tur, material)
//        .duration(200)
//        .EUt(400)
//        .save();
//
//    MACERATOR_RECIPES.recipeBuilder("macerate_" + material.getName() + "_turbine_blade")
//        .inputItems(turbineRotor, material)
//        .outputItems(dustSmall, material, 2)
//        .duration(mass << 4)
//        .category(GTRecipeCategories.MACERATOR_RECYCLING)
//        .EUt(30)
//        .save();
//
//    MACERATOR_RECIPES.recipeBuilder("macerate_" + material.getName() + "_turbine_blade_coated")
//        .inputItems(turbineRotorCoated, material)
//        .outputItems(dustSmall, material, 2)
//        .duration(mass << 4)
//        .category(GTRecipeCategories.MACERATOR_RECYCLING)
//        .EUt(30)
//        .save();
//
//    FORMING_PRESS_RECIPES.recipeBuilder("press_" + material.getName() + "_turbine_rotor")
//        .inputItems(plateDouble, material, 5)
//        .inputItems(screw, material, 2)
//        .outputItems(stack)
//        .duration(mass << 4)
//        .EUt((long) getVoltageMultiplier(material) << 2)
//        .save(provider);
//
//    rotors.forEach(plating -> {
//      if (plating == material) return;
//      ItemStack rotorStack = ChemicalHelper.get(TagPrefix.turbineRotorCoated, material);
//      CoatedTurbineRotorBehaviour.setCoatMaterial(rotorStack, plating);
//      boolean isMagic = plating.hasFlag(MAGICAL);
//      Material electrolyteMaterial = isMagic ? GTOMaterials.PhantomicElectrolyteBuffer : GTOMaterials.ChromicAcid;
//      Material wasteMaterial = isMagic ? GTOMaterials.Aether : GTOMaterials.ChromicAcidWaste;
//      ELECTROPLATING_RECIPES.recipeBuilder("electroplate_%s_%s_turbine_rotor".formatted(material.getName(), plating.getName()))
//          .inputItems(turbineRotor, material)
//          .inputItems(plateDouble, plating, 5)
//          .inputFluids(DistilledWater, 1000)
//          .inputFluids(electrolyteMaterial, 250)
//          .outputItems(rotorStack)
//          .outputFluids(wasteMaterial.getFluid(1000))
//          .category(GTORecipeCategories.ROTOR_PLATING)
//          .duration((int) ((plating.getMass() << 4) + (material.getMass() << 4) / 2))
//          .EUt(480)
//          .save();
//    });
//  }

  private static void processRound(Consumer<FinishedRecipe> provider, Material material) {
    ItemStack stack1 = ChemicalHelper.get(round, material);
    if (stack1.isEmpty()) return;
    ItemStack stack = ChemicalHelper.get(nugget, material);
    if (!material.hasFlag(NO_SMASHING) && material.getMass() < 222 && material.getBlastTemperature() < 6000) {
      VanillaRecipeHelper.addShapedRecipe(provider, String.format("round_%s", material.getName()),
          stack1, "fN", "Nh", 'N', stack);

      VanillaRecipeHelper.addShapedRecipe(provider, String.format("round_from_ingot_%s", material.getName()),
          stack1.copyWithCount(4), "fIh", 'I', new MaterialEntry(ingot, material));
    }

    LATHE_RECIPES.recipeBuilder("lathe_" + material.getName() + "_nugget_to_round")
        .EUt(getVoltageMultiplier(material))
        .duration(Math.max(1, (int) material.getMass() / 9))
        .inputItems(stack)
        .outputItems(stack1)
        .save(provider);
  }

  private static void processManoswarm(Consumer<FinishedRecipe> provider, Material material) {
    ItemStack stack = ChemicalHelper.get(NANITES, material);
    if (stack.isEmpty()) return;
    CHEMICAL_BATH_RECIPES.recipeBuilder(material.getName() + "_nano_bath")
        .inputFluids(ISGMaterials.PiranhaSolution.getFluid((int) (10000 * Math.sqrt((double) material.getMass() / ISGMaterials.Eternity.getMass()))))
        .inputItems(CONTAMINABLE_NANITES, material)
        .outputItems(stack)
        .duration((int) material.getMass() << 4)
        .EUt(480)
        .cleanroom(CleanroomType.CLEANROOM)
        .save(provider);
  }

  private static void processcurvedPlate(Consumer<FinishedRecipe> provider, @NotNull Material material) {
    ItemStack stack = ChemicalHelper.get(CURVED_PLATE, material);
    if (stack.isEmpty()) return;
    int mass = (int) material.getMass();
    ItemStack plateStack = ChemicalHelper.get(plate, material);
    if (mass < 240 && material.getBlastTemperature() < 3600)
      VanillaRecipeHelper.addShapedRecipe(provider, String.format("curved_plate_%s", material.getName()),
          stack, "hI", " h", 'I', plateStack);

    BENDER_RECIPES.recipeBuilder(material.getName() + "_curved_plate")
        .inputItems(plateStack)
        .outputItems(stack)
        .circuitMeta(30)
        .duration(mass)
        .EUt(16)
        .save(provider);
  }

  private static void processMotorEnclosure(Consumer<FinishedRecipe> provider, @NotNull Material material) {
    int mass = (int) material.getMass();
    ItemStack motorEnclosureStack = ChemicalHelper.get(MOTOR_ENCLOSURE, material);
    ItemStack curvedPlateStack = ChemicalHelper.get(CURVED_PLATE, material);
    ItemStack ringStack = ChemicalHelper.get(ring, material);
    if (mass < 240 && material.getBlastTemperature() < 3600)
      VanillaRecipeHelper.addShapedRecipe(provider, String.format("motor_enclosure_%s", material.getName()),
          motorEnclosureStack, "SwS", "IRI", " h ", 'I', curvedPlateStack, 'S', new MaterialEntry(screw, material), 'R', ringStack);

    ASSEMBLER_RECIPES.recipeBuilder(material.getName() + "_motor_enclosure")
        .inputItems(curvedPlateStack.copyWithCount(2))
        .inputItems(ringStack)
        .outputItems(motorEnclosureStack)
        .circuitMeta(3)
        .duration(mass)
        .EUt(30)
        .save(provider);

  }

  private static void processPumpBarrel(Consumer<FinishedRecipe> provider, Material material) {
    int mass = (int) material.getMass();
    ItemStack pumpBarrelStack = ChemicalHelper.get(PUMP_BARREL, material);
    ItemStack curvedPlateStack = ChemicalHelper.get(CURVED_PLATE, material);
    ItemStack ringStack = ChemicalHelper.get(ring, material);
    if (mass < 240 && material.getBlastTemperature() < 3600)
      VanillaRecipeHelper.addShapedRecipe(provider, String.format("pump_barrel_%s", material.getName()),
          pumpBarrelStack, "wIw", "ShS", "RIR", 'I', curvedPlateStack, 'R', ringStack, 'S', new MaterialEntry(screw, material));

    ASSEMBLER_RECIPES.recipeBuilder(material.getName() + "_pump_barrel")
        .inputItems(curvedPlateStack.copyWithCount(2))
        .inputItems(ringStack.copyWithCount(2))
        .circuitMeta(4)
        .outputItems(pumpBarrelStack)
        .duration(mass)
        .EUt(30)
        .save(provider);
  }

  private static void processPistonHousing(Consumer<FinishedRecipe> provider, Material material) {
    int mass = (int) material.getMass();
    ItemStack pistonHousingStack = ChemicalHelper.get(PISTON_HOUSING, material);
    ItemStack curvedPlateStack = ChemicalHelper.get(CURVED_PLATE, material);
    ItemStack plateStack = ChemicalHelper.get(plate, material);
    if (mass < 240 && material.getBlastTemperature() < 3600)
      VanillaRecipeHelper.addShapedRecipe(provider, String.format("piston_housing_%s", material.getName()),
          pistonHousingStack, "IhI", "SPS", "whw", 'I', curvedPlateStack, 'P', plateStack, 'S', new MaterialEntry(screw, material));

    ASSEMBLER_RECIPES.recipeBuilder(material.getName() + "_piston_housing")
        .inputItems(curvedPlateStack.copyWithCount(2))
        .inputItems(plateStack)
        .circuitMeta(5)
        .outputItems(pistonHousingStack)
        .duration(mass)
        .EUt(30)
        .save(provider);
  }

  private static void processEmitterBases(Consumer<FinishedRecipe> provider, Material material) {
    int mass = (int) material.getMass();
    ItemStack emitterBasesStack = ChemicalHelper.get(EMITTER_BASES, material);
    ItemStack curvedPlateStack = ChemicalHelper.get(CURVED_PLATE, material);
    ItemStack plateStack = ChemicalHelper.get(plate, material);
    ItemStack rodStack = ChemicalHelper.get(rod, material);
    if (mass < 240 && material.getBlastTemperature() < 3600)
      VanillaRecipeHelper.addShapedRecipe(provider, String.format("emitter_base_%s", material.getName()),
          emitterBasesStack, "SwS", "IPI", "RhR", 'I', curvedPlateStack, 'P', plateStack, 'R', rodStack, 'S', new MaterialEntry(screw, material));

    ASSEMBLER_RECIPES.recipeBuilder(material.getName() + "_emitter_base")
        .inputItems(curvedPlateStack.copyWithCount(2))
        .inputItems(rodStack.copyWithCount(2))
        .inputItems(plateStack)
        .outputItems(emitterBasesStack)
        .duration(mass)
        .EUt(30)
        .save(provider);
  }

  private static void processSensorCasing(Consumer<FinishedRecipe> provider, Material material) {
    int mass = (int) material.getMass();
    ItemStack sensorCasingStack = ChemicalHelper.get(SENSOR_CASING, material);
    ItemStack curvedPlateStack = ChemicalHelper.get(CURVED_PLATE, material);
    ItemStack rodStack = ChemicalHelper.get(rod, material);
    if (mass < 240 && material.getBlastTemperature() < 3600)
      VanillaRecipeHelper.addShapedRecipe(provider, String.format("sensor_casing_%s", material.getName()),
          sensorCasingStack, "wIh", "IRI", "SIS", 'I', curvedPlateStack, 'R', rodStack, 'S', new MaterialEntry(screw, material));

    ASSEMBLER_RECIPES.recipeBuilder(material.getName() + "_sensor_casing")
        .inputItems(curvedPlateStack.copyWithCount(4))
        .inputItems(rodStack.copyWithCount(1))
        .circuitMeta(6)
        .outputItems(sensorCasingStack)
        .duration(mass)
        .EUt(30)
        .save(provider);
  }

  private static void processFieldGeneratorCasing(Consumer<FinishedRecipe> provider, Material material) {
    int mass = (int) material.getMass();
    ItemStack fieldGeneratorCasingStack = ChemicalHelper.get(FIELD_GENERATOR_CASING, material);
    ItemStack curvedPlateStack = ChemicalHelper.get(CURVED_PLATE, material);
    ItemStack plateStack = ChemicalHelper.get(plate, material);
    if (mass < 240 && material.getBlastTemperature() < 3600)
      VanillaRecipeHelper.addShapedRecipe(provider, String.format("field_generator_casing_%s", material.getName()),
          fieldGeneratorCasingStack, "IPI", "PwP", "IPI", 'I', curvedPlateStack, 'P', plateStack);

    ASSEMBLER_RECIPES.recipeBuilder(material.getName() + "_field_generator_casing")
        .inputItems(curvedPlateStack.copyWithCount(4))
        .inputItems(plateStack.copyWithCount(4))
        .circuitMeta(7)
        .outputItems(fieldGeneratorCasingStack)
        .duration(mass)
        .EUt(30)
        .save(provider);
  }

  private static void processCatalyst(Consumer<FinishedRecipe> provider, Material material) {
    ItemStack stack = ChemicalHelper.get(CATALYST, material);
    if (stack.isEmpty()) return;
    ASSEMBLER_RECIPES.recipeBuilder(material.getName() + "_catalyst")
        .inputItems(ISGItems.CATALYST_BASE)
        .inputItems(dust, material, 16)
        .outputItems(stack)
        .duration((int) material.getMass() << 2)
        .EUt(120)
        .cleanroom(CleanroomType.CLEANROOM)
        .save(provider);
  }

//  private static void processroughBlank(Consumer<FinishedRecipe> provider, Material material) {
//    ItemStack stack2 = ChemicalHelper.get(BRICK, material);
//    if (stack2.isEmpty()) return;
//    ItemStack stack = ChemicalHelper.get(ROUGH_BLANK, material);
//    ItemStack stack1 = ChemicalHelper.get(block, material);
//    SINTERING_FURNACE_RECIPES.recipeBuilder(material.getName() + "_rough_blank")
//        .inputItems(stack)
//        .outputItems(stack1)
//        .duration(400)
//        .EUt(120)
//        .blastFurnaceTemp(material.getBlastTemperature())
//        .save();
//
//    CUTTER_RECIPES.recipeBuilder(material.getName() + "_brick")
//        .inputItems(stack1)
//        .outputItems(stack2.copyWithCount(9))
//        .duration(300)
//        .EUt(120)
//        .save(provider);
//
//    CUTTER_RECIPES.recipeBuilder(material.getName() + "_flakes")
//        .inputItems(stack2)
//        .outputItems(FLAKES, material, 4)
//        .duration(200)
//        .EUt(30)
//        .save(provider);
//  }

//  private static void processCrystallization(Consumer<FinishedRecipe> provider, Material material) {
//    ItemStack stack = ChemicalHelper.get(CRYSTAL_SEED, material, 2);
//    ItemStack stack1 = ChemicalHelper.get(gemExquisite, material);
//    if (stack1.isEmpty()) return;
//    CUTTER_RECIPES.recipeBuilder("%s_gem".formatted(material.getName()))
//        .inputItems(ARTIFICIAL_GEM, material)
//        .outputItems(stack1)
//        .outputItems(stack)
//        .duration((int) (material.getMass() << 1))
//        .EUt(16)
//        .save(provider);
//
//    AUTOCLAVE_RECIPES.recipeBuilder("%s_seed".formatted(material.getName()))
//        .inputItems(stack1)
//        .inputFluids(DistilledWater.getFluid(800))
//        .outputItems(stack)
//        .duration((int) (material.getMass() << 2))
//        .EUt(7)
//        .save(provider);
//  }

  private static int getVoltageMultiplier(@NotNull Material material) {
    if (material.hasProperty(PropertyKey.POLYMER)) return 4;
    return material.getBlastTemperature() > 2800 ? VA[LV] : VA[ULV];
  }
}
