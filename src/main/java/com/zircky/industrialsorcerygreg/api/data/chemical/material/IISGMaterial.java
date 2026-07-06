package com.zircky.industrialsorcerygreg.api.data.chemical.material;

import com.gregtechceu.gtceu.api.data.chemical.material.properties.MaterialProperties;
import net.minecraft.world.item.Rarity;

public interface IISGMaterial {

  MaterialProperties isgcore$getProperties();

  Rarity isgcore$rarity();

  void isgcore$setRarity(Rarity rarity);

  boolean isgcore$glow();

  void isgcore$setGlow();

  int isgcore$temp();

  void isgcore$setTemp(int temp);

}
