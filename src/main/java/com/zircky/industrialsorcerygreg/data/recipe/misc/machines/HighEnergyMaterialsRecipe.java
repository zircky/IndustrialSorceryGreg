package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.block;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.ingotHot;
import static com.gregtechceu.gtceu.common.data.GTItems.SHAPE_MOLD_INGOT;
import static com.zircky.industrialsorcerygreg.common.data.ISGItems.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.TitaniumTetrachloride;
import static com.gregtechceu.gtceu.common.data.GTMaterials.Toluene;
import static com.zircky.industrialsorcerygreg.api.ISGValues.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.*;

public class HighEnergyMaterialsRecipe {
  public static void init(Consumer<FinishedRecipe> provider) {

    FUSION_RECIPES.recipeBuilder("neutron_plasma")
        .inputFluids(SuperheavyMix.getFluid(1000), Taranium.getFluid(144))
        .outputFluids(Neutron.getFluid(8000))
        .fusionStartEU(20_000_000_000L).EUt(VH[UIV]).duration(10)
        .save(provider);

    FUSION_RECIPES.recipeBuilder("hot_metastable_oganesson")
        .inputFluids(Curium250.getFluid(144), OganesonBreedingBase.getFluid(500))
        .outputFluids(HotMetastableOganesson.getFluid(500))
        .fusionStartEU(2_500_000_000L).duration(100).EUt(600_000)
        .save(provider);

    CHEMICAL_RECIPES.recipeBuilder("titanium_tetrafluoride")
        .inputDust(Titanium)
        .inputFluids(HydrobromicAcid.getFluid(4000))
        .outputFluids(TitaniumTetrafluoride.getFluid(1000), Hydrogen.getFluid(4000))
        .duration(300).EUt(VA[MV]).save(provider);

    GAS_CENTRIFUGE_RECIPES.recipeBuilder("titanium_50_tetrafluoride")
        .circuitMeta(0)
        .inputFluids(TitaniumTetrafluoride.getFluid(10000))
        .outputFluids(Titanium50Tetrafluoride.getFluid(518), Fluorine.getFluid(9482))
        .duration(210).EUt(VA[LuV]).save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("carbon_12_and_carbon_13")
        .inputFluids(Carbon.getFluid(10_000))
        .outputFluids(Carbon12.getFluid(9893), Carbon13.getFluid(107))
        .duration(340).EUt(VA[EV]).save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("nitrogen_14_and_nitrogen_15")
        .inputFluids(Nitrogen.getFluid(100_000))
        .outputFluids(Nitrogen14.getFluid(99636), Nitrogen15.getFluid(364))
        .duration(340).EUt(VA[EV]).save(provider);

    LARGE_MIXER_RECIPES.recipeBuilder("cno_catalyst")
        .inputFluids(Nitrogen14.getFluid(1000), Nitrogen15.getFluid(1000), Carbon12.getFluid(1000), Carbon13.getFluid(1000))
        .outputFluids(CNOcatalyst.getFluid(4000))
        .duration(340).EUt(VA[IV]).save(provider);

    MIXER_RECIPES.recipeBuilder("oganeson_breeding_base")
        .inputFluids(Titanium50.getFluid(288), Californium252.getFluid(2000))
        .outputFluids(OganesonBreedingBase.getFluid(4000))
        .duration(SECONDS * 6).EUt(VA[IV]).save(provider);

    FUSION_RECIPES.recipeBuilder("quasifissioning")
        .inputFluids(Uranium238.getFluid(500), Uranium238.getFluid(500))
        .outputFluids(Quassifissioning.getFluid(500))
        .fusionStartEU(2_500_000_000L)
        .duration(75).EUt(600_000).save(provider);

    MIXER_RECIPES.recipeBuilder("chlorinated_solvents")
        .inputFluids(Methane.getFluid(2000))
        .inputFluids(Chlorine.getFluid(5000))
        .outputFluids(ChlorinatedSolvents.getFluid(7000))
        .duration(SECONDS * 12).EUt(VA[EV]).save(provider);

    DISTILLATION_RECIPES.recipeBuilder("dichloromethane")
        .inputFluids(ChlorinatedSolvents.getFluid(14000))
        .outputFluids(Chloromethane.getFluid(1330))
        .outputFluids(Dichloromethane.getFluid(2170))
        .outputFluids(Chloroform.getFluid(2170))
        .outputFluids(CarbonTetrachloride.getFluid(1330))
        .duration(SECONDS * 12).EUt(VA[EV]).save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("helium_cno_separation")
        .inputFluids(HeliumCNO.getFluid(800))
        .outputFluids(Helium.getFluid(640), CNOcatalyst.getFluid(160))
        .duration(150).EUt(VA[IV]).save(provider);

    BLAST_RECIPES.recipeBuilder("titanium_50")
        .inputFluids(Titanium50Tetrafluoride.getFluid(1000))
        .inputDust(Sodium, 4)
        .outputItems(ingotHot, Titanium50)
        .outputDust(SodiumFluoride, 8)
        .blastFurnaceTemp(Titanium.getBlastTemperature())
        .duration(340).EUt(VA[MV]).save(provider);

    VACUUM_RECIPES.recipeBuilder("metastable_oganesson")
        .notConsumable(SHAPE_MOLD_INGOT)
        .inputFluids(HotMetastableOganesson.getFluid(125))
        .outputItems(ingotHot, MetastableOganesson)
        .duration(3800).EUt(VA[MV]).save(provider);

    FUSION_RECIPES.recipeBuilder("titanium_44_plasma")
        .inputFluids(Calcium.getFluid(250), Helium.getFluid(250))
        .outputFluids(Titanium44.getFluid(250))
        .fusionStartEU(200_000_000L).duration(128).EUt(VA[IV])
        .save(provider);

    FUSION_RECIPES.recipeBuilder("chromium_48_plasma")
        .inputFluids(Titanium44.getFluid(250), Helium.getFluid(250))
        .outputFluids(Chromium48.getFluid(250))
        .fusionStartEU(220_000_000L).duration(128).EUt(VA[IV])
        .save(provider);

    FUSION_RECIPES.recipeBuilder("iron_52_plasma")
        .inputFluids(Chromium48.getFluid(250), Helium.getFluid(250))
        .outputFluids(Iron52.getFluid(250))
        .fusionStartEU(240_000_000L).duration(128).EUt(VA[IV])
        .save(provider);

    FUSION_RECIPES.recipeBuilder("nickel_56_plasma")
        .inputFluids(Iron52.getFluid(250), Helium.getFluid(250))
        .outputFluids(Nickel56.getFluid(250))
        .fusionStartEU(250_000_000L).duration(128).EUt(VA[IV])
        .save(provider);

    FUSION_RECIPES.recipeBuilder("helium_rich_cno_plasma")
        .inputFluids(CNOcatalyst.getFluid(320), Hydrogen.getFluid(1280))
        .outputFluids(HeliumCNO.getFluid(1600))
        .fusionStartEU(100_000_000L).duration(128).EUt(VA[IV])
        .save(provider);

    FUSION_RECIPES.recipeBuilder("carbon_burning_process")
        .inputFluids(Carbon12.getFluid(250), Carbon12.getFluid(250))
        .outputFluids(Neon.getFluid(250), Helium4.getFluid(250))
        .fusionStartEU(2_500_000_000L).duration(100).EUt(600_000)
        .save(provider);

    MIXER_RECIPES.recipeBuilder("sodium_hydroxide_bauxite")
        .inputFluids(SodiumHydroxideSolution.getFluid(24000))
        .inputDust(Bauxite, 39)
        .outputFluids(SodiumHydroxideBauxite.getFluid(24000))
        .duration(240).EUt(VA[LV]).save(provider);

    FLUID_HEATER_RECIPES.recipeBuilder("impure_aluminium_hydroxide_solution")
        .circuitMeta(0)
        .inputFluids(SodiumHydroxideBauxite.getFluid(1000))
        .outputFluids(ImpureAluminiumHydroxideSolution.getFluid(1000))
        .duration(30).EUt(VA[LV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder("pure_aluminium_hydroxide_solution")
        .inputFluids(Water.getFluid(5000), ImpureAluminiumHydroxideSolution.getFluid(24000))
        .outputFluids(RedMud.getFluid(8000), PureAluminiumHydroxideSolution.getFluid(16000))
        .duration(230).EUt(VA[MV]).save(provider);

    MIXER_RECIPES.recipeBuilder("neutralised_red_mud")
        .inputFluids(RedMud.getFluid(1000), HydrochloricAcid.getFluid(4000))
        .outputFluids(NeutralisedRedMud.getFluid(2000))
        .duration(100).EUt(VA[MV]).save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("red_slurry")
        .inputFluids(NeutralisedRedMud.getFluid(2000))
        .outputFluids(RedSlurry.getFluid(1000), FerricREEChloride.getFluid(1000), SaltWater.getFluid(4000))
        .duration(100).EUt(VA[MV]).save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("ferric_ree_chloride")
        .inputFluids(FerricREEChloride.getFluid(2000))
        .outputFluids(RareEarthChloridesSolution.getFluid(1000), IronChloride.getFluid(1000), Water.getFluid(3000))
        .duration(320).EUt(VA[HV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder("titanyl_sulfate")
        .inputFluids(RedSlurry.getFluid(2000), SulfuricAcid.getFluid(2000))
        .outputFluids(TitanylSulfate.getFluid(2000), Water.getFluid(2000))
        .duration(160).EUt(VA[MV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder("titanium_tetrachloride_from_titanyl_sulfate")
        .inputFluids(TitanylSulfate.getFluid(1000), HydrochloricAcid.getFluid(4000))
        .outputFluids(TitaniumTetrachloride.getFluid(1000), SulfuricAcid.getFluid(1000))
        .duration(160).EUt(VA[HV]).save(provider);

    DISTILLATION_RECIPES.recipeBuilder("dilute_nitric_acid")
        .inputFluids(DiluteNitricAcid.getFluid(2000))
        .outputFluids(Water.getFluid(1000), NitricAcid.getFluid(1000))
        .duration(300).EUt(VA[HV]).save(provider);

    MIXER_RECIPES.recipeBuilder("barium_sulfate_solution")
        .inputDust(Barite, 6)
        .inputFluids(Water.getFluid(1000))
        .outputFluids(BariumSulfateSolution.getFluid(1000))
        .duration(VA[MV]).EUt(VA[LV]).save(provider);

    MIXER_RECIPES.recipeBuilder("calcium_carbonate_solution")
        .circuitMeta(0)
        .inputDust(Calcite)
        .inputFluids(Water.getFluid(1000))
        .outputFluids(CalciumCarbonateSolution.getFluid(1000))
        .duration(VA[MV]).EUt(VA[LV]).save(provider);

    MIXER_RECIPES.recipeBuilder("bentonite_clay_slurry")
        .inputDust(Bentonite)
        .inputDust(Clay)
        .inputFluids(Water.getFluid(2000))
        .outputFluids(BentoniteClaySlurry.getFluid(2000))
        .duration(VA[MV]).EUt(VA[LV]).save(provider);

    FLUID_HEATER_RECIPES.recipeBuilder("hot_nitrogen")
        .circuitMeta(0)
        .inputFluids(Nitrogen.getFluid(1000))
        .outputFluids(HotNitrogen.getFluid(1000))
        .duration(VA[MV]).EUt(VA[MV]).save(provider);

    MIXER_RECIPES.recipeBuilder("wet_ethylene_oxide")
        .inputFluids(EthyleneOxide.getFluid(1000), Water.getFluid(1000))
        .outputFluids(WetEthyleneOxide.getFluid(1000))
        .duration(140).EUt(VA[MV]).save(provider);

    FLUID_HEATER_RECIPES.recipeBuilder("ethylene_glycol")
        .circuitMeta(0)
        .inputFluids(WetEthyleneOxide.getFluid(1000))
        .outputFluids(EthyleneGlycol.getFluid(1000))
        .duration(130).EUt(VA[MV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder("chloroethanol")
        .inputFluids(HypochlorousAcid.getFluid(1000), Ethylene.getFluid(1000))
        .outputFluids(Chloroethanol.getFluid(1000))
        .duration(VA[MV]).EUt(VA[HV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder("choline")
        .inputDust(Sodium)
        .inputFluids(Chloroethanol.getFluid(1000), Trimethylamine.getFluid(1000))
        .outputDust(Salt, 2)
        .outputFluids(Choline.getFluid(1000))
        .duration(VA[MV]).EUt(VA[HV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder("atl")
        .inputDust(Coal) //
        .inputFluids(Choline.getFluid(1000))
        .outputFluids(ATL.getFluid(1000))
        .duration(VA[MV]).EUt(VA[MV]).save(provider);

    LARGE_MIXER_RECIPES.recipeBuilder("drilling_mud")
        .inputFluids(BariumSulfateSolution.getFluid(1000), CalciumCarbonateSolution.getFluid(1000),
            BentoniteClaySlurry.getFluid(1000), Lubricant.getFluid(1000), ATL.getFluid(1000),
            EthyleneGlycol.getFluid(1000))
        .outputFluids(DrillingMud.getFluid(6000))
        .duration(VA[MV]).EUt(VA[HV]).save(provider);

    MIXER_RECIPES.recipeBuilder("cacbas_mixture")
        .inputFluids(BariumSulfateSolution.getFluid(1000), CalciumCarbonateSolution.getFluid(1000))
        .outputFluids(CaCBaSMixture.getFluid(2000))
        .duration(VA[MV]).EUt(VA[LV]).save(provider);

    MIXER_RECIPES.recipeBuilder("lubricant_clay_slurry")
        .inputFluids(BentoniteClaySlurry.getFluid(1000), Lubricant.getFluid(1000))
        .outputFluids(LubricantClaySlurry.getFluid(2000))
        .duration(VA[MV]).EUt(VA[LV]).save(provider);

    MIXER_RECIPES.recipeBuilder("atl_ethylene_mixture")
        .inputFluids(ATL.getFluid(1000), EthyleneGlycol.getFluid(1000))
        .outputFluids(ATLEthylene.getFluid(2000))
        .duration(VA[MV]).EUt(VA[LV]).save(provider);

    MIXER_RECIPES.recipeBuilder("drilling_mud_mixture")
        .inputFluids(CaCBaSMixture.getFluid(2000), LubricantClaySlurry.getFluid(2000))
        .outputFluids(DrillingMudMixture.getFluid(4000))
        .duration(60).EUt(VA[MV]).save(provider);

    MIXER_RECIPES.recipeBuilder("drilling_mud_from_mixture")
        .inputFluids(DrillingMudMixture.getFluid(4000), ATLEthylene.getFluid(2000))
        .outputFluids(DrillingMud.getFluid(6000))
        .duration(60).EUt(VA[MV]).save(provider);

    LARGE_CHEMICAL_RECIPES.recipeBuilder("toluene_diisocyanate")
        .inputFluids(Toluene.getFluid(1000), Phosgene.getFluid(2000), NitricAcid.getFluid(2000), Hydrogen.getFluid(10000))
        .outputFluids(TolueneDiisocyanate.getFluid(2000), HydrochloricAcid.getFluid(4000), Water.getFluid(6000))
        .duration(125).EUt(VA[HV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder("polyurethane")
        .inputFluids(TolueneDiisocyanate.getFluid(1000), EthyleneGlycol.getFluid(4000), Oxygen.getFluid(1000))
        .outputFluids(Polyurethane.getFluid(1000), Water.getFluid(7000))
        .duration(110).EUt(VA[HV]).save(provider);

    MIXER_RECIPES.recipeBuilder("viscoelastic_polyurethane")
        .inputFluids(Polyurethane.getFluid(1000), EthyleneGlycol.getFluid(1000))
        .inputDust(Calcite, 5)
        .outputFluids(ViscoelasticPolyurethane.getFluid(2000))
        .duration(110).EUt(VA[MV]).save(provider);

    MIXER_RECIPES.recipeBuilder("viscoelastic_polyurethane_foam")
        .inputFluids(ViscoelasticPolyurethane.getFluid(1000), Air.getFluid(1000))
        .outputFluids(ViscoelasticPolyurethaneFoam.getFluid(2000))
        .duration(150).EUt(VA[MV]).save(provider);

    DECAY_CHAMBERS_RECIPES.recipeBuilder("calcium_44")
        .inputFluids(Titanium44.getFluid(144))
        .outputFluids(Calcium44.getFluid(144))
        .duration(180).EUt(VA[IV]).save(provider);

    DECAY_CHAMBERS_RECIPES.recipeBuilder("chromium_48_decay")
        .inputFluids(Chromium48.getFluid(144))
        .outputFluids(Titanium.getFluid(144))
        .duration(180).EUt(VA[IV]).save(provider);

    DECAY_CHAMBERS_RECIPES.recipeBuilder("iron_52_decay")
        .inputFluids(Iron52.getFluid(144))
        .outputFluids(Chromium.getFluid(144))
        .duration(180).EUt(VA[IV]).save(provider);

    DECAY_CHAMBERS_RECIPES.recipeBuilder("nickel_56_decay")
        .inputFluids(Nickel56.getFluid(144))
        .outputFluids(Iron.getFluid(144))
        .duration(180).EUt(VA[IV]).save(provider);

    DECAY_CHAMBERS_RECIPES.recipeBuilder("flyb")
        .inputFluids(Quassifissioning.getFluid(1000))
        .outputFluids(FlYb.getFluid(1000))
        .duration(160).EUt(VA[LuV]).save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("flyb_separation")
        .inputFluids(FlYb.getFluid(1000))
        .outputFluids(MetastableFlerovium.getFluid(288), Ytterbium178.getFluid(288))
        .duration(290).EUt(VA[EV]).save(provider);

    DECAY_CHAMBERS_RECIPES.recipeBuilder("ytterbium_178_decay")
        .inputFluids(Ytterbium178.getFluid(144))
        .outputFluids(Hafnium.getFluid(144))
        .duration(VA[MV]).EUt(VA[IV]).save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("calcium_carbonate_solution")
        .inputFluids(CalciumCarbonateSolution.getFluid(1000))
        .outputDust(Calcite)
        .outputFluids(Water.getFluid(1000))
        .duration(200).EUt(VA[LV]).save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("used_drilling_mud")
        .inputFluids(UsedDrillingMud.getFluid(1000))
        .outputFluids(DrillingMud.getFluid(990))
        .duration(VA[MV]).EUt(VA[LV]).save(provider);

    LARGE_MIXER_RECIPES.recipeBuilder("uu_matter_from_bosonic_and_fermionic")
        .inputFluids(BosonicUUMatter.getFluid(1000), FermionicUUMatter.getFluid(1000), FreeElectronGas.getFluid(2000))
        .outputFluids(UUMatter.getFluid(1000))
        .duration(50).EUt(VA[ZPM]).save(provider);

    MIXER_RECIPES.recipeBuilder("glucose_iron_solution")
        .inputFluids(IronChloride.getFluid(1000))
        .inputDust(Glucose, 24)
        .outputFluids(GlucoseIronSolution.getFluid(1000))
        .duration(80).EUt(VA[LV]).save(provider);

    MIXER_RECIPES.recipeBuilder("graphene_oxidation_solution")
        .inputDust(PotassiumPermanganate, 6)
        .inputDust(SodiumNitrate, 5)
        .inputFluids(SulfuricAcid.getFluid(1000))
        .outputFluids(GrapheneOxidationSolution.getFluid(1000))
        .duration(260).EUt(VA[MV]).save(provider);

    EXTRACTOR_RECIPES.recipeBuilder("graphene_oxidation_solution_from_residue")
        .inputDust(GrapheneOxidationResidue)
        .outputFluids(GrapheneOxidationSolution.getFluid(100))
        .duration(65).EUt(VA[LV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder("diborane")
        .inputFluids(BoronFluoride.getFluid(4000))
        .inputDust(LithiumAluminiumHydride, 18)
        .outputFluids(Diborane.getFluid(2000))
        .outputDust(LithiumAluminiumFluoride, 18)
        .duration(80).EUt(VA[LV]).save(provider);

    DEHYDRATOR_RECIPES.recipeBuilder("diborane_to_boron")
        .notConsumableDust(Boron)
        .inputFluids(Diborane.getFluid(1000))
        .outputDust(Boron, 2)
        .duration(60).EUt(VA[HV]).save(provider);

    LARGE_MIXER_RECIPES.recipeBuilder("non_metals")
        .inputDust(Boron)
        .inputDust(Carbon)
        .inputDust(Phosphorus)
        .inputDust(Sulfur)
        .inputDust(Arsenic)
        .inputDust(Selenium)
        .inputDust(Tellurium)
        .inputDust(Iodine)
        .inputDust(Astatine)
        .inputFluids(Oxygen.getFluid(1000), Nitrogen.getFluid(1000), Hydrogen.getFluid(1000), Fluorine.getFluid(1000),
            Chlorine.getFluid(1000), Bromine.getFluid(1000))
        .outputFluids(NonMetals.getFluid(15000))
        .duration(450).EUt(VHA[UV]).save(provider);

    LARGE_MIXER_RECIPES.recipeBuilder("noble_gases_mixture")
        .inputFluids(Helium.getFluid(1000), Neon.getFluid(1000), Argon.getFluid(1000), Krypton.getFluid(1000),
            Xenon.getFluid(1000), Radon.getFluid(1000))
        .outputFluids(NobleGases.getFluid(6000))
        .duration(180).EUt(VHA[UV]).save(provider);

    VACUUM_RECIPES.recipeBuilder("liquid_nitrogen")
        .inputFluids(Nitrogen.getFluid(5000))
        .outputFluids(LiquidNitrogen.getFluid(5000))
        .duration(20).EUt(VA[HV]).save(provider);

    MIXER_RECIPES.recipeBuilder("liquid_enriched_helium")
        .inputFluids(Helium.getFluid(FluidStorageKeys.LIQUID, 1000), Helium3.getFluid(1000))
        .outputFluids(LiquidEnrichedHelium.getFluid(2000))
        .duration(60).EUt(VA[IV]).save(provider);

    LARGE_CHEMICAL_RECIPES.recipeBuilder("superfluid_helium")
        .inputFluids(LiquidEnrichedHelium.getFluid(2000), LiquidNitrogen.getFluid(1000))
        .outputFluids(SuperfluidHelium.getFluid(1000), Helium3.getFluid(1000), Nitrogen.getFluid(1000))
        .duration(150).EUt(VHA[UHV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder("neutronium_doped_nanotubes")
        .inputFluids(Cycloparaphenylene.getFluid(200), Methane.getFluid(800))
        .inputDust(Neutronium)
        .notConsumable(block, Rhenium)
        .outputFluids(NeutroniumDopedNanotubes.getFluid(1000))
        .duration(290).EUt(VA[UV]).save(provider);

    LARGE_CHEMICAL_RECIPES.recipeBuilder("acetylsulfanilyl_chloride")
        .inputFluids(Aniline.getFluid(1000), AceticAnhydride.getFluid(1000), ChlorosulfonicAcid.getFluid(1000))
        .outputFluids(AcetylsulfanilylChloride.getFluid(1000), Water.getFluid(1000), AceticAcid.getFluid(1000))
        .duration(100).EUt(VA[EV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder("sodium_alginate_solution")
        .inputDust(SodaAsh, 6)
        .inputFluids(Water.getFluid(6000))
        .outputFluids(SodiumAlginateSolution.getFluid(6000), CarbonDioxide.getFluid(6000))
        .duration(600).EUt(VA[EV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder("ascorbic_acid")
        .inputFluids(DehydroascorbicAcid.getFluid(1000), Hydrogen.getFluid(2000))
        .notConsumable(com.gregtechceu.gtceu.api.data.tag.TagPrefix.dust, Nickel)
        .outputFluids(AscorbicAcid.getFluid(1000))
        .duration(280).EUt(VA[HV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder("dehydroascorbic_acid")
        .inputFluids(AscorbicAcid.getFluid(1000), Oxygen.getFluid(1000))
        .outputFluids(DehydroascorbicAcid.getFluid(1000), Water.getFluid(1000))
        .duration(140).EUt(VA[HV]).save(provider);


    // From misc/test/BrineChain.txt:145
    BLAST_RECIPES.recipeBuilder("dilute_nitric_acid").duration(200).EUt(VA[MV]).blastFurnaceTemp(500)
    .inputDust(UranylNitrate, 11)
    .inputFluids(Water.getFluid(1000))
    .outputDust(UraniumRadioactive, 3)
    .outputFluids(DiluteNitricAcid.getFluid(2000))
    .save(provider);

    // From misc/test/CosmicChain.txt:41
    CENTRIFUGE_RECIPES.recipeBuilder("heavy_quarks").duration(200).EUt(VA[UHV])
    .inputFluids(QuarkGluonPlasma.getFluid(1000 * 5))
    .notConsumable(SEPARATION_ELECTROMAGNET.asItem())
    .outputFluids(HeavyQuarks.getFluid(750 * 5))
    .outputFluids(Gluons.getFluid(500 * 5))
    .outputFluids(LightQuarks.getFluid(250 * 5))
    .save(provider);

    // From misc/test/CosmicChain.txt:18
    STELLAR_FORGE_RECIPES.recipeBuilder("quark_gluon_plasma_from_degenerate_rhenium_dust")
        .inputDust(ElectronDegenerateRhenium)
        .circuitMeta(1)
        .outputFluids(QuarkGluonPlasma.getFluid(4000))
        .duration(60).EUt(VH[UIV])
        .save(provider);

    // From misc/test/CosmicChain.txt:25
    STELLAR_FORGE_RECIPES.recipeBuilder("quark_gluon_plasma_from_degenerate_rhenium_plate")
        .inputItems(plate, ElectronDegenerateRhenium)
        .circuitMeta(2)
        .outputFluids(QuarkGluonPlasma.getFluid(2000))
        .duration(60).EUt(VH[UIV])
        .save(provider);

    // From misc/test/UltimateMaterials.txt:218
    STELLAR_FORGE_RECIPES.recipeBuilder("dense_neutron")
        .inputItems(block, Neutronium, 5)
        .inputItems(block, HeavyQuarkDegenerateMatter, 5)
        .inputFluids(HeavyLeptonMix.getFluid(6000))
        .inputFluids(Gluons.getFluid(6000))
        .inputFluids(Periodicium.getFluid(2736))
        .outputFluids(DenseNeutron.getFluid(18000))
        .duration(10).EUt(125000000)
        .save(provider);

    // From misc/test/UltimateMaterials.txt:265
    STELLAR_FORGE_RECIPES.recipeBuilder("cosmic_mesh")
        .inputItems(plate, CarbonNanotubes, 3)
        .inputItems(plate, CosmicNeutronium, 3)
        .inputItems(plate, FullerenePolymerMatrix, 3)
        .outputFluids(CosmicMesh.getFluid(1000))
        .duration(10).EUt(100000000)
        .save(provider);

    // From misc/test/CosmicChain.txt:49
    LARGE_MIXER_RECIPES.recipeBuilder("cosmic_computing_mix").duration(100).EUt(VHA[UEV])
    .inputFluids(HeavyLeptonMix.getFluid(1000))
    .inputFluids(HeavyQuarks.getFluid(1000))
    .inputFluids(Gluons.getFluid(1000))
    .outputFluids(CosmicComputingMix.getFluid(3000))
    .save(provider);

    // From misc/test/CosmicChain.txt:56
    MIXER_RECIPES.recipeBuilder("heavy_quark_enriched_mix").duration(100).EUt(3250000)
    .inputFluids(HeavyQuarks.getFluid(750))
    .inputFluids(LightQuarks.getFluid(250))
    .outputFluids(HeavyQuarkEnrichedMix.getFluid(1000))
    .save(provider);

    // From misc/test/CosmicChain.txt:62
    MIXER_RECIPES.recipeBuilder("scandium_titanium50_mix").duration(130).EUt(450000)
    .inputFluids(Titanium50.getFluid(144))
    .inputFluids(Scandium.getFluid(144))
    .outputFluids(ScandiumTitanium50Mix.getFluid(288))
    .save(provider);

    // From misc/test/CosmicChain.txt:68
    MIXER_RECIPES.recipeBuilder("radon_radium_mix").duration(130).EUt(450000)
    .inputFluids(Radon.getFluid(1000))
    .inputFluids(Radium.getFluid(144))
    .outputFluids(RadonRadiumMix.getFluid(288))
    .save(provider);

    // From misc/test/CosmicChain.txt:74
    LARGE_MIXER_RECIPES.recipeBuilder("deuterium_superheavy_mix").duration(140).EUt(4500000)
    .inputFluids(Deuterium.getFluid(2000))
    .inputFluids(MetastableHassium.getFluid(144))
    .inputFluids(MetastableFlerovium.getFluid(144))
    .inputFluids(MetastableOganesson.getFluid(144))
    .outputFluids(DeuteriumSuperheavyMix.getFluid(2592))
    .save(provider);

    // From misc/test/CosmicChain.txt:89
    CHEMICAL_RECIPES.recipeBuilder("trichloroferane").duration(150).EUt(VA[IV])
    .inputFluids(HydrochloricAcid.getFluid(3000))
    .inputDust(MetastableFlerovium)
    .outputFluids(Trichloroferane.getFluid(1000))
    .outputFluids(Hydrogen.getFluid(3000))
    .save(provider);

    // From misc/test/CosmicChain.txt:97
    CHEMICAL_RECIPES.recipeBuilder("phenylsodium").duration(210).EUt(VA[HV])
    .inputFluids(FluoroBenzene.getFluid(1000))
    .inputDust(Sodium, 2)
    .outputFluids(Phenylsodium.getFluid(1000))
    .outputDust(SodiumFluoride, 2)
    .save(provider);

    // From misc/test/CosmicChain.txt:105
    LARGE_CHEMICAL_RECIPES.recipeBuilder("succinaldehyde").duration(180).EUt(VHA[LuV])
    .inputDust(LithiumAluminiumHydride, 4)
    .inputDust(SuccinicAcid, 14)
    .outputFluids(Succinaldehyde.getFluid(1000))
    .outputDust(Lithium)
    .outputDust(Aluminium)
    .outputFluids(Water.getFluid(2000))
    .save(provider);

    // From misc/test/CosmicChain.txt:115
    CHEMICAL_RECIPES.recipeBuilder("difluoroaniline").duration(160).EUt(VA[HV])
    .inputDust(PotassiumFluoride, 4)
    .inputFluids(Hydrogen.getFluid(1000))
    .inputFluids(Dichlorobenzene.getFluid(1000))
    .inputFluids(Nitrogen.getFluid(1000))
    .notConsumableDust(AluminiumChloride)
    .outputDust(RockSalt, 4)
    .outputFluids(Difluoroaniline.getFluid(1000))
    .save(provider);

    // From misc/test/CosmicChain.txt:126
    CHEMICAL_RECIPES.recipeBuilder("ndifluorophenylpyrrole").duration(180).EUt(VA[HV])
    .inputFluids(Difluoroaniline.getFluid(1000))
    .inputFluids(Succinaldehyde.getFluid(1000))
    .notConsumableDust(com.zircky.industrialsorcerygreg.common.data.ISGMaterials.PhosphorusPentoxide)
    .outputFluids(NDifluorophenylpyrrole.getFluid(1000))
    .outputFluids(Water.getFluid(2000))
    .save(provider);

    // From misc/test/CosmicChain.txt:135
    LARGE_CHEMICAL_RECIPES.recipeBuilder("photopolymer_solution").duration(350).EUt(VA[LuV])
    .inputFluids(HydrochloricAcid.getFluid(2000))
    .inputFluids(Silvertetrafluoroborate.getFluid(2000))
    .inputFluids(Phenylsodium.getFluid(8000))
    .inputFluids(TetraethylammoniumBromide.getFluid(2000))
    .inputDust(SilverPerchlorate, 12)
    .inputDust(TitaniumCyclopentadienyl, 69)
    .inputDust(Ice, 42)
    .inputFluids(NDifluorophenylpyrrole.getFluid(6000))
    .outputDust(SilverChloride, 8)
    .outputDust(SodiumBromide, 4)
    .outputFluids(SaltWater.getFluid(6000))
    .outputFluids(PhotopolymerSolution.getFluid(8000))
    .save(provider);

    // From misc/test/Dyes.txt:39
    LARGE_CHEMICAL_RECIPES.recipeBuilder("phosphorous_arsenic_solution").duration(260).EUt(500)
    .inputDust(SodaAsh, 6)
    .inputFluids(ApatiteAcidicLeach.getFluid(12000))
    .inputDust(SiliconDioxide, 3)
    .inputFluids(HydrochloricAcid.getFluid(1000))
    .outputFluids(PhosphorousArsenicSolution.getFluid(3000))
    .outputDust(ApatiteSolidResidue, 11)
    .outputFluids(CarbonDioxide.getFluid(1000))
    .save(provider);

    // From misc/test/Dyes.txt:68
    LARGE_CHEMICAL_RECIPES.recipeBuilder("phosphorous_arsenic_solution_2").duration(260).EUt(500)
    .inputDust(SodaAsh, 6)
    .inputFluids(FluoroapatiteAcidicLeach.getFluid(12000))
    .inputDust(SiliconDioxide, 3)
    .inputFluids(HydrochloricAcid.getFluid(1000))
    .outputFluids(PhosphorousArsenicSolution.getFluid(3000))
    .outputDust(FluoroapatiteSolidResidue, 11)
    .outputFluids(CarbonDioxide.getFluid(1000))
    .save(provider);

    // From misc/test/Dyes.txt:79
    CENTRIFUGE_RECIPES.recipeBuilder("fluorosilicic_acid").duration(320).EUt(500)
    .inputFluids(HydrochloricAcid.getFluid(3500))
    .inputDust(FluoroapatiteSolidResidue, 11)
    .outputFluids(FluorosilicicAcid.getFluid(1000))
    .outputDust(Salt, 2)
    .outputFluids(IronChloride.getFluid(500))
    .outputFluids(Water.getFluid(750))
    .save(provider);

    // From misc/test/Dyes.txt:172
    CHEMICAL_RECIPES.recipeBuilder("mercury_nitrate").duration(210).EUt(500)
    .inputFluids(Mercury.getFluid(1000))
    .inputFluids(NitricAcid.getFluid(4000))
    .inputFluids(NitrogenDioxide.getFluid(2000))
    .outputFluids(Water.getFluid(2000))
    .outputFluids(MercuryNitrate.getFluid(1000))
    .save(provider);

    // From misc/test/Dyes.txt:198
    CHEMICAL_RECIPES.recipeBuilder("bismuth_vanadate_solution").duration(220).EUt(640)
    .inputDust(AmmoniumVanadate, 9)
    .inputFluids(BismuthNitrateSoluton.getFluid(1000))
    .inputFluids(Ammonia.getFluid(2000))
    .inputFluids(Water.getFluid(1000))
    .outputFluids(AmmoniumNitrate.getFluid(3000))
    .outputFluids(BismuthVanadateSolution.getFluid(1000))
    .save(provider);

    // From misc/test/Dyes.txt:313
    CHEMICAL_RECIPES.recipeBuilder("nitrotoluene").duration(340).EUt(1350)
    .inputFluids(Toluene.getFluid(1000))
    .inputFluids(NitrationMixture.getFluid(2000))
    .inputFluids(SulfuricAcid.getFluid(1000))
    .outputFluids(Nitrotoluene.getFluid(1000))
    .outputFluids(DilutedSulfuricAcid.getFluid(3000))
    .save(provider);

    // From misc/test/Dyes.txt:355
    LARGE_CHEMICAL_RECIPES.recipeBuilder("naphthylamine").duration(230).EUt(1400)
    .inputFluids(NitrationMixture.getFluid(2000))
    .inputFluids(Naphthalene.getFluid(1000))
    .inputFluids(Hydrogen.getFluid(6000))
    .outputFluids(Naphthylamine.getFluid(1000))
    .outputFluids(SulfuricAcid.getFluid(1000))
    .outputFluids(Water.getFluid(3000))
    .save(provider);

    // From misc/test/Dyes.txt:395
    CHEMICAL_RECIPES.recipeBuilder("acetoacetanilide").duration(350).EUt(1350)
    .inputFluids(Ethenone.getFluid(2000))
    .inputFluids(Aniline.getFluid(1000))
    .outputFluids(Acetoacetanilide.getFluid(1000))
    .save(provider);

    // From misc/test/Dyes.txt:413
    CHEMICAL_RECIPES.recipeBuilder("toluenesulfonate").duration(220).EUt(950)
    .inputDust(Salt, 2)
    .inputFluids(Toluene.getFluid(1000))
    .inputFluids(SulfurTrioxide.getFluid(1000))
    .outputFluids(Toluenesulfonate.getFluid(1000))
    .outputFluids(HydrochloricAcid.getFluid(1000))
    .save(provider);

    // From misc/test/Dyes.txt:422
    CHEMICAL_RECIPES.recipeBuilder("quinizarin").duration(240).EUt(1400)
    .inputFluids(Hydroquinone.getFluid(1000))
    .inputDust(PhthalicAnhydride, 15)
    .notConsumableFluid(Toluenesulfonate.getFluid(1))
    .outputFluids(Quinizarin.getFluid(1000))
    .outputFluids(Water.getFluid(1000))
    .save(provider);

    // From misc/test/Dyes.txt:522
    CHEMICAL_RECIPES.recipeBuilder("maleic_anhydride").duration(520).EUt(1340)
    .notConsumableDust(BismuthVanadate)
    .inputFluids(Butane.getFluid(1000))
    .inputFluids(Oxygen.getFluid(7000))
    .outputFluids(Water.getFluid(4000))
    .outputFluids(MaleicAnhydride.getFluid(1000))
    .save(provider);

    // From misc/test/Dyes.txt:540
    CHEMICAL_RECIPES.recipeBuilder("isopropylsuccinate").duration(260).EUt(1400)
    .inputDust(SuccinicAcid, 14)
    .inputFluids(IsopropylAlcohol.getFluid(2000))
    .outputFluids(Isopropylsuccinate.getFluid(1000))
    .outputFluids(Water.getFluid(2000))
    .save(provider);

    // From misc/test/Dyes.txt:548
    CHEMICAL_RECIPES.recipeBuilder("benzonitrile").duration(200).EUt(1700)
    .inputFluids(Toluene.getFluid(1000))
    .inputFluids(Ammonia.getFluid(1000))
    .inputFluids(Oxygen.getFluid(3000))
    .outputFluids(Benzonitrile.getFluid(1000))
    .outputFluids(Water.getFluid(3000))
    .save(provider);

    // From misc/test/FullereneChain.txt:352
    CHEMICAL_RECIPES.recipeBuilder("benzoyl_peroxide")
    .inputFluids(HydrogenPeroxide.getFluid(1000))
    .inputFluids(BenzoylChloride.getFluid(2000))
    .outputFluids(BenzoylPeroxide.getFluid(1000))
    .outputFluids(HydrochloricAcid.getFluid(2000))
    .EUt(VA[EV])
    .duration(160)
    .save(provider);

    // From misc/test/GoldChain.txt:116
    CHEMICAL_RECIPES.recipeBuilder("chloroauric_acid").duration(80)
    .inputDust(GoldLeach, 4)
    .inputFluids(HydrochloricAcid.getFluid(1000))
    .outputDust(CopperLeach, 4)
    .outputFluids(ChloroauricAcid.getFluid(1000))
    .save(provider);

    // From misc/test/InsulationWireAssemblyChain.txt:17
    CHEMICAL_RECIPES.recipeBuilder("tetraethylammonium_bromide").duration(240).EUt(VA[MV])
    .inputFluids(Ethylene.getFluid(4000))
    .inputFluids(Ammonia.getFluid(1000))
    .inputFluids(HydrobromicAcid.getFluid(1000))
    .outputFluids(TetraethylammoniumBromide.getFluid(1000))
    .save(provider);

    // From misc/test/InsulationWireAssemblyChain.txt:25
    CHEMICAL_RECIPES.recipeBuilder("hexanediol").duration(180).EUt(VA[MV])
    .notConsumableDust(PdIrReOCeOS)
    .inputFluids(Water.getFluid(1000))
    .inputDust(Fructose, 24)
    .notConsumableFluid(TetraethylammoniumBromide.getFluid(1))
    .outputFluids(Hexanediol.getFluid(1000))
    .outputFluids(Oxygen.getFluid(5000))
    .save(provider);

    // From misc/test/InsulationWireAssemblyChain.txt:35
    CHEMICAL_RECIPES.recipeBuilder("hexamethylenediamine").duration(240).EUt(VA[HV])
    .inputFluids(Hexanediol.getFluid(1000))
    .inputFluids(Ammonia.getFluid(2000))
    .outputFluids(Water.getFluid(2000))
    .outputFluids(Hexamethylenediamine.getFluid(1000))
    .notConsumableDust(Ruthenium)
    .notConsumableDust(Alumina)
    .save(provider);

    // From misc/test/InsulationWireAssemblyChain.txt:64
    CHEMICAL_RECIPES.recipeBuilder("tertbutanol").duration(125).EUt(VA[MV])
    .notConsumableDust(MagnesiumChloride)
    .inputDust(ZeoliteSievingPellets)
    .inputFluids(Acetone.getFluid(1000))
    .inputFluids(Methane.getFluid(1000))
    .outputFluids(Tertbutanol.getFluid(1000))
    .outputDust(WetZeoliteSievingPellets)
    .save(provider);

    // From misc/test/InsulationWireAssemblyChain.txt:83
    LARGE_CHEMICAL_RECIPES.recipeBuilder("tertbutanol_2").duration(370).EUt(VA[HV])
    .inputDust(DitertbutylDicarbonate, 33)
    .inputDust(Carbon, 3)
    .inputFluids(Butene.getFluid(1000))
    .inputFluids(Ammonia.getFluid(4000))
    .notConsumableFluid(Trimethylchlorosilane.getFluid(1))
    .outputFluids(Tertbutanol.getFluid(2000))
    .outputFluids(CarbonMonoxide.getFluid(3000))
    .outputFluids(Triaminoethaneamine.getFluid(1000))
    .save(provider);

    // From misc/test/InsulationWireAssemblyChain.txt:104
    LARGE_CHEMICAL_RECIPES.recipeBuilder("tert_butyl_azidoformate").duration(210).EUt(VA[HV])
    .inputDust(Potassium,2)
    .inputDust(SodiumAzide, 8)
    .inputDust(DitertbutylDicarbonate, 33)
    .outputDust(Sodium, 2)
    .outputDust(Potash, 6)
    .outputFluids(TertButylAzidoformate.getFluid(2000))
    .save(provider);

    // From misc/test/InsulationWireAssemblyChain.txt:115
    LARGE_CHEMICAL_RECIPES.recipeBuilder("tertbutanol_3").duration(VA[MV]).EUt(VA[LuV])
    .inputDust(Fullerene)
    .inputFluids(TertButylAzidoformate.getFluid(4000))
    .inputFluids(Water.getFluid(8000))
    .inputFluids(CarbonMonoxide.getFluid(4000))
    .outputFluids(AminatedFullerene.getFluid(1000))
    .outputFluids(CarbonDioxide.getFluid(8000))
    .outputFluids(Tertbutanol.getFluid(4000))
    .save(provider);

    // From misc/test/InsulationWireAssemblyChain.txt:125
    FLUID_HEATER_RECIPES.recipeBuilder("azafullerene").duration(VA[MV]).EUt(VA[HV])
    .inputFluids(AminatedFullerene.getFluid(1000))
    .outputFluids(Azafullerene.getFluid(1000))
    .notConsumable(wireFine, Rhenium)
    .save(provider);

    // From misc/test/InsulationWireAssemblyChain.txt:150
    FLUID_HEATER_RECIPES.recipeBuilder("supercritical_co2").duration(80).EUt(VA[HV])
    .inputFluids(CarbonDioxide.getFluid(1000))
    .outputFluids(SupercriticalCO2.getFluid(1000))
    .circuitMeta(0)
    .save(provider);

    // From misc/test/NanotubeChain.txt:236
    CHEMICAL_RECIPES.recipeBuilder("seaborgium_doped_nanotubes").duration(290).EUt(VA[UV])
    .inputFluids(Cycloparaphenylene.getFluid(200))
    .inputFluids(Methane.getFluid(800))
    .inputDust(Seaborgium)
    .notConsumable(plate, Rhenium)
    .outputFluids(SeaborgiumDopedNanotubes.getFluid(1000))
    .save(provider);

    // From misc/test/NanotubeChain.txt:244
    LARGE_CHEMICAL_RECIPES.recipeBuilder("fullerene_doped_nanotubes").duration(290).EUt(VA[UV])
    .inputFluids(Cycloparaphenylene.getFluid(3600))
    .inputFluids(Methane.getFluid(14400))
    .inputDust(Fullerene)
    .notConsumable(plate, Rhenium)
    .outputFluids(FullereneDopedNanotubes.getFluid(18000))
    .save(provider);

    // From misc/test/NaquadahChain.txt:17
    LARGE_CHEMICAL_RECIPES.recipeBuilder("dilute_nitric_acid_2")
    .inputDust(NaquadricCompound)
    .inputFluids(AquaRegia.getFluid(4000))
    .outputFluids(NaquadricSolution.getFluid(1000))
    .outputFluids(DiluteNitricAcid.getFluid(2000))
    .outputFluids(HydrochloricAcid.getFluid(1000))
    .outputFluids(Chlorine.getFluid(1000))
    .EUt(VA[HV])
    .duration(100)
    .save(provider);

    // From misc/test/NaquadahChain.txt:29
    LARGE_CHEMICAL_RECIPES.recipeBuilder("dilute_nitric_acid_3")
    .inputDust(EnrichedNaquadricCompound)
    .inputFluids(AquaRegia.getFluid(4000))
    .outputFluids(EnrichedNaquadricSolution.getFluid(1000))
    .outputFluids(DiluteNitricAcid.getFluid(2000))
    .outputFluids(HydrochloricAcid.getFluid(1000))
    .outputFluids(Chlorine.getFluid(1000))
    .EUt(VA[HV])
    .duration(100)
    .save(provider);

    // From misc/test/NaquadahChain.txt:41
    LARGE_CHEMICAL_RECIPES.recipeBuilder("dilute_nitric_acid_4")
    .inputDust(NaquadriaticCompound)
    .inputFluids(AquaRegia.getFluid(4000))
    .outputFluids(NaquadriaticSolution.getFluid(1000))
    .outputFluids(DiluteNitricAcid.getFluid(2000))
    .outputFluids(HydrochloricAcid.getFluid(1000))
    .outputFluids(Chlorine.getFluid(1000))
    .EUt(VA[HV])
    .duration(100)
    .save(provider);

    // From misc/test/NiobiumTantalumChain.txt:76
    LARGE_CHEMICAL_RECIPES.recipeBuilder("nb_ta_fluoride_mix").duration(280).EUt(VA[EV])
    .inputFluids(HydrofluoricAcid.getFluid(19000))
    .inputDust(NiobiumTantalumOxide, 14)
    .outputDust(AluminiumTrifluoride, 4)
    .outputFluids(SiliconFluoride.getFluid(1000))
    .outputFluids(NbTaFluorideMix.getFluid(1000))
    .outputFluids(Water.getFluid(7500))
    .save(provider);

    // From misc/test/NiobiumTantalumChain.txt:125
    CHEMICAL_RECIPES.recipeBuilder("fluoroniobic_acid").duration(180).EUt(VA[HV])
    .inputDust(LeachedColumbite, 17)
    .inputFluids(HydrofluoricAcid.getFluid(10400))
    .outputFluids(FluoroniobicAcid.getFluid(2000))
    .outputFluids(Water.getFluid(3200))
    .save(provider);

    // From misc/test/NiobiumTantalumChain.txt:158
    CHEMICAL_RECIPES.recipeBuilder("fluorotantalic_acid").duration(180).EUt(VA[MV])
    .inputDust(LeachedTantalite, 17)
    .inputFluids(HydrofluoricAcid.getFluid(13600))
    .outputFluids(FluorotantalicAcid.getFluid(2000))
    .outputFluids(Water.getFluid(480))
    .save(provider);

    // From misc/test/NiobiumTantalumChain.txt:166
    MIXER_RECIPES.recipeBuilder("nb_ta_separation_mixture").duration(220).EUt(VA[LV])
    .inputFluids(TributylPhosphate.getFluid(1000))
    .inputFluids(MethylIsobutylKetone.getFluid(1000))
    .outputFluids(NbTaSeparationMixture.getFluid(2000))
    .save(provider);

    // From misc/test/NiobiumTantalumChain.txt:172
    BLAST_RECIPES.recipeBuilder("reeth_usulfate_solution").duration(350).EUt(VA[HV]).blastFurnaceTemp(2700)
    .inputDust(Pyrochlore, 6)
    .inputFluids(SulfuricAcid.getFluid(2000))
    .outputDust(AcidicLeachedPyrochlore, 6)
    .outputFluids(REEThUSulfateSolution.getFluid(1000))
    .save(provider);

    // From misc/test/NiobiumTantalumChain.txt:179
    LARGE_CHEMICAL_RECIPES.recipeBuilder("alkaline_earth_sulfate_solution").duration(240).EUt(VA[HV])
    .inputDust(AcidicLeachedPyrochlore, 3)
    .inputFluids(HydrogenPeroxide.getFluid(3000))
    .inputFluids(SulfuricAcid.getFluid(12000))
    .outputFluids(HydrofluoricAcid.getFluid(13000))
    .outputFluids(AlkalineEarthSulfateSolution.getFluid(8000))
    .outputFluids(Oxygen.getFluid(3000))
    .outputDust(LeachedPyrochlore, 3)
    .save(provider);

    // From misc/test/NiobiumTantalumChain.txt:189
    CHEMICAL_RECIPES.recipeBuilder("fluoroniobic_acid_2").duration(180).EUt(VA[MV])
    .inputDust(LeachedPyrochlore)
    .inputFluids(HydrofluoricAcid.getFluid(10400))
    .outputFluids(FluoroniobicAcid.getFluid(2000))
    .outputFluids(Water.getFluid(3200))
    .save(provider);

    // From misc/test/NiobiumTantalumChain.txt:196
    CHEMICAL_RECIPES.recipeBuilder("rare_earth_nitrate_solution").duration(160).EUt(VA[HV])
    .inputFluids(REEThUSulfateSolution.getFluid(2000))
    .inputFluids(NitricAcid.getFluid(7000))
    .outputDust(UranylThoriumNitrate, 26)
    .outputFluids(RareEarthNitrateSolution.getFluid(1000))
    .outputFluids(SulfuricAcid.getFluid(4000))
    .save(provider);

    // From misc/test/NiobiumTantalumChain.txt:220
    LARGE_CHEMICAL_RECIPES.recipeBuilder("oxypentafluoro_niobate").duration(125).EUt(VA[IV])
    .inputFluids(FluoroniobicAcid.getFluid(10000))
    .inputFluids(NbTaSeparationMixture.getFluid(1000))
    .outputFluids(OxypentafluoroNiobate.getFluid(9000))
    .outputFluids(HeptafluoroTantalate.getFluid(1000))
    .save(provider);

    // From misc/test/NiobiumTantalumChain.txt:228
    LARGE_CHEMICAL_RECIPES.recipeBuilder("oxypentafluoro_niobate_2").duration(125).EUt(VA[IV])
    .inputFluids(NbTaFluorideMix.getFluid(2000))
    .inputFluids(NbTaSeparationMixture.getFluid(200))
    .outputFluids(OxypentafluoroNiobate.getFluid(1000))
    .outputFluids(HeptafluoroTantalate.getFluid(1000))
    .save(provider);

    // From misc/test/NiobiumTantalumChain.txt:236
    LARGE_CHEMICAL_RECIPES.recipeBuilder("oxypentafluoro_niobate_3").duration(125).EUt(VA[IV])
    .inputFluids(FluorotantalicAcid.getFluid(10000))
    .inputFluids(NbTaSeparationMixture.getFluid(1000))
    .outputFluids(OxypentafluoroNiobate.getFluid(1000))
    .outputFluids(HeptafluoroTantalate.getFluid(9000))
    .save(provider);

    // From misc/test/OpticalChain.txt:71
    CHEMICAL_RECIPES.recipeBuilder("fluorosilicic_acid_2").duration(210).EUt(VA[HV])
    .inputFluids(SiliconFluoride.getFluid(1000))
    .inputFluids(HydrofluoricAcid.getFluid(2000))
    .outputFluids(FluorosilicicAcid.getFluid(1000))
    .save(provider);

    // From misc/test/OpticalChain.txt:78
    CHEMICAL_RECIPES.recipeBuilder("ammonium_fluoride").duration(320).EUt(VA[HV])
    .inputFluids(FluorosilicicAcid.getFluid(1000))
    .inputFluids(Ammonia.getFluid(6000))
    .inputFluids(Water.getFluid(2000))
    .outputDust(SiliconDioxide, 3)
    .outputFluids(AmmoniumFluoride.getFluid(6000))
    .save(provider);

    // From misc/test/OpticalChain.txt:94
    MIXER_RECIPES.recipeBuilder("ammonium_bifluoride_solution").duration(140).EUt(VA[LV])
    .inputFluids(DistilledWater.getFluid(1000))
    .inputDust(AmmoniumBifluoride, 8)
    .outputFluids(AmmoniumBifluorideSolution.getFluid(2000))
    .save(provider);

    // From misc/test/OpticalChain.txt:126
    LARGE_CHEMICAL_RECIPES.recipeBuilder("lu_tm_ychloride_solution").duration(280).EUt(VHA[LuV])
    .inputDust(YttriumOxide,15)
    .inputDust(LutetiumOxide, 5)
    .inputDust(ThuliumOxide, 5)
    .inputFluids(HydrochloricAcid.getFluid(30000))
    .outputFluids(LuTmYChlorideSolution.getFluid(30000))
    .save(provider);

    // From misc/test/OpticalChain.txt:181
    MIXER_RECIPES.recipeBuilder("dielectric_mirror_formation_mix").duration(270).EUt(VHA[UHV])
    .inputDust(MagnesiumFluoride, 3)
    .inputDust(ZincSulfide, 2)
    .inputDust(TantalumOxide, 7)
    .inputDust(Rutile, 3)
    .inputFluids(Ethanol.getFluid(1000))
    .outputFluids(DielectricMirrorFormationMix.getFluid(1000))
    .save(provider);

    // From misc/test/OpticalChain.txt:225
    CHEMICAL_RECIPES.recipeBuilder("ammonium_niobium_oxalate_solution").duration(140).EUt(VA[HV])
    .inputDust(NiobiumHydroxide, 22)
    .inputDust(Sodium)
    .inputFluids(Ammonia.getFluid(1000))
    .inputFluids(OxalicAcid.getFluid(5000))
    .outputItems(dust ,SodiumHydroxide, 3)
    .outputFluids(Water.getFluid(9000))
    .outputFluids(AmmoniumNiobiumOxalateSolution.getFluid(1000))
    .save(provider);

    // From misc/test/OpticalChain.txt:273
    CHEMICAL_RECIPES.recipeBuilder("ethylenediamine").duration(180).EUt(VA[MV])
    .inputFluids(Ethanolamine.getFluid(1000))
    .inputFluids(Ammonia.getFluid(1000))
    .outputFluids(Ethylenediamine.getFluid(1000))
    .outputFluids(Water.getFluid(1000))
    .notConsumableDust(Palladium)
    .save(provider);

    // From misc/test/OpticalChain.txt:282
    LARGE_CHEMICAL_RECIPES.recipeBuilder("edtasolution").duration(250).EUt(VA[IV])
    .inputFluids(Ethylenediamine.getFluid(2000))
    .inputFluids(com.gregtechceu.gtceu.common.data.GTMaterials.Formaldehyde.getFluid(24000))
    .inputFluids(HydrochloricAcid.getFluid(8000))
    .inputFluids(SodiumCyanide.getFluid(8000))
    .inputFluids(Oxygen.getFluid(6000))
    .outputFluids(EDTASolution.getFluid(15000))
    .save(provider);

    // From misc/test/OpticalChain.txt:293
    DISTILLATION_RECIPES.recipeBuilder("edta").duration(240).EUt(VA[EV])
    .inputFluids(EDTASolution.getFluid(15000))
    .outputDust(Salt, 16)
    .outputFluids(Ammonia.getFluid(3000))
    .outputFluids(EDTA.getFluid(3000))
    .outputFluids(Glycine.getFluid(3000))
    .save(provider);

    // From misc/test/OpticalChain.txt:364
    LARGE_CHEMICAL_RECIPES.recipeBuilder("pr_yho_nitrate_solution").duration(280).EUt(VHA[LuV])
    .inputDust(YttriumOxide,15)
    .inputDust(PraseodymiumOxide, 5)
    .inputDust(HolmiumOxide, 5)
    .inputFluids(NitricAcid.getFluid(30000))
    .outputFluids(PrYHoNitrateSolution.getFluid(30000))
    .save(provider);

    // From misc/test/OpticalChain.txt:405
    FLUID_HEATER_RECIPES.recipeBuilder("butanol_gas").duration(130).EUt(VA[HV])
    .inputFluids(Butanol.getFluid(1000))
    .circuitMeta(0)
    .outputFluids(ButanolGas.getFluid(1000))
    .save(provider);

    // From misc/test/OpticalChain.txt:412
    CHEMICAL_RECIPES.recipeBuilder("tributylamine").duration(140).EUt(VA[HV])
    .inputFluids(ButanolGas.getFluid(3000))
    .inputFluids(Ammonia.getFluid(1000))
    .notConsumableDust(Zeolite)
    .outputFluids(Tributylamine.getFluid(1000))
    .outputFluids(Water.getFluid(3000))
    .save(provider);

    // From misc/test/OpticalChain.txt:429
    CHEMICAL_RECIPES.recipeBuilder("crude_alumina_solution").duration(290).EUt(VA[MV])
    .inputDust(AluminiumNitrate, 26)
    .inputFluids(Dichloromethane.getFluid(1000))
    .inputFluids(Tributylamine.getFluid(1000))
    .outputFluids(CrudeAluminaSolution.getFluid(1000))
    .save(provider);

    // From misc/test/OpticalChain.txt:437
    LARGE_CHEMICAL_RECIPES.recipeBuilder("alumina_solution").duration(210).EUt(VA[HV])
    .inputFluids(CrudeAluminaSolution.getFluid(1000))
    .inputFluids(Tributylamine.getFluid(1000))
    .inputFluids(HydrogenPeroxide.getFluid(1000))
    .outputFluids(AluminaSolution.getFluid(1000))
    .outputFluids(NitricAcid.getFluid(2000))
    .outputFluids(NitrogenDioxide.getFluid(1000))
    .save(provider);

    // From misc/test/OpticalChain.txt:447
    LARGE_CHEMICAL_RECIPES.recipeBuilder("ammonium_cyanate").duration(220).EUt(VA[HV])
    .inputFluids(Ammonia.getFluid(5000))
    .inputFluids(HydrogenCyanide.getFluid(5000))
    .inputFluids(SulfuricAcid.getFluid(3000))
    .inputDust(PotassiumPermanganate, 12)
    .outputFluids(Water.getFluid(3000))
    .outputDust(ManganeseSulfate, 12)
    .outputDust(PotassiumSulfate, 7)
    .outputFluids(AmmoniumCyanate.getFluid(5000))
    .save(provider);

    // From misc/test/OrganometallicChains.txt:14
    CHEMICAL_RECIPES.recipeBuilder("dimethylether").duration(160).EUt(8000) //2CH4O -> CH3OCH3 + H2O
    .inputFluids(Methanol.getFluid(2000))
    .notConsumableDust(Alumina, 1)
    .notConsumableDust(SiliconDioxide)
    .outputFluids(Dimethylether.getFluid(1000))
    .outputFluids(Water.getFluid(1000))
    .save(provider);

    // From misc/test/OrganometallicChains.txt:22
    CHEMICAL_RECIPES.recipeBuilder("dimethoxyethane").duration(160).EUt(2000) //CH3OCH3 + C2H4O -> C4H10O2
    .inputFluids(Dimethylether.getFluid(1000))
    .inputFluids(EthyleneOxide.getFluid(1000))
    .outputFluids(Dimethoxyethane.getFluid(1000))
    .save(provider);

    // From misc/test/OrganometallicChains.txt:28
    CHEMICAL_RECIPES.recipeBuilder("lithium_cyclopentadienide").duration(160).EUt(2000) //C5H6 + LiC4H9 -> LiC5H5 + C4H10
    .inputFluids(Cyclopentadiene.getFluid(1000))
    .inputFluids(Dimethoxyethane.getFluid(500))
    .inputFluids(ButylLithium.getFluid(1000))
    .outputFluids(Butane.getFluid(1000))
    .outputFluids(LithiumCyclopentadienide.getFluid(1000))
    .save(provider);

    // From misc/test/OrganometallicChains.txt:51
    CHEMICAL_RECIPES.recipeBuilder("californium_cyclopentadienide").duration(160).EUt(200000) //3LiC5H5 + CfCl3 -> CfC15H15 + 3LiCf
    .inputFluids(LithiumCyclopentadienide.getFluid(3000))
    .inputDust(CaliforniumTrichloride, 4)
    .outputDust(LithiumChloride, 6)
    .outputFluids(CaliforniumCyclopentadienide.getFluid(1000))
    .save(provider);

    // From misc/test/PolymerChain.txt:150
    CHEMICAL_RECIPES.recipeBuilder("oxydianiline")
    .notConsumableDust(Tin)
    .notConsumableFluid(HydrochloricAcid.getFluid(1))
    .inputFluids(Aniline.getFluid(2000))
    .inputFluids(Phenol.getFluid(1000))
    .outputFluids(Oxydianiline.getFluid(1000))
    .outputFluids(Methane.getFluid(2000))
    .EUt(VA[MV])
    .duration(150)
    .save(provider);

    // From misc/test/PolymerChain.txt:162
    CHEMICAL_RECIPES.recipeBuilder("polyamic_acid")
    .inputDust(PyromelliticDianhydride, 18)
    .inputFluids(Oxydianiline.getFluid(1000))
    .outputFluids(PolyamicAcid.getFluid(1000))
    .EUt(VA[IV])
    .duration(400)
    .save(provider);

    // From misc/test/PolymerChain.txt:184
    PYROLYSE_RECIPES.recipeBuilder("hexafluoropropylene")
    .circuitMeta(1)
    .notConsumable(rod, Steel)
    .inputFluids(Tetrafluoroethylene.getFluid(3000))
    .outputFluids(Hexafluoropropylene.getFluid(2000))
    .EUt(96)
    .duration(460)
    .save(provider);

    // From misc/test/QuantumDotsChain.txt:16
    CHEMICAL_RECIPES.recipeBuilder("soap").duration(160).EUt(2000)
    .inputFluids(Oil.getFluid(1000))
    .inputFluids(Steam.getFluid(200))
    .inputFluids(PotassiumHydroxide.getFluid(1000))
    .outputFluids(Soap.getFluid(1000))
    .save(provider);

    // From misc/test/QuantumDotsChain.txt:24
    CHEMICAL_RECIPES.recipeBuilder("deglycerated_soap").duration(160).EUt(2000)
    .inputFluids(Soap.getFluid(1000))
    .inputDust(Salt, 1)
    .outputFluids(Glycerol.getFluid(200))
    .outputFluids(DeglyceratedSoap.getFluid(800))
    .save(provider);

    // From misc/test/QuantumDotsChain.txt:31
    DEHYDRATOR_RECIPES.recipeBuilder("stearic_acid").duration(160).EUt(2000)
    .inputFluids(DeglyceratedSoap.getFluid(1000))
    .outputDust(Salt, 1)
    .outputFluids(StearicAcid.getFluid(800))
    .save(provider);

    // From misc/test/QuantumDotsChain.txt:37
    CHEMICAL_RECIPES.recipeBuilder("trioctylphosphine").duration(160).EUt(2000) //3C8H18 + P -> 3H + C24H51P
    .inputFluids(Octane.getFluid(3000))
    .inputDust(Phosphorus, 1)
    .outputFluids(Hydrogen.getFluid(3000))
    .outputFluids(Trioctylphosphine.getFluid(1000))
    .save(provider);

    // From misc/test/QuantumDotsChain.txt:44
    CHEMICAL_RECIPES.recipeBuilder("quantum_dots").duration(160).EUt(500000)
    .inputFluids(Trioctylphosphine.getFluid(1000))
    .inputFluids(StearicAcid.getFluid(1000))
    .inputDust(Selenium, 1)
    .inputDust(Cadmium, 1)
    .outputFluids(QuantumDots.getFluid(1000))
    .save(provider);

    // From misc/test/RheniumChain.txt:197
    CHEMICAL_RECIPES.recipeBuilder("methylethanolamine")
    .inputFluids(EthyleneOxide.getFluid(1000))
    .inputFluids(Methylamine.getFluid(1000))
    .outputFluids(Methylethanolamine.getFluid(1000))
    .EUt(VA[HV])
    .duration(90)
    .save(provider);

    // From misc/test/RheniumChain.txt:217
    LARGE_CHEMICAL_RECIPES.recipeBuilder("methylguanidine")
    .inputFluids(HydrochloricAcid.getFluid(2000))
    .inputFluids(Methylethanolamine.getFluid(1000))
    .inputFluids(Oxygen.getFluid(1000))
    .inputDust(CalciumCyanamide, 4)
    .outputFluids(Methylguanidine.getFluid(1000))
    .outputFluids(AceticAcid.getFluid(1000))
    .outputDust(CalciumChloride, 3)
    .notConsumable(dust,Palladium)
    .notConsumableDust(MercuryAcetate)
    .EUt(VA[HV])
    .duration(240)
    .save(provider);

    // From misc/test/RheniumChain.txt:233
    CHEMICAL_RECIPES.recipeBuilder("methylnitronitrosoguanidine")
    .inputFluids(Methylguanidine.getFluid(1000))
    .inputFluids(NitrationMixture.getFluid(2000))
    .inputFluids(HydrochloricAcid.getFluid(1000))
    .inputDust(SodiumNitrite, 4)
    .outputFluids(DilutedSulfuricAcid.getFluid(2000))
    .outputFluids(Methylnitronitrosoguanidine.getFluid(1000))
    .outputDust(Salt, 2)
    .EUt(VA[HV])
    .duration(220)
    .save(provider);

    // From misc/test/RheniumChain.txt:246
    FERMENTING_RECIPES.recipeBuilder("isoamyl_alcohol")
    .inputDust(Glucose, 24)
    .notConsumableDust(SelectivelyMutatedCupriavidiusNecator)
    .inputFluids(Ammonia.getFluid(10))
    .outputFluids(IsoamylAlcohol.getFluid(1000))
    .EUt(VA[UV])
    .duration(20)
    .save(provider);

    // From misc/test/RheniumChain.txt:256
    CHEMICAL_RECIPES.recipeBuilder("octanol")
    .inputFluids(Oct1ene.getFluid(1000))
    .inputFluids(Water.getFluid(1000))
    .outputFluids(Octanol.getFluid(1000))
    .notConsumableFluid(PhosphoricAcid.getFluid(1))
    .notConsumableDust(PalladiumLoadedRutileNanoparticles)
    .notConsumable(LOW_FREQUENCY_LASER.asItem())
    .EUt(VA[LuV])
    .duration(110)
    .save(provider);

    // From misc/test/RheniumChain.txt:277
    CHEMICAL_RECIPES.recipeBuilder("trioctylamine")
    .inputFluids(Octanol.getFluid(3000))
    .inputFluids(Ammonia.getFluid(1000))
    .outputFluids(Water.getFluid(3000))
    .outputFluids(Trioctylamine.getFluid(1000))
    .EUt(VA[HV])
    .duration(90)
    .save(provider);

    // From misc/test/RheniumChain.txt:287
    LARGE_MIXER_RECIPES.recipeBuilder("rhenium_separation_mixture")
    .inputFluids(Kerosene.getFluid(8000))
    .inputFluids(Trioctylamine.getFluid(500))
    .inputFluids(Octanol.getFluid(500))
    .inputFluids(MethylIsobutylKetone.getFluid(250))
    .inputFluids(AceticAcid.getFluid(250))
    .inputFluids(IsoamylAlcohol.getFluid(250))
    .outputFluids(RheniumSeparationMixture.getFluid(10000))
    .EUt(VA[IV])
    .duration(90)
    .save(provider);

    // From misc/test/RheniumChain.txt:300
    CENTRIFUGE_RECIPES.recipeBuilder("rhenium_separation_mixture_2")
    .inputDust(PlatinumSalt, 2)
    .inputFluids(RheniumSeparationMixture.getFluid(250))
    .chancedOutput(dust, PlatinumSalt, 2, 9500)
    .outputFluids(RheniumScrubbedSolution.getFluid(250))
    .outputFluids(RheniumSeparationMixture.getFluid(200))
    .EUt(VA[IV])
    .duration(50)
    .save(provider);

    // From misc/test/RheniumChain.txt:311
    CENTRIFUGE_RECIPES.recipeBuilder("rhenium_separation_mixture_3")
    .inputDust(LeachedColumbite, 17)
    .inputFluids(RheniumSeparationMixture.getFluid(250))
    .outputDust(PurifiedColumbite)
    .outputFluids(RheniumScrubbedSolution.getFluid(250))
    .outputFluids(RheniumSeparationMixture.getFluid(200))
    .EUt(VA[IV])
    .duration(50)
    .save(provider);

    // From misc/test/RheniumChain.txt:322
    CENTRIFUGE_RECIPES.recipeBuilder("rhenium_separation_mixture_4")
    .inputDust(LeachedPyrochlore)
    .inputFluids(RheniumSeparationMixture.getFluid(250))
    .outputDust(PurifiedPyrochlore)
    .outputFluids(RheniumScrubbedSolution.getFluid(250))
    .outputFluids(RheniumSeparationMixture.getFluid(200))
    .EUt(VA[IV])
    .duration(50)
    .save(provider);

    // From misc/test/RheniumChain.txt:333
    CHEMICAL_RECIPES.recipeBuilder("fluoroniobic_acid_3")
    .inputDust(PurifiedColumbite)
    .inputFluids(HydrofluoricAcid.getFluid(5000))
    .outputFluids(FluoroniobicAcid.getFluid(1000))
    .EUt(VA[HV])
    .duration(180)
    .save(provider);

    // From misc/test/RheniumChain.txt:342
    CHEMICAL_RECIPES.recipeBuilder("fluoroniobic_acid_4")
    .inputDust(PurifiedPyrochlore)
    .inputFluids(HydrofluoricAcid.getFluid(5000))
    .outputFluids(FluoroniobicAcid.getFluid(1000))
    .EUt(VA[HV])
    .duration(180)
    .save(provider);

    // From misc/test/SeleniumChain.txt:35
    CHEMICAL_RECIPES.recipeBuilder("copper_refining_solution").duration(200).EUt(VA[MV])
    .inputDust(ElectricallyImpureCopper)
    .inputFluids(SulfuricAcid.getFluid(1000))
    .outputFluids(CopperRefiningSolution.getFluid(1000))
    .save(provider);

    // From misc/test/SeleniumChain.txt:51
    BLAST_RECIPES.recipeBuilder("selenite_tellurite_mix").duration(320).EUt(VA[MV]).blastFurnaceTemp(2100)
    .inputDust(AnodicSlime)
    .inputDust(SodaAsh, 12)
    .inputFluids(Oxygen.getFluid(4000))
    .chancedOutput(dust, PreciousMetal, 1, 5555)
    .outputFluids(SeleniteTelluriteMix.getFluid(1000))
    .save(provider);

    // From misc/test/SeleniumChain.txt:60
    LARGE_CHEMICAL_RECIPES.recipeBuilder("selenite_solution").duration(270).EUt(VA[EV])
    .inputFluids(SeleniteTelluriteMix.getFluid(1000))
    .inputFluids(SulfuricAcid.getFluid(1000))
    .outputDust(TelluriumOxide, 3)
    .outputFluids(Water.getFluid(1000))
    .outputFluids(SulfurTrioxide.getFluid(1000))
    .outputFluids(CarbonDioxide.getFluid(1000))
    .outputFluids(SeleniteSolution.getFluid(1000))
    .save(provider);

    // From misc/test/SensorEmitter.txt:14
    MIXER_RECIPES.recipeBuilder("barium_strontium_acetate_solution").duration(420).EUt(VA[MV])
    .inputDust(Strontium)
    .inputDust(BariumOxide, 2)
    .inputFluids(AceticAcid.getFluid(2000))
    .outputFluids(BariumStrontiumAcetateSolution.getFluid(1000))
    .save(provider);

    // From misc/test/SensorEmitter.txt:29
    CHEMICAL_RECIPES.recipeBuilder("titanium_isopropoxide").duration(240).EUt(VA[HV])
    .inputDust(Rutile, 3)
    .inputFluids(IsopropylAlcohol.getFluid(4000))
    .outputFluids(TitaniumIsopropoxide.getFluid(1000))
    .outputFluids(Water.getFluid(2000))
    .save(provider);

    // From misc/test/SensorEmitter.txt:37
    MIXER_RECIPES.recipeBuilder("barium_strontium_titanate_preparation").duration(280).EUt(VA[MV])
    .inputFluids(BariumStrontiumAcetateSolution.getFluid(1000))
    .inputFluids(TitaniumIsopropoxide.getFluid(1000))
    .inputDust(Carbon, 2)
    .outputFluids(BariumStrontiumTitanatePreparation.getFluid(2000))
    .save(provider);

    // From misc/test/SensorEmitter.txt:45
    LARGE_CHEMICAL_RECIPES.recipeBuilder("isopropyl_acetate").duration(250).EUt(VA[HV])
    .inputFluids(BariumStrontiumTitanatePreparation.getFluid(2000))
    .outputDust(BariumStrontiumTitanate, 7)
    .outputFluids(IsopropylAcetate.getFluid(1000))
    .outputFluids(Propene.getFluid(4000))
    .outputFluids(Water.getFluid(1000))
    .outputFluids(CarbonDioxide.getFluid(1000))
    .save(provider);

    // From misc/test/SensorEmitter.txt:195
    CHEMICAL_RECIPES.recipeBuilder("amino3phenol").duration(220).EUt(VA[HV])
    .inputFluids(Resorcinol.getFluid(1000))
    .inputFluids(Ammonia.getFluid(1000))
    .outputFluids(Amino3phenol.getFluid(1000))
    .outputFluids(Water.getFluid(1000))
    .save(provider);

    // From misc/test/SensorEmitter.txt:203
    CHEMICAL_RECIPES.recipeBuilder("ethylamine").duration(130).EUt(VA[HV])
    .inputFluids(Ethylene.getFluid(1000))
    .inputFluids(Ammonia.getFluid(1000))
    .outputFluids(Ethylamine.getFluid(2000))
    .notConsumableDust(SodiumAzanide)
    .save(provider);

    // From misc/test/SensorEmitter.txt:260
    CHEMICAL_RECIPES.recipeBuilder("potassium_ethoxide").duration(240).EUt(VA[EV])
    .inputDust(PotassiumPerrhenate, 6)
    .inputDust(Potassium, 18)
    .inputFluids(Ethanol.getFluid(13000))
    .inputFluids(Oxygen.getFluid(4000))
    .outputFluids(PotassiumHydroxide.getFluid(4000))
    .outputDust(PotassiumNonahydridorhenate, 16)
    .outputFluids(PotassiumEthoxide.getFluid(13000))
    .save(provider);

    // From misc/test/SensorEmitter.txt:271
    CHEMICAL_RECIPES.recipeBuilder("potassium_ethoxide_2").duration(240).EUt(VA[EV])
    .inputDust(PotassiumPertechnate, 6)
    .inputDust(Potassium, 18)
    .inputFluids(Ethanol.getFluid(13000))
    .inputFluids(Oxygen.getFluid(4000))
    .outputFluids(PotassiumHydroxide.getFluid(4000))
    .outputDust(PotassiumNonahydridotechnetate, 16)
    .outputFluids(PotassiumEthoxide.getFluid(13000))
    .save(provider);

    // From misc/test/SensorEmitter.txt:300
    CHEMICAL_RECIPES.recipeBuilder("butylaniline").duration(200).EUt(VA[HV])
    .inputDust(PotassiumIodide, 2)
    .inputFluids(Aminophenol.getFluid(1000))
    .inputFluids(ButylLithium.getFluid(1000))
    .outputFluids(Butylaniline.getFluid(1000))
    .outputFluids(PotassiumHydroxide.getFluid(1000))
    .outputDust(LithiumIodide, 2)
    .save(provider);

    // From misc/test/SensorEmitter.txt:310
    CHEMICAL_RECIPES.recipeBuilder("trimethylsilane").duration(170).EUt(VA[EV])
    .inputDust(SodiumHydride, 2)
    .inputFluids(Trimethylchlorosilane.getFluid(1000))
    .outputFluids(Trimethylsilane.getFluid(1000))
    .outputDust(Salt, 2)
    .save(provider);

    // From misc/test/SensorEmitter.txt:332
    LARGE_CHEMICAL_RECIPES.recipeBuilder("iodobenzoic_acid").duration(350).EUt(VA[ZPM])
    .inputDust(PhthalicAnhydride, 15)
    .inputDust(SodiumIodide, 2)
    .inputDust(SodiumNitrite, 4)
    .inputFluids(SodiumHydroxideSolution.getFluid(1000))
    .inputFluids(Ammonia.getFluid(1000))
    .inputFluids(HydrochloricAcid.getFluid(1000))
    .inputFluids(Chlorine.getFluid(2000))
    .outputFluids(IodobenzoicAcid.getFluid(1000))
    .outputFluids(Nitrogen.getFluid(1000))
    .outputFluids(CarbonDioxide.getFluid(1000))
    .outputFluids(SaltWater.getFluid(3000))
    .save(provider);

    // From misc/test/SensorEmitter.txt:371
    LARGE_CHEMICAL_RECIPES.recipeBuilder("trimethylchlorosilane").duration(250).EUt(VA[IV])
    .inputFluids(Trimethylsilane.getFluid(1000))
    .inputFluids(Chlorobenzene.getFluid(1000))
    .inputFluids(com.gregtechceu.gtceu.common.data.GTMaterials.Formaldehyde.getFluid(2000))
    .inputDust(IBX, 17)
    .notConsumableDust(CobaltOxide)
    .outputFluids(Trimethylchlorosilane.getFluid(1000))
    .outputFluids(Methoxybenzaldehyde.getFluid(1000))
    .outputFluids(IodobenzoicAcid.getFluid(1000))
    .outputFluids(Hydrogen.getFluid(2000))
    .save(provider);

    // From misc/test/SensorEmitter.txt:384
    CHEMICAL_RECIPES.recipeBuilder("mbba").duration(190).EUt(VA[ZPM])
    .inputFluids(Methoxybenzaldehyde.getFluid(1000))
    .inputFluids(Butylaniline.getFluid(1000))
    .notConsumableDust(TetraethylammoniumNonahydridides)
    .outputFluids(MBBA.getFluid(1000))
    .outputFluids(Water.getFluid(1000))
    .save(provider);

    // From misc/test/SensorEmitter.txt:392
    MIXER_RECIPES.recipeBuilder("liquid_crystal_detector").duration(320).EUt(VA[HV])
    .inputDust(CarbonNanotubes)
    .inputFluids(MBBA.getFluid(1000))
    .outputFluids(LiquidCrystalDetector.getFluid(1000))
    .save(provider);

    // From misc/test/SensorEmitter.txt:407
    CHEMICAL_RECIPES.recipeBuilder("iodine_monochloride").duration(240).EUt(VA[MV])
    .inputDust(Iodine)
    .inputFluids(Chlorine.getFluid(1000))
    .outputFluids(IodineMonochloride.getFluid(1000))
    .save(provider);

    // From misc/test/SensorEmitter.txt:429
    LARGE_CHEMICAL_RECIPES.recipeBuilder("acetylating_reagent").duration(350).EUt(VA[HV])
    .inputDust(MagnesiumChloride, 6)
    .inputFluids(Acetylene.getFluid(3000))
    .inputFluids(Trimethylchlorosilane.getFluid(1000))
    .inputFluids(Bromine.getFluid(2000))
    .outputFluids(HydrochloricAcid.getFluid(3000))
    .outputFluids(AcetylatingReagent.getFluid(1000))
    .outputFluids(Chlorine.getFluid(2000))
    .save(provider);

    // From misc/test/SensorEmitter.txt:440
    CHEMICAL_RECIPES.recipeBuilder("dimethylnaphthalene").duration(260).EUt(VA[MV])
    .inputFluids(Naphthalene.getFluid(1000))
    .inputFluids(Methanol.getFluid(2000))
    .outputFluids(Water.getFluid(2000))
    .outputFluids(Dimethylnaphthalene.getFluid(1000))
    .save(provider);

    // From misc/test/SensorEmitter.txt:448
    LARGE_CHEMICAL_RECIPES.recipeBuilder("trimethylchlorosilane_2").duration(290).EUt(VA[ZPM])
    .inputFluids(Dimethylnaphthalene.getFluid(1000))
    .inputFluids(AcetylatingReagent.getFluid(1000))
    .inputFluids(IodineMonochloride.getFluid(1000))
    .inputFluids(Chlorine.getFluid(2000))
    .inputDust(Bromosuccinimide, 12)
    .notConsumableDust(RhReNqCatalyst)
    .outputDust(MgClBromide, 6)
    .outputDust(Succinimide, 12)
    .outputFluids(Dihydroiodotetracene.getFluid(1000))
    .outputFluids(Trimethylchlorosilane.getFluid(1000))
    .outputFluids(HydrobromicAcid.getFluid(1000))
    .save(provider);

    // From misc/test/SensorEmitter.txt:463
    LARGE_CHEMICAL_RECIPES.recipeBuilder("dichlorodicyanobenzoquinone").duration(250).EUt(VA[LuV])
    .inputFluids(Phenol.getFluid(1000))
    .inputFluids(Chlorine.getFluid(10000))
    .inputFluids(HydrogenCyanide.getFluid(2000))
    .inputFluids(Oxygen.getFluid(1000))
    .outputFluids(HydrochloricAcid.getFluid(8000))
    .outputFluids(Dichlorodicyanobenzoquinone.getFluid(1000))
    .save(provider);

    // From misc/test/SensorEmitter.txt:473
    CHEMICAL_RECIPES.recipeBuilder("dichlorodicyanobenzoquinone_2").duration(250).EUt(VA[HV])
    .inputFluids(Dichlorodicyanohydroquinone.getFluid(1000))
    .inputFluids(HydrogenPeroxide.getFluid(1000))
    .outputFluids(Dichlorodicyanobenzoquinone.getFluid(1000))
    .outputFluids(Water.getFluid(2000))
    .notConsumableDust(VanadiumOxide)
    .save(provider);

    // From misc/test/SensorEmitter.txt:494
    LARGE_CHEMICAL_RECIPES.recipeBuilder("dichlorodicyanohydroquinone").duration(260).EUt(VA[UV])
    .inputFluids(Dihydroiodotetracene.getFluid(2000))
    .inputFluids(Dichlorodicyanobenzoquinone.getFluid(2000))
    .inputFluids(IsopropylAlcohol.getFluid(1000))
    .outputFluids(Acetone.getFluid(1000))
    .outputFluids(Dichlorodicyanohydroquinone.getFluid(2000))
    .outputDust(Iodine, 2)
    .outputDust(Tetracene, 60)
    .notConsumable(LOW_FREQUENCY_LASER.asItem())
    .notConsumableDust(PalladiumLoadedRutileNanoparticles)
    .save(provider);

    // From misc/test/SuperconductorsSMDChain.txt:34
    CHEMICAL_RECIPES.recipeBuilder("hydroselenic_acid").duration(180).EUt(VA[MV])
    .inputFluids(Hydrogen.getFluid(2000))
    .inputDust(Selenium)
    .outputFluids(HydroselenicAcid.getFluid(1000))
    .save(provider);

    // From misc/test/SuperconductorsSMDChain.txt:75
    CHEMICAL_RECIPES.recipeBuilder("aminophenol").duration(240).EUt(VA[MV])
    .inputFluids(Phenol.getFluid(1000))
    .inputFluids(NitricAcid.getFluid(1000))
    .inputFluids(Hydrogen.getFluid(6000))
    .notConsumableDust(IronPlatinumCatalyst)
    .outputFluids(Water.getFluid(3000))
    .outputFluids(Aminophenol.getFluid(1000))
    .save(provider);

    // From misc/test/SuperconductorsSMDChain.txt:85
    LARGE_CHEMICAL_RECIPES.recipeBuilder("hydroxyquinoline").duration(260).EUt(VA[HV])
    .inputFluids(Aminophenol.getFluid(1000))
    .inputFluids(Glycerol.getFluid(1000))
    .inputFluids(Oxygen.getFluid(1000))
    .notConsumableFluid(NitroBenzene.getFluid(1))
    .outputFluids(Hydroxyquinoline.getFluid(1000))
    .outputFluids(Water.getFluid(4000))
    .save(provider);

    // From misc/test/SuperconductorsSMDChain.txt:110
    LARGE_CHEMICAL_RECIPES.recipeBuilder("bismuth_nitrate_soluton").duration(350).EUt(VA[LV])
    .inputDust(Bismuth)
    .inputFluids(NitricAcid.getFluid(6000))
    .outputFluids(BismuthNitrateSoluton.getFluid(1000))
    .outputFluids(NitrogenDioxide.getFluid(3000))
    .outputFluids(Water.getFluid(2000))
    .save(provider);

    // From misc/test/SuperconductorsSMDChain.txt:147
    MIXER_RECIPES.recipeBuilder("barium_chloride_solution").duration(230).EUt(VA[MV])
    .inputDust(BariumChloride, 3)
    .inputFluids(DistilledWater.getFluid(1000))
    .outputFluids(BariumChlorideSolution.getFluid(1000))
    .save(provider);

    // From misc/test/SuperconductorsSMDChain.txt:154
    CHEMICAL_RECIPES.recipeBuilder("barium_titanate_preparation").duration(320).EUt(VA[MV])
    .inputFluids(TitaniumTetrachloride.getFluid(1000))
    .inputFluids(SodiumHydroxideSolution.getFluid(1000))
    .inputFluids(BariumChlorideSolution.getFluid(1000))
    .outputDust(Salt, 2)
    .outputFluids(BariumTitanatePreparation.getFluid(1000))
    .outputFluids(HydrochloricAcid.getFluid(4000))
    .save(provider);

    // From misc/test/SuperconductorsSMDChain.txt:170
    LARGE_CHEMICAL_RECIPES.recipeBuilder("perbromothiophene").duration(230).EUt(4960)
    .inputDust(SuccinicAcid, 14)
    .inputFluids(HydrogenSulfide.getFluid(1000))
    .inputFluids(Bromine.getFluid(4000))
    .outputFluids(Perbromothiophene.getFluid(1000))
    .outputFluids(Water.getFluid(4000))
    .save(provider);

    // From misc/test/SuperconductorsSMDChain.txt:179
    LARGE_CHEMICAL_RECIPES.recipeBuilder("diethoxythiophene").duration(80).EUt(VA[HV])
    .notConsumableDust(Zinc)
    .inputFluids(Perbromothiophene.getFluid(1000))
    .inputFluids(AceticAcid.getFluid(500))
    .inputDust(SodiumEthoxide, 18)
    .inputFluids(Water.getFluid(1000))
    .outputFluids(Diethoxythiophene.getFluid(1000))
    .outputFluids(HydrobromicAcid.getFluid(2000))
    .outputFluids(CarbonDioxide.getFluid(1000))
    .outputDust(SodiumBromide, 4)
    .save(provider);

    // From misc/test/SuperconductorsSMDChain.txt:192
    CHEMICAL_RECIPES.recipeBuilder("edot").duration(140).EUt(VA[MV])
    .notConsumableFluid(Toluene.getFluid(1))
    .inputFluids(EthyleneGlycol.getFluid(1000))
    .inputFluids(Diethoxythiophene.getFluid(1000))
    .outputFluids(EDOT.getFluid(1000))
    .outputFluids(Ethanol.getFluid(2000))
    .save(provider);

    // From misc/test/SuperconductorsSMDChain.txt:325
    LARGE_CHEMICAL_RECIPES.recipeBuilder("iron_carbonyl").duration(240).EUt(VA[HV])
    .inputDust(IronIodide, 15)
    .inputFluids(CarbonMonoxide.getFluid(25000))
    .notConsumable(block, Copper)
    .outputDust(Iodine, 10)
    .chancedOutput(dust, Iron, 1, 5000)
    .outputFluids(IronCarbonyl.getFluid(5000))
    .save(provider);

    // From misc/test/SuperconductorsSMDChain.txt:334
    FLUID_HEATER_RECIPES.recipeBuilder("purified_iron_carbonyl").duration(200).EUt(VA[HV])
    .circuitMeta(1)
    .inputFluids(IronCarbonyl.getFluid(1000))
    .outputFluids(PurifiedIronCarbonyl.getFluid(900))
    .save(provider);

    // From misc/test/SuperconductorsSMDChain.txt:539
    CHEMICAL_RECIPES.recipeBuilder("biperfluoromethanedisulfide").duration(250).EUt(VA[MV])
    .notConsumableDust(Iodine)
    .inputFluids(Fluorine.getFluid(6000))
    .inputFluids(CarbonSulfide.getFluid(2000))
    .outputFluids(Biperfluoromethanedisulfide.getFluid(1000))
    .outputDust(Sulfur, 2)
    .save(provider);

    // From misc/test/SuperconductorsSMDChain.txt:548
    CHEMICAL_RECIPES.recipeBuilder("barium_triflate_solution").duration(240).EUt(VA[HV])
    .inputFluids(Mercury.getFluid(1000))
    .inputFluids(Water.getFluid(3000))
    .inputFluids(Biperfluoromethanedisulfide.getFluid(1000))
    .inputDust(BariumCarbonate, 5)
    .notConsumable(LOW_FREQUENCY_LASER.asItem())
    .outputFluids(BariumTriflateSolution.getFluid(3000))
    .outputDust(Carbon)
    .save(provider);

    // From misc/test/SuperconductorsSMDChain.txt:613
    LARGE_CHEMICAL_RECIPES.recipeBuilder("citric_acid").duration(240).EUt(VA[IV])
    .inputFluids(Glycerol.getFluid(1000))
    .inputFluids(HydrochloricAcid.getFluid(2000))
    .inputFluids(HypochlorousAcid.getFluid(1000))
    .inputFluids(HydrogenCyanide.getFluid(3000))
    .inputFluids(Water.getFluid(3000))
    .notConsumableDust(PotassiumDichromate)
    .circuitMeta(0)
    .outputFluids(CitricAcid.getFluid(1000))
    .outputFluids(AmmoniumChloride.getFluid(3000))
    .save(provider);

    // From misc/test/SuperconductorsSMDChain.txt:656
    CHEMICAL_RECIPES.recipeBuilder("oxalic_acid").duration(VA[MV]).EUt(VA[HV])
    .notConsumableDust(VanadiumOxide)
    .inputFluids(Oxygen.getFluid(9000))
    .inputDust(Glucose, 24)
    .outputFluids(Water.getFluid(3000))
    .outputFluids(OxalicAcid.getFluid(3000))
    .save(provider);

    // From misc/test/SuperconductorsSMDChain.txt:742
    CHEMICAL_RECIPES.recipeBuilder("trimethylchlorosilane_3").duration(110).EUt(VA[EV])
    .inputFluids(Dimethyldichlorosilane.getFluid(1000))
    .inputFluids(Methane.getFluid(1000))
    .outputFluids(Trimethylchlorosilane.getFluid(1000))
    .outputFluids(Hydrogen.getFluid(2000))
    .save(provider);

    // From misc/test/SuperconductorsSMDChain.txt:750
    LARGE_CHEMICAL_RECIPES.recipeBuilder("dibromoacrolein").duration(360).EUt(VA[IV])
    .inputFluids(FormicAcid.getFluid(2000))
    .inputFluids(Bromine.getFluid(2000))
    .inputFluids(Water.getFluid(2000))
    .notConsumableFluid(Trimethylchlorosilane.getFluid(1))
    .inputDust(Sodium, 4)
    .outputDust(SodiumHydroxide, 12)
    .outputFluids(Dibromoacrolein.getFluid(1000))
    .outputFluids(Hydrogen.getFluid(2000))
    .save(provider);

    // From misc/test/SuperconductorsSMDChain.txt:771
    CHEMICAL_RECIPES.recipeBuilder("chloroethane").duration(200).EUt(3340)
    .inputFluids(Chlorine.getFluid(2000))
    .inputFluids(Ethane.getFluid(1000))
    .outputFluids(Chloroethane.getFluid(1000))
    .outputFluids(HydrochloricAcid.getFluid(1000))
    .notConsumable(LOW_FREQUENCY_LASER.asItem())
    .save(provider);

    // From misc/test/SuperconductorsSMDChain.txt:780
    LARGE_CHEMICAL_RECIPES.recipeBuilder("bromohydrothiine").duration(320).EUt(VA[IV])
    .inputDust(SodiumThiosulfate, 14)
    .inputFluids(Chloroethane.getFluid(1000))
    .inputFluids(Dibromoacrolein.getFluid(1000))
    .outputDust(Salt, 4)
    .outputDust(SodiumBisulfate, 14)
    .outputFluids(Bromohydrothiine.getFluid(1000))
    .save(provider);

    // From misc/test/SuperconductorsSMDChain.txt:790
    CHEMICAL_RECIPES.recipeBuilder("bromobutane").duration(290).EUt(VA[LuV])
    .inputFluids(Bromohydrothiine.getFluid(1000))
    .inputFluids(ButylLithium.getFluid(2000))
    .inputDust(Selenium, 2)
    .outputFluids(Bromobutane.getFluid(2000))
    .outputDust(Lithiumthiinediselenide, 14)
    .save(provider);

    // From misc/test/SuperconductorsSMDChain.txt:799
    CHEMICAL_RECIPES.recipeBuilder("propadiene").duration(200).EUt(VA[HV])
    .inputFluids(Propene.getFluid(1000))
    .inputFluids(Butene.getFluid(1000))
    .notConsumableDust(DehydrogenationCatalyst)
    .outputFluids(Propadiene.getFluid(1000))
    .outputFluids(Butane.getFluid(1000))
    .save(provider);

    // From misc/test/SuperconductorsSMDChain.txt:873
    MIXER_RECIPES.recipeBuilder("astatide_solution").duration(140).EUt(VA[IV])
    .inputDust(Astatine)
    .inputFluids(SulfuricAcid.getFluid(1000))
    .outputFluids(AstatideSolution.getFluid(1000))
    .save(provider);

    // From misc/test/SuperconductorsSMDChain.txt:982
    CHEMICAL_RECIPES.recipeBuilder("bromobutane_2").duration(210).EUt(VA[IV])
    .notConsumable(LOW_FREQUENCY_LASER.asItem())
    .inputFluids(Butane.getFluid(1000))
    .inputFluids(Bromine.getFluid(2000))
    .outputFluids(Bromobutane.getFluid(1000))
    .outputFluids(HydrobromicAcid.getFluid(1000))
    .save(provider);

    // From misc/test/SuperconductorsSMDChain.txt:999
    CHEMICAL_RECIPES.recipeBuilder("krypton_difluoride").duration(170).EUt(VA[HV])
    .notConsumable(LOW_FREQUENCY_LASER.asItem())
    .inputFluids(Krypton.getFluid(1000))
    .inputFluids(Fluorine.getFluid(2000))
    .outputFluids(KryptonDifluoride.getFluid(1000))
    .save(provider);

    // From misc/test/SuperconductorsSMDChain.txt:1024
    LARGE_CHEMICAL_RECIPES.recipeBuilder("phenylenedioxydiacetic_acid").duration(320).EUt(VA[ZPM])
    .inputFluids(Phenol.getFluid(1000))
    .inputFluids(HydrogenPeroxide.getFluid(1000))
    .inputFluids(Water.getFluid(1000))
    .inputFluids(Chlorine.getFluid(4000))
    .inputFluids(Ethenone.getFluid(2000))
    .outputFluids(PhenylenedioxydiaceticAcid.getFluid(1000))
    .outputFluids(HydrochloricAcid.getFluid(4000))
    .save(provider);

    // From misc/test/SuperconductorsSMDChain.txt:1035
    CHEMICAL_RECIPES.recipeBuilder("diethylthiourea").duration(210).EUt(VA[LuV])
    .inputFluids(SodiumThiocyanate.getFluid(1000))
    .inputFluids(HydrochloricAcid.getFluid(1000))
    .inputFluids(Ethylamine.getFluid(2000))
    .outputFluids(Ammonia.getFluid(1000))
    .outputFluids(Diethylthiourea.getFluid(1000))
    .outputDust(Salt, 2)
    .save(provider);

    // From misc/test/SuperconductorsSMDChain.txt:1045
    LARGE_CHEMICAL_RECIPES.recipeBuilder("isophthaloylbisdiethylthiourea").duration(250).EUt(VA[ZPM])
    .inputFluids(Diethylthiourea.getFluid(2000))
    .inputFluids(ThionylChloride.getFluid(2000))
    .inputFluids(PhenylenedioxydiaceticAcid.getFluid(1000))
    .outputFluids(SulfurDioxide.getFluid(2000))
    .outputFluids(HydrochloricAcid.getFluid(4000))
    .outputFluids(Isophthaloylbisdiethylthiourea.getFluid(1000))
    .save(provider);

    // From misc/test/SuperconductorsSMDChain.txt:1069
    CHEMICAL_RECIPES.recipeBuilder("fluorophosphoric_acid").duration(280).EUt(VA[IV])
    .inputFluids(AntimonyPentafluoride.getFluid(1000))
    .inputFluids(PhosphorusTrichloride.getFluid(1000))
    .inputFluids(HydrofluoricAcid.getFluid(1000))
    .outputDust(AntimonyTrichloride, 4)
    .outputFluids(FluorophosphoricAcid.getFluid(1000))
    .save(provider);

    // From misc/test/TaraniumChain.txt:33
    DISTILLATION_RECIPES.recipeBuilder("fluorosilicic_acid_3")
    .inputFluids(DiluteHexafluorosilicicAcid.getFluid(3000))
    .outputFluids(Water.getFluid(2000))
    .outputFluids(FluorosilicicAcid.getFluid(1000))
    .duration(160)
    .EUt(200)
    .save(provider);

    // From misc/test/TriniumChain.txt:94
    LARGE_CHEMICAL_RECIPES.recipeBuilder("trimethylchlorosilane_4").duration(320).EUt(2000)
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

    // From misc/test/UHVMaterials.txt:116
    ALLOY_BLAST_RECIPES.recipeBuilder("superheavy_mix")
    .inputDust(Seaborgium)
    .inputDust(Bohrium)
    .inputDust(Rutherfordium)
    .inputDust(Dubnium)
    .circuitMeta(1)
    .outputFluids(SuperheavyMix.getFluid(4000))
    .EUt(25_000_000)
    .duration(40)
    .blastFurnaceTemp(11000)
    .save(provider);

    // From misc/test/WormholeGeneratorChain.txt:30
    CENTRIFUGE_RECIPES.recipeBuilder("free_alpha_gas").duration(40).EUt(100000)
    .notConsumable(SEPARATION_ELECTROMAGNET.asItem())
    .inputFluids(Helium.getFluid(FluidStorageKeys.PLASMA, 1000))
    .outputFluids(FreeAlphaGas.getFluid(1000))
    .outputFluids(FreeElectronGas.getFluid(1000))
    .save(provider);
  }
}
