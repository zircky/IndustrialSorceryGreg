package com.zircky.industrialsorcerygreg.common.machine.multiblock.electric.water;

import com.gregtechceu.gtceu.api.blockentity.BlockEntityCreationInfo;
import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.chemical.material.MarkerMaterials;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.machine.multiblock.WorkableElectricMultiblockMachine;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.List;

public class HighEnergyLaserPurificationUnitMachine extends WorkableElectricMultiblockMachine {

  public static final List<ItemStack> LENS = List.of(
      ChemicalHelper.get(TagPrefix.lens, MarkerMaterials.Color.Red),
      ChemicalHelper.get(TagPrefix.lens, MarkerMaterials.Color.Orange),
      ChemicalHelper.get(TagPrefix.lens, MarkerMaterials.Color.Brown),
      ChemicalHelper.get(TagPrefix.lens, MarkerMaterials.Color.Yellow),
      ChemicalHelper.get(TagPrefix.lens, MarkerMaterials.Color.Green),
      ChemicalHelper.get(TagPrefix.lens, MarkerMaterials.Color.Cyan),
      ChemicalHelper.get(TagPrefix.lens, MarkerMaterials.Color.Blue),
      ChemicalHelper.get(TagPrefix.lens, MarkerMaterials.Color.Purple),
      ChemicalHelper.get(TagPrefix.lens, MarkerMaterials.Color.Magenta),
      ChemicalHelper.get(TagPrefix.lens, MarkerMaterials.Color.Pink));

  public HighEnergyLaserPurificationUnitMachine(BlockEntityCreationInfo info) {
    super(info);
  }

}
