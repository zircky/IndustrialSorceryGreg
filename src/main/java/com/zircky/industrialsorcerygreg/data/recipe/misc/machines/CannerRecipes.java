package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.common.data.GTBlocks;
import com.gregtechceu.gtceu.common.data.GTItems;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.VA;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.CANNER_RECIPES;

public class CannerRecipes {
    public static void init(Consumer<FinishedRecipe> provider) {
        batteryBlock(provider);
    }

    private static void batteryBlock(Consumer<FinishedRecipe> provider) {
        CANNER_RECIPES.recipeBuilder("ev_lapotronic_battery")
                .inputItems(GTBlocks.BATTERY_EMPTY_TIER_I.asStack(1))
                .inputItems(GTItems.LAPOTRON_CRYSTAL, 6)
                .outputItems(GTBlocks.BATTERY_LAPOTRONIC_EV.asStack(1))
                .duration(200).EUt(GTValues.VA[GTValues.EV]).save(provider);

        CANNER_RECIPES.recipeBuilder("iv_lapotronic_battery")
                .inputItems(GTBlocks.BATTERY_EMPTY_TIER_I.asStack(1))
                .inputItems(GTItems.ENERGY_LAPOTRONIC_ORB, 6)
                .outputItems(GTBlocks.BATTERY_LAPOTRONIC_IV.asStack(1))
                .duration(200).EUt(GTValues.VA[GTValues.IV]).save(provider);

        CANNER_RECIPES.recipeBuilder("luv_lapotronic_battery")
                .inputItems(GTBlocks.BATTERY_EMPTY_TIER_II.asStack(1))
                .inputItems(GTItems.ENERGY_LAPOTRONIC_ORB_CLUSTER, 6)
                .outputItems(GTBlocks.BATTERY_LAPOTRONIC_LuV.asStack(1))
                .duration(200).EUt(GTValues.VA[GTValues.LuV]).save(provider);

        CANNER_RECIPES.recipeBuilder("zpm_lapotronic_battery")
                .inputItems(GTBlocks.BATTERY_EMPTY_TIER_II.asStack(1))
                .inputItems(GTItems.ENERGY_MODULE, 6)
                .outputItems(GTBlocks.BATTERY_LAPOTRONIC_ZPM.asStack(1))
                .duration(200).EUt(GTValues.VA[GTValues.ZPM]).save(provider);

        CANNER_RECIPES.recipeBuilder("zpm_lapotronic_battery")
                .inputItems(GTBlocks.BATTERY_EMPTY_TIER_III.asStack(1))
                .inputItems(GTItems.ENERGY_CLUSTER, 6)
                .outputItems(GTBlocks.BATTERY_LAPOTRONIC_UV.asStack(1))
                .duration(200).EUt(GTValues.VA[GTValues.UV]).save(provider);

        CANNER_RECIPES.recipeBuilder("uhv_ultimate_battery")
                .inputItems(GTBlocks.BATTERY_EMPTY_TIER_III.asStack(1))
                .inputItems(GTItems.ULTIMATE_BATTERY)
                .outputItems(GTBlocks.BATTERY_ULTIMATE_UHV)
                .duration(400).EUt(VA[GTValues.UHV]).save(provider);
    }
}
