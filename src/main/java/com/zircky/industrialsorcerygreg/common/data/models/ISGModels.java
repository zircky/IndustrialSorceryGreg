package com.zircky.industrialsorcerygreg.common.data.models;

import com.gregtechceu.gtceu.common.data.models.GTModels;
import com.tterrag.registrate.providers.DataGenContext;
import com.tterrag.registrate.providers.RegistrateBlockstateProvider;
import com.tterrag.registrate.util.nullness.NonNullBiConsumer;
import com.zircky.industrialsorcerygreg.ISGCore;
import net.minecraft.world.level.block.Block;

public class ISGModels extends GTModels {
  public static NonNullBiConsumer<DataGenContext<Block, Block>, RegistrateBlockstateProvider> createComponentCasingModel(String name, String tierName) {
    return (ctx, prov) -> {
      prov.simpleBlock(ctx.getEntry(), prov.models().getExistingFile(ISGCore.id("block/casings/%s/%s".formatted(name, tierName))));
    };
  }
}
