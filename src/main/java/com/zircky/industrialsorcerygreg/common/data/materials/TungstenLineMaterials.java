package com.zircky.industrialsorcerygreg.common.data.materials;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;

public final class TungstenLineMaterials {

    private TungstenLineMaterials() {}

    public static void register() {
        // Process grades have no automatic decomposition or smelting routes.
        MilledScheelite = builderISG("milled_scheelite").dust().color(0xD7E8B3).iconSet(DULL)
                .flags(DISABLE_DECOMPOSITION, NO_SMELTING).buildAndRegister().setFormula("CaWO4");
        WashedScheelite = builderISG("washed_scheelite").dust().color(0xAECFC4).iconSet(DULL)
                .flags(DISABLE_DECOMPOSITION, NO_SMELTING).buildAndRegister().setFormula("CaWO4(H2O)");
        DriedScheelite = builderISG("dried_scheelite").dust().color(0xD0D5A0).iconSet(DULL)
                .flags(DISABLE_DECOMPOSITION, NO_SMELTING).buildAndRegister().setFormula("CaWO4");
        DemagnetizedScheelite = builderISG("demagnetized_scheelite").dust().color(0xDCE0B2).iconSet(DULL)
                .flags(DISABLE_DECOMPOSITION, NO_SMELTING).buildAndRegister().setFormula("CaWO4");
        ScheeliteConcentrate = builderISG("scheelite_concentrate").dust().color(0xE7EDBF).iconSet(SHINY)
                .flags(DISABLE_DECOMPOSITION, NO_SMELTING).buildAndRegister().setFormula("CaWO4");
        ScheeliteSlurry = builderISG("scheelite_slurry").liquid().color(0x8B9670)
                .flags(DISABLE_DECOMPOSITION).buildAndRegister().setFormula("CaWO4(NaOH)2(H2O)");
        DigestedScheeliteSlurry = builderISG("digested_scheelite_slurry").liquid().color(0xA4A778)
                .flags(DISABLE_DECOMPOSITION).buildAndRegister().setFormula("Na2WO4(Ca(OH)2)(H2O)");
        PurifiedTungstateSolution = builderISG("purified_tungstate_solution").liquid().color(0xCBDDA0)
                .flags(DISABLE_DECOMPOSITION).buildAndRegister().setFormula("Na2WO4(H2O)");
        TungsticAcidSuspension = builderISG("tungstic_acid_suspension").liquid().color(0xE1CA50)
                .flags(DISABLE_DECOMPOSITION).buildAndRegister().setFormula("H2WO4(NaCl)2(H2O)");
    }
}
