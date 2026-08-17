package com.zircky.industrialsorcerygreg.common.data.machines;

import com.gregtechceu.gtceu.api.machine.multiblock.PartAbility;

public class ISGPartAbilities extends PartAbility{

  public ISGPartAbilities(String name) {
    super(name);
  }

  public static final PartAbility NEUTRON_ACCELERATOR = new ISGPartAbilities("neutron_accelerator");
  public static final PartAbility CATALYST_HATCH = new ISGPartAbilities("catalyst_hatch");

}
