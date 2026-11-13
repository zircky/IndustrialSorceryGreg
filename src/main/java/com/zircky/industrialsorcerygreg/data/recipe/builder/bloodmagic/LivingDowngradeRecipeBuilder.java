package com.zircky.industrialsorcerygreg.data.recipe.builder.bloodmagic;

import com.zircky.industrialsorcerygreg.ISGCore;

import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.Objects;
import java.util.function.Consumer;

public final class LivingDowngradeRecipeBuilder {

    private final ResourceLocation id;
    private Ingredient input;
    private ResourceLocation downgrade;

    public static LivingDowngradeRecipeBuilder builder(String name) {
        return new LivingDowngradeRecipeBuilder(ISGCore.id("living_downgrade/" + name));
    }

    private LivingDowngradeRecipeBuilder(ResourceLocation id) {
        this.id = id;
    }

    public LivingDowngradeRecipeBuilder input(Ingredient input) {
        this.input = Objects.requireNonNull(input);
        return this;
    }

    public LivingDowngradeRecipeBuilder input(ItemLike item) {
        return input(Ingredient.of(item));
    }

    public LivingDowngradeRecipeBuilder input(TagKey<Item> tag) {
        return input(Ingredient.of(tag));
    }

    public LivingDowngradeRecipeBuilder downgrade(ResourceLocation downgrade) {
        this.downgrade = Objects.requireNonNull(downgrade);
        return this;
    }

    public void save(Consumer<FinishedRecipe> provider) {
        Objects.requireNonNull(input, "Missing input for " + id);
        Objects.requireNonNull(downgrade, "Missing downgrade for " + id);
        final var recipe = wayoftime.bloodmagic.common.data.recipe.builder.LivingDowngradeRecipeBuilder.downgrade(input,
                downgrade);
        recipe.build(provider, id);
    }
}
