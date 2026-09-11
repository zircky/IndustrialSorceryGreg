package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import com.zircky.industrialsorcerygreg.common.data.ISGItems;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.plate;
import static com.gregtechceu.gtceu.common.data.GTItems.SHAPE_MOLD_PLATE;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.ALLOY_SMELTER_RECIPES;

public class AlloySmelterRecipes {
  public static void init(Consumer<FinishedRecipe> provider) {
    ALLOY_SMELTER_RECIPES.recipeBuilder("mica_insulator_sheet")
        .inputItems(ISGItems.MICA_BASED_SHEET, 5)
        .inputDust(SiliconDioxide, 3)
        .outputItems(ISGItems.MICA_INSULATOR_SHEET, 5)
        .EUt(30)
        .duration(400)
        .save(provider);

    // Cd + S -> CdS
    ALLOY_SMELTER_RECIPES.recipeBuilder("sadmium_sulfide").duration(240).EUt(300)
        .inputDust(Cadmium)
        .inputDust(Sulfur)
        .outputDust(CadmiumSulfide, 2)
        .save(provider);

    ALLOY_SMELTER_RECIPES.recipeBuilder("finely_powdered_rutile_from_rutile").duration(310).EUt(30)
        .inputDust(FinelyPowderedRutile)
        .notConsumable(SHAPE_MOLD_PLATE)
        .outputItems(plate, Rutile)
        .save(provider);

    // Au? + 3Cu -> Cu3Au?
    ALLOY_SMELTER_RECIPES.recipeBuilder("dust_precious_metal_dust_copper_to_ingot_gold_alloy").EUt(30).duration(100)
        .inputDust(PreciousMetal)
        .inputDust(Copper, 3)
        .outputItems(ingot, GoldAlloy, 4)
        .save(provider);

    ALLOY_SMELTER_RECIPES.recipeBuilder("ingot_precious_metal_dust_copper_to_ingot_gold_alloy").EUt(30).duration(100)
        .inputItems(ingot, PreciousMetal)
        .inputDust(Copper, 3)
        .outputItems(ingot, GoldAlloy, 4)
        .save(provider);

    ALLOY_SMELTER_RECIPES.recipeBuilder("dust_precious_metal_ingot_copper_to_ingot_gold_alloy").EUt(30).duration(100)
        .inputDust(PreciousMetal)
        .inputItems(ingot, Copper, 3)
        .outputItems(ingot, GoldAlloy, 4)
        .save(provider);

    ALLOY_SMELTER_RECIPES.recipeBuilder("ingot_precious_metal_ingot_copper_to_ingot_gold_alloy").EUt(30).duration(100)
        .inputItems(ingot, PreciousMetal)
        .inputItems(ingot, Copper, 3)
        .outputItems(ingot, GoldAlloy, 4)
        .save(provider);


    // 3Pb + 7Bi -> Pb3Bi7
    ALLOY_SMELTER_RECIPES.recipeBuilder("dust_lead_dust_bismuth_to_dust_lead_bismuth_eutectic").duration(100).EUt(16)
        .inputDust(Lead, 3)
        .inputDust(Bismuth, 7)
        .outputDust(LeadBismuthEutectic, 10)
        .save(provider);

    ALLOY_SMELTER_RECIPES.recipeBuilder("ingot_lead_dust_bismuth_to_dust_lead_bismuth_eutectic").duration(100).EUt(16)
        .inputItems(ingot, Lead, 3)
        .inputDust(Bismuth, 7)
        .outputDust(LeadBismuthEutectic, 10)
        .save(provider);

    ALLOY_SMELTER_RECIPES.recipeBuilder("dust_lead_ingot_bismuth_to_dust_lead_bismuth_eutectic").duration(100).EUt(16)
        .inputDust(Lead, 3)
        .inputItems(ingot, Bismuth, 7)
        .outputDust(LeadBismuthEutectic, 10)
        .save(provider);

    ALLOY_SMELTER_RECIPES.recipeBuilder("ingot_lead_ingot_bismuth_to_dust_lead_bismuth_eutectic").duration(100).EUt(16)
        .inputItems(ingot, Lead, 3)
        .inputItems(ingot, Bismuth, 7)
        .outputDust(LeadBismuthEutectic, 10)
        .save(provider);
  }

}
