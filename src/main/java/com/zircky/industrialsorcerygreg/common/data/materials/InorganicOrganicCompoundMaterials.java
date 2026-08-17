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



final class InorganicOrganicCompoundMaterials {
  private InorganicOrganicCompoundMaterials() {
  }

  static void register() {
    ManganeseIIIOxide = builderISG("manganese_iii_oxide")
        .dust()
        .color(GTMaterials.Pyrolusite.getMaterialRGB())
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("Mn2O3", true);

    MercuryChloride = builderISG("mercury_chloride")
        .dust()
        .color(0xd6b8ad)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("HgCl2", true);

    SodiumSulfanilate = builderISG("sodium_sulfanilate")
        .dust()
        .color(0xe49879)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("C6H6NNaO3S", true);

    Anthraquinone = builderISG("anthraquinone")
        .dust()
        .color(0xfff782)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("C14H8O2", true);

    LithiumHydride = builderISG("lithium_hydride")
        .dust()
        .color((GTMaterials.Lithium.getMaterialRGB() + GTMaterials.Hydrogen.getMaterialRGB()) / 2)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("LiH");

    NiobiumChloride = builderISG("niobium_chloride")
        .dust()
        .color(GTMaterials.Niobium.getMaterialRGB())
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("NbCl5", true);

    NiobiumHydroxide = builderISG("niobium_hydroxide")
        .dust()
        .color(0x7c7c7c)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Nb(OH)5", true);

    MagnesiumFluoride = builderISG("magnesium_fluoride")
        .dust()
        .color(0xcfcfcf)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("MgF2", true);

    LithiumNiobateNanoparticles = builderISG("lithium_niobate_nanoparticles")
        .dust()
        .color(ISGMaterials.LithiumNiobate.getMaterialRGB() - 10)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("LiNbO4", true);

    LithiumHydroxide = builderISG("lithium_hydroxide")
        .dust()
        .color((GTMaterials.Lithium.getMaterialRGB() + GTMaterials.Oxygen.getMaterialRGB() + GTMaterials.Hydrogen.getMaterialRGB()) / 3)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("LiOH");

    RhodiumRheniumNaquadahCatalyst = builderISG("rhodium_rhenium_naquadah")
        .dust()
        .color((GTMaterials.Rhenium.getMaterialRGB() + GTMaterials.Rhodium.getMaterialRGB() + GTMaterials.Naquadah.getMaterialRGB()) / 3)
        .iconSet(SHINY)
        .flags(ISGMaterialFlags.GENERATE_CATALYST)
        .buildAndRegister()
        .setFormula("ReRhNq");

    PalladiumAcetate = builderISG("palladium_acetate")
        .dust()
        .color(0xcc3300)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("C4H6O4Pd", true);

    FranciumCaesiumCadmiumBromide = builderISG("francium_caesium_cadmium_bromide")
        .dust()
        .color((GTMaterials.Francium.getMaterialRGB() + GTMaterials.Caesium.getMaterialRGB() + GTMaterials.Cadmium.getMaterialRGB() + GTMaterials.Bromine.getMaterialRGB()) / 4)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("FrCsCf2Br6");

    ZincSelenide = builderISG("zinc_selenide")
        .dust()
        .color(0xfcfc00)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("ZnSe");

    RhodamineB = builderISG("rhodamine_b")
        .dust()
        .color(0xfc2020)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("C28H31ClN2O3", true);

    Stilbene = builderISG("stilbene")
        .dust()
        .color(0x3c9c3c)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("C14H12", true);

    Tetracene = builderISG("tetracene")
        .dust()
        .color(0x99801a)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("C18H12", true);

    DitertbutylDicarbonate = builderISG("ditertbutyl_dicarbonate")
        .dust()
        .color(0xccccf6)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("C10H18O5", true);

    PotassiumBromide = builderISG("potassium_bromide")
        .dust()
        .color(0xe066a3)
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("KBr");

    PotassiumBromate = builderISG("potassium_bromate")
        .dust()
        .color(0x8a4cd1)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("KBrO3", true);

    IBX = builderISG("ibx")
        .langValue("Iodoxybenzoic Acid (IBX)")
        .dust()
        .color(0x20208c)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("C7H5IO4", true);

    SodiumPertechnetate = builderISG("sodium_pertechnetate")
        .dust()
        .color(0x6162c4)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("NaTcO4", true);

    PotassiumPertechnate = builderISG("potassium_pertechnate")
        .dust()
        .color(0xdec451)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("KTcO4", true);

    PotassiumPerrhenate = builderISG("potassium_perrhenate")
        .dust()
        .color(0xdec451)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("KReO4", true);

    PotassiumNonahydridotechnetate = builderISG("potassium_nonahydridotechnetate")
        .dust()
        .color(0xede2a4)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("H9K2TcO4", true);

    PotassiumNonahydridorhenate = builderISG("potassium_nonahydridorhenate")
        .dust()
        .color(0xeae2a8)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("H9K2ReO4", true);

    LithiumIodide = builderISG("lithium_iodide")
        .dust()
        .color((GTMaterials.Lithium.getMaterialRGB() + GTMaterials.Iodine.getMaterialRGB()))
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("LiI");

    PalladiumLoadedRutileNanoparticles = builderISG("palladium_loaded_rutile_nanoparticles")
        .dust()
        .color((GTMaterials.Palladium.getMaterialRGB() + GTMaterials.Rutile.getMaterialRGB()))
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("PdTiO2", true);

    SaccharicAcid = builderISG("saccharic_acid")
        .dust()
        .color(Glucose.getMaterialRGB())
        .iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("C6H10O8");

    AdipicAcid = builderISG("adipic_acid")
        .dust()
        .color(0xda9288)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("C6H10O4");

    TetraethylammoniumNonahydridides = builderISG("tetraethylammonium_nonahydrides")
        .dust()
        .color(0xbee8b9)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("(C8H20N)(ReH9)(TcH9)", true);

    ManganeseFluoride = builderISG("manganese_fluoride")
        .dust()
        .color(GTMaterials.Pyrolusite.getMaterialRGB())
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("MnF2", true);

    GermaniumSulfide = builderISG("germanium_sulfide")
        .dust()
        .color(GermaniumOxide.getMaterialRGB())
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("GeS2", true);

    BismuthGermanate = builderISG("bismuth_germanate")
        .dust()
        .color(0x94cf5c)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("Bi12GeO20", true);

    CesiumIodide = builderISG("cesium_iodide")
        .dust()
        .color(CaesiumHydroxide.getMaterialRGB())
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("CsI");

    TlTmCesiumIodide = builderISG("tl_tm_cesium_iodide")
        .langValue("Thallium Thulium Doped Caesium Iodide")
        .dust()
        .color(CaesiumHydroxide.getMaterialRGB() * 9 / 10 + GTMaterials.Thallium.getMaterialRGB() / 10)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("CsITlTm");

    CadmiumTungstate = builderISG("cadmium_tungstate")
        .dust()
        .color(ISGMaterials.CalciumTungstate.getMaterialRGB())
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("CdWO4", true);

    PolycyclicAromaticMix = builderISG("polycyclic_aromatic_mix")
        .dust()
        .color(Tetracene.getMaterialRGB())
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("C18H12", true);

    SodiumOxide = builderISG("sodium_oxide")
        .dust()
        .color(0x0373fc)
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("Na2O", true);

    GrapheneOxide = builderISG("graphene_oxide")
        .dust()
        .color(GTMaterials.Graphene.getMaterialRGB())
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("C(O2)", true);

    GraphiteOxide = builderISG("graphite_oxide")
        .dust()
        .color(GTMaterials.Graphite.getMaterialRGB())
        .iconSet(FINE)
        .buildAndRegister()
        .setFormula("C(O2)", true);

    GrapheneGelSuspension = builderISG("graphene_gel_suspension")
        .dust()
        .color(0xadadad)
        .iconSet(ROUGH)
        .buildAndRegister()
        .setFormula("C");

    DryGrapheneGel = builderISG("dry_graphene_gel")
        .dust()
        .color(0x3a3ada)
        .iconSet(DULL)
        .buildAndRegister()
        .setFormula("C");

    SodiumPerchlorate = builderISG("sodium_perchlorate")
        .dust()
        .color(GTMaterials.Salt.getMaterialRGB())
        .iconSet(SHINY)
        .buildAndRegister()
        .setFormula("NaClO4", true);

  }
}
