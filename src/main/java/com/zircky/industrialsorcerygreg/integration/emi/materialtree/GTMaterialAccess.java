package com.zircky.industrialsorcerygreg.integration.emi.materialtree;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.registry.GTRegistries;

import java.util.Collection;

public final class GTMaterialAccess {
  public Collection<Material> getAllMaterials() {
    return GTRegistries.MATERIALS.values();
  }
}
