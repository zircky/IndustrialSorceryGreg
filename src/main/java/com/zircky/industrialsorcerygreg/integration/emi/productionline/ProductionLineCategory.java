package com.zircky.industrialsorcerygreg.integration.emi.productionline;

import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.zircky.industrialsorcerygreg.ISGCore;
import dev.emi.emi.api.recipe.EmiRecipeCategory;
import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.network.chat.Component;

public class ProductionLineCategory extends EmiRecipeCategory {
  public static final ProductionLineCategory NAQUADAH = new ProductionLineCategory();

  private ProductionLineCategory() {
    super(ISGCore.id("naquadah_production_lines"), iconStack());
  }

  public EmiStack icon() {
    return iconStack();
  }

  @Override
  public Component getName() {
    return Component.translatable(String.format("%s.emi.category.naquadah_production_lines", ISGCore.MODID));
  }

  private static EmiStack iconStack() {
    return EmiStack.of(ChemicalHelper.get(TagPrefix.dust, GTMaterials.Naquadah));
  }
}
