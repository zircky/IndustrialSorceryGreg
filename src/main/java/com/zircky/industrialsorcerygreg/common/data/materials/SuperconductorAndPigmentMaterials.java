package com.zircky.industrialsorcerygreg.common.data.materials;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.ToolProperty;
import com.gregtechceu.gtceu.api.fluids.FluidBuilder;
import com.gregtechceu.gtceu.api.fluids.attribute.FluidAttributes;
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



final class SuperconductorAndPigmentMaterials {
  private SuperconductorAndPigmentMaterials() {
  }

  static void register() {
    WellMixedYBCOxides = builderISG("well_mixed_ybc_oxides")
        .langValue("Well Mixed YBC Oxides")
        .dust()
        .color(0x2c3429)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("YBa2Cu3O6", true);

    PiledTBCC = builderISG("piled_tbcc")
        .langValue("Piled TBCC")
        .dust()
        .color(0x669900)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Tl2Ba2Cu3Ca2", true);

    ActiniumOxalate = builderISG("actinium_oxalate")
        .dust()
        .color(GTMaterials.Actinium.getMaterialRGB())
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Ac(CO2)4", true);

    ActiniumHydride = builderISG("actinium_hydride")
        .dust()
        .color(GTMaterials.Actinium.getMaterialRGB())
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("AcH3", true);

    LanthanumFullereneMix = builderISG("lanthanum_fullerene_mix")
        .dust()
        .color(0xdfcafa)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("(C60)2La2?", true);

    LanthanumEmbeddedFullerene = builderISG("lanthanum_embedded_fullerene")
        .dust()
        .color(0x99cc00)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("(C60)2La2", true);

    IronIodide = builderISG("iron_iodide")
        .dust()
        .color((GTMaterials.Iron.getMaterialRGB() + GTMaterials.Iodine.getMaterialRGB()) / 2)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("FeI2", true);

    ThalliumIodide = builderISG("thallium_iodide")
        .dust()
        .color((GTMaterials.Thallium.getMaterialRGB() + GTMaterials.Iodine.getMaterialRGB()) / 2)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("TlI");

    ScandiumIodide = builderISG("scandium_iodide")
        .dust()
        .color((GTMaterials.Scandium.getMaterialRGB() + GTMaterials.Iodine.getMaterialRGB()) / 2)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("ScI3", true);

    RubidiumIodide = builderISG("rubidium_iodide")
        .dust()
        .color((GTMaterials.Rubidium.getMaterialRGB() + GTMaterials.Iodine.getMaterialRGB()) / 2)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("RbI");

    IndiumIodide = builderISG("indium_iodide")
        .dust()
        .color((GTMaterials.Indium.getMaterialRGB() + GTMaterials.Iodine.getMaterialRGB()) / 2)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("InI3", true);

    GalliumIodide = builderISG("gallium_iodide")
        .dust()
        .color((GTMaterials.Gallium.getMaterialRGB() + GTMaterials.Iodine.getMaterialRGB()) / 2)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("GaI3", true);

    UVAHalideMix = builderISG("uva_halide_mix")
        .dust()
        .color((GalliumIodide.getMaterialRGB() + GTMaterials.PotassiumIodide.getMaterialRGB() + GTMaterials.Mercury.getMaterialRGB()) / 3)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Hg(GaI3)KI", true);

    WhiteHalideMix = builderISG("white_halide_mix")
        .dust()
        .color((ScandiumIodide.getMaterialRGB() + GTMaterials.PotassiumIodide.getMaterialRGB() + GTMaterials.Mercury.getMaterialRGB()) / 3)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Hg(ScI3)KI", true);

    BlueHalideMix = builderISG("blue_halide_mix")
        .dust()
        .color((IndiumIodide.getMaterialRGB() + GTMaterials.PotassiumIodide.getMaterialRGB() + GTMaterials.Mercury.getMaterialRGB()) / 3)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Hg(InI3)KI", true);

    GreenHalideMix = builderISG("green_halide_mix")
        .dust()
        .color((ThalliumIodide.getMaterialRGB() + GTMaterials.PotassiumIodide.getMaterialRGB() + GTMaterials.Mercury.getMaterialRGB()) / 3)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Hg(TlI)KI");

    RedHalideMix = builderISG("red_halide_mix")
        .dust()
        .color((RubidiumIodide.getMaterialRGB() + GTMaterials.PotassiumIodide.getMaterialRGB() + GTMaterials.Mercury.getMaterialRGB()) / 3)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Hg(RbI)KI");

    CarbonylPurifiedIron = builderISG("carbonyl_purified_iron")
        .dust()
        .color(GTMaterials.Iron.getMaterialRGB())
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Fe");

    BariumTriflate = builderISG("barium_triflate")
        .dust()
        .color((GTMaterials.Barium.getMaterialRGB() + GTMaterials.Fluorine.getMaterialRGB()) / 2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Ba(OSO2CF3)2", true);

    ScandiumTriflate = builderISG("scandium_triflate")
        .dust()
        .color(0xdfcfcf)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Sc(OSO2CF3)3", true);

    SodiumThiosulfate = builderISG("sodium_thiosulfate")
        .dust()
        .color(0x2090fc)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("Na2S2O3", true);

    TitaniumCyclopentadienyl = builderISG("titanium_cyclopentadienyl")
        .dust()
        .color(0xbc30bc)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("(C5H5)2Cl2Ti", true);

    SodiumBromide = builderISG("sodium_bromide")
        .dust()
        .color(0xfeaffc)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("NaBr");

    FranciumCarbide = builderISG("francium_carbide")
        .dust()
        .color(GTMaterials.Francium.getMaterialRGB())
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Fr2C2", true);

    BoronCarbide = builderISG("boron_carbide")
        .dust()
        .color(0x303030)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("B4C3", true);

    BoronFranciumCarbide = builderISG("boron_francium_carbide")
        .dust()
        .color(0x808080)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Fr4B4C7", true);

    MixedAstatideSalts = builderISG("mixed_astatide_salts")
        .dust()
        .color(0x6df63f)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("(At3)(Ho)(Th)(Cn)(Fl)", true);

    SodiumIodide = builderISG("sodium_iodide")
        .dust()
        .color(0x555588)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("NaI");

    SodiumIodate = builderISG("sodium_iodate")
        .dust()
        .color(0x11116d)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("NaIO3", true);

    SodiumPeriodate = builderISG("sodium_periodate")
        .dust()
        .color(0x11116d)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("NaIO4", true);

    SodiumSeaborgate = builderISG("sodium_seaborgate")
        .dust()
        .color(0x55bbd4)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Na2SgO4", true);

    StrontiumChloride = builderISG("strontium_chloride")
        .dust()
        .color(0x3a9aba)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("SrCl2", true);

    YttriumEuropiumVanadate = builderISG("yttrium_europium_vanadate")
        .dust()
        .color((GTMaterials.Yttrium.getMaterialRGB() + GTMaterials.Europium.getMaterialRGB() + GTMaterials.Vanadium.getMaterialRGB()) / 3)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("YEuVO4", true);

    StrontiumEuropiumAluminate = builderISG("strontium_europium_aluminate")
        .dust()
        .color((GTMaterials.Strontium.getMaterialRGB() + GTMaterials.Europium.getMaterialRGB() + GTMaterials.Aluminium.getMaterialRGB()) / 3)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("SrEuAl2O4", true);

    BariumStrontiumTitanate = builderISG("barium_strontium_titanate")
        .dust()
        .color(0xFF0066)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("BaO4SrTi", true);

    PotassiumManganate = builderISG("potassium_manganate")
        .dust()
        .color(0xaf20af)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("K2MnO4", true);

    BariumChloride = builderISG("barium_chloride")
        .dust()
        .color((GTMaterials.Barium.getMaterialRGB() + GTMaterials.Chlorine.getMaterialRGB()) / 2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("BaCl2", true);

    TantalumOxide = builderISG("tantalum_oxide")
        .dust()
        .color((GTMaterials.Tantalum.getMaterialRGB() + GTMaterials.Oxygen.getMaterialRGB()) / 2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Ta2O5", true);

    ZirconylChloride = builderISG("zirconyl_chloride")
        .dust()
        .color(ZirconiumTetrachloride.getMaterialRGB())
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("ZrOCl2", true);

    LeadSenenide = builderISG("lead_selenide")
        .dust()
        .color((GTMaterials.Lead.getMaterialRGB() + GTMaterials.Selenium.getMaterialRGB()) / 2)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("PbSe");

    LeadScandiumTantalate = builderISG("lead_scandium_tantalate")
        .dust()
        .color((GTMaterials.Lead.getMaterialRGB() + GTMaterials.Scandium.getMaterialRGB() + GTMaterials.Tantalum.getMaterialRGB()) / 3)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Pb(ScTa)O3", true);

    BETS = builderISG("bets")
        .langValue("Bisethylenedithiotetraselenafulvalene (BETS) Perrhenate")
        .dust()
        .color(0x7ada00)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("C10H8S4Se4", true);

    MagnetorestrictiveAlloy = builderISG("magnetorestrictive_alloy")
        .dust()
        .color(0xafefef)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Tb4Dy7Fe10Co5B2SiC", true);

    BoronOxide = builderISG("boron_oxide")
        .dust()
        .color((GTMaterials.Boron.getMaterialRGB() + GTMaterials.Oxygen.getMaterialRGB()) / 2)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("B2O3", true);

    LithiumAluminiumFluoride = builderISG("lithium_aluminium_fluoride")
        .dust()
        .color((GTMaterials.Lithium.getMaterialRGB() + GTMaterials.Aluminium.getMaterialRGB() + GTMaterials.Fluorine.getMaterialRGB()) / 3)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("AlF4Li", true);

    HafniumCarbide = builderISG("hafnium_carbide")
        .dust()
        .color(0x2c2c2c)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("HfC");

    SeaborgiumCarbide = builderISG("seaborgium_carbide")
        .dust()
        .color(0x2c2c2c)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("SgC");

    AluminiumNitrate = builderISG("aluminium_nitrate")
        .dust()
        .color(Alumina.getMaterialRGB())
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Al(NO3)3", true);

    NeodymiumDopedYttrium = builderISG("neodymium_doped_yttrium")
        .dust()
        .color(ISGMaterials.YttriumOxide.getMaterialRGB())
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("Nd:Y?");

    NdYAGNanoparticles = builderISG("nd_yag_nanoparticles")
        .langValue("Nd:YAG Nanoparticles")
        .dust()
        .color(0xcf8acf)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Nd:YAG");

    PotassiumPermanganate = builderISG("potassium_permanganate")
        .dust()
        .color(PotassiumManganate.getMaterialRGB() - 15)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("KMnO4", true);

    Urea = builderISG("urea")
        .dust()
        .color(0x30cf20)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("CH4N2O", true);

    FluoroapatiteSolidResidue = builderISG("fluoroapatite_solid_residue")
        .dust()
        .color(0x3cb290)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Ca6PO4SiO3F", true);

    ApatiteSolidResidue = builderISG("apatite_solid_residue")
        .dust()
        .color(0x3cb290)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("Ca6PO4SiO3", true);

    AmmoniumBifluoride = builderISG("ammonium_bifluoride")
        .dust()
        .color(0x20cfcf)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("NH4HF2", true);

    SodiumArsenate = builderISG("sodium_arsenate")
        .dust()
        .color(0xbffabf)
        .iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("Na3AsO4", true);

    PrHoYLFNanoparticles = builderISG("prho_ylf_nanoparticles")
        .langValue("Pr/Ho:YLF Nanoparticles")
        .dust()
        .color(0x6f20af)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Pr/Ho:YLF");

    LuTmYVONanoparticles = builderISG("lutm_yvo_nanoparticles")
        .langValue("Lu/Tm:YVO Nanoparticles")
        .dust()
        .color(0x206faf)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Lu/Tm:YVO");

    PureSodiumVanadate = builderISG("pure_sodium_vanadate")
        .dust()
        .color(SodiumVanadate.getMaterialRGB())
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Na3VO4", true);

    AmmoniumCarbonate = builderISG("ammonium_carbonate")
        .dust()
        .color(AmmoniumSulfate.getMaterialRGB())
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("(NH4)2CO3", true);

    CadmiumSulfide = builderISG("cadmium_sulfide")
        .dust()
        .color(0xffff00)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("CdS");

    UnprocessedNdYAGDust = builderISG("unprocessed_ndyag")
        .langValue("Unprocessed Nd:YAG Dust")
        .dust()
        .color(0xcf8acf)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("Nd:YAG?");

    LuTmYVOPrecipitate = builderISG("lutm_yvo_precipitate")
        .langValue("Lu/Tm:YVO Precipitate")
        .dust()
        .color(0x6f20af)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("Lu/Tm:YVO?");

    RawSienna = builderISG("raw_siena")
        .dust()
        .color(0x663300)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("SiO2(MnO2)(FeO2)", true);

    BurnedSienna = builderISG("burned_siena")
        .dust()
        .color(0xff0000)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("SiO2(MnO2)(FeO2)", true);

    BismuthVanadate = builderISG("bismuth_vanadate")
        .dust()
        .color(0xffff00)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("BiVO4", true);

    CopperArsenite = builderISG("copper_arsenite")
        .dust()
        .color(0x66ff66)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Cu3(AsO4)2", true);

    MercuryIodide = builderISG("mercury_iodide")
        .dust()
        .color(0xff0000)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("HgI2", true);

    TitaniumYellow = builderISG("titanium_yellow")
        .dust()
        .color(0xffff00)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("NiO(Sb2O3)(TiO2)20", true);

    CobaltZincOxide = builderISG("cobalt_zinc_oxide")
        .dust()
        .color(0x00ffff)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("CoZn4O5", true);

    ScheelesGreen = builderISG("scheeles_green")
        .dust()
        .color(0x00ff00)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("AsCuHO3", true);

    CobaltAluminate = builderISG("cobalt_aluminate")
        .dust()
        .color(0x0000ff)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("Al2Co2O5", true);

    AmmoniumManganesePhosphate = builderISG("ammonium_manganese_phosphate")
        .dust()
        .color(0x660066)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("NH4MnPO4", true);

    HanPurple = builderISG("hans_purple")
        .dust()
        .color(0x660066)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("BaCuSi2O6", true);

    DiaminostilbenedisulfonicAcid = builderISG("diaminostilbenedisulfonic_acid")
        .dust()
        .color(0xffffff)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C14H14N2O6S2", true);

    Nigrosin = builderISG("nigrosin")
        .dust()
        .color(0x000000)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C36H26N5ClNa2S2O6", true);

    DirectBrown = builderISG("direct_brown")
        .dust()
        .color(0x663300)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C26H19N6NaO3S", true);

    DianilineterephthalicAcid = builderISG("dianilineterephthalic_acid")
        .dust()
        .color(0xff0000)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C20H16N2O4", true);

    Quinacridone = builderISG("quinacridone")
        .dust()
        .color(0xff0000)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C20H12N2O2", true);

    DiarylideYellow = builderISG("diarylide_yellow")
        .dust()
        .color(0xffff00)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C32H26Cl2N6O4", true);

    AlizarineCyanineGreen = builderISG("alizarine_cyanine_green")
        .dust()
        .color(0x00ff00)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C28H20N2Na2O8S2", true);

    Aminoanthraquinone = builderISG("aminoanthraquinone")
        .dust()
        .color(0x0000ff)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C14H9NO2", true);

    IndanthroneBlue = builderISG("indanthrone_blue")
        .dust()
        .color(0x0000ff)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C28H14N2O2", true);

    Diketopyrrolopyrrole = builderISG("diketopyrrolopyrrole")
        .dust()
        .color(0xff6600)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C18H12N2O2", true);

    Mauveine = builderISG("mauveine")
        .dust()
        .color(0x660066)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C26H23N4", true);

    Indigo = builderISG("indigo")
        .dust()
        .color(0x0000ff)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C16H10N2O2", true);

    Tetrabromoindigo = builderISG("tetrabromoindigo")
        .dust()
        .color(0x00ff00)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C16H6Br2N2O2", true);

    CyanIndigoDye = builderISG("cyan_indigo_dye")
        .dust()
        .color(0x009999)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("(C16H10N2O2)2Br2", true);

    Fluorescein = builderISG("fluorescein")
        .dust()
        .color(0x990000)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C20H12O5", true);

    Erythrosine = builderISG("erythrosine")
        .dust()
        .color(0xff00ff)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C20H6I4Na2O5", true);

  }
}
