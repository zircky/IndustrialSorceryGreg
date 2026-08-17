package com.zircky.industrialsorcerygreg.data.recipe.misc.processecing;

import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.dust;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.*;

public class AluminiumLine {
  public static void init(Consumer<FinishedRecipe> provider) {
    // 2Al(OH)3 -> Al2O3 + 3H2O
    BLAST_RECIPES.recipeBuilder("aluminium_line_alumina_from_hydroxide").duration(200).EUt(120).blastFurnaceTemp(1100)
        .inputDust(AluminiumHydroxide, 14)
        .outputDust(Alumina, 5)
        .outputFluids(Water.getFluid(3000))
        .save(provider);

    // 6NaOH + Al2O3 + 12HF -> 2Na3AlF6 + 9H2O
    CHEMICAL_RECIPES.recipeBuilder("aluminium_line_sodium_hexafluoroaluminate").duration(400).EUt(120)
        .inputDust(SodiumHydroxide, 18)
        .inputDust(Alumina, 5)
        .inputFluids(HydrofluoricAcid.getFluid(12000))
        .outputFluids(SodiumHexafluoroaluminate.getFluid(2000))
        .outputFluids(Water.getFluid(9000))
        .save(provider);

    // 2Al2O3 + Na3AlF6 -> 4Al + 3NaF + AlF3 + 6O
    ELECTROLYZER_RECIPES.recipeBuilder("aluminium_line_aluminium_from_alumina").duration(200).EUt(120)
        .inputDust(Alumina, 10)
        .inputFluids(SodiumHexafluoroaluminate.getFluid(1000))
        .outputFluids(Oxygen.getFluid(6000))
        .outputDust(Aluminium, 4)
        .outputDust(SodiumFluoride, 6)
        .outputDust(AluminiumTrifluoride, 4)
        .save(provider);

    // 3NaF + AlF3 -> Na3AlF6
    CHEMICAL_RECIPES.recipeBuilder("aluminium_line_sodium_hexafluoroaluminate_recycling").duration(200).EUt(120)
        .inputDust(SodiumFluoride, 6)
        .inputDust(AluminiumTrifluoride, 4)
        .outputFluids(SodiumHexafluoroaluminate.getFluid(1000))
        .save(provider);

    // 24[H2O + NaOH] + (TiO2)2Al16H10O29 -> [24H2O + 24NaOH + (TiO2)2Al16H10O29 + ?]
    MIXER_RECIPES.recipeBuilder("aluminium_line_sodium_hydroxide_bauxite").duration(240).EUt(30)
        .inputFluids(SodiumHydroxideSolution.getFluid(24000))
        .inputDust(Bauxite, 39)
        .outputFluids(SodiumHydroxideBauxite.getFluid(24000))
        .save(provider);

    // [24H2O + 24NaOH + (TiO2)2Al16H10O29 + ?] = [4TiO2 + 16Al(OH)3 + 24NaOH + 5 H2O] - Increase to 4 TiO2 to make process worth doing
    FLUID_HEATER_RECIPES.recipeBuilder("aluminium_line_impure_aluminium_hydroxide_solution").duration(30).EUt(30)
        .circuitMeta(0)
        .inputFluids(SodiumHydroxideBauxite.getFluid(1000))
        .outputFluids(ImpureAluminiumHydroxideSolution.getFluid(1000))
        .save(provider);

    // [4TiO2 + 16Al(OH)3 + 24NaOH + 5 H2O] + 9 H2O = 8 Red Mud [Contains Total: 4TiO2 + 24NaOH + 6 H2O] + 8 [2 Al(OH)3 + H2O]
    CHEMICAL_RECIPES.recipeBuilder("aluminium_line_pure_aluminium_hydroxide_solution").duration(230).EUt(120)
        .inputFluids(Water.getFluid(5000))
        .inputFluids(ImpureAluminiumHydroxideSolution.getFluid(24000))
        .outputFluids(RedMud.getFluid(8000))
        .outputFluids(PureAluminiumHydroxideSolution.getFluid(16000))
        .save(provider);

    // [2 Al(OH)3 + H2O] = 2 Al(OH)3 + H2O
    DEHYDRATOR_RECIPES.recipeBuilder("aluminium_line_aluminium_hydroxide").duration(240).EUt(120)
        .inputFluids(PureAluminiumHydroxideSolution.getFluid(1000))
        .outputDust(AluminiumHydroxide, 14)
        .save(provider);

    // [2 Al(OH)3 + H2O] = 2 Al(OH)3 + H2O
    DEHYDRATOR_RECIPES.recipeBuilder("aluminium_line_aluminium_hydroxide_with_gallium").duration(240).EUt(1920)
        .inputFluids(PureAluminiumHydroxideSolution.getFluid(4000))
        .notConsumableDust(AluminiumHydroxide)
        .circuitMeta(1)
        .outputDust(AluminiumHydroxide, 56)
        .chancedOutput(dust, Gallium, 1, 7500)
        .save(provider);

    // 8 Red Mud [Contains Total: 4TiO2 + 24 NaOH + 6 H2O] + 32 HCl = 8 Neutralized Mud [Contains Total: 4TiO2 + 24NaCl + 30 H2O + 12HCl]
    MIXER_RECIPES.recipeBuilder("aluminium_line_neutralised_red_mud").duration(100).EUt(120)
        .inputFluids(RedMud.getFluid(1000))
        .inputFluids(HydrochloricAcid.getFluid(4000))
        .outputFluids(NeutralisedRedMud.getFluid(2000))
        .save(provider);

    // 8 Neutralized Mud [Contains Total: 4TiO2 + 24NaCl + 30 H2O + 12 HCl] = 4 Red Slurry [Contains Total: 4TiO2] + 4 Ferric REE Chloride [Contains Total: 12 HCl + 6 H2O] + 16 [NaCl + H2O]
    CENTRIFUGE_RECIPES.recipeBuilder("aluminium_line_red_slurry_and_ferric_ree_chloride").duration(100).EUt(120)
        .inputFluids(NeutralisedRedMud.getFluid(2000))
        .outputFluids(RedSlurry.getFluid(1000))
        .outputFluids(FerricREEChloride.getFluid(1000))
        .outputFluids(SaltWater.getFluid(4000))
        .save(provider);

    // 4 Ferric REE Chloride [Contains Total: 12 HCl + 6 H2O] = 2 Rare Earth Chlorides [Contains Total: REECl3 + 3 H2O] + 2 Iron III Chloride [Contains Total: FeCl3] + 6 H2O
    CENTRIFUGE_RECIPES.recipeBuilder("aluminium_line_rare_earth_chlorides_solution").duration(320).EUt(480)
        .inputFluids(FerricREEChloride.getFluid(2000))
        .outputFluids(RareEarthChloridesSolution.getFluid(1000))
        .outputFluids(IronChloride.getFluid(1000))
        .outputFluids(Water.getFluid(3000))
        .save(provider);

    // 4 Red Slurry [Contains Total: 4TiO2] + 4 H2SO4 = 4 TiO(SO4) + 4H2O
    CHEMICAL_RECIPES.recipeBuilder("aluminium_line_titanyl_sulfate").duration(160).EUt(120)
        .inputFluids(RedSlurry.getFluid(2000))
        .inputFluids(SulfuricAcid.getFluid(2000))
        .outputFluids(TitanylSulfate.getFluid(2000))
        .outputFluids(Water.getFluid(2000))
        .save(provider);

    // TiO(SO4) + 4HCl = TiCl4 + H2SO4 + H2O (water voided)
    CHEMICAL_RECIPES.recipeBuilder("aluminium_line_titanium_tetrachloride").duration(160).EUt(960)
        .inputFluids(TitanylSulfate.getFluid(1000))
        .inputFluids(HydrochloricAcid.getFluid(4000))
        .outputFluids(TitaniumTetrachloride.getFluid(1000))
        .outputFluids(SulfuricAcid.getFluid(1000))
        .save(provider);
  }
}
