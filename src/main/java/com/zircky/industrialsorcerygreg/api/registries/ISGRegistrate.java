package com.zircky.industrialsorcerygreg.api.registries;

import com.gregtechceu.gtceu.api.block.IMachineBlock;
import com.gregtechceu.gtceu.api.block.MetaMachineBlock;
import com.gregtechceu.gtceu.api.blockentity.MetaMachineBlockEntity;
import com.gregtechceu.gtceu.api.item.MetaMachineItem;
import com.gregtechceu.gtceu.api.machine.IMachineBlockEntity;
import com.gregtechceu.gtceu.api.machine.MetaMachine;
import com.gregtechceu.gtceu.api.machine.MultiblockMachineDefinition;
import com.gregtechceu.gtceu.api.machine.multiblock.MultiblockControllerMachine;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import org.apache.commons.lang3.function.TriFunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public final class ISGRegistrate extends GTRegistrate {

  ISGRegistrate(String modId) {
    super(modId);
  }

  public static ISGRegistrate create(final String modid) {
    return new ISGRegistrate(modid);
  }

  public ISGMultiblockMachineBuilder<MultiblockMachineDefinition> multiblock(String name,
                                                                             Function<IMachineBlockEntity, ? extends MultiblockControllerMachine> metaMachine,
                                                                             BiFunction<BlockBehaviour.Properties, MultiblockMachineDefinition, IMachineBlock> blockFactory,
                                                                             BiFunction<IMachineBlock, Item.Properties, MetaMachineItem> itemFactory,
                                                                             TriFunction<BlockEntityType<?>, BlockPos, BlockState, IMachineBlockEntity> blockEntityFactory) {
    return new ISGMultiblockMachineBuilder<>(this, name, metaMachine,
        blockFactory, itemFactory, blockEntityFactory);
  }

  public ISGMultiblockMachineBuilder<MultiblockMachineDefinition> multiblock(String name,
                                                                             Function<IMachineBlockEntity, ? extends MultiblockControllerMachine> metaMachine) {
    return new ISGMultiblockMachineBuilder<>(this, name, metaMachine,
        MetaMachineBlock::new, MetaMachineItem::new, MetaMachineBlockEntity::new);
  }
}
