package com.zircky.industrialsorcerygreg.client;

import com.zircky.industrialsorcerygreg.IndustrialSorceryGreg;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = IndustrialSorceryGreg.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class ClientInit {
  private static KeyMapping OPEN_KEY;
}
