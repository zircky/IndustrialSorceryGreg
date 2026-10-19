package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTBlocks;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.zircky.industrialsorcerygreg.common.data.ISGCasings;
import com.zircky.industrialsorcerygreg.common.data.ISGItems;
import com.zircky.industrialsorcerygreg.common.data.ISGMaterials;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.foil;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.wireGtDouble;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.SPOOLING_RECIPES;

public class Spooling {
  public static void init(Consumer<FinishedRecipe> provider) {
    SPOOLING_RECIPES.recipeBuilder(GTCEu.id("coil_cupronickel")).EUt(VA[LV])
        .inputItems(wireGtDouble, Cupronickel, 8)
        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 8)
        .inputItems(foil, Bronze, 8).inputFluids(TinAlloy, GTValues.L)
        .outputItems(GTBlocks.COIL_CUPRONICKEL.asItem()).duration(200)
        .save(provider);
    SPOOLING_RECIPES.recipeBuilder(GTCEu.id("coil_kanthal")).EUt(VA[MV])
        .inputItems(wireGtDouble, Kanthal, 8)
        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 8)
        .inputItems(foil, Aluminium, 8).inputFluids(Copper, GTValues.L)
        .outputItems(GTBlocks.COIL_KANTHAL.asItem()).duration(300)
        .save(provider);
    SPOOLING_RECIPES.recipeBuilder(GTCEu.id("coil_nichrome")).EUt(VA[HV])
        .inputItems(wireGtDouble, Nichrome, 8)
        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 8)
        .inputItems(foil, StainlessSteel, 8).inputFluids(Aluminium, GTValues.L)
        .outputItems(GTBlocks.COIL_NICHROME.asItem()).duration(400)
        .save(provider);
    SPOOLING_RECIPES.recipeBuilder(GTCEu.id("coil_rtm_alloy")).EUt(VA[EV])
        .inputItems(wireGtDouble, RTMAlloy, 8)
        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 8)
        .inputItems(foil, VanadiumSteel, 8).inputFluids(Nichrome, GTValues.L)
        .outputItems(GTBlocks.COIL_RTMALLOY.asItem()).duration(500)
        .save(provider);
    SPOOLING_RECIPES.recipeBuilder(GTCEu.id("coil_hssg")).EUt(VA[IV])
        .inputItems(wireGtDouble, HSSG, 8)
        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 8)
        .inputItems(foil, TungstenCarbide, 8).inputFluids(Tungsten, GTValues.L)
        .outputItems(GTBlocks.COIL_HSSG.asItem()).duration(600)
        .save(provider);
    SPOOLING_RECIPES.recipeBuilder(GTCEu.id("coil_naquadah")).EUt(VA[LuV]).inputItems(wireGtDouble, Naquadah, 8)
        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 8)
        .inputItems(foil, Osmium, 8).inputFluids(TungstenSteel, GTValues.L)
        .outputItems(GTBlocks.COIL_NAQUADAH.asItem()).duration(700)
        .save(provider);
    SPOOLING_RECIPES.recipeBuilder(GTCEu.id("coil_trinium")).EUt(VA[ZPM]).inputItems(wireGtDouble, Trinium, 8)
        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 8)
        .inputItems(foil, NaquadahEnriched, 8).inputFluids(Naquadah, GTValues.L)
        .outputItems(GTBlocks.COIL_TRINIUM.asItem()).duration(800)
        .save(provider);
    SPOOLING_RECIPES.recipeBuilder(GTCEu.id("coil_tritanium")).EUt(VA[UV]).inputItems(wireGtDouble, Tritanium, 8)
        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 8)
        .inputItems(foil, Naquadria, 8).inputFluids(Trinium, GTValues.L)
        .outputItems(GTBlocks.COIL_TRITANIUM.asItem()).duration(900)
        .save(provider);
    SPOOLING_RECIPES.recipeBuilder("abyssalalloy_coil_block")
        .inputItems(TagPrefix.wireGtDouble, ISGMaterials.AbyssalAlloy, 8)
        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 8)
        .inputItems(TagPrefix.foil, GTMaterials.Europium, 8)
        .inputFluids(GTMaterials.Tritanium, 144)
        .outputItems(ISGCasings.ABYSSALALLOY_COIL_BLOCK.asItem())
        .EUt(VA[UHV])
        .duration(800)
        .save(provider);
    SPOOLING_RECIPES.recipeBuilder("titansteel_coil_block")
        .inputItems(TagPrefix.wireGtDouble, ISGMaterials.TitanSteel, 8)
        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 8)
        .inputItems(TagPrefix.foil, ISGMaterials.Mithril, 8)
        .inputFluids(ISGMaterials.AbyssalAlloy, 144)
        .outputItems(ISGCasings.TITANSTEEL_COIL_BLOCK.asItem())
        .EUt(VA[UEV])
        .duration(800)
        .save(provider);
    SPOOLING_RECIPES.recipeBuilder("adamantine_coil_block")
        .inputItems(TagPrefix.wireGtDouble, ISGMaterials.Adamantine, 8)
        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 8)
        .inputItems(TagPrefix.foil, GTMaterials.Neutronium, 8)
        .inputFluids(ISGMaterials.TitanSteel, 144)
        .outputItems(ISGCasings.ADAMANTINE_COIL_BLOCK.asItem())
        .EUt(VA[UIV])
        .duration(800)
        .save(provider);
    SPOOLING_RECIPES.recipeBuilder("naquadriatictaranium_coil_block")
        .inputItems(TagPrefix.wireGtDouble, ISGMaterials.NaquadriaticTaranium, 8)
        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 8)
        .inputItems(TagPrefix.foil, ISGMaterials.Taranium, 8)
        .inputFluids(ISGMaterials.Adamantine, 144)
        .outputItems(ISGCasings.NAQUADRIATICTARANIUM_COIL_BLOCK.asItem())
        .EUt(VA[UXV])
        .duration(800)
        .save(provider);
    SPOOLING_RECIPES.recipeBuilder("starmetal_coil_block")
        .inputItems(TagPrefix.wireGtDouble, ISGMaterials.Starmetal, 8)
        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 8)
        .inputItems(TagPrefix.foil, ISGMaterials.CrystalMatrix, 8)
        .inputFluids(ISGMaterials.NaquadriaticTaranium, 144)
        .outputItems(ISGCasings.STARMETAL_COIL_BLOCK.asItem())
        .EUt(VA[OpV])
        .duration(800)
        .save(provider);
  }
}
