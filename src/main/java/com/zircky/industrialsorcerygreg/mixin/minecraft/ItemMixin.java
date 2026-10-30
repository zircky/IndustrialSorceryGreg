package com.zircky.industrialsorcerygreg.mixin.minecraft;

import com.zircky.industrialsorcerygreg.api.item.IItem;
import com.zircky.industrialsorcerygreg.utils.RLUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(value = Item.class, priority = 0)
public class ItemMixin implements IItem {

  @Unique
  private ResourceLocation isgcore$id;

  @Override
  public @NotNull ResourceLocation isgcore$getIdLocation() {
    if (isgcore$id == null) {
      isgcore$id = ForgeRegistries.ITEMS.getKey((Item) (Object) this);
      if (isgcore$id == null) isgcore$id = RLUtils.mc("air");
    }
    return isgcore$id;
  }
}
