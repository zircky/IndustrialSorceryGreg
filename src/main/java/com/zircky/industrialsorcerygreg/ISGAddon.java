package com.zircky.industrialsorcerygreg;

import com.gregtechceu.gtceu.api.addon.GTAddon;
import com.gregtechceu.gtceu.api.addon.IGTAddon;
import com.gregtechceu.gtceu.api.addon.events.KJSRecipeKeyEvent;
import com.gregtechceu.gtceu.api.addon.events.MaterialCasingCollectionEvent;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import com.zircky.industrialsorcerygreg.api.data.tag.ISGTagPrefix;
import com.zircky.industrialsorcerygreg.api.registries.ISGRegistries;
import com.zircky.industrialsorcerygreg.common.data.ISGRecipes;
import com.zircky.industrialsorcerygreg.data.recipe.ISGCraftingComponents;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;


import java.util.function.Consumer;

@GTAddon
public class ISGAddon implements IGTAddon {
  @Override
  public GTRegistrate getRegistrate() {
    return ISGRegistries.REGISTRATE;
  }

  @Override
  public void initializeAddon() {
    IndustrialSorceryGreg.LOGGER.info("CosmicCoreGTAddon has loaded!");
  }

  @Override
  public String addonModId() {
    return IndustrialSorceryGreg.MODID;
  }

  @Override
  public void registerTagPrefixes() {
    ISGTagPrefix.init();
  }

  @Override
  public void registerElements() {
    IGTAddon.super.registerElements();
  }

  @Override
  public void registerSounds() {
    IGTAddon.super.registerSounds();
  }

  @Override
  public void registerCovers() {
    IGTAddon.super.registerCovers();
  }

  @Override
  public void registerRecipeCapabilities() {
    IGTAddon.super.registerRecipeCapabilities();
  }

  @Override
  public void registerWorldgenLayers() {
    IGTAddon.super.registerWorldgenLayers();
  }

  @Override
  public void registerVeinGenerators() {
    IGTAddon.super.registerVeinGenerators();
  }

  @Override
  public void registerIndicatorGenerators() {
    IGTAddon.super.registerIndicatorGenerators();
  }

  @Override
  public void addRecipes(Consumer<FinishedRecipe> provider) {
    ISGCraftingComponents.init();
    ISGRecipes.recipeAddition(provider);
  }

  @Override
  public void removeRecipes(Consumer<ResourceLocation> consumer) {
    ISGRecipes.recipeRemoval(consumer);
  }

  @Override
  public void registerOreVeins() {
    IGTAddon.super.registerOreVeins();
  }

  @Override
  public void registerFluidVeins() {
    IGTAddon.super.registerFluidVeins();
  }

  @Override
  public void registerBedrockOreVeins() {
    IGTAddon.super.registerBedrockOreVeins();
  }

  @Override
  public void collectMaterialCasings(MaterialCasingCollectionEvent event) {
    IGTAddon.super.collectMaterialCasings(event);
  }

  @Override
  public void registerRecipeKeys(KJSRecipeKeyEvent event) {
    IGTAddon.super.registerRecipeKeys(event);
  }

  @Override
  public boolean requiresHighTier() {
    return true;
  }
}
