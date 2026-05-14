package com.zircky.industrialsorcerygreg.common.data;

import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.cover.CoverDefinition;
import com.gregtechceu.gtceu.client.renderer.cover.ICoverRenderer;
import com.gregtechceu.gtceu.client.renderer.cover.SimpleCoverRenderer;
import com.zircky.industrialsorcerygreg.IndustrialSorceryGreg;
import com.zircky.industrialsorcerygreg.api.registries.ISGRegistries;
import com.zircky.industrialsorcerygreg.common.cover.WirelessEnergyReceiverCover;


import java.util.Arrays;
import java.util.Locale;
import java.util.function.Supplier;

public class ISGCovers {
  private static final int[] ALL_TIERS = GTValues.tiersBetween(GTValues.LV,
      GTCEuAPI.isHighTier() ? GTValues.OpV : GTValues.UV);

  public static CoverDefinition[] WIRELESS_ENERGY_RECEIVE = registerTieredWirelessCover("wireless_energy_receive", 1, ALL_TIERS );
  public static CoverDefinition[] WIRELESS_ENERGY_RECEIVE_4A = registerTieredWirelessCover(
      "4a_wireless_energy_receive", 4, ALL_TIERS);

  ///////////////////////////////////////////////
  // *********** UTIL METHODS ***********//
  ///////////////////////////////////////////////

  public static CoverDefinition register(String id, CoverDefinition.CoverBehaviourProvider behaviorCreator,
                                         Supplier<Supplier<ICoverRenderer>> coverRenderer) {
    var definition = new CoverDefinition(IndustrialSorceryGreg.id(id), behaviorCreator, coverRenderer);
    ISGRegistries.COVERS.register(IndustrialSorceryGreg.id(id), definition);
    return definition;
  }

  public static CoverDefinition[] registerTieredWirelessCover(String id, int amperage, int... tiers) {
    return Arrays.stream(tiers).mapToObj(tier -> {
      var name = id + "." + GTValues.VN[tier].toLowerCase(Locale.ROOT);
      return register(name, (holder, coverable, side) -> new WirelessEnergyReceiverCover(holder, coverable, side, tier, amperage),
          () -> () -> new SimpleCoverRenderer(IndustrialSorceryGreg.id("block/cover/overlay_" + (amperage == 1 ? "" : "4a_") + "wireless_energy_receive")));
    }).toArray(CoverDefinition[]::new);
  }

  public static void init() {
  }

}
