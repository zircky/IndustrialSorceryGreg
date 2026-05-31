package com.zircky.industrialsorcerygreg.data.recipe;

import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.common.data.GTItems;
import com.gregtechceu.gtceu.data.recipe.CraftingComponent;
import com.gregtechceu.gtceu.data.recipe.GTCraftingComponents;
import com.zircky.industrialsorcerygreg.common.data.ISGCasings;

import static com.gregtechceu.gtceu.api.GTValues.*;

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
  }


}
