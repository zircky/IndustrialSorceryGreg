package com.zircky.industrialsorcerygreg.api;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.block.IFilterType;
import com.zircky.industrialsorcerygreg.api.machine.multiblock.component.casing.*;
import net.minecraft.world.level.block.Block;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ISGValues extends GTValues {




  public static final String MODID_AD_ASTRA = "ad_astra";
  public static final String MODID_NUCLERCRAFT = "nuclearcraft";

  public static final String COMPONENT_ASSEMBLY_CASING_TIER = "c_a";

  public static final int SECONDS = Math.toIntExact(GTValues.SECONDS);
  public static final int MINUTES = Math.toIntExact(GTValues.MINUTES);
  public static final int HOURS = Math.toIntExact(GTValues.HOURS);
  public static final int DAYS = Math.toIntExact(GTValues.DAYS);
  public static final int WEEKS = Math.toIntExact(GTValues.WEEKS);
  public static final int MONTHS = Math.toIntExact(GTValues.MONTHS);
  public static final int YEARS = Math.toIntExact(GTValues.YEARS);

  // API
  public static final Map<IConveyorData, Supplier<Block>> CONVEYOR = new HashMap<>();
  public static final Map<IEmitterData, Supplier<Block>> EMITTER = new HashMap<>();
  public static final Map<IFieldGenData, Supplier<Block>> FIELD_GENERATOR = new HashMap<>();
  public static final Map<IMotorData, Supplier<Block>> MOTOR = new HashMap<>();
  public static final Map<IPistonData, Supplier<Block>> PISTON = new HashMap<>();
  public static final Map<IPumpData, Supplier<Block>> PUMP = new HashMap<>();
  public static final Map<IRobotArmData, Supplier<Block>> ROBOT_ARM = new HashMap<>();
  public static final Map<ISensorData, Supplier<Block>> SENSOR = new HashMap<>();



}
