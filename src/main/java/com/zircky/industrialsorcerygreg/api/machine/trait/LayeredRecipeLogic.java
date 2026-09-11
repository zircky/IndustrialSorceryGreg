package com.zircky.industrialsorcerygreg.api.machine.trait;

import com.gregtechceu.gtceu.api.capability.recipe.FluidRecipeCapability;
import com.gregtechceu.gtceu.api.capability.recipe.IO;
import com.gregtechceu.gtceu.api.capability.recipe.ItemRecipeCapability;
import com.gregtechceu.gtceu.api.machine.feature.IRecipeLogicMachine;
import com.gregtechceu.gtceu.api.machine.trait.recipe.RecipeLogic;
import com.gregtechceu.gtceu.api.recipe.ActionResult;
import com.gregtechceu.gtceu.api.recipe.GTRecipe;
import com.gregtechceu.gtceu.api.sync_system.annotations.SaveField;
import com.gregtechceu.gtceu.api.sync_system.annotations.SyncToClient;
import com.gregtechceu.gtceu.common.data.GTItems;
import com.gregtechceu.gtceu.utils.ItemStackHashStrategy;
import com.zircky.industrialsorcerygreg.api.recipe.LayeredRecipeHelper;
import it.unimi.dsi.fastutil.Hash;
import it.unimi.dsi.fastutil.objects.Object2LongOpenCustomHashMap;
import lombok.Getter;
import net.minecraft.network.chat.Component;
import net.minecraft.util.Mth;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class LayeredRecipeLogic extends RecipeLogic {

  private static final Hash.Strategy<FluidStack> FLUID_AND_TAG_HASH_STRATEGY = new Hash.Strategy<>() {
    @Override
    public int hashCode(FluidStack stack) {
      if (stack == null || stack.isEmpty()) return 0;
      return Objects.hash(stack.getFluid(), stack.getTag());
    }

    @Override
    public boolean equals(FluidStack first, FluidStack second) {
      if (first == second) return true;
      if (first == null) return second == null || second.isEmpty();
      if (second == null) return first.isEmpty();
      return first.getFluid() == second.getFluid() && Objects.equals(first.getTag(), second.getTag());
    }
  };

  @SaveField
  @SyncToClient
  @NotNull
  private final List<GTRecipe> layeredRecipe = Collections.synchronizedList(new ArrayList<>());

  @SaveField
  @SyncToClient
  private int layeredRecipeLayerIndex = -1;

  @Nullable
  @Getter
  @SaveField
  protected GTRecipe lastOriginLayeredRecipe;

  public LayeredRecipeLogic() {
    super();
  }

  @Deprecated
  public LayeredRecipeLogic(IRecipeLogicMachine machine) {
    this();
  }

  public @Nullable GTRecipe getFirstLayer() {
    if (layeredRecipe.isEmpty()) return null;
    return layeredRecipe.get(0);
  }

  public @Nullable GTRecipe getLastLayer() {
    if (layeredRecipe.isEmpty()) return null;
    return layeredRecipe.get(layeredRecipe.size() - 1);
  }

  public int getLayeredRecipeSize() {
    return layeredRecipe.size();
  }

  public int getLayeredRecipeLayerIndex() {
    return layeredRecipeLayerIndex;
  }

  public @NotNull List<GTRecipe> getLayeredRecipe() {
    return List.copyOf(layeredRecipe);
  }

  public @Nullable GTRecipe getCurrentLayer() {
    if (layeredRecipeLayerIndex < 0 || layeredRecipeLayerIndex >= layeredRecipe.size()) {
      return null;
    }
    return layeredRecipe.get(layeredRecipeLayerIndex);
  }

  public int getCoverRedstoneOutput() {
    var result = layeredRecipeLayerIndex + (lastRecipe == null ? 0 : 1);
    if (result == layeredRecipe.size()) {
      result = 0;
    }
    return Mth.clamp(result, 0, 15);
  }

  public GTRecipe getNextLayeredRecipe() {
    if (layeredRecipeLayerIndex < 0 || layeredRecipe.isEmpty()) {
      return null;
    }
    if (lastRecipe == null) {
      // not running and waiting for inputs
      return layeredRecipe.get(layeredRecipeLayerIndex);
    }
    if (layeredRecipeLayerIndex < layeredRecipe.size() - 1) {
      return layeredRecipe.get(layeredRecipeLayerIndex + 1);
    }
    return null;
  }

  @Override
  public boolean hasCustomProgressLine() {
    return true;
  }

  @Override
  public @Nullable Component getCustomProgressLine() {
    var currentProgress = (int) (getProgressPercent() * 100);
    var currentInSec = progress / 20.0;
    var maxInSec = duration / 20.0;

    return Component.translatable("gtceu.multiblock.layered.step_progress",
        String.format("%.2f", (float) currentInSec),
        String.format("%.2f", (float) maxInSec), currentProgress);
  }

  @Override
  public void interruptRecipe() {
    getRLMachine().afterWorking();
    setStatus(Status.IDLE);
    progress = 0;
    duration = 0;
    layeredRecipeLayerIndex = -1;
    layeredRecipe.clear();
    lastRecipe = null;
  }

  @Override
  public void resetRecipeLogic() {
    super.resetRecipeLogic();
    layeredRecipeLayerIndex = -1;
    layeredRecipe.clear();
    lastOriginLayeredRecipe = null;
  }

  @Override
  public void onRecipeFinish() {
    getRLMachine().afterWorking();
    if (lastRecipe == null) return;

    var finishedLastStep = false;
    if (!layeredRecipe.isEmpty() && lastRecipe.data.getBoolean("is_layer")) {
      // we were doing a recipe layer
      layeredRecipeLayerIndex++;
      if (layeredRecipe.size() == layeredRecipeLayerIndex) {
        layeredRecipe.clear();
        layeredRecipeLayerIndex = -1;
        finishedLastStep = true;
      }
    }

    runAttempt = 0;
    runDelay = 0;
    consecutiveRecipes++;
    handleRecipeIO(lastRecipe, IO.OUT);

    if (suspendAfterFinish) {
      setStatus(Status.SUSPEND);
      consecutiveRecipes = 0;
      progress = 0;
      duration = 0;
      isActive = false;
      lastRecipe = null;
      return;
    }

    if (finishedLastStep) {
      // try the first step again, but attempt to modify
      GTRecipe retryRecipe = null;
      if (lastOriginLayeredRecipe != null && alwaysTryModifyRecipe) {
        retryRecipe = getRLMachine().fullModifyRecipe(lastOriginLayeredRecipe);
      } else if (!layeredRecipe.isEmpty()) {
        retryRecipe = layeredRecipe.get(0);
      }

      if (retryRecipe != null && checkRecipe(retryRecipe).isSuccess()) {
        layeredRecipeLayerIndex = 0;
        setupRecipe(retryRecipe);
        return;
      }
    } else {
      // try the subsequent step, which is already transformed
      var nextStepRecipe = layeredRecipe.get(layeredRecipeLayerIndex);
      var recipeMatch = checkRecipe(nextStepRecipe);
      if (recipeMatch.isSuccess()) {
        setupRecipe(nextStepRecipe);
        return;
      }
    }

    setStatus(Status.IDLE);
    lastRecipe = null; // never rely on lastRecipe checks
    consecutiveRecipes = 0;
    progress = 0;
    duration = 0;
    isActive = false;
  }

  @Override
  public @NotNull Iterator<GTRecipe> searchRecipe() {
    if (!layeredRecipe.isEmpty()) {
      return Collections.singleton(layeredRecipe.get(layeredRecipeLayerIndex)).iterator();
    }
    return getRLMachine().getRecipeType().searchRecipe(getRLMachine(), r -> {
      // TODO: maybe add support for running non-layered recipes as well
      // ignore non-layered recipes
      if (!LayeredRecipeHelper.hasLayeredSteps(r)) return false;
      return matchRecipe(r).isSuccess();
    });
  }

  @Override
  public void setupRecipe(GTRecipe recipe) {
    if (LayeredRecipeHelper.hasLayeredSteps(recipe)) {
      // we are starting a layered craft
      layeredRecipe.clear();
      layeredRecipe.addAll(Objects.requireNonNull(LayeredRecipeHelper.getLayeredSteps(recipe)));
      layeredRecipeLayerIndex = 0;
      recipe = layeredRecipe.get(0);
    } else if (!recipe.data.getBoolean("is_layer")) {
      // non-layered recipe: should never happen
      layeredRecipe.clear();
      layeredRecipeLayerIndex = -1;
    }
    // otherwise we are just doing a subsequent layer
    super.setupRecipe(recipe);
    recipeDirty = true; // always mark dirty, we have custom retry logic
  }

  @Override
  public boolean checkMatchedRecipeAvailable(GTRecipe match) {
    var isAlreadyModified = match.data.getBoolean("is_layer");
    var modified = isAlreadyModified ? match : getRLMachine().fullModifyRecipe(match);

    if (modified != null) {
      var recipeMatch = checkRecipe(modified);
      if (recipeMatch.isSuccess()) {
        setupRecipe(modified);
      }

      if (lastRecipe != null && getStatus() == Status.WORKING) {
        // only store the lastOriginRecipe if it's an initial recipe, not a subsequent layer
        if (!isAlreadyModified) lastOriginLayeredRecipe = match;
        lastOriginRecipe = null;
        lastFailedMatches = null;
        return true;
      }
    }
    return false;
  }

  @Override
  protected ActionResult checkRecipe(GTRecipe recipe) {
    // normal match first
    var normalMatch = super.checkRecipe(recipe);
    if (!normalMatch.isSuccess()) return normalMatch;

    var inputItems = new Object2LongOpenCustomHashMap<>(ItemStackHashStrategy.comparingAllButCount());
    getRLMachine().getCapabilitiesFlat(IO.IN, ItemRecipeCapability.CAP).stream()
        .flatMap(s -> s.getContents().stream())
        .filter(ItemStack.class::isInstance).map(ItemStack.class::cast)
        .filter(s -> !s.isEmpty() && !s.is(GTItems.PROGRAMMED_CIRCUIT.get()))
        .forEach(s -> inputItems.addTo(s, s.getCount()));

    for (var rawContent : recipe.getInputContents(ItemRecipeCapability.CAP)) {
      var content = ItemRecipeCapability.CAP.of(rawContent.content());
      inputItems.keySet().stream().filter(content).forEach(inputItems::removeLong);
    }

    if (!inputItems.isEmpty()) {
      return ActionResult.fail(Component.translatable("gtceu.recipe_logic.layered_inputs"),
          null, IO.IN);
    }

    var inputFluids = new Object2LongOpenCustomHashMap<>(FLUID_AND_TAG_HASH_STRATEGY);
    getRLMachine().getCapabilitiesFlat(IO.IN, FluidRecipeCapability.CAP).stream()
        .flatMap(s -> s.getContents().stream())
        .filter(FluidStack.class::isInstance).map(FluidStack.class::cast)
        .filter(s -> !s.isEmpty())
        .forEach(s -> inputFluids.addTo(s, s.getAmount()));

    for (var rawContent : recipe.getInputContents(FluidRecipeCapability.CAP)) {
      var content = FluidRecipeCapability.CAP.of(rawContent.content());
      inputFluids.keySet().stream().filter(content).forEach(inputFluids::removeLong);
    }

    if (!inputFluids.isEmpty()) {
      return ActionResult.fail(Component.translatable("gtceu.recipe_logic.layered_inputs"),
          null, IO.IN);
    }

    return ActionResult.SUCCESS;
  }
}
