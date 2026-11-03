package com.zircky.industrialsorcerygreg.data.recipe.builder.botania;

import com.zircky.industrialsorcerygreg.ISGCore;

import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;

import com.google.gson.JsonObject;
import vazkii.botania.api.recipe.StateIngredient;
import vazkii.botania.common.crafting.BotaniaRecipeTypes;
import vazkii.botania.common.crafting.StateIngredientHelper;

import java.util.function.Consumer;

public final class MarimorphosisRecipeBuilder {

    public static MarimorphosisRecipeBuilder builder(String name) {
        return new MarimorphosisRecipeBuilder(ISGCore.id("marimorphosis/" + name));
    }

    private final ResourceLocation id;
    private StateIngredient input;
    private Block output;
    private int weight = 1;
    private int biomeBonus = 11;
    private TagKey<Biome> biomeTag;

    private MarimorphosisRecipeBuilder(ResourceLocation id) {
        this.id = id;
    }

    private MarimorphosisRecipeBuilder input(StateIngredient input) {
        this.input = input;
        return this;
    }

    public MarimorphosisRecipeBuilder input(Block input) {
        return input(StateIngredientHelper.of(input));
    }

    public MarimorphosisRecipeBuilder input(TagKey<Block> inputTag) {
        return input(StateIngredientHelper.of(inputTag));
    }

    public MarimorphosisRecipeBuilder output(Block output) {
        this.output = output;
        return this;
    }

    public MarimorphosisRecipeBuilder weight(int weight) {
        this.weight = weight;
        return this;
    }

    public MarimorphosisRecipeBuilder biomeBonus(int biomeBonus) {
        this.biomeBonus = biomeBonus;
        return this;
    }

    public MarimorphosisRecipeBuilder biomeTag(TagKey<Biome> biomeTag) {
        this.biomeTag = biomeTag;
        return this;
    }

    public void save(Consumer<FinishedRecipe> provider) {
        final var json = new JsonObject();
        json.add("input", input.serialize());
        json.add("output", StateIngredientHelper.of(output.defaultBlockState()).serialize());
        json.addProperty("weight", weight);
        json.addProperty("biome_bonus", biomeBonus);
        json.addProperty("biome_bonus_tag", biomeTag.location().toString());
        provider.accept(new BotaniaFinishedRecipe(id, BotaniaRecipeTypes.MARIMORPHOSIS_SERIALIZER, json));
    }
}
