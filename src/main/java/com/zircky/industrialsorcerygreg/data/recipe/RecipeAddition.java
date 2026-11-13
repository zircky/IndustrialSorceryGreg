package com.zircky.industrialsorcerygreg.data.recipe;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.MaterialEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import com.zircky.industrialsorcerygreg.common.data.ISGMaterials;
import igentuman.nc.setup.registration.NCItems;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;

import java.util.function.Consumer;

public class RecipeAddition {
  public static void init(Consumer<FinishedRecipe> provider) {
    createHelmetRecipe(provider, "tough_helmet", new ItemStack(NCItems.TOUGH_HELMET.get()), ISGMaterials.ToughAlloy);
    createChestplateRecipe(provider, "tough_chest", new ItemStack(NCItems.TOUGH_CHEST.get()), ISGMaterials.ToughAlloy);
    createLeggingsRecipe(provider, "tough_pants", new ItemStack(NCItems.TOUGH_PANTS.get()), ISGMaterials.ToughAlloy);
    createBootsRecipe(provider, "tough_boots", new ItemStack(NCItems.TOUGH_BOOTS.get()), ISGMaterials.ToughAlloy);
  }

  public static void createShovelRecipe(Consumer<FinishedRecipe> provider, String regName, ItemStack output,
                                         Material... material) {
    VanillaRecipeHelper.addShapedRecipe(provider, true, regName, output, "hPf", " S ", " S ",
        'P', new MaterialEntry(TagPrefix.plate, material[0]),
        'S', new MaterialEntry(TagPrefix.rod, material[1]));
  }

  public static void createShovelRecipe(Consumer<FinishedRecipe> provider, String regName, ItemStack output,
                                        Material material, ItemStack inputWood) {
    VanillaRecipeHelper.addShapedRecipe(provider, true, regName, output, "hPf", " S ", " S ",
        'P', new MaterialEntry(TagPrefix.plate, material),
        'S', inputWood);
  }

  public static void createPickaxeRecipe(Consumer<FinishedRecipe> provider, String regName, ItemStack output,
                                          Material... material) {
    VanillaRecipeHelper.addShapedRecipe(provider, true, regName, output, "PII", "hSf", " S ",
        'P', new MaterialEntry(TagPrefix.plate, material[0]),
        'I',
        new MaterialEntry(material[0].hasProperty(PropertyKey.GEM) ? TagPrefix.gem : TagPrefix.ingot, material[0]),
        'S', new MaterialEntry(TagPrefix.rod, material[1]));
  }

  public static void createPickaxeRecipe(Consumer<FinishedRecipe> provider, String regName, ItemStack output,
                                         Material material, ItemStack inputWood) {
    VanillaRecipeHelper.addShapedRecipe(provider, true, regName, output, "PII", "hSf", " S ",
        'P', new MaterialEntry(TagPrefix.plate, material),
        'I',
        new MaterialEntry(material.hasProperty(PropertyKey.GEM) ? TagPrefix.gem : TagPrefix.ingot, material),
        'S', inputWood);
  }

  public static void createAxeRecipe(Consumer<FinishedRecipe> provider, String regName, ItemStack output,
                                     Material... material) {
    VanillaRecipeHelper.addShapedRecipe(provider, true, regName, output, "PIf", "PS ", "hS ",
        'P', new MaterialEntry(TagPrefix.plate, material[0]),
        'I',
        new MaterialEntry(material[0].hasProperty(PropertyKey.GEM) ? TagPrefix.gem : TagPrefix.ingot, material[0]),
        'S', new MaterialEntry(TagPrefix.rod, material[1]));
  }

  public static void createAxeRecipe(Consumer<FinishedRecipe> provider, String regName, ItemStack output,
                                     Material material, ItemStack inputWood) {
    VanillaRecipeHelper.addShapedRecipe(provider, true, regName, output, "PIf", "PS ", "hS ",
        'P', new MaterialEntry(TagPrefix.plate, material),
        'I',
        new MaterialEntry(material.hasProperty(PropertyKey.GEM) ? TagPrefix.gem : TagPrefix.ingot, material),
        'S', inputWood);
  }

  public static void createSwordRecipe(Consumer<FinishedRecipe> provider, String regName, ItemStack output,
                                       Material... material) {
    VanillaRecipeHelper.addShapedRecipe(provider, true, regName, output, " P ", "hPf", " S ",
        'P', new MaterialEntry(TagPrefix.plate, material[0]),
        'S', new MaterialEntry(TagPrefix.rod, material[1]));
  }

  public static void createSwordRecipe(Consumer<FinishedRecipe> provider, String regName, ItemStack output,
                                       Material material, ItemStack inputWood) {
    VanillaRecipeHelper.addShapedRecipe(provider, true, regName, output, " P ", "hPf", " S ",
        'P', new MaterialEntry(TagPrefix.plate, material),
        'S', inputWood);
  }

  public static void createHoeRecipe(Consumer<FinishedRecipe> provider, String regName, ItemStack output,
                                      Material... material) {
    VanillaRecipeHelper.addShapedRecipe(provider, true, regName, output, "PIf", "hS ", " S ",
        'P', new MaterialEntry(TagPrefix.plate, material[0]),
        'I',
        new MaterialEntry(material[0].hasProperty(PropertyKey.GEM) ? TagPrefix.gem : TagPrefix.ingot, material[0]),
        'S', new MaterialEntry(TagPrefix.rod, material[1]));
  }

  public static void createHoeRecipe(Consumer<FinishedRecipe> provider, String regName, ItemStack output,
                                     Material material, ItemStack inputWood) {
    VanillaRecipeHelper.addShapedRecipe(provider, true, regName, output, "PIf", "hS ", " S ",
        'P', new MaterialEntry(TagPrefix.plate, material),
        'I',
        new MaterialEntry(material.hasProperty(PropertyKey.GEM) ? TagPrefix.gem : TagPrefix.ingot, material),
        'S', inputWood);
  }

  public static void createHelmetRecipe(Consumer<FinishedRecipe> provider, String regName, ItemStack output,
                                         Material material) {
    VanillaRecipeHelper.addShapedRecipe(provider, true, regName, output, "PPP", "PhP",
        'P', new MaterialEntry(TagPrefix.plate, material));
  }

  public static void createChestplateRecipe(Consumer<FinishedRecipe> provider, String regName, ItemStack output,
                                             Material material) {
    VanillaRecipeHelper.addShapedRecipe(provider, true, regName, output, "PhP", "PPP", "PPP",
        'P', new MaterialEntry(TagPrefix.plate, material));
  }

  public static void createLeggingsRecipe(Consumer<FinishedRecipe> provider, String regName, ItemStack output,
                                           Material material) {
    VanillaRecipeHelper.addShapedRecipe(provider, true, regName, output, "PPP", "PhP", "P P",
        'P', new MaterialEntry(TagPrefix.plate, material));
  }

  public static void createBootsRecipe(Consumer<FinishedRecipe> provider, String regName, ItemStack output,
                                        Material material) {
    VanillaRecipeHelper.addShapedRecipe(provider, true, regName, output, "P P", "PhP",
        'P', new MaterialEntry(TagPrefix.plate, material));
  }
}
