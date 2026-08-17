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


public final class NaquadahFuelMaterials {
  private NaquadahFuelMaterials() {
  }

  public static void register() {
    NaquadricSolution = builderISG("naquadric_solution")
        .fluid()
        .color(0x232225)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("NqNO2", true);

    EnrichedNaquadricSolution = builderISG("enriched_naquadric_solution")
        .fluid()
        .color(0x312735)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq+NO2", true);

    NaquadriaticSolution = builderISG("naquadriatic_solution")
        .fluid()
        .color(0x312735)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("*Nq*NO2", true);

    AntimonyPentafluoride = builderISG("antimony_pentafluoride")
        .dust().fluid()
        .color(GTMaterials.Antimony.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("SbF5", true);

    FluoronaquadricAcid = builderISG("fluoronaquadric_acid")
        .liquid(new FluidBuilder().attribute(FluidAttributes.ACID))
        .color(0x485d60)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2NqF4", true);

    EnrichedFluoronaquadricAcid = builderISG("enriched_fluoronaquadric_acid")
        .liquid(new FluidBuilder().attribute(FluidAttributes.ACID))
        .color(0x485d60)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2Nq+F4", true);

    FluoronaquadriaticAcid = builderISG("fluoronaquadriatic_acid")
        .liquid(new FluidBuilder().attribute(FluidAttributes.ACID))
        .color(0x485d60)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2*Nq*F4");

    NaquadahDifluoride = builderISG("naquadah_difluoride")
        .fluid()
        .color(0x324649)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("NqF2", true);

    EnrichedNaquadahDifluoride = builderISG("enriched_naquadah_difluoride")
        .fluid()
        .color(0x141e1f)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq+F2", true);

    NaquadriaDifluoride = builderISG("naquadria_difluoride")
        .fluid()
        .color(0x141e1f)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("*Nq*F2", true);

    NaquadriaHexafluoride = builderISG("naquadria_hexafluoride")
        .fluid()
        .color(0x111c27)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("*Nq*F6", true);

    RadonDifluoride = builderISG("radon_difluoride")
        .fluid()
        .color(0x9966ff)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("RnF2", true);

    RadonNaquadriaoctafluoride = builderISG("radon_naquadriaoctafluoride")
        .fluid()
        .color(0x111c27)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Rd*Nq*F8", true);

    XenonTrioxide = builderISG("xenon_trioxide")
        .fluid()
        .color(0x432791)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("XeO3", true);

    CesiumFluoride = builderISG("cesium_fluoride")
        .fluid()
        .color(0xabab69)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("CsF");

    CesiumXenontrioxideFluoride = builderISG("cesium_xenontrioxide_fluoride")
        .fluid()
        .color(0x3333cc)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("CsXeO3F", true);

    RadonTrioxide = builderISG("radon_trioxide")
        .fluid()
        .color(0x9966ff)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("RnO3", true);

    NaquadriaCesiumXenonNonfluoride = builderISG("naquadria_cesium_xenon_nonfluoride")
        .fluid()
        .color(0x1c1c5e)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("*Nq*CsXeF9", true);

    NitrylFluoride = builderISG("nitryl_fluoride")
        .fluid()
        .color(GTMaterials.NitricOxide.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("NO2F", true);

    NitrosoniumOctafluoroxenate = builderISG("nitrosonium_octafluoroxenate")
        .fluid()
        .color(0x3f3f83)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(NO2)2XeF8", true);

    NaquadriaCesiumfluoride = builderISG("naquadria_cesiumfluoride")
        .fluid()
        .color(0x636379)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("*Nq*F2CsF", true);

    EnrichedNaquadahhexafluoride = builderISG("enriched_naquadahhexafluoride")
        .fluid()
        .color(0x030330)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq+F6", true);

    EnrichedXenonHexafluoronaquadate = builderISG("enriched_xenon_hexafluoronaquadate")
        .fluid()
        .color(0x1e1ec2)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("XeNq+F6", true);

    AuricChloride = builderISG("auric_chloride")
        .fluid()
        .color(0xdffb50)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Au2Cl6", true);

    BromineTrifluoride = builderISG("bromine_trifluoride")
        .fluid()
        .color(0xfcde1d)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("BrF3", true);

    XenoauricFluoroantimonicAcid = builderISG("xenoauric_fluoroantimonic_acid")
        .fluid()
        .color(0x685b08)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("XeAuSbF6", true);

    NaquadahSulfate = builderISG("naquadah_sulfate")
        .fluid()
        .color(0x38330f)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("NqSO4", true);

    NaquadahSolution = builderISG("naquadah_solution")
        .fluid()
        .color(0x523b3a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("NqNH4NO3", true);

    ClearNaquadahLiquid = builderISG("clear_naquadah_liquid")
        .fluid()
        .color(0xa89f9e)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq?");

    ComplicatedNaquadahGas = builderISG("complicated_naquadah_gas")
        .fluid()
        .color(0x403d3d)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq??");

    ComplicatedHeavyNaquadah = builderISG("complicated_heavy_naquadah")
        .fluid()
        .color(0x403d3d)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq??");

    ComplicatedMediumNaquadah = builderISG("complicated_medium_naquadah")
        .fluid()
        .color(0x403d3d)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq??");

    ComplicatedLightNaquadah = builderISG("complicated_light_naquadah")
        .fluid()
        .color(0x403d3d)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq??");

    NaquadahGas = builderISG("naquadah_gas")
        .fluid()
        .color(0x575757)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq");

    LightNaquadah = builderISG("light_naquadah")
        .fluid()
        .color(0x2e2e2e)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq");

    MediumNaquadah = builderISG("medium_naquadah")
        .fluid()
        .color(0x2e2e2e)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq");

    HeavyNaquadah = builderISG("heavy_naquadah")
        .fluid()
        .color(0x2e2e2e)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq");

    FCrackedLightNaquadah = builderISG("fl_cracked_light_naquadah")
        .langValue("Fluorine-Cracked Light Naquadah")
        .fluid()
        .color(0x505e5b)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("FlNq");

    FCrackedMediumNaquadah = builderISG("fl_cracked_medium_naquadah")
        .langValue("Fluorine-Cracked Medium Naquadah")
        .fluid()
        .color(0x505e5b)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("FlNq");

    FCrackedHeavyNaquadah = builderISG("fl_cracked_heavy_naquadah")
        .langValue("Fluorine-Cracked Heavy Naquadah")
        .fluid()
        .color(0x505e5b)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("FlNq");

    LightNaquadahFuel = builderISG("light_naquadah_fuel")
        .fluid()
        .color(0x2e2e2e)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq");

    MediumNaquadahFuel = builderISG("medium_naquadah_fuel")
        .fluid()
        .color(0x2e2e2e)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq");

    HeavyNaquadahFuel = builderISG("heavy_naquadah_fuel")
        .fluid()
        .color(0x2e2e2e)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq");

    AmmoniumNitrate = builderISG("ammonium_nitrate")
        .fluid()
        .color(GTMaterials.Ammonia.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("NH4NO3", true);

    ENaquadahSolution = builderISG("e_naquadah_solution")
        .langValue("Enriched Naquadah Solution")
        .fluid()
        .color(0x523b3a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq+?");

    ClearENaquadahLiquid = builderISG("clear_e_naquadah_liquid")
        .langValue("Clear Enriched Naquadah Liquid")
        .fluid()
        .color(0xa89f9e)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq+?");

    ComplicatedHeavyENaquadah = builderISG("complicated_heavy_e_naquadah")
        .langValue("Complicated Heavy Enriched Naquadah")
        .fluid()
        .color(0x403d3d)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq+??");

    ComplicatedMediumENaquadah = builderISG("complicated_medium_e_naquadah")
        .langValue("Complicated Medium Enriched Naquadah")
        .fluid()
        .color(0x403d3d)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq+??");

    ComplicatedLightENaquadah = builderISG("complicated_light_e_naquadah")
        .langValue("Complicated Light Enriched Naquadah")
        .fluid()
        .color(0x403d3d)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq+??");

    LightENaquadah = builderISG("light_enriched_naquadah")
        .fluid()
        .color(0x2e2e2e)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq+");

    MediumENaquadah = builderISG("medium_enriched_naquadah")
        .fluid()
        .color(0x2e2e2e)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq+");

    HeavyENaquadah = builderISG("heavy_enriched_naquadah")
        .fluid()
        .color(0x2e2e2e)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq+");

    RnCrackedLightNaquadah = builderISG("rn_cracked_light_e_naquadah")
        .langValue("Radon-Cracked Light Enriched Naquadah")
        .fluid()
        .color(0x505e5b)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("RnNq+");

    RnCrackedMediumENaquadah = builderISG("rn_cracked_medium_e_naquadah")
        .langValue("Radon-Cracked Medium Enriched Naquadah")
        .fluid()
        .color(0x505e5b)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("RnNq+");

    RnCrackedHeavyENaquadah = builderISG("rn_cracked_heavy_e_naquadah")
        .langValue("Radon-Cracked Heavy Enriched Naquadah")
        .fluid()
        .color(0x505e5b)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("RnNq+");

    LightENaquadahFuel = builderISG("light_e_naquadah_fuel")
        .langValue("Light Enriched Naquadah Fuel")
        .fluid()
        .color(0x2e2e2e)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq+");

    MediumENaquadahFuel = builderISG("medium_e_naquadah_fuel")
        .langValue("Medium Enriched Naquadah Fuel")
        .fluid()
        .color(0x2e2e2e)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq+");

    HeavyENaquadahFuel = builderISG("heavy_e_naquadah_fuel")
        .langValue("Heavy Enriched Naquadah Fuel")
        .fluid()
        .color(0x2e2e2e)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq+");

    HyperFuelI = builderISG("hyper_fluid_i")
        .fluid()
        .color(0xfaff5e)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq(Nq+)(*Nq*)RfPu");

    HyperFuelII = builderISG("hyper_fluid_ii")
        .langValue("Hyper Fuel II")
        .fluid()
        .color(0xd8db67)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq(Nq+)(*Nq*)DbCm");

    HyperFuelIII = builderISG("hyper_fluid_iii")
        .langValue("Hyper Fuel III")
        .fluid()
        .color(0x8f9146)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq(Nq+)(*Nq*)AdCf");

    HyperFuelIV = builderISG("hyper_fluid_iv")
        .langValue("Hyper Fuel IV")
        .fluid()
        .color(0x4d4e31)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Nq(Nq+)(*Nq*)AdCfNtTn");

    AcidicSaltWater = builderISG("acidic_salt_water")
        .fluid()
        .color(0x006960)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2SO4(NaCl)3(H2O)3Cl2", true);

    SulfuricBromineSolution = builderISG("sulfuric_bromine_solution")
        .fluid()
        .color(0xff5100)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2SO4Br(H2O)Cl2", true);

    HotVapourMixture = builderISG("hot_vapour_mixture")
        .fluid()
        .color(0xff5100)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2SO4Br(H2O)2Cl2", true);

    DampBromine = builderISG("damp_bromine")
        .fluid()
        .color(0xe17594)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Br(H2O)", true);

    Ethylhexanol = builderISG("ethylhexanol")
        .fluid()
        .color(0xfeea9a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C8H18O", true);

    DiethylhexylPhosphoricAcid = builderISG("di_ethylhexyl_phosphoric_acid")
        .langValue("Di-(2-ethylhexyl)phosphoric Acid")
        .liquid(new FluidBuilder().attribute(FluidAttributes.ACID))
        .color(0xffff99)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C16H35O4P", true);

  }
}
