package com.zircky.industrialsorcerygreg.integration.emi;


import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import it.unimi.dsi.fastutil.ints.IntImmutableList;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

import static com.zircky.industrialsorcerygreg.integration.emi.GTFormResolver.DEFAULT_FORMS;

public final class MaterialTreeLayout {
  public static final IntImmutableList ITEM_LOCATIONS = IntImmutableList.of(
      // base column (0)
      3, 3,    // ingot
      3, 21,   // nugget
      3, 47,   // dustSmall
      3, 65,   // dust
      3, 83,   // dustTiny


      // gems column (1)
      23, 47,  // gem
      23, 65,  // gemChipped
      23, 83,  // gemFlawed
      23, 101, // gemFlawless
      23, 119, // gemExquisite

      // plates column (2)
      46, 47,  // plate
      46, 65,  // plateDouble
      46, 83,  // plateDense

      // rods column (3)
      66, 47,  // rod
      66, 65,  // rodLong

      // fasteners column (4)
      86, 47,  // bolt
      86, 65,  // screw

      // gears column (5)
      106, 47, // gear
      106, 65, // gearSmall

      // wire column (6)
      126, 3,  // wireFine
      126, 21, // wireGtSingle
      126, 39, // wireGtDouble
      126, 57, // wireGtQuadruple
      126, 75, // wireGtOctal
      126, 93, // wireGtHex

      // cable column (7)
      146, 21, // cableGtSingle
      146, 39, // cableGtDouble
      146, 57, // cableGtQuadruple
      146, 75, // cableGtOctal
      146, 93, // cableGtHex

      // misc column (2/3 lower)
      46, 101, // foil
      66, 101, // spring
      66, 119, // springSmall
      86, 101, // ring
      86, 119, // round
      106, 101,// rotor

      // blocks/frames column (0/1 top)
      23, 3,   // block
      46, 3,   // frameGt

      // fluid pipes area (bottom right)
      3, 128,  // pipeTinyFluid
      23, 128, // pipeSmallFluid
      43, 128, // pipeNormalFluid
      63, 128, // pipeLargeFluid
      83, 138, // pipeHugeFluid
      103, 138,// pipeQuadrupleFluid
      123, 138,// pipeNonupleFluid

      // item pipes row
      3, 128,  // pipeSmallItem
      23, 128, // pipeNormalItem
      43, 128, // pipeLargeItem
      63, 128, // pipeHugeItem

      // restrictive pipes row
      3, 146,  // pipeSmallRestrictive
      23, 146, // pipeNormalRestrictive
      43, 146, // pipeLargeRestrictive
      63, 146  // pipeHugeRestrictive
  );

  static {
    if (ITEM_LOCATIONS.size() != DEFAULT_FORMS.length * 2) {
      throw new IllegalStateException("MaterialTreeLayout mismatch: locations=" + ITEM_LOCATIONS.size()
          + " order=" + DEFAULT_FORMS.length);
    }
  }

  public static SlotPos pos(final TagPrefix prefix) {
    final int idx = indexOf(prefix);
    if (idx < 0) return SlotPos.HIDDEN;

    final int base = idx * 2;
    return new SlotPos(ITEM_LOCATIONS.getInt(base), ITEM_LOCATIONS.getInt(base + 1));
  }

  private static int indexOf(final TagPrefix prefix) {
    for (int i = 0; i < DEFAULT_FORMS.length; i++) {
      if (DEFAULT_FORMS[i] == prefix) {
        return i;
      }
    }
    return -1;
  }

  public record SlotPos(int x, int y) {
    public static final SlotPos HIDDEN = new SlotPos(-9999, -9999);

    public boolean hidden() {
      return x < 0;
    }
  }

}
