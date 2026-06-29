package com.zircky.industrialsorcerygreg.api.registries;

import com.gregtechceu.gtceu.api.block.MetaMachineBlock;
import com.gregtechceu.gtceu.api.blockentity.BlockEntityCreationInfo;
import com.gregtechceu.gtceu.api.item.MetaMachineItem;
import com.gregtechceu.gtceu.api.machine.MetaMachine;
import com.gregtechceu.gtceu.api.machine.MultiblockMachineDefinition;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.BiFunction;
import java.util.function.Function;

public final class ISGRegistrate extends GTRegistrate {

  ISGRegistrate(String modId) {
    super(modId);
  }

  public static ISGRegistrate create(final String modid) {
    return new ISGRegistrate(modid);
  }

  @Override
  public ISGMultiblockMachineBuilder<MultiblockMachineDefinition> multiblock(String name,
                                                                             BiFunction<BlockBehaviour.Properties, MultiblockMachineDefinition, MetaMachineBlock> blockFactory,
                                                                             BiFunction<MetaMachineBlock, Item.Properties, MetaMachineItem> itemFactory,
                                                                             Function<BlockEntityCreationInfo, MetaMachine> blockEntityFactory) {
    return new ISGMultiblockMachineBuilder<>(this, name,
        blockFactory, itemFactory, blockEntityFactory);
  }

  @Override
  public ISGMultiblockMachineBuilder<MultiblockMachineDefinition> multiblock(String name,
                                                                                Function<BlockEntityCreationInfo, MetaMachine> blockEntityFactory) {
    return new ISGMultiblockMachineBuilder<>(this, name, MetaMachineBlock::new, MetaMachineItem::new,
        blockEntityFactory);
  }

}
