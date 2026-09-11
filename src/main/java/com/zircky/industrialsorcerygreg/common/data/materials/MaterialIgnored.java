package com.zircky.industrialsorcerygreg.common.data.materials;

import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import igentuman.nc.content.materials.Ingots;
import vazkii.botania.common.block.BotaniaBlocks;
import vazkii.botania.common.item.BotaniaItems;

import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;

public final class MaterialIgnored {
  public static void init() {
    TagPrefix.dust.setIgnored(Mana, () -> () -> BotaniaItems.manaPowder);
    TagPrefix.ingot.setIgnored(Manasteel, () -> () -> BotaniaItems.manaSteel);
    TagPrefix.nugget.setIgnored(Manasteel, () -> () -> BotaniaItems.manasteelNugget);
    TagPrefix.block.setIgnored(Manasteel, () -> BotaniaBlocks.manasteelBlock);
    TagPrefix.ingot.setIgnored(Terrasteel, () -> () -> BotaniaItems.terrasteel);
    TagPrefix.nugget.setIgnored(Terrasteel, () -> () -> BotaniaItems.terrasteelNugget);
    TagPrefix.block.setIgnored(Terrasteel, () -> BotaniaBlocks.terrasteelBlock);
    TagPrefix.ingot.setIgnored(Elementium, () -> () -> BotaniaItems.elementium);
    TagPrefix.nugget.setIgnored(Elementium, () -> () -> BotaniaItems.elementiumNugget);
    TagPrefix.block.setIgnored(Elementium, () -> BotaniaBlocks.elementiumBlock);
    TagPrefix.ingot.setIgnored(Gaia, () -> () -> BotaniaItems.gaiaIngot);
    TagPrefix.gem.setIgnored(ManaDiamond, () -> () -> BotaniaItems.manaDiamond);
    TagPrefix.block.setIgnored(ManaDiamond, () -> BotaniaBlocks.manaDiamondBlock);
    TagPrefix.gem.setIgnored(Dragonstone, () -> () -> BotaniaItems.dragonstone);
    TagPrefix.block.setIgnored(Dragonstone, () -> BotaniaBlocks.dragonstoneBlock);

  }
}
