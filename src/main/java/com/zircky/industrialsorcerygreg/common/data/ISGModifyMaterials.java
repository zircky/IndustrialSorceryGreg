package com.zircky.industrialsorcerygreg.common.data;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.*;
import com.gregtechceu.gtceu.api.fluids.FluidBuilder;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKey;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.zircky.industrialsorcerygreg.api.data.material.ISGMaterialFlags;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.GENERATE_BOLT_SCREW;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.GENERATE_FINE_WIRE;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.GENERATE_FRAME;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.GENERATE_GEAR;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.GENERATE_LONG_ROD;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.GENERATE_RING;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.GENERATE_ROD;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.GENERATE_ROTOR;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.GENERATE_ROUND;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.GENERATE_SMALL_GEAR;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.GENERATE_SPRING;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.GENERATE_SPRING_SMALL;
import static com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey.BLAST;
import static com.zircky.industrialsorcerygreg.api.data.material.ISGMaterialFlags.*;

public class ISGModifyMaterials {
  public static void init() {

    GTMaterials.Hafnium.addFlags(GENERATE_PLATE, GENERATE_FOIL, GENERATE_DENSE, GENERATE_ROD, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_RING, GENERATE_ROUND, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_GEAR, GENERATE_SMALL_GEAR, GENERATE_ROTOR, GENERATE_FRAME, GENERATE_FINE_WIRE);
    GTMaterials.Zirconium.addFlags(GENERATE_PLATE, GENERATE_FOIL, GENERATE_DENSE, GENERATE_ROD, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_RING, GENERATE_ROUND, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_GEAR, GENERATE_SMALL_GEAR, GENERATE_ROTOR, GENERATE_FRAME, GENERATE_FINE_WIRE);
    GTMaterials.Strontium.addFlags(GENERATE_PLATE, GENERATE_FOIL, GENERATE_DENSE, GENERATE_ROD, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_RING, GENERATE_ROUND, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_GEAR, GENERATE_SMALL_GEAR, GENERATE_ROTOR, GENERATE_FRAME, GENERATE_FINE_WIRE);

    GTMaterials.Platinum.addFlags(NO_SMELTING, NO_ORE_SMELTING, GENERATE_MILLED, GENERATE_CATALYST);
    GTMaterials.Platinum.setProperty(BLAST, new BlastProperty(1810, BlastProperty.GasTier.MID, 480, 820, 120, 110));

    GTMaterials.Iron.addFlags(GENERATE_NANITES, GENERATE_DOUBLE_INGOT, GENERATE_TRIPLE_INGOT, GENERATE_QUADRUPLE_INGOT, GENERATE_QUINTUPLE_INGOT, GENERATE_TRIPLE_PLATE, GENERATE_QUADRUPLE_PLATE, GENERATE_QUINTUPLE_PLATE, GENERATE_SUPERDENSE, GENERATE_SINGULARITY);
    GTMaterials.Aluminium.addFlags(GENERATE_DOUBLE_INGOT, GENERATE_TRIPLE_INGOT, GENERATE_QUADRUPLE_INGOT, GENERATE_QUINTUPLE_INGOT, GENERATE_TRIPLE_PLATE, GENERATE_QUADRUPLE_PLATE, GENERATE_QUINTUPLE_PLATE, GENERATE_SUPERDENSE, GENERATE_SINGULARITY, ISGMaterialFlags.GENERATE_COMPONENT, GENERATE_FOIL);
    GTMaterials.Steel.addFlags(GENERATE_DOUBLE_INGOT, GENERATE_TRIPLE_INGOT, GENERATE_QUADRUPLE_INGOT, GENERATE_QUINTUPLE_INGOT, GENERATE_TRIPLE_PLATE, GENERATE_QUADRUPLE_PLATE, GENERATE_QUINTUPLE_PLATE, GENERATE_SUPERDENSE, GENERATE_SINGULARITY, ISGMaterialFlags.GENERATE_COMPONENT);
    GTMaterials.Silver.addFlags(GENERATE_NANITES, GENERATE_DOUBLE_INGOT, GENERATE_TRIPLE_INGOT, GENERATE_QUADRUPLE_INGOT, GENERATE_QUINTUPLE_INGOT, GENERATE_TRIPLE_PLATE, GENERATE_QUADRUPLE_PLATE, GENERATE_QUINTUPLE_PLATE, GENERATE_SUPERDENSE, GENERATE_SINGULARITY);
    GTMaterials.Diamond.addFlags(GENERATE_DOUBLE_PLATE, GENERATE_TRIPLE_PLATE, GENERATE_QUADRUPLE_PLATE, GENERATE_QUINTUPLE_PLATE, GENERATE_SUPERDENSE, GENERATE_SINGULARITY);
    GTMaterials.TitaniumTungstenCarbide.addFlags(GENERATE_DENSE);
    GTMaterials.CertusQuartz.addFlags(GENERATE_BOLT_SCREW);
    GTMaterials.Darmstadtium.addFlags(GENERATE_CATALYST, GENERATE_GEAR);
    GTMaterials.Ruthenium.addFlags(GENERATE_PLATE);
    GTMaterials.Trinium.addFlags(GENERATE_PLATE);
    GTMaterials.BlackSteel.addFlags(GENERATE_FOIL);
    GTMaterials.Cupronickel.addFlags(GENERATE_NANITES, GENERATE_FOIL);
    GTMaterials.RutheniumTriniumAmericiumNeutronate.addFlags(GENERATE_FOIL);
    GTMaterials.VanadiumGallium.addFlags(GENERATE_ROD);
//    GTMaterials.Polybenzimidazole.addFlags(GENERATE_PLATE); // ?
    GTMaterials.Thallium.addFlags(GENERATE_FOIL);
    GTMaterials.Barium.addFlags(GENERATE_FOIL);
    GTMaterials.Copper.addFlags(GENERATE_NANITES, GENERATE_FOIL);
    GTMaterials.Calcium.addFlags(GENERATE_FOIL);
    GTMaterials.Electrum.addFlags(GENERATE_FOIL);
//    GTMaterials.NeodymiumMagnetic.addFlags(GENERATE_LONG_ROD);
    GTMaterials.YttriumBariumCuprate.addFlags(GENERATE_LONG_ROD);
    GTMaterials.Iron.addFlags(GENERATE_FINE_WIRE);
    GTMaterials.RhodiumPlatedPalladium.addFlags(GENERATE_GEAR);

    GTMaterials.Neutronium.addFlags(ISGMaterialFlags.GENERATE_NANITES, GENERATE_DENSE, GENERATE_FOIL, GENERATE_RING);
    GTMaterials.Carbon.addFlags(GENERATE_NANITES);
    GTMaterials.Glowstone.addFlags(GENERATE_NANITES);
    GTMaterials.Gold.addFlags(GENERATE_NANITES);
    GTMaterials.Osmium.addFlags(GENERATE_NANITES);
    GTMaterials.Iridium.addFlags(GENERATE_NANITES);
    GTMaterials.Rhenium.addFlags(GENERATE_NANITES, GENERATE_PLATE, GENERATE_FINE_WIRE);

    GTMaterials.Neutronium.setProperty(PropertyKey.WIRE, new WireProperties(GTValues.V[GTValues.UIV], 2, 64));

    GTMaterials.Steel.addFlags(ISGMaterialFlags.GENERATE_COMPONENT);
    GTMaterials.StainlessSteel.addFlags(ISGMaterialFlags.GENERATE_COMPONENT);
    GTMaterials.Titanium.addFlags(ISGMaterialFlags.GENERATE_COMPONENT);
    GTMaterials.TungstenSteel.addFlags(ISGMaterialFlags.GENERATE_COMPONENT);
    GTMaterials.HSSS.addFlags(ISGMaterialFlags.GENERATE_COMPONENT);
    GTMaterials.Osmiridium.addFlags(ISGMaterialFlags.GENERATE_COMPONENT);
    GTMaterials.Tritanium.addFlags(ISGMaterialFlags.GENERATE_COMPONENT);
    GTMaterials.Naquadria.addFlags(GENERATE_FRAME);
    GTMaterials.Naquadah.addFlags(GENERATE_FRAME);
    GTMaterials.DamascusSteel.addFlags(GENERATE_FRAME);
    GTMaterials.Rutile.addFlags(GENERATE_PLATE);

    GTMaterials.Ruby.addFlags(DECOMPOSITION_BY_ELECTROLYZING, DISABLE_DECOMPOSITION);
    GTMaterials.RubySlurry.addFlags(DECOMPOSITION_BY_CENTRIFUGING);
    GTMaterials.Chromite.addFlags(DECOMPOSITION_BY_ELECTROLYZING, DISABLE_DECOMPOSITION);

    addIngot(GTMaterials.Potassium);
    addIngot(GTMaterials.Hafnium);
    addIngot(GTMaterials.Zirconium);
    addIngot(GTMaterials.Strontium);
    addIngot(GTMaterials.Scandium);
    addIngot(GTMaterials.Rhenium);
    addIngot(GTMaterials.Radium);
    addIngot(GTMaterials.Protactinium);
    addIngot(GTMaterials.Francium);
    addIngot(GTMaterials.Germanium);
    addIngot(GTMaterials.Californium);
    addIngot(GTMaterials.Einsteinium);
    addIngot(GTMaterials.Fermium);
    addIngot(GTMaterials.Mendelevium);
    addIngot(GTMaterials.Curium);
    addIngot(GTMaterials.Actinium);
    addIngot(GTMaterials.Technetium);
    addIngot(GTMaterials.Thallium);
    addIngot(GTMaterials.Astatine);
    addIngot(GTMaterials.Rutherfordium);
    addIngot(GTMaterials.Dubnium);
    addIngot(GTMaterials.Seaborgium);
    addIngot(GTMaterials.Bohrium);
    addIngot(GTMaterials.Tennessine);
    addIngot(GTMaterials.Livermorium);
    addIngot(GTMaterials.Moscovium);
    addIngot(GTMaterials.Nihonium);
    addIngot(GTMaterials.Roentgenium);
    addIngot(GTMaterials.Meitnerium);
    addIngot(GTMaterials.Neptunium);
    addIngot(GTMaterials.Polonium);
    addIngot(GTMaterials.Copernicium);
    addIngot(GTMaterials.Barium);
    addIngot(GTMaterials.Ferrosilite);

    addDust(GTMaterials.Tellurium);
    addDust(GTMaterials.Selenium);
    addDust(GTMaterials.Dysprosium);
//    addDust(GTMaterials.Graphite);
    addDust(GTMaterials.Erbium);
    addDust(GTMaterials.Praseodymium);
    addDust(GTMaterials.Holmium);
    addDust(GTMaterials.Thulium);
    addDust(GTMaterials.Rubidium);
//    addDust(GTMaterials.RawRubber);
    addDust(GTMaterials.Gadolinium);
    addDust(GTMaterials.Terbium);
    addDust(GTMaterials.Ytterbium);
//    addDust(GTMaterials.YellowLimonite);
    addDust(GTMaterials.Promethium);
    addDust(GTMaterials.Berkelium);
//    addDust(GTMaterials.Polycaprolactam);

  }

  public static void initFluidStorage() {
    addLiquid(GTMaterials.Scandium);
    addLiquid(GTMaterials.Radium);
    addLiquid(GTMaterials.Calcium);
    addLiquid(GTMaterials.Hafnium);
    addLiquid(GTMaterials.PotassiumHydroxide);
    addLiquid(GTMaterials.AmmoniumChloride);
    addLiquid(GTMaterials.RutheniumTetroxide);
    addLiquid(GTMaterials.Neptunium);
    addLiquid(GTMaterials.Dubnium);
    addLiquid(GTMaterials.Seaborgium);
    addLiquid(GTMaterials.Meitnerium);
    addLiquid(GTMaterials.Tennessine);
    addLiquid(GTMaterials.Livermorium);
    addLiquid(GTMaterials.Moscovium);
    addLiquid(GTMaterials.Nihonium);
    addLiquid(GTMaterials.Roentgenium);
    addLiquid(GTMaterials.Polonium);
    addLiquid(GTMaterials.Copernicium);
    addLiquid(GTMaterials.Rutherfordium);
    addLiquid(GTMaterials.Astatine);
    addLiquid(GTMaterials.Sodium);
    addLiquid(GTMaterials.Rubidium);
    addLiquid(GTMaterials.Caesium);
    addLiquid(GTMaterials.Francium);
    addLiquid(GTMaterials.Praseodymium);
    addLiquid(GTMaterials.Ytterbium);
    addLiquid(GTMaterials.Mendelevium);
    addLiquid(GTMaterials.Einsteinium);
    addLiquid(GTMaterials.Protactinium);
    addLiquid(GTMaterials.Germanium);
    addLiquid(GTMaterials.Californium);
    addLiquid(GTMaterials.Fermium);
    addLiquid(GTMaterials.Curium);
    addLiquid(GTMaterials.Technetium);
    addLiquid(GTMaterials.Thallium);
    addLiquid(GTMaterials.Bohrium);

    addPlasma(GTMaterials.Potassium);
    addPlasma(GTMaterials.Neon);
    addPlasma(GTMaterials.Hydrogen);
    addPlasma(GTMaterials.Helium3);
  }


  private static void addIngot(Material material) {
    material.setProperty(PropertyKey.INGOT, new IngotProperty());
  }

  private static void addDust(Material material) {
    material.setProperty(PropertyKey.DUST, new DustProperty());
  }

  private static void addLiquid(Material material) {
    addFluid(material, FluidStorageKeys.LIQUID);
  }

  private static void addPlasma(Material material) {
    addFluid(material, FluidStorageKeys.PLASMA);
  }

  private static void addGas(Material material) {
    addFluid(material, FluidStorageKeys.GAS);
  }

  private static void addFluid(Material material, FluidStorageKey key) {
    FluidProperty property;
    if (material.hasProperty(PropertyKey.FLUID)) {
      property = material.getProperty(PropertyKey.FLUID);
      if (property.get(key) != null || property.getQueuedBuilder(key) != null) {
        return;
      }
      property.enqueueRegistration(key, new FluidBuilder());
    } else {
      material.setProperty(PropertyKey.FLUID, new FluidProperty(key, new FluidBuilder()));
    }
  }

  public static void addOre(Material material) {
    material.setProperty(PropertyKey.ORE, new OreProperty());
  }



}
