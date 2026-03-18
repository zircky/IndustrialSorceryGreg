package com.zircky.industrialsorcerygreg.api.registries;

import com.gregtechceu.gtceu.api.block.IMachineBlock;
import com.gregtechceu.gtceu.api.item.MetaMachineItem;
import com.gregtechceu.gtceu.api.machine.IMachineBlockEntity;
import com.gregtechceu.gtceu.api.machine.MultiblockMachineDefinition;
import com.gregtechceu.gtceu.api.machine.multiblock.MultiblockControllerMachine;
import com.gregtechceu.gtceu.api.pattern.BlockPattern;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import com.gregtechceu.gtceu.api.registry.registrate.MultiblockMachineBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import org.apache.commons.lang3.function.TriFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public final class ISGMultiblockMachineBuilder<DEFINITION extends MultiblockMachineDefinition>
    extends MultiblockMachineBuilder<DEFINITION, ISGMultiblockMachineBuilder<DEFINITION>> {
  private List<Function<MultiblockMachineDefinition, BlockPattern>> subPattern;

  public ISGMultiblockMachineBuilder(GTRegistrate registrate, String name, Function<IMachineBlockEntity, ? extends MultiblockControllerMachine> metaMachine, BiFunction<BlockBehaviour.Properties, DEFINITION, IMachineBlock> blockFactory, BiFunction<IMachineBlock, Item.Properties, MetaMachineItem> itemFactory, TriFunction<BlockEntityType<?>, BlockPos, BlockState, IMachineBlockEntity> blockEntityFactory) {
    super(registrate, name, metaMachine, blockFactory, itemFactory, blockEntityFactory);
  }

  public ISGMultiblockMachineBuilder<DEFINITION> subPattern(Function<MultiblockMachineDefinition, BlockPattern> pattern) {
    if (subPattern == null) subPattern = new ArrayList<>();
    subPattern.add(pattern);
    return getThis();
  }

}
