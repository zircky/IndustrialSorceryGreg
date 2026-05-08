package com.zircky.industrialsorcerygreg.common.wireless;

import java.util.HashMap;
import java.util.UUID;

public abstract class GlobalWirelessVariableStorage {
  public static HashMap<UUID, WirelessDataStore> GlobalWirelessDataSticks = new HashMap<>(20, 0.9f);
}
