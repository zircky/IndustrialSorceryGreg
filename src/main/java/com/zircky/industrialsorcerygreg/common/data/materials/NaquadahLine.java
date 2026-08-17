package com.zircky.industrialsorcerygreg.common.data.materials;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.ToolProperty;

import static com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty.GasTier.HIGHER;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;

public class NaquadahLine {
  public static void register() {
    Adamantium = builderISG("adamantium")
        .ingot().ore()
        .color(0x4c4c4c)
        .iconSet(MaterialIconSet.SHINY)
        .appendFlags(SNDART_FLAGS)
        .toolStats(ToolProperty.Builder.of(32.0f, 10, 8192, 3).build())
        .blast(b -> b.temp(8200, BlastProperty.GasTier.HIGH))
        .buildAndRegister()
        .setFormula("Ad");

    NaquadahOxideMixture = builderISG("naquadah_oxide_mixture")
        .dust().ore()
        .color(0x4c4c4c)
        .iconSet(MaterialIconSet.METALLIC)
        .buildAndRegister()
        .setFormula("Nq?Ti?Ga?Ad?");

    LowQualityNaquadahEmulsion = builderISG("low_quality_naquadah_emulsion")
        .liquid()
        .color(0x4c4c4c)
        .iconSet(MaterialIconSet.FLUID)
        .buildAndRegister()
        .setFormula("Nq?Ga?Ad?");

    GalliumHydroxide = builderISG("gallium_hydroxide")
        .dust()
        .color(0xa6a6a6)
        .iconSet(MaterialIconSet.DULL)
        .components(Gallium, 1, Oxygen, 3, Hydrogen, 3)
        .buildAndRegister()
        .setFormula("Ga(OH)3");

    LowQualityNaquadahSolution = builderISG("low_quality_naquadah_solution")
        .liquid()
        .color(0x716262)
        .iconSet(MaterialIconSet.FLUID)
        .buildAndRegister()
        .setFormula("~Nq?Ad?~");

    TowEthyl1Hexanol = builderISG("tow_ethyl_1_hexanol")
        .langValue("2-Ethyl-1-Hexannol")
        .liquid()
        .color(0x80b557)
        .iconSet(MaterialIconSet.FLUID)
        .flags(MaterialFlags.DECOMPOSITION_BY_ELECTROLYZING)
        .components(Carbon, 8, Oxygen, 1, Hydrogen, 18)
        .buildAndRegister()
        .setFormula("C8H180", true);

    P507 = builderISG("p_507")
        .langValue("P-507")
        .liquid()
        .color(0x29c22a)
        .iconSet(MaterialIconSet.FLUID)
        .flags(MaterialFlags.DECOMPOSITION_BY_ELECTROLYZING)
        .components(Carbon, 16, Phosphorus, 1, Oxygen, 3, Hydrogen, 35)
        .buildAndRegister()
        .setFormula("(C8h17)2PO3H", true);

    NaquadahAdamantiumSolution = builderISG("naquadah_adamantium_solution")
        .langValue("Naquadah-Adamantium Solution")
        .liquid()
        .color(0x3d3838)
        .iconSet(MaterialIconSet.FLUID)
        .buildAndRegister()
        .setFormula("~NqAd~");

    NaquadahRichSolution = builderISG("naquadah_rich_solution")
        .langValue("Naquadah-Rich Solution")
        .liquid()
        .color(0x333333)
        .iconSet(MaterialIconSet.FLUID)
        .buildAndRegister()
        .setFormula("~Nq?~");

    Naquadahine = builderISG("naquadahine")
        .color(0x333333)
        .dust()
        .iconSet(MaterialIconSet.METALLIC)
        .components(Naquadah, 1, Oxygen, 2)
        .flags(MaterialFlags.DISABLE_DECOMPOSITION)
        .buildAndRegister()
        .setFormula("Nq02");

    FluorineRichWasteLiquid = builderISG("fluorine_rich_waste_liquid")
        .langValue("Fluorine-Rich Waste Liquid")
        .color(0x136862)
        .liquid()
        .iconSet(MaterialIconSet.FLUID)
        .buildAndRegister()
        .setFormula("??F??");

    WasteLiquid = builderISG("waste_liquid")
        .liquid()
        .color(0x141c68)
        .iconSet(MaterialIconSet.FLUID)
        .buildAndRegister()
        .setFormula("????");

    Adamantine = builderISG("adamantine")
        .ingot().fluid()
        .color(0xb7b7b7)
        .blastTemp(14400, HIGHER)
        .iconSet(MaterialIconSet.METALLIC)
        .flags(MaterialFlags.DECOMPOSITION_BY_ELECTROLYZING)
        .components(Adamantium, 2, Oxygen, 3)
        .cableProperties(GTValues.V[GTValues.UIV], 4, 128)
        .buildAndRegister()
        .setFormula("Ad2O3", true);

    EnrichedNaquadahOxideMixture = builderISG("enriched_naquadah_oxide_mixture")
        .langValue("Enriched-Naquadah Oxide Mixture")
        .dust().ore()
        .color(0x826868)
        .iconSet(MaterialIconSet.METALLIC)
        .radioactiveHazard(1)
        .buildAndRegister()
        .setFormula("Ke?Nq+?", true);

    TriniumSulphate = builderISG("trinium_sulphate")
        .dust()
        .color(0xdadada)
        .iconSet(MaterialIconSet.METALLIC)
        .components(Trinium, 1, Sulfur, 1, Oxygen, 4)
        .buildAndRegister()
        .setFormula("KeSO4", true);

    EnrichedNaquadahRichSolution = builderISG("enriched_naquadah_rich_solution")
        .langValue("Enriched-Naquadah Rich Solution")
        .liquid()
        .color(0x523939)
        .iconSet(MaterialIconSet.FLUID)
        .buildAndRegister()
        .setFormula("~Nq+?~", true);

    ConcentratedEnrichedNaquadahSludge = builderISG("concentrated_enriched_naquadah_sludge")
        .langValue("Concentrated Enriched-Naquadah Sludge")
        .dust()
        .color(0x523939)
        .iconSet(MaterialIconSet.METALLIC)
        .buildAndRegister()
        .setFormula("Nq+?", true);

    EnrichedNaquadahSulphate = builderISG("enriched_naquadah_sulphate")
        .langValue("Enriched-Naquadah Sulphate")
        .dust()
        .color(0x523939)
        .iconSet(MaterialIconSet.DULL)
        .components(NaquadahEnriched, 1, Sulfur, 2, Oxygen, 8)
        .flags(MaterialFlags.DISABLE_DECOMPOSITION)
        .buildAndRegister()
        .setFormula("Na+(SO4)2", true);

    NaquadriaOxideMixture = builderISG("naquadria_oxide_mixture")
        .dust().ore()
        .color(0x4d4d55)
        .iconSet(MaterialIconSet.METALLIC)
        .buildAndRegister()
        .setFormula("Nq*?Ba?In?");

    IndiumPhosphate = builderISG("indium_phosphate")
        .dust()
        .color(0x2b2e70)
        .iconSet(MaterialIconSet.DULL)
        .components(Indium, 1, Phosphorus, 1, Oxygen, 4)
        .buildAndRegister()
        .setFormula("InPO4");

    LowQualityNaquadriaPhosphate = builderISG("low_quality_naquadria_phosphate")
        .dust()
        .color(0x4d4d55)
        .iconSet(MaterialIconSet.DULL)
        .buildAndRegister()
        .setFormula("Nq*3(PO4)4");

    NaquadriaRichSolution = builderISG("naquadria_rich_solution")
        .langValue("Naquadria-Rich Solution")
        .liquid()
        .color(0x1f1e33)
        .iconSet(MaterialIconSet.FLUID)
        .buildAndRegister()
        .setFormula("~Nq*?~");

    LowQualityNaquadriaSulphate = builderISG("low_quality_naquadria_sulphate")
        .dust()
        .color(0x737284)
        .iconSet(MaterialIconSet.METALLIC)
        .buildAndRegister()
        .setFormula("Nq*(SO4)2");

    LowQualityNaquadriaSolution = builderISG("low_quality_naquadria_solution")
        .liquid()
        .color(0x737284)
        .iconSet(MaterialIconSet.METALLIC)
        .buildAndRegister()
        .setFormula("~Nq*?~");

    NaquadriaSulphate = builderISG("naquadria_sulphate")
        .dust()
        .color(0x1f1e33)
        .iconSet(MaterialIconSet.METALLIC)
        .flags(MaterialFlags.DISABLE_DECOMPOSITION)
        .components(Naquadria, 1, Sulfur, 2, Oxygen, 8)
        .buildAndRegister()
        .setFormula("Nq*(SO4)2", false);
  }
}
