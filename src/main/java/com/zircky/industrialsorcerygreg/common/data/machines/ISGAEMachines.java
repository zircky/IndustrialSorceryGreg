package com.zircky.industrialsorcerygreg.common.data.machines;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.data.RotationState;
import com.gregtechceu.gtceu.api.machine.MachineDefinition;
import com.gregtechceu.gtceu.api.machine.multiblock.PartAbility;
import com.zircky.industrialsorcerygreg.ISGCore;
import com.zircky.industrialsorcerygreg.api.machine.multiblock.ISGPartAbility;
import com.zircky.industrialsorcerygreg.integration.ae2.machine.MEExtendedPatternBufferPartMachine;
import com.zircky.industrialsorcerygreg.integration.ae2.machine.MEUltraPatternBufferPartMachine;
import com.zircky.industrialsorcerygreg.integration.ae2.machine.MEWildcardPatternBufferPartMachine;
import net.minecraft.network.chat.Component;

import static com.gregtechceu.gtceu.api.GTValues.UHV;
import static com.gregtechceu.gtceu.api.GTValues.UV;
import static com.zircky.industrialsorcerygreg.utils.register.MachineRegisterUtils.machine;

public class ISGAEMachines {
  public static void init() {}

  public static final MachineDefinition ME_WILDCARD_PATTERN_BUFFER = machine("me_wildcard_pattern_buffer", MEWildcardPatternBufferPartMachine::new)
      .langValue("ME Wildcard Pattern Buffer")
      .tooltips(Component.translatable("isgcore.machine.me_wildcard_pattern_buffer.desc.1"),
          Component.translatable("isgcore.machine.me_wildcard_pattern_buffer.desc.2"),
          Component.translatable("isgcore.machine.me_wildcard_pattern_buffer.desc.3"),
          Component.translatable("isgcore.machine.me_wildcard_pattern_buffer.desc.4"),
          Component.translatable("isgcore.machine.me_wildcard_pattern_buffer.desc.5"),
          Component.translatable("isgcore.machine.me_wildcard_pattern_buffer.desc.6"),
          Component.translatable("isgcore.machine.me_wildcard_pattern_buffer.desc.7"),
          Component.translatable("isgcore.machine.me_wildcard_pattern_buffer.desc.8")
          )
      .tier(UHV)
      .rotationState(RotationState.ALL)
      .abilities(PartAbility.IMPORT_ITEMS, PartAbility.IMPORT_FLUIDS, ISGPartAbility.DUAL_INPUT)
      .overlayTieredHullModel(ISGCore.id("block/machine/part/me_pattern_buffer_red"))
      .register();

  public static final MachineDefinition ME_EXTEND_PATTERN_BUFFER = machine("me_extend_pattern_buffer", MEExtendedPatternBufferPartMachine::new)
      .langValue("ME Extend Pattern Buffer")
      .tier(UV)
      .tooltips(
          Component.translatable("block.gtceu.pattern_buffer.desc.0"),
          Component.translatable("block.gtceu.pattern_buffer.desc.1"),
          Component.translatable("block.gtceu.pattern_buffer.desc.2"),
          Component.translatable("gtceu.part_sharing.enabled"))
      .rotationState(RotationState.ALL)
      .abilities(PartAbility.IMPORT_ITEMS, PartAbility.IMPORT_FLUIDS, ISGPartAbility.DUAL_INPUT)
      .colorOverlayTieredHullModel(GTCEu.id("block/overlay/appeng/me_buffer_hatch"))
      .register();

  public static final MachineDefinition ME_EXTEND_PATTERN_BUFFER_ULTRA = machine("me_extend_pattern_buffer_ultra", MEUltraPatternBufferPartMachine::new)
      .langValue("ME Extend Pattern Buffer Ultra")
      .tooltips(
          Component.translatable("block.gtceu.pattern_buffer.desc.0"),
          Component.translatable("block.gtceu.pattern_buffer.desc.1"),
          Component.translatable("block.gtceu.pattern_buffer.desc.2"),
          Component.translatable("gtceu.part_sharing.enabled"))
      .tier(UHV)
      .rotationState(RotationState.ALL)
      .abilities(PartAbility.IMPORT_ITEMS, PartAbility.IMPORT_FLUIDS, ISGPartAbility.DUAL_INPUT)
      .colorOverlayTieredHullModel(GTCEu.id("block/overlay/appeng/me_buffer_hatch"))
      .register();
}
