package com.zircky.industrialsorcerygreg.data.recipe;

import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTItems;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.data.recipe.CraftingComponent;
import com.gregtechceu.gtceu.data.recipe.GTCraftingComponents;
import com.zircky.industrialsorcerygreg.common.data.ISGCasings;
import com.zircky.industrialsorcerygreg.common.data.ISGMaterials;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.plate;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.rod;
import static com.gregtechceu.gtceu.data.recipe.GTCraftingComponents.*;

public class ISGCraftingComponents {


  public static CraftingComponent FLUID_REGULATOR;

  public static CraftingComponent PUMP_CASING;
  public static CraftingComponent MOTOR_CASING;
  public static CraftingComponent SENSOR_CASING;
  public static CraftingComponent PISTON_CASING;
  public static CraftingComponent EMITTER_CASING;
  public static CraftingComponent CONVEYOR_CASING;
  public static CraftingComponent ROBOT_ARM_CASING;
  public static CraftingComponent FIELD_GENERATOR_CASING;
  public static CraftingComponent ROD_RADIOACTIVE;

  public static void init() {
    GTCraftingComponents.init();

    FLUID_REGULATOR = CraftingComponent.of("fluid_regulator", GTItems.FLUID_REGULATOR_LV.asStack())
        .add(LV, GTItems.FLUID_REGULATOR_LV.asStack())
        .add(MV, GTItems.FLUID_REGULATOR_MV.asStack())
        .add(HV, GTItems.FLUID_REGULATOR_HV.asStack())
        .add(EV, GTItems.FLUID_REGULATOR_EV.asStack())
        .add(IV, GTItems.FLUID_REGULATOR_IV.asStack())
        .add(LuV, GTItems.FLUID_REGULATOR_LuV.asStack())
        .add(ZPM, GTItems.FLUID_REGULATOR_ZPM.asStack())
        .add(UV, GTItems.FLUID_REGULATOR_UV.asStack())
        .add(UHV, GTItems.FLUID_REGULATOR_UHV.asStack());
    if (GTCEuAPI.isHighTier()) {
      FLUID_REGULATOR.add(UIV, GTItems.FLUID_REGULATOR_UIV.asStack())
          .add(UXV, GTItems.FLUID_REGULATOR_UXV.asStack())
          .add(OpV, GTItems.FLUID_REGULATOR_OpV.asStack());
    }

    PUMP_CASING = CraftingComponent.of("pump_casing", ISGCasings.PUMP_LV.asStack())
        .add(LV, ISGCasings.PUMP_LV.asStack())
        .add(MV, ISGCasings.PUMP_MV.asStack())
        .add(HV, ISGCasings.PUMP_HV.asStack())
        .add(EV, ISGCasings.PUMP_EV.asStack())
        .add(IV, ISGCasings.PUMP_IV.asStack())
        .add(LuV, ISGCasings.PUMP_LuV.asStack())
        .add(ZPM, ISGCasings.PUMP_ZPM.asStack())
        .add(UV, ISGCasings.PUMP_UV.asStack())
        .add(UHV, ISGCasings.PUMP_UHV.asStack());
    if (GTCEuAPI.isHighTier()) {
      PUMP_CASING.add(UEV, ISGCasings.PUMP_UEV.asStack())
          .add(UIV, ISGCasings.PUMP_UIV.asStack())
          .add(UXV, ISGCasings.PUMP_UXV.asStack())
          .add(OpV, ISGCasings.PUMP_OpV.asStack())
          .add(MAX, ISGCasings.PUMP_MAX.asStack());
    }

    MOTOR_CASING = CraftingComponent.of("motor_casing", ISGCasings.MOTOR_LV.asStack())
        .add(LV, ISGCasings.MOTOR_LV.asStack())
        .add(MV, ISGCasings.MOTOR_MV.asStack())
        .add(HV, ISGCasings.MOTOR_HV.asStack())
        .add(EV, ISGCasings.MOTOR_EV.asStack())
        .add(IV, ISGCasings.MOTOR_IV.asStack())
        .add(LuV, ISGCasings.MOTOR_LuV.asStack())
        .add(ZPM, ISGCasings.MOTOR_ZPM.asStack())
        .add(UV, ISGCasings.MOTOR_UV.asStack())
        .add(UHV, ISGCasings.MOTOR_UHV.asStack());
    if (GTCEuAPI.isHighTier()) {
      MOTOR_CASING.add(UEV, ISGCasings.MOTOR_UEV.asStack())
          .add(UIV, ISGCasings.MOTOR_UIV.asStack())
          .add(UXV, ISGCasings.MOTOR_UXV.asStack())
          .add(OpV, ISGCasings.MOTOR_OpV.asStack())
          .add(MAX, ISGCasings.MOTOR_MAX.asStack());
    }

    SENSOR_CASING = CraftingComponent.of("sensor_casing", ISGCasings.SENSOR_LV.asStack())
        .add(LV, ISGCasings.SENSOR_LV.asStack())
        .add(MV, ISGCasings.SENSOR_MV.asStack())
        .add(HV, ISGCasings.SENSOR_HV.asStack())
        .add(EV, ISGCasings.SENSOR_EV.asStack())
        .add(IV, ISGCasings.SENSOR_IV.asStack())
        .add(LuV, ISGCasings.SENSOR_LuV.asStack())
        .add(ZPM, ISGCasings.SENSOR_ZPM.asStack())
        .add(UV, ISGCasings.SENSOR_UV.asStack())
        .add(UHV, ISGCasings.SENSOR_UHV.asStack());
    if (GTCEuAPI.isHighTier()) {
      SENSOR_CASING.add(UEV, ISGCasings.SENSOR_UEV.asStack())
          .add(UIV, ISGCasings.SENSOR_UIV.asStack())
          .add(UXV, ISGCasings.SENSOR_UXV.asStack())
          .add(OpV, ISGCasings.SENSOR_OpV.asStack())
          .add(MAX, ISGCasings.SENSOR_MAX.asStack());
    }

    PISTON_CASING = CraftingComponent.of("piston_casing", ISGCasings.PISTON_LV.asStack())
        .add(LV, ISGCasings.PISTON_LV.asStack())
        .add(MV, ISGCasings.PISTON_MV.asStack())
        .add(HV, ISGCasings.PISTON_HV.asStack())
        .add(EV, ISGCasings.PISTON_EV.asStack())
        .add(IV, ISGCasings.PISTON_IV.asStack())
        .add(LuV, ISGCasings.PISTON_LuV.asStack())
        .add(ZPM, ISGCasings.PISTON_ZPM.asStack())
        .add(UV, ISGCasings.PISTON_UV.asStack())
        .add(UHV, ISGCasings.PISTON_UHV.asStack());
    if (GTCEuAPI.isHighTier()) {
      PISTON_CASING.add(UEV, ISGCasings.PISTON_UEV.asStack())
          .add(UIV, ISGCasings.PISTON_UIV.asStack())
          .add(UXV, ISGCasings.PISTON_UXV.asStack())
          .add(OpV, ISGCasings.PISTON_OpV.asStack())
          .add(MAX, ISGCasings.PISTON_MAX.asStack());
    }

    EMITTER_CASING = CraftingComponent.of("emitter_casing", ISGCasings.EMITTER_LV.asStack())
        .add(LV, ISGCasings.EMITTER_LV.asStack())
        .add(MV, ISGCasings.EMITTER_MV.asStack())
        .add(HV, ISGCasings.EMITTER_HV.asStack())
        .add(EV, ISGCasings.EMITTER_EV.asStack())
        .add(IV, ISGCasings.EMITTER_IV.asStack())
        .add(LuV, ISGCasings.EMITTER_LuV.asStack())
        .add(ZPM, ISGCasings.EMITTER_ZPM.asStack())
        .add(UV, ISGCasings.EMITTER_UV.asStack())
        .add(UHV, ISGCasings.EMITTER_UHV.asStack());
    if (GTCEuAPI.isHighTier()) {
      EMITTER_CASING.add(UEV, ISGCasings.EMITTER_UEV.asStack())
          .add(UIV, ISGCasings.EMITTER_UIV.asStack())
          .add(UXV, ISGCasings.EMITTER_UXV.asStack())
          .add(OpV, ISGCasings.EMITTER_OpV.asStack())
          .add(MAX, ISGCasings.EMITTER_MAX.asStack());
    }

    CONVEYOR_CASING = CraftingComponent.of("conveyor_casing", ISGCasings.CONVEYOR_LV.asStack())
        .add(LV, ISGCasings.CONVEYOR_LV.asStack())
        .add(MV, ISGCasings.CONVEYOR_MV.asStack())
        .add(HV, ISGCasings.CONVEYOR_HV.asStack())
        .add(EV, ISGCasings.CONVEYOR_EV.asStack())
        .add(IV, ISGCasings.CONVEYOR_IV.asStack())
        .add(LuV, ISGCasings.CONVEYOR_LuV.asStack())
        .add(ZPM, ISGCasings.CONVEYOR_ZPM.asStack())
        .add(UV, ISGCasings.CONVEYOR_UV.asStack())
        .add(UHV, ISGCasings.CONVEYOR_UHV.asStack());
    if (GTCEuAPI.isHighTier()) {
      CONVEYOR_CASING.add(UEV, ISGCasings.CONVEYOR_UEV.asStack())
          .add(UIV, ISGCasings.CONVEYOR_UIV.asStack())
          .add(UXV, ISGCasings.CONVEYOR_UXV.asStack())
          .add(OpV, ISGCasings.CONVEYOR_OpV.asStack())
          .add(MAX, ISGCasings.CONVEYOR_MAX.asStack());
    }

    ROBOT_ARM_CASING = CraftingComponent.of("robot_arm_casing", ISGCasings.ROBOT_ARM_LV.asStack())
        .add(LV, ISGCasings.ROBOT_ARM_LV.asStack())
        .add(MV, ISGCasings.ROBOT_ARM_MV.asStack())
        .add(HV, ISGCasings.ROBOT_ARM_HV.asStack())
        .add(EV, ISGCasings.ROBOT_ARM_EV.asStack())
        .add(IV, ISGCasings.ROBOT_ARM_IV.asStack())
        .add(LuV, ISGCasings.ROBOT_ARM_LuV.asStack())
        .add(ZPM, ISGCasings.ROBOT_ARM_ZPM.asStack())
        .add(UV, ISGCasings.ROBOT_ARM_UV.asStack())
        .add(UHV, ISGCasings.ROBOT_ARM_UHV.asStack());
    if (GTCEuAPI.isHighTier()) {
      ROBOT_ARM_CASING.add(UEV, ISGCasings.ROBOT_ARM_UEV.asStack())
          .add(UIV, ISGCasings.ROBOT_ARM_UIV.asStack())
          .add(UXV, ISGCasings.ROBOT_ARM_UXV.asStack())
          .add(OpV, ISGCasings.ROBOT_ARM_OpV.asStack())
          .add(MAX, ISGCasings.ROBOT_ARM_MAX.asStack());
    }

    FIELD_GENERATOR_CASING = CraftingComponent.of("field_generator_casing", ISGCasings.FIELD_GENERATOR_LV.asStack())
        .add(LV, ISGCasings.FIELD_GENERATOR_LV.asStack())
        .add(MV, ISGCasings.FIELD_GENERATOR_MV.asStack())
        .add(HV, ISGCasings.FIELD_GENERATOR_HV.asStack())
        .add(EV, ISGCasings.FIELD_GENERATOR_EV.asStack())
        .add(IV, ISGCasings.FIELD_GENERATOR_IV.asStack())
        .add(LuV, ISGCasings.FIELD_GENERATOR_LuV.asStack())
        .add(ZPM, ISGCasings.FIELD_GENERATOR_ZPM.asStack())
        .add(UV, ISGCasings.FIELD_GENERATOR_UV.asStack())
        .add(UHV, ISGCasings.FIELD_GENERATOR_UHV.asStack());
    if (GTCEuAPI.isHighTier()) {
      FIELD_GENERATOR_CASING.add(UEV, ISGCasings.FIELD_GENERATOR_UEV.asStack())
          .add(UIV, ISGCasings.FIELD_GENERATOR_UIV.asStack())
          .add(UXV, ISGCasings.FIELD_GENERATOR_UXV.asStack())
          .add(OpV, ISGCasings.FIELD_GENERATOR_OpV.asStack())
          .add(MAX, ISGCasings.FIELD_GENERATOR_MAX.asStack());
    }

    WIRE_ELECTRIC.add(UEV, TagPrefix.wireGtSingle, GTMaterials.Mendelevium)
        .add(UIV, TagPrefix.wireGtSingle, GTMaterials.Mendelevium)
        .add(UXV, TagPrefix.wireGtSingle, GTMaterials.Mendelevium)
        .add(OpV, TagPrefix.wireGtSingle, ISGMaterials.Uruium)
        .add(MAX, TagPrefix.wireGtSingle, ISGMaterials.Uruium);

    WIRE_QUAD.add(UEV, TagPrefix.wireGtQuadruple, ISGMaterials.Mithril)
        .add(UIV, TagPrefix.wireGtQuadruple, GTMaterials.Neutronium)
        .add(UXV, TagPrefix.wireGtQuadruple, ISGMaterials.Taranium)
        .add(OpV, TagPrefix.wireGtQuadruple, ISGMaterials.CrystalMatrix)
        .add(MAX, TagPrefix.wireGtQuadruple, ISGMaterials.CosmicNeutronium);

    WIRE_OCT.add(UEV, TagPrefix.wireGtOctal, ISGMaterials.Mithril)
        .add(UIV, TagPrefix.wireGtOctal, GTMaterials.Neutronium)
        .add(UXV, TagPrefix.wireGtOctal, ISGMaterials.Taranium)
        .add(OpV, TagPrefix.wireGtOctal, ISGMaterials.CrystalMatrix)
        .add(MAX, TagPrefix.wireGtOctal, ISGMaterials.CosmicNeutronium);

    WIRE_HEX.add(UEV, TagPrefix.wireGtHex, ISGMaterials.Mithril)
        .add(UIV, TagPrefix.wireGtHex, GTMaterials.Neutronium)
        .add(UXV, TagPrefix.wireGtHex, ISGMaterials.Taranium)
        .add(OpV, TagPrefix.wireGtHex, ISGMaterials.CrystalMatrix)
        .add(MAX, TagPrefix.wireGtHex, ISGMaterials.CosmicNeutronium);

    CABLE.add(UEV, TagPrefix.cableGtSingle, ISGMaterials.Mithril)
        .add(UIV, TagPrefix.cableGtSingle, GTMaterials.Neutronium)
        .add(UXV, TagPrefix.cableGtSingle, ISGMaterials.Taranium)
        .add(OpV, TagPrefix.cableGtSingle, ISGMaterials.CrystalMatrix)
        .add(MAX, TagPrefix.cableGtSingle, ISGMaterials.CosmicNeutronium);

    CABLE_DOUBLE.add(UEV, TagPrefix.cableGtDouble, ISGMaterials.Mithril)
        .add(UIV, TagPrefix.cableGtDouble, GTMaterials.Neutronium)
        .add(UXV, TagPrefix.cableGtDouble, ISGMaterials.Taranium)
        .add(OpV, TagPrefix.cableGtDouble, ISGMaterials.CrystalMatrix)
        .add(MAX, TagPrefix.cableGtDouble, ISGMaterials.CosmicNeutronium);

    CABLE_QUAD.add(UEV, TagPrefix.cableGtDouble, ISGMaterials.Mithril)
        .add(UIV, TagPrefix.cableGtDouble, GTMaterials.Neutronium)
        .add(UXV, TagPrefix.cableGtDouble, ISGMaterials.Taranium)
        .add(OpV, TagPrefix.cableGtDouble, ISGMaterials.CrystalMatrix)
        .add(MAX, TagPrefix.cableGtDouble, ISGMaterials.CosmicNeutronium);

    WIRE_ELECTRIC.add(UEV, TagPrefix.cableGtQuadruple, ISGMaterials.Mithril)
        .add(UIV, TagPrefix.cableGtQuadruple, GTMaterials.Neutronium)
        .add(UXV, TagPrefix.cableGtQuadruple, ISGMaterials.Taranium)
        .add(OpV, TagPrefix.cableGtQuadruple, ISGMaterials.CrystalMatrix)
        .add(MAX, TagPrefix.cableGtQuadruple, ISGMaterials.CosmicNeutronium);

    CABLE_OCT.add(UEV, TagPrefix.cableGtOctal, ISGMaterials.Mithril)
        .add(UIV, TagPrefix.cableGtOctal, GTMaterials.Neutronium)
        .add(UXV, TagPrefix.cableGtOctal, ISGMaterials.Taranium)
        .add(OpV, TagPrefix.cableGtOctal, ISGMaterials.CrystalMatrix)
        .add(MAX, TagPrefix.cableGtOctal, ISGMaterials.CosmicNeutronium);

    CABLE_HEX.add(UEV, TagPrefix.cableGtHex, ISGMaterials.Mithril)
        .add(UIV, TagPrefix.cableGtHex, GTMaterials.Neutronium)
        .add(UXV, TagPrefix.cableGtHex, ISGMaterials.Taranium)
        .add(OpV, TagPrefix.cableGtHex, ISGMaterials.CrystalMatrix)
        .add(MAX, TagPrefix.cableGtHex, ISGMaterials.CosmicNeutronium);

    CABLE_TIER_UP.add(9, TagPrefix.cableGtSingle, ISGMaterials.Mithril)
        .add(UEV, TagPrefix.cableGtSingle, GTMaterials.Neutronium)
        .add(UIV, TagPrefix.cableGtSingle, ISGMaterials.Taranium)
        .add(UXV, TagPrefix.cableGtSingle, ISGMaterials.CrystalMatrix)
        .add(OpV, TagPrefix.cableGtSingle, ISGMaterials.CosmicNeutronium)
        .add(MAX, TagPrefix.wireGtSingle, ISGMaterials.SpaceTime);

    CABLE_TIER_UP_DOUBLE.add(9, TagPrefix.cableGtDouble, ISGMaterials.Mithril)
        .add(UEV, TagPrefix.cableGtDouble, GTMaterials.Neutronium)
        .add(UIV, TagPrefix.cableGtDouble, ISGMaterials.Taranium)
        .add(UXV, TagPrefix.cableGtDouble, ISGMaterials.CrystalMatrix)
        .add(OpV, TagPrefix.cableGtDouble, ISGMaterials.CosmicNeutronium)
        .add(MAX, TagPrefix.wireGtDouble, ISGMaterials.SpaceTime);

    CABLE_TIER_UP_QUAD.add(9, TagPrefix.cableGtQuadruple, ISGMaterials.Mithril)
        .add(UEV, TagPrefix.cableGtQuadruple, GTMaterials.Neutronium)
        .add(UIV, TagPrefix.cableGtQuadruple, ISGMaterials.Taranium)
        .add(UXV, TagPrefix.cableGtQuadruple, ISGMaterials.CrystalMatrix)
        .add(OpV, TagPrefix.cableGtQuadruple, ISGMaterials.CosmicNeutronium)
        .add(MAX, TagPrefix.wireGtQuadruple, ISGMaterials.SpaceTime);

    CABLE_TIER_UP_OCT.add(9, TagPrefix.cableGtOctal, ISGMaterials.Mithril)
        .add(UEV, TagPrefix.cableGtOctal, GTMaterials.Neutronium)
        .add(UIV, TagPrefix.cableGtOctal, ISGMaterials.Taranium)
        .add(UXV, TagPrefix.cableGtOctal, ISGMaterials.CrystalMatrix)
        .add(OpV, TagPrefix.cableGtOctal, ISGMaterials.CosmicNeutronium)
        .add(MAX, TagPrefix.wireGtOctal, ISGMaterials.SpaceTime);

    CABLE_TIER_UP_HEX.add(9, TagPrefix.cableGtHex, ISGMaterials.Mithril)
        .add(UEV, TagPrefix.cableGtHex, GTMaterials.Neutronium)
        .add(UIV, TagPrefix.cableGtHex, ISGMaterials.Taranium)
        .add(UXV, TagPrefix.cableGtHex, ISGMaterials.CrystalMatrix)
        .add(OpV, TagPrefix.cableGtHex, ISGMaterials.CosmicNeutronium)
        .add(MAX, TagPrefix.wireGtHex, ISGMaterials.SpaceTime);

    PIPE_NORMAL.add(9, TagPrefix.pipeNormalFluid, GTMaterials.Neutronium)
        .add(UEV, TagPrefix.pipeNormalFluid, GTMaterials.Neutronium)
        .add(UIV, TagPrefix.pipeNormalFluid, ISGMaterials.Enderium)
        .add(UXV, TagPrefix.pipeNormalFluid, ISGMaterials.Enderium)
        .add(OpV, TagPrefix.pipeNormalFluid,
            ISGMaterials.HeavyQuarkDegenerateMatter)
        .add(MAX, TagPrefix.pipeNormalFluid,
            ISGMaterials.HeavyQuarkDegenerateMatter);

    PIPE_LARGE.add(7, TagPrefix.pipeLargeFluid, GTMaterials.Iridium)
        .add(9, TagPrefix.pipeLargeFluid, GTMaterials.Neutronium)
        .add(UEV, TagPrefix.pipeLargeFluid, GTMaterials.Neutronium)
        .add(UIV, TagPrefix.pipeLargeFluid, ISGMaterials.Enderium)
        .add(UXV, TagPrefix.pipeLargeFluid, ISGMaterials.Enderium)
        .add(OpV, TagPrefix.pipeLargeFluid,
            ISGMaterials.HeavyQuarkDegenerateMatter)
        .add(MAX, TagPrefix.pipeLargeFluid,
            ISGMaterials.HeavyQuarkDegenerateMatter);

    PIPE_NONUPLE.add(0, TagPrefix.pipeNonupleFluid, GTMaterials.Bronze)
        .add(1, TagPrefix.pipeNonupleFluid, GTMaterials.Bronze)
        .add(2, TagPrefix.pipeNonupleFluid, GTMaterials.Steel)
        .add(3, TagPrefix.pipeNonupleFluid, GTMaterials.StainlessSteel)
        .add(9, TagPrefix.pipeNonupleFluid, GTMaterials.Neutronium)
        .add(UEV, TagPrefix.pipeNonupleFluid, GTMaterials.Neutronium)
        .add(UIV, TagPrefix.pipeNonupleFluid, ISGMaterials.Enderium)
        .add(UXV, TagPrefix.pipeNonupleFluid, ISGMaterials.Enderium)
        .add(OpV, TagPrefix.pipeNonupleFluid,
            ISGMaterials.HeavyQuarkDegenerateMatter)
        .add(MAX, TagPrefix.pipeNonupleFluid,
            ISGMaterials.HeavyQuarkDegenerateMatter);

    PLATE.add(UEV, plate, ISGMaterials.Quantanium)
        .add(UIV, plate, ISGMaterials.Adamantium)
        .add(UXV, plate, ISGMaterials.Vibranium)
        .add(OpV, plate, ISGMaterials.Draconium)
        .add(MAX, plate, ISGMaterials.ChaosInfinityAlloy);

    HULL_PLATE.add(ULV, plate, GTMaterials.WroughtIron)
        .add(LV, plate, GTMaterials.Polyethylene)
        .add(MV, plate, GTMaterials.Polyethylene)
        .add(HV, plate, GTMaterials.PolyvinylChloride)
        .add(EV, plate, GTMaterials.PolyvinylChloride)
        .add(IV, plate, GTMaterials.Polytetrafluoroethylene)
        .add(LuV, plate, GTMaterials.Polytetrafluoroethylene)
        .add(ZPM, plate, GTMaterials.Polybenzimidazole)
        .add(UV, plate, GTMaterials.Polybenzimidazole)
        .add(UHV, plate, ISGMaterials.Polyetheretherketone)
        .add(UEV, plate, ISGMaterials.Polyetheretherketone)
        .add(UIV, plate, ISGMaterials.Zylon)
        .add(UXV, plate, ISGMaterials.Zylon)
        .add(OpV, plate, ISGMaterials.FullerenePolymerMatrix)
        .add(MAX, plate, ISGMaterials.Radox);

    ROTOR.add(9, TagPrefix.rotor, GTMaterials.Neutronium)
        .add(UEV, TagPrefix.rotor, ISGMaterials.Quantanium)
        .add(UIV, TagPrefix.rotor, ISGMaterials.Adamantium)
        .add(UXV, TagPrefix.rotor, ISGMaterials.Vibranium)
        .add(OpV, TagPrefix.rotor, ISGMaterials.Draconium)
        .add(MAX, TagPrefix.rotor, ISGMaterials.TranscendentMetal);

    COIL_HEATING.add(9, TagPrefix.wireGtDouble, ISGMaterials.AbyssalAlloy)
        .add(UEV, TagPrefix.wireGtDouble, ISGMaterials.TitanSteel)
        .add(UIV, TagPrefix.wireGtDouble, ISGMaterials.Adamantine)
        .add(UXV, TagPrefix.wireGtDouble, ISGMaterials.NaquadriaticTaranium)
        .add(OpV, TagPrefix.wireGtDouble, ISGMaterials.Starmetal)
        .add(MAX, TagPrefix.wireGtDouble, ISGMaterials.Hypogen);

    COIL_HEATING_DOUBLE.add(9, TagPrefix.wireGtQuadruple, ISGMaterials.AbyssalAlloy)
        .add(UEV, TagPrefix.wireGtQuadruple, ISGMaterials.TitanSteel)
        .add(UIV, TagPrefix.wireGtQuadruple, ISGMaterials.Adamantine)
        .add(UXV, TagPrefix.wireGtQuadruple, ISGMaterials.NaquadriaticTaranium)
        .add(OpV, TagPrefix.wireGtQuadruple, ISGMaterials.Starmetal)
        .add(MAX, TagPrefix.wireGtQuadruple, ISGMaterials.Hypogen);

    COIL_ELECTRIC.add(9, TagPrefix.wireGtOctal, ISGMaterials.Mithril)
        .add(UEV, TagPrefix.wireGtOctal, ISGMaterials.Mithril)
        .add(UIV, TagPrefix.wireGtHex, ISGMaterials.Mithril)
        .add(UXV, TagPrefix.wireGtHex, ISGMaterials.Mithril)
        .add(OpV, TagPrefix.wireGtOctal, ISGMaterials.CrystalMatrix)
        .add(MAX, TagPrefix.wireGtHex, ISGMaterials.CrystalMatrix);

    ROD_DISTILLATION.add(9, TagPrefix.spring, GTMaterials.Europium)
        .add(UEV, TagPrefix.spring, ISGMaterials.Mithril)
        .add(UIV, TagPrefix.spring, GTMaterials.Neutronium)
        .add(UXV, TagPrefix.spring, ISGMaterials.Taranium)
        .add(OpV, TagPrefix.spring, ISGMaterials.CrystalMatrix)
        .add(MAX, TagPrefix.spring, ISGMaterials.CosmicNeutronium);

    ROD_ELECTROMAGNETIC.add(5, TagPrefix.rod, GTMaterials.VanadiumGallium)
        .add(6, TagPrefix.rod, GTMaterials.VanadiumGallium)
        .add(7, TagPrefix.rod, GTMaterials.NiobiumTitanium)
        .add(8, TagPrefix.rod, GTMaterials.NiobiumTitanium)
        .add(9, TagPrefix.rod, ISGMaterials.EnergeticNetherite)
        .add(UEV, TagPrefix.rod, ISGMaterials.EnergeticNetherite)
        .add(UIV, TagPrefix.rod, ISGMaterials.Mithril)
        .add(UXV, TagPrefix.rod, ISGMaterials.Mithril)
        .add(OpV, TagPrefix.rod, ISGMaterials.Echoite)
        .add(MAX, TagPrefix.rod, ISGMaterials.Echoite);

    PIPE_REACTOR.add(9, TagPrefix.pipeNormalFluid, GTMaterials.Polybenzimidazole)
        .add(UEV, TagPrefix.pipeLargeFluid, GTMaterials.Polybenzimidazole)
        .add(UIV, TagPrefix.pipeHugeFluid, GTMaterials.Polybenzimidazole)
        .add(UXV, TagPrefix.pipeNormalFluid,
            ISGMaterials.FullerenePolymerMatrix)
        .add(OpV, TagPrefix.pipeLargeFluid,
            ISGMaterials.FullerenePolymerMatrix)
        .add(MAX, TagPrefix.pipeHugeFluid,
            ISGMaterials.FullerenePolymerMatrix);

    SPRING.add(UEV, TagPrefix.spring, ISGMaterials.Mithril)
        .add(UIV, TagPrefix.spring, GTMaterials.Neutronium)
        .add(UXV, TagPrefix.spring, ISGMaterials.Taranium)
        .add(OpV, TagPrefix.spring, ISGMaterials.CrystalMatrix)
        .add(MAX, TagPrefix.spring, ISGMaterials.CosmicNeutronium);

//    CRATE.add(9, GTMachines.SUPER_CHEST[2])
//        .add(UEV, GTMachines.SUPER_CHEST[3])
//        .add(UIV, GTMachines.SUPER_CHEST[4])
//        .add(UXV, GTMachines.QUANTUM_CHEST[5])
//        .add(OpV, GTMachines.QUANTUM_CHEST[6])
//        .add(MAX, GTMachines.QUANTUM_CHEST[7]);
//
//    DRUM.add(9, GTMachines.SUPER_TANK[2])
//        .add(UEV, GTMachines.SUPER_TANK[3])
//        .add(UIV, GTMachines.SUPER_TANK[4])
//        .add(UXV, GTMachines.QUANTUM_TANK[5])
//        .add(OpV, GTMachines.QUANTUM_TANK[6])
//        .add(MAX, GTMachines.QUANTUM_TANK[7]);

    FRAME.add(9, TagPrefix.frameGt, GTMaterials.Tritanium)
        .add(UEV, TagPrefix.frameGt, GTMaterials.Neutronium)
        .add(UIV, TagPrefix.frameGt, ISGMaterials.Quantanium)
        .add(UXV, TagPrefix.frameGt, ISGMaterials.Adamantium)
        .add(OpV, TagPrefix.frameGt, ISGMaterials.Draconium)
        .add(MAX, TagPrefix.frameGt, ISGMaterials.Infinity);

    ROD_RADIOACTIVE = CraftingComponent.of("rod_radioactive", GTMaterials.Uranium235)
        .add(LV, rod, GTMaterials.Uranium235)
        .add(MV, rod, GTMaterials.Uranium235)
        .add(HV, rod, GTMaterials.Uranium235)
        .add(EV, rod, GTMaterials.Uranium235)
        .add(IV, rod, GTMaterials.Uranium235)
        .add(LuV, rod, GTMaterials.Plutonium241)
        .add(ZPM, rod, ISGMaterials.Americium243)
        .add(UV, rod, ISGMaterials.Curium247)
        .add(UHV, rod, ISGMaterials.Californium253)
        .add(UEV, rod, ISGMaterials.Fermium259)
        .add(UIV, rod, ISGMaterials.Mendelevium261)
        .add(UXV, rod, ISGMaterials.Mendelevium261)
        .add(OpV, rod, ISGMaterials.Mendelevium261);

  }

  private ISGCraftingComponents() {
    /* This utility class should not be instantiated */
  }


}
