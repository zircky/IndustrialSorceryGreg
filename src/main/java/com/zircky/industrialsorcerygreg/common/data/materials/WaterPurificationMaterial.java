package com.zircky.industrialsorcerygreg.common.data.materials;

import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet;
import com.gregtechceu.gtceu.common.data.GTMaterials;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.DISABLE_DECOMPOSITION;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.DULL;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.FLUID;
import static com.gregtechceu.gtceu.common.data.GTMaterials.Hydrogen;
import static com.gregtechceu.gtceu.common.data.GTMaterials.Oxygen;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.builderISG;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;

public class WaterPurificationMaterial {

  public static void register() {
    FilteredSater = builderISG("filtered_water")
        .fluid()
        .components(Hydrogen, 2, Oxygen, 1)
        .color(0x0058cd)
        .iconSet(FLUID)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    OzoneWater = builderISG("ozone_water")
        .fluid()
        .components(Hydrogen, 2, Oxygen, 1)
        .color(0x0058cd)
        .iconSet(FLUID)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    FlocculentWater = builderISG("flocculent_water")
        .fluid()
        .components(Hydrogen, 2, Oxygen, 1)
        .color(0x0058cd)
        .iconSet(FLUID)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    PHNeutralWater = builderISG("ph_neutral_water")
        .langValue("pH Neutral Water")
        .fluid()
        .components(Hydrogen, 2, Oxygen, 1)
        .color(0x0058cd)
        .iconSet(FLUID)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    ExtremeTemperatureWater = builderISG("extreme_temperature_water")
        .fluid()
        .components(Hydrogen, 2, Oxygen, 1)
        .color(0x0058cd)
        .iconSet(FLUID)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    ElectricEquilibriumWater = builderISG("electric_equilibrium_water")
        .fluid()
        .components(Hydrogen, 2, Oxygen, 1)
        .color(0x0058cd)
        .iconSet(FLUID)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    DegassedWater = builderISG("degassed_water")
        .fluid()
        .components(Hydrogen, 2, Oxygen, 1)
        .color(0x0058cd)
        .iconSet(FLUID)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    BaryonicPerfectionWater = builderISG("baryonic_perfection_water")
        .fluid()
        .components(Hydrogen, 2, Oxygen, 1)
        .color(0x0058cd)
        .iconSet(FLUID)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    PolyAluminiumChloride = builderISG("poly_aluminium_chloride")
        .fluid()
        .color(0xf3ffe5)
        .iconSet(DULL)
        .buildAndRegister();

    FlocculationWasteSolution = builderISG("flocculation_waste_solution")
        .fluid()
        .color(0xc7cac1)
        .iconSet(DULL)
        .buildAndRegister();
  }
}
