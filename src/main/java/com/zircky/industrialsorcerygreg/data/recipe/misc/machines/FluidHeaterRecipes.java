package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTItems.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGCasings.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGItems.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.*;

public class FluidHeaterRecipes {
  public static void init(Consumer<FinishedRecipe> provider) {
    // Migrated from misc/test recipes.

        // CH3NO(H2O) -> CH3NO + H2O
        FLUID_HEATER_RECIPES.recipeBuilder("wet_formamide_to_formamide").duration(60).EUt(30)
                .circuitMeta(0)
                .inputFluids(WetFormamide.getFluid(100))
                .outputFluids(Formamide.getFluid(100))
                .save(provider);

        FLUID_HEATER_RECIPES.recipeBuilder("aminated_fullerene_to_azafullerene").duration(120).EUt(480)
                .inputFluids(AminatedFullerene.getFluid(1000))
                .outputFluids(Azafullerene.getFluid(1000))
                .notConsumable(wireFine, Rhenium)
                .save(provider);

        FLUID_HEATER_RECIPES.recipeBuilder("carbon_dioxide_to_supercritical_co2").duration(80).EUt(480)
                .inputFluids(CarbonDioxide.getFluid(1000))
                .outputFluids(SupercriticalCO2.getFluid(1000))
                .circuitMeta(0)
                .save(provider);

        FLUID_HEATER_RECIPES.recipeBuilder("butanol_to_butanol_gas").duration(130).EUt(480)
                .inputFluids(Butanol.getFluid(1000))
                .circuitMeta(0)
                .outputFluids(ButanolGas.getFluid(1000))
                .save(provider);

        FLUID_HEATER_RECIPES.recipeBuilder("iron_carbonyl_to_purified_iron_carbonyl").duration(200).EUt(480)
                .circuitMeta(1)
                .inputFluids(IronCarbonyl.getFluid(1000))
                .outputFluids(PurifiedIronCarbonyl.getFluid(900))
                .save(provider);

    // TODO migrated disabled: unresolved old test symbol `Lignite`.
    //         FLUID_HEATER_RECIPES.recipeBuilder("helium3_to_plasma_helium3")
    //                 .inputFluids(Helium3.getFluid(1000))
    //                 .outputFluids(Helium3.getFluid(FluidStorageKeys.PLASMA, 1000))
    //                 .circuitMeta(0)
    //                 .duration(60)
    //                 .EUt(8000)
    //                 .save(provider);
    // 
    // 
    //         // Lignite Processing ==========================================================================================
    //         FLUID_HEATER_RECIPES.recipeBuilder("nitrogen_to_hot_nitrogen").duration(120).EUt(120)
    //                 .circuitMeta(0)
    //                 .inputFluids(Nitrogen.getFluid(1000))
    //                 .outputFluids(HotNitrogen.getFluid(1000))
    //                 .save(provider);
    // 
    // 
    //         

// [C2H4O + H2O] -> C2H6O2
        FLUID_HEATER_RECIPES.recipeBuilder("wet_ethylene_oxide_to_ethylene_glycol").duration(130).EUt(120)
                .circuitMeta(0)
                .inputFluids(WetEthyleneOxide.getFluid(1000))
                .outputFluids(EthyleneGlycol.getFluid(1000))
                .save(provider);
  }
}
