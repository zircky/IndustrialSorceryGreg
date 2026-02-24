package com.zircky.industrialsorcerygreg.integration.emi;

import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.zircky.industrialsorcerygreg.IndustrialSorceryGreg;
import dev.emi.emi.api.recipe.EmiRecipeCategory;
import dev.emi.emi.api.stack.EmiStack;

public class MaterialTreeCategory extends EmiRecipeCategory {
  private final EmiStack icon;

  public MaterialTreeCategory() {
    super(IndustrialSorceryGreg.id("material_tree"), iconStack());
    this.icon = iconStack();
  }

  public EmiStack icon() {
    return icon;
  }


  private static net.minecraft.network.chat.Component iconName() {
    return net.minecraft.network.chat.Component.translatable(String.format("emi.%s.category.material_tree", IndustrialSorceryGreg.MODID));
  }

  private static EmiStack iconStack() {
    return EmiStack.of(ChemicalHelper.get(TagPrefix.ingot, GTMaterials.Aluminium));
  }
}
