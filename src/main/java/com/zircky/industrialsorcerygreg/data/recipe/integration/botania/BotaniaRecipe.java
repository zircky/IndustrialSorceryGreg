package com.zircky.industrialsorcerygreg.data.recipe.integration.botania;

import appeng.core.definitions.AEItems;
import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.MaterialEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes;
import com.zircky.industrialsorcerygreg.data.recipe.RecipeAddition;
import com.zircky.industrialsorcerygreg.data.recipe.builder.botania.ManaInfusionRecipeBuilder;
import com.zircky.industrialsorcerygreg.data.recipe.builder.botania.RunicAltarRecipeBuilder;
import com.zircky.industrialsorcerygreg.data.recipe.builder.botania.TerrestrialAgglomerationRecipeBuilder;
import com.zircky.industrialsorcerygreg.utils.RLUtils;
import io.github.lounode.extrabotany.common.item.ExtraBotanyItems;
import mythicbotany.register.ModItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import vazkii.botania.common.item.BotaniaItems;
import vazkii.botania.common.lib.BotaniaTags;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.GTCEu.isDev;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.BlackSteel;
import static com.gregtechceu.gtceu.common.data.GTMaterials.Diamond;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;

public class BotaniaRecipe {

  public static void init(Consumer<FinishedRecipe> provider) {
    ManaInfusionRecipe(provider, "manasteel", Ingredient.of(ChemicalHelper.getItem(ingot, BlackSteel)),
        new ItemStack(ChemicalHelper.getItem(ingot, Manasteel)), 3000, null, null);
    ManaInfusionRecipe(provider, "manasteel_block", Ingredient.of(ChemicalHelper.getItem(block, BlackSteel)),
        new ItemStack(ChemicalHelper.getItem(block, Manasteel)), 27000, null, null);
    ManaInfusionRecipe(provider, "mana_pearl", Ingredient.of(new ItemStack(AEItems.FLUIX_PEARL)),
        new ItemStack(BotaniaItems.manaPearl), 6000, null, null);
    // ManaInfusionRecipe(provider, "mana_string", Ingredient.of(ItemsRegistry.MAGE_FIBER.asItem()), new
    // ItemStack(BotaniaItems.manaString), 1250, null, null);

    if (isDev()) {
      ManaInfusionRecipe(provider, "mana_diamond_gem_exquisite", Ingredient.of(ChemicalHelper.getItem(gemExquisite, Diamond)),
          new ItemStack(ChemicalHelper.getItem(gemExquisite, ManaDiamond)), 160000, null, null);
      ManaInfusionRecipe(provider, "mana_diamond_gem_flawless", Ingredient.of(ChemicalHelper.getItem(gemFlawless, Diamond)),
          new ItemStack(ChemicalHelper.getItem(gemFlawless, ManaDiamond)), 80000, null, null);
      ManaInfusionRecipe(provider, "mana_diamond_gem", Ingredient.of(ChemicalHelper.getItem(gem, Diamond)),
          new ItemStack(ChemicalHelper.getItem(gem, ManaDiamond)), 40000, null, null);
      ManaInfusionRecipe(provider, "mana_diamond_gem_flawed", Ingredient.of(ChemicalHelper.getItem(gemFlawed, Diamond)),
          new ItemStack(ChemicalHelper.getItem(gemFlawed, ManaDiamond)), 20000, null, null);
    }
    if (com.gregtechceu.gtceu.config.ConfigHolder.INSTANCE.recipes.generateLowQualityGems) {
      ManaInfusionRecipe(provider, "mana_diamond_gem_chipped", Ingredient.of(ChemicalHelper.getItem(gemChipped, Diamond)),
          new ItemStack(ChemicalHelper.getItem(gemChipped, ManaDiamond)), 10000, null, null);
    }


    RunicAltarRecipe(provider, "runerock_block", 1000000, new ItemStack(ChemicalHelper.getItem(ingot, Runerock), 1),
        false,
        new Ingredient[]{Ingredient.of(BotaniaItems.runeEarth), Ingredient.of(BotaniaItems.runeAir),
            Ingredient.of(BotaniaItems.runeFire), Ingredient.of(BotaniaItems.runeWater),
            Ingredient.of(BotaniaItems.runeSpring), Ingredient.of(BotaniaItems.runeSummer),
            Ingredient.of(BotaniaItems.runeAutumn), Ingredient.of(BotaniaItems.runeWinter),
            Ingredient.of(BotaniaItems.runeMana), Ingredient.of(BotaniaItems.runeLust),
            Ingredient.of(BotaniaItems.runeGluttony), Ingredient.of(BotaniaItems.runeGreed),
            Ingredient.of(BotaniaItems.runeSloth), Ingredient.of(BotaniaItems.runeWrath),
            Ingredient.of(BotaniaItems.runeEnvy), Ingredient.of(BotaniaItems.runePride)});
    RunicAltarRecipe(provider, "runerock_block_plas", 1000000,
        new ItemStack(ChemicalHelper.getItem(ingot, Runerock), 4), false,
        new Ingredient[]{Ingredient.of(ModItems.asgardRune), Ingredient.of(ModItems.vanaheimRune),
            Ingredient.of(ModItems.alfheimRune), Ingredient.of(ModItems.midgardRune),
            Ingredient.of(ModItems.joetunheimRune), Ingredient.of(ModItems.muspelheimRune),
            Ingredient.of(ModItems.niflheimRune), Ingredient.of(ModItems.nidavellirRune),
            Ingredient.of(ModItems.helheimRune)});

    TAgglomerationRecipe(provider, "gaiasteel_ingot", 2500000, new ItemStack(ChemicalHelper.getItem(ingot, Gaiasteel), 3),
        new Ingredient[] { Ingredient.of(ModItems.asgardRune), Ingredient.of(ModItems.vanaheimRune),
            Ingredient.of(ModItems.alfheimRune), Ingredient.of(ChemicalHelper.getItem(ingot, Alfsteel)),
            Ingredient.of(ChemicalHelper.getItem(ingot, Runerock)), Ingredient.of(ModItems.midgardRune),
            Ingredient.of(ModItems.joetunheimRune), Ingredient.of(ModItems.muspelheimRune),
            Ingredient.of(ChemicalHelper.getItem(ingot, Alfsteel)), Ingredient.of(ChemicalHelper.getItem(ingot, Runerock)),
            Ingredient.of(ModItems.niflheimRune), Ingredient.of(ModItems.nidavellirRune),
            Ingredient.of(ModItems.helheimRune), Ingredient.of(ChemicalHelper.getItem(ingot, Alfsteel)),
            Ingredient.of(ChemicalHelper.getItem(ingot, Runerock)) });
    TAgglomerationRecipe(provider, "gaia_ingot", 5000000, new ItemStack(ChemicalHelper.getItem(ingot, Gaia), 2),
        new Ingredient[] { Ingredient.of(ChemicalHelper.getItem(ingot, Gaiasteel)), Ingredient.of(BotaniaItems.lifeEssence), Ingredient.of(ChemicalHelper.getItem(ingot, Gaiasteel)), Ingredient.of(BotaniaItems.lifeEssence) });

    TAgglomerationRecipe(provider, "alfsteel_ingot", 1500000, new ItemStack(ChemicalHelper.getItem(ingot, Alfsteel)),
        new Ingredient[] { Ingredient.of(BotaniaItems.elementium), Ingredient.of(BotaniaItems.pixieDust), Ingredient.of(BotaniaItems.dragonstone) });

    VanillaRecipeHelper.addShapedRecipe(provider, "manasteel_shears", new ItemStack(BotaniaItems.manasteelShears), "PSP", "hRf", "TdT",
        'P', new MaterialEntry(TagPrefix.plate, Manasteel),
        'S', new MaterialEntry(TagPrefix.screw, Manasteel),
        'R', new MaterialEntry(TagPrefix.ring, Manasteel),
        'T', BotaniaItems.livingwoodTwig);

    VanillaRecipeHelper.addShapedRecipe(provider, "elementium_shears", new ItemStack(BotaniaItems.elementiumShears), "PSP", "hRf", "TdT",
        'P', new MaterialEntry(TagPrefix.plate, Elementium),
        'S', new MaterialEntry(TagPrefix.screw, Elementium),
        'R', new MaterialEntry(TagPrefix.ring, Elementium),
        'T', BotaniaItems.dreamwoodTwig);


    RecipeAddition.createShovelRecipe(provider, "manasteel_shovel", new ItemStack(BotaniaItems.manasteelShovel), Manasteel, new ItemStack(BotaniaItems.livingwoodTwig));
    RecipeAddition.createPickaxeRecipe(provider, "manasteel_pickaxe", new ItemStack(BotaniaItems.manasteelPick), Manasteel, new ItemStack(BotaniaItems.livingwoodTwig));
    RecipeAddition.createAxeRecipe(provider, "manasteel_axe", new ItemStack(BotaniaItems.manasteelAxe), Manasteel, new ItemStack(BotaniaItems.livingwoodTwig));
    RecipeAddition.createSwordRecipe(provider, "manasteel_sword", new ItemStack(BotaniaItems.manasteelSword), Manasteel, new ItemStack(BotaniaItems.livingwoodTwig));
    RecipeAddition.createHoeRecipe(provider, "manasteel_hoe", new ItemStack(BotaniaItems.manasteelHoe), Manasteel, new ItemStack(BotaniaItems.livingwoodTwig));

    RecipeAddition.createHelmetRecipe(provider, "manasteel_helmet", new ItemStack(BotaniaItems.manasteelHelm), Manasteel);
    RecipeAddition.createChestplateRecipe(provider, "manasteel_chestplate", new ItemStack(BotaniaItems.manasteelChest), Manasteel);
    RecipeAddition.createLeggingsRecipe(provider, "manasteel_leggings", new ItemStack(BotaniaItems.manasteelLegs), Manasteel);
    RecipeAddition.createBootsRecipe(provider, "manasteel_boots", new ItemStack(BotaniaItems.manasteelBoots), Manasteel);

    RecipeAddition.createSwordRecipe(provider, "terra_sword", new ItemStack(BotaniaItems.terraSword), Terrasteel, new ItemStack(BotaniaItems.livingwoodTwig));
    RecipeAddition.createAxeRecipe(provider, "terra_axe", new ItemStack(BotaniaItems.terraAxe), Terrasteel, new ItemStack(BotaniaItems.livingwoodTwig));

    VanillaRecipeHelper.addShapedRecipe(provider, true, "terrasteel_helmet",
        new ItemStack(BotaniaItems.terrasteelHelm),
        "LRL", "PHP", "PhP",
        'P', new MaterialEntry(TagPrefix.plate, Terrasteel),
        'H', new ItemStack(BotaniaItems.manasteelHelm),
        'L', new MaterialEntry(TagPrefix.rod, Livingwood),
        'R', new ItemStack(BotaniaItems.runeSpring));

    VanillaRecipeHelper.addShapedRecipe(provider, true, "terrasteel_chestplate",
        new ItemStack(BotaniaItems.terrasteelChest),
        "LRL", "PHP", "PhP",
        'P', new MaterialEntry(TagPrefix.plate, Terrasteel),
        'H', new ItemStack(BotaniaItems.manasteelChest),
        'L', new MaterialEntry(TagPrefix.rod, Livingwood),
        'R', new ItemStack(BotaniaItems.runeSummer));

    VanillaRecipeHelper.addShapedRecipe(provider, true, "terrasteel_leggings",
        new ItemStack(BotaniaItems.terrasteelLegs),
        "LRL", "PHP", "PhP",
        'P', new MaterialEntry(TagPrefix.plate, Terrasteel),
        'H', new ItemStack(BotaniaItems.terrasteelLegs),
        'L', new MaterialEntry(TagPrefix.rod, Livingwood),
        'R', new ItemStack(BotaniaItems.runeAutumn));

    VanillaRecipeHelper.addShapedRecipe(provider, true, "terrasteel_boots",
        new ItemStack(BotaniaItems.terrasteelBoots),
        "LRL", "PHP", "PhP",
        'P', new MaterialEntry(TagPrefix.plate, Terrasteel),
        'H', new ItemStack(BotaniaItems.manasteelBoots),
        'L', new MaterialEntry(TagPrefix.rod, Livingwood),
        'R', new ItemStack(BotaniaItems.runeWinter));

    RecipeAddition.createShovelRecipe(provider, "elementium_shovel", new ItemStack(BotaniaItems.elementiumShovel), Elementium, new ItemStack(BotaniaItems.dreamwoodTwig));
    RecipeAddition.createPickaxeRecipe(provider, "elementium_pickaxe", new ItemStack(BotaniaItems.elementiumPick), Elementium, new ItemStack(BotaniaItems.dreamwoodTwig));
    RecipeAddition.createAxeRecipe(provider, "elementium_axe", new ItemStack(BotaniaItems.elementiumAxe), Elementium, new ItemStack(BotaniaItems.dreamwoodTwig));
    RecipeAddition.createSwordRecipe(provider, "elementium_sword", new ItemStack(BotaniaItems.elementiumSword), Elementium, new ItemStack(BotaniaItems.dreamwoodTwig));
    RecipeAddition.createHoeRecipe(provider, "elementium_hoe", new ItemStack(BotaniaItems.elementiumHoe), Elementium, new ItemStack(BotaniaItems.dreamwoodTwig));

    RecipeAddition.createHelmetRecipe(provider, "elementium_helmet", new ItemStack(BotaniaItems.elementiumHelm), Elementium);
    RecipeAddition.createChestplateRecipe(provider, "elementium_chestplate", new ItemStack(BotaniaItems.elementiumChest), Elementium);
    RecipeAddition.createLeggingsRecipe(provider, "elementium_leggings", new ItemStack(BotaniaItems.elementiumLegs), Elementium);
    RecipeAddition.createBootsRecipe(provider, "elementium_boots", new ItemStack(BotaniaItems.elementiumBoots), Elementium);

    RecipeAddition.createHelmetRecipe(provider, "goblin_slayer_boots", new ItemStack(ExtraBotanyItems.goblinSlayerHelmet), Photonium);
    RecipeAddition.createChestplateRecipe(provider, "goblin_slayer_chestplate", new ItemStack(ExtraBotanyItems.goblinSlayerChestplate), Photonium);
    RecipeAddition.createLeggingsRecipe(provider, "goblin_slayer_leggings", new ItemStack(ExtraBotanyItems.goblinSlayerLeggings), Photonium);
    RecipeAddition.createBootsRecipe(provider, "goblin_slayer_boots", new ItemStack(ExtraBotanyItems.goblinSlayerBoots), Photonium);

    RecipeAddition.createHelmetRecipe(provider, "shadow_warrior_helmet", new ItemStack(ExtraBotanyItems.shadowWarriorHelmet), Shadowium);
    RecipeAddition.createChestplateRecipe(provider, "shadow_warrior_chestplate", new ItemStack(ExtraBotanyItems.shadowWarriorChestplate), Shadowium);
    RecipeAddition.createLeggingsRecipe(provider, "shadow_warrior_leggings", new ItemStack(ExtraBotanyItems.shadowWarriorLeggings), Shadowium);
    RecipeAddition.createBootsRecipe(provider, "shadow_warrior_boots", new ItemStack(ExtraBotanyItems.shadowWarriorBoots), Shadowium);

    for (DyeColor color : DyeColor.values()) {
      exractorPetal(provider, color);
    }

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

  private static void TAgglomerationRecipe(
      Consumer<FinishedRecipe> provider,
      String id,
      int mana,
      ItemStack output,
      Ingredient[] input) {
    var build = TerrestrialAgglomerationRecipeBuilder.builder(id);
    build
        .output(output)
        .mana(mana);
    for (Ingredient ingredient : input) build.addIngredient(ingredient);
    build.save(provider);
  }

  private static void exractorPetal(Consumer<FinishedRecipe> provider, DyeColor color) {
    String colorName = color.getName();
    ISGRecipeTypes.EXTRACTOR_RECIPES.recipeBuilder(colorName + "_mystical_flower_from_petal").duration(10).EUt(8)
        .inputItems(new ItemStack(BuiltInRegistries.ITEM.get(RLUtils.botania(colorName + "_mystical_flower"))))
        .outputItems(new ItemStack(BuiltInRegistries.ITEM.get(RLUtils.botania(colorName + "_petal"))), 2)
        .save(provider);

    ISGRecipeTypes.EXTRACTOR_RECIPES.recipeBuilder(colorName + "_bouble_flower_from_petal").duration(10).EUt(8)
        .inputItems(new ItemStack(BuiltInRegistries.ITEM.get(RLUtils.botania(colorName + "_double_flower"))))
        .outputItems(new ItemStack(BuiltInRegistries.ITEM.get(RLUtils.botania(colorName + "_petal"))), 4)
        .save(provider);

    ISGRecipeTypes.EXTRACTOR_RECIPES.recipeBuilder(colorName + "_petal_block_from_petal").duration(10).EUt(8)
        .inputItems(new ItemStack(BuiltInRegistries.ITEM.get(RLUtils.botania(colorName + "_petal_block"))))
        .outputItems(new ItemStack(BuiltInRegistries.ITEM.get(RLUtils.botania(colorName + "_petal"))), 4)
        .save(provider);

    ISGRecipeTypes.COMPRESSOR_RECIPES.recipeBuilder(colorName + "_petal_from_petal_block").duration(10).EUt(8)
        .inputItems(new ItemStack(BuiltInRegistries.ITEM.get(RLUtils.botania(colorName + "_petal"))),9)
        .outputItems(new ItemStack(BuiltInRegistries.ITEM.get(RLUtils.botania(colorName + "_petal_block"))))
        .save(provider);

    ISGRecipeTypes.EXTRACTOR_RECIPES.recipeBuilder(colorName + "_petal_from_dye").duration(10).EUt(8)
        .inputItems(BotaniaTags.Items.getPetalTag(color))
        .outputItems(new ItemStack(BuiltInRegistries.ITEM.get(ResourceLocation.withDefaultNamespace(colorName + "_dye"))))
        .save(provider);
  }

}
