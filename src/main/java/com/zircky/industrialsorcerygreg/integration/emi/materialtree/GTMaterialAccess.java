package com.zircky.industrialsorcerygreg.integration.emi.materialtree;

import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;

import java.util.Collection;

public final class GTMaterialAccess {
  public Collection<Material> getAllMaterials() {
    return GTCEuAPI.materialManager.getRegisteredMaterials();
  }
}
