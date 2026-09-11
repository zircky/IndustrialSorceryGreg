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
import static com.gregtechceu.gtceu.common.data.GTMaterials.Concrete;
import static com.gregtechceu.gtceu.common.data.GTMaterials.Gold;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.SNDART_FLAGS;
import static com.zircky.industrialsorcerygreg.common.data.materials.ISGMaterialIconSet.CHAOS;
import static com.zircky.industrialsorcerygreg.common.data.materials.ISGMaterialIconSet.INFINITY;
import static com.zircky.industrialsorcerygreg.utils.register.MaterialsRegisterUtils.material;


public final class IndustrialProcessMaterials {
  private IndustrialProcessMaterials() {
  }

  public static void register() {
    LinoleicAcid = builderISG("linoleic_acid")
        .liquid(new FluidBuilder().attribute(FluidAttributes.ACID))
        .color(0xD5D257)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C18H32O2", true);

    SiliconFluoride = builderISG("silicon_fluoride")
        .fluid()
        .color(0xB2B4B4)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("SiF4", true);

    CarbonFluoride = builderISG("carbone_fluoride")
        .fluid()
        .color(0xE6E6E6)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("CF4", true);

    PhosphorusTrichloride = builderISG("phosphorus_trichloride")
        .fluid()
        .color((GTMaterials.Phosphorus.getMaterialRGB() + GTMaterials.Chlorine.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("PCl3", true);

    PhosphorylChloride = builderISG("phosphoryl_chloride")
        .fluid()
        .color(0xE6E6E6)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("POCl3", true);

    TributylPhosphate = builderISG("tributyl_phosphate")
        .fluid()
        .color(0x7C5B2C)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(C4H9)3PO4", true);

    Butanol = builderISG("butanol")
        .fluid()
        .color((GTMaterials.FermentedBiomass.getMaterialRGB() + 20))
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C4H9OH", true);

    RedOil = builderISG("red_oil")
        .fluid()
        .color(0x7C1500)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2N4(RP-1)NiZnFe4", true);

    SodiumCyanide = builderISG("sodium_cyanide")
        .fluid()
        .color(0x5f7c8c)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("NaCN");

    GoldCyanide = builderISG("gold_cyanide")
        .fluid()
        .color(0x8c8761)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("AuCN");

    ChlorideLeachedSolution = builderISG("chloride_leached_solution")
        .fluid()
        .color(0x41472e)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("CaCl2(CuCl2)(PbCl2)(BiCl3)(FeCl2)", true);

    MolybdenumFlue = builderISG("molybdenum_flue_gas")
        .fluid()
        .color(0x333338)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2OReS?", true);

    RheniumSulfuricSolution = builderISG("rhenium_sulfuric_solution")
        .fluid()
        .color(0xbabaff)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("ReS?");

    AmmoniumSulfate = builderISG("ammonium_sulfate")
        .fluid()
        .color(0x6464f5)
        .iconSet(FLUID)
        .buildAndRegister();

    AmmoniumPerrhenate = builderISG("ammonium_perrhenate")
        .fluid()
        .color(0x1c1c45)
        .iconSet(FLUID)
        .buildAndRegister();

    ElectronDegenerateRhenium = builderISG("degenerate_rhenium")
        .plasma().ingot()
        .color(0x6666FF)
        .iconSet(FLUID)
        .flags(GENERATE_PLATE)
        .buildAndRegister()
        .setFormula("Rh");

    BoricAcid = builderISG("boric_acid")
        .liquid(new FluidBuilder().attribute(FluidAttributes.ACID))
        .color(0xD5D2D7)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H3BO3", true);

    FluoroBoricAcid = builderISG("fluoroboric_acid")
        .liquid(new FluidBuilder().attribute(FluidAttributes.ACID))
        .color(0xD5D2D7)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("HBF4", true);

    BenzenediazoniumTetrafluoroborate = builderISG("benzenediazonium_tetrafluoroborate")
        .fluid()
        .color(0xD5D2D7)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6H5BF4N2", true);

    BoronFluoride = builderISG("boron_fluoride")
        .fluid()
        .color(0xD5D2D7)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("BF3", true);

    FluoroBenzene = builderISG("fluoro_benzene")
        .fluid()
        .color(0xD5D2D7)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6H5F", true);

    SodiumNitrateSolution = builderISG("sodium_nitrate_solution")
        .fluid()
        .color(0xA09ED7)
        .iconSet(FLUID)
        .buildAndRegister();

    Fluorotoluene = builderISG("fluorotoluene")
        .fluid()
        .color(0xE0DA99)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C7H7F", true);

    OrthoXylene = builderISG("ortho_xylene")
        .fluid()
        .color(0xB9575E)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6H4(CH3)2", true);

    OrthoXyleneZeoliteMixture = builderISG("ortho_xylene_zeolite_mixture")
        .fluid()
        .color(0xB9785E)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(NaC4Si27Al9(H2O)28O72)C6H4(CH3)2", true);

    ParaXylene = builderISG("para_xylene")
        .fluid()
        .color(0xB9575E)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6H4(CH3)2", true);

    Dibromomethylbenzene = builderISG("dibromomethylbenzene")
        .fluid()
        .color(0x0A1D2C)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C7H6Br2", true);

    Isochloropropane = builderISG("isochloropropane")
        .fluid()
        .color(0xD5DD95)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("CH3CClCH3", true);

    Resorcinol = builderISG("resorcinol")
        .fluid()
        .color(0xD5DDBE)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6H6O2", true);

    Dinitrodipropanyloxybenzene = builderISG("dinitrodipropanyloxybenzene")
        .fluid()
        .color(0x83945F)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C12H16O2(NO2)2", true);

    Naphthaldehyde = builderISG("napthaldehyde")
        .fluid()
        .color(0xBCA853)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C10H7CHO", true);

    HydrobromicAcid = builderISG("hydrobromic_acid")
        .liquid(new FluidBuilder().attribute(FluidAttributes.ACID))
        .color(0xBC6C53)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("HBr");

    ThionylChloride = builderISG("thionyl_chloride")
        .fluid()
        .color(0xF9F7E5)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("SOCl2", true);

    Diisopropylcarbodiimide = builderISG("diisopropylcarbodiimide")
        .fluid()
        .color(0xA0CFFE)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C7H14N2", true);

    Pyridine = builderISG("pyridine")
        .fluid()
        .color((GTMaterials.Ammonia.getMaterialRGB() + GTMaterials.Formaldehyde.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C5H5N", true);

    Phenylpentanoicacid = builderISG("phenylpentanoicacid")
        .fluid()
        .color((GTMaterials.Butene.getMaterialRGB() + GTMaterials.CarbonMonoxide.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C11H14O2", true);

    Dimethylsulfide = builderISG("dimethylsulfide")
        .fluid()
        .color((GTMaterials.Methanol.getMaterialRGB() + GTMaterials.HydrogenSulfide.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(CH3)2S", true);

    BenzoylChloride = builderISG("benzoyl_chloride")
        .fluid()
        .color((GTMaterials.Toluene.getMaterialRGB() + ISGMaterials.ThionylChloride.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C7H5ClO", true);

    Silvertetrafluoroborate = builderISG("silvertetrafluoroborate")
        .fluid()
        .color((ISGMaterials.SilverOxide.getMaterialRGB() + ISGMaterials.BoronFluoride.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("AgBF4", true);

    PCBA = material("pcba", "PCBA")
        .fluid()
        .color((GTMaterials.Chlorobenzene.getMaterialRGB() + Dimethylsulfide.getMaterialRGB() + Phenylpentanoicacid.getMaterialRGB()) / 3)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C72H14O2", true);

    PCBS = material("pcbs", "PCBS")
        .fluid()
        .color((GTMaterials.Styrene.getMaterialRGB() + PCBA.getMaterialRGB() - 40) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C80H21O2", true);

    Ferrocene = builderISG("ferrocene")
        .fluid().dust()
        .color((GTMaterials.Water.getMaterialRGB() + GTMaterials.Chlorine.getMaterialRGB() + GTMaterials.Iron.getMaterialRGB()) / 3)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C10H10Fe", true);

    Ferrocenylfulleropyrrolidine = builderISG("ferrocenylfulleropyrddolidine")
        .fluid()
        .color((Ferrocene.getMaterialRGB() + GTMaterials.Ethylene.getMaterialRGB() + GTMaterials.CarbonMonoxide.getMaterialRGB()) / 3)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C74H19FeN", true);

    Hydroquinone = builderISG("hydroquinone")
        .fluid()
        .color((GTMaterials.Oxygen.getMaterialRGB() + GTMaterials.Propene.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6H4(OH)2", true);

    SodiumAcetate = builderISG("sodium_acetate")
        .fluid()
        .color((GTMaterials.Sodium.getMaterialRGB() + GTMaterials.AceticAnhydride.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C2H3NaO2", true);

    Methylamine = builderISG("methylamine")
        .fluid()
        .color((GTMaterials.Methanol.getMaterialRGB() + GTMaterials.Ammonia.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("CH3NH2", true);

    Phosgene = builderISG("phosgene")
        .fluid()
        .color((GTMaterials.Chlorine.getMaterialRGB() + GTMaterials.CarbonMonoxide.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("COCl2", true);

    IsopropylAlcohol = builderISG("isopropyl_alcohol")
        .fluid()
        .color((GTMaterials.Water.getMaterialRGB() + GTMaterials.Propene.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C3H8O", true);

    VanadiumWasteSolution = builderISG("vanadium_waste_solution")
        .fluid()
        .color(0xbf95f5)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("NaCl(Na2SO4)(SiO2)(Al(OH)3)", true);

    UranylChlorideSolution = builderISG("uranyl_chloride_solution")
        .fluid()
        .color(0xdfe018)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("UO2Cl2(H2O)?", true);

    UranylNitrateSolution = builderISG("uranyl_nitrate_solution")
        .fluid()
        .color(0xdfe018)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("UO2(NO3)2(H2O)?]", true);

    UraniumSulfateWasteSolution = builderISG("uranium_sulfate_waste_solution")
        .fluid()
        .color(0xdfe018)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("PbRaSr(H2SO4)", true);

    PurifiedUranylNitrate = builderISG("purified_uranyl_nitrate_solution")
        .fluid()
        .color(0xeff028)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("UO2(NO3)2(H2O)", true);

    UraniumDiuranate = builderISG("uranium_diuranate")
        .fluid()
        .color(0xeff028)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(NH4)2U2O7", true);

    UraniumRefinementWasteSolution = builderISG("uranium_refinement_waste_solution")
        .fluid()
        .color(0xeff028)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2SO4C?", true);

    ThoriumNitrateSolution = builderISG("thorium_nitrate_solution")
        .fluid()
        .color(0x33bd45)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Th(NO3)4(H2O)", true);

    SodiumHexafluoroaluminate = builderISG("sodium_hexafluoroaluminate")
        .fluid()
        .color((GTMaterials.Sodium.getMaterialRGB() + GTMaterials.Aluminium.getMaterialRGB() + GTMaterials.Fluorine.getMaterialRGB()) / 3)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Na3AlF6", true);

    SodiumSulfateSolution = builderISG("sodium_sulfate_solution")
        .fluid()
        .color((ISGMaterials.SodiumSulfate.getMaterialRGB() + 30))
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Na2SO4(H2O) ", true);

    RichNitrogenMix = builderISG("rich_nitrogen_mix")
        .fluid()
        .color(0x6891d8)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2O(CH4)?", true);

    OxidisedNitrogenMix = builderISG("oxidised_nitrogen_mix")
        .fluid()
        .color(0x708ACD)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)2(CH4)??", true);

    PurifiedNitrogenMix = builderISG("purified_nitrogen_mix")
        .fluid()
        .color(0x6891d8)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)2(CH4)?", true);

    CarbonatedEthanolamine = builderISG("carbonated_ethanolamine")
        .fluid()
        .color(0x6f7d87)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2NCH2CH2OHC", true);

    AmmoniaRichMix = builderISG("ammonia_rich_mix")
        .fluid()
        .color(0x2f5d99)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("NH3((H2O)2(CH4)?)", true);

    DissolvedLithiumOre = builderISG("dissolved_lithium_ores")
        .fluid()
        .color(0x664850)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("LiAlO2(H2SO4)", true);

    LithiumCarbonateSolution = builderISG("lithium_carbonate_solution")
        .fluid()
        .color((GTMaterials.Lithium.getMaterialRGB() + GTMaterials.Carbon.getMaterialRGB() + GTMaterials.Oxygen.getMaterialRGB()) / 3)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Li2CO3(H2O)", true);

    LithiumChlorideSolution = builderISG("lithium_chloride_solution")
        .fluid()
        .color((GTMaterials.Lithium.getMaterialRGB() + GTMaterials.Chlorine.getMaterialRGB()))
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("LiCl(H2O)", true);

    CalicheIodateBrine = builderISG("caliche_iodate_brine")
        .fluid()
        .color(0xffe6660)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)NaNO3KNO3KClNaIO3", true);

    IodideSolution = builderISG("iodide_solution")
        .fluid()
        .color(0x08081c)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)NaNO3KNO3KClNaI", true);

    CalicheNitrateSolution = builderISG("caliche_nitrate_solution")
        .fluid()
        .color(0xffe6660)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)NaNO3KNO3KClNaOH", true);

    CalicheIodineBrine = builderISG("caliche_iodine_brine")
        .fluid()
        .color(0xffe6660)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)NaNO3KNO3KClNaOHI", true);

    KeroseneIodineSolution = builderISG("kerosene_iodine_solution")
        .fluid()
        .color(0x08081c)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C12H26I", true);

    IodizedBrine = builderISG("iodized_brine")
        .fluid()
        .color(0x525242)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("I?");

    IodineBrineMix = builderISG("iodine_brine_mix")
        .fluid()
        .color(0x525242)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("I??");

    IodineSlurry = builderISG("iodine_slurry")
        .fluid()
        .color(0x08081c)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("I?");

    Brine = builderISG("brine")
        .fluid()
        .color(0xfcfc8a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

    MesitylOxide = builderISG("mesityl_oxide")
        .fluid()
        .color(GTMaterials.Acetone.getMaterialRGB() - 10)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6H10O", true);

    MethylIsobutylKetone = builderISG("methyl_isobutyl_ketone")
        .fluid()
        .color((MesitylOxide.getMaterialRGB() + WaterAgarMix.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6H12O", true);

    ThiocyanicAcid = builderISG("thiocyanic_acid")
        .liquid(new FluidBuilder().attribute(FluidAttributes.ACID))
        .color(0xfcfc30)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("HSCN");

    ZrHfSeparationMix = builderISG("zrhf_separation_mix")
        .langValue("Zirconium-Hafnium Separation Mix")
        .fluid()
        .color(0xfcfc95)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

    ZrHfChloride = builderISG("zrhf_chloride")
        .langValue("Zirconium-Hafnium Chloride")
        .fluid()
        .color(0x51d351)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("ZrHfCl4", true);

    ZrHfOxyChloride = builderISG("zrhf_oxychloride")
        .langValue("Zirconium-Hafnium Oxychloride")
        .fluid()
        .color(0x51d351)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Cl2HfOZr", true);

    ZirconChlorinatingResidue = builderISG("zircon_chlorinating_residue")
        .fluid()
        .color(0x51d351)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(SiCl4)Co?", true);

    ZincExhaustMixture = builderISG("zinc_exhaust_mixture")
        .fluid()
        .color((GTMaterials.CarbonDioxide.getMaterialRGB() + GTMaterials.SulfurDioxide.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(SO2)(CO2)?", true);

    ZincSlagSlurry = builderISG("zinc_slag_slurry")
        .fluid()
        .color((GTMaterials.Zinc.getMaterialRGB() - 20))
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2O?", true);

    MetalRichSlagSlurry = builderISG("metal_slag_slurry")
        .fluid()
        .color((GTMaterials.Zinc.getMaterialRGB() - 10))
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

    AcidicMetalSlurry = builderISG("acidic_metal_slurry")
        .fluid()
        .color((GTMaterials.Zinc.getMaterialRGB() - 10 + GTMaterials.PhosphoricAcid.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H3PO4?", true);

    SeparatedMetalSlurry = builderISG("separated_metal_slurry")
        .fluid()
        .color((GTMaterials.Zinc.getMaterialRGB() - 20))
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H3PO4?", true);

    MetalHydroxideMix = builderISG("metal_hydroxide_mix")
        .fluid()
        .color((GTMaterials.Zinc.getMaterialRGB() - 30))
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?ZnOH");

    ZincPoorMix = builderISG("zinc_poor_mix")
        .fluid()
        .color((GTMaterials.Iron.getMaterialRGB() - 10))
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?Fe");

    IronPoorMix = builderISG("iron_poor_mix")
        .fluid()
        .color((GTMaterials.Copper.getMaterialRGB() + 10))
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?In");

    IndiumHydroxideConcentrate = builderISG("indium_hydroxide_concentrate")
        .fluid()
        .color((GTMaterials.Indium.getMaterialRGB() + GTMaterials.Hydrogen.getMaterialRGB() + 10) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("In(OH)3", true);

    CadmiumThalliumLiquor = builderISG("cadmium_thallium_liquor")
        .fluid()
        .color((GTMaterials.Cadmium.getMaterialRGB() + GTMaterials.Thallium.getMaterialRGB() + GTMaterials.RareEarth.getMaterialRGB()) / 3)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2SO4)CdTl", true);

    ZincAmalgam = builderISG("zinc_amalgam")
        .fluid()
        .color((GTMaterials.Zinc.getMaterialRGB() - 20))
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("ZnHg");

    CadmiumSulfateSolution = builderISG("cadmium_sulfate")
        .fluid()
        .color((GTMaterials.Cadmium.getMaterialRGB() + GTMaterials.SulfuricAcid.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("CdSO4?", true);

    ThalliumSulfateSolution = builderISG("thallium_sulfate")
        .fluid()
        .color((GTMaterials.Thallium.getMaterialRGB() + GTMaterials.SulfuricAcid.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Tl2SO4?", true);

    PolyphenolMix = builderISG("polyphenol_mix")
        .fluid()
        .color((GTMaterials.Phenol.getMaterialRGB() + 10))
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

    AcidifiedPolyphenolMix = builderISG("acidified_polyphenol_mix")
        .fluid()
        .color((PolyphenolMix.getMaterialRGB() + GTMaterials.SulfuricAcid.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

    Diethylether = builderISG("diethylether")
        .fluid()
        .color(AcidifiedPolyphenolMix.getMaterialRGB() - 20)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(C2H5)2O", true);

    TannicAcid = builderISG("tannic_acid")
        .liquid(new FluidBuilder().attribute(FluidAttributes.ACID))
        .color((Diethylether.getMaterialRGB() + AcidifiedPolyphenolMix.getMaterialRGB()) / 4)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C76H52O46", true);

    GermanicAcidSolution = builderISG("germanic_acid_solution")
        .liquid(new FluidBuilder().attribute(FluidAttributes.ACID))
        .color((GTMaterials.Germanium.getMaterialRGB() - 10))
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H4GeO4", true);

    GermaniumChloride = builderISG("germanium_chloride")
        .fluid()
        .color((GTMaterials.Germanium.getMaterialRGB() + GTMaterials.Chlorine.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("GeCl4", true);

    SodiumHydroxideSolution = builderISG("sodium_hydroxide_solution")
        .fluid()
        .color(GTMaterials.SodiumHydroxide.getMaterialRGB() + 50)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)NaOH", true);

    LithiumHydroxideSolution = builderISG("lithium_hydroxide_solution")
        .fluid()
        .color((GTMaterials.Lithium.getMaterialRGB() + GTMaterials.Oxygen.getMaterialRGB() + GTMaterials.Hydrogen.getMaterialRGB()) / 3)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)LiOH", true);

    LithiumPeroxideSolution = builderISG("lithium_peroxide_solution")
        .fluid()
        .color((GTMaterials.Lithium.getMaterialRGB() + GTMaterials.Oxygen.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)Li2O2", true);

    Ozone = builderISG("ozone")
        .fluid()
        .color(0x0099FF)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("O3", true);

    NitrogenPentoxide = builderISG("nitrogen_pentoxide")
        .fluid()
        .color(0x0033C0)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("N2O5", true);

    AcryloNitrile = builderISG("acrylonitrile")
        .fluid()
        .color(0x9999ff)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("CH2CHCN", true);

    SodiumThiocyanate = builderISG("sodium_thiocyanate")
        .fluid()
        .color((GTMaterials.Sodium.getMaterialRGB() + GTMaterials.Sulfur.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("NaSCN");

    PolyacrylonitrileSolution = builderISG("polyacrylonitrile_solution")
        .fluid()
        .color(0x9999ff)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(C3H3N)n(NaSCN)", true);

    MethylFormate = builderISG("methyl_formate")
        .fluid()
        .color(0Xff9999)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("HCOOCH3", true);

    WetFormamide = builderISG("wet_formamide")
        .fluid()
        .color(0x33CCFF)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)CH3NO", true);

    HydroxylamineDisulfate = builderISG("hydroxylamine_disulfate")
        .fluid()
        .color(0x99add6)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(NH3OH)2(NH4)2(SO4)2", true);

    Hydroxylamine = builderISG("hydroxylamine")
        .fluid()
        .color(0x99cc99)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H3NO", true);

    Amidoxime = builderISG("amidoxime")
        .fluid()
        .color(0x66ff33)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H3N2O(CH)", true);

    PureUranylNitrateSolution = builderISG("pure_uranyl_nitrate")
        .fluid()
        .color(0x33bd45)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2O)UO2(NO3)2", true);

    CarbonSulfide = builderISG("carbon_sulfide")
        .fluid()
        .color(0x40ffbf)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("CS2", true);

    AmineMixture = builderISG("amine_mixture")
        .fluid()
        .color((GTMaterials.Methanol.getMaterialRGB() - 20 + GTMaterials.Ammonia.getMaterialRGB() - 10) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(NH3)CH4", true);

    DimethylthiocarbamoilChloride = builderISG("dimethylthiocarbamoil_chloride")
        .fluid()
        .color(0xd9ff26)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(CH3)2NC(S)Cl", true);

    Trimethylamine = builderISG("trimetylamine")
        .fluid()
        .color((GTMaterials.Dimethylamine.getMaterialRGB() + 20))
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(CH3)3N", true);

    Mercaptophenol = builderISG("mercaptophenol")
        .fluid()
        .color(0xbaaf18)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6H6OS", true);

    Dimethylformamide = builderISG("dimethylformamide")
        .fluid()
        .color(0x42bdff)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(CH3)2NCH", true);

    Oct1ene = builderISG("1_octene")
        .fluid()
        .color(0x7e8778)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C8H16", true);

    CetaneTrimethylAmmoniumBromide = builderISG("cetane_trimethyl_ammonium_bromide")
        .fluid()
        .color(0xb9c1c9)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C19H42BrN", true);

    AmmoniumPersulfate = builderISG("ammonium_persulfate")
        .fluid()
        .color(0x6464f5)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(NH4)2S2O8", true);

    DebrominatedWater = builderISG("debrominated_brine")
        .fluid()
        .color(0x0000ff)
        .iconSet(FLUID)
        .buildAndRegister();

    SeaWater = builderISG("sea_water")
        .fluid()
        .color(0x0000FF)
        .iconSet(FLUID)
        .buildAndRegister();

    ConcentratedBrine = builderISG("concentrated_brine")
        .fluid()
        .color(0xfcfc95)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

    CalciumFreeBrine = builderISG("calcium_free_brine")
        .fluid()
        .color(0xfcfca6)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

    SodiumFreeBrine = builderISG("sodium_free_brine")
        .fluid()
        .color(0xfcfcb1)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

    PotassiumFreeBrine = builderISG("potassium_free_brine")
        .fluid()
        .color(0xfcfcbc)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

    BoronFreeSolution = builderISG("boron_free_solution")
        .fluid()
        .color(0xfcfccd)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

    SodiumLithiumSolution = builderISG("sodium_lithium_solution")
        .fluid()
        .color(0xfcfccd)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("NaLi?");

    ChilledBrine = builderISG("chilled_brine")
        .fluid()
        .color(0xfcfc95)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

    MagnesiumContainingBrine = builderISG("magnesium_containing_brine")
        .fluid()
        .color(0xfcfcbc)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Mg?");

    BrominatedBrine = builderISG("brominated_brine")
        .fluid()
        .color(0xfdd48d)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Br?");

    AcidicBrominatedBrine = builderISG("acidic_brominated_brine")
        .fluid()
        .color(0xfdd48d)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2SO4)Cl?", true);

    ButylLithium = builderISG("butyl_lithium")
        .fluid()
        .color((GTMaterials.Butane.getMaterialRGB() + GTMaterials.Lithium.getMaterialRGB()) / 2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C4H9Li", true);

    Acetaldehyde = builderISG("acetaldehyde")
        .fluid()
        .color(0xFF9933)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C2H4O", true);

    Benzaldehyde = builderISG("benzaldehyde")
        .fluid()
        .color(0xb26f22)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C7H6O", true);

    Dibenzylideneacetone = builderISG("dibenzylideneacetone")
        .fluid()
        .color(0Xcc6699)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C17H14O", true);

    TrimethyltinChloride = builderISG("trimethyltin_chloride")
        .fluid()
        .color(0x8c8075)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(CH3)3SnCl", true);

    ChloroPlatinicAcid = builderISG("chloroplatinic_acid")
        .liquid(new FluidBuilder().attribute(FluidAttributes.ACID))
        .color(0xffba54)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2PtCl6", true);

    Cyclooctadiene = builderISG("cyclooctadiene")
        .fluid()
        .color(0x33CC33)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C8H12", true);

    Cycloparaphenylene = builderISG("cycloparaphenylene")
        .fluid()
        .color(0x333333)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("CPP");

    SuperCooled = builderISG("super_cooled")
        .dust().fluid()
        .color(0x0F5C6E)
        .iconSet(DULL)
        .buildAndRegister();

    Soularium = builderISG("soularium")
        .ingot()
        .color(0x7c674d)
        .iconSet(METALLIC)
        .flags(DISABLE_DECOMPOSITION)
        .components(Gold, 1, Concrete, 1)
        .buildAndRegister();
  }
}
