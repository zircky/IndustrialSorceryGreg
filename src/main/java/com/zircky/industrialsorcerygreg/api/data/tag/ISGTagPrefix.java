package com.zircky.industrialsorcerygreg.api.data.tag;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconType;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.MaterialStack;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.zircky.industrialsorcerygreg.api.data.material.ISGMaterialFlags;
import com.zircky.industrialsorcerygreg.api.item.component.ICustomRenderer;
import com.zircky.industrialsorcerygreg.client.renderer.item.HaloItemRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Set;
import java.util.function.*;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.NO_SMASHING;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.Conditions.*;
import static com.zircky.industrialsorcerygreg.api.data.material.ISGMaterialFlags.*;

@SuppressWarnings("unused")
public class ISGTagPrefix extends TagPrefix {
  private ICustomRenderer customRenderer;

  public ISGTagPrefix(String name) {
    super(name);
  }

  public static void init() {
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

  public static final TagPrefix CATALYST = new ISGTagPrefix("catalyst").maxDamage(m -> 10000).tooltip((mat, list) -> {
    list.add(Component.translatable("isgcore.tooltip.item.catalyst.1"));
    list.add(Component.translatable("isgcore.tooltip.item.catalyst.2"));
    list.add(Component.translatable("isgcore.tooltip.item.catalyst.3"));
  }).idPattern("%s_catalyst")
      .defaultTagPath("catalyst/%s")
      .unformattedTagPath("catalyst")
      .materialAmount(GTValues.M)
      .materialIconType(new MaterialIconType("catalyst"))
      .unificationEnabled(true)
      .generateItem(true)
      .generationCondition(mat -> mat.hasFlag(ISGMaterialFlags.GENERATE_CATALYST));

  private static final MaterialIconType NANITES_ICON = new MaterialIconType("nanites");
  public static final TagPrefix NANITES = new ISGTagPrefix("nanites")
      .idPattern("%s_nanites")
      .defaultTagPath("nanites/%s")
      .unformattedTagPath("nanites")
      .materialAmount(GTValues.M)
      .materialIconType(NANITES_ICON)
      .unificationEnabled(true)
      .generateItem(true)
      .generationCondition(mat -> mat.hasFlag(ISGMaterialFlags.GENERATE_NANITES));

  public static final TagPrefix CONTAMINABLE_NANITES = new ISGTagPrefix("contaminable_nanites")
      .idPattern("contaminable_%s_nanites")
      .defaultTagPath("contaminable_nanites/%s")
      .unformattedTagPath("contaminable_nanites")
      .materialAmount(GTValues.M)
      .materialIconType(NANITES_ICON)
      .unificationEnabled(true)
      .generateItem(true)
      .generationCondition(mat -> mat.hasFlag(ISGMaterialFlags.GENERATE_NANITES));

  public static final TagPrefix MILLED = new ISGTagPrefix("milled").idPattern("milled_%s").defaultTagPath("milleds/%s").unformattedTagPath("milleds").materialAmount(GTValues.M).materialIconType(new MaterialIconType("milled")).unificationEnabled(true).generateItem(true).generationCondition(mat -> mat.hasFlag(ISGMaterialFlags.GENERATE_MILLED));

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

  public static final TagPrefix singularity = new ISGTagPrefix("singularity")
      .idPattern("%s_singularity")
      .defaultTagPath("singularities/%s")
      .unformattedTagPath("singularities")
      .langValue("%s Singularity")
      .materialIconType(new MaterialIconType("singularity"))
      .unificationEnabled(true)
      .generateItem(true)
      .generationCondition(mat -> mat.hasFlag(GENERATE_SINGULARITY));

  public static final TagPrefix FUEL = new ISGTagPrefix("fuel")
      .useRenderer(() -> HaloItemRenderer.RADIOACTIVE)
      .idPattern("fuel_%s")
      .defaultTagPath("fuel/%s")
      .unformattedTagPath("fuel")
      .langValue("Fuel %s")
      .materialAmount(GTValues.M * 2)
      .materialIconType(new MaterialIconType("fuel"))
      .unificationEnabled(true)
      .generateItem(true)
      .generationCondition(mat -> mat.hasFlag(GENERATE_FUEL));

  public static final TagPrefix DEPLETED = new ISGTagPrefix("depleted")
      .useRenderer(() -> HaloItemRenderer.RADIOACTIVE)
      .idPattern("depleted_%s")
      .defaultTagPath("depleted/%s")
      .unformattedTagPath("depleted")
      .langValue("Depleted %s")
      .materialAmount(GTValues.M * 2)
      .materialIconType(new MaterialIconType("depleted"))
      .unificationEnabled(true)
      .generateItem(true)
      .generationCondition(mat -> mat.hasFlag(GENERATE_FUEL));


  private ToIntFunction<Material> maxDamageProvider;

  public ToIntFunction<Material> getMaxDamageProvider() {
    return maxDamageProvider;
  }

  /**
     * @return {@code this}.
     */
    public ISGTagPrefix maxDamage(final ToIntFunction<Material> maxDamageProvider) {
      this.maxDamageProvider = maxDamageProvider;
      return this;
    }

  private ISGTagPrefix useRenderer(final ICustomRenderer renderer) {
    this.customRenderer = renderer;
    return this;
  }

  @Nullable
  public ICustomRenderer customRenderer() {
    return this.customRenderer;
  }

}
