package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;

import static com.gregtechceu.gtceu.common.data.GTItems.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGCasings.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGItems.*;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.machine.multiblock.CleanroomType;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.zircky.industrialsorcerygreg.api.data.tag.ISGTagPrefix;
import com.zircky.industrialsorcerygreg.common.data.ISGMaterials;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.Items;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGItems.LOW_FREQUENCY_LASER;
import static com.zircky.industrialsorcerygreg.common.data.ISGItems.UVA_HALIDE_LAMP;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.*;

public class ChemicalReactorRecipes {
  public static void init(Consumer<FinishedRecipe> provider) {
    recipesChem(provider);
    recipesLargeChemical(provider);
    testRecipes(provider);
  }

  private static void recipesChem(Consumer<FinishedRecipe> provider) {
    CHEMICAL_RECIPES.recipeBuilder("manganese_oxide_dioxide")
        .inputDust(ISGMaterials.ManganeseOxide)
        .inputFluids(GTMaterials.Oxygen.getFluid(1000))
        .outputDust(ISGMaterials.ManganeseDioxide)
        .duration(230).EUt(GTValues.VA[GTValues.HV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder("manganese_dioxide")
        .inputDust(GTMaterials.Manganese)
        .inputFluids(GTMaterials.Oxygen.getFluid(2000))
        .outputDust(ISGMaterials.ManganeseDioxide)
        .duration(230).EUt(GTValues.VA[GTValues.EV]).save(provider);

    // 3HCl + Fl -> FlCl3 + 3H
    CHEMICAL_RECIPES.recipeBuilder("trichloroferane").duration(150).EUt(VA[IV])
        .inputFluids(HydrochloricAcid.getFluid(3000))
        .inputDust(MetastableFlerovium)
        .outputFluids(Trichloroferane.getFluid(1000))
        .outputFluids(Hydrogen.getFluid(3000))
        .save(provider);

    // C6H5F + 2Na -> C6H5Na + NaF
    CHEMICAL_RECIPES.recipeBuilder("phenylsodium").duration(210).EUt(VA[HV])
        .inputFluids(FluoroBenzene.getFluid(1000))
        .inputDust(Sodium, 2)
        .outputFluids(Phenylsodium.getFluid(1000))
        .outputDust(SodiumFluoride, 2)
        .save(provider);

    // 2KF + H + C6H4Cl2 + N -> 2KCl + C6H5F2N
    CHEMICAL_RECIPES.recipeBuilder("difluoroaniline").duration(160).EUt(VA[HV])
        .inputDust(PotassiumFluoride, 4)
        .inputFluids(Hydrogen.getFluid(1000))
        .inputFluids(Dichlorobenzene.getFluid(1000))
        .inputFluids(Nitrogen.getFluid(1000))
        .notConsumableDust(AluminiumChloride)
        .outputDust(RockSalt, 4)
        .outputFluids(Difluoroaniline.getFluid(1000))
        .save(provider);

    // C6H5F2N + C4H6O2 -> C10H7F2N + 2H2O
    CHEMICAL_RECIPES.recipeBuilder("ndifluorophenylpyrrole").duration(180).EUt(VA[HV])
        .inputFluids(Difluoroaniline.getFluid(1000))
        .inputFluids(Succinaldehyde.getFluid(1000))
        .notConsumableDust(PhosphorusPentoxide)
        .outputFluids(NDifluorophenylpyrrole.getFluid(1000))
        .outputFluids(Water.getFluid(2000))
        .save(provider);

    // NaClO3 + H2O2 -> NaClO4 + H2O
    CHEMICAL_RECIPES.recipeBuilder("sodium_perchlorate")
        .inputDust(SodiumChlorate, 5)
        .inputFluids(HydrogenPeroxide.getFluid(1000))
        .outputDust(SodiumPerchlorate, 6)
        .outputFluids(Water.getFluid(1000))
        .duration(200).EUt(VA[MV]).save(provider);

    // 2AgCl + H2O -> Ag2O + 2HCl
    CHEMICAL_RECIPES.recipeBuilder("silver_oxide")
        .inputDust(SilverChloride, 4)
        .notConsumableDust(SodiumHydroxide)
        .inputFluids(Water.getFluid(1000))
        .outputDust(SilverOxide, 3)
        .outputFluids(HydrochloricAcid.getFluid(2000))
        .duration(100).EUt(VA[HV]).save(provider);

    // Ge + 2S -> GeS2
    CHEMICAL_RECIPES.recipeBuilder("germanium_sulfide")
        .inputDust(Germanium)
        .inputDust(Sulfur, 2)
        .outputDust(GermaniumSulfide, 3)
        .duration(340).EUt(VA[MV]).save(provider);

    // WC + 4O -> WO3 + CO
    CHEMICAL_RECIPES.recipeBuilder("tungsten_trioxide")
        .inputDust(TungstenCarbide, 2)
        .inputFluids(Oxygen.getFluid(4000))
        .outputDust(TungstenTrioxide, 4)
        .outputFluids(CarbonMonoxide.getFluid(1000))
        .duration(400).EUt(VA[HV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder("cesium_iodide")
        .inputDust(Caesium)
        .inputDust(Iodine)
        .outputDust(CesiumIodide, 2)
        .duration(340).EUt(120).save(provider);

    CHEMICAL_RECIPES.recipeBuilder("finely_powdered_rutile_from_carbon_dioxide_titanium_tetrachloride").duration(450).EUt(480)
        .inputDust(FinelyPowderedRutile, 3)
        .inputDust(Carbon)
        .inputFluids(Chlorine.getFluid(4000))
        .outputFluids(CarbonDioxide.getFluid(1000))
        .outputFluids(TitaniumTetrachloride.getFluid(1000))
        .save(provider);

    // Hg + 4 HNO3 -> 2 H2O + Hg(NO3)2 + 2 NO2
    CHEMICAL_RECIPES.recipeBuilder("mercury_nitrate").duration(210).EUt(500)
        .inputFluids(Mercury.getFluid(1000))
        .inputFluids(NitricAcid.getFluid(4000))
        .inputFluids(NitrogenDioxide.getFluid(2000))
        .outputFluids(Water.getFluid(2000))
        .outputFluids(MercuryNitrate.getFluid(1000))
        .save(provider);

    // Hg(NO3)2 + 2HCl -> HgCl2 + 2HNO3
    CHEMICAL_RECIPES.recipeBuilder("mercury_chloride").duration(190).EUt(500)
        .inputFluids(MercuryNitrate.getFluid(1000))
        .inputFluids(HydrochloricAcid.getFluid(2000))
        .outputDust(MercuryChloride, 3)
        .outputFluids(NitricAcid.getFluid(2000))
        .save(provider);

    // NH4VO3 + [Bi(NO3)3 + H2O] + 2 NH3 + H2O -> 3 NH4NO3 + BiVO4(H2O)
    CHEMICAL_RECIPES.recipeBuilder("bismuth_vanadate_solution").duration(220).EUt(640)
        .inputDust(AmmoniumVanadate, 9)
        .inputFluids(BismuthNitrateSoluton.getFluid(1000))
        .inputFluids(Ammonia.getFluid(2000))
        .inputFluids(Water.getFluid(1000))
        .outputFluids(AmmoniumNitrate.getFluid(3000))
        .outputFluids(BismuthVanadateSolution.getFluid(1000))
        .save(provider);

    // As2O3 + 2 [CuSO4 + H2O] + 2 [NaOH + H2O] + Na2CO3 -> 2 CuAsHO3 + 2 [Na2SO4 + H2O] + CO2 (2 H2O voided)
    CHEMICAL_RECIPES.recipeBuilder("copper_arsenite").duration(220).EUt(125)
        .inputFluids(CopperSulfateSolution.getFluid(2000))
        .inputFluids(SodiumHydroxideSolution.getFluid(2000))
        .inputDust(ArsenicTrioxide, 5)
        .inputDust(SodaAsh, 6)
        .outputDust(CopperArsenite, 12)
        .outputFluids(CarbonDioxide.getFluid(1000))
        .outputFluids(SodiumSulfateSolution.getFluid(2000))
        .save(provider);

    // 6HCN + FeCl2 + 4 KOH -> K4Fe(CN)6 + 4H2O + 2 HCl
    CHEMICAL_RECIPES.recipeBuilder("potassium_ferrocyanide").duration(240).EUt(640)
        .inputFluids(Iron2Chloride.getFluid(1000))
        .inputFluids(HydrogenCyanide.getFluid(6000))
        .inputFluids(PotassiumHydroxide.getFluid(4000))
        .outputDust(PotassiumFerrocyanide, 17)
        .outputFluids(HydrochloricAcid.getFluid(2000))
        .outputFluids(Water.getFluid(4000))
        .save(provider);

    // Mn2O3 + 2NH3 + 4H3PO4 -> 2 NH4MnP2O7 + 5H2O
    CHEMICAL_RECIPES.recipeBuilder("ammonium_manganese_phosphate").duration(240).EUt(500)
        .inputDust(ManganeseIIIOxide, 5)
        .inputFluids(Ammonia.getFluid(2000))
        .inputFluids(PhosphoricAcid.getFluid(4000))
        .outputDust(AmmoniumManganesePhosphate, 30)
        .outputFluids(Water.getFluid(5000))
        .save(provider);

    // 2Pb(NO3)2 + K2Cr2O7 + H2O -> 2PbCrO4 + 2 KNO3 + 2 HNO3
    CHEMICAL_RECIPES.recipeBuilder("chrome_yellow").duration(280).EUt(500)
        .inputDust(LeadNitrate, 18)
        .inputDust(PotassiumDichromate, 11)
        .inputFluids(Water.getFluid(1000))
        .outputDust(ChromeYellow, 12)
        .outputFluids(NitricAcid.getFluid(2000))
        .outputDust(Saltpeter, 10)
        .save(provider);

    // 2PbCrO4 + 2 NaOH -> Pb2CrO5 + [Na2CrO4 + H2O]
    CHEMICAL_RECIPES.recipeBuilder("chrome_orange").duration(320).EUt(500)
        .inputDust(ChromeYellow, 12)
        .inputDust(SodiumHydroxide, 6)
        .outputFluids(SodiumChromateSolution.getFluid(1000))
        .outputDust(ChromeOrange, 8)
        .save(provider);

    // C7H8 + [H2SO4 + HNO3] -> C7H7(NO2) + (H2SO4)2(H2O)
    CHEMICAL_RECIPES.recipeBuilder("nitrotoluene").duration(340).EUt(1350)
        .inputFluids(Toluene.getFluid(1000))
        .inputFluids(NitrationMixture.getFluid(2000))
        .inputFluids(SulfuricAcid.getFluid(1000))
        .outputFluids(Nitrotoluene.getFluid(1000))
        .outputFluids(DilutedSulfuricAcid.getFluid(3000))
        .save(provider);

    // NaOH + H2SO4 + C6H5NH2 -> 2 H2O + C6H6NNaO3S
    CHEMICAL_RECIPES.recipeBuilder("sodium_sulfanilate").duration(240).EUt(1800)
        .inputDust(SodiumHydroxide, 3)
        .inputFluids(SulfuricAcid.getFluid(1000))
        .inputFluids(Aniline.getFluid(1000))
        .outputFluids(Water.getFluid(2000))
        .outputDust(SodiumSulfanilate, 18)
        .save(provider);

    // 2 C2H2O + C6H5NH2  -> C10H11NO2
    CHEMICAL_RECIPES.recipeBuilder("acetoacetanilide").duration(350).EUt(1350)
        .inputFluids(Ethenone.getFluid(2000))
        .inputFluids(Aniline.getFluid(1000))
        .outputFluids(Acetoacetanilide.getFluid(1000))
        .save(provider);

    // C7H8 + SO3 + NaCl -> C7H7SO3Na + HCl
    CHEMICAL_RECIPES.recipeBuilder("toluenesulfonate").duration(220).EUt(950)
        .inputDust(Salt, 2)
        .inputFluids(Toluene.getFluid(1000))
        .inputFluids(SulfurTrioxide.getFluid(1000))
        .outputFluids(Toluenesulfonate.getFluid(1000))
        .outputFluids(HydrochloricAcid.getFluid(1000))
        .save(provider);

    // C6H4(OH)2 + C8H4O3 -> C14H8O4 + H2O
    CHEMICAL_RECIPES.recipeBuilder("quinizarin").duration(240).EUt(1400)
        .inputFluids(Hydroquinone.getFluid(1000))
        .inputDust(PhthalicAnhydride, 15)
        .notConsumableFluid(Toluenesulfonate.getFluid(1000))
        .outputFluids(Quinizarin.getFluid(1000))
        .outputFluids(Water.getFluid(1000))
        .save(provider);

    //C8H4O3 + C6H6 -> C14H8O2 + H2O
    CHEMICAL_RECIPES.recipeBuilder("anthraquinone_from_phthalic_anhydride").duration(270).EUt(1800)
        .inputDust(PhthalicAnhydride, 15)
        .inputFluids(Benzene.getFluid(1000))
        .outputDust(Anthraquinone, 24)
        .outputFluids(Water.getFluid(1000))
        .notConsumableDust(AluminiumChloride)
        .save(provider);

    //C7H7NO2 + 6 H -> C7H9N + 2 H2O
    CHEMICAL_RECIPES.recipeBuilder("toluidine").duration(160).EUt(1100)
        .inputFluids(Nitrotoluene.getFluid(1000))
        .notConsumableFluid(SulfuricAcid.getFluid(1000))
        .inputFluids(Hydrogen.getFluid(6000))
        .notConsumable(dust, Palladium)
        .outputFluids(Toluidine.getFluid(1000))
        .outputFluids(Water.getFluid(2000))
        .save(provider);

    //C4H10 + 7 O -> C4H2O3 + 4 H2O
    CHEMICAL_RECIPES.recipeBuilder("maleic_anhydride").duration(520).EUt(1340)
        .notConsumableDust(BismuthVanadate)
        .inputFluids(Butane.getFluid(1000))
        .inputFluids(Oxygen.getFluid(7000))
        .outputFluids(Water.getFluid(4000))
        .outputFluids(MaleicAnhydride.getFluid(1000))
        .save(provider);

    //C4H2O3 + 2H + H2O -> C4H6O4
    CHEMICAL_RECIPES.recipeBuilder("succinic_acid").duration(440).EUt(1320)
        .inputFluids(MaleicAnhydride.getFluid(1000))
        .inputFluids(Hydrogen.getFluid(1000))
        .inputFluids(Water.getFluid(1000))
        .notConsumable(dust, RhodiumPlatedPalladium)
        .outputDust(SuccinicAcid, 14)
        .save(provider);

    // C4H6O4 + 2 C3H8O -> C10H18O4 + 2 H2O
    CHEMICAL_RECIPES.recipeBuilder("isopropylsuccinate").duration(260).EUt(1400)
        .inputDust(SuccinicAcid, 14)
        .inputFluids(IsopropylAlcohol.getFluid(2000))
        .outputFluids(Isopropylsuccinate.getFluid(1000))
        .outputFluids(Water.getFluid(2000))
        .save(provider);

    //C7H8 + NH3 + 3 O -> C7H5N + 3 H2O
    CHEMICAL_RECIPES.recipeBuilder("benzonitrile").duration(200).EUt(1700)
        .inputFluids(Toluene.getFluid(1000))
        .inputFluids(Ammonia.getFluid(1000))
        .inputFluids(Oxygen.getFluid(3000))
        .outputFluids(Benzonitrile.getFluid(1000))
        .outputFluids(Water.getFluid(3000))
        .save(provider);

    //2 C7H5N + C10H18O4 -> 2 C3H8O + C18H12N2O2
    CHEMICAL_RECIPES.recipeBuilder("diketopyrrolopyrrole").duration(250).EUt(1700)
        .inputFluids(Isopropylsuccinate.getFluid(1000))
        .inputFluids(Benzonitrile.getFluid(1000))
        .notConsumableDust(SodiumEthoxide)
        .notConsumableFluid(IsopropylAlcohol.getFluid(10))
        .outputFluids(IsopropylAlcohol.getFluid(1000))
        .outputDust(Diketopyrrolopyrrole, 32)
        .save(provider);

    //C16H10N2O2 + 4 Br -> C16H6Br4N2O2 + 4 H
    CHEMICAL_RECIPES.recipeBuilder("tetrabromoindigo").duration(240).EUt(850)
        .inputDust(Indigo, 30)
        .inputFluids(Bromine.getFluid(4000))
        .outputDust(Tetrabromoindigo, 30)
        .outputFluids(Hydrogen.getFluid(4000))
        .save(provider);

    //C8H4O3 + 2 C6H6O2 -> 	C20H12O5 + 2H2O
    CHEMICAL_RECIPES.recipeBuilder("fluorescein").duration(240).EUt(1150)
        .inputDust(PhthalicAnhydride, 15)
        .inputFluids(Resorcinol.getFluid(2000))
        .outputDust(Fluorescein, 37)
        .outputFluids(Water.getFluid(2000))
        .notConsumableDust(ZincChloride)
        .save(provider);

    // C6H4(CH3)2 + 2CH3Cl -> C6H2(CH3)4 + 2HCl
    CHEMICAL_RECIPES.recipeBuilder("durene")
        .inputFluids(OrthoXylene.getFluid(1000))
        .inputFluids(Chloromethane.getFluid(2000))
        .outputDust(Durene, 24)
        .outputFluids(HydrochloricAcid.getFluid(2000))
        .EUt(120)
        .duration(150)
        .save(provider);

    // C6H2(CH3)4 + 12O -> C6H2(C2O3)2 + 6H2O
    CHEMICAL_RECIPES.recipeBuilder("pyromellitic_dianhydride")
        .inputDust(Durene, 24)
        .inputFluids(Oxygen.getFluid(12000))
        .outputDust(PyromelliticDianhydride, 18)
        .outputFluids(Water.getFluid(6000))
        .EUt(120)
        .duration(150)
        .save(provider);

    // 2C6H5NH2 + C2H5OH -> C12H12N2O + 2CH4
    CHEMICAL_RECIPES.recipeBuilder("oxydianiline")
        .notConsumableDust(Tin)
        .notConsumableDust(HydrochloricAcid)
        .inputFluids(Aniline.getFluid(2000))
        .inputFluids(Phenol.getFluid(1000))
        .outputFluids(Oxydianiline.getFluid(1000))
        .outputFluids(Methane.getFluid(2000))
        .EUt(120)
        .duration(150)
        .save(provider);

    // Cr + 3O -> CrO3
    CHEMICAL_RECIPES.recipeBuilder("chromium_trioxide_from_chromium_oxygen")
        .inputDust(Chromium)
        .inputFluids(Oxygen.getFluid(3000))
        .outputDust(ChromiumTrioxide, 4)
        .EUt(60)
        .duration(100)
        .save(provider);

    // 2CrO3 + 2KNO3 -> K2Cr2O7 + 2NO2 + O
    CHEMICAL_RECIPES.recipeBuilder("potassium_dichromate_from_chromium_trioxide_saltpeter_potassium_dichromate")
        .inputDust(ChromiumTrioxide, 8)
        .inputDust(Saltpeter, 10)
        .outputDust(PotassiumDichromate, 11)
        .outputFluids(NitrogenDioxide.getFluid(2000))
        .outputFluids(Oxygen.getFluid(1000))
        .EUt(480)
        .duration(100)
        .save(provider);

    // Li + 2H2O -> H + LiOH(H2O)
    CHEMICAL_RECIPES.recipeBuilder("lithium_hydroxide_solution").duration(140).EUt(120)
        .inputDust(Lithium)
        .inputFluids(Water.getFluid(2000))
        .circuitMeta(1)
        .outputFluids(Hydrogen.getFluid(1000))
        .outputFluids(LithiumHydroxideSolution.getFluid(1000))
        .save(provider);

    // 6NO2 + O3 -> 3N2O5
    CHEMICAL_RECIPES.recipeBuilder("nitrogen_dioxide_ozone_nitrogen_pentoxide").duration(240).EUt(480)
        .inputFluids(NitrogenDioxide.getFluid(6000))
        .inputFluids(Ozone.getFluid(1000))
        .outputFluids(NitrogenPentoxide.getFluid(3000))
        .save(provider);

    // 2N2O5 + TiCl4 + 2O -> 4Cl + Ti(NO3)4
    CHEMICAL_RECIPES.recipeBuilder("nitrogen_pentoxide_titanium_tetrachloride_oxygen_from_chlorine_titanium_nitrate").duration(230).EUt(480)
        .inputFluids(NitrogenPentoxide.getFluid(2000))
        .inputFluids(TitaniumTetrachloride.getFluid(1000))
        .inputFluids(Oxygen.getFluid(2000))
        .outputFluids(Chlorine.getFluid(4000))
        .outputDust(TitaniumNitrate, 17)
        .save(provider);

// Ti + 4HF -> TiF4 + 4H
    CHEMICAL_RECIPES.recipeBuilder("titanium_hydrofluoric_acid_from_titanium_tetrafluoride").duration(300).EUt(120)
        .inputDust(Titanium)
        .inputFluids(HydrofluoricAcid.getFluid(4000))
        .outputFluids(TitaniumTetrafluoride.getFluid(1000))
        .outputFluids(Hydrogen.getFluid(4000))
        .save(provider);

    // C6H6 + C7H8 -> C12H10 + CH4
    CHEMICAL_RECIPES.recipeBuilder("biphenyl").duration(350).EUt(480)
        .inputFluids(Benzene.getFluid(1000))
        .inputFluids(Toluene.getFluid(1000))
        .outputFluids(Methane.getFluid(1000))
        .outputDust(Biphenyl, 22)
        .save(provider);

    // (NH4)2SO4 + H2SO4 -> (NH4)2(SO4)2 + H2
    CHEMICAL_RECIPES.recipeBuilder("ammonium_persulfate").duration(220).EUt(120)
        .circuitMeta(0)
        .inputFluids(AmmoniumSulfate.getFluid(1000))
        .inputFluids(SulfuricAcid.getFluid(1000))
        .outputFluids(AmmoniumPersulfate.getFluid(1000))
        .outputFluids(Hydrogen.getFluid(2000))
        .save(provider);

    // 2I + C12H10 + H2SO4 + (NH4)2SO4 -> C12H8I2 + (NH4)2(SO4)2 + 2H2
    CHEMICAL_RECIPES.recipeBuilder("diiodobiphenyl").duration(270).EUt(480)
        .inputDust(Iodine, 2)
        .inputDust(Biphenyl, 22)
        .inputFluids(AmmoniumSulfate.getFluid(1000))
        .inputFluids(SulfuricAcid.getFluid(1000))
        .outputDust(Diiodobiphenyl, 22)
        .outputFluids(AmmoniumPersulfate.getFluid(1000))
        .outputFluids(Hydrogen.getFluid(4000))
        .save(provider);

    // Li + C4H10 -> C4H9Li + H
    CHEMICAL_RECIPES.recipeBuilder("butyl_lithium").duration(150).EUt(480)
        .inputDust(Lithium)
        .inputFluids(Butane.getFluid(1000))
        .outputFluids(ButylLithium.getFluid(1000))
        .outputFluids(Hydrogen.getFluid(1000))
        .save(provider);

    // Sn + 2Cl -> SnCl2
    CHEMICAL_RECIPES.recipeBuilder("tin_chloride").duration(65).EUt(30)
        .inputDust(Tin)
        .inputFluids(Chlorine.getFluid(2000))
        .outputDust(TinChloride, 3)
        .save(provider);

    // 2Tl + 2HCl -> 2TlCl + 2H
    CHEMICAL_RECIPES.recipeBuilder("thallium_chloride").duration(100).EUt(120)
        .inputDust(Thallium, 2)
        .inputFluids(HydrochloricAcid.getFluid(2000))
        .outputDust(ThalliumChloride, 4)
        .outputFluids(Hydrogen.getFluid(2000))
        .save(provider);

    // 2C5H5N -> C10H8N2 + H2
    CHEMICAL_RECIPES.recipeBuilder("bipyridine").duration(300).EUt(1920)
        .inputFluids(Pyridine.getFluid(2000))
        .notConsumable(ISGTagPrefix.CATALYST, NiAlCatalyst)
        .outputDust(Bipyridine, 20)
        .outputFluids(Hydrogen.getFluid(2000))
        .save(provider);

    // C7H5ClO + 2H -> C7H6O + HCl
    CHEMICAL_RECIPES.recipeBuilder("benzaldehyde").duration(270).EUt(480)
        .notConsumableDust(Barite)
        .notConsumable(ISGTagPrefix.CATALYST, PdCCatalyst)
        .inputFluids(BenzoylChloride.getFluid(1000))
        .inputFluids(Hydrogen.getFluid(1000))
        .outputFluids(Benzaldehyde.getFluid(1000))
        .outputFluids(HydrochloricAcid.getFluid(1000))
        .save(provider);

    // 2C7H6O + C3H6O -> C17H14O + 2H2O
    CHEMICAL_RECIPES.recipeBuilder("dibenzylideneacetone").duration(450).EUt(480)
        .inputFluids(Benzaldehyde.getFluid(2000))
        .inputFluids(Acetone.getFluid(1000))
        .outputFluids(Dibenzylideneacetone.getFluid(1000))
        .outputFluids(Water.getFluid(2000))
        .save(provider);

    // Pd + 2Cl -> PdCl2
    CHEMICAL_RECIPES.recipeBuilder("palladium_chloride").duration(320).EUt(30)
        .inputDust(Palladium)
        .inputFluids(Chlorine.getFluid(2000))
        .outputDust(PalladiumChloride, 3)
        .save(provider);

    // 3C17H14O + 2PdCl2 -> 4Cl + C51H42O3Pd2
    CHEMICAL_RECIPES.recipeBuilder("palladium_bis_dibenzylidieneacetone").duration(160).EUt(1920)
        .inputFluids(Dibenzylideneacetone.getFluid(3000))
        .inputDust(PalladiumChloride, 6)
        .outputFluids(Chlorine.getFluid(4000))
        .outputDust(PalladiumBisDibenzylidieneacetone, 16)
        .save(provider);

    // H2PtCl6 + 2K -> K2PtCl4 + 2HCl
    CHEMICAL_RECIPES.recipeBuilder("potassium_tetrachloroplatinate").duration(120).EUt(480)
        .inputFluids(ChloroPlatinicAcid.getFluid(1000))
        .inputDust(Potassium, 2)
        .outputDust(PotassiumTetrachloroplatinate, 7)
        .outputFluids(HydrochloricAcid.getFluid(2000))
        .save(provider);

    // Ni + 2Cl -> NiCl2
    CHEMICAL_RECIPES.recipeBuilder("nickel_chloride").duration(60).EUt(30)
        .inputDust(Nickel)
        .inputFluids(Chlorine.getFluid(2000))
        .outputDust(NickelChloride, 3)
        .save(provider);

    // NiCl2 + 6C6H5OH + 2PCl3 -> C36H30Cl2NiP2 + 6HCl + 6O
    CHEMICAL_RECIPES.recipeBuilder("nickel_triphenyl_phosphite").duration(170).EUt(1920)
        .inputDust(NickelChloride, 3)
        .inputFluids(Phenol.getFluid(6000))
        .inputFluids(PhosphorusTrichloride.getFluid(2000))
        .outputDust(NickelTriphenylPhosphite, 16)
        .outputFluids(HydrochloricAcid.getFluid(6000))
        .outputFluids(Oxygen.getFluid(6000))
        .save(provider);

    // 2C4H6 -> C8H12
    CHEMICAL_RECIPES.recipeBuilder("cyclooctadiene").duration(110).EUt(480)
        .inputFluids(Butadiene.getFluid(2000))
        .notConsumableDust(NickelTriphenylPhosphite)
        .outputFluids(Cyclooctadiene.getFluid(1000))
        .save(provider);

    CHEMICAL_RECIPES.recipeBuilder("carbon_nanotubes").duration(290).EUt(320000)
        .inputFluids(Cycloparaphenylene.getFluid(200))
        .inputFluids(Methane.getFluid(800))
        .notConsumable(plate, Rhenium)
        .circuitMeta(0)
        .outputItems(ingot, CarbonNanotubes)
        .save(provider);

    CHEMICAL_RECIPES.recipeBuilder("seaborgium_doped_nanotubes").duration(290).EUt(320000)
        .inputFluids(Cycloparaphenylene.getFluid(200))
        .inputFluids(Methane.getFluid(800))
        .inputDust(Seaborgium)
        .notConsumable(plate, Rhenium)
        .outputFluids(SeaborgiumDopedNanotubes.getFluid(1000))
        .save(provider);

    // 2NH3 + H2SO4 -> (NH4)2SO4
    CHEMICAL_RECIPES.recipeBuilder("ammonium_sulfate").duration(200).EUt(480)
        .inputFluids(Ammonia.getFluid(2000))
        .inputFluids(SulfuricAcid.getFluid(1000))
        .circuitMeta(1)
        .outputFluids(AmmoniumSulfate.getFluid(1000))
        .save(provider);

    //K2CO3 + 2 SO2 + H2O -> 2 KHSO3 + CO2
    CHEMICAL_RECIPES.recipeBuilder("potassium_bisulfite")
        .inputFluids(SulfurDioxide.getFluid(2000))
        .inputDust(PotassiumCarbonate, 6)
        .inputFluids(Water.getFluid(1000))
        .outputDust(PotassiumBisulfite, 12)
        .outputFluids(CarbonDioxide.getFluid(1000))
        .EUt(480)
        .duration(100)
        .save(provider);

    // K + HNO3 -> KNO3 + H
    CHEMICAL_RECIPES.recipeBuilder("saltpeter_from_potassium")
        .inputDust(Potassium)
        .inputFluids(NitricAcid.getFluid(1000))
        .outputDust(Saltpeter, 5)
        .outputFluids(Hydrogen.getFluid(1000))
        .duration(100).EUt(30).save(provider);

    //KNO2 + CH3COOH + NaCl -> HNO2 + CH3COONa + KCl
    CHEMICAL_RECIPES.recipeBuilder("nitrous_acid_from_potassium_nitrite")
        .inputDust(PotassiumNitrite, 4)
        .inputFluids(AceticAcid.getFluid(1000))
        .inputDust(Salt, 2)
        .outputFluids(NitrousAcid.getFluid(1000))
        .outputDust(RockSalt, 2)
        .outputFluids(SodiumAcetate.getFluid(1000))
        .EUt(480)
        .duration(100)
        .save(provider);

    ///2 KHSO3 + HNO2 -> K2NHS2O7 + H2O
    CHEMICAL_RECIPES.recipeBuilder("potassium_hydroxylaminedisulfonate")
        .inputFluids(NitrousAcid.getFluid(1000))
        .inputDust(PotassiumBisulfite, 12)
        .outputDust(PotassiumHydroxylaminedisulfonate, 13)
        .outputFluids(Water.getFluid(1000))
        .EUt(1920)
        .duration(100)
        .save(provider);

    //2 K2NHS2O7 + 4 H2O -> 2 K2SO4 + H2SO4 + N2H8SO6
    CHEMICAL_RECIPES.recipeBuilder("hydroxylammonium_sulfate")
        .inputDust(PotassiumHydroxylaminedisulfonate, 26)
        .inputFluids(Water.getFluid(4000))
        .outputDust(HydroxylammoniumSulfate, 17)
        .outputDust(PotassiumSulfate, 14)
        .outputFluids(SulfuricAcid.getFluid(1000))
        .EUt(1920)
        .duration(200)
        .save(provider);

    //N2H8SO6 + BaCl2 -> 2 H4NOCl + BaSO4
    CHEMICAL_RECIPES.recipeBuilder("hydroxylamine_hydrochloride")
        .inputDust(HydroxylammoniumSulfate, 17)
        .inputDust(BariumChloride, 3)
        .outputFluids(HydroxylamineHydrochloride.getFluid(2000))
        .outputFluids(BariumSulfateSolution.getFluid(1000))
        .EUt(480)
        .duration(100)
        .save(provider);

    //KNO2 + CH3COOH + NaCl -> HNO2 + CH3COONa + KCl
    CHEMICAL_RECIPES.recipeBuilder("nitrous_acid_from_potassium_nitrite_large")
        .inputDust(PotassiumNitrite, 4)
        .inputFluids(AceticAcid.getFluid(1000))
        .inputDust(Salt, 2)
        .outputFluids(NitrousAcid.getFluid(1000))
        .outputDust(RockSalt, 2)
        .outputFluids(SodiumAcetate.getFluid(1000))
        .EUt(480)
        .duration(100)
        .save(provider);

    ///2 KHSO3 + HNO2 -> K2NHS2O7 + H2O
    CHEMICAL_RECIPES.recipeBuilder("potassium_hydroxylaminedisulfonate_large")
        .inputFluids(NitrousAcid.getFluid(1000))
        .inputDust(PotassiumBisulfite, 26)
        .outputDust(PotassiumHydroxylaminedisulfonate, 26)
        .outputFluids(Water.getFluid(1000))
        .EUt(1920)
        .duration(100)
        .save(provider);

    //2 K2NHS2O7 + 4 H2O -> 2 K2SO4 + H2SO4 + N2H8SO6
    CHEMICAL_RECIPES.recipeBuilder("hydroxylammonium_sulfate_large")
        .inputDust(PotassiumHydroxylaminedisulfonate, 26)
        .inputFluids(Water.getFluid(4000))
        .outputDust(HydroxylammoniumSulfate, 17)
        .outputDust(PotassiumSulfate, 14)
        .outputFluids(SulfuricAcid.getFluid(1000))
        .EUt(1920)
        .duration(200)
        .save(provider);

    //N2H8SO6 + BaCl2 -> 2 H4NOCl + BaSO4
    CHEMICAL_RECIPES.recipeBuilder("hydroxylamine_hydrochloride_large")
        .inputDust(HydroxylammoniumSulfate, 17)
        .inputDust(BariumChloride, 3)
        .outputFluids(HydroxylamineHydrochloride.getFluid(2000))
        .outputFluids(BariumSulfateSolution.getFluid(1000))
        .EUt(480)
        .duration(100)
        .save(provider);
    //C4H6O4 + CaCl2 (not consumed) + (CH3CO)2O -> C4H4O3 + 2 CH3COOH
    CHEMICAL_RECIPES.recipeBuilder("succinic_anhydride")
        .inputDust(SuccinicAcid, 14)
        .inputFluids(AceticAnhydride.getFluid(1000))
        .notConsumable(dust, CalciumChloride)
        .outputDust(SuccinicAnhydride, 11)
        .outputFluids(AceticAcid.getFluid(2000))
        .EUt(7680)
        .duration(100)
        .save(provider);

    //2 CH2O + C2H2 + 4 H -> C4H8O + H2O
    CHEMICAL_RECIPES.recipeBuilder("tetrahydrofuran")
        .inputFluids(Acetylene.getFluid(1000))
        .inputFluids(Formaldehyde.getFluid(2000))
        .inputFluids(Hydrogen.getFluid(4000))
        .outputFluids(Tetrahydrofuran.getFluid(1000))
        .EUt(7680)
        .duration(75)
        .save(provider);

    //C4H4O3 + NH3OHCl + Na -> C4H5NO3 + H2O + NaCl + H
    CHEMICAL_RECIPES.recipeBuilder("n_hydroxysuccinimide")
        .inputDust(SuccinicAnhydride, 11)
        .inputDust(Sodium)
        .inputFluids(HydroxylamineHydrochloride.getFluid(1000))
        .outputDust(Salt, 2)
        .outputDust(NHydroxysuccinimide, 26)
        .outputFluids(Water.getFluid(1000))
        .outputFluids(Hydrogen.getFluid(1000))
        .EUt(1920)
        .duration(200)
        .save(provider);

    //NH3 + 3 C2H5OH -> (C2H5)3N + 3 H2O
    CHEMICAL_RECIPES.recipeBuilder("triethylamine")
        .inputFluids(Ammonia.getFluid(1000))
        .inputFluids(Ethanol.getFluid(3000))
        .outputFluids(Triethylamine.getFluid(1000))
        .outputFluids(Water.getFluid(3000))
        .EUt(480)
        .duration(100)
        .save(provider);

    //(CH2CO)2NOH + (CH3CO)2O -> C6H7NO4 + CH3COOH
    CHEMICAL_RECIPES.recipeBuilder("succinimidyl_acetate")
        .notConsumableFluid(Triethylamine.getFluid(1000))
        .inputFluids(AceticAnhydride.getFluid(1000))
        .inputDust(NHydroxysuccinimide, 26)
        .notConsumableFluid(Tetrahydrofuran.getFluid(1000))
        .outputDust(SuccinimidylAcetate, 18)
        .outputFluids(AceticAcid.getFluid(1000))
        .EUt(1920)
        .duration(200)
        .save(provider);

    // Se + 2O -> SeO2
    CHEMICAL_RECIPES.recipeBuilder("selenium_oxide")
        .inputDust(Selenium)
        .inputFluids(Oxygen.getFluid(2000))
        .outputDust(SeleniumOxide, 3)
        .duration(100).EUt(30).save(provider);

    //SeO2 + H2O -> H2SeO3
    CHEMICAL_RECIPES.recipeBuilder("selenous_acid")
        .inputDust(SeleniumOxide)
        .inputFluids(Water.getFluid(1000))
        .outputFluids(SelenousAcid.getFluid(1000))
        .EUt(120)
        .duration(100)
        .save(provider);

    //CH3CHO + O -> (CHO)2 + H2O
    CHEMICAL_RECIPES.recipeBuilder("glyoxal")
        .inputFluids(Acetaldehyde.getFluid(1000))
        .inputFluids(Oxygen.getFluid(1000))
        .notConsumableFluid(SelenousAcid.getFluid(1000))
        .outputFluids(Water.getFluid(1000))
        .outputFluids(Glyoxal.getFluid(1000))
        .EUt(480)
        .duration(100)
        .save(provider);

    //2 CH3COOH + (NH4)2CO3 -> H2O + CO2 + 2 CH3COONH4
    CHEMICAL_RECIPES.recipeBuilder("ammonium_acetate")
        .inputDust(AmmoniumCarbonate, 14)
        .inputFluids(AceticAcid.getFluid(2000))
        .outputFluids(CarbonDioxide.getFluid(1000))
        .outputFluids(Water.getFluid(1000))
        .outputDust(AmmoniumAcetate, 24)
        .EUt(1920)
        .duration(100)
        .save(provider);

    //C7H8 + Cl -> C7H7Cl + H
    CHEMICAL_RECIPES.recipeBuilder("benzyl_chloride")
        .inputFluids(Toluene.getFluid(1000))
        .inputFluids(Chlorine.getFluid(1000))
        .notConsumable(UVA_HALIDE_LAMP)
        .outputFluids(BenzylChloride.getFluid(1000))
        .outputFluids(Hydrogen.getFluid(1000))
        .EUt(480)
        .duration(100)
        .save(provider);

    //6 CH2O + 4 NH3 -> C6H12N4 + 6 H2O
    CHEMICAL_RECIPES.recipeBuilder("hexamethylenetetramine")
        .inputFluids(Formaldehyde.getFluid(6000))
        .inputFluids(Ammonia.getFluid(4000))
        .circuitMeta(2)
        .outputDust(Hexamethylenetetramine, 22)
        .outputFluids(Water.getFluid(6000))
        .EUt(480)
        .duration(100)
        .save(provider);

    //6 C7H9N + 3 (CHO)2 + CH3CN (not consumed) -> C48N6H48 + 6 H2O
    CHEMICAL_RECIPES.recipeBuilder("hexabenzylhexaazaisowurtzitane")
        .inputFluids(Glyoxal.getFluid(3000))
        .inputFluids(Benzylamine.getFluid(6000))
        .notConsumableDust(Acetonitrile)
        .outputDust(Hexabenzylhexaazaisowurtzitane)
        .outputFluids(Water.getFluid(6000))
        .EUt(7680)
        .duration(100)
        .save(provider);

    CHEMICAL_RECIPES.recipeBuilder("pdc_catalyst")
        .inputDust(PalladiumChloride)
        .inputDust(Carbon)
        .inputFluids(HydrochloricAcid.getFluid(1000))
        .inputFluids(Formaldehyde.getFluid(1000))
        .outputDust(PdCCatalyst)
        .EUt(1920)
        .duration(100)
        .save(provider);

    //BF3 + HF + HNO3 -> NO2BF4 + H2O
    CHEMICAL_RECIPES.recipeBuilder("nitronium_tetrafluoroborate")
        .inputFluids(BoronFluoride.getFluid(1000))
        .inputFluids(HydrofluoricAcid.getFluid(1000))
        .inputFluids(NitricAcid.getFluid(1000))
        .outputDust(NitroniumTetrafluoroborate, 8)
        .outputFluids(Water.getFluid(1000))
        .EUt(1920)
        .duration(100)
        .save(provider);

    //BF3 + HF + NO2 -> NOBF4 + HNO3
    CHEMICAL_RECIPES.recipeBuilder("nitrosonium_tetrafluoroborate")
        .inputFluids(BoronFluoride.getFluid(1000))
        .inputFluids(HydrofluoricAcid.getFluid(1000))
        .inputFluids(NitrogenDioxide.getFluid(2000))
        .outputDust(NitrosoniumTetrafluoroborate, 7)
        .outputFluids(NitricAcid.getFluid(1000))
        .EUt(480)
        .duration(100)
        .save(provider);

    CHEMICAL_RECIPES.recipeBuilder("hexanitro_hexaazaisowurtzitane")
        .inputDust(CrudeHexanitroHexaazaisowurtzitane)
        .inputFluids(Ethylenediamine.getFluid(1000))
        .inputDust(SilicaGel)
        .outputDust(HexanitroHexaazaisowurtzitane, 8)
        .EUt(1920)
        .duration(100)
        .save(provider);

    // HBF4 + 3H2O -> 4HF + H3BO3
    CHEMICAL_RECIPES.recipeBuilder("tetrafluoroboric_acid_decomposition")
        .inputFluids(TetrafluoroboricAcid.getFluid(1000))
        .inputFluids(Water.getFluid(3000))
        .outputFluids(HydrofluoricAcid.getFluid(4000))
        .outputFluids(BoricAcid.getFluid(1000))
        .EUt(120)
        .duration(100)
        .save(provider);

    // CH4 + H2O + N -> NH4C(H2O)
    CHEMICAL_RECIPES.recipeBuilder("nitrogen_steam_methane_to_rich_nitrogen_mix").duration(60).EUt(120)
        .notConsumable(ISGTagPrefix.CATALYST, NiAlOCatalyst)
        .inputFluids(Methane.getFluid(1000))
        .inputFluids(Steam.getFluid(960))
        .inputFluids(Nitrogen.getFluid(1000))
        .outputFluids(RichNitrogenMix.getFluid(5000))
        .save(provider);

    // Step 3
    // NH4C(H2O)2 + H2O + C2H7NO -> [C2H7NO + 0.5CO2 + 0.5H2O] + [0.5H2O + NH4 + H4]
    CHEMICAL_RECIPES.recipeBuilder("water_oxidised_nitrogen_mix_ethanolamine_to_purified_nitrogen_mix_carbonated_ethanolamine").duration(120).EUt(120)
        .inputFluids(Water.getFluid(1000))
        .inputFluids(OxidisedNitrogenMix.getFluid(1000))
        .inputFluids(Ethanolamine.getFluid(1000))
        .outputFluids(PurifiedNitrogenMix.getFluid(1000))
        .outputFluids(CarbonatedEthanolamine.getFluid(2000))
        .save(provider);

    // Step 4
    // [NH4 + H4] -> [NH4]
    CHEMICAL_RECIPES.recipeBuilder("purified_nitrogen_mix_magnetite_to_ammonia_rich_mix").duration(240).EUt(120)
        .inputFluids(PurifiedNitrogenMix.getFluid(2000))
        .notConsumableDust(Magnetite)
        .outputFluids(AmmoniaRichMix.getFluid(2000))
        .save(provider);
  }

  private static void recipesLargeChemical(Consumer<FinishedRecipe> provider) {
    // LiAlH4 + C4H6O4 -> C4H6O2 + Li + Al + 2H2O
    LARGE_CHEMICAL_RECIPES.recipeBuilder("succinaldehyde").duration(180).EUt(VHA[LuV])
        .inputDust(LithiumAluminiumHydride, 4)
        .inputDust(SuccinicAcid, 14)
        .outputFluids(Succinaldehyde.getFluid(1000))
        .outputDust(Lithium)
        .outputDust(Aluminium)
        .outputFluids(Water.getFluid(2000))
        .save(provider);

    // 6 H2O + 2 HCl + 2 AgBF4 + 8 C6H5Na + 2C8H20NBr + 2 AgClO4 + 3 (C5H5)2Cl2Ti + 6 C10H7F2N -> 4AgCl + 2NaBr + 6H2ONaCl + [3 (C5H5)2(C10H6F2N)2Ti + 2 (C6H5)4NBF4 + 8 C2H5OH]
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

    // Ag2O + 2NaClO4 + HCl -> 2AgClO4 + Na2O + dil.HCl
    LARGE_CHEMICAL_RECIPES.recipeBuilder("silver_perchlorate")
        .inputDust(SilverOxide, 3)
        .inputDust(SodiumPerchlorate, 12)
        .inputFluids(HydrochloricAcid.getFluid(1000))
        .outputDust(SilverPerchlorate, 12)
        .outputDust(SodiumOxide, 3)
        .outputFluids(DilutedHydrochloricAcid.getFluid(1000))
        .duration(350).EUt(VA[HV]).save(provider);

    LARGE_CHEMICAL_RECIPES.recipeBuilder("bismuth_nitrate_soluton_from_bismuth_germanate")
        .inputFluids(BismuthNitrateSoluton.getFluid(4000))
        .inputDust(GermaniumOxide, 3)
        .notConsumable(LOW_FREQUENCY_LASER.asItem())
        .outputItems(BismuthGermanate, 33)
        .outputDust(Potash, 18)
        .outputFluids(NitrogenDioxide.getFluid(12000))
        .outputFluids(Water.getFluid(4000))
        .duration(80).EUt(500000).save(provider);

    // 3 [3 H3PO4 + HCl] + 3 HCl + SiO2 + Na2CO3 -> 9 H3PO4 + [Na2SiCl6 + 0.25 Fe2O3] + CO2 + 3 H2O (voided)
    LARGE_CHEMICAL_RECIPES.recipeBuilder("phosphorous_arsenic_solution").duration(260).EUt(500)
        .inputDust(SodaAsh, 6)
        .inputFluids(ApatiteAcidicLeach.getFluid(12000))
        .inputDust(SiliconDioxide, 3)
        .inputFluids(HydrochloricAcid.getFluid(1000))
        .outputFluids(PhosphorousArsenicSolution.getFluid(3000))
        .inputDust(ApatiteSolidResidue, 11)
        .outputFluids(CarbonDioxide.getFluid(1000))
        .save(provider);

    // 3 [3 H3PO4 + HF] + 3 HF + SiO2 + Na2CO3 -> 9 H3PO4? + [Na2SiF6 + 0.25 Fe2O3] + CO2 + 3 H2O (voided)
    LARGE_CHEMICAL_RECIPES.recipeBuilder("phosphorous_arsenic_solution_from_fluoroapatite").duration(260).EUt(500)
        .inputDust(SodaAsh, 6)
        .inputFluids(FluoroapatiteAcidicLeach.getFluid(12000))
        .inputDust(SiliconDioxide, 3)
        .inputFluids(HydrochloricAcid.getFluid(1000))
        .outputFluids(PhosphorousArsenicSolution.getFluid(3000))
        .outputItems(FluoroapatiteSolidResidue, 11)
        .outputFluids(CarbonDioxide.getFluid(1000))
        .save(provider);

    // 15H3PO4? + 2 Na2S + 2 NaOH -> 2 Na3AsO4 + 2 CdS + 15H3PO4
    LARGE_CHEMICAL_RECIPES.recipeBuilder("cadmium_sulfide_sodium_arsenate").duration(220).EUt(500)
        .inputFluids(PhosphorousArsenicSolution.getFluid(12000))
        .inputDust(SodiumSulfide, 6)
        .inputDust(SodiumHydroxide, 6)
        .outputDust(SodiumArsenate, 16)
        .outputDust(CadmiumSulfide, 4)
        .outputFluids(PhosphoricAcid.getFluid(12000))
        .save(provider);

    // 2Na3AsO4 + 5 H2SO4 + 4 NaI -> As2O3 + 5 Na2SO4(H2O) + 4 I
    LARGE_CHEMICAL_RECIPES.recipeBuilder("sodium_sulfate_solution").duration(280).EUt(1100)
        .inputDust(SodiumArsenate, 16)
        .inputFluids(SulfuricAcid.getFluid(5000))
        .inputDust(SodiumIodide, 8)
        .outputDust(ArsenicTrioxide, 5)
        .outputFluids(SodiumSulfateSolution.getFluid(5000))
        .outputDust(Iodine, 4)
        .save(provider);

//2C7H7(NO2) + 2H2SO4 + 2NaClO + 12 H -> C14H14N2O6S2 + 2NaCl + 8 H2O
    LARGE_CHEMICAL_RECIPES.recipeBuilder("diaminostilbenedisulfonic_acid").duration(340).EUt(1240)
        .notConsumable(dust, Zinc)
        .inputDust(SodiumHypochlorite, 3)
        .inputFluids(Nitrotoluene.getFluid(1000))
        .inputFluids(SulfuricAcid.getFluid(2000))
        .outputDust(DiaminostilbenedisulfonicAcid, 19)
        .outputDust(Salt, 2)
        .outputFluids(Water.getFluid(4000))
        .save(provider);

    // 4 C6H7N + 2 C6H5NO2 + HCl + 2 H2SO4 + 2 NaOH -> C36H26N5ClNa2S2O6 + 8 H2O + NH3
    LARGE_CHEMICAL_RECIPES.recipeBuilder("nigrosin").duration(200).EUt(1400)
        .inputFluids(NitroBenzene.getFluid(1000))
        .inputFluids(Aniline.getFluid(2000))
        .inputFluids(HydrochloricAcid.getFluid(500))
        .inputFluids(SulfuricAcid.getFluid(1000))
        .inputDust(SodiumHydroxide, 3)
        .notConsumable(dust, Copper)
        .outputDust(Nigrosin, 39)
        .outputFluids(Water.getFluid(4000))
        .outputFluids(Ammonia.getFluid(500))
        .save(provider);

    //C10H8 + HNO3 + H2SO4 + 6 H -> C10H9N + H2SO4 + 3 H2O
    LARGE_CHEMICAL_RECIPES.recipeBuilder("naphthylamine").duration(230).EUt(1400)
        .inputFluids(NitrationMixture.getFluid(2000))
        .inputFluids(Naphthalene.getFluid(1000))
        .inputFluids(Hydrogen.getFluid(6000))
        .outputFluids(Naphthylamine.getFluid(1000))
        .outputFluids(SulfuricAcid.getFluid(1000))
        .outputFluids(Water.getFluid(3000))
        .save(provider);

    // C6H6NNaO3S + C10H9N + HCl + NaNO2 -> NaCl + C16H12N3NaO3S + 2 H2O
    LARGE_CHEMICAL_RECIPES.recipeBuilder("direct_brown").duration(270).EUt(1800)
        .inputDust(SodiumSulfanilate, 18)
        .inputFluids(Naphthylamine.getFluid(1000))
        .inputFluids(HydrochloricAcid.getFluid(1000))
        .inputDust(SodiumNitrite, 4)
        .outputDust(Salt, 2)
        .outputFluids(Water.getFluid(2000))
        .outputDust(DirectBrown, 36)
        .save(provider);

    // 4 NaOH + 2 H2SO4 + 2 C4H6O4 + 2 C6H5NH2 + O -> 7 H2O + C20H16N2O4 + 2 [Na2SO4 + H2O]
    LARGE_CHEMICAL_RECIPES.recipeBuilder("dianilineterephthalic_acid").duration(260).EUt(1600)
        .inputDust(SodiumHydroxide, 12)
        .inputFluids(SulfuricAcid.getFluid(2000))
        .inputDust(SuccinicAcid, 28)
        .inputFluids(Aniline.getFluid(2000))
        .inputFluids(Oxygen.getFluid(1000))
        .notConsumableFluid(Ethanol.getFluid(1000))
        .outputFluids(Water.getFluid(7000))
        .outputFluids(SodiumSulfateSolution.getFluid(2000))
        .outputDust(DianilineterephthalicAcid, 42)
        .save(provider);

    // 2 C10H11NO2 + C12H10Cl2N2 + 2 HCl + 2 NaNO2 -> 2NaCl + C32H26Cl2N6O4 + 4H2O
    LARGE_CHEMICAL_RECIPES.recipeBuilder("diarylide_yellow").duration(270).EUt(1800)
        .inputFluids(Acetoacetanilide.getFluid(1000))
        .inputFluids(Dichlorobenzidine.getFluid(500))
        .inputFluids(HydrochloricAcid.getFluid(1000))
        .inputDust(SodiumNitrite, 4)
        .outputDust(Salt, 2)
        .outputDust(DiarylideYellow, 35)
        .outputFluids(Water.getFluid(2000))
        .save(provider);

    //C14H10 + K2Cr2O7 + H2SO4 -> C14H8O2 + Cr2O3 + K2SO4 + 2 H2O
    LARGE_CHEMICAL_RECIPES.recipeBuilder("anthraquinone_from_anthracene").duration(200).EUt(1600)
        .inputFluids(SulfuricAcid.getFluid(1000))
        .inputFluids(Anthracene.getFluid(1000))
        .inputDust(PotassiumDichromate, 11)
        .outputDust(ChromiumIIIOxide, 5)
        .outputDust(Anthraquinone, 24)
        .outputDust(PotassiumSulfate, 7)
        .outputFluids(Water.getFluid(2000))
        .save(provider);

    //C14H8O4 + 2 C7H9N + 2 H2SO4 + 2 NaOH -> C28H20N2Na2O8S2 + 6 H2O
    LARGE_CHEMICAL_RECIPES.recipeBuilder("alizarine_cyanine_green").duration(270).EUt(1800)
        .inputFluids(Quinizarin.getFluid(1000))
        .inputFluids(Toluidine.getFluid(2000))
        .inputFluids(SulfuricAcid.getFluid(2000))
        .inputDust(SodiumHydroxide, 6)
        .notConsumableFluid(BoricAcid.getFluid(1000))
        .notConsumableDust(TinChloride)
        .outputDust(AlizarineCyanineGreen, 31)
        .outputFluids(Water.getFluid(6000))
        .save(provider);

    //C14H8O2 + SO3 + H2O2 + NH3 -> C14H9NO2 + H2SO4 + H2O
    LARGE_CHEMICAL_RECIPES.recipeBuilder("aminoanthraquinone").duration(210).EUt(1250)
        .notConsumableFluid(Mercury.getFluid(10))
        .inputFluids(SulfuricAcid.getFluid(1000))
        .inputFluids(SulfurTrioxide.getFluid(1000))
        .inputFluids(HydrogenPeroxide.getFluid(1000))
        .inputFluids(Ammonia.getFluid(1000))
        .inputDust(Anthraquinone, 24)
        .outputDust(Aminoanthraquinone, 26)
        .outputFluids(DilutedSulfuricAcid.getFluid(3000))
        .save(provider);

    //C6H7N + 3 C7H9N + 2 KMnO4 + 7 HCl -> C27H25N4Cl + 2 KCl + 8 H2O + 2 MnCl2
    LARGE_CHEMICAL_RECIPES.recipeBuilder("mauveine_from_permanganate").duration(140).EUt(1340)
        .inputDust(PotassiumPermanganate, 6)
        .inputFluids(Aniline.getFluid(500))
        .inputFluids(Toluidine.getFluid(1500))
        .inputFluids(HydrochloricAcid.getFluid(3500))
        .outputFluids(Water.getFluid(4000))
        .outputDust(RockSalt, 2)
        .outputDust(CopperChloride, 3)
        .outputDust(Mauveine, 28)
        .save(provider);

    //3 C6H7N + 9 C7H9N + 5 K2Cr2O7 + 3 HCl -> 3 C27H25N4Cl + 10 KOH + 10 H2O + 5 Cr2O3
    LARGE_CHEMICAL_RECIPES.recipeBuilder("mauveine_from_dichromate").duration(140).EUt(1340)
        .notConsumable(dust, Palladium)
        .inputDust(PotassiumDichromate, 11)
        .inputFluids(Aniline.getFluid(600))
        .inputFluids(Toluidine.getFluid(1800))
        .inputFluids(HydrochloricAcid.getFluid(600))
        .outputFluids(Water.getFluid(2000))
        .outputFluids(PotassiumHydroxide.getFluid(2000))
        .outputDust(ChromiumIIIOxide, 5)
        .outputDust(Mauveine, 34)
        .save(provider);

    //2 CH2O + 2 HCN + 2 C6H7N + 2O -> C16H10N2O2 + 2 H2O + 2 NH3
    LARGE_CHEMICAL_RECIPES.recipeBuilder("indigo").duration(240).EUt(1100)
        .inputFluids(Formaldehyde.getFluid(1000))
        .inputFluids(HydrogenCyanide.getFluid(1000))
        .inputFluids(Aniline.getFluid(1000))
        .inputFluids(Oxygen.getFluid(1000))
        .notConsumableFluid(PotassiumHydroxide.getFluid(10))
        .notConsumableDust(SodiumAzanide)
        .notConsumable(dust, SodiumHydroxide)
        .outputDust(Indigo, 15)
        .outputFluids(Water.getFluid(1000))
        .outputFluids(Ammonia.getFluid(1000))
        .save(provider);

    //C20H12O5 + 4 I + 2 NaOH -> C20H6I4Na2O5 + 4 H + 2 H2O
    LARGE_CHEMICAL_RECIPES.recipeBuilder("erythrosine").duration(150).EUt(750)
        .inputDust(Iodine, 4)
        .inputDust(SodiumHydroxide, 6)
        .inputDust(Fluorescein, 37)
        .outputDust(Erythrosine, 37)
        .outputFluids(Hydrogen.getFluid(4000))
        .outputFluids(Water.getFluid(2000))
        .save(provider);

    // SnCl2 + 3CH4 + O -> C3H9SnCl + HCl(H2O)
    LARGE_CHEMICAL_RECIPES.recipeBuilder("tin_chloride_methane_xygen_to_trimethyltin_chloride_diluted_hydrochloric_acid").duration(260).EUt(1920)
        .inputDust(TinChloride, 3)
        .notConsumable(dust, Magnesium)
        .notConsumable(dust, Iodine)
        .inputFluids(Methane.getFluid(3000))
        .inputFluids(Oxygen.getFluid(1000))
        .outputFluids(TrimethyltinChloride.getFluid(1000))
        .outputFluids(DilutedHydrochloricAcid.getFluid(2000))
        .save(provider);

    // CH2O + 2C2H4O + NH3 -> C5H5N + 3H2O + 2H
    LARGE_CHEMICAL_RECIPES.recipeBuilder("formaldehyde_acetaldehyde_ammonia_to_pyridine_hydrogen").duration(240).EUt(1920)
        .notConsumable(dust, ThalliumChloride)
        .circuitMeta(1)
        .inputFluids(Formaldehyde.getFluid(1000))
        .inputFluids(Acetaldehyde.getFluid(2000))
        .inputFluids(Ammonia.getFluid(1000))
        .outputFluids(Pyridine.getFluid(1000))
        .outputFluids(Water.getFluid(3000))
        .outputFluids(Hydrogen.getFluid(2000))
        .save(provider);

    // C8H12 + K2PtCl4 -> C8H12Cl2Pt + 2KCl
    LARGE_CHEMICAL_RECIPES.recipeBuilder("dichlorocycloctadieneplatinium").duration(130).EUt(480)
        .inputFluids(Cyclooctadiene.getFluid(1000))
        .inputDust(PotassiumTetrachloroplatinate, 7)
        .outputDust(Dichlorocycloctadieneplatinium, 23)
        .outputDust(RockSalt, 4)
        .save(provider);

    LARGE_CHEMICAL_RECIPES.recipeBuilder("fullerene_doped_nanotubes").duration(290).EUt(320000)
        .inputFluids(Cycloparaphenylene.getFluid(3600))
        .inputFluids(Methane.getFluid(14400))
        .inputDust(Fullerene)
        .notConsumable(plate, Rhenium)
        .outputFluids(FullereneDopedNanotubes.getFluid(18000))
        .save(provider);

    //C28N6H32O4 + 6 NOBF4 + 2 H2O -> C14N8H18O6 + 2 C7H6O + 4 NO + 6 HBF4
    LARGE_CHEMICAL_RECIPES.recipeBuilder("tetraacetyldinitrosohexaazaisowurtzitane")
        .inputDust(DibenzylTetraacetylhexaazaisowurtzitane)
        .inputDust(NitrosoniumTetrafluoroborate, 42)
        .inputFluids(Water.getFluid(2000))
        .outputDust(Tetraacetyldinitrosohexaazaisowurtzitane)
        .outputFluids(TetrafluoroboricAcid.getFluid(6000))
        .outputFluids(NitricOxide.getFluid(4000))
        .outputFluids(Benzaldehyde.getFluid(2000))
        .EUt(1920)
        .duration(100)
        .save(provider);

    //C14N8H18O6 + 6 NO2BF4 + 4 H2O -> C6H6N12O12 + 2 NOBF4 + 4 CH3COOH + 4 HBF4
    LARGE_CHEMICAL_RECIPES.recipeBuilder("crude_hexanitro_hexaazaisowurtzitane")
        .inputDust(Tetraacetyldinitrosohexaazaisowurtzitane)
        .inputDust(NitroniumTetrafluoroborate, 48)
        .inputFluids(Water.getFluid(4000))
        .outputDust(CrudeHexanitroHexaazaisowurtzitane)
        .outputDust(NitrosoniumTetrafluoroborate, 14)
        .outputFluids(TetrafluoroboricAcid.getFluid(4000))
        .outputFluids(AceticAcid.getFluid(4000))
        .EUt(491520)
        .duration(100)
        .save(provider);


    //C7H7Cl + C6H12N4 + 2 HCl + 6 H2O -> C7H9N + 6 CH2O + 3 NH4Cl
    LARGE_CHEMICAL_RECIPES.recipeBuilder("benzylamine")
        .inputFluids(BenzylChloride.getFluid(1000))
        .inputDust(Hexamethylenetetramine, 22)
        .inputFluids(HydrochloricAcid.getFluid(2000))
        .inputFluids(Water.getFluid(6000))
        .outputFluids(Benzylamine.getFluid(1000))
        .outputFluids(AmmoniumChloride.getFluid(3000))
        .outputFluids(Formaldehyde.getFluid(6000))
        .EUt(7680)
        .duration(200)
        .save(provider);


    // 4C12H8I2 + 2C8H12Cl2Pt + 8C + 4AgBF4 + 4C3H9SnCl -> 10C6H4 + 4BF3 + 3C8H16 + 4HF + 2PtCl2 + 8I + 4AgCl + 4Sn
    CHEMICAL_PLANT_RECIPES.recipeBuilder("cycloparaphenylene_boron_fluoride_oct1ene").duration(460).EUt(491520)
        .notConsumableDust(Bipyridine)
        .notConsumableDust(PalladiumBisDibenzylidieneacetone)
        .inputDust(Diiodobiphenyl, 44)
        .inputDust(Dichlorocycloctadieneplatinium, 46)
        .inputDust(Carbon, 8)
        .inputFluids(Silvertetrafluoroborate.getFluid(4000))
        .inputFluids(TrimethyltinChloride.getFluid(4000))
        .outputFluids(Cycloparaphenylene.getFluid(10000))
        .outputFluids(BoronFluoride.getFluid(4000))
        .outputFluids(Oct1ene.getFluid(3000))
        .outputFluids(HydrofluoricAcid.getFluid(4000))
        .outputDust(PlatinumRaw, 6)
        .outputDust(Iodine, 8)
        .outputDust(SilverChloride, 8)
        .outputDust(Tin, 4)
        .save(provider);

    //C48N6H48 + 4C6H7NO4 + 8H -> 4C7H8 + C28N6H32O4 + 4C4H5NO2 + 4O
    CHEMICAL_PLANT_RECIPES.recipeBuilder("dibenzyl_tetraacetylhexaazaisowurtzitane")
        .inputDust(Hexabenzylhexaazaisowurtzitane, 102)
        .inputDust(SuccinimidylAcetate, 72)
        .inputFluids(Hydrogen.getFluid(8000))
        .inputItems(ISGTagPrefix.CATALYST, PdCCatalyst)
        .notConsumableFluid(Ethylbenzene.getFluid(1000))
        .notConsumableFluid(HydrobromicAcid.getFluid(10000))
        .notConsumableFluid(Dimethylformamide.getFluid(1000))
        .outputDust(DibenzylTetraacetylhexaazaisowurtzitane)
        .outputDust(Succinimide, 48)
        .outputFluids(Toluene.getFluid(4000))
        .outputFluids(Oxygen.getFluid(4000))
        .EUt(122880)
        .duration(120)
        .cleanroom(CleanroomType.CLEANROOM)
        .save(provider);
  }


  private static void testRecipes(Consumer<FinishedRecipe> provider) {
    // Migrated from misc/test recipes.

    // Ba + 2HCl -> BaCl2 + 2H
    CHEMICAL_RECIPES.recipeBuilder("barium_hydrochloric_acid_to_barium_chloride_hydrogen").duration(100).EUt(120)
        .inputDust(Barium)
        .inputFluids(HydrochloricAcid.getFluid(2000))
        .outputDust(BariumChloride, 3)
        .outputFluids(Hydrogen.getFluid(2000))
        .save(provider);


    // BaCl2 + H2SO4 -> BaSO4 + HCl
    CHEMICAL_RECIPES.recipeBuilder("barium_chloride_sulfuric_acid_to_barite_hydrochloric_acid").duration(50).EUt(480)
        .inputDust(BariumChloride, 3)
        .inputFluids(SulfuricAcid.getFluid(1000))
        .outputDust(Barite, 6)
        .outputFluids(HydrochloricAcid.getFluid(2000))
        .save(provider);


    // BaS + H2O + CO2 -> BaCO3 + H2S
    CHEMICAL_RECIPES.recipeBuilder("barium_sulfide_water_carbon_dioxide_to_barium_carbonate_hydrogen_sulfide").duration(280).EUt(30)
        .inputDust(BariumSulfide, 2)
        .inputFluids(Water.getFluid(1000))
        .inputFluids(CarbonDioxide.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, BariumCarbonate, 5))
        .outputFluids(HydrogenSulfide.getFluid(1000))
        .save(provider);


    // BaCO3 -> CO2 + BaO
    CHEMICAL_RECIPES.recipeBuilder("barium_carbonate_to_barium_oxide_carbon_dioxide").duration(100).EUt(30)
        .inputDust(BariumCarbonate, 5)
        .circuitMeta(0)
        .outputItems(ChemicalHelper.get(dust, BariumOxide, 2))
        .outputFluids(CarbonDioxide.getFluid(1000))
        .save(provider);


    // NEW BARIUM-HOLDING ORES

    // BaCa(CO3)2 + H2SO4 -> BaSO4 + (H2O)CaCO3 + CO2
    CHEMICAL_RECIPES.recipeBuilder("barytocalcite_sulfuric_acid_to_barite_calcium_carbonate_solution_carbon_dioxide").duration(100).EUt(30)
        .inputDust(Barytocalcite, 10)
        .inputFluids(SulfuricAcid.getFluid(1000))
        .outputDust(Barite, 6)
        .outputFluids(CalciumCarbonateSolution.getFluid(1000))
        .outputFluids(CarbonDioxide.getFluid(1000))
        .save(provider);


    // NH3 + C3H6 + 3O -> 3H2O + C3H3N
    CHEMICAL_RECIPES.recipeBuilder("ammonia_propene_oxygen_to_water_acrylo_nitrile").duration(100).EUt(120)
        .notConsumable(dust, Platinum)
        .inputFluids(Ammonia.getFluid(1000))
        .inputFluids(Propene.getFluid(1000))
        .inputFluids(Oxygen.getFluid(3000))
        .outputFluids(Water.getFluid(3000))
        .outputFluids(AcryloNitrile.getFluid(1000))
        .save(provider);


    // S + NaCN -> NaSCN
    CHEMICAL_RECIPES.recipeBuilder("sulfur_sodium_cyanide_to_sodium_thiocyanate").duration(100).EUt(120)
        .inputDust(Sulfur)
        .inputFluids(SodiumCyanide.getFluid(1000))
        .outputFluids(SodiumThiocyanate.getFluid(1000))
        .save(provider);


    // NO + C3H3N + NaSCN -> [C3H3N]n(NaSCN) polymerized with Oxygen bond
    CHEMICAL_RECIPES.recipeBuilder("nitric_oxide_acrylo_nitrile_sodium_thiocyanate_to_polyacrylonitrile_solution").duration(160).EUt(30)
        .inputFluids(NitricOxide.getFluid(1000))
        .inputFluids(AcryloNitrile.getFluid(1000))
        .inputFluids(SodiumThiocyanate.getFluid(1000))
        .outputFluids(PolyacrylonitrileSolution.getFluid(1000))
        .save(provider);


    // CH2O2 + CH3OH -> H2O + C2H4O2
    CHEMICAL_RECIPES.recipeBuilder("formic_acid_methanol_to_water_methyl_formate").duration(120).EUt(120)
        .inputFluids(FormicAcid.getFluid(1000))
        .inputFluids(Methanol.getFluid(1000))
        .outputFluids(Water.getFluid(1000))
        .outputFluids(MethylFormate.getFluid(1000))
        .save(provider);


    // C2H4O2 + 2NH3 + 2O -> 2CH3NO(H2O)
    CHEMICAL_RECIPES.recipeBuilder("methyl_formate_ammonia_oxygen_to_wet_formamide").duration(90).EUt(120)
        .inputFluids(MethylFormate.getFluid(1000))
        .inputFluids(Ammonia.getFluid(1000))
        .inputFluids(Oxygen.getFluid(2000))
        .outputFluids(WetFormamide.getFluid(1000))
        .save(provider);


    // NH4NO3 + 2 SO2 + 3 H2O + 2 NH3 = [(NH3OH)2SO4 + (NH4)2SO4]
    LARGE_CHEMICAL_RECIPES.recipeBuilder("ammonium_nitrate_sulfur_dioxide_water_ammonia_to_hydroxylamine_disulfate").duration(120).EUt(120)
        .inputFluids(AmmoniumNitrate.getFluid(1000))
        .inputFluids(SulfurDioxide.getFluid(2000))
        .inputFluids(Water.getFluid(3000))
        .inputFluids(Ammonia.getFluid(2000))
        .outputFluids(HydroxylamineDisulfate.getFluid(2000))
        .save(provider);


    // [(NH3OH)2SO4 + (NH4)2SO4] + 2 NH3 -> 2H3NO + 2 (NH4)2SO4
    CHEMICAL_RECIPES.recipeBuilder("hydroxylamine_disulfate_ammonia_to_hydroxylamine_ammonium_sulfate").duration(180).EUt(120)
        .inputFluids(HydroxylamineDisulfate.getFluid(2000))
        .inputFluids(Ammonia.getFluid(2000))
        .outputFluids(Hydroxylamine.getFluid(2000))
        .outputFluids(AmmoniumSulfate.getFluid(2000))
        .save(provider);


    // CH3NO + H3NO -> H3N2O(CH) + H2O
    CHEMICAL_RECIPES.recipeBuilder("formamide_hydroxylamine_to_amidoxime_water").duration(120).EUt(120)
        .inputFluids(Formamide.getFluid(1000))
        .inputFluids(Hydroxylamine.getFluid(1000))
        .outputFluids(Amidoxime.getFluid(1000))
        .outputFluids(Water.getFluid(1000))
        .save(provider);

    // TODO migrated disabled: unresolved old test symbol `HEAVY_METAL_ABSORBING_YARN`.
    //
    //         CHEMICAL_RECIPES.recipeBuilder("heavy_metal_absorbing_yarn_sea_water_to_uranium_saturated_yarn_salt_water").duration(100).EUt(120)
    //                 .inputItems(HEAVY_METAL_ABSORBING_YARN.asStack())
    //                 .inputFluids(SeaWater.getFluid(16000))
    //                 .outputItems(URANIUM_SATURATED_YARN.asStack())
    //                 .outputFluids(SaltWater.getFluid(16000))
    //                 .save(provider);
    //
    //         CHEMICAL_RECIPES.recipeBuilder("uranium_saturated_yarn_nitric_acid_to_heavy_metal_absorbing_yarn_pure_uranyl_nitrate_solution").duration(200).EUt(1920)
    //                 .inputItems(URANIUM_SATURATED_YARN.asStack())
    //                 .inputFluids(NitricAcid.getFluid(100))
    //                 .chancedOutput(HEAVY_METAL_ABSORBING_YARN.asStack(), 9900)
    //                 .outputFluids(PureUranylNitrateSolution.getFluid(100))
    //                 .save(provider);
    //
    //

    CHEMICAL_RECIPES.recipeBuilder("acidic_brominated_brine_sulfur_dioxide_water_to_brine_sulfuric_bromine_solution").duration(200).EUt(480)
        .inputFluids(AcidicBrominatedBrine.getFluid(1000))
        .inputFluids(SulfurDioxide.getFluid(1000))
        .inputFluids(Water.getFluid(1000))
        .outputFluids(Brine.getFluid(1000))
        .outputFluids(SulfuricBromineSolution.getFluid(1000))
        .save(provider);

    // TODO migrated disabled: unresolved old test symbols.
    //     // TODO migrated disabled: unresolved old test symbols.
    //     //     // TODO migrated disabled: unresolved old test symbol `BORON_RETAINING_YARN`.
    //     //     //
    //     //     //         CHEMICAL_RECIPES.recipeBuilder("boron_retaining_yarn_potassium_free_brine_to_boron_saturated_yarn_boron_free_solution").duration(150).EUt(480)
    //     //     //                 .inputItems(BORON_RETAINING_YARN.asStack())
    //     //     //                 .inputFluids(PotassiumFreeBrine.getFluid(1000))
    //     //     //                 .outputItems(BORON_SATURATED_YARN.asStack())
    //     //     //                 .outputFluids(BoronFreeSolution.getFluid(1000))
    //     //     //                 .save(provider);
    //     //     //
    //     //     //
    //     //
    //     // CHEMICAL_RECIPES.recipeBuilder("lithium_sieve_sodium_lithium_solution_to_salt_water_lithium_saturated_lithium_sieve").duration(150).EUt(480)
    //     //                 .inputItems(LITHIUM_SIEVE.asStack())
    //     //                 .inputFluids(SodiumLithiumSolution.getFluid(1000))
    //     //                 .outputFluids(SaltWater.getFluid(1000))
    //     //                 .outputItems(LITHIUM_SATURATED_LITHIUM_SIEVE.asStack())
    //     //                 .save(provider);
    //
    //
    //         CHEMICAL_RECIPES.recipeBuilder("lithium_saturated_lithium_sieve_hydrochloric_acid_to_lithium_sieve_lithium_chloride_solution").duration(320).EUt(480)
    //                 .inputItems(LITHIUM_SATURATED_LITHIUM_SIEVE.asStack())
    //                 .inputFluids(HydrochloricAcid.getFluid(1000))
    //                 .chancedOutput(LITHIUM_SIEVE.asStack(), 9000)
    //                 .outputFluids(LithiumChlorideSolution.getFluid(1000))
    //                 .save(provider);


    // Al + 3H -> AlH3
    CHEMICAL_RECIPES.recipeBuilder("aluminium_hydrogen_to_aluminium_hydride").duration(80).EUt(30)
        .inputDust(Aluminium)
        .inputFluids(Hydrogen.getFluid(3000))
        .outputItems(ChemicalHelper.get(dust, AluminiumHydride, 4))
        .save(provider);


    // LiCl + NaAlH4 + H2O -> NaCl(H2O) + LiAlH4
    CHEMICAL_RECIPES.recipeBuilder("lithium_chloride_sodium_aluminium_hydride_water_to_lithium_aluminium_hydride_salt_water").duration(210).EUt(3000)
        .inputDust(LithiumChloride, 2)
        .inputDust(SodiumAluminiumHydride, 6)
        .inputFluids(Water.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, LithiumAluminiumHydride, 6))
        .outputFluids(SaltWater.getFluid(1000))
        .save(provider);


    // Na + NH3 -> H + NaNH2
    CHEMICAL_RECIPES.recipeBuilder("sodium_ammonia_to_hydrogen_sodium_azanide").duration(110).EUt(120)
        .inputDust(Sodium)
        .inputFluids(Ammonia.getFluid(1000))
        .circuitMeta(0)
        .outputFluids(Hydrogen.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, SodiumAzanide, 4))
        .save(provider);


    // NH4NO3 -> N2O + 2H2O
    CHEMICAL_RECIPES.recipeBuilder("ammonium_nitrate_to_nitrous_oxide_water").duration(100).EUt(30)
        .inputFluids(AmmoniumNitrate.getFluid(1000))
        .circuitMeta(1)
        .outputFluids(NitrousOxide.getFluid(1000))
        .outputFluids(Water.getFluid(2000))
        .save(provider);


    // 2NaNH2 + N2O -> NH3 + NaOH + NaN3
    LARGE_CHEMICAL_RECIPES.recipeBuilder("sodium_azanide_nitrous_oxide_to_ammonia_sodium_hydroxide_sodium_azide").duration(230).EUt(120)
        .inputDust(SodiumAzanide, 8)
        .inputFluids(NitrousOxide.getFluid(1000))
        .outputFluids(Ammonia.getFluid(1000))
        .outputDust(SodiumHydroxide, 3)
        .outputItems(ChemicalHelper.get(dust, SodiumAzide, 4))
        .save(provider);


    // C6H12O6 + LiAlH4 + NaN3 + H2SO4 + H2O -> LiOH(H2O) + C6H11O5NH2 + AlH3 + NaHSO4 + 2 N
    LARGE_CHEMICAL_RECIPES.recipeBuilder("glucose_lithium_aluminium_hydride_sodium_azide_sulfuric_acid_water_to_nitrogen_lithium_hydroxide_solution_glucosamine_aluminium_hydride_sodium_bisulfate").duration(250).EUt(120)
        .inputDust(Glucose, 24)
        .inputDust(LithiumAluminiumHydride, 6)
        .inputDust(SodiumAzide, 4)
        .inputFluids(SulfuricAcid.getFluid(1000))
        .inputFluids(Water.getFluid(1000))
        .outputFluids(Nitrogen.getFluid(2000))
        .outputFluids(LithiumHydroxideSolution.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, Glucosamine, 25))
        .outputItems(ChemicalHelper.get(dust, AluminiumHydride, 4))
        .outputDust(SodiumBisulfate, 7)
        .save(provider);


    // AlH3 + 3H2O -> Al(OH)3 + 6H
    CHEMICAL_RECIPES.recipeBuilder("aluminium_hydride_water_to_aluminium_hydroxide_hydrogen").duration(100).EUt(30)
        .inputDust(AluminiumHydride, 4)
        .inputFluids(Water.getFluid(3000))
        .outputItems(ChemicalHelper.get(dust, AluminiumHydroxide, 7))
        .outputFluids(Hydrogen.getFluid(6000))
        .save(provider);


    // 2NaOH + H2SO4 + HBO2 -> H3BO3 + Na2SO4(H2O)
    // TODO migrated disabled: unresolved old test symbol `BORON_RETAINING_YARN`.
    //         CHEMICAL_RECIPES.recipeBuilder("boron_saturated_yarn_sodium_hydroxide_sulfuric_acid_to_boric_acid_sodium_sulfate_solution_boron_retaining_yarn").duration(170).EUt(480)
    //                 .inputItems(BORON_SATURATED_YARN.asStack())
    //                 .inputDust(SodiumHydroxide, 6)
    //                 .inputFluids(SulfuricAcid.getFluid(1000))
    //                 .outputFluids(BoricAcid.getFluid(1000))
    //                 .outputFluids(SodiumSulfateSolution.getFluid(1000))
    //                 .chancedOutput(BORON_RETAINING_YARN.asStack(), 9900)
    //                 .save(provider);
    //
    //
    //

// B2O3 + 6HF -> 3H2O + 2BF3
    CHEMICAL_RECIPES.recipeBuilder("boron_oxide_hydrofluoric_acid_to_water_boron_fluoride").duration(160).EUt(120)
        .inputDust(BoronOxide, 5)
        .inputFluids(HydrofluoricAcid.getFluid(6000))
        .outputFluids(Water.getFluid(3000))
        .outputFluids(BoronFluoride.getFluid(2000))
        .save(provider);


    // 4BF3 + 3LiAlH4 -> 2B2H6 + 3AlF4Li
    CHEMICAL_RECIPES.recipeBuilder("boron_fluoride_lithium_aluminium_hydride_to_diborane_lithium_aluminium_fluoride").duration(80).EUt(30)
        .inputFluids(BoronFluoride.getFluid(4000))
        .inputDust(LithiumAluminiumHydride, 18)
        .outputFluids(Diborane.getFluid(2000))
        .outputItems(ChemicalHelper.get(dust, LithiumAluminiumFluoride, 18))
        .save(provider);


    // 2AlF3 + 3H2O -> Al2O3 + 6HF
    CHEMICAL_RECIPES.recipeBuilder("aluminium_trifluoride_water_to_alumina_hydrofluoric_acid").duration(140).EUt(120)
        .inputDust(AluminiumTrifluoride, 8)
        .inputFluids(Water.getFluid(3000))
        .outputItems(ChemicalHelper.get(dust, Alumina, 5))
        .outputFluids(HydrofluoricAcid.getFluid(6000))
        .save(provider);


    // Na + H -> NaH
    CHEMICAL_RECIPES.recipeBuilder("sodium_hydrogen_to_sodium_hydride").duration(140).EUt(30)
        .inputDust(Sodium)
        .inputFluids(Hydrogen.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, SodiumHydride, 2))
        .save(provider);


    // 3C + 2HCl + 2CH3NH2 + CS2 -> 2C3H6ClNS
    CHEMICAL_RECIPES.recipeBuilder("carbon_hydrochloric_acid_methylamine_carbon_sulfide_to_dimethylthiocarbamoil_chloride_oxygen").duration(200).EUt(480)
        .inputDust(Carbon, 3)
        .inputFluids(HydrochloricAcid.getFluid(2000))
        .inputFluids(Methylamine.getFluid(2000))
        .inputFluids(CarbonSulfide.getFluid(1000))
        .outputFluids(DimethylthiocarbamoilChloride.getFluid(2000))
        .outputFluids(Oxygen.getFluid(6000))
        .save(provider);


    // C6H6O2 + (CH3)2NCClS  + LiAlH4 -> C6H6OS + (CH3)2NCHO + LiCl + AlH3
    LARGE_CHEMICAL_RECIPES.recipeBuilder("dimethylformamide_resorcinol_dimethylthiocarbamoil_chloride_lithium_aluminium_hydride_to_mercaptophenol_dimethylformamide_lithium_chloride_aluminium_hydride").duration(180).EUt(500)
        .notConsumable(dust, Palladium)
        .notConsumable(ChemicalHelper.get(dust, SodiumHydride))
        .inputFluids(Dimethylformamide.getFluid(500))
        .inputFluids(Resorcinol.getFluid(1000))
        .inputFluids(DimethylthiocarbamoilChloride.getFluid(1000))
        .inputDust(LithiumAluminiumHydride, 6)
        .outputFluids(Mercaptophenol.getFluid(1000))
        .outputFluids(Dimethylformamide.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, LithiumChloride, 2))
        .outputItems(ChemicalHelper.get(dust, AluminiumHydride, 4))
        .save(provider);


    //(CH3)2NH + HCOOCH3 -> (CH3)2NCHO + CH3OH
    CHEMICAL_RECIPES.recipeBuilder("dimethylamine_methyl_formate_to_dimethylformamide_methanol").duration(100).EUt(120)
        .inputFluids(Dimethylamine.getFluid(1000))
        .inputFluids(MethylFormate.getFluid(1000))
        .outputFluids(Dimethylformamide.getFluid(1000))
        .outputFluids(Methanol.getFluid(1000))
        .save(provider);


    // MoO3 + 2NaOH -> Na2MoO4 + H2O
    CHEMICAL_RECIPES.recipeBuilder("molybdenum_trioxide_sodium_hydroxide_to_sodium_molybdate_water").duration(80).EUt(30)
        .inputDust(MolybdenumTrioxide, 4)
        .inputDust(SodiumHydroxide, 6)
        .outputItems(ChemicalHelper.get(dust, SodiumMolybdate, 7))
        .outputFluids(Water.getFluid(1000))
        .save(provider);


    // C3H6 + H2O -> C3H8O
    CHEMICAL_RECIPES.recipeBuilder("propene_water_to_isopropyl_alcohol").duration(160).EUt(480)
        .inputFluids(Propene.getFluid(1000))
        .inputFluids(Water.getFluid(1000))
        .outputFluids(IsopropylAlcohol.getFluid(1000))
        .notConsumable(ChemicalHelper.get(dust, SodiumPhosphomolybdate))
        .notConsumable(ChemicalHelper.get(dust, SodiumPhosphotungstate))
        .save(provider);


    //2 IrCl3 + 2 C8H12 -> (C8H12)2Ir2Cl2 + 4 Cl
    CHEMICAL_RECIPES.recipeBuilder("iridium_chloride_cyclooctadiene_to_iridium_cyclooctadienyl_chloride_dimer_chlorine").duration(100).EUt(120)
        .inputDust(IridiumChloride, 8)
        .inputFluids(Cyclooctadiene.getFluid(2000))
        .outputItems(ChemicalHelper.get(dust, IridiumCyclooctadienylChlorideDimer, 44))
        .outputFluids(Chlorine.getFluid(4000))
        .save(provider);


    //4 Li + PCl3 + 2 C3H8O + 2 H2O -> 2 LiCl + 2 [LiOH + H2O] + P(C3H7)2Cl
    CHEMICAL_RECIPES.recipeBuilder("lithium_water_phosphorus_trichloride_isopropyl_alcohol_to_lithium_chloride_lithium_hydroxide_solution_chlorodiisopropyl_phosphine").duration(140).EUt(500)
        .inputDust(Lithium, 4)
        .inputFluids(Water.getFluid(2000))
        .inputFluids(PhosphorusTrichloride.getFluid(1000))
        .inputFluids(IsopropylAlcohol.getFluid(2000))
        .outputItems(ChemicalHelper.get(dust, LithiumChloride, 4))
        .outputFluids(LithiumHydroxideSolution.getFluid(2000))
        .outputFluids(ChlorodiisopropylPhosphine.getFluid(1000))
        .save(provider);

    LARGE_CHEMICAL_RECIPES.recipeBuilder("iridium_cyclooctadienyl_chloride_dimer_chlorodiisopropyl_phosphine_mercaptophenol_to_dehydrogenation_catalyst_cyclooctadiene_hydrochloric_acid").duration(200).EUt(1200)
        .inputDust(IridiumCyclooctadienylChlorideDimer, 22)
        .inputFluids(ChlorodiisopropylPhosphine.getFluid(2000))
        .inputFluids(Mercaptophenol.getFluid(1000))
        .notConsumable(dust, BerylliumFluoride)
        .outputItems(ChemicalHelper.get(dust, DehydrogenationCatalyst, 56))
        .outputFluids(Cyclooctadiene.getFluid(2000))
        .outputFluids(HydrochloricAcid.getFluid(2000))
        .save(provider);

// C4H8 + C8H18 -> C4H10 + C8H16
    CHEMICAL_RECIPES.recipeBuilder("butene_octane_to_butane_oct1ene").duration(190).EUt(120)
        .notConsumable(ChemicalHelper.get(dust, DehydrogenationCatalyst))
        .inputFluids(Butene.getFluid(1000))
        .inputFluids(Octane.getFluid(1000))
        .outputFluids(Butane.getFluid(1000))
        .outputFluids(Oct1ene.getFluid(1000))
        .save(provider);


    // N(CH3)3 + Br + C8H18 + C8H16 -> C19H42BrN + H
    LARGE_CHEMICAL_RECIPES.recipeBuilder("trimethylamine_bromine_octane_oct1ene_to_cetane_trimethyl_ammonium_bromide_hydrogen").duration(300).EUt(480)
        .inputFluids(Trimethylamine.getFluid(1000))
        .inputFluids(Bromine.getFluid(1000))
        .inputFluids(Octane.getFluid(1000))
        .inputFluids(Oct1ene.getFluid(1000))
        .outputFluids(CetaneTrimethylAmmoniumBromide.getFluid(1000))
        .outputFluids(Hydrogen.getFluid(1000))
        .save(provider);

    CHEMICAL_RECIPES.recipeBuilder("styrene_ammonium_persulfate_cetane_trimethyl_ammonium_bromide_to_polystyrene_nano_particles").duration(180).EUt(480)
        .inputFluids(Styrene.getFluid(1000))
        .inputFluids(AmmoniumPersulfate.getFluid(0))
        .inputFluids(CetaneTrimethylAmmoniumBromide.getFluid(20))
        .outputItems(ChemicalHelper.get(dust, PolystyreneNanoParticles))
        .save(provider);

    // TODO migrated disabled: unresolved old test symbol `LITHIUM_SIEVE`.
    //         CHEMICAL_RECIPES.recipeBuilder("lithium_titanate_polystyrene_nano_particles_to_lithium_sieve_styrene").duration(300).EUt(480)
    //                 .inputDust(LithiumTitanate, 2)
    //                 .inputDust(PolystyreneNanoParticles, 2)
    //                 .outputItems(LITHIUM_SIEVE.asStack())
    //                 .outputFluids(Styrene.getFluid(2000))
    //                 .save(provider);
    //
    //
    //

// MgO + 2HCl -> 2H2O + MgCl2
    CHEMICAL_RECIPES.recipeBuilder("magnesia_hydrochloric_acid_to_water_magnesium_chloride").duration(230).EUt(120)
        .inputDust(Magnesia, 2)
        .inputFluids(HydrochloricAcid.getFluid(2000))
        .outputFluids(Water.getFluid(2000))
        .outputDust(MagnesiumChloride, 3)
        .save(provider);


    // SrCO3 -> SrO + CO2
    CHEMICAL_RECIPES.recipeBuilder("strontium_carbonate_to_strontium_oxide_carbon_dioxide").duration(100).EUt(120)
        .inputDust(StrontiumCarbonate, 5)
        .outputItems(ChemicalHelper.get(dust, StrontiumOxide, 2))
        .outputFluids(CarbonDioxide.getFluid(1000))
        .save(provider);

    // 10C10H8 + 10C8H10 -> 3C60H30 + 90H (H voided)
    CHEMICAL_PLANT_RECIPES.recipeBuilder("naphthalene_ethylbenzene_to_unfolded_fullerene").duration(40).EUt(31457280) // UIV
        .inputFluids(Naphthalene.getFluid(10000))
        .inputFluids(Ethylbenzene.getFluid(10000))
        .outputItems(ChemicalHelper.get(dust, UnfoldedFullerene, 3))
        .save(provider);

//    // Naquadric Compound [Nq] + KHSO5 + 2H -> Nq + KOH + H2SO4
//    CHEMICAL_PLANT_RECIPES.recipeBuilder("naquadric_compound_potassium_peroxymonosulfate_hydrogen_to_naquadah_potassium_hydroxide_sulfuric_acid").duration(20).EUt(GAValues.VA[GAValues.UHV]) // UHV
//        .inputDust(NaquadricCompound)
//        .inputDust(PotassiumPeroxymonosulfate, 8)
//        .inputFluids(Hydrogen.getFluid(2000))
//        .outputDust(Naquadah)
//        .outputFluids(PotassiumHydroxide.getFluid(1000))
//        .outputFluids(SulfuricAcid.getFluid(1000))
//        .save(provider);

//    // Enriched Naquadric Compound [Nq+] + Au2Cl6 + Xe + 3O -> Nq+ + 2Au + 6Cl + XeO3
//    CHEMICAL_PLANT_RECIPES.recipeBuilder("enriched_naquadric_compound_auric_chloride_xenon_oxygen_to_naquadah_enriched_gold_chlorine_xenon_trioxide").duration(20).EUt(GAValues.VA[GAValues.UHV])// UHV
//        .inputDust(EnrichedNaquadricCompound)
//        .inputFluids(AuricChloride.getFluid(1000))
//        .inputFluids(Xenon.getFluid(1000))
//        .inputFluids(Oxygen.getFluid(3000))
//        .outputDust(NaquadahEnriched)
//        .outputDust(Gold, 2)
//        .outputFluids(Chlorine.getFluid(6000))
//        .outputFluids(XenonTrioxide.getFluid(1000))
//        .save(provider);


//    // Naquadriatic Compound [*Nq*] + Rn + Xe + 6O -> *Nq* + RnO3 + XeO3
//    // TODO migrated disabled: unresolved old test symbol `Polystyrene`.
//             CHEMICAL_PLANT_RECIPES.recipeBuilder("naquadriatic_compound_radon_xenon_oxygen_to_naquadria_radon_trioxide_xenon_trioxide").duration(20).EUt(GAValues.VA[GAValues.UHV])// UHV
//                     .inputDust(NaquadriaticCompound)
//                     .inputFluids(Radon.getFluid(1000))
//                     .inputFluids(Xenon.getFluid(1000))
//                     .inputFluids(Oxygen.getFluid(6000))
//                     .outputDust(Naquadria)
//                     .outputFluids(RadonTrioxide.getFluid(1000))
//                     .outputFluids(XenonTrioxide.getFluid(1000))
//                     .save(provider);

    // 2C6H6 + 8O + 2C2H4 + C3H6 -> C2H4O + CO2 + 3H2O (gtce epoxy is not balanced)
    CHEMICAL_PLANT_RECIPES.recipeBuilder("benzene_oxygen_ethylene_propene_hydrochloric_acid_to_epoxy_carbon_dioxide_water").duration(60).EUt(30720) // LuV
        .inputFluids(Benzene.getFluid(2000))
        .inputFluids(Oxygen.getFluid(8000))
        .inputFluids(Ethylene.getFluid(2000))
        .inputFluids(Propene.getFluid(1000))
        .inputFluids(HydrochloricAcid.getFluid(0))
        .outputFluids(Epoxy.getFluid(1000))
        .outputFluids(CarbonDioxide.getFluid(1000))
        .outputFluids(Water.getFluid(3000))
        .save(provider);


// 4,4'-Oxydianiline-Pyromellitimide
    // C6H4(CH3)2 + 2CH3Cl + 12O + 2C6H5NH2 + C2H5OH -> C22H14N2O7 + 2CH4 + 6H2O + 2HCl
    CHEMICAL_PLANT_RECIPES.recipeBuilder("ortho_xylene_chloromethane_oxygen_aniline_phenol_to_polyimide_methane_water_hydrochloric_acid").duration(80).EUt(491520) // UV
        .notConsumable(dust, Tin)
        .inputFluids(OrthoXylene.getFluid(1000))
        .inputFluids(Chloromethane.getFluid(2000))
        .inputFluids(Oxygen.getFluid(12000))
        .inputFluids(Aniline.getFluid(2000))
        .inputFluids(Phenol.getFluid(1000))
        .outputFluids(Polyimide.getFluid(1008))
        .outputFluids(Methane.getFluid(2000))
        .outputFluids(Water.getFluid(6000))
        .outputFluids(HydrochloricAcid.getFluid(2000))
        .save(provider);


    // Fluorinated-Ethylene Proplyene (unneeded)

    // Polybenzimidazole
    // 2NH3 + 2HNO3 + 3C6H6 + 3O + C2H4 -> C20H12N4 + 9H2O
    CHEMICAL_PLANT_RECIPES.recipeBuilder("oxygen_ethylene_ammonia_nitric_acid_benzene_to_polybenzimidazole_water").duration(70).EUt(1966080) // UHV
        .notConsumable(dust, Zinc)
        .inputFluids(Oxygen.getFluid(3000))
        .inputFluids(Ethylene.getFluid(1000))
        .inputFluids(Ammonia.getFluid(2000))
        .inputFluids(NitricAcid.getFluid(2000))
        .inputFluids(Benzene.getFluid(3000))
        .outputFluids(Polybenzimidazole.getFluid(1008))
        .outputFluids(Water.getFluid(10000))
        .save(provider);


    // PolyEtherEtherKetone
    // C6H6O2 + 2C6H5F + Na2CO3 -> [(OC6H4)3C]n + 2NaF + 2H2O
    CHEMICAL_PLANT_RECIPES.recipeBuilder("soda_ash_hydroquinone_fluoro_benzene_to_polyetheretherketone_water_sodium_fluoride").duration(120).EUt(31457280) // UIV
        .inputDust(SodaAsh, 6)
        .inputFluids(Hydroquinone.getFluid(1000))
        .inputFluids(FluoroBenzene.getFluid(2000))
        .outputFluids(Polyetheretherketone.getFluid(2592))
        .outputFluids(Water.getFluid(2000))
        .outputDust(SodiumFluoride, 4)
        .EUt(122880)
        .duration(250)
        .save(provider);


    // Zylon
    // C6H6O2 + 2HNO3 + C8H10 -> C14H6N2O2 + 6H2O
    CHEMICAL_PLANT_RECIPES.recipeBuilder("resorcinol_nitric_acid_ortho_xylene_to_zylon_water").duration(30).EUt(31457280) // UIV
        .notConsumable(ISGTagPrefix.CATALYST, AuPdCCatalyst)
        .inputFluids(Resorcinol.getFluid(1000))
        .inputFluids(NitricAcid.getFluid(2000))
        .inputFluids(OrthoXylene.getFluid(1000))
        .outputDust(Zylon)
        .outputFluids(Water.getFluid(6000))
        .save(provider);


    // Fullerene Polymer Matrix
    // Pd + C10H10Fe + C60 + C3H7NO2 -> PdC73H15NFe + H2O + O (voided water)
    CHEMICAL_PLANT_RECIPES.recipeBuilder("fullerene_sarcosine_palladium_ferrocene_acetic_acid_to_pd_fullerene_matrix_oxygen").duration(60).EUt(31457280 * 2) // UXV
        .inputDust(Fullerene, 1)
        .inputDust(Sarcosine, 13)
        .inputDust(Palladium, 1)
        .inputFluids(Ferrocene.getFluid(1000))
        .inputFluids(AceticAcid.getFluid(500))
        .notConsumableDust(SodiumEthoxide)
        .notConsumableDust(AluminiumChloride)
        .notConsumableDust(Chloroform)
        .outputDust(PdFullereneMatrix)
        .outputFluids(Oxygen.getFluid(1000))
        .save(provider);


    // 7C8H8 + 8CH2Cl2 + 8C60 + 8C11H14O2 + 8C2H6S + 8C6H5Cl -> 8C7H8 + 8H2S + 8C80H21O2 + 24HCl
    CHEMICAL_PLANT_RECIPES.recipeBuilder("fullerene_styrene_dichloromethane_phenylpentanoicacid_dimethylsulfide_chlorobenzene_to_toluene_hydrogen_sulfide_hydrochloric_acid_pcbs").duration(60).EUt(31457280 * 4) // UXV
        .notConsumable(ChemicalHelper.get(dust, Dimethylaminopyridine))
        .inputDust(Fullerene, 8)
        .inputFluids(Styrene.getFluid(7000))
        .inputFluids(Dichloromethane.getFluid(8000))
        .inputFluids(Phenylpentanoicacid.getFluid(8000))
        .inputFluids(Dimethylsulfide.getFluid(8000))
        .inputFluids(Chlorobenzene.getFluid(8000))
        .outputFluids(Toluene.getFluid(8000))
        .outputFluids(HydrogenSulfide.getFluid(8000))
        .outputFluids(HydrochloricAcid.getFluid(24000))
        .outputFluids(PCBS.getFluid(8000))
        .save(provider);


//    // Combined Process - Uraninite
//    CHEMICAL_PLANT_RECIPES.recipeBuilder("uraninite_nitration_mixture_to_uranium_radioactive_uranium_sulfate_waste_solution_uranium_refinement_waste_solution_thorium_nitrate_solution").EUt(7680).duration(864)
//        .inputDust(Uraninite, 3)
//        .inputFluids(NitrationMixture.getFluid(4000))
//        .outputItems(dioxide, UraniumRadioactive, 3)
//        .outputFluids(UraniumSulfateWasteSolution.getFluid(1000))
//        .outputFluids(UraniumRefinementWasteSolution.getFluid(1000))
//        .outputFluids(ThoriumNitrateSolution.getFluid(1000))
//        .save(provider);

// NaCN + 2 Br + C10H8 -> NaBr + C10H7CN + HBr
    LARGE_CHEMICAL_RECIPES.recipeBuilder("naphthalene_sodium_cyanide_bromine_to_sodium_bromide_hydrobromic_acid_cyanonaphthalene")
        .inputFluids(Naphthalene.getFluid(1000))
        .inputFluids(SodiumCyanide.getFluid(1000))
        .inputFluids(Bromine.getFluid(2000))
        .outputItems(ChemicalHelper.get(dust, SodiumBromide, 2))
        .notConsumable(UVA_HALIDE_LAMP)
        .outputFluids(HydrobromicAcid.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, Cyanonaphthalene, 19))
        .EUt(1920)
        .duration(80)
        .save(provider);


    //HBr + Cl -> HCl + Br
    CHEMICAL_RECIPES.recipeBuilder("hydrobromic_acid_chlorine_to_bromine_hydrochloric_acid")
        .inputFluids(HydrobromicAcid.getFluid(1000))
        .inputFluids(Chlorine.getFluid(1000))
        .outputFluids(Bromine.getFluid(1000))
        .outputFluids(HydrochloricAcid.getFluid(1000))
        .duration(160)
        .EUt(125)
        .save(provider);


    //2 NaBr + H3PO4 -> 2 HBr + Na2HPO4
    CHEMICAL_RECIPES.recipeBuilder("sodium_bromide_phosphoric_acid_to_hydrobromic_acid_disodium_phosphate")
        .inputDust(SodiumBromide, 4)
        .inputFluids(PhosphoricAcid.getFluid(1000))
        .outputFluids(HydrobromicAcid.getFluid(2000))
        .outputItems(ChemicalHelper.get(dust, DisodiumPhosphate, 8))
        .duration(190)
        .EUt(125)
        .save(provider);


    // C10H7CN + H2O + 3HCl -> C11H8O + NH4Cl + 2Cl
    LARGE_CHEMICAL_RECIPES.recipeBuilder("cyanonaphthalene_water_hydrochloric_acid_to_naphthaldehyde_ammonium_chloride_chlorine")
        .inputDust(Cyanonaphthalene, 19)
        .notConsumable(ChemicalHelper.get(dust, TinChloride))
        .inputFluids(Water.getFluid(1000))
        .inputFluids(HydrochloricAcid.getFluid(3000))
        .outputFluids(Naphthaldehyde.getFluid(1000))
        .outputFluids(AmmoniumChloride.getFluid(1000))
        .outputFluids(Chlorine.getFluid(2000))
        .EUt(1920)
        .duration(80)
        .save(provider);


    // C11H8O + C8H10 + O -> C19H14 + 2H2O
    CHEMICAL_RECIPES.recipeBuilder("naphthaldehyde_ethylbenzene_oxygen_to_water_methylbenzophenanthrene")
        .inputFluids(Naphthaldehyde.getFluid(1000))
        .inputFluids(Ethylbenzene.getFluid(1000))
        .inputFluids(Oxygen.getFluid(1000))
        .notConsumable(dust, Iodine)
        .notConsumable(ChemicalHelper.get(dust, Triphenylphosphine))
        .outputFluids(Water.getFluid(2000))
        .outputItems(ChemicalHelper.get(dust, Methylbenzophenanthrene, 33))
        .EUt(1920)
        .duration(100)
        .save(provider);


// C19H14 + KCN + C4H4BrNO2 -> C20H13N + KBr + C4H5NO2
    LARGE_CHEMICAL_RECIPES.recipeBuilder("methylbenzophenanthrene_potassium_cyanide_bromosuccinimide_to_benzophenanthrenylacetonitrile_potassium_bromide_succinimide")
        .inputDust(Methylbenzophenanthrene, 33)
        .inputDust(PotassiumCyanide, 3)
        .inputDust(Bromosuccinimide, 12)
        .outputItems(ChemicalHelper.get(dust, Benzophenanthrenylacetonitrile, 34))
        .outputItems(ChemicalHelper.get(dust, PotassiumBromide, 2))
        .outputItems(ChemicalHelper.get(dust, Succinimide, 12))
        .EUt(1920)
        .duration(100)
        .save(provider);


    // 3C20H13N -> C60H30 + 3NH3
    LARGE_CHEMICAL_RECIPES.recipeBuilder("benzophenanthrenylacetonitrile_to_unfolded_fullerene_ammonia")
        .inputDust(Benzophenanthrenylacetonitrile, 102)
        .notConsumable(ChemicalHelper.get(dust, TiAlChloride))
        .outputItems(ChemicalHelper.get(dust, UnfoldedFullerene))
        .outputFluids(Ammonia.getFluid(3000))
        .EUt(7680)
        .duration(250)
        .save(provider);


    // 6Na + PCl3 + 3C6H5Cl -> 6NaCl + C18H15P
    LARGE_CHEMICAL_RECIPES.recipeBuilder("sodium_phosphorus_trichloride_chlorobenzene_to_salt_triphenylphosphine")
        .inputDust(Sodium, 6)
        .inputFluids(PhosphorusTrichloride.getFluid(1000))
        .inputFluids(Chlorobenzene.getFluid(3000))
        .outputDust(Salt, 12)
        .outputItems(ChemicalHelper.get(dust, Triphenylphosphine, 34))
        .EUt(7680)
        .duration(250)
        .save(provider);


    // C4H5NO2 + 2Br -> C4H4BrNO2 + HBr
    CHEMICAL_RECIPES.recipeBuilder("succinimide_bromine_to_bromosuccinimide_hydrobromic_acid")
        .inputDust(Succinimide, 12)
        .inputFluids(Bromine.getFluid(2000))
        .outputItems(ChemicalHelper.get(dust, Bromosuccinimide, 12))
        .outputFluids(HydrobromicAcid.getFluid(1000))
        .EUt(480)
        .duration(200)
        .save(provider);


    // SO3 + S + 2Cl -> SO2 + SOCl2
    CHEMICAL_RECIPES.recipeBuilder("sulfur_trioxide_sulfur_chlorine_to_sulfur_dioxide_thionyl_chloride")
        .inputFluids(SulfurTrioxide.getFluid(1000))
        .inputDust(Sulfur)
        .inputFluids(Chlorine.getFluid(2000))
        .outputFluids(SulfurDioxide.getFluid(1000))
        .outputFluids(ThionylChloride.getFluid(1000))
        .EUt(480)
        .duration(400)
        .save(provider);


    // HCN + KOH -> KCN + H2O
    CHEMICAL_RECIPES.recipeBuilder("hydrogen_cyanide_potassium_hydroxide_to_potassium_cyanide_water")
        .inputFluids(HydrogenCyanide.getFluid(1000))
        .inputFluids(PotassiumHydroxide.getFluid(1000))
        .circuitMeta(0)
        .outputItems(ChemicalHelper.get(dust, PotassiumCyanide, 3))
        .outputFluids(Water.getFluid(1000))
        .EUt(1920)
        .duration(200)
        .save(provider);


    // KCl + H2O -> KOH + HCl
    CHEMICAL_RECIPES.recipeBuilder("rock_salt_water_to_potassium_hydroxide_hydrochloric_acid")
        .inputDust(RockSalt, 2)
        .inputFluids(Water.getFluid(1000))
        .outputFluids(PotassiumHydroxide.getFluid(1000))
        .outputFluids(HydrochloricAcid.getFluid(1000))
        .EUt(480)
        .duration(270)
        .save(provider);


    // K + Cl -> KCl
    CHEMICAL_RECIPES.recipeBuilder("potassium_chlorine_to_rock_salt")
        .inputDust(Potassium)
        .inputFluids(Chlorine.getFluid(1000))
        .outputDust(RockSalt, 2)
        .EUt(30)
        .duration(220)
        .save(provider);


    // H + FeCl3 -> FeCl2 + HCl
    CHEMICAL_RECIPES.recipeBuilder("hydrogen_iron_chloride_to_iron2_chloride_hydrochloric_acid").duration(40).EUt(30)
        .inputFluids(Hydrogen.getFluid(1000))
        .inputFluids(IronChloride.getFluid(1000))
        .outputFluids(Iron2Chloride.getFluid(1000))
        .outputFluids(HydrochloricAcid.getFluid(1000))
        .save(provider);


    // 2C5H6 + FeCl2 -> C10H10Fe + 2HCl
    CHEMICAL_RECIPES.recipeBuilder("zeolite_sieving_pellets_iron2_chloride_cyclopentadiene_to_ferrocene_hydrochloric_acid_wet_zeolite_sieving_pellets")
        .inputDust(ZeoliteSievingPellets)
        .notConsumable(ChemicalHelper.get(dust, PdIrReOCeOsSiCatalyst))
        .inputFluids(Iron2Chloride.getFluid(1000))
        .inputFluids(Cyclopentadiene.getFluid(2000))
        .outputFluids(Ferrocene.getFluid(1000))
        .outputFluids(HydrochloricAcid.getFluid(2000))
        .outputItems(ChemicalHelper.get(dust, WetZeoliteSievingPellets))
        .EUt(30720)
        .duration(100)
        .save(provider);

// C10H10Fe + C60 + C3H7NO2 + CHCl3 + 3 NaOC2H5 ->
    // 3 NaCl + 3 C2H5OH + [C73H15NFe] + CO2
    CHEMICAL_PLANT_RECIPES.recipeBuilder("fullerene_sarcosine_sodium_ethoxide_chloroform_ferrocene_to_salt_ferrocenylfulleropyrrolidine_carbon_dioxide_ethanol")
        .inputDust(Fullerene)
        .inputDust(Sarcosine, 13)
        .inputDust(SodiumEthoxide, 27)
        .inputFluids(Chloroform.getFluid(1000))
        .inputFluids(Ferrocene.getFluid(1000))
        .notConsumableFluid(TitaniumTetrachloride.getFluid(1000))
        .notConsumableFluid(Toluene.getFluid(1000))
        .outputDust(Salt, 6)
        .outputFluids(Ferrocenylfulleropyrrolidine.getFluid(1000))
        .outputFluids(CarbonDioxide.getFluid(1000))
        .outputFluids(Ethanol.getFluid(3000))
        .EUt(500000)
        .duration(750)
        .save(provider);


    // NaOH + C2H5OH -> H2O + C2H5ONa
    CHEMICAL_RECIPES.recipeBuilder("sodium_hydroxide_ethanol_to_water_sodium_ethoxide")
        .inputDust(SodiumHydroxide, 3)
        .inputFluids(Ethanol.getFluid(1000))
        .outputFluids(Water.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, SodiumEthoxide, 9))
        .EUt(7680)
        .duration(50)
        .save(provider);


    // CH3NH2 + 2Cl + CH3COOH -> C3H7NO2 + 2HCl
    LARGE_CHEMICAL_RECIPES.recipeBuilder("methylamine_chlorine_acetic_acid_acetic_anhydride_to_sarcosine_hydrochloric_acid")
        .inputFluids(Methylamine.getFluid(1000))
        .inputFluids(Chlorine.getFluid(2000))
        .inputFluids(AceticAcid.getFluid(1000))
        .inputFluids(AceticAnhydride.getFluid(0))
        .outputItems(ChemicalHelper.get(dust, Sarcosine, 13))
        .outputFluids(HydrochloricAcid.getFluid(2000))
        .EUt(7680)
        .duration(200)
        .save(provider);


    // NH3 + CH4O -> CH3NH2 + H2O
    CHEMICAL_RECIPES.recipeBuilder("ammonia_methanol_to_methylamine_water")
        .inputFluids(Ammonia.getFluid(1000))
        .inputFluids(Methanol.getFluid(1000))
        .notConsumable(dust, AluminoSilicateWool)
        .circuitMeta(3)
        .outputFluids(Methylamine.getFluid(1000))
        .outputFluids(Water.getFluid(1000))
        .EUt(7680)
        .duration(100)
        .save(provider);


    // C73H15NFe + Pd -> PdC73H15NFe
    LARGE_CHEMICAL_RECIPES.recipeBuilder("ferrocenylfulleropyrrolidine_palladium_to_pd_fullerene_matrix")
        .inputFluids(Ferrocenylfulleropyrrolidine.getFluid(1000))
        .inputDust(Palladium)
        .notConsumableDust(AceticAcid)
        .notConsumableDust(NitricAcid)
        .outputItems(ChemicalHelper.get(dust, PdFullereneMatrix))
        .EUt(2000000)
        .duration(200)
        .save(provider);


    // H2S + 2CH4O -> C2H6S + 2H2O
    CHEMICAL_RECIPES.recipeBuilder("hydrogen_sulfide_methanol_to_dimethylsulfide_water")
        .inputFluids(HydrogenSulfide.getFluid(1000))
        .inputFluids(Methanol.getFluid(2000))
        .outputFluids(Dimethylsulfide.getFluid(1000))
        .outputFluids(Water.getFluid(2000))
        .EUt(1920)
        .duration(100)
        .save(provider);


    // 2C7H8 + SOCl2 + 4KMnO4 -> H2O + 4MnO2 + 4KOH + SO2 + 2C7H5ClO
    LARGE_CHEMICAL_RECIPES.recipeBuilder("potassium_permanganate_thionyl_chloride_toluene_to_pyrolusite_water_potassium_hydroxide_sulfur_dioxide_benzoyl_chloride")
        .inputDust(PotassiumPermanganate, 24)
        .inputFluids(ThionylChloride.getFluid(1000))
        .inputFluids(Toluene.getFluid(2000))
        .outputDust(Pyrolusite, 12)
        .outputFluids(Water.getFluid(1000))
        .outputFluids(PotassiumHydroxide.getFluid(4000))
        .outputFluids(SulfurDioxide.getFluid(1000))
        .outputFluids(BenzoylChloride.getFluid(2000))
        .EUt(480)
        .duration(200)
        .save(provider);


    // H2O2 + 2C7H5ClO -> C14H10O4 + 2HCl
    CHEMICAL_RECIPES.recipeBuilder("hydrogen_peroxide_benzoyl_chloride_to_benzoyl_peroxide_hydrochloric_acid")
        .inputFluids(HydrogenPeroxide.getFluid(1000))
        .inputFluids(BenzoylChloride.getFluid(2000))
        .outputFluids(BenzoylPeroxide.getFluid(1000))
        .outputFluids(HydrochloricAcid.getFluid(2000))
        .EUt(1920)
        .duration(160)
        .save(provider);


    //4 I + N2H4 -> 2 N + 4 HI
    CHEMICAL_RECIPES.recipeBuilder("iodine_hydrazine_to_nitrogen_hydroiodic_acid")
        .inputDust(Iodine, 4)
        .inputFluids(Hydrazine.getFluid(1000))
        .outputFluids(Nitrogen.getFluid(2000))
        .outputFluids(HydroiodicAcid.getFluid(4000))
        .duration(210)
        .EUt(500)
        .save(provider);


    //C3H3N + HI + 2 H2O + C8H8 + LiAlH4 -> C11H14O2 + LiI + AlH3 + NH3 (SnMe3Cl cat.)
    LARGE_CHEMICAL_RECIPES.recipeBuilder("acrylo_nitrile_hydroiodic_acid_water_styrene_lithium_aluminium_hydride_trimethyltin_chloride_to_phenylpentanoicacid_ammonia_aluminium_hydride_lithium_iodide")
        .inputFluids(AcryloNitrile.getFluid(1000))
        .inputFluids(HydroiodicAcid.getFluid(1000))
        .inputFluids(Water.getFluid(2000))
        .inputFluids(Styrene.getFluid(1000))
        .inputDust(LithiumAluminiumHydride, 6)
        .inputFluids(TrimethyltinChloride.getFluid(100))
        .outputFluids(Phenylpentanoicacid.getFluid(1000))
        .outputFluids(Ammonia.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, AluminiumHydride, 4))
        .outputItems(ChemicalHelper.get(dust, LithiumIodide, 2))
        .EUt(3840)
        .duration(110)
        .save(provider);


    // 2 C60 + 2 C11H14O2 + C2H6S + 2 C6H5Cl -> 2 C71H12O2 + 2 C7H8 + H2S + 2 HCl
    LARGE_CHEMICAL_RECIPES.recipeBuilder("fullerene_phenylpentanoicacid_dimethylsulfide_chlorobenzene_benzoyl_peroxide_to_toluene_hydrogen_sulfide_hydrochloric_acid_pcba")
        .inputDust(Fullerene, 2)
        .inputFluids(Phenylpentanoicacid.getFluid(2000))
        .inputFluids(Dimethylsulfide.getFluid(1000))
        .inputFluids(Chlorobenzene.getFluid(2000))
        .inputFluids(BenzoylPeroxide.getFluid(0))
        .outputFluids(Toluene.getFluid(2000))
        .outputFluids(HydrogenSulfide.getFluid(1000))
        .outputFluids(HydrochloricAcid.getFluid(2000))
        .outputFluids(PCBA.getFluid(2000))
        .EUt(500000)
        .duration(450)
        .save(provider);


    // Ag + Cl -> AgCl
    CHEMICAL_RECIPES.recipeBuilder("silver_chlorine_to_silver_chloride").duration(80).EUt(120)
        .inputDust(Silver)
        .inputFluids(Chlorine.getFluid(1000))
        .outputDust(SilverChloride, 2)
        .save(provider);


    // 3Ag2O + 8BF3 -> 6AgBF4 + B2O3
    CHEMICAL_RECIPES.recipeBuilder("boron_fluoride_silver_oxide_to_silvertetrafluoroborate_boron_oxide")
        .inputFluids(BoronFluoride.getFluid(8000))
        .inputDust(SilverOxide, 9)
        .notConsumableDust(Benzene)
        .outputFluids(Silvertetrafluoroborate.getFluid(6000))
        .outputItems(ChemicalHelper.get(dust, BoronOxide, 5))
        .EUt(7680)
        .duration(100)
        .save(provider);


    // 2NH3 + COCl2 + 2C3H8O -> C7H14N2 + 3H2O + 2HCl
    // loses 1B water, but keeps it out of an LCR. Good tradeoff I think
    CHEMICAL_RECIPES.recipeBuilder("ammonia_phosgene_isopropyl_alcohol_to_diluted_hydrochloric_acid_diisopropylcarbodiimide")
        .inputFluids(Ammonia.getFluid(2000))
        .inputFluids(Phosgene.getFluid(1000))
        .inputFluids(IsopropylAlcohol.getFluid(2000))
        .notConsumable(ChemicalHelper.get(dust, Triphenylphosphine))
        .outputFluids(DilutedHydrochloricAcid.getFluid(4000))
        .outputFluids(Diisopropylcarbodiimide.getFluid(1000))
        .EUt(7680)
        .duration(250)
        .save(provider);


    // CO + 2Cl -> COCl2
    CHEMICAL_RECIPES.recipeBuilder("carbon_monoxide_chlorine_to_phosgene")
        .inputFluids(CarbonMonoxide.getFluid(1000))
        .inputFluids(Chlorine.getFluid(2000))
        .notConsumable(dust, Carbon)
        .outputFluids(Phosgene.getFluid(1000))
        .EUt(1920)
        .duration(400)
        .save(provider);


    // (CH3)2NH + C5H5N -> H2 + C7H10N2
    CHEMICAL_RECIPES.recipeBuilder("dimethylamine_pyridine_to_hydrogen_dimethylaminopyridine")
        .inputFluids(Dimethylamine.getFluid(1000))
        .inputFluids(Pyridine.getFluid(1000))
        .outputFluids(Hydrogen.getFluid(2000))
        .outputItems(ChemicalHelper.get(dust, Dimethylaminopyridine, 19))
        .EUt(7680)
        .duration(200)
        .save(provider);


    // C71H12O2 + C8H8 + CH2Cl2 -> C80H20O2 + 2 HCl
    LARGE_CHEMICAL_RECIPES.recipeBuilder("diisopropylcarbodiimide_pcba_styrene_dichloromethane_to_hydrochloric_acid_pcbs")
        .notConsumable(ChemicalHelper.get(dust, Dimethylaminopyridine))
        .inputFluids(Diisopropylcarbodiimide.getFluid(10))
        .inputFluids(PCBA.getFluid(1000))
        .inputFluids(Styrene.getFluid(1000))
        .inputFluids(Dichloromethane.getFluid(1000))
        .outputFluids(HydrochloricAcid.getFluid(2000))
        .outputFluids(PCBS.getFluid(1000))
        .EUt(500000)
        .duration(400)
        .save(provider);


    // STEP 2
    // Cu3Au? + HNO3 -> Cu3Au?(OH) + NO2
    CHEMICAL_RECIPES.recipeBuilder("gold_alloy_nitric_acid_to_gold_leach_nitrogen_dioxide").duration(80)
        .inputItems(ingot, GoldAlloy, 4)
        .inputFluids(NitricAcid.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, GoldLeach, 4))
        .outputFluids(NitrogenDioxide.getFluid(1000))
        .save(provider);


    // STEP 3
    // Cu3Au?(OH) + HCl -> HAuCl(OH) + Cu3?
    CHEMICAL_RECIPES.recipeBuilder("gold_leach_hydrochloric_acid_to_copper_leach_chloroauric_acid").duration(80)
        .inputDust(GoldLeach, 4)
        .inputFluids(HydrochloricAcid.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, CopperLeach, 4))
        .outputFluids(ChloroauricAcid.getFluid(1000))
        .save(provider);


    // STEP 4
    // HAuCl(OH) -> Au + H2O + Cl
    CHEMICAL_RECIPES.recipeBuilder("chloroauric_acid_to_gold_water_chlorine").duration(100)
        .inputFluids(ChloroauricAcid.getFluid(1000))
        .notConsumable(dust, PotassiumMetabisulfite)
        .outputDust(Gold, 2)
        .outputFluids(Water.getFluid(1000))
        .outputFluids(Chlorine.getFluid(1000))
        .save(provider);


    // 4C2H4 + NH3 + HBr -> C8H20NBr
    CHEMICAL_RECIPES.recipeBuilder("ethylene_ammonia_hydrobromic_acid_to_tetraethylammonium_bromide").duration(240).EUt(120)
        .inputFluids(Ethylene.getFluid(4000))
        .inputFluids(Ammonia.getFluid(1000))
        .inputFluids(HydrobromicAcid.getFluid(1000))
        .outputFluids(TetraethylammoniumBromide.getFluid(1000))
        .save(provider);

    // H2O + C6H12O6 -> C6H14O2 + 5O
    CHEMICAL_RECIPES.recipeBuilder("water_fructose_tetraethylammonium_bromide_to_hexanediol_oxygen").duration(180).EUt(120)
        .notConsumable(ChemicalHelper.get(dust, PdIrReOCeOsSiCatalyst))
        .inputFluids(Water.getFluid(1000))
        .inputDust(Fructose, 24)
        .inputFluids(TetraethylammoniumBromide.getFluid(0))
        .outputFluids(Hexanediol.getFluid(1000))
        .outputFluids(Oxygen.getFluid(5000))
        .save(provider);

// 2NH3 + C6H14O2 -> 2H2O + C6H16N2
    CHEMICAL_RECIPES.recipeBuilder("hexanediol_ammonia_to_water_hexamethylenediamine").duration(240).EUt(480)
        .inputFluids(Hexanediol.getFluid(1000))
        .inputFluids(Ammonia.getFluid(2000))
        .outputFluids(Water.getFluid(2000))
        .outputFluids(Hexamethylenediamine.getFluid(1000))
        .notConsumable(dust, Ruthenium)
        .notConsumable(ChemicalHelper.get(dust, Alumina))
        .save(provider);


    // C6H12O6 + 3 O -> C6H10O8 + H2O
    CHEMICAL_RECIPES.recipeBuilder("glucose_oxygen_to_water_saccharic_acid").duration(160).EUt(480)
        .inputDust(Glucose, 24)
        .circuitMeta(0)
        .inputFluids(Oxygen.getFluid(3000))
        .outputFluids(Water.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, SaccharicAcid, 24))
        .save(provider);


    // C6H10O8 + 8H -> C6H10O4 + 4H2O
    LARGE_CHEMICAL_RECIPES.recipeBuilder("saccharic_acid_hydrogen_to_adipic_acid_water").duration(160).EUt(480)
        .inputDust(SaccharicAcid, 24)
        .notConsumable(ChemicalHelper.get(dust, AuPdCCatalyst))
        .notConsumable(ChemicalHelper.get(dust, ScandiumTriflate))
        .inputFluids(Hydrogen.getFluid(8000))
        .outputItems(ChemicalHelper.get(dust, AdipicAcid, 20))
        .outputFluids(Water.getFluid(4000))
        .save(provider);


    // C3H6O + CH4 -> C4H10O
    CHEMICAL_RECIPES.recipeBuilder("zeolite_sieving_pellets_acetone_methane_to_tertbutanol_wet_zeolite_sieving_pellets").duration(125).EUt(120)
        .notConsumable(dust, MagnesiumChloride)
        .inputDust(ZeoliteSievingPellets)
        .inputFluids(Acetone.getFluid(1000))
        .inputFluids(Methane.getFluid(1000))
        .outputFluids(Tertbutanol.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, WetZeoliteSievingPellets))
        .save(provider);


    // 2C4H10O + 2CO2 -> H2O + C10H18O5
    CHEMICAL_RECIPES.recipeBuilder("tertbutanol_carbon_dioxide_toluenesulfonate_to_water_ditertbutyl_dicarbonate").duration(260).EUt(480)
        .inputFluids(Tertbutanol.getFluid(2000))
        .inputFluids(CarbonDioxide.getFluid(2000))
        .inputFluids(Toluenesulfonate.getFluid(0))
        .outputFluids(Water.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, DitertbutylDicarbonate, 33))
        .save(provider);


    // C4H8 + C10H18O5 + 4NH3 + 3C -> 2 C4H10O + C6H18N4 + 3CO
    LARGE_CHEMICAL_RECIPES.recipeBuilder("ditertbutyl_dicarbonate_carbon_butene_ammonia_trimethylchlorosilane_to_tertbutanol_carbon_monoxide_triaminoethaneamine").duration(370).EUt(480)
        .inputDust(DitertbutylDicarbonate, 33)
        .inputDust(Carbon, 3)
        .inputFluids(Butene.getFluid(1000))
        .inputFluids(Ammonia.getFluid(4000))
        .inputFluids(Trimethylchlorosilane.getFluid(0))
        .outputFluids(Tertbutanol.getFluid(2000))
        .outputFluids(CarbonMonoxide.getFluid(3000))
        .outputFluids(Triaminoethaneamine.getFluid(1000))
        .save(provider);

    // TODO migrated disabled: unresolved old test symbol `PEEK_POLYAMIDE_FOIL`.
    //         LARGE_CHEMICAL_RECIPES.recipeBuilder("polyetheretherketone_silicone_rubber_adipic_acid_hexamethylenediamine_triaminoethaneamine_to_peek_polyamide_foil").duration(290).EUt(30720)
    //                 .inputItems(foil, Polyetheretherketone)
    //                 .inputItems(foil, SiliconeRubber)
    //                 .inputDust(AdipicAcid, 20)
    //                 .inputFluids(Hexamethylenediamine.getFluid(1000))
    //                 .inputFluids(Triaminoethaneamine.getFluid(500))
    //                 .outputItems(PEEK_POLYAMIDE_FOIL.asStack(3))
    //                 .save(provider);
    //
    //
    //

// 2K + 2NaN3 + C10H18O5 -> 2Na + K2O + 2C5H9N3O2
    LARGE_CHEMICAL_RECIPES.recipeBuilder("potassium_sodium_azide_ditertbutyl_dicarbonate_to_sodium_potash_tert_butyl_azidoformate").duration(210).EUt(480)
        .inputDust(Potassium, 2)
        .inputDust(SodiumAzide, 8)
        .inputDust(DitertbutylDicarbonate, 33)
        .outputDust(Sodium, 2)
        .outputDust(Potash, 6)
        .outputFluids(TertButylAzidoformate.getFluid(2000))
        .save(provider);


    // Aminated Fullerene is a Secondary Amine
    // C60 + 4C5H9N3O2 + 8H2O + 4CO -> C60N12H12 + 4C4H10O + 8CO2
    LARGE_CHEMICAL_RECIPES.recipeBuilder("fullerene_tert_butyl_azidoformate_water_carbon_monoxide_to_aminated_fullerene_carbon_dioxide_tertbutanol").duration(120).EUt(30720)
        .inputDust(Fullerene)
        .inputFluids(TertButylAzidoformate.getFluid(4000))
        .inputFluids(Water.getFluid(8000))
        .inputFluids(CarbonMonoxide.getFluid(4000))
        .outputFluids(AminatedFullerene.getFluid(1000))
        .outputFluids(CarbonDioxide.getFluid(8000))
        .outputFluids(Tertbutanol.getFluid(4000))
        .save(provider);


    // LiAlSi2O6 + H2SO4 = [LiAlO2 + H2SO4] + 2SiO2
    CHEMICAL_RECIPES.recipeBuilder("roasted_spodumene_sulfuric_acid_to_dissolved_lithium_ore_silicon_dioxide").duration(120).EUt(120)
        .inputDust(RoastedSpodumene)
        .inputFluids(SulfuricAcid.getFluid(1000))
        .outputFluids(DissolvedLithiumOre.getFluid(1000))
        .outputDust(SiliconDioxide, 6)
        .save(provider);


    // (KLi3Al4O10)O + Al + 3H2SO4 = 3[LiAlO2 + H2SO4] + Al2O3 + K2O
    LARGE_CHEMICAL_RECIPES.recipeBuilder("roasted_lepidolite_aluminium_sulfuric_acid_to_dissolved_lithium_ore_potash_alumina").duration(140).EUt(120)
        .inputDust(RoastedLepidolite)
        .inputDust(Aluminium)
        .inputFluids(SulfuricAcid.getFluid(3000))
        .outputFluids(DissolvedLithiumOre.getFluid(3000))
        .outputDust(Potash, 3)
        .outputItems(ChemicalHelper.get(dust, Alumina, 5))
        .save(provider);


    // 2[LiAlO2 + H2SO4] + H2SO4 + CO2 = Al2(SO4)3 + [Li2CO3 + H2O] + 2H2O
    CHEMICAL_RECIPES.recipeBuilder("dissolved_lithium_ore_sulfuric_acid_carbon_dioxide_to_aluminium_sulfate_lithium_carbonate_solution_water").duration(140).EUt(120)
        .inputFluids(DissolvedLithiumOre.getFluid(2000))
        .inputFluids(SulfuricAcid.getFluid(1000))
        .inputFluids(CarbonDioxide.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, AluminiumSulfate, 17))
        .outputFluids(LithiumCarbonateSolution.getFluid(1000))
        .outputFluids(Water.getFluid(2000))
        .save(provider);


    // [Li2CO3 + H2O] + 2HCl + 2Na = 2[LiCl + H2O] + Na2CO3
    // off by 1 oxygen, which is fine since water is lost in dehydrator step
    CHEMICAL_RECIPES.recipeBuilder("sodium_lithium_carbonate_solution_hydrochloric_acid_to_soda_ash_lithium_chloride_solution").duration(130).EUt(120)
        .inputDust(Sodium, 2)
        .inputFluids(LithiumCarbonateSolution.getFluid(1000))
        .inputFluids(HydrochloricAcid.getFluid(2000))
        .outputDust(SodaAsh, 6)
        .outputFluids(LithiumChlorideSolution.getFluid(2000))
        .save(provider);


    // 19HF + (Nb2O5)(Ta2O5) -> AlF3 + SiF4 + ? + 7.5H2O
    LARGE_CHEMICAL_RECIPES.recipeBuilder("hydrofluoric_acid_niobium_tantalum_oxide_to_aluminium_trifluoride_silicon_fluoride_nb_ta_fluoride_mix_water").duration(280).EUt(1920)
        .inputFluids(HydrofluoricAcid.getFluid(19000))
        .inputDust(NiobiumTantalumOxide, 14)
        .outputItems(ChemicalHelper.get(dust, AluminiumTrifluoride, 4))
        .outputFluids(SiliconFluoride.getFluid(1000))
        .outputFluids(NbTaFluorideMix.getFluid(1000))
        .outputFluids(Water.getFluid(7500))
        .save(provider);

    CHEMICAL_RECIPES.recipeBuilder("leached_columbite_hydrofluoric_acid_to_fluoroniobic_acid_water").duration(180).EUt(480)
        .inputDust(LeachedColumbite, 17)
        .inputFluids(HydrofluoricAcid.getFluid(10400))
        .outputFluids(FluoroniobicAcid.getFluid(2000))
        .outputFluids(Water.getFluid(3200))
        .save(provider);

    CHEMICAL_RECIPES.recipeBuilder("leached_tantalite_hydrofluoric_acid_to_fluorotantalic_acid_water").duration(180).EUt(120)
        .inputDust(LeachedTantalite, 17)
        .inputFluids(HydrofluoricAcid.getFluid(13600))
        .outputFluids(FluorotantalicAcid.getFluid(2000))
        .outputFluids(Water.getFluid(4800))
        .save(provider);

    LARGE_CHEMICAL_RECIPES.recipeBuilder("acidic_leached_pyrochlore_hydrogen_peroxide_sulfuric_acid_to_hydrofluoric_acid_alkaline_earth_sulfate_solution_oxygen_leached_pyrochlore").duration(240).EUt(480)
        .inputDust(AcidicLeachedPyrochlore, 3)
        .inputFluids(HydrogenPeroxide.getFluid(3000))
        .inputFluids(SulfuricAcid.getFluid(12000))
        .outputFluids(HydrofluoricAcid.getFluid(13000))
        .outputFluids(AlkalineEarthSulfateSolution.getFluid(8000))
        .outputFluids(Oxygen.getFluid(3000))
        .outputItems(ChemicalHelper.get(dust, LeachedPyrochlore, 3))
        .save(provider);

    CHEMICAL_RECIPES.recipeBuilder("leached_pyrochlore_hydrofluoric_acid_to_fluoroniobic_acid_water").duration(180).EUt(120)
        .inputDust(LeachedPyrochlore)
        .inputFluids(HydrofluoricAcid.getFluid(10400))
        .outputFluids(FluoroniobicAcid.getFluid(2000))
        .outputFluids(Water.getFluid(3200))
        .save(provider);

    CHEMICAL_RECIPES.recipeBuilder("ree_th_u_sulfate_solution_nitric_acid_to_uranyl_thorium_nitrate_rare_earth_nitrate_solution_sulfuric_acid").duration(160).EUt(480)
        .inputFluids(REEThUSulfateSolution.getFluid(2000))
        .inputFluids(NitricAcid.getFluid(7000))
        .outputItems(ChemicalHelper.get(dust, UranylThoriumNitrate, 26))
        .outputFluids(RareEarthNitrateSolution.getFluid(1000))
        .outputFluids(SulfuricAcid.getFluid(4000))
        .save(provider);

    CHEMICAL_RECIPES.recipeBuilder("rare_earth_nitrate_solution_hydrochloric_acid_to_nitric_acid_rare_earth_chlorides_solution").duration(280).EUt(480)
        .inputFluids(RareEarthNitrateSolution.getFluid(1000))
        .inputFluids(HydrochloricAcid.getFluid(3000))
        .outputFluids(NitricAcid.getFluid(3000))
        .outputFluids(RareEarthChloridesSolution.getFluid(1000))
        .save(provider);

    LARGE_CHEMICAL_RECIPES.recipeBuilder("fluoroniobic_acid_nb_ta_separation_mixture_to_oxypentafluoro_niobate_heptafluoro_tantalate").duration(125).EUt(7680)
        .inputFluids(FluoroniobicAcid.getFluid(10000))
        .inputFluids(NbTaSeparationMixture.getFluid(1000))
        .outputFluids(OxypentafluoroNiobate.getFluid(9000))
        .outputFluids(HeptafluoroTantalate.getFluid(1000))
        .save(provider);


    // (H2NbOF5 + H2TaF7) -> H2NbOF5 + H2TaF7
    LARGE_CHEMICAL_RECIPES.recipeBuilder("nb_ta_fluoride_mix_nb_ta_separation_mixture_to_oxypentafluoro_niobate_heptafluoro_tantalate").duration(125).EUt(7680)
        .inputFluids(NbTaFluorideMix.getFluid(2000))
        .inputFluids(NbTaSeparationMixture.getFluid(200))
        .outputFluids(OxypentafluoroNiobate.getFluid(1000))
        .outputFluids(HeptafluoroTantalate.getFluid(1000))
        .save(provider);


    // 10HTaF7 -> H2NbOF5 + 9H2TaF7
    LARGE_CHEMICAL_RECIPES.recipeBuilder("fluorotantalic_acid_nb_ta_separation_mixture_to_oxypentafluoro_niobate_heptafluoro_tantalate").duration(125).EUt(7680)
        .inputFluids(FluorotantalicAcid.getFluid(10000))
        .inputFluids(NbTaSeparationMixture.getFluid(1000))
        .outputFluids(OxypentafluoroNiobate.getFluid(1000))
        .outputFluids(HeptafluoroTantalate.getFluid(9000))
        .save(provider);


    // H2NbOF5 + 2KF -> K2NbF7 + H2O
    CHEMICAL_RECIPES.recipeBuilder("oxypentafluoro_niobate_potassium_fluoride_to_potasssium_fluoro_niobate_water").duration(170).EUt(120)
        .inputFluids(OxypentafluoroNiobate.getFluid(1000))
        .inputDust(PotassiumFluoride, 4)
        .outputItems(ChemicalHelper.get(dust, PotasssiumFluoroNiobate, 10))
        .outputFluids(Water.getFluid(1000))
        .save(provider);


    // H2TaF7 + 2KOH -> K2TaF7 + 2H2O
    CHEMICAL_RECIPES.recipeBuilder("heptafluoro_tantalate_potassium_hydroxide_to_potasssium_fluoro_tantalate_water").duration(170).EUt(120)
        .inputFluids(HeptafluoroTantalate.getFluid(1000))
        .inputFluids(PotassiumHydroxide.getFluid(2000))
        .outputItems(ChemicalHelper.get(dust, PotasssiumFluoroTantalate, 10))
        .outputFluids(Water.getFluid(2000))
        .save(provider);


    // LiOH(H2O) + HF -> LiF + 2H2O
    CHEMICAL_RECIPES.recipeBuilder("lithium_hydroxide_solution_hydrofluoric_acid_to_lithium_fluoride_water").duration(200)
        .inputFluids(LithiumHydroxideSolution.getFluid(1000))
        .inputFluids(HydrofluoricAcid.getFluid(1000))
        .outputDust(LithiumFluoride, 2)
        .outputFluids(Water.getFluid(2000))
        .save(provider);


    // Na + F -> NaF
    CHEMICAL_RECIPES.recipeBuilder("sodium_fluorine_to_sodium_fluoride").duration(200)
        .inputDust(Sodium)
        .inputFluids(Fluorine.getFluid(1000))
        .outputDust(SodiumFluoride, 2)
        .save(provider);


    // K + F -> KF
    CHEMICAL_RECIPES.recipeBuilder("potassium_fluorine_to_potassium_fluoride").duration(200)
        .inputDust(Potassium)
        .inputFluids(Fluorine.getFluid(1000))
        .outputDust(PotassiumFluoride, 2)
        .save(provider);


    // Be + 2F -> BeF2
    CHEMICAL_RECIPES.recipeBuilder("beryllium_fluorine_to_beryllium_fluoride").duration(30)
        .inputDust(Beryllium)
        .inputFluids(Fluorine.getFluid(2000))
        .outputDust(BerylliumFluoride, 3)
        .save(provider);


// FIBER CHEMISTRY =============================================================================================

    // Zr + 4F -> ZrF4
    CHEMICAL_RECIPES.recipeBuilder("zirconium_fluorine_to_zirconium_tetrafluoride").duration(100)
        .inputDust(Zirconium)
        .inputFluids(Fluorine.getFluid(4000))
        .outputItems(ChemicalHelper.get(dust, ZirconiumTetrafluoride, 5))
        .save(provider);


    // Ba + 2F -> BaF2
    CHEMICAL_RECIPES.recipeBuilder("barium_fluorine_to_barium_difluoride").duration(100)
        .inputDust(Barium)
        .inputFluids(Fluorine.getFluid(2000))
        .outputItems(ChemicalHelper.get(dust, BariumDifluoride, 3))
        .save(provider);


    // La + 3F -> LaF3
    CHEMICAL_RECIPES.recipeBuilder("lanthanum_fluorine_to_lanthanum_trifluoride").duration(100)
        .inputDust(Lanthanum)
        .inputFluids(Fluorine.getFluid(3000))
        .outputItems(ChemicalHelper.get(dust, LanthanumTrifluoride, 4))
        .save(provider);


    // Al + 3F -> AlF3
    CHEMICAL_RECIPES.recipeBuilder("aluminium_fluorine_to_aluminium_trifluoride").duration(100)
        .inputDust(Aluminium)
        .inputFluids(Fluorine.getFluid(3000))
        .outputItems(ChemicalHelper.get(dust, AluminiumTrifluoride, 4))
        .save(provider);


    // Er + 3F -> ErF3
    CHEMICAL_RECIPES.recipeBuilder("erbium_fluorine_to_erbium_trifluoride").duration(100)
        .inputDust(Erbium)
        .inputFluids(Fluorine.getFluid(3000))
        .outputItems(ChemicalHelper.get(dust, ErbiumTrifluoride, 4))
        .save(provider);


    // Si + 4F -> SiF4
    CHEMICAL_RECIPES.recipeBuilder("silicon_fluorine_to_silicon_fluoride").duration(150).EUt(480)
        .inputDust(Silicon)
        .inputFluids(Fluorine.getFluid(4000))
        .outputFluids(SiliconFluoride.getFluid(1000))
        .save(provider);


    // LASER CHEMISTRY =============================================================================================

    // SiF4 + 2HF -> H2SiF6
    CHEMICAL_RECIPES.recipeBuilder("silicon_fluoride_hydrofluoric_acid_to_fluorosilicic_acid").duration(210).EUt(480)
        .inputFluids(SiliconFluoride.getFluid(1000))
        .inputFluids(HydrofluoricAcid.getFluid(2000))
        .outputFluids(FluorosilicicAcid.getFluid(1000))
        .save(provider);


    // H2SiF6 + 6NH3 + 2H2O -> SiO2 + 6NH4F
    CHEMICAL_RECIPES.recipeBuilder("fluorosilicic_acid_ammonia_water_to_silicon_dioxide_ammonium_fluoride").duration(320).EUt(480)
        .inputFluids(FluorosilicicAcid.getFluid(1000))
        .inputFluids(Ammonia.getFluid(6000))
        .inputFluids(Water.getFluid(2000))
        .outputDust(SiliconDioxide, 3)
        .outputFluids(AmmoniumFluoride.getFluid(6000))
        .save(provider);


    // 2Na + O -> Na2O
    CHEMICAL_RECIPES.recipeBuilder("sodium_oxygen_to_sodium_oxide").duration(60).EUt(30)
        .circuitMeta(1)
        .inputDust(Sodium, 2)
        .inputFluids(Oxygen.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, SodiumOxide, 3))
        .save(provider);


    // 3Y2O3 + Lu2O3 + Tm2O3 + 30HCl -> [6YCl3 + 2LuCl3 + 2TmCl3 + 15H2O]
    LARGE_CHEMICAL_RECIPES.recipeBuilder("yttrium_oxide_lutetium_oxide_thulium_oxide_hydrochloric_acid_to_lu_tm_y_chloride_solution").duration(280).EUt(15360)
        .inputDust(YttriumOxide, 15)
        .inputDust(LutetiumOxide, 5)
        .inputDust(ThuliumOxide, 5)
        .inputFluids(HydrochloricAcid.getFluid(30000))
        .outputFluids(LuTmYChlorideSolution.getFluid(30000))
        .save(provider);


    // NaVO3 + NH4Cl + H2O -> NH4VO3 + NaCl(H2O)
    CHEMICAL_RECIPES.recipeBuilder("sodium_metavanadate_water_ammonium_chloride_to_ammonium_vanadate_salt_water").duration(80).EUt(120)
        .inputDust(SodiumMetavanadate, 5)
        .inputFluids(Water.getFluid(1000))
        .inputFluids(AmmoniumChloride.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, AmmoniumVanadate, 9))
        .outputFluids(SaltWater.getFluid(1000))
        .save(provider);


    // [6YCl3 + 2LuCl3 + 2TmCl3 + 15H2O] + Na3VO4 + 2CH4N2O -> LuTmYVO Precipitate + 0.9Cl
    CHEMICAL_RECIPES.recipeBuilder("lu_tm_y_chloride_solution_pure_sodium_vanadate_urea_to_chlorine_lu_tm_yvo_precipitate").duration(320).EUt(480)
        .inputFluids(LuTmYChlorideSolution.getFluid(1000))
        .inputDust(PureSodiumVanadate, 8)
        .inputDust(Urea, 16)
        .outputFluids(Chlorine.getFluid(900))
        .outputItems(ChemicalHelper.get(dust, LuTmYVOPrecipitate))
        .save(provider);


    // COMPONENTS CHEMISTRY ========================================================================================

    // Nb + 5Cl -> NbCl5
    CHEMICAL_RECIPES.recipeBuilder("niobium_chlorine_to_niobium_chloride").duration(290).EUt(120)
        .inputDust(Niobium)
        .inputFluids(Chlorine.getFluid(5000))
        .outputItems(ChemicalHelper.get(dust, NiobiumChloride, 6))
        .save(provider);


    // 5NaOH + NbCl5 -> 5NaCl + H5NbO5
    LARGE_CHEMICAL_RECIPES.recipeBuilder("sodium_hydroxide_niobium_chloride_to_salt_niobium_hydroxide").duration(200).EUt(120)
        .inputDust(SodiumHydroxide, 15)
        .inputDust(NiobiumChloride, 6)
        .outputDust(Salt, 10)
        .outputItems(ChemicalHelper.get(dust, NiobiumHydroxide, 11))
        .save(provider);


    // 2H5NbO5 + 5C2H2O4 + NH3 + Na -> 9H2O + [C10Nb2O20 + NH4] + NaOH
    CHEMICAL_RECIPES.recipeBuilder("niobium_hydroxide_sodium_ammonia_oxalic_acid_to_sodium_hydroxide_water_ammonium_niobium_oxalate_solution").duration(140).EUt(480)
        .inputDust(NiobiumHydroxide, 22)
        .inputDust(Sodium)
        .inputFluids(Ammonia.getFluid(1000))
        .inputFluids(OxalicAcid.getFluid(5000))
        .outputDust(SodiumHydroxide, 3)
        .outputFluids(Water.getFluid(9000))
        .outputFluids(AmmoniumNiobiumOxalateSolution.getFluid(1000))
        .save(provider);


    // MgO + NH4HF2 -> MgF2 + NH3 + H2O
    CHEMICAL_RECIPES.recipeBuilder("magnesia_ammonium_bifluoride_to_magnesium_fluoride_ammonia_water").duration(100).EUt(120)
        .inputDust(Magnesia, 2)
        .inputDust(AmmoniumBifluoride, 8)
        .outputItems(ChemicalHelper.get(dust, MagnesiumFluoride, 3))
        .outputFluids(Ammonia.getFluid(1000))
        .outputFluids(Water.getFluid(1000))
        .save(provider);


    // C2H7NO + NH3 -> C2H8N2 + H2O
    CHEMICAL_RECIPES.recipeBuilder("ethanolamine_ammonia_to_ethylenediamine_water").duration(180).EUt(120)
        .inputFluids(Ethanolamine.getFluid(1000))
        .inputFluids(Ammonia.getFluid(1000))
        .outputFluids(Ethylenediamine.getFluid(1000))
        .outputFluids(Water.getFluid(1000))
        .notConsumable(dust, Palladium)
        .save(provider);


    // 2C2H8N2 + 24CH2O + 8HCl + 8NaCN + 6O -> [3[C10H16N2O8 + C2H8N2 + 2O] + 8NaCl]
    LARGE_CHEMICAL_RECIPES.recipeBuilder("ethylenediamine_formaldehyde_hydrochloric_acid_sodium_cyanide_oxygen_to_edta_solution").duration(250).EUt(7680)
        .inputFluids(Ethylenediamine.getFluid(2000))
        .inputFluids(Formaldehyde.getFluid(24000))
        .inputFluids(HydrochloricAcid.getFluid(8000))
        .inputFluids(SodiumCyanide.getFluid(8000))
        .inputFluids(Oxygen.getFluid(6000))
        .outputFluids(EDTASolution.getFluid(15000))
        .save(provider);

    // C2H5NO2 + CH4 + 2 Br + 2 CsOH -> 2 [CsBr + H2O] + C3H7NO2
//    LARGE_CHEMICAL_RECIPES.recipeBuilder("caesium_hydroxide_glycine_methane_bromine_to_cesium_bromide_solution_sarcosine").duration(100).EUt(480)
//        .notConsumable(WHITE_HALIDE_LAMP.asStack())
//        .inputDust(CaesiumHydroxide, 6)
//        .inputFluids(Glycine.getFluid(1000))
//        .inputFluids(Methane.getFluid(1000))
//        .inputFluids(Bromine.getFluid(2000))
//        .outputFluids(CesiumBromideSolution.getFluid(2000))
//        .outputItems(ChemicalHelper.get(dust, Sarcosine, 13))
//        .save(provider);


// 2Pr + H2SO4 -> Pr2O3 + H2S + O
    CHEMICAL_RECIPES.recipeBuilder("praseodymium_sulfuric_acid_to_praseodymium_oxide_hydrogen_sulfide_oxygen").duration(100).EUt(480)
        .inputDust(Praseodymium, 2)
        .inputFluids(SulfuricAcid.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, PraseodymiumOxide, 5))
        .outputFluids(HydrogenSulfide.getFluid(1000))
        .outputFluids(Oxygen.getFluid(1000))
        .save(provider);


    // 2Ho + H2SO4 -> Ho2O3 + H2S + O
    CHEMICAL_RECIPES.recipeBuilder("holmium_sulfuric_acid_to_holmium_oxide_hydrogen_sulfide_oxygen").duration(100).EUt(480)
        .inputDust(Holmium, 2)
        .inputFluids(SulfuricAcid.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, HolmiumOxide, 5))
        .outputFluids(HydrogenSulfide.getFluid(1000))
        .outputFluids(Oxygen.getFluid(1000))
        .save(provider);


    // 2Nd + H2SO4 -> Nd2O3 + H2S + O
    CHEMICAL_RECIPES.recipeBuilder("neodymium_sulfuric_acid_to_neodymium_oxide_hydrogen_sulfide_oxygen").duration(100).EUt(480)
        .inputDust(Neodymium, 2)
        .inputFluids(SulfuricAcid.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, NeodymiumOxide, 5))
        .outputFluids(HydrogenSulfide.getFluid(1000))
        .outputFluids(Oxygen.getFluid(1000))
        .save(provider);


    // 2Y + H2SO4 -> Y2O3 + H2S + O
    CHEMICAL_RECIPES.recipeBuilder("yttrium_sulfuric_acid_to_yttrium_oxide_hydrogen_sulfide_oxygen").duration(100).EUt(480)
        .inputDust(Yttrium, 2)
        .inputFluids(SulfuricAcid.getFluid(1000))
        .outputDust(YttriumOxide, 5)
        .outputFluids(HydrogenSulfide.getFluid(1000))
        .outputFluids(Oxygen.getFluid(1000))
        .save(provider);


    // 3Y2O3 + Pr2O3 + Ho2O3 + 30HNO3 -> [6Y(NO3)3 + 2Pr(NO3)3 + 2Ho(NO3)3 + 15H2O]
    LARGE_CHEMICAL_RECIPES.recipeBuilder("yttrium_oxide_praseodymium_oxide_holmium_oxide_nitric_acid_to_pr_y_ho_nitrate_solution").duration(280).EUt(15360)
        .inputDust(YttriumOxide, 15)
        .inputDust(PraseodymiumOxide, 5)
        .inputDust(HolmiumOxide, 5)
        .inputFluids(NitricAcid.getFluid(30000))
        .outputFluids(PrYHoNitrateSolution.getFluid(30000))
        .save(provider);


    // Be + LiF + 2NH4HF2 + CO + [6Y(NO3)3 + 2Pr(NO3)3 + 2Nd(NO3)3 + 15H2O] -> 2PrHoYLF Nanoparticles + 2NH4NO3 + 2HF + BeF2 + CO2
    LARGE_CHEMICAL_RECIPES.recipeBuilder("lithium_fluoride_beryllium_ammonium_bifluoride_pr_y_ho_nitrate_solution_carbon_monoxide_cetane_trimethyl_ammonium_bromide_edta_to_pr_ho_ylf_nanoparticles_beryllium_fluoride_ammonium_nitrate_hydrofluoric_acid_carbon_dioxide").duration(200).EUt(7680)
        .inputDust(LithiumFluoride, 2)
        .inputDust(Beryllium)
        .inputDust(AmmoniumBifluoride, 16)
        .inputFluids(PrYHoNitrateSolution.getFluid(2000))
        .inputFluids(CarbonMonoxide.getFluid(1000))
        .inputFluids(CetaneTrimethylAmmoniumBromide.getFluid(0))
        .inputFluids(EDTA.getFluid(0))
        .outputItems(ChemicalHelper.get(dust, PrHoYLFNanoparticles, 2))
        .outputDust(BerylliumFluoride, 3)
        .outputFluids(AmmoniumNitrate.getFluid(2000))
        .outputFluids(HydrofluoricAcid.getFluid(2000))
        .outputFluids(CarbonDioxide.getFluid(1000))
        .save(provider);

// 3C4H10O + NH3 -> C12H27N + 3H2O
    CHEMICAL_RECIPES.recipeBuilder("butanol_gas_ammonia_to_tributylamine_water").duration(140).EUt(480)
        .inputFluids(ButanolGas.getFluid(3000))
        .inputFluids(Ammonia.getFluid(1000))
        .notConsumable(dust, Zeolite)
        .outputFluids(Tributylamine.getFluid(1000))
        .outputFluids(Water.getFluid(3000))
        .save(provider);


    // Al2O3 + 6HNO3 -> 2Al(NO3)3 + 3H2O
    CHEMICAL_RECIPES.recipeBuilder("alumina_nitric_acid_to_aluminium_nitrate_water").duration(190).EUt(30)
        .inputDust(Alumina, 5)
        .inputFluids(NitricAcid.getFluid(6000))
        .outputItems(ChemicalHelper.get(dust, AluminiumNitrate, 26))
        .outputFluids(Water.getFluid(3000))
        .save(provider);


    // 2Al(NO3)3 + CH2Cl2 + C12H27N -> [2Al(NO3)3 + CH2Cl2 + C12H27N]
    CHEMICAL_RECIPES.recipeBuilder("aluminium_nitrate_dichloromethane_tributylamine_to_crude_alumina_solution").duration(290).EUt(120)
        .inputDust(AluminiumNitrate, 26)
        .inputFluids(Dichloromethane.getFluid(1000))
        .inputFluids(Tributylamine.getFluid(1000))
        .outputFluids(CrudeAluminaSolution.getFluid(1000))
        .save(provider);


    // [2Al(NO3)3 + CH2Cl2 + C12H27N] + C12H27N + H2O2 -> [Al2O3 + CH2Cl2 + 2C12H27N] + 2HNO3 + NO2
    LARGE_CHEMICAL_RECIPES.recipeBuilder("crude_alumina_solution_tributylamine_hydrogen_peroxide_to_alumina_solution_nitric_acid_nitrogen_dioxide").duration(210).EUt(480)
        .inputFluids(CrudeAluminaSolution.getFluid(1000))
        .inputFluids(Tributylamine.getFluid(1000))
        .inputFluids(HydrogenPeroxide.getFluid(1000))
        .outputFluids(AluminaSolution.getFluid(1000))
        .outputFluids(NitricAcid.getFluid(2000))
        .outputFluids(NitrogenDioxide.getFluid(1000))
        .save(provider);


    // 5NH3 + 5HCN + 3H2SO4 + 2KMnO4 -> 3H2O + 2MnSO4 + K2SO4 + 5NH4CNO
    LARGE_CHEMICAL_RECIPES.recipeBuilder("ammonia_hydrogen_cyanide_sulfuric_acid_potassium_permanganate_to_water_manganese_sulfate_potassium_sulfate_ammonium_cyanate").duration(220).EUt(480)
        .inputFluids(Ammonia.getFluid(5000))
        .inputFluids(HydrogenCyanide.getFluid(5000))
        .inputFluids(SulfuricAcid.getFluid(3000))
        .inputDust(PotassiumPermanganate, 12)
        .outputFluids(Water.getFluid(3000))
        .outputItems(ChemicalHelper.get(dust, ManganeseSulfate, 12))
        .outputItems(ChemicalHelper.get(dust, PotassiumSulfate, 7))
        .outputFluids(AmmoniumCyanate.getFluid(5000))
        .save(provider);

    CHEMICAL_RECIPES.recipeBuilder("methanol_to_dimethylether_water").duration(160).EUt(8000) //2CH4O -> CH3OCH3 + H2O
        .inputFluids(Methanol.getFluid(2000))
        .notConsumable(ChemicalHelper.get(dust, Alumina, 1))
        .notConsumable(dust, SiliconDioxide)
        .outputFluids(Dimethylether.getFluid(1000))
        .outputFluids(Water.getFluid(1000))
        .save(provider);

    CHEMICAL_RECIPES.recipeBuilder("dimethylether_ethylene_oxide_to_dimethoxyethane").duration(160).EUt(2000) //CH3OCH3 + C2H4O -> C4H10O2
        .inputFluids(Dimethylether.getFluid(1000))
        .inputFluids(EthyleneOxide.getFluid(1000))
        .outputFluids(Dimethoxyethane.getFluid(1000))
        .save(provider);

    CHEMICAL_RECIPES.recipeBuilder("cyclopentadiene_dimethoxyethane_butyl_lithium_to_butane_lithium_cyclopentadienide").duration(160).EUt(2000) //C5H6 + LiC4H9 -> LiC5H5 + C4H10
        .inputFluids(Cyclopentadiene.getFluid(1000))
        .inputFluids(Dimethoxyethane.getFluid(500))
        .inputFluids(ButylLithium.getFluid(1000))
        .outputFluids(Butane.getFluid(1000))
        .outputFluids(LithiumCyclopentadienide.getFluid(1000))
        .save(provider);

    CHEMICAL_RECIPES.recipeBuilder("hydrochloric_acid_californium_trioxide_to_californium_trichloride_water").duration(240).EUt(2000) //6HCl + Cf2O3 -> 2CfCl3 + 3H2O
        .inputFluids(HydrochloricAcid.getFluid(6000))
        .inputDust(CaliforniumTrioxide, 5)
        .outputItems(ChemicalHelper.get(dust, CaliforniumTrichloride, 8))
        .outputFluids(Water.getFluid(3000))
        .save(provider);

    CHEMICAL_RECIPES.recipeBuilder("lithium_cyclopentadienide_californium_trichloride_to_lithium_chloride_californium_cyclopentadienide").duration(160).EUt(200000) //3LiC5H5 + CfCl3 -> CfC15H15 + 3LiCf
        .inputFluids(LithiumCyclopentadienide.getFluid(3000))
        .inputDust(CaliforniumTrichloride, 4)
        .outputItems(ChemicalHelper.get(dust, LithiumChloride, 6))
        .outputFluids(CaliforniumCyclopentadienide.getFluid(1000))
        .save(provider);


    // Na2B4O7(H2O)10 + 2HCl -> 4H3BO3 + 5H2O + 2NaCl
    CHEMICAL_RECIPES.recipeBuilder("borax_hydrochloric_acid_to_boric_acid_water_salt")
        .inputDust(Borax, 23)
        .inputFluids(HydrochloricAcid.getFluid(2000))
        .outputFluids(BoricAcid.getFluid(4000))
        .outputFluids(Water.getFluid(5000))
        .outputDust(Salt, 4)
        .EUt(120)
        .duration(150)
        .save(provider);


    // H3BO3 + 4HF -> HBF4 + 3H2O
    CHEMICAL_RECIPES.recipeBuilder("boric_acid_hydrofluoric_acid_to_fluoro_boric_acid_water")
        .inputFluids(BoricAcid.getFluid(1000))
        .inputFluids(HydrofluoricAcid.getFluid(4000))
        .outputFluids(FluoroBoricAcid.getFluid(1000))
        .outputFluids(Water.getFluid(3000))
        .EUt(120)
        .duration(100)
        .save(provider);

    LARGE_CHEMICAL_RECIPES.recipeBuilder("cobalt_charcoal_polybenzimidazole_acetylene_steam_to_hydrogen_carbon_monoxide_co_ac_ab_catalyst")
        .inputDust(Cobalt)
        .inputDust(Charcoal, 2)
        .inputItems(plate, Polybenzimidazole)
        .inputFluids(Acetylene.getFluid(1000))
        .inputFluids(Steam.getFluid(1000))
        .outputFluids(Hydrogen.getFluid(4000))
        .outputFluids(CarbonMonoxide.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, CoAcABCatalyst))
        .EUt(500000)
        .duration(10)
        .save(provider);


    // NaNO3(H2O) -> NaNO2 + H2O + O
    CHEMICAL_RECIPES.recipeBuilder("sodium_nitrate_solution_to_sodium_nitrite_oxygen_water")
        .inputFluids(SodiumNitrateSolution.getFluid(1000))
        .notConsumable(ChemicalHelper.get(dust, CoAcABCatalyst))
        .outputItems(ChemicalHelper.get(dust, SodiumNitrite, 4))
        .outputFluids(Oxygen.getFluid(1000))
        .outputFluids(Water.getFluid(1000))
        .EUt(30)
        .duration(300)
        .save(provider);


    // HBF4 + HCl + C6H5NH2 + NaNO2 -> NaCl + C6H5BF4N2 + 2H2O
    CHEMICAL_RECIPES.recipeBuilder("fluoro_boric_acid_hydrochloric_acid_aniline_sodium_nitrite_to_salt_benzenediazonium_tetrafluoroborate_water")
        .inputFluids(FluoroBoricAcid.getFluid(1000))
        .inputFluids(HydrochloricAcid.getFluid(1000))
        .inputFluids(Aniline.getFluid(1000))
        .inputDust(SodiumNitrite, 4)
        .outputDust(Salt, 2)
        .outputFluids(BenzenediazoniumTetrafluoroborate.getFluid(1000))
        .outputFluids(Water.getFluid(2000))
        .duration(130)
        .EUt(30720)
        .save(provider);


    // C6H5F + CH4 + H2SbF7 -> C7H7F + 4HF + SbF3
    CHEMICAL_RECIPES.recipeBuilder("fluoro_benzene_methane_fluoroantimonic_acid_to_fluorotoluene_hydrofluoric_acid_antimony_trifluoride")
        .inputFluids(FluoroBenzene.getFluid(1000))
        .inputFluids(Methane.getFluid(1000))
        .inputFluids(FluoroantimonicAcid.getFluid(1000))
        .outputFluids(Fluorotoluene.getFluid(1000))
        .outputFluids(HydrofluoricAcid.getFluid(4000))
        .outputItems(ChemicalHelper.get(dust, AntimonyTrifluoride, 4))
        .EUt(480)
        .duration(150)
        .save(provider);


    // H2O + 6Cl + C7H7F + C6H5F -> C13H8OF2 + 6HCl
    LARGE_CHEMICAL_RECIPES.recipeBuilder("water_chlorine_fluorotoluene_fluoro_benzene_to_difluorobenzophenone_hydrochloric_acid")
        .inputFluids(Water.getFluid(1000))
        .inputFluids(Chlorine.getFluid(6000))
        .inputFluids(Fluorotoluene.getFluid(1000))
        .inputFluids(FluoroBenzene.getFluid(1000))
        .notConsumable(ChemicalHelper.get(dust, ZnFeAlClCatalyst))
        .outputItems(ChemicalHelper.get(dust, Difluorobenzophenone, 24))
        .outputFluids(HydrochloricAcid.getFluid(6000))
        .EUt(1920)
        .duration(100)
        .save(provider);


    // C6H6O2 + C13H8OF2 + Na2CO3 -> [(OC6H4)3C]n + H2O + 2NaF
    // Not perfectly balanced, but is probably fine
    LARGE_CHEMICAL_RECIPES.recipeBuilder("hydroquinone_difluorobenzophenone_soda_ash_to_polyetheretherketone_water_carbon_dioxide_sodium_fluoride")
        .inputFluids(Hydroquinone.getFluid(1000))
        .inputDust(Difluorobenzophenone, 24)
        .inputDust(SodaAsh, 6)
        .outputFluids(Polyetheretherketone.getFluid(2592))
        .outputFluids(Water.getFluid(1000))
        .outputFluids(CarbonDioxide.getFluid(1000))
        .outputDust(SodiumFluoride, 4)
        .EUt(122880)
        .duration(250)
        .save(provider);


    // C3H6 + C6H6 + 3O -> C3H6O + C6H6O2
    LARGE_CHEMICAL_RECIPES.recipeBuilder("propene_benzene_oxygen_to_acetone_hydroquinone_resorcinol")
        .inputFluids(Propene.getFluid(1000))
        .inputFluids(Benzene.getFluid(1000))
        .inputFluids(Oxygen.getFluid(3000))
        .circuitMeta(1)
        .outputFluids(Acetone.getFluid(1000))
        .outputFluids(Hydroquinone.getFluid(1000))
        .outputFluids(Resorcinol.getFluid(1000))
        .EUt(7860)
        .duration(200)
        .save(provider);

    CHEMICAL_RECIPES.recipeBuilder("fish_oil_steam_potassium_hydroxide_to_soap").duration(160).EUt(2000)
        .inputFluids(FishOil.getFluid(1000))
        .inputFluids(Steam.getFluid(200))
        .inputFluids(PotassiumHydroxide.getFluid(1000))
        .outputFluids(Soap.getFluid(1000))
        .save(provider);

    CHEMICAL_RECIPES.recipeBuilder("seed_oil_steam_potassium_hydroxide_to_soap").duration(160).EUt(2000)
        .inputFluids(SeedOil.getFluid(1000))
        .inputFluids(Steam.getFluid(200))
        .inputFluids(PotassiumHydroxide.getFluid(1000))
        .outputFluids(Soap.getFluid(1000))
        .save(provider);

    CHEMICAL_RECIPES.recipeBuilder("soap_salt_to_glycerol_deglycerated_soap").duration(160).EUt(2000)
        .inputFluids(Soap.getFluid(1000))
        .inputDust(Salt, 1)
        .outputFluids(Glycerol.getFluid(200))
        .outputFluids(DeglyceratedSoap.getFluid(800))
        .save(provider);

    CHEMICAL_RECIPES.recipeBuilder("octane_phosphorus_to_hydrogen_trioctylphosphine").duration(160).EUt(2000) //3C8H18 + P -> 3H + C24H51P
        .inputFluids(Octane.getFluid(3000))
        .inputDust(Phosphorus, 1)
        .outputFluids(Hydrogen.getFluid(3000))
        .outputFluids(Trioctylphosphine.getFluid(1000))
        .save(provider);

    CHEMICAL_RECIPES.recipeBuilder("trioctylphosphine_stearic_acid_selenium_cadmium_to_quantum_dots").duration(160).EUt(500000)
        .inputFluids(Trioctylphosphine.getFluid(1000))
        .inputFluids(StearicAcid.getFluid(1000))
        .inputDust(Selenium, 1)
        .inputDust(Cadmium, 1)
        .outputFluids(QuantumDots.getFluid(1000))
        .save(provider);


    // 3NaCl(H2O) + 2Cl + H2SO4 -> H2SO4(NaCl)3(H2O)3Cl2
    // Formula above multiplied up for simplicity
    CHEMICAL_RECIPES.recipeBuilder("salt_water_chlorine_sulfuric_acid_to_acidic_salt_water")
        .inputFluids(SaltWater.getFluid(1500))
        .inputFluids(Chlorine.getFluid(1000))
        .inputFluids(SulfuricAcid.getFluid(500))
        .outputFluids(AcidicSaltWater.getFluid(3000))
        .EUt(480)
        .duration(180)
        .save(provider);


    // H2SO4Br(H2O)Cl2 + H2O -> H2SO4Br(H2O)2Cl2
    CHEMICAL_RECIPES.recipeBuilder("sulfuric_bromine_solution_steam_to_hot_vapour_mixture")
        .inputFluids(SulfuricBromineSolution.getFluid(2000))
        .inputFluids(Steam.getFluid(1000))
        .outputFluids(HotVapourMixture.getFluid(3000))
        .EUt(480)
        .duration(150)
        .save(provider);


    // CO + C3H6 + 2H -> C4H8O
    CHEMICAL_RECIPES.recipeBuilder("carbon_monoxide_propene_hydrogen_to_butyraldehyde")
        .inputFluids(CarbonMonoxide.getFluid(1000))
        .inputFluids(Propene.getFluid(1000))
        .inputFluids(Hydrogen.getFluid(2000))
        .outputFluids(Butyraldehyde.getFluid(1000))
        .EUt(480)
        .duration(200)
        .save(provider);


    // 2C4H8O + 4H -> C8H18O + H2O
    CHEMICAL_RECIPES.recipeBuilder("butyraldehyde_hydrogen_to_ethyl_hexanol_water")
        .inputFluids(Butyraldehyde.getFluid(2000))
        .inputFluids(Hydrogen.getFluid(4000))
        .outputFluids(EthylHexanol.getFluid(3000))
        .outputFluids(Water.getFluid(1000))
        .EUt(480)
        .duration(200)
        .save(provider);


    // 5C8H18O + 0.5P4O10 -> 2C16H35O4P + 2C4H10O
    CHEMICAL_RECIPES.recipeBuilder("ethyl_hexanol_phosphorous_pentoxide_to_diethylhexyl_phosphoric_acid_butanol")
        .inputFluids(EthylHexanol.getFluid(5000))
        .inputDust(PhosphorousPentoxide, 7)
        .outputFluids(DiethylhexylPhosphoricAcid.getFluid(2000))
        .outputFluids(Butanol.getFluid(2000))
        .EUt(480)
        .duration(200)
        .save(provider);

// [REE] + 3 [NaOH + H2O] + 3 H2O -> [REE(OH)3 + 3 NaOH + 3 H2O] + 3 H
    CHEMICAL_RECIPES.recipeBuilder("rare_earth_sodium_hydroxide_solution_water_to_rare_earth_hydroxides_solution_hydrogen")
        .inputDust(RareEarth)
        .inputFluids(SodiumHydroxideSolution.getFluid(3000))
        .inputFluids(Water.getFluid(3000))
        .outputFluids(RareEarthHydroxidesSolution.getFluid(1000))
        .outputFluids(Hydrogen.getFluid(3000))
        .EUt(480)
        .duration(200)
        .save(provider);


    // 3 HCl + [REE(OH)3 + 3 NaOH] -> ThU + [REECl3 + 3 H2O] + 3 [NaOH + H2O]
    CHEMICAL_RECIPES.recipeBuilder("hydrochloric_acid_rare_earth_hydroxides_solution_to_rare_earth_chlorides_solution_sodium_hydroxide_solution_th_u_sludge")
        .inputFluids(HydrochloricAcid.getFluid(3000))
        .inputFluids(RareEarthHydroxidesSolution.getFluid(1000))
        .outputFluids(RareEarthChloridesSolution.getFluid(3000))
        .outputFluids(SodiumHydroxideSolution.getFluid(3000))
        .outputItems(ChemicalHelper.get(dust, ThUSludge, 2))
        .EUt(480)
        .duration(200)
        .save(provider);


    // CH4 + NH3 + 3O -> HCN + 3H2O
    CHEMICAL_RECIPES.recipeBuilder("methane_ammonia_oxygen_to_hydrogen_cyanide_water")
        .inputFluids(Methane.getFluid(1000))
        .inputFluids(Ammonia.getFluid(1000))
        .inputFluids(Oxygen.getFluid(3000))
        .outputFluids(HydrogenCyanide.getFluid(1000))
        .outputFluids(Water.getFluid(3000))
        .EUt(1920)
        .duration(50)
        .save(provider);


    // 2HCN + O + 2Na -> 2NaCN + H2O
    CHEMICAL_RECIPES.recipeBuilder("hydrogen_cyanide_oxygen_sodium_to_sodium_cyanide_water")
        .inputFluids(HydrogenCyanide.getFluid(2000))
        .inputFluids(Oxygen.getFluid(1000))
        .inputDust(Sodium, 2)
        .outputFluids(SodiumCyanide.getFluid(2000))
        .outputFluids(Water.getFluid(1000))
        .EUt(1920)
        .duration(12)
        .save(provider);


    // MoS2 + NaCN -> AuCN + MoS2(depl.)
    CHEMICAL_RECIPES.recipeBuilder("molybdenite_sodium_cyanide_to_gold_cyanide_gold_deplete_molybdenite")
        .inputDust(Molybdenite, 3)
        .inputFluids(SodiumCyanide.getFluid(1000))
        .outputFluids(GoldCyanide.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, GoldDepleteMolybdenite, 3))
        .EUt(7680)
        .duration(100)
        .save(provider);


    // AuCN + Na -> NaCN + Au
    CHEMICAL_RECIPES.recipeBuilder("gold_cyanide_sodium_to_sodium_cyanide_gold")
        .inputFluids(GoldCyanide.getFluid(1000))
        .inputDust(Sodium)
        .outputFluids(SodiumCyanide.getFluid(1000))
        .outputDust(Gold)
        .EUt(1920)
        .duration(150)
        .save(provider);


    // MoS2 + FeCl3 ->
    CHEMICAL_RECIPES.recipeBuilder("gold_deplete_molybdenite_iron_chloride_to_molybdenum_concentrate_chloride_leached_solution")
        .inputDust(GoldDepleteMolybdenite, 3)
        .inputFluids(IronChloride.getFluid(500))
        .outputItems(ChemicalHelper.get(dust, MolybdenumConcentrate, 4))
        .outputFluids(ChlorideLeachedSolution.getFluid(500))
        .EUt(1920)
        .duration(10)
        .save(provider);


    // FeCl2 + Cl -> FeCl3
    CHEMICAL_RECIPES.recipeBuilder("iron2_chloride_chlorine_to_iron_chloride")
        .inputFluids(Iron2Chloride.getFluid(1000))
        .inputFluids(Chlorine.getFluid(1000))
        .outputFluids(IronChloride.getFluid(1000))
        .EUt(30)
        .duration(150)
        .save(provider);


    // ? + 0.5NH3 -> 3SO2 + 0.5NH4ReO4
    CHEMICAL_RECIPES.recipeBuilder("rhenium_sulfuric_solution_ammonia_to_sulfur_dioxide_ammonium_perrhenate")
        .inputFluids(RheniumSulfuricSolution.getFluid(3000))
        .inputFluids(Ammonia.getFluid(500))
        .outputFluids(SulfurDioxide.getFluid(3000))
        .outputFluids(AmmoniumPerrhenate.getFluid(500))
        .EUt(480)
        .duration(90)
        .save(provider);


    // NH4ReO4 + 7H -> Re + NH3 + 4H2O
    CHEMICAL_RECIPES.recipeBuilder("ammonium_perrhenate_hydrogen_to_rhenium_ammonia_water")
        .inputFluids(AmmoniumPerrhenate.getFluid(1000))
        .inputFluids(Hydrogen.getFluid(7000))
        .outputDust(Rhenium)
        .outputFluids(Ammonia.getFluid(1000))
        .outputFluids(Water.getFluid(4000))
        .EUt(480)
        .duration(110)
        .save(provider);


    // Hg + 2CH3COOH -> C4H6O4Hg + H2
    CHEMICAL_RECIPES.recipeBuilder("mercury_acetic_acid_to_mercury_acetate_hydrogen")
        .inputFluids(Mercury.getFluid(1000))
        .inputFluids(AceticAcid.getFluid(2000))
        .outputItems(ChemicalHelper.get(dust, MercuryAcetate, 15))
        .outputFluids(Hydrogen.getFluid(2000))
        .EUt(480)
        .duration(90)
        .save(provider);


    // C2H4O + CH3NH2 -> C3H9NO
    CHEMICAL_RECIPES.recipeBuilder("ethylene_oxide_methylamine_to_methylethanolamine")
        .inputFluids(EthyleneOxide.getFluid(1000))
        .inputFluids(Methylamine.getFluid(1000))
        .outputFluids(Methylethanolamine.getFluid(1000))
        .EUt(480)
        .duration(90)
        .save(provider);


    // 2HCl + C3H9NO + O + CaCN2 -> C2H7N3 + CH3COOH + CaCl2
    CHEMICAL_PLANT_RECIPES.recipeBuilder("hydrochloric_acid_methylethanolamine_oxygen_calcium_cyanamide_to_methylguanidine_acetic_acid_calcium_chloride")
        .inputFluids(HydrochloricAcid.getFluid(2000))
        .inputFluids(Methylethanolamine.getFluid(1000))
        .inputFluids(Oxygen.getFluid(1000))
        .inputDust(CalciumCyanamide, 4)
        .outputFluids(Methylguanidine.getFluid(1000))
        .outputFluids(AceticAcid.getFluid(1000))
        .outputDust(CalciumChloride, 3)
        .notConsumable(dust, Palladium)
        .notConsumable(ChemicalHelper.get(dust, MercuryAcetate))
        .EUt(480)
        .duration(240)
        .save(provider);


    // C2H7N3 + HNO3 + H2SO4 + HCl + NaNO2 -> 2H2SO4(dil.) + C2H5N5O3 + NaCl
    // Not perfect, but was the best way to try and conserve acids
    CHEMICAL_RECIPES.recipeBuilder("methylguanidine_nitration_mixture_hydrochloric_acid_sodium_nitrite_to_diluted_sulfuric_acid_methylnitronitrosoguanidine_salt")
        .inputFluids(Methylguanidine.getFluid(1000))
        .inputFluids(NitrationMixture.getFluid(2000))
        .inputFluids(HydrochloricAcid.getFluid(1000))
        .inputDust(SodiumNitrite, 4)
        .outputFluids(DilutedSulfuricAcid.getFluid(2000))
        .outputFluids(Methylnitronitrosoguanidine.getFluid(1000))
        .outputDust(Salt, 2)
        .EUt(480)
        .duration(220)
        .save(provider);


    // C8H16 + H2O -> C8H18O
    CHEMICAL_RECIPES.recipeBuilder("oct1ene_water_phosphoric_acid_to_octanol")
        .inputFluids(Oct1ene.getFluid(1000))
        .inputFluids(Water.getFluid(1000))
        .outputFluids(Octanol.getFluid(1000))
        .inputFluids(PhosphoricAcid.getFluid(0))
        .notConsumable(ChemicalHelper.get(dust, PalladiumLoadedRutileNanoparticles))
        .notConsumable(UVA_HALIDE_LAMP.asStack())
        .EUt(30720)
        .duration(110)
        .save(provider);


    // 3C8H18O + NH3 -> 3H2O + C24H51N
    CHEMICAL_RECIPES.recipeBuilder("octanol_ammonia_to_water_trioctylamine")
        .inputFluids(Octanol.getFluid(3000))
        .inputFluids(Ammonia.getFluid(1000))
        .outputFluids(Water.getFluid(3000))
        .outputFluids(Trioctylamine.getFluid(1000))
        .EUt(480)
        .duration(90)
        .save(provider);


    // ? + 5HF -> H2NbOF5
    CHEMICAL_RECIPES.recipeBuilder("purified_columbite_hydrofluoric_acid_to_fluoroniobic_acid")
        .inputDust(PurifiedColumbite)
        .inputFluids(HydrofluoricAcid.getFluid(5000))
        .outputFluids(FluoroniobicAcid.getFluid(1000))
        .EUt(480)
        .duration(180)
        .save(provider);


    // Nb(H2O) + 5HF -> H2NbOF5
    CHEMICAL_RECIPES.recipeBuilder("purified_pyrochlore_hydrofluoric_acid_to_fluoroniobic_acid")
        .inputDust(PurifiedPyrochlore)
        .inputFluids(HydrofluoricAcid.getFluid(5000))
        .outputFluids(FluoroniobicAcid.getFluid(1000))
        .EUt(480)
        .duration(180)
        .save(provider);


    // Re + 3NH3 + H2SO4 -> (NH4)2SO4 + NH4ReO4
    CHEMICAL_RECIPES.recipeBuilder("rhenium_scrubbed_solution_ammonia_sulfuric_acid_to_ammonium_sulfate_ammonium_perrhenate")
        .inputFluids(RheniumScrubbedSolution.getFluid(1000))
        .inputFluids(Ammonia.getFluid(3000))
        .inputFluids(SulfuricAcid.getFluid(1000))
        .outputFluids(AmmoniumSulfate.getFluid(1000))
        .outputFluids(AmmoniumPerrhenate.getFluid(1000))
        .EUt(1920)
        .duration(110)
        .save(provider);


    // Cu + H2SO4 -> CuH2SO4
    CHEMICAL_RECIPES.recipeBuilder("electrically_impure_copper_sulfuric_acid_to_copper_refining_solution").duration(200).EUt(120)
        .inputDust(ElectricallyImpureCopper)
        .inputFluids(SulfuricAcid.getFluid(1000))
        .outputFluids(CopperRefiningSolution.getFluid(1000))
        .save(provider);


    // TeO2SeO2(Na2CO3)2 + H2SO4 -> TeO2 + Na2SO4 + Na2SeO3 + CO2 + H2O
    LARGE_CHEMICAL_RECIPES.recipeBuilder("selenite_tellurite_mix_sulfuric_acid_to_tellurium_oxide_water_sulfur_trioxide_carbon_dioxide_selenite_solution").duration(270).EUt(1920)
        .inputFluids(SeleniteTelluriteMix.getFluid(1000))
        .inputFluids(SulfuricAcid.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, TelluriumOxide, 3))
        .outputFluids(Water.getFluid(1000))
        .outputFluids(SulfurTrioxide.getFluid(1000))
        .outputFluids(CarbonDioxide.getFluid(1000))
        .outputFluids(SeleniteSolution.getFluid(1000))
        .save(provider);


    // SeO2 + 2SO2 -> Se + 2SO3
    CHEMICAL_RECIPES.recipeBuilder("selenium_oxide_sulfur_dioxide_to_selenium_sulfur_trioxide").duration(260).EUt(120)
        .inputDust(SeleniumOxide, 3)
        .inputFluids(SulfurDioxide.getFluid(2000))
        .outputDust(Selenium)
        .outputFluids(SulfurTrioxide.getFluid(2000))
        .save(provider);


    // TeO2 + 2SO2 -> Te + 2SO3
    CHEMICAL_RECIPES.recipeBuilder("tellurium_oxide_sulfur_dioxide_to_tellurium_sulfur_trioxide").duration(260).EUt(120)
        .inputDust(TelluriumOxide, 3)
        .inputFluids(SulfurDioxide.getFluid(2000))
        .outputDust(Tellurium)
        .outputFluids(SulfurTrioxide.getFluid(2000))
        .save(provider);


    // Ti + 2O -> TiO2
    CHEMICAL_RECIPES.recipeBuilder("titanium_oxygen_to_rutile").duration(100).EUt(1920)
        .inputDust(Titanium)
        .inputFluids(Oxygen.getFluid(2000))
        .outputDust(Rutile, 3)
        .save(provider);


    // TiO2 + 4C3H8O -> C12H28O4Ti + 2H2O
    CHEMICAL_RECIPES.recipeBuilder("rutile_isopropyl_alcohol_to_titanium_isopropoxide_water").duration(240).EUt(480)
        .inputDust(Rutile, 3)
        .inputFluids(IsopropylAlcohol.getFluid(4000))
        .outputFluids(TitaniumIsopropoxide.getFluid(1000))
        .outputFluids(Water.getFluid(2000))
        .save(provider);


    // [C4H6BaSrO4 + C12H28O4Ti + H2O + 2C] -> BaO4SrTi + C5H10O2 + 4C3H6 + H2O + CO2
    LARGE_CHEMICAL_RECIPES.recipeBuilder("barium_strontium_titanate_preparation_to_barium_strontium_titanate_isopropyl_acetate_propene_water_carbon_dioxide").duration(250).EUt(480)
        .inputFluids(BariumStrontiumTitanatePreparation.getFluid(2000))
        .outputItems(ChemicalHelper.get(dust, BariumStrontiumTitanate, 7))
        .outputFluids(IsopropylAcetate.getFluid(1000))
        .outputFluids(Propene.getFluid(4000))
        .outputFluids(Water.getFluid(1000))
        .outputFluids(CarbonDioxide.getFluid(1000))
        .save(provider);


    // C5H10O2 + H2O -> C3H8O + CH3COOH
    CHEMICAL_RECIPES.recipeBuilder("isopropyl_acetate_water_to_isopropyl_alcohol_acetic_acid").duration(200).EUt(480)
        .notConsumable(dust, PhosphorousPentoxide)
        .inputFluids(IsopropylAcetate.getFluid(1000))
        .inputFluids(Water.getFluid(1000))
        .outputFluids(IsopropylAlcohol.getFluid(1000))
        .outputFluids(AceticAcid.getFluid(1000))
        .save(provider);


    // 9H2O + 2F7K2Ta -> Ta2O5 + 14HF + 4KOH
    CHEMICAL_RECIPES.recipeBuilder("potasssium_fluoro_tantalate_water_to_tantalum_oxide_hydrofluoric_acid_potassium_hydroxide").duration(130).EUt(120)
        .inputDust(PotasssiumFluoroTantalate, 20)
        .inputFluids(Water.getFluid(9000))
        .outputItems(ChemicalHelper.get(dust, TantalumOxide, 7))
        .outputFluids(HydrofluoricAcid.getFluid(14000))
        .outputFluids(PotassiumHydroxide.getFluid(4000))
        .save(provider);


    // 2Ta + 10Cl + 5H2O -> Ta2O5 + 10HCl
    CHEMICAL_RECIPES.recipeBuilder("tantalum_chlorine_water_to_tantalum_oxide_hydrochloric_acid").duration(480).EUt(120)
        .inputDust(Tantalum, 2)
        .inputFluids(Chlorine.getFluid(10000))
        .inputFluids(Water.getFluid(5000))
        .outputItems(ChemicalHelper.get(dust, TantalumOxide, 7))
        .outputFluids(HydrochloricAcid.getFluid(10000))
        .save(provider);


    // 2Sc + 6Cl + 3H2O -> Sc2O3 + 6HCl
    CHEMICAL_RECIPES.recipeBuilder("scandium_chlorine_water_to_scandium_oxide_hydrochloric_acid").duration(480).EUt(120)
        .inputDust(Scandium, 2)
        .inputFluids(Chlorine.getFluid(6000))
        .inputFluids(Water.getFluid(3000))
        .outputItems(ChemicalHelper.get(dust, ScandiumOxide, 5))
        .outputFluids(HydrochloricAcid.getFluid(6000))
        .save(provider);


    // 2Lu + 6Cl + 3H2O -> Lu2O3 + 6HCl
    CHEMICAL_RECIPES.recipeBuilder("lutetium_chlorine_water_to_lutetium_oxide_hydrochloric_acid").duration(480).EUt(120)
        .inputDust(Lutetium, 2)
        .inputFluids(Chlorine.getFluid(6000))
        .inputFluids(Water.getFluid(3000))
        .outputItems(ChemicalHelper.get(dust, LutetiumOxide, 5))
        .outputFluids(HydrochloricAcid.getFluid(6000))
        .save(provider);


    // 2Tm + 6Cl + 3H2O -> Tm2O3 + 6HCl
    CHEMICAL_RECIPES.recipeBuilder("thulium_chlorine_water_to_thulium_oxide_hydrochloric_acid").duration(480).EUt(120)
        .inputDust(Thulium, 2)
        .inputFluids(Chlorine.getFluid(6000))
        .inputFluids(Water.getFluid(3000))
        .outputItems(ChemicalHelper.get(dust, ThuliumOxide, 5))
        .outputFluids(HydrochloricAcid.getFluid(6000))
        .save(provider);


    // 2Eu + 6Cl + 3H2O -> Eu2O3 + 6HCl
    CHEMICAL_RECIPES.recipeBuilder("europium_chlorine_water_to_europium_oxide_hydrochloric_acid").duration(480).EUt(120)
        .inputDust(Europium, 2)
        .inputFluids(Chlorine.getFluid(6000))
        .inputFluids(Water.getFluid(3000))
        .outputItems(ChemicalHelper.get(dust, EuropiumOxide, 5))
        .outputFluids(HydrochloricAcid.getFluid(6000))
        .save(provider);


    // Pb + Se -> PbSe
    CHEMICAL_RECIPES.recipeBuilder("lead_selenium_to_lead_senenide").duration(240).EUt(120)
        .inputDust(Lead)
        .inputDust(Selenium)
        .outputItems(ChemicalHelper.get(dust, LeadSenenide, 2))
        .save(provider);


    // Zn + Se -> ZnSe
    CHEMICAL_RECIPES.recipeBuilder("zinc_selenium_to_zinc_selenide").duration(240).EUt(120)
        .inputDust(Zinc)
        .inputDust(Selenium)
        .outputItems(ChemicalHelper.get(dust, ZincSelenide, 2))
        .save(provider);


    // C6H5NH2 + NaNO2 + 2HCl + NaI -> 2NaCl + 2N + 2H2O + C6H5I
    LARGE_CHEMICAL_RECIPES.recipeBuilder("aniline_sodium_nitrite_hydrochloric_acid_sodium_iodide_to_salt_nitrogen_water_iodobenzene").duration(220).EUt(480)
        .inputFluids(Aniline.getFluid(1000))
        .inputDust(SodiumNitrite, 4)
        .inputFluids(HydrochloricAcid.getFluid(2000))
        .inputDust(SodiumIodide, 2)
        .outputDust(Salt, 4)
        .outputFluids(Nitrogen.getFluid(2000))
        .outputFluids(Water.getFluid(2000))
        .outputFluids(Iodobenzene.getFluid(1000))
        .save(provider);


    // C6H5I + C8H8 + Cl -> HCl + I + C14H12
    LARGE_CHEMICAL_RECIPES.recipeBuilder("iodobenzene_styrene_chlorine_tributylamine_to_hydrochloric_acid_iodine_stilbene").duration(350).EUt(18000)
        .notConsumable(ChemicalHelper.get(dust, PalladiumAcetate))
        .inputFluids(Iodobenzene.getFluid(1000))
        .inputFluids(Styrene.getFluid(1000))
        .inputFluids(Chlorine.getFluid(1000))
        .inputFluids(Tributylamine.getFluid(0))
        .outputFluids(HydrochloricAcid.getFluid(1000))
        .outputDust(Iodine)
        .outputItems(ChemicalHelper.get(dust, Stilbene, 26))
        .save(provider);


    // C6H6O2 + NH3 -> C6H7NO + H2O
    CHEMICAL_RECIPES.recipeBuilder("resorcinol_ammonia_to_amino3phenol_water").duration(220).EUt(480)
        .inputFluids(Resorcinol.getFluid(1000))
        .inputFluids(Ammonia.getFluid(1000))
        .outputFluids(Amino3phenol.getFluid(1000))
        .outputFluids(Water.getFluid(1000))
        .save(provider);


    // C2H4 + NH3 -> C2H5NH2
    CHEMICAL_RECIPES.recipeBuilder("ethylene_ammonia_to_ethylamine").duration(130).EUt(480)
        .inputFluids(Ethylene.getFluid(1000))
        .inputFluids(Ammonia.getFluid(1000))
        .outputFluids(Ethylamine.getFluid(2000))
        .notConsumable(ChemicalHelper.get(dust, SodiumAzanide))
        .save(provider);


    // 3C2H5NH2 + C6H7NO + 2C8H4O3 + HCl -> 2NH3 + C28H31ClN2O3 + 4O
    LARGE_CHEMICAL_RECIPES.recipeBuilder("ethylamine_amino3phenol_hydrochloric_acid_phthalic_anhydride_to_ammonia_oxygen_rhodamine_b").duration(240).EUt(490000)
        .inputFluids(Ethylamine.getFluid(3000))
        .inputFluids(Amino3phenol.getFluid(1000))
        .inputFluids(HydrochloricAcid.getFluid(1000))
        .inputDust(PhthalicAnhydride, 30)
        .notConsumable(ChemicalHelper.get(dust, TetraethylammoniumNonahydridides))
        .outputFluids(Ammonia.getFluid(2000))
        .outputFluids(Oxygen.getFluid(4000))
        .outputItems(ChemicalHelper.get(dust, RhodamineB, 65))
        .save(provider);


    // Re + 7F + 4H2O + NH3 -> 7HF + NH4ReO4
    LARGE_CHEMICAL_RECIPES.recipeBuilder("rhenium_fluorine_water_ammonia_to_hydrofluoric_acid_ammonium_perrhenate").duration(300).EUt(7680)
        .inputDust(Rhenium)
        .inputFluids(Fluorine.getFluid(7000))
        .inputFluids(Water.getFluid(4000))
        .inputFluids(Ammonia.getFluid(1000))
        .outputFluids(HydrofluoricAcid.getFluid(7000))
        .outputFluids(AmmoniumPerrhenate.getFluid(1000))
        .save(provider);


    // Tc + NaOH + 2HNO3 -> NO2 + H3NO + NaTcO4
    LARGE_CHEMICAL_RECIPES.recipeBuilder("technetium_sodium_hydroxide_nitric_acid_to_nitrogen_dioxide_hydroxylamine_sodium_pertechnetate").duration(300).EUt(480)
        .inputDust(Technetium)
        .inputDust(SodiumHydroxide, 3)
        .inputFluids(NitricAcid.getFluid(2000))
        .outputFluids(NitrogenDioxide.getFluid(1000))
        .outputFluids(Hydroxylamine.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, SodiumPertechnetate, 6))
        .save(provider);


    // KOH + NH4ReO4 -> KReO4 + NH3 + H2O
    CHEMICAL_RECIPES.recipeBuilder("potassium_hydroxide_ammonium_perrhenate_to_potassium_perrhenate_ammonia_water").duration(280).EUt(480)
        .inputFluids(PotassiumHydroxide.getFluid(1000))
        .inputFluids(AmmoniumPerrhenate.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, PotassiumPerrhenate, 6))
        .outputFluids(Ammonia.getFluid(1000))
        .outputFluids(Water.getFluid(1000))
        .save(provider);


    // KReO4 + 18K + 13C2H5OH + 4O -> 4KOH + H9K2ReO4 + 13C2H5KO
    CHEMICAL_RECIPES.recipeBuilder("potassium_perrhenate_potassium_ethanol_oxygen_to_potassium_hydroxide_potassium_nonahydridorhenate_potassium_ethoxide").duration(240).EUt(1920)
        .inputDust(PotassiumPerrhenate, 6)
        .inputDust(Potassium, 18)
        .inputFluids(Ethanol.getFluid(13000))
        .inputFluids(Oxygen.getFluid(4000))
        .outputFluids(PotassiumHydroxide.getFluid(4000))
        .outputItems(ChemicalHelper.get(dust, PotassiumNonahydridorhenate, 16))
        .outputFluids(PotassiumEthoxide.getFluid(13000))
        .save(provider);


    // KTcO4 + 18K + 13C2H5OH + 4O -> 4KOH + H9K2TcO4 + 13C2H5KO
    CHEMICAL_RECIPES.recipeBuilder("potassium_pertechnate_potassium_ethanol_oxygen_to_potassium_hydroxide_potassium_nonahydridotechnetate_potassium_ethoxide").duration(240).EUt(1920)
        .inputDust(PotassiumPertechnate, 6)
        .inputDust(Potassium, 18)
        .inputFluids(Ethanol.getFluid(13000))
        .inputFluids(Oxygen.getFluid(4000))
        .outputFluids(PotassiumHydroxide.getFluid(4000))
        .outputItems(ChemicalHelper.get(dust, PotassiumNonahydridotechnetate, 16))
        .outputFluids(PotassiumEthoxide.getFluid(13000))
        .save(provider);


    // C2H5KO + HCl -> C2H5OH + KCl
    CHEMICAL_RECIPES.recipeBuilder("potassium_ethoxide_hydrochloric_acid_to_ethanol_rock_salt").duration(200).EUt(480)
        .inputFluids(PotassiumEthoxide.getFluid(1000))
        .inputFluids(HydrochloricAcid.getFluid(1000))
        .outputFluids(Ethanol.getFluid(1000))
        .outputDust(RockSalt, 2)
        .save(provider);


    // H9K2ReO4 + H9K2TcO4 + 2C8H20NBr + 2Br -> 4KBr + [C8H20NH9ReO4 + C8H20NH9TcO4]
    LARGE_CHEMICAL_RECIPES.recipeBuilder("potassium_nonahydridorhenate_potassium_nonahydridotechnetate_tetraethylammonium_bromide_bromine_to_potassium_bromide_tetraethylammonium_nonahydridides").duration(360).EUt(15310)
        .inputDust(PotassiumNonahydridorhenate, 16)
        .inputDust(PotassiumNonahydridotechnetate, 16)
        .inputFluids(TetraethylammoniumBromide.getFluid(2000))
        .inputFluids(Bromine.getFluid(2000))
        .outputItems(ChemicalHelper.get(dust, PotassiumBromide, 8))
        .outputItems(ChemicalHelper.get(dust, TetraethylammoniumNonahydridides, 86))
        .save(provider);


    // KI + C6H7NO + C4H9Li -> C10H15N + KOH + LiI
    CHEMICAL_RECIPES.recipeBuilder("potassium_iodide_aminophenol_butyl_lithium_to_butylaniline_potassium_hydroxide_lithium_iodide").duration(200).EUt(480)
        .inputDust(PotassiumIodide, 2)
        .inputFluids(Aminophenol.getFluid(1000))
        .inputFluids(ButylLithium.getFluid(1000))
        .outputFluids(Butylaniline.getFluid(1000))
        .outputFluids(PotassiumHydroxide.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, LithiumIodide, 2))
        .save(provider);


    // NaH + C3H9SiCl -> C3H10Si + NaCl
    CHEMICAL_RECIPES.recipeBuilder("sodium_hydride_trimethylchlorosilane_to_trimethylsilane_salt").duration(170).EUt(1920)
        .inputDust(SodiumHydride, 2)
        .inputFluids(Trimethylchlorosilane.getFluid(1000))
        .outputFluids(Trimethylsilane.getFluid(1000))
        .outputDust(Salt, 2)
        .save(provider);


    // K + Br -> KBr
    CHEMICAL_RECIPES.recipeBuilder("potassium_bromine_to_potassium_bromide").duration(240).EUt(120)
        .inputDust(Potassium)
        .inputFluids(Bromine.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, PotassiumBromide, 2))
        .save(provider);


    // KBr + O3 -> KBrO3
    CHEMICAL_RECIPES.recipeBuilder("potassium_bromide_ozone_to_potassium_bromate").duration(200).EUt(480)
        .inputDust(PotassiumBromide, 2)
        .inputFluids(Ozone.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, PotassiumBromate, 5))
        .save(provider);


    // C8H4O3 + NaI + NaNO2 + [NaOH + H2O] + NH3 + HCl + 2Cl -> C7H5IO2 + N2 + CO2 + 3[H2O + NaCl]
    CHEMICAL_PLANT_RECIPES.recipeBuilder("phthalic_anhydride_sodium_iodide_sodium_nitrite_sodium_hydroxide_solution_ammonia_hydrochloric_acid_chlorine_to_iodobenzoic_acid_nitrogen_carbon_dioxide_salt_water").duration(350).EUt(122880)
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


    // 3C7H5IO2 + H2SO4 + 2O -> H2S + 3C7H5IO4
    CHEMICAL_RECIPES.recipeBuilder("iodobenzoic_acid_sulfuric_acid_oxygen_to_hydrogen_sulfide_ibx").duration(200).EUt(1920)
        .notConsumable(ChemicalHelper.get(dust, PotassiumBromate))
        .inputFluids(IodobenzoicAcid.getFluid(3000))
        .inputFluids(SulfuricAcid.getFluid(1000))
        .inputFluids(Oxygen.getFluid(2000))
        .outputFluids(HydrogenSulfide.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, IBX, 51))
        .save(provider);


    // C3H10Si + C6H5Cl + 2CH2O + C7H5IO4 -> 2H + (CH3)3SiCl + C8H8O2 + C7H5IO4
    LARGE_CHEMICAL_RECIPES.recipeBuilder("trimethylsilane_chlorobenzene_formaldehyde_ibx_to_trimethylchlorosilane_methoxybenzaldehyde_iodobenzoic_acid_hydrogen").duration(250).EUt(7680)
        .inputFluids(Trimethylsilane.getFluid(1000))
        .inputFluids(Chlorobenzene.getFluid(1000))
        .inputFluids(Formaldehyde.getFluid(2000))
        .inputDust(IBX, 17)
        .notConsumable(dust, CobaltOxide)
        .outputFluids(Trimethylchlorosilane.getFluid(1000))
        .outputFluids(Methoxybenzaldehyde.getFluid(1000))
        .outputFluids(IodobenzoicAcid.getFluid(1000))
        .outputFluids(Hydrogen.getFluid(2000))
        .save(provider);


    // C8H8O2 + C10H15N -> C18H21NO + H2O
    CHEMICAL_RECIPES.recipeBuilder("methoxybenzaldehyde_butylaniline_to_mbba_water").duration(190).EUt(122880)
        .inputFluids(Methoxybenzaldehyde.getFluid(1000))
        .inputFluids(Butylaniline.getFluid(1000))
        .notConsumable(ChemicalHelper.get(dust, TetraethylammoniumNonahydridides))
        .outputFluids(MBBA.getFluid(1000))
        .outputFluids(Water.getFluid(1000))
        .save(provider);


    // PdCl2 + 2CH3COOH -> C4H6O4Pd + 2HCl
    CHEMICAL_RECIPES.recipeBuilder("palladium_chloride_acetic_acid_to_palladium_acetate_hydrochloric_acid").duration(260).EUt(480)
        .inputDust(PalladiumChloride, 3)
        .inputFluids(AceticAcid.getFluid(2000))
        .outputItems(ChemicalHelper.get(dust, PalladiumAcetate, 15))
        .outputFluids(HydrochloricAcid.getFluid(2000))
        .save(provider);


    // I + Cl -> ICl
    CHEMICAL_RECIPES.recipeBuilder("iodine_chlorine_to_iodine_monochloride").duration(240).EUt(120)
        .inputDust(Iodine)
        .inputFluids(Chlorine.getFluid(1000))
        .outputFluids(IodineMonochloride.getFluid(1000))
        .save(provider);


    // Mg + 2Cl -> MgCl2
    CHEMICAL_RECIPES.recipeBuilder("magnesium_chlorine_to_magnesium_chloride").duration(50).EUt(120)
        .inputDust(Magnesium)
        .inputFluids(Chlorine.getFluid(2000))
        .outputDust(MagnesiumChloride, 3)
        .save(provider);


    // 2MgCl2 + 3C2H2 + (CH3)3SiCl + 2Br -> 3HCl + C9H12Si(MgBr)2 + 2Cl
    LARGE_CHEMICAL_RECIPES.recipeBuilder("magnesium_chloride_acetylene_trimethylchlorosilane_bromine_to_hydrochloric_acid_acetylating_reagent_chlorine").duration(350).EUt(480)
        .inputDust(MagnesiumChloride, 6)
        .inputFluids(Acetylene.getFluid(3000))
        .inputFluids(Trimethylchlorosilane.getFluid(1000))
        .inputFluids(Bromine.getFluid(2000))
        .outputFluids(HydrochloricAcid.getFluid(3000))
        .outputFluids(AcetylatingReagent.getFluid(1000))
        .outputFluids(Chlorine.getFluid(2000))
        .save(provider);


    // C10H8 + 2CH4O -> 2H2O + C12H12
    CHEMICAL_RECIPES.recipeBuilder("naphthalene_methanol_to_water_dimethylnaphthalene").duration(260).EUt(120)
        .inputFluids(Naphthalene.getFluid(1000))
        .inputFluids(Methanol.getFluid(2000))
        .outputFluids(Water.getFluid(2000))
        .outputFluids(Dimethylnaphthalene.getFluid(1000))
        .save(provider);


    // C12H12 + C9H12Si(MgBr)2 + ICl + 2 Cl + C4H4BrNO2 -> 2MgClBr + H2C18H11I + (CH3)3SiCl  + HBr + C4H5NO2
    CHEMICAL_PLANT_RECIPES.recipeBuilder("dimethylnaphthalene_acetylating_reagent_iodine_monochloride_chlorine_bromosuccinimide_to_mg_cl_bromide_succinimide_dihydroiodotetracene_trimethylchlorosilane_hydrobromic_acid").duration(290).EUt(122880)
        .inputFluids(Dimethylnaphthalene.getFluid(1000))
        .inputFluids(AcetylatingReagent.getFluid(1000))
        .inputFluids(IodineMonochloride.getFluid(1000))
        .inputFluids(Chlorine.getFluid(2000))
        .inputDust(Bromosuccinimide, 12)
        .notConsumable(ChemicalHelper.get(ISGTagPrefix.CATALYST, RhodiumRheniumNaquadahCatalyst))
        .outputItems(ChemicalHelper.get(dust, MgClBromide, 6))
        .outputItems(ChemicalHelper.get(dust, Succinimide, 12))
        .outputFluids(Dihydroiodotetracene.getFluid(1000))
        .outputFluids(Trimethylchlorosilane.getFluid(1000))
        .outputFluids(HydrobromicAcid.getFluid(1000))
        .save(provider);

// C6H5OH + 10Cl + 2HCN + O -> 8HCl + C8Cl2N2O2
    LARGE_CHEMICAL_RECIPES.recipeBuilder("phenol_chlorine_hydrogen_cyanide_oxygen_to_hydrochloric_acid_dichlorodicyanobenzoquinone").duration(250).EUt(30720)
        .inputFluids(Phenol.getFluid(1000))
        .inputFluids(Chlorine.getFluid(10000))
        .inputFluids(HydrogenCyanide.getFluid(2000))
        .inputFluids(Oxygen.getFluid(1000))
        .outputFluids(HydrochloricAcid.getFluid(8000))
        .outputFluids(Dichlorodicyanobenzoquinone.getFluid(1000))
        .save(provider);


    // C8N2Cl2(OH)2 + H2O2 -> C8Cl2N2O2 + 2H2O
    CHEMICAL_RECIPES.recipeBuilder("dichlorodicyanohydroquinone_hydrogen_peroxide_to_dichlorodicyanobenzoquinone_water").duration(250).EUt(480)
        .inputFluids(Dichlorodicyanohydroquinone.getFluid(1000))
        .inputFluids(HydrogenPeroxide.getFluid(1000))
        .outputFluids(Dichlorodicyanobenzoquinone.getFluid(1000))
        .outputFluids(Water.getFluid(2000))
        .notConsumable(ChemicalHelper.get(dust, VanadiumOxide))
        .save(provider);


    // C4H6O4Pd + Li2TiO3 + 2HCl + H2O -> C4H6O4 + 2[H2O + LiCl] + PdTiO2
    LARGE_CHEMICAL_RECIPES.recipeBuilder("palladium_acetate_lithium_titanate_hydrochloric_acid_water_to_lithium_chloride_solution_succinic_acid_palladium_loaded_rutile_nanoparticles").duration(350).EUt(491520)
        .inputDust(PalladiumAcetate, 15)
        .inputItems(wireFine, LithiumTitanate, 24)
        .inputFluids(HydrochloricAcid.getFluid(2000))
        .inputFluids(Water.getFluid(1000))
        .notConsumable(UVA_HALIDE_LAMP.asStack())
        .outputFluids(LithiumChlorideSolution.getFluid(2000))
        .outputItems(ChemicalHelper.get(dust, SuccinicAcid, 14))
        .outputItems(ChemicalHelper.get(dust, PalladiumLoadedRutileNanoparticles, 5))
        .save(provider);


    // 2H2C18H11I + 2C8Cl2N2O2 + C3H8O -> C3H6O + 2C8N2Cl2(OH)2 + 2I + 2C18H12
    LARGE_CHEMICAL_RECIPES.recipeBuilder("dihydroiodotetracene_dichlorodicyanobenzoquinone_isopropyl_alcohol_to_acetone_dichlorodicyanohydroquinone_iodine_tetracene").duration(260).EUt(491520)
        .inputFluids(Dihydroiodotetracene.getFluid(2000))
        .inputFluids(Dichlorodicyanobenzoquinone.getFluid(2000))
        .inputFluids(IsopropylAlcohol.getFluid(1000))
        .outputFluids(Acetone.getFluid(1000))
        .outputFluids(Dichlorodicyanohydroquinone.getFluid(2000))
        .outputDust(Iodine, 2)
        .outputItems(ChemicalHelper.get(dust, Tetracene, 60))
        .notConsumable(UVA_HALIDE_LAMP.asStack())
        .notConsumable(ChemicalHelper.get(dust, PalladiumLoadedRutileNanoparticles))
        .save(provider);

    // TODO migrated disabled: unresolved old test symbol `LEPTON_TRAP_CRYSTAL`.
    //
    //         CHEMICAL_RECIPES.recipeBuilder("lepton_trap_crystal_vibranium_heavy_lepton_mix_free_electron_gas_to_charged_lepton_trap_crystal").duration(240).EUt(491520)
    //                 .inputItems(LEPTON_TRAP_CRYSTAL.asStack(2))
    //                 .inputDust(Vibranium)
    //                 .inputFluids(HeavyLeptonMix.getFluid(1000))
    //                 .inputFluids(FreeElectronGas.getFluid(1000))
    //                 .outputItems(CHARGED_LEPTON_TRAP_CRYSTAL.asStack(2))
    //                 .save(provider);
    //
    //
    //

// 2H + Se -> H2Se
    CHEMICAL_RECIPES.recipeBuilder("hydrogen_selenium_to_hydroselenic_acid").duration(180).EUt(120)
        .inputFluids(Hydrogen.getFluid(2000))
        .inputDust(Selenium)
        .outputFluids(HydroselenicAcid.getFluid(1000))
        .save(provider);


    // 2H2Se + CuInGa -> CuInGaSe2 + 4 H
    CHEMICAL_RECIPES.recipeBuilder("hydroselenic_acid_copper_gallium_indium_mix_to_copper_gallium_indium_selenide_hydrogen").duration(180).EUt(480)
        .inputFluids(HydroselenicAcid.getFluid(2000))
        .inputDust(CopperGalliumIndiumMix, 3)
        .outputItems(ChemicalHelper.get(dust, CopperGalliumIndiumSelenide, 5))
        .outputFluids(Hydrogen.getFluid(4000))
        .save(provider);


    // MnO2 + 2KOH + O -> K2MnO4 + H2O
    CHEMICAL_RECIPES.recipeBuilder("pyrolusite_potassium_hydroxide_oxygen_to_potassium_manganate_water").duration(170).EUt(30)
        .inputDust(Pyrolusite, 3)
        .inputFluids(PotassiumHydroxide.getFluid(2000))
        .inputFluids(Oxygen.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, PotassiumManganate, 7))
        .outputFluids(Water.getFluid(1000))
        .save(provider);


    // C6H5OH + HNO3 + 6H -> 3H2O + C6H7NO
    CHEMICAL_RECIPES.recipeBuilder("phenol_nitric_acid_hydrogen_to_water_aminophenol").duration(240).EUt(120)
        .inputFluids(Phenol.getFluid(1000))
        .inputFluids(NitricAcid.getFluid(1000))
        .inputFluids(Hydrogen.getFluid(6000))
        .notConsumable(ChemicalHelper.get(dust, IronPlatinumCatalyst))
        .outputFluids(Water.getFluid(3000))
        .outputFluids(Aminophenol.getFluid(1000))
        .save(provider);


    // C6H7NO + C3H8O3 + O -> C9H7NO + 4H2O
    LARGE_CHEMICAL_RECIPES.recipeBuilder("aminophenol_glycerol_oxygen_nitro_benzene_to_hydroxyquinoline_water").duration(260).EUt(480)
        .inputFluids(Aminophenol.getFluid(1000))
        .inputFluids(Glycerol.getFluid(1000))
        .inputFluids(Oxygen.getFluid(1000))
        .inputFluids(NitroBenzene.getFluid(0))
        .outputFluids(Hydroxyquinoline.getFluid(1000))
        .outputFluids(Water.getFluid(4000))
        .save(provider);


    // Bi + 6HNO3 -> [Bi(NO3)3 + H2O] + 3NO2 + 2H2O
    LARGE_CHEMICAL_RECIPES.recipeBuilder("bismuth_nitric_acid_to_bismuth_nitrate_soluton_nitrogen_dioxide_water").duration(350).EUt(30)
        .inputDust(Bismuth)
        .inputFluids(NitricAcid.getFluid(6000))
        .outputFluids(BismuthNitrateSoluton.getFluid(1000))
        .outputFluids(NitrogenDioxide.getFluid(3000))
        .outputFluids(Water.getFluid(2000))
        .save(provider);


    // 2Na2O4Ru + 2[Bi(NO3)3 + H2O] -> Bi2Ru2O7 + 4NaNO3 + N2H4 + 9O
    LARGE_CHEMICAL_RECIPES.recipeBuilder("sodium_ruthenate_bismuth_nitrate_soluton_to_hydrazine_oxygen_bismuth_ruthenate_sodium_nitrate").duration(320).EUt(480)
        .inputDust(SodiumRuthenate, 14)
        .inputFluids(BismuthNitrateSoluton.getFluid(2000))
        .outputFluids(Hydrazine.getFluid(1000))
        .outputFluids(Oxygen.getFluid(9000))
        .outputDust(BismuthRuthenate, 11)
        .outputDust(SodiumNitrate, 20)
        .save(provider);


    // 2IrO2 + 2[Bi(NO3)3 + H2O] + H -> Bi2Ir2O7 + 5HNO2 + NO2
    CHEMICAL_RECIPES.recipeBuilder("iridium_dioxide_bismuth_nitrate_soluton_hydrogen_to_bismuth_iridiate_nitric_acid_nitrogen_dioxide").duration(300).EUt(1920)
        .inputDust(IridiumDioxide, 6)
        .inputFluids(BismuthNitrateSoluton.getFluid(2000))
        .inputFluids(Hydrogen.getFluid(1000))
        .outputDust(BismuthIridiate, 11)
        .outputFluids(NitricAcid.getFluid(5000))
        .outputFluids(NitrogenDioxide.getFluid(1000))
        .save(provider);


    // TiCl4 + [NaOH + H2O] + [BaCl2 + H2O] -> BaTiO3 + NaCl + 5HCl
    CHEMICAL_RECIPES.recipeBuilder("titanium_tetrachloride_sodium_hydroxide_solution_barium_chloride_solution_to_salt_barium_titanate_preparation_hydrochloric_acid").duration(320).EUt(120)
        .inputFluids(TitaniumTetrachloride.getFluid(1000))
        .inputFluids(SodiumHydroxideSolution.getFluid(1000))
        .inputFluids(BariumChlorideSolution.getFluid(1000))
        .outputDust(Salt, 2)
        .outputFluids(BariumTitanatePreparation.getFluid(1000))
        .outputFluids(HydrochloricAcid.getFluid(4000))
        .save(provider);


    // H2S + C4H6O4 + 4Br -> C4Br4S + 4H2O
    CHEMICAL_PLANT_RECIPES.recipeBuilder("succinic_acid_hydrogen_sulfide_bromine_to_perbromothiophene_water").duration(230).EUt(4960)
        .inputDust(SuccinicAcid, 14)
        .inputFluids(HydrogenSulfide.getFluid(1000))
        .inputFluids(Bromine.getFluid(4000))
        .outputFluids(Perbromothiophene.getFluid(1000))
        .outputFluids(Water.getFluid(4000))
        .save(provider);


    // 2 C4Br4S + 4 C2H5ONa + C2H4O2 + 2H2O -> 2 C8H12O2S + 4 NaBr + 4 HBr + 2 CO2
    LARGE_CHEMICAL_RECIPES.recipeBuilder("perbromothiophene_acetic_acid_sodium_ethoxide_water_to_diethoxythiophene_hydrobromic_acid_carbon_dioxide_sodium_bromide").duration(80).EUt(480)
        .notConsumable(dust, Zinc)
        .inputFluids(Perbromothiophene.getFluid(1000))
        .inputFluids(AceticAcid.getFluid(500))
        .inputDust(SodiumEthoxide, 18)
        .inputFluids(Water.getFluid(1000))
        .outputFluids(Diethoxythiophene.getFluid(1000))
        .outputFluids(HydrobromicAcid.getFluid(2000))
        .outputFluids(CarbonDioxide.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, SodiumBromide, 4))
        .save(provider);


    // C2H6O2 + C6H8S -> C6H6O2S + 2CH4
    CHEMICAL_RECIPES.recipeBuilder("ethylene_glycol_diethoxythiophene_to_edot_ethanol").duration(140).EUt(120)
        .notConsumable(GELLED_TOLUENE)
        .inputFluids(EthyleneGlycol.getFluid(1000))
        .inputFluids(Diethoxythiophene.getFluid(1000))
        .outputFluids(EDOT.getFluid(1000))
        .outputFluids(Ethanol.getFluid(2000))
        .save(provider);

    // (C8H8)n + H2SO4 + C6H6O2S (aka: EDOT) -> PEDOT + Dilute H2SO4
    CHEMICAL_PLANT_RECIPES.recipeBuilder("polystyrene_sulfuric_acid_edot_sodium_persulfate_to_diluted_sulfuric_acid_pedot").duration(320).EUt(1920)
        .inputFluids(Polystyrene.getFluid(1000))
        .inputFluids(SulfuricAcid.getFluid(1000))
        .inputFluids(EDOT.getFluid(1000))
        .inputFluids(SodiumPersulfate.getFluid(1000))
        .notConsumable(ChemicalHelper.get(dust, IronSulfate))
        .outputFluids(DilutedSulfuricAcid.getFluid(1000))
        .outputDust(PEDOT, 3)
        .save(provider);


// Fe + H2SO4 -> FeSO4 + 2H
    CHEMICAL_RECIPES.recipeBuilder("iron_sulfuric_acid_to_iron_sulfate_hydrogen").duration(250).EUt(30)
        .inputDust(Iron)
        .inputFluids(SulfuricAcid.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, IronSulfate, 6))
        .outputFluids(Hydrogen.getFluid(2000))
        .save(provider);

// ZrCl4 + 2H2O -> ZrOCl2 + 2HCl
    CHEMICAL_RECIPES.recipeBuilder("zirconium_tetrachloride_water_to_zirconyl_chloride_hydrochloric_acid").duration(150).EUt(120)
        .inputDust(ZirconiumTetrachloride, 5)
        .inputFluids(Water.getFluid(2000))
        .outputItems(ChemicalHelper.get(dust, ZirconylChloride, 4))
        .outputFluids(HydrochloricAcid.getFluid(2000))
        .save(provider);


    // Pb + N2O4 + 2O -> Pb(NO3)2
    CHEMICAL_RECIPES.recipeBuilder("lead_dinitrogen_tetroxide_oxygen_to_lead_nitrate").EUt(120).duration(150)
        .inputDust(Lead)
        .inputFluids(DinitrogenTetroxide.getFluid(1000))
        .inputFluids(Oxygen.getFluid(2000))
        .outputDust(LeadNitrate, 9)
        .save(provider);


    // ZrOCl2 + TiO2 + Pb(NO3)2 + 2H -> PbZrTiO3 + 2HNO3 + 2Cl
    LARGE_CHEMICAL_RECIPES.recipeBuilder("zirconyl_chloride_rutile_lead_nitrate_hydrogen_to_nitric_acid_chlorine_lead_zirconate_titanate").duration(320).EUt(480)
        .inputDust(ZirconylChloride, 4)
        .inputDust(Rutile, 3)
        .inputDust(LeadNitrate, 9)
        .inputFluids(Hydrogen.getFluid(2000))
        .outputFluids(NitricAcid.getFluid(2000))
        .outputFluids(Chlorine.getFluid(2000))
        .outputDust(LeadZirconateTitanate, 6)
        .save(provider);


    // Fe + 2I -> FeI2
    CHEMICAL_RECIPES.recipeBuilder("iron_iodine_to_iron_iodide").duration(150).EUt(120)
        .inputDust(Iron)
        .inputDust(Iodine, 2)
        .outputItems(ChemicalHelper.get(dust, IronIodide, 3))
        .save(provider);


    // Tl + I -> TlI
    CHEMICAL_RECIPES.recipeBuilder("thallium_iodine_to_thallium_iodide").duration(150).EUt(120)
        .inputDust(Thallium)
        .inputDust(Iodine)
        .outputItems(ChemicalHelper.get(dust, ThalliumIodide, 2))
        .save(provider);


    // Rb + I -> RbI
    CHEMICAL_RECIPES.recipeBuilder("rubidium_iodine_to_rubidium_iodide").duration(150).EUt(120)
        .inputDust(Rubidium)
        .inputDust(Iodine)
        .outputItems(ChemicalHelper.get(dust, RubidiumIodide, 2))
        .save(provider);


    // K + I -> KI
    CHEMICAL_RECIPES.recipeBuilder("potassium_iodine_to_potassium_iodide").duration(150).EUt(120)
        .inputDust(Potassium)
        .inputDust(Iodine)
        .outputItems(ChemicalHelper.get(dust, PotassiumIodide, 2))
        .save(provider);


    // In + 3I -> InI3
    CHEMICAL_RECIPES.recipeBuilder("indium_iodine_to_indium_iodide").duration(150).EUt(120)
        .inputDust(Indium)
        .inputDust(Iodine, 3)
        .outputItems(ChemicalHelper.get(dust, IndiumIodide, 4))
        .save(provider);


    // Ga + 3I -> GaI3
    CHEMICAL_RECIPES.recipeBuilder("gallium_iodine_to_gallium_iodide").duration(150).EUt(120)
        .inputDust(Gallium)
        .inputDust(Iodine, 3)
        .outputItems(ChemicalHelper.get(dust, GalliumIodide, 4))
        .save(provider);


    // Sc + 3I -> ScI3
    CHEMICAL_RECIPES.recipeBuilder("scandium_iodine_to_scandium_iodide").duration(150).EUt(120)
        .inputDust(Scandium)
        .inputDust(Iodine, 3)
        .outputItems(ChemicalHelper.get(dust, ScandiumIodide, 4))
        .save(provider);


    // FeI2 + 5CO -> 2I + Fe(CO)5 (all x5)
    LARGE_CHEMICAL_RECIPES.recipeBuilder("iron_iodide_carbon_monoxide_to_iodine_dust_iron_carbonyl").duration(240).EUt(480)
        .inputDust(IronIodide, 15)
        .inputFluids(CarbonMonoxide.getFluid(25000))
        .notConsumable(block, Copper)
        .outputDust(Iodine, 10)
        .chancedOutput(dust, Iron, 1, 5000)
        .outputFluids(IronCarbonyl.getFluid(5000))
        .save(provider);


    // SrCl2 + H2SO4 -> SrSO4 + 2HCl
    CHEMICAL_RECIPES.recipeBuilder("strontium_chloride_sulfuric_acid_to_celestine_hydrochloric_acid").duration(160).EUt(480)
        .inputDust(StrontiumChloride, 3)
        .inputFluids(SulfuricAcid.getFluid(1000))
        .outputDust(Celestine, 6)
        .outputFluids(HydrochloricAcid.getFluid(2000))
        .save(provider);


    // 6F + 2CS2 -> C2F6S2 + 2S
    CHEMICAL_RECIPES.recipeBuilder("fluorine_carbon_sulfide_to_biperfluoromethanedisulfide_sulfur").duration(250).EUt(120)
        .notConsumable(dust, Iodine)
        .inputFluids(Fluorine.getFluid(6000))
        .inputFluids(CarbonSulfide.getFluid(2000))
        .outputFluids(Biperfluoromethanedisulfide.getFluid(1000))
        .outputDust(Sulfur, 2)
        .save(provider);


    // Hg + 3H2O2 + C2F6S2 + BaCO3 -> [C2BaF6O6S2 + 3H2O + Hg] + C
    CHEMICAL_RECIPES.recipeBuilder("mercury_water_biperfluoromethanedisulfide_barium_carbonate_to_barium_triflate_solution_carbon").duration(240).EUt(480)
        .inputFluids(Mercury.getFluid(1000))
        .inputFluids(Water.getFluid(3000))
        .inputFluids(Biperfluoromethanedisulfide.getFluid(1000))
        .inputDust(BariumCarbonate, 5)
        .notConsumable(UVA_HALIDE_LAMP.asStack())
        .outputFluids(BariumTriflateSolution.getFluid(3000))
        .outputDust(Carbon)
        .save(provider);


    // 3H2SO4 + 2Sc + 3C2BaF6O6S2 -> 3BaSO4 + 2C3F9O9S3Sc + 6H
    LARGE_CHEMICAL_RECIPES.recipeBuilder("sulfuric_acid_scandium_barium_triflate_to_barite_scandium_triflate_hydrogen").duration(200).EUt(480)
        .inputFluids(SulfuricAcid.getFluid(3000))
        .inputDust(Scandium, 2)
        .inputDust(BariumTriflate, 51)
        .outputDust(Barite, 21)
        .outputItems(ChemicalHelper.get(dust, ScandiumTriflate, 50))
        .outputFluids(Hydrogen.getFluid(6000))
        .save(provider);


    // 2HNO3 + BaS -> H2S + Ba(NO3)2
    CHEMICAL_RECIPES.recipeBuilder("nitric_acid_barium_sulfide_to_hydrogen_sulfide_barium_nitrate").duration(240).EUt(120)
        .inputFluids(NitricAcid.getFluid(2000))
        .inputDust(BariumSulfide, 2)
        .outputFluids(HydrogenSulfide.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, BariumNitrate, 9))
        .save(provider);


    // 2HNO3 + Cu -> 2H + Cu(NO3)2
    CHEMICAL_RECIPES.recipeBuilder("nitric_acid_copper_to_nitrogen_dioxide_hydrogen_copper_nitrate").duration(240).EUt(120)
        .inputFluids(NitricAcid.getFluid(2000))
        .inputDust(Copper)
        .outputFluids(NitrogenDioxide.getFluid(1000))
        .outputFluids(Hydrogen.getFluid(2000))
        .outputItems(ChemicalHelper.get(dust, CopperNitrate, 9))
        .save(provider);


    // 6HNO3 + Y2O3 -> 3H2O + 2Y(NO3)3
    CHEMICAL_RECIPES.recipeBuilder("nitric_acid_yttrium_oxide_to_water_yttrium_nitrate").duration(240).EUt(120)
        .inputFluids(NitricAcid.getFluid(6000))
        .inputDust(YttriumOxide, 5)
        .circuitMeta(0)
        .outputFluids(Water.getFluid(3000))
        .outputItems(ChemicalHelper.get(dust, YttriumNitrate, 26))
        .save(provider);

    // C3H5ClO + 2H2O + Na2CO3 -> C3H8O3 + NaCl + NaHCO3
    LARGE_CHEMICAL_RECIPES.recipeBuilder("epichlorohydrin_water_soda_ash_to_glycerol_salt_sodium_bicarbonate").duration(100).EUt(1024)
        .inputFluids(Epichlorohydrin.getFluid(1000))
        .inputFluids(Water.getFluid(2000))
        .inputDust(SodaAsh, 6)
        .outputFluids(Glycerol.getFluid(1000))
        .outputDust(Salt, 2)
        .outputItems(ChemicalHelper.get(dust, SodiumBicarbonate, 6))
        .save(provider);

// C3H8O3 + 2HCl + 3HCN + HClO + 3H2O -> C6H8O7 + 3NH4Cl
    LARGE_CHEMICAL_RECIPES.recipeBuilder("glycerol_hydrochloric_acid_hypochlorous_acid_hydrogen_cyanide_water_to_citric_acid_ammonium_chloride").duration(240).EUt(7680)
        .inputFluids(Glycerol.getFluid(1000))
        .inputFluids(HydrochloricAcid.getFluid(2000))
        .inputFluids(HypochlorousAcid.getFluid(1000))
        .inputFluids(HydrogenCyanide.getFluid(3000))
        .inputFluids(Water.getFluid(3000))
        .notConsumable(dust, PotassiumDichromate)
        .circuitMeta(0)
        .outputFluids(CitricAcid.getFluid(1000))
        .outputFluids(AmmoniumChloride.getFluid(3000))
        .save(provider);


    // 3Cu(NO3)2 + 2Ba(NO3)2 + Y(NO3)3 + 2NH3 + C6H8O7 -> YBa2Cu3O6 + 15NO2 + 6CO + 4H2O + 6H
    LARGE_CHEMICAL_RECIPES.recipeBuilder("copper_nitrate_barium_nitrate_yttrium_nitrate_ammonia_citric_acid_to_well_mixed_ybc_oxides_nitrogen_dioxide_carbon_monoxide_water_hydrogen").duration(260).EUt(7680)
        .inputDust(CopperNitrate, 27)
        .inputDust(BariumNitrate, 18)
        .inputDust(YttriumNitrate, 13)
        .inputFluids(Ammonia.getFluid(2000))
        .inputFluids(CitricAcid.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, WellMixedYBCOxides, 12))
        .outputFluids(NitrogenDioxide.getFluid(15000))
        .outputFluids(CarbonMonoxide.getFluid(6000))
        .outputFluids(Water.getFluid(4000))
        .outputFluids(Hydrogen.getFluid(6000))
        .save(provider);


    // 9O + C6H12O6 -> 3C2H2O4 + 3H2O
    CHEMICAL_RECIPES.recipeBuilder("oxygen_glucose_to_water_oxalic_acid").duration(120).EUt(480)
        .notConsumable(ChemicalHelper.get(dust, VanadiumOxide))
        .inputFluids(Oxygen.getFluid(9000))
        .inputDust(Glucose, 24)
        .outputFluids(Water.getFluid(3000))
        .outputFluids(OxalicAcid.getFluid(3000))
        .save(provider);


    // 2C2H2O4 + 2O + Ac -> Ac(C2O4)2 + 2H2O
    CHEMICAL_RECIPES.recipeBuilder("oxalic_acid_oxygen_actinium_to_water_actinium_oxalate").duration(180).EUt(30720)
        .inputFluids(OxalicAcid.getFluid(2000))
        .inputFluids(Oxygen.getFluid(2000))
        .inputDust(Actinium)
        .outputFluids(Water.getFluid(2000))
        .outputItems(ChemicalHelper.get(dust, ActiniumOxalate, 13))
        .save(provider);


    // C + 4Cl -> CCl4
    CHEMICAL_RECIPES.recipeBuilder("carbon_chlorine_to_carbon_tetrachloride").duration(320).EUt(30)
        .inputDust(Carbon)
        .circuitMeta(0)
        .inputFluids(Chlorine.getFluid(4000))
        .outputFluids(CarbonTetrachloride.getFluid(1000))
        .save(provider);


    // (CH3)2SiHCl + CH4 -> (CH3)3SiCl + 2H
    CHEMICAL_RECIPES.recipeBuilder("dimethyldichlorosilane_methane_to_trimethylchlorosilane_hydrogen").duration(110).EUt(1920)
        .inputFluids(Dimethyldichlorosilane.getFluid(1000))
        .inputFluids(Methane.getFluid(1000))
        .outputFluids(Trimethylchlorosilane.getFluid(1000))
        .outputFluids(Hydrogen.getFluid(2000))
        .save(provider);


    // 2CH2O2 + 2Br + 4Na + 2H2O -> Br2C2H2O2 + 4NaOH + 2H
    LARGE_CHEMICAL_RECIPES.recipeBuilder("formic_acid_bromine_water_trimethylchlorosilane_sodium_to_sodium_hydroxide_dibromoacrolein_hydrogen").duration(360).EUt(7680)
        .inputFluids(FormicAcid.getFluid(2000))
        .inputFluids(Bromine.getFluid(2000))
        .inputFluids(Water.getFluid(2000))
        .inputFluids(Trimethylchlorosilane.getFluid(0))
        .inputDust(Sodium, 4)
        .outputDust(SodiumHydroxide, 12)
        .outputFluids(Dibromoacrolein.getFluid(1000))
        .outputFluids(Hydrogen.getFluid(2000))
        .save(provider);


    // 2Cl + C2H6 -> C2H5Cl + HCl
    CHEMICAL_RECIPES.recipeBuilder("chlorine_ethane_to_chloroethane_hydrochloric_acid").duration(200).EUt(3340)
        .inputFluids(Chlorine.getFluid(2000))
        .inputFluids(Ethane.getFluid(1000))
        .outputFluids(Chloroethane.getFluid(1000))
        .outputFluids(HydrochloricAcid.getFluid(1000))
        .notConsumable(UVA_HALIDE_LAMP.asStack())
        .save(provider);


    // C2H4Cl2 + 2Na2S2O3 + C2H2Br2O2 -> C4H4S2Br2 + 2NaHSO4 + 2NaCl
    LARGE_CHEMICAL_RECIPES.recipeBuilder("sodium_thiosulfate_chloroethane_dibromoacrolein_to_salt_sodium_bisulfate_bromohydrothiine").duration(320).EUt(7680)
        .inputDust(SodiumThiosulfate, 14)
        .inputFluids(Chloroethane.getFluid(1000))
        .inputFluids(Dibromoacrolein.getFluid(1000))
        .outputDust(Salt, 4)
        .outputDust(SodiumBisulfate, 14)
        .outputFluids(Bromohydrothiine.getFluid(1000))
        .save(provider);


    // C4H4S2Br2 + 2Se + 2C4H9Li -> C4H4S2Li2Se2 + 2C4H9Br
    CHEMICAL_RECIPES.recipeBuilder("bromohydrothiine_butyl_lithium_selenium_to_bromobutane_lithiumthiinediselenide").duration(290).EUt(30720)
        .inputFluids(Bromohydrothiine.getFluid(1000))
        .inputFluids(ButylLithium.getFluid(2000))
        .inputDust(Selenium, 2)
        .outputFluids(Bromobutane.getFluid(2000))
        .outputItems(ChemicalHelper.get(dust, Lithiumthiinediselenide, 14))
        .save(provider);


    // C3H6 + C4H8 -> C3H4 + C4H10
    CHEMICAL_RECIPES.recipeBuilder("propene_butene_to_propadiene_butane").duration(200).EUt(480)
        .inputFluids(Propene.getFluid(1000))
        .inputFluids(Butene.getFluid(1000))
        .notConsumable(ChemicalHelper.get(dust, DehydrogenationCatalyst))
        .outputFluids(Propadiene.getFluid(1000))
        .outputFluids(Butane.getFluid(1000))
        .save(provider);


    // TiCl4 + 2 C3H4 + 2 C2H2 -> 2 HCl + (C5H5)2Cl2Ti
    CHEMICAL_RECIPES.recipeBuilder("titanium_tetrachloride_propadiene_acetylene_to_hydrochloric_acid_titanium_cyclopentadienyl").duration(260).EUt(7680)
        .inputFluids(TitaniumTetrachloride.getFluid(1000))
        .inputFluids(Propadiene.getFluid(2000))
        .inputFluids(Acetylene.getFluid(2000))
        .notConsumableDust(ScandiumTriflate)
        .outputFluids(HydrochloricAcid.getFluid(2000))
        .outputItems(ChemicalHelper.get(dust, TitaniumCyclopentadienyl, 23))
        .save(provider);


    // C4H9Br + NaOH -> NaBr + C4H10O
    CHEMICAL_RECIPES.recipeBuilder("bromobutane_sodium_hydroxide_to_sodium_bromide_butanol").duration(40).EUt(120)
        .inputFluids(Bromobutane.getFluid(1000))
        .inputDust(SodiumHydroxide, 3)
        .outputItems(ChemicalHelper.get(dust, SodiumBromide, 2))
        .outputFluids(Butanol.getFluid(1000))
        .save(provider);


    // 2Fr + C2H2 -> Fr2C2 + 2H
    CHEMICAL_RECIPES.recipeBuilder("francium_acetylene_to_francium_carbide_hydrogen").duration(260).EUt(480)
        .inputDust(Francium, 2)
        .inputFluids(Acetylene.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, FranciumCarbide, 4))
        .outputFluids(Hydrogen.getFluid(2000))
        .save(provider);


    // 2Fr2C2 + B4C3 -> Fr4B4C7
    CHEMICAL_RECIPES.recipeBuilder("francium_carbide_boron_carbide_to_boron_francium_carbide").duration(260).EUt(1920)
        .inputDust(FranciumCarbide, 8)
        .inputDust(BoronCarbide, 7)
        .outputItems(ChemicalHelper.get(dust, BoronFranciumCarbide, 15))
        .save(provider);


    // 3[Cu + H2SO4] + 6NaOH + NaI + 3SO3 -> NaIO3 + 3Cu + 3Na + 3NaSO4 + 6H2O + 3SO2
    LARGE_CHEMICAL_RECIPES.recipeBuilder("copper_sulfate_solution_sulfur_trioxide_sodium_iodide_sodium_hydroxide_to_sodium_iodate_copper_sodium_sodium_sulfate_solution_water_sulfur_dioxide").duration(290).EUt(1920)
        .inputFluids(CopperSulfateSolution.getFluid(3000))
        .inputFluids(SulfurTrioxide.getFluid(3000))
        .inputDust(SodiumIodide, 2)
        .inputDust(SodiumHydroxide, 18)
        .outputItems(ChemicalHelper.get(dust, SodiumIodate, 5))
        .outputDust(Copper, 3)
        .outputDust(Sodium, 3)
        .outputFluids(SodiumSulfateSolution.getFluid(3000))
        .outputFluids(Water.getFluid(6000))
        .outputFluids(SulfurDioxide.getFluid(3000))
        .save(provider);


    // NaIO3 + NaClO -> NaIO4 + NaCl
    LARGE_CHEMICAL_RECIPES.recipeBuilder("sodium_iodate_sodium_hypochlorite_to_sodium_periodate_salt").duration(240).EUt(1920)
        .inputDust(SodiumIodate, 5)
        .inputDust(SodiumHypochlorite, 3)
        .outputItems(ChemicalHelper.get(dust, SodiumPeriodate, 6))
        .outputDust(Salt, 2)
        .save(provider);


    // 3NaIO4 + 4Ru + 8NaOH -> 3NaI + 4Na2RuO4 + 4H2O
    LARGE_CHEMICAL_RECIPES.recipeBuilder("sodium_periodate_ruthenium_sodium_hydroxide_to_sodium_iodide_sodium_ruthenate_water").duration(220).EUt(480)
        .inputDust(SodiumPeriodate, 18)
        .inputDust(Ruthenium, 4)
        .inputDust(SodiumHydroxide, 24)
        .outputItems(ChemicalHelper.get(dust, SodiumIodide, 6))
        .outputDust(SodiumRuthenate, 28)
        .outputFluids(Water.getFluid(4000))
        .save(provider);


    // Sg + 2 NaOH + 6 F + 2H2O -> 6HF + Na2SgO4
    CHEMICAL_RECIPES.recipeBuilder("seaborgium_sodium_hydroxide_fluorine_water_to_hydrofluoric_acid_sodium_seaborgate").duration(820).EUt(30720)
        .inputDust(Seaborgium)
        .inputDust(SodiumHydroxide, 6)
        .inputFluids(Fluorine.getFluid(6000))
        .inputFluids(Water.getFluid(2000))
        .outputFluids(HydrofluoricAcid.getFluid(6000))
        .outputItems(ChemicalHelper.get(dust, SodiumSeaborgate, 7))
        .save(provider);


    // Sr + 2Cl -> SrCl2
    CHEMICAL_RECIPES.recipeBuilder("strontium_chlorine_to_strontium_chloride").duration(320).EUt(120)
        .inputDust(Strontium)
        .inputFluids(Chlorine.getFluid(2000))
        .outputItems(ChemicalHelper.get(dust, StrontiumChloride, 3))
        .save(provider);


    // NaIO4 + C3H6O -> NaIO3 + CH2O + C2H4O
    CHEMICAL_RECIPES.recipeBuilder("sodium_periodate_acetone_to_sodium_iodate_formaldehyde_acetaldehyde").duration(220).EUt(7680)
        .notConsumable(ChemicalHelper.get(dust, OsmiumTetroxide))
        .inputDust(SodiumPeriodate, 6)
        .inputFluids(Acetone.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, SodiumIodate, 5))
        .outputFluids(Formaldehyde.getFluid(1000))
        .outputFluids(Acetaldehyde.getFluid(1000))
        .save(provider);


    // C4H10 + 2Br -> C4H9Br + HBr
    CHEMICAL_RECIPES.recipeBuilder("butane_bromine_to_bromobutane_hydrobromic_acid").duration(210).EUt(7680)
        .notConsumable(UVA_HALIDE_LAMP.asStack())
        .inputFluids(Butane.getFluid(1000))
        .inputFluids(Bromine.getFluid(2000))
        .outputFluids(Bromobutane.getFluid(1000))
        .outputFluids(HydrobromicAcid.getFluid(1000))
        .save(provider);


    // Kr + 2F -> KrF2
    CHEMICAL_RECIPES.recipeBuilder("krypton_fluorine_to_krypton_difluoride").duration(170).EUt(480)
        .notConsumable(UVA_HALIDE_LAMP.asStack())
        .inputFluids(Krypton.getFluid(1000))
        .inputFluids(Fluorine.getFluid(2000))
        .outputFluids(KryptonDifluoride.getFluid(1000))
        .save(provider);


    // Mn + KrF2 -> MnF2 + Kr
    CHEMICAL_RECIPES.recipeBuilder("manganese_krypton_difluoride_to_manganese_fluoride_krypton").duration(170).EUt(480)
        .inputDust(Manganese)
        .inputFluids(KryptonDifluoride.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, ManganeseFluoride, 3))
        .outputFluids(Krypton.getFluid(1000))
        .save(provider);


    // MnF2 + O + H2O -> MnO2 + 2HF
    CHEMICAL_RECIPES.recipeBuilder("manganese_fluoride_water_oxygen_to_pyrolusite_hydrofluoric_acid").duration(160).EUt(120)
        .inputDust(ManganeseFluoride, 3)
        .inputFluids(Water.getFluid(1000))
        .inputFluids(Oxygen.getFluid(1000))
        .outputDust(Pyrolusite, 3)
        .outputFluids(HydrofluoricAcid.getFluid(2000))
        .save(provider);


    // C6H6O + H2O2 + H2O + 4Cl + 2C2H2O -> C10H10O6 + 4HCl
    LARGE_CHEMICAL_RECIPES.recipeBuilder("phenol_hydrogen_peroxide_water_chlorine_ethenone_to_phenylenedioxydiacetic_acid_hydrochloric_acid").duration(320).EUt(122880)
        .inputFluids(Phenol.getFluid(1000))
        .inputFluids(HydrogenPeroxide.getFluid(1000))
        .inputFluids(Water.getFluid(1000))
        .inputFluids(Chlorine.getFluid(4000))
        .inputFluids(Ethenone.getFluid(2000))
        .outputFluids(PhenylenedioxydiaceticAcid.getFluid(1000))
        .outputFluids(HydrochloricAcid.getFluid(4000))
        .save(provider);


    // NaSCN + HCl + 2CH3CH2NH2 -> NH3 + (C2H5NH)2CS + NaCl
    CHEMICAL_RECIPES.recipeBuilder("sodium_thiocyanate_hydrochloric_acid_ethylamine_to_ammonia_diethylthiourea_salt").duration(210).EUt(30720)
        .inputFluids(SodiumThiocyanate.getFluid(1000))
        .inputFluids(HydrochloricAcid.getFluid(1000))
        .inputFluids(Ethylamine.getFluid(2000))
        .outputFluids(Ammonia.getFluid(1000))
        .outputFluids(Diethylthiourea.getFluid(1000))
        .outputDust(Salt, 2)
        .save(provider);


    // C10H10O6 + 2(C2H5NH)2CS + 2SOCl2 -> 2SO2 + 4HCl + C20H30N4O4S2
    LARGE_CHEMICAL_RECIPES.recipeBuilder("diethylthiourea_thionyl_chloride_phenylenedioxydiacetic_acid_to_sulfur_dioxide_hydrochloric_acid_isophthaloylbisdiethylthiourea").duration(250).EUt(122880)
        .inputFluids(Diethylthiourea.getFluid(2000))
        .inputFluids(ThionylChloride.getFluid(2000))
        .inputFluids(PhenylenedioxydiaceticAcid.getFluid(1000))
        .outputFluids(SulfurDioxide.getFluid(2000))
        .outputFluids(HydrochloricAcid.getFluid(4000))
        .outputFluids(Isophthaloylbisdiethylthiourea.getFluid(1000))
        .save(provider);


    // SbF5 + PCl3 + HF -> SbCl3 + HPF6
    CHEMICAL_RECIPES.recipeBuilder("antimony_pentafluoride_phosphorus_trichloride_hydrofluoric_acid_to_antimony_trichloride_fluorophosphoric_acid").duration(280).EUt(7680)
        .inputFluids(AntimonyPentafluoride.getFluid(1000))
        .inputFluids(PhosphorusTrichloride.getFluid(1000))
        .inputFluids(HydrofluoricAcid.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, AntimonyTrichloride, 4))
        .outputFluids(FluorophosphoricAcid.getFluid(1000))
        .save(provider);


    // SbCl3 + 3HF -> SbF3 + 3HCl
    CHEMICAL_RECIPES.recipeBuilder("antimony_trichloride_hydrofluoric_acid_to_antimony_trifluoride_hydrochloric_acid").duration(210).EUt(480)
        .inputDust(AntimonyTrichloride, 4)
        .inputFluids(HydrofluoricAcid.getFluid(3000))
        .outputItems(ChemicalHelper.get(dust, AntimonyTrifluoride, 4))
        .outputFluids(HydrochloricAcid.getFluid(3000))
        .save(provider);


    // 3C20H30N4O4S2 + ReCl5 + HsCl4 + TlCl + HPF6 -> ReHsTlC60PN12H84S6O12F6 + 7HCl + 3Cl
    LARGE_CHEMICAL_RECIPES.recipeBuilder("rhenium_chloride_hassium_chloride_thallium_chloride_isophthaloylbisdiethylthiourea_fluorophosphoric_acid_to_rhenium_hassium_thallium_isophtaloylbisdiethylthiourea_hexafluorophosphate_hydrochloric_acid_chlorine").duration(620).EUt(845000)
        .inputDust(RheniumChloride, 6)
        .inputDust(HassiumChloride, 5)
        .inputDust(ThalliumChloride, 2)
        .inputFluids(Isophthaloylbisdiethylthiourea.getFluid(3000))
        .inputFluids(FluorophosphoricAcid.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, RheniumHassiumThalliumIsophtaloylbisdiethylthioureaHexafluorophosphate, 125))
        .outputFluids(HydrochloricAcid.getFluid(7000))
        .outputFluids(Chlorine.getFluid(3000))
        .save(provider);

    CHEMICAL_PLANT_RECIPES.recipeBuilder("cerium_caesium_cobalt_indium_cosmic_computing_mix_to_charged_cesium_cerium_cobalt_indium").duration(520).EUt(445000)
        .inputDust(Cerium)
        .inputDust(Caesium)
        .inputDust(Cobalt, 2)
        .inputDust(Indium, 10)
        .inputFluids(CosmicComputingMix.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, ChargedCesiumCeriumCobaltIndium, 14))
        .save(provider);

    CHEMICAL_RECIPES.recipeBuilder("cycloparaphenylene_methane_lanthanum_embedded_fullerene_to_lanthanum_fullerene_nanotubes").duration(290).EUt(320000)
        .inputFluids(Cycloparaphenylene.getFluid(200))
        .inputFluids(Methane.getFluid(800))
        .inputDust(LanthanumEmbeddedFullerene)
        .notConsumable(plate, Rhenium)
        .outputItems(ChemicalHelper.get(dust, LanthanumFullereneNanotubes))
        .save(provider);


    // 2La + H2SO4 = La2O3 + H2S + O
    CHEMICAL_RECIPES.recipeBuilder("lanthanum_sulfuric_acid_to_lanthanum_oxide_hydrogen_sulfide_oxygen").duration(100).EUt(120)
        .inputDust(Lanthanum, 2)
        .inputFluids(SulfuricAcid.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, LanthanumOxide, 5))
        .outputFluids(HydrogenSulfide.getFluid(1000))
        .outputFluids(Oxygen.getFluid(1000))
        .save(provider);

    CHEMICAL_RECIPES.recipeBuilder("stone_residue_sodium_hydroxide_solution_to_uncommon_residues_dust_sodium_hydroxide_solution_red_mud")
        .inputDust(StoneResidue, 24)
        .inputFluids(SodiumHydroxideSolution.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, UncommonResidues))
        .chancedOutput(dust, Magnetite, 1, 2500)
        .outputFluids(SodiumHydroxideSolution.getFluid(925))
        .outputFluids(RedMud.getFluid(75))
        .duration(40)
        .EUt(100)
        .save(provider);

    CHEMICAL_RECIPES.recipeBuilder("liquid_oxygen_liquid_fluorine_to_dioxygendifluoride")
        .inputFluids(Oxygen.getFluid(FluidStorageKeys.LIQUID, 2000))
        .inputFluids(LiquidFluorine.getFluid(2000))
        .notConsumable(MICROFOCUS_X_RAY_TUBE.asStack())
        .outputFluids(Dioxygendifluoride.getFluid(1000))
        .duration(80)
        .EUt(200)
        .save(provider);

    CHEMICAL_RECIPES.recipeBuilder("uncommon_residues_dioxygendifluoride_to_partially_oxidized_residues")
        .inputDust(UncommonResidues)
        .inputFluids(Dioxygendifluoride.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, PartiallyOxidizedResidues))
        .duration(80)
        .EUt(100)
        .save(provider);

    // TODO migrated disabled: unresolved old test symbol `NaquadricCompound`.
    //         LARGE_CHEMICAL_RECIPES.recipeBuilder("inert_residues_fluoroantimonic_acid_to_clean_inert_residues_naquadric_compound")
    //                 .inputDust(InertResidues, 10)
    //                 .inputFluids(FluoroantimonicAcid.getFluid(0))
    //                 .outputItems(ChemicalHelper.get(dust, CleanInertResidues, 10))
    //                 .outputDust(NaquadricCompound)
    //                 .duration(320)
    //                 .EUt(200)
    //                 .save(provider);
    //
    //

    CHEMICAL_RECIPES.recipeBuilder("tritium_hydrogen_to_tritium_hydride")
        .inputFluids(Tritium.getFluid(1000))
        .inputFluids(Hydrogen.getFluid(1000))
        .outputFluids(TritiumHydride.getFluid(1000))
        .duration(160)
        .EUt(2000)
        .save(provider);

    LARGE_CHEMICAL_RECIPES.recipeBuilder("ultraacidic_residue_solution_liquid_oxygen_liquid_xenon_to_xenic_acid_dusty_liquid_helium3")
        .inputFluids(UltraacidicResidueSolution.getFluid(2000))
        .inputFluids(Oxygen.getFluid(FluidStorageKeys.LIQUID, 4000))
        .inputFluids(LiquidXenon.getFluid(1000))
        .outputFluids(XenicAcid.getFluid(1000))
        .outputFluids(DustyLiquidHelium3.getFluid(2000))
        .duration(120)
        .EUt(2000)
        .save(provider);


    // CaCl2 + Na2WO4 + 2H2O -> WCaO4 + 2NaCl(H2O)
    CHEMICAL_RECIPES.recipeBuilder("calcium_chloride_sodium_tungstate_water_to_calcium_tungstate_salt_water")
        .inputDust(CalciumChloride, 3)
        .inputFluids(SodiumTungstate.getFluid(1000))
        .inputFluids(Water.getFluid(2000))
        .outputDust(CalciumTungstate, 6)
        .outputFluids(SaltWater.getFluid(2000))
        .EUt(480)
        .duration(60)
        .save(provider);


    // WCaO4 + 2H2O -> H2WO4 + Ca(OH)2
    LARGE_CHEMICAL_RECIPES.recipeBuilder("calcium_tungstate_water_to_tungstic_acid_calcium_hydroxide")
        .inputDust(CalciumTungstate, 6)
        .inputFluids(Water.getFluid(2000))
        .outputDust(TungsticAcid, 7)
        .outputItems(ChemicalHelper.get(dust, CalciumHydroxide, 5))
        .EUt(480)
        .duration(150)
        .save(provider);


    // WO3 + 6H -> W + 3H2O
    CHEMICAL_RECIPES.recipeBuilder("tungsten_trioxide_hydrogen_to_tungsten_water")
        .inputDust(TungstenTrioxide, 4)
        .inputFluids(Hydrogen.getFluid(6000))
        .outputDust(Tungsten)
        .outputFluids(Water.getFluid(3000))
        .EUt(1920)
        .duration(65)
        .save(provider);


    // W + 6Cl -> WCl6
    CHEMICAL_RECIPES.recipeBuilder("tungsten_chlorine_to_tungsten_hexachloride")
        .inputDust(Tungsten)
        .inputFluids(Chlorine.getFluid(6000))
        .outputDust(TungstenHexachloride, 7)
        .duration(120)
        .EUt(120)
        .save(provider);


    // WCl6 + CH4 + 2H -> WC + 6HCl
    CHEMICAL_RECIPES.recipeBuilder("tungsten_hexachloride_methane_hydrogen_to_tungsten_carbide_hydrochloric_acid")
        .inputDust(TungstenHexachloride, 7)
        .inputFluids(Methane.getFluid(1000))
        .inputFluids(Hydrogen.getFluid(2000))
        .outputDust(TungstenCarbide, 2)
        .outputFluids(HydrochloricAcid.getFluid(6000))
        .EUt(480)
        .duration(100)
        .save(provider);

    LARGE_CHEMICAL_RECIPES.recipeBuilder("liquid_enriched_helium_liquid_nitrogen_to_superfluid_helium_liquid_helium3_nitrogen").duration(150).EUt(725000)
        .inputFluids(LiquidEnrichedHelium.getFluid(2000))
        .inputFluids(LiquidNitrogen.getFluid(1000))
        .outputFluids(SuperfluidHelium.getFluid(1000))
        .outputFluids(Helium3.getFluid(FluidStorageKeys.LIQUID, 1000))
        .outputFluids(Nitrogen.getFluid(1000))
        .save(provider);

    CHEMICAL_RECIPES.recipeBuilder("cycloparaphenylene_methane_neutronium_to_neutronium_doped_nanotubes").duration(290).EUt(320000)
        .inputFluids(Cycloparaphenylene.getFluid(200))
        .inputFluids(Methane.getFluid(800))
        .inputDust(Neutronium)
        .notConsumable(plate, Rhenium)
        .outputFluids(NeutroniumDopedNanotubes.getFluid(1000))
        .save(provider);


    // Pitchblende Processing was removed to save 2 steps
    // and was simplified to just electrolysis into Uraninite.

    // UO2 + 2 Cl + H2O -> [UO2Cl2 + H2O + ?]
    CHEMICAL_RECIPES.recipeBuilder("uraninite_chlorine_water_to_uranyl_chloride_solution").duration(50).EUt(120)
        .inputDust(Uraninite, 3)
        .inputFluids(Chlorine.getFluid(2000))
        .inputFluids(Water.getFluid(1000))
        .outputFluids(UranylChlorideSolution.getFluid(1000))
        .save(provider);


    // [UO2Cl2 + H2O + ?] + 2HNO3 -> [UO2(NO3)2 + H2O + ?] + 2HCl
    CHEMICAL_RECIPES.recipeBuilder("uranyl_chloride_solution_nitric_acid_to_uranyl_nitrate_solution_hydrochloric_acid").duration(100).EUt(120)
        .inputFluids(UranylChlorideSolution.getFluid(1000))
        .inputFluids(NitricAcid.getFluid(2000))
        .outputFluids(UranylNitrateSolution.getFluid(1000))
        .outputFluids(HydrochloricAcid.getFluid(2000))
        .save(provider);


    // [UO2(NO3)2 + H2O + ?] + H2SO4 -> [UO2(NO3)2 + H2O] + [? + SO4]
    CHEMICAL_RECIPES.recipeBuilder("uranyl_nitrate_solution_sulfuric_acid_to_purified_uranyl_nitrate_uranium_sulfate_waste_solution").duration(40).EUt(120)
        .inputFluids(UranylNitrateSolution.getFluid(1000))
        .inputFluids(SulfuricAcid.getFluid(1000))
        .outputFluids(PurifiedUranylNitrate.getFluid(1000))
        .outputFluids(UraniumSulfateWasteSolution.getFluid(1000))
        .save(provider);


    // 2[UO2(NO3)2 + H2O] + 4H2O + 8C -> (NH4)2U2O7 + 2HNO3 + 8CO
    LARGE_CHEMICAL_RECIPES.recipeBuilder("carbon_purified_uranyl_nitrate_water_to_uranium_diuranate_nitric_acid_carbon_monoxide").duration(140).EUt(120)
        .inputDust(Carbon, 8)
        .inputFluids(PurifiedUranylNitrate.getFluid(2000))
        .inputFluids(Water.getFluid(4000))
        .outputFluids(UraniumDiuranate.getFluid(1000))
        .outputFluids(NitricAcid.getFluid(2000))
        .outputFluids(CarbonMonoxide.getFluid(8000))
        .save(provider);


    // CO2 + 2KOH -> K2CO3 + H2O
    CHEMICAL_RECIPES.recipeBuilder("potassium_hydroxide_carbon_dioxide_to_potassium_carbonate_water").duration(90).EUt(30)
        .inputFluids(PotassiumHydroxide.getFluid(2000))
        .inputFluids(CarbonDioxide.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, PotassiumCarbonate, 6))
        .outputFluids(Water.getFluid(1000))
        .save(provider);


    // (NH4)2U2O7 + 2K2CO3 -> 2UO2(CO3) + 2K2O + 2NH3 + H2O
    LARGE_CHEMICAL_RECIPES.recipeBuilder("uranium_diuranate_potassium_carbonate_to_potassium_uranyl_tricarbonate_ammonia_water_potash").duration(160).EUt(120)
        .inputFluids(UraniumDiuranate.getFluid(1000))
        .inputDust(PotassiumCarbonate, 12)
        .outputItems(ChemicalHelper.get(dust, PotassiumUranylTricarbonate, 10))
        .outputFluids(Ammonia.getFluid(2000))
        .outputFluids(Water.getFluid(1000))
        .outputDust(Potash, 6)
        .save(provider);


    // UO2(CO3) + [H2O2 + H2SO4] -> [UO3â€¢H2O2 + ThO2] + [? + C + H2SO4]
    CHEMICAL_RECIPES.recipeBuilder("potassium_uranyl_tricarbonate_piranha_solution_to_uranium_refinement_waste_solution_uranium_peroxide_thorium_oxide").duration(200).EUt(480)
        .inputDust(PotassiumUranylTricarbonate, 5)
        .inputFluids(PiranhaSolution.getFluid(2000))
        .outputFluids(UraniumRefinementWasteSolution.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, UraniumPeroxideThoriumOxide, 8))
        .save(provider);


    // [UO2 + ThO2] + H2SO4 + S -> [UO2SO4 + ThO2] + H2S
    CHEMICAL_RECIPES.recipeBuilder("uranium_thorium_oxide_sulfur_sulfuric_acid_to_uranyl_thorium_sulfate_hydrogen_sulfide").duration(110).EUt(120)
        .inputDust(UraniumThoriumOxide, 6)
        .inputDust(Sulfur)
        .inputFluids(SulfuricAcid.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, UranylThoriumSulfate, 11))
        .outputFluids(HydrogenSulfide.getFluid(1000))
        .save(provider);


    // [UO2SO4 + ThO2] + 6HNO3 -> [UO2(NO3)2 + Th(NO3)4] + 2H2O + H2SO4
    CHEMICAL_RECIPES.recipeBuilder("uranyl_thorium_sulfate_nitric_acid_to_uranyl_thorium_nitrate_sulfuric_acid_water").duration(120).EUt(120)
        .inputDust(UranylThoriumSulfate, 11)
        .inputFluids(NitricAcid.getFluid(6000))
        .outputItems(ChemicalHelper.get(dust, UranylThoriumNitrate, 26))
        .outputFluids(SulfuricAcid.getFluid(1000))
        .outputFluids(Water.getFluid(2000))
        .save(provider);


    // NaNO3 + H2O -> NaOH + HNO3
    CHEMICAL_RECIPES.recipeBuilder("sodium_nitrate_water_to_sodium_hydroxide_nitric_acid").duration(100).EUt(120)
        .inputDust(SodiumNitrate, 5)
        .inputFluids(Water.getFluid(1000))
        .outputDust(SodiumHydroxide, 3)
        .outputFluids(NitricAcid.getFluid(1000))
        .save(provider);


    // H2SO4 + NH4Cl + Na3VO4 = NH4VO3 + [Cl + 3Na + O + H2SO4]
    CHEMICAL_RECIPES.recipeBuilder("sulfuric_acid_sodium_vanadate_ammonium_chloride_to_ammonium_vanadate_vanadium_waste_solution").duration(120).EUt(120)
        .inputFluids(SulfuricAcid.getFluid(1000))
        .inputDust(SodiumVanadate, 8)
        .inputFluids(AmmoniumChloride.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, AmmoniumVanadate, 9))
        .outputFluids(VanadiumWasteSolution.getFluid(1000))
        .save(provider);


    // Na2SO4 + H2 -> H2SO4 + 2Na
    CHEMICAL_RECIPES.recipeBuilder("sodium_sulfate_hydrogen_to_sodium_sulfuric_acid").duration(90).EUt(30)
        .inputDust(SodiumSulfate, 7)
        .inputFluids(Hydrogen.getFluid(2000))
        .outputDust(Sodium, 2)
        .outputFluids(SulfuricAcid.getFluid(1000))
        .save(provider);


    // Sodium Hypochlorite =========================================================================================
    // 2NaOH + 2Cl -> H2O + NaCl + NaClO
    LARGE_CHEMICAL_RECIPES.recipeBuilder("chlorine_sodium_hydroxide_to_water_salt_sodium_hypochlorite").duration(80).EUt(120)
        .inputFluids(Chlorine.getFluid(2000))
        .inputDust(SodiumHydroxide, 6)
        .outputFluids(Water.getFluid(1000))
        .outputDust(Salt, 2)
        .outputItems(ChemicalHelper.get(dust, SodiumHypochlorite, 3))
        .save(provider);


    // HClO + NaOH -> H2O + NaClO
    CHEMICAL_RECIPES.recipeBuilder("hypochlorous_acid_sodium_hydroxide_to_water_sodium_hypochlorite").duration(90).EUt(120)
        .inputFluids(HypochlorousAcid.getFluid(1000))
        .inputDust(SodiumHydroxide, 3)
        .circuitMeta(0)
        .outputFluids(Water.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, SodiumHypochlorite, 3))
        .save(provider);


    // 2 NaClO + CO2 + H2O -> 2 HClO + Na2CO3
    CHEMICAL_RECIPES.recipeBuilder("sodium_hypochlorite_carbon_dioxide_water_to_soda_ash_hypochlorous_acid").duration(90).EUt(120)
        .inputDust(SodiumHypochlorite, 6)
        .inputFluids(CarbonDioxide.getFluid(1000))
        .inputFluids(Water.getFluid(1000))
        .outputDust(SodaAsh, 6)
        .outputFluids(HypochlorousAcid.getFluid(2000))
        .save(provider);

    // TODO migrated disabled: unresolved old test symbol `WHITE_HALIDE_LAMP`.
    //         CHEMICAL_RECIPES.recipeBuilder("graphene_oxide_hydrazine_to_graphene").duration(30).EUt(480)
    //                 .inputDust(GrapheneOxide, 3)
    //                 .notConsumable(WHITE_HALIDE_LAMP.asStack())
    //                 .inputFluids(Hydrazine.getFluid(0))
    //                 .outputDust(Graphene)
    //                 .save(provider);
    //
    //
    //

// Pyrotheum ===================================================================================================
    CHEMICAL_RECIPES.recipeBuilder("coal_sulfur_lava_to_blaze").duration(80).EUt(480)
        .inputDust(Coal)
        .inputDust(Sulfur)
        .inputFluids(Lava.getFluid(0))
        .outputDust(Blaze, 2)
        .save(provider);

    CHEMICAL_RECIPES.recipeBuilder("charcoal_sulfur_lava_to_blaze").duration(80).EUt(480)
        .inputDust(Charcoal)
        .inputDust(Sulfur)
        .inputFluids(Lava.getFluid(0))
        .outputDust(Blaze, 2)
        .save(provider);


    // Cryotheum ===================================================================================================
    CHEMICAL_RECIPES.recipeBuilder("snow_redstone_ice_to_blizz").duration(80).EUt(480)
        .inputDust(Snow)
        .inputDust(Redstone)
        .inputFluids(Ice.getFluid(0))
        .outputDust(Blizz, 2)
        .save(provider);


    // 3Cl + P -> PCl3
    CHEMICAL_RECIPES.recipeBuilder("chlorine_phosphorus_to_phosphorus_trichloride").duration(60)
        .inputFluids(Chlorine.getFluid(3000))
        .inputDust(Phosphorus)
        .circuitMeta(3)
        .outputFluids(PhosphorusTrichloride.getFluid(1000))
        .save(provider);


    // PCl3 + O -> POCl3
    CHEMICAL_RECIPES.recipeBuilder("phosphorus_trichloride_oxygen_to_phosphoryl_chloride").duration(100)
        .inputFluids(PhosphorusTrichloride.getFluid(1000))
        .inputFluids(Oxygen.getFluid(1000))
        .outputFluids(PhosphorylChloride.getFluid(1000))
        .save(provider);


    // POCl3 + 3C4H10O -> C12H27O4P + 3HCl
    CHEMICAL_RECIPES.recipeBuilder("phosphoryl_chloride_butanol_to_hydrochloric_acid_tributyl_phosphate").duration(100)
        .inputFluids(PhosphorylChloride.getFluid(1000))
        .inputFluids(Butanol.getFluid(3000))
        .outputFluids(HydrochloricAcid.getFluid(3000))
        .outputFluids(TributylPhosphate.getFluid(1000))
        .save(provider);


    // Formic acid =================================================================================================
    // CO + NaOH -> HCOONa
    CHEMICAL_RECIPES.recipeBuilder("carbon_monoxide_sodium_hydroxide_to_sodium_formate").EUt(30).duration(60)
        .inputFluids(CarbonMonoxide.getFluid(1000))
        .inputDust(SodiumHydroxide, 3)
        .circuitMeta(0)
        .outputFluids(SodiumFormate.getFluid(1000))
        .save(provider);


    // HCOONa + H2SO4 -> CH2O2 + NaHSO4
    CHEMICAL_RECIPES.recipeBuilder("sodium_formate_sulfuric_acid_to_formic_acid_sodium_bisulfate").EUt(30).duration(60)
        .inputFluids(SodiumFormate.getFluid(1000))
        .inputFluids(SulfuricAcid.getFluid(1000))
        .outputFluids(FormicAcid.getFluid(1000))
        .outputDust(SodiumBisulfate, 7)
        .save(provider);


    // Misc Reactions ==============================================================================================
    // 3Ca + 3PO4 + H + O -> [3Ca + 3PO4 + H + O]
    CHEMICAL_RECIPES.recipeBuilder("calcium_phosphate_hydrogen_oxygen_to_organic_fertilizer").EUt(30).duration(100)
        .inputDust(Calcium, 3)
        .inputDust(Phosphate, 3) // this is probably wrong
        .inputFluids(Hydrogen.getFluid(1000))
        .inputFluids(Oxygen.getFluid(1000))
        .outputDust(OrganicFertilizer, 10)
        .save(provider);


    // 2HCl + CaCO3 -> H2O + CO2 + CaCl2
    CHEMICAL_RECIPES.recipeBuilder("hydrochloric_acid_calcite_to_water_carbon_dioxide_calcium_chloride").duration(100).EUt(30)
        .inputFluids(HydrochloricAcid.getFluid(2000))
        .inputDust(Calcite, 5)
        .outputFluids(Water.getFluid(1000))
        .outputFluids(CarbonDioxide.getFluid(1000))
        .outputDust(CalciumChloride, 3)
        .save(provider);


    // Zr + 4Cl -> ZrCl4
    CHEMICAL_RECIPES.recipeBuilder("zirconium_chlorine_to_zirconium_tetrachloride").duration(100).EUt(120)
        .inputDust(Zirconium)
        .inputFluids(Chlorine.getFluid(4000))
        .outputItems(ChemicalHelper.get(dust, ZirconiumTetrachloride, 5))
        .save(provider);


    // Fe + 3HCl -> FeCl3 + 3H
    CHEMICAL_RECIPES.recipeBuilder("iron_hydrochloric_acid_to_iron_chloride_hydrogen").duration(100).EUt(30)
        .inputDust(Iron)
        .inputFluids(HydrochloricAcid.getFluid(3000))
        .outputFluids(IronChloride.getFluid(1000))
        .outputFluids(Hydrogen.getFluid(3000))
        .save(provider);


    // Li + Cl -> LiCl
    CHEMICAL_RECIPES.recipeBuilder("lithium_chlorine_to_lithium_chloride").duration(125).EUt(120)
        .inputDust(Lithium)
        .inputFluids(Chlorine.getFluid(1000))
        .circuitMeta(1)
        .outputItems(ChemicalHelper.get(dust, LithiumChloride, 2))
        .save(provider);


    // Al + 3Cl -> AlCl3
    CHEMICAL_RECIPES.recipeBuilder("aluminium_chlorine_to_aluminium_chloride").duration(100).EUt(30)
        .inputDust(Aluminium)
        .inputFluids(Chlorine.getFluid(3000))
        .circuitMeta(1)
        .outputItems(ChemicalHelper.get(dust, AluminiumChloride, 4))
        .save(provider);


    // C16H12O2H2 + 2O + C14H10 (catalyst) -> H2O2 + C16H12O2
    CHEMICAL_RECIPES.recipeBuilder("oxygen_ethyl_anthra_hydro_quinone_to_hydrogen_peroxide_ethyl_anthra_quinone").duration(600).EUt(240)
        .inputFluids(Oxygen.getFluid(2000))
        .inputFluids(EthylAnthraHydroQuinone.getFluid(1000))
        .notConsumableDust(Anthracene)
        .outputFluids(HydrogenPeroxide.getFluid(2000))
        .outputFluids(EthylAnthraQuinone.getFluid(1000))
        .save(provider);


    // 2H + C16H12O2 -> C16H12O2H2
    CHEMICAL_RECIPES.recipeBuilder("hydrogen_ethyl_anthra_quinone_to_ethyl_anthra_hydro_quinone").duration(600).EUt(120)
        .inputFluids(Hydrogen.getFluid(2000))
        .inputFluids(EthylAnthraQuinone.getFluid(1000))
        .outputFluids(EthylAnthraHydroQuinone.getFluid(1000))
        .save(provider);


    // C8H4O3 + C8H10 -> C16H12O2 + H2O
    CHEMICAL_RECIPES.recipeBuilder("phthalic_anhydride_ethylbenzene_to_ethyl_anthra_quinone_water").duration(300).EUt(120)
        .inputDust(PhthalicAnhydride, 15)
        .inputFluids(Ethylbenzene.getFluid(1000))
        .outputFluids(EthylAnthraQuinone.getFluid(1000))
        .outputFluids(Water.getFluid(1000))
        .save(provider);

// C2H4 + C6H6 -> C8H10
    CHEMICAL_RECIPES.recipeBuilder("ethylene_benzene_to_ethylbenzene").duration(300).EUt(60)
        .circuitMeta(1)
        .inputFluids(Ethylene.getFluid(1000))
        .inputFluids(Benzene.getFluid(1000))
        .outputFluids(Ethylbenzene.getFluid(1000))
        .save(provider);


// 21O + 4 C10H8 -> 5C8H6O4 + H2O
    CHEMICAL_RECIPES.recipeBuilder("oxygen_naphthalene_to_phthalic_acid_water").duration(210).EUt(120)
        .notConsumable(dust, Lithium)
        .inputFluids(Oxygen.getFluid(21000))
        .inputFluids(Naphthalene.getFluid(4000))
        .outputFluids(PhthalicAcid.getFluid(5000))
        .outputFluids(Water.getFluid(1000))
        .save(provider);


    // HClO + C2H4 -> C2H5ClO
    CHEMICAL_RECIPES.recipeBuilder("hypochlorous_acid_ethylene_to_chloroethanol").duration(120).EUt(480)
        .inputFluids(HypochlorousAcid.getFluid(1000))
        .inputFluids(Ethylene.getFluid(1000))
        .outputFluids(Chloroethanol.getFluid(1000))
        .save(provider);


    // C2H5ClO + C3H9N + Na -> C5H14NO + NaCl
    CHEMICAL_RECIPES.recipeBuilder("sodium_chloroethanol_trimethylamine_to_salt_choline").duration(120).EUt(480)
        .inputDust(Sodium)
        .inputFluids(Chloroethanol.getFluid(1000))
        .inputFluids(Trimethylamine.getFluid(1000))
        .outputDust(Salt, 2)
        .outputFluids(Choline.getFluid(1000))
        .save(provider);

    // C2(H2O)4C + C5H14NO -> ATL
    CHEMICAL_RECIPES.recipeBuilder("coal_choline_to_atl").duration(120).EUt(120)
        .inputDust(Coal)
        .inputFluids(Choline.getFluid(1000))
        .outputFluids(ATL.getFluid(1000))
        .save(provider);

// C7H8 + 2COCl2 + 2HNO3 + 12 H -> C9H6N2O2 + 4 HCl + 6 H2O
    LARGE_CHEMICAL_RECIPES.recipeBuilder("toluene_phosgene_nitric_acid_hydrogen_to_toluene_diisocyanate_hydrochloric_acid_water").duration(125).EUt(480)
        .inputFluids(Toluene.getFluid(1000))
        .inputFluids(Phosgene.getFluid(2000))
        .inputFluids(NitricAcid.getFluid(2000))
        .inputFluids(Hydrogen.getFluid(10000))
        .outputFluids(TolueneDiisocyanate.getFluid(2000))
        .outputFluids(HydrochloricAcid.getFluid(4000))
        .outputFluids(Water.getFluid(6000))
        .save(provider);


    // C9H6N2O2 + 4C2H6O2 + O -> C17H16N2O4 + 7H2O
    CHEMICAL_RECIPES.recipeBuilder("toluene_diisocyanate_ethylene_glycol_oxygen_to_polyurethane_water").duration(110).EUt(480)
        .inputFluids(TolueneDiisocyanate.getFluid(1000))
        .inputFluids(EthyleneGlycol.getFluid(4000))
        .inputFluids(Oxygen.getFluid(1000))
        .outputFluids(Polyurethane.getFluid(1000))
        .outputFluids(Water.getFluid(7000))
        .save(provider);


    // High Octane Gasoline
    LARGE_CHEMICAL_RECIPES.recipeBuilder("nitric_oxide_gasoline_toluene_octane_ethyl_tert_butyl_ether_to_high_octane_gasoline").duration(50).EUt(1920)
        .inputFluids(NitricOxide.getFluid(200))
        .inputFluids(Gasoline.getFluid(666))
        .inputFluids(Toluene.getFluid(33))
        .inputFluids(Octane.getFluid(66))
        .inputFluids(EthylTertButylEther.getFluid(100))
        .outputFluids(HighOctaneGasoline.getFluid(1065))
        .save(provider);


    // Gasoline
    CHEMICAL_RECIPES.recipeBuilder("raw_gasoline_toluene_to_gasoline").duration(10).EUt(480)
        .inputFluids(RawGasoline.getFluid(10000))
        .inputFluids(Toluene.getFluid(1000))
        .outputFluids(Gasoline.getFluid(11000))
        .save(provider);


    // Raw Gasoline
    // TODO migrated disabled: unresolved old test symbol `Gas`.
    //         LARGE_CHEMICAL_RECIPES.recipeBuilder("naphtha_gas_methanol_acetone_to_raw_gasoline").duration(100).EUt(480)
    //                 .inputFluids(Naphtha.getFluid(16000))
    //                 .inputFluids(Gas.getFluid(2000))
    //                 .inputFluids(Methanol.getFluid(1000))
    //                 .inputFluids(Acetone.getFluid(1000))
    //                 .outputFluids(RawGasoline.getFluid(20000))
    //                 .save(provider);
    //
    //

    CHEMICAL_RECIPES.recipeBuilder("ethanol_butane_to_ethyl_tert_butyl_ether").duration(400).EUt(480)
        .inputFluids(Ethanol.getFluid(1000))
        .inputFluids(Butane.getFluid(1000))
        .outputFluids(EthylTertButylEther.getFluid(2000))
        .save(provider);


    // 2NO2 = N2O4
    CHEMICAL_RECIPES.recipeBuilder("nitrogen_dioxide_to_dinitrogen_tetroxide").duration(320).EUt(480)
        .notConsumable(dust, Copper)
        .inputFluids(NitrogenDioxide.getFluid(2000))
        .outputFluids(DinitrogenTetroxide.getFluid(1000))
        .save(provider);


    // Rocket fuel chemicals
    // 2NH3 + H2O2 = N2H4 + H2O
    CHEMICAL_RECIPES.recipeBuilder("ammonia_hydrogen_peroxide_to_hydrazine_water").duration(320).EUt(30)
        .inputFluids(Ammonia.getFluid(2000))
        .inputFluids(HydrogenPeroxide.getFluid(1000))
        .outputFluids(Hydrazine.getFluid(1000))
        .outputFluids(Water.getFluid(1000))
        .save(provider);

// Ca(OH)2 + 2HCl -> 2H2O + CaCl2
    CHEMICAL_RECIPES.recipeBuilder("calcium_hydroxide_hydrochloric_acid_to_water_calcium_chloride")
        .inputDust(CalciumHydroxide, 5)
        .inputFluids(HydrochloricAcid.getFluid(2000))
        .outputFluids(Water.getFluid(2000))
        .outputDust(CalciumChloride, 3)
        .EUt(120)
        .duration(60)
        .save(provider);


    // O + CH3OH -> CH2O + H2O
    CHEMICAL_RECIPES.recipeBuilder("oxygen_methanol_to_formaldehyde_water")
        .notConsumable(dust, Silver)
        .inputFluids(Oxygen.getFluid(1000))
        .inputFluids(Methanol.getFluid(1000))
        .outputFluids(Formaldehyde.getFluid(1000))
        .outputFluids(Water.getFluid(1000))
        .EUt(30720)
        .duration(200)
        .save(provider);


    // CH2O + C2H2 -> C3H4O
    CHEMICAL_RECIPES.recipeBuilder("formaldehyde_acetylene_to_propargyl_alcohol")
        .notConsumable(dust, Copper)
        .inputFluids(Formaldehyde.getFluid(1000))
        .inputFluids(Acetylene.getFluid(1000))
        .outputFluids(PropargylAlcohol.getFluid(1000))
        .EUt(120)
        .duration(120)
        .save(provider);


    // C3H4O + HCl -> C3H3Cl + H2O
    CHEMICAL_RECIPES.recipeBuilder("propargyl_alcohol_hydrochloric_acid_to_propargyl_chloride_water")
        .inputFluids(PropargylAlcohol.getFluid(1000))
        .inputFluids(HydrochloricAcid.getFluid(1000))
        .outputFluids(PropargylChloride.getFluid(1000))
        .outputFluids(Water.getFluid(1000))
        .EUt(120)
        .duration(100)
        .save(provider);


    // C10H16 + H2SO4 -> C10H16 + H2SO4
    CHEMICAL_RECIPES.recipeBuilder("turpentine_sulfuric_acid_to_beta_pinene_sulfuric_acid")
        .inputFluids(Turpentine.getFluid(1000))
        .inputFluids(SulfuricAcid.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, BetaPinene, 26))
        .outputFluids(SulfuricAcid.getFluid(1000))
        .EUt(480)
        .duration(110)
        .save(provider);


    // C10H16 + 2C5H8 + 2O -> 2C10H16O
    CHEMICAL_RECIPES.recipeBuilder("beta_pinene_isoprene_oxygen_to_citral")
        .inputDust(BetaPinene, 26)
        .inputFluids(Isoprene.getFluid(2000))
        .inputFluids(Oxygen.getFluid(2000))
        .outputFluids(Citral.getFluid(2000))
        .EUt(480)
        .duration(100)
        .save(provider);


    // C10H16O + C3H6O -> C13H20O + H2O
    CHEMICAL_RECIPES.recipeBuilder("citral_acetone_to_beta_ionone_water")
        .inputFluids(Citral.getFluid(1000))
        .inputFluids(Acetone.getFluid(1000))
        .outputFluids(BetaIonone.getFluid(1000))
        .outputFluids(Water.getFluid(1000))
        .EUt(120)
        .duration(250)
        .save(provider);


    // 25C13H20O + 5C3H3Cl -> 17C20H30O + 8O + 5HCl
    LARGE_CHEMICAL_RECIPES.recipeBuilder("beta_ionone_propargyl_chloride_to_vitamin_a_oxygen_hydrochloric_acid")
        .inputFluids(BetaIonone.getFluid(25000))
        .inputFluids(PropargylChloride.getFluid(5000))
        .outputFluids(VitaminA.getFluid(17000))
        .outputFluids(Oxygen.getFluid(8000))
        .outputFluids(HydrochloricAcid.getFluid(5000))
        .EUt(480)
        .duration(150)
        .save(provider);


    // C2H4 + O -> C2H4O
    CHEMICAL_RECIPES.recipeBuilder("ethylene_oxygen_to_ethylene_oxide")
        .circuitMeta(10)
        .inputFluids(Ethylene.getFluid(1000))
        .inputFluids(Oxygen.getFluid(1000))
        .outputFluids(EthyleneOxide.getFluid(1000))
        .EUt(480)
        .duration(100)
        .save(provider);


    // NH3 + C2H4O -> C2H7NO
    CHEMICAL_RECIPES.recipeBuilder("ammonia_ethylene_oxide_to_ethanolamine")
        .inputFluids(Ammonia.getFluid(1000))
        .inputFluids(EthyleneOxide.getFluid(1000))
        .outputFluids(Ethanolamine.getFluid(1000))
        .EUt(7680)
        .duration(60)
        .save(provider);

    LARGE_CHEMICAL_RECIPES.recipeBuilder("biotin_linoleic_acid_catalase_vitamin_a_ethanolamine_to_b27_supplement")
        .inputFluids(Biotin.getFluid(1000))
        .inputFluids(LinoleicAcid.getFluid(1000))
        .inputFluids(Catalase.getFluid(1000))
        .inputFluids(VitaminA.getFluid(1000))
        .inputFluids(Ethanolamine.getFluid(1000))
        .outputFluids(B27Supplement.getFluid(5000))
        .EUt(7680)
        .duration(150)
        .save(provider);


    // [H2SO4 + HNO3] + C6H6 -> C6H5NO2 + H2O + H2SO4
    CHEMICAL_RECIPES.recipeBuilder("nitration_mixture_benzene_to_nitro_benzene_diluted_sulfuric_acid")
        .inputFluids(NitrationMixture.getFluid(2000))
        .inputFluids(Benzene.getFluid(1000))
        .outputFluids(NitroBenzene.getFluid(1000))
        .outputFluids(DilutedSulfuricAcid.getFluid(2000))
        .EUt(30)
        .duration(100)
        .save(provider);


    // 6H + C6H5NO2 -> C6H5NH2 + 2H2O
    CHEMICAL_RECIPES.recipeBuilder("hydrogen_nitro_benzene_to_aniline_water")
        .inputFluids(Hydrogen.getFluid(6000))
        .inputFluids(NitroBenzene.getFluid(1000))
        .notConsumable(dust, Zinc)
        .outputFluids(Aniline.getFluid(1000))
        .outputFluids(Water.getFluid(2000))
        .EUt(30)
        .duration(100)
        .save(provider);


    // HCl + 2H2SO4 + O -> HSO3Cl + 2H2O + SO3
    LARGE_CHEMICAL_RECIPES.recipeBuilder("hydrochloric_acid_sulfuric_acid_oxygen_to_chlorosulfonic_acid_water_sulfur_trioxide")
        .inputFluids(HydrochloricAcid.getFluid(1000))
        .inputFluids(SulfuricAcid.getFluid(2000))
        .inputFluids(Oxygen.getFluid(1000))
        .outputFluids(ChlorosulfonicAcid.getFluid(2000))
        .outputFluids(Water.getFluid(2000))
        .outputFluids(SulfurTrioxide.getFluid(1000))
        .EUt(480)
        .duration(200)
        .save(provider);


    // C6H5NH2 + (CH3CO)2O + HSO3Cl -> C8H8ClNO3S + H2O + CH3COOH
    LARGE_CHEMICAL_RECIPES.recipeBuilder("aniline_acetic_anhydride_chlorosulfonic_acid_to_acetylsulfanilyl_chloride_water_acetic_acid")
        .inputFluids(Aniline.getFluid(1000))
        .inputFluids(AceticAnhydride.getFluid(1000))
        .inputFluids(ChlorosulfonicAcid.getFluid(1000))
        .outputFluids(AcetylsulfanilylChloride.getFluid(1000))
        .outputFluids(Water.getFluid(1000))
        .outputFluids(AceticAcid.getFluid(1000))
        .EUt(1920)
        .duration(100)
        .save(provider);


    // H2O + Na2CO3 -> NaHCO3 + NaOH
    LARGE_CHEMICAL_RECIPES.recipeBuilder("water_soda_ash_to_sodium_bicarbonate_sodium_hydroxide").duration(140).EUt(30)
        .inputFluids(Water.getFluid(1000))
        .inputDust(SodaAsh, 6)
        .outputItems(ChemicalHelper.get(dust, SodiumBicarbonate, 6))
        .outputDust(SodiumHydroxide, 3)
        .save(provider);


    // NaHCO3 + C8H8ClNO3S + NH3 -> NaCl + C6H8N2O2S + CO2 + CH3COOH
    LARGE_CHEMICAL_RECIPES.recipeBuilder("sodium_bicarbonate_acetylsulfanilyl_chloride_ammonia_to_salt_sulfanilamide_carbon_dioxide_acetic_acid")
        .inputDust(SodiumBicarbonate, 6)
        .inputFluids(AcetylsulfanilylChloride.getFluid(1000))
        .inputFluids(Ammonia.getFluid(1000))
        .outputDust(Salt, 2)
        .outputFluids(Sulfanilamide.getFluid(1000))
        .outputFluids(CarbonDioxide.getFluid(1000))
        .outputFluids(AceticAcid.getFluid(1000))
        .EUt(30720)
        .duration(50)
        .save(provider);


    // Metal Rich Slag Slurry [Contains: H2O] + H3PO4 = Acidic Metal Slurry [Contains: H2O + H3PO4]
    CHEMICAL_RECIPES.recipeBuilder("metal_rich_slag_slurry_phosphoric_acid_to_acidic_metal_slurry").duration(140).EUt(30)
        .inputFluids(MetalRichSlagSlurry.getFluid(1000))
        .inputFluids(PhosphoricAcid.getFluid(1000))
        .outputFluids(AcidicMetalSlurry.getFluid(1000))
        .save(provider);


    // 2 Acidic Metal Slurry [Contains: H2O + H3PO4] + H3PO4 = Separated Metal Slurry [Contains: 3 H3PO4 + H2O] + Metal Rich Slag Slurry [Contains: H2O]
    CHEMICAL_RECIPES.recipeBuilder("acidic_metal_slurry_phosphoric_acid_to_separated_metal_slurry_metal_rich_slag_slurry").duration(180).EUt(30)
        .inputFluids(AcidicMetalSlurry.getFluid(2000))
        .inputFluids(PhosphoricAcid.getFluid(1000))
        .outputFluids(SeparatedMetalSlurry.getFluid(1000))
        .outputFluids(MetalRichSlagSlurry.getFluid(1000))
        .save(provider);


    // Separated Metal Slurry [Contains: 3 H3PO4 + H2O] + 2NaOH = Metal Hydroxide Mix + Na2HPO4 + 2H2O
    // 3 H3PO4 + 6 NaOH + H2O = 3 Na2HPO4 + 7 H2O
    CHEMICAL_RECIPES.recipeBuilder("separated_metal_slurry_sodium_hydroxide_to_metal_hydroxide_mix_water_disodium_phosphate").duration(150).EUt(30)
        .inputFluids(SeparatedMetalSlurry.getFluid(1000))
        .inputDust(SodiumHydroxide, 18)
        .outputFluids(MetalHydroxideMix.getFluid(1000))
        .outputFluids(Water.getFluid(7000))
        .outputItems(ChemicalHelper.get(dust, DisodiumPhosphate, 24))
        .save(provider);

    // Cadmium Zinc Dust [Contains: Cd + Zn + H2SO4] + Hg = Cadmium Thallium Liquor [Contains: Cd + Tl + H2SO4] + Zinc Amalgam [Contains: Zn + Hg]
    CHEMICAL_RECIPES.recipeBuilder("cadmium_zinc_mercury_to_cadmium_thallium_liquor_zinc_amalgam").duration(140).EUt(120)
        .inputDust(CadmiumZinc, 3)
        .inputFluids(Mercury.getFluid(1000))
        .outputFluids(CadmiumThalliumLiquor.getFluid(1000))
        .outputFluids(ZincAmalgam.getFluid(1000))
        .save(provider);


// Thallium Residue [Contains: 2 Tl] + H2SO4 = Thallium Sulfate Solution [Contains: Tl2SO4]
    CHEMICAL_RECIPES.recipeBuilder("thallium_residue_sulfuric_acid_water_to_thallium_sulfate_solution").duration(120).EUt(120)
        .inputDust(ThalliumResidue)
        .inputFluids(SulfuricAcid.getFluid(1000))
        .inputFluids(Water.getFluid(1000))
        .outputFluids(ThalliumSulfateSolution.getFluid(1000))
        .save(provider);


    // Thallium Sulfate Solution [Contains: Tl2SO4 + H2O] + 2 HCl  = 2TlCl + H2SO4 + H2O (because solution)
    CHEMICAL_RECIPES.recipeBuilder("thallium_sulfate_solution_hydrochloric_acid_to_thallium_chloride_sulfuric_acid_water").duration(230).EUt(120)
        .inputFluids(ThalliumSulfateSolution.getFluid(1000))
        .inputFluids(HydrochloricAcid.getFluid(2000))
        .outputItems(ChemicalHelper.get(dust, ThalliumChloride, 4))
        .outputFluids(SulfuricAcid.getFluid(1000))
        .outputFluids(Water.getFluid(1000))
        .save(provider);


    // Na2CO3 + SO2 = Na2SO3 + CO2
    CHEMICAL_RECIPES.recipeBuilder("soda_ash_sulfur_dioxide_to_sodium_sulfite_carbon_dioxide").duration(70).EUt(30)
        .inputDust(SodaAsh, 6)
        .inputFluids(SulfurDioxide.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, SodiumSulfite, 6))
        .outputFluids(CarbonDioxide.getFluid(1000))
        .save(provider);


    // 2 Wood + Na2SO4 + H2O2 + [NaOH + H2O] = 2C6H10O5 + Polyphenol Mix
    // This recipe is close enough
    CHEMICAL_RECIPES.recipeBuilder("wood_sodium_sulfite_hydrogen_peroxide_sodium_hydroxide_solution_to_cellulose_polyphenol_mix").duration(90).EUt(30)
        .inputDust(Wood, 2)
        .inputDust(SodiumSulfite, 6)
        .inputFluids(HydrogenPeroxide.getFluid(1000))
        .inputFluids(SodiumHydroxideSolution.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, Cellulose, 42))
        .outputFluids(PolyphenolMix.getFluid(1000))
        .save(provider);


    // Polyphenol Mix = Acidified Polyphenol Mix
    CHEMICAL_RECIPES.recipeBuilder("polyphenol_mix_hydrochloric_acid_to_acidified_polyphenol_mix").duration(200).EUt(30)
        .inputFluids(PolyphenolMix.getFluid(1000))
        .inputFluids(HydrochloricAcid.getFluid(0))
        .outputFluids(AcidifiedPolyphenolMix.getFluid(1000))
        .save(provider);


    // 0.5(C2H5)2O + Acidified Polyphenol Mix = 1 Tannic Acid + 0.5 Wood Tar
    CHEMICAL_RECIPES.recipeBuilder("diethylether_acidified_polyphenol_mix_to_tannic_acid_wood_tar").duration(100).EUt(120)
        .inputFluids(Diethylether.getFluid(500))
        .inputFluids(AcidifiedPolyphenolMix.getFluid(1000))
        .outputFluids(TannicAcid.getFluid(1000))
        .outputFluids(WoodTar.getFluid(500))
        .save(provider);


    // ZincLeachingResidue [Contains: (H2O)(H2SO4)] -> FeSO4 + 0.5H4GeO4
             CHEMICAL_RECIPES.recipeBuilder("zinc_leaching_residue_tannic_acid_to_iron_sulfate_germanic_acid_solution").duration(100).EUt(480)
                     .inputDust(ZincLeachingResidue)
                     .inputFluids(TannicAcid.getFluid(1))
                     .outputItems(ChemicalHelper.get(dust, IronSulfate, 6))
                     .outputFluids(GermanicAcidSolution.getFluid(500))
                     .save(provider);


// H4GeO4 + 4HCl = [GeCl4 + 4H2O]
    CHEMICAL_RECIPES.recipeBuilder("germanic_acid_solution_hydrochloric_acid_to_germanium_chloride").duration(130).EUt(120)
        .inputFluids(GermanicAcidSolution.getFluid(1000))
        .inputFluids(HydrochloricAcid.getFluid(4000))
        .outputFluids(GermaniumChloride.getFluid(1000))
        .save(provider);


    // Ba + H2O2 = Ba(OH)2
    CHEMICAL_RECIPES.recipeBuilder("barium_hydrogen_peroxide_to_barium_hydroxide").duration(125).EUt(480)
        .inputDust(Barium)
        .inputFluids(HydrogenPeroxide.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, BariumHydroxide, 5))
        .save(provider);


    // 2C3H6O = C6H10O + H2O
    CHEMICAL_RECIPES.recipeBuilder("acetone_to_mesityl_oxide_water").duration(100).EUt(120)
        .notConsumable(ChemicalHelper.get(dust, BariumHydroxide))
        .inputFluids(Acetone.getFluid(2000))
        .outputFluids(MesitylOxide.getFluid(1000))
        .outputFluids(Water.getFluid(1000))
        .save(provider);


    // C6H10O + C + H2O = C6H12O + CO
    CHEMICAL_RECIPES.recipeBuilder("carbon_mesityl_oxide_water_to_methyl_isobutyl_ketone_carbon_monoxide").duration(130).EUt(480)
        .notConsumable(ChemicalHelper.get(dust, PdCCatalyst))
        .inputDust(Carbon)
        .inputFluids(MesitylOxide.getFluid(1000))
        .inputFluids(Water.getFluid(1000))
        .outputFluids(MethylIsobutylKetone.getFluid(1000))
        .outputFluids(CarbonMonoxide.getFluid(1000))
        .save(provider);


    // S + HCN = HSCN
    CHEMICAL_RECIPES.recipeBuilder("sulfur_hydrogen_cyanide_to_thiocyanic_acid").duration(100).EUt(120)
        .inputDust(Sulfur)
        .inputFluids(HydrogenCyanide.getFluid(1000))
        .outputFluids(ThiocyanicAcid.getFluid(1000))
        .save(provider);


    // ZrSiO4 + 8Cl = ZrHfCl4 + SiCl4?
    CHEMICAL_RECIPES.recipeBuilder("zircon_chlorine_to_zr_hf_chloride_zircon_chlorinating_residue").duration(120).EUt(120)
        .inputDust(Zircon, 6)
        .inputFluids(Chlorine.getFluid(8000))
        .outputFluids(ZrHfChloride.getFluid(1000))
        .outputFluids(ZirconChlorinatingResidue.getFluid(1000))
        .save(provider);


    // ZrHfCl4 + H2O = Cl2HfOZr + 2HCl
    CHEMICAL_RECIPES.recipeBuilder("water_zr_hf_chloride_to_zr_hf_oxy_chloride_hydrochloric_acid").duration(100).EUt(480)
        .inputFluids(Water.getFluid(1000))
        .inputFluids(ZrHfChloride.getFluid(1000))
        .outputFluids(ZrHfOxyChloride.getFluid(1000))
        .outputFluids(HydrochloricAcid.getFluid(2000))
        .save(provider);


    // 3Cl2HfOZr + 3HClO + 3H2SO4 + 15NH3 + 3H2O2 = 9NH4Cl + 3(NH4)2SO4 + 3ZrO2 + 3HfO2 (THIS IS TOO BIG)
    // 3Cl2HfOZr + 3H2SO4 + 6NH4Cl + 9O = 3(NH4)2SO4 + 6HCl + 6Cl + 3ZrO2 + 3HfO2 (THIS FITS)
    // 3Cl2HfOZr + 3SO3 + 6NH4Cl + 6H2O2 = 3(NH4)2SO4 + 12HCl + 3ZrO2 + 3HfO2 (CURRENTLY USING)
    LARGE_CHEMICAL_RECIPES.recipeBuilder("zr_hf_oxy_chloride_sulfur_trioxide_ammonium_chloride_hydrogen_peroxide_zr_hf_separation_mix_to_ammonium_sulfate_hydrochloric_acid_cubic_zirconia_dust").duration(100).EUt(1920)
        .inputFluids(ZrHfOxyChloride.getFluid(3000))
        .inputFluids(SulfurTrioxide.getFluid(3000))
        .inputFluids(AmmoniumChloride.getFluid(6000))
        .inputFluids(HydrogenPeroxide.getFluid(6000))
        .inputFluids(ZrHfSeparationMix.getFluid(0))
        .outputFluids(AmmoniumSulfate.getFluid(3000))
        .outputFluids(HydrochloricAcid.getFluid(12000))
        .outputDust(CubicZirconia, 3)
        .chancedOutput(dust, HafniumOxide, 3, 1000)
        .save(provider);


    // C + 4Cl + ZrO2 = CO2 + ZrCl4
    CHEMICAL_RECIPES.recipeBuilder("carbon_chlorine_cubic_zirconia_to_carbon_dioxide_zirconium_tetrachloride").duration(150).EUt(480)
        .inputDust(Carbon)
        .inputFluids(Chlorine.getFluid(4000))
        .inputDust(CubicZirconia, 3)
        .outputFluids(CarbonDioxide.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, ZirconiumTetrachloride, 5))
        .save(provider);


    // C + 4Cl + HfO2 = CO2 + HfCl4
    CHEMICAL_RECIPES.recipeBuilder("carbon_chlorine_hafnium_oxide_to_carbon_dioxide_hafnium_chloride").duration(150).EUt(120)
        .inputDust(Carbon)
        .inputFluids(Chlorine.getFluid(4000))
        .inputDust(HafniumOxide, 3)
        .outputFluids(CarbonDioxide.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, HafniumChloride, 5))
        .save(provider);


    // C8H10 + O + 2Br -> C8H8Br2 + H2O
    CHEMICAL_RECIPES.recipeBuilder("para_xylene_oxygen_bromine_to_dibromomethylbenzene_water")
        .inputFluids(ParaXylene.getFluid(1000))
        .inputFluids(Oxygen.getFluid(1000))
        .inputFluids(Bromine.getFluid(2000))
        .outputFluids(Dibromomethylbenzene.getFluid(1000))
        .outputFluids(Water.getFluid(1000))
        .EUt(7680)
        .duration(150)
        .save(provider);


    // C8H8Br2 + H2SO4 -> 2Br + H2O2 + H2S + C8H6O2
    LARGE_CHEMICAL_RECIPES.recipeBuilder("dibromomethylbenzene_sulfuric_acid_to_bromine_hydrogen_sulfide_hydrogen_peroxide_terephthalaldehyde")
        .inputFluids(Dibromomethylbenzene.getFluid(1000))
        .inputFluids(SulfuricAcid.getFluid(1000))
        .outputFluids(Bromine.getFluid(2000))
        .outputFluids(HydrogenSulfide.getFluid(1000))
        .outputFluids(HydrogenPeroxide.getFluid(1000))
        .outputItems(ChemicalHelper.get(dust, Terephthalaldehyde, 16))
        .EUt(7680)
        .duration(50)
        .save(provider);


    // HCl + C3H6 -> C3H7Cl
    CHEMICAL_RECIPES.recipeBuilder("hydrochloric_acid_propene_to_isochloropropane")
        .inputFluids(HydrochloricAcid.getFluid(1000))
        .inputFluids(Propene.getFluid(1000))
        .outputFluids(Isochloropropane.getFluid(1000))
        .EUt(480)
        .duration(110)
        .save(provider);


    // C2H2O + CH3COOH -> C4H6O3
    CHEMICAL_RECIPES.recipeBuilder("ethenone_acetic_acid_to_acetic_anhydride")
        .inputFluids(Ethenone.getFluid(1000))
        .inputFluids(AceticAcid.getFluid(1000))
        .outputFluids(AceticAnhydride.getFluid(1000))
        .EUt(480)
        .duration(80)
        .save(provider);


    // C6H6O2 + C3H7Cl + C4H6O3 + 2HNO3 + Na2O + C3H6 -> C12H16O2(NO2)2 + 2H2O + CH3COOH + C2H3NaO2 + NaCl
    LARGE_CHEMICAL_RECIPES.recipeBuilder("resorcinol_isochloropropane_acetic_anhydride_nitric_acid_propene_sodium_oxide_to_dinitrodipropanyloxybenzene_water_acetic_acid_sodium_acetate_salt")
        .inputFluids(Resorcinol.getFluid(1000))
        .inputFluids(Isochloropropane.getFluid(1000))
        .inputFluids(AceticAnhydride.getFluid(1000))
        .inputFluids(NitricAcid.getFluid(2000))
        .inputFluids(Propene.getFluid(1000))
        .inputDust(SodiumOxide, 3)
        .outputFluids(Dinitrodipropanyloxybenzene.getFluid(1000))
        .outputFluids(Water.getFluid(2000))
        .outputFluids(AceticAcid.getFluid(1000))
        .outputFluids(SodiumAcetate.getFluid(1000))
        .outputDust(Salt, 2)
        .EUt(7680)
        .duration(50)
        .save(provider);


    // C12H16O2(NO2)2 + C8H6O2 -> C20H22N2O2 + 6O
    CHEMICAL_RECIPES.recipeBuilder("dinitrodipropanyloxybenzene_terephthalaldehyde_to_pre_zylon_oxygen")
        .inputFluids(Dinitrodipropanyloxybenzene.getFluid(1000))
        .inputDust(Terephthalaldehyde, 16)
        .notConsumable(ChemicalHelper.get(dust, AuPdCCatalyst))
        .outputItems(ChemicalHelper.get(dust, PreZylon))
        .outputFluids(Oxygen.getFluid(6000))
        .EUt(1966080)
        .duration(50)
        .save(provider);
  }

}
