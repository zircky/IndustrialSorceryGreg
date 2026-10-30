package com.zircky.industrialsorcerygreg.common.data;

import com.zircky.industrialsorcerygreg.data.Data;
import com.zircky.industrialsorcerygreg.ISGCore;

import com.gregtechceu.gtceu.data.recipe.EquipmentFoundryRecipeHelper;

import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;

import earth.terrarium.adastra.common.registry.ModItems;

import java.util.function.Consumer;

public class ISGRecipes {
  public static int seconds = 20;
  public static int hour = seconds * 60;
  public static int day = 24 * hour;

  public static void recipeAddition(Consumer<FinishedRecipe> provider) {
    Data.init(provider);
    EquipmentFoundryRecipeHelper.addEquipmentFoundryRecipe(
        provider, ISGCore.id("oxygen_tank"),
        Ingredient.of(Tags.Items.ARMORS_CHESTPLATES),
        ModItems.LARGE_GAS_TANK.get(), ISGItemModules.OXYGEN_TANK);
  }

  public static void recipeRemoval(Consumer<ResourceLocation> consumer) {
    Data.removeInit(consumer);
  }
}
