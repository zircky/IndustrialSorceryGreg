package com.zircky.industrialsorcerygreg.integration.emi.materialtree;


import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import it.unimi.dsi.fastutil.ints.IntImmutableList;


import static com.zircky.industrialsorcerygreg.integration.emi.materialtree.GTFormResolver.DEFAULT_FORMS;

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
      43, 47,  // plate
      43, 65,  // plateDouble
      43, 83,  // plateDense

      // rods column (3)
      63, 47,  // rod
      63, 65,  // rodLong

      // fasteners column (4)
      83, 47,  // bolt
      83, 65,  // screw

      // gears column (5)
      103, 47, // gear
      103, 65, // gearSmall

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
      43, 101, // foil
      63, 101, // spring
      63, 119, // springSmall
      83, 101, // ring
      83, 119, // round
      103, 101,// rotor

      // blocks/frames column (0/1 top)
      23, 3,   // block
      43, 3,   // frameGt

      // fluid pipes area (bottom right)
      3, 140,  // pipeTinyFluid
      23, 140, // pipeSmallFluid
      43, 140, // pipeNormalFluid
      63, 140, // pipeLargeFluid
      3, 158, // pipeHugeFluid
      23, 158,// pipeQuadrupleFluid
      43, 158,// pipeNonupleFluid

      // item pipes row
      3, 140,  // pipeSmallItem
      23, 140, // pipeNormalItem
      43, 140, // pipeLargeItem
      63, 140, // pipeHugeItem

      // restrictive pipes row
      3, 158,  // pipeSmallRestrictive
      23, 158, // pipeNormalRestrictive
      43, 158, // pipeLargeRestrictive
      63, 158,  // pipeHugeRestrictive

      103, 140, // curvedPlate
      123, 140, // motorEnclosure
      143, 140, // pumpBarrel
      163, 140, // pistonHousing
      103, 158, // emitterBase
      123, 158, // sensorCasing
      143, 158 // fieldGeneratorCasing
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
