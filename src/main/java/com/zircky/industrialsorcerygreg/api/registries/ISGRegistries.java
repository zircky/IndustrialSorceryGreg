package com.zircky.industrialsorcerygreg.api.registries;

import com.gregtechceu.gtceu.api.cover.CoverDefinition;
import com.gregtechceu.gtceu.api.registry.GTRegistries;
import com.gregtechceu.gtceu.api.registry.GTRegistry;
import com.zircky.industrialsorcerygreg.IndustrialSorceryGreg;

public class ISGRegistries{
  public static final ISGRegistrate REGISTRATE = ISGRegistrate.create(IndustrialSorceryGreg.MODID);

  public static final GTRegistry.RL<CoverDefinition> COVERS = GTRegistries.COVERS;

  public ISGRegistries() {
  }
}
