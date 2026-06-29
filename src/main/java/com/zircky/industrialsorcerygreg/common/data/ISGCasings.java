package com.zircky.industrialsorcerygreg.common.data;

import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.common.data.models.GTModels;
import com.gregtechceu.gtceu.data.recipe.CustomTags;
import com.tterrag.registrate.util.entry.BlockEntry;
import com.zircky.industrialsorcerygreg.ISGCore;
import com.zircky.industrialsorcerygreg.common.data.models.ISGModels;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.GlassBlock;

import java.util.Locale;
import java.util.function.Supplier;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.zircky.industrialsorcerygreg.api.registries.ISGRegistries.REGISTRATE;

public class ISGCasings {

  public static final BlockEntry<Block> MOTOR_LV = createComponentCasingBlock("Motor", LV);
  public static final BlockEntry<Block> MOTOR_MV = createComponentCasingBlock("Motor", MV);
  public static final BlockEntry<Block> MOTOR_HV = createComponentCasingBlock("Motor", HV);
  public static final BlockEntry<Block> MOTOR_EV = createComponentCasingBlock("Motor", EV);
  public static final BlockEntry<Block> MOTOR_IV = createComponentCasingBlock("Motor", IV);
  public static final BlockEntry<Block> MOTOR_LuV = createComponentCasingBlock("Motor", LuV);
  public static final BlockEntry<Block> MOTOR_ZPM = createComponentCasingBlock("Motor", ZPM);
  public static final BlockEntry<Block> MOTOR_UV = createComponentCasingBlock("Motor", UV);
  public static final BlockEntry<Block> MOTOR_UHV = createComponentCasingBlock("Motor", UHV);
  public static final BlockEntry<Block> MOTOR_UEV = createComponentCasingBlock("Motor", UEV);
  public static final BlockEntry<Block> MOTOR_UIV = createComponentCasingBlock("Motor", UIV);
  public static final BlockEntry<Block> MOTOR_UXV = createComponentCasingBlock("Motor", UXV);
  public static final BlockEntry<Block> MOTOR_OpV = createComponentCasingBlock("Motor", OpV);
  public static final BlockEntry<Block> MOTOR_MAX = createComponentCasingBlock("Motor", MAX);

  public static final BlockEntry<Block> CONVEYOR_LV = createComponentCasingBlock("Conveyor", LV);
  public static final BlockEntry<Block> CONVEYOR_MV = createComponentCasingBlock("Conveyor", MV);
  public static final BlockEntry<Block> CONVEYOR_HV = createComponentCasingBlock("Conveyor", HV);
  public static final BlockEntry<Block> CONVEYOR_EV = createComponentCasingBlock("Conveyor", EV);
  public static final BlockEntry<Block> CONVEYOR_IV = createComponentCasingBlock("Conveyor", IV);
  public static final BlockEntry<Block> CONVEYOR_LuV = createComponentCasingBlock("Conveyor", LuV);
  public static final BlockEntry<Block> CONVEYOR_ZPM = createComponentCasingBlock("Conveyor", ZPM);
  public static final BlockEntry<Block> CONVEYOR_UV = createComponentCasingBlock("Conveyor", UV);
  public static final BlockEntry<Block> CONVEYOR_UHV = createComponentCasingBlock("Conveyor", UHV);
  public static final BlockEntry<Block> CONVEYOR_UEV = createComponentCasingBlock("Conveyor", UEV);
  public static final BlockEntry<Block> CONVEYOR_UIV = createComponentCasingBlock("Conveyor", UIV);
  public static final BlockEntry<Block> CONVEYOR_UXV = createComponentCasingBlock("Conveyor", UXV);
  public static final BlockEntry<Block> CONVEYOR_OpV = createComponentCasingBlock("Conveyor", OpV);
  public static final BlockEntry<Block> CONVEYOR_MAX = createComponentCasingBlock("Conveyor", MAX);

  public static final BlockEntry<Block> EMITTER_LV = createComponentCasingBlock("Emitter", LV);
  public static final BlockEntry<Block> EMITTER_MV = createComponentCasingBlock("Emitter", MV);
  public static final BlockEntry<Block> EMITTER_HV = createComponentCasingBlock("Emitter", HV);
  public static final BlockEntry<Block> EMITTER_EV = createComponentCasingBlock("Emitter", EV);
  public static final BlockEntry<Block> EMITTER_IV = createComponentCasingBlock("Emitter", IV);
  public static final BlockEntry<Block> EMITTER_LuV = createComponentCasingBlock("Emitter", LuV);
  public static final BlockEntry<Block> EMITTER_ZPM = createComponentCasingBlock("Emitter", ZPM);
  public static final BlockEntry<Block> EMITTER_UV = createComponentCasingBlock("Emitter", UV);
  public static final BlockEntry<Block> EMITTER_UHV = createComponentCasingBlock("Emitter", UHV);
  public static final BlockEntry<Block> EMITTER_UEV = createComponentCasingBlock("Emitter", UEV);
  public static final BlockEntry<Block> EMITTER_UIV = createComponentCasingBlock("Emitter", UIV);
  public static final BlockEntry<Block> EMITTER_UXV = createComponentCasingBlock("Emitter", UXV);
  public static final BlockEntry<Block> EMITTER_OpV = createComponentCasingBlock("Emitter", OpV);
  public static final BlockEntry<Block> EMITTER_MAX = createComponentCasingBlock("Emitter", MAX);

  public static final BlockEntry<Block> FIELD_GENERATOR_LV = createComponentCasingBlock("Field_generator", LV);
  public static final BlockEntry<Block> FIELD_GENERATOR_MV = createComponentCasingBlock("Field_generator", MV);
  public static final BlockEntry<Block> FIELD_GENERATOR_HV = createComponentCasingBlock("Field_generator", HV);
  public static final BlockEntry<Block> FIELD_GENERATOR_EV = createComponentCasingBlock("Field_generator", EV);
  public static final BlockEntry<Block> FIELD_GENERATOR_IV = createComponentCasingBlock("Field_generator", IV);
  public static final BlockEntry<Block> FIELD_GENERATOR_LuV = createComponentCasingBlock("Field_generator", LuV);
  public static final BlockEntry<Block> FIELD_GENERATOR_ZPM = createComponentCasingBlock("Field_generator", ZPM);
  public static final BlockEntry<Block> FIELD_GENERATOR_UV = createComponentCasingBlock("Field_generator", UV);
  public static final BlockEntry<Block> FIELD_GENERATOR_UHV = createComponentCasingBlock("Field_generator", UHV);
  public static final BlockEntry<Block> FIELD_GENERATOR_UEV = createComponentCasingBlock("Field_generator", UEV);
  public static final BlockEntry<Block> FIELD_GENERATOR_UIV = createComponentCasingBlock("Field_generator", UIV);
  public static final BlockEntry<Block> FIELD_GENERATOR_UXV = createComponentCasingBlock("Field_generator", UXV);
  public static final BlockEntry<Block> FIELD_GENERATOR_OpV = createComponentCasingBlock("Field_generator", OpV);
  public static final BlockEntry<Block> FIELD_GENERATOR_MAX = createComponentCasingBlock("Field_generator", MAX);

  public static final BlockEntry<Block> PISTON_LV = createComponentCasingBlock("Piston", LV);
  public static final BlockEntry<Block> PISTON_MV = createComponentCasingBlock("Piston", MV);
  public static final BlockEntry<Block> PISTON_HV = createComponentCasingBlock("Piston", HV);
  public static final BlockEntry<Block> PISTON_EV = createComponentCasingBlock("Piston", EV);
  public static final BlockEntry<Block> PISTON_IV = createComponentCasingBlock("Piston", IV);
  public static final BlockEntry<Block> PISTON_LuV = createComponentCasingBlock("Piston", LuV);
  public static final BlockEntry<Block> PISTON_ZPM = createComponentCasingBlock("Piston", ZPM);
  public static final BlockEntry<Block> PISTON_UV = createComponentCasingBlock("Piston", UV);
  public static final BlockEntry<Block> PISTON_UHV = createComponentCasingBlock("Piston", UHV);
  public static final BlockEntry<Block> PISTON_UEV = createComponentCasingBlock("Piston", UEV);
  public static final BlockEntry<Block> PISTON_UIV = createComponentCasingBlock("Piston", UIV);
  public static final BlockEntry<Block> PISTON_UXV = createComponentCasingBlock("Piston", UXV);
  public static final BlockEntry<Block> PISTON_OpV = createComponentCasingBlock("Piston", OpV);
  public static final BlockEntry<Block> PISTON_MAX = createComponentCasingBlock("Piston", MAX);

  public static final BlockEntry<Block> PUMP_LV = createComponentCasingBlock("Pump", LV);
  public static final BlockEntry<Block> PUMP_MV = createComponentCasingBlock("Pump", MV);
  public static final BlockEntry<Block> PUMP_HV = createComponentCasingBlock("Pump", HV);
  public static final BlockEntry<Block> PUMP_EV = createComponentCasingBlock("Pump", EV);
  public static final BlockEntry<Block> PUMP_IV = createComponentCasingBlock("Pump", IV);
  public static final BlockEntry<Block> PUMP_LuV = createComponentCasingBlock("Pump", LuV);
  public static final BlockEntry<Block> PUMP_ZPM = createComponentCasingBlock("Pump", ZPM);
  public static final BlockEntry<Block> PUMP_UV = createComponentCasingBlock("Pump", UV);
  public static final BlockEntry<Block> PUMP_UHV = createComponentCasingBlock("Pump", UHV);
  public static final BlockEntry<Block> PUMP_UEV = createComponentCasingBlock("Pump", UEV);
  public static final BlockEntry<Block> PUMP_UIV = createComponentCasingBlock("Pump", UIV);
  public static final BlockEntry<Block> PUMP_UXV = createComponentCasingBlock("Pump", UXV);
  public static final BlockEntry<Block> PUMP_OpV = createComponentCasingBlock("Pump", OpV);
  public static final BlockEntry<Block> PUMP_MAX = createComponentCasingBlock("Pump", MAX);

  public static final BlockEntry<Block> ROBOT_ARM_LV = createComponentCasingBlock("Robot_arm", LV);
  public static final BlockEntry<Block> ROBOT_ARM_MV = createComponentCasingBlock("Robot_arm", MV);
  public static final BlockEntry<Block> ROBOT_ARM_HV = createComponentCasingBlock("Robot_arm", HV);
  public static final BlockEntry<Block> ROBOT_ARM_EV = createComponentCasingBlock("Robot_arm", EV);
  public static final BlockEntry<Block> ROBOT_ARM_IV = createComponentCasingBlock("Robot_arm", IV);
  public static final BlockEntry<Block> ROBOT_ARM_LuV = createComponentCasingBlock("Robot_arm", LuV);
  public static final BlockEntry<Block> ROBOT_ARM_ZPM = createComponentCasingBlock("Robot_arm", ZPM);
  public static final BlockEntry<Block> ROBOT_ARM_UV = createComponentCasingBlock("Robot_arm", UV);
  public static final BlockEntry<Block> ROBOT_ARM_UHV = createComponentCasingBlock("Robot_arm", UHV);
  public static final BlockEntry<Block> ROBOT_ARM_UEV = createComponentCasingBlock("Robot_arm", UEV);
  public static final BlockEntry<Block> ROBOT_ARM_UIV = createComponentCasingBlock("Robot_arm", UIV);
  public static final BlockEntry<Block> ROBOT_ARM_UXV = createComponentCasingBlock("Robot_arm", UXV);
  public static final BlockEntry<Block> ROBOT_ARM_OpV = createComponentCasingBlock("Robot_arm", OpV);
  public static final BlockEntry<Block> ROBOT_ARM_MAX = createComponentCasingBlock("Robot_arm", MAX);

  public static final BlockEntry<Block> SENSOR_LV = createComponentCasingBlock("Sensor", LV);
  public static final BlockEntry<Block> SENSOR_MV = createComponentCasingBlock("Sensor", MV);
  public static final BlockEntry<Block> SENSOR_HV = createComponentCasingBlock("Sensor", HV);
  public static final BlockEntry<Block> SENSOR_EV = createComponentCasingBlock("Sensor", EV);
  public static final BlockEntry<Block> SENSOR_IV = createComponentCasingBlock("Sensor", IV);
  public static final BlockEntry<Block> SENSOR_LuV = createComponentCasingBlock("Sensor", LuV);
  public static final BlockEntry<Block> SENSOR_ZPM = createComponentCasingBlock("Sensor", ZPM);
  public static final BlockEntry<Block> SENSOR_UV = createComponentCasingBlock("Sensor", UV);
  public static final BlockEntry<Block> SENSOR_UHV = createComponentCasingBlock("Sensor", UHV);
  public static final BlockEntry<Block> SENSOR_UEV = createComponentCasingBlock("Sensor", UEV);
  public static final BlockEntry<Block> SENSOR_UIV = createComponentCasingBlock("Sensor", UIV);
  public static final BlockEntry<Block> SENSOR_UXV = createComponentCasingBlock("Sensor", UXV);
  public static final BlockEntry<Block> SENSOR_OpV = createComponentCasingBlock("Sensor", OpV);
  public static final BlockEntry<Block> SENSOR_MAX = createComponentCasingBlock("Sensor", MAX);

  public static final BlockEntry<Block> STERILE_WATER_PLANT_CASING = createCasingBlock("sterile_water_plant_casing", ISGCore.id("block/casings/sterile_water_plant_casing"));
  public static final BlockEntry<Block> HIGH_STRENGTH_CONCRETE = createCasingBlock("high_strength_concrete", ISGCore.id("block/casings/space_elevator_module_base/side"));
  public static final BlockEntry<GlassBlock> CHEMICAL_GRADE_GLASS = createGlassCasingBlock("chemical_grade_glass", ISGCore.id("block/casings/chemical_grade_glass"), () -> RenderType::translucent);
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
  public static final BlockEntry<GlassBlock> ELECTRON_PERMEABLE_NEUTRONIUM_COATED_GLASS = createGlassCasingBlock("electron_permeable_neutronium_coated_glass", ISGCore.id("block/casings/electron_permeable_neutronium_coated_glass"), () -> RenderType::translucent);
  public static final BlockEntry<GlassBlock> OMNI_PURPOSE_INFINITY_FUSED_GLASS = createGlassCasingBlock("omni_purpose_infinity_fused_glass", ISGCore.id("block/casings/omni_purpose_infinity_fused_glass"), () -> RenderType::translucent);
  public static final BlockEntry<Block> DIMENSION_INJECTION_CASING = createCasingBlock("dimension_injection_casing", ISGCore.id("block/casings/dimension_injection_casing"));
  public static final BlockEntry<GlassBlock> NON_PHOTONIC_MATTER_EXCLUSION_GLASS = createGlassCasingBlock("non_photonic_matter_exclusion_glass", ISGCore.id("block/casings/non_photonic_matter_exclusion_glass"), () -> RenderType::translucent);
  public static final BlockEntry<Block> QUARK_PIPE = createCasingBlock("quark_pipe", ISGCore.id("block/casings/quark_pipe"));
  public static final BlockEntry<Block> QUARK_EXCLUSION_CASING = createCasingBlock("quark_exclusion_casing", ISGCore.id("block/casings/quark_exclusion_casing"));


  private static BlockEntry<Block> createComponentCasingBlock(String id, int tier) {
    String tierName = GTValues.VN[tier].toLowerCase(Locale.ROOT);
    String name = id.toLowerCase(Locale.ROOT);
    String model = "%s_%s".formatted(tierName, name);

    var entry = REGISTRATE
        .block(model, Block::new)
        .lang("%s Block (%s)".formatted(id, GTValues.VN[tier]))
        .initialProperties(() -> Blocks.IRON_BLOCK)
        .properties(p -> p.isValidSpawn((state, level, pos, ent) -> false))
        .blockstate(ISGModels.createComponentCasingModel(name, model))
        .addLayer(() -> RenderType::translucent)
        .tag(CustomTags.MINEABLE_WITH_CONFIG_VALID_PICKAXE_WRENCH)
        .item(BlockItem::new)
        .model((ctx, prov) -> prov.withExistingParent(ctx.getName(), prov.modLoc("block/casings/%s/%s".formatted(name, model))))
        .build()
        .register();
    if (!GTCEuAPI.isHighTier() && tier > GTValues.UHV) {
      REGISTRATE.setCreativeTab(entry, null);
    }
    return entry;
  }

  private static BlockEntry<Block> createCasingBlock(String name, ResourceLocation texture) {
    return REGISTRATE.block(name, Block::new)
        .initialProperties(() -> Blocks.IRON_BLOCK)
        .properties(p -> p.isValidSpawn((state, level, pos, ent) -> false))
        .addLayer(() -> RenderType::solid)
        .exBlockstate(GTModels.cubeAllModel(texture))
        .tag(CustomTags.MINEABLE_WITH_CONFIG_VALID_PICKAXE_WRENCH)
        .item(BlockItem::new)
        .build()
        .register();
  }

  private static BlockEntry<GlassBlock> createGlassCasingBlock(String name, ResourceLocation texture,
                                                               Supplier<Supplier<RenderType>> type) {
    return REGISTRATE.block(name, GlassBlock::new)
        .initialProperties(() -> Blocks.GLASS)
        .properties(p -> p.isValidSpawn((state, level, pos, ent) -> false))
        .addLayer(type)
        .exBlockstate(GTModels.cubeAllModel(texture))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .item(BlockItem::new)
        .build()
        .register();
  }

  public static void init() {}
}
