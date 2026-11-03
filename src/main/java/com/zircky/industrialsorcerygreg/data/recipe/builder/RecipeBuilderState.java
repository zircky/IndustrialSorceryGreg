package com.zircky.industrialsorcerygreg.data.recipe.builder;

import com.zircky.industrialsorcerygreg.mixin.gregtech.recipe.GTRecipeBuilderAccessor;

import com.gregtechceu.gtceu.data.recipe.builder.GTRecipeBuilder;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** Transfers builder state without building or saving a recipe. */
public final class RecipeBuilderState {

    private RecipeBuilderState() {}

    public static void copy(GTRecipeBuilder source, GTRecipeBuilder target) {
        if (source == target) return;
        copyContents(source, target);
        target.id = source.id;
        target.recipeType = source.recipeType;
        target.recipeCategory = source.recipeCategory;
        target.data = source.data.copy();
        target.duration = source.duration;
        target.chance = source.chance;
        target.maxChance = source.maxChance;
        target.perTick = source.perTick;
        target.onSave = source.onSave;
        target.keepSpoilingProgress = source.keepSpoilingProgress;
        replaceList(source.conditions, target.conditions);
        target.researchRecipeEntries().clear();
        target.researchRecipeEntries().addAll(source.researchRecipeEntries());
        copyMaterialInfo(source, target);
    }

    private static void copyContents(GTRecipeBuilder source, GTRecipeBuilder target) {
        copyLists(source.input, target.input);
        copyLists(source.output, target.output);
        copyLists(source.tickInput, target.tickInput);
        copyLists(source.tickOutput, target.tickOutput);
        replaceMap(source.inputChanceLogic, target.inputChanceLogic);
        replaceMap(source.outputChanceLogic, target.outputChanceLogic);
        replaceMap(source.tickInputChanceLogic, target.tickInputChanceLogic);
        replaceMap(source.tickOutputChanceLogic, target.tickOutputChanceLogic);
    }

    private static void copyMaterialInfo(GTRecipeBuilder source, GTRecipeBuilder target) {
        final var sourceAccess = (GTRecipeBuilderAccessor) source;
        final var targetAccess = (GTRecipeBuilderAccessor) target;
        targetAccess.isg$setItemMaterialInfo(sourceAccess.isg$getItemMaterialInfo());
        targetAccess.isg$setFluidMaterialInfo(sourceAccess.isg$getFluidMaterialInfo());
        targetAccess.isg$setRemovePreviousMatInfo(sourceAccess.isg$getRemovePreviousMatInfo());
        targetAccess.isg$setGeneratingRecipes(sourceAccess.isg$getGeneratingRecipes());
        targetAccess.isg$setTempItemStacks(copyNullableList(sourceAccess.isg$getTempItemStacks()));
        targetAccess.isg$setTempItemMaterialStacks(copyNullableList(sourceAccess.isg$getTempItemMaterialStacks()));
        targetAccess.isg$setTempFluidStacks(copyNullableList(sourceAccess.isg$getTempFluidStacks()));
    }

    private static <K, V> void copyLists(Map<K, List<V>> source, Map<K, List<V>> target) {
        target.clear();
        source.forEach((key, values) -> target.put(key, new ArrayList<>(values)));
    }

    private static <K, V> void replaceMap(Map<K, V> source, Map<K, V> target) {
        target.clear();
        target.putAll(source);
    }

    private static <T> void replaceList(List<T> source, List<T> target) {
        target.clear();
        target.addAll(source);
    }

    private static <T> @Nullable List<T> copyNullableList(@Nullable List<T> source) {
        return source == null ? null : new ArrayList<>(source);
    }
}
