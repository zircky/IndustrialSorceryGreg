package com.zircky.industrialsorcerygreg.common.data;

import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.block.ActiveBlock;
import com.gregtechceu.gtceu.common.block.CoilBlock;
import com.gregtechceu.gtceu.common.block.FusionCasingBlock;
import com.gregtechceu.gtceu.data.recipe.CustomTags;
import com.tterrag.registrate.util.entry.BlockEntry;
import com.zircky.industrialsorcerygreg.ISGCore;
import com.zircky.industrialsorcerygreg.api.ISGValues;
import com.zircky.industrialsorcerygreg.common.block.CoilType;
import com.zircky.industrialsorcerygreg.common.block.FusionCasings;
import com.zircky.industrialsorcerygreg.common.block.components.*;
import com.zircky.industrialsorcerygreg.common.data.models.ISGModels;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import org.apache.commons.lang3.StringUtils;

import static com.zircky.industrialsorcerygreg.api.registries.ISGRegistries.REGISTRATE;
import static com.zircky.industrialsorcerygreg.common.block.BlockMap.CALMAP;
import static com.zircky.industrialsorcerygreg.utils.register.BlockRegisterUtils.*;

public class ISGCasings {

  public static final BlockEntry<Block> MOTOR_LV = createComponentMotorCasing(MotorCasingType.MOTOR_LV);
  public static final BlockEntry<Block> MOTOR_MV = createComponentMotorCasing(MotorCasingType.MOTOR_MV);
  public static final BlockEntry<Block> MOTOR_HV = createComponentMotorCasing(MotorCasingType.MOTOR_HV);
  public static final BlockEntry<Block> MOTOR_EV = createComponentMotorCasing(MotorCasingType.MOTOR_EV);
  public static final BlockEntry<Block> MOTOR_IV = createComponentMotorCasing(MotorCasingType.MOTOR_IV);
  public static final BlockEntry<Block> MOTOR_LuV = createComponentMotorCasing(MotorCasingType.MOTOR_LUV);
  public static final BlockEntry<Block> MOTOR_ZPM = createComponentMotorCasing(MotorCasingType.MOTOR_ZPM);
  public static final BlockEntry<Block> MOTOR_UV = createComponentMotorCasing(MotorCasingType.MOTOR_UV);
  public static final BlockEntry<Block> MOTOR_UHV = createComponentMotorCasing(MotorCasingType.MOTOR_UHV);
  public static final BlockEntry<Block> MOTOR_UEV = createComponentMotorCasing(MotorCasingType.MOTOR_UEV);
  public static final BlockEntry<Block> MOTOR_UIV = createComponentMotorCasing(MotorCasingType.MOTOR_UIV);
  public static final BlockEntry<Block> MOTOR_UXV = createComponentMotorCasing(MotorCasingType.MOTOR_UXV);
  public static final BlockEntry<Block> MOTOR_OpV = createComponentMotorCasing(MotorCasingType.MOTOR_OPV);
  public static final BlockEntry<Block> MOTOR_MAX = createComponentMotorCasing(MotorCasingType.MOTOR_MAX);

  public static final BlockEntry<Block> CONVEYOR_LV = createComponentConveyorCasing(ConveyorCasingType.CONVEYOR_LV);
  public static final BlockEntry<Block> CONVEYOR_MV = createComponentConveyorCasing(ConveyorCasingType.CONVEYOR_MV);
  public static final BlockEntry<Block> CONVEYOR_HV = createComponentConveyorCasing(ConveyorCasingType.CONVEYOR_HV);
  public static final BlockEntry<Block> CONVEYOR_EV = createComponentConveyorCasing(ConveyorCasingType.CONVEYOR_EV);
  public static final BlockEntry<Block> CONVEYOR_IV = createComponentConveyorCasing(ConveyorCasingType.CONVEYOR_IV);
  public static final BlockEntry<Block> CONVEYOR_LuV = createComponentConveyorCasing(ConveyorCasingType.CONVEYOR_LUV);
  public static final BlockEntry<Block> CONVEYOR_ZPM = createComponentConveyorCasing(ConveyorCasingType.CONVEYOR_ZPM);
  public static final BlockEntry<Block> CONVEYOR_UV = createComponentConveyorCasing(ConveyorCasingType.CONVEYOR_UV);
  public static final BlockEntry<Block> CONVEYOR_UHV = createComponentConveyorCasing(ConveyorCasingType.CONVEYOR_UHV);
  public static final BlockEntry<Block> CONVEYOR_UEV = createComponentConveyorCasing(ConveyorCasingType.CONVEYOR_UEV);
  public static final BlockEntry<Block> CONVEYOR_UIV = createComponentConveyorCasing(ConveyorCasingType.CONVEYOR_UIV);
  public static final BlockEntry<Block> CONVEYOR_UXV = createComponentConveyorCasing(ConveyorCasingType.CONVEYOR_UXV);
  public static final BlockEntry<Block> CONVEYOR_OpV = createComponentConveyorCasing(ConveyorCasingType.CONVEYOR_OPV);
  public static final BlockEntry<Block> CONVEYOR_MAX = createComponentConveyorCasing(ConveyorCasingType.CONVEYOR_MAX);

  public static final BlockEntry<Block> EMITTER_LV = createComponentEmitterCasing(EmitterCasingType.EMITTER_LV);
  public static final BlockEntry<Block> EMITTER_MV = createComponentEmitterCasing(EmitterCasingType.EMITTER_MV);
  public static final BlockEntry<Block> EMITTER_HV = createComponentEmitterCasing(EmitterCasingType.EMITTER_HV);
  public static final BlockEntry<Block> EMITTER_EV = createComponentEmitterCasing(EmitterCasingType.EMITTER_EV);
  public static final BlockEntry<Block> EMITTER_IV = createComponentEmitterCasing(EmitterCasingType.EMITTER_IV);
  public static final BlockEntry<Block> EMITTER_LuV = createComponentEmitterCasing(EmitterCasingType.EMITTER_LUV);
  public static final BlockEntry<Block> EMITTER_ZPM = createComponentEmitterCasing(EmitterCasingType.EMITTER_ZPM);
  public static final BlockEntry<Block> EMITTER_UV = createComponentEmitterCasing(EmitterCasingType.EMITTER_UV);
  public static final BlockEntry<Block> EMITTER_UHV = createComponentEmitterCasing(EmitterCasingType.EMITTER_UHV);
  public static final BlockEntry<Block> EMITTER_UEV = createComponentEmitterCasing(EmitterCasingType.EMITTER_UEV);
  public static final BlockEntry<Block> EMITTER_UIV = createComponentEmitterCasing(EmitterCasingType.EMITTER_UIV);
  public static final BlockEntry<Block> EMITTER_UXV = createComponentEmitterCasing(EmitterCasingType.EMITTER_UXV);
  public static final BlockEntry<Block> EMITTER_OpV = createComponentEmitterCasing(EmitterCasingType.EMITTER_OPV);
  public static final BlockEntry<Block> EMITTER_MAX = createComponentEmitterCasing(EmitterCasingType.EMITTER_MAX);

  public static final BlockEntry<Block> FIELD_GENERATOR_LV = createComponentFieldGeneratorCasing(FieldGeneratorCasingType.FIELD_GENERATOR_LV);
  public static final BlockEntry<Block> FIELD_GENERATOR_MV = createComponentFieldGeneratorCasing(FieldGeneratorCasingType.FIELD_GENERATOR_MV);
  public static final BlockEntry<Block> FIELD_GENERATOR_HV = createComponentFieldGeneratorCasing(FieldGeneratorCasingType.FIELD_GENERATOR_HV);
  public static final BlockEntry<Block> FIELD_GENERATOR_EV = createComponentFieldGeneratorCasing(FieldGeneratorCasingType.FIELD_GENERATOR_EV);
  public static final BlockEntry<Block> FIELD_GENERATOR_IV = createComponentFieldGeneratorCasing(FieldGeneratorCasingType.FIELD_GENERATOR_IV);
  public static final BlockEntry<Block> FIELD_GENERATOR_LuV = createComponentFieldGeneratorCasing(FieldGeneratorCasingType.FIELD_GENERATOR_LUV);
  public static final BlockEntry<Block> FIELD_GENERATOR_ZPM = createComponentFieldGeneratorCasing(FieldGeneratorCasingType.FIELD_GENERATOR_ZPM);
  public static final BlockEntry<Block> FIELD_GENERATOR_UV = createComponentFieldGeneratorCasing(FieldGeneratorCasingType.FIELD_GENERATOR_UV);
  public static final BlockEntry<Block> FIELD_GENERATOR_UHV = createComponentFieldGeneratorCasing(FieldGeneratorCasingType.FIELD_GENERATOR_UHV);
  public static final BlockEntry<Block> FIELD_GENERATOR_UEV = createComponentFieldGeneratorCasing(FieldGeneratorCasingType.FIELD_GENERATOR_UEV);
  public static final BlockEntry<Block> FIELD_GENERATOR_UIV = createComponentFieldGeneratorCasing(FieldGeneratorCasingType.FIELD_GENERATOR_UIV);
  public static final BlockEntry<Block> FIELD_GENERATOR_UXV = createComponentFieldGeneratorCasing(FieldGeneratorCasingType.FIELD_GENERATOR_UXV);
  public static final BlockEntry<Block> FIELD_GENERATOR_OpV = createComponentFieldGeneratorCasing(FieldGeneratorCasingType.FIELD_GENERATOR_OPV);
  public static final BlockEntry<Block> FIELD_GENERATOR_MAX = createComponentFieldGeneratorCasing(FieldGeneratorCasingType.FIELD_GENERATOR_MAX);

  public static final BlockEntry<Block> PISTON_LV = createComponentPistonCasing(PistonCasingType.PISTON_LV);
  public static final BlockEntry<Block> PISTON_MV = createComponentPistonCasing(PistonCasingType.PISTON_MV);
  public static final BlockEntry<Block> PISTON_HV = createComponentPistonCasing(PistonCasingType.PISTON_HV);
  public static final BlockEntry<Block> PISTON_EV = createComponentPistonCasing(PistonCasingType.PISTON_EV);
  public static final BlockEntry<Block> PISTON_IV = createComponentPistonCasing(PistonCasingType.PISTON_IV);
  public static final BlockEntry<Block> PISTON_LuV = createComponentPistonCasing(PistonCasingType.PISTON_LUV);
  public static final BlockEntry<Block> PISTON_ZPM = createComponentPistonCasing(PistonCasingType.PISTON_ZPM);
  public static final BlockEntry<Block> PISTON_UV = createComponentPistonCasing(PistonCasingType.PISTON_UV);
  public static final BlockEntry<Block> PISTON_UHV = createComponentPistonCasing(PistonCasingType.PISTON_UHV);
  public static final BlockEntry<Block> PISTON_UEV = createComponentPistonCasing(PistonCasingType.PISTON_UEV);
  public static final BlockEntry<Block> PISTON_UIV = createComponentPistonCasing(PistonCasingType.PISTON_UIV);
  public static final BlockEntry<Block> PISTON_UXV = createComponentPistonCasing(PistonCasingType.PISTON_UXV);
  public static final BlockEntry<Block> PISTON_OpV = createComponentPistonCasing(PistonCasingType.PISTON_OPV);
  public static final BlockEntry<Block> PISTON_MAX = createComponentPistonCasing(PistonCasingType.PISTON_MAX);

  public static final BlockEntry<Block> PUMP_LV = createComponentPumpCasing(PumpCasingType.PUMP_LV);
  public static final BlockEntry<Block> PUMP_MV = createComponentPumpCasing(PumpCasingType.PUMP_MV);
  public static final BlockEntry<Block> PUMP_HV = createComponentPumpCasing(PumpCasingType.PUMP_HV);
  public static final BlockEntry<Block> PUMP_EV = createComponentPumpCasing(PumpCasingType.PUMP_EV);
  public static final BlockEntry<Block> PUMP_IV = createComponentPumpCasing(PumpCasingType.PUMP_IV);
  public static final BlockEntry<Block> PUMP_LuV = createComponentPumpCasing(PumpCasingType.PUMP_LUV);
  public static final BlockEntry<Block> PUMP_ZPM = createComponentPumpCasing(PumpCasingType.PUMP_ZPM);
  public static final BlockEntry<Block> PUMP_UV = createComponentPumpCasing(PumpCasingType.PUMP_UV);
  public static final BlockEntry<Block> PUMP_UHV = createComponentPumpCasing(PumpCasingType.PUMP_UHV);
  public static final BlockEntry<Block> PUMP_UEV = createComponentPumpCasing(PumpCasingType.PUMP_UEV);
  public static final BlockEntry<Block> PUMP_UIV = createComponentPumpCasing(PumpCasingType.PUMP_UIV);
  public static final BlockEntry<Block> PUMP_UXV = createComponentPumpCasing(PumpCasingType.PUMP_UXV);
  public static final BlockEntry<Block> PUMP_OpV = createComponentPumpCasing(PumpCasingType.PUMP_OPV);
  public static final BlockEntry<Block> PUMP_MAX = createComponentPumpCasing(PumpCasingType.PUMP_MAX);

  public static final BlockEntry<Block> ROBOT_ARM_LV = createComponentRobotArmCasing(RobotArmCasingType.ROBOT_ARM_LV);
  public static final BlockEntry<Block> ROBOT_ARM_MV = createComponentRobotArmCasing(RobotArmCasingType.ROBOT_ARM_MV);
  public static final BlockEntry<Block> ROBOT_ARM_HV = createComponentRobotArmCasing(RobotArmCasingType.ROBOT_ARM_HV);
  public static final BlockEntry<Block> ROBOT_ARM_EV = createComponentRobotArmCasing(RobotArmCasingType.ROBOT_ARM_EV);
  public static final BlockEntry<Block> ROBOT_ARM_IV = createComponentRobotArmCasing(RobotArmCasingType.ROBOT_ARM_IV);
  public static final BlockEntry<Block> ROBOT_ARM_LuV = createComponentRobotArmCasing(RobotArmCasingType.ROBOT_ARM_LUV);
  public static final BlockEntry<Block> ROBOT_ARM_ZPM = createComponentRobotArmCasing(RobotArmCasingType.ROBOT_ARM_ZPM);
  public static final BlockEntry<Block> ROBOT_ARM_UV = createComponentRobotArmCasing(RobotArmCasingType.ROBOT_ARM_UV);
  public static final BlockEntry<Block> ROBOT_ARM_UHV = createComponentRobotArmCasing(RobotArmCasingType.ROBOT_ARM_UHV);
  public static final BlockEntry<Block> ROBOT_ARM_UEV = createComponentRobotArmCasing(RobotArmCasingType.ROBOT_ARM_UEV);
  public static final BlockEntry<Block> ROBOT_ARM_UIV = createComponentRobotArmCasing(RobotArmCasingType.ROBOT_ARM_UIV);
  public static final BlockEntry<Block> ROBOT_ARM_UXV = createComponentRobotArmCasing(RobotArmCasingType.ROBOT_ARM_UXV);
  public static final BlockEntry<Block> ROBOT_ARM_OpV = createComponentRobotArmCasing(RobotArmCasingType.ROBOT_ARM_OPV);
  public static final BlockEntry<Block> ROBOT_ARM_MAX = createComponentRobotArmCasing(RobotArmCasingType.ROBOT_ARM_MAX);

  public static final BlockEntry<Block> SENSOR_LV = createComponentSensorCasing(SensorCasingTypr.SENSOR_LV);
  public static final BlockEntry<Block> SENSOR_MV = createComponentSensorCasing(SensorCasingTypr.SENSOR_MV);
  public static final BlockEntry<Block> SENSOR_HV = createComponentSensorCasing(SensorCasingTypr.SENSOR_HV);
  public static final BlockEntry<Block> SENSOR_EV = createComponentSensorCasing(SensorCasingTypr.SENSOR_EV);
  public static final BlockEntry<Block> SENSOR_IV = createComponentSensorCasing(SensorCasingTypr.SENSOR_IV);
  public static final BlockEntry<Block> SENSOR_LuV = createComponentSensorCasing(SensorCasingTypr.SENSOR_LUV);
  public static final BlockEntry<Block> SENSOR_ZPM = createComponentSensorCasing(SensorCasingTypr.SENSOR_ZPM);
  public static final BlockEntry<Block> SENSOR_UV = createComponentSensorCasing(SensorCasingTypr.SENSOR_UV);
  public static final BlockEntry<Block> SENSOR_UHV = createComponentSensorCasing(SensorCasingTypr.SENSOR_UHV);
  public static final BlockEntry<Block> SENSOR_UEV = createComponentSensorCasing(SensorCasingTypr.SENSOR_UEV);
  public static final BlockEntry<Block> SENSOR_UIV = createComponentSensorCasing(SensorCasingTypr.SENSOR_UIV);
  public static final BlockEntry<Block> SENSOR_UXV = createComponentSensorCasing(SensorCasingTypr.SENSOR_OPV);
  public static final BlockEntry<Block> SENSOR_OpV = createComponentSensorCasing(SensorCasingTypr.SENSOR_OPV);
  public static final BlockEntry<Block> SENSOR_MAX = createComponentSensorCasing(SensorCasingTypr.SENSOR_MAX);

  public static final BlockEntry<Block> STERILE_WATER_PLANT_CASING = createCasingBlock("sterile_water_plant_casing", ISGCore.id("block/casings/sterile_water_plant_casing"));
  public static final BlockEntry<Block> HIGH_STRENGTH_CONCRETE = createCasingBlock("high_strength_concrete", ISGCore.id("block/casings/space_elevator_module_base/side"));
  public static final BlockEntry<Block> REINFORCED_STERILE_WATER_PLANT_CASING = createCasingBlock("reinforced_sterile_water_plant_casing", ISGCore.id("block/casings/reinforced_sterile_water_plant_casing"));
  public static final BlockEntry<Block> HIGH_PRESSURE_RESISTANT_CASING = createCasingBlock("high_pressure_resistant_casing", ISGCore.id("block/casings/high_pressure_resistant_casing"));
  public static final BlockEntry<Block> OZONE_CASING = createCasingBlock("ozone_casing", ISGCore.id("block/casings/ozone_casing"));
  public static final BlockEntry<Block> FLOCCULATION_CASING = createCasingBlock("flocculation_casing", ISGCore.id("block/casings/flocculation_casing"));
  public static final BlockEntry<Block> STABILIZED_NAQUADAH_WATER_PLANT_CASING = createCasingBlock("stabilized_naquadah_water_plant_casing", ISGCore.id("block/casings/stabilized_naquadah_water_plant_casing"));
  public static final BlockEntry<Block> INERT_NEUTRALIZATION_WATER_PLANT_CASING = createCasingBlock("inert_neutralization_water_plant_casing", ISGCore.id("block/casings/inert_neutralization_water_plant_casing"));
  public static final BlockEntry<Block> PLASMA_HEATER_CASING = createCasingBlock("plasma_heater_casing", ISGCore.id("block/casings/plasma_heater_casing"));
  public static final BlockEntry<Block> IMPROVED_SUPERCONDUCTOR_COIL = createCasingBlock("improved_superconductor_coil", ISGCore.id("block/casings/improved_superconductor_coil"));
  public static final BlockEntry<Block> SPEEDING_PIPE = createCasingBlock("speeding_pipe", ISGCore.id("block/casings/speeding_pipe/side")); // app
  public static final BlockEntry<Block> NAQUADAH_REINFORCED_PLANT_CASING = createCasingBlock("naquadah_reinforced_plant_casing", ISGCore.id("block/casings/naquadah_reinforced_plant_casing"));
  public static final BlockEntry<Block> HIGH_ENERGY_ULTRAVIOLET_EMITTER_CASING = createCasingBlock("high_energy_ultraviolet_emitter_casing", ISGCore.id("block/casings/high_energy_ultraviolet_emitter_casing"));
  public static final BlockEntry<Block> DIMENSION_INJECTION_CASING = createCasingBlock("dimension_injection_casing", ISGCore.id("block/casings/dimension_injection_casing"));
  public static final BlockEntry<Block> QUARK_PIPE = createCasingBlock("quark_pipe", ISGCore.id("block/casings/quark_pipe"));
  public static final BlockEntry<Block> QUARK_EXCLUSION_CASING = createCasingBlock("quark_exclusion_casing", ISGCore.id("block/casings/quark_exclusion_casing"));
  public static final BlockEntry<Block> LASER_COOLING_CASING = createCasingBlock("laser_cooling_casing", ISGCore.id("block/casings/laser_cooling_casing"));
  public static final BlockEntry<Block> AMPROSIUM_PIPE_CASING = createCasingBlock("neutronium_pipe_casing", ISGCore.id("block/casings/neutronium_pipe_casing"));
  public static final BlockEntry<Block> ANTIFREEZE_HEATPROOF_MACHINE_CASING = createCasingBlock("antifreeze_heatproof_machine_casing", ISGCore.id("block/casings/antifreeze_heatproof_machine_casing"));
  public static final BlockEntry<Block> PROCESS_MACHINE_CASING = createCasingBlock("process_machine_casing", ISGCore.id("block/casings/process_machine_casing"));


  public static final BlockEntry<FusionCasingBlock> FUSION_CASING_MK4 = createFusionCasing(FusionCasings.CasingType.FUSION_CASING_MK4, "Fusion Casing MK IV");
  public static final BlockEntry<FusionCasingBlock> FUSION_CASING_MK5 = createFusionCasing(FusionCasings.CasingType.FUSION_CASING_MK5, "Fusion Casing MK V");

  public static final BlockEntry<ActiveBlock> ADVANCED_FUSION_COIL = createActiveCasing("advanced_fusion_coil", "block/variant/advanced_fusion_coil");
  public static final BlockEntry<ActiveBlock> FUSION_COIL_MK2 = createActiveCasing("fusion_coil_mk2","Fusion Coil MK II", "block/variant/fusion_coil_mk2");

  public static final BlockEntry<ActiveBlock> QUANTUM_FORCE_TRANSFORMER_COIL = createActiveCasing("quantum_force_transformer_coil", "block/variant/quantum_force_transformer_coil");

  public static final BlockEntry<Block> CHEMICAL_GRADE_GLASS = createGlassCasingBlock("chemical_grade_glass", ISGCore.id("block/casings/chemical_grade_glass"));
  public static final BlockEntry<Block> ELECTRON_PERMEABLE_NEUTRONIUM_COATED_GLASS = createGlassCasingBlock("electron_permeable_neutronium_coated_glass", ISGCore.id("block/casings/electron_permeable_neutronium_coated_glass"));
  public static final BlockEntry<Block> OMNI_PURPOSE_INFINITY_FUSED_GLASS = createGlassCasingBlock("omni_purpose_infinity_fused_glass", ISGCore.id("block/casings/omni_purpose_infinity_fused_glass"));
  public static final BlockEntry<Block> NON_PHOTONIC_MATTER_EXCLUSION_GLASS = createGlassCasingBlock("non_photonic_matter_exclusion_glass", ISGCore.id("block/casings/non_photonic_matter_exclusion_glass"));

  public static final BlockEntry<Block> HERMETIC_CASING_UEV = createHermeticCasing(GTValues.UEV);
  public static final BlockEntry<Block> HERMETIC_CASING_UIV = createHermeticCasing(GTValues.UIV);
  public static final BlockEntry<Block> HERMETIC_CASING_UXV = createHermeticCasing(GTValues.UXV);
  public static final BlockEntry<Block> HERMETIC_CASING_OpV = createHermeticCasing(GTValues.OpV);

  public static final BlockEntry<CoilBlock> URUIUM_COIL_BLOCK = createCoilBlock(CoilType.URUIUM);
  public static final BlockEntry<CoilBlock> ABYSSALALLOY_COIL_BLOCK = createCoilBlock(CoilType.ABYSSALALLOY);
  public static final BlockEntry<CoilBlock> TITANSTEEL_COIL_BLOCK = createCoilBlock(CoilType.TITANSTEEL);
  public static final BlockEntry<CoilBlock> ADAMANTINE_COIL_BLOCK = createCoilBlock(CoilType.ADAMANTINE);
  public static final BlockEntry<CoilBlock> NAQUADRIATICTARANIUM_COIL_BLOCK = createCoilBlock(CoilType.NAQUADRIATICTARANIUM);
  public static final BlockEntry<CoilBlock> STARMETAL_COIL_BLOCK = createCoilBlock(CoilType.STARMETAL);
  public static final BlockEntry<CoilBlock> INFINITY_COIL_BLOCK = createCoilBlock(CoilType.INFINITY);
  public static final BlockEntry<CoilBlock> HYPOGEN_COIL_BLOCK = createCoilBlock(CoilType.HYPOGEN);
  public static final BlockEntry<CoilBlock> ETERNITY_COIL_BLOCK = createCoilBlock(CoilType.ETERNITY);


  public static final BlockEntry<Block> COMPONENT_ASSEMBLY_LINE_CASING_LV = createTierCasings("component_assembly_line_casing_lv", ISGCore.id("block/casings/component_assembly_line/component_assembly_line_casing_lv"), CALMAP, 1);
  public static final BlockEntry<Block> COMPONENT_ASSEMBLY_LINE_CASING_MV = createTierCasings("component_assembly_line_casing_mv", ISGCore.id("block/casings/component_assembly_line/component_assembly_line_casing_mv"), CALMAP, 2);
  public static final BlockEntry<Block> COMPONENT_ASSEMBLY_LINE_CASING_HV = createTierCasings("component_assembly_line_casing_hv", ISGCore.id("block/casings/component_assembly_line/component_assembly_line_casing_hv"), CALMAP, 3);
  public static final BlockEntry<Block> COMPONENT_ASSEMBLY_LINE_CASING_EV = createTierCasings("component_assembly_line_casing_ev", ISGCore.id("block/casings/component_assembly_line/component_assembly_line_casing_ev"), CALMAP, 4);
  public static final BlockEntry<Block> COMPONENT_ASSEMBLY_LINE_CASING_IV = createTierCasings("component_assembly_line_casing_iv", ISGCore.id("block/casings/component_assembly_line/component_assembly_line_casing_iv"), CALMAP, 5);
  public static final BlockEntry<Block> COMPONENT_ASSEMBLY_LINE_CASING_LUV = createTierCasings("component_assembly_line_casing_luv", ISGCore.id("block/casings/component_assembly_line/component_assembly_line_casing_luv"), CALMAP, 6);
  public static final BlockEntry<Block> COMPONENT_ASSEMBLY_LINE_CASING_ZPM = createTierCasings("component_assembly_line_casing_zpm", ISGCore.id("block/casings/component_assembly_line/component_assembly_line_casing_zpm"), CALMAP, 7);
  public static final BlockEntry<Block> COMPONENT_ASSEMBLY_LINE_CASING_UV = createTierCasings("component_assembly_line_casing_uv", ISGCore.id("block/casings/component_assembly_line/component_assembly_line_casing_uv"), CALMAP, 8);
  public static final BlockEntry<Block> COMPONENT_ASSEMBLY_LINE_CASING_UHV = createTierCasings("component_assembly_line_casing_uhv", ISGCore.id("block/casings/component_assembly_line/component_assembly_line_casing_uhv"), CALMAP, 9);
  public static final BlockEntry<Block> COMPONENT_ASSEMBLY_LINE_CASING_UEV = createTierCasings("component_assembly_line_casing_uev", ISGCore.id("block/casings/component_assembly_line/component_assembly_line_casing_uev"), CALMAP, 10);
  public static final BlockEntry<Block> COMPONENT_ASSEMBLY_LINE_CASING_UIV = createTierCasings("component_assembly_line_casing_uiv", ISGCore.id("block/casings/component_assembly_line/component_assembly_line_casing_uiv"), CALMAP, 11);
  public static final BlockEntry<Block> COMPONENT_ASSEMBLY_LINE_CASING_UXV = createTierCasings("component_assembly_line_casing_uxv", ISGCore.id("block/casings/component_assembly_line/component_assembly_line_casing_uxv"), CALMAP, 12);
  public static final BlockEntry<Block> COMPONENT_ASSEMBLY_LINE_CASING_OPV = createTierCasings("component_assembly_line_casing_opv", ISGCore.id("block/casings/component_assembly_line/component_assembly_line_casing_opv"), CALMAP, 13);
  public static final BlockEntry<Block> COMPONENT_ASSEMBLY_LINE_CASING_MAX = createTierCasings("component_assembly_line_casing_max", ISGCore.id("block/casings/component_assembly_line/component_assembly_line_casing_max"), CALMAP, 14);


  private static BlockEntry<Block> createComponentMotorCasing(MotorCasingType motorCasingType) {
    String name = "motor";
    String id = motorCasingType.getSerializedName();
    int tier = motorCasingType.getTier();

    var entry = createComponentCasing(name, id, tier);

    ISGValues.MOTOR.put(motorCasingType, entry);
    return entry;
  }

  private static BlockEntry<Block> createComponentConveyorCasing(ConveyorCasingType conveyorCasingType) {
    String name = "conveyor";
    String id = conveyorCasingType.getSerializedName();
    int tier = conveyorCasingType.getTier();

    var entry = createComponentCasing(name, id, tier);

    ISGValues.CONVEYOR.put(conveyorCasingType, entry);
    return entry;
  }

  private static BlockEntry<Block> createComponentEmitterCasing(EmitterCasingType emitterCasingType) {
    String name = "emitter";
    String id = emitterCasingType.getSerializedName();
    int tier = emitterCasingType.getTier();

    var entry = createComponentCasing(name, id, tier);

    ISGValues.EMITTER.put(emitterCasingType, entry);
    return entry;
  }

  private static BlockEntry<Block> createComponentFieldGeneratorCasing(FieldGeneratorCasingType fieldGeneratorCasingType) {
    String name = "field_generator";
    String id = fieldGeneratorCasingType.getSerializedName();
    int tier = fieldGeneratorCasingType.getTier();

    var entry = createComponentCasing(name, id, tier);

    ISGValues.FIELD_GENERATOR.put(fieldGeneratorCasingType, entry);
    return entry;
  }

  private static BlockEntry<Block> createComponentPistonCasing(PistonCasingType pistonCasingType) {
    String name = "piston";
    String id = pistonCasingType.getSerializedName();
    int tier = pistonCasingType.getTier();

    var entry = createComponentCasing(name, id, tier);

    ISGValues.PISTON.put(pistonCasingType, entry);
    return entry;
  }

  private static BlockEntry<Block> createComponentPumpCasing(PumpCasingType pumpCasingType) {
    String name = "pump";
    String id = pumpCasingType.getSerializedName();
    int tier = pumpCasingType.getTier();

    var entry = createComponentCasing(name, id, tier);

    ISGValues.PUMP.put(pumpCasingType, entry);
    return entry;
  }

  private static BlockEntry<Block> createComponentRobotArmCasing(RobotArmCasingType robotArmCasingType) {
    String name = "robot_arm";
    String id = robotArmCasingType.getSerializedName();
    int tier = robotArmCasingType.getTier();

    var entry = createComponentCasing(name, id, tier);

    ISGValues.ROBOT_ARM.put(robotArmCasingType, entry);
    return entry;
  }

  private static BlockEntry<Block> createComponentSensorCasing(SensorCasingTypr sensorCasingTypr) {
    String name = "sensor";
    String id = sensorCasingTypr.getSerializedName();
    int tier = sensorCasingTypr.getTier();

    var entry = createComponentCasing(name, id, tier);

    ISGValues.SENSOR.put(sensorCasingTypr, entry);
    return entry;
  }

  private static BlockEntry<Block> createComponentCasing(String name, String id, int tier) {
    var entry = REGISTRATE
        .block(id, Block::new)
        .lang("%s Block (%s)".formatted(StringUtils.capitalize(name), GTValues.VN[tier]))
        .initialProperties(() -> Blocks.IRON_BLOCK)
        .properties(p -> p.isValidSpawn((state, level, pos, ent) -> false))
        .blockstate(ISGModels.createComponentCasingModel(name, id))
        .addLayer(() -> RenderType::translucent)
        .tag(CustomTags.MINEABLE_WITH_CONFIG_VALID_PICKAXE_WRENCH)
        .item(BlockItem::new)
        .model((ctx, prov) -> prov.withExistingParent(ctx.getName(), prov.modLoc("block/casings/%s/%s".formatted(name, id))))
        .build()
        .register();
    if (!GTCEuAPI.isHighTier() && tier > GTValues.UHV) {
      REGISTRATE.setCreativeTab(entry, null);
    }
    return entry;
  }

  
  public static void init() {
  }
}
