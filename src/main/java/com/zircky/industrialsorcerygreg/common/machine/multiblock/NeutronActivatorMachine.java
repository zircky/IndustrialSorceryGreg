package com.zircky.industrialsorcerygreg.common.machine.multiblock;

import com.gregtechceu.gtceu.api.blockentity.BlockEntityCreationInfo;
import com.gregtechceu.gtceu.api.capability.recipe.EURecipeCapability;
import com.gregtechceu.gtceu.api.capability.recipe.IO;
import com.gregtechceu.gtceu.api.capability.recipe.ItemRecipeCapability;
import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.gui.GuiTextures;
import com.gregtechceu.gtceu.api.gui.fancy.TooltipsPanel;
import com.gregtechceu.gtceu.api.machine.ConditionalSubscriptionHandler;
import com.gregtechceu.gtceu.api.machine.MetaMachine;
import com.gregtechceu.gtceu.api.machine.feature.IFancyUIMachine;
import com.gregtechceu.gtceu.api.machine.feature.multiblock.IDisplayUIMachine;
import com.gregtechceu.gtceu.api.machine.multiblock.WorkableMultiblockMachine;
import com.gregtechceu.gtceu.api.machine.trait.RecipeLogic;
import com.gregtechceu.gtceu.api.recipe.GTRecipe;
import com.gregtechceu.gtceu.api.recipe.content.Content;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.common.machine.multiblock.part.ItemBusPartMachine;
import com.gregtechceu.gtceu.utils.FormattingUtil;
import com.lowdragmc.lowdraglib.gui.modular.ModularUI;
import com.lowdragmc.lowdraglib.gui.widget.*;
import com.lowdragmc.lowdraglib.syncdata.annotation.DescSynced;
import com.lowdragmc.lowdraglib.syncdata.annotation.Persisted;
import com.zircky.industrialsorcerygreg.common.data.ISGItems;
import com.zircky.industrialsorcerygreg.common.data.recipe.NeutronActivatorCondition;
import com.zircky.industrialsorcerygreg.common.machine.multiblock.part.NeutronAcceleratorPartMachine;
import com.zircky.industrialsorcerygreg.common.machine.multiblock.part.SensorPartMachine;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMaps;
import lombok.Getter;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.HoverEvent;
import net.minecraft.network.chat.Style;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

import static com.gregtechceu.gtceu.utils.GTUtil.doExplosion;

public class NeutronActivatorMachine extends WorkableMultiblockMachine implements IFancyUIMachine, IDisplayUIMachine {

  int height;
  @Getter
  @Persisted
  @DescSynced
  protected int eV;

  @Persisted
  private boolean isWorking = false;

  private final ConditionalSubscriptionHandler neutronEnergySubs = new ConditionalSubscriptionHandler(this, this::neutronEnergyUpdate, () -> isFormed);
  private final ConditionalSubscriptionHandler moderateSubs = new ConditionalSubscriptionHandler(this, this::moderateUpdate, () -> eV > 0);
  private final ConditionalSubscriptionHandler absorptionSubs = new ConditionalSubscriptionHandler(this, this::absorptionUpdate, () -> eV > 0);

  private Set<SensorPartMachine> sensorPartMachines;
  private Set<ItemBusPartMachine> busPartMachines;
  private Set<NeutronAcceleratorPartMachine> acceleratorPartMachines;

  public NeutronActivatorMachine(BlockEntityCreationInfo info, Function<WorkableMultiblockMachine, RecipeLogic> recipeLogicSupplier) {
    super(info, recipeLogicSupplier);
  }

  @Override
  public void onStructureFormed() {
    super.onStructureFormed();

    final var matchContext = getMultiblockState().getMatchContext();
    final Long2ObjectMap<Object> ioMap =
        matchContext.getOrCreate("ioMap", Long2ObjectMaps::emptyMap);

//    height = NNPredicates.neutronActivator.getInt(matchContext);

    final var parts = getParts();
    for (final var part : parts) {
      final Object ioObject = ioMap.getOrDefault(part.self().getBlockPos().asLong(), IO.BOTH);
      if (ioObject == IO.NONE) {
        continue;
      }

      final IO io = (IO) ioObject;
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
  public void onStructureInvalid() {
    super.onStructureInvalid();
    height = 0;
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

  @Override
  public void addDisplayText(final List<Component> textList) {
    IDisplayUIMachine.super.addDisplayText(textList);

    if (isFormed()) {
      textList.add(
          Component.translatable(getRecipeType().registryName.toLanguageKey())
              .setStyle(
                  Style.EMPTY.withColor(ChatFormatting.AQUA)
                      .withHoverEvent(new HoverEvent(
                          HoverEvent.Action.SHOW_TEXT,
                          Component.translatable("gtceu.gui.machinemode.title")
                      ))
              )
      );

      if (!isWorkingEnabled()) {
        textList.add(Component.translatable("gtceu.multiblock.work_paused"));
      } else if (isActive()) {
        textList.add(Component.translatable("gtceu.multiblock.running"));
        final int currentProgress = (int) (recipeLogic.getProgressPercent() * 100);
        textList.add(Component.translatable("gtceu.multiblock.progress", currentProgress));
      } else {
        textList.add(Component.translatable("gtceu.multiblock.idling"));
      }

      if (recipeLogic.isWorking()) {
        textList.add(Component.translatable("gtceu.multiblock.waiting").setStyle(Style.EMPTY.withColor(ChatFormatting.RED)));
      }

      textList.add(Component.translatable("industrialsorcerygreg.multiblock.neutronactivator.ev", processNumber(eV)));
      textList.add(Component.translatable("industrialsorcerygreg.multiblock.neutronactivator.ev", FormattingUtil.formatNumbers(height)));
      textList.add(Component.translatable("industrialsorcerygreg.multiblock.neutronactivator.ev", FormattingUtil.formatNumbers(getEfficiencyFactor() * 100)));
    }

    getDefinition().getAdditionalDisplay().accept(this, textList);
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
  public Widget createUIWidget() {
    final WidgetGroup group = new WidgetGroup(0, 0, 170 + 8, 129 + 8);
    final WidgetGroup container = new WidgetGroup(4, 4, 170, 129);

    container.addWidget(
        new DraggableScrollableWidgetGroup(4, 4, 162, 121)
            .setBackground(getScreenTexture())
            .addWidget(new LabelWidget(4, 5, self().getBlockState().getBlock().getDescriptionId()))
            .addWidget(
                new ComponentPanelWidget(4, 17, this::addDisplayText)
                    .setMaxWidthLimit(150)
                    .clickHandler(this::handleDisplayClick)
            )
    );
    container.setBackground(GuiTextures.BACKGROUND_INVERSE);
    group.addWidget(container);
    return group;
  }

  @Override
  public ModularUI createUI(final Player entityPlayer) {
    return IFancyUIMachine.super.createUI(entityPlayer);
  }

  @Override
  public void attachTooltips(final TooltipsPanel tooltipsPanel) {
    for (final var part : getParts()) {
      part.attachFancyTooltipsToController(this, tooltipsPanel);
    }
  }

  private double getVelocityFactor() {
    return Math.pow(0.9D, Math.max(height - 4, 0));
  }

  private double getEfficiencyFactor() {
    return Math.pow(0.95D, Math.max(height - 4, 0));
  }

  @Override
  public boolean alwaysTryModifyRecipe() {
    return true;
  }

  @Override
  protected @Nullable GTRecipe getRealRecipe(final GTRecipe recipe) {
    final List<?> conditions = recipe.conditions.stream()
        .filter(NeutronActivatorCondition.class::isInstance)
        .toList();

    final GTRecipe newRecipe = recipe.copy();
    newRecipe.duration = (int) Math.round(Math.max(newRecipe.duration * getVelocityFactor(), 1.0D));

    if (!conditions.isEmpty()) {
      final NeutronActivatorCondition condition = (NeutronActivatorCondition) conditions.get(0);
      final int maxRange = (condition.getEvRange() / 10000) * 1_000_000;
      final int minRange = (condition.getEvRange() % 10000) * 1_000_000;

      if (eV > maxRange || eV < minRange) {
        newRecipe.outputs.clear();
        newRecipe.outputs.put(
            ItemRecipeCapability.CAP,
            List.of(new Content(Ingredient.of(ISGItems.RADIOACTIVE_WASTE), 1, 1, 0))
        );
      }
    }
    return super.getRealRecipe(newRecipe);
  }

  public static boolean checkNeutronActivatorCondition(final MetaMachine metaMachine, final GTRecipe recipe) {
    return metaMachine instanceof NeutronActivatorMachine
        && !recipe.conditions.isEmpty()
        && recipe.conditions.get(0) instanceof NeutronActivatorCondition;
  }

  private static final int M = 1_000_000;
  private static final int K = 1_000;
  private static final int MAX_ENERGY = 1200 * M;
}
