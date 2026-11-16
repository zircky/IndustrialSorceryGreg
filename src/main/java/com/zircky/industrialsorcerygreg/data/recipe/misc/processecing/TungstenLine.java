package com.zircky.industrialsorcerygreg.data.recipe.misc.processecing;

import com.zircky.industrialsorcerygreg.ISGCore;

import com.gregtechceu.gtceu.GTCEu;

import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.industrialsorcerygreg.api.ISGValues.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.*;

public final class TungstenLine {

    private TungstenLine() {}

    public static void init(Consumer<FinishedRecipe> provider) {
        prepareConcentrate(provider);
        leachConcentrate(provider);
        precipitateAcid(provider);
        // Keep the existing WO3 hydrogen reduction and GT tungsten blast/vacuum recipes.
        CHEMICAL_RECIPES.recipeBuilder(ISGCore.id("tungsten_line/tungstate_to_scheelite"))
                .inputItems(dust, Tungstate, 7).inputItems(dust, CalciumChloride, 3)
                .inputFluids(Water.getFluid(1000))
                .outputItems(dust, Scheelite, 6).outputItems(dust, LithiumChloride, 4)
                .duration(SECONDS * 12).EUt(VA[HV]).save(provider);
    }

    private static void prepareConcentrate(Consumer<FinishedRecipe> provider) {
        MACERATOR_RECIPES.recipeBuilder(ISGCore.id("tungsten_line/milling"))
                .inputItems(dust, Scheelite, 6).outputItems(dust, MilledScheelite, 6)
                .duration(SECONDS * 10).EUt(VA[MV]).save(provider);
        CHEMICAL_BATH_RECIPES.recipeBuilder(ISGCore.id("tungsten_line/washing"))
                .inputItems(dust, MilledScheelite, 6).inputFluids(Water.getFluid(1000))
                .outputItems(dust, WashedScheelite, 6)
                .duration(SECONDS * 12).EUt(VA[MV]).save(provider);
        THERMAL_CENTRIFUGE_RECIPES.recipeBuilder(ISGCore.id("tungsten_line/drying"))
                .inputItems(dust, WashedScheelite, 6).outputItems(dust, DriedScheelite, 6)
                .duration(SECONDS * 15).EUt(VA[MV]).save(provider);
        ELECTROMAGNETIC_SEPARATOR_RECIPES.recipeBuilder(ISGCore.id("tungsten_line/magnetic_separation"))
                .inputItems(dust, DriedScheelite, 6).outputItems(dust, DemagnetizedScheelite, 6)
                .duration(SECONDS * 10).EUt(VA[MV]).save(provider);
        SIFTER_RECIPES.recipeBuilder(ISGCore.id("tungsten_line/grading"))
                .inputItems(dust, DemagnetizedScheelite, 6).outputItems(dust, ScheeliteConcentrate, 6)
                .duration(SECONDS * 10).EUt(VA[MV]).save(provider);
    }

    private static void leachConcentrate(Consumer<FinishedRecipe> provider) {
        MIXER_RECIPES.recipeBuilder(ISGCore.id("tungsten_line/slurry"))
                .inputItems(dust, ScheeliteConcentrate, 6).inputItems(dust, SodiumHydroxide, 6)
                .inputFluids(Water.getFluid(1000)).outputFluids(ScheeliteSlurry.getFluid(1000))
                .duration(SECONDS * 15).EUt(VA[HV]).save(provider);
        // CaWO4 + 2NaOH -> Na2WO4 + Ca(OH)2; carrier water stays in the solution.
        AUTOCLAVE_RECIPES.recipeBuilder(ISGCore.id("tungsten_line/alkaline_digestion"))
                .inputFluids(ScheeliteSlurry.getFluid(1000))
                .outputFluids(DigestedScheeliteSlurry.getFluid(1000))
                .duration(SECONDS * 30).EUt(VA[HV]).save(provider);
        CENTRIFUGE_RECIPES.recipeBuilder(ISGCore.id("tungsten_line/clarification"))
                .inputFluids(DigestedScheeliteSlurry.getFluid(1000))
                .outputItems(dust, CalciumHydroxide, 5)
                .outputFluids(PurifiedTungstateSolution.getFluid(1000))
                .duration(SECONDS * 20).EUt(VA[HV]).save(provider);
    }

    private static void precipitateAcid(Consumer<FinishedRecipe> provider) {
        // Na2WO4 + 2HCl -> H2WO4 + 2NaCl.
        CHEMICAL_RECIPES.recipeBuilder(ISGCore.id("tungsten_line/acid_precipitation"))
                .inputFluids(PurifiedTungstateSolution.getFluid(1000))
                .inputFluids(HydrochloricAcid.getFluid(2000))
                .outputFluids(TungsticAcidSuspension.getFluid(1000))
                .duration(SECONDS * 20).EUt(VA[HV]).save(provider);
        DISTILLERY_RECIPES.recipeBuilder(ISGCore.id("tungsten_line/acid_recovery"))
                .inputFluids(TungsticAcidSuspension.getFluid(1000))
                .outputItems(dust, TungsticAcid, 7).outputFluids(SaltWater.getFluid(2000))
                .duration(SECONDS * 20).EUt(VA[HV]).save(provider);
    }

    public static void remove(Consumer<ResourceLocation> consumer) {
        consumer.accept(GTCEu.id("chemical_bath/tungstic_acid_from_scheelite"));
        consumer.accept(GTCEu.id("chemical_bath/tungstic_acid_from_tungstate"));
        consumer.accept(GTCEu.id("electrolyzer/tungstic_acid_electrolysis"));
    }
}
