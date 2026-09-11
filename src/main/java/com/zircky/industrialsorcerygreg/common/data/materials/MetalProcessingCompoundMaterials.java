package com.zircky.industrialsorcerygreg.common.data.materials;

import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;
import com.gregtechceu.gtceu.api.fluids.FluidBuilder;
import com.gregtechceu.gtceu.api.fluids.attribute.FluidAttributes;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.zircky.industrialsorcerygreg.api.data.material.ISGMaterialFlags;
import com.zircky.industrialsorcerygreg.common.data.ISGMaterials;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.utils.register.MaterialsRegisterUtils.material;


final class MetalProcessingCompoundMaterials {
  private MetalProcessingCompoundMaterials() {
  }

  static void register() {
    ZirconiumTetrachloride = builderISG("zirconium_tetrachloride")
        .dust()
        .color(0xF0F0F0)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("ZrCl4", true);

    SiliconCarbide = builderISG("silicon_carbide")
        .dust()
        .color((GTMaterials.Silicon.getMaterialRGB() + GTMaterials.Carbon.getMaterialRGB()) / 2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("SiC");

    GoldDepleteMolybdenite = builderISG("gold_deplete_molybdenite")
        .dust()
        .color(0x7c7c8f)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("MoS2?", true);

    MolybdenumConcentrate = builderISG("molybdenum_concentrate")
        .dust()
        .color(0x565666)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("MoS2Re", true);

    MolybdenumTrioxide = builderISG("molybdenum_trioxide")
        .dust()
        .color(0x666685)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("MoO3", true);

    CopperChloride = builderISG("copper_chloride")
        .dust()
        .color(0xf5b35d)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("CuCl2", true);

    BismuthChloride = builderISG("bismuth_chloride")
        .dust()
        .color(0x95f5d7)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("BiCl3", true);

    LeadChloride = builderISG("lead_chloride")
        .dust()
        .color((GTMaterials.Lead.getMaterialRGB() + GTMaterials.Chlorine.getMaterialRGB()) / 2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("PbCl2", true);

    ZirconiumTetrafluoride = builderISG("zirconium_tetrafluoride")
        .dust()
        .color((GTMaterials.Zirconium.getMaterialRGB() + GTMaterials.Fluorine.getMaterialRGB()) / 2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("ZrF4", true);

    BariumDifluoride = builderISG("barium_difluoride")
        .dust()
        .color((GTMaterials.Barium.getMaterialRGB() + GTMaterials.Fluorine.getMaterialRGB()) / 2)
        .iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("BaF2", true);

    LanthanumTrifluoride = builderISG("lanthanum_trifluoride")
        .dust()
        .color((GTMaterials.Lanthanum.getMaterialRGB() + GTMaterials.Fluorine.getMaterialRGB()) / 2)
        .iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("LaF3", true);

    AluminiumTrifluoride = builderISG("aluminium_trifluoride")
        .dust()
        .color((GTMaterials.Aluminium.getMaterialRGB() + GTMaterials.Fluorine.getMaterialRGB()) / 2)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("AlF3", true);

    ErbiumTrifluoride = builderISG("erbium_trifluoride")
        .dust()
        .color((GTMaterials.Erbium.getMaterialRGB() + GTMaterials.Fluorine.getMaterialRGB()) / 2)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("ErF3", true);

    ZBLAN = builderISG("zblan")
        .ingot().fluid()
        .color((ZirconiumTetrafluoride.getMaterialRGB() + BariumDifluoride.getMaterialRGB() + LanthanumTrifluoride.getMaterialRGB() + AluminiumTrifluoride.getMaterialRGB()) / 4)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("(ZrF4)18(BaF2)7(LaF3)2(AlF3)(NaF)7", true);

    ErbiumDopedZBLAN = builderISG("erbium_doped_zblan")
        .dust()
        .color((ZBLAN.getMaterialRGB() + ErbiumTrifluoride.getMaterialRGB()) / 2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("(ErF3)(ZrF4)18(BaF2)7(LaF3)2(AlF3)(NaF)7");

    SuccinicAcid = builderISG("succinic_acid")
        .dust().liquid(new FluidBuilder().attribute(FluidAttributes.ACID))
        .color((MaleicAnhydride.getMaterialRGB() + GTMaterials.Water.getMaterialRGB() + GTMaterials.Hydrogen.getMaterialRGB()) / 3)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("C4H6O4", true);

    Succinimide = builderISG("succinimide")
        .dust()
        .color((SuccinicAcid.getMaterialRGB() + GTMaterials.Ammonia.getMaterialRGB()) / 2)
        .iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("C4H5NO2", true);

    Bromosuccinimide = builderISG("bromo_succinimide")
        .dust()
        .color((Succinimide.getMaterialRGB() + GTMaterials.Bromine.getMaterialRGB()) / 2)
        .iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("C4H4BrNO2", true);

    Benzophenanthrenylacetonitrile = builderISG("benzophenanthrenylacetonitrile")
        .dust()
        .color((Naphthaldehyde.getMaterialRGB() + GTMaterials.Ethylene.getMaterialRGB() - 20) / 2)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("C20H13N", true);

    UnfoldedFullerene = builderISG("unfolded_fullerene")
        .dust()
        .color((Benzophenanthrenylacetonitrile.getMaterialRGB() + GTMaterials.Oxygen.getMaterialRGB()) / 2)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C60H30", true);

    Fullerene = builderISG("fullerene")
        .dust()
        .color((UnfoldedFullerene.getMaterialRGB() - 20))
        .iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("C60", true);

    TiAlChloride = builderISG("tial_chloride")
        .langValue("TiAl Chloride")
        .dust()
        .color((GTMaterials.Titanium.getMaterialRGB() + GTMaterials.Aluminium.getMaterialRGB() + GTMaterials.Chlorine.getMaterialRGB()) / 3)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("TiAlCl7", true);

    Dimethylaminopyridine = builderISG("Dimethylamino")
        .langValue("Dimethylamino [DMAP]")
        .dust()
        .color((GTMaterials.Dimethylamine.getMaterialRGB() + Pyridine.getMaterialRGB()) / 2)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("(CH3)2NC5H4N", true);

    PdIrReOCeOsSiCatalyst = material("pd_ir_re_o_ce_os_si", "PdIrReOCeOsSi")
        .dust()
        .color((GTMaterials.Palladium.getMaterialRGB() + GTMaterials.Iridium.getMaterialRGB() + GTMaterials.Rhenium.getMaterialRGB() + GTMaterials.Cerium.getMaterialRGB() + GTMaterials.Osmium.getMaterialRGB() + GTMaterials.Silicon.getMaterialRGB() + GTMaterials.Oxygen.getMaterialRGB()) / 7)
        .iconSet(DULL)
        .flags(ISGMaterialFlags.GENERATE_CATALYST)
        .buildAndRegister()
        .setFormula("PdIrReCeOsSiO4", true);

    SodiumEthoxide = builderISG("sodium_ethoxide")
        .dust()
        .color((GTMaterials.Ethanol.getMaterialRGB() + GTMaterials.SodiumHydroxide.getMaterialRGB()) / 2)
        .iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("C2H5ONa", true);

    MgClBromide = builderISG("mgcl_bromide")
        .langValue("Magnesium Chloride Bromide")
        .dust()
        .color((GTMaterials.MagnesiumChloride.getMaterialRGB() + GTMaterials.Bromine.getMaterialRGB()) / 2)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("MgClBr");

    Sarcosine = builderISG("sarcosine")
        .dust()
        .color((Glycine.getMaterialRGB() + GTMaterials.Oxygen.getMaterialRGB()) / 2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("C3H7NO2", true);

    ZnFeAlClCatalyst = builderISG("znfealcl")
        .dust()
        .color((GTMaterials.Zinc.getMaterialRGB() + GTMaterials.Iron.getMaterialRGB() + GTMaterials.Aluminium.getMaterialRGB() + GTMaterials.Chlorine.getMaterialRGB()) / 4)
        .iconSet(DULL)
        .flags(ISGMaterialFlags.GENERATE_CATALYST)
        .buildAndRegister();

    Difluorobenzophenone = builderISG("difluorobenzophenone")
        .dust()
        .color((FluoroBenzene.getMaterialRGB() + Fluorotoluene.getMaterialRGB()) / 2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("(FC6H4)2CO", true);

    AluminiumChloride = builderISG("aluminium_chloride")
        .dust()
        .color((GTMaterials.Aluminium.getMaterialRGB() + GTMaterials.Chlorine.getMaterialRGB()) / 2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("AlCl3", true);

    PdFullereneMatrix = builderISG("palladium_fullerene_matrix")
        .dust()
        .color((GTMaterials.Palladium.getMaterialRGB() + Fullerene.getMaterialRGB()) / 2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("PdC73H15NFe", true);

    Terephthalaldehyde = builderISG("terephthalaldehyde")
        .dust()
        .color((Dibromomethylbenzene.getMaterialRGB() + GTMaterials.SulfuricAcid.getMaterialRGB()) / 2)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("C8H6O2", true);

    PreZylon = builderISG("pre_zylon")
        .dust()
        .color((Terephthalaldehyde.getMaterialRGB() + Dinitrodipropanyloxybenzene.getMaterialRGB()) / 2)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("C20H22N2O2", true);

    AuPdCCatalyst = material("aupdc", "AuPdC")
        .dust()
        .color((GTMaterials.Gold.getMaterialRGB() + GTMaterials.Palladium.getMaterialRGB() + GTMaterials.Carbon.getMaterialRGB()) / 3)
        .iconSet(DULL)
        .flags(ISGMaterialFlags.GENERATE_CATALYST)
        .buildAndRegister()
        .setFormula("AuPdC");

    Cyanonaphthalene = builderISG("cyanonaphthalene")
        .dust()
        .color((SodiumCyanide.getMaterialRGB() + GTMaterials.Naphthalene.getMaterialRGB()) / 2)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("C11H7N", true);

    TinChloride = builderISG("tin_chloride")
        .dust()
        .color((GTMaterials.Tin.getMaterialRGB() + GTMaterials.Chlorine.getMaterialRGB()) / 2)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("SnCl2", true);

    Triphenylphosphine = builderISG("triphenylphosphine")
        .dust()
        .color((GTMaterials.Chlorobenzene.getMaterialRGB() + PhosphorusTrichloride.getMaterialRGB()) / 2)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("(C6H5)3P", true);

    Methylbenzophenanthrene = builderISG("methylbenzophenanthrene")
        .dust()
        .color((Naphthaldehyde.getMaterialRGB() + Ethylbenzene.getMaterialRGB()) / 2)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("C19H14", true);

    VanadiumSlag = builderISG("vanadium_slag")
        .dust()
        .color((GTMaterials.Vanadium.getMaterialRGB() + GTMaterials.Titanium.getMaterialRGB()) / 2)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("(VO)C(TiO2)", true);

    SodiumVanadate = builderISG("sodium_vanadate")
        .dust()
        .color(0xf2df1d)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Na3VO4", true);

    AmmoniumVanadate = builderISG("ammonium_vanadate")
        .dust()
        .color(0xf2ff1c)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("NH4VO3", true);

    VanadiumOxide = builderISG("vanadium_oxide")
        .dust()
        .color(0xf2ef1b)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("V2O5", true);

    BariumCarbonate = builderISG("barium_carbonate")
        .dust()
        .color(GTMaterials.Salt.getMaterialRGB() + 10)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("BaCO3", true);

    BariumOxide = builderISG("barium_oxide")
        .dust()
        .color((GTMaterials.Barium.getMaterialRGB() + GTMaterials.Oxygen.getMaterialRGB()) / 2)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("BaO");

    BariumAluminate = builderISG("barium_aluminate")
        .dust()
        .color(GTMaterials.Saltpeter.getMaterialRGB() + 10)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("BaAl2O4", true);

    PotassiumUranylTricarbonate = builderISG("potassium_uranyl_carbonate")
        .dust()
        .color(0xeff028)
        .iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("(UO2)CO3", true);

    UraniumPeroxideThoriumOxide = builderISG("uranium_peroxide_thorium_oxide")
        .dust()
        .color(0x202020)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("(UO3)(H2O2)ThO2", true);

    UraniumThoriumOxide = builderISG("uranium_thorium_oxide")
        .dust()
        .color(0x202020)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("UO2ThO2", true);

    UranylThoriumSulfate = builderISG("uranium_thorium_sulfate")
        .dust()
        .color(0xe7e848)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("(UO2)SO4ThO2", true);

    UranylThoriumNitrate = builderISG("uranium_thorium_nitrate")
        .dust()
        .color(0xe7e848)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("UO2(NO3)2Th(NO3)4", true);

    UraniumOxideThoriumNitrate = builderISG("uranium_oxide_thorium_nitrate")
        .dust()
        .color(0x33bd45)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("UO2Th(NO3)4", true);

    CaesiumHydroxide = builderISG("caesium_hydroxide")
        .dust()
        .color(GTMaterials.Caesium.getMaterialRGB() - 10)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("CsOH");

    AluminiumHydroxide = builderISG("aluminium_hydroxide")
        .dust()
        .color(GTMaterials.Aluminium.getMaterialRGB() - 25)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("Al(OH)3", true);

    GrapheneOxidationResidue = builderISG("graphene_oxidation_residue")
        .dust()
        .color(0x96821a)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("(KMnO4)(NaNO3)(H2SO4)", true);

    NiAlOCatalyst = material("nickel_oxide_alumina")
        .dust()
        .color(0x0af0af)
        .iconSet(DULL)
        .flags(ISGMaterialFlags.GENERATE_CATALYST)
        .buildAndRegister()
        .setFormula("NiAl2O4", true);

    FeCrOCatalyst = material("fe_cr_o", "Iron Chromium Oxide")
        .dust()
        .color(0x8C4517)
        .iconSet(SHINY)
        .flags(ISGMaterialFlags.GENERATE_CATALYST)
        .buildAndRegister()
        .setFormula("FeCrO3", true);

    RoastedSpodumene = builderISG("roasted_spodumene")
        .dust()
        .color(0x3d3d29)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("LiAlSi2O6", true);

    RoastedLepidolite = builderISG("roasted_lepidolite")
        .dust()
        .color(0x470024)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("KLi3Al4O11", true);

    Lithiumthiinediselenide = builderISG("lithiumthiinediselenide")
        .dust()
        .color(0x7ada00)
        .iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("C4H4S2Li2Se2", true);

    NickelChloride = builderISG("nickel_chloride")
        .dust()
        .color(GTMaterials.Nickel.getMaterialRGB() + 10)
        .iconSet(ROUGH)
        .components(Nickel, 1, Chlorine, 2)
        .flags(MaterialFlags.DECOMPOSITION_BY_ELECTROLYZING)
        .buildAndRegister()
        .setFormula("NiCl2", true);

    AluminiumSulfate = builderISG("aluminium_sulfate")
        .dust()
        .color((GTMaterials.Aluminium.getMaterialRGB() + GTMaterials.Sulfur.getMaterialRGB()) / 2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Al2(SO4)3", true);

    BariumHydroxide = builderISG("barium_hydroxide")
        .dust()
        .color((GTMaterials.Barium.getMaterialRGB() + GTMaterials.Hydrogen.getMaterialRGB() + GTMaterials.Oxygen.getMaterialRGB()) / 3)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("Ba(OH)2", true);

    HafniumOxide = builderISG("hafnium_oxide")
        .dust()
        .color(0x404040)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("HfO2", true);

    SiliconChloride = builderISG("silicon_chloride")
        .dust()
        .color(GTMaterials.Silicon.getMaterialRGB() - 15)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("SiCl4", true);

    HafniumChloride = builderISG("hafnium_chloride")
        .dust()
        .color(GTMaterials.Hafnium.getMaterialRGB() + 20)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("HfCl4", true);

    ZincCokePellets = builderISG("zinc_coke_pellets")
        .dust()
        .color((GTMaterials.Zinc.getMaterialRGB() + GTMaterials.Coke.getMaterialRGB()) / 2)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("(H2O)(ZnS)C", true);

    ZincResidualSlag = builderISG("zinc_residual_slag")
        .dust()
        .color((GTMaterials.Zinc.getMaterialRGB() - 20))
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("?");

    ZincFlue = builderISG("zinc_flue")
        .dust()
        .color(0xfcfca)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("?");

    ZincLeachingResidue = builderISG("zinc_leaching_residue")
        .dust()
        .color((GTMaterials.Germanium.getMaterialRGB() + GTMaterials.Oxygen.getMaterialRGB()) / 2)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("Ge?");

    FineZincSlag = builderISG("fine_zinc_slag")
        .dust()
        .color((GTMaterials.Zinc.getMaterialRGB() - 10))
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("?");

    IndiumHydroxide = builderISG("indium_hydroxide")
        .dust()
        .color((GTMaterials.Indium.getMaterialRGB() + GTMaterials.SodiumHydroxide.getMaterialRGB()) / 2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("In(OH)3", true);

    CadmiumZinc = builderISG("cadmium_zinc")
        .dust()
        .color((GTMaterials.Cadmium.getMaterialRGB() + GTMaterials.Zinc.getMaterialRGB()) / 2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("(H2SO4)CdZn?", true);

    ThalliumResidue = builderISG("thallium_residue")
        .dust()
        .color((GTMaterials.Thallium.getMaterialRGB() - 10))
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Tl?");

    ThalliumChloride = builderISG("thallium_chloride")
        .dust()
        .color((GTMaterials.Thallium.getMaterialRGB() + GTMaterials.Chlorine.getMaterialRGB()) / 2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("TlCl");

    ZincChloride = builderISG("zinc_chloride")
        .dust()
        .color((GTMaterials.Zinc.getMaterialRGB() + GTMaterials.Chlorine.getMaterialRGB()) / 2)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("ZnCl2", true);

    SodiumSulfite = builderISG("sodium_sulfite")
        .dust()
        .color((GTMaterials.SodiumHydroxide.getMaterialRGB() + GTMaterials.Sulfur.getMaterialRGB()) / 2)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("Na2SO3", true);

    Cellulose = builderISG("cellulose")
        .dust()
        .color((0xfefefc))
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C6H10O5", true);

    GermaniumOxide = builderISG("germanium_oxide")
        .dust()
        .color((GTMaterials.Germanium.getMaterialRGB() + 10))
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("GeO2", true);

    DisodiumPhosphate = builderISG("sodium_diphosphate")
        .dust()
        .color((GTMaterials.Sodium.getMaterialRGB() + GTMaterials.Phosphorus.getMaterialRGB()) / 2)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Na2HPO4", true);

    AcrylicFibers = builderISG("acrylic_fibers")
        .dust()
        .color(0xfdfdfb)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("(C5O2H8)n", true);

    UranylNitrate = builderISG("uranyl_nitrate")
        .dust()
        .color(0x33bd45)
        .iconSet(SHINY)
        .buildAndRegister();

    CalciumSalts = builderISG("calcium_salts")
        .dust()
        .color(GTMaterials.Calcium.getMaterialRGB() - 10)
        .iconSet(ROUGH)
        .components(GTMaterials.Calcite, 1, GTMaterials.Gypsum, 1)
        .buildAndRegister();

    SodiumSalts = builderISG("sodium_salts")
        .dust()
        .color(GTMaterials.Sodium.getMaterialRGB() - 5)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("NaCl?");

    PotassiumMagnesiumSalts = builderISG("potassium_magnesium_salts")
        .dust()
        .color(0xcacac8)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("KClMgSO4K2SO4KF", true);

    CalciumMagnesiumSalts = builderISG("calcium_magnesium_salts")
        .dust()
        .color(0xcacac8)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("CaCO3(SrCO3)(CO2)MgO", true);

    SodiumAluminiumHydride = builderISG("sodium_aluminium_hydride")
        .dust()
        .color(0x98cafc)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("NaAlH4", true);

    LithiumAluminiumHydride = builderISG("lithium_aluminium_hydride")
        .dust()
        .color(0xc0defc)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("LiAlH4", true);

    SodiumAzanide = builderISG("sodium_azanide")
        .dust()
        .color((GTMaterials.Sodium.getMaterialRGB() + GTMaterials.Hydrogen.getMaterialRGB() + GTMaterials.Nitrogen.getMaterialRGB()) / 3)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("NaNH2", true);

    SodiumAzide = builderISG("sodium_azide")
        .dust()
        .color((GTMaterials.Sodium.getMaterialRGB() + GTMaterials.Nitrogen.getMaterialRGB()) / 2)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("NaN3", true);

    Glucosamine = builderISG("glucosamine")
        .dust()
        .color((Cellulose.getMaterialRGB() + GTMaterials.Water.getMaterialRGB()) / 2)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("C6H13NO5", true);

    AluminiumHydride = builderISG("aluminium_hydride")
        .dust()
        .color(0x0b585c)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("AlH3", true);

    SodiumHydride = builderISG("sodium_hydride")
        .dust()
        .color(0xcacac8)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("NaH");

    DehydrogenationCatalyst = builderISG("dehydrogenation")
        .dust()
        .color(0x6464f5)
        .iconSet(DULL)
        .flags(ISGMaterialFlags.GENERATE_CATALYST)
        .buildAndRegister()
        .setFormula("?");

    PolystyreneNanoParticles = builderISG("polystryrene_nanoparticles")
        .dust()
        .color(0x888079)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("(C8H8)n", true);

    MagnesiumSulfate = builderISG("magnesium_sulfate")
        .dust()
        .color(0xcacac8)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("MgSO4", true);

    SodiumMolybdate = builderISG("sodium_molybdate")
        .dust()
        .color(0xfcfc00)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Na2MoO4", true);

    SodiumPhosphomolybdate = builderISG("sodium_phosphomolybdate")
        .dust()
        .color(0xfcfc00)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("(MoO3)12Na3PO4", true);

    SodiumPhosphotungstate = builderISG("sodium_phosphotungstate")
        .dust()
        .color(0x7a7777)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("(WO3)12Na3PO4", true);

    Fructose = builderISG("fructose")
        .dust()
        .color((Cellulose.getMaterialRGB() + GTMaterials.Sugar.getMaterialRGB()) / 2)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("C6H12O6", true);

    Glucose = builderISG("glucose")
        .dust()
        .color((GTMaterials.Sugar.getMaterialRGB() + 5))
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("C6H12O6", true);

    LeadNitrateCalciumMixture = builderISG("lead_nitrate_calcium_mixture")
        .dust()
        .color((ISGMaterials.LeadNitrate.getMaterialRGB() + GTMaterials.Calcium.getMaterialRGB()) / 2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("(Pb(NO3)2)Ca9", true);

    StrontiumOxide = builderISG("strontium_oxide")
        .dust()
        .color(0xcacac8)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("SrO");

    Diiodobiphenyl = builderISG("diiodobiphenyl")
        .dust()
        .color(0x000f66)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("C12H8I2", true);

    Bipyridine = builderISG("bipyridine")
        .dust()
        .color(0X978662)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("C10H8N2", true);

    PalladiumChloride = builderISG("palladium_chloride")
        .dust()
        .color(0xb9c0c7)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("PdCl2", true);

    PalladiumBisDibenzylidieneacetone = builderISG("palladium_bisdibenzylidieneacetone")
        .dust()
        .color(0Xbe81a0)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("C51H42O3Pd2", true);

    PotassiumTetrachloroplatinate = builderISG("potassium_tetrachloroplatinate")
        .dust()
        .color(0xffba54)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("K2PtCl4", true);

    NickelTriphenylPhosphite = builderISG("nickel_triphenyl_phosphite")
        .dust()
        .color(0xd9d973)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("C36H30Cl2NiP2", true);

    Dichlorocycloctadieneplatinium = builderISG("dichlorocyclooctadieneplatinium")
        .dust()
        .color(0xe0f78a)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("C8H12Cl2Pt", true);

    GrapheneNanotubeMix = builderISG("graphene_nanotube_mix")
        .dust()
        .color(0x2c2c2c)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("(C)C?");

    GrapheneAlignedCNT = builderISG("graphene_aligned_cnt")
        .dust()
        .color(0x2c2c2c)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("(C)C30H20", true);

    NiAlCatalyst = builderISG("nickel_aluminium")
        .dust()
        .color(0x6ea2ff)
        .iconSet(DULL)
        .flags(ISGMaterialFlags.GENERATE_CATALYST)
        .buildAndRegister()
        .setFormula("NiAl");

    TitaniumNitrate = builderISG("titanium_nitrate")
        .dust()
        .color(0xFF0066)
        .iconSet(FINE)
        .buildAndRegister();

    SilverNitrate = builderISG("silver_nitrate")
        .dust()
        .color(0xfdfdca)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("AgNO3", true);

    AnodicSlime = builderISG("anodic_slime")
        .dust()
        .color(0x765A30)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("SeTe??");

    TelluriumOxide = builderISG("tellurium_oxide")
        .dust()
        .color(0xFFFF66)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("TeO2", true);

    SeleniumOxide = builderISG("selenium_oxide")
        .dust()
        .color(0xFFFF66)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("SeO2", true);

    ManganeseSulfate = builderISG("manganese_sulfate")
        .dust()
        .color((GTMaterials.Manganese.getMaterialRGB() + GTMaterials.Sulfur.getMaterialRGB()) / 2)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("MnSO4", true);

    TinSlag = builderISG("tin_slag")
        .dust()
        .color(0xc8b9a9)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("NbTa?");

    NbTaContaining = builderISG("nbta_containing")
        .langValue("Niobium-Tantalum Containing")
        .dust()
        .color(0xc8b9a9)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("NbTa");

    NiobiumTantalumOxide = builderISG("niobium_tantalum_oxide")
        .dust()
        .color((GTMaterials.Niobium.getMaterialRGB() + GTMaterials.Tantalum.getMaterialRGB()) / 2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("(Nb2O5)(Ta2O5)", true);

    FusedColumbite = builderISG("fused_columbite")
        .dust()
        .color(0xCCCC00)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("(Fe2O3)(NaO)Nb2O5", true);

    LeachedColumbite = builderISG("leached_columbite")
        .dust()
        .color(0xCCCC00)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("(Nb2O5)9Ta2O5?", true);

    FusedTantalite = builderISG("fused_tantalite")
        .dust()
        .color(0x915028)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("(Fe2O3)(NaO)Ta2O5", true);

    LeachedTantalite = builderISG("leached_tantalite")
        .dust()
        .color(0x915028)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("(Ta2O5)9Nb2O5?", true);

    ColumbiteMinorOxideResidue = builderISG("columbite_minor_oxide_residue")
        .dust()
        .color(0x915028)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("(BaO)(SnO2)(WO3)(Al2O3)", true);

    TantaliteMinorOxideResidue = builderISG("tantalite_minor_oxide_residue")
        .dust()
        .color(0xCCCC00)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("(BaO)(ZrO2)(TiO2)(SiO2)", true);

    LeachedPyrochlore = builderISG("leached_pyrochlore")
        .dust()
        .color(0x996633)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("(Nb2O5)9Ta2O5?", true);

    AcidicLeachedPyrochlore = builderISG("acidic_leached_pyrochlore")
        .dust()
        .color(0x996633)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("(H2SO4)Ca12Sr6Ba6?ThUNb26O78F26", true);

    PotasssiumFluoroNiobate = builderISG("potassium_fluoroniobate")
        .dust()
        .color(0x73ff00)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("K2NbF7", true);

    PotasssiumFluoroTantalate = builderISG("potassium_fluorotantalate")
        .dust()
        .color(0x73ff00)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("K2TaF7", true);

    BariumPeroxide = builderISG("barium_peroxide")
        .dust()
        .color((GTMaterials.Barium.getMaterialRGB() + GTMaterials.Oxygen.getMaterialRGB() - 30) / 2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("BaO2", true);

    CassiteriteCokePellets = builderISG("cassiterite_coke_pellets")
        .dust()
        .color(0x8f8f8f)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("SnO2C?", true);

    IronSulfate = builderISG("iron_sulfate")
        .dust()
        .color((GTMaterials.Iron.getMaterialRGB() + GTMaterials.Sulfur.getMaterialRGB()) / 2)
        .iconSet(DULL)
        .flags(ISGMaterialFlags.GENERATE_CATALYST)
        .buildAndRegister()
        .setFormula("FeSO4", true);

    StrontiumCarbonate = builderISG("strontium_carbonate")
        .dust()
        .color(0xcacac8)
        .iconSet(ROUGH)
        .buildAndRegister();

    SodiumChlorate = builderISG("sodium_chlorate")
        .dust()
        .color(GTMaterials.Salt.getMaterialRGB())
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("NaClO3", true);

    SodiumHypochlorite = builderISG("sodium_hypochlorite")
        .dust()
        .color(0x6cff50)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("NaClO");

    DehydratedLignite = builderISG("dehydrated_lignite")
        .dust()
        .color(0x5c4020)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C2(H2O)4C?", true);

    BCEPellet = builderISG("bce_pellet")
        .dust()
        .color(0x3c3020)
        .iconSet(LIGNITE)
        .buildAndRegister()
        .setFormula("C2(H2O)4C", true);

    CopperGalliumIndiumMix = builderISG("copper_gallium_indium_mix")
        .dust()
        .color((GTMaterials.Indium.getMaterialRGB() + GTMaterials.Copper.getMaterialRGB() + GTMaterials.Gallium.getMaterialRGB()) / 3)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("CuGaIn");

    CopperGalliumIndiumSelenide = builderISG("copper_gallium_indium_selenide")
        .dust()
        .color((CopperGalliumIndiumMix.getMaterialRGB() + GTMaterials.Selenium.getMaterialRGB()) / 2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("CuGaInSe2", true);

    LanthanumCalciumManganate = builderISG("lanthanum_gallium_manganate")
        .dust()
        .color(0x8aa07b)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("LaCaMnO3", true);

    AluminiumComplex = builderISG("aluminium_complex")
        .dust()
        .color(0x3f5a9f)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("AlC9H7NO", true);

    IronPlatinumCatalyst = builderISG("iron_platinum")
        .dust()
        .color(GTMaterials.Iron.getMaterialRGB() / 2 + GTMaterials.Platinum.getMaterialRGB() / 2)
        .iconSet(DULL)
        .flags(ISGMaterialFlags.GENERATE_CATALYST)
        .buildAndRegister()
        .setFormula("FePt");

    YttriumNitrate = builderISG("yttrium_nitrate")
        .dust()
        .color(0xdadafc)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Y(NO3)3", true);

    CopperNitrate = builderISG("copper_nitrate")
        .dust()
        .color(0xcaecec)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Cu(NO3)2", true);

    BariumNitrate = builderISG("barium_nitrate")
        .dust()
        .color((GTMaterials.Barium.getMaterialRGB() + GTMaterials.NitricAcid.getMaterialRGB()) / 2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Ba(NO3)2", true);

    Piezoelectric = material("piezoelectric")
        .gem()
        .color(0xF5F5DC)
        .iconSet(GEM_HORIZONTAL)
        .buildAndRegister();

  }
}
