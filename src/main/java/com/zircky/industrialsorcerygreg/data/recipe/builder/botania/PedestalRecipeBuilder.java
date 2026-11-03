package com.zircky.industrialsorcerygreg.data.recipe.builder.botania;

import com.zircky.industrialsorcerygreg.ISGCore;

import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import com.google.gson.JsonObject;
import io.github.lounode.extrabotany.common.crafting.ExtraBotanyRecipeTypes;
import vazkii.botania.common.helper.ItemNBTHelper;

import java.util.function.Consumer;

public final class PedestalRecipeBuilder {

    public static PedestalRecipeBuilder builder(String name) {
        return new PedestalRecipeBuilder(ISGCore.id("pedestal/" + name));
    }

    private final ResourceLocation id;
    private ItemStack output;
    private Ingredient input;
    private Ingredient smashTools;
    private int strike = 1;
    private int exp = 0;

    private PedestalRecipeBuilder(ResourceLocation id) {
        this.id = id;
    }

    public PedestalRecipeBuilder output(ItemLike output) {
        return output(new ItemStack(output));
    }

    public PedestalRecipeBuilder output(ItemStack output) {
        this.output = output;
        return this;
    }

    public PedestalRecipeBuilder input(Ingredient input) {
        this.input = input;
        return this;
    }

    public PedestalRecipeBuilder input(ItemLike item) {
        return input(Ingredient.of(item));
    }

    public PedestalRecipeBuilder input(TagKey<Item> tag) {
        return input(Ingredient.of(tag));
    }

    public PedestalRecipeBuilder smashTools(Ingredient smashTools) {
        this.smashTools = smashTools;
        return this;
    }

    public PedestalRecipeBuilder smashTools(ItemLike item) {
        return smashTools(Ingredient.of(item));
    }

    public PedestalRecipeBuilder smashTools(TagKey<Item> tag) {
        return smashTools(Ingredient.of(tag));
    }

    public PedestalRecipeBuilder strike(int strike) {
        this.strike = strike;
        return this;
    }

    public PedestalRecipeBuilder exp(int exp) {
        this.exp = exp;
        return this;
    }

    public void save(Consumer<FinishedRecipe> provider) {
        if (output == null) {
            throw new IllegalStateException("No output specified for pedestal recipe");
        }
        if (input == null) {
            throw new IllegalStateException("No input specified for pedestal recipe");
        }
        if (smashTools == null) {
            throw new IllegalStateException("No smash tools specified for pedestal recipe");
        }
        final var json = new JsonObject();
        json.add("input", input.toJson());
        json.add("output", ItemNBTHelper.serializeStack(output));
        json.add("smash_tools", smashTools.toJson());
        json.addProperty("strike", strike);
        json.addProperty("exp", exp);
        provider.accept(new BotaniaFinishedRecipe(id, ExtraBotanyRecipeTypes.PEDESTAL_SMASH_SERIALIZER, json));
    }
}
