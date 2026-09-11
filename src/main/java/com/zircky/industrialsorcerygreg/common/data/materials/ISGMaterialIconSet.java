package com.zircky.industrialsorcerygreg.common.data.materials;

import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet;
import com.zircky.industrialsorcerygreg.api.item.component.ICustomRenderer;
import com.zircky.industrialsorcerygreg.client.renderer.item.HaloItemRenderer;
import com.zircky.industrialsorcerygreg.client.renderer.item.ISGItemRenderer;
import com.zircky.industrialsorcerygreg.client.renderer.item.StereoscopicItemRenderer;
import com.zircky.industrialsorcerygreg.client.renderer.item.TranslucentRenderer;

public class ISGMaterialIconSet extends MaterialIconSet {

  private final ICustomRenderer customRender;

  public ISGMaterialIconSet(String name, MaterialIconSet parentIconset, boolean root, ISGItemRenderer renderer) {
    this(name, parentIconset, root, renderer == null ? null : () -> renderer);
  }

  public ISGMaterialIconSet(String name, MaterialIconSet parentIconset, boolean root, ICustomRenderer renderer) {
    super(name, parentIconset, root);
    this.customRender = renderer;
  }

  public ICustomRenderer getCustomRender() {
    return customRender;
  }

  public static final MaterialIconSet SPACETIME = new MaterialIconSet("spacetime", MaterialIconSet.DULL);
  public static final MaterialIconSet BEDROCKIUM = new MaterialIconSet("bedrockium", MaterialIconSet.DULL);


  public static final ISGMaterialIconSet AMPROSIUM = new ISGMaterialIconSet("amprosium", METALLIC, false, HaloItemRenderer.WHITE_HALO);
  public static final ISGMaterialIconSet TRANSCENDENT = new ISGMaterialIconSet("transcendent", METALLIC, false, () -> StereoscopicItemRenderer.INSTANCE);
  public static final ISGMaterialIconSet QUANTUM_CHROMO_DYNAMICALLY = new ISGMaterialIconSet("quantum_chromo_dynamically", METALLIC, false, HaloItemRenderer.QUANTUM_CHROMO_DYNAMICALLY_HALO);
  public static final ISGMaterialIconSet COSMIC = new ISGMaterialIconSet("cosmic", METALLIC, false, HaloItemRenderer.COSMIC_HALO);
  public static final ISGMaterialIconSet CHAOS = new ISGMaterialIconSet("chaos", METALLIC, false, HaloItemRenderer.CHAOS_HALO);
  public static final ISGMaterialIconSet CHAOS_INFINITY = new ISGMaterialIconSet("chaos_infinity_old", METALLIC, false, HaloItemRenderer.CHAOS_INFINITY_HALO);
  public static final ISGMaterialIconSet NEUTRONIUM = new ISGMaterialIconSet("neutronium", METALLIC, false, HaloItemRenderer.NEUTRONIUM_HALO);
  public static final ISGMaterialIconSet COSMIC_NEUTRONIUM = new ISGMaterialIconSet("cosmic_neutronium", METALLIC, false, HaloItemRenderer.COSMIC_NEUTRONIUM_HALO);
  public static final ISGMaterialIconSet MAGNETOHYDRODYNAMICALLY_CONSTRAINED_STAR_MATTER = new ISGMaterialIconSet("magnetohydrodynamically_constrained_star_matter", null, true, HaloItemRenderer.MAGNETOHYDRODYNAMICALLY_CONSTRAINED_STAR_MATTER_HALO);
  public static final ISGMaterialIconSet INFINITY = new ISGMaterialIconSet("infinity", null, true, HaloItemRenderer.INFINITY_HALO);
  public static final ISGMaterialIconSet ETERNITY = new ISGMaterialIconSet("eternity", null, true, HaloItemRenderer.ETERNITY_HALO);
  public static final ISGMaterialIconSet MAGMATTER = new ISGMaterialIconSet("magmatter", null, true, HaloItemRenderer.MAGMATTER_HALO);
  public static final MaterialIconSet WHITE_DWARF_MATTER = new MaterialIconSet("white_dwarf_mtter", null, true);
  public static final MaterialIconSet BLACK_DWARF_MATTER = new MaterialIconSet("black_dwarf_mtter", null, true);
  public static final MaterialIconSet WROUGHT_IRON = new MaterialIconSet("wrought_iron", METALLIC);
  public static final MaterialIconSet PARTICLE_EMITTER = new MaterialIconSet("particle_emitter", null, true);
  public static final MaterialIconSet LIMPID = new MaterialIconSet("limpid", DULL);
  public static final ISGMaterialIconSet INFINITY_CHAOS = new ISGMaterialIconSet("chaos_infinity", METALLIC, false, HaloItemRenderer.CHAOS_INFINITY_HALO);
  public static final ISGMaterialIconSet TRANSLUCENT = new ISGMaterialIconSet("translucent", SHINY, false, TranslucentRenderer.INSTANCE);
  public static final ISGMaterialIconSet ASTRAL = new ISGMaterialIconSet("cosmic_translucent", BRIGHT, false, HaloItemRenderer.ASTRIUM);



  public static void init() {
  }
}
