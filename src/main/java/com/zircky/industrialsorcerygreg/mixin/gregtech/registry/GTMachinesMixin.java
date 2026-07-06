package com.zircky.industrialsorcerygreg.mixin.gregtech.registry;

import com.gregtechceu.gtceu.api.registry.GTRegistries;
import com.gregtechceu.gtceu.common.data.GTMachines;
import com.zircky.industrialsorcerygreg.common.block.BlockMap;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(GTMachines.class)
public class GTMachinesMixin {
  /**
   * @author
   * @reason
   */
  @Overwrite(remap = false)
  public static void init() {
    BlockMap.init();



    GTRegistries.MACHINES.freeze();
  }
}
