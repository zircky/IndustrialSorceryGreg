package com.zircky.industrialsorcerygreg.api.registries;

import com.gregtechceu.gtceu.api.block.MetaMachineBlock;
import com.gregtechceu.gtceu.api.blockentity.BlockEntityCreationInfo;
import com.gregtechceu.gtceu.api.item.MetaMachineItem;
import com.gregtechceu.gtceu.api.machine.MachineInstanceFactory;
import com.gregtechceu.gtceu.api.machine.MetaMachine;
import com.gregtechceu.gtceu.api.machine.MultiblockMachineDefinition;
import com.gregtechceu.gtceu.api.machine.multiblock.MultiblockControllerMachine;
import com.gregtechceu.gtceu.api.multiblock.pattern.IBlockPattern;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import com.gregtechceu.gtceu.api.registry.registrate.MultiblockMachineBuilder;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.BlockBehaviour;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public final class ISGMultiblockMachineBuilder<DEFINITION extends MultiblockMachineDefinition,
    MACHINE extends MultiblockControllerMachine,
    SELF extends MultiblockMachineBuilder<DEFINITION, MACHINE, SELF>> extends MultiblockMachineBuilder<DEFINITION, MACHINE, SELF>{
  private List<Function<MultiblockMachineDefinition, IBlockPattern>> subPattern;

  public ISGMultiblockMachineBuilder(GTRegistrate registrate, String name, BiFunction<BlockBehaviour.Properties, DEFINITION, MetaMachineBlock> blockFactory, BiFunction<MetaMachineBlock, Item.Properties, MetaMachineItem> itemFactory, MachineInstanceFactory<MACHINE> blockEntityFactory) {
    super(registrate, name, blockFactory, itemFactory, blockEntityFactory);
  }


  public SELF subPattern(Function<MultiblockMachineDefinition, IBlockPattern> pattern) {
    if (subPattern == null) subPattern = new ArrayList<>();
    subPattern.add(pattern);
    return getThis();
  }

//  @Override
//  public DEFINITION register() {
//    var definition = super.register();
//    if (subPattern != null) {
//      definition.setSubPatternFactory(subPattern);
//    }
//    return value = definition;
//  }
}
