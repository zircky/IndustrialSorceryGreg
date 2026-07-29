package com.zircky.industrialsorcerygreg.common.data;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.cover.CoverDefinition;
import com.gregtechceu.gtceu.client.renderer.cover.ICoverRenderer;
import com.gregtechceu.gtceu.client.renderer.cover.IOCoverRenderer;
import com.gregtechceu.gtceu.client.renderer.cover.SimpleCoverRenderer;
import com.gregtechceu.gtceu.common.cover.ConveyorCover;
import com.gregtechceu.gtceu.common.cover.PumpCover;
import com.gregtechceu.gtceu.common.cover.RobotArmCover;
import com.gregtechceu.gtceu.common.data.GTCovers;
import com.zircky.industrialsorcerygreg.ISGCore;
import com.zircky.industrialsorcerygreg.api.registries.ISGRegistries;
import com.zircky.industrialsorcerygreg.common.cover.WirelessEnergyReceiverCover;


import java.util.Arrays;
import java.util.Locale;
import java.util.function.Supplier;

public class ISGCovers {
  private static final int[] ALL_TIERS = GTValues.tiersBetween(GTValues.LV,
      GTCEuAPI.isHighTier() ? GTValues.OpV : GTValues.UV);

  public static CoverDefinition ELECTRIC_PUMP_MAX = register(
      "pump.max",
      (def, coverable, side) -> new PumpCover(def, coverable, side, GTValues.MAX),
      () -> () -> new IOCoverRenderer(
          GTCEu.id("block/cover/pump"),
          GTCEu.id("block/cover/pump_inverted"),
          null, null
      ));

  public static CoverDefinition CONVEYOR_MODULE_MAX = register(
      "conveyor.max",
      (def, coverable, side) -> new ConveyorCover(def, coverable, side, GTValues.MAX),
      () -> () -> new IOCoverRenderer(
          GTCEu.id("block/cover/conveyor"),
          null,
          GTCEu.id("block/cover/conveyor_emissive"),
          GTCEu.id("block/cover/conveyor_inverted_emissive")));

  public static CoverDefinition ROBOT_ARM_MAX = register(
      "robot_arm.max",
      (def, coverable, side) -> new RobotArmCover(def, coverable, side, GTValues.MAX),
      () -> () -> new IOCoverRenderer(
          GTCEu.id("block/cover/arm"),
          null,
          GTCEu.id("block/cover/arm_emissive"),
          GTCEu.id("block/cover/arm_inverted_emissive"))
      );

  public static CoverDefinition[] WIRELESS_ENERGY_RECEIVE = registerTieredWirelessCover("wireless_energy_receive", 1, ALL_TIERS );
  public static CoverDefinition[] WIRELESS_ENERGY_RECEIVE_4A = registerTieredWirelessCover(
      "4a_wireless_energy_receive", 4, ALL_TIERS);

  ///////////////////////////////////////////////
  // *********** UTIL METHODS ***********//
  ///////////////////////////////////////////////

  public static CoverDefinition register(String id, CoverDefinition.CoverBehaviourProvider behaviorCreator,
                                         Supplier<Supplier<ICoverRenderer>> coverRenderer) {
    var definition = new CoverDefinition(ISGCore.id(id), behaviorCreator, coverRenderer);
    ISGRegistries.COVERS.register(ISGCore.id(id), definition);
    return definition;
  }

  public static CoverDefinition[] registerTieredWirelessCover(String id, int amperage, int... tiers) {
    return Arrays.stream(tiers).mapToObj(tier -> {
      var name = id + "." + GTValues.VN[tier].toLowerCase(Locale.ROOT);
      return register(name, (holder, coverable, side) -> new WirelessEnergyReceiverCover(holder, coverable, side, tier, amperage),
          () -> () -> new SimpleCoverRenderer(ISGCore.id("block/cover/overlay_" + (amperage == 1 ? "" : "4a_") + "wireless_energy_receive")));
    }).toArray(CoverDefinition[]::new);
  }

  public static void init() {
  }

}
