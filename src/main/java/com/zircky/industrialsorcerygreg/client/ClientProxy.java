package com.zircky.industrialsorcerygreg.client;

import com.zircky.industrialsorcerygreg.client.hud.AdAstraHUD;
import net.minecraftforge.client.event.RegisterGuiOverlaysEvent;
import net.minecraftforge.eventbus.api.IEventBus;

import static com.zircky.industrialsorcerygreg.client.hud.IMoveableHUD.registerHUD;

public class ClientProxy {
  private ClientProxy() {}

  public static void init(IEventBus modBus) {
    modBus.register(ClientProxy.class);

    modBus.addListener(ClientProxy::registerGuiOverlays);
  }

  private static void registerGuiOverlays(RegisterGuiOverlaysEvent event) {
    registerHUD(event, "adastra_hud", AdAstraHUD.isg$INSTANCE);
  }
}
