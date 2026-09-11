package com.zircky.industrialsorcerygreg.integration.emi.oreprocessing;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import brachy.modularui.integration.emi.EmiStackConverter;
import brachy.modularui.integration.emi.recipe.ModularUIEmiRecipe;
import dev.emi.emi.api.recipe.EmiRecipeCategory;
import dev.emi.emi.api.stack.EmiIngredient;
import dev.emi.emi.api.stack.EmiStack;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class ISGEmiOreProcessing extends ModularUIEmiRecipe {

  final Material material;
  final ISGOreByProduct byProduct;

  public ISGEmiOreProcessing(Material material) {
    super(material.getResourceLocation().withPrefix("/ore_proc/"),
        () -> new ISGOreByProductWidget(material));
    this.material = material;
    this.byProduct = new ISGOreByProduct(material);
  }

  @Override
  public EmiRecipeCategory getCategory() {
    return ISGOreProcessingEmiCategory.CATEGORY;
  }

  @Override
  public List<EmiIngredient> getInputs() {
    List<EmiIngredient> ingredients = new ArrayList<>();
    ingredients.addAll(byProduct.itemInputs.stream()
        .map(v -> EmiStackConverter.ITEM.convertTo(v, 1, UnaryOperator.identity()))
        .toList());
    ingredients.addAll(byProduct.fluidInputs.stream()
        .map(v -> EmiStackConverter.FLUID.convertTo(v, 1, UnaryOperator.identity()))
        .toList());
    return ingredients;
  }

  @Override
  public List<EmiStack> getOutputs() {
    return byProduct.itemOutputs.stream().map(EmiStack::of).toList();
  }

  @Override
  public boolean supportsRecipeTree() {
    return false;
  }

}
