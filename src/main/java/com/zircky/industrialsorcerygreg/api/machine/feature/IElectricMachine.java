package com.zircky.industrialsorcerygreg.api.machine.feature;

import com.gregtechceu.gtceu.api.machine.feature.IMachineLife;

public interface IElectricMachine extends IMachineLife {
  default int getTier() {
    throw new UnsatisfiedLinkError("Not Impl");
  }

}
