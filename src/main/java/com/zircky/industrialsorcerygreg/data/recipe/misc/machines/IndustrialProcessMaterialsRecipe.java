package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.industrialsorcerygreg.api.ISGValues.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.*;

public class IndustrialProcessMaterialsRecipe {
  public static void init(Consumer<FinishedRecipe> provider) {

    CHEMICAL_RECIPES.recipeBuilder("pcba")
        .inputDust(Fullerene, 2)
        .notConsumableFluid(BenzoylPeroxide.getFluid(1000))
        .inputFluids(Chlorobenzene.getFluid(2000))
        .inputFluids(Dimethylsulfide.getFluid(1000))
        .inputFluids(Phenylpentanoicacid.getFluid(2000))
        .outputFluids(Toluene.getFluid(2000), HydrogenSulfide.getFluid(1000), HydrochloricAcid.getFluid(2000))
        .outputFluids(PCBA.getFluid(2000))
        .duration(SECONDS * 22).EUt(VA[UV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder("pcbs")
        .notConsumableDust(Dimethylaminopyridine)
        .notConsumableFluid(Diisopropylcarbodiimide.getFluid(1000))
        .inputFluids(Styrene.getFluid(1000))
        .inputFluids(PCBA.getFluid(1000))
        .inputFluids(Dichloromethane.getFluid(1000))
        .outputFluids(HydrochloricAcid.getFluid(2000))
        .outputFluids(PCBS.getFluid(1000))
        .duration(SECONDS * 20).EUt(VA[UV]).save(provider);


  }
}
