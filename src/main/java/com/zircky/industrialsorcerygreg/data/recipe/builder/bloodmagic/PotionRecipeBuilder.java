package com.zircky.industrialsorcerygreg.data.recipe.builder.bloodmagic;

import com.zircky.industrialsorcerygreg.ISGCore;

import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

public final class PotionRecipeBuilder {

    private final ResourceLocation id;
    private MobEffect effect;
    private int baseDuration;
    private int syphon;
    private int ticks;
    private int minimumTier;
    private static final int MAX_INGREDIENTS = 5;
    private final List<Ingredient> ingredients = new ArrayList<>();

    public static PotionRecipeBuilder builder(String name) {
        return new PotionRecipeBuilder(ISGCore.id("potion/" + name));
    }

    private PotionRecipeBuilder(ResourceLocation id) {
        this.id = id;
    }

    public PotionRecipeBuilder effect(MobEffect effect) {
        this.effect = Objects.requireNonNull(effect);
        return this;
    }

    public PotionRecipeBuilder baseDuration(int baseDuration) {
        if (baseDuration < 0) {
            throw new IllegalArgumentException("baseDuration must be non-negative");
        }
        this.baseDuration = baseDuration;
        return this;
    }

    public PotionRecipeBuilder syphon(int syphon) {
        if (syphon < 0) {
            throw new IllegalArgumentException("syphon must be non-negative");
        }
        this.syphon = syphon;
        return this;
    }

    public PotionRecipeBuilder ticks(int ticks) {
        if (ticks < 0) {
            throw new IllegalArgumentException("ticks must be non-negative");
        }
        this.ticks = ticks;
        return this;
    }

    public PotionRecipeBuilder minimumTier(int minimumTier) {
        if (minimumTier < 0) {
            throw new IllegalArgumentException("minimumTier must be non-negative");
        }
        this.minimumTier = minimumTier;
        return this;
    }

    public PotionRecipeBuilder addIngredient(Ingredient ingredient) {
        if (ingredients.size() >= MAX_INGREDIENTS) {
            throw new IllegalStateException("Too many ingredients for " + id);
        }
        ingredients.add(Objects.requireNonNull(ingredient));
        return this;
    }

    public PotionRecipeBuilder addIngredient(ItemLike item) {
        return addIngredient(Ingredient.of(item));
    }

    public PotionRecipeBuilder addIngredient(TagKey<Item> tag) {
        return addIngredient(Ingredient.of(tag));
    }

    public void save(Consumer<FinishedRecipe> provider) {
        Objects.requireNonNull(effect, "Missing effect for " + id);
        if (ingredients.isEmpty()) {
            throw new IllegalStateException("Missing ingredients for " + id);
        }
        final var recipe = wayoftime.bloodmagic.common.data.recipe.builder.PotionEffectRecipeBuilder
                .potionEffect(effect, baseDuration, syphon, ticks, minimumTier);
        for (final Ingredient ingredient : ingredients) {
            recipe.addIngredient(ingredient);
        }
        recipe.build(provider, id);
    }
}
