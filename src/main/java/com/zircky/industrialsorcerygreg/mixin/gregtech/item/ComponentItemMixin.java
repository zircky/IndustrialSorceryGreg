package com.zircky.industrialsorcerygreg.mixin.gregtech.item;

import com.gregtechceu.gtceu.api.item.ComponentItem;
import com.gregtechceu.gtceu.api.item.component.IItemComponent;
import com.zircky.industrialsorcerygreg.api.item.component.ICustomRenderer;
import com.zircky.industrialsorcerygreg.client.renderer.item.ItemRendererProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import java.util.List;

@Mixin(value = ComponentItem.class, remap = false)
public abstract class ComponentItemMixin extends Item implements ItemRendererProvider {

  @Shadow
  protected List<IItemComponent> components;

  public ComponentItemMixin(Properties properties) {
    super(properties);
  }

  @Override
  public ICustomRenderer getRenderInfo(ItemStack itemStack) {
    for (IItemComponent component : components) {
      if (component instanceof ICustomRenderer customRenderer) {
        return customRenderer;
      }
    }
    return null;
  }

  // getRenderer(ItemStack) -> IRenderer lives as a default on ItemRendererProvider (shared by
  // this and TagPrefixItemMixin); this mixin only supplies getRenderInfo.
}
