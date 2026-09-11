package com.zircky.industrialsorcerygreg.common.data.materials;

import com.gregtechceu.gtceu.api.fluids.FluidBuilder;
import com.gregtechceu.gtceu.api.fluids.attribute.FluidAttributes;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.zircky.industrialsorcerygreg.api.ISGValues;
import com.zircky.industrialsorcerygreg.api.data.material.ISGMaterialFlags;
import com.zircky.industrialsorcerygreg.common.data.ISGMaterials;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.FLUID;
import static com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty.GasTier.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;


public final class HighEnergyMaterials {
  private HighEnergyMaterials() {
  }

  public static void register() {
    SuperheavyMix = builderISG("superheavy_mix")
        .fluid().ingot()
        .color(0x403737)
        .iconSet(DULL)
        .components(GTMaterials.Seaborgium, 1, GTMaterials.Bohrium, 1, GTMaterials.Rutherfordium, 1, GTMaterials.Dubnium, 1)
        .blastTemp(11000, HIGHER, ISGValues.VA[ISGValues.UIV])
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister()
        .setFormula("SgBhRfDb");

    Neutron = builderISG("neutron")
        .plasma()
        .color(0xf0e9e9)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("n");

    HotMetastableOganesson = builderISG("hot_oganesson")
        .fluid()
        .color(0x521973)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Og");

    TitaniumTetrafluoride = builderISG("titanium_tetrafluoride")
        .fluid()
        .color(GTMaterials.Titanium.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister();

    Titanium50Tetrafluoride = builderISG("titanium_50_tetrafluoride")
        .fluid()
        .color(GTMaterials.Titanium.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister();

    Carbon12 = builderISG("carbon_12")
        .fluid()
        .color(Carbon.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C-12", true);

    Carbon13 = builderISG("carbon_13")
        .fluid()
        .color(Carbon.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C-13", true);

    Nitrogen14 = builderISG("nitrogen_14")
        .fluid()
        .color(Nitrogen.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("N-14", true);

    Nitrogen15 = builderISG("nitrogen_15")
        .fluid()
        .color(Nitrogen.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("N-15", true);

    CNOcatalyst = builderISG("cno")
        .fluid()
        .color((Nitrogen.getMaterialRGB() + Carbon.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(C-12)(C-13)(N-14)(N-15)", true);

    Calcium44 = builderISG("calcium-44")
        .fluid()
        .color(GTMaterials.Calcium.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Ca-44", true);

    OganesonBreedingBase = builderISG("oganesson_breeding_base")
        .fluid()
        .color(((GTMaterials.Titanium.getMaterialRGB() + 0xA85A12) / 2))
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(Ti-50)Cf-252", true);

    Quassifissioning = builderISG("quasifissioning")
        .plasma()
        .color(0xD5CB54)
        .iconSet(FLUID)
        .buildAndRegister();

    Ytterbium178 = builderISG("ytterbium_178")
        .fluid()
        .color(GTMaterials.Ytterbium.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Yb178", true);

    FlYb = builderISG("flyb")
        .plasma()
        .color((GTMaterials.Ytterbium.getMaterialRGB() + 0x521973) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("FlYb");

    Chromium48 = builderISG("chromium_48")
        .fluid()
        .plasma()
        .color(GTMaterials.Chromium.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Cr-48", true);

    Iron52 = builderISG("iron_52")
        .fluid()
        .plasma()
        .color(GTMaterials.Iron.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Fe-52", true);

    Nickel56 = builderISG("nickel_56")
        .fluid()
        .plasma()
        .color(GTMaterials.Nickel.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Ni-56", true);

    Titanium44 = builderISG("titanium_44")
        .fluid()
        .plasma()
        .color(GTMaterials.Titanium.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Ti-44", true);

    HeliumCNO = builderISG("helium_rich_cno")
        .fluid()
        .plasma()
        .color(0x59ffa6)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("He?");

    SeleniteTelluriteMix = builderISG("selenite_tellurite_mixture")
        .fluid()
        .color(0x765A30)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("TeO2SeO2(Na2CO3)2", true);

    SeleniteSolution = builderISG("selenite_solution")
        .fluid()
        .color(0xc1c46a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Na2SeO3", true);

    CopperRefiningSolution = builderISG("copper_refining_solution")
        .fluid()
        .color(0x765A30)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("CuH2SO4", true);

    SodiumHydroxideBauxite = builderISG("sodium_hydroxide_bauxite")
        .fluid()
        .color(0xbf731a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Al2H2O4", true);

    ImpureAluminiumHydroxideSolution = builderISG("impure_aluminium_hydroxide_soution")
        .fluid()
        .color(0xd8653e)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)Al(OH)3?");

    PureAluminiumHydroxideSolution = builderISG("pure_aluminium_hydroxide_soution")
        .fluid()
        .color((GTMaterials.Aluminium.getMaterialRGB() + Oxygen.getMaterialRGB() + GTMaterials.Hydrogen.getMaterialRGB() + 40) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)Al2(OH)6", true);

    RedMud = builderISG("red_mud")
        .fluid()
        .color(0xcc3300)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("HCl?");

    NeutralisedRedMud = builderISG("neutralised_red_mud")
        .fluid()
        .color(0xcc3300)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Fe??");

    FerricREEChloride = builderISG("ferric_ree_chloride")
        .fluid()
        .color(0x30301a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Fe?");

    RedSlurry = builderISG("red_slurry")
        .fluid()
        .color(0xcc3300)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("TiO2?", true);

    TitanylSulfate = builderISG("titanyl_sulfate")
        .fluid()
        .color(0xdc3d7c)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("TiO(SO4)", true);

    DiluteNitricAcid = builderISG("dilute_nitric_acid")
        .liquid(new FluidBuilder().attribute(FluidAttributes.ACID))
        .color((GTMaterials.NitricAcid.getMaterialRGB() + GTMaterials.Water.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)HNO3", true);

    NbTaSeparationMixture = builderISG("nbta_separation_mixture")
        .fluid()
        .color(0xbcac93)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C18H39O5P", true);

    FluoroniobicAcid = builderISG("fluroniobic_acid")
        .liquid(new FluidBuilder().attribute(FluidAttributes.ACID))
        .color(0x73ff00)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("NbHF7", true);

    FluorotantalicAcid = builderISG("flurotantalic_acid")
        .liquid(new FluidBuilder().attribute(FluidAttributes.ACID))
        .color(0x73ff00)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("TaHF7", true);

    NbTaFluorideMix = builderISG("nbta_fluoride_mix")
        .fluid()
        .color(0xbcac93)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2NbOF5)(H2TaF7)", true);

    OxypentafluoroNiobate = builderISG("oxypentafluoroniobate")
        .fluid()
        .color(0x73ff00)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2NbOF5", true);

    HeptafluoroTantalate = builderISG("heptafluorotantalate")
        .fluid()
        .color(0x73ff00)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2TaF7", true);

    REEThUSulfateSolution = builderISG("reethu_sulfate_solution")
        .fluid()
        .color(0x89be5c)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?SO4", true);

    RareEarthNitrateSolution = builderISG("rare_earth_nitrate_solution")
        .fluid()
        .color(0xcfb37d)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?NO3", true);

    AlkalineEarthSulfateSolution = builderISG("alkaline_earth_sulfate")
        .fluid()
        .color(0xe6ebff)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?SO4", true);

    WetEthyleneOxide = builderISG("wet_etylene_oxide")
        .fluid()
        .color(0x90b3ff)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)C2H4O", true);

    EthyleneGlycol = builderISG("ethylene_glycol")
        .fluid()
        .color(0x8080fa)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C2H6O2", true);

    Chloroethanol = builderISG("chloroethanol")
        .fluid()
        .color(0xcfb050)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C2H5ClO", true);

    Choline = builderISG("choline")
        .fluid()
        .color(0x63e45f)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C5H14NO", true);

    ATL = builderISG("atl")
        .fluid()
        .color(0x709c4a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("ATL");

    HotNitrogen = builderISG("hot_nitrogen")
        .fluid()
        .color(Nitrogen.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("N");

    ViscoelasticPolyurethane = builderISG("viscoelastic_polyurethane")
        .fluid()
        .color(0xeffcef)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C17H16N2O4?", true);

    ViscoelasticPolyurethaneFoam = builderISG("viscoelastic_polyurethane_foam")
        .fluid()
        .color(0xeffcef)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C17H16N2O4?", true);

    CalciumCarbonateSolution = builderISG("calcium_carbonate_solution")
        .fluid()
        .color(GTMaterials.Calcite.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)CaCO3", true);

    BariumSulfateSolution = builderISG("barium_sulfate_solution")
        .fluid()
        .color(GTMaterials.Barite.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)BaSO4", true);

    BentoniteClaySlurry = builderISG("bentonite_clay_solution")
        .fluid()
        .color(0xdbc9c5)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2O?", true);

    DrillingMud = builderISG("drilling_mud")
        .fluid()
        .color(0x996600)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("For the Void Miner");

    UsedDrillingMud = builderISG("used_drilling_mud")
        .fluid()
        .color(0x998833)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Used Mud");

    TolueneDiisocyanate = builderISG("toluene_diisocyanate")
        .fluid()
        .color(0xbaf6ca)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C9H6N2O2", true);

    HydroselenicAcid = builderISG("hydroselenic_acid")
        .liquid(new FluidBuilder().attribute(FluidAttributes.ACID))
        .color(GTMaterials.Selenium.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2Se", true);

    Aminophenol = builderISG("aminophenol")
        .fluid()
        .color(0xafca3a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6H4(OH)(NH2)", true);

    Hydroxyquinoline = builderISG("hydroxyquinoline")
        .fluid()
        .color(0x3a9a71)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C9H7NO", true);

    Perbromothiophene = builderISG("perbromothiophene")
        .fluid()
        .color(0x87cc17)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C4Br4S", true);

    Diethoxythiophene = builderISG("dietoxythiophene")
        .fluid()
        .color(0x90ff43)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C4H2(OC2H5)2S", true);

    EDOT = builderISG("ethylenedioxythiophene")
        .fluid()
        .color(0x7a9996)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C2H4O2C4H2S", true);

    CitricAcid = builderISG("citric_acid")
        .liquid(new FluidBuilder().attribute(FluidAttributes.ACID))
        .color(0xffcc00)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6H8O7", true);

    OxalicAcid = builderISG("oxalic_acid")
        .liquid(new FluidBuilder().attribute(FluidAttributes.ACID))
        .color(0x4aaae2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("HOOCCOOH");

    Trimethylchlorosilane = builderISG("trimethylchlorosilane")
        .fluid()
        .color(GTMaterials.Dimethyldichlorosilane.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(CH3)3SiCl", true);

    Dibromoacrolein = builderISG("dibromoacrolein")
        .fluid()
        .color(0x4a4a4a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C2H2Br2O2", true);

    Bromohydrothiine = builderISG("bromodihydrothiine")
        .fluid()
        .color(0x40ff3a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C4H4S2Br2", true);

    Bromobutane = builderISG("bromobutane")
        .fluid()
        .color(0xff3333)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("CH3(CH2)3Br", true);

    AstatideSolution = builderISG("astatide_solution")
        .fluid()
        .color(0x6df63f)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("At(H2O)(SO3)", true);

    Biperfluoromethanedisulfide = builderISG("biperfluoromethanedisulfide")
        .fluid()
        .color(0x3ada40)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C2F6S2", true);

    BariumTriflateSolution = builderISG("barium_triflate_solution")
        .fluid()
        .color((GTMaterials.Barium.getMaterialRGB() + GTMaterials.Fluorine.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)3(Hg)C2BaF6O6S2", true);

    BariumStrontiumAcetateSolution = builderISG("basr_acetate_solution")
        .fluid()
        .color(0x9a9b98)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C2H3BaO2Sr", true);

    TitaniumIsopropoxide = builderISG("titanium_isopropoxide")
        .fluid()
        .color(0xFF0066)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Ti(OCH(CH3)2)4", true);

    BariumChlorideSolution = builderISG("barium_chloride_solution")
        .fluid()
        .color((GTMaterials.Barium.getMaterialRGB() + GTMaterials.Chlorine.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)BaCl3", true);

    IronCarbonyl = builderISG("iron_carbonyl")
        .fluid()
        .color(0xff8000)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Fe?");

    PurifiedIronCarbonyl = builderISG("purified_iron_carbonyl")
        .fluid()
        .color(0xff8000)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Fe");

    BismuthNitrateSoluton = builderISG("bismuth_nitrate_solution")
        .fluid()
        .color((GTMaterials.Bismuth.getMaterialRGB() + GTMaterials.Chlorine.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)Bi(NO3)3", true);

    BariumTitanatePreparation = builderISG("barium_titanate_preparation")
        .fluid()
        .color(0x99FF99)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("BaTiO3", true);

    BariumStrontiumTitanatePreparation = builderISG("basr_titanate_preparation")
        .fluid()
        .color(0xFF0066)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(BaTiO3)C2H3BaO2Sr", true);

    CarbonTetrachloride = builderISG("carbon_tetrachloride")
        .fluid()
        .color(0x2d8020)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("CCl4", true);

    Chloroethane = builderISG("chloroethane")
        .fluid()
        .color(0x33aa33)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("CH3CH2Cl", true);


    Diborane = builderISG("diborane")
        .fluid()
        .color(GTMaterials.Boron.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(BH3)2");

    IsopropylAcetate = builderISG("isopropyl_acetate")
        .fluid()
        .color((GTMaterials.Strontium.getMaterialRGB() + IsopropylAlcohol.getMaterialRGB() + GTMaterials.Water.getMaterialRGB()) / 3)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(CH3)2CHCOOCH3", true);

    ChlorinatedSolvents = builderISG("chlorinated_solvents")
        .fluid()
        .color(0x40804c)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(CH4)2Cl5", true);

    Dichloromethane = builderISG("dichloromethane")
        .fluid()
        .color(GTMaterials.Chloromethane.getMaterialRGB() - 10)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("CH2Cl2", true);

    ButanolGas = builderISG("butanol_gas")
        .fluid()
        .color(Butanol.getMaterialRGB() + 20)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C4H9OH", true);

    Tributylamine = builderISG("tributylamine")
        .fluid()
        .color(0x801a80)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(C4H9)3N", true);

    CrudeAluminaSolution = builderISG("crude_alumina_solution")
        .fluid()
        .color((GTMaterials.Aluminium.getMaterialRGB() - 30))
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(Al(NO3)3)2(CH2Cl2)(C12H27N)", true);

    AluminaSolution = builderISG("alumina_solution")
        .fluid()
        .color((GTMaterials.Aluminium.getMaterialRGB() - 15))
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(Al2O3)(CH2Cl2)(C12H27N)2", true);

    UnprocessedNdYAGSolution = builderISG("unprocessed_ndyag_solution")
        .fluid()
        .color(0xcf8acf)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nd:YAG");

    AmmoniumCyanate = builderISG("ammonium_cyanate")
        .fluid()
        .color(0x3a5dcf)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("NH4CNO", true);

    Ethylenediamine = builderISG("ethylenediamine")
        .fluid()
        .color(Ethanolamine.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C2H4(NH2)2", true);

    EDTASolution = builderISG("edta_solution")
        .langValue("Ethylenediaminetetraacetic Acid Solution")
        .fluid()
        .color(0x0026d9)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(C10H16N2O8)3(C2H8N2)O2", true);

    EDTA = builderISG("edta")
        .langValue("Ethylenediaminetetraacetic Acid")
        .fluid()
        .color(0x0026d9)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C10H16N2O8", true);

    Glycine = builderISG("glycine")
        .fluid()
        .color((Ethylenediamine.getMaterialRGB() + GTMaterials.Formaldehyde.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("NH2CH2COOH", true);

    PrYHoNitrateSolution = builderISG("pryho_nitrate_solution")
        .fluid()
        .color(0x00f2b2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(Y(NO3)3)6(Pr(NO3)3)2(Nd(NO3)3)2(H2O)15", true);

    PhosphorousArsenicSolution = builderISG("phosphorous_arsenic_solution")
        .fluid()
        .color(GTMaterials.PhosphoricAcid.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("AsCd(HPO4)10", true);

    FluorosilicicAcid = builderISG("fluorosilicic_acid")
        .liquid(new FluidBuilder().attribute(FluidAttributes.ACID))
        .color(0x2ccf2a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2SiF6", true);

    AmmoniumFluoride = builderISG("ammonium_fluoride")
        .fluid()
        .color(GTMaterials.AmmoniumChloride.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("NH4F", true);

    AmmoniumBifluorideSolution = builderISG("ammonium_bifluoride_solution")
        .fluid()
        .color((GTMaterials.Ammonia.getMaterialRGB() + GTMaterials.Fluorine.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)NH4FHF", true);

    LuTmYChlorideSolution = builderISG("lutmy_chloride_solution")
        .langValue("Lutetium Thulium Yttrium Chloride Solution")
        .fluid()
        .color(0x00f2b2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(YCl3)6(LuCl3)2(TmCl3)2(H2O)15", true);

    MercuryNitrate = builderISG("mercury_nitrate")
        .fluid()
        .color(0xd6b8ad)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Hg(NO3)2", true);

    BismuthVanadateSolution = builderISG("bismuth_vanadate_solution")
        .fluid()
        .color(0xffff00)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)BiVO4", true);

    Nitrotoluene = builderISG("nitrotoluene")
        .fluid()
        .color(0xfcca00)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C7H7NO2", true);

    Naphthylamine = builderISG("naphthylamine")
        .fluid()
        .color(0xe3e81c)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C10H9N", true);

    Acetoacetanilide = builderISG("acetoacetanilide")
        .fluid()
        .color(0xffffc2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C10H11NO2", true);

    Quinizarin = builderISG("quinizarin")
        .fluid()
        .color(0x3c5a2c0)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C14H8O4", true);

    Toluenesulfonate = builderISG("toluenesulfonate")
        .fluid()
        .color(0x8f8f00)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C7H7SO3Na", true);

    Isopropylsuccinate = builderISG("isopropylsuccinate")
        .fluid()
        .color(0xb26680)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C7H12O4", true);

    MaleicAnhydride = builderISG("maleic_anhydride")
        .fluid()
        .color(0x3c20ad)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C4H2O3", true);

    Benzonitrile = builderISG("benzonitrile")
        .fluid()
        .color(0x2c2c9c)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C7H5N", true);

    SeaborgiumDopedNanotubes = builderISG("seaborgium_doped_nanotubes")
        .fluid()
        .color(0x2c2c8c)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("SgCNT");

    FullereneDopedNanotubes = builderISG("fullerene_doped_nanotubes")
        .fluid()
        .color(0x6c2c6c)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C60CNT", true);

    AmmoniumNiobiumOxalateSolution = builderISG("ammonium_niobium_oxalate_solution")
        .fluid()
        .color(0x6c6cac)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(NH4)C10Nb2O20", true);

    DielectricMirrorFormationMix = builderISG("dielectric_mirror_formation_mix")
        .langValue("Dielectric Mirror Formation Mixture")
        .fluid()
        .color(0xff992c)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("MgF2ZnSTa2Ti(C2H6O8)", true);

    ChlorousAcid = builderISG("chlorous_acid")
        .liquid(new FluidBuilder().attribute(FluidAttributes.ACID))
        .color(0x2d6e8a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("HClO2", true);

    Amino3phenol = builderISG("3_aminophenol")
        .langValue("3-Aminophenol")
        .fluid()
        .color(Aminophenol.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6H7NO", true);

    Dimethylnaphthalene = builderISG("dimethylnaphthalene")
        .fluid()
        .color(0xe34fb0)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C12H12", true);

    IodineMonochloride = builderISG("iodine_monochloride")
        .fluid()
        .color(0x004c4c)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("ICl");

    AcetylatingReagent = builderISG("acetylating_reagent")
        .fluid()
        .color(0x8d5e63)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C9H12Si(MgBr)2", true);

    Dihydroiodotetracene = builderISG("dihydroiodotetracene")
        .fluid()
        .color(0x5c4d38)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2C18H11I", true);

    Dichlorodicyanobenzoquinone = builderISG("dichlorodicyanobenzoquinone")
        .fluid()
        .color(0x3a2aba)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C8Cl2N2O2", true);

    Dichlorodicyanohydroquinone = builderISG("dichlorodicyanohidroquinone")
        .fluid()
        .color(0x3a2aba)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C8Cl2N2(OH)2", true);

    IodobenzoicAcid = builderISG("iodobenzoic_acid")
        .liquid(new FluidBuilder().attribute(FluidAttributes.ACID))
        .color(0x2cac6c0)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C7H5IO2", true);

    Methoxybenzaldehyde = builderISG("methoxybenzaldehyde")
        .fluid()
        .color(0x3c3a7a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C8H8O2", true);

    Butylaniline = builderISG("butylaniline")
        .fluid()
        .color(Aniline.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C10H15N", true);

    MBBA = builderISG("mbba")
        .langValue("Methoxybenzylidene Butylaniline (MBBA)")
        .fluid()
        .color(0xfa30fa)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C18H21NO", true);

    LiquidCrystalDetector = builderISG("liquid_crystal_detector")
        .fluid()
        .color(0xda20da)
        .iconSet(FLUID)
        .buildAndRegister();

    PotassiumEthoxide = builderISG("potassium_ethoxide")
        .fluid()
        .color(GTMaterials.Ethanol.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C2H5KO", true);

    TetraethylammoniumBromide = builderISG("tetraethylammonium_bromide")
        .fluid()
        .color(0xcc33ff)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C8H20NBr", true);

    Hexanediol = builderISG("hexanediol")
        .fluid()
        .color(EthyleneGlycol.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6H14O2", true);

    Hexamethylenediamine = builderISG("hexamethylenediamine")
        .fluid()
        .color(Ethylenediamine.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6H16N2", true);

    Tertbutanol = builderISG("tertbutanol")
        .fluid()
        .color(0xcccc2c)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C4H10O", true);

    Triaminoethaneamine = builderISG("triaminoethaneamine")
        .fluid()
        .color(0x6f7d87)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(NH2CH2CH2)3N", true);

    TertButylAzidoformate = builderISG("tertbuthylcarbonylazide")
        .fluid()
        .color(0x888818)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C5H9N3O2", true);

    AminatedFullerene = builderISG("aminated_fullerene")
        .fluid()
        .color(0x2c2caa)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C60N12H12", true);

    Azafullerene = builderISG("azafullerene")
        .fluid()
        .color(0x8a7a1a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C60N12H12", true);

    Ethylamine = builderISG("ethylamine")
        .fluid()
        .color(Ethylenediamine.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C2H5NH2", true);

    Trimethylsilane = builderISG("trimethylsilane")
        .fluid()
        .color(Trimethylchlorosilane.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C3H10Si", true);

    KryptonDifluoride = builderISG("krypton_difluoride")
        .fluid()
        .color(GTMaterials.Krypton.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("KrF2");

    QuarkGluon = builderISG("quark_gluon")
        .plasma()
        .color(0x8f00ff)
        .iconSet(FLUID)
        .buildAndRegister();

    HeavyQuarks = builderISG("heavy_quarks")
        .fluid()
        .plasma()
        .color(0x008800)
        .iconSet(FLUID)
        .buildAndRegister();

    LightQuarks = builderISG("light_quarks")
        .fluid()
        .plasma()
        .color(0x0000ff)
        .iconSet(FLUID)
        .buildAndRegister();

    Gluons = builderISG("gluons")
        .fluid()
        .plasma()
        .color(0xfcfcfa)
        .iconSet(FLUID)
        .buildAndRegister();

    HeavyLeptonMix = builderISG("heavy_lepton_mix")
        .langValue("Heavy Lepton Mixture")
        .fluid()
        .plasma()
        .color(0x5adf52)
        .iconSet(FLUID)
        .buildAndRegister();

    CosmicComputingMix = builderISG("cosmic_computing_mix")
        .langValue("Cosmic Computing Mixture")
        .fluid()
        .plasma()
        .color(0xafad2f)
        .iconSet(FLUID)
        .buildAndRegister();

    HeavyQuarkEnrichedMix = builderISG("heavy_quark_enriched_mix")
        .langValue("Heavy Quark Enriched Mixture")
        .fluid()
        .plasma()
        .color(0xefefef)
        .iconSet(FLUID)
        .buildAndRegister();

    DeuteriumSuperheavyMix = builderISG("deuterium_superheavy_mix")
        .langValue("Deuterium Superheavy Mixture")
        .fluid()
        .color(0xa2d2a4)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2)FlHsOg", true);

    ScandiumTitanium50Mix = builderISG("scandium_titanium50_mix")
        .langValue("Scandium Titanium-50 Mixture")
        .fluid()
        .color((GTMaterials.Scandium.getMaterialRGB() + GTMaterials.Titanium.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("ScTi_50");

    RadonRadiumMix = builderISG("radon_radium_mix")
        .langValue("Radium Radon Mixture")
        .fluid()
        .color((GTMaterials.Radium.getMaterialRGB() + GTMaterials.Radon.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("RnRa");

    Phenylsodium = builderISG("phenylsodium")
        .fluid()
        .color(0x2c2cc8)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6H5Na", true);

    Difluoroaniline = builderISG("difluoroaniline")
        .fluid()
        .color(0x3fac4a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6H5F2N", true);

    Succinaldehyde = builderISG("succinaldehyde")
        .fluid()
        .color(0x7c6d9a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C4H6O2", true);

    NDifluorophenylpyrrole = builderISG("n_difluorophenylpyrrole")
        .langValue("N-Difluorophenylpyrrole")
        .fluid()
        .color(0x3a9aa9)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C10H7F2N", true);

    PhotopolymerSolution = builderISG("photopolymer_solution")
        .fluid()
        .color(0x8a526d)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C149H97N10O2(TiBF20)", true);

    Trichloroferane = builderISG("trichloroferane")
        .fluid()
        .color(0x521973)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("FlCl3", true);

    GlucoseIronSolution = builderISG("glucose_iron_solution")
        .fluid()
        .color((GTMaterials.Sugar.getMaterialRGB() + GTMaterials.Iron.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(C6H12O6)FeCl3", true);

    GrapheneOxidationSolution = builderISG("graphene_oxidation_solution")
        .fluid()
        .color(0x96821a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(KMnO4)(NaNO3)(H2SO4)", true);

    SupercriticalCO2 = builderISG("supercritcal_co2")
        .fluid()
        .color(GTMaterials.CarbonDioxide.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("CO2", true);

    NobleGases = builderISG("noble_gases_mixture")
        .fluid()
        .color((GTMaterials.Helium.getMaterialRGB() + GTMaterials.Neon.getMaterialRGB() + GTMaterials.Argon.getMaterialRGB() + GTMaterials.Krypton.getMaterialRGB() + GTMaterials.Xenon.getMaterialRGB() + GTMaterials.Radon.getMaterialRGB()))
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("HeNeArKrXeRn");

    NonMetals = builderISG("non_metals")
        .fluid()
        .color((GTMaterials.Hydrogen.getMaterialRGB() + GTMaterials.Boron.getMaterialRGB() + Carbon.getMaterialRGB() + Nitrogen.getMaterialRGB() + Oxygen.getMaterialRGB() + GTMaterials.Fluorine.getMaterialRGB() + GTMaterials.Phosphorus.getMaterialRGB() + GTMaterials.Sulfur.getMaterialRGB() + GTMaterials.Chlorine.getMaterialRGB() + GTMaterials.Arsenic.getMaterialRGB() + GTMaterials.Selenium.getMaterialRGB() + GTMaterials.Bromine.getMaterialRGB() + GTMaterials.Tellurium.getMaterialRGB() + GTMaterials.Iodine.getMaterialRGB() + GTMaterials.Astatine.getMaterialRGB()))
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("BCPSAsSeTeIAtONHFClBr");

    DenseNeutron = builderISG("dense_neutron")
        .fluid()
        .color(0xacecac)
        .iconSet(FLUID)
        .buildAndRegister();

    CosmicMesh = builderISG("cosmic_mesh")
        .plasma()
        .color(0x1c1c8c)
        .iconSet(FLUID)
        .buildAndRegister();

    SuperfluidHelium = builderISG("superfluid_helium")
        .fluid()
        .color(0xFCFF90)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("He");

    LiquidEnrichedHelium = builderISG("liquid_enriched_helium")
        .fluid()
        .color(0xFCFF90)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("HeHe-3");

    LiquidNitrogen = builderISG("liquid_nitrogen")
        .fluid()
        .color(Nitrogen.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("N");

    Methylethanolamine = builderISG("methylethanolamine")
        .fluid()
        .color(0x6a3baa)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C3H9NO", true);

    Methylguanidine = builderISG("methylguanidine")
        .fluid()
        .color(0x5a9a3c)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C2H7N3", true);

    Methylnitronitrosoguanidine = builderISG("methylnitronitrosoguanidine")
        .fluid()
        .color(0x68b15d)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C2H5N5O3", true);

    IsoamylAlcohol = builderISG("isoamyl_alcohol")
        .fluid()
        .color(0xcaba77)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C5H12O", true);

    Octanol = builderISG("octanol")
        .fluid()
        .color(0xa2b8c2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C8H18O", true);

    Trioctylamine = builderISG("trioctylamine")
        .fluid()
        .color(0x87a2bc)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C24H51N", true);

    RheniumSeparationMixture = builderISG("rhenium_separation_mixture")
        .fluid()
        .color(0xed2c3a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C11H24", true);

    RheniumScrubbedSolution = builderISG("rhenium_scrubbed_solution")
        .fluid()
        .color(0xedccca)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Re?");

    NeutroniumDopedNanotubes = builderISG("neutronium_doped_nanotubes")
        .fluid()
        .color((GTMaterials.Neutronium.getMaterialRGB() + ISGMaterials.CarbonNanotubes.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nt?");

    SupercriticalSteam = builderISG("supercritical_steam")
        .fluid()
        .color(GTMaterials.Steam.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2O", true);

    SupercriticalDeuterium = builderISG("supercritical_deuterium")
        .fluid()
        .color(GTMaterials.Deuterium.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H-2");

    SupercriticalSodiumPotassiumAlloy = builderISG("supercritical_sodium_potassium_alloy")
        .fluid()
        .color(ISGMaterials.SodiumPotassiumAlloy.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Na7K3", true);

    SupercriticalSodium = builderISG("supercritical_sodium")
        .fluid()
        .color(GTMaterials.Sodium.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Na");

    SupercriticalFLiNaK = builderISG("supercritical_flinak")
        .fluid()
        .color(ISGMaterials.FLiNaK.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("FLiNaK");

    SupercriticalFLiBe = builderISG("supercritical_flibe")
        .fluid()
        .color(ISGMaterials.FLiBe.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("FLiBe");

    SupercriticalLeadBismuthEutectic = builderISG("supercritical_lead_bismuth_eutectic")
        .fluid()
        .color(ISGMaterials.LeadBismuthEutectic.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Pb3Bi7", true);

    FreeAlphaGas = builderISG("free_alpha")
        .gas()
        .color(0xe0d407)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("a");

    FreeElectronGas = builderISG("free_electron")
        .gas()
        .color(0x044c4c)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("e-");

    HighEnergyQGP = builderISG("high_energy_qgp")
        .langValue("High Energy Quark-Gluon Plasma")
        .plasma()
        .color(0x8f00ff)
        .iconSet(FLUID)
        .buildAndRegister();

    AcetylsulfanilylChloride = builderISG("acetylsulfanilyl_chloride")
        .fluid()
        .color((Aniline.getMaterialRGB() + GTMaterials.AceticAnhydride.getMaterialRGB() + ChlorosulfonicAcid.getMaterialRGB()) / 3)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C8H8ClNO3S", true);

    BenzoylPeroxide = builderISG("benzoyl_peroxide")
        .fluid()
        .color((GTMaterials.Barium.getMaterialRGB() + ISGMaterials.BenzoylChloride.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C14H10O4", true);

    Propadiene = builderISG("propadiene")
        .fluid()
        .color((Butanol.getMaterialRGB() - 20))
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C3H4", true);

    FluorophosphoricAcid = builderISG("fluorophosphoric_acid")
        .liquid(new FluidBuilder().attribute(FluidAttributes.ACID))
        .color(PhosphorusTrichloride.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("HPF6", true);

    PhenylenedioxydiaceticAcid = builderISG("phenylenedioxydiacetic_acid")
        .liquid(new FluidBuilder().attribute(FluidAttributes.ACID))
        .color(0x99546a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C10H10O6", true);

    Diethylthiourea = builderISG("diethylthiourea")
        .fluid()
        .color(0x2acaa4)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(C2H5NH)2CS", true);

    Isophthaloylbisdiethylthiourea = builderISG("isophthaloylbisdiethylthiourea")
        .fluid()
        .color(0x8a7b9c)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C18H26N4O2S2", true);

    SodiumAlginateSolution = builderISG("sodium_alginate_solution")
        .fluid()
        .color(0xca8642)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("NaC6H7O6", true);

    AscorbicAcid = builderISG("ascorbic_acid")
        .liquid(new FluidBuilder().attribute(FluidAttributes.ACID))
        .color(0xe6cd00)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6H8O6", true);

    DehydroascorbicAcid = builderISG("dehydroascorbic_acid")
        .liquid(new FluidBuilder().attribute(FluidAttributes.ACID))
        .color(0xe6cd00)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6H6O6", true);

    CaCBaSMixture = builderISG("cacbas_mixture")
        .langValue("CaCBaS Mixture")
        .fluid()
        .color((CalciumCarbonateSolution.getMaterialRGB() + BariumSulfateSolution.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister();

    LubricantClaySlurry = builderISG("lubricant_clay_slurry")
        .fluid()
        .color((GTMaterials.Lubricant.getMaterialRGB() + BentoniteClaySlurry.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister();

    ATLEthylene = builderISG("atl_ethylene_mixture")
        .langValue("ATL Ethylene Mixture")
         .fluid()
        .color((ATL.getMaterialRGB() + EthyleneGlycol.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister();

    DrillingMudMixture = builderISG("drilling_mud_mixture")
        .fluid()
        .color((CaCBaSMixture.getMaterialRGB() + LubricantClaySlurry.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister();

    Cyclopentadiene = builderISG("cyclopentadiene")
        .fluid()
        .color(Cyclooctadiene.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C5H6", true);

    ChloroauricAcid = builderISG("chloroauric_acid")
        .liquid(new FluidBuilder().attribute(FluidAttributes.ACID))
        .color(0xDFD11F)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("HAuCl?");

    Helium4 = builderISG("helium_4")
        .fluid()
        .color(GTMaterials.Helium.getMaterialRGB() - 10)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("He-4");

    FermionicUUMatter = builderISG("fermionic_uu_matter")
        .langValue("Fermionic UU-Matter")
        .fluid()
        .color(GTMaterials.UUMatter.getMaterialRGB() / 3)
        .iconSet(FLUID)
        .buildAndRegister();

    BosonicUUMatter = builderISG("bosonic_uu_matter")
        .langValue("Bosonic UU-Matter")
        .fluid()
        .color(GTMaterials.UUMatter.getMaterialRGB() - FermionicUUMatter.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister();

    Oxydianiline = builderISG("oxydianiline")
        .fluid()
        .color(0xF0E130)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C12H12N2O", true);

    PolyamicAcid = builderISG("polyamic_acid")
        .liquid(new FluidBuilder().attribute(FluidAttributes.ACID))
        .color(0xFFAE42)
        .iconSet(DULL)
        .components(Carbon, 22, Hydrogen, 14, Nitrogen, 2, Oxygen, 7)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    Hexafluoropropylene = builderISG("hexafluoropropylene")
        .fluid()
        .color(0x111111)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C3F6", true);

    Dimethylether = builderISG("dimethylether")
        .fluid()
        .color(0xe6cd11)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C2H6O", true);

    Dimethoxyethane = builderISG("dimethoxyethane")
        .fluid()
        .color(0x2acbb4)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C4H10O2", true);

    LithiumCyclopentadienide = builderISG("lithium_cyclopentadienide")
        .fluid()
        .color(0x95556a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("LiC5H5", true);

    CaliforniumCyclopentadienide = builderISG("californium_cyclopentadienide")
        .fluid()
        .color(0x94445b)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C15H15Cf", true);

    Soap = builderISG("soap")
        .fluid()
        .color(0xFFAE42)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

    DeglyceratedSoap = builderISG("deglycerated_soap")
        .fluid()
        .color(0xFFAE41)
        .iconSet(FLUID)
        .buildAndRegister();

    StearicAcid = builderISG("stearic_acid")
        .liquid(new FluidBuilder().attribute(FluidAttributes.ACID))
        .color(0x2bbbb4)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C18H36O2", true);

    Trioctylphosphine = builderISG("trioctylphosphine")
        .fluid()
        .color(0xF1E130)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C24H51P", true);

    QuantumDots = builderISG("quantum_dots")
        .fluid()
        .plasma()
        .color(0xff0000)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("CdSe");

    IridiumTrichlorideSolution = builderISG("iridium_trichloride_solution")
        .fluid()
        .color(0x96821a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("IrCl3", true);

    SemisolidHydrogen = builderISG("semisolidhydrogen")
        .langValue("Semi-Solid Hydrogen")
        .fluid()
        .color(0x044c4b)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H");

    MicrocrystallizingHydrogen = builderISG("microcrystallizinghydrogen")
        .langValue("Microcrystallizing Hydrogen")
        .fluid()
        .color(0x155d5c)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H");

  }
}
