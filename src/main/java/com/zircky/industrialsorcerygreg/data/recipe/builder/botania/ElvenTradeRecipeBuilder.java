package com.zircky.industrialsorcerygreg.data.recipe.builder.botania;

import com.zircky.industrialsorcerygreg.ISGCore;

import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import com.google.gson.JsonObject;
import vazkii.botania.common.crafting.BotaniaRecipeTypes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public final class ElvenTradeRecipeBuilder {

    public static ElvenTradeRecipeBuilder builder(String name) {
        return new ElvenTradeRecipeBuilder(ISGCore.id("elven_trade/" + name));
    }

    private final ResourceLocation id;
    private final List<Ingredient> inputs = new ArrayList<>();
    private final List<ItemStack> outputs = new ArrayList<>();

    private ElvenTradeRecipeBuilder(ResourceLocation id) {
        this.id = id;
    }

    private ElvenTradeRecipeBuilder addInput(Ingredient input) {
        if (input != null) {
            this.inputs.add(input);
        }
        return this;
    }

    public ElvenTradeRecipeBuilder addInput(ItemLike item) {
        return addInput(Ingredient.of(item));
    }

    public ElvenTradeRecipeBuilder addInput(TagKey<Item> tag) {
        return addInput(Ingredient.of(tag));
    }

    private ElvenTradeRecipeBuilder addOutput(ItemStack output) {
        if (output != null) {
            this.outputs.add(output);
        }
        return this;
    }

    public ElvenTradeRecipeBuilder addOutput(ItemLike output) {
        return addOutput(new ItemStack(output));
    }

    public ElvenTradeRecipeBuilder addOutput(ItemLike output, int count) {
        return addOutput(new ItemStack(output, count));
    }

    public void save(Consumer<FinishedRecipe> provider) {
        if (inputs.isEmpty()) {
            throw new IllegalStateException("No inputs added to elven trade recipe");
        }
        if (outputs.isEmpty()) {
            throw new IllegalStateException("No outputs specified for elven trade recipe");
        }
        final var json = new JsonObject();
        json.add("ingredients", BotaniaRecipeJson.ingredients(inputs));
        json.add("output", BotaniaRecipeJson.outputs(outputs));
        provider.accept(new BotaniaFinishedRecipe(id, BotaniaRecipeTypes.ELVEN_TRADE_SERIALIZER, json));
    }
}
