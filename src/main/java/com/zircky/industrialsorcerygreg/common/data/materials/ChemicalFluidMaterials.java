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


public final class ChemicalFluidMaterials {
  private ChemicalFluidMaterials() {
  }

  public static void register() {
    PhosphorousPentoxide = builderISG("phosphorous_pentoxide")
        .dust()
        .color(8158464)
        .iconSet(DULL)
        .components(GTMaterials.Phosphorus, 4, GTMaterials.Oxygen, 10)
        .buildAndRegister();

        NeutralMatter = builderISG("neutral_matter")
        .fluid()
        .color(3956968)
        .iconSet(FLUID)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    PositiveMatter = builderISG("positive_matter")
        .fluid()
        .color(11279131)
        .iconSet(FLUID)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    IronChloride = builderISG("iron_chloride")
        .fluid()
        .color(0x060b0b)
        .iconSet(FLUID)
        .components(GTMaterials.Iron, 1, GTMaterials.Chlorine, 3)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    HighPressureSteam = builderISG("high_pressure_steam")
        .gas(1000)
        .color(0xFFFFFF)
        .iconSet(FLUID)
        .components(GTMaterials.Water, 1)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    RocketFuelH8N4C2O4 = builderISG("rocket_fuel_a")
        .langValue("Rocket Fuel H8N4C2O4")
        .fluid()
        .color(0x5ECB22)
        .iconSet(FLUID)
        .components(GTMaterials.Hydrogen, 8, GTMaterials.Nitrogen, 4, GTMaterials.Carbon, 2, GTMaterials.Oxygen, 4)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    CoalTarOil = builderISG("coal_tar_oil")
        .fluid()
        .color(0xB5B553)
        .iconSet(FLUID)
        .components(GTMaterials.CoalTar, 1)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    SulfuricCoalTarOil = builderISG("sulfuric_coal_tar_oil")
        .fluid()
        .color(0xFFFFAD)
        .iconSet(FLUID)
        .components(ISGMaterials.CoalTarOil, 1, GTMaterials.SulfuricAcid, 1)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    Anthracene = builderISG("anthracene")
        .fluid()
        .color(0xA2ACA2)
        .iconSet(FLUID)
        .components(GTMaterials.Carbon, 14, GTMaterials.Hydrogen, 10)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    Kerosene = builderISG("kerosene")
        .fluid()
        .color(0xD570D5)
        .iconSet(FLUID)
        .components(GTMaterials.RareEarth, 1)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    EthylBenzene = builderISG("ethylbenzene")
        .fluid()
        .color(0xD5D5D5)
        .iconSet(FLUID)
        .components(GTMaterials.Carbon, 8, GTMaterials.Hydrogen, 10)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    MonoMethylHydrazine = builderISG("monomethylhydrazine")
        .fluid()
        .color(0xFFFFFF)
        .iconSet(FLUID)
        .components(GTMaterials.Carbon, 1, GTMaterials.Hydrogen, 6, GTMaterials.Nitrogen, 2)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    Hydrazine = builderISG("hydrazine")
        .fluid()
        .color(0xFFFFFF)
        .iconSet(FLUID)
        .components(GTMaterials.Nitrogen, 2, GTMaterials.Hydrogen, 4)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    EthylAnthraQuinone = builderISG("ethylanthraquinone")
        .fluid()
        .color(0xFFFF00)
        .iconSet(FLUID)
        .components(GTMaterials.Carbon, 16, GTMaterials.Hydrogen, 12, GTMaterials.Oxygen, 2)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    EthylAnthraHydroQuinone = builderISG("ethylanthrahydroquinone")
        .fluid()
        .color(0xFFFF47)
        .iconSet(FLUID)
        .components(ISGMaterials.EthylAnthraQuinone, 1, GTMaterials.Hydrogen, 2)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    DenseHydrazineFuelMixture = builderISG("dense_hydrazine_fuel_mixture")
        .fluid()
        .color(0x5E2B4A)
        .iconSet(FLUID)
        .components(ISGMaterials.Hydrazine, 1, GTMaterials.Methanol, 1)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    RocketFuelCN3H7O3 = builderISG("rocket_fuel_b")
        .langValue("Rocket Fuel CN3H7O3")
        .fluid()
        .color(0xBE46C5)
        .iconSet(FLUID)
        .components(GTMaterials.Carbon, 1, GTMaterials.Nitrogen, 3, GTMaterials.Hydrogen, 7, GTMaterials.Oxygen, 3)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    RP1RocketFuel = builderISG("rocket_fuel_c")
        .langValue("Rocket Fuel RP-1")
        .fluid()
        .color(0xFF503C)
        .iconSet(FLUID)
        .components(GTMaterials.RareEarth, 1, GTMaterials.Oxygen, 1)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    RP1 = builderISG("rp")
        .langValue("RP-1")
        .fluid()
        .color(0xFF6E5D)
        .iconSet(FLUID)
        .components(GTMaterials.RareEarth, 1)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    FermentationBase = builderISG("fermentation_base")
        .fluid()
        .color(0x3D5917)
        .iconSet(FLUID)
        .components(GTMaterials.RareEarth, 1)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    LiquidHydrogen = builderISG("liquid_hydrogen")
        .fluid()
        .color(0x3AFFC6)
        .iconSet(FLUID)
        .components(GTMaterials.Hydrogen, 1)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    Diphenylisophtalate = builderISG("diphenylisophtalate")
        .fluid()
        .color(0x246E57)
        .iconSet(DULL)
        .components(GTMaterials.Carbon, 20, GTMaterials.Hydrogen, 14, GTMaterials.Oxygen, 4)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    SodiumTungstate = builderISG("sodium_tungstate")
        .fluid()
        .color(0x7a7777)
        .iconSet(FLUID)
        .components(GTMaterials.Sodium, 2, GTMaterials.Tungsten, 1, GTMaterials.Oxygen, 4)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    IodizedOil = builderISG("iodized_oil")
        .fluid()
        .color(0x3E3C2C)
        .iconSet(FLUID)
        .buildAndRegister();

    Pyrotheum = builderISG("pyrotheum")
        .dust(1)
        .color(0xFF9A3C)
        .iconSet(SAND)
        .components(GTMaterials.Redstone, 1, GTMaterials.Blaze, 2, GTMaterials.Sulfur, 1)
        .flags(DISABLE_DECOMPOSITION, EXCLUDE_BLOCK_CRAFTING_BY_HAND_RECIPES)
        .buildAndRegister();

    EglinSteelBase = builderISG("eglin_steel_base")
        .dust(6)
        .color(0x8B4513)
        .iconSet(SAND)
        .components(GTMaterials.Iron, 4, GTMaterials.Kanthal, 1, GTMaterials.Invar, 5)
        .buildAndRegister();

    MicaPulp = builderISG("mica_based")
        .dust(1)
        .color(0x917445)
        .iconSet(SAND)
        .components(GTMaterials.Mica, 1, GTMaterials.RareEarth, 1)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    AluminoSilicateWool = builderISG("alumino_silicate_wool")
        .dust(1)
        .color(0xbbbbbb)
        .iconSet(SAND)
        .components(GTMaterials.Aluminium, 2, GTMaterials.Silicon, 1, GTMaterials.Oxygen, 5)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    Blizz = builderISG("blizz")
        .dust(1)
        .color(0x01F3F6)
        .iconSet(DULL)
        .components(GTMaterials.Redstone, 1, GTMaterials.Water, 1)
        .buildAndRegister();

    Snow = builderISG("snow")
        .dust(1)
        .color(0xFFFFFF)
        .iconSet(OPAL)
        .components(GTMaterials.Hydrogen, 2, GTMaterials.Oxygen, 1)
        .buildAndRegister();

    Cryotheum = builderISG("cryotheum")
        .dust(1)
        .color(0x01F3F6)
        .iconSet(SAND)
        .components(GTMaterials.Redstone, 1, ISGMaterials.Blizz, 2, GTMaterials.Water, 1)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    PhthalicAnhydride = builderISG("phthalicanhydride")
        .langValue("Phthalic Anhydride")
        .dust(1)
        .color(0xD1D1D1)
        .iconSet(SAND)
        .components(GTMaterials.Carbon, 8, GTMaterials.Hydrogen, 4, GTMaterials.Oxygen, 3)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    Dibismusthydroborat = builderISG("dibismuthhydroborat")
        .dust(2)
        .color(0x00B749)
        .iconSet(SAND)
        .components(GTMaterials.Bismuth, 2, GTMaterials.Hydrogen, 1, GTMaterials.Boron, 1)
        .buildAndRegister();

    BismuthTellurite = builderISG("bismuth_tellurite")
        .dust(2)
        .color(0x006B38)
        .iconSet(SAND)
        .components(GTMaterials.Bismuth, 2, GTMaterials.Tellurium, 3)
        .buildAndRegister();

    CircuitCompoundMK3 = builderISG("circuit_compound_mkc")
        .langValue("Circuit Compound MK III")
        .dust(2)
        .color(0x003316)
        .iconSet(SAND)
        .components(GTMaterials.IndiumGalliumPhosphide, 1, ISGMaterials.Dibismusthydroborat, 3, ISGMaterials.BismuthTellurite, 2)
        .buildAndRegister();

    YttriumOxide = builderISG("yttrium_oxide")
        .dust(2)
        .color(0xC6EBB3)
        .iconSet(SAND)
        .components(GTMaterials.Yttrium, 2, GTMaterials.Oxygen, 3)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    Zirkelite = builderISG("zirkelite")
        .ore()
        .dust(2)
        .color(0x6B5E6A)
        .iconSet(DULL)
        .components(GTMaterials.Calcium, 2, GTMaterials.Thorium, 2, GTMaterials.Cerium, 1, GTMaterials.Zirconium, 7, GTMaterials.Rutile, 6, GTMaterials.Niobium, 4, GTMaterials.Oxygen, 10)
        .buildAndRegister();

    PlatinumResidue = builderISG("platinum_residue")
        .dust(2)
        .color(0x64632E)
        .iconSet(ROUGH)
        .components(GTMaterials.Iridium, 2, GTMaterials.RareEarth, 1, GTMaterials.RareEarth, 1, GTMaterials.RareEarth, 1)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    IrMetalResidue = builderISG("iridium_metal_residue")
        .ore()
        .dust(2)
        .color(0x846649)
        .iconSet(ROUGH)
        .components(GTMaterials.Iridium, 2, GTMaterials.Oxygen, 4, GTMaterials.SiliconDioxide, 2, GTMaterials.Gold, 3)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    Triniite = builderISG("triniite")
        .ore()
        .dust(7)
        .color(0x5F5A76)
        .iconSet(SHINY)
        .components(GTMaterials.Trinium, 3, GTMaterials.Actinium, 3, GTMaterials.Selenium, 4, GTMaterials.Astatine, 4)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    SilverOxide = builderISG("silver_oxide")
        .dust(2)
        .color(0x4D4D4D)
        .iconSet(DULL)
        .components(GTMaterials.Silver, 2, GTMaterials.Oxygen, 1)
        .buildAndRegister();

    SilverChloride = builderISG("silver_chloride")
        .dust(2)
        .color(0xFEFEFE)
        .iconSet(DULL)
        .components(GTMaterials.Silver, 1, GTMaterials.Chlorine, 1)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    PotassiumMetabisulfite = builderISG("potassium_metabisulfite")
        .dust(2)
        .color(0xFFFFFF)
        .iconSet(DULL)
        .components(GTMaterials.Potassium, 2, GTMaterials.Sulfur, 2, GTMaterials.Oxygen, 5)
        .buildAndRegister();

    LeadNitrate = builderISG("lead_nitrate")
        .dust(2)
        .color(0xFEFEFE)
        .iconSet(DULL)
        .components(GTMaterials.Lead, 1, GTMaterials.Nitrogen, 2, GTMaterials.Oxygen, 6)
        .buildAndRegister();

    SodiumPotassiumAlloy = builderISG("sodium_potassium_alloy")
        .dust(2)
        .color(0x252525)
        .iconSet(SHINY)
        .components(GTMaterials.Sodium, 7, GTMaterials.Potassium, 3)
        .buildAndRegister();

    SodiumFluoride = builderISG("sodium_fluoride")
        .dust(2)
        .color((GTMaterials.Sodium.getMaterialRGB() + GTMaterials.Fluorine.getMaterialRGB()) / 2)
        .iconSet(DULL)
        .components(GTMaterials.Sodium, 1, GTMaterials.Fluorine, 1)
        .buildAndRegister();

    PotassiumFluoride = builderISG("potassium_fluoride")
        .dust(2)
        .color(0xFDFDFD)
        .iconSet(DULL)
        .components(GTMaterials.Potassium, 1, GTMaterials.Fluorine, 1)
        .buildAndRegister();

    FLiNaK = builderISG("flinak")
        .dust(2)
        .color(0x252525)
        .iconSet(DULL)
        .components(GTMaterials.Fluorine, 3, GTMaterials.Lithium, 1, GTMaterials.Sodium, 1, GTMaterials.Potassium, 1)
        .buildAndRegister();

    FLiBe = builderISG("flibe")
        .dust(2)
        .color(0x252525)
        .iconSet(DULL)
        .components(GTMaterials.Fluorine, 3, GTMaterials.Lithium, 1, GTMaterials.Beryllium, 1)
        .buildAndRegister();

    OrganicFertilizer = builderISG("organic_fertilizer")
        .dust(2)
        .color(0xDDDDDD)
        .iconSet(SHINY)
        .components(GTMaterials.Calcium, 5, GTMaterials.Phosphate, 3, GTMaterials.Hydrogen, 1, GTMaterials.Oxygen, 1)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

  }
}
