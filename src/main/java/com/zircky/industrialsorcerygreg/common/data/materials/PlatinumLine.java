package com.zircky.industrialsorcerygreg.common.data.materials;

import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet;
import com.gregtechceu.gtceu.api.fluids.FluidState;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;
import com.gregtechceu.gtceu.common.data.GTMaterials;

import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;

public class PlatinumLine {
  public static void register() {
    PlatinumConcentrate = builderISG("platinum_concentrate")
        .langValue("Platinum Concentrate")
        .liquid()
        .iconSet(MaterialIconSet.FLUID)
        .color(GTMaterials.Platinum.getMaterialARGB())
        .buildAndRegister()
        .setFormula("Pt?Pd?");

    PlatinumSalt = builderISG("platinum_salt")
        .langValue("Platinum Salt")
        .dust()
        .iconSet(MaterialIconSet.DULL)
        .color(GTMaterials.Platinum.getMaterialARGB())
        .flags(MaterialFlags.NO_UNIFICATION)
        .buildAndRegister()
        .setFormula("Pt?");

    RefinedPlatinumSalt = builderISG("refined_platinum_salt")
        .dust(2)
        .color(GTMaterials.Platinum.getMaterialARGB())
        .iconSet(MaterialIconSet.METALLIC)
        .flags(MaterialFlags.NO_UNIFICATION)
        .buildAndRegister()
        .setFormula("Pt?");

    PlatinumMetallicPowder = builderISG("platinum_metallic_powder")
        .dust().ore()
        .color(GTMaterials.Platinum.getMaterialARGB())
        .iconSet(MaterialIconSet.METALLIC)
        .buildAndRegister()
        .setFormula("Pt?Pd?Ir?Os?Rh?Ru?");

    ReprecipitatedPlatinum = builderISG("reprecipitated_platinum")
        .dust()
        .color(GTMaterials.Platinum.getMaterialARGB())
        .iconSet(MaterialIconSet.METALLIC)
        .flags(MaterialFlags.NO_UNIFICATION)
        .buildAndRegister()
        .setFormula("PtCl");

    PalladiumEnrichedAmmonia = builderISG("palladium_enriched_ammonia")
        .liquid()
        .color(GTMaterials.Palladium.getMaterialARGB())
        .iconSet(MaterialIconSet.FLUID)
        .components(GTMaterials.Ammonia, 1, GTMaterials.Palladium, 1)
        .flags(MaterialFlags.DISABLE_DECOMPOSITION)
        .buildAndRegister()
        .setFormula("Pd?");

    PalladiumMetallicPowder = builderISG("palladium_metallic_powder")
        .dust()
        .color(GTMaterials.Palladium.getMaterialARGB())
        .iconSet(MaterialIconSet.METALLIC)
        .flags(MaterialFlags.NO_UNIFICATION)
        .buildAndRegister()
        .setFormula("Pd?");

    ReprecipitatedPalladium = builderISG("reprecipitated_palladium")
        .dust()
        .color(GTMaterials.Palladium.getMaterialARGB())
        .iconSet(MaterialIconSet.METALLIC)
        .flags(MaterialFlags.NO_UNIFICATION)
        .buildAndRegister()
        .setFormula("Pd?");

    PalladiumSalt = builderISG("palladium_salt")
        .dust()
        .color(GTMaterials.Palladium.getMaterialARGB())
        .iconSet(MaterialIconSet.METALLIC)
        .flags(MaterialFlags.NO_UNIFICATION)
        .buildAndRegister()
        .setFormula("Pd?");

    SodiumFormate = builderISG("sodium_formate")
        .liquid()
        .color(0xffaaaa)
        .iconSet(MaterialIconSet.FLUID)
        .components(GTMaterials.SodiumHydroxide, 1, GTMaterials.CarbonMonoxide, 1)
        .buildAndRegister()
        .setFormula("HCOONa");

    SodiumSulfate = builderISG("sodium_sulfate")
        .dust()
        .color(0xc6c6c6)
        .iconSet(MaterialIconSet.FLUID)
        .flags(MaterialFlags.DECOMPOSITION_BY_ELECTROLYZING)
        .components(GTMaterials.Sodium, 3, GTMaterials.Sulfur, 1, GTMaterials.Oxygen, 4)
        .buildAndRegister();

    PotassiumDisulfate = builderISG("potassium_disulfate")
        .dust().fluid(FluidStorageKeys.MOLTEN, FluidState.LIQUID)
        .color(0xfbbb66)
        .iconSet(MaterialIconSet.DULL)
        .flags(MaterialFlags.DECOMPOSITION_BY_ELECTROLYZING)
        .components(GTMaterials.Potassium, 2, GTMaterials.Sulfur, 2, GTMaterials.Oxygen, 7)
        .buildAndRegister();

    LeachResidue = builderISG("leach_residue")
        .dust()
        .color(0x644629)
        .iconSet(MaterialIconSet.ROUGH)
        .buildAndRegister().setFormula("Is?Os?Ru?");

    RhodiumSulfateSolution = builderISG("rhodium_sulfate_solution")
        .liquid()
        .color(0xffbb66)
        .iconSet(MaterialIconSet.FLUID)
        .buildAndRegister().setFormula("Rh?S?O?");

    SodiumRuthenate = builderISG("sodium_ruthenate")
        .dust()
        .color(0x3a40cd)
        .iconSet(MaterialIconSet.SHINY)
        .buildAndRegister()
        .setFormula("Na?Ru?");

    HotRutheniumTetroxideSolution = builderISG("hot_ruthenium_tetroxide_solution")
        .gas(700)
        .color(0xc7c7c7)
        .iconSet(MaterialIconSet.FLUID)
        .buildAndRegister()
        .setFormula("Ru?O?");

    RutheniumTetroxideSolution = builderISG("ruthenium_tetroxide_solution")
        .liquid(313)
        .color(0xc7c7c7)
        .iconSet(MaterialIconSet.FLUID)
        .buildAndRegister()
        .setFormula("Ru?O?");

    RarestMetalResidue = builderISG("rarest_metal_residue")
        .dust()
        .color(0x644629)
        .iconSet(MaterialIconSet.ROUGH)
        .buildAndRegister()
        .setFormula("Os?Ir?");

    SludgeResidue = builderISG("sludge_residue")
        .dust()
        .color(0x846649)
        .iconSet(MaterialIconSet.DULL)
        .components(GTMaterials.SiliconDioxide, 3, GTMaterials.Gold, 2)
        .flags(MaterialFlags.DECOMPOSITION_BY_CENTRIFUGING)
        .buildAndRegister();

    IridiumDioxide = builderISG("iridium_dioxide")
        .dust()
        .color(0x846649)
        .iconSet(MaterialIconSet.FLUID)
        .buildAndRegister()
        .setFormula("Ir?O?");

    OsmiumSolution = builderISG("osmium_solution")
        .liquid()
        .color(0x846649)
        .iconSet(MaterialIconSet.FLUID)
        .buildAndRegister()
        .setFormula("Os?Cl?");

    AcidicIridiumSolution = builderISG("acidic_iridium_solution")
        .liquid()
        .color(0x846649)
        .iconSet(MaterialIconSet.FLUID)
        .buildAndRegister()
        .setFormula("Ir?Cl?");

    MetallicSludgeResidue = builderISG("metallic_sludge_residue")
        .dust()
        .color(0x846649)
        .iconSet(MaterialIconSet.DULL)
        .flags(MaterialFlags.DECOMPOSITION_BY_CENTRIFUGING)
        .components(GTMaterials.Nickel, 1, GTMaterials.Copper, 1)
        .buildAndRegister();

    CrudeRhodiumMetal = builderISG("crude_rhodium_metal")
        .dust()
        .color(0x666666)
        .iconSet(MaterialIconSet.DULL)
        .buildAndRegister()
        .setFormula("Rh?");

    RhodiumSalt = builderISG("rhodium_salt")
        .dust()
        .color(0x848484)
        .iconSet(MaterialIconSet.GEM_VERTICAL)
        .buildAndRegister()
        .setFormula("Rh?Na?Cl?");

    RhodiumSaltSolution = builderISG("rhodium_salt_solution")
        .liquid()
        .color(0x667788)
        .iconSet(MaterialIconSet.FLUID)
        .buildAndRegister()
        .setFormula("Rh?Na?Cl?");

    SodiumNitrate = builderISG("sodium_nitrate")
        .dust()
        .color(0x846674)
        .iconSet(MaterialIconSet.ROUGH)
        .components(GTMaterials.Sodium, 1, GTMaterials.Nitrogen, 1, GTMaterials.Oxygen, 3)
        .buildAndRegister()
        .setFormula("NaNO3");

    RhodiumNitrate = builderISG("rhodium_nitrate")
        .dust()
        .color(0x776649)
        .iconSet(MaterialIconSet.QUARTZ)
        .buildAndRegister()
        .setFormula("Rh?N?O?");

    ZincSulfate = builderISG("zinc_sulfate")
        .dust()
        .color(0x846649)
        .iconSet(MaterialIconSet.QUARTZ)
        .flags(MaterialFlags.DECOMPOSITION_BY_ELECTROLYZING)
        .components(GTMaterials.Zinc, 1, GTMaterials.Sulfur, 1, GTMaterials.Oxygen, 4)
        .buildAndRegister();

    RhodiumFilterCake = builderISG("rhodium_filter_cake")
        .dust()
        .color(0x776649)
        .iconSet(MaterialIconSet.QUARTZ)
        .buildAndRegister()
        .setFormula("Rh?N?O?");

    RhodiumFilterCakeSolution = builderISG("rhodium_filter_cake_solution")
        .liquid()
        .color(0x667788)
        .iconSet(MaterialIconSet.FLUID)
        .buildAndRegister()
        .setFormula("Rh?N?");

    ReprecipitatedRhodium = builderISG("reprecipitated_rhodium")
        .dust()
        .color(0x776649)
        .iconSet(MaterialIconSet.QUARTZ)
        .buildAndRegister()
        .setFormula("Rh?N?H?");

  }

}
