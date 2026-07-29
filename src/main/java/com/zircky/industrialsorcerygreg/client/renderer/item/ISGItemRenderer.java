package com.zircky.industrialsorcerygreg.client.renderer.item;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public interface ISGItemRenderer {
  @OnlyIn(Dist.CLIENT)
  void renderItem(ItemStack stack, ItemDisplayContext transformType, boolean leftHand, PoseStack poseStack,
                  MultiBufferSource buffer, int combinedLight, int combinedOverlay, BakedModel model);
}
