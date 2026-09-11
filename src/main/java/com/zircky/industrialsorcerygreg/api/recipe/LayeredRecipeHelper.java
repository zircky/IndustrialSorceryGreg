package com.zircky.industrialsorcerygreg.api.recipe;

import com.google.common.collect.Streams;
import com.gregtechceu.gtceu.api.capability.recipe.RecipeCapability;
import com.gregtechceu.gtceu.api.recipe.GTRecipe;
import com.gregtechceu.gtceu.api.recipe.GTRecipeSerializer;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.gregtechceu.gtceu.api.recipe.chance.logic.ChanceLogic;
import com.gregtechceu.gtceu.api.recipe.content.Content;
import com.gregtechceu.gtceu.data.recipe.builder.GTRecipeBuilder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.zircky.industrialsorcerygreg.data.recipe.builder.LayeredRecipeInfo;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.NbtOps;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LayeredRecipeHelper {

  // root recipe keys
  public static final String KEY_LAYERED_STEPS = "layered_steps"; // List<GTRecipe>
  public static final String KEY_LAYERED_INFO = "layered_info"; // LayeredRecipeInfo

  // single layer keys
  public static final String KEY_IS_LAYER = "is_layer"; // boolean
  public static final String KEY_LAYER_STEP = "layer_step"; // int
  public static final String KEY_LAYER_TIMEOUT = "layer_timeout"; // int

  public static boolean hasLayeredSteps(GTRecipe recipe) {
    return recipe.data.contains(KEY_LAYERED_STEPS);
  }

  public static int getLayerTimeout(GTRecipe recipe) {
    return recipe.data.getInt(KEY_LAYER_TIMEOUT);
  }

  public static @Nullable List<GTRecipe> getLayeredSteps(GTRecipe recipe) {
    return getLayeredSteps(recipe.data);
  }

  public static @Nullable List<GTRecipe> getLayeredSteps(CompoundTag recipeData) {
    var serialized = recipeData.get(KEY_LAYERED_STEPS);
    if (serialized == null) return null;
    return RECIPE_WITH_ID_CODEC.listOf().parse(NbtOps.INSTANCE, serialized).result().orElse(null);
  }

  public static void setLayeredSteps(GTRecipe recipe, List<GTRecipe> layers) {
    var serialized = RECIPE_WITH_ID_CODEC.listOf().encodeStart(NbtOps.INSTANCE, layers).result().orElseThrow();
    recipe.data.put(KEY_LAYERED_STEPS, serialized);
  }

  public static @Nullable List<GTRecipe> calculateRecipeSteps(GTRecipe recipe) {
    var layeredInfo = parseRecipeInfo(recipe);
    if (layeredInfo == null) return null;
    var base = createBaseRecipe(recipe, layeredInfo);
    return IntStream.range(0, layeredInfo.layers().size())
        .mapToObj((index) -> createStepRecipe(recipe, base, layeredInfo, index))
        .toList();
  }

  public static void applyLayeredRecipeModifications(GTRecipeBuilder builder) {
    if (!builder.data.contains(KEY_LAYERED_INFO)) return;

    var layers = calculateRecipeSteps(builder.buildRawRecipe());
    assert layers != null;
    int totalDuration = layers.stream().mapToInt(layer -> layer.duration).sum();

    var serializedSteps = RECIPE_WITH_ID_CODEC.listOf().encodeStart(NbtOps.INSTANCE, layers).result().orElseThrow();

    resetRecipeBuilderContents(builder, layers.get(0), layers.get(layers.size() - 1), totalDuration);
    builder.category(builder.recipeType.getCategory());
    builder.data.remove("is_layer");
    builder.data.put(KEY_LAYERED_STEPS, serializedSteps);
  }

  public static void buildRepresentativeRecipes(GTRecipeType recipeType) {
    // Layered recipes are normal data-driven recipes. Their root recipe remains in XEI so EMI keeps
    // favorites and recipe-tree support, while the custom UI reads KEY_LAYERED_STEPS for display.
  }

  private static void resetRecipeBuilderContents(GTRecipeBuilder builder, GTRecipe firstStep, GTRecipe lastStep,
                                                 int totalDuration) {
    builder.input.clear();
    firstStep.inputs.forEach((k, v) -> builder.input.put(k, new ArrayList<>(v)));
    builder.output.clear();
    lastStep.outputs.forEach((k, v) -> builder.output.put(k, new ArrayList<>(v)));
    builder.tickInput.clear();
    firstStep.tickInputs.forEach((k, v) -> builder.tickInput.put(k, new ArrayList<>(v)));
    builder.tickOutput.clear();
    firstStep.tickOutputs.forEach((k, v) -> builder.tickOutput.put(k, new ArrayList<>(v)));
    builder.inputChanceLogic.clear();
    builder.inputChanceLogic.putAll(firstStep.inputChanceLogics);
    builder.outputChanceLogic.clear();
    builder.outputChanceLogic.putAll(lastStep.outputChanceLogics);
    builder.tickInputChanceLogic.clear();
    builder.tickInputChanceLogic.putAll(firstStep.tickInputChanceLogics);
    builder.tickOutputChanceLogic.clear();
    builder.tickOutputChanceLogic.putAll(firstStep.tickOutputChanceLogics);
    builder.conditions.clear();
    builder.conditions.addAll(firstStep.conditions);
    builder.data = firstStep.data.copy();
    builder.duration = totalDuration;
    builder.recipeCategory = firstStep.recipeCategory;
    builder.perTick = false;
    builder.chance = ChanceLogic.getMaxChancedValue();
    builder.maxChance = ChanceLogic.getMaxChancedValue();
    builder.addMaterialInfo(false, false);
    builder.onSave = null;
    builder.researchRecipeEntries().clear();
    builder.setTempItemStacks(new ArrayList<>());
    builder.setTempItemMaterialStacks(new ArrayList<>());
    builder.setTempFluidMaterialStacks(new ArrayList<>());
  }

  private static Map<RecipeCapability<?>, List<Content>> copyLayeredInputs(Map<RecipeCapability<?>, List<Content>> inputMap,
                                                                           Map<RecipeCapability<?>, Int2IntMap> layeredInputMap,
                                                                           int recipeStep) {
    var dest = new IdentityHashMap<RecipeCapability<?>, List<Content>>();
    for (var entry : inputMap.entrySet()) {
      var capability = entry.getKey();
      var contents = entry.getValue();
      var layerInput = layeredInputMap.get(capability);
      if (layerInput == null) {
        if (recipeStep == -1) {
          dest.put(capability, contents);
        }
        continue;
      }
      dest.put(capability, IntStream.range(0, contents.size()).boxed()
          .flatMap(index -> layerInput.getOrDefault((int) index, -1) == recipeStep ?
              Stream.of(contents.get(index)) : Stream.of())
          .collect(Collectors.toList()));
    }
    return dest;
  }

  private static GTRecipe createStepRecipe(GTRecipe fullRecipe, GTRecipe baseRecipe, LayeredRecipeInfo layeredInfo,
                                           int recipeStep) {
    var copy = baseRecipe.copy();
    copy.setId(copy.id.withSuffix("/step" + (recipeStep + 1)));
    for (var entry : copyLayeredInputs(fullRecipe.inputs, layeredInfo.input(), recipeStep).entrySet()) {
      copy.inputs.merge(entry.getKey(), entry.getValue(),
          (contents1, contents2) -> Streams.concat(contents1.stream(), contents2.stream()).toList());
    }
    for (var entry : copyLayeredInputs(fullRecipe.tickInputs, layeredInfo.tickInput(), recipeStep).entrySet()) {
      copy.tickInputs.merge(entry.getKey(), entry.getValue(),
          (contents1, contents2) -> Streams.concat(contents1.stream(), contents2.stream()).toList());
    }
    if (recipeStep == layeredInfo.layers().size() - 1) {
      copy.outputs.putAll(fullRecipe.outputs);
    }
    var layer = layeredInfo.layers().get(recipeStep);
    if (layer.duration() > 0) copy.duration = layer.duration();

    copy.data = copy.data.copy();
    copy.data.putInt(KEY_LAYER_STEP, recipeStep);
    copy.data.putInt(KEY_LAYER_TIMEOUT, layer.timeout());
    return copy;
  }

  private static GTRecipe createBaseRecipe(GTRecipe fullRecipe, LayeredRecipeInfo layeredInfo) {
    var copiedData = fullRecipe.data.copy();
    copiedData.remove(KEY_LAYERED_INFO);
    copiedData.putBoolean(KEY_IS_LAYER, true);

    return new GTRecipe(
        fullRecipe.recipeType, fullRecipe.id,
        copyLayeredInputs(fullRecipe.inputs, layeredInfo.input(), -1),
        new IdentityHashMap<>(),
        copyLayeredInputs(fullRecipe.tickInputs, layeredInfo.tickInput(), -1),
        new IdentityHashMap<>(),
        fullRecipe.inputChanceLogics,
        new IdentityHashMap<>(),
        fullRecipe.tickInputChanceLogics,
        new IdentityHashMap<>(),
        fullRecipe.conditions,
        fullRecipe.ingredientActions,
        copiedData,
        fullRecipe.duration,
        fullRecipe.recipeCategory,
        fullRecipe.groupColor, fullRecipe.keepSpoilingProgress);
  }

  public static @Nullable LayeredRecipeInfo parseRecipeInfo(CompoundTag data) {
    var layeredInfoTag = data.get(KEY_LAYERED_INFO);
    return LayeredRecipeInfo.CODEC.parse(NbtOps.INSTANCE, layeredInfoTag).result().orElse(null);
  }

  public static @Nullable LayeredRecipeInfo parseRecipeInfo(GTRecipe recipe) {
    return parseRecipeInfo(recipe.data);
  }

  public static final Codec<GTRecipe> RECIPE_WITH_ID_CODEC = RecordCodecBuilder.create(instance -> instance.group(
          ResourceLocation.CODEC.fieldOf("id").forGetter(recipe -> recipe.id),
          Codec.INT.fieldOf("parallels").forGetter(recipe -> recipe.parallels),
          Codec.INT.fieldOf("subtickParallels").forGetter(recipe -> recipe.subtickParallels),
          Codec.INT.fieldOf("batchParallels").forGetter(recipe -> recipe.batchParallels),
          Codec.INT.fieldOf("ocLevel").forGetter(recipe -> recipe.ocLevel),
          Codec.INT.optionalFieldOf("groupColor", -1).forGetter(recipe -> recipe.groupColor),
          ((MapCodec.MapCodecCodec<GTRecipe>) GTRecipeSerializer.CODEC).codec().forGetter(recipe -> recipe))
      .apply(instance, (id, parallels, subtickParallels, batchParallels, ocLevel, groupColor, recipe) -> {
        recipe.parallels = parallels;
        recipe.subtickParallels = subtickParallels;
        recipe.batchParallels = batchParallels;
        recipe.ocLevel = ocLevel;
        recipe.groupColor = groupColor;
        recipe.setId(id);
        return recipe;
      }));
}
