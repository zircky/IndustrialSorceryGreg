package com.zircky.industrialsorcerygreg.api.registries;

import com.gregtechceu.gtceu.api.cover.CoverDefinition;
import com.gregtechceu.gtceu.api.data.chemical.material.registry.MaterialRegistry;
import com.gregtechceu.gtceu.api.registry.GTRegistries;
import com.gregtechceu.gtceu.api.registry.GTRegistry;
import com.zircky.industrialsorcerygreg.ISGCore;

public class ISGRegistries {
  public static final ISGRegistrate REGISTRATE = ISGRegistrate.create(ISGCore.MODID);

  public static final MaterialRegistry MATERIALS = GTRegistries.MATERIALS;

  public static final GTRegistry.RL<CoverDefinition> COVERS = GTRegistries.COVERS;

  public ISGRegistries() {
  }
}
