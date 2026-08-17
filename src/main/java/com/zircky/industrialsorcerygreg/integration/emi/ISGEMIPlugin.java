package com.zircky.industrialsorcerygreg.integration.emi;

import com.gregtechceu.gtceu.config.ConfigHolder;
import com.gregtechceu.gtceu.integration.recipeviewer.emi.GTOreProcessingEmiCategory;
import com.zircky.industrialsorcerygreg.integration.emi.materialtree.GTFormResolver;
import com.zircky.industrialsorcerygreg.integration.emi.materialtree.GTMaterialAccess;
import com.zircky.industrialsorcerygreg.integration.emi.materialtree.MaterialTreeCategory;
import com.zircky.industrialsorcerygreg.integration.emi.materialtree.MaterialTreeRecipeFactory;
import com.zircky.industrialsorcerygreg.integration.emi.oreprocessing.ISGOreProcessingEmiCategory;
import com.zircky.industrialsorcerygreg.integration.emi.productionline.NaquadahProductionLines;
import dev.emi.emi.api.EmiEntrypoint;
import dev.emi.emi.api.EmiInitRegistry;
import dev.emi.emi.api.EmiPlugin;
import dev.emi.emi.api.EmiRegistry;
import net.minecraftforge.fml.loading.FMLEnvironment;

@EmiEntrypoint
public class ISGEMIPlugin implements EmiPlugin {

  @Override
  public void register(final EmiRegistry registry) {

    final MaterialTreeCategory category = new MaterialTreeCategory();

    registry.addCategory(category);
    registry.addWorkstation(category, category.icon());

    registry.removeRecipes(recipe ->
        recipe.getCategory() == GTOreProcessingEmiCategory.CATEGORY
    );

    if (!ConfigHolder.INSTANCE.compat.hideOreProcessingDiagrams)
      registry.addCategory(ISGOreProcessingEmiCategory.CATEGORY);

    if (!ConfigHolder.INSTANCE.compat.hideOreProcessingDiagrams)
      ISGOreProcessingEmiCategory.registerDisplays(registry);

    if (!ConfigHolder.INSTANCE.compat.hideOreProcessingDiagrams)
      ISGOreProcessingEmiCategory.registerWorkStations(registry);

    final MaterialTreeRecipeFactory factory =
        new MaterialTreeRecipeFactory(
            category,
            new GTMaterialAccess(),
            new GTFormResolver()
        );

    factory.createAll().forEach(registry::addRecipe);

    if (!FMLEnvironment.production) {
      NaquadahProductionLines.register(registry);
    }

  }

  @Override
  public void initialize(EmiInitRegistry registry) {
    EmiPlugin.super.initialize(registry);
  }
}
