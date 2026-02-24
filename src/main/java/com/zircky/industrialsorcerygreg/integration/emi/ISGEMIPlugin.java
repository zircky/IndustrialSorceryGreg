package com.zircky.industrialsorcerygreg.integration.emi;

import dev.emi.emi.api.EmiEntrypoint;
import dev.emi.emi.api.EmiInitRegistry;
import dev.emi.emi.api.EmiPlugin;
import dev.emi.emi.api.EmiRegistry;

@EmiEntrypoint
public class ISGEMIPlugin implements EmiPlugin {

  @Override
  public void register(final EmiRegistry registry) {

    final MaterialTreeCategory category = new MaterialTreeCategory();

    registry.addCategory(category);
    registry.addWorkstation(category, category.icon());

    final MaterialTreeRecipeFactory factory =
        new MaterialTreeRecipeFactory(
            category,
            new GTMaterialAccess(),
            new GTFormResolver()
        );

    factory.createAll().forEach(registry::addRecipe);
  }

  @Override
  public void initialize(EmiInitRegistry registry) {
    EmiPlugin.super.initialize(registry);
  }

}
