package com.zircky.industrialsorcerygreg.api.machine;

import com.gregtechceu.gtceu.api.machine.MultiblockMachineDefinition;
import com.gregtechceu.gtceu.api.multiblock.pattern.IBlockPattern;
import com.gregtechceu.gtceu.utils.memoization.GTMemoizer;
import lombok.Getter;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.resources.ResourceLocation;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class ISGMultiblockMachineDefinition extends MultiblockMachineDefinition {
  @Getter
  protected Supplier<IBlockPattern>[] subPatternFactory;

  public ISGMultiblockMachineDefinition(ResourceLocation id) {
    super(id);
  }

  public void setSubPatternFactory(final List<Function<ISGMultiblockMachineDefinition, IBlockPattern>> subPatternFactory) {
    this.subPatternFactory = subPatternFactory.stream().map(p -> GTMemoizer.memoize(() -> p.apply(this))).toArray(Supplier[]::new);
  }
}
