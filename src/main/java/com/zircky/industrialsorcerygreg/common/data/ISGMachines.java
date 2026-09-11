package com.zircky.industrialsorcerygreg.common.data;

import com.zircky.industrialsorcerygreg.api.registries.ISGRegistries;
import com.zircky.industrialsorcerygreg.common.data.machines.ISGAEMachines;
import com.zircky.industrialsorcerygreg.common.data.machines.ISGMultiMachines;
import com.zircky.industrialsorcerygreg.common.data.machines.ISGSimpleMachines;
import com.zircky.industrialsorcerygreg.common.data.machines.WaterPurificationUnit;

public class ISGMachines {

  static {
    ISGRegistries.REGISTRATE.creativeModeTab(() -> ISGCreativeModeTabs.ISG_MACHINE);
  }

  public static void init() {
    ISGAEMachines.init();
    ISGMultiMachines.init();
    ISGSimpleMachines.init();
    WaterPurificationUnit.init();
  }
}
