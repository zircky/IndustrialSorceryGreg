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

public final class BloodAltarRecipeBuilder {

    private final ResourceLocation id;
    private Ingredient input;
    private ItemStack output = ItemStack.EMPTY;
    private int minimumTier;
    private int syphon;
    private int consumeRate;
    private int drainRate;

    public static BloodAltarRecipeBuilder builder(String name) {
        return new BloodAltarRecipeBuilder(ISGCore.id("blood_altar/" + name));
    }

    private BloodAltarRecipeBuilder(ResourceLocation id) {
        this.id = id;
    }

    public BloodAltarRecipeBuilder input(Ingredient input) {
        this.input = Objects.requireNonNull(input);
        return this;
    }

    public BloodAltarRecipeBuilder input(ItemLike item) {
        return input(Ingredient.of(item));
    }

    public BloodAltarRecipeBuilder input(TagKey<Item> tag) {
        return input(Ingredient.of(tag));
    }

    public BloodAltarRecipeBuilder output(ItemStack output) {
        this.output = Objects.requireNonNull(output).copy();
        return this;
    }

    public BloodAltarRecipeBuilder output(ItemLike item) {
        return output(new ItemStack(item));
    }

    public BloodAltarRecipeBuilder minimumTier(int minimumTier) {
        if (minimumTier < 0) {
            throw new IllegalArgumentException("minimumTier must be non-negative");
        }
        this.minimumTier = minimumTier;
        return this;
    }

    public BloodAltarRecipeBuilder syphon(int syphon) {
        if (syphon < 0) {
            throw new IllegalArgumentException("syphon must be non-negative");
        }
        this.syphon = syphon;
        return this;
    }

    public BloodAltarRecipeBuilder consumeRate(int consumeRate) {
        if (consumeRate < 0) {
            throw new IllegalArgumentException("consumeRate must be non-negative");
        }
        this.consumeRate = consumeRate;
        return this;
    }

    public BloodAltarRecipeBuilder drainRate(int drainRate) {
        if (drainRate < 0) {
            throw new IllegalArgumentException("drainRate must be non-negative");
        }
        this.drainRate = drainRate;
        return this;
    }

    public void save(Consumer<FinishedRecipe> provider) {
        Objects.requireNonNull(input, "Missing input for " + id);
        if (output.isEmpty()) {
            throw new IllegalStateException("Missing output for " + id);
        }
        final var recipe = wayoftime.bloodmagic.common.data.recipe.builder.BloodAltarRecipeBuilder.altar(input, output,
                minimumTier, syphon, consumeRate, drainRate);
        recipe.build(provider, id);
    }
}
