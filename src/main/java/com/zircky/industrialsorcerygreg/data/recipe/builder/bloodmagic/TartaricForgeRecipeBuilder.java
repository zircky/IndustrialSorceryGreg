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

public final class TartaricForgeRecipeBuilder {

    private final ResourceLocation id;
    private ItemStack output = ItemStack.EMPTY;
    private double minimumSouls;
    private double soulDrain;
    private static final int MAX_INGREDIENTS = 4;
    private final List<Ingredient> ingredients = new ArrayList<>();

    public static TartaricForgeRecipeBuilder builder(String name) {
        return new TartaricForgeRecipeBuilder(ISGCore.id("tartaric_forge/" + name));
    }

    private TartaricForgeRecipeBuilder(ResourceLocation id) {
        this.id = id;
    }

    public TartaricForgeRecipeBuilder output(ItemStack output) {
        this.output = Objects.requireNonNull(output).copy();
        return this;
    }

    public TartaricForgeRecipeBuilder output(ItemLike item) {
        return output(new ItemStack(item));
    }

    public TartaricForgeRecipeBuilder minimumSouls(double minimumSouls) {
        if (!Double.isFinite(minimumSouls) || minimumSouls < 0) {
            throw new IllegalArgumentException("minimumSouls must be non-negative");
        }
        this.minimumSouls = minimumSouls;
        return this;
    }

    public TartaricForgeRecipeBuilder soulDrain(double soulDrain) {
        if (!Double.isFinite(soulDrain) || soulDrain < 0) {
            throw new IllegalArgumentException("soulDrain must be non-negative");
        }
        this.soulDrain = soulDrain;
        return this;
    }

    public TartaricForgeRecipeBuilder addIngredient(Ingredient ingredient) {
        if (ingredients.size() >= MAX_INGREDIENTS) {
            throw new IllegalStateException("Too many ingredients for " + id);
        }
        ingredients.add(Objects.requireNonNull(ingredient));
        return this;
    }

    public TartaricForgeRecipeBuilder addIngredient(ItemLike item) {
        return addIngredient(Ingredient.of(item));
    }

    public TartaricForgeRecipeBuilder addIngredient(TagKey<Item> tag) {
        return addIngredient(Ingredient.of(tag));
    }

    public void save(Consumer<FinishedRecipe> provider) {
        if (output.isEmpty()) {
            throw new IllegalStateException("Missing output for " + id);
        }
        if (ingredients.isEmpty()) {
            throw new IllegalStateException("Missing ingredients for " + id);
        }
        final var recipe = wayoftime.bloodmagic.common.data.recipe.builder.TartaricForgeRecipeBuilder
                .tartaricForge(ingredients, output, minimumSouls, soulDrain);
        recipe.build(provider, id);
    }
}
