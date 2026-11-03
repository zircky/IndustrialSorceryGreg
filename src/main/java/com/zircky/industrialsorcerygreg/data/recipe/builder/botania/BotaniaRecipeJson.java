package com.zircky.industrialsorcerygreg.data.recipe.builder.botania;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;

import com.google.gson.JsonArray;
import vazkii.botania.common.helper.ItemNBTHelper;

final class BotaniaRecipeJson {

    private BotaniaRecipeJson() {}

    static JsonArray ingredients(Iterable<Ingredient> ingredients) {
        final var json = new JsonArray();
        for (final var ingredient : ingredients) {
            json.add(ingredient.toJson());
        }
        return json;
    }

    static JsonArray outputs(Iterable<ItemStack> outputs) {
        final var json = new JsonArray();
        for (final var output : outputs) {
            json.add(ItemNBTHelper.serializeStack(output));
        }
        return json;
    }
}
