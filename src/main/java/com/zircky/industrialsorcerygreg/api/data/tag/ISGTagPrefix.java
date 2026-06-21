package com.zircky.industrialsorcerygreg.api.data.tag;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconType;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.item.component.ICustomRenderer;
import com.zircky.industrialsorcerygreg.api.data.material.ISGMaterialFlags;
import org.jetbrains.annotations.Nullable;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.NO_SMASHING;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.Conditions.*;
import static com.zircky.industrialsorcerygreg.api.data.material.ISGMaterialFlags.*;

@SuppressWarnings("unused")
public class ISGTagPrefix extends TagPrefix {

  private ICustomRenderer customRenderer;

  public ISGTagPrefix(String name) {
    super(name);
  }


  public static final TagPrefix crushedLeached = new ISGTagPrefix("leachedOre")
      .idPattern("leached_%s_ore")
      .defaultTagPath("leached_ores/%s")
      .langValue("Leached %s Ore")
      .defaultTagPath("leached_ores")
      .materialIconType(new MaterialIconType("crushedLeached"))
      .unificationEnabled(true)
      .generateItem(true)
      .generationCondition(hasOreProperty);
  public static final TagPrefix prismaFrothed = new ISGTagPrefix("prismaFrothedOre")
      .idPattern("prisma_frothed_%s_ore")
      .defaultTagPath("prisma_frothed_ores/%s")
      .langValue("Prisma Frothed %s Ore")
      .defaultTagPath("prisma_frothed_ores")
      .materialIconType(new MaterialIconType("prismaFrothed"))
      .unificationEnabled(true)
      .generateItem(true)
      .generationCondition(hasOreProperty);

  public static final TagPrefix CURVED_PLATE = new ISGTagPrefix("curved_plate").idPattern("curved_%s_plate").defaultTagPath("curved_plates/%s").unformattedTagPath("curved_plates").langValue("Curved %s Plate").materialAmount(GTValues.M).materialIconType(new MaterialIconType("curved_plate")).unificationEnabled(true).generateItem(true).enableRecycling().generationCondition(mat -> mat.hasFlag(ISGMaterialFlags.GENERATE_CURVED_PLATE) || mat.hasFlag(MaterialFlags.GENERATE_ROTOR) || ((mat.hasProperty(PropertyKey.FLUID_PIPE) || mat.hasProperty(PropertyKey.ITEM_PIPE)) && !mat.hasFlag(NO_SMASHING) && mat.getMass() < 240 && mat.getBlastTemperature() < 3600));
  public static final TagPrefix MOTOR_ENCLOSURE = new ISGTagPrefix("motor_enclosure").idPattern("%s_motor_enclosure").defaultTagPath("motor_enclosures/%s").unformattedTagPath("motor_enclosures").langValue("%s Motor Enclosure").materialAmount(GTValues.M << 1).materialIconType(new MaterialIconType("motor_enclosure")).unificationEnabled(true).generateItem(true).enableRecycling().generationCondition(mat -> mat.hasFlag(ISGMaterialFlags.GENERATE_COMPONENT));
  public static final TagPrefix PUMP_BARREL = new ISGTagPrefix("pump_barrel").idPattern("%s_pump_barrel").defaultTagPath("pump_barrels/%s").unformattedTagPath("pump_barrels").langValue("%s Ppump Barrel").materialAmount(GTValues.M * 5 / 2).materialIconType(new MaterialIconType("pump_barrel")).unificationEnabled(true).generateItem(true).enableRecycling().generationCondition(mat -> mat.hasFlag(ISGMaterialFlags.GENERATE_COMPONENT));
  public static final TagPrefix PISTON_HOUSING = new ISGTagPrefix("piston_housing").idPattern("%s_piston_housing").defaultTagPath("piston_housings/%s").unformattedTagPath("piston_housings").langValue("%s Piston Housing").materialAmount(GTValues.M * 3).materialIconType(new MaterialIconType("piston_housing")).unificationEnabled(true).generateItem(true).enableRecycling().generationCondition(mat -> mat.hasFlag(ISGMaterialFlags.GENERATE_COMPONENT));
  public static final TagPrefix EMITTER_BASES = new ISGTagPrefix("emitter_base").idPattern("%s_emitter_base").defaultTagPath("emitter_bases/%s").unformattedTagPath("emitter_bases").langValue("%s Emitter Base").materialAmount(GTValues.M << 2).materialIconType(new MaterialIconType("emitter_base")).unificationEnabled(true).generateItem(true).enableRecycling().generationCondition(mat -> mat.hasFlag(ISGMaterialFlags.GENERATE_COMPONENT));
  public static final TagPrefix SENSOR_CASING = new ISGTagPrefix("sensor_casing").idPattern("%s_sensor_casing").defaultTagPath("sensor_casings/%s").unformattedTagPath("sensor_casings").langValue("%s Sensor Casings").materialAmount(GTValues.M * 9 / 2).materialIconType(new MaterialIconType("sensor_casing")).unificationEnabled(true).generateItem(true).enableRecycling().generationCondition(mat -> mat.hasFlag(ISGMaterialFlags.GENERATE_COMPONENT));

  public static final TagPrefix FIELD_GENERATOR_CASING = new ISGTagPrefix("field_generator_casing")
      .idPattern("%s_field_generator_casing")
      .defaultTagPath("field_generator_casing/%s")
      .langValue("%s Field Generator Casing")
      .unformattedTagPath("field_generator_casing")
      .materialAmount(GTValues.M << 3)
      .materialIconType(new MaterialIconType("field_generator_casing"))
      .unificationEnabled(true)
      .generateItem(true)
      .enableRecycling()
      .generationCondition(mat -> mat.hasFlag(ISGMaterialFlags.GENERATE_COMPONENT));

  public static final TagPrefix doubleIngot = new ISGTagPrefix("doubleIngot")
      .idPattern("double_%s_ingot")
      .defaultTagPath("double_ingots/%s")
      .unformattedTagPath("double_ingots")
      .langValue("Double %s Ingot")
      .materialAmount(GTValues.M * 2)
      .maxStackSize(32)
      .materialIconType(MaterialIconType.ingotDouble)
      .unificationEnabled(true)
      .enableRecycling()
      .generateItem(true)
      .generationCondition(hasIngotProperty.and(mat -> mat.hasFlag(GENERATE_DOUBLE_INGOT)));

  public static final TagPrefix tripleIngot = new ISGTagPrefix("tripleIngot")
      .idPattern("triple_%s_ingot")
      .defaultTagPath("triple_ingots/%s")
      .unformattedTagPath("triple_ingots")
      .langValue("Triple %s Ingot")
      .materialAmount(GTValues.M * 3)
      .maxStackSize(32)
      .materialIconType(MaterialIconType.ingotTriple)
      .unificationEnabled(true)
      .enableRecycling()
      .generateItem(true)
      .generationCondition(hasIngotProperty.and(mat -> mat.hasFlag(GENERATE_TRIPLE_INGOT)));

  public static final TagPrefix quadrupleIngot = new ISGTagPrefix("quadrupleIngot")
      .idPattern("quadruple_%s_ingot")
      .defaultTagPath("quadruple_ingots/%s")
      .unformattedTagPath("quadruple_ingots")
      .langValue("Quadruple %s Ingot")
      .materialAmount(GTValues.M * 4)
      .maxStackSize(32)
      .materialIconType(MaterialIconType.ingotQuadruple)
      .unificationEnabled(true)
      .enableRecycling()
      .generateItem(true)
      .generationCondition(hasIngotProperty.and(mat -> mat.hasFlag(GENERATE_QUADRUPLE_INGOT)));

  public static final TagPrefix quintupleIngot = new ISGTagPrefix("quintupleIngot")
      .idPattern("quintuple_%s_ingot")
      .defaultTagPath("quintuple_ingots/%s")
      .unformattedTagPath("quintuple_ingots")
      .langValue("Quintuple %s Ingot")
      .materialAmount(GTValues.M * 5)
      .maxStackSize(32)
      .materialIconType(MaterialIconType.ingotQuintuple)
      .unificationEnabled(true)
      .enableRecycling()
      .generateItem(true)
      .generationCondition(hasIngotProperty.and(mat -> mat.hasFlag(GENERATE_QUINTUPLE_INGOT)));

  public static final TagPrefix triplePlate = new ISGTagPrefix("triplePlate")
      .idPattern("triple_%s_plate")
      .defaultTagPath("triple_plates/%s")
      .unformattedTagPath("triple_plates")
      .langValue("Triple %s Plate")
      .materialAmount(GTValues.M * 3)
      .maxStackSize(32)
      .materialIconType(MaterialIconType.plateTriple)
      .unificationEnabled(true)
      .enableRecycling()
      .generateItem(true)
      .generationCondition(hasDustProperty.and(mat -> mat.hasFlag(GENERATE_TRIPLE_PLATE)));

  public static final TagPrefix quadruplePlate = new ISGTagPrefix("quadruplePlate")
      .idPattern("quadruple_%s_plate")
      .defaultTagPath("quadruple_plates/%s")
      .unformattedTagPath("quadruple_plates")
      .langValue("Quadruple %s Plate")
      .materialAmount(GTValues.M * 4)
      .maxStackSize(32)
      .materialIconType(MaterialIconType.plateQuadruple)
      .unificationEnabled(true)
      .enableRecycling()
      .generateItem(true)
      .generationCondition(hasDustProperty.and(mat -> mat.hasFlag(GENERATE_QUADRUPLE_PLATE)));

  public static final TagPrefix quintuplePlate = new ISGTagPrefix("quintuplePlate")
      .idPattern("quintuple_%s_plate")
      .defaultTagPath("quintuple_plates/%s")
      .unformattedTagPath("quintuple_plates")
      .langValue("Quintuple %s Plate")
      .materialAmount(GTValues.M * 5)
      .maxStackSize(32)
      .materialIconType(MaterialIconType.plateQuintuple)
      .unificationEnabled(true)
      .enableRecycling()
      .generateItem(true)
      .generationCondition(hasDustProperty.and(mat -> mat.hasFlag(GENERATE_QUINTUPLE_PLATE)));

  public static final TagPrefix superdensePlate = new ISGTagPrefix("superdensePlate")
      .idPattern("superdense_%s_plate")
      .defaultTagPath("superdense_plates/%s")
      .unformattedTagPath("superdense_plates")
      .langValue("Superdense %s Plate")
      .materialAmount(GTValues.M * 64)
      .maxStackSize(16)
      .materialIconType(new MaterialIconType("plateSuperdense"))
      .unificationEnabled(true)
      .enableRecycling()
      .generateItem(true)
      .generationCondition(hasDustProperty.and(mat -> mat.hasFlag(GENERATE_QUINTUPLE_PLATE)));


  public static void init() {
  }

  @Nullable
  public ICustomRenderer customRenderer() {
    return this.customRenderer;
  }
}
