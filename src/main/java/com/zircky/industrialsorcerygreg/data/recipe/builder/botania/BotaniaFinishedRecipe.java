package com.zircky.industrialsorcerygreg.data.recipe.builder.botania;

import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeSerializer;

import com.google.gson.JsonObject;
import org.jetbrains.annotations.Nullable;

final class BotaniaFinishedRecipe implements FinishedRecipe {

    private final ResourceLocation id;
    private final RecipeSerializer<?> serializer;
    private final JsonObject data;

    BotaniaFinishedRecipe(ResourceLocation id, RecipeSerializer<?> serializer, JsonObject data) {
        this.id = id;
        this.serializer = serializer;
        this.data = data.deepCopy();
    }

    @Override
    public void serializeRecipeData(JsonObject json) {
        for (final var entry : data.entrySet()) {
            json.add(entry.getKey(), entry.getValue().deepCopy());
        }
    }

    @Override
    public ResourceLocation getId() {
        return id;
    }

    @Override
    public RecipeSerializer<?> getType() {
        return serializer;
    }

    @Override
    public @Nullable JsonObject serializeAdvancement() {
        return null;
    }

    @Override
    public @Nullable ResourceLocation getAdvancementId() {
        return null;
    }
}
