package com.zircky.industrialsorcerygreg.integration.emi.materialtree;

import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.zircky.industrialsorcerygreg.ISGCore;
import dev.emi.emi.api.recipe.EmiRecipeCategory;
import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.network.chat.Component;

public class MaterialTreeCategory extends EmiRecipeCategory {
  private final EmiStack icon;

  public MaterialTreeCategory() {
    super(ISGCore.id("material_tree"), iconStack());
    this.icon = iconStack();
  }

  public EmiStack icon() {
    return icon;
  }


  private static EmiStack iconStack() {
    return EmiStack.of(ChemicalHelper.get(TagPrefix.ingot, GTMaterials.Aluminium));
  }

  @Override
  public Component getName() {
    return Component.translatable(String.format("%s.emi.category.material_tree", ISGCore.MODID));
  }
}
