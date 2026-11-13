package com.zircky.industrialsorcerygreg.data.recipe.integration.botania;

import com.zircky.industrialsorcerygreg.utils.RLUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;

import java.util.function.Consumer;

public class BotaniaRemove {
  public static void init(Consumer<ResourceLocation> consumer) {
    consumer.accept(RLUtils.botania("mana_infusion/manasteel"));
    consumer.accept(RLUtils.botania("mana_infusion/manasteel_block"));
    consumer.accept(RLUtils.botania("mana_infusion/mana_pearl"));
    consumer.accept(RLUtils.botania("mana_infusion/manasteel"));
    consumer.accept(RLUtils.botania("manasteel_shears"));
    consumer.accept(RLUtils.botania("elementium_shears"));
    consumer.accept(RLUtils.botania("manasteel_shovel"));
    consumer.accept(RLUtils.botania("manasteel_pick"));
    consumer.accept(RLUtils.botania("manasteel_axe"));
    consumer.accept(RLUtils.botania("manasteel_sword"));
    consumer.accept(RLUtils.botania("manasteel_hoe"));
    consumer.accept(RLUtils.botania("manasteel_helmet"));
    consumer.accept(RLUtils.botania("manasteel_chestplate"));
    consumer.accept(RLUtils.botania("manasteel_leggings"));
    consumer.accept(RLUtils.botania("manasteel_boots"));
    consumer.accept(RLUtils.botania("terra_sword"));
    consumer.accept(RLUtils.botania("terra_axe"));
    consumer.accept(RLUtils.botania("terrasteel_helmet"));
    consumer.accept(RLUtils.botania("terrasteel_chestplate"));
    consumer.accept(RLUtils.botania("terrasteel_leggings"));
    consumer.accept(RLUtils.botania("terrasteel_boots"));
    consumer.accept(RLUtils.botania("elementium_shovel"));
    consumer.accept(RLUtils.botania("elementium_pick"));
    consumer.accept(RLUtils.botania("elementium_axe"));
    consumer.accept(RLUtils.botania("elementium_sword"));
    consumer.accept(RLUtils.botania("elementium_hoe"));
    consumer.accept(RLUtils.botania("elementium_helmet"));
    consumer.accept(RLUtils.botania("elementium_chestplate"));
    consumer.accept(RLUtils.botania("elementium_leggings"));
    consumer.accept(RLUtils.botania("elementium_boots"));
    consumer.accept(RLUtils.botania("manasteel_block"));
    consumer.accept(RLUtils.botania("terrasteel_block"));
    consumer.accept(RLUtils.botania("elementium_block"));
    consumer.accept(RLUtils.botania("mana_diamond_block"));
    consumer.accept(RLUtils.botania("dragonstone_block"));
    consumer.accept(RLUtils.botania("gaia_ingot"));

    for (DyeColor color : DyeColor.values()) {
      String colorName = color.getName();
      consumer.accept(RLUtils.botania("conversions/" + colorName + "_petal_block_deconstruct"));
      consumer.accept(RLUtils.botania("petal_"+ colorName + "_double"));
      consumer.accept(RLUtils.botania("petal_" + colorName));
      consumer.accept(ResourceLocation.withDefaultNamespace(colorName + "_dye"));
    }

  }


}
