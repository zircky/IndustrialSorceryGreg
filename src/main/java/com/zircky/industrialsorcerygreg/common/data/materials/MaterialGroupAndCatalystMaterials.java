package com.zircky.industrialsorcerygreg.common.data.materials;

import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;
import com.gregtechceu.gtceu.api.fluids.FluidState;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.zircky.industrialsorcerygreg.api.data.material.ISGMaterialFlags;
import com.zircky.industrialsorcerygreg.common.data.ISGMaterials;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.utils.register.MaterialsRegisterUtils.material;


final class MaterialGroupAndCatalystMaterials {
  private MaterialGroupAndCatalystMaterials() {
  }

  static void register() {
    Lanthanoids = builderISG("lanthanoids")
        .dust()
        .color((GTMaterials.Lanthanum.getMaterialRGB() + GTMaterials.Cerium.getMaterialRGB() + GTMaterials.Praseodymium.getMaterialRGB() + GTMaterials.Neodymium.getMaterialRGB() + GTMaterials.Promethium.getMaterialRGB() + GTMaterials.Samarium.getMaterialRGB() + GTMaterials.Europium.getMaterialRGB() + GTMaterials.Gadolinium.getMaterialRGB() + GTMaterials.Terbium.getMaterialRGB() + GTMaterials.Dysprosium.getMaterialRGB() + GTMaterials.Holmium.getMaterialRGB() + GTMaterials.Erbium.getMaterialRGB() + GTMaterials.Thulium.getMaterialRGB() + GTMaterials.Ytterbium.getMaterialRGB() + GTMaterials.Lutetium.getMaterialRGB()) / 15)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("LaPrNdPmSmEuGdTbDyHoErTmYbLu");

    Actinoids = builderISG("actinoids")
        .dust()
        .color((GTMaterials.Actinium.getMaterialRGB() + GTMaterials.Thorium.getMaterialRGB() + GTMaterials.Protactinium.getMaterialRGB() + GTMaterials.Uranium238.getMaterialRGB() + Neptunium.getMaterialRGB() + GTMaterials.Plutonium241.getMaterialRGB() + GTMaterials.Americium.getMaterialRGB() + GTMaterials.Curium.getMaterialRGB() + GTMaterials.Berkelium.getMaterialRGB() + GTMaterials.Californium.getMaterialRGB() + GTMaterials.Einsteinium.getMaterialRGB() + GTMaterials.Fermium.getMaterialRGB() + GTMaterials.Mendelevium.getMaterialRGB()) / 13)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("AcThPaNpPuAmCmBkCfEsFmMd");

    Alkalis = builderISG("alkalis")
        .langValue("Alkaline and Alkaline Earth Metals")
        .dust()
        .color((GTMaterials.Lithium.getMaterialRGB() + GTMaterials.Beryllium.getMaterialRGB() + GTMaterials.Sodium.getMaterialRGB() + GTMaterials.Magnesium.getMaterialRGB() + GTMaterials.Potassium.getMaterialRGB() + GTMaterials.Calcium.getMaterialRGB() + GTMaterials.Scandium.getMaterialRGB() + GTMaterials.Rubidium.getMaterialRGB() + GTMaterials.Strontium.getMaterialRGB() + GTMaterials.Yttrium.getMaterialRGB() + GTMaterials.Caesium.getMaterialRGB() + GTMaterials.Barium.getMaterialRGB() + GTMaterials.Francium.getMaterialRGB() + GTMaterials.Radium.getMaterialRGB()) / 12)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("LiBeNaMgKCaScRbSrYCeBaFrRa");

    PreciousMetals = builderISG("precious_metals")
        .dust()
        .color((GTMaterials.Ruthenium.getMaterialRGB() + GTMaterials.Rhodium.getMaterialRGB() + GTMaterials.Palladium.getMaterialRGB() + GTMaterials.Silver.getMaterialRGB() + GTMaterials.Rhenium.getMaterialRGB() + GTMaterials.Osmium.getMaterialRGB() + GTMaterials.Iridium.getMaterialRGB() + GTMaterials.Platinum.getMaterialRGB() + GTMaterials.Gold.getMaterialRGB()) / 9)
        .iconSet(SHINY)

        .buildAndRegister()
        .setFormula("RuRhPdAgReOsIrPtAu");

    LightTranstionMetals = builderISG("light_transition_metals")
        .dust()
        .color((GTMaterials.Titanium.getMaterialRGB() + GTMaterials.Vanadium.getMaterialRGB() + GTMaterials.Chromium.getMaterialRGB() + GTMaterials.Manganese.getMaterialRGB() + GTMaterials.Iron.getMaterialRGB() + GTMaterials.Cobalt.getMaterialRGB() + GTMaterials.Nickel.getMaterialRGB() + GTMaterials.Copper.getMaterialRGB()) / 8)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("TiVCrMnFeCoNiCu");

    RefractoryMetals = builderISG("refractory_metals")
        .dust()
        .color((GTMaterials.Zirconium.getMaterialRGB() + GTMaterials.Niobium.getMaterialRGB() + GTMaterials.Molybdenum.getMaterialRGB() + GTMaterials.Technetium.getMaterialRGB() + GTMaterials.Hafnium.getMaterialRGB() + GTMaterials.Tantalum.getMaterialRGB() + GTMaterials.Tungsten.getMaterialRGB()) / 7)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("ZrNbMoTcHfTaW");

    PostTransitionMetals = builderISG("post_transition_metals")
        .dust()
        .color((GTMaterials.Aluminium.getMaterialRGB() + GTMaterials.Silicon.getMaterialRGB() + GTMaterials.Zinc.getMaterialRGB() + GTMaterials.Gallium.getMaterialRGB() + GTMaterials.Germanium.getMaterialRGB() + GTMaterials.Cadmium.getMaterialRGB() + GTMaterials.Indium.getMaterialRGB() + GTMaterials.Tin.getMaterialRGB() + GTMaterials.Antimony.getMaterialRGB() + GTMaterials.Mercury.getMaterialRGB() + GTMaterials.Thallium.getMaterialRGB() + GTMaterials.Lead.getMaterialRGB() + GTMaterials.Bismuth.getMaterialRGB() + GTMaterials.Polonium.getMaterialRGB()) / 14)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("AlSiZnGaGeCdInSnSbHgTlPbBiPo");

    MercuryAcetate = builderISG("mercury_acetate")
        .dust()
        .color(0xcc8562)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Hg(CH3COO)2", true);

    CalciumCyanamide = builderISG("calcium_cyanamide")
        .dust()
        .color(CalciumCarbide.getMaterialRGB())
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("CaCN2", true);

    SelectivelyMutatedCupriavidiusNecator = builderISG("selectively_mutated_cupriavidius_necator")
        .dust()
        .color(CupriavidusNecator.getMaterialRGB() * 5 / 4)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Bacteria");

    PurifiedColumbite = builderISG("purified_columbite")
        .dust()
        .color(LeachedColumbite.getMaterialRGB())
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Ta2O5Nb18O45", true);

    PurifiedPyrochlore = builderISG("purified_pyrochlore")
        .dust()
        .color(LeachedPyrochlore.getMaterialRGB())
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Ta2O5Nb18O45", true);

    ChargedCesiumCeriumCobaltIndium = builderISG("charged_cesium_cerium_cobalt_indium")
        .dust()
        .color(0x52ad25)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("CsCeCo2In10", true);

    RheniumChloride = builderISG("rhenium_chloride")
        .dust()
        .color(0x3c2a5c)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("ReCl5", true);

    AntimonyTrichloride = builderISG("antimony_trichloride")
        .dust()
        .color(GTMaterials.AntimonyTrifluoride.getMaterialRGB())
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("SbCl3", true);

    LithiumCobaltOxide = builderISG("lithium_cobalt_oxide")
        .dust()
        .color(0xd2a4f3)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("LiCoO");

    LithiumTriflate = builderISG("lithium_triflate")
        .dust()
        .color(0xe2dae3)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("LiCSO3F3", true);

    Xylose = builderISG("xylose")
        .dust()
        .color(Glucose.getMaterialRGB())
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("C5H10O5", true);

    SiliconNanoparticles = builderISG("silicon_nanoparticles")
        .dust()
        .color(GTMaterials.Silicon.getMaterialRGB())
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Si?");

    Halloysite = builderISG("halloysite")
        .dust()
        .color(0x23423a)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Al9Si10O50Ga", true);

    GalliumChloride = builderISG("gallium_chloride")
        .dust()
        .color(0x92867a)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("GaCl3", true);

    SulfurCoatedHalloysite = builderISG("sulfur_coated_halloysite")
        .dust()
        .color(0x23973a)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("S2C2(Al9Si10O50Ga)", true);

    FluorideBatteryElectrolyte = builderISG("fluoride_battery_electrolyte")
        .dust()
        .color(0x9a628a)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("La9BaF29(C8H7F)", true);

    LanthanumNickelOxide = builderISG("lanthanum_nickel_oxide")
        .dust()
        .color(GTMaterials.Garnierite.getMaterialRGB() / 2 + GTMaterials.Lanthanum.getMaterialRGB() / 2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("La2NiO4", true);

    Sorbose = builderISG("sorbose")
        .dust()
        .color(Glucose.getMaterialRGB())
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C6H12O6", true);

    CalciumAlginate = builderISG("calcium_alginate")
        .dust()
        .color(0x654321)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("CaC12H14O12", true);

    NickelOxideHydroxide = builderISG("nickel_oxide_hydroxide")
        .dust()
        .color(0xa2f2a2)
        .iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("NiO(OH)");

    BETSPerrhenate = builderISG("bets_perrhenate")
        .langValue("Bisethylenedithiotetraselenafulvalene (BETS) Perrhenate")
        .dust()
        .color(0x7ada00)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("ReC10H8S4Se4O4", true);

    TBCCO = builderISG("tbcco")
        .langValue("TBCCO")
        .dust()
        .color(0x669900)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("TlBa2Ca2Cu3O10", true);

    Borocarbide = builderISG("borocarbide")
        .dust().fluid(FluidStorageKeys.MOLTEN, FluidState.LIQUID)
        .color(0x9a9a2a)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("B4C7Fr4At6Ho2Th2Fl2Cn2", true);

    ActiniumSuperhydride = builderISG("actinium_superhydride")
        .dust().plasma()
        .color(GTMaterials.Actinium.getMaterialRGB() * 9 / 8)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("AcH12", true);

    StrontiumSuperconductor = builderISG("strontium_superconductor")
        .dust()
        .color(0x45abf4)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Sr2RuSgO8", true);

    FullereneSuperconductive = builderISG("fullerene_superconductor")
        .dust()
        .color(0x99cc00)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("LaCsRb(C60)2", true);

    HassiumChloride = builderISG("hassium_chloride")
        .dust()
        .color(0x5d2abc)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("HsCl4", true);

    RheniumHassiumThalliumIsophtaloylbisdiethylthioureaHexafluorophosphate = builderISG("rhenium_hassium_thallium_isophtaloylbisdiethylthiourea_hexafluorophosphate")
        .dust()
        .color(0xa26a8b)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("ReHsTlC60PN12H84S6O12F6", true);

    Legendarium = builderISG("legendarium")
        .dust().fluid(FluidStorageKeys.MOLTEN, FluidState.LIQUID)
        .color(0xc3c3c3)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("NqNq+*Nq*DrTrKeTnAdVb");

    LanthanumFullereneNanotubes = builderISG("lanthanum_fullerene_nanotubes")
        .dust()
        .color(LanthanumFullereneMix.getMaterialRGB() * 3 / 5)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("La2(C60)2CNT", true);

    SodiumMetavanadate = builderISG("sodium_metavanadate")
        .dust()
        .color(GTMaterials.SodaAsh.getMaterialRGB())
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("NaVO3", true);

    PotassiumPeroxymonosulfate = builderISG("potassium_peroxymonosulfate")
        .dust()
        .color((ISGMaterials.PotassiumMetabisulfite.getMaterialRGB() + 20))
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("KHSO5", true);

    CoAcABCatalyst = material("co_ac_ab", "Co/AC-AB")
        .dust()
        .color(0x755f30)
        .iconSet(DULL)
        .flags(ISGMaterialFlags.GENERATE_CATALYST)
        .buildAndRegister();

    SilverPerchlorate = builderISG("silver_perchlorate")
        .dust()
        .color(ISGMaterials.SilverChloride.getMaterialRGB())
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("AgClO4", true);

    CopperLeach = builderISG("copper_leach")
        .dust().fluid()
        .color(0x765A30)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Cu3?", true);

    GoldLeach = builderISG("gold_leach")
        .dust()
        .color(0xBBA52B)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Cu3Au?", true);

    Durene = builderISG("durene")
        .dust()
        .color(0xA39C95)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("C6H2(CH3)4", true);

    PyromelliticDianhydride = builderISG("pyromellitic_dianhydride")
        .dust()
        .color(0xF0EAD6)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("C6H2(C2O3)2", true);

    CaliforniumTrioxide = builderISG("californiumtrioxide")
        .dust()
        .color(0x7cc922)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Cf2O3", true);

    CaliforniumTrichloride = builderISG("californiumtrichloride")
        .dust()
        .color(0x3e9837)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("CfCl3", true);

    IridiumTrioxide = builderISG("iridiumtrioxide")
        .dust()
        .color(0x9a9a2b)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Ir2O3", true);

    PotassiumHydroxylaminedisulfonate = builderISG("potassium_hydroxylaminedisulfonate")
        .dust()
        .color((0xF0EAD6 + NitrousAcid.getMaterialRGB()) / 2)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("KHSO3", true);

    SuccinicAnhydride = builderISG("succinic_anhydride")
        .dust()
        .color((SuccinicAcid.getMaterialRGB() + GTMaterials.AceticAnhydride.getMaterialRGB()) / 2)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("(CH2CO)2O", true);

    AmmoniumAcetate = builderISG("ammonium_acetate")
        .dust()
        .color(0xb6dee0)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("NH4CH3CO2", true);

    Acetamide = builderISG("acetamide")
        .dust()
        .color(0xa6bebf)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("CH3CONH2", true);

    Acetonitrile = builderISG("acetonitrile")
        .dust()
        .color(0xa2afb0)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("CH3CN", true);

    NHydroxysuccinimide = builderISG("n-hydroxysuccinimide")
        .dust()
        .color(0xdbcae3)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("(CH2CO)2NOH", true);

    Hexabenzylhexaazaisowurtzitane = builderISG("hexabenzylhexaazaisowurtzitane")
        .dust()
        .color(0x624573)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C48N6H48", true);

    SuccinimidylAcetate = builderISG("succinimidyl_acetate")
        .dust()
        .color(0xbd93a6)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C6H7NO4", true);

    DibenzylTetraacetylhexaazaisowurtzitane = builderISG("dibenzyltetraacetylhexaazaisowurtzitane")
        .dust()
        .color(0xb3c98b)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C28N6H32O4", true);

    HexanitroHexaazaisowurtzitane = builderISG("hexanitrohexaazaisowurtzitane")
        .dust()
        .color(0x414a4f)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("C6H6N12O12", true);

    NitroniumTetrafluoroborate = builderISG("nitronium_tetrafluoroborate")
        .dust()
        .color(0x686c6e)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("NO2BF4", true);

    NitrosoniumTetrafluoroborate = builderISG("nitrosonium_tetrafluoroborate")
        .dust()
        .color(0x7e8d94)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("NOBF4", true);

    Hexamethylenetetramine = builderISG("hexamethylenetetramine")
        .dust()
        .color(0x7e8d94)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("(CH2)6N4", true);

    PdCCatalyst = material("pdc", "Palladium on Carbon")
        .dust()
        .color((GTMaterials.Palladium.getMaterialRGB() + GTMaterials.Carbon.getMaterialRGB()) / 2)
        .iconSet(DULL)
        .flags(ISGMaterialFlags.GENERATE_CATALYST)
        .buildAndRegister()
        .setFormula("PdC");

    Tetraacetyldinitrosohexaazaisowurtzitane = builderISG("tetraacetyldinitrosohexaazaisowurtzitane")
        .dust()
        .color((DibenzylTetraacetylhexaazaisowurtzitane.getMaterialRGB() + Hexabenzylhexaazaisowurtzitane.getMaterialRGB()) / 2)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C14N8H18O6", true);

    CrudeHexanitroHexaazaisowurtzitane = builderISG("crude_hexanitrohexaazaisowurtzitane")
        .dust()
        .color(HexanitroHexaazaisowurtzitane.getMaterialRGB() * 5 / 7)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C6H6N12O12", true);

    PotassiumBisulfite = builderISG("potassium_bisulfite")
        .dust()
        .color(0xF0EAD6)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("KHSO3", true);

    PotassiumNitrite = builderISG("potassium_nitrite")
        .dust()
        .color(0xF0EAD6)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("KNO2", true);

    HydroxylammoniumSulfate = builderISG("hydroxylammonium_sulfate")
        .dust()
        .color(0xF0EAD6)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("(NH3OH)2SO4", true);

    SodiumBorohydride = builderISG("sodium_borohydride")
        .dust()
        .color(0xc2c2fa)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("NaBH4", true);

    SodiumTetrafluoroborate = builderISG("sodium_tetrafluoroborate")
        .dust()
        .color((SodiumBorohydride.getMaterialRGB() + GTMaterials.Fluorine.getMaterialRGB()) / 2)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("NaBF4", true);

    Decaborane = builderISG("decaborane")
        .dust()
        .color(Diborane.getMaterialRGB())
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("B10H14", true);

    CesiumCarboranePrecusor = builderISG("cesium_carborane_precursor")
        .dust()
        .color(0xb56487)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("CsB10H12CN(CH3)3Cl", true);

    CesiumCarborane = builderISG("cesium_carborane")
        .dust()
        .color(CesiumCarboranePrecusor.getMaterialRGB() * 6 / 5)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("CsCB11H12", true);

    Fluorocarborane = builderISG("fluorocarborane")
        .dust()
        .color(0x20EB7A)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("HCHB11F11", true);

    CaesiumNitrate = builderISG("caesium_nitrate")
        .dust()
        .color(0x7452DC)
        .iconSet(ROUGH)
        .components(Caesium, 1, Nitrogen, 1, Oxygen, 3)
        .buildAndRegister()
        .setFormula("CsNO3", true);

    SilverIodide = builderISG("silver_iodide")
        .dust()
        .color((ISGMaterials.SilverChloride.getMaterialRGB() * 2 + GTMaterials.Iodine.getMaterialRGB()) / 3)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("AgI");

    ActiniumTriniumHydroxides = builderISG("actinium_trinium_hydroxides")
        .dust()
        .color((ActiniumOxalate.getMaterialRGB() + GTMaterials.Trinium.getMaterialRGB()) / 2)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Ke3Ac2(OH)12", true);

    TriniumTetrafluoride = builderISG("trinium_tetrafluoride")
        .dust()
        .color(0x477347)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("KeF4", true);

    ActiniumNitrate = builderISG("actinium_nitrate")
        .dust()
        .color(YttriumNitrate.getMaterialRGB())
        .iconSet(ROUGH)
        .components(Actinium, 1, Nitrogen, 3, Oxygen, 9)
        .flags(MaterialFlags.DECOMPOSITION_BY_ELECTROLYZING)
        .buildAndRegister()
        .setFormula("Ac(NO3)3", true);

    RadiumNitrate = builderISG("radium_nitrate")
        .dust()
        .color(BariumNitrate.getMaterialRGB())
        .iconSet(DULL)
        .components(Radium, 1, Nitrogen, 2, Oxygen, 9)
        .buildAndRegister()
        .setFormula("Ra(NO3)2", true);

    PhosphorousPentasulfide = builderISG("phosphorous_pentasulfide")
        .dust()
        .color(0xEBAD24)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("P4S10", true);

    PureCrystallineNitricAcid = builderISG("crystalline_nitric_acid")
        .dust()
        .color(GTMaterials.NitricAcid.getMaterialRGB())
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("HNO3", true);

    Kaminskycatalyst = builderISG("kaminsky")
        .dust()
        .color(0x372927)
        .iconSet(DULL)
        .flags(ISGMaterialFlags.GENERATE_CATALYST)
        .buildAndRegister();

    Philipscatalyst = builderISG("philips")
        .dust()
        .color(0xB45D83)
        .iconSet(DULL)
        .flags(ISGMaterialFlags.GENERATE_CATALYST)
        .buildAndRegister();

    Zieglernattacatalyst = builderISG("zieglernatta")
        .dust()
        .color(0x8BC34A)
        .iconSet(DULL)
        .flags(ISGMaterialFlags.GENERATE_CATALYST)
        .buildAndRegister();

    Blackiron = builderISG("blackiron")
        .dust()
        .color(0x1c1b1c)
        .iconSet(DULL)
        .buildAndRegister();

    Darksteel = builderISG("darksteel")
        .dust()
        .color(0x2b2b2b)
        .iconSet(DULL)
        .buildAndRegister();

    Nichromerichblend = builderISG("nichromerichblend")
        .dust()
        .color(0xb7b0d1)
        .iconSet(DULL)
        .buildAndRegister();

    Greensteel = builderISG("greensteel")
        .dust()
        .color(0x379953)
        .iconSet(SHINY)
        .buildAndRegister();

    Cryolite = builderISG("cryolite")
        .dust()
        .color(0x658af0)
        .iconSet(DULL)
        .buildAndRegister();

    Energeticblend = builderISG("energeticblend")
        .dust()
        .color(0xbd642a)
        .iconSet(DULL)
        .buildAndRegister();

    Uraniumconcentrate = builderISG("uraniumconcentrate")
        .dust()
        .color(0x299912)
        .iconSet(DULL)
        .buildAndRegister();

    Uraniumfiltrate = builderISG("uraniumfiltrate")
        .dust()
        .color(0x3d9e29)
        .iconSet(DULL)
        .buildAndRegister();

    Bulatsteel = builderISG("bulatsteel")
        .dust()
        .color(0x736D62)
        .iconSet(SHINY)
        .buildAndRegister();

    Silversteel = builderISG("silversteel")
        .dust()
        .color(0x828180)
        .iconSet(SHINY)
        .buildAndRegister();

    SilverAlloy = builderISG("silver_alloy")
        .dust()
        .color(0xD6D3D2)
        .iconSet(SHINY)
        .buildAndRegister();

    Electricalsteel = builderISG("electricalsteel")
        .dust()
        .color(0x757473)
        .iconSet(DULL)
        .buildAndRegister();

    Titaniumtetrachloride = builderISG("titaniumtetrachloride")
        .dust()
        .color(0x701a31)
        .iconSet(SHINY)
        .buildAndRegister();

    Graphiteuraniummixture = builderISG("graphiteuraniummixture")
        .dust()
        .color(0x2F5407)
        .iconSet(DULL)
        .buildAndRegister();

    Unprocessedboron = builderISG("unprocessedboron")
        .dust()
        .color(0x5487FF)
        .iconSet(DULL)
        .buildAndRegister();

    Radioactivesludge = builderISG("radioactivesludge")
        .dust()
        .color(0x704c0a)
        .iconSet(SHINY)
        .buildAndRegister();

    Thoria = builderISG("thoria")
        .dust()
        .color(0x004B1A)
        .iconSet(DULL)
        .buildAndRegister();

    Sunnariumoxide = builderISG("sunnariumoxide")
        .dust()
        .color(0xB4AD6A)
        .iconSet(DULL)
        .buildAndRegister();

    Sunnariumdioxide = builderISG("sunnariumdioxide")
        .dust()
        .color(0xB4AD6A)
        .iconSet(DULL)
        .buildAndRegister();

    Vanadiumtitaniumconentrate = builderISG("vanadiumtitaniumconentrate")
        .dust()
        .color(0x3C3C3C)
        .iconSet(DULL)
        .buildAndRegister();

    Sunaricoreresidue = builderISG("sunaricoreresidue")
        .dust()
        .color(0xB9B272)
        .iconSet(DULL)
        .buildAndRegister();

    Samaricinfusedresidue = builderISG("samaricinfusedresidue")
        .dust()
        .color(0xE5E5E4)
        .iconSet(DULL)
        .buildAndRegister();

    Infusedgoldtrioxide = builderISG("infusedgoldtrioxide")
        .dust()
        .color(0xA8801B)
        .iconSet(SHINY)
        .buildAndRegister();

    Plutoniumoxideuraniummixture = builderISG("plutoniumoxideuraniummixture")
        .dust()
        .color(0xC40424)
        .iconSet(SHINY)
        .buildAndRegister();

    Boronnanoparticles = builderISG("boronnanoparticles")
        .dust()
        .color(0x6593FF)
        .iconSet(SHINY)
        .buildAndRegister();

    Tungsticnaquadah = builderISG("tungsticnaquadah")
        .dust()
        .color(0x1F1F1F)
        .iconSet(DULL)
        .buildAndRegister();

    Endsteelconcentrate = builderISG("endsteelconcentrate")
        .dust()
        .color(0xC9C172)
        .iconSet(DULL)
        .buildAndRegister();

    Circuitcompundmk1 = builderISG("circuitcompundmk1")
        .dust()
        .color(0x0E000B)
        .iconSet(DULL)
        .buildAndRegister();

    Circuitcompundmk2 = builderISG("circuitcompundmk2")
        .dust()
        .color(0x0E000B)
        .iconSet(DULL)
        .buildAndRegister();

    Circuitcompundmk3 = builderISG("circuitcompundmk3")
        .dust()
        .color(0x0E000B)
        .iconSet(DULL)
        .buildAndRegister();

    Silicongrade = builderISG("silicongrade")
        .dust()
        .color(0x585858)
        .iconSet(SHINY)
        .buildAndRegister();

    Plutoniumuraniumferitemixture = builderISG("plutoniumuraniumferitemixture")
        .dust()
        .color(0x8F041C)
        .iconSet(SHINY)
        .buildAndRegister();

    Dehydratedaluminiumcatalyst = builderISG("dehydratedaluminium")
        .dust()
        .color(0x5D87E8)
        .iconSet(DULL)
        .flags(ISGMaterialFlags.GENERATE_CATALYST)
        .buildAndRegister();

    Aluminiumcatalyst = builderISG("aluminium")
        .dust()
        .color(0x5487FF)
        .iconSet(DULL)
        .flags(ISGMaterialFlags.GENERATE_CATALYST)
        .buildAndRegister();

    Rdx = builderISG("rdx")
        .dust()
        .color(0xEEE559)
        .iconSet(SHINY)
        .buildAndRegister();

    Hdx = builderISG("hdx")
        .dust()
        .color(0xE0D9B8)
        .iconSet(SHINY)
        .buildAndRegister();

    Hexamine = builderISG("hexamine")
        .dust()
        .color(0xA1A1A1)
        .iconSet(SHINY)
        .buildAndRegister();

    Dialuminiumtrioxide = builderISG("dialuminiumtrioxide")
        .dust()
        .color(0x0a7080)
        .iconSet(SHINY)
        .buildAndRegister();

    Dialuminiumcobalttetroxide = builderISG("dialuminiumcobalttetroxide")
        .dust()
        .color(0x0c616e)
        .iconSet(SHINY)
        .buildAndRegister();

    Compressedmetal = builderISG("compressedmetal")
        .dust()
        .color(0x1A1A1A)
        .iconSet(DULL)
        .buildAndRegister();

    Fourdiphenylmethanediiscocyanate = builderISG("fourdiphenylmethanediiscocyanate")
        .dust()
        .color(0xB576B8)
        .iconSet(DULL)
        .buildAndRegister();

    MonaziteSulfate = builderISG("monazite_sulfate")
        .dust()
        .color(0x145922)
        .iconSet(DULL)
        .buildAndRegister();

    ThoriumPhosphateCake = builderISG("thorium_phosphate_cake")
        .dust()
        .color(0x20452a)
        .iconSet(DULL)
        .buildAndRegister();

    ThoriumPhosphateConcentrate = builderISG("thorium_phosphate_concentrate")
        .dust()
        .color(0x223b29)
        .iconSet(DULL)
        .buildAndRegister();

    RareEarthFiltrate = builderISG("rare_earth_filtrate")
        .dust()
        .color(0x3b2d22)
        .iconSet(DULL)
        .buildAndRegister();

    NeutralizedRareEarthFiltrate = builderISG("neutralized_rare_earth_filtrate")
        .dust()
        .color(0x3b2d22)
        .iconSet(DULL)
        .buildAndRegister();

    ZircAlloy = builderISG("zirc_alloy")
        .dust()
        .color(0xB5B5B5)
        .iconSet(SHINY)
        .buildAndRegister();

    NeodymiumRareEarthConcentrate = builderISG("neodymium_rare_earth_concentrate")
        .dust()
        .color(0x3C3C3C)
        .iconSet(DULL)
        .buildAndRegister();

    SamaricRareEarthConcentrate = builderISG("samaric_rare_earth_concentrate")
        .dust()
        .color(0xB9B272)
        .iconSet(DULL)
        .buildAndRegister();

    FluorinatedSamaricCompound = builderISG("fluorinated_samaric_compound")
        .dust()
        .color(0xB5B5B5)
        .iconSet(SHINY)
        .buildAndRegister();

    Calcium_fluoride = builderISG("calcium_fluoride")
        .dust()
        .color(0x5f7f87)
        .iconSet(DULL)
        .buildAndRegister();

    SamariumTerbiumConcentrate = builderISG("samarium_terbium_concentrate")
        .dust()
        .color(0x82875f)
        .iconSet(DULL)
        .buildAndRegister();

    Samaricresi = builderISG("samaricresi")
        .dust()
        .color(0x82875f)
        .iconSet(SHINY)
        .buildAndRegister();

    BastnasiteOxideComposite = builderISG("bastnasite_oxide_composite")
        .dust()
        .color(0x8a643a)
        .iconSet(SHINY)
        .buildAndRegister();

    Dirt = builderISG("dirt")
        .dust()
        .color(0x79553A)
        .iconSet(DULL)
        .buildAndRegister();

    Hydrogeniodide = builderISG("hydrogeniodide")
        .dust()
        .color(0x3e2f47)
        .iconSet(DULL)
        .buildAndRegister();

    CalcinatedBastnasite = builderISG("calcinated_bastnasite")
        .dust()
        .color(0x473c2f)
        .iconSet(DULL)
        .buildAndRegister();

    RoastedBastnasite = builderISG("roasted_bastnasite")
        .dust()
        .color(0x3d2a14)
        .iconSet(SHINY)
        .buildAndRegister();

    CrackingCatalystPreparation = builderISG("cracking_preparation")
        .dust()
        .color(0x7d7d3c)
        .iconSet(DULL)
        .flags(ISGMaterialFlags.GENERATE_CATALYST)
        .buildAndRegister();

    Pentaerythritol = builderISG("pentaerythritol")
        .dust()
        .color(0xd61542)
        .iconSet(DULL)
        .buildAndRegister();

    Oranorhodiumcatalyst = builderISG("oranorhodium")
        .dust()
        .color(0x942942)
        .iconSet(SHINY)
        .flags(ISGMaterialFlags.GENERATE_CATALYST)
        .buildAndRegister();

    PolyurethanecatalystB = builderISG("polyurethane_b")
        .dust()
        .color(0x946f29)
        .iconSet(DULL)
        .flags(ISGMaterialFlags.GENERATE_CATALYST)
        .buildAndRegister();

    PolyurethanecatalystA = builderISG("polyurethane_a")
        .dust()
        .color(0x946f29)
        .iconSet(SHINY)
        .flags(ISGMaterialFlags.GENERATE_CATALYST)
        .buildAndRegister();

    Leadmetallicpowder = builderISG("leadmetallicpowder")
        .dust()
        .color(0x75516e)
        .iconSet(DULL)
        .buildAndRegister();

    Binap = builderISG("binap")
        .dust()
        .color(0x8b8c87)
        .iconSet(DULL)
        .buildAndRegister();

    Paraphenylenediamine = builderISG("paraphenylenediamine")
        .dust()
        .color(0x317c87)
        .iconSet(SHINY)
        .buildAndRegister();

    Mudresidues = builderISG("mud_residues")
        .dust()
        .color(0x8c878b)
        .iconSet(DULL)
        .buildAndRegister();

    Terephthaloylchloride = builderISG("terephthaloylchloride")
        .dust()
        .color(0x5e240c)
        .iconSet(DULL)
        .buildAndRegister();

    RadiumCake = builderISG("radium_cake")
        .dust()
        .color(0x94914a)
        .iconSet(SHINY)
        .buildAndRegister();

    RadiumMetallicPowder = builderISG("radium_metallic_powder")
        .dust()
        .color(0xab7141)
        .iconSet(DULL)
        .buildAndRegister();

    ThoriumRadioactive = builderISG("thorium_radioactive")
        .dust()
        .color(0x6e3d15)
        .iconSet(DULL)
        .buildAndRegister();

    ThoriumRadioactivePowder = builderISG("thorium_radioactive_powder")
        .dust()
        .color(0x436e15)
        .iconSet(DULL)
        .buildAndRegister();

    ThoriumSalt = builderISG("thorium_salt")
        .dust()
        .color(0x756e09)
        .iconSet(SHINY)
        .buildAndRegister();

    ThoriumMetallicPowder = builderISG("thorium_metallic_powder")
        .dust()
        .color(0x3e7009)
        .iconSet(DULL)
        .buildAndRegister();

    RefinedThoriumSalts = builderISG("refined_thorium_salts")
        .dust()
        .color(0x385717)
        .iconSet(SHINY)
        .buildAndRegister();

    ThoriumResidues = builderISG("thorium_residues")
        .dust()
        .color(0x425e23)
        .iconSet(DULL)
        .buildAndRegister();

    ThoriumCrudeMetal = builderISG("thorium_crude_metal")
        .dust()
        .color(0x3e4d2f)
        .iconSet(DULL)
        .buildAndRegister();

    LanthanumYttrium = builderISG("lanthanum_yttrium")
        .dust()
        .color(0x2D2D2D)
        .iconSet(DULL)
        .buildAndRegister();

    LanthanumYttriumCuprite = builderISG("lanthanum_yttrium_cuprite")
        .dust()
        .color(0x74744A)
        .iconSet(DULL)
        .buildAndRegister();

    LanthanumDopedYttrium = builderISG("lanthanum_doped_yttrium")
        .dust()
        .color(0x9E9D24)
        .iconSet(DULL)
        .buildAndRegister();

    Lanthanum2DopedYttriumBarium = builderISG("lanthanum_2_doped_yttrium_barium")
        .langValue("Lanthanum II Doped Yttrium Barium")
        .dust()
        .color(0x092A21)
        .iconSet(DULL)
        .buildAndRegister();

    EnrichedGraphite = builderISG("enriched_graphite")
        .dust()
        .color(0xB3B385)
        .iconSet(SHINY)
        .buildAndRegister();

    IrradiatedBorax = builderISG("irradiated_borax")
        .dust()
        .color(0xCCCCCC)
        .iconSet(SHINY)
        .buildAndRegister();

    Rhodium3 = builderISG("rhodium3")
        .dust()
        .color(0x6E2A2B)
        .iconSet(DULL)
        .buildAndRegister();

    Rhodium2a = builderISG("rhodium2a")
        .dust()
        .color(0x949335)
        .iconSet(DULL)
        .buildAndRegister();

    BariumSludgeResidue = builderISG("barium_sludge_residue")
        .dust()
        .color(0x7E5D4B)
        .iconSet(SHINY)
        .buildAndRegister();

    YttriumLanthanumCeriumMixture = builderISG("yttrium_lanthanum_cerium_mixture")
        .dust()
        .color(0x888675)
        .iconSet(SHINY)
        .buildAndRegister();

    CeriumLanthanumCompound = builderISG("cerium_lanthanum_compound")
        .dust().ingot()
        .color(0x514F3F)
        .iconSet(DULL)
        .buildAndRegister();

    CeriumLanthanumSaturatedCompound = builderISG("cerium_lanthanum_saturated_compound")
        .dust()
        .color(0xD81B60)
        .iconSet(DULL)
        .buildAndRegister();

    CeriumLanthanumSaturatedSamariteCompound = builderISG("cerium_lanthanum_saturated_samarite_compound")
        .dust()
        .color(0x7B1FA2)
        .iconSet(SHINY)
        .buildAndRegister();

    Celananoparticle = builderISG("celananoparticle")
        .dust()
        .color(0x290E3A)
        .iconSet(DULL)
        .buildAndRegister();

    Celananocarbides = builderISG("celananocarbides")
        .dust()
        .color(0x261133)
        .iconSet(SHINY)
        .buildAndRegister();

    YttriumSludgeResidue = builderISG("yttrium_sludge_residue")
        .dust()
        .color(0x905529)
        .iconSet(SHINY)
        .buildAndRegister();

    Unprocessedcela = builderISG("unprocessedcela")
        .dust()
        .color(0x4A148C)
        .iconSet(DULL)
        .buildAndRegister();

    Radium202 = builderISG("radium202")
        .dust()
        .color(0xFFCA28)
        .iconSet(SHINY)
        .buildAndRegister();

    Titaniumiodine = builderISG("titaniumiodine")
        .dust()
        .color(0xC4A5D1)
        .iconSet(SHINY)
        .buildAndRegister();

    ReprepRadium202 = builderISG("reprep_radium_202")
        .dust()
        .color(0xD4AF7F)
        .iconSet(SHINY)
        .buildAndRegister();

    Terephtaladehyde = builderISG("terephtaladehyde")
        .dust()
        .color(0xFBC02D)
        .iconSet(DULL)
        .buildAndRegister();

    Sunnariumxenontrioxide = builderISG("sunnariumxenontrioxide")
        .dust()
        .color(0x977C39)
        .iconSet(DULL)
        .buildAndRegister();

    LiquidWetTailing = builderISG("liquid_wet_tailing")
        .dust()
        .color(0x5D5A5A)
        .iconSet(DULL)
        .buildAndRegister();

    SolidWetTailing = builderISG("solid_wet_tailing")
        .dust()
        .color(0x5D5A5A)
        .iconSet(DULL)
        .buildAndRegister();

    SolidDryTailing = builderISG("solid_dry_tailing")
        .dust()
        .color(0x5D5A5A)
        .iconSet(DULL)
        .buildAndRegister();

    Limestone = builderISG("limestone")
        .dust()
        .color(0xBBB79C)
        .iconSet(DULL)
        .buildAndRegister();

    Sodiumsilicate = builderISG("sodiumsilicate")
        .dust()
        .color(0x8B8D8B)
        .iconSet(SHINY)
        .buildAndRegister();

    WetBedrock = builderISG("wet_bedrock")
        .dust()
        .color(0x121212)
        .iconSet(SHINY)
        .buildAndRegister();

    OilyBedrock = builderISG("oily_bedrock")
        .dust()
        .color(0x1E1C1C)
        .iconSet(SHINY)
        .buildAndRegister();

    FineBedrock = builderISG("fine_bedrock")
        .dust()
        .color(0x151515)
        .iconSet(DULL)
        .buildAndRegister();

    Adamantite = builderISG("adamantite")
        .dust()
        .color(0x243D63)
        .iconSet(DULL)
        .buildAndRegister();

    AdamantiumPentoxide = builderISG("adamantium_pentoxide")
        .dust()
        .color(0x323F52)
        .iconSet(SHINY)
        .buildAndRegister();

    EnrichedNaquadahNitrate = builderISG("enriched_naquadah_nitrate")
        .dust()
        .color(0x1F2021)
        .iconSet(SHINY)
        .buildAndRegister();

    NaquadriaNitrate = builderISG("naquadria_nitrate")
        .dust()
        .color(0x181818)
        .iconSet(SHINY)
        .buildAndRegister();

    Pxylene = builderISG("pxylene")
        .dust()
        .color(0x252525)
        .iconSet(DULL)
        .buildAndRegister();

    Amococatalyst = builderISG("amoco")
        .dust()
        .color(0xB0583E)
        .iconSet(DULL)
        .flags(ISGMaterialFlags.GENERATE_CATALYST)
        .buildAndRegister();

    IsophthalicAcid = builderISG("isophthalic_acid")
        .dust()
        .color(0xB0583E)
        .iconSet(DULL)
        .buildAndRegister();

    TerephthalicAcid = builderISG("terephthalic_acid")
        .dust()
        .color(0xB0583E)
        .iconSet(DULL)
        .buildAndRegister();

    RawAtomicSeperationCatalyst = builderISG("raw_atomic_seperation")
        .dust()
        .color(0xBF360C)
        .iconSet(DULL)
        .flags(ISGMaterialFlags.GENERATE_CATALYST)
        .buildAndRegister();

    SoulariumMetallicPowder = builderISG("soularium_metallic_powder")
        .dust()
        .color(0x665653)
        .iconSet(DULL)
        .buildAndRegister();

    RefinedSoulariumPowder = builderISG("refined_soularium_powder")
        .dust()
        .color(0x665653)
        .iconSet(SHINY)
        .buildAndRegister();

    BronzeBlend = builderISG("bronze_blend")
        .dust()
        .color(0xD56C12)
        .iconSet(DULL)
        .buildAndRegister();

    EnhancedEnderiumRefinedMetalResidues = builderISG("enhanced_enderium_refined_metal_residues")
        .dust()
        .color(0x004D40)
        .iconSet(SHINY)
        .buildAndRegister();

    Hmx = builderISG("hmx")
        .dust()
        .color(0xB3B5B5)
        .iconSet(SHINY)
        .buildAndRegister();

    SodiumIsobutylXanthate = builderISG("sodium_isobutyl_xanthate")
        .dust()
        .color(0x86987A)
        .iconSet(DULL)
        .buildAndRegister();

    Zsmfive = builderISG("zsmfive")
        .dust()
        .color(0x9EAE90)
        .iconSet(DULL)
        .buildAndRegister();

    Cuproquin = builderISG("cuproquin")
        .dust()
        .color(0x667267)
        .iconSet(SHINY)
        .buildAndRegister();

    Quinoline = builderISG("quinoline")
        .dust()
        .color(0x986E4C)
        .iconSet(SHINY)
        .buildAndRegister();

    BcEcoli = builderISG("bc_ecoli")
        .dust()
        .color(0x153462)
        .iconSet(SHINY)
        .buildAndRegister();

    BcRhizobium = builderISG("bc_rhizobium")
        .dust()
        .color(0x82CD47)
        .iconSet(SHINY)
        .buildAndRegister();

    BcNitrosomanos = builderISG("bc_nitrosomanos")
        .dust()
        .color(0x4FA095)
        .iconSet(SHINY)
        .buildAndRegister();

    VrRetrovirus = builderISG("vr_retrovirus")
        .dust()
        .color(0x964B00)
        .iconSet(SHINY)
        .buildAndRegister();

    PrDiatom = builderISG("pr_diatom")
        .dust()
        .color(0x82CD47)
        .iconSet(SHINY)
        .buildAndRegister();

    PrChlorophyte = builderISG("pr_chlorophyte")
        .dust()
        .color(0x82CD47)
        .iconSet(SHINY)
        .buildAndRegister();

    PrEuglena = builderISG("pr_euglena")
        .dust()
        .color(0x82CD47)
        .iconSet(SHINY)
        .buildAndRegister();

    BiphenylTetracarboxylicacidDianhydride = builderISG("biphenyl_tetracarboxylicacid_dianhydride")
        .dust()
        .color(0x1520b3)
        .iconSet(SHINY)
        .buildAndRegister();

    Cupriavidusnecator = builderISG("cupriavidusnecator")
        .dust()
        .color(0xa69e30)
        .iconSet(SHINY)
        .buildAndRegister();

    CucrmgbaCatalyst = builderISG("cucrmgba")
        .dust()
        .color(0x512DA8)
        .iconSet(DULL)
        .flags(ISGMaterialFlags.GENERATE_CATALYST)
        .buildAndRegister();

    DefattedSoybeanFlour = builderISG("defatted_soybean_flour")
        .dust()
        .color(0xB2B395)
        .iconSet(DULL)
        .buildAndRegister();

    CrushedSoybean = builderISG("crushed_soybean")
        .dust()
        .color(0xB2B395)
        .iconSet(DULL)
        .buildAndRegister();

    Ceramics = builderISG("ceramics")
        .dust()
        .color(0x3E2D2A)
        .iconSet(DULL)
        .buildAndRegister();

    PapicDigestOfSoybeanMeal = builderISG("papic_digest_of_soybean_meal")
        .dust()
        .color(0xFDD835)
        .iconSet(DULL)
        .buildAndRegister();

    PancreaticDigestOfCasein = builderISG("pancreatic_digest_of_casein")
        .dust()
        .color(0xBFBCAF)
        .iconSet(DULL)
        .buildAndRegister();

    Caesin = builderISG("caesin")
        .dust()
        .color(0xCDDC39)
        .iconSet(DULL)
        .buildAndRegister();

    SolidifiedSterileDefibrinatedSheepBlood = builderISG("solidified_sterile_defibrinated_sheep_blood")
        .dust()
        .color(0x572828)
        .iconSet(DULL)
        .buildAndRegister();

    PhenylethylAlcoholAgar = builderISG("phenylethyl_alcohol_agar")
        .dust()
        .color(0xA37672)
        .iconSet(SHINY)
        .buildAndRegister();

    NeodymiumAlloy = builderISG("neodymium_alloy")
        .dust()
        .color(0x605F5F)
        .iconSet(SHINY)
        .buildAndRegister();

    SupraFertilizer = builderISG("supra_fertilizer")
        .dust()
        .color(0xB3929E)
        .iconSet(SHINY)
        .buildAndRegister();

    GristPowder = builderISG("grist_powder")
        .dust()
        .color(0x886054)
        .iconSet(DULL)
        .buildAndRegister();

    SolidGrain = builderISG("solid_grain")
        .dust()
        .color(0xE6D5AF)
        .iconSet(DULL)
        .buildAndRegister();

    YeastExtractMannitolMedium = builderISG("yeast_extract_mannitol_medium")
        .dust()
        .color(0x66468C)
        .iconSet(SHINY)
        .buildAndRegister();

    TitaniumSludge = builderISG("titanium_sludge")
        .dust()
        .color(0xC08C9D)
        .iconSet(SHINY)
        .buildAndRegister();

    RefabricatedDraconium = builderISG("refabricated_draconium")
        .dust()
        .color(0x311B92)
        .iconSet(SHINY)
        .buildAndRegister();

    LeachedRefabricatedDraconium = builderISG("leached_refabricated_draconium")
        .dust()
        .color(0x8E24AA)
        .iconSet(DULL)
        .buildAndRegister();

    Aerotheum = builderISG("aerotheum")
        .dust()
        .color(0xFFEB3B)
        .iconSet(SHINY)
        .buildAndRegister();

    Petrotheum = builderISG("petrotheum")
        .dust()
        .color(0x383838)
        .iconSet(SHINY)
        .buildAndRegister();

    ResonantClathrate = builderISG("resonant_clathrate")
        .dust()
        .color(0x1B5E20)
        .iconSet(SHINY)
        .buildAndRegister();

    DestabilizedClathrate = builderISG("destabilized_clathrate")
        .dust()
        .color(0xB71C1C)
        .iconSet(SHINY)
        .buildAndRegister();

    EnergizedClathrate = builderISG("energized_clathrate")
        .dust()
        .color(0xFFEB3B)
        .iconSet(SHINY)
        .buildAndRegister();

    SolidMilkResidues = builderISG("solid_milk_residues")
        .dust()
        .color(0xFFEBEE)
        .iconSet(SHINY)
        .buildAndRegister();

    PrecipitateMithril = builderISG("precipitate_mithril")
        .dust()
        .color(0xAED2F2)
        .iconSet(DULL)
        .buildAndRegister();

    RoughenMithril = builderISG("roughen_mithril")
        .dust()
        .color(0xAED2F2)
        .iconSet(DULL)
        .buildAndRegister();

    ExcitedRoughenMithril = builderISG("excited_roughen_mithril")
        .dust()
        .color(0xAED2F2)
        .iconSet(SHINY)
        .buildAndRegister();

    ExcitedMithril = builderISG("excited_mithril")
        .dust()
        .color(0xAED2F2)
        .iconSet(SHINY)
        .buildAndRegister();

    Cobalt60 = builderISG("cobalt_60")
        .dust()
        .color(0x091175)
        .iconSet(DULL)
        .buildAndRegister();

    Magnesiumtetrachloride = builderISG("magnesiumtetrachloride")
        .dust()
        .color(0xBA68C8)
        .iconSet(DULL)
        .buildAndRegister();

    WhitePhosporus = builderISG("white_phosporus")
        .dust()
        .color(0xfffbc7)
        .iconSet(SHINY)
        .buildAndRegister();

    FloatedAndesite = builderISG("floated_andesite")
        .dust()
        .color(0x787575)
        .iconSet(SHINY)
        .buildAndRegister();

    DigestedAndesite = builderISG("digested_andesite")
        .dust()
        .color(0x787575)
        .iconSet(DULL)
        .buildAndRegister();

    Iriditus = builderISG("iriditus")
        .dust()
        .color(0x00BCD4)
        .iconSet(SHINY)
        .buildAndRegister();

    RoastedDeshite = builderISG("roasted_deshite")
        .dust()
        .color(0x6D6662)
        .iconSet(SHINY)
        .buildAndRegister();

    EvaporatedDeshiteCompound = builderISG("evaporated_deshite_compound")
        .dust()
        .color(0x4B4A4A)
        .iconSet(DULL)
        .buildAndRegister();

    SilverBromide = builderISG("silver_bromide")
        .dust()
        .color(0x4B4A4A)
        .iconSet(DULL)
        .buildAndRegister();

    HafniumPlatinumTitaniumComposite = builderISG("hafnium_platinum_titanium_composite")
        .dust()
        .color(0x4B4A4A)
        .iconSet(DULL)
        .buildAndRegister();

    MuddyMonaziteOreByproducts = builderISG("muddy_monazite_ore_byproducts")
        .dust()
        .color(0x514442)
        .iconSet(SHINY)
        .buildAndRegister();

    HighPurityArsenic = builderISG("high_purity_arsenic")
        .dust()
        .color(0xB0B0B1)
        .iconSet(SHINY)
        .buildAndRegister();

    IndiumChloride = builderISG("indium_chloride")
        .dust()
        .color(0x311B92)
        .iconSet(SHINY)
        .buildAndRegister();

    NickelNitride = builderISG("nickel_nitride")
        .dust()
        .color(0x2F4F4F)
        .iconSet(DULL)
        .buildAndRegister();

    RubyLeach = builderISG("ruby_leach")
        .dust()
        .color(0xF5C9C8)
        .iconSet(SHINY)
        .buildAndRegister();

    VanadiumTrichloride = builderISG("vanadium_trichloride")
        .dust()
        .color(0xFB8C00)
        .iconSet(SHINY)
        .buildAndRegister();

    NanotubeDepositionMix = builderISG("nanotube_deposition_mix")
        .dust()
        .color(0x2F4F4F)
        .iconSet(SHINY)
        .buildAndRegister();

    DopedNanotubeDepositionMix = builderISG("doped_nanotube_deposition_mix")
        .dust()
        .color(0xF5C9C8)
        .iconSet(SHINY)
        .buildAndRegister();

    NanotubeInsulationDepositionMix = builderISG("nanotube_insulation_deposition_mix")
        .dust()
        .color(0xFB8C00)
        .iconSet(SHINY)
        .buildAndRegister();

    DopedCarbonNanotubes = builderISG("doped_carbon_nanotubes")
        .dust()
        .color(0x2F4F4F)
        .iconSet(SHINY)
        .buildAndRegister();

    HslaSteel = builderISG("hsla_steel")
        .dust()
        .color(0xD5D8E8)
        .iconSet(DULL)
        .buildAndRegister();

    HeatedHslaSteel = builderISG("heated_hsla_steel")
        .dust()
        .color(0xECE7BF)
        .iconSet(SHINY)
        .buildAndRegister();

    QuenchedHslaSteel = builderISG("quenched_hsla_steel")
        .dust()
        .color(0xE9E3B7)
        .iconSet(SHINY)
        .buildAndRegister();

    NaquadahWaste = builderISG("naquadah_waste")
        .dust()
        .color(0x301b1b)
        .iconSet(DULL)
        .buildAndRegister();

    ConcentratedNaquatitaniumHydroxide = builderISG("concentrated_naquatitanium_hydroxide")
        .dust()
        .color(0x503a3a)
        .iconSet(SHINY)
        .buildAndRegister();

    ImpureNaquahamericiumHydroxide = builderISG("impure_naquahamericium_hydroxide")
        .dust()
        .color(0x684b4b)
        .iconSet(SHINY)
        .buildAndRegister();

    NaquahamericiumHydroxide = builderISG("naquahamericium_hydroxide")
        .dust()
        .color(0x8f6161)
        .iconSet(SHINY)
        .buildAndRegister();

    ChromiumSlagMud = builderISG("chromium_slag_mud")
        .dust()
        .color(0x874141)
        .iconSet(DULL)
        .buildAndRegister();

    ImpureNaquadahWaste = builderISG("impure_naquadah_waste")
        .dust()
        .color(0x281414)
        .iconSet(DULL)
        .buildAndRegister();

    PlatinumNanopowder = builderISG("platinum_nanopowder")
        .dust()
        .color(0xE0DAC0)
        .iconSet(SHINY)
        .buildAndRegister();

    RutheniumChloride = builderISG("ruthenium_chloride")
        .dust()
        .color(0x71736E)
        .iconSet(SHINY)
        .buildAndRegister();

    PlatinumRutheniumPowder = builderISG("platinum_ruthenium_powder")
        .dust()
        .color(0x616CA5)
        .iconSet(SHINY)
        .buildAndRegister();

    DenseMatter = builderISG("dense_matter")
        .dust()
        .color(0xD9B4E0)
        .iconSet(SHINY)
        .buildAndRegister();

    PureDenseMatter = builderISG("pure_dense_matter")
        .dust()
        .color(0x9DC8E9)
        .iconSet(SHINY)
        .buildAndRegister();

    DenseCarbonOxygenMatter = builderISG("dense_carbon_oxygen_matter")
        .dust()
        .color(0x559ED8)
        .iconSet(SHINY)
        .buildAndRegister();

    DenseExoticMatter = builderISG("dense_exotic_matter")
        .dust()
        .color(0x66BB6A)
        .iconSet(SHINY)
        .buildAndRegister();

    Lafeaso1CatalystPreparation = builderISG("lafeaso1_preparation")
        .dust()
        .color(0x987064)
        .iconSet(SHINY)
        .flags(ISGMaterialFlags.GENERATE_CATALYST)
        .buildAndRegister();

    RaneyNickel = builderISG("raney_nickel")
        .dust()
        .color(0xC7E4F0)
        .iconSet(SHINY)
        .buildAndRegister();

    CarbonDisulfide = builderISG("carbon_disulfide")
        .dust()
        .color(0xC2BE9D)
        .iconSet(DULL)
        .buildAndRegister();

    EnrichedNaquadahChloride = builderISG("enriched_naquadah_chloride")
        .dust()
        .color(0x4C5554)
        .iconSet(DULL)
        .buildAndRegister();

    EnrichedNaquadahOxide = builderISG("enriched_naquadah_oxide")
        .dust()
        .color(0x434847)
        .iconSet(DULL)
        .buildAndRegister();

    ManganeseDiacetate = builderISG("manganese_diacetate")
        .dust()
        .color(0xF8CBDA)
        .iconSet(SHINY)
        .buildAndRegister();

    CompressedDiamond = builderISG("compressed_diamond")
        .dust()
        .color(0x72A8D4)
        .iconSet(DULL)
        .buildAndRegister();

    CobaltNitrate = builderISG("cobalt_nitrate")
        .dust()
        .color(0x6d392e)
        .iconSet(DULL)
        .buildAndRegister();

    SodiumCyandiamide = builderISG("sodium_cyandiamide")
        .dust()
        .color(0xfffba6)
        .iconSet(DULL)
        .buildAndRegister();

    IndiumGalliumArsenide = builderISG("indium_gallium_arsenide")
        .dust()
        .color(0x928894)
        .iconSet(DULL)
        .buildAndRegister();

    SiliconNitride = builderISG("silicon_nitride")
        .dust()
        .color(0xE7C8BE)
        .iconSet(DULL)
        .buildAndRegister();

    Amberlyst15 = builderISG("amberlyst_15")
        .dust()
        .color(0x744EA1)
        .iconSet(SHINY)
        .buildAndRegister();

    TrimethylammoniumSalts = builderISG("trimethylammonium_salts")
        .dust()
        .color(0xE0A542)
        .iconSet(SHINY)
        .buildAndRegister();

    CadmiumOxide = builderISG("cadmium_oxide")
        .dust()
        .color(0xff6630)
        .iconSet(DULL)
        .buildAndRegister();

    Borane = builderISG("borane")
        .dust()
        .color(0x78A9A5)
        .iconSet(DULL)
        .buildAndRegister();

    HighPurityAluminium = builderISG("high_purity_aluminium")
        .dust()
        .color(0x7EBFDC)
        .iconSet(SHINY)
        .buildAndRegister();

    HighPurityGallium = builderISG("high_purity_gallium")
        .dust()
        .color(0x6B6B6B)
        .iconSet(SHINY)
        .buildAndRegister();

    HighPurityCadmium = builderISG("high_purity_cadmium")
        .dust()
        .color(0x3D3D3D)
        .iconSet(SHINY)
        .buildAndRegister();

    PotassiumPersulfate = builderISG("potassium_persulfate")
        .dust()
        .color(0x3D3D39)
        .iconSet(DULL)
        .buildAndRegister();

    PotassiumHydrofluoride = builderISG("potassium_hydrofluoride")
        .dust()
        .color(0xcdcdcd)
        .iconSet(DULL)
        .buildAndRegister();

    ManganeseNitride = builderISG("manganese_nitride")
        .dust()
        .color(0xAAB7C4)
        .iconSet(DULL)
        .buildAndRegister();

    SilverFluoride = builderISG("silver_fluoride")
        .dust()
        .color(0xfac8c8)
        .iconSet(SHINY)
        .buildAndRegister();

    NickelBoride = builderISG("nickel_boride")
        .dust()
        .color(0xff9b00)
        .iconSet(DULL)
        .buildAndRegister();

    MagnesiumSilicate = builderISG("magnesium_silicate")
        .dust()
        .color(0xa46681)
        .iconSet(DULL)
        .buildAndRegister();

    CobaltManganeseOxide = builderISG("cobalt_manganese_oxide")
        .dust()
        .color(0x64a47a)
        .iconSet(SHINY)
        .buildAndRegister();

    NiobiumOxide = builderISG("niobium_oxide")
        .dust()
        .color(0xA483AA)
        .iconSet(SHINY)
        .buildAndRegister();

    CadmiumMagnesiumTellurium = builderISG("cadmium_magnesium_tellurium")
        .dust()
        .color(0x529CC3)
        .iconSet(SHINY)
        .buildAndRegister();

    AlkaliCellulose = builderISG("alkali_cellulose")
        .dust()
        .color(0x594846)
        .iconSet(DULL)
        .buildAndRegister();

    SodiumCelluloseXanthate = builderISG("sodium_cellulose_xanthate")
        .dust()
        .color(0x6D4C41)
        .iconSet(DULL)
        .buildAndRegister();

    DensePerovskiteClusters = builderISG("dense_perovskite_clusters")
        .dust()
        .color(0x5f6a6a)
        .iconSet(SHINY)
        .buildAndRegister();

    RegolithMartian = builderISG("regolith_martian")
        .dust()
        .color(0x8b4513)
        .iconSet(DULL)
        .buildAndRegister();

    SulfuricMineral = builderISG("sulfuric_mineral")
        .dust()
        .color(0xa4a417)
        .iconSet(DULL)
        .buildAndRegister();

    CatherdralPyrite = builderISG("catherdral_pyrite")
        .dust()
        .color(0xffd700)
        .iconSet(SHINY)
        .buildAndRegister();

    AmorphousIcePowder = builderISG("amorphous_ice_powder")
        .dust()
        .color(0xd3d3d3)
        .iconSet(SHINY)
        .buildAndRegister();

    SaturnRingFragment = builderISG("saturn_ring_fragment")
        .dust()
        .color(0xd2b48c)
        .iconSet(SHINY)
        .buildAndRegister();

    CarbonRichClayPowder = builderISG("carbon_rich_clay_powder")
        .dust()
        .color(0x333333)
        .iconSet(DULL)
        .buildAndRegister();

    RawBuckfullerene = builderISG("raw_buckfullerene")
        .dust()
        .color(0x000000)
        .iconSet(SHINY)
        .buildAndRegister();

    AmorphousGraphite = builderISG("amorphous_graphite")
        .dust()
        .color(0x2f4f4f)
        .iconSet(DULL)
        .buildAndRegister();

    UranusNitriles = builderISG("uranus_nitriles")
        .dust()
        .color(0x4682b4)
        .iconSet(SHINY)
        .buildAndRegister();

    UranusHydrocarbon = builderISG("uranus_hydrocarbon")
        .dust()
        .color(0x5dadec)
        .iconSet(DULL)
        .buildAndRegister();

    SuperionicIceCrystal = builderISG("superionic_ice_crystal")
        .dust()
        .color(0xaddbe6)
        .iconSet(SHINY)
        .buildAndRegister();

    SasteroidEnstatiteDiamond = builderISG("sasteroid_enstatite_diamond")
        .dust()
        .color(0x8a9a5b)
        .iconSet(SHINY)
        .buildAndRegister();

    PlutoTholin = builderISG("pluto_tholin")
        .dust()
        .color(0x804000)
        .iconSet(DULL)
        .buildAndRegister();

    CryotholinCrystalPluto = builderISG("cryotholin_crystal_pluto")
        .dust()
        .color(0xffa500)
        .iconSet(DULL)
        .buildAndRegister();

    ImpureSubsurfaceClathrate = builderISG("impure_subsurface_clathrate")
        .dust()
        .color(0xffd700)
        .iconSet(DULL)
        .buildAndRegister();

    TholinIceEris = builderISG("tholin_ice_eris")
        .dust()
        .color(0xa0522d)
        .iconSet(DULL)
        .buildAndRegister();

    DeepCarbonSilicate = builderISG("deep_carbon_silicate")
        .dust()
        .color(0x704214)
        .iconSet(SHINY)
        .buildAndRegister();

    HaumeanQuartzIce = builderISG("haumean_quartz_ice")
        .dust()
        .color(0xf5f5f5)
        .iconSet(SHINY)
        .buildAndRegister();

    HaumeanSilicateIcecrystal = builderISG("haumean_silicate_icecrystal")
        .dust()
        .color(0xb0c4de)
        .iconSet(SHINY)
        .buildAndRegister();

    HydrocarbonComplexMm = builderISG("hydrocarbon_complex_mm")
        .dust()
        .color(0xe0ffff)
        .iconSet(DULL)
        .buildAndRegister();

    VolatileIceCrystal = builderISG("volatile_ice_crystal")
        .dust()
        .color(0xb0e0e6)
        .iconSet(SHINY)
        .buildAndRegister();

    ScatteredKbo = builderISG("scattered_kbo")
        .dust()
        .color(0x8a3324)
        .iconSet(DULL)
        .buildAndRegister();

    Ptn = builderISG("ptn")
        .dust()
        .color(0x7b3f00)
        .iconSet(DULL)
        .buildAndRegister();

    CeresianSubsurfaceAmmonia = builderISG("ceresian_subsurface_ammonia")
        .dust()
        .color(0xa1a8b6)
        .iconSet(SHINY)
        .buildAndRegister();

    AncientInterstellarCore = builderISG("ancient_interstellar_core")
        .dust()
        .color(0x2f4f4f)
        .iconSet(SHINY)
        .buildAndRegister();

    SulfideNodesOc = builderISG("sulfide_nodes_oc")
        .dust()
        .color(0x9c7c5d)
        .iconSet(SHINY)
        .buildAndRegister();

    RegolithLunar = builderISG("regolith_lunar")
        .dust()
        .color(0xddd4af)
        .iconSet(DULL)
        .buildAndRegister();

    ImpureHe3 = builderISG("impure_he3")
        .dust()
        .color(0xa9a9a9)
        .iconSet(SHINY)
        .buildAndRegister();

    MolecularSieve = builderISG("molecular_sieve")
        .dust()
        .color(0x666666)
        .iconSet(SHINY)
        .buildAndRegister();

    OleicAcid = builderISG("oleic_acid")
        .dust()
        .color(0x9fcc9d)
        .iconSet(DULL)
        .buildAndRegister();

    CalcinatedZircon = builderISG("calcinated_zircon")
        .dust()
        .color(0xdb7332)
        .iconSet(SHINY)
        .buildAndRegister();

    ZirconiumSulfate = builderISG("zirconium_sulfate")
        .dust()
        .color(0xF9C085)
        .iconSet(DULL)
        .buildAndRegister();

  }
}
