package com.zircky.industrialsorcerygreg.common.data.materials;

import com.gregtechceu.gtceu.api.data.chemical.material.properties.OreProperty;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;

import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;

public class ISGMaterialFlagAddition {
  public static void register() {
    OreProperty oreProperty = Nickel.getProperty(PropertyKey.ORE);
    oreProperty.setOreByProducts(Cobalt, Iron, PlatinumMetallicPowder);
    oreProperty.setSeparatedInto(Iron);
    oreProperty.setWashedIn(Mercury);

    oreProperty = Platinum.getProperty(PropertyKey.ORE);
    oreProperty.setOreByProducts(Nickel, IridiumMetalResidue, Nickel, PlatinumMetallicPowder);
    oreProperty.setWashedIn(Mercury);

    oreProperty = Palladium.getProperty(PropertyKey.ORE);
    oreProperty.setOreByProducts(PalladiumMetallicPowder);

    oreProperty = Cooperite.getProperty(PropertyKey.ORE);
    oreProperty.setOreByProducts(PalladiumMetallicPowder, Nickel, IridiumMetalResidue, PalladiumMetallicPowder);


//    oreProperty = Iridium.getProperty(PropertyKey.ORE);
//    oreProperty.setOreByProducts(PlatinumMetallicPowder, RarestMetalResidue, PlatinumMetallicPowder, RarestMetalResidue);
//    oreProperty.setWashedIn(Mercury);
  }
}
