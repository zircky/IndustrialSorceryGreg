package com.zircky.industrialsorcerygreg.integration.emi.oreprocessing;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.lowdragmc.lowdraglib.emi.ModularEmiRecipe;
import dev.emi.emi.api.recipe.EmiRecipeCategory;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;

public class ISGEmiOreProcessing extends ModularEmiRecipe<ISGOreByProductWidget> {

  final Material material;

  public ISGEmiOreProcessing(Material material) {
    super(() -> new ISGOreByProductWidget(material));
    this.material = material;
  }

  @Override
  public EmiRecipeCategory getCategory() {
    return ISGOreProcessingEmiCategory.CATEGORY;
  }

  @Override
  public @Nullable ResourceLocation getId() {
    return material.getResourceLocation();
  }

  @Override
  public boolean supportsRecipeTree() {
    return false;
  }

}
