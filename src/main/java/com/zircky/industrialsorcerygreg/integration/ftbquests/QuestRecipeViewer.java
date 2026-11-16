package com.zircky.industrialsorcerygreg.integration.ftbquests;

import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidUtil;
import net.minecraftforge.fml.ModList;

import dev.emi.emi.api.EmiApi;
import dev.emi.emi.api.stack.EmiStack;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.forge.ForgeTypes;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.runtime.IJeiRuntime;
import org.jetbrains.annotations.Nullable;

public final class QuestRecipeViewer {

    @Nullable
    private static IJeiRuntime jeiRuntime;

    private QuestRecipeViewer() {}

    public static void setJeiRuntime(@Nullable IJeiRuntime runtime) {
        jeiRuntime = runtime;
    }

    public static boolean showRecipes(ItemStack stack) {
        if (stack.isEmpty()) {
            return false;
        }
        final FluidStack fluid = FluidUtil.getFluidContained(stack).orElse(FluidStack.EMPTY);
        if (ModList.get().isLoaded("emi")) {
            // Quest buckets represent a process fluid, whose recipes are indexed separately from the bucket.
            EmiApi.displayRecipes(fluid.isEmpty() ? EmiStack.of(stack) :
                    EmiStack.of(fluid.getFluid(), fluid.getTag(), fluid.getAmount()));
            return true;
        }
        final IJeiRuntime runtime = jeiRuntime;
        if (runtime == null) {
            return false;
        }
        showJeiRecipes(runtime, stack, fluid);
        return true;
    }

    private static void showJeiRecipes(IJeiRuntime runtime, ItemStack stack, FluidStack fluid) {
        final var focusFactory = runtime.getJeiHelpers().getFocusFactory();
        if (fluid.isEmpty()) {
            runtime.getRecipesGui().show(focusFactory.createFocus(
                    RecipeIngredientRole.OUTPUT, VanillaTypes.ITEM_STACK, stack));
        } else {
            runtime.getRecipesGui().show(focusFactory.createFocus(
                    RecipeIngredientRole.OUTPUT, ForgeTypes.FLUID_STACK, fluid));
        }
    }
}
