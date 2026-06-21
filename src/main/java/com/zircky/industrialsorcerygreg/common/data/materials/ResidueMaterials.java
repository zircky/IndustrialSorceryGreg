package com.zircky.industrialsorcerygreg.common.data.materials;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.ToolProperty;
import com.gregtechceu.gtceu.api.fluids.FluidBuilder;
import com.gregtechceu.gtceu.api.fluids.FluidState;
import com.gregtechceu.gtceu.api.fluids.attribute.FluidAttributes;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;
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


public final class ResidueMaterials {
  private ResidueMaterials() {
  }

  public static void register() {
    StoneResidueDust = builderISG("stone_residue_dust")
        .dust()
        .color(GTMaterials.Stone.getMaterialRGB() / 5 * 3)
        .iconSet(ROUGH)
        .buildAndRegister();

    DiamagneticResidues = builderISG("diamagnetic_residues")
        .dust()
        .color((GTMaterials.Calcium.getMaterialRGB() + GTMaterials.Zinc.getMaterialRGB() + GTMaterials.Copper.getMaterialRGB() + GTMaterials.Gallium.getMaterialRGB() + GTMaterials.Beryllium.getMaterialRGB() + GTMaterials.Tin.getMaterialRGB()) / 15)
        .iconSet(DULL)
        .buildAndRegister();

    HeavyDiamagneticResidues = builderISG("heavy_diamagnetic_residues")
        .dust()
        .color((GTMaterials.Lead.getMaterialRGB() + GTMaterials.Mercury.getMaterialRGB() + GTMaterials.Cadmium.getMaterialRGB() + GTMaterials.Indium.getMaterialRGB() + GTMaterials.Gold.getMaterialRGB() + GTMaterials.Bismuth.getMaterialRGB()) / 15)
        .iconSet(DULL)
        .buildAndRegister();

    ParamagneticResidues = builderISG("paramagnetic_residues")
        .dust()
        .color((GTMaterials.Sodium.getMaterialRGB() + GTMaterials.Potassium.getMaterialRGB() + GTMaterials.Magnesium.getMaterialRGB() + GTMaterials.Titanium.getMaterialRGB() + GTMaterials.Vanadium.getMaterialRGB() + GTMaterials.Manganese.getMaterialRGB()) / 15)
        .iconSet(DULL)
        .buildAndRegister();

    HeavyParamagneticResidues = builderISG("heavy_paramagnetic_residues")
        .dust()
        .color((GTMaterials.Thorium.getMaterialRGB() + GTMaterials.Thallium.getMaterialRGB() + GTMaterials.Uranium238.getMaterialRGB() + GTMaterials.Tungsten.getMaterialRGB() + GTMaterials.Hafnium.getMaterialRGB() + GTMaterials.Tantalum.getMaterialRGB()) / 15)
        .iconSet(DULL)
        .buildAndRegister();

    FerromagneticResidues = builderISG("ferromagnetic_residues")
        .dust()
        .color((GTMaterials.Iron.getMaterialRGB() + GTMaterials.Nickel.getMaterialRGB() + GTMaterials.Cobalt.getMaterialRGB()) / 7)
        .iconSet(DULL)
        .buildAndRegister();

    HeavyFerromagneticResidues = builderISG("heavy_ferromagnetic_residues")
        .dust()
        .color(DysprosiumOxide.getMaterialRGB() * 3 / 11)
        .iconSet(DULL)
        .buildAndRegister();

    UncommonResidues = builderISG("uncommon_residues")
        .dust()
        .color((ISGMaterials.Triniite.getMaterialRGB() + ISGMaterials.NaquadriaticTaranium.getMaterialRGB() + PreciousMetals.getMaterialRGB()) / 5)
        .iconSet(FINE)
        .buildAndRegister();

    PartiallyOxidizedResidues = builderISG("partially_oxidized_residues")
        .dust()
        .color(StoneResidueDust.getMaterialRGB() + Dioxygendifluoride.getMaterialRGB())
        .iconSet(DULL)
        .buildAndRegister();

    MetallicResidues = builderISG("metallic_residues")
        .dust()
        .color((DiamagneticResidues.getMaterialRGB() + ParamagneticResidues.getMaterialRGB() + FerromagneticResidues.getMaterialRGB() + UncommonResidues.getMaterialRGB() / 3) / 4)
        .iconSet(DULL)
        .buildAndRegister();

    HeavyMetallicResidues = builderISG("heavy_metallic_residues")
        .dust()
        .color((HeavyDiamagneticResidues.getMaterialRGB() + HeavyParamagneticResidues.getMaterialRGB() + HeavyFerromagneticResidues.getMaterialRGB() + UncommonResidues.getMaterialRGB() / 3) / 4)
        .iconSet(DULL)
        .buildAndRegister();

    OxidizedResidues = builderISG("oxidized_residues")
        .dust()
        .color((DiamagneticResidues.getMaterialRGB() + ParamagneticResidues.getMaterialRGB() + FerromagneticResidues.getMaterialRGB() + 0x9f0000) / 4)
        .iconSet(DULL)
        .buildAndRegister();

    HeavyOxidizedResidues = builderISG("heavy_oxidized_residues")
        .dust()
        .color((DiamagneticResidues.getMaterialRGB() + ParamagneticResidues.getMaterialRGB() + FerromagneticResidues.getMaterialRGB() + 0x9f0000) / 4)
        .iconSet(DULL)
        .buildAndRegister();

    ExoticHeavyResidues = builderISG("exotic_heavy_residues")
        .dust()
        .color(NitratedTriniiteSolution.getMaterialRGB())
        .iconSet(SHINY)
        .buildAndRegister();

    CleanInertResidues = builderISG("clean_inert_residues")
        .dust()
        .color((ISGMaterials.Taranium.getMaterialRGB() + GTMaterials.Xenon.getMaterialRGB()) / 2)
        .iconSet(SHINY)
        .buildAndRegister();

    IridiumCyclooctadienylChlorideDimer = builderISG("iridium_cyclooctadienyl_chloride_dimer")
        .dust()
        .color((Dichlorocycloctadieneplatinium.getMaterialRGB() + GTMaterials.Iridium.getMaterialRGB()) / 2)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Ir2(C8H12)2Cl2", true);

    FinelyPowderedRutile = builderISG("finely_powdered_rutile")
        .dust()
        .color(0xffffff)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("TiO2", true);

    InertResidues = builderISG("inert_residues")
        .dust()
        .color(0x61587a)
        .iconSet(SHINY)
        .buildAndRegister();
  }
}
