package com.zircky.industrialsorcerygreg.data.recipe.generated;

import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.MaterialEntry;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import com.zircky.industrialsorcerygreg.common.data.ISGMaterials;
import com.zircky.industrialsorcerygreg.utils.ISGUtils;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.MV;
import static com.gregtechceu.gtceu.api.GTValues.VA;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.plateDouble;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.BENDER_RECIPES;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.CHEMICAL_BATH_RECIPES;
import static com.zircky.industrialsorcerygreg.api.data.material.ISGMaterialFlags.*;
import static com.zircky.industrialsorcerygreg.api.data.tag.ISGTagPrefix.*;

public class ISGMaterialRecipeHandler {
  public static void run(@NotNull Consumer<FinishedRecipe> provider, @NotNull Material material) {
    processPlateDoubleAddition(provider, material);

    processIngot(provider, material);
    processIngotDouble(provider, material);
    processIngotTriple(provider, material);
    processIngotQuadruple(provider, material);
    processIngotQuintuple(provider, material);
  }

  private static void processPlateDoubleAddition(@NotNull Consumer<FinishedRecipe> provider, @NotNull Material material) {
    if (!material.shouldGenerateRecipesFor(plateDouble) || !material.hasProperty(PropertyKey.INGOT)) {
      return;
    }

    var magMaterial = material.hasFlag(IS_MAGNETIC) ?
        material.getProperty(PropertyKey.INGOT).getMacerateInto() : material;

    if (material.hasFlag(GENERATE_PLATE) && material.hasFlag(GENERATE_DOUBLE_INGOT)) {
      BENDER_RECIPES.recipeBuilder("bend_" + material.getName() + "_double_ingot_to_double_plate")
          .EUt(96).duration((int) material.getMass() * 2)
          .inputItems(doubleIngot, material)
          .outputItems(plateDouble, magMaterial)
          .circuitMeta(1)
          .save(provider);
    }
  }

  private static void processIngot(@NotNull Consumer<FinishedRecipe> provider, @NotNull Material material) {
    ItemStack stack = ChemicalHelper.get(ingot, material);
    if (stack.isEmpty()) return;
    int mass = (int) material.getMass();

    if (ISGUtils.isGeneration(ingotHot, material) && material.hasFlag(CAN_BE_COOLED_DOWN_BY_BATHING)) {
      CHEMICAL_BATH_RECIPES.recipeBuilder("%s_cool_down".formatted(material))
          .inputItems(ingotHot, material)
          .inputFluids(ISGMaterials.Ic2coolant, 100)
          .outputItems(ingot, material)
          .duration(mass * 5).EUt(VA[MV]).save(provider);
    }
  }


  private static void processIngotDouble(@NotNull Consumer<FinishedRecipe> provider, @NotNull Material material) {

    if (!material.shouldGenerateRecipesFor(doubleIngot) || !material.hasProperty(PropertyKey.INGOT)) {
      return;
    }

    var magMaterial = material.hasFlag(IS_MAGNETIC) ?
        material.getProperty(PropertyKey.INGOT).getMacerateInto() : material;

    if (!material.hasFlag(NO_SMASHING)) {
      VanillaRecipeHelper.addShapedRecipe(provider, String.format("ingot_double_%s", material.getName()),
          ChemicalHelper.get(doubleIngot, magMaterial),
          "P", "P", "h",
          'P', new MaterialEntry(ingot, material));
    }

    BENDER_RECIPES.recipeBuilder("bend_" + material.getName() + "_ingot_to_double_ingot")
        .inputItems(ingot, material, 2)
        .circuitMeta(16)
        .outputItems(doubleIngot, magMaterial)
        .duration((int) material.getMass() * 2)
        .EUt(96)
        .save(provider);
  }

  private static void processIngotTriple(@NotNull Consumer<FinishedRecipe> provider, @NotNull Material material) {

    if (!material.shouldGenerateRecipesFor(tripleIngot) || !material.hasProperty(PropertyKey.INGOT)) {
      return;
    }

    var magMaterial = material.hasFlag(IS_MAGNETIC) ?
        material.getProperty(PropertyKey.INGOT).getMacerateInto() : material;

    if (!material.hasFlag(NO_SMASHING)) {
      VanillaRecipeHelper.addShapedRecipe(provider, String.format("ingot_triple_%s", material.getName()),
          ChemicalHelper.get(tripleIngot, magMaterial),
          "D", "P", "h",
          'P', new MaterialEntry(ingot, material),
          'D', new MaterialEntry(doubleIngot, material));

    }

    BENDER_RECIPES.recipeBuilder("bend_" + material.getName() + "_ingot_to_triple_ingot")
        .inputItems(ingot, material, 3)
        .circuitMeta(17)
        .outputItems(tripleIngot, magMaterial)
        .duration((int) material.getMass() * 3)
        .EUt(96)
        .save(provider);

  }

  private static void processIngotQuadruple(@NotNull Consumer<FinishedRecipe> provider, @NotNull Material material) {

    if (!material.shouldGenerateRecipesFor(quadrupleIngot) || !material.hasProperty(PropertyKey.INGOT)) {
      return;
    }

    var magMaterial = material.hasFlag(IS_MAGNETIC) ?
        material.getProperty(PropertyKey.INGOT).getMacerateInto() : material;

    if (!material.hasFlag(NO_SMASHING)) {
      VanillaRecipeHelper.addShapedRecipe(provider, String.format("ingot_quadruple_%s", material.getName()),
          ChemicalHelper.get(quadrupleIngot, magMaterial),
          "D", "P", "h",
          'P', new MaterialEntry(ingot, material),
          'D', new MaterialEntry(tripleIngot, material));

      VanillaRecipeHelper.addShapedRecipe(provider, String.format("double_ingots_quadruple_%s", material.getName()),
          ChemicalHelper.get(quadrupleIngot, magMaterial),
          "P", "P", "h",
          'P', new MaterialEntry(doubleIngot, material));

    }

    BENDER_RECIPES.recipeBuilder("bend_" + material.getName() + "_ingot_to_quadruple_ingot")
        .inputItems(ingot, material, 4)
        .circuitMeta(18)
        .outputItems(quadrupleIngot, magMaterial)
        .duration((int) material.getMass() * 4)
        .EUt(96)
        .save(provider);

    BENDER_RECIPES.recipeBuilder("bend_" + material.getName() + "_double_ingots_to_quadruple_ingot")
        .inputItems(doubleIngot, material, 2)
        .circuitMeta(16)
        .outputItems(quadrupleIngot, magMaterial)
        .duration((int) material.getMass() * 4)
        .EUt(96)
        .save(provider);

  }

  private static void processIngotQuintuple(@NotNull Consumer<FinishedRecipe> provider, @NotNull Material material) {

    if (!material.shouldGenerateRecipesFor(quintupleIngot) || !material.hasProperty(PropertyKey.INGOT)) {
      return;
    }

    var magMaterial = material.hasFlag(IS_MAGNETIC) ?
        material.getProperty(PropertyKey.INGOT).getMacerateInto() : material;

    if (!material.hasFlag(NO_SMASHING)) {
      VanillaRecipeHelper.addShapedRecipe(provider, String.format("ingot_quintuple_%s", material.getName()),
          ChemicalHelper.get(quintupleIngot, magMaterial),
          "D", "P", "h",
          'P', new MaterialEntry(ingot, material),
          'D', new MaterialEntry(quadrupleIngot, material));
      VanillaRecipeHelper.addShapedRecipe(provider, String.format("double_ingots_quintuple_%s", material.getName()),
          ChemicalHelper.get(quintupleIngot, magMaterial),
          "D", "P", "h",
          'P', new MaterialEntry(doubleIngot, material),
          'D', new MaterialEntry(tripleIngot, material));

    }

    BENDER_RECIPES.recipeBuilder("bend_" + material.getName() + "_ingot_to_quintuple_ingot")
        .inputItems(ingot, material, 5)
        .circuitMeta(19)
        .outputItems(quintupleIngot, magMaterial)
        .duration((int) material.getMass() * 5)
        .EUt(96)
        .save(provider);

  }

}
