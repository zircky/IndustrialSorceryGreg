package com.zircky.industrialsorcerygreg.integration.emi.materialtree;

import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKey;
import dev.emi.emi.api.stack.EmiStack;

public record FormEntry(TagPrefix prefix, FluidStorageKey fluidKey, EmiStack stack) {
  public FormEntry(final TagPrefix prefix, final EmiStack stack) {
    this(prefix, null, stack);
  }

  public FormEntry(final FluidStorageKey fluidKey, final EmiStack stack) {
    this(null, fluidKey, stack);
  }

  public boolean isFluid() {
    return fluidKey != null;
  }
}
