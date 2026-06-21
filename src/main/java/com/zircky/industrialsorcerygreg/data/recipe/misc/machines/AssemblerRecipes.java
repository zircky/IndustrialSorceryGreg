package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTItems;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import com.zircky.industrialsorcerygreg.ISGCore;
import com.zircky.industrialsorcerygreg.common.data.ISGItems;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

public class AssemblerRecipes {
  public static void init(Consumer<FinishedRecipe> provider) {
    GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder(ISGCore.id("space_nanomuscle_chestplate"))
        .inputItems(GTItems.NANO_CHESTPLATE)
        .inputItems("ad_astra:oxygen_gear")
        .inputItems("ad_astra:large_gas_tank", 2)
        .inputItems(GTItems.FLUID_CELL_LARGE_ALUMINIUM)
        .inputItems(GTItems.ELECTRIC_PUMP_HV, 2)
        .inputItems(GTItems.SENSOR_HV)
        .inputItems(TagPrefix.plate, GTMaterials.SterlingSilver, 4)
        .outputItems(ISGItems.SPACE_NANOMUSCLE_CHESTPLATE)
        .inputFluids(GTMaterials.StainlessSteel, 288)
        .EUt(GTValues.VA[GTValues.HV]).duration(800).save(provider);

    GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder(ISGCore.id("space_advanced_nanomuscle_chestplate"))
        .inputItems(GTItems.NANO_CHESTPLATE_ADVANCED)
        .inputItems("ad_astra:oxygen_distributor")
        .inputItems("ad_astra:large_gas_tank", 2)
        .inputItems(GTItems.FLUID_CELL_LARGE_STAINLESS_STEEL)
        .inputItems(GTItems.ELECTRIC_PUMP_EV, 2)
        .inputItems(GTItems.SENSOR_EV)
        .inputItems(TagPrefix.plate, GTMaterials.Chromium, 4)
        .outputItems(ISGItems.SPACE_ADVANCED_NANOMUSCLE_CHESTPLATE)
        .inputFluids(GTMaterials.Titanium, 288)
        .EUt(GTValues.VA[GTValues.EV]).duration(800).save(provider);

    GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder(ISGCore.id("space_quarktech_chestplate"))
        .inputItems(GTItems.QUANTUM_CHESTPLATE)
        .inputItems("ad_astra:oxygen_distributor", 2)
        .inputItems("ad_astra:large_gas_tank", 2)
        .inputItems(GTItems.FLUID_CELL_LARGE_TITANIUM)
        .inputItems(GTItems.ELECTRIC_PUMP_IV, 2)
        .inputItems(GTItems.SENSOR_IV)
        .inputItems(GTItems.FIELD_GENERATOR_IV)
        .inputItems(TagPrefix.plate, GTMaterials.Ruthenium, 4)
        .outputItems(ISGItems.SPACE_QUARKTECH_CHESTPLATE)
        .inputFluids(GTMaterials.TungstenSteel, 576)
        .EUt(GTValues.VA[GTValues.IV]).duration(800).save(provider);

    GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder(ISGCore.id("space_advanced_quarktech_chestplate"))
        .inputItems(GTItems.QUANTUM_CHESTPLATE_ADVANCED)
        .inputItems("ad_astra:oxygen_distributor", 4)
        .inputItems("ad_astra:large_gas_tank", 2)
        .inputItems(GTItems.FLUID_CELL_LARGE_TUNGSTEN_STEEL)
        .inputItems(GTItems.ELECTRIC_PUMP_LuV, 2)
        .inputItems(GTItems.SENSOR_LuV, 4)
        .inputItems(GTItems.FIELD_GENERATOR_ZPM)
        .inputItems(TagPrefix.plate, GTMaterials.Trinium, 4)
        .outputItems(ISGItems.SPACE_ADVANCED_QUARKTECH_CHESTPLATE)
        .inputFluids(GTMaterials.RhodiumPlatedPalladium, 2304)
        .EUt(GTValues.VA[GTValues.ZPM]).duration(800).save(provider);

  }
}
