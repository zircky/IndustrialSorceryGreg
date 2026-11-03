package com.zircky.industrialsorcerygreg.api.machine.trait.notifiable;

import com.gregtechceu.gtceu.api.capability.IControllable;
import com.gregtechceu.gtceu.api.capability.recipe.IO;
import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.recipe.GTRecipe;
import com.zircky.industrialsorcerygreg.api.data.tag.ISGTagPrefix;
import com.zircky.industrialsorcerygreg.api.recipe.FastSizedIngredient;
import com.zircky.industrialsorcerygreg.common.data.ISGItems;
import com.zircky.industrialsorcerygreg.utils.ItemUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.core.Direction;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class NotifiableCatalystHandler extends NotifiableNotConsumableItemHandler{
  private final boolean damage;

  public NotifiableCatalystHandler(int slots, boolean damage) {
    super(slots, IO.BOTH);
    this.damage = damage;
    setFilter(i -> ChemicalHelper.getPrefix(i.getItem()) == ISGTagPrefix.CATALYST || i.is(ISGItems.CATALYST_BASE.get()));
  }

  @Override
  public List<Object> getContents() {
    List stacks = new ArrayList<>();
    if (getMachine() instanceof IControllable controllable && controllable.isWorkingEnabled()) {
      for (int i = 0; i < getSlots(); ++i) {
        ItemStack stack = getStackInSlot(i);
        if (!stack.isEmpty()) {
          Item item = stack.getItem();
          int damage = 10000 - stack.getDamageValue();
          stacks.add(new ItemStack(item, damage * damage));
        }
      }
    }
    return stacks;
  }

  @Override
  public double getTotalContentAmount() {
    long amount = 0;
    if (getMachine() instanceof IControllable controllable && controllable.isWorkingEnabled()) {
      for (int i = 0; i < getSlots(); ++i) {
        ItemStack stack = getStackInSlot(i);
        if (!stack.isEmpty()) {
          long damage = 10000 - stack.getDamageValue();
          amount += damage * damage;
        }
      }
    }
    return amount;
  }

  @Override
  public void importFromNearby(Direction... facings) {}

  @Override
  public List<Ingredient> handleRecipeInner(IO io, GTRecipe recipe, List<Ingredient> left, boolean simulate) {
    if (io == IO.IN && getMachine() instanceof IControllable controllable && controllable.isWorkingEnabled()) {
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
        int count;
        if (ingredient instanceof FastSizedIngredient si) count = si.getAmount();
        else count = items[0].getCount();
        for (int slot = 0; slot < storage.getSlots(); ++slot) {
          ItemStack stored = storage.getStackInSlot(slot);
          if (items[0].is(stored.getItem())) {
            int damageValue = stored.getDamageValue();
            if (damageValue > 9999) {
              storage.setStackInSlot(slot, ISGItems.CATALYST_BASE.asStack());
              continue;
            }
            int amount = Math.min((int) Math.ceil(Math.sqrt(count)), 10000 - damageValue);
            if (!simulate && damage) stored.setDamageValue(damageValue + amount);
            count = count - amount * amount;
            if (count < 1) {
              it.remove();
              break;
            }
          }
        }
      }
    }
    return left;
  }
}
