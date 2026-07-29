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
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.SNDART_FLAGS;
import static com.zircky.industrialsorcerygreg.common.data.materials.ISGMaterialIconSet.CHAOS;
import static com.zircky.industrialsorcerygreg.common.data.materials.ISGMaterialIconSet.INFINITY;



final class ChemicalPrecursorMaterials {
  private ChemicalPrecursorMaterials() {
  }

  static void register() {
    Toluidine = builderISG("toluidine")
        .fluid()
        .color((GTMaterials.Toluene.getMaterialRGB() + Aniline.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C7H9N", true);

    ApatiteAcidicLeach = builderISG("apatite_acidic_leach")
        .fluid()
        .color(GTMaterials.PhosphoricAcid.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H10P3O12Cl??", true);

    FluoroapatiteAcidicLeach = builderISG("fluoroapatite_acidic_leach")
        .fluid()
        .color(GTMaterials.PhosphoricAcid.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H10P3O12F??", true);

    NitrousAcid = builderISG("nitrous_acid")
        .liquid(new FluidBuilder().attribute(FluidAttributes.ACID))
        .color(0x1e73b0)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("HNO2", true);

    HydroxylamineHydrochloride = builderISG("hydroxylamine_hydrochloride")
        .fluid()
        .color(((GTMaterials.Barium.getMaterialRGB() + GTMaterials.Chlorine.getMaterialRGB()) / 2 + 0xF0EAD6) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("HONH2HCl", true);

    SelenousAcid = builderISG("selenous_acid")
        .fluid()
        .color((0xFFFF66 + Water.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2SeO3", true);

    Glyoxal = builderISG("glyoxal")
        .fluid()
        .color(0xf2f068)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C2H2O2", true);

    BenzylChloride = builderISG("benzyl_chloride")
        .fluid()
        .color(0xaef7fc)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C7H7Cl", true);

    Benzylamine = builderISG("benzylamine")
        .fluid()
        .color(0x5c8082)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C7H9N", true);

    Tetrahydrofuran = builderISG("tetrahydrofuran")
        .fluid()
        .color(0xb7ebcd)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(CH2)4O", true);

    Triethylamine = builderISG("triethylamine")
        .fluid()
        .color(Ethylenediamine.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("N(CH2CH3)3", true);

    TetrafluoroboricAcid = builderISG("tetrafluoroboric_acid")
        .liquid(new FluidBuilder().attribute(FluidAttributes.ACID))
        .color(Silvertetrafluoroborate.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("HBF4", true);

    BoronTrifluorideEtherate = builderISG("boron_trifluoride_etherate")
        .fluid()
        .color((BoronFluoride.getMaterialRGB() + Diethylether.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(BF3)(C2H5)2O", true);

    BoraneDimethylsulfide = builderISG("borane_dimethylsulfide")
        .fluid()
        .color((Diborane.getMaterialRGB() + Dimethylsulfide.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(BH3)(CH3)2S", true);

    Perfluorobenzene = builderISG("perfluorobenzene")
        .fluid()
        .color(0x226E22)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6F6", true);

    NitratedTriniiteSolution = builderISG("nitrated_triniite_solution")
        .fluid()
        .color(0x428c9f)
        .iconSet(FLUID)
        .buildAndRegister();

    ResidualTriniiteSolution = builderISG("residual_triniite_solution")
        .fluid()
        .color(0x219daf)
        .iconSet(FLUID)
        .buildAndRegister();

    HeavilyFluorinatedTriniumSolution = builderISG("heavily_fluorinated_trinium_solution")
        .fluid()
        .color(0x348d41)
        .iconSet(FLUID)
        .buildAndRegister();

    MoltenCalciumSalts = builderISG("molten_calcium_salts")
        .fluid()
        .color((ISGMaterials.Fluorite.getMaterialRGB() + GTMaterials.Calcium.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister();

    EthylTrifluoroacetate = builderISG("ethyl_trifluoroacetate")
        .fluid()
        .color(0x88a12d)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C4H5F3O2", true);

    Acetothienone = builderISG("acetothieone")
        .fluid()
        .color(0x79882a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6H6SO", true);

    TheonylTrifluoroacetate = builderISG("theonyl_trifluoroacetate")
        .fluid()
        .color(0x88882b)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C8H5F3O2S", true);

    ActiniumRadiumNitrateSolution = builderISG("actinium_radium_nitrate_solution")
        .fluid()
        .color(0xd2f0df)
        .iconSet(FLUID)
        .buildAndRegister();

    ActiniumRadiumHydroxideSolution = builderISG("actinium_radium_hydroxide_solution")
        .fluid()
        .color(0xe2f5ef)
        .iconSet(FLUID)
        .buildAndRegister();

    FumingNitricAcid = builderISG("fuming_nitric_acid")
        .liquid(new FluidBuilder().attribute(FluidAttributes.ACID))
        .color(GTMaterials.NitricAcid.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("HNO3", true);

    AcetylChloride = builderISG("acetyl_chloride")
        .fluid()
        .color(GTMaterials.AceticAcid.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C2H3OCl", true);

    DirtyHexafluorosilicicAcid = builderISG("dirty_hexafluorosilicic_acid")
        .liquid(new FluidBuilder().attribute(FluidAttributes.ACID))
        .color((GTMaterials.Stone.getMaterialRGB() + FluorosilicicAcid.getMaterialRGB() / 2))
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2SiF6?", true);

    DiluteHexafluorosilicicAcid = builderISG("dilute_hexafluorosilicic_acid")
        .liquid(new FluidBuilder().attribute(FluidAttributes.ACID))
        .color((Water.getMaterialRGB() * 2 + FluorosilicicAcid.getMaterialRGB()) / 3)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)2(H2SiF6)", true);

    Dioxygendifluoride = builderISG("dioxygen_difluoride")
        .fluid()
        .color(0x32bdaf)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("FOOF");

    DiluteHydrofluoricAcid = builderISG("dilute_hydrofluoric_acid")
        .liquid(new FluidBuilder().attribute(FluidAttributes.ACID))
        .color((Water.getMaterialRGB() + GTMaterials.HydrofluoricAcid.getMaterialRGB()) / 3)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)(HF)", true);

    OxidizedResidualSolution = builderISG("oxidized_residual_solution")
        .fluid()
        .color(0x23ad7f)
        .iconSet(FLUID)
        .buildAndRegister();

    TritiumHydride = builderISG("tritium_hydride")
        .fluid()
        .color(GTMaterials.Tritium.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("TH");

    Helium3Hydride = builderISG("helium_3_hydride")
        .fluid()
        .color(GTMaterials.Helium3.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("He-3H");

    UltraacidicResidueSolution = builderISG("ultraacidic_residue_solution")
        .fluid()
        .color((GTMaterials.FluoroantimonicAcid.getMaterialRGB() + Helium3Hydride.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister();

    XenicAcid = builderISG("xenic_acid")
        .liquid(new FluidBuilder().attribute(FluidAttributes.ACID))
        .color(0x5a4c9c)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2XeO4", true);

    DustyLiquidHelium3 = builderISG("dusty_liquid_helium3")
        .fluid()
        .color(2 * GTMaterials.Helium3.getMaterialRGB() / 3 + ISGMaterials.Taranium.getMaterialRGB() / 5)
        .iconSet(FLUID)
        .buildAndRegister();

    TaraniumEnrichedLHelium3 = builderISG("taranium_enriched_liquid_helium3")
        .fluid()
        .color(GTMaterials.Helium3.getMaterialRGB() / 2 + ISGMaterials.Taranium.getMaterialRGB() / 2)
        .iconSet(FLUID)
        .buildAndRegister();

    TaraniumSemidepletedLHelium3 = builderISG("taranium_semidepleted_liquid_helium3")
        .fluid()
        .color(2 * GTMaterials.Helium3.getMaterialRGB() / 3 + ISGMaterials.Taranium.getMaterialRGB() / 5)
        .iconSet(FLUID)
        .buildAndRegister();

    TaraniumDepletedLHelium3 = builderISG("taranium_depleted_liquid_helium3")
        .fluid()
        .color(GTMaterials.Helium3.getMaterialRGB() * 5 / 6 + ISGMaterials.Taranium.getMaterialRGB() / 8)
        .iconSet(FLUID)
        .buildAndRegister();

    TaraniumRichDustyHelium = builderISG("taranium_rich_dusty_helium")
        .fluid()
        .color(GTMaterials.Helium.getMaterialRGB() / 2 + ISGMaterials.Taranium.getMaterialRGB() / 2)
        .iconSet(FLUID)
        .buildAndRegister();

    TaraniumDepletedHelium = builderISG("taranium_depleted_helium")
        .fluid()
        .color(GTMaterials.Helium.getMaterialRGB() / 2 + ISGMaterials.Taranium.getMaterialRGB() / 2)
        .iconSet(FLUID)
        .buildAndRegister();

    TaraniumRichHelium4 = builderISG("taranium_rich_helium_4")
        .fluid()
        .plasma()
        .color(GTMaterials.Helium.getMaterialRGB() / 2 + ISGMaterials.Taranium.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister();

    TaraniumPoorLiquidHelium = builderISG("taranium_poor_liquid_helium")
        .fluid()
        .color(GTMaterials.Helium3.getMaterialRGB() * 6 / 7 + ISGMaterials.Taranium.getMaterialRGB() / 14)
        .iconSet(FLUID)
        .buildAndRegister();

    LiquidFluorine = builderISG("liquid_fluorine")
        .fluid()
        .color(GTMaterials.Fluorine.getMaterialRGB() - 0x303030)
        .iconSet(FLUID)
        .buildAndRegister();

    LiquidXenon = builderISG("liquid_xenon")
        .fluid()
        .color(GTMaterials.Xenon.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister();

    TaraniumPoorLiquidHeliumMix = builderISG("taranium_poor_liquid_helium_mix")
        .fluid()
        .color(TaraniumPoorLiquidHelium.getMaterialRGB() * 10 / 11 + GTMaterials.Helium.getMaterialRGB() / 11)
        .iconSet(FLUID)
        .buildAndRegister();

    HydroiodicAcid = builderISG("hydroiodic_acid")
        .liquid(new FluidBuilder().attribute(FluidAttributes.ACID))
        .color(GTMaterials.Hydrogen.getMaterialRGB() / 2 + GTMaterials.Iodine.getMaterialRGB() / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("HI");

    ChlorodiisopropylPhosphine = builderISG("chlorodiisopropyl_phosphine")
        .fluid()
        .color(0xa2c122)
        .iconSet(FLUID)
        .buildAndRegister();

    CesiumBromideSolution = builderISG("cesium_bromide_solution")
        .fluid()
        .color((GTMaterials.Caesium.getMaterialRGB() - 10 + GTMaterials.SaltWater.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("CsBr(H2O)", true);

    IndiumTrifluoride = builderISG("indium_trifluoride")
        .dust()
        .color(0x2b0f48)
        .iconSet(GTMaterials.Indium.getMaterialIconSet())
        .buildAndRegister()
        .setFormula("InF3", true);

    IndiumTrioxide = builderISG("indium_trioxide")
        .dust()
        .color(0x2b0f48)
        .iconSet(GTMaterials.Indium.getMaterialIconSet())
        .buildAndRegister()
        .setFormula("In2O3", true);

    NaquadahConcentrate = builderISG("naquadah_concentrate")
        .dust()
        .color(GTMaterials.Naquadah.getMaterialRGB())
        .iconSet(GTMaterials.Naquadah.getMaterialIconSet())
        .buildAndRegister()
        .setFormula("Nq?");

    EnrichedNaquadahConcentrate = builderISG("enriched_naquadah_concentrate")
        .dust()
        .color(GTMaterials.NaquadahEnriched.getMaterialRGB())
        .iconSet(GTMaterials.NaquadahEnriched.getMaterialIconSet())
        .buildAndRegister()
        .setFormula("Nq+?");

    NaquadriaConcentrate = builderISG("naquadria_concentrate")
        .dust()
        .color(GTMaterials.Naquadria.getMaterialRGB())
        .iconSet(GTMaterials.Naquadria.getMaterialIconSet())
        .buildAndRegister()
        .setFormula("*Nq*?");

    AuricFluoride = builderISG("auric_fluoride")
        .dust()
        .color(0xdffb50)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("AuF3", true);

    ThUSludge = builderISG("thorium_uranium_sludge")
        .dust()
        .color(0x002908)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("ThU");

    LanthanumOxide = builderISG("lanthanum_oxide")
        .dust()
        .color(GTMaterials.Lanthanum.getMaterialRGB())
        .iconSet(GTMaterials.Lanthanum.getMaterialIconSet())
        .buildAndRegister()
        .setFormula("La2O3", true);

    PraseodymiumOxide = builderISG("praseodymium_oxide")
        .dust()
        .color(GTMaterials.Praseodymium.getMaterialRGB())
        .iconSet(GTMaterials.Praseodymium.getMaterialIconSet())
        .buildAndRegister()
        .setFormula("Pr2O3", true);

    NeodymiumOxide = builderISG("neodymium_oxide")
        .dust()
        .color(GTMaterials.Neodymium.getMaterialRGB())
        .iconSet(GTMaterials.Neodymium.getMaterialIconSet())
        .buildAndRegister()
        .setFormula("Nd2O3", true);

    CeriumOxide = builderISG("cerium_oxide")
        .dust()
        .color(GTMaterials.Cerium.getMaterialRGB())
        .iconSet(GTMaterials.Cerium.getMaterialIconSet())
        .buildAndRegister()
        .setFormula("Ce2O3", true);

    EuropiumOxide = builderISG("europium_oxide")
        .dust()
        .color(GTMaterials.Europium.getMaterialRGB())
        .iconSet(GTMaterials.Europium.getMaterialIconSet())
        .buildAndRegister()
        .setFormula("Eu2O3", true);

    GadoliniumOxide = builderISG("gadolinium_oxide")
        .dust()
        .color(GTMaterials.Gadolinium.getMaterialRGB())
        .iconSet(GTMaterials.Gadolinium.getMaterialIconSet())
        .buildAndRegister()
        .setFormula("Gd2O3", true);

    SamariumOxide = builderISG("samarium_oxide")
        .dust()
        .color(GTMaterials.Samarium.getMaterialRGB())
        .iconSet(GTMaterials.Samarium.getMaterialIconSet())
        .buildAndRegister()
        .setFormula("Sm2O3", true);

    TerbiumOxide = builderISG("terbium_oxide")
        .dust()
        .color(GTMaterials.Terbium.getMaterialRGB())
        .iconSet(GTMaterials.Terbium.getMaterialIconSet())
        .buildAndRegister()
        .setFormula("Tb2O3", true);

    DysprosiumOxide = builderISG("dysprosium_oxide")
        .dust()
        .color(GTMaterials.Dysprosium.getMaterialRGB())
        .iconSet(GTMaterials.Dysprosium.getMaterialIconSet())
        .buildAndRegister()
        .setFormula("Dy2O3");

    HolmiumOxide = builderISG("holmium_oxide")
        .dust()
        .color(GTMaterials.Holmium.getMaterialRGB())
        .iconSet(GTMaterials.Holmium.getMaterialIconSet())
        .buildAndRegister()
        .setFormula("Ho2O3", true);

    ErbiumOxide = builderISG("erbium_oxide")
        .dust()
        .color(GTMaterials.Erbium.getMaterialRGB())
        .iconSet(GTMaterials.Erbium.getMaterialIconSet())
        .buildAndRegister()
        .setFormula("Er2O3", true);

    ThuliumOxide = builderISG("thulium_oxide")
        .dust()
        .color(GTMaterials.Thulium.getMaterialRGB())
        .iconSet(GTMaterials.Thulium.getMaterialIconSet())
        .buildAndRegister()
        .setFormula("Tm2O3", true);

    YtterbiumOxide = builderISG("ytterbium_oxide")
        .dust()
        .color(GTMaterials.Ytterbium.getMaterialRGB())
        .iconSet(GTMaterials.Ytterbium.getMaterialIconSet())
        .buildAndRegister()
        .setFormula("Yb2O3", true);

    LutetiumOxide = builderISG("lutetium_oxide")
        .dust()
        .color(GTMaterials.Lutetium.getMaterialRGB())
        .iconSet(GTMaterials.Lutetium.getMaterialIconSet())
        .buildAndRegister()
        .setFormula("Lu2O3", true);

    ScandiumOxide = builderISG("scandium_oxide")
        .dust()
        .color(GTMaterials.Scandium.getMaterialRGB())
        .iconSet(GTMaterials.Scandium.getMaterialIconSet())
        .buildAndRegister()
        .setFormula("Sc2O3", true);

    Radox = builderISG("radox")
        .polymer()
        .fluid()
        .components(Carbon, 14, Osmium, 11, Oxygen, 7, Silver, 3, Concrete, 1, Water, 1)
        .color(0x680064)
        .iconSet(DULL)
        .flags(GENERATE_FOIL, GENERATE_PLATE, DISABLE_DECOMPOSITION)
        .buildAndRegister();

  }
}
