package com.zircky.industrialsorcerygreg.api.machine.multiblock;

import com.gregtechceu.gtceu.api.machine.multiblock.PartAbility;

public class ISGPartAbility extends PartAbility{

  public ISGPartAbility(String name) {
    super(name);
  }

  public static final PartAbility NEUTRON_ACCELERATOR = new ISGPartAbility("neutron_accelerator");
  public static final PartAbility CATALYST_HATCH = new ISGPartAbility("catalyst_hatch");
  public static final PartAbility DUAL_INPUT = new ISGPartAbility("dual_input");
  public static final PartAbility DUAL_OUTPUT = new ISGPartAbility("dual_output");

}
