package com.zircky.industrialsorcerygreg.data.recipe.builder.bloodmagic;

import com.zircky.industrialsorcerygreg.ISGCore;

import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

public final class AlchemyTableRecipeBuilder {

    private final ResourceLocation id;
    private ItemStack output = ItemStack.EMPTY;
    private int syphon;
    private int ticks;
    private int minimumTier;
    private static final int MAX_INGREDIENTS = 6;
    private final List<Ingredient> ingredients = new ArrayList<>();

    public static AlchemyTableRecipeBuilder builder(String name) {
        return new AlchemyTableRecipeBuilder(ISGCore.id("alchemy_table/" + name));
    }

    private AlchemyTableRecipeBuilder(ResourceLocation id) {
        this.id = id;
    }

    public AlchemyTableRecipeBuilder output(ItemStack output) {
        this.output = Objects.requireNonNull(output).copy();
        return this;
    }

    public AlchemyTableRecipeBuilder output(ItemLike item) {
        return output(new ItemStack(item));
    }

    public AlchemyTableRecipeBuilder syphon(int syphon) {
        if (syphon < 0) {
            throw new IllegalArgumentException("syphon must be non-negative");
        }
        this.syphon = syphon;
        return this;
    }

    public AlchemyTableRecipeBuilder ticks(int ticks) {
        if (ticks < 0) {
            throw new IllegalArgumentException("ticks must be non-negative");
        }
        this.ticks = ticks;
        return this;
    }

    public AlchemyTableRecipeBuilder minimumTier(int minimumTier) {
        if (minimumTier < 0) {
            throw new IllegalArgumentException("minimumTier must be non-negative");
        }
        this.minimumTier = minimumTier;
        return this;
    }

    public AlchemyTableRecipeBuilder addIngredient(Ingredient ingredient) {
        if (ingredients.size() >= MAX_INGREDIENTS) {
            throw new IllegalStateException("Too many ingredients for " + id);
        }
        ingredients.add(Objects.requireNonNull(ingredient));
        return this;
    }

    public AlchemyTableRecipeBuilder addIngredient(ItemLike item) {
        return addIngredient(Ingredient.of(item));
    }

    public AlchemyTableRecipeBuilder addIngredient(TagKey<Item> tag) {
        return addIngredient(Ingredient.of(tag));
    }

    public void save(Consumer<FinishedRecipe> provider) {
        if (output.isEmpty()) {
            throw new IllegalStateException("Missing output for " + id);
        }
        if (ingredients.isEmpty()) {
            throw new IllegalStateException("Missing ingredients for " + id);
        }
        final var recipe = wayoftime.bloodmagic.common.data.recipe.builder.AlchemyTableRecipeBuilder
                .alchemyTable(output, syphon, ticks, minimumTier);
        for (final Ingredient ingredient : ingredients) {
            recipe.addIngredient(ingredient);
        }
        recipe.build(provider, id);
    }
}
