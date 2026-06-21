package com.zircky.industrialsorcerygreg.common.data.materials;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.ToolProperty;
import com.gregtechceu.gtceu.api.fluids.FluidBuilder;
import com.gregtechceu.gtceu.api.fluids.FluidState;
import com.gregtechceu.gtceu.api.fluids.attribute.FluidAttributes;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;
import com.gregtechceu.gtceu.common.data.GTElements;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.zircky.industrialsorcerygreg.api.ISGValues;
import com.zircky.industrialsorcerygreg.api.data.material.ISGMaterialFlags;
import com.zircky.industrialsorcerygreg.common.data.ISGElement;
import com.zircky.industrialsorcerygreg.common.data.ISGMaterials;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.FLUID;
import static com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty.GasTier.HIGH;
import static com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty.GasTier.HIGHEST;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.SNDART_FLAGS;
import static com.zircky.industrialsorcerygreg.common.data.materials.ISGMaterialIconSet.CHAOS;
import static com.zircky.industrialsorcerygreg.common.data.materials.ISGMaterialIconSet.INFINITY;



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
        .color((GTMaterials.Actinium.getMaterialRGB() + GTMaterials.Thorium.getMaterialRGB() + GTMaterials.Protactinium.getMaterialRGB() + GTMaterials.Uranium238.getMaterialRGB() + ISGMaterials.Neptunium.getMaterialRGB() + GTMaterials.Plutonium241.getMaterialRGB() + GTMaterials.Americium.getMaterialRGB() + GTMaterials.Curium.getMaterialRGB() + GTMaterials.Berkelium.getMaterialRGB() + GTMaterials.Californium.getMaterialRGB() + GTMaterials.Einsteinium.getMaterialRGB() + GTMaterials.Fermium.getMaterialRGB() + GTMaterials.Mendelevium.getMaterialRGB()) / 13)
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

    RheniumHassiumThalliumIsophtaloylbisdiethylthioureaHexafluorophosphate = builderISG("rhenium_hassium_thallium_isophtaloylbisdiethylthiourea")
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

    CoAcABCatalyst = builderISG("coacab_catalyst")
        .dust()
        .color(0x755f30)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("Co/AC-AB");

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

    PdCCatalyst = builderISG("pdc_catalyst")
        .langValue("Palladium on Carbon")
        .dust()
        .color((GTMaterials.Palladium.getMaterialRGB() + GTMaterials.Carbon.getMaterialRGB()) / 2)
        .iconSet(DULL)
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
        .buildAndRegister()
        .setFormula("Ac(NO3)3", true);

    RadiumNitrate = builderISG("radium_nitrate")
        .dust()
        .color(BariumNitrate.getMaterialRGB())
        .iconSet(DULL)
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
  }
}
