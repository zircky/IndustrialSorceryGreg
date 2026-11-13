package com.zircky.industrialsorcerygreg.data.recipe.builder.bloodmagic;

import com.zircky.industrialsorcerygreg.ISGCore;

import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.Objects;
import java.util.function.Consumer;

public final class AlchemyArrayRecipeBuilder {

    private final ResourceLocation id;
    private Ingredient input;
    private Ingredient catalyst;
    private ItemStack output = ItemStack.EMPTY;
    private ResourceLocation texture;

    public static AlchemyArrayRecipeBuilder builder(String name) {
        return new AlchemyArrayRecipeBuilder(ISGCore.id("alchemy_array/" + name));
    }

    private AlchemyArrayRecipeBuilder(ResourceLocation id) {
        this.id = id;
    }

    public AlchemyArrayRecipeBuilder input(Ingredient input) {
        this.input = Objects.requireNonNull(input);
        return this;
    }

    public AlchemyArrayRecipeBuilder input(ItemLike item) {
        return input(Ingredient.of(item));
    }

    public AlchemyArrayRecipeBuilder input(TagKey<Item> tag) {
        return input(Ingredient.of(tag));
    }

    public AlchemyArrayRecipeBuilder catalyst(Ingredient catalyst) {
        this.catalyst = Objects.requireNonNull(catalyst);
        return this;
    }

    public AlchemyArrayRecipeBuilder catalyst(ItemLike item) {
        return catalyst(Ingredient.of(item));
    }

    public AlchemyArrayRecipeBuilder catalyst(TagKey<Item> tag) {
        return catalyst(Ingredient.of(tag));
    }

    public AlchemyArrayRecipeBuilder output(ItemStack output) {
        this.output = Objects.requireNonNull(output).copy();
        return this;
    }

    public AlchemyArrayRecipeBuilder output(ItemLike item) {
        return output(new ItemStack(item));
    }

    public AlchemyArrayRecipeBuilder texture(ResourceLocation texture) {
        this.texture = Objects.requireNonNull(texture);
        return this;
    }

    public void save(Consumer<FinishedRecipe> provider) {
        Objects.requireNonNull(input, "Missing input for " + id);
        Objects.requireNonNull(catalyst, "Missing catalyst for " + id);
        if (output.isEmpty()) {
            throw new IllegalStateException("Missing output for " + id);
        }
        Objects.requireNonNull(texture, "Missing texture for " + id);
        final var recipe = wayoftime.bloodmagic.common.data.recipe.builder.AlchemyArrayRecipeBuilder.array(texture,
                input, catalyst, output);
        recipe.build(provider, id);
    }
}
