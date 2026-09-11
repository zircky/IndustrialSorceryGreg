package com.zircky.industrialsorcerygreg.common.block;

import com.gregtechceu.gtceu.api.block.IFusionCasingType;
import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.block.FusionCasingBlock;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.zircky.industrialsorcerygreg.ISGCore;
import com.zircky.industrialsorcerygreg.common.data.ISGCasings;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.common.data.GTBlocks.*;

public final class FusionCasings extends FusionCasingBlock {

  public FusionCasings(Properties properties, IFusionCasingType casingType) {
    super(properties, casingType);
  }

//  public static Block getCompressedCoilState(int tier) {
//    return switch (tier) {
//      case LuV -> GTEBlocks.IMPROVED_SUPERCONDUCTOR_COIL.get();
//      case ZPM -> GTEBlocks.COMPRESSED_FUSION_COIL.get();
//      case UV -> GTEBlocks.ADVANCED_COMPRESSED_FUSION_COIL.get();
//      case UHV -> GTEBlocks.COMPRESSED_FUSION_COIL_MK2_PROTOTYPE.get();
//      default -> GTEBlocks.COMPRESSED_FUSION_COIL_MK2.get();
//    };
//  }

  public static Block getCoilState(int tier) {
    return tier == UHV ? ISGCasings.ADVANCED_FUSION_COIL.get() : ISGCasings.FUSION_COIL_MK2.get();
  }

  public static Block getFrameState(int tier) {
    return switch (tier) {
      case LuV -> ChemicalHelper.getBlock(TagPrefix.frameGt, GTMaterials.NaquadahAlloy);
      case ZPM -> ChemicalHelper.getBlock(TagPrefix.frameGt, GTMaterials.Duranium);
      case UV -> ChemicalHelper.getBlock(TagPrefix.frameGt, GTMaterials.Naquadria);
      case UHV -> ChemicalHelper.getBlock(TagPrefix.frameGt, GTMaterials.Trinium);
      default -> ChemicalHelper.getBlock(TagPrefix.frameGt, GTMaterials.Neutronium);
    };
  }

  public static Block getCasingState(int tier) {
    return switch (tier) {
      case LuV -> FUSION_CASING.get();
      case ZPM -> FUSION_CASING_MK2.get();
      case UV -> FUSION_CASING_MK3.get();
      case UHV -> ISGCasings.FUSION_CASING_MK4.get();
      default -> ISGCasings.FUSION_CASING_MK5.get();
    };
  }

  public static IFusionCasingType getCasingType(int tier) {
    return switch (tier) {
      case LuV -> FusionCasingBlock.CasingType.FUSION_CASING;
      case ZPM -> FusionCasingBlock.CasingType.FUSION_CASING_MK2;
      case UV -> FusionCasingBlock.CasingType.FUSION_CASING_MK3;
      case UHV -> FusionCasings.CasingType.FUSION_CASING_MK4;
      default -> FusionCasings.CasingType.FUSION_CASING_MK5;
    };
  }

  public enum CasingType implements IFusionCasingType {

    FUSION_CASING_MK4("fusion_casing_mk4"),
    FUSION_CASING_MK5("fusion_casing_mk5");

    private final String name;
    private final int harvestLevel;

    CasingType(String name) {
      this.name = name;
      harvestLevel = 3;
    }

    @Override
    public int getHarvestLevel() {
      return harvestLevel;
    }

    @Override
    public @NotNull String getSerializedName() {
      return name;
    }

    @Override
    public ResourceLocation getTexture() {
      return ISGCore.id("block/casings/fusion/%s".formatted(name));
    }
  }
}
