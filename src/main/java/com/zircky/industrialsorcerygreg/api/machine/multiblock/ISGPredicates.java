package com.zircky.industrialsorcerygreg.api.machine.multiblock;

import com.gregtechceu.gtceu.api.multiblock.MultiPredicate;
import com.zircky.industrialsorcerygreg.api.ISGValues;
import net.minecraft.network.chat.Component;

import java.util.Comparator;
import java.util.function.Supplier;

import static com.gregtechceu.gtceu.api.multiblock.Predicates.blocks;

public class ISGPredicates {

  public static MultiPredicate motorPredicate() {
    return blocks("Motor",
        ISGValues.MOTOR.entrySet().stream()
            .sorted(Comparator.comparingInt(e -> e.getKey().getTier()))
            .map(entry -> entry.getValue().get()).toList())
        .addTooltips(Component.translatable("isgcore.multiblock.pattern.error.motors"));
  }

  public static MultiPredicate conveyorPredicate() {
    return blocks("Conveyor",
        ISGValues.CONVEYOR.entrySet().stream()
            .sorted(Comparator.comparingInt(e -> e.getKey().getTier()))
            .map(entry -> entry.getValue().get()).toList())
        .addTooltips(Component.translatable("isgcore.multiblock.pattern.error.conveyor"));
  }

  public static MultiPredicate emitterPredicate() {
    return blocks("Emitter",
        ISGValues.EMITTER.entrySet().stream()
            .sorted(Comparator.comparingInt(e -> e.getKey().getTier()))
            .map(entry -> entry.getValue().get()).toList())
        .addTooltips(Component.translatable("isgcore.multiblock.pattern.error.emitter"));
  }

  public static MultiPredicate fieldGeneratorPredicate() {
    return blocks("FieldGenerator",
        ISGValues.FIELD_GENERATOR.entrySet().stream()
            .sorted(Comparator.comparingInt(e -> e.getKey().getTier()))
            .map(entry -> entry.getValue().get()).toList())
        .addTooltips(Component.translatable("isgcore.multiblock.pattern.error.field_generator"));
  }

  public static MultiPredicate pistonPredicate() {
    return blocks("Piston",
        ISGValues.PISTON.entrySet().stream()
            .sorted(Comparator.comparingInt(e -> e.getKey().getTier()))
            .map(entry -> entry.getValue().get()).toList())
        .addTooltips(Component.translatable("isgcore.multiblock.pattern.error.piston"));
  }

  public static MultiPredicate pumpPredicate() {
    return blocks("Pump",
        ISGValues.PUMP.entrySet().stream()
            .sorted(Comparator.comparingInt(e -> e.getKey().getTier()))
            .map(entry -> entry.getValue().get()).toList())
        .addTooltips(Component.translatable("isgcore.multiblock.pattern.error.pump"));
  }

  public static MultiPredicate robotArmPredicate() {
    return blocks("RobotArm",
        ISGValues.ROBOT_ARM.entrySet().stream()
            .sorted(Comparator.comparingInt(e -> e.getKey().getTier()))
            .map(entry -> entry.getValue().get()).toList())
        .addTooltips(Component.translatable("isgcore.multiblock.pattern.error.robot_arm"));
  }

  public static MultiPredicate sensorPredicate() {
    return blocks("Sensor",
        ISGValues.SENSOR.entrySet().stream()
            .sorted(Comparator.comparingInt(e -> e.getKey().getTier()))
            .map(entry -> entry.getValue().get()).toList())
        .addTooltips(Component.translatable("isgcore.multiblock.pattern.error.sensor"));
  }


}
