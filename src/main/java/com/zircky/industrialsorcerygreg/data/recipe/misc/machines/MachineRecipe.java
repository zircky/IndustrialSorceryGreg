package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import com.gregtechceu.gtceu.api.machine.MachineDefinition;
import com.gregtechceu.gtceu.data.recipe.CraftingComponent;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import com.tterrag.registrate.util.entry.ItemProviderEntry;
import com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes;
import com.zircky.industrialsorcerygreg.common.data.machines.ISGSimpleMachines;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

import java.util.Arrays;
import java.util.function.Consumer;

import static com.gregtechceu.gtceu.data.recipe.GTCraftingComponents.*;

public class MachineRecipe {
  private MachineRecipe() {
    /* This utility class should not be instantiated */
  }

  public static void init(Consumer<FinishedRecipe> provider) {
    registerMachineRecipe(provider, ISGSimpleMachines.DEHYDRATOR, "WCW", "AMA", "PRP", 'M', HULL, 'P', PLATE, 'C',
        CIRCUIT, 'W', WIRE_QUAD, 'R', ROBOT_ARM, 'A', CABLE_QUAD);
    registerMachineRecipe(provider, ISGSimpleMachines.UNPACKER, "WCW", "VMR", "BCB", 'M', HULL, 'R', ROBOT_ARM, 'V',
        CONVEYOR, 'C', CIRCUIT, 'W', CABLE, 'B', Tags.Items.CHESTS_WOODEN);
    registerMachineRecipe(provider, ISGSimpleMachines.CLUSTER, "MMM", "CHC", "MMM", 'H', HULL, 'M', MOTOR, 'C', CIRCUIT);
    registerMachineRecipe(provider, ISGSimpleMachines.ROLLING, "EWE", "CMC", "PWP", 'M', HULL, 'E', MOTOR, 'P', PISTON, 'C',
        CIRCUIT, 'W', CABLE);
    registerMachineRecipe(provider, ISGSimpleMachines.LAMINATOR, "WPW", "CMC", "GGG", 'M', HULL, 'P', PUMP, 'C', CIRCUIT, 'W',
        CABLE, 'G', CONVEYOR);
    registerMachineRecipe(provider, ISGSimpleMachines.LOOM, "CWC", "EME", "EWE", 'M', HULL, 'E', MOTOR, 'C', CIRCUIT,
        'W', CABLE);
    registerMachineRecipe(provider, ISGSimpleMachines.LASER_WELDER, "WEW", "CMC", "PPP", 'M', HULL, 'P', PLATE, 'C', CIRCUIT, 'E', EMITTER, 'W', CABLE);

  }

  // Can only accept a subset of "Item" types:
  // - ItemStack
  // - Item
  // - Block
  // - ItemEntry<?> (like GTItems)
  // - CraftingComponent.Component
  // - MaterialEntry
  // - TagKey<?>
  public static void registerMachineRecipe(Consumer<FinishedRecipe> provider, boolean setMaterialInfoData,
                                           MachineDefinition[] machines, Object... recipe) {
    for (MachineDefinition machine : machines) {

      // Needed to skip certain tiers if not enabled.
      // Leaves UHV+ machine recipes to be implemented by addons.
      if (machine != null) {
        Object[] prepRecipe = prepareRecipe(machine.getTier(), Arrays.copyOf(recipe, recipe.length));
        if (prepRecipe == null) {
          return;
        }
        VanillaRecipeHelper.addShapedRecipe(provider, setMaterialInfoData, machine.getName(), machine.asStack(),
            prepRecipe);
      }
    }
  }

  public static void registerMachineRecipe(Consumer<FinishedRecipe> provider, MachineDefinition[] machines,
                                           Object... recipe) {
    registerMachineRecipe(provider, true, machines, recipe);
  }

  private static Object[] prepareRecipe(int tier, Object... recipe) {
    for (int i = 3; i < recipe.length; i++) {
      if (recipe[i] instanceof CraftingComponent) {
        Object component = ((CraftingComponent) recipe[i]).get(tier);
        recipe[i] = component;
      } else if (recipe[i] instanceof Item item) {
        recipe[i] = new ItemStack(item);
      } else if (recipe[i] instanceof Block block) {
        recipe[i] = new ItemStack(block);
      } else if (recipe[i] instanceof ItemProviderEntry<?> itemEntry) {
        recipe[i] = itemEntry.asStack();
      }
    }
    return recipe;
  }
}
