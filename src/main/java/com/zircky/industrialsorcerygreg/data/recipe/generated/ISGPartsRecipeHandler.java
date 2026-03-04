package com.zircky.industrialsorcerygreg.data.recipe.generated;

import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.MaterialEntry;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import com.zircky.industrialsorcerygreg.api.data.material.ISGMaterialFlags;
import com.zircky.industrialsorcerygreg.api.data.tag.ISGTagPrefix;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.*;
import static com.zircky.industrialsorcerygreg.api.data.tag.ISGTagPrefix.*;

public class ISGPartsRecipeHandler {
  private ISGPartsRecipeHandler() {}


  public static void init(Consumer<FinishedRecipe> provider, @NotNull Material material) {
    processcurvedPlate(provider, material);
    if (material.hasFlag(ISGMaterialFlags.GENERATE_COMPONENT)) {
      processMotorEnclosure(provider, material);
      processPumpBarrel(provider, material);
      processPistonHousing(provider, material);
      processEmitterBases(provider, material);
      processSensorCasing(provider, material);
      processFieldGeneratorCasing(provider, material);
    }
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
}
