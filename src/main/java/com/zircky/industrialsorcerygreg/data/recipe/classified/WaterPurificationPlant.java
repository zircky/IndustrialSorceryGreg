package com.zircky.industrialsorcerygreg.data.recipe.classified;

import com.gregtechceu.gtceu.api.data.chemical.material.MarkerMaterials;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.zircky.industrialsorcerygreg.ISGCore;
import com.zircky.industrialsorcerygreg.api.util.ISGUtility;
import com.zircky.industrialsorcerygreg.common.data.ISGItems;
import com.zircky.industrialsorcerygreg.common.machine.multiblock.electric.water.WaterPurificationPlantMachine;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.LASER_ENGRAVER_RECIPES;
import static com.zircky.industrialsorcerygreg.api.ISGValues.SECONDS;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.*;
import static com.zircky.industrialsorcerygreg.common.machine.multiblock.electric.water.HighEnergyLaserPurificationUnitMachine.LENS;

public class WaterPurificationPlant {
  public static void init(Consumer<FinishedRecipe> provider) {
    final int duration = WaterPurificationPlantMachine.CYCLE_TIME_TICKS;
    CLARIFIER_PURIFICATION_RECIPES.recipeBuilder(ISGCore.id("filtered_water"))
        .chancedInput(ISGItems.ACTIVATED_CARBON_FILTER_MESH.asStack(), 2000)
        .inputFluids(GTMaterials.Water.getFluid(1000))
        .chancedOutput(new ItemStack(Items.STICK, 1), 1000)
        .chancedOutput(TagPrefix.dust, GTMaterials.Stone, 1, 500)
        .chancedOutput(TagPrefix.nugget, GTMaterials.Gold, 1, 100)
        .chancedOutput(FilteredSater.getFluid(900), 7000)
        .addData("tier", 1)
        .duration(duration).EUt(VA[IV]).save(provider);

    // ACTIVATED_CARBON_FILTER_MESH Add Recipe

    LASER_ENGRAVER_RECIPES.recipeBuilder(ISGCore.id("ozon"))
        .notConsumable(TagPrefix.lens, MarkerMaterials.Color.Blue)
        .inputFluids(GTMaterials.Oxygen.getFluid(16000))
        .outputFluids(Ozone.getFluid(4000))
        .duration(10 * SECONDS).EUt(VA[IV]).save(provider);

    for (int tier = 1; tier <= 4; ++tier) {
      OZONATION_PURIFICATION_RECIPES.recipeBuilder(ISGCore.id("ozone_water_" + tier))
          .inputFluids(FilteredSater.getFluid(1000))
          .inputFluids(Ozone.getFluid(Math.toIntExact(1000 * (long) ISGUtility.powInt(2, (tier + 6)))))
          .chancedOutput(OzoneWater.getFluid(900), tier * 2000)
          .chancedOutput(TagPrefix.dust, GTMaterials.Manganese, 500, 0)
          .chancedOutput(TagPrefix.dust, GTMaterials.Iron, 500, 0)
          .chancedOutput(TagPrefix.dust, GTMaterials.Sulfur, 500, 0)
          .addData("tier", 2).duration(duration).EUt(VA[LuV]).save(provider);
    }

    FLOCCULATION_PURIFICATION_RECIPES.recipeBuilder(ISGCore.id("flocculent_water"))
        .inputFluids(OzoneWater.getFluid(1000), PolyAluminiumChloride.getFluid(100_000))
        .chancedOutput(FlocculentWater.getFluid(900), 1000)
        .outputFluids(FlocculationWasteSolution.getFluid(100_000))
        .chancedOutput(new ItemStack(Items.CLAY_BALL), 1000)
        .chancedOutput(TagPrefix.dust, GTMaterials.NetherQuartz, 500, 0)
        .chancedOutput(TagPrefix.nugget, GTMaterials.PolyvinylChloride, 100, 0)
        .addData("tier", 3).duration(duration).EUt(VA[ZPM]).save(provider);

    PH_NEUTRALIZATION_PURIFICATION_RECIPES.recipeBuilder(ISGCore.id("ph_neutral_water"))
        .inputItems(TagPrefix.dust, GTMaterials.SodiumHydroxide, 64)
        .inputFluids(FlocculentWater.getFluid(1000), GTMaterials.HydrochloricAcid.getFluid(1000))
        .chancedOutput(PHNeutralWater.getFluid(1000), 1)
        .duration(duration).EUt(VA[ZPM]).save(provider);

    EXTREME_TEMPERATURE_FLUCTUATION_PURIFICATION_RECIPES.recipeBuilder(ISGCore.id("extreme_temperature_water"))
        .inputFluids(PHNeutralWater.getFluid(1000),
            GTMaterials.Helium.getFluid(10),
            SuperCooled.getFluid(100))
        .chancedOutput(ExtremeTemperatureWater.getFluid(900), 1)
        .duration(duration).EUt(VA[UV]).save(provider);

    HIGH_ENERGY_LASER_PURIFICATION_RECIPES.recipeBuilder(ISGCore.id("electric_equilibrium_water"))
        .inputItems(LENS)
        .inputFluids(ExtremeTemperatureWater.getFluid(1000))
        .chancedOutput(ElectricEquilibriumWater.getFluid(900), 1)
        .duration(duration).EUt(VA[UV]).save(provider);

    RESIDUAL_DECONTAMINANT_DEGASSER_PURIFICATION_RECIPES.recipeBuilder(ISGCore.id("degassed_water"))
        .inputFluids(ElectricEquilibriumWater.getFluid(1000))
        .chancedOutput(DeaeratedWater.getFluid(1000), 1)
        .duration(duration).EUt(VA[UHV]).save(provider);

  }
}
