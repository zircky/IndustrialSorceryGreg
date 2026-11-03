package com.zircky.industrialsorcerygreg.api.recipe;

import com.zircky.industrialsorcerygreg.ISGCore;
import com.zircky.industrialsorcerygreg.api.gui.LayeredRecipeUIHelper;
import com.zircky.industrialsorcerygreg.data.recipe.builder.ISGRecipeBuilder;
import com.zircky.industrialsorcerygreg.data.recipe.builder.RecipeBuilderState;
import com.zircky.industrialsorcerygreg.mixin.gregtech.recipe.GTRecipeTypeAccessor;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.capability.recipe.*;
import com.gregtechceu.gtceu.api.recipe.GTRecipe;
import com.gregtechceu.gtceu.api.recipe.GTRecipeSerializer;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType.ICustomRecipeLogic;
import com.gregtechceu.gtceu.api.recipe.gui.GTRecipeTypeUILayout;
import com.gregtechceu.gtceu.api.registry.GTRegistries;
import com.gregtechceu.gtceu.api.sound.SoundEntry;
import com.gregtechceu.gtceu.data.recipe.builder.GTRecipeBuilder;
import com.gregtechceu.gtceu.utils.FormattingUtil;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeType;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class ISGRecipeType {

    private final GTRecipeType recipeType;
    private final String recipeNamespace;
    @Getter
    private boolean layered;

    public ISGRecipeType(ResourceLocation registryName, String group, RecipeType<?>... proxyRecipes) {
        recipeType = new RegisteredRecipeType(this, registryName, group, proxyRecipes);
        recipeNamespace = ISGCore.MODID;
        recipeType.setRecipeBuilder(new ISGRecipeBuilder(registryName, recipeType));
    }

    public ISGRecipeType(GTRecipeType recipeType) {
        this.recipeType = Objects.requireNonNull(recipeType);
        recipeNamespace = GTCEu.MOD_ID;
    }

    public GTRecipeType recipeType() {
        return recipeType;
    }

    public static boolean isLayered(GTRecipeType recipeType) {
        return recipeType instanceof RegisteredRecipeType registered && registered.owner.isLayered();
    }

    public ISGRecipeType setLayered() {
        recipeType.setUiLayout(LayeredRecipeUIHelper.createRecipeUI(recipeType));
        recipeType.addCustomRecipeLogic(new ICustomRecipeLogic() {

            @Override
            public GTRecipe createCustomRecipe(com.gregtechceu.gtceu.api.capability.recipe.IRecipeCapabilityHolder holder) {
                return null;
            }

            @Override
            public void buildRepresentativeRecipes() {
                LayeredRecipeHelper.buildRepresentativeRecipes(recipeType);
            }
        });
        layered = true;
        return this;
    }

    public static ISGRecipeType register(String name, String group, RecipeType<?>... proxyRecipes) {
        var type = new ISGRecipeType(GTCEu.id(name), group, proxyRecipes);
        var recipeType = type.recipeType();
        GTRegistries.register(BuiltInRegistries.RECIPE_TYPE, recipeType.registryName, recipeType);
        GTRegistries.register(BuiltInRegistries.RECIPE_SERIALIZER, recipeType.registryName, new GTRecipeSerializer());
        GTRegistries.RECIPE_TYPES.register(recipeType.registryName, recipeType);
        return type;
    }

    public ISGRecipeBuilder recipeBuilder(ResourceLocation id) {
        final var template = ((GTRecipeTypeAccessor) recipeType).getRecipeBuilder();
        final var builder = new ISGRecipeBuilder(id, recipeType);
        builder.onSave(template.onSave);
        return builder;
    }

    public ISGRecipeBuilder recipeBuilder(ResourceLocation id, Object... append) {
        if (append.length > 0) {
            String toAppend = Arrays.stream(append)
                    .map(Object::toString)
                    .map(FormattingUtil::toLowerCaseUnderscore)
                    .reduce("", (a, b) -> a + "_" + b);
            id = id.withSuffix(toAppend);
        }
        return recipeBuilder(id);
    }

    public ISGRecipeBuilder recipeBuilder(String id) {
        return recipeBuilder(new ResourceLocation(recipeNamespace, id));
    }

    public ISGRecipeBuilder recipeBuilder(String id, Object... append) {
        return recipeBuilder(new ResourceLocation(recipeNamespace, id), append);
    }

    public GTRecipeBuilder copyFrom(GTRecipeBuilder builder) {
        return recipeType.copyFrom(builder);
    }

    public ISGRecipeType onRecipeBuild(BiConsumer<ISGRecipeBuilder, Consumer<FinishedRecipe>> onBuild) {
        Objects.requireNonNull(onBuild);
        recipeType.onRecipeBuild((builder, provider) -> {
            if (builder instanceof ISGRecipeBuilder isgBuilder) {
                onBuild.accept(isgBuilder, provider);
                return;
            }
            final var isgBuilder = new ISGRecipeBuilder(builder.id, builder.recipeType);
            RecipeBuilderState.copy(builder, isgBuilder);
            onBuild.accept(isgBuilder, provider);
            RecipeBuilderState.copy(isgBuilder, builder);
        });
        return this;
    }

    public ISGRecipeType setMaxIOSize(int maxItemInputs, int maxItemOutputs, int maxFluidInputs, int maxFluidOutputs) {
        recipeType.setMaxIOSize(maxItemInputs, maxItemOutputs, maxFluidInputs, maxFluidOutputs);
        return this;
    }

    public ISGRecipeType setEUIO(IO io) {
        recipeType.setEUIO(io);
        return this;
    }

    public ISGRecipeType setMaxSize(IO io, RecipeCapability<?> cap, int max) {
        recipeType.setMaxSize(io, cap, max);
        return this;
    }

    public ISGRecipeType UI(UnaryOperator<GTRecipeTypeUILayout.Builder> builder) {
        recipeType.UI(builder);
        return this;
    }

    public ISGRecipeType setMaxTooltips(int maxTooltips) {
        recipeType.setMaxTooltips(maxTooltips);
        return this;
    }

    public ISGRecipeType setXEIVisible(boolean XEIVisible) {
        recipeType.setXEIVisible(XEIVisible);
        return this;
    }

    public @NotNull Iterator<GTRecipe> searchRecipe(IRecipeCapabilityHolder holder, Predicate<GTRecipe> canHandle) {
        return recipeType.searchRecipe(holder, canHandle);
    }

    public int getMaxInputs(RecipeCapability<?> cap) {
        return recipeType.getMaxInputs(cap);
    }

    public int getMaxOutputs(RecipeCapability<?> cap) {
        return recipeType.getMaxOutputs(cap);
    }

    public int getMaxSlots(RecipeCapability<?> cap, IO io) {
        return recipeType.getMaxSlots(cap, io);
    }

    public ISGRecipeType prepareBuilder(Consumer<GTRecipeBuilder> onPrepare) {
        recipeType.prepareBuilder(onPrepare);
        return this;
    }

    public @NotNull ISGRecipeType setSound(@Nullable SoundEntry sound) {
        recipeType.setSound(sound);
        return this;
    }

    public GTRecipeType getSmallRecipeMap() {
        return recipeType.getSmallRecipeMap();
    }

    public @NotNull ISGRecipeType setSmallRecipeMap(GTRecipeType smallRecipeMap) {
        recipeType.setSmallRecipeMap(smallRecipeMap);
        return this;
    }

    // Keep layered recipe state associated with the registered GTCEu type.
    private static final class RegisteredRecipeType extends GTRecipeType {

        private final ISGRecipeType owner;

        private RegisteredRecipeType(ISGRecipeType owner, ResourceLocation registryName, String group,
                                     RecipeType<?>... proxyRecipes) {
            super(registryName, group, proxyRecipes);
            this.owner = owner;
        }
    }
}
