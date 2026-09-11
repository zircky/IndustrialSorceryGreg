package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTItems.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGCasings.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGItems.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.*;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.GTValues.IV;
import static com.gregtechceu.gtceu.api.GTValues.VA;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.FUSION_RECIPES;

public class FusionReactor {
  public static void init(Consumer<FinishedRecipe> provider) {
    FUSION_RECIPES.recipeBuilder("heavy_quark_degenerate_matter").duration(100).EUt(1100000).fusionStartEU(5_000_000_000L)
        .inputFluids(DeuteriumSuperheavyMix.getFluid(720))
        .inputFluids(HeavyQuarkEnrichedMix.getFluid(720))
        .outputFluids(HeavyQuarkDegenerateMatter.getFluid(720))
        .save(provider);

    FUSION_RECIPES.recipeBuilder("deuterium_and_helium_3_to_helium_plasma").duration(16).EUt(2048).fusionStartEU(60_000_000)
        .inputFluids(Deuterium.getFluid(125))
        .inputFluids(Helium3.getFluid(125))
        .outputFluids(Helium.getFluid(FluidStorageKeys.PLASMA, 125))
        .save(provider);

    FUSION_RECIPES.recipeBuilder("fluorine_and_helium_3_to_potassium_plasma").duration(16).EUt(2048).fusionStartEU(60_000_000)
        .inputFluids(Fluorine.getFluid(125))
        .inputFluids(Helium3.getFluid(125))
        .outputFluids(Potassium.getFluid(FluidStorageKeys.PLASMA, 125))
        .save(provider);

    FUSION_RECIPES.recipeBuilder("beryllium_and_tungsten_to_platinum").duration(32).EUt(32768).fusionStartEU(150_000_000)
        .inputFluids(Beryllium.getFluid(16))
        .inputFluids(Tungsten.getFluid(16))
        .outputFluids(Platinum.getFluid(16))
        .save(provider);

    FUSION_RECIPES.recipeBuilder("plutonium_241_and_thorium_to_naquadah").duration(64).EUt(32768).fusionStartEU(300_000_000)
        .inputFluids(Plutonium241.getFluid(16))
        .inputFluids(Thorium.getFluid(16))
        .outputFluids(Naquadah.getFluid(16))
        .save(provider);

    FUSION_RECIPES.recipeBuilder("tungsten_and_helium_to_osmium").duration(64).EUt(24578).fusionStartEU(150_000_000)
        .inputFluids(Tungsten.getFluid(16))
        .inputFluids(Helium.getFluid(16))
        .outputFluids(Osmium.getFluid(16))
        .save(provider);

    FUSION_RECIPES.recipeBuilder("manganese_and_hydrogen_to_iron").duration(64).EUt(8192).fusionStartEU(120_000_000)
        .inputFluids(Manganese.getFluid(16))
        .inputFluids(Hydrogen.getFluid(16))
        .outputFluids(Iron.getFluid(16))
        .save(provider);

    FUSION_RECIPES.recipeBuilder("nickel_and_polonium_to_copernicium").duration(128).EUt(49152).fusionStartEU(480_000_000)
        .inputFluids(Nickel.getFluid(288 * 2))
        .inputFluids(Polonium.getFluid(288 * 2))
        .outputFluids(Copernicium.getFluid(288 * 2))
        .save(provider);

//    FUSION_RECIPES.recipeBuilder("gold_and_mercury_to_radon_plasma").duration(64).EUt(32768).fusionStartEU(200_000_000)
//        .inputFluids(Gold.getFluid(16))
//        .inputFluids(Mercury.getFluid(16))
//        .outputFluids(Radon.getFluid(FluidStorageKeys.PLASMA, 125))
//        .save(provider);

    FUSION_RECIPES.recipeBuilder("tantalum_and_tritium_to_tungsten").duration(16).EUt(24576).fusionStartEU(200_000_000)
        .inputFluids(Tantalum.getFluid(16))
        .inputFluids(Tritium.getFluid(16))
        .outputFluids(Tungsten.getFluid(16))
        .save(provider);

    // Should technically be Pu242
    FUSION_RECIPES.recipeBuilder("plutonium_244_and_neon_to_rutherfordium").duration(64).EUt(24576).fusionStartEU(150_000_000)
        .inputFluids(Plutonium244.getFluid(16))
        .inputFluids(Neon.getFluid(16))
        .outputFluids(Rutherfordium.getFluid(16))
        .save(provider);

    FUSION_RECIPES.recipeBuilder("americium_and_neon_to_dubnium").duration(96).EUt(49152).fusionStartEU(200_000_000)
        .inputFluids(Americium.getFluid(16))
        .inputFluids(Neon.getFluid(16))
        .outputFluids(Dubnium.getFluid(16))
        .save(provider);

    FUSION_RECIPES.recipeBuilder("americium_243_and_neon_to_dubnium").duration(96).EUt(49152).fusionStartEU(200_000_000)
        .inputFluids(Americium243.getFluid(16))
        .inputFluids(Neon.getFluid(16))
        .outputFluids(Dubnium.getFluid(16))
        .save(provider);

    FUSION_RECIPES.recipeBuilder("plutonium_239_and_calcium_to_seaborgium").duration(100).EUt(75000).fusionStartEU(400_000_000)
        .inputFluids(Plutonium239.getFluid(144))
        .inputFluids(Calcium.getFluid(144))
        .outputFluids(Seaborgium.getFluid(288))
        .save(provider);

    // Carbon-Burning Process (lossy)
    FUSION_RECIPES.recipeBuilder("carbon_12_and_carbon_12_to_neon_plasma").duration(100).EUt(VA[LuV]).fusionStartEU(120_000_000)
        .inputFluids(Carbon12.getFluid(125))
        .inputFluids(Carbon12.getFluid(125))
        .outputFluids(Neon.getFluid(FluidStorageKeys.PLASMA, 125))
        .save(provider);

    FUSION_RECIPES.recipeBuilder("polonium_and_chromium_to_meitnerium").duration(100).EUt(75000).fusionStartEU(400_000_000)
        .inputFluids(Polonium.getFluid(144 * 2))
        .inputFluids(Chromium.getFluid(144 * 2))
        .outputFluids(Meitnerium.getFluid(288 * 2))
        .save(provider);

    FUSION_RECIPES.recipeBuilder("americium_and_titanium_to_tennessine").duration(100).EUt(75000).fusionStartEU(420_000_000)
        .inputFluids(Americium.getFluid(144 * 2))
        .inputFluids(Titanium.getFluid(144 * 2))
        .outputFluids(Tennessine.getFluid(288 * 2))
        .save(provider);

    FUSION_RECIPES.recipeBuilder("plutonium_239_and_titanium_to_livermorium").duration(100).EUt(75000).fusionStartEU(360_000_000)
        .inputFluids(Plutonium239.getFluid(144 * 2))
        .inputFluids(Titanium.getFluid(144 * 2))
        .outputFluids(Livermorium.getFluid(288 * 2))
        .save(provider);

    FUSION_RECIPES.recipeBuilder("neptunium_and_titanium_to_moscovium").duration(100).EUt(75000).fusionStartEU(380_000_000)
        .inputFluids(Neptunium.getFluid(144 * 2))
        .inputFluids(Titanium.getFluid(144 * 2))
        .outputFluids(Moscovium.getFluid(288 * 2))
        .save(provider);

    FUSION_RECIPES.recipeBuilder("astatine_and_nickel_to_nihonium").duration(100).EUt(75000).fusionStartEU(410_000_000)
        .inputFluids(Astatine.getFluid(144 * 2))
        .inputFluids(Nickel.getFluid(144 * 2))
        .outputFluids(Nihonium.getFluid(288 * 2))
        .save(provider);

    FUSION_RECIPES.recipeBuilder("radium_and_vanadium_to_roentgenium").duration(100).EUt(75000).fusionStartEU(460_000_000)
        .inputFluids(Radium.getFluid(144 * 2))
        .inputFluids(Vanadium.getFluid(144 * 2))
        .outputFluids(Roentgenium.getFluid(288 * 2))
        .save(provider);

    FUSION_RECIPES.recipeBuilder("neutron_plasma")
        .inputFluids(SuperheavyMix.getFluid(1000), Taranium.getFluid(144))
        .outputFluids(Neutron.getFluid(8000))
        .fusionStartEU(20_000_000_000L).EUt(VH[UIV]).duration(10)
        .save(provider);

    FUSION_RECIPES.recipeBuilder("hot_metastable_oganesson")
        .inputFluids(Curium250.getFluid(144), OganesonBreedingBase.getFluid(500))
        .outputFluids(HotMetastableOganesson.getFluid(500))
        .fusionStartEU(2_500_000_000L).duration(100).EUt(600_000)
        .save(provider);

    FUSION_RECIPES.recipeBuilder("quasifissioning")
        .inputFluids(Uranium238.getFluid(500), Uranium238.getFluid(500))
        .outputFluids(Quassifissioning.getFluid(500))
        .fusionStartEU(2_500_000_000L)
        .duration(75).EUt(600_000).save(provider);

    FUSION_RECIPES.recipeBuilder("titanium_44_plasma")
        .inputFluids(Calcium.getFluid(250), Helium.getFluid(250))
        .outputFluids(Titanium44.getFluid(250))
        .fusionStartEU(200_000_000L).duration(128).EUt(VA[IV])
        .save(provider);

    FUSION_RECIPES.recipeBuilder("chromium_48_plasma")
        .inputFluids(Titanium44.getFluid(250), Helium.getFluid(250))
        .outputFluids(Chromium48.getFluid(250))
        .fusionStartEU(220_000_000L).duration(128).EUt(VA[IV])
        .save(provider);

    FUSION_RECIPES.recipeBuilder("iron_52_plasma")
        .inputFluids(Chromium48.getFluid(250), Helium.getFluid(250))
        .outputFluids(Iron52.getFluid(250))
        .fusionStartEU(240_000_000L).duration(128).EUt(VA[IV])
        .save(provider);

    FUSION_RECIPES.recipeBuilder("nickel_56_plasma")
        .inputFluids(Iron52.getFluid(250), Helium.getFluid(250))
        .outputFluids(Nickel56.getFluid(250))
        .fusionStartEU(250_000_000L).duration(128).EUt(VA[IV])
        .save(provider);

    FUSION_RECIPES.recipeBuilder("helium_rich_cno_plasma")
        .inputFluids(CNOcatalyst.getFluid(320), Hydrogen.getFluid(1280))
        .outputFluids(HeliumCNO.getFluid(1600))
        .fusionStartEU(100_000_000L).duration(128).EUt(VA[IV])
        .save(provider);

    FUSION_RECIPES.recipeBuilder("carbon_burning_process")
        .inputFluids(Carbon12.getFluid(250), Carbon12.getFluid(250))
        .outputFluids(Neon.getFluid(250), Helium4.getFluid(250))
        .fusionStartEU(2_500_000_000L).duration(100).EUt(600_000)
        .save(provider);


    testRecipes(provider);
  }

  private static void testRecipes(Consumer<FinishedRecipe> provider) {
    // Migrated from misc/test recipes.
             FUSION_RECIPES.recipeBuilder("taranium_enriched_l_helium3_helium3_to_plasma_taranium_rich_dusty_helium")
                     .inputFluids(TaraniumEnrichedLHelium3.getFluid(1000))
                     .inputFluids(Helium3.getFluid(1000))
                     .outputFluids(TaraniumRichDustyHelium.getFluid(FluidStorageKeys.PLASMA, 3000))
                     .duration(160)
                     .EUt(7680)
                     .fusionStartEU(480000000)
                     .save(provider);

             FUSION_RECIPES.recipeBuilder("taranium_enriched_l_helium3_helium3_to_plasma_taranium_rich_dusty_helium_2").duration(100).EUt(120000).fusionStartEU(1200000000L)
                     .inputFluids(TaraniumEnrichedLHelium3.getFluid(1000))
                     .inputFluids(Helium3.getFluid(1000))
                     .outputFluids(TaraniumRichDustyHelium.getFluid(FluidStorageKeys.PLASMA, 3000))
                     .save(provider);


}

}
