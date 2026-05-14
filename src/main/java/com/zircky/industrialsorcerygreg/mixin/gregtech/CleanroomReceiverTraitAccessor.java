package com.zircky.industrialsorcerygreg.mixin.gregtech;

import com.gregtechceu.gtceu.common.machine.trait.CleanroomProviderTrait;
import com.gregtechceu.gtceu.common.machine.trait.CleanroomReceiverTrait;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value = CleanroomReceiverTrait.class, remap = false)
public interface CleanroomReceiverTraitAccessor {
  @Accessor("cleanroomProvider")
  @Nullable
  CleanroomProviderTrait industrialsorcerygreg$getCleanroomProvider();
}
