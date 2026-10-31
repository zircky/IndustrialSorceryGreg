package com.zircky.industrialsorcerygreg.integration.emi.materialtree;

import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;
import com.zircky.industrialsorcerygreg.api.data.tag.ISGTagPrefix;

import java.util.HashMap;
import java.util.Map;

public final class MaterialTreeLayout {
  private static final int MARGIN = 3;
  private static final int SPACING = 20;
  public static final int WIDTH = MARGIN * 2 + SPACING * 12;
  public static final int HEIGHT = MARGIN * 2 + SPACING * 9;
  private static final Map<TagPrefix, SlotPos> POSITIONS = createPositions();

  private MaterialTreeLayout() {}

  private static Map<TagPrefix, SlotPos> createPositions() {
    final Map<TagPrefix, SlotPos> positions = new HashMap<>();
    addGroup(positions, 0, 0, 3,
        TagPrefix.ingot, TagPrefix.ingotHot, TagPrefix.nugget, ISGTagPrefix.tripleIngot, ISGTagPrefix.quadrupleIngot, ISGTagPrefix.quintupleIngot);
    addGroup(positions, 0, 3, 3,
        TagPrefix.dust, TagPrefix.dustSmall, TagPrefix.dustTiny, TagPrefix.gem, TagPrefix.gemChipped, TagPrefix.gemFlawed, TagPrefix.gemFlawless, TagPrefix.gemExquisite);
    addGroup(positions, 0, 6, 4,
        TagPrefix.rod, TagPrefix.rodLong, TagPrefix.bolt, TagPrefix.screw, TagPrefix.spring, TagPrefix.springSmall, TagPrefix.ring, TagPrefix.round);
    addGroup(positions, 4, 0, 3,
        TagPrefix.plate, TagPrefix.plateDouble, TagPrefix.plateDense, ISGTagPrefix.triplePlate, ISGTagPrefix.quadruplePlate, ISGTagPrefix.quintuplePlate, ISGTagPrefix.superdensePlate, TagPrefix.foil, ISGTagPrefix.CURVED_PLATE);
    addGroup(positions, 4, 3, 3,
        TagPrefix.gear, TagPrefix.gearSmall, TagPrefix.rotor, TagPrefix.block, TagPrefix.frameGt);
    addGroup(positions, 4, 5, 3,
        ISGTagPrefix.NANITES, ISGTagPrefix.CONTAMINABLE_NANITES, ISGTagPrefix.singularity, ISGTagPrefix.MOTOR_ENCLOSURE, ISGTagPrefix.PUMP_BARREL, ISGTagPrefix.PISTON_HOUSING, ISGTagPrefix.EMITTER_BASES, ISGTagPrefix.SENSOR_CASING, ISGTagPrefix.FIELD_GENERATOR_CASING);
    addGroup(positions, 0, 8, 8,
        TagPrefix.pipeSmallItem, TagPrefix.pipeNormalItem, TagPrefix.pipeLargeItem, TagPrefix.pipeHugeItem, TagPrefix.pipeSmallRestrictive, TagPrefix.pipeNormalRestrictive, TagPrefix.pipeLargeRestrictive, TagPrefix.pipeHugeRestrictive);
    addGroup(positions, 10, 3, 2,
        TagPrefix.pipeTinyFluid, TagPrefix.pipeSmallFluid, TagPrefix.pipeNormalFluid, TagPrefix.pipeLargeFluid, TagPrefix.pipeHugeFluid, TagPrefix.pipeQuadrupleFluid, TagPrefix.pipeNonupleFluid);
    addGroup(positions, 8, 0, 1,
        TagPrefix.wireFine, TagPrefix.wireGtSingle, TagPrefix.wireGtDouble, TagPrefix.wireGtQuadruple, TagPrefix.wireGtOctal, TagPrefix.wireGtHex);
    addGroup(positions, 9, 1, 1,
        TagPrefix.cableGtSingle, TagPrefix.cableGtDouble, TagPrefix.cableGtQuadruple, TagPrefix.cableGtOctal, TagPrefix.cableGtHex);
    return Map.copyOf(positions);
  }

  private static void addGroup(final Map<TagPrefix, SlotPos> positions, final int column,
      final int row, final int columns, final TagPrefix... prefixes) {
    for (int i = 0; i < prefixes.length; i++) {
      if (positions.put(prefixes[i], cell(column + i % columns, row + i / columns)) != null) {
        throw new IllegalStateException("Duplicate material form: " + prefixes[i]);
      }
    }
  }

  private static SlotPos cell(final int column, final int row) {
    return new SlotPos(MARGIN + column * SPACING, MARGIN + row * SPACING);
  }

  public static SlotPos pos(final TagPrefix prefix) {
    return POSITIONS.getOrDefault(prefix, SlotPos.HIDDEN);
  }

  public static SlotPos pos(final FormEntry entry) {
    if (!entry.isFluid()) return pos(entry.prefix());
    if (entry.fluidKey() == FluidStorageKeys.LIQUID) return cell(10, 0);
    if (entry.fluidKey() == FluidStorageKeys.GAS) return cell(11, 0);
    if (entry.fluidKey() == FluidStorageKeys.PLASMA) return cell(10, 1);
    return SlotPos.HIDDEN;
  }

  public record SlotPos(int x, int y) {
    public static final SlotPos HIDDEN = new SlotPos(-1, -1);

    public boolean hidden() {
      return x < 0;
    }
  }
}
