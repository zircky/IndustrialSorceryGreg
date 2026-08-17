package com.zircky.industrialsorcerygreg.common.data.materials;

import com.zircky.industrialsorcerygreg.common.data.ISGMaterials;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.FLUID;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.builderISG;

public class RareEarthMaterial {
  public static void register() {
    RareEarthHydroxidesSolution = builderISG("rare_earth_hydroxides_solution")
        .fluid()
        .color(0xcfb37d)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("NaOH(H2O)?(OH)3", true);

    RareEarthChloridesSolution = builderISG("rare_earth_chlorides_solution")
        .fluid()
        .color(0x164b45)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(?Cl3)H2O", true);

    LaNdOxidesSolution = builderISG("la_nd_oxides_solution")
        .langValue("La-Nd Oxides Solution")
        .fluid()
        .color(0x9ce3db)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(La2O3)(Pr2O3)(Nd2O3)(Ce2O3)", true);

    SmGdOxidesSolution = builderISG("sm_gd_oxides_solution")
        .langValue("Sm-Gd Oxides Solution")
        .fluid()
        .color(0xffff99)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(Sc2O3)(Eu2O3)(Gd2O3)(Sm2O3)", true);

    TbHoOxidesSolution = builderISG("tb_ho_oxides_solution")
        .langValue("Tb-Ho Oxides Solution")
        .fluid()
        .color(0x99ff99)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(Y2O3)(Tb2O3)(Dy2O3)(Ho2O3)", true);

    ErLuOxidesSolution = builderISG("er_lu_oxides_solution")
        .langValue("Er-Lu Oxides Solution")
        .fluid()
        .color(0xffb3ff)
        .iconSet(FLUID)
        .buildAndRegister()
        .setFormula("(Er2O3)(Tm2O3)(Yb2O3)(Lu2O3)", true);

    SupercooledCryotheum = builderISG("supercooled_cryotheum")
        .fluid()
        .color(ISGMaterials.Cryotheum.getMaterialRGB() - 10)
        .iconSet(FLUID)
        .buildAndRegister();
  }
}
