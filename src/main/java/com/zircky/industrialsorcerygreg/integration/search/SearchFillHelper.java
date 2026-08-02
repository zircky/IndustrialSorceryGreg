package com.zircky.industrialsorcerygreg.integration.search;

import java.util.Optional;

import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;

import dev.emi.emi.api.stack.EmiIngredient;
import dev.emi.emi.api.stack.EmiStack;

public final class SearchFillHelper {

  private SearchFillHelper() {}

  public static Optional<String> carriedItemName() {
    LocalPlayer player = Minecraft.getInstance().player;
    if (player == null) return Optional.empty();

    ItemStack carried = player.containerMenu.getCarried();
    if (!carried.isEmpty()) return itemName(carried);

    ItemStack mainHand = player.getMainHandItem();
    if (!mainHand.isEmpty()) return itemName(mainHand);

    ItemStack offHand = player.getOffhandItem();
    if (!offHand.isEmpty()) return itemName(offHand);

    return Optional.empty();
  }

  public static Optional<String> emiIngredientName(EmiIngredient ingredient) {
    if (ingredient == null || ingredient.isEmpty()) return Optional.empty();

    for (EmiStack stack : ingredient.getEmiStacks()) {
      if (!stack.isEmpty()) {
        Component name = stack.getName();
        String text = name.getString().trim();
        if (!text.isEmpty()) return Optional.of(text);
      }
    }

    return Optional.empty();
  }

  private static Optional<String> itemName(ItemStack stack) {
    String text = stack.getHoverName().getString().trim();
    return text.isEmpty() ? Optional.empty() : Optional.of(text);
  }
}
