package com.zircky.industrialsorcerygreg.mixin.gregtech.chemical;

import com.google.common.collect.ImmutableList;
import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.MaterialProperties;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.MaterialStack;
import com.zircky.industrialsorcerygreg.api.data.chemical.material.IISGMaterial;
import com.zircky.industrialsorcerygreg.client.renderer.item.MaterialsColorMap;
import net.minecraft.world.item.Rarity;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.function.IntSupplier;

@Mixin(Material.class)
public abstract class MaterialMixin implements IISGMaterial {
  @Shadow(remap = false)
  @Final
  private @NotNull MaterialProperties properties;

  @Shadow(remap = false)
  public abstract ImmutableList<MaterialStack> getMaterialComponents();

  @Unique
  private long iSGCore$mass;

  @Unique
  private int iSGCore$temp;

  @Unique
  private Rarity isgcore$rarity;

  @Unique
  private boolean isgcore$glow;

  @Override
  public Rarity isgcore$rarity() {
    return isgcore$rarity;
  }

  @Override
  public void isgcore$setRarity(Rarity rarity) {
    this.isgcore$rarity = rarity;
  }

  @Override
  public boolean isgcore$glow() {
    return isgcore$glow;
  }

  @Override
  public void isgcore$setGlow() {
    this.isgcore$glow = true;
  }

  @Override
  public MaterialProperties isgcore$getProperties() {
    return properties;
  }

  @Override
  public int isgcore$temp() {
    return iSGCore$temp;
  }

  @Override
  public void isgcore$setTemp(int temp) {
    iSGCore$temp = temp;
  }

  @Inject(method = { "getMaterialRGB()I", "getMaterialSecondaryRGB" }, at = @At("HEAD"), remap = false, cancellable = true)
  private void getMaterialRGB(CallbackInfoReturnable<Integer> cir) {
    if (GTCEu.isClientSide()) {
      IntSupplier supplier = MaterialsColorMap.MaterialColors.get(this);
      if (supplier == null) return;
      cir.setReturnValue(supplier.getAsInt() & 0xFFFFFF);
    }
  }

  @Inject(method = { "getMaterialARGB(I)I", "getMaterialSecondaryARGB" }, at = @At("HEAD"), remap = false, cancellable = true)
  private void getMaterialARGB(CallbackInfoReturnable<Integer> cir) {
    if (GTCEu.isClientSide()) {
      IntSupplier supplier = MaterialsColorMap.MaterialColors.get(this);
      if (supplier == null) return;
      if ((supplier.getAsInt() & 0xFF000000) == 0) {
        cir.setReturnValue(supplier.getAsInt() | 0xFF000000);
      } else {
        cir.setReturnValue(supplier.getAsInt());
      }
    }
  }
}
