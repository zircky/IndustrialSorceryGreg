package com.zircky.industrialsorcerygreg.integration.ae2.machine;

import com.gregtechceu.gtceu.api.blockentity.BlockEntityCreationInfo;

public class MEUltraPatternBufferPartMachine extends MEExtendedPatternBufferPartMachine {
  public static final int PATTERN_BUFFER_SIZE = 324;

  public MEUltraPatternBufferPartMachine(BlockEntityCreationInfo info) {
    super(info);
  }

  @Override
  public int getPatternBufferSize() {
    return PATTERN_BUFFER_SIZE;
  }
}
