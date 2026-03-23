package com.zircky.industrialsorcerygreg.data.recipe.generated;

import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.MaterialStack;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import com.gregtechceu.gtceu.data.recipe.misc.RecyclingRecipes;
import com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.GTValues.HV;
import static com.gregtechceu.gtceu.api.GTValues.IV;
import static com.gregtechceu.gtceu.api.GTValues.LV;
import static com.gregtechceu.gtceu.api.GTValues.VA;
import static com.gregtechceu.gtceu.api.GTValues.VH;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;

public class ISGRecyclingRecipeHandler {
  private static final List<TagPrefix> IGNORE_ARC_SMELTING = Arrays.asList(ingot, gem, nugget);

  private ISGRecyclingRecipeHandler() {}

  public static void run(@NotNull Consumer<FinishedRecipe> provider, @NotNull Material material) {
    // registers universal maceration recipes for specified ore prefixes
    for (TagPrefix prefix : TagPrefix.values()) {
      if (prefix.generateRecycling()) {
        processCrushing(provider, prefix, material);
      }
    }
  }

  private static void processCrushing(@NotNull Consumer<FinishedRecipe> provider, @NotNull TagPrefix prefix,
                                      @NotNull Material material) {
    ItemStack stack = ChemicalHelper.get(prefix, material);
    if (!material.shouldGenerateRecipesFor(prefix) || !material.hasProperty(PropertyKey.DUST)) {
      return;
    }

    ArrayList<MaterialStack> materialStacks = new ArrayList<>();
    long amount = prefix.getMaterialAmount(material);
    materialStacks.add(new MaterialStack(material, amount));
    materialStacks.addAll(prefix.secondaryMaterials());
    // only ignore arc smelting for blacklisted prefixes if yielded material is the same as input material
    // if arc smelting gives different material, allow it
    boolean ignoreArcSmelting = IGNORE_ARC_SMELTING.contains(prefix) &&
        !(material.hasProperty(PropertyKey.INGOT) &&
            material.getProperty(PropertyKey.INGOT).getArcSmeltingInto() != material);
    RecyclingRecipes.registerRecyclingRecipes(provider, stack, materialStacks,
        ignoreArcSmelting, prefix);

    if (!material.hasProperty(PropertyKey.FLUID) || material.getFluid() == null || (prefix == TagPrefix.dust && material.hasProperty(PropertyKey.BLAST))) return;
    ISGRecipeTypes.LIQUEFACTION_FURNACE_RECIPES.recipeBuilder("extract_" + prefix.name + material.getName())
        .outputFluids(material.getFluid((int) (amount * L / M)))
        .duration((int) Math.max(1, amount * material.getMass() / M))
        .blastFurnaceTemp(Math.max(800, (int) (material.getBlastTemperature() * 0.6)))
        .EUt(getVoltageMultiplier(material))
        .inputItems(stack)
        .save(provider);
  }

  private static int getVoltageMultiplier(@NotNull Material material) {
    if (material.getBlastTemperature() >= 870) {
      return VA[ULV];
    } else if (material.getBlastTemperature() <= 871 && material.getBlastTemperature() >= 1834) {
      return VA[LV];
    } else if (material.getBlastTemperature() <= 1875 && material.getBlastTemperature() >= 6840) {
      return VA[MV];
    } else if (material.getBlastTemperature() >= 6841) {
      return VA[HV];
    } else {
      return VA[ULV];
    }
  }
}
