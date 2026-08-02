package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.MaterialEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.machine.MachineDefinition;
import com.gregtechceu.gtceu.common.data.GTBlocks;
import com.gregtechceu.gtceu.common.data.GTItems;
import com.gregtechceu.gtceu.common.data.GTMachines;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.data.recipe.CraftingComponent;
import com.gregtechceu.gtceu.data.recipe.CustomTags;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import com.tterrag.registrate.util.entry.ItemProviderEntry;
import com.zircky.industrialsorcerygreg.ISGCore;
import com.zircky.industrialsorcerygreg.api.ISGValues;
import com.zircky.industrialsorcerygreg.common.data.ISGCasings;
import com.zircky.industrialsorcerygreg.common.data.ISGMaterials;
import com.zircky.industrialsorcerygreg.common.data.machines.ISGSimpleMachines;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

import java.util.Arrays;
import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.Aluminium;
import static com.gregtechceu.gtceu.common.data.GTMaterials.AnnealedCopper;
import static com.gregtechceu.gtceu.common.data.GTMaterials.Copper;
import static com.gregtechceu.gtceu.common.data.GTMaterials.Europium;
import static com.gregtechceu.gtceu.common.data.GTMaterials.Gold;
import static com.gregtechceu.gtceu.common.data.GTMaterials.Neutronium;
import static com.gregtechceu.gtceu.common.data.GTMaterials.NiobiumTitanium;
import static com.gregtechceu.gtceu.common.data.GTMaterials.Platinum;
import static com.gregtechceu.gtceu.common.data.GTMaterials.Polybenzimidazole;
import static com.gregtechceu.gtceu.common.data.GTMaterials.Polyethylene;
import static com.gregtechceu.gtceu.common.data.GTMaterials.Polytetrafluoroethylene;
import static com.gregtechceu.gtceu.common.data.GTMaterials.PolyvinylChloride;
import static com.gregtechceu.gtceu.common.data.GTMaterials.VanadiumGallium;
import static com.gregtechceu.gtceu.common.data.GTMaterials.YttriumBariumCuprate;
import static com.gregtechceu.gtceu.data.recipe.GTCraftingComponents.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.*;

public class MachineRecipe {
  private MachineRecipe() {
    /* This utility class should not be instantiated */
  }

  public static void init(Consumer<FinishedRecipe> provider) {

    VanillaRecipeHelper.addShapedRecipe(provider, true, "casing_ulv", GTBlocks.MACHINE_CASING_ULV.asStack(), 
        "DPD", "PwP", "DPD", 'P',
        new MaterialEntry(TagPrefix.plate, GTMaterials.WroughtIron), 'D', new MaterialEntry(plateDouble, GTMaterials.WroughtIron));
    VanillaRecipeHelper.addShapedRecipe(provider, true, "casing_lv", GTBlocks.MACHINE_CASING_LV.asStack(), 
        "DPD", "PwP", "DPD",
        'P', new MaterialEntry(TagPrefix.plate, GTMaterials.Steel), 'D', new MaterialEntry(plateDouble, GTMaterials.Steel));
    VanillaRecipeHelper.addShapedRecipe(provider, true, "casing_mv", GTBlocks.MACHINE_CASING_MV.asStack(), 
        "DPD", "PwP", "DPD", 'P', new MaterialEntry(TagPrefix.plate, GTMaterials.Aluminium), 'D', new MaterialEntry(plateDouble, GTMaterials.Aluminium));
    VanillaRecipeHelper.addShapedRecipe(provider, true, "casing_hv", GTBlocks.MACHINE_CASING_HV.asStack(), 
        "DPD", "PwP", "DPD", 'P', new MaterialEntry(TagPrefix.plate, GTMaterials.StainlessSteel), 'D', new MaterialEntry(plateDouble, GTMaterials.StainlessSteel));
    VanillaRecipeHelper.addShapedRecipe(provider, true, "casing_ev", GTBlocks.MACHINE_CASING_EV.asStack(), 
        "DPD", "PwP", "DPD", 'P', new MaterialEntry(TagPrefix.plate, GTMaterials.Titanium), 'D', new MaterialEntry(plateDouble, GTMaterials.Titanium));
    VanillaRecipeHelper.addShapedRecipe(provider, true, "casing_iv", GTBlocks.MACHINE_CASING_IV.asStack(), 
        "DPD", "PwP", "DPD", 'P', new MaterialEntry(TagPrefix.plate, GTMaterials.TungstenSteel), 'D', new MaterialEntry(plateDouble, GTMaterials.TungstenSteel));
    VanillaRecipeHelper.addShapedRecipe(provider, true, "casing_luv", GTBlocks.MACHINE_CASING_LuV.asStack(), 
        "DPD", "PwP", "DPD", 'P', new MaterialEntry(TagPrefix.plate, GTMaterials.RhodiumPlatedPalladium), 'D', new MaterialEntry(plateDouble, GTMaterials.RhodiumPlatedPalladium));
    VanillaRecipeHelper.addShapedRecipe(provider, true, "casing_zpm", GTBlocks.MACHINE_CASING_ZPM.asStack(), 
        "DPD", "PwP", "DPD", 'P', new MaterialEntry(TagPrefix.plate, GTMaterials.NaquadahAlloy), 'D', new MaterialEntry(plateDouble, GTMaterials.NaquadahAlloy));
    VanillaRecipeHelper.addShapedRecipe(provider, true, "casing_uv", GTBlocks.MACHINE_CASING_UV.asStack(), 
        "DPD", "PwP", "DPD", 'P', new MaterialEntry(TagPrefix.plate, GTMaterials.Darmstadtium), 'D', new MaterialEntry(plateDouble, GTMaterials.Darmstadtium));
    VanillaRecipeHelper.addShapedRecipe(provider, true, "casing_uhv", GTBlocks.MACHINE_CASING_UHV.asStack(), 
        "DPD", "PwP", "DPD", 'P', new MaterialEntry(TagPrefix.plate, GTMaterials.Neutronium), 'D', new MaterialEntry(plateDouble, GTMaterials.Neutronium));
    VanillaRecipeHelper.addShapedRecipe(provider, true, "casing_uev", GTBlocks.MACHINE_CASING_UEV.asStack(),
        "DPD", "PwP", "DPD", 'P', new MaterialEntry(TagPrefix.plate, ISGMaterials.Quantanium), 'D', new MaterialEntry(plateDouble, ISGMaterials.Quantanium));
    VanillaRecipeHelper.addShapedRecipe(provider, true, "casing_uiv", GTBlocks.MACHINE_CASING_UIV.asStack(),
        "DPD", "PwP", "DPD", 'P', new MaterialEntry(TagPrefix.plate, ISGMaterials.Adamantium), 'D', new MaterialEntry(plateDouble, ISGMaterials.Adamantium));
    VanillaRecipeHelper.addShapedRecipe(provider, true, "casing_uxv", GTBlocks.MACHINE_CASING_UXV.asStack(),
        "DPD", "PwP", "DPD", 'P', new MaterialEntry(TagPrefix.plate, ISGMaterials.Vibranium), 'D', new MaterialEntry(plateDouble, ISGMaterials.Vibranium));
    VanillaRecipeHelper.addShapedRecipe(provider, true, "casing_opx", GTBlocks.MACHINE_CASING_OpV.asStack(),
        "DPD", "PwP", "DPD", 'P', new MaterialEntry(TagPrefix.plate, ISGMaterials.Draconium), 'D', new MaterialEntry(plateDouble, ISGMaterials.Draconium));
    VanillaRecipeHelper.addShapedRecipe(provider, true, "casing_max", GTBlocks.MACHINE_CASING_MAX.asStack(),
        "DPD", "PwP", "DPD", 'P', new MaterialEntry(TagPrefix.plate, ISGMaterials.ChaosInfinityAlloy), 'D', new MaterialEntry(plateDouble, ISGMaterials.ChaosInfinityAlloy));

    LASER_WELDER_RECIPES.recipeBuilder("casing_ulv").EUt(VA[ULV]).inputItems(plate, GTMaterials.WroughtIron, 8)
        .outputItems(GTBlocks.MACHINE_CASING_ULV.asStack())
        .circuitMeta(8).duration(25)
        .addMaterialInfo(true).save(provider);
    LASER_WELDER_RECIPES.recipeBuilder("casing_lv").EUt(VA[ULV]).inputItems(plate, GTMaterials.Steel, 8)
        .outputItems(GTBlocks.MACHINE_CASING_LV.asStack())
        .circuitMeta(8).duration(50)
        .addMaterialInfo(true).save(provider);
    LASER_WELDER_RECIPES.recipeBuilder("casing_mv").EUt(VA[LV]).inputItems(plate, GTMaterials.Aluminium, 8)
        .outputItems(GTBlocks.MACHINE_CASING_MV.asStack())
        .circuitMeta(8).duration(50)
        .addMaterialInfo(true).save(provider);
    LASER_WELDER_RECIPES.recipeBuilder("casing_hv").EUt(VA[MV]).inputItems(plate, GTMaterials.StainlessSteel, 8)
        .outputItems(GTBlocks.MACHINE_CASING_HV.asStack())
        .circuitMeta(8).duration(50)
        .addMaterialInfo(true).save(provider);
    LASER_WELDER_RECIPES.recipeBuilder("casing_ev").EUt(VA[HV]).inputItems(plate, GTMaterials.Titanium, 8)
        .outputItems(GTBlocks.MACHINE_CASING_EV.asStack())
        .circuitMeta(8).duration(50)
        .addMaterialInfo(true).save(provider);
    LASER_WELDER_RECIPES.recipeBuilder("casing_iv").EUt(VA[EV]).inputItems(plate, GTMaterials.TungstenSteel, 8)
        .outputItems(GTBlocks.MACHINE_CASING_IV.asStack())
        .circuitMeta(8).duration(50)
        .addMaterialInfo(true).save(provider);
    LASER_WELDER_RECIPES.recipeBuilder("casing_luv").EUt(VA[LuV]).inputItems(plate, GTMaterials.RhodiumPlatedPalladium, 8)
        .outputItems(GTBlocks.MACHINE_CASING_LuV.asStack())
        .circuitMeta(8)/*.scannerResearch(b -> b
            .researchStack(GTBlocks.MACHINE_CASING_IV.asStack())
            .dataStack(GTItems.TOOL_DATA_STICK.asStack())
            .duration(ISGValues.SECONDS * 240)
            .EUt(VA[IV]))*/.duration(50)
        .addMaterialInfo(true).save(provider);
    LASER_WELDER_RECIPES.recipeBuilder("casing_zpm").EUt(VA[ZPM]).inputItems(plate, GTMaterials.NaquadahAlloy, 8)
        .outputItems(GTBlocks.MACHINE_CASING_ZPM.asStack())
        .circuitMeta(8).duration(50)
        .addMaterialInfo(true).save(provider);
    LASER_WELDER_RECIPES.recipeBuilder("casing_uv").EUt(VA[UV]).inputItems(plate, GTMaterials.Darmstadtium, 8)
        .outputItems(GTBlocks.MACHINE_CASING_UV.asStack())
        .circuitMeta(8).duration(50)
        .addMaterialInfo(true).save(provider);
    LASER_WELDER_RECIPES.recipeBuilder("casing_uhv").EUt(VA[UHV]).inputItems(plate, GTMaterials.Neutronium, 8)
        .outputItems(GTBlocks.MACHINE_CASING_UHV.asStack())
        .circuitMeta(8).duration(50)
        .addMaterialInfo(true).save(provider);
    LASER_WELDER_RECIPES.recipeBuilder("casing_uev").EUt(VA[UEV]).inputItems(plate, ISGMaterials.Quantanium, 8)
        .outputItems(GTBlocks.MACHINE_CASING_UEV.asItem())
        .circuitMeta(8).duration(50)
        .addMaterialInfo(true).save(provider);
    LASER_WELDER_RECIPES.recipeBuilder("casing_uiv").EUt(VA[UIV])
        .inputItems(plate, ISGMaterials.Adamantium, 8)
        .outputItems(GTBlocks.MACHINE_CASING_UIV.asItem())
        .circuitMeta(8).duration(50)
        .addMaterialInfo(true).save(provider);
    LASER_WELDER_RECIPES.recipeBuilder("casing_uxv").EUt(VA[UXV])
        .inputItems(plate, ISGMaterials.Vibranium, 8)
        .outputItems(GTBlocks.MACHINE_CASING_UXV.asItem())
        .circuitMeta(8).duration(50)
        .addMaterialInfo(true).save(provider);
    LASER_WELDER_RECIPES.recipeBuilder("casing_opv").EUt(VA[OpV])
        .inputItems(plate, ISGMaterials.Draconium, 8)
        .outputItems(GTBlocks.MACHINE_CASING_OpV.asItem())
        .circuitMeta(8).duration(50)
        .addMaterialInfo(true).save(provider);
    LASER_WELDER_RECIPES.recipeBuilder("casing_max").EUt(VA[MAX])
        .inputItems(plate, ISGMaterials.ChaosInfinityAlloy, 8)
        .outputItems(GTBlocks.MACHINE_CASING_MAX.asItem())
        .circuitMeta(8).duration(50)
        .addMaterialInfo(true).save(provider);

    registerMachineRecipe(provider, false, GTMachines.HULL, "PLP", "CHC", "PLP", 'P', HULL_PLATE, 'L', PLATE, 'C', CABLE,
        'H', CASING);

    registerMachineRecipe(provider, ISGSimpleMachines.DEHYDRATOR, "WCW", "AMA", "PRP", 'M', HULL, 'P', PLATE, 'C',
        CIRCUIT, 'W', WIRE_QUAD, 'R', ROBOT_ARM, 'A', CABLE_QUAD);
    registerMachineRecipe(provider, ISGSimpleMachines.UNPACKER, "WCW", "VMR", "BCB", 'M', HULL, 'R', ROBOT_ARM, 'V',
        CONVEYOR, 'C', CIRCUIT, 'W', CABLE, 'B', Tags.Items.CHESTS_WOODEN);
    registerMachineRecipe(provider, ISGSimpleMachines.CLUSTER, "MMM", "CHC", "MMM", 'H', HULL, 'M', MOTOR, 'C', CIRCUIT);
    registerMachineRecipe(provider, ISGSimpleMachines.ROLLING, "EWE", "CMC", "PWP", 'M', HULL, 'E', MOTOR, 'P', PISTON, 'C',
        CIRCUIT, 'W', CABLE);
    registerMachineRecipe(provider, ISGSimpleMachines.LAMINATOR, "WPW", "CMC", "GGG", 'M', HULL, 'P', PUMP, 'C', CIRCUIT, 'W',
        CABLE, 'G', CONVEYOR);
    registerMachineRecipe(provider, ISGSimpleMachines.LOOM, "CWC", "EME", "EWE", 'M', HULL, 'E', MOTOR, 'C', CIRCUIT,
        'W', CABLE);
    registerMachineRecipe(provider, ISGSimpleMachines.LASER_WELDER, "WEW", "CMC", "PPP", 'M', HULL, 'P', PLATE, 'C', CIRCUIT, 'E', EMITTER, 'W', CABLE);
    registerMachineRecipe(provider, ISGSimpleMachines.DECAY_CHAMBER, "RCR", "FMF", "QCQ", 'M', HULL, 'Q', CABLE_DOUBLE, 'C', CIRCUIT, 'F', FIELD_GENERATOR, 'R', ROD_RADIOACTIVE);

    ASSEMBLER_RECIPES.recipeBuilder(GTCEu.id("hull_ulv")).duration(25).EUt(VA[ULV])
        .inputItems(GTBlocks.MACHINE_CASING_ULV.asStack()).inputItems(cableGtSingle, RedAlloy, 2)
        .inputFluids(Polyethylene, L * 2).outputItems(GTMachines.HULL[ULV])
        .addMaterialInfo(true).save(provider);
    ASSEMBLER_RECIPES.recipeBuilder(GTCEu.id("hull_lv")).duration(50).EUt(VA[ULV]).inputItems(GTBlocks.MACHINE_CASING_LV.asStack())
        .inputItems(cableGtSingle, Tin, 2).inputFluids(Polyethylene, L * 2)
        .outputItems(GTMachines.HULL[LV])
        .addMaterialInfo(true).save(provider);
    Material[] copper = {Copper, AnnealedCopper};
    for (Material material : copper) {
      ASSEMBLER_RECIPES.recipeBuilder(GTCEu.id("hull_mv_" + material.getName().toLowerCase())).duration(50).EUt(VA[LV]).inputItems(GTBlocks.MACHINE_CASING_MV.asStack())
          .inputItems(cableGtSingle, material, 2).inputFluids(Polyethylene, L * 2)
          .outputItems(GTMachines.HULL[MV])
          .addMaterialInfo(true).save(provider);
    }
    ASSEMBLER_RECIPES.recipeBuilder(GTCEu.id("hull_hv")).duration(50).EUt(VA[MV]).inputItems(GTBlocks.MACHINE_CASING_HV.asStack())
        .inputItems(cableGtSingle, Gold, 2).inputFluids(PolyvinylChloride, L * 2)
        .outputItems(GTMachines.HULL[HV])
        .addMaterialInfo(true).save(provider);
    ASSEMBLER_RECIPES.recipeBuilder(GTCEu.id("hull_ev")).duration(50).EUt(VA[HV]).inputItems(GTBlocks.MACHINE_CASING_EV.asStack())
        .inputItems(cableGtSingle, Aluminium, 2).inputFluids(PolyvinylChloride, L * 2)
        .outputItems(GTMachines.HULL[EV])
        .addMaterialInfo(true).save(provider);
    ASSEMBLER_RECIPES.recipeBuilder(GTCEu.id("hull_iv")).duration(50).EUt(VA[EV]).inputItems(GTBlocks.MACHINE_CASING_IV.asStack())
        .inputItems(cableGtSingle, Platinum, 2).inputFluids(Polytetrafluoroethylene, L * 2)
        .outputItems(GTMachines.HULL[IV])
        .addMaterialInfo(true).save(provider);
    ASSEMBLER_RECIPES.recipeBuilder(GTCEu.id("hull_luv")).duration(50).EUt(VA[IV])
        .inputItems(GTBlocks.MACHINE_CASING_LuV.asStack()).inputItems(cableGtSingle, NiobiumTitanium, 2)
        .inputFluids(Polytetrafluoroethylene, L * 2).outputItems(GTMachines.HULL[LuV])
        .addMaterialInfo(true).save(provider);
    ASSEMBLER_RECIPES.recipeBuilder(GTCEu.id("hull_zpm")).duration(50).EUt(VA[LuV])
        .inputItems(GTBlocks.MACHINE_CASING_ZPM.asStack()).inputItems(cableGtSingle, VanadiumGallium, 2)
        .inputFluids(Polybenzimidazole, L * 2).outputItems(GTMachines.HULL[ZPM])
        .addMaterialInfo(true).save(provider);
    ASSEMBLER_RECIPES.recipeBuilder(GTCEu.id("hull_uv")).duration(50).EUt(VA[ZPM]).inputItems(GTBlocks.MACHINE_CASING_UV.asStack())
        .inputItems(cableGtSingle, YttriumBariumCuprate, 2).inputFluids(Polybenzimidazole, L * 2)
        .outputItems(GTMachines.HULL[UV])
        .addMaterialInfo(true).save(provider);
    ASSEMBLER_RECIPES.recipeBuilder(GTCEu.id("hull_uhv")).duration(50).EUt(VA[UV])
        .inputItems(GTBlocks.MACHINE_CASING_UHV.asStack()).inputItems(cableGtSingle, Europium, 2)
        .inputFluids(Polyetheretherketone, L * 2).outputItems(GTMachines.HULL[UHV])
        .addMaterialInfo(true).save(provider);
    ASSEMBLER_RECIPES.recipeBuilder(GTCEu.id("hull_uev")).duration(50).EUt(VA[UHV])
        .inputItems(GTBlocks.MACHINE_CASING_UEV.asItem())
        .inputItems(cableGtSingle, Mithril, 2)
        .inputFluids(Polyetheretherketone.getFluid(L * 2))
        .outputItems(GTMachines.HULL[UEV]).save(provider);
    ASSEMBLER_RECIPES.recipeBuilder(GTCEu.id("hull_uiv")).duration(50).EUt(VA[UEV])
        .inputItems(GTBlocks.MACHINE_CASING_UIV.asItem())
        .inputItems(cableGtSingle, Neutronium, 2)
        .inputFluids(Zylon.getFluid(L * 2))
        .outputItems(GTMachines.HULL[UIV]).save(provider);
    ASSEMBLER_RECIPES.recipeBuilder(GTCEu.id("hull_uxv")).duration(50).EUt(VA[UIV])
        .inputItems(GTBlocks.MACHINE_CASING_UXV.asItem())
        .inputItems(cableGtSingle, Taranium, 2)
        .inputFluids(Zylon.getFluid(L * 2))
        .outputItems(GTMachines.HULL[UXV]).save(provider);
    ASSEMBLER_RECIPES.recipeBuilder(GTCEu.id("hull_opv")).duration(50).EUt(VA[UXV])
        .inputItems(GTBlocks.MACHINE_CASING_OpV.asItem())
        .inputItems(cableGtSingle, CrystalMatrix, 2)
        .inputFluids(FullerenePolymerMatrix.getFluid(L * 2))
        .outputItems(GTMachines.HULL[OpV]).save(provider);
    ASSEMBLER_RECIPES.recipeBuilder(GTCEu.id("hull_max")).duration(50).EUt(VA[OpV])
        .inputItems(GTBlocks.MACHINE_CASING_MAX.asItem())
        .inputItems(cableGtSingle, CosmicNeutronium, 2)
        .inputFluids(Radox.getFluid(L * 2))
        .outputItems(GTMachines.HULL[MAX]).save(provider);

    VanillaRecipeHelper.addShapedRecipe(provider, true, ISGCore.id("hermetic_casing_uev"),
        ISGCasings.HERMETIC_CASING_UEV.asStack(), "PPP", "PFP", "PPP", 'P',
        new MaterialEntry(plate, ISGMaterials.Quantanium), 'F',
        new MaterialEntry(pipeLargeFluid, GTMaterials.Neutronium));

    VanillaRecipeHelper.addShapedRecipe(provider, true, ISGCore.id("hermetic_casing_uiv"),
        ISGCasings.HERMETIC_CASING_UIV.asStack(), "PPP", "PFP", "PPP", 'P',
        new MaterialEntry(plate, ISGMaterials.Adamantium), 'F',
        new MaterialEntry(pipeLargeFluid, GTMaterials.Neutronium));

    VanillaRecipeHelper.addShapedRecipe(provider, true, ISGCore.id("hermetic_casing_uxv"),
        ISGCasings.HERMETIC_CASING_UXV.asStack(), "PPP", "PFP", "PPP", 'P',
        new MaterialEntry(plate, ISGMaterials.Vibranium), 'F',
        new MaterialEntry(pipeLargeFluid, ISGMaterials.Enderium));

    VanillaRecipeHelper.addShapedRecipe(provider, true, ISGCore.id("hermetic_casing_opv"),
        ISGCasings.HERMETIC_CASING_OpV.asStack(), "PPP", "PFP", "PPP", 'P',
        new MaterialEntry(plate, ISGMaterials.Draconium), 'F',
        new MaterialEntry(pipeLargeFluid,
            ISGMaterials.HeavyQuarkDegenerateMatter));

    VanillaRecipeHelper.addShapedRecipe(provider, true, "quantum_chest_uhv",
        GTMachines.QUANTUM_CHEST[UHV].asStack(), "CPC", "PHP", "CFC", 'C', CustomTags.UHV_CIRCUITS, 'P',
        new MaterialEntry(TagPrefix.plateDense, GTMaterials.Neutronium), 'F',
        GTItems.FIELD_GENERATOR_ZPM.asStack(), 'H', GTMachines.HULL[9].asStack());


    VanillaRecipeHelper.addShapedRecipe(provider, true, ISGCore.id("quantum_tank_uev"),
        GTMachines.QUANTUM_TANK[UEV].asStack(),
        "CGC", "PHP", "CUC", 'C', CustomTags.UEV_CIRCUITS, 'P',
        new MaterialEntry(plateDense, ISGMaterials.Quantanium), 'U',
        GTItems.ELECTRIC_PUMP_UHV.asStack(),
        'G', GTItems.FIELD_GENERATOR_UV.asStack(), 'H',
        ISGCasings.HERMETIC_CASING_UEV.asItem());

    VanillaRecipeHelper.addShapedRecipe(provider, true, ISGCore.id("quantum_tank_uiv"),
        GTMachines.QUANTUM_TANK[UIV].asStack(),
        "CGC", "PHP", "CUC", 'C', CustomTags.UIV_CIRCUITS, 'P',
        new MaterialEntry(plateDense, ISGMaterials.Adamantium), 'U',
        GTItems.ELECTRIC_PUMP_UEV.asStack(),
        'G', GTItems.FIELD_GENERATOR_UHV.asStack(), 'H',
        ISGCasings.HERMETIC_CASING_UIV.asItem());

    VanillaRecipeHelper.addShapedRecipe(provider, true, ISGCore.id("quantum_tank_uxv"),
        GTMachines.QUANTUM_TANK[UXV].asStack(),
        "CGC", "PHP", "CUC", 'C', CustomTags.UXV_CIRCUITS, 'P',
        new MaterialEntry(plateDense, ISGMaterials.Vibranium), 'U',
        GTItems.ELECTRIC_PUMP_UIV.asStack(),
        'G', GTItems.FIELD_GENERATOR_UEV.asStack(), 'H',
        ISGCasings.HERMETIC_CASING_UXV.asItem());

    VanillaRecipeHelper.addShapedRecipe(provider, true, ISGCore.id("quantum_tank_opv"),
        GTMachines.QUANTUM_TANK[OpV].asStack(),
        "CGC", "PHP", "CUC", 'C', CustomTags.OpV_CIRCUITS, 'P',
        new MaterialEntry(plateDense, ISGMaterials.Draconium), 'U',
        GTItems.ELECTRIC_PUMP_UXV.asStack(),
        'G', GTItems.FIELD_GENERATOR_UIV.asStack(), 'H',
        ISGCasings.HERMETIC_CASING_OpV.asItem());

    VanillaRecipeHelper.addShapedRecipe(provider, true, ISGCore.id("quantum_chest_uev"),
        GTMachines.QUANTUM_CHEST[UEV].asStack(), "CPC", "PHP", "CFC", 'C',
        CustomTags.UEV_CIRCUITS, 'P',
        new MaterialEntry(plateDense, ISGMaterials.Quantanium), 'F',
        GTItems.FIELD_GENERATOR_UV.asStack(), 'H', GTMachines.HULL[10].getItem());

    VanillaRecipeHelper.addShapedRecipe(provider, true, ISGCore.id("quantum_chest_uiv"),
        GTMachines.QUANTUM_CHEST[UIV].asStack(), "CPC", "PHP", "CFC", 'C',
        CustomTags.UIV_CIRCUITS, 'P',
        new MaterialEntry(plateDense, ISGMaterials.Adamantium), 'F',
        GTItems.FIELD_GENERATOR_UHV.asStack(), 'H', GTMachines.HULL[11].getItem());

    VanillaRecipeHelper.addShapedRecipe(provider, true, ISGCore.id("quantum_chest_uxv"),
        GTMachines.QUANTUM_CHEST[UXV].asStack(), "CPC", "PHP", "CFC", 'C',
        CustomTags.UXV_CIRCUITS, 'P',
        new MaterialEntry(plateDense, ISGMaterials.Vibranium), 'F',
        GTItems.FIELD_GENERATOR_UEV.asStack(), 'H', GTMachines.HULL[12].getItem());

    VanillaRecipeHelper.addShapedRecipe(provider, true, ISGCore.id("quantum_chest_opv"),
        GTMachines.QUANTUM_CHEST[OpV].asStack(), "CPC", "PHP", "CFC", 'C',
        CustomTags.OpV_CIRCUITS, 'P',
        new MaterialEntry(plateDense, ISGMaterials.Draconium), 'F',
        GTItems.FIELD_GENERATOR_UIV.asStack(), 'H', GTMachines.HULL[13].getItem());
  }

  // Can only accept a subset of "Item" types:
  // - ItemStack
  // - Item
  // - Block
  // - ItemEntry<?> (like GTItems)
  // - CraftingComponent.Component
  // - MaterialEntry
  // - TagKey<?>
  public static void registerMachineRecipe(Consumer<FinishedRecipe> provider, boolean setMaterialInfoData,
                                           MachineDefinition[] machines, Object... recipe) {
    for (MachineDefinition machine : machines) {

      // Needed to skip certain tiers if not enabled.
      // Leaves UHV+ machine recipes to be implemented by addons.
      if (machine != null) {
        Object[] prepRecipe = prepareRecipe(machine.getTier(), Arrays.copyOf(recipe, recipe.length));
        if (prepRecipe == null) {
          return;
        }
        VanillaRecipeHelper.addShapedRecipe(provider, setMaterialInfoData, machine.getName(), machine.asStack(),
            prepRecipe);
      }
    }
  }

  public static void registerMachineRecipe(Consumer<FinishedRecipe> provider, MachineDefinition[] machines,
                                           Object... recipe) {
    registerMachineRecipe(provider, true, machines, recipe);
  }

  private static Object[] prepareRecipe(int tier, Object... recipe) {
    for (int i = 3; i < recipe.length; i++) {
      if (recipe[i] instanceof CraftingComponent) {
        Object component = ((CraftingComponent) recipe[i]).get(tier);
        recipe[i] = component;
      } else if (recipe[i] instanceof Item item) {
        recipe[i] = new ItemStack(item);
      } else if (recipe[i] instanceof Block block) {
        recipe[i] = new ItemStack(block);
      } else if (recipe[i] instanceof ItemProviderEntry<?> itemEntry) {
        recipe[i] = itemEntry.asStack();
      }
    }
    return recipe;
  }

}
