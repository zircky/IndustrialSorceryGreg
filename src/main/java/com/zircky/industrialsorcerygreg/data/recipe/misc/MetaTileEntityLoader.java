package com.zircky.industrialsorcerygreg.data.recipe.misc;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.MaterialEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTBlocks;
import com.gregtechceu.gtceu.common.data.GTItems;
import com.gregtechceu.gtceu.common.data.GTMachines;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.data.recipe.GTCraftingComponents;
import com.zircky.industrialsorcerygreg.ISGCore;
import com.zircky.industrialsorcerygreg.common.data.ISGCasings;
import com.zircky.industrialsorcerygreg.data.recipe.ISGCraftingComponents;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.ASSEMBLER_RECIPES;
import static com.zircky.industrialsorcerygreg.api.ISGValues.SECONDS;

public class MetaTileEntityLoader {
  public static void init(Consumer<FinishedRecipe> provider) {
    componentCasing(provider, LV);
    componentCasing(provider, MV);
    componentCasing(provider, HV);
    componentCasing(provider, EV);
    componentCasing(provider, IV);
    componentCasing(provider, LuV);
    componentCasing(provider, ZPM);
    componentCasing(provider, UV);
    componentCasing(provider, UHV);
    componentCasing(provider, UEV);
    componentCasing(provider, UIV);
    componentCasing(provider, UXV);
    componentCasing(provider, OpV);
  }


  private static void componentCasing(Consumer<FinishedRecipe> provider, int tier) {
    ASSEMBLER_RECIPES.recipeBuilder(ISGCore.id("%s_motor_casing".formatted(VN[tier])))
        .inputItems(GTCraftingComponents.CABLE.get(tier), 8)
        .inputItems(GTCraftingComponents.MOTOR.get(tier), 2)
        .inputItems(GTCraftingComponents.HULL.get(tier))
        .inputFluids(GTMaterials.SolderingAlloy.getFluid(288))
        .outputItems(ISGCraftingComponents.MOTOR_CASING.get(tier))
        .duration(SECONDS * 10).EUt(VA[tier]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder(ISGCore.id("%s_conveyor_casing".formatted(VN[tier])))
        .inputItems(GTCraftingComponents.CABLE.get(tier), 8)
        .inputItems(GTCraftingComponents.CONVEYOR.get(tier), 2)
        .inputItems(GTCraftingComponents.HULL.get(tier))
        .inputFluids(GTMaterials.SolderingAlloy.getFluid(288))
        .outputItems(ISGCraftingComponents.CONVEYOR_CASING.get(tier))
        .duration(SECONDS * 10).EUt(VA[tier]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder(ISGCore.id("%s_emitter_casing".formatted(VN[tier])))
        .inputItems(GTCraftingComponents.CABLE.get(tier), 8)
        .inputItems(GTCraftingComponents.EMITTER.get(tier), 2)
        .inputItems(GTCraftingComponents.HULL.get(tier))
        .inputFluids(GTMaterials.SolderingAlloy.getFluid(288))
        .outputItems(ISGCraftingComponents.EMITTER_CASING.get(tier))
        .duration(SECONDS * 10).EUt(VA[tier]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder(ISGCore.id("%s_field_generator_casing".formatted(VN[tier])))
        .inputItems(GTCraftingComponents.CABLE.get(tier), 8)
        .inputItems(GTCraftingComponents.FIELD_GENERATOR.get(tier), 2)
        .inputItems(GTCraftingComponents.HULL.get(tier))
        .inputFluids(GTMaterials.SolderingAlloy.getFluid(288))
        .outputItems(ISGCraftingComponents.FIELD_GENERATOR_CASING.get(tier))
        .duration(SECONDS * 10).EUt(VA[tier]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder(ISGCore.id("%s_piston_casing".formatted(VN[tier])))
        .inputItems(GTCraftingComponents.CABLE.get(tier), 8)
        .inputItems(GTCraftingComponents.PISTON.get(tier), 2)
        .inputItems(GTCraftingComponents.HULL.get(tier))
        .inputFluids(GTMaterials.SolderingAlloy.getFluid(288))
        .outputItems(ISGCraftingComponents.PISTON_CASING.get(tier))
        .duration(SECONDS * 10).EUt(VA[tier]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder(ISGCore.id("%s_pump_casing".formatted(VN[tier])))
        .inputItems(GTCraftingComponents.CABLE.get(tier), 8)
        .inputItems(GTCraftingComponents.PUMP.get(tier), 2)
        .inputItems(GTCraftingComponents.HULL.get(tier))
        .inputFluids(GTMaterials.SolderingAlloy.getFluid(288))
        .outputItems(ISGCraftingComponents.PUMP_CASING.get(tier))
        .duration(SECONDS * 10).EUt(VA[tier]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder(ISGCore.id("%s_robot_arm_casing".formatted(VN[tier])))
        .inputItems(GTCraftingComponents.CABLE.get(tier), 8)
        .inputItems(GTCraftingComponents.ROBOT_ARM.get(tier), 2)
        .inputItems(GTCraftingComponents.HULL.get(tier))
        .inputFluids(GTMaterials.SolderingAlloy.getFluid(288))
        .outputItems(ISGCraftingComponents.ROBOT_ARM_CASING.get(tier))
        .duration(SECONDS * 10).EUt(VA[tier]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder(ISGCore.id("%s_sensor_casing".formatted(VN[tier])))
        .inputItems(GTCraftingComponents.CABLE.get(tier), 8)
        .inputItems(GTCraftingComponents.SENSOR.get(tier), 2)
        .inputItems(GTCraftingComponents.HULL.get(tier))
        .inputFluids(GTMaterials.SolderingAlloy.getFluid(288))
        .outputItems(ISGCraftingComponents.SENSOR_CASING.get(tier))
        .duration(SECONDS * 10).EUt(VA[tier]).save(provider);
  }
}
