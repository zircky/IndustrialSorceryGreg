package com.zircky.industrialsorcerygreg.integration.emi.materialtree;

import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.FluidProperty;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKey;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;
import com.zircky.industrialsorcerygreg.api.data.tag.ISGTagPrefix;
import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.material.Fluid;

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

    addFluid(out, material, FluidStorageKeys.LIQUID);
    addFluid(out, material, FluidStorageKeys.GAS);
    addFluid(out, material, FluidStorageKeys.PLASMA);

    for (final TagPrefix prefix : DEFAULT_FORMS) {
      final ItemStack stack = ChemicalHelper.get(prefix, material, 1);
      if (stack == null || stack.isEmpty()) continue;
      out.add(new FormEntry(prefix, EmiStack.of(stack)));
    }

    return List.copyOf(out);
  }

  public EmiStack pickKey(final Material material) {
    final EmiStack itemKey = firstNonEmpty(material,
        TagPrefix.ingot,
        TagPrefix.gem,
        TagPrefix.dust,
        TagPrefix.plate,
        TagPrefix.rod,
        TagPrefix.wireFine,
        TagPrefix.nugget,
        TagPrefix.block
    );
    if (!itemKey.isEmpty()) return itemKey;

    return firstFluid(material,
        FluidStorageKeys.LIQUID,
        FluidStorageKeys.GAS,
        FluidStorageKeys.PLASMA
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

  private EmiStack firstFluid(final Material material, final FluidStorageKey... order) {
    for (final FluidStorageKey key : order) {
      final EmiStack stack = fluidStack(material, key);
      if (!stack.isEmpty()) return stack;
    }
    return EmiStack.EMPTY;
  }

  private void addFluid(final List<FormEntry> out, final Material material, final FluidStorageKey key) {
    final EmiStack stack = fluidStack(material, key);
    if (!stack.isEmpty()) {
      out.add(new FormEntry(key, stack));
    }
  }

  private EmiStack fluidStack(final Material material, final FluidStorageKey key) {
    final FluidProperty property = material.getProperty(PropertyKey.FLUID);
    if (property == null) return EmiStack.EMPTY;

    final Fluid fluid = property.get(key);
    if (fluid == null) return EmiStack.EMPTY;

    return EmiStack.of(fluid, 1000);
  }

}
