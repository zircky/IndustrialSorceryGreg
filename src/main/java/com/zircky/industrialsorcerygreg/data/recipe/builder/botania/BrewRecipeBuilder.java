package com.zircky.industrialsorcerygreg.data.recipe.builder.botania;

import com.zircky.industrialsorcerygreg.ISGCore;

import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import com.google.gson.JsonObject;
import vazkii.botania.api.BotaniaAPI;
import vazkii.botania.api.brew.Brew;
import vazkii.botania.common.crafting.BotaniaRecipeTypes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public final class BrewRecipeBuilder {

    public static BrewRecipeBuilder builder(String name) {
        return new BrewRecipeBuilder(ISGCore.id("brew/" + name));
    }

    private final ResourceLocation id;
    private Brew brew;
    private final List<Ingredient> ingredients = new ArrayList<>();

    private BrewRecipeBuilder(ResourceLocation id) {
        this.id = id;
    }

    public BrewRecipeBuilder brew(Brew brew) {
        this.brew = brew;
        return this;
    }

    private BrewRecipeBuilder addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
        return this;
    }

    public BrewRecipeBuilder addIngredient(ItemLike item) {
        return addIngredient(Ingredient.of(item));
    }

    public BrewRecipeBuilder addIngredient(TagKey<Item> tag) {
        return addIngredient(Ingredient.of(tag));
    }

    public void save(Consumer<FinishedRecipe> provider) {
        if (brew == null) {
            throw new IllegalStateException("No brew specified for brew recipe");
        }
        if (ingredients.isEmpty()) {
            throw new IllegalStateException("No ingredients added to brew recipe");
        }
        final var brewId = BotaniaAPI.instance().getBrewRegistry().getKey(brew);
        if (brewId == null) {
            throw new IllegalStateException("Unregistered brew for recipe: " + id);
        }
        final var json = new JsonObject();
        json.addProperty("brew", brewId.toString());
        json.add("ingredients", BotaniaRecipeJson.ingredients(ingredients));
        provider.accept(new BotaniaFinishedRecipe(id, BotaniaRecipeTypes.BREW_SERIALIZER, json));
    }
}
