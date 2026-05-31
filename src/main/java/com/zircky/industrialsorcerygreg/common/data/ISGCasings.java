package com.zircky.industrialsorcerygreg.common.data;

import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.data.recipe.CustomTags;
import com.tterrag.registrate.util.entry.BlockEntry;
import com.zircky.industrialsorcerygreg.common.data.models.ISGModels;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.Locale;

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
        .model((ctx, prov) -> prov.withExistingParent(ctx.getName(), prov.modLoc("block/casing/%s/%s".formatted(name, model))))
        .build()
        .register();
    if (!GTCEuAPI.isHighTier() && tier > GTValues.UHV) {
      REGISTRATE.setCreativeTab(entry, null);
    }
    return entry;
  }

  public static void init() {}
}
