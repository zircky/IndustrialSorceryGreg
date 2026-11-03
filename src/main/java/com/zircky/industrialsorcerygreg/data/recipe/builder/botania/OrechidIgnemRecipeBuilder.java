package com.zircky.industrialsorcerygreg.data.recipe.builder.botania;

import com.zircky.industrialsorcerygreg.ISGCore;

import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

import com.google.gson.JsonObject;
import vazkii.botania.api.recipe.StateIngredient;
import vazkii.botania.common.crafting.BotaniaRecipeTypes;
import vazkii.botania.common.crafting.StateIngredientHelper;

import java.util.function.Consumer;

public final class OrechidIgnemRecipeBuilder {

    public static OrechidIgnemRecipeBuilder builder(String name) {
        return new OrechidIgnemRecipeBuilder(ISGCore.id("orechid_ignem/" + name));
    }

    private final ResourceLocation id;
    private StateIngredient input;
    private Block output;
    private int weight = 1;

    private OrechidIgnemRecipeBuilder(ResourceLocation id) {
        this.id = id;
    }

    private OrechidIgnemRecipeBuilder input(StateIngredient input) {
        this.input = input;
        return this;
    }

    public OrechidIgnemRecipeBuilder input(Block input) {
        return input(StateIngredientHelper.of(input));
    }

    public OrechidIgnemRecipeBuilder input(TagKey<Block> inputTag) {
        return input(StateIngredientHelper.of(inputTag));
    }

    public OrechidIgnemRecipeBuilder output(Block output) {
        this.output = output;
        return this;
    }

    public OrechidIgnemRecipeBuilder weight(int weight) {
        this.weight = weight;
        return this;
    }

    public void save(Consumer<FinishedRecipe> provider) {
        final var json = new JsonObject();
        json.add("input", input.serialize());
        json.add("output", StateIngredientHelper.of(output.defaultBlockState()).serialize());
        json.addProperty("weight", weight);
        provider.accept(new BotaniaFinishedRecipe(id, BotaniaRecipeTypes.ORECHID_IGNEM_SERIALIZER, json));
    }
}
