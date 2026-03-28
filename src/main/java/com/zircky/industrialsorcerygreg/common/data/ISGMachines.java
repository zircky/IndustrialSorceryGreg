package com.zircky.industrialsorcerygreg.common.data;

import com.zircky.industrialsorcerygreg.api.registries.ISGRegistries;
import com.zircky.industrialsorcerygreg.common.data.machines.ISGMultiMachines;
import com.zircky.industrialsorcerygreg.common.data.machines.ISGSimpleMachines;

public class ISGMachines {

  static {
    ISGRegistries.REGISTRATE.creativeModeTab(() -> ISGCreativeModeTabs.ISG_MACHINE);
  }

  public static void init() {
    ISGMultiMachines.init();
    ISGSimpleMachines.init();
  }
}
