package com.zircky.industrialsorcerygreg.data.recipe.integration.bloodmagic;

import com.zircky.industrialsorcerygreg.common.data.ISGItems;
import com.zircky.industrialsorcerygreg.data.recipe.builder.bloodmagic.AlchemyArrayRecipeBuilder;
import com.zircky.industrialsorcerygreg.data.recipe.builder.bloodmagic.BloodAltarRecipeBuilder;

import net.minecraft.data.recipes.FinishedRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import vazkii.botania.common.item.BotaniaItems;
import wayoftime.bloodmagic.BloodMagic;
import wayoftime.bloodmagic.common.item.BloodMagicItems;

import java.util.function.Consumer;

public class BloodAltarRecipe {

  public static void init(Consumer<FinishedRecipe> provider) {
    BloodAltarRecipeBuilder.builder("weak_blood_orb")
        .input(ISGItems.WEAK_BLOOD_ORB_CORE)
        .output(BloodMagicItems.WEAK_BLOOD_ORB.get())
        .minimumTier(0)
        .syphon(5000)
        .consumeRate(5)
        .drainRate(1)
        .save(provider);

    BloodAltarRecipeBuilder.builder("apprentice_blood_orb")
        .input(ISGItems.APPRENTICE_BLOOD_ORB_CORE)
        .output(BloodMagicItems.APPRENTICE_BLOOD_ORB.get())
        .minimumTier(1)
        .syphon(10000)
        .consumeRate(20)
        .drainRate(10)
        .save(provider);

    BloodAltarRecipeBuilder.builder("magician_blood_orb")
        .input(ISGItems.MAGICIAN_BLOOD_ORB_CORE)
        .output(BloodMagicItems.MAGICIAN_BLOOD_ORB.get())
        .minimumTier(2)
        .syphon(30000)
        .consumeRate(30)
        .drainRate(30)
        .save(provider);

    BloodAltarRecipeBuilder.builder("master_blood_orb")
        .input(ISGItems.MASTER_BLOOD_ORB_CORE)
        .output(BloodMagicItems.MASTER_BLOOD_ORB.get())
        .minimumTier(3)
        .syphon(75000)
        .consumeRate(30)
        .drainRate(50)
        .save(provider);

    BloodAltarRecipeBuilder.builder("archmage_blood_orb")
        .input(ISGItems.ARCHMAGE_BLOOD_ORB_CORE)
        .output(BloodMagicItems.ARCHMAGE_BLOOD_ORB.get())
        .minimumTier(4)
        .syphon(120000)
        .consumeRate(50)
        .drainRate(120)
        .save(provider);

    AlchemyArrayRecipeBuilder.builder("array/living_helmet")
        .input(BloodMagicItems.REAGENT_BINDING.get())
        .catalyst(BotaniaItems.manasteelHelm)
        .output(BloodMagicItems.LIVING_HELMET.get())
        .texture(BloodMagic.rl("textures/models/alchemyarrays/bindingarray.png"))
        .save(provider);

    AlchemyArrayRecipeBuilder.builder("array/living_plate")
        .input(BloodMagicItems.REAGENT_BINDING.get())
        .catalyst(BotaniaItems.manasteelChest)
        .output(BloodMagicItems.LIVING_PLATE.get())
        .texture(BloodMagic.rl("textures/models/alchemyarrays/bindingarray.png"))
        .save(provider);

    AlchemyArrayRecipeBuilder.builder("array/living_leggings")
        .input(BloodMagicItems.REAGENT_BINDING.get())
        .catalyst(BotaniaItems.manasteelLegs)
        .output(BloodMagicItems.LIVING_LEGGINGS.get())
        .texture(BloodMagic.rl("textures/models/alchemyarrays/bindingarray.png"))
        .save(provider);

    AlchemyArrayRecipeBuilder.builder("array/living_boots")
        .input(BloodMagicItems.REAGENT_BINDING.get())
        .catalyst(BotaniaItems.manasteelBoots)
        .output(BloodMagicItems.LIVING_BOOTS.get())
        .texture(BloodMagic.rl("textures/models/alchemyarrays/bindingarray.png"))
        .save(provider);

  }
}
