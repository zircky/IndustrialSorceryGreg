package com.zircky.industrialsorcerygreg.common.data.materials;

public final class AdvancedChemicalMaterials {
  private AdvancedChemicalMaterials() {
  }

  public static void register() {
    ChemicalPrecursorMaterials.register();
    BioOrganicSolidMaterials.register();
    MetalProcessingCompoundMaterials.register();
    SuperconductorAndPigmentMaterials.register();
    InorganicOrganicCompoundMaterials.register();
    MaterialGroupAndCatalystMaterials.register();
  }
}
