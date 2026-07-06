package com.zircky.industrialsorcerygreg.common.data.materials;

import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet;
import com.lowdragmc.lowdraglib.client.renderer.IRenderer;
import com.zircky.industrialsorcerygreg.client.renderer.item.HaloItemRenderer;
import lombok.Getter;
import org.jetbrains.annotations.Nullable;

@Getter
public class ISGMaterialIconSet extends MaterialIconSet {

  private final IRenderer renderer;

  public ISGMaterialIconSet(String name, @Nullable MaterialIconSet parentIconset, boolean isRootIconset, IRenderer renderer) {
    super(name, parentIconset, isRootIconset);
    this.renderer = renderer;
  }

  public static final MaterialIconSet QUANTUM_CHROMO_DYNAMICALLY = new ISGMaterialIconSet("quantum_chromo_dynamically", METALLIC, false, HaloItemRenderer.QUANTUM_CHROMO_DYNAMICALLY_HALO);
  public static final MaterialIconSet CHAOS = new MaterialIconSet("chaos", METALLIC);
  public static final MaterialIconSet MAGNETOHYDRODYNAMICALLY_CONSTRAINED_STAR_MATTER = new MaterialIconSet("magnetohydrodynamically_constrained_star_matter", null, true);
  public static final MaterialIconSet INFINITY = new MaterialIconSet("infinity", MaterialIconSet.DULL);
  public static final MaterialIconSet ETERNITY = new MaterialIconSet("eternity", null, true);
  public static final MaterialIconSet SPACETIME = new MaterialIconSet("spacetime", MaterialIconSet.DULL);
  public static final MaterialIconSet BEDROCKIUM = new MaterialIconSet("bedrockium", MaterialIconSet.DULL);
  public static final MaterialIconSet MAGMATTER = new MaterialIconSet("magmatter", null, true);
  public static final MaterialIconSet WHITE_DWARF_MATTER = new MaterialIconSet("white_dwarf_mtter", null, true);
  public static final MaterialIconSet BLACK_DWARF_MATTER = new MaterialIconSet("black_dwarf_mtter", null, true);

  public static void init() {
  }
}
