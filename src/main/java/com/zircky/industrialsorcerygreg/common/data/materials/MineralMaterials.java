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


public final class MineralMaterials {
  private MineralMaterials() {
  }

  public static void register() {
    CalciumTungstate = builderISG("calcium_tungstate")
        .dust(0)
        .color(0x6e6867)
        .iconSet(SHINY)
        .components(GTMaterials.Tungsten, 1, GTMaterials.Calcium, 1, GTMaterials.Oxygen, 4)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    TungstenTrioxide = builderISG("tungsten_trioxide")
        .dust(0)
        .color(0x99FF97)
        .iconSet(GTMaterials.Tungsten.getMaterialIconSet())
        .components(GTMaterials.Tungsten, 1, GTMaterials.Oxygen, 3)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    TungstenHexachloride = builderISG("tungsten_hexachloride")
        .dust(0)
        .color(0x533f75)
        .iconSet(METALLIC)
        .components(GTMaterials.Tungsten, 1, GTMaterials.Chlorine, 6)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    NaquadricCompound = builderISG("naquadric_compound")
        .ore()
        .dust()
        .color(GTMaterials.Naquadah.getMaterialRGB())
        .iconSet(GTMaterials.Naquadah.getMaterialIconSet())
        .buildAndRegister();

    EnrichedNaquadricCompound = builderISG("enriched_naquadric_compound")
        .ore().dust()
        .color(GTMaterials.NaquadahEnriched.getMaterialRGB())
        .iconSet(GTMaterials.NaquadahEnriched.getMaterialIconSet())
        .buildAndRegister();

    NaquadriaticCompound = builderISG("naquadriatic_compound")
        .ore()
        .dust(GTMaterials.Naquadria.getBlockHarvestLevel())
        .color(GTMaterials.Naquadria.getMaterialRGB())
        .iconSet(GTMaterials.Naquadria.getMaterialIconSet())
        .buildAndRegister();

    Caliche = builderISG("caliche")
        .ore()
        .dust(3)
        .color(0xeb9e3f)
        .iconSet(DULL)
        .components(SodiumNitrate, 1,GTMaterials.Potassium, 1, GTMaterials.Nitrogen, 1, GTMaterials.Oxygen, 3, GTMaterials.RockSalt, 1, GTMaterials.Sodium, 1, GTMaterials.Iodine, 1, GTMaterials.Oxygen, 3)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    Rhodocrosite = builderISG("rhodocrosite")
        .ore()
        .dust(2)
        .color(0xff6699)
        .iconSet(SHINY)
        .components(GTMaterials.Manganese, 1, GTMaterials.Carbon, 1, GTMaterials.Oxygen, 3)
        .buildAndRegister();

    Columbite = builderISG("columbite")
        .ore()
        .dust(2)
        .color(0xCCCC00)
        .iconSet(SHINY)
        .components(GTMaterials.Iron, 1, GTMaterials.Niobium, 2, GTMaterials.Oxygen, 6)
        .buildAndRegister();

    FluoroApatite = builderISG("fluoroapatite")
        .ore()
        .dust(2)
        .color(GTMaterials.Apatite.getMaterialRGB())
        .iconSet(DULL)
        .components(GTMaterials.Calcium, 5, GTMaterials.Phosphate, 3, GTMaterials.Fluorine, 1)
        .buildAndRegister();

    NdYAG = builderISG("nd_yag")
        .langValue("Neodymium Yttrium Aluminium Garnet")
        .dust(6)
        .color(0xcf8acf)
        .iconSet(SHINY)
        .buildAndRegister();

    PrHoYLF = builderISG("prho_ylf")
        .langValue("Praseodymium Holmium Yttrium Lithium Fluoride")
        .dust(6)
        .color(0x6f20af)
        .iconSet(SHINY)
        .buildAndRegister();

    LuTmYVO = builderISG("lutm_yvo")
        .langValue("Lutetium Thulium Yttrium Vanadate")
        .dust(6)
        .color(0x206faf)
        .iconSet(SHINY)
        .buildAndRegister();

    IndiumPhospide = builderISG("indium_phosphide")
        .dust(6)
        .color(0x5c9c9c)
        .iconSet(SHINY)
        .components(GTMaterials.Indium, 1, GTMaterials.Phosphorus, 1)
        .buildAndRegister();

    Barytocalcite = builderISG("barytocalcite")
        .ore()
        .dust(2)
        .color(0xbf9c7c)
        .iconSet(SHINY)
        .components(GTMaterials.Barium, 1, GTMaterials.Calcium, 1, GTMaterials.Carbon, 2, GTMaterials.Oxygen, 6)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    Witherite = builderISG("witherite")
        .ore()
        .dust(2)
        .color(0xc6c29d)
        .iconSet(ROUGH)
        .components(GTMaterials.Barium, 1, GTMaterials.Carbon, 1, GTMaterials.Oxygen, 3)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    Arsenopyrite = builderISG("arsenopyrite")
        .ore()
        .dust(2)
        .color(0xaa9663)
        .iconSet(METALLIC)
        .components(GTMaterials.Iron, 1, GTMaterials.Arsenic, 1, GTMaterials.Sulfur, 1)
        .buildAndRegister();

    Gallite = builderISG("gallite")
        .ore()
        .dust(2)
        .color(0x7f7b9e)
        .iconSet(SHINY)
        .components(GTMaterials.Copper, 1, GTMaterials.Gallium, 1, GTMaterials.Sulfur, 2)
        .buildAndRegister();

    Bowieite = builderISG("bowieite")
        .ore()
        .dust(2)
        .color(0x8b8995)
        .iconSet(ROUGH)
        .components(GTMaterials.Rhodium, 1, GTMaterials.Iridium, 1, GTMaterials.Platinum, 1, GTMaterials.Sulfur, 3)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    Celestine = builderISG("celestine")
        .ore()
        .dust(2)
        .color(0x9db1b8)
        .iconSet(SHINY)
        .components(GTMaterials.Strontium, 1, GTMaterials.Sulfur, 1, GTMaterials.Oxygen, 4)
        .buildAndRegister();

    CubicZirconia = builderISG("cubic_zirconia")
        .gem(6)
        .color(0xFFDFE2)
        .iconSet(DIAMOND)
        .components(GTMaterials.Zirconium, 1, GTMaterials.Oxygen, 2)
        .buildAndRegister();

    Prasiolite = builderISG("prasiolite")
        .ore()
        .gem(2)
        .color(0x9EB749)
        .iconSet(QUARTZ)
        .components(GTMaterials.Silicon, 5, GTMaterials.Oxygen, 10, GTMaterials.Iron, 1)
        .buildAndRegister();

    MagnetoResonatic = builderISG("magneto_resonatic")
        .gem(2)
        .color(0xFF97FF)
        .iconSet(MAGNETIC)
        .components(ISGMaterials.Prasiolite, 3, ISGMaterials.BismuthTellurite, 6, ISGMaterials.CubicZirconia, 1, GTMaterials.SteelMagnetic, 1)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    Zircon = builderISG("zircon")
        .ore()
        .gem(3)
        .color(0xeb9e3f)
        .iconSet(GEM_VERTICAL)
        .components(GTMaterials.Zirconium, 1, GTMaterials.Silicon, 1, GTMaterials.Oxygen, 4)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    LeadZirconateTitanate = builderISG("lead_zirconate_titanate")
        .gem(3)
        .color(0x359ade)
        .iconSet(OPAL)
        .components(GTMaterials.Lead, 1, GTMaterials.Zirconium, 1, GTMaterials.Titanium, 1, GTMaterials.Oxygen, 3)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

  }
}
