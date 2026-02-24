package com.zircky.industrialsorcerygreg.mixin.gregtech;

import com.gregtechceu.gtceu.api.GTValues;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value = GTValues.class, remap = false)
public interface GTValuesAccessor {

  @Accessor("VN")
  static String[] industrialsorcerygreg$getVN() { throw new AssertionError(); }

  @Accessor("VN")
  @Mutable
  static void industrialsorcerygreg$setVN(String[] value) { throw new AssertionError(); }

  @Accessor("VNF")
  static String[] industrialsorcerygreg$getVNF() { throw new AssertionError(); }

  @Accessor("VNF")
  @Mutable
  static void industrialsorcerygreg$setVNF(String[] value) { throw new AssertionError(); }
}
