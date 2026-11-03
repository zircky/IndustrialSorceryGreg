package com.zircky.industrialsorcerygreg.data.recipe.integration.botania;

import appeng.core.definitions.AEItems;
import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.zircky.industrialsorcerygreg.data.recipe.builder.botania.ManaInfusionRecipeBuilder;
import com.zircky.industrialsorcerygreg.data.recipe.builder.botania.RunicAltarRecipeBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import mythicbotany.register.ModItems;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import vazkii.botania.common.item.BotaniaItems;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.BlackSteel;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.Manasteel;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.Runerock;

public class Botania {
  public static void init(Consumer<FinishedRecipe> provider) {
    ManaInfusionRecipe(provider, "manasteel", Ingredient.of(ChemicalHelper.getItem(ingot, BlackSteel)), new ItemStack(ChemicalHelper.getItem(ingot, Manasteel)), 3000, null, null);
    ManaInfusionRecipe(provider, "manasteel_block", Ingredient.of(ChemicalHelper.getItem(block, BlackSteel)), new ItemStack(ChemicalHelper.getItem(block, Manasteel)), 27000, null, null);
    ManaInfusionRecipe(provider, "mana_pearl", Ingredient.of(new ItemStack(AEItems.FLUIX_PEARL)), new ItemStack(BotaniaItems.manaPearl), 6000, null, null);
//    ManaInfusionRecipe(provider, "mana_string", Ingredient.of(ItemsRegistry.MAGE_FIBER.asItem()), new ItemStack(BotaniaItems.manaString), 1250, null, null);

    RunicAltarRecipe(provider, "runerock_block", 1000000, new ItemStack(ChemicalHelper.getItem(rock, Runerock), 1), false,
        new Ingredient[] { Ingredient.of(BotaniaItems.runeEarth), Ingredient.of(BotaniaItems.runeAir), Ingredient.of(BotaniaItems.runeFire), Ingredient.of(BotaniaItems.runeWater),
            Ingredient.of(BotaniaItems.runeSpring), Ingredient.of(BotaniaItems.runeSummer), Ingredient.of(BotaniaItems.runeAutumn), Ingredient.of(BotaniaItems.runeWinter),
            Ingredient.of(BotaniaItems.runeMana), Ingredient.of(BotaniaItems.runeLust), Ingredient.of(BotaniaItems.runeGluttony), Ingredient.of(BotaniaItems.runeGreed),
            Ingredient.of(BotaniaItems.runeSloth), Ingredient.of(BotaniaItems.runeWrath), Ingredient.of(BotaniaItems.runeEnvy), Ingredient.of(BotaniaItems.runePride) });
    RunicAltarRecipe(provider, "runerock_block_plas", 1000000, new ItemStack(ChemicalHelper.getItem(rock, Runerock), 4), false,
        new Ingredient[] { Ingredient.of(ModItems.asgardRune), Ingredient.of(ModItems.vanaheimRune), Ingredient.of(ModItems.alfheimRune), Ingredient.of(ModItems.midgardRune),
            Ingredient.of(ModItems.joetunheimRune), Ingredient.of(ModItems.muspelheimRune), Ingredient.of(ModItems.niflheimRune), Ingredient.of(ModItems.nidavellirRune),
            Ingredient.of(ModItems.helheimRune) });
  }

  private static void ManaInfusionRecipe(
      Consumer<FinishedRecipe> provider,
      String id,
      Ingredient input,
      ItemStack output,
      int mana,
      Block customCatalyst,
      String group) {
    ManaInfusionRecipeBuilder.builder(id)
        .input(input)
        .output(output)
        .mana(mana)
        .group(group)
        .customCatalyst(customCatalyst)
        .save(provider);
  }

  private static void RunicAltarRecipe(
      Consumer<FinishedRecipe> provider,
      String id,
      int mana,
      ItemStack output,
      Boolean setHeadRecipe,
      Ingredient[] input) {
    var build = RunicAltarRecipeBuilder.builder(id);
    build
        .output(output)
        .mana(mana)
        .setHeadRecipe(setHeadRecipe);
    for (Ingredient ingredient : input) build.addIngredient(ingredient);
    build.save(provider);
  }

}
