package com.zircky.industrialsorcerygreg.data.recipe.builder.bloodmagic;

import com.zircky.industrialsorcerygreg.ISGCore;

import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import wayoftime.bloodmagic.common.meteor.MeteorLayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

public final class MeteorRecipeBuilder {

    private final ResourceLocation id;
    private Ingredient input;
    private int syphon;
    private float explosionRadius;
    private final List<MeteorLayer> layers = new ArrayList<>();

    public static MeteorRecipeBuilder builder(String name) {
        return new MeteorRecipeBuilder(ISGCore.id("meteor/" + name));
    }

    private MeteorRecipeBuilder(ResourceLocation id) {
        this.id = id;
    }

    public MeteorRecipeBuilder input(Ingredient input) {
        this.input = Objects.requireNonNull(input);
        return this;
    }

    public MeteorRecipeBuilder input(ItemLike item) {
        return input(Ingredient.of(item));
    }

    public MeteorRecipeBuilder input(TagKey<Item> tag) {
        return input(Ingredient.of(tag));
    }

    public MeteorRecipeBuilder syphon(int syphon) {
        if (syphon < 0) {
            throw new IllegalArgumentException("syphon must be non-negative");
        }
        this.syphon = syphon;
        return this;
    }

    public MeteorRecipeBuilder explosionRadius(float explosionRadius) {
        if (!Float.isFinite(explosionRadius) || explosionRadius < 0) {
            throw new IllegalArgumentException("explosionRadius must be non-negative");
        }
        this.explosionRadius = explosionRadius;
        return this;
    }

    public MeteorRecipeBuilder addLayer(MeteorLayer layer) {
        layers.add(Objects.requireNonNull(layer));
        return this;
    }

    public void save(Consumer<FinishedRecipe> provider) {
        Objects.requireNonNull(input, "Missing input for " + id);
        if (layers.isEmpty()) {
            throw new IllegalStateException("Missing meteor layers for " + id);
        }
        final var recipe = wayoftime.bloodmagic.common.data.recipe.builder.MeteorRecipeBuilder.meteor(input, syphon,
                explosionRadius);
        for (final MeteorLayer layer : layers) {
            recipe.addLayer(layer);
        }
        recipe.build(provider, id);
    }
}
