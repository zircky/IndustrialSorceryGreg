package com.zircky.industrialsorcerygreg.mixin.nuclearcraft;

import com.gregtechceu.gtceu.api.capability.GTCapability;
import igentuman.api.nc.SideModeToggleable;
import igentuman.nc.block.entity.NuclearCraftBE;
import igentuman.nc.compat.gregtech.GTUtils;
import igentuman.nc.handler.config.CommonConfig;
import igentuman.nc.handler.sided.SidedContentHandler;
import igentuman.nc.util.ModUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Unique;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import static igentuman.nc.block.entity.NuclearCraftBE.isGTEUCapEnabled;


@Mixin(value = NuclearCraftBE.class, remap = false)
public abstract class NuclearCraftBEMixin extends BlockEntity {

  protected NuclearCraftBEMixin(BlockEntityType<?> type, BlockPos pos, BlockState state) {
    super(type, pos, state);
  }

  /**
   * @author
   * @reason
   */
  @Overwrite(remap = false)
  @Nonnull
  public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
    NuclearCraftBE self = (NuclearCraftBE) (Object) this;

    if (ModUtil.isGtLoaded() && cap == GTCapability.CAPABILITY_ENERGY_CONTAINER && self.energyStorage() != null) {
      if (!isGTEUCapEnabled()) {
        return LazyOptional.empty();
      }

      if (side != null && self.sideConfig.get(side.ordinal()) != SideModeToggleable.SideMode.DISABLED) {
        return GTUtils.getGTEnergy(self, side).cast();
      }
    }

    if (cap == ForgeCapabilities.ENERGY && self.energyStorage() != null) {
      return CommonConfig.GTCEU_CONFIG.COMPATIBILITY.get() != CommonConfig.GTCEUCompatibilityConfig.GTCEUCompatibility.ONLY_GTCEU
          ? self.getEnergy().cast()
          : LazyOptional.empty();
    }
    if (self.contentHandler() != null) {
      final Object handler = self.contentHandler();

      return industrialsorcerygreg$getContentCapability(handler, cap, side);
    }

    return super.getCapability(cap, side);
  }

  @Unique
  @SuppressWarnings("unchecked")
  private <T> LazyOptional<T> industrialsorcerygreg$getContentCapability(
      final Object handler,
      final Capability<T> cap,
      @Nullable final Direction side
  ) {
    final var contentHandler = (SidedContentHandler) handler;

    if (cap == ForgeCapabilities.ITEM_HANDLER) {
      return contentHandler.getItemCapability(side);
    }

    if (cap == ForgeCapabilities.FLUID_HANDLER) {
      return contentHandler.getFluidCapability(side);
    }

    return super.getCapability(cap, side);
  }
}
