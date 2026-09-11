package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTItems.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGCasings.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGItems.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.*;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.LuV;
import static com.gregtechceu.gtceu.api.GTValues.VA;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.BIO_REACTOR_RECIPES;

public class BioReactor {
  public static void init(Consumer<FinishedRecipe> provider) {
    BIO_REACTOR_RECIPES.recipeBuilder("brevibacterium_flavium_succinimide_to_succinic_anhydride_ammonia")
        .inputDust(BrevibacteriumFlavium)
        .inputDust(Succinimide, 12)
        .outputDust(SuccinicAnhydride, 11)
        .outputFluids(Ammonia.getFluid(1000))
        .EUt(VA[LuV])
        .duration(100)
        .save(provider);
    testRecipes(provider);
  }

  private static void testRecipes(Consumer<FinishedRecipe> provider) {

        // C6H10O5 + bacteria -> C6H12O6
        BIO_REACTOR_RECIPES.recipeBuilder("cellulose_eschericia_coli_to_glucose").duration(150).EUt(120)
                .inputDust(Cellulose, 21)
                .inputDust(EschericiaColi)
                .outputItems(ChemicalHelper.get(dust, Glucose, 24))
                .save(provider);


        // [C6H11NO4]n + bacteria -> C6H13NO5
        BIO_REACTOR_RECIPES.recipeBuilder("chitosan_eschericia_coli_to_glucosamine").duration(100).EUt(4096)
                .inputFluids(Chitosan.getFluid(1000))
                .inputDust(EschericiaColi)
                .outputItems(ChemicalHelper.get(dust, Glucosamine, 25))
                .save(provider);

        BIO_REACTOR_RECIPES.recipeBuilder("eschericia_coli_sugar_to_succinic_acid")
                .inputDust(EschericiaColi)
                .inputDust(Sugar)
                .EUt(480)
                .outputItems(ChemicalHelper.get(dust, SuccinicAcid, 14))
                .duration(200)
                .save(provider);


        // C6H12O6 + bacteria -> C5H12O
        BIO_REACTOR_RECIPES.recipeBuilder("glucose_ammonia_to_isoamyl_alcohol")
                .inputDust(Glucose, 24)
                .notConsumable(ChemicalHelper.get(dust, SelectivelyMutatedCupriavidiusNecator))
                .inputFluids(Ammonia.getFluid(10))
                .outputFluids(IsoamylAlcohol.getFluid(1000))
                .EUt(491520)
                .duration(20)
                .save(provider);

        BIO_REACTOR_RECIPES.recipeBuilder("cupriavidus_necator_methylnitronitrosoguanidine_to_selectively_mutated_cupriavidius_necator")
                .inputDust(CupriavidusNecator, 2)
                .notConsumable(UVA_HALIDE_LAMP)
                .inputFluids(Methylnitronitrosoguanidine.getFluid(250))
                .outputItems(ChemicalHelper.get(dust, SelectivelyMutatedCupriavidiusNecator))
                .EUt(30720)
                .duration(20)
                .save(provider);

    // TODO migrated disabled: unresolved old test symbol `ULTRASONIC_HOMOGENIZER`.
    //         BIO_REACTOR_RECIPES.recipeBuilder("biomass_yeast_to_linoleic_acid")
    //                 .inputFluids(Biomass.getFluid(1000))
    //                 .inputDust(Yeast)
    //                 .notConsumable(ULTRASONIC_HOMOGENIZER.asStack())
    //                 .outputFluids(LinoleicAcid.getFluid(1000))
    //                 .EUt(1920)
    //                 .duration(200)
    //                 .save(provider);
    // 
    //         

BIO_REACTOR_RECIPES.recipeBuilder("cupriavidus_necator_sugar_nitrogen_hydrogen_to_biotin")
                .inputDust(CupriavidusNecator)
                .inputDust(Sugar)
                .inputFluids(Nitrogen.getFluid(1000))
                .inputFluids(Hydrogen.getFluid(1000))
                .outputFluids(Biotin.getFluid(2000))
                .EUt(7680)
                .duration(40)
                .save(provider);

        BIO_REACTOR_RECIPES.recipeBuilder("clean_ammonia_solution_brevibacterium_flavium_sugar_to_glutamine")
                .inputFluids(CleanAmmoniaSolution.getFluid(1000))
                .inputDust(BrevibacteriumFlavium)
                .inputDust(Sugar)
                .outputItems(ChemicalHelper.get(dust, Glutamine, 40))
                .EUt(30720)
                .duration(500)
                .save(provider);

        BIO_REACTOR_RECIPES.recipeBuilder("animal_cells_to_rapidly_replicating_animal_cells")
                .notConsumable(dust, Naquadria)
                .inputFluids(AnimalCells.getFluid(1000))
                .outputFluids(RapidlyReplicatingAnimalCells.getFluid(1000))
                .EUt(7680)
                .duration(500)
                .save(provider);

        BIO_REACTOR_RECIPES.recipeBuilder("rapidly_replicating_animal_cells_to_myc_gene")
                .inputFluids(RapidlyReplicatingAnimalCells.getFluid(1000))
                .circuitMeta(1)
                .EUt(480)
                .duration(100)
                .outputFluids(MycGene.getFluid(1000))
                .save(provider);

        BIO_REACTOR_RECIPES.recipeBuilder("rapidly_replicating_animal_cells_to_oct4_gene")
                .inputFluids(RapidlyReplicatingAnimalCells.getFluid(1000))
                .circuitMeta(2)
                .EUt(480)
                .duration(100)
                .outputFluids(Oct4Gene.getFluid(1000))
                .save(provider);

        BIO_REACTOR_RECIPES.recipeBuilder("rapidly_replicating_animal_cells_to_sox2_gene")
                .inputFluids(RapidlyReplicatingAnimalCells.getFluid(1000))
                .circuitMeta(3)
                .EUt(480)
                .duration(100)
                .outputFluids(SOX2Gene.getFluid(1000))
                .save(provider);

        BIO_REACTOR_RECIPES.recipeBuilder("rapidly_replicating_animal_cells_to_kfl4_gene")
                .inputFluids(RapidlyReplicatingAnimalCells.getFluid(1000))
                .circuitMeta(4)
                .EUt(480)
                .duration(100)
                .outputFluids(KFL4Gene.getFluid(1000))
                .save(provider);

        BIO_REACTOR_RECIPES.recipeBuilder("sterile_growth_medium_animal_cells_gene_therapy_fluid_to_stem_cells")
                .inputFluids(SterileGrowthMedium.getFluid(1000))
                .inputFluids(AnimalCells.getFluid(1000))
                .inputFluids(GeneTherapyFluid.getFluid(1000))
                .EUt(30720)
                .duration(1000)
                .outputItems(STEM_CELLS.asStack())
                .save(provider);

        BIO_REACTOR_RECIPES.recipeBuilder("stem_cells_sterile_growth_medium_to_stem_cells_depleted_growth_medium")
                .inputItems(STEM_CELLS.asStack())
                .inputFluids(SterileGrowthMedium.getFluid(1000))
                .outputItems(STEM_CELLS.asStack(2))
                .outputFluids(DepletedGrowthMedium.getFluid(500))
                .EUt(480)
                .duration(100)
                .save(provider);
    // TODO migrated disabled: unresolved old test symbol `ULTRASONIC_HOMOGENIZER`.
    // 
    //         BIO_REACTOR_RECIPES.recipeBuilder("streptococcus_pyogenes_distilled_water_to_cas9")
    //                 .notConsumable(ULTRASONIC_HOMOGENIZER.asStack())
    //                 .inputDust(StreptococcusPyogenes)
    //                 .inputFluids(DistilledWater.getFluid(1000))
    //                 .outputFluids(Cas9.getFluid(1000))
    //                 .EUt(480)
    //                 .duration(100)
    //                 .save(provider);
    // 
    //         

BIO_REACTOR_RECIPES.recipeBuilder("cas9_myc_gene_oct4_gene_sox2_gene_kfl4_gene_eschericia_coli_to_gene_plasmids")
                .inputFluids(Cas9.getFluid(1000))
                .inputFluids(MycGene.getFluid(1000))
                .inputFluids(Oct4Gene.getFluid(1000))
                .inputFluids(SOX2Gene.getFluid(1000))
                .inputFluids(KFL4Gene.getFluid(1000))
                .inputDust(EschericiaColi)
                .outputFluids(GenePlasmids.getFluid(5000))
                .EUt(1920)
                .duration(50)
                .save(provider);

        BIO_REACTOR_RECIPES.recipeBuilder("chitin_bifidobacterium_breve_to_chitosan")
                .inputFluids(Chitin.getFluid(1000))
                .inputDust(BifidobacteriumBreve)
                .outputFluids(Chitosan.getFluid(1000))
                .EUt(120)
                .duration(100)
                .save(provider);
  }

}
