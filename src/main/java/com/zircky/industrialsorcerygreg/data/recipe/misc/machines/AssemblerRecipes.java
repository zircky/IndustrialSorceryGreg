package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTItems;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import com.zircky.industrialsorcerygreg.ISGCore;
import com.zircky.industrialsorcerygreg.common.data.ISGCasings;
import com.zircky.industrialsorcerygreg.common.data.ISGItems;
import com.zircky.industrialsorcerygreg.common.data.ISGMaterials;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.ASSEMBLER_RECIPES;

public class AssemblerRecipes {
  public static void init(Consumer<FinishedRecipe> provider) {
    ASSEMBLER_RECIPES.recipeBuilder(ISGCore.id("space_nanomuscle_chestplate"))
        .inputItems(GTItems.NANO_CHESTPLATE)
        .inputItems("ad_astra:oxygen_gear")
        .inputItems("ad_astra:large_gas_tank", 2)
        .inputItems(GTItems.FLUID_CELL_LARGE_ALUMINIUM.asStack())
        .inputItems(GTItems.ELECTRIC_PUMP_HV, 2)
        .inputItems(GTItems.SENSOR_HV.asStack())
        .inputItems(TagPrefix.plate, GTMaterials.SterlingSilver, 4)
        .outputItems(ISGItems.SPACE_NANOMUSCLE_CHESTPLATE)
        .inputFluids(GTMaterials.StainlessSteel, 288)
        .EUt(GTValues.VA[GTValues.HV]).duration(800).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder(ISGCore.id("space_advanced_nanomuscle_chestplate"))
        .inputItems(GTItems.NANO_CHESTPLATE_ADVANCED)
        .inputItems("ad_astra:oxygen_distributor")
        .inputItems("ad_astra:large_gas_tank", 2)
        .inputItems(GTItems.FLUID_CELL_LARGE_STAINLESS_STEEL)
        .inputItems(GTItems.ELECTRIC_PUMP_EV, 2)
        .inputItems(GTItems.SENSOR_EV)
        .inputItems(TagPrefix.plate, GTMaterials.Chromium, 4)
        .outputItems(ISGItems.SPACE_ADVANCED_NANOMUSCLE_CHESTPLATE.asItem())
        .inputFluids(GTMaterials.Titanium, 288)
        .EUt(GTValues.VA[GTValues.EV]).duration(800).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder(ISGCore.id("space_quarktech_chestplate"))
        .inputItems(GTItems.QUANTUM_CHESTPLATE)
        .inputItems("ad_astra:oxygen_distributor", 2)
        .inputItems("ad_astra:large_gas_tank", 2)
        .inputItems(GTItems.FLUID_CELL_LARGE_TITANIUM)
        .inputItems(GTItems.ELECTRIC_PUMP_IV, 2)
        .inputItems(GTItems.SENSOR_IV)
        .inputItems(GTItems.FIELD_GENERATOR_IV)
        .inputItems(TagPrefix.plate, GTMaterials.Ruthenium, 4)
        .outputItems(ISGItems.SPACE_QUARKTECH_CHESTPLATE.asItem())
        .inputFluids(GTMaterials.TungstenSteel, 576)
        .EUt(GTValues.VA[GTValues.IV]).duration(800).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder(ISGCore.id("space_advanced_quarktech_chestplate"))
        .inputItems(GTItems.QUANTUM_CHESTPLATE_ADVANCED)
        .inputItems("ad_astra:oxygen_distributor", 4)
        .inputItems("ad_astra:large_gas_tank", 2)
        .inputItems(GTItems.FLUID_CELL_LARGE_TUNGSTEN_STEEL)
        .inputItems(GTItems.ELECTRIC_PUMP_LuV, 2)
        .inputItems(GTItems.SENSOR_LuV, 4)
        .inputItems(GTItems.FIELD_GENERATOR_ZPM)
        .inputItems(TagPrefix.plate, GTMaterials.Trinium, 4)
        .outputItems(ISGItems.SPACE_ADVANCED_QUARKTECH_CHESTPLATE.asItem())
        .inputFluids(GTMaterials.RhodiumPlatedPalladium, 2304)
        .EUt(GTValues.VA[GTValues.ZPM]).duration(800).save(provider);

//    ASSEMBLER_RECIPES.recipeBuilder(ISGCore.id("uruium_coil_block"))
//        .inputItems(TagPrefix.wireGtDouble, ISGMaterials.Uruium, 64)
//        .inputItems(TagPrefix.wireGtDouble, ISGMaterials.Uruium, 64)
//        .inputItems(TagPrefix.ring, GTMaterials.Neutronium, 16)
//        .inputItems(TagPrefix.bolt, ISGMaterials.Vibramantium, 32)
//        .inputItems(TagPrefix.foil, GTMaterials.BlackSteel, 64)
//        .inputItems(TagPrefix.foil, GTMaterials.Cupronickel, 64)
//        .inputItems(TagPrefix.foil, GTMaterials.RutheniumTriniumAmericiumNeutronate, 64)
//        .inputItems(TagPrefix.foil, GTMaterials.HSSG, 64)
//        .inputItems(TagPrefix.foil, GTMaterials.StyreneButadieneRubber, 64)
//        .inputFluids(GTMaterials.Molybdenum.getFluid(576))
//        .outputItems(ISGCasings.URUIUM_COIL_BLOCK.asStack())
//        .EUt(31457280)
//        .duration(600)
//        .save();

//    ASSEMBLER_RECIPES.recipeBuilder(ISGCore.id("abyssalalloy_coil_block"))
//        .inputItems(TagPrefix.wireGtDouble, ISGMaterials.AbyssalAlloy, 8)
//        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 8)
//        .inputItems(TagPrefix.foil, GTMaterials.Europium, 8)
//        .inputFluids(GTMaterials.Tritanium.getFluid(144))
//        .outputItems(ISGCasings.ABYSSALALLOY_COIL_BLOCK.asStack())
//        .EUt(1966080)
//        .duration(800)
//        .save();

//    ASSEMBLER_RECIPES.recipeBuilder(ISGCore.id("titansteel_coil_block"))
//        .inputItems(TagPrefix.wireGtDouble, ISGMaterials.TitanSteel, 8)
//        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 8)
//        .inputItems(TagPrefix.foil, ISGMaterials.Mithril, 8)
//        .inputFluids(ISGMaterials.AbyssalAlloy.getFluid(144))
//        .outputItems(ISGCasings.TITANSTEEL_COIL_BLOCK.asStack())
//        .EUt(7864320)
//        .duration(800)
//        .save();
//
//    ASSEMBLER_RECIPES.recipeBuilder(ISGCore.id("adamantine_coil_block"))
//        .inputItems(TagPrefix.wireGtDouble, ISGMaterials.Adamantine, 8)
//        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 8)
//        .inputItems(TagPrefix.foil, GTMaterials.Neutronium, 8)
//        .inputFluids(ISGMaterials.TitanSteel.getFluid(144))
//        .outputItems(ISGCasings.ADAMANTINE_COIL_BLOCK.asStack())
//        .EUt(31457280)
//        .duration(800)
//        .save();
//
//    ASSEMBLER_RECIPES.recipeBuilder(ISGCore.id("naquadriatictaranium_coil_block"))
//        .inputItems(TagPrefix.wireGtDouble, ISGMaterials.NaquadriaticTaranium, 8)
//        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 8)
//        .inputItems(TagPrefix.foil, ISGMaterials.Taranium, 8)
//        .inputFluids(ISGMaterials.Adamantine.getFluid(144))
//        .outputItems(ISGCasings.NAQUADRIATICTARANIUM_COIL_BLOCK.asStack())
//        .EUt(125829120)
//        .duration(800)
//        .save();
//
//    ASSEMBLER_RECIPES.recipeBuilder(ISGCore.id("starmetal_coil_block"))
//        .inputItems(TagPrefix.wireGtDouble, ISGMaterials.Starmetal, 8)
//        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 8)
//        .inputItems(TagPrefix.foil, ISGMaterials.CrystalMatrix, 8)
//        .inputFluids(ISGMaterials.NaquadriaticTaranium.getFluid(144))
//        .outputItems(ISGCasings.STARMETAL_COIL_BLOCK.asStack())
//        .EUt(503316480)
//        .duration(800)
//        .save();

  }
}
