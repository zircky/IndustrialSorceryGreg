package com.zircky.industrialsorcerygreg.common.machine.multiblock.electric.water;

import com.gregtechceu.gtceu.api.blockentity.BlockEntityCreationInfo;
import com.gregtechceu.gtceu.api.machine.multiblock.WorkableElectricMultiblockMachine;
import com.gregtechceu.gtceu.data.recipe.CustomTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import java.util.List;

public class HighEnergyLaserPurificationUnitMachine extends WorkableElectricMultiblockMachine {

  public static final List<TagKey<Item>> LENS = List.of(
      CustomTags.RED_LENS,
      CustomTags.ORANGE_LENS,
      CustomTags.BROWN_LENS,
      CustomTags.YELLOW_LENS,
      CustomTags.GREEN_LENS,
      CustomTags.CYAN_LENS,
      CustomTags.BLUE_LENS,
      CustomTags.PURPLE_LENS,
      CustomTags.MAGENTA_LENS,
      CustomTags.PINK_LENS);

  public HighEnergyLaserPurificationUnitMachine(BlockEntityCreationInfo info) {
    super(info);
  }

}
