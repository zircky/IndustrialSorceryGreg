package com.zircky.industrialsorcerygreg.data.recipe;

import appeng.core.definitions.AEParts;
import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;

import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.zircky.industrialsorcerygreg.data.recipe.integration.ae2.network.Parts.materials;

public class ISGCraftingComponent {
  public static GTRComponent ANCHOR = new GTRComponent(Stream.of(new Object[][]{
      {0, ChemicalHelper.get(TagPrefix.bolt, GTMaterials.Iron)},
      {1, ChemicalHelper.get(TagPrefix.bolt, GTMaterials.Copper)},
      {2, ChemicalHelper.get(TagPrefix.bolt, GTMaterials.Bronze)},
      {3, ChemicalHelper.get(TagPrefix.bolt, GTMaterials.Tin)},
      {4, ChemicalHelper.get(TagPrefix.bolt, GTMaterials.Steel)},
      {5, ChemicalHelper.get(TagPrefix.bolt, GTMaterials.Aluminium)},
      {6, ChemicalHelper.get(TagPrefix.bolt, GTMaterials.Lead)},
      {7, ChemicalHelper.get(TagPrefix.bolt, GTMaterials.Nickel)},
      {8, ChemicalHelper.get(TagPrefix.bolt, GTMaterials.Silver)},
      {9, ChemicalHelper.get(TagPrefix.bolt, GTMaterials.Brass)},
      {10, ChemicalHelper.get(TagPrefix.bolt, GTMaterials.Invar)},
      {11, ChemicalHelper.get(TagPrefix.bolt, GTMaterials.StainlessSteel)},
      {12, ChemicalHelper.get(TagPrefix.bolt, GTMaterials.Titanium)},

  }).collect(Collectors.toMap(data -> (Integer) data[0], data -> data[1])));

  public static void registerCableAnchorRecipes(Consumer<FinishedRecipe> provider, String regName, ISGCraftingComponent.GTRComponent input) {
    input.ingredients.entrySet().stream()
        .forEach(entry -> {
          int tier = entry.getKey();
          ItemStack ingredient = (ItemStack) entry.getValue();
          VanillaRecipeHelper.addShapedRecipe(provider, regName + materials[tier], new ItemStack(AEParts.CABLE_ANCHOR),
              "Af", "sA",
              'A', ingredient);
        });
  }

  public static class GTRComponent {
    private final Map<Integer, Object> ingredients;

    public GTRComponent(Map<Integer, Object> craftingComponents) {
      ingredients = craftingComponents;
    }

    public String getName() {
      Object firstIngredient = ingredients.values().stream().findFirst().orElse("Unknown");
      return firstIngredient.getClass().getSimpleName();
    }

//    public Object getIngredient(int tier) {
//      Object ingredient = ingredients.get(tier);
//      return ingredient == null ? ingredients.get(GTValues.FALLBACK) : ingredient;
//    }
//
//    @SuppressWarnings("unused")
//    public void appendIngredients(Map<Integer, Object> newIngredients) {
//      ingredients.remove(GTValues.FALLBACK);
//      newIngredients.forEach((key, value) -> ingredients.merge(key, value, (v1, v2) -> v2));
//    }
  }
}
