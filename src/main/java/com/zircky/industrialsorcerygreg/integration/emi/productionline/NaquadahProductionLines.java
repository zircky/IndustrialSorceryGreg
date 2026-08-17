package com.zircky.industrialsorcerygreg.integration.emi.productionline;

import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.zircky.industrialsorcerygreg.ISGCore;
import dev.emi.emi.api.EmiRegistry;
import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.world.item.ItemStack;

import java.util.List;

import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;

public final class NaquadahProductionLines {
  private NaquadahProductionLines() {
  }

  public static void register(EmiRegistry registry) {
    registry.addCategory(ProductionLineCategory.NAQUADAH);
    registry.addWorkstation(ProductionLineCategory.NAQUADAH, ProductionLineCategory.NAQUADAH.icon());

    add(registry, "base_concentrate", "Naquadah Concentrate",
        step("Ore", NaquadahOxideMixture),
        step("Leach", LowQualityNaquadahEmulsion),
        step("Chem", LowQualityNaquadahSolution),
        step("Extract", NaquadahExtract),
        step("Centrifuge", NaquadahRichSolution),
        step("Dehydrate", NaquadahConcentrateSlurry),
        step("Digest", NaquadahOxideSolution),
        step("Chem", AcidicNaquadahConcentrate),
        step("Blast", NaquadahAdamantiumSolution),
        step("Blast", NaquadahConcentrate));

    add(registry, "enriched_concentrate", "Enriched Naquadah Concentrate",
        step("Ore", EnrichedNaquadahOxideMixture),
        step("Leach", ImpureEnrichedNaquadahSolution),
        step("Centrifuge", EnrichedNaquadahSolution),
        step("Chem", AcidicEnrichedNaquadahSolution),
        step("Dehydrate", EnrichedNaquadahSulphate),
        step("Chem", EnrichedNaquadahChloride),
        step("Blast", EnrichedNaquadahConcentrate));

    add(registry, "naquadria_concentrate", "Naquadria Concentrate",
        step("Ore", NaquadriaOxideMixture),
        step("Chem", LowQualityNaquadriaPhosphate),
        step("Digest", ImpureNaquadriaSolution),
        step("Chem", AcidicNaquadriaSolution),
        step("Leach", NaquadriaSolution),
        step("Centrifuge", NaquadriaSulphate),
        step("Chem", NaquadriaConcentrate));

    add(registry, "naquadah", "Naquadah",
        step("Concentrate", NaquadahConcentrate),
        step("Chem", NaquadahSulfate),
        step("Chem", Naquadah));

    add(registry, "light_naquadah_fuel", "Light Naquadah Fuel",
        step("Dust", Naquadah),
        step("Mixer", NaquadahSolution),
        step("Centrifuge", ClearNaquadahLiquid),
        step("Distill", ComplicatedLightNaquadah),
        step("Centrifuge", LightNaquadah),
        step("Crack", FCrackedLightNaquadah),
        step("Distill", LightNaquadahFuel));

    add(registry, "medium_naquadah_fuel", "Medium Naquadah Fuel",
        step("Dust", Naquadah),
        step("Mixer", NaquadahSolution),
        step("Centrifuge", ClearNaquadahLiquid),
        step("Distill", ComplicatedMediumNaquadah),
        step("Centrifuge", MediumNaquadah),
        step("Crack", FCrackedMediumNaquadah),
        step("Distill", MediumNaquadahFuel));

    add(registry, "heavy_naquadah_fuel", "Heavy Naquadah Fuel",
        step("Dust", Naquadah),
        step("Mixer", NaquadahSolution),
        step("Centrifuge", ClearNaquadahLiquid),
        step("Distill", ComplicatedHeavyNaquadah),
        step("Centrifuge", HeavyNaquadah),
        step("Crack", FCrackedHeavyNaquadah),
        step("Distill", HeavyNaquadahFuel));

    add(registry, "light_enriched_naquadah_fuel", "Light Enriched Naquadah Fuel",
        step("Dust", NaquadahEnriched),
        step("Chem", ENaquadahSolution),
        step("Centrifuge", ClearENaquadahLiquid),
        step("Distill", ComplicatedLightENaquadah),
        step("Centrifuge", LightENaquadah),
        step("Crack", RnCrackedLightNaquadah),
        step("Distill", LightENaquadahFuel));

    add(registry, "medium_enriched_naquadah_fuel", "Medium Enriched Naquadah Fuel",
        step("Dust", NaquadahEnriched),
        step("Chem", ENaquadahSolution),
        step("Centrifuge", ClearENaquadahLiquid),
        step("Distill", ComplicatedMediumENaquadah),
        step("Centrifuge", MediumENaquadah),
        step("Crack", RnCrackedMediumENaquadah),
        step("Distill", MediumENaquadahFuel));

    add(registry, "heavy_enriched_naquadah_fuel", "Heavy Enriched Naquadah Fuel",
        step("Dust", NaquadahEnriched),
        step("Chem", ENaquadahSolution),
        step("Centrifuge", ClearENaquadahLiquid),
        step("Distill", ComplicatedHeavyENaquadah),
        step("Centrifuge", HeavyENaquadah),
        step("Crack", RnCrackedHeavyENaquadah),
        step("Distill", HeavyENaquadahFuel));

    add(registry, "hyper_fuel_i", "Hyper Fuel I",
        step("Light Nq", LightNaquadahFuel),
        step("Light ENq", LightENaquadahFuel),
        step("Naquadria", NaquadriaSolution),
        step("Mixer", HyperFuelI));

    add(registry, "hyper_fuel_ii", "Hyper Fuel II",
        step("Medium Nq", MediumNaquadahFuel),
        step("Medium ENq", MediumENaquadahFuel),
        step("Naquadria", NaquadriaSolution),
        step("Mixer", HyperFuelII));

    add(registry, "hyper_fuel_iii", "Hyper Fuel III",
        step("Heavy Nq", HeavyNaquadahFuel),
        step("Heavy ENq", HeavyENaquadahFuel),
        step("Naquadria", NaquadriaSolution),
        step("Mixer", HyperFuelIII));

    add(registry, "hyper_fuel_iv", "Hyper Fuel IV",
        step("Hyper III", HyperFuelIII),
        step("Mixer", HyperFuelIV));
  }

  private static void add(EmiRegistry registry, String id, String title, ProductionLineStep... steps) {
    registry.addRecipe(new ProductionLineRecipe(
        ISGCore.id("naquadah_production_lines/" + id),
        title,
        List.of(steps)));
  }

  private static ProductionLineStep step(String machine, Material material) {
    return new ProductionLineStep(machine, stack(material));
  }

  private static EmiStack stack(Material material) {
    ItemStack dust = ChemicalHelper.get(TagPrefix.dust, material);
    if (!dust.isEmpty()) {
      return EmiStack.of(dust);
    }
    return EmiStack.of(material.getFluid(1000).getFluid(), 1000);
  }
}
