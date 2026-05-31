package com.zircky.industrialsorcerygreg.common.data.machines;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.blockentity.BlockEntityCreationInfo;
import com.gregtechceu.gtceu.api.data.RotationState;
import com.gregtechceu.gtceu.api.machine.MachineDefinition;
import com.gregtechceu.gtceu.api.machine.MetaMachine;
import com.gregtechceu.gtceu.api.machine.SimpleTieredMachine;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import com.gregtechceu.gtceu.api.registry.registrate.MachineBuilder;
import com.gregtechceu.gtceu.common.data.GTMedicalConditions;
import com.gregtechceu.gtceu.common.data.GTRecipeModifiers;
import com.gregtechceu.gtceu.common.data.machines.GTMachineUtils;
import com.gregtechceu.gtceu.config.ConfigHolder;
import com.zircky.industrialsorcerygreg.ISGCore;
import com.zircky.industrialsorcerygreg.api.ISGValues;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;

import java.util.Locale;
import java.util.function.BiFunction;

import static com.gregtechceu.gtceu.api.GTValues.VLVH;
import static com.gregtechceu.gtceu.api.GTValues.VLVT;
import static com.gregtechceu.gtceu.utils.FormattingUtil.toEnglishName;
import static com.zircky.industrialsorcerygreg.api.registries.ISGRegistries.REGISTRATE;

public class ISGMachineUtils extends GTMachineUtils {
  public static final int[] NUCLER_TIARS = ISGValues.tiersBetween(ISGValues.EV, ISGValues.LuV);

  public static MachineDefinition[] registerSimpleMachines(String name, GTRecipeType recipeType,
                                                           Int2IntFunction tankScalingFunction,
                                                           boolean hasPollutionDebuff) {
    return registerSimpleMachines(REGISTRATE, name, recipeType, tankScalingFunction, hasPollutionDebuff);
  }

  public static MachineDefinition[] registerSimpleMachines(GTRegistrate registrate, String name,
                                                           GTRecipeType recipeType,
                                                           Int2IntFunction tankScalingFunction,
                                                           boolean hasPollutionDebuff) {
    return registerSimpleMachines(registrate, name, recipeType, tankScalingFunction, hasPollutionDebuff,
        ELECTRIC_TIERS);
  }

  public static MachineDefinition[] registerSimpleMachines(String name, GTRecipeType recipeType,
                                                           Int2IntFunction tankScalingFunction) {
    return registerSimpleMachines(REGISTRATE, name, recipeType, tankScalingFunction);
  }

  public static MachineDefinition[] registerSimpleMachines(GTRegistrate registrate, String name,
                                                           GTRecipeType recipeType,
                                                           Int2IntFunction tankScalingFunction) {
    return registerSimpleMachines(registrate, name, recipeType, tankScalingFunction, false);
  }

  public static MachineDefinition[] registerSimpleMachines(String name, GTRecipeType recipeType) {
    return registerSimpleMachines(REGISTRATE, name, recipeType);
  }

  public static MachineDefinition[] registerSimpleMachines(GTRegistrate registrate, String name,
                                                           GTRecipeType recipeType) {
    return registerSimpleMachines(registrate, name, recipeType, defaultTankSizeFunction);
  }

  public static MachineDefinition[] registerSimpleMachines(GTRegistrate registrate,
                                                           String name,
                                                           GTRecipeType recipeType,
                                                           Int2IntFunction tankScalingFunction,
                                                           boolean hasPollutionDebuff,
                                                           int... tiers) {
    return registerTieredMachines(registrate, name,
        (info, tier) -> new SimpleTieredMachine(info, tier, tankScalingFunction), (tier, builder) -> {
          if (hasPollutionDebuff) {
            builder.recipeModifiers(GTRecipeModifiers.ENVIRONMENT_REQUIREMENT
                        .apply(GTMedicalConditions.CARBON_MONOXIDE_POISONING, 100 * tier),
                    GTRecipeModifiers.OC_NON_PERFECT)
                .conditionalTooltip(defaultEnvironmentRequirement(),
                    ConfigHolder.INSTANCE.gameplay.environmentalHazards);
          } else {
            builder.recipeModifier(GTRecipeModifiers.OC_NON_PERFECT);
          }
          return builder
              .langValue("%s %s %s".formatted(VLVH[tier], toEnglishName(name), VLVT[tier]))
              .editableUI(SimpleTieredMachine.EDITABLE_UI_CREATOR.apply(GTCEu.id(name), recipeType))
              .rotationState(RotationState.NON_Y_AXIS)
              .recipeType(recipeType)
              .workableTieredHullModel(ISGCore.id("block/machines/" + name))
              .tooltips(workableTiered(tier, GTValues.V[tier], GTValues.V[tier] * 64, recipeType,
                  tankScalingFunction.applyAsInt(tier), true))
              .register();
        },
        tiers);
  }

  public static MachineDefinition[] registerTieredMachines(String name,
                                                           BiFunction<BlockEntityCreationInfo, Integer, MetaMachine> factory,
                                                           BiFunction<Integer, MachineBuilder<MachineDefinition, ?>, MachineDefinition> builder,
                                                           int... tiers) {
    return registerTieredMachines(REGISTRATE, name, factory, builder, tiers);
  }

  public static MachineDefinition[] registerTieredMachines(GTRegistrate registrate,
                                                           String name,
                                                           BiFunction<BlockEntityCreationInfo, Integer, MetaMachine> factory,
                                                           BiFunction<Integer, MachineBuilder<MachineDefinition, ?>, MachineDefinition> builder,
                                                           int... tiers) {
    MachineDefinition[] definitions = new MachineDefinition[GTValues.TIER_COUNT];
    for (int tier : tiers) {
      var register = registrate
          .machine(GTValues.VN[tier].toLowerCase(Locale.ROOT) + "_" + name,
              info -> factory.apply(info, tier))
          .tier(tier);
      definitions[tier] = builder.apply(tier, register);
    }
    return definitions;
  }

}
