package com.zircky.industrialsorcerygreg.api.data.tag;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconType;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.zircky.industrialsorcerygreg.api.data.material.ISGMaterialFlags;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.NO_SMASHING;


public class ISGTagPrefix {
  public static final TagPrefix CURVED_PLATE = new TagPrefix("curved_plate").idPattern("curved_%s_plate").defaultTagPath("curved_plates/%s").unformattedTagPath("curved_plates").langValue("Curved %s Plate").materialAmount(GTValues.M).materialIconType(new MaterialIconType("curved_plate")).unificationEnabled(true).generateItem(true).enableRecycling().generationCondition(mat -> mat.hasFlag(ISGMaterialFlags.GENERATE_CURVED_PLATE) || mat.hasFlag(MaterialFlags.GENERATE_ROTOR) || ((mat.hasProperty(PropertyKey.FLUID_PIPE) || mat.hasProperty(PropertyKey.ITEM_PIPE)) && !mat.hasFlag(NO_SMASHING) && mat.getMass() < 240 && mat.getBlastTemperature() < 3600));
  public static final TagPrefix MOTOR_ENCLOSURE = new TagPrefix("motor_enclosure").idPattern("%s_motor_enclosure").defaultTagPath("motor_enclosures/%s").unformattedTagPath("motor_enclosures").langValue("").materialAmount(GTValues.M << 1).materialIconType(new MaterialIconType("motor_enclosure")).unificationEnabled(true).generateItem(true).enableRecycling().generationCondition(mat -> mat.hasFlag(ISGMaterialFlags.GENERATE_COMPONENT));
  public static final TagPrefix PUMP_BARREL = new TagPrefix("pump_barrel").idPattern("%s_pump_barrel").defaultTagPath("pump_barrels/%s").unformattedTagPath("pump_barrels").langValue("%s Ppump Barrel").materialAmount(GTValues.M * 5 / 2).materialIconType(new MaterialIconType("pump_barrel")).unificationEnabled(true).generateItem(true).enableRecycling().generationCondition(mat -> mat.hasFlag(ISGMaterialFlags.GENERATE_COMPONENT));
  public static final TagPrefix PISTON_HOUSING = new TagPrefix("piston_housing").idPattern("%s_piston_housing").defaultTagPath("piston_housings/%s").unformattedTagPath("piston_housings").langValue("%s Piston Housing").materialAmount(GTValues.M * 3).materialIconType(new MaterialIconType("piston_housing")).unificationEnabled(true).generateItem(true).enableRecycling().generationCondition(mat -> mat.hasFlag(ISGMaterialFlags.GENERATE_COMPONENT));
  public static final TagPrefix EMITTER_BASES = new TagPrefix("emitter_base").idPattern("%s_emitter_base").defaultTagPath("emitter_bases/%s").unformattedTagPath("emitter_bases").langValue("%s Emitter Base").materialAmount(GTValues.M << 2).materialIconType(new MaterialIconType("emitter_base")).unificationEnabled(true).generateItem(true).enableRecycling().generationCondition(mat -> mat.hasFlag(ISGMaterialFlags.GENERATE_COMPONENT));
  public static final TagPrefix SENSOR_CASING = new TagPrefix("sensor_casing").idPattern("%s_sensor_casing").defaultTagPath("sensor_casings/%s").unformattedTagPath("sensor_casings").langValue("%s Sensor Casings").materialAmount(GTValues.M * 9 / 2).materialIconType(new MaterialIconType("sensor_casing")).unificationEnabled(true).generateItem(true).enableRecycling().generationCondition(mat -> mat.hasFlag(ISGMaterialFlags.GENERATE_COMPONENT));
  public static final TagPrefix FIELD_GENERATOR_CASING = new TagPrefix("field_generator_casing").idPattern("%s_field_generator_casing").defaultTagPath("field_generator_casing/%s").langValue("%s Field Generator Casing").unformattedTagPath("field_generator_casing").materialAmount(GTValues.M << 3).materialIconType(new MaterialIconType("field_generator_casing")).unificationEnabled(true).generateItem(true).enableRecycling().generationCondition(mat -> mat.hasFlag(ISGMaterialFlags.GENERATE_COMPONENT));

  public static void init() {
  }
}
