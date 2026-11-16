package com.zircky.industrialsorcerygreg.common.data.materials;

import com.gregtechceu.gtceu.api.data.tag.TagPrefix;

import io.github.lounode.extrabotany.common.block.ExtraBotanyBlocks;
import io.github.lounode.extrabotany.common.item.ExtraBotanyItems;
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

        TagPrefix.nugget.setIgnored(Orichalcos, () -> ExtraBotanyItems.orichalcosNugget);
        TagPrefix.ingot.setIgnored(Orichalcos, () -> ExtraBotanyItems.orichalcos);
        TagPrefix.block.setIgnored(Orichalcos, () -> ExtraBotanyBlocks.orichalcosBlock);
        TagPrefix.nugget.setIgnored(Photonium, () -> ExtraBotanyItems.photoniumNugget);
        TagPrefix.ingot.setIgnored(Photonium, () -> ExtraBotanyItems.photonium);
        TagPrefix.block.setIgnored(Photonium, () -> ExtraBotanyBlocks.photoniumBlock);
        TagPrefix.nugget.setIgnored(Shadowium, () -> ExtraBotanyItems.shadowiumNugget);
        TagPrefix.ingot.setIgnored(Shadowium, () -> ExtraBotanyItems.shadowium);
        TagPrefix.block.setIgnored(Shadowium, () -> ExtraBotanyBlocks.shadowiumBlock);
        TagPrefix.nugget.setIgnored(Aerialite, () -> ExtraBotanyItems.aerialiteNugget);
        TagPrefix.ingot.setIgnored(Aerialite, () -> ExtraBotanyItems.aerialite);
        TagPrefix.block.setIgnored(Aerialite, () -> ExtraBotanyBlocks.aerialiteBlock);

        TagPrefix.block.setIgnored(Livingwood, () -> BotaniaBlocks.livingwoodPlanks);
        TagPrefix.block.setIgnored(Dreamwood, () -> BotaniaBlocks.dreamwoodPlanks);
        TagPrefix.block.setIgnored(Shimmerwood, () -> BotaniaBlocks.shimmerwoodPlanks);
        TagPrefix.block.setIgnored(Livingrock, () -> BotaniaBlocks.livingrock);
        TagPrefix.block.setIgnored(Shimmerrock, () -> BotaniaBlocks.shimmerrock);
        TagPrefix.block.setIgnored(ManaGlass, () -> BotaniaBlocks.manaGlass);
        TagPrefix.block.setIgnored(ElfGlass, () -> BotaniaBlocks.elfGlass);
        TagPrefix.block.setIgnored(BifrostPerm, () -> BotaniaBlocks.bifrostPerm);
    }
}
