package com.zircky.industrialsorcerygreg.data.recipe.integration.ae2;

import appeng.core.definitions.AEItems;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.zircky.industrialsorcerygreg.ISGCore;
import com.zircky.industrialsorcerygreg.data.recipe.integration.ae2.network.*;
import com.zircky.industrialsorcerygreg.data.recipe.integration.ae2.tools.PaintBalls;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.CENTRIFUGE_RECIPES;

public class AppliedEnergistics2Recipe {
  public static void init(Consumer<FinishedRecipe> provider) {
    Crafting.init(provider);
    NetworkBlocks.init(provider);
    NetworkCells.init(provider);
    PaintBalls.init(provider);
    Misc.init(provider);
    Parts.init(provider);
    Network.init(provider);
    Decorative.init(provider);
    Inscriber.init(provider);
    Materials.init(provider);
    Cables.init(provider);
    Slabs.init(provider);
    ae2Recipe(provider);
  }

  public static void removeInit(Consumer<ResourceLocation> consumer) {
    AppliedEnergistics2Remove.init(consumer);
  }

  private static void ae2Recipe(Consumer<FinishedRecipe> provider) {
    CENTRIFUGE_RECIPES.recipeBuilder(ISGCore.id("ae2/sky_dust_x1"))
        .inputItems(new ItemStack(AEItems.SKY_DUST))
        .circuitMeta(1)
        .chancedOutput(TagPrefix.dustSmall, GTMaterials.BasalticMineralSand, 1, 2000, 0)
        .chancedOutput(TagPrefix.dustSmall, GTMaterials.Olivine, 1, 2000, 0)
        .chancedOutput(TagPrefix.dustSmall, GTMaterials.Obsidian, 1, 2000, 0)
        .chancedOutput(TagPrefix.dustSmall, GTMaterials.Basalt, 1, 2000, 0)
        .chancedOutput(TagPrefix.dustSmall, GTMaterials.Flint, 1, 2000, 0)
        .chancedOutput(TagPrefix.dustSmall, GTMaterials.RareEarth, 1, 2000, 0)
        .duration(64).EUt(GTValues.VA[GTValues.LV]).save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder(ISGCore.id("ae2/sky_dust_x9"))
        .inputItems(new ItemStack(AEItems.SKY_DUST, 18))
        .circuitMeta(2)
        .chancedOutput(TagPrefix.dust, GTMaterials.BasalticMineralSand, 1, 9000, 0)
        .chancedOutput(TagPrefix.dust, GTMaterials.Olivine, 1, 9000, 0)
        .chancedOutput(TagPrefix.dust, GTMaterials.Obsidian, 1, 9000, 0)
        .chancedOutput(TagPrefix.dust, GTMaterials.Basalt, 1, 9000, 0)
        .chancedOutput(TagPrefix.dust, GTMaterials.Flint, 1, 9000, 0)
        .chancedOutput(TagPrefix.dust, GTMaterials.RareEarth, 1, 9000, 0)
        .duration(64).EUt(GTValues.VA[GTValues.MV]).save(provider);
  }
}
