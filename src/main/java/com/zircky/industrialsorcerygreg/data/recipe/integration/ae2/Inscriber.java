package com.zircky.industrialsorcerygreg.data.recipe.integration.ae2;

import com.zircky.industrialsorcerygreg.common.data.ISGMaterials;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.data.recipe.CustomTags;

import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;

import appeng.core.definitions.AEItems;
import gripe._90.megacells.definition.MEGAItems;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.ASSEMBLER_RECIPES;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.FORMING_PRESS_RECIPES;

public class Inscriber {

    public static void init(Consumer<FinishedRecipe> provider) {
        inscriber(provider);
        megscellsInscriber(provider);
    }

    private static void inscriber(Consumer<FinishedRecipe> provider) {
        FORMING_PRESS_RECIPES.recipeBuilder("ae2/inscriber/calculation_processor_print")
                .notConsumable(AEItems.CALCULATION_PROCESSOR_PRESS.asItem())
                .inputItems(TagPrefix.plateDouble, GTMaterials.CertusQuartz)
                .outputItems(new ItemStack(AEItems.CALCULATION_PROCESSOR_PRINT.asItem()))
                .duration(250).EUt(GTValues.VA[GTValues.EV]).save(provider);

        FORMING_PRESS_RECIPES.recipeBuilder("ae2/inscriber/engineering_processor_print")
                .notConsumable(AEItems.ENGINEERING_PROCESSOR_PRESS.asItem())
                .inputItems(TagPrefix.plateDouble, GTMaterials.Diamond)
                .outputItems(new ItemStack(AEItems.ENGINEERING_PROCESSOR_PRINT.asItem()))
                .duration(250).EUt(GTValues.VA[GTValues.EV]).save(provider);

        FORMING_PRESS_RECIPES.recipeBuilder("ae2/inscriber/logic_processor_print")
                .notConsumable(AEItems.LOGIC_PROCESSOR_PRESS.asItem())
                .inputItems(TagPrefix.plateDouble, GTMaterials.RoseGold)
                .outputItems(new ItemStack(AEItems.LOGIC_PROCESSOR_PRINT.asItem()))
                .duration(250).EUt(GTValues.VA[GTValues.EV]).save(provider);

        FORMING_PRESS_RECIPES.recipeBuilder("ae2/inscriber/silicon_print")
                .notConsumable(AEItems.SILICON_PRESS.asItem())
                .inputItems(TagPrefix.plateDouble, GTMaterials.Silicon)
                .outputItems(new ItemStack(AEItems.SILICON_PRINT.asItem()))
                .duration(250).EUt(GTValues.VA[GTValues.EV]).save(provider);

        ASSEMBLER_RECIPES.recipeBuilder("ae2/inscriber/calculation_processor")
                .circuitMeta(1)
                .inputItems(new ItemStack(AEItems.CALCULATION_PROCESSOR_PRINT))
                .inputItems(new ItemStack(AEItems.SILICON_PRINT))
                .inputItems(CustomTags.LV_CIRCUITS, 4)
                .inputFluids(GTMaterials.Redstone.getFluid(144))
                .outputItems(new ItemStack(AEItems.CALCULATION_PROCESSOR))
                .duration(300).EUt(GTValues.VA[GTValues.LV]).save(provider);

        ASSEMBLER_RECIPES.recipeBuilder("ae2/inscriber/engineering_processor")
                .circuitMeta(1)
                .inputItems(new ItemStack(AEItems.ENGINEERING_PROCESSOR_PRINT))
                .inputItems(new ItemStack(AEItems.SILICON_PRINT))
                .inputItems(CustomTags.LV_CIRCUITS, 4)
                .inputFluids(GTMaterials.Redstone.getFluid(144))
                .outputItems(new ItemStack(AEItems.ENGINEERING_PROCESSOR))
                .duration(300).EUt(GTValues.VA[GTValues.LV]).save(provider);

        ASSEMBLER_RECIPES.recipeBuilder("ae2/inscriber/logic_processor")
                .circuitMeta(1)
                .inputItems(new ItemStack(AEItems.LOGIC_PROCESSOR_PRINT))
                .inputItems(new ItemStack(AEItems.SILICON_PRINT))
                .inputItems(CustomTags.LV_CIRCUITS, 4)
                .inputFluids(GTMaterials.Redstone.getFluid(144))
                .outputItems(new ItemStack(AEItems.LOGIC_PROCESSOR))
                .duration(300).EUt(GTValues.VA[GTValues.LV]).save(provider);

        ASSEMBLER_RECIPES.recipeBuilder("ae2/inscriber/calculation_processor_alt")
                .circuitMeta(2)
                .inputItems(new ItemStack(AEItems.CALCULATION_PROCESSOR_PRINT), 4)
                .inputItems(new ItemStack(AEItems.SILICON_PRINT), 4)
                .inputItems(CustomTags.MV_CIRCUITS, 4)
                .inputFluids(GTMaterials.Redstone.getFluid(144 * 4))
                .outputItems(new ItemStack(AEItems.CALCULATION_PROCESSOR), 8)
                .duration(300).EUt(GTValues.VA[GTValues.EV]).save(provider);

        ASSEMBLER_RECIPES.recipeBuilder("ae2/inscriber/engineering_processor_alt")
                .circuitMeta(2)
                .inputItems(new ItemStack(AEItems.ENGINEERING_PROCESSOR_PRINT), 4)
                .inputItems(new ItemStack(AEItems.SILICON_PRINT), 4)
                .inputItems(CustomTags.MV_CIRCUITS, 4)
                .inputFluids(GTMaterials.Redstone.getFluid(144 * 4))
                .outputItems(new ItemStack(AEItems.ENGINEERING_PROCESSOR), 8)
                .duration(300).EUt(GTValues.VA[GTValues.EV]).save(provider);

        ASSEMBLER_RECIPES.recipeBuilder("ae2/inscriber/logic_processor_alt")
                .circuitMeta(2)
                .inputItems(new ItemStack(AEItems.LOGIC_PROCESSOR_PRINT), 4)
                .inputItems(new ItemStack(AEItems.SILICON_PRINT), 4)
                .inputItems(CustomTags.MV_CIRCUITS, 4)
                .inputFluids(GTMaterials.Redstone.getFluid(144 * 4))
                .outputItems(new ItemStack(AEItems.LOGIC_PROCESSOR), 8)
                .duration(300).EUt(GTValues.VA[GTValues.EV]).save(provider);
    }

    private static void megscellsInscriber(Consumer<FinishedRecipe> provider) {
        FORMING_PRESS_RECIPES.recipeBuilder("megacells/inscriber/accumulation_processor_print")
                .notConsumable(MEGAItems.ACCUMULATION_PROCESSOR_PRESS.asItem())
                .inputItems(TagPrefix.plateDense, ISGMaterials.SkySteel)
                .outputItems(new ItemStack(MEGAItems.ACCUMULATION_PROCESSOR_PRINT))
                .duration(1200).EUt(GTValues.VA[GTValues.ZPM]).save(provider);

        FORMING_PRESS_RECIPES.recipeBuilder("megacells/inscriber/accumulation_processor_press")
                .inputItems(new ItemStack(AEItems.CALCULATION_PROCESSOR_PRESS))
                .inputItems(new ItemStack(AEItems.ENGINEERING_PROCESSOR_PRESS))
                .inputItems(new ItemStack(AEItems.LOGIC_PROCESSOR_PRESS))
                .outputItems(new ItemStack(MEGAItems.ACCUMULATION_PROCESSOR_PRESS))
                .duration(1200).EUt(GTValues.VA[GTValues.ZPM]).save(provider);

        ASSEMBLER_RECIPES.recipeBuilder("megacells/inscriber/accumulation_processor")
                .circuitMeta(1)
                .inputItems(new ItemStack(MEGAItems.ACCUMULATION_PROCESSOR_PRINT))
                .inputItems(new ItemStack(AEItems.SILICON_PRINT))
                .inputItems(new ItemStack(AEItems.FLUIX_DUST))
                .inputItems(CustomTags.LuV_CIRCUITS, 4)
                .inputFluids(GTMaterials.Redstone.getFluid(144))
                .outputItems(new ItemStack(MEGAItems.ACCUMULATION_PROCESSOR))
                .duration(1200).EUt(GTValues.VA[GTValues.LuV]).save(provider);

        ASSEMBLER_RECIPES.recipeBuilder("megacells/inscriber/accumulation_processor_alt")
                .circuitMeta(2)
                .inputItems(new ItemStack(MEGAItems.ACCUMULATION_PROCESSOR_PRINT), 4)
                .inputItems(new ItemStack(AEItems.SILICON_PRINT), 4)
                .inputItems(new ItemStack(AEItems.FLUIX_DUST), 4)
                .inputItems(CustomTags.ZPM_CIRCUITS, 4)
                .inputFluids(GTMaterials.Redstone.getFluid(144 * 4))
                .outputItems(new ItemStack(MEGAItems.ACCUMULATION_PROCESSOR), 8)
                .duration(1200).EUt(GTValues.VA[GTValues.UV]).save(provider);
    }
}
