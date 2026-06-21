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



final class BioOrganicSolidMaterials {
  private BioOrganicSolidMaterials() {
  }

  static void register() {
    CalciumCarbide = builderISG("calcium_carbide")
        .dust()
        .color(0x807b70)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("CaC2", true);

    BetaPinene = builderISG("beta_pinene")
        .dust()
        .color(0x61ad6b)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C10H16", true);

    Yeast = builderISG("yeast")
        .dust()
        .color(0xf0e660)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("???");

    Glutamine = builderISG("glutamine")
        .dust()
        .color(0xede9b4)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C5H10N2O3", true);

    SilicaGel = builderISG("silica_gel")
        .dust()
        .color(0x61daff)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("SiO2", true);

    SilicaAluminaGel = builderISG("silica_alumina_gel")
        .dust()
        .color(0x558d9e)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Al2O3SiO2", true);

    ZeoliteSievingPellets = builderISG("zeolite_sieving_pellets")
        .dust()
        .color(0xa17bd1)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Al2O3SiO2", true);

    WetZeoliteSievingPellets = builderISG("wet_zeolite_sieving_pellets")
        .dust()
        .color(0x392f45)
        .iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("Al2O3SiO2?", true);

    GreenAlgae = builderISG("green_algae")
        .dust()
        .color(0x228b22)
        .iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("An Algae");

    BrownAlgae = builderISG("brown_algae")
        .dust()
        .color(0xa52a2a)
        .iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("An Algae");

    RedAlgae = builderISG("red_algae")
        .dust()
        .color(0xf08080)
        .iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("An Algae");

    DryRedAlgae = builderISG("dry_red_algae")
        .dust()
        .color(0xff7f50)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("A Dry Algae");

    RedAlgaePowder = builderISG("red_algae_powder")
        .dust()
        .color(0xcc2f2f)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("A Powdered Algae");

    PreFreezeAgar = builderISG("pre_freeze_agar")
        .dust()
        .color(0x132b0d)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Warm Agar");

    FrozenAgarCrystals = builderISG("frozen_agar_crystals")
        .dust()
        .color(0x68db4b)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Cold Agar");

    BrevibacteriumFlavium = builderISG("brevibacterium_flavium")
        .dust()
        .color(0x2c4d24)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Bacteria");

    StreptococcusPyogenes = builderISG("streptococcus_pyogenes")
        .dust()
        .color(0x1c3b15)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Bacteria");

    EschericiaColi = builderISG("eschericia_coli")
        .dust()
        .color(0x2d4228)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Bacteria");

    BifidobacteriumBreve = builderISG("bifidobacterium_breve")
        .dust()
        .color(0x377528)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Bacteria");

    CupriavidusNecator = builderISG("cupriavidus_necator")
        .dust()
        .color(0x22704f)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Bacteria");

    Shewanella = builderISG("shewanella")
        .dust()
        .color(0x8752ab)
        .iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("Bacteria");

  }
}
