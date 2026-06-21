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


public final class BiologicalMaterials {
  private BiologicalMaterials() {
  }

  public static void register() {
    Turpentine = builderISG("turpentine")
        .fluid()
        .color(0x93bd46)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C10H16", true);

    Acetylene = builderISG("acetylene")
        .fluid()
        .color(0x959c60)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C2H2", true);

    PropargylAlcohol = builderISG("propargyl_alcohol")
        .fluid()
        .color(0xbfb32a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("CHCCH2OH", true);

    PropargylChloride = builderISG("propargyl_chloride")
        .fluid()
        .color(0x918924)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("HC2CH2Cl", true);

    Citral = builderISG("citral")
        .fluid()
        .color(0xf2e541)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C10H16O", true);

    BetaIonone = builderISG("beta_ionone")
        .fluid()
        .color(0xdc5ce6)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C13H20O", true);

    VitaminA = builderISG("vitamin_a")
        .fluid()
        .color(0x8d5c91)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C20H30O", true);

    EthyleneOxide = builderISG("ethylene_oxide")
        .fluid()
        .color(0xa0c3de)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C2H4O", true);

    Ethanolamine = builderISG("ethanolamine")
        .fluid()
        .color(0x6f7d87)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("HOCH2CH2NH2", true);

    Biotin = builderISG("biotin")
        .fluid()
        .color(0x68cc6a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C10H16N2O3S", true);

    B27Supplement = builderISG("b27_supplement")
        .fluid()
        .color(0x386939)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C142H230N36O44S", true);

    CleanAmmoniaSolution = builderISG("clear_ammonia_solution")
        .fluid()
        .color(0x53c9a0)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("NH3(H2O)", true);

    Catalase = builderISG("catalase")
        .fluid()
        .color(0xdb6596)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

    Blood = builderISG("blood")
        .fluid().plasma()
        .color(0x5c0606)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Blood");

    BFGF = builderISG("bfgf")
        .langValue("Basic fibroblast growth factor")
        .fluid()
        .color(0xb365e0)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("bFGF");

    EGF = builderISG("egf")
        .langValue("Epidermal growth factor")
        .fluid()
        .color(0x815799)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C257H381N73O83S7", true);

    NitroBenzene = builderISG("nitro_benzene")
        .fluid()
        .color(0x81c951)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6H5NO2", true);

    Aniline = builderISG("aniline")
        .fluid()
        .color(0x4c911d)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6H5NH2", true);

    ChlorosulfonicAcid = builderISG("chlorosulfonic_acid")
        .liquid(new FluidBuilder().attribute(FluidAttributes.ACID))
        .color(0x916c1d)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("HSO3Cl", true);

    Sulfanilamide = builderISG("sulfanilamide")
        .fluid()
        .color(0x523b0a)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C6H8N2O2S", true);

    SilicaGelBase = builderISG("silica_gel_base")
        .fluid()
        .color(0x27a176)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("SiO2(HCl)(NaOH)(H2O)", true);

    Ethanol100 = builderISG("ethanol_100")
        .fluid()
        .color(GTMaterials.Ethanol.getMaterialRGB())
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("C2H5OH", true);

    PiranhaSolution = builderISG("piranha_solution")
        .fluid()
        .color(0x4820ab)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(H2SO4)H2O2", true);

    WaterAgarMix = builderISG("water_agar_mix")
        .fluid()
        .color(0x48dbbe)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("H2O?", true);

    BacterialGrowthMedium = builderISG("bacterial_growth_medium")
        .fluid()
        .color(0x0b2e12)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("For Bacteria");

    DepletedGrowthMedium = builderISG("depleted_growth_medium")
        .fluid()
        .color(0x071209)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("Depleted");

    AnimalCells = builderISG("animal_cells")
        .fluid()
        .color(0xc94996)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("???");

    RapidlyReplicatingAnimalCells = builderISG("rapidly_replicating_animal_cells")
        .fluid()
        .color(0x7a335e)
        .iconSet(FLUID)
        .buildAndRegister();

    MycGene = builderISG("myc_gene")
        .fluid()
        .color(0x445724)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

    Oct4Gene = builderISG("oct_4_gene")
        .langValue("Oct-4 Gene")
        .fluid()
        .color(0x374f0d)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

    SOX2Gene = builderISG("sox_2_gene")
        .langValue("SOX-2 Gene")
        .fluid()
        .color(0x5d8714)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

    KFL4Gene = builderISG("kfl_4_gene")
        .langValue("KFL-4 Gene")
        .fluid()
        .color(0x759143)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

    Cas9 = builderISG("cas_9")
        .langValue("Cas-9")
        .fluid()
        .color(0x5f6e46)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

    GenePlasmids = builderISG("pluripotency_induction_gene_plasmids")
        .fluid()
        .color(0xabe053)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

    Chitin = builderISG("chitin")
        .fluid()
        .color(0xcbd479)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

    Chitosan = builderISG("chitosan")
        .fluid()
        .color(0xb1bd42)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

    GeneTherapyFluid = builderISG("pluripotency_induction_gene_therapy_fluid")
        .fluid()
        .color(0x6b2f66)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

    Resin = builderISG("resin")
        .fluid()
        .color(0x3d2f11)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("?");

  }
}
