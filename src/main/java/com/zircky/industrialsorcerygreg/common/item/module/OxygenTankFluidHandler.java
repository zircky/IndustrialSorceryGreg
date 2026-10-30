package com.zircky.industrialsorcerygreg.common.item.module;

import com.gregtechceu.gtceu.api.item.module.ModuleContext;

import net.minecraftforge.fluids.capability.templates.FluidHandlerItemStack;
import net.minecraftforge.fluids.FluidStack;

import earth.terrarium.adastra.common.items.GasTankItem;
import earth.terrarium.adastra.common.tags.ModFluidTags;
import earth.terrarium.botarium.common.fluid.base.FluidHolder;
import earth.terrarium.botarium.common.fluid.FluidConstants;

public final class OxygenTankFluidHandler extends FluidHandlerItemStack {
  public static final int CAPACITY = 4000;
  private final ModuleContext context;

  public OxygenTankFluidHandler(ModuleContext context) {
    super(context.getAppliedTo(), CAPACITY);
    this.context = context;
  }

  @Override
  public FluidStack getFluid() {
    final var current = currentContext();
    if (current == null) return FluidStack.EMPTY;
    final var tank = current.getData().getModuleItem();
    final var fluid = ((GasTankItem) tank.getItem()).getFluidContainer(tank).getFirstFluid();
    if (fluid.isEmpty()) return FluidStack.EMPTY;
    return new FluidStack(fluid.getFluid(), (int) FluidConstants.toMillibuckets(fluid.getFluidAmount()), fluid.getCompound());
  }

  @Override
  protected void setFluid(FluidStack fluid) {
    final var current = currentContext();
    if (current == null) return;
    final var tank = current.getData().getModuleItem().copy();
    final var container = ((GasTankItem) tank.getItem()).getFluidContainer(tank);
    container.setFluid(0, fluid.isEmpty() ? FluidHolder.empty() :
        FluidHolder.ofMillibuckets(fluid.getFluid(), fluid.getAmount(), fluid.getTag()));
    current.setData(current.getData().withModuleItem(tank));
  }

  private ModuleContext currentContext() {
    final var current = context.getModularItemStack().getModuleContextForSlot(context.getData().getSlot());
    return current != null && current.getModule() == context.getModule() ? current : null;
  }

  @Override
  public boolean isFluidValid(int tank, FluidStack fluid) {
    return fluid.getFluid().is(ModFluidTags.OXYGEN);
  }

  @Override
  public boolean canFillFluidType(FluidStack fluid) {
    return currentContext() != null && isFluidValid(0, fluid);
  }

  @Override
  public boolean canDrainFluidType(FluidStack fluid) {
    return isFluidValid(0, fluid);
  }

  public int getOxygenAmount() {
    final var fluid = getFluid();
    return isFluidValid(0, fluid) ? fluid.getAmount() : 0;
  }

  @Override
  protected void setContainerToEmpty() {
    setFluid(FluidStack.EMPTY);
  }
}
