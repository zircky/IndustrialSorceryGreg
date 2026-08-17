package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTBlocks;
import com.gregtechceu.gtceu.common.data.GTItems;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.zircky.industrialsorcerygreg.ISGCore;
import com.zircky.industrialsorcerygreg.common.data.ISGBlocks;
import com.zircky.industrialsorcerygreg.common.data.ISGCasings;
import com.zircky.industrialsorcerygreg.common.data.ISGItems;
import com.zircky.industrialsorcerygreg.common.data.ISGMaterials;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGItems.SEPARATION_ELECTROMAGNET;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.ASSEMBLER_RECIPES;

public class AssemblerRecipes {
  public static void init(Consumer<FinishedRecipe> provider) {
    ASSEMBLER_RECIPES.recipeBuilder(GTCEu.id("coil_cupronickel")).EUt(VA[LV]).inputItems(wireGtDouble, Cupronickel, 8)
        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 8)
        .inputItems(foil, Bronze, 8).inputFluids(TinAlloy, GTValues.L)
        .outputItems(GTBlocks.COIL_CUPRONICKEL.asItem()).duration(200)
        .save(provider);
    ASSEMBLER_RECIPES.recipeBuilder(GTCEu.id("coil_kanthal")).EUt(VA[MV]).inputItems(wireGtDouble, Kanthal, 8)
        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 8)
        .inputItems(foil, Aluminium, 8).inputFluids(Copper, GTValues.L)
        .outputItems(GTBlocks.COIL_KANTHAL.asItem()).duration(300)
        .save(provider);
    ASSEMBLER_RECIPES.recipeBuilder(GTCEu.id("coil_nichrome")).EUt(VA[HV]).inputItems(wireGtDouble, Nichrome, 8)
        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 8)
        .inputItems(foil, StainlessSteel, 8).inputFluids(Aluminium, GTValues.L)
        .outputItems(GTBlocks.COIL_NICHROME.asItem()).duration(400)
        .save(provider);
    ASSEMBLER_RECIPES.recipeBuilder(GTCEu.id("coil_rtm_alloy")).EUt(VA[EV]).inputItems(wireGtDouble, RTMAlloy, 8)
        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 8)
        .inputItems(foil, VanadiumSteel, 8).inputFluids(Nichrome, GTValues.L)
        .outputItems(GTBlocks.COIL_RTMALLOY.asItem()).duration(500)
        .save(provider);
    ASSEMBLER_RECIPES.recipeBuilder(GTCEu.id("coil_hssg")).EUt(VA[IV]).inputItems(wireGtDouble, HSSG, 8)
        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 8)
        .inputItems(foil, TungstenCarbide, 8).inputFluids(Tungsten, GTValues.L)
        .outputItems(GTBlocks.COIL_HSSG.asItem()).duration(600)
        .save(provider);
    ASSEMBLER_RECIPES.recipeBuilder(GTCEu.id("coil_naquadah")).EUt(VA[LuV]).inputItems(wireGtDouble, Naquadah, 8)
        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 8)
        .inputItems(foil, Osmium, 8).inputFluids(TungstenSteel, GTValues.L)
        .outputItems(GTBlocks.COIL_NAQUADAH.asItem()).duration(700)
        .save(provider);
    ASSEMBLER_RECIPES.recipeBuilder(GTCEu.id("coil_trinium")).EUt(VA[ZPM]).inputItems(wireGtDouble, Trinium, 8)
        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 8)
        .inputItems(foil, NaquadahEnriched, 8).inputFluids(Naquadah, GTValues.L)
        .outputItems(GTBlocks.COIL_TRINIUM.asItem()).duration(800)
        .save(provider);
    ASSEMBLER_RECIPES.recipeBuilder(GTCEu.id("coil_tritanium")).EUt(VA[UV]).inputItems(wireGtDouble, Tritanium, 8)
        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 8)
        .inputItems(foil, Naquadria, 8).inputFluids(Trinium, GTValues.L)
        .outputItems(GTBlocks.COIL_TRITANIUM.asItem()).duration(900)
        .save(provider);
    ASSEMBLER_RECIPES.recipeBuilder("abyssalalloy_coil_block")
        .inputItems(TagPrefix.wireGtDouble, ISGMaterials.AbyssalAlloy, 8)
        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 8)
        .inputItems(TagPrefix.foil, GTMaterials.Europium, 8)
        .inputFluids(GTMaterials.Tritanium, 144)
        .outputItems(ISGCasings.ABYSSALALLOY_COIL_BLOCK.asItem())
        .EUt(VA[UHV])
        .duration(800)
        .save(provider);
    ASSEMBLER_RECIPES.recipeBuilder("titansteel_coil_block")
        .inputItems(TagPrefix.wireGtDouble, ISGMaterials.TitanSteel, 8)
        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 8)
        .inputItems(TagPrefix.foil, ISGMaterials.Mithril, 8)
        .inputFluids(ISGMaterials.AbyssalAlloy, 144)
        .outputItems(ISGCasings.TITANSTEEL_COIL_BLOCK.asItem())
        .EUt(VA[UEV])
        .duration(800)
        .save(provider);
    ASSEMBLER_RECIPES.recipeBuilder("adamantine_coil_block")
        .inputItems(TagPrefix.wireGtDouble, ISGMaterials.Adamantine, 8)
        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 8)
        .inputItems(TagPrefix.foil, GTMaterials.Neutronium, 8)
        .inputFluids(ISGMaterials.TitanSteel, 144)
        .outputItems(ISGCasings.ADAMANTINE_COIL_BLOCK.asItem())
        .EUt(VA[UIV])
        .duration(800)
        .save(provider);
    ASSEMBLER_RECIPES.recipeBuilder("naquadriatictaranium_coil_block")
        .inputItems(TagPrefix.wireGtDouble, ISGMaterials.NaquadriaticTaranium, 8)
        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 8)
        .inputItems(TagPrefix.foil, ISGMaterials.Taranium, 8)
        .inputFluids(ISGMaterials.Adamantine, 144)
        .outputItems(ISGCasings.NAQUADRIATICTARANIUM_COIL_BLOCK.asItem())
        .EUt(VA[UXV])
        .duration(800)
        .save(provider);
    ASSEMBLER_RECIPES.recipeBuilder("starmetal_coil_block")
        .inputItems(TagPrefix.wireGtDouble, ISGMaterials.Starmetal, 8)
        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 8)
        .inputItems(TagPrefix.foil, ISGMaterials.CrystalMatrix, 8)
        .inputFluids(ISGMaterials.NaquadriaticTaranium, 144)
        .outputItems(ISGCasings.STARMETAL_COIL_BLOCK.asItem())
        .EUt(VA[OpV])
        .duration(800)
        .save(provider);

    ASSEMBLER_RECIPES.recipeBuilder(ISGCore.id("space_nanomuscle_chestplate"))
        .inputItems(GTItems.NANO_CHESTPLATE)
        .inputItems("ad_astra:oxygen_gear")
        .inputItems("ad_astra:large_gas_tank", 2)
        .inputItems(GTItems.FLUID_CELL_LARGE_ALUMINIUM.asStack())
        .inputItems(GTItems.ELECTRIC_PUMP_HV, 2)
        .inputItems(GTItems.SENSOR_HV.asStack())
        .inputItems(plate, GTMaterials.SterlingSilver, 4)
        .outputItems(ISGItems.SPACE_NANOMUSCLE_CHESTPLATE)
        .inputFluids(GTMaterials.StainlessSteel, 288)
        .EUt(VA[GTValues.HV]).duration(800).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder(ISGCore.id("space_advanced_nanomuscle_chestplate"))
        .inputItems(GTItems.NANO_CHESTPLATE_ADVANCED)
        .inputItems("ad_astra:oxygen_distributor")
        .inputItems("ad_astra:large_gas_tank", 2)
        .inputItems(GTItems.FLUID_CELL_LARGE_STAINLESS_STEEL)
        .inputItems(GTItems.ELECTRIC_PUMP_EV, 2)
        .inputItems(GTItems.SENSOR_EV)
        .inputItems(plate, GTMaterials.Chromium, 4)
        .outputItems(ISGItems.SPACE_ADVANCED_NANOMUSCLE_CHESTPLATE.asItem())
        .inputFluids(GTMaterials.Titanium, 288)
        .EUt(VA[GTValues.EV]).duration(800).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder(ISGCore.id("space_quarktech_chestplate"))
        .inputItems(GTItems.QUANTUM_CHESTPLATE)
        .inputItems("ad_astra:oxygen_distributor", 2)
        .inputItems("ad_astra:large_gas_tank", 2)
        .inputItems(GTItems.FLUID_CELL_LARGE_TITANIUM)
        .inputItems(GTItems.ELECTRIC_PUMP_IV, 2)
        .inputItems(GTItems.SENSOR_IV)
        .inputItems(GTItems.FIELD_GENERATOR_IV)
        .inputItems(plate, GTMaterials.Ruthenium, 4)
        .outputItems(ISGItems.SPACE_QUARKTECH_CHESTPLATE.asItem())
        .inputFluids(GTMaterials.TungstenSteel, 576)
        .EUt(VA[GTValues.IV]).duration(800).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder(ISGCore.id("space_advanced_quarktech_chestplate"))
        .inputItems(GTItems.QUANTUM_CHESTPLATE_ADVANCED)
        .inputItems("ad_astra:oxygen_distributor", 4)
        .inputItems("ad_astra:large_gas_tank", 2)
        .inputItems(GTItems.FLUID_CELL_LARGE_TUNGSTEN_STEEL)
        .inputItems(GTItems.ELECTRIC_PUMP_LuV, 2)
        .inputItems(GTItems.SENSOR_LuV, 4)
        .inputItems(GTItems.FIELD_GENERATOR_ZPM)
        .inputItems(plate, Trinium, 4)
        .outputItems(ISGItems.SPACE_ADVANCED_QUARKTECH_CHESTPLATE.asItem())
        .inputFluids(GTMaterials.RhodiumPlatedPalladium, 2304)
        .EUt(VA[GTValues.ZPM]).duration(800).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("uruium_coil_block")
        .inputItems(TagPrefix.wireGtDouble, ISGMaterials.Uruium, 64)
        .inputItems(TagPrefix.wireGtDouble, ISGMaterials.Uruium, 64)
        .inputItems(TagPrefix.ring, GTMaterials.Neutronium, 16)
        .inputItems(TagPrefix.bolt, ISGMaterials.Vibramantium, 32)
        .inputItems(TagPrefix.foil, GTMaterials.BlackSteel, 64)
        .inputItems(TagPrefix.foil, GTMaterials.Cupronickel, 64)
        .inputItems(TagPrefix.foil, GTMaterials.RutheniumTriniumAmericiumNeutronate, 64)
        .inputItems(TagPrefix.foil, GTMaterials.HSSG, 64)
        .inputItems(TagPrefix.foil, GTMaterials.StyreneButadieneRubber, 64)
        .inputFluids(GTMaterials.Molybdenum.getFluid(576))
        .outputItems(ISGCasings.URUIUM_COIL_BLOCK.asStack())
        .EUt(VA[UIV])
        .duration(600)
        .save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("separation_electromagnet").duration(600).EUt(122880)
        .inputItems(wireFine, YttriumBariumCuprate, 64)
        .inputItems(wireFine, NiobiumTitanium, 64)
        .inputItems(plate, NiobiumNitride, 8)
        .inputItems(foil, Polybenzimidazole, 16)
        .inputItems(rod, VanadiumGallium)
        .outputItems(SEPARATION_ELECTROMAGNET)
        .save(provider);

  }
}
