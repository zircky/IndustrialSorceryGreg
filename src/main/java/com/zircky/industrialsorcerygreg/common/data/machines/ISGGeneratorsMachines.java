package com.zircky.industrialsorcerygreg.common.data.machines;

import com.gregtechceu.gtceu.api.data.RotationState;
import com.gregtechceu.gtceu.api.machine.MultiblockMachineDefinition;
import com.gregtechceu.gtceu.api.machine.multiblock.WorkableElectricMultiblockMachine;
import com.gregtechceu.gtceu.api.pattern.BlockPattern;
import com.gregtechceu.gtceu.api.pattern.FactoryBlockPattern;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import com.gregtechceu.gtceu.common.machine.multiblock.generator.LargeTurbineMachine;
import com.zircky.industrialsorcerygreg.api.registries.ISGRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

import java.util.function.Function;
import java.util.function.Supplier;

import static com.zircky.industrialsorcerygreg.api.registries.ISGRegistries.REGISTRATE;

public class ISGGeneratorsMachines {
  public static void init() {
  }

//  public static MultiblockMachineDefinition STEAM_MEGA_TURBINE = REGISTRATE.multiblock("steam_mega_turbine", WorkableElectricMultiblockMachine::new)
//      .rotationState(RotationState.NON_Y_AXIS)
//      .langValue("Steam Mega Turbine")
//      .register();


//  private static MultiblockMachineDefinition registerMegaTurbine(GTRegistrate registries, String name, int tier, GTRecipeType recipeType, Supplier<? extends Block> casing, Supplier<? extends Block> gear, ResourceLocation casingTexture, ResourceLocation overlayModel, Function<MultiblockMachineDefinition, BlockPattern> subPattern) {
//    return registries.multiblock(name, holder -> new LargeTurbineMachine(holder, tier))
//        .rotationState(RotationState.NON_Y_AXIS)
//        .recipeType(recipeType)
//        .generator(true)
//        .recipeModifier(LargeTurbineMachine::recipeModifier, true)
//        .appearanceBlock(casing)
//        .pattern(definition -> FactoryBlockPattern.start()
//            .aisle("")
//            .build())
//  }
}
