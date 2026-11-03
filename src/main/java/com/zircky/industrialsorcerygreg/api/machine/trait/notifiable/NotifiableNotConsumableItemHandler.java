package com.zircky.industrialsorcerygreg.api.machine.trait.notifiable;

import com.gregtechceu.gtceu.api.capability.recipe.IO;
import com.gregtechceu.gtceu.api.machine.trait.notifiable.NotifiableItemStackHandler;
import com.gregtechceu.gtceu.api.recipe.GTRecipe;
import com.gregtechceu.gtceu.api.recipe.ingredient.SizedIngredient;
import com.gregtechceu.gtceu.api.transfer.item.CustomItemStackHandler;
import com.zircky.industrialsorcerygreg.utils.ItemUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.IntFunction;

public class NotifiableNotConsumableItemHandler extends NotifiableItemStackHandler {
  public NotifiableNotConsumableItemHandler(int slots, IO handlerIO, IO capabilityIO, IntFunction<CustomItemStackHandler> storageFactory) {
    super(slots, handlerIO, capabilityIO, storageFactory);
  }

  public NotifiableNotConsumableItemHandler(int slots, IO capabilityIO) {
    this(slots, IO.IN, capabilityIO, CustomItemStackHandler::new);
  }

  @Override
  public boolean shouldSearchContent() {
    return false;
  }

  @Override
  public @NotNull List<Ingredient> handleRecipe(IO io, @Nullable GTRecipe recipe, List<?> left, boolean simulate) {
    return handleRecipeInner(io, recipe, (List<Ingredient>) left, simulate);
  }

  @Override
  public List<Ingredient> handleRecipeInner(IO io, @Nullable GTRecipe recipe, List<Ingredient> left, boolean simulate) {
    if (simulate && io == IO.IN) {
      left = new ObjectArrayList<>(left);
      for (var it = left.listIterator(); it.hasNext();) {
        var ingredient = it.next();
        if (ingredient.isEmpty()) {
          it.remove();
          continue;
        }
        var items = ItemUtils.getInnerIngredient(ingredient).getItems();
        if (items.length == 0 || items[0].isEmpty()) {
          it.remove();
          continue;
        }
        int amount;
        if (ingredient instanceof SizedIngredient si) amount = si.getAmount();
        else amount = items[0].getCount();
        for (int slot = 0; slot < storage.getSlots(); ++slot) {
          ItemStack stored = storage.getStackInSlot(slot);
          int count = stored.getCount();
          if (count == 0) continue;
          if (ingredient.test(stored)) {
            amount -= count;
          }
          if (amount < 1) {
            it.remove();
            break;
          }
        }
      }
    }
    return left.isEmpty() ? null : left;
  }
}
