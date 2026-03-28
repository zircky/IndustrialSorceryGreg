package com.zircky.industrialsorcerygreg.common.data;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlag;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.IngotProperty;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.OreProperty;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
import com.zircky.industrialsorcerygreg.IndustrialSorceryGreg;
import com.zircky.industrialsorcerygreg.api.registries.ISGRegistries;
import com.zircky.industrialsorcerygreg.common.data.materials.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;

@SuppressWarnings("unused")
public class ISGMaterials {

  static {
    ISGRegistries.REGISTRATE.creativeModeTab(() -> ISGCreativeModeTabs.MATERIAL_ITEM);
  }

  public static final List<MaterialFlag> SNDART_FLAGS = new ArrayList<>();
  public static final List<MaterialFlag> GEM_FLAGS = new ArrayList<>();

  public static void init() {
    NuclearMaterials.register();
    CustemMaterials.register();
    PlatinumLine.register();
    NaquadahLine.register();
    ISGMaterialFlagAddition.register();
  }

  public static void modifyMaterials() {
    ISGModifyMaterials.init();
  }

  static {
    SNDART_FLAGS.addAll(Arrays.asList(GENERATE_PLATE, GENERATE_FOIL, GENERATE_DENSE, GENERATE_ROD, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_RING, GENERATE_ROUND, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_GEAR, GENERATE_SMALL_GEAR, GENERATE_ROTOR, GENERATE_FRAME, GENERATE_FINE_WIRE));
    GEM_FLAGS.addAll(Arrays.asList(GENERATE_PLATE, GENERATE_BOLT_SCREW, GENERATE_ROD, GENERATE_LONG_ROD, GENERATE_LENS));
  }


  public static Material ManganeseOxide; //
  public static Material NiobiumTin; //
  public static Material Zircaloy; //
  public static Material Thermoconducting; //
  public static Material ZirconiumMolybdenum; //
  public static Material Extreme; //
  public static Material TinSilver; //
  public static Material PyroliticCarbon; //
  public static Material ManganeseDioxide; //
  public static Material ToughAlloy; //
  public static Material Ferroboron; //
  public static Material SuperAlloy; //
  public static Material Aluminum; //
  public static Material SicSicCmc; //
  public static Material HardCarbon; //
//  public static Material Zirconium; //
//  public static Material Strontium;
  public static Material Strontium90;
  public static Material LithiumManganeseDioxide; //
  public static Material LeadPlatinum; //
//  public static Material Hafnium;

  public static Material BoronArsenide; //
  public static Material Carobbiite; //
  public static Material Villiaumite; //
  public static Material Fluorite; //
  public static Material BoronNitride; //
  public static Material Rhodochrosite; //

  public static Material Draconium;
  public static Material AwakenedDraconium;
  public static Material Chaos;
  public static Material Infinity;

  public static Material MarM200Steel; //

  // Platinum line
  public static Material PlatinumConcentrate;
  public static Material PlatinumSalt;
  public static Material RefinedPlatinumSalt;
  public static Material PlatinumMetallicPowder;
  public static Material ReprecipitatedPlatinum;
  public static Material PalladiumEnrichedAmmonia;
  public static Material PalladiumMetallicPowder;
  public static Material ReprecipitatedPalladium;
  public static Material PalladiumSalt;
  public static Material SodiumFormate;
  public static Material SodiumSulfate;
  public static Material PotassiumDisulfate;
  public static Material LeachResidue;
  public static Material RhodiumSulfateSolution;
  public static Material SodiumRuthenate;
  public static Material HotRutheniumTetroxideSolution;
  public static Material RutheniumTetroxideSolution;
  public static Material RarestMetalResidue;
  public static Material SludgeDustResidue;
  public static Material IridiumDioxide;
  public static Material OsmiumSolution;
  public static Material AcidicIridiumSolution;
  public static Material MetallicSludgeDustResidue;
  public static Material CrudeRhodiumMetal;
  public static Material RhodiumSalt;
  public static Material RhodiumSaltSolution;
  public static Material SodiumNitrate;
  public static Material RhodiumNitrate;
  public static Material ZincSulfate;
  public static Material RhodiumFilterCake;
  public static Material RhodiumFilterCakeSolution;
  public static Material ReprecipitatedRhodium;

  // Naquadah line
  public static Material Adamantium;
  public static Material NaquadahOxideMixture;
  public static Material LowQualityNaquadahEmulsion;
  public static Material GalliumHydroxide;
  public static Material LowQualityNaquadahSolution;
  public static Material TowEthyl1Hexanol;
  public static Material P507;
  public static Material NaquadahAdamantiumSolution;
  public static Material NaquadahRichSolution;
  public static Material Naquadahine;
  public static Material FluorineRichWasteLiquid;
  public static Material WasteLiquid;
  public static Material Adamantine;
  public static Material EnrichedNaquadahOxideMixture;
  public static Material TriniumSulphate;
  public static Material EnrichedNaquadahRichSolution;
  public static Material ConcentratedEnrichedNaquadahSludge;
  public static Material EnrichedNaquadahSulphate;
  public static Material NaquadriaOxideMixture;
  public static Material IndiumPhosphate;
  public static Material LowQualityNaquadriaPhosphate;
  public static Material NaquadriaRichSolution;
  public static Material LowQualityNaquadriaSulphate;
  public static Material LowQualityNaquadriaSolution;
  public static Material NaquadriaSulphate;



  public static void addIngot(Material material) {
    material.setProperty(PropertyKey.INGOT, new IngotProperty());
  }

  public static void addOre(Material material) {
    material.setProperty(PropertyKey.ORE, new OreProperty());
  }


  public static Material.Builder builderISG(String id) {
    return new Material.Builder(IndustrialSorceryGreg.id(id));
  }
}
