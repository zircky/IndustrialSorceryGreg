package com.zircky.industrialsorcerygreg.mixin.adastra;

import com.zircky.industrialsorcerygreg.common.item.armor.SpaceArmorComponentItem;
import earth.terrarium.adastra.common.items.armor.SpaceSuitItem;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Debug(export = true)
@Mixin(value = SpaceSuitItem.class, remap = false)
public class AdAstraSpaceSuitItemMixin {
  /**
   * @author
   * @reason
   */
  @Overwrite
  public static long getOxygenAmount(Entity entity) {
    if (!(entity instanceof LivingEntity livingEntity)) return 0;
    var stack = livingEntity.getItemBySlot(EquipmentSlot.CHEST);
    if (stack.getItem() instanceof SpaceSuitItem suit) {
      return suit.getFluidContainer(stack).getFirstFluid().getFluidAmount();
    } else if (stack.getItem() instanceof SpaceArmorComponentItem suit) {
      return suit.getFluidContainer(stack).getFirstFluid().getFluidAmount();
    } else return 0;
  }
}
