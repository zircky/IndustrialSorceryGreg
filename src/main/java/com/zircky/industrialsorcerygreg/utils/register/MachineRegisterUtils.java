package com.zircky.industrialsorcerygreg.utils.register;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.blockentity.BlockEntityCreationInfo;
import com.gregtechceu.gtceu.api.data.RotationState;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.machine.*;
import com.gregtechceu.gtceu.api.machine.multiblock.MultiblockControllerMachine;
import com.gregtechceu.gtceu.api.machine.multiblock.PartAbility;
import com.gregtechceu.gtceu.api.machine.property.GTMachineModelProperties;
import com.gregtechceu.gtceu.api.machine.trait.recipe.RecipeLogic;
import com.gregtechceu.gtceu.api.multiblock.PatternPredicate;
import com.gregtechceu.gtceu.api.multiblock.Predicates;
import com.gregtechceu.gtceu.api.multiblock.pattern.MultiblockPatternBuilder;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import com.gregtechceu.gtceu.api.registry.registrate.MachineBuilder;
import com.gregtechceu.gtceu.api.registry.registrate.MultiblockMachineBuilder;
import com.gregtechceu.gtceu.client.renderer.machine.DynamicRenderHelper;
import com.gregtechceu.gtceu.common.block.BoilerFireboxType;
import com.gregtechceu.gtceu.common.data.*;
import com.gregtechceu.gtceu.common.machine.multiblock.steam.LargeBoilerMachine;
import com.gregtechceu.gtceu.common.mui.GTSingleblockMachinePanels;
import com.gregtechceu.gtceu.config.ConfigHolder;
import com.gregtechceu.gtceu.utils.FormattingUtil;
import com.zircky.industrialsorcerygreg.ISGCore;
import com.zircky.industrialsorcerygreg.api.ISGValues;
import com.zircky.industrialsorcerygreg.api.registries.ISGMultiblockMachineBuilder;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;

import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import static com.gregtechceu.gtceu.api.GTValues.VLVH;
import static com.gregtechceu.gtceu.api.GTValues.VLVT;
import static com.gregtechceu.gtceu.api.multiblock.Predicates.blocks;
import static com.gregtechceu.gtceu.api.multiblock.Predicates.controller;
import static com.gregtechceu.gtceu.api.multiblock.util.RelativeDirection.*;
import static com.gregtechceu.gtceu.common.data.GTBlocks.ALL_FIREBOXES;
import static com.gregtechceu.gtceu.common.data.machines.GTMachineUtils.*;
import static com.gregtechceu.gtceu.common.data.machines.GTMultiMachines.LARGE_BOILER_BRONZE;
import static com.gregtechceu.gtceu.common.data.models.GTMachineModels.createWorkableCasingMachineModel;
import static com.gregtechceu.gtceu.utils.FormattingUtil.toEnglishName;
import static com.zircky.industrialsorcerygreg.api.registries.ISGRegistries.REGISTRATE;

public class MachineRegisterUtils {
  public static final int[] NUCLER_TIARS = ISGValues.tiersBetween(ISGValues.EV, ISGValues.LuV);



  public static <MACHINE extends MultiblockControllerMachine> MultiblockMachineBuilder<MultiblockMachineDefinition, MACHINE, ?> multiblock(String name, MachineInstanceFactory<MACHINE> blockEntityFactory) {
    return REGISTRATE.multiblock(name, blockEntityFactory);
  }

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
              .ui(GTSingleblockMachinePanels.GENERAL_MACHINE)
              .rotationState(RotationState.NON_Y_AXIS)
              .recipeType(recipeType)
              .workableTieredHullModel(ISGCore.id("block/machines/" + name))
              .tooltips(workableTiered(tier, GTValues.V[tier], GTValues.V[tier] * 64, recipeType,
                  tankScalingFunction.applyAsInt(tier), true))
              .register();
        },
        tiers);
  }

  public static MultiblockMachineDefinition registerLargeBoiler(String name, Supplier<? extends Block> casing,
                                                                Supplier<? extends Block> pipe,
                                                                Supplier<? extends Block> fireBox,
                                                                ResourceLocation texture, BoilerFireboxType firebox,
                                                                int maxTemperature, int heatSpeed) {
    return registerLargeBoiler(REGISTRATE, name, casing, pipe, fireBox, texture, firebox, maxTemperature,
        heatSpeed);
  }

  public static <MACHINE extends MultiblockControllerMachine> MultiblockMachineDefinition[] registerTieredMultis(String name,
                                                                                                      MachineInstanceFactory.Tiered<MACHINE> factory,
                                                                                                      BiFunction<Integer, MultiblockMachineBuilder<?, MACHINE, ?>, MultiblockMachineDefinition> builder,
                                                                                                      int... tiers) {
    MultiblockMachineDefinition[] definitions = new MultiblockMachineDefinition[GTValues.TIER_COUNT];
    for (int tier : tiers) {
      var register = multiblock(GTValues.VN[tier].toLowerCase(Locale.ROOT) + "_" + name,
              holder -> factory.buildMachine(holder, tier))
          .tier(tier);
      definitions[tier] = builder.apply(tier, register);
    }
    return definitions;
  }

  public static MultiblockMachineDefinition registerLargeBoiler(GTRegistrate registrate, String name,
                                                                Supplier<? extends Block> casing,
                                                                Supplier<? extends Block> pipe,
                                                                Supplier<? extends Block> fireBox,
                                                                ResourceLocation texture, BoilerFireboxType firebox,
                                                                int maxTemperature, int heatSpeed) {
    // spotless:off
    return registrate
        .multiblock("%s_large_boiler".formatted(name),
            holder -> new LargeBoilerMachine(holder, maxTemperature, heatSpeed))
        .langValue("Large %s Boiler".formatted(FormattingUtil.toEnglishName(name)))
        .allowExtendedFacing(false)
        .rotationState(RotationState.NON_Y_AXIS)
        .recipeType(GTRecipeTypes.LARGE_BOILER_RECIPES)
        .recipeModifier(LargeBoilerMachine::recipeModifier, true)
        .appearanceBlock(casing)
        .partAppearance((controller, part, side) ->
            controller.getBlockPos().below().getY() == part.getBlockPos().getY() ?
                fireBox.get().defaultBlockState() : casing.get().defaultBlockState())
        .pattern((definition) -> {
          PatternPredicate fireboxPred = blocks(ALL_FIREBOXES.get(firebox).get()).setMinGlobalLimited(3)
              .or(Predicates.abilities(PartAbility.IMPORT_FLUIDS).setMinGlobalLimited(1)
                  .setPreviewCount(1))
              .or(Predicates.abilities(PartAbility.IMPORT_ITEMS).setMaxGlobalLimited(1)
                  .setPreviewCount(1))
              .or(Predicates.abilities(PartAbility.MUFFLER).setExactLimit(1));

          if (ConfigHolder.INSTANCE.machines.enableMaintenance) {
            fireboxPred = fireboxPred.or(Predicates.abilities(PartAbility.MAINTENANCE).setExactLimit(1));
          }

          return MultiblockPatternBuilder.start(FRONT, UP, RIGHT)
              .slice("FFFFF", "CCCCC", " CCC ", "   C ", "   C ", "   C ")
              .slice("FFFFF", "C   C", "PCC P", "PPC C", "  C C", "  CCC")
              .slice("FFFFF", "CCSCC", " CCC ", "   C ", "   C ", "   C ")
              .where('S', Predicates.controller(blocks(definition.getBlock())))
              .where('P', blocks(pipe.get()))
              .where('F', fireboxPred)
              .where('C', blocks(casing.get()).setMinGlobalLimited(20)
                  .or(Predicates.abilities(PartAbility.EXPORT_FLUIDS).setMinGlobalLimited(1)
                      .setPreviewCount(1)))
              .build();
        })
        .recoveryItems(
            () -> new ItemLike[] {
                GTMaterialItems.MATERIAL_ITEMS.get(TagPrefix.dustTiny, GTMaterials.Ash).get() })
        .modelProperty(GTMachineModelProperties.RECIPE_LOGIC_STATUS, RecipeLogic.Status.IDLE)
        .model(createWorkableCasingMachineModel(texture,
            GTCEu.id("block/multiblock/generator/large_%s_boiler".formatted(name)))
            .andThen(b -> b.addDynamicRenderer(() -> DynamicRenderHelper.makeBoilerPartRender(firebox, casing))))
        .tooltips(
            Component.translatable("gtceu.multiblock.large_boiler.max_temperature", maxTemperature + 274,
                maxTemperature),
            Component.translatable("gtceu.multiblock.large_boiler.heat_time_tooltip",
                maxTemperature / heatSpeed / 20),
            Component.translatable("gtceu.multiblock.large_boiler.explosion_tooltip")
                .withStyle(ChatFormatting.DARK_RED))
        .register();
    // spotless:on
  }

  public static <MACHINE extends MetaMachine> MachineDefinition[] registerTieredMachines(String name,
                                                                                         MachineInstanceFactory.Tiered<MACHINE> factory,
                                                                                         BiFunction<Integer, MachineBuilder<MachineDefinition, MACHINE, ?>, MachineDefinition> builder,
                                                                                         int... tiers) {
    return registerTieredMachines(REGISTRATE, name, factory, builder, tiers);
  }

  public static <MACHINE extends MetaMachine> MachineDefinition[] registerTieredMachines(GTRegistrate registrate,
                                                                                         String name,
                                                                                         MachineInstanceFactory.Tiered<MACHINE> factory,
                                                                                         BiFunction<Integer, MachineBuilder<MachineDefinition, MACHINE, ?>, MachineDefinition> builder,
                                                                                         int... tiers) {
    MachineDefinition[] definitions = new MachineDefinition[GTValues.TIER_COUNT];
    for (int tier : tiers) {
      var register = registrate
          .machine(GTValues.VN[tier].toLowerCase(Locale.ROOT) + "_" + name,
              info -> factory.buildMachine(info, tier))
          .tier(tier);
      definitions[tier] = builder.apply(tier, register);
    }
    return definitions;
  }



}
