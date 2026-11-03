package com.zircky.industrialsorcerygreg.data.recipe.builder.botania;

import com.zircky.industrialsorcerygreg.ISGCore;

import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import mythicbotany.rune.RuneRitualRecipe;
import org.moddingx.libx.crafting.RecipeHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public final class RuneRitualRecipeBuilder {

    public static RuneRitualRecipeBuilder builder(String name) {
        return new RuneRitualRecipeBuilder(ISGCore.id("rune_ritual/" + name));
    }

    private final ResourceLocation id;
    private Ingredient centerRune;
    private final List<RuneRitualRecipe.RunePosition> runes = new ArrayList<>();
    private int mana = 0;
    private int ticks = 200;
    private final List<Ingredient> inputs = new ArrayList<>();
    private final List<ItemStack> outputs = new ArrayList<>();

    private RuneRitualRecipeBuilder(ResourceLocation id) {
        this.id = id;
    }

    public RuneRitualRecipeBuilder centerRune(Ingredient centerRune) {
        this.centerRune = centerRune;
        return this;
    }

    public RuneRitualRecipeBuilder centerRune(ItemLike centerRune) {
        return centerRune(Ingredient.of(centerRune));
    }

    public RuneRitualRecipeBuilder centerRune(TagKey<Item> centerRuneTag) {
        return centerRune(Ingredient.of(centerRuneTag));
    }

    public RuneRitualRecipeBuilder addOuterRune(Ingredient rune, int x, int z, boolean consume) {
        this.runes.add(new RuneRitualRecipe.RunePosition(rune, x, z, consume));
        return this;
    }

    public RuneRitualRecipeBuilder addOuterRune(ItemLike rune, int x, int z, boolean consume) {
        return addOuterRune(Ingredient.of(rune), x, z, consume);
    }

    public RuneRitualRecipeBuilder addOuterRune(TagKey<Item> runeTag, int x, int z, boolean consume) {
        return addOuterRune(Ingredient.of(runeTag), x, z, consume);
    }

    public RuneRitualRecipeBuilder mana(int mana) {
        this.mana = mana;
        return this;
    }

    public RuneRitualRecipeBuilder ticks(int ticks) {
        this.ticks = ticks;
        return this;
    }

    public RuneRitualRecipeBuilder addInput(Ingredient input) {
        this.inputs.add(input);
        return this;
    }

    public RuneRitualRecipeBuilder addInput(ItemLike input) {
        return addInput(Ingredient.of(input));
    }

    public RuneRitualRecipeBuilder addInput(TagKey<Item> inputTag) {
        return addInput(Ingredient.of(inputTag));
    }

    public RuneRitualRecipeBuilder addOutput(ItemStack output) {
        this.outputs.add(output);
        return this;
    }

    public RuneRitualRecipeBuilder addOutput(ItemLike output) {
        return addOutput(new ItemStack(output));
    }

    public void save(Consumer<FinishedRecipe> provider) {
        if (centerRune == null) {
            throw new IllegalStateException("符文仪式配方 " + id + " 未设置中心符文！");
        }
        if (outputs.isEmpty()) {
            throw new IllegalStateException("符文仪式配方 " + id + " 未设置输出物品！");
        }
        final var json = new JsonObject();
        json.add("center", centerRune.toJson());
        json.add("runes", serializeRunes());
        json.addProperty("mana", mana);
        json.addProperty("ticks", ticks);
        json.add("inputs", BotaniaRecipeJson.ingredients(inputs));
        final var outputArray = new JsonArray();
        for (final var output : outputs) {
            outputArray.add(RecipeHelper.serializeItemStack(output, true));
        }
        json.add("outputs", outputArray);
        provider.accept(new BotaniaFinishedRecipe(id, RuneRitualRecipe.Serializer.INSTANCE, json));
    }

    private JsonArray serializeRunes() {
        final var json = new JsonArray();
        for (final var rune : runes) {
            final var runeJson = new JsonObject();
            runeJson.add("rune", rune.getRune().toJson());
            runeJson.addProperty("x", rune.getX());
            runeJson.addProperty("z", rune.getZ());
            runeJson.addProperty("consume", rune.isConsumed());
            json.add(runeJson);
        }
        return json;
    }
}
