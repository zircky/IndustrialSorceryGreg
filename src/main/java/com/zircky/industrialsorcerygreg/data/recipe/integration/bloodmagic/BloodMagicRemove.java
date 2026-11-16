package com.zircky.industrialsorcerygreg.data.recipe.integration.bloodmagic;

import net.minecraft.resources.ResourceLocation;

import wayoftime.bloodmagic.BloodMagic;

import java.util.function.Consumer;

public class BloodMagicRemove {

    public static void init(Consumer<ResourceLocation> consumer) {
        consumer.accept(BloodMagic.rl("altar/weakbloodorb"));
        consumer.accept(BloodMagic.rl("altar/apprenticebloodorb"));
        consumer.accept(BloodMagic.rl("altar/magicianbloodorb"));
        consumer.accept(BloodMagic.rl("altar/masterbloodorb"));
        consumer.accept(BloodMagic.rl("altar/archmagebloodorb"));
        consumer.accept(BloodMagic.rl("array/living_helmet"));
        consumer.accept(BloodMagic.rl("array/living_plate"));
        consumer.accept(BloodMagic.rl("array/living_leggings"));
        consumer.accept(BloodMagic.rl("array/living_boots"));
    }
}
