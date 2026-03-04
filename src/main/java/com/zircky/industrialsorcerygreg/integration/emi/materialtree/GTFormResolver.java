package com.zircky.industrialsorcerygreg.integration.emi.materialtree;

import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.zircky.industrialsorcerygreg.api.data.tag.ISGTagPrefix;
import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.world.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class GTFormResolver {
  public static final TagPrefix[] DEFAULT_FORMS = new TagPrefix[]{
      TagPrefix.ingot,
      TagPrefix.nugget,

      TagPrefix.dustSmall,
      TagPrefix.dust,
      TagPrefix.dustTiny,

      TagPrefix.gem,
      TagPrefix.gemChipped,
      TagPrefix.gemFlawed,
      TagPrefix.gemFlawless,
      TagPrefix.gemExquisite,

      TagPrefix.plate,
      TagPrefix.plateDouble,
      TagPrefix.plateDense,

      TagPrefix.rod,
      TagPrefix.rodLong,

      TagPrefix.bolt,
      TagPrefix.screw,

      TagPrefix.gear,
      TagPrefix.gearSmall,

      TagPrefix.wireFine,
      TagPrefix.wireGtSingle,
      TagPrefix.wireGtDouble,
      TagPrefix.wireGtQuadruple,
      TagPrefix.wireGtOctal,
      TagPrefix.wireGtHex,

      TagPrefix.cableGtSingle,
      TagPrefix.cableGtDouble,
      TagPrefix.cableGtQuadruple,
      TagPrefix.cableGtOctal,
      TagPrefix.cableGtHex,

      TagPrefix.foil,
      TagPrefix.spring,
      TagPrefix.springSmall,
      TagPrefix.ring,
      TagPrefix.round,
      TagPrefix.rotor,

      TagPrefix.block,
      TagPrefix.frameGt,

      TagPrefix.pipeTinyFluid,
      TagPrefix.pipeSmallFluid,
      TagPrefix.pipeNormalFluid,
      TagPrefix.pipeLargeFluid,
      TagPrefix.pipeHugeFluid,
      TagPrefix.pipeQuadrupleFluid,
      TagPrefix.pipeNonupleFluid,

      TagPrefix.pipeSmallItem,
      TagPrefix.pipeNormalItem,
      TagPrefix.pipeLargeItem,
      TagPrefix.pipeHugeItem,

      TagPrefix.pipeSmallRestrictive,
      TagPrefix.pipeNormalRestrictive,
      TagPrefix.pipeLargeRestrictive,
      TagPrefix.pipeHugeRestrictive,

      ISGTagPrefix.CURVED_PLATE,
      ISGTagPrefix.MOTOR_ENCLOSURE,
      ISGTagPrefix.PUMP_BARREL,
      ISGTagPrefix.PISTON_HOUSING,
      ISGTagPrefix.EMITTER_BASES,
      ISGTagPrefix.SENSOR_CASING,
      ISGTagPrefix.FIELD_GENERATOR_CASING
  };

  public List<FormEntry> resolveForms(final Material material) {
    final List<FormEntry> out = new ArrayList<>();

    for (final TagPrefix prefix : DEFAULT_FORMS) {
      final ItemStack stack = ChemicalHelper.get(prefix, material, 1);
      if (stack == null || stack.isEmpty()) continue;
      out.add(new FormEntry(prefix, EmiStack.of(stack)));
    }

    return List.copyOf(out);
  }

  public EmiStack pickKey(final Material material) {
    return firstNonEmpty(material,
        TagPrefix.ingot,
        TagPrefix.gem,
        TagPrefix.dust,
        TagPrefix.plate,
        TagPrefix.rod,
        TagPrefix.wireFine,
        TagPrefix.nugget,
        TagPrefix.block
    );
  }

  private EmiStack firstNonEmpty(final Material material, final TagPrefix... order) {
    for (final TagPrefix prefix : order) {
      final ItemStack stack = ChemicalHelper.get(prefix, material, 1);
      if (stack != null && !stack.isEmpty()) {
        return EmiStack.of(stack);
      }
    }
    return EmiStack.EMPTY;
  }

}
