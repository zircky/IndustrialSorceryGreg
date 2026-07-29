package com.zircky.industrialsorcerygreg.data.recipe.misc;


import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.dust;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.ingot;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGItems.LOW_FREQUENCY_LASER;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.MIXER_RECIPES;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.TEST_RECIPES;

public class CosmicChain {
  public static void init(Consumer<FinishedRecipe> provider) {
    TEST_RECIPES.recipeBuilder("test")
        .layeredRecipe((layer) -> layer
            .inputItems(dust, Aluminium, 4)
            .inputFluids(Radon.getFluid(1400))
            .next()
            .inputItems(dust, Titanium, 4)
            .inputFluids(Water.getFluid(1500))
            .next()
            .inputItems(ingot, Steel, 3)
            .inputFluids(Steel.getFluid(500)))
        .outputItems(dust, TitaniumCyclopentadienyl, 7)
        .duration(500).EUt(VA[HV]).save(provider);

    ISGRecipeTypes.MIXER_RECIPES.recipeBuilder("cosmic_computing_mix")
        .inputFluids(HeavyLeptonMix.getFluid(1000))
        .inputFluids(HeavyQuarks.getFluid(1000))
        .inputFluids(Gluons.getFluid(1000))
        .outputFluids(CosmicComputingMix.getFluid(3000))
        .duration(100).EUt(VA[UEV]).save(provider);
    MIXER_RECIPES.recipeBuilder("heavy_quark_enriched_mix")
        .inputFluids(HeavyQuarks.getFluid(750))
        .inputFluids(LightQuarks.getFluid(250))
        .outputFluids(HeavyQuarkEnrichedMix.getFluid(1000))
        .duration(100).EUt(VA[UEV]).save(provider);
    MIXER_RECIPES.recipeBuilder("scandium_titanium50_mix")
        .inputFluids(Titanium50.getFluid(144))
        .inputFluids(Scandium.getFluid(144))
        .outputFluids(ScandiumTitanium50Mix.getFluid(288))
        .duration(130).EUt(VA[UV]).save(provider);
    MIXER_RECIPES.recipeBuilder("radon_radium_mix")
        .inputFluids(Radon.getFluid(1000))
        .inputFluids(Radium.getFluid(144))
        .outputFluids(RadonRadiumMix.getFluid(288))
        .duration(130).EUt(VA[UV]).save(provider);
    ISGRecipeTypes.MIXER_RECIPES.recipeBuilder("deuterium_superheavy_mix")
        .inputFluids(Deuterium.getFluid(2000))
        .inputFluids(MetastableHassium.getFluid(144))
        .inputFluids(MetastableFlerovium.getFluid(144))
        .inputFluids(MetastableOganesson.getFluid(144))
        .outputFluids(DeuteriumSuperheavyMix.getFluid(2592))
        .duration(140).EUt(VH[UEV]).save(provider);
    FUSION_RECIPES.recipeBuilder("heavy_quark_degenerate_matter")
        .inputFluids(DeuteriumSuperheavyMix.getFluid(720))
        .inputFluids(HeavyQuarkEnrichedMix.getFluid(720))
        .outputFluids(HeavyQuarkDegenerateMatter.getFluid(720))
        .fusionStartEU(5_000_000_000L)
        .EUt(VH[UHV]).save(provider);
    CHEMICAL_RECIPES.recipeBuilder("trichloroferane")
        .inputFluids(HydrobromicAcid.getFluid(3000))
        .inputItems(dust, MetastableFlerovium)
        .outputFluids(Trichloroferane.getFluid(1000))
        .outputFluids(Hydrogen.getFluid(3000))
        .duration(150).EUt(VA[IV]).save(provider);
    CHEMICAL_RECIPES.recipeBuilder("phenylsodium")
        .inputFluids(FluoroBenzene.getFluid(1000))
        .inputItems(dust, Sodium, 2)
        .outputFluids(Phenylsodium.getFluid(1000))
        .outputItems(dust, SodiumFluoride, 2)
        .duration(210).EUt(VA[HV]).save(provider);
    LARGE_CHEMICAL_RECIPES.recipeBuilder("succinaldehyde")
        .inputItems(dust, LithiumAluminiumHydride, 4)
        .inputItems(dust, SuccinicAcid, 14)
        .outputFluids(Succinaldehyde.getFluid(1000))
        .outputItems(dust, Lithium)
        .outputItems(dust, Aluminium)
        .outputFluids(Water.getFluid(2000))
        .duration(180).EUt(VHA[LuV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder("n_difluorophenylpyrrole")
        .inputFluids(Difluoroaniline.getFluid(1000))
        .inputFluids(Succinaldehyde.getFluid(1000))
        .notConsumable(dust, PhosphorousPentoxide)
        .outputFluids(NDifluorophenylpyrrole.getFluid(1000))
        .outputFluids(Water.getFluid(2000))
        .duration(180).EUt(VA[HV]).save(provider);

    LARGE_CHEMICAL_RECIPES.recipeBuilder("n_difluorophenylpyrrole_alt")
        .inputFluids(HydrochloricAcid.getFluid(2000))
        .inputFluids(Silvertetrafluoroborate.getFluid(2000))
        .inputFluids(Phenylsodium.getFluid(8000))
        .inputFluids(TetraethylammoniumBromide.getFluid(2000))
        .inputItems(dust, SilverPerchlorate, 12)
        .inputItems(dust, TitaniumCyclopentadienyl, 69)
        .inputItems(dust, Ice, 42)
        .inputFluids(NDifluorophenylpyrrole.getFluid(6000))
        .outputItems(dust, SilverChloride, 8)
        .outputItems(dust, SodiumBromide, 4)
        .outputFluids(SaltWater.getFluid(6000))
        .outputFluids(PhotopolymerSolution.getFluid(8000))
        .duration(350).EUt(VA[LuV]).save(provider);

    ELECTROLYZER_RECIPES.recipeBuilder("sodium_chlorate")
        .inputItems(dust, SodiumHypochlorite, 9)
        .outputItems(dust, Salt, 4)
        .outputItems(dust, SodiumChlorate, 5)
        .duration(210).EUt(VA[HV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder("sodium_perchlorate")
        .inputItems(dust, SodiumChlorate, 5)
        .inputFluids(HydrogenPeroxide.getFluid(1000))
        .outputItems(dust, SodiumPerchlorate, 6)
        .outputFluids(Water.getFluid(1000))
        .duration(200).EUt(VA[MV]).save(provider);

    LARGE_CHEMICAL_RECIPES.recipeBuilder("silver_perchlorate")
        .inputItems(dust, SilverOxide, 3)
        .inputItems(dust, SodiumPerchlorate, 12)
        .inputFluids(HydrochloricAcid.getFluid(1000))
        .outputItems(dust, SilverPerchlorate, 12)
        .outputItems(dust, SodiumOxide, 3)
        .outputFluids(DilutedHydrochloricAcid.getFluid(1000))
        .duration(350).EUt(VA[HV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder("silver_oxide")
        .inputItems(dust, SilverChloride, 4)
        .notConsumable(dust, SodiumHydroxide)
        .inputFluids(Water.getFluid(1000))
        .outputItems(dust, SilverOxide, 3)
        .outputFluids(HydrochloricAcid.getFluid(2000))
        .duration(100).EUt(VA[HV]).save(provider);

    BLAST_RECIPES.recipeBuilder("silver_oxide_silver")
        .inputItems(dust, SilverOxide, 3)
        .inputItems(dust, Carbon)
        .outputItems(ingot, Silver, 2)
        .outputFluids(CarbonMonoxide.getFluid(1000))
        .blastFurnaceTemp(1200)
        .duration(80).EUt(VA[MV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder("germanium_sulfide")
        .inputItems(dust, Germanium)
        .inputItems(dust, Sulfur, 2)
        .outputItems(dust, GermaniumSulfide, 3)
        .duration(340).EUt(VA[MV]).save(provider);

    BLAST_RECIPES.recipeBuilder("germanium_oxide")
        .inputItems(dust, GermaniumSulfide, 3)
        .inputFluids(Oxygen.getFluid(6000))
        .outputItems(dust, GermaniumOxide, 3)
        .outputFluids(SulfurDioxide.getFluid(2000))
        .blastFurnaceTemp(2500)
        .duration(240).EUt(VA[MV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder("tungsten_trioxide")
        .inputItems(dust, TungstenCarbide, 2)
        .inputFluids(Oxygen.getFluid(4000))
        .outputItems(dust, TungstenTrioxide, 4)
        .outputFluids(CarbonMonoxide.getFluid(1000))
        .duration(400).EUt(VA[HV]).save(provider);

    BLAST_RECIPES.recipeBuilder("cadmium_tungstate")
        .inputItems(dust, CadmiumSulfide, 2)
        .inputItems(dust, TungstenTrioxide, 4)
        .inputFluids(Oxygen.getFluid(3000))
        .outputItems(dust, CadmiumTungstate, 6)
        .outputFluids(SulfurDioxide.getFluid(1000))
        .blastFurnaceTemp(2800)
        .duration(320).EUt(VA[MV]).save(provider);

    BLAST_RECIPES.recipeBuilder("tl_tm_cesium_iodide")
        .inputItems(dust, CesiumIodide)
        .inputItems(dust, Thulium, 1)
        .inputItems(dust, Thallium, 1)
        .outputItems(dust, TlTmCesiumIodide, 4)
        .blastFurnaceTemp(2853)
        .duration(520).EUt(VA[MV]).save(provider);

    MIXER_RECIPES.recipeBuilder("polycyclic_aromatic_mix")
        .inputFluids(Anthracene.getFluid(1000))
        .inputItems(dust, Tetracene, 2)
        .outputItems(PolycyclicAromaticMix, 3)
        .duration(240).EUt(7680).save(provider);

    CHEMICAL_RECIPES.recipeBuilder("cesium_iodide")
        .inputItems(dust, Caesium)
        .inputItems(dust, Iodine)
        .outputItems(dust, CesiumIodide, 2)
        .duration(340).EUt(120).save(provider);

    LARGE_CHEMICAL_RECIPES.recipeBuilder("")
        .inputFluids(BismuthNitrateSoluton.getFluid(4000))
        .inputItems(dust, GermaniumOxide, 3)
        .notConsumable(LOW_FREQUENCY_LASER.asItem())
        .outputItems(BismuthGermanate, 33)
        .outputItems(dust, Potash, 18)
        .outputFluids(NitrogenDioxide.getFluid(12000))
        .outputFluids(Water.getFluid(4000))
        .duration(80).EUt(500000).save(provider);
  }
}
