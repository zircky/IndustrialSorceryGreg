package com.zircky.industrialsorcerygreg.data.recipe.misc.processecing;

import com.gregtechceu.gtceu.api.GTValues;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.dust;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.wireFine;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGItems.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.*;

public class TriniumLine {
  public static void init(Consumer<FinishedRecipe> provider) {
    //Carborane

    //B(OH)3 + 3 C2H5OH + 4 NaH -> 3 C2H5ONa + NaBH4 + 3 H2O
    CHEMICAL_RECIPES.recipeBuilder("trinium_line_sodium_borohydride").duration(120).EUt(480)
        .inputDust(SodiumHydride, 8)
        .inputFluids(BoricAcid.getFluid(1000))
        .inputFluids(Ethanol.getFluid(3000))
        .notConsumableFluid(SulfuricAcid.getFluid(250))
        .outputDust(SodiumBorohydride, 6)
        .outputDust(SodiumEthoxide, 27)
        .outputFluids(Water.getFluid(3000))
        .save(provider);

    MIXER_RECIPES.recipeBuilder("trinium_line_boron_trifluoride_etherate").duration(150).EUt(125)
        .inputFluids(Diethylether.getFluid(1000))
        .inputFluids(BoronFluoride.getFluid(1000))
        .outputFluids(BoronTrifluorideEtherate.getFluid(1000))
        .save(provider);

    //17 NaBH4 + 20 BF3·(CH2CH3)2O + 4 H2O2 + 2 HF -> 2 NaF + 2 H2O + 2 B10H14 + 2 B(OH)3 + 15 NaBF4 + 20 H2 + 20 (CH2CH3)2O
    //divided by two, and optimal choice as a gate
    LARGE_CHEMICAL_RECIPES.recipeBuilder("trinium_line_decaborane").duration(380).EUt(2000)
        .inputDust(SodiumBorohydride, 51)
        .inputFluids(HydrofluoricAcid.getFluid(1000))
        .inputFluids(HydrogenPeroxide.getFluid(2000))
        .inputFluids(BoronTrifluorideEtherate.getFluid(10000))
        .outputDust(Decaborane, 24)
        .outputDust(SodiumFluoride, 2)
        .outputDust(SodiumTetrafluoroborate, 45)
        .outputFluids(Water.getFluid(1000))
        .outputFluids(Hydrogen.getFluid(20000))
        .outputFluids(Diethylether.getFluid(10000))
        .save(provider);

    //NaBF4 -> NaF + BF3
    CHEMICAL_RECIPES.recipeBuilder("trinium_line_boron_fluoride_from_tetrafluoroborate").duration(120).EUt(125) // ciruit 0
        .inputDust(SodiumTetrafluoroborate, 6)
        .outputDust(SodiumFluoride, 2)
        .outputFluids(BoronFluoride.getFluid(1000))
        .save(provider);

    //B10H14 + NaCN + CsOH + 2 HCl + 3 CH3OH -> CsB10H12CN(CH3)3Cl + 4 H2O + NaCl
    LARGE_CHEMICAL_RECIPES.recipeBuilder("trinium_line_cesium_carborane_precusor").duration(240).EUt(500)
        .inputDust(Decaborane, 24)
        .inputDust(CaesiumHydroxide, 3)
        .inputFluids(SodiumCyanide.getFluid(1000))
        .inputFluids(HydrochloricAcid.getFluid(2000))
        .inputFluids(Methanol.getFluid(3000))
        .notConsumableFluid(SulfuricAcid.getFluid(250))
        .outputDust(CesiumCarboranePrecusor, 38)
        .outputDust(Salt, 2)
        .outputFluids(Water.getFluid(4000))
        .save(provider);

    CHEMICAL_RECIPES.recipeBuilder("trinium_line_borane_dimethylsulfide").duration(165).EUt(125)
        .inputFluids(Dimethylsulfide.getFluid(2000))
        .inputFluids(Diborane.getFluid(1000))
        .outputFluids(BoraneDimethylsulfide.getFluid(2000))
        .save(provider);

    //CsB10H12CN(CH3)3Cl + NaH + BH3.(CH3)2S -> CsCB11H12 + N(CH3)3 + NaCl + H2S + 2 CH4
    LARGE_CHEMICAL_RECIPES.recipeBuilder("trinium_line_cesium_carborane").duration(260).EUt(500)
        .inputDust(CesiumCarboranePrecusor, 38)
        .inputDust(SodiumHydride, 2)
        .inputFluids(BoraneDimethylsulfide.getFluid(1000))
        .notConsumableFluid(Tetrahydrofuran.getFluid(250))
        .outputDust(CesiumCarborane, 25)
        .outputDust(Salt, 2)
        .outputFluids(Trimethylamine.getFluid(1000))
        .outputFluids(HydrogenSulfide.getFluid(1000))
        .outputFluids(Methane.getFluid(2000))
        .save(provider);

    //2 CsCB11H12 + 2 AgNO3 + 44F + 2I + HCl + (CH3)3SiH -> 2 H(CHB11F11) + 2CsNO3 + 2AgI + 22HF + (CH3)3SiCl
    LARGE_CHEMICAL_RECIPES.recipeBuilder("trinium_line_fluorocarborane").duration(320).EUt(2000)
        .inputDust(CesiumCarborane, 50)
        .inputDust(SilverNitrate, 10)
        .inputDust(Iodine, 2)
        .inputFluids(Fluorine.getFluid(44000))
        .inputFluids(HydrochloricAcid.getFluid(1000))
        .inputFluids(Trimethylsilane.getFluid(1000))
        .outputDust(Fluorocarborane, 50)
        .outputDust(CaesiumNitrate, 10)
        .outputDust(SilverIodide, 4)
        .outputFluids(HydrofluoricAcid.getFluid(22000))
        .outputFluids(Trimethylchlorosilane.getFluid(1000))
        .save(provider);

    //Ag + 2 HNO3 -> AgNO3 + NO2 + H2O
    CHEMICAL_RECIPES.recipeBuilder("trinium_line_silver_nitrate_from_silver").duration(150).EUt(125)
        .inputDust(Silver)
        .inputFluids(NitricAcid.getFluid(2000))
        .outputDust(SilverNitrate, 5)
        .outputFluids(NitrogenDioxide.getFluid(1000))
        .outputFluids(Water.getFluid(1000))
        .save(provider);

    //Ag2O + 2 HNO3 -> 2 AgNO3 + H2O
    CHEMICAL_RECIPES.recipeBuilder("trinium_line_silver_nitrate_from_silver_oxide").duration(150).EUt(125)
        .inputDust(SilverOxide, 3)
        .inputFluids(NitricAcid.getFluid(2000))
        .outputDust(SilverNitrate, 10)
        .outputFluids(Water.getFluid(1000))
        .save(provider);

    BLAST_RECIPES.recipeBuilder("trinium_line_silver_oxide_from_iodide").duration(210).EUt(125).blastFurnaceTemp(1100)
        .inputDust(SilverIodide, 4)
        .inputFluids(Oxygen.getFluid(1000))
        .outputDust(SilverOxide, 3)
        .outputDust(Iodine, 2)
        .save(provider);

    //Trinium Line Proper
    CHEMICAL_RECIPES.recipeBuilder("trinium_line_fuming_nitric_acid").duration(200).EUt(125)
        .inputDust(SodiumNitrate, 5)
        .inputFluids(SulfuricAcid.getFluid(1000))
        .outputFluids(FumingNitricAcid.getFluid(1000))
        .outputDust(SodiumBisulfate, 7)
        .save(provider);

    VACUUM_RECIPES.recipeBuilder("trinium_line_pure_crystalline_nitric_acid").duration(180).EUt(125)
        .inputFluids(FumingNitricAcid.getFluid(1000))
        .outputDust(PureCrystallineNitricAcid, 5)
        .save(provider);

    //2 Ke3Ac2Se4At4 + 8 HNO3 + 8 SO2 + NaClO4 ->  8 SeO2 + 8At + [NaCl + 4 H2O + 2 Ke3Ac2S4(NO3)4 + ?]
    BLAST_RECIPES.recipeBuilder("trinium_line_nitrated_triniite_solution").duration(265).EUt(130500).blastFurnaceTemp(9400)
        .inputDust(Triniite, 16)
        .inputDust(PureCrystallineNitricAcid, 40)
        .inputDust(SodiumPerchlorate, 6)
        .inputFluids(SulfurDioxide.getFluid(8000))
        .outputDust(Astatine, 8)
        .outputDust(SeleniumOxide, 24)
        .outputFluids(NitratedTriniiteSolution.getFluid(4000))
        .save(provider);

    //1/2[NaCl + 4 H2O + 2 Ke3Ac2S4(NO3)4 + ?] + 12 NaOH -> 4 Na2S + Ke3Ac2(OH)12? + [0.5 NaCl + 4 NaNO3 + 2 H2O + ?]
    CHEMICAL_RECIPES.recipeBuilder("trinium_line_actinium_trinium_hydroxides").duration(190).EUt(500)
        .inputDust(SodiumHydroxide, 36)
        .inputFluids(NitratedTriniiteSolution.getFluid(2000))
        .outputDust(ActiniumTriniumHydroxides, 29)
        .outputDust(SodiumSulfide, 12)
        .outputFluids(ResidualTriniiteSolution.getFluid(2000))
        .save(provider);

    //0.5 NaCl + 4 NaNO3 + 2 H2O + ? -> 0.5 NaCl + 4 NaNO3 + 0.75 Nq + 0.5 Nq + 0.444 Nq*
    DEHYDRATOR_RECIPES.recipeBuilder("trinium_line_residual_triniite_solution_dehydration").duration(190).EUt(8100)
        .inputFluids(ResidualTriniiteSolution.getFluid(2000))
        .outputDust(Salt)
        .outputDust(SodiumNitrate, 20)
        .chancedOutput(dust, NaquadahOxideMixture, 1, 7500)
        .chancedOutput(dust, EnrichedNaquadahOxideMixture, 1, 5000)
        .chancedOutput(dust, NaquadahOxideMixture, 1, 4444)
        .save(provider);

    // 6 KF + C6H6 + 6 Cl -> C6F6 + 6 KCl + 6 H
    CHEMICAL_RECIPES.recipeBuilder("trinium_line_perfluorobenzene").duration(185).EUt(125)
        .inputDust(PotassiumFluoride, 12)
        .inputFluids(Chlorine.getFluid(6000))
        .inputFluids(Benzene.getFluid(1000))
        .notConsumable(dust, Rhenium)
        .outputFluids(Perfluorobenzene.getFluid(1000))
        .outputFluids(Hydrogen.getFluid(6000))
        .outputDust(RockSalt, 12)
        .save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("trinium_line_protonated_fullerene_sieving_matrix").duration(350).EUt(32750)
        .inputItems(wireFine, CarbonNanotubes, 6)
        .inputDust(Fullerene)
        .inputDust(Fluorocarborane, 50)
        .inputFluids(Perfluorobenzene.getFluid(2000))
        .outputItems(PROTONATED_FULLERENE_SIEVING_MATRIX)
        .save(provider);

    //C65H70B55F55 + 6 Ra + 2 Ke3Ac2(OH)12? -> 2 Ra3Ac2(OH)12? + Ke6C65H70B55F55
    MIXER_RECIPES.recipeBuilder("trinium_line_saturated_fullerene_sieving_matrix").duration(210).EUt(262000)
        .inputDust(Radium, 6)
        .inputDust(ActiniumTriniumHydroxides, 58)
        .inputItems(PROTONATED_FULLERENE_SIEVING_MATRIX)
        .inputFluids(Water.getFluid(2000))
        .outputItems(SATURATED_FULLERENE_SIEVING_MATRIX)
        .outputFluids(ActiniumRadiumHydroxideSolution.getFluid(2000))
        .save(provider);

    //Ke6C65H70B55F55 + 13 H2SbF7 + 59 KrF2 -> 59 Kr + 13 SbF3 + 6 KeF4 + 32 C2H2 + CF4 + 55 BF3 + 32 HF
    CHEMICAL_RECIPES.recipeBuilder("trinium_line_heavily_fluorinated_trinium_solution").duration(180).EUt(131000)
        .inputItems(SATURATED_FULLERENE_SIEVING_MATRIX)
        .inputFluids(FluoroantimonicAcid.getFluid(8000))
        .inputFluids(KryptonDifluoride.getFluid(16000))
        .outputDust(AntimonyTrifluoride, 32)
        .outputDust(Fluorocarborane, 50)
        .outputFluids(Krypton.getFluid(16000))
        .outputFluids(HeavilyFluorinatedTriniumSolution.getFluid(8000))
        .save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("trinium_line_trinium_tetrafluoride").duration(350).EUt(32760)
        .inputFluids(HeavilyFluorinatedTriniumSolution.getFluid(8000))
        .outputDust(TriniumTetrafluoride, 60)
        .outputFluids(Fluorine.getFluid(16000))
        .outputFluids(Perfluorobenzene.getFluid(2000))
        .save(provider);


    CHEMICAL_RECIPES.recipeBuilder("trinium_line_fluorite").duration(160).EUt(30)
        .inputDust(Calcium)
        .inputFluids(Fluorine.getFluid(2000))
        .outputDust(Fluorite, 3)
        .save(provider);

    MIXER_RECIPES.recipeBuilder("trinium_line_molten_calcium_salts").duration(160).EUt(30)
        .inputDust(Calcium)
        .inputFluids(Fluorite.getFluid(432))
        .outputFluids(MoltenCalciumSalts.getFluid(1000))
        .save(provider);

    ELECTROLYZER_RECIPES.recipeBuilder("trinium_line_trinium_from_tetrafluoride").duration(200).EUt(2000)
        .inputDust(TriniumTetrafluoride, 5)
        .inputDust(Sulfur)
        .inputFluids(MoltenCalciumSalts.getFluid(1000))
        .outputDust(TriniumSulfide, 2)
        .outputDust(Calcium, 2)
        .outputFluids(Fluorine.getFluid(6000))
        .save(provider);

    //QoL to hook up the acetylene output into the fullerene chain

    //3 C2H2 -> C6H6
    FLUID_HEATER_RECIPES.recipeBuilder("trinium_line_benzene_from_acetylene").duration(190).EUt(500)
        .inputFluids(Acetylene.getFluid(3000))
        .notConsumable(ALUMINO_SILICATE_GLASS_TUBE)
        .outputFluids(Benzene.getFluid(1000))
        .save(provider);

    //C6H6 + 2 C2H2 -> C10H8 + 2 H
    CHEMICAL_RECIPES.recipeBuilder("trinium_line_naphthalene").duration(230).EUt(500)
        .inputFluids(Benzene.getFluid(1000))
        .inputFluids(Acetylene.getFluid(2000))
        .notConsumable(UVA_HALIDE_LAMP)
        .outputFluids(Naphthalene.getFluid(1000))
        .outputFluids(Hydrogen.getFluid(2000))
        .save(provider);

    //Actinium Side

    //C2H2O + HCl -> C2H3OCl
    CHEMICAL_RECIPES.recipeBuilder("trinium_line_acetyl_chloride").duration(160).EUt(125)
        .inputFluids(Ethenone.getFluid(1000))
        .inputFluids(HydrochloricAcid.getFluid(1000))
        .outputFluids(AcetylChloride.getFluid(1000))
        .save(provider);

// p
    //C2H5OH + C2H2O + 3 HF -> C4H5F3O2 + 6 H
    LARGE_CHEMICAL_RECIPES.recipeBuilder("trinium_line_ethyl_trifluoroacetate").duration(230).EUt(500)
        .inputFluids(Ethanol.getFluid(1000))
        .inputFluids(AcetylChloride.getFluid(1000))
        .inputFluids(HydrofluoricAcid.getFluid(3000))
        .outputFluids(EthylTrifluoroacetate.getFluid(1000))
        .outputFluids(Hydrogen.getFluid(6000))
        .outputFluids(HydrochloricAcid.getFluid(1000))
        .save(provider);

    BLAST_RECIPES.recipeBuilder("trinium_line_phosphorous_pentasulfide").duration(190).EUt(500).blastFurnaceTemp(900)
        .inputDust(Phosphorus, 4)
        .inputDust(Sulfur, 10)
        .outputDust(PhosphorousPentasulfide, 14)
        .save(provider);

    //P4S10 + 10 C4H6O2 + 10 C2H3OCl -> P4O10 + 10 C6H6SO + 10 [HCl + H2O]
    CHEMICAL_RECIPES.recipeBuilder("trinium_line_acetothienone").duration(210).EUt(500)
        .inputDust(PhosphorousPentasulfide, 7)
        .inputFluids(Succinaldehyde.getFluid(5000))
        .inputFluids(AcetylChloride.getFluid(5000))
        .outputFluids(Acetothienone.getFluid(5000))
        .outputFluids(DilutedHydrochloricAcid.getFluid(10000))
        .outputDust(PhosphorousPentoxide, 7)
        .save(provider);

    //C2H5ONa + C6H6SO + C4H5F3O2 + HCl -> NaCl + 2 C2H5OH + C8H5F3O2S
    CHEMICAL_RECIPES.recipeBuilder("trinium_line_theonyl_trifluoroacetate").duration(220).EUt(1000)
        .inputDust(SodiumEthoxide, 9)
        .inputFluids(EthylTrifluoroacetate.getFluid(1000))
        .inputFluids(Acetothienone.getFluid(1000))
        .inputFluids(HydrochloricAcid.getFluid(1000))
        .outputFluids(TheonylTrifluoroacetate.getFluid(1000))
        .outputFluids(Ethanol.getFluid(2000))
        .outputDust(Salt, 2)
        .save(provider);

    MIXER_RECIPES.recipeBuilder("trinium_line_actinium_radium_nitrate_solution").duration(290).EUt(4100)
        .inputFluids(ActiniumRadiumHydroxideSolution.getFluid(1000))
        .inputFluids(NitricAcid.getFluid(12000))
        .outputFluids(ActiniumRadiumNitrateSolution.getFluid(13000))
        .save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("trinium_line_actinium_radium_nitrate_separation").duration(240).EUt(32700)
        .inputFluids(ActiniumRadiumNitrateSolution.getFluid(13000))
        .notConsumableFluid(TheonylTrifluoroacetate.getFluid(500))
        .outputDust(ActiniumNitrate, 26)
        .outputDust(RadiumNitrate, 27)
        .chancedOutput(dust, Thorium, 1, 2500)
        .chancedOutput(dust, Protactinium, 2, 2500)
        .chancedOutput(dust, Francium, 1, 2500)
        .chancedOutput(dust, Radium, 1, 2500)
        .outputFluids(Water.getFluid(13000))
        .save(provider);

  }
}
