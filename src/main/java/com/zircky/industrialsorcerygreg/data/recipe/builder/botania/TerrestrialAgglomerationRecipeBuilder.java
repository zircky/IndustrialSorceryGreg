package com.zircky.industrialsorcerygreg.data.recipe.builder.botania;

import com.zircky.industrialsorcerygreg.ISGCore;

import net.minecraft.core.NonNullList;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import com.google.gson.JsonObject;
import vazkii.botania.common.crafting.BotaniaRecipeTypes;
import vazkii.botania.common.helper.ItemNBTHelper;

import java.util.function.Consumer;

public final class TerrestrialAgglomerationRecipeBuilder {

    public static TerrestrialAgglomerationRecipeBuilder builder(String name) {
        return new TerrestrialAgglomerationRecipeBuilder(ISGCore.id("terra_plate/" + name));
    }

    private final ResourceLocation id;
    private ItemStack output;
    private int mana;
    private final NonNullList<Ingredient> ingredients = NonNullList.create();

    private TerrestrialAgglomerationRecipeBuilder(ResourceLocation id) {
        this.id = id;
    }

    public TerrestrialAgglomerationRecipeBuilder output(ItemLike output) {
        return output(new ItemStack(output));
    }

    public TerrestrialAgglomerationRecipeBuilder output(ItemStack output) {
        this.output = output;
        return this;
    }

    public TerrestrialAgglomerationRecipeBuilder mana(int mana) {
        this.mana = mana;
        return this;
    }

    public TerrestrialAgglomerationRecipeBuilder addIngredient(Ingredient ingredient) {
        if (ingredient != null) {
            this.ingredients.add(ingredient);
        }
        return this;
    }

    public TerrestrialAgglomerationRecipeBuilder addIngredient(ItemLike item) {
        return addIngredient(Ingredient.of(item));
    }

    public TerrestrialAgglomerationRecipeBuilder addIngredient(TagKey<Item> tag) {
        return addIngredient(Ingredient.of(tag));
    }

    public void save(Consumer<FinishedRecipe> provider) {
        if (ingredients.isEmpty()) {
            throw new IllegalStateException("No ingredients added to terrestrial agglomeration recipe");
        }
        if (output == null) {
            throw new IllegalStateException("No output specified for terrestrial agglomeration recipe");
        }
        final var json = new JsonObject();
        json.add("result", ItemNBTHelper.serializeStack(output));
        json.addProperty("mana", mana);
        json.add("ingredients", BotaniaRecipeJson.ingredients(ingredients));
        provider.accept(new BotaniaFinishedRecipe(id, BotaniaRecipeTypes.TERRA_PLATE_SERIALIZER, json));
    }
}
