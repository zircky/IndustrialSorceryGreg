package com.zircky.industrialsorcerygreg.common.data.machines;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.data.RotationState;
import com.gregtechceu.gtceu.api.machine.MultiblockMachineDefinition;
import com.gregtechceu.gtceu.api.machine.property.GTMachineModelProperties;
import com.gregtechceu.gtceu.api.machine.trait.recipe.RecipeLogic;
import com.gregtechceu.gtceu.api.multiblock.Predicates;
import com.gregtechceu.gtceu.api.multiblock.pattern.MultiblockPatternBuilder;
import com.gregtechceu.gtceu.client.renderer.machine.DynamicRenderHelper;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.common.data.GTRecipeModifiers;
import com.gregtechceu.gtceu.common.machine.GTMachineInstanceFactories;
import net.minecraft.network.chat.Component;

import static com.gregtechceu.gtceu.api.multiblock.Predicates.*;
import static com.gregtechceu.gtceu.api.multiblock.util.RelativeDirection.*;
import static com.gregtechceu.gtceu.common.data.GCYMBlocks.CASING_REACTION_SAFE;
import static com.gregtechceu.gtceu.common.data.GTBlocks.CASING_STAINLESS_STEEL_GEARBOX;
import static com.gregtechceu.gtceu.common.data.GTBlocks.CASING_TITANIUM_PIPE;
import static com.gregtechceu.gtceu.common.data.GTRecipeModifiers.BATCH_MODE;
import static com.gregtechceu.gtceu.common.data.GTRecipeModifiers.OC_NON_PERFECT_SUBTICK;
import static com.gregtechceu.gtceu.common.data.models.GTMachineModels.createWorkableCasingMachineModel;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.LARGE_MIXER_RECIPES;
import static com.zircky.industrialsorcerygreg.utils.register.MachineRegisterUtils.multiblock;

public class GTMachineModify {
  public static void init() {
  }

  public static final MultiblockMachineDefinition LARGE_MIXER = multiblock("large_mixer", GTMachineInstanceFactories.LARGE_MIXER)
        .langValue("Large Mixing Vessel")
        .tooltips(Component.translatable("gtceu.multiblock.parallelizable.tooltip"))
        .tooltips(Component.translatable("gtceu.machine.available_recipe_map_1.tooltip",
            Component.translatable("gtceu.mixer")))
        .rotationState(RotationState.ALL)
        .recipeType(LARGE_MIXER_RECIPES)
        .recipeModifiers(GTRecipeModifiers.PARALLEL_HATCH, OC_NON_PERFECT_SUBTICK, BATCH_MODE)
        .appearanceBlock(CASING_REACTION_SAFE)
        .pattern(definition -> MultiblockPatternBuilder.start(FRONT, UP, RIGHT)
            .slice("#XXX#", "#XXX#", "#XXX#", "#XXX#", "#XXX#", "##F##")
            .slice("XXXXX", "XAPAX", "XAAAX", "XAPAX", "XAAAX", "##F##")
            .slice("XXXXX", "XPPPX", "XAPAX", "XPPPX", "XAGAX", "FFGFF")
            .slice("XXXXX", "XAPAX", "XAAAX", "XAPAX", "XAAAX", "##F##")
            .slice("#XXX#", "#XSX#", "#XXX#", "#XXX#", "#XXX#", "##F##")
            .where('S', controller(blocks(definition.get())))
            .where('X', blocks(CASING_REACTION_SAFE.get()).setMinGlobalLimited(50)
                .and(autoAbilities(definition.getRecipeTypes()))
                .and(Predicates.autoAbilities(true, false, true)))
            .where('F', frames(GTMaterials.HastelloyX))
            .where('G', blocks(CASING_STAINLESS_STEEL_GEARBOX.get()))
            .where('P', blocks(CASING_TITANIUM_PIPE.get()))
            .where('A', Predicates.air())
            .where('#', Predicates.any())
            .build())
        .hasBER(true)
        .modelProperty(GTMachineModelProperties.RECIPE_LOGIC_STATUS, RecipeLogic.Status.IDLE)
        .model(createWorkableCasingMachineModel(GTCEu.id("block/casings/gcym/reaction_safe_mixing_casing"),
            GTCEu.id("block/multiblock/gcym/large_mixer"))
            .andThen(b -> b.addDynamicRenderer(DynamicRenderHelper::makeRecipeFluidAreaRender)))
        .register();
}
