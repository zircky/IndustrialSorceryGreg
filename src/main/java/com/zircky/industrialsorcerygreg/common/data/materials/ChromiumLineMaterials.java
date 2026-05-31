package com.zircky.industrialsorcerygreg.common.data.materials;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet;
import com.gregtechceu.gtceu.api.fluids.FluidBuilder;
import com.gregtechceu.gtceu.api.fluids.GTFluid;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.zircky.industrialsorcerygreg.common.data.ISGElement;

import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.builderISG;

public class ChromiumLineMaterials {
  public static void register() {
    Alumina = builderISG("alumina")
        .dust().ore()
        .color(0x09474a).iconSet(MaterialIconSet.DULL)
        .element(ISGElement.ALUMINA)
        .flags(MaterialFlags.DISABLE_DECOMPOSITION)
        .buildAndRegister();
    ChromiumIIIOxide = builderISG("chromium_iii_oxide")
        .dust()
        .color(0x3dc34d).iconSet(MaterialIconSet.DULL)
        .element(ISGElement.CHROMIOMIIIOXIDE)
        .buildAndRegister();
    SodiumCarbonateSolution = builderISG("sodium_carbonate_solution")
        .liquid()
        .color(0x636389)
        .iconSet(MaterialIconSet.FLUID)
        .buildAndRegister();
    SodiumChromateSolution = builderISG("sodium_chromate_solution")
        .liquid()
        .color(0xbbb310)
        .iconSet(MaterialIconSet.FLUID)
        .buildAndRegister();
    SodiumDichromateSolution = builderISG("sodium_dichromate_solution")
        .liquid()
        .color(0xb55a10)
        .iconSet(MaterialIconSet.FLUID)
        .buildAndRegister();
    CalciumSulfide = builderISG("calcium_sulfide")
        .dust()
        .color(0xd8e09b)
        .components(GTMaterials.Calcium, 1, GTMaterials.Sulfur, 1)
        .flags(MaterialFlags.DECOMPOSITION_BY_ELECTROLYZING)
        .buildAndRegister();
  }
}
