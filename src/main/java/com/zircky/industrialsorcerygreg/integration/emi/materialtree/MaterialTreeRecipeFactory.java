package com.zircky.industrialsorcerygreg.integration.emi.materialtree;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.zircky.industrialsorcerygreg.ISGCore;
import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.resources.ResourceLocation;

import java.util.ArrayList;
import java.util.List;

public class MaterialTreeRecipeFactory {
  private final MaterialTreeCategory category;
  private final GTMaterialAccess materialAccess;
  private final GTFormResolver formResolver;

  public MaterialTreeRecipeFactory(final MaterialTreeCategory category, final GTMaterialAccess materialAccess, final GTFormResolver formResolver) {
    this.category = category;
    this.materialAccess = materialAccess;
    this.formResolver = formResolver;
  }

  public List<MaterialTreeRecipe> createAll() {
    final List<MaterialTreeRecipe> recipes = new ArrayList<>();

    for (final Material material : materialAccess.getAllMaterials()) {
      final EmiStack key = formResolver.pickKey(material);
      if (key.isEmpty()) continue;

      final List<FormEntry> forms = formResolver.resolveForms(material);
      if (forms.isEmpty()) continue;

      final ResourceLocation id = ISGCore.id("/material_tree/" + sanitize(material.getName()));

      recipes.add(
          new  MaterialTreeRecipe(
              category, id, key, forms
          )
      );
    }
    return List.copyOf(recipes);
  }

  private String sanitize(final String s) {
    return s.toLowerCase().replaceAll("[^a-z0-9/_-]", "_");
  }
}
