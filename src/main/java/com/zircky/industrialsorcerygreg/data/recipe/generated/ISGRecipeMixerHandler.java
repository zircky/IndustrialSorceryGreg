package com.zircky.industrialsorcerygreg.data.recipe.generated;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.MaterialStack;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.data.recipe.builder.GTRecipeBuilder;
import com.gregtechceu.gtceu.utils.GTMath;
import com.zircky.industrialsorcerygreg.api.data.material.ISGMaterialFlags;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.MIXER_RECIPES;

public class ISGRecipeMixerHandler {
    protected ISGRecipeMixerHandler() {
    }

    public static void run(@NotNull Consumer<FinishedRecipe> provider, @NotNull Material material) {
        processMixer(provider, material);
    }

    private static void processMixer(@NotNull Consumer<FinishedRecipe> provider, @NotNull Material material) {
        if (material.getMaterialComponents().isEmpty() || !material.hasFlag(ISGMaterialFlags.RECIPE_MIXER)) return;

        List<ItemStack> inputs = new ArrayList<>();
        List<FluidStack> fluidInputs = new ArrayList<>();
        long totalOutputAmount = 0;

        for (MaterialStack component : material.getMaterialComponents()) {
            totalOutputAmount += component.amount();
            if (component.material().hasProperty(PropertyKey.DUST)) {
                inputs.add(ChemicalHelper.get(TagPrefix.dust, component.material(), (int) component.amount()));
            } else if (component.material().hasProperty(PropertyKey.FLUID)) {
                fluidInputs.add(component.material().getFluid((int) (1000 * component.amount())));
            }
        }

        if (inputs.size() > 6 || fluidInputs.size() > 2) return;

        boolean hasDust = material.hasProperty(PropertyKey.DUST);
        if (hasDust) {
            LongList materialAmounts = new LongArrayList();
            materialAmounts.add(totalOutputAmount);
            inputs.forEach(itemStack -> materialAmounts.add(itemStack.getCount()));
            fluidInputs.forEach(fluidStack -> materialAmounts.add(fluidStack.getAmount() / 1000L));

            int highestDivisor = 1;

            long smallestMaterialAmount = materialAmounts.longStream().min().orElse(0);
            for (int i = 2; i <= smallestMaterialAmount; i++) {
                if (isEveryMaterialReducible(i, materialAmounts)) highestDivisor = i;
            }

            if (highestDivisor != 1) {
                List<ItemStack> reducedInputs = new ArrayList<>();

                for (ItemStack itemStack : inputs) {
                    ItemStack reducedStack = itemStack.copy();
                    reducedStack.setCount(reducedStack.getCount() / highestDivisor);
                    reducedInputs.add(reducedStack);
                }

                List<FluidStack> reducedFluidInputs = new ArrayList<>();

                for (FluidStack fluidStack : fluidInputs) {
                    FluidStack reducedFluidStack = fluidStack.copy();
                    reducedFluidStack.setAmount(reducedFluidStack.getAmount() / highestDivisor);
                    reducedFluidInputs.add(reducedFluidStack);
                }

                inputs = reducedInputs;
                fluidInputs = reducedFluidInputs;
                totalOutputAmount /= highestDivisor;
            }
        }

        GTRecipeBuilder builder;
        long dura = material.getProtons() * totalOutputAmount * 2L;
        builder = MIXER_RECIPES.recipeBuilder("recipe_mixer_", material.getName())
                    .duration(GTMath.saturatedCast(dura))
                    .EUt(material.getMaterialComponents().size() <= 2 ? GTValues.VA[GTValues.LV] : 2L * GTValues.VA[GTValues.LV]);
        builder.inputItems(inputs.toArray(ItemStack[]::new));
        builder.inputFluids(fluidInputs.toArray(FluidStack[]::new));

        if (hasDust) {
            builder.outputItems(TagPrefix.dust, material, GTMath.saturatedCast(totalOutputAmount));
        } else {
            builder.outputFluids(material.getFluid(1000));
        }

        builder.save(provider);



    }

    private static boolean isEveryMaterialReducible(int divisor, LongList materialAmounts) {
        for (var it = materialAmounts.iterator(); it.hasNext();) {
            long amount = it.nextLong();
            if (amount % divisor != 0) {
                return false;
            }
        }

        return true;
    }
}
