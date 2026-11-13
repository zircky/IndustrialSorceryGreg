package com.zircky.industrialsorcerygreg.data.recipe.builder.bloodmagic;

import com.zircky.industrialsorcerygreg.ISGCore;

import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.fluids.FluidStack;

import wayoftime.bloodmagic.recipe.helper.FluidStackIngredient;

import java.util.Objects;
import java.util.function.Consumer;

public final class ARCPotionRecipeBuilder {

    private final ResourceLocation id;
    private Ingredient input;
    private Ingredient tool;
    private FluidStackIngredient inputFluid;
    private ItemStack output = ItemStack.EMPTY;
    private FluidStack outputFluid;

    public static ARCPotionRecipeBuilder builder(String name) {
        return new ARCPotionRecipeBuilder(ISGCore.id("arc_potion/" + name));
    }

    private ARCPotionRecipeBuilder(ResourceLocation id) {
        this.id = id;
    }

    public ARCPotionRecipeBuilder input(Ingredient input) {
        this.input = Objects.requireNonNull(input);
        return this;
    }

    public ARCPotionRecipeBuilder input(ItemLike item) {
        return input(Ingredient.of(item));
    }

    public ARCPotionRecipeBuilder input(TagKey<Item> tag) {
        return input(Ingredient.of(tag));
    }

    public ARCPotionRecipeBuilder tool(Ingredient tool) {
        this.tool = Objects.requireNonNull(tool);
        return this;
    }

    public ARCPotionRecipeBuilder tool(ItemLike item) {
        return tool(Ingredient.of(item));
    }

    public ARCPotionRecipeBuilder tool(TagKey<Item> tag) {
        return tool(Ingredient.of(tag));
    }

    public ARCPotionRecipeBuilder inputFluid(FluidStackIngredient inputFluid) {
        this.inputFluid = Objects.requireNonNull(inputFluid);
        return this;
    }

    public ARCPotionRecipeBuilder output(ItemStack output) {
        this.output = Objects.requireNonNull(output).copy();
        return this;
    }

    public ARCPotionRecipeBuilder output(ItemLike item) {
        return output(new ItemStack(item));
    }

    public ARCPotionRecipeBuilder outputFluid(FluidStack outputFluid) {
        this.outputFluid = Objects.requireNonNull(outputFluid).copy();
        return this;
    }

    public void save(Consumer<FinishedRecipe> provider) {
        Objects.requireNonNull(input, "Missing input for " + id);
        Objects.requireNonNull(tool, "Missing tool for " + id);
        Objects.requireNonNull(inputFluid, "Missing inputFluid for " + id);
        if (output.isEmpty()) {
            throw new IllegalStateException("Missing output for " + id);
        }
        Objects.requireNonNull(outputFluid, "Missing outputFluid for " + id);
        final var recipe = wayoftime.bloodmagic.common.data.recipe.builder.ARCPotionRecipeBuilder.arc(input, tool,
                inputFluid, output, outputFluid);
        recipe.build(provider, id);
    }
}
