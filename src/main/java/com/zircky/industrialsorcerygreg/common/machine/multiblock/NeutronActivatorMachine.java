package com.zircky.industrialsorcerygreg.common.machine.multiblock;

import com.gregtechceu.gtceu.api.blockentity.BlockEntityCreationInfo;
import com.gregtechceu.gtceu.api.capability.recipe.EURecipeCapability;
import com.gregtechceu.gtceu.api.capability.recipe.IO;
import com.gregtechceu.gtceu.api.capability.recipe.ItemRecipeCapability;
import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.machine.ConditionalSubscriptionHandler;
import com.gregtechceu.gtceu.api.machine.MetaMachine;
import com.gregtechceu.gtceu.api.machine.multiblock.WorkableMultiblockMachine;
import com.gregtechceu.gtceu.api.machine.trait.recipe.RecipeLogic;
import com.gregtechceu.gtceu.api.recipe.GTRecipe;
import com.gregtechceu.gtceu.api.recipe.content.Content;
import com.gregtechceu.gtceu.api.recipe.modifier.ModifierFunction;
import com.gregtechceu.gtceu.api.recipe.modifier.RecipeModifier;
import com.gregtechceu.gtceu.api.sync_system.annotations.SaveField;
import com.gregtechceu.gtceu.api.sync_system.annotations.SyncToClient;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.common.machine.multiblock.part.ItemBusPartMachine;
import com.gregtechceu.gtceu.utils.FormattingUtil;
import com.zircky.industrialsorcerygreg.common.data.ISGItems;
import com.zircky.industrialsorcerygreg.common.data.recipe.NeutronActivatorCondition;
import com.zircky.industrialsorcerygreg.common.machine.multiblock.part.NeutronAcceleratorPartMachine;
import com.zircky.industrialsorcerygreg.common.machine.multiblock.part.SensorPartMachine;
import brachy.modularui.api.drawable.Text;
import brachy.modularui.api.widget.IWidget;
import brachy.modularui.value.sync.PanelSyncManager;
import lombok.Getter;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import static com.gregtechceu.gtceu.utils.GTUtil.doExplosion;

public class NeutronActivatorMachine extends WorkableMultiblockMachine {

  int height;
  @Getter
  @SaveField
  @SyncToClient
  protected int eV;

  @SaveField
  private boolean isWorking = false;
  private int currentRecipeEnergyConsumption;

  private final ConditionalSubscriptionHandler neutronEnergySubs = new ConditionalSubscriptionHandler(this, this::neutronEnergyUpdate, () -> isFormed);
  private final ConditionalSubscriptionHandler moderateSubs = new ConditionalSubscriptionHandler(this, this::moderateUpdate, () -> eV > 0);
  private final ConditionalSubscriptionHandler absorptionSubs = new ConditionalSubscriptionHandler(this, this::absorptionUpdate, () -> eV > 0);

  private Set<SensorPartMachine> sensorPartMachines;
  private Set<ItemBusPartMachine> busPartMachines;
  private Set<NeutronAcceleratorPartMachine> acceleratorPartMachines;

  public NeutronActivatorMachine(BlockEntityCreationInfo info) {
    super(info);
  }

  public NeutronActivatorMachine(BlockEntityCreationInfo info, RecipeLogic recipeLogic) {
    super(info, recipeLogic);
  }

  @Override
  public void formStructure(String name) {
    super.formStructure(name);
//    height = NNPredicates.neutronActivator.getInt(matchContext);

    final var parts = getParts();
    for (final var part : parts) {
      final IO io = IO.BOTH;
      for (final var handlerList : part.getRecipeHandlers()) {
        if (!handlerList.isValid(io)) {
          continue;
        }

        traitSubscriptions.add(
            handlerList.subscribe(neutronEnergySubs::updateSubscription, EURecipeCapability.CAP)
        );
        traitSubscriptions.add(
            handlerList.subscribe(moderateSubs::updateSubscription, EURecipeCapability.CAP)
        );
        traitSubscriptions.add(
            handlerList.subscribe(absorptionSubs::updateSubscription, ItemRecipeCapability.CAP)
        );
      }

      if (part instanceof ItemBusPartMachine busPart) {
        if (busPartMachines == null) {
          busPartMachines = new HashSet<>();
        }
        busPartMachines.add(busPart);
      }

      if (part instanceof SensorPartMachine sensorMachine) {
        if (sensorPartMachines == null) {
          sensorPartMachines = new HashSet<>();
        }
        sensorPartMachines.add(sensorMachine);
      }

      if (part instanceof NeutronAcceleratorPartMachine acceleratorMachine) {
        if (acceleratorPartMachines == null) {
          acceleratorPartMachines = new HashSet<>();
        }
        acceleratorPartMachines.add(acceleratorMachine);
      }
    }

    neutronEnergySubs.initialize(level);
  }

  @Override
  public void onLoad() {
    super.onLoad();
    moderateSubs.initialize(level);
  }

  @Override
  public void invalidateStructure(String name) {
    super.invalidateStructure(name);
    height = 0;
    currentRecipeEnergyConsumption = 0;
    sensorPartMachines = null;
    busPartMachines = null;
    acceleratorPartMachines = null;
  }

  private void neutronEnergyUpdate() {
    if (acceleratorPartMachines == null) return;

    boolean anyWorking = false;
    for (final NeutronAcceleratorPartMachine accelerator: acceleratorPartMachines) {
      final long increase = accelerator.consumeEnergy();
      if (increase > 0) {
        anyWorking = true;
        eV += (int) Math.round(Math.max(increase * getEfficiencyFactor(), 1.0D));
      }
    }

    isWorking = anyWorking;

    if (eV > MAX_ENERGY) {
      doExplosion(getLevel(), getBlockPos(), 4F * 32F);
    }

    if (!isWorking) {
      neutronEnergySubs.unsubscribe();
    }
  }

  private void moderateUpdate() {
    if (!isWorking && getOffsetTimer() % 20L == 0L) {
      eV = Math.max(eV - 72 * K, 0);
    }

    if (eV < 0) {
      eV = 0;
    }

    if (!isFormed() || sensorPartMachines == null) return;

    for (final SensorPartMachine senser : sensorPartMachines) {
      senser.update(eV);
    }
  }

  private void absorptionUpdate() {
    if (busPartMachines == null || eV <= 0) return;

    boolean hasSlower = false;
    final Item dustBeryllium = ChemicalHelper.get(TagPrefix.dust, GTMaterials.Beryllium).getItem();
    final Item dustGraphite = ChemicalHelper.get(TagPrefix.dust, GTMaterials.Graphite).getItem();

    for (final ItemBusPartMachine bus : busPartMachines) {
      final var inv = bus.getInventory();
      final IO io = inv.getHandlerIO();

      if (io != IO.IN && io != IO.BOTH) continue;

      for (int i = 0; i < inv.getSlots(); i++) {
        final ItemStack stack = inv.getStackInSlot(i);
        if (stack.is(dustBeryllium) || stack.is(dustGraphite)) {
          hasSlower = true;

          final int consume = Math.min(
              Math.max(eV / (10 * M), 1),
              stack.getCount()
          );

          inv.extractItemInternal(i, consume, false);
          eV -= 10 * M * consume;
        }
      }
    }

    if (!hasSlower) {
      absorptionSubs.unsubscribe();
    }
  }

  private String processNumber(final int num) {
    float value = num / 1000F;
    if (value <= 0) {
      return String.format("%d", num);
    }
    if (value < 1000.0F) {
      return String.format("%.1fK", value);
    }

    value /= 1000F;
    return String.format("%.1fM", value);
  }

  @Override
  public List<IWidget> getWidgetsForDisplay(PanelSyncManager syncManager) {
    List<IWidget> widgets = new ArrayList<>(super.getWidgetsForDisplay(syncManager));
    widgets.add(Text.dynamic(() -> Component.translatable(
        "isgcore.multiblock.neutronactivator.ev", processNumber(eV))
        .withStyle(ChatFormatting.WHITE)).asWidget());
    widgets.add(Text.dynamic(() -> Component.translatable(
        "isgcore.multiblock.neutronactivator.height", FormattingUtil.formatNumbers(height))
        .withStyle(ChatFormatting.WHITE)).asWidget());
    widgets.add(Text.dynamic(() -> Component.translatable(
        "isgcore.multiblock.neutronactivator.efficiency",
        FormattingUtil.formatNumbers(getEfficiencyFactor() * 100))
        .withStyle(ChatFormatting.WHITE)).asWidget());
    return widgets;
  }

  private double getVelocityFactor() {
    return Math.pow(0.9D, Math.max(height - 4, 0));
  }

  private double getEfficiencyFactor() {
    return Math.pow(0.95D, Math.max(height - 4, 0));
  }

//  @Override
  public boolean alwaysTryModifyRecipe() {
    return true;
  }

  @Override
  public boolean beforeWorking(GTRecipe recipe) {
    if (!super.beforeWorking(recipe)) {
      return false;
    }
    currentRecipeEnergyConsumption = getRecipeEnergyConsumption(recipe);
    return true;
  }

  @Override
  public boolean onWorking() {
    if (!super.onWorking()) {
      return false;
    }
    if (currentRecipeEnergyConsumption > 0) {
      eV = Math.max(eV - currentRecipeEnergyConsumption, 0);
    }
    return true;
  }

  public static ModifierFunction recipeModifier(final MetaMachine machine, final GTRecipe recipe) {
    if (!(machine instanceof NeutronActivatorMachine neutronActivator)) {
      return RecipeModifier.nullWrongType(NeutronActivatorMachine.class, machine);
    }
    return neutronActivator::modifyRecipe;
  }

  private GTRecipe modifyRecipe(final GTRecipe recipe) {
    final GTRecipe newRecipe = recipe.copy();
    newRecipe.duration = (int) Math.round(Math.max(newRecipe.duration * getVelocityFactor(), 1.0D));

    final int minMeV = getMinRecipeEnergyMeV(recipe);
    final int maxMeV = getMaxRecipeEnergyMeV(recipe);
    if (maxMeV > 0) {
      final int minRange = minMeV * M;
      final int maxRange = maxMeV * M;

      if (eV > maxRange || eV < minRange) {
        newRecipe.outputs.clear();
        newRecipe.outputs.put(
            ItemRecipeCapability.CAP,
            List.of(new Content(Ingredient.of(ISGItems.RADIOACTIVE_WASTE), 1, 1))
        );
      }
    }
    return newRecipe;
  }

  public static boolean checkNeutronActivatorCondition(final MetaMachine metaMachine, final GTRecipe recipe) {
    return metaMachine instanceof NeutronActivatorMachine
        && (hasNeutronActivatorData(recipe) || getLegacyCondition(recipe).isPresent());
  }

  private static boolean hasNeutronActivatorData(final GTRecipe recipe) {
    return recipe.data.contains(NeutronActivatorCondition.KEY_EV_MIN)
        || recipe.data.contains(NeutronActivatorCondition.KEY_EV_MAX)
        || recipe.data.contains(NeutronActivatorCondition.KEY_EVT);
  }

  private static int getMinRecipeEnergyMeV(final GTRecipe recipe) {
    if (recipe.data.contains(NeutronActivatorCondition.KEY_EV_MIN)) {
      return recipe.data.getInt(NeutronActivatorCondition.KEY_EV_MIN);
    }
    return getLegacyCondition(recipe)
        .map(condition -> condition.getEvRange() % 10000)
        .orElse(0);
  }

  private static int getMaxRecipeEnergyMeV(final GTRecipe recipe) {
    if (recipe.data.contains(NeutronActivatorCondition.KEY_EV_MAX)) {
      return recipe.data.getInt(NeutronActivatorCondition.KEY_EV_MAX);
    }
    return getLegacyCondition(recipe)
        .map(condition -> condition.getEvRange() / 10000)
        .orElse(0);
  }

  private static int getRecipeEnergyConsumption(final GTRecipe recipe) {
    if (recipe.data.contains(NeutronActivatorCondition.KEY_EVT)) {
      return Math.max(recipe.data.getInt(NeutronActivatorCondition.KEY_EVT), 0);
    }
    return 0;
  }

  private static Optional<NeutronActivatorCondition> getLegacyCondition(final GTRecipe recipe) {
    return recipe.conditions.stream()
        .filter(NeutronActivatorCondition.class::isInstance)
        .map(NeutronActivatorCondition.class::cast)
        .findFirst();
  }

  private static final int M = 1_000_000;
  private static final int K = 1_000;
  private static final int MAX_ENERGY = 1200 * M;
}
