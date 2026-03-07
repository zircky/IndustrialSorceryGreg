package com.zircky.industrialsorcerygreg.common.data.materials;

import com.gregtechceu.gtceu.api.data.chemical.material.properties.OreProperty;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.zircky.industrialsorcerygreg.common.data.ISGMaterials;

import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;

public class ISGMaterialFlagAddition {
  public static void register() {

    OreProperty oreProperty = Nickel.getProperty(PropertyKey.ORE);
    oreProperty.getOreByProducts().clear();
    oreProperty.setOreByProducts(Cobalt, Iron, PlatinumMetallicPowder);
    oreProperty.setSeparatedInto(Iron);
    oreProperty.setWashedIn(Mercury);

    oreProperty = Platinum.getProperty(PropertyKey.ORE);
    oreProperty.getOreByProducts().clear();
    oreProperty.setOreByProducts(Nickel, IridiumMetalResidue, Nickel, PlatinumMetallicPowder);
    oreProperty.setWashedIn(Mercury);

    oreProperty = Palladium.getProperty(PropertyKey.ORE);
    oreProperty.getOreByProducts().clear();
    oreProperty.setOreByProducts(PalladiumMetallicPowder);

    oreProperty = Cooperite.getProperty(PropertyKey.ORE);
    oreProperty.getOreByProducts().clear();
    oreProperty.setOreByProducts(PalladiumMetallicPowder, Nickel, IridiumMetalResidue, PalladiumMetallicPowder);

    oreProperty = Naquadah.getProperty(PropertyKey.ORE);
    oreProperty.getOreByProducts().clear();
    oreProperty.setOreByProducts(EnrichedNaquadahOxideMixture);

    ISGMaterials.addOre(GTMaterials.NaquadahEnriched);
    oreProperty = NaquadahEnriched.getProperty(PropertyKey.ORE);
    oreProperty.setOreByProducts(NaquadahOxideMixture, NaquadriaOxideMixture);

    ISGMaterials.addOre(GTMaterials.Naquadria);
    oreProperty = Naquadria.getProperty(PropertyKey.ORE);
    oreProperty.setOreByProducts(NaquadriaOxideMixture);

    ISGMaterials.addOre(GTMaterials.Iridium);
    oreProperty = Iridium.getProperty(PropertyKey.ORE);
    oreProperty.setOreByProducts(PlatinumMetallicPowder, RarestMetalResidue, PlatinumMetallicPowder, RarestMetalResidue);
    oreProperty.setWashedIn(Mercury);
  }
}
