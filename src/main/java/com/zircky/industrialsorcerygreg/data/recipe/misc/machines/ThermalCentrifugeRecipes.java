package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTItems.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGCasings.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGItems.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.*;

public class ThermalCentrifugeRecipes {
  public static void init(Consumer<FinishedRecipe> provider) {
    // Migrated from misc/test recipes.
        //NUCLEAR PROCESSING

    // TODO migrated disabled: unresolved old test symbol `NUCLEAR_WASTE`.
    //         THERMAL_CENTRIFUGE_RECIPES.recipeBuilder("protactinium_waste_to_nuclear_waste_protactinium233_thorium").duration(300).EUt(30)
    //                 .inputItems(PROTACTINIUM_WASTE.asStack())
    //                 .chancedOutput(NUCLEAR_WASTE.asStack(), 560)
    //                 .chancedOutput(ChemicalHelper.get(dust, Protactinium233, 1), 3000, 0)
    //                 .outputItems(ChemicalHelper.get(dust, Thorium))
    //                 .save(provider);
    // 
    //         THERMAL_CENTRIFUGE_RECIPES.recipeBuilder("thorium_waste_to_nuclear_waste_protactinium233_uranium").duration(300).EUt(30)
    //                 .inputItems(THORIUM_WASTE.asStack())
    //                 .chancedOutput(NUCLEAR_WASTE.asStack(), 560)
    //                 .chancedOutput(ChemicalHelper.get(dust, Protactinium233, 1), 3000, 0)
    //                 .outputItems(ChemicalHelper.get(dust, Uranium))
    //                 .save(provider);
    // 
    //         THERMAL_CENTRIFUGE_RECIPES.recipeBuilder("uranium_waste_to_nuclear_waste_dust_neptunium").duration(300).EUt(60)
    //                 .inputItems(URANIUM_WASTE.asStack())
    //                 .chancedOutput(NUCLEAR_WASTE.asStack(), 760)
    //                 .chancedOutput(dust, Uranium, 1, 3000)
    //                 .outputItems(ChemicalHelper.get(dust, Neptunium))
    //                 .save(provider);
    // 
    //         THERMAL_CENTRIFUGE_RECIPES.recipeBuilder("neptunium_waste_to_nuclear_waste_neptunium_plutonium_radioactive").duration(300).EUt(120)
    //                 .inputItems(NEPTUNIUM_WASTE.asStack())
    //                 .chancedOutput(NUCLEAR_WASTE.asStack(), 1000)
    //                 .chancedOutput(ChemicalHelper.get(dust, Neptunium, 1), 3000, 0)
    //                 .outputItems(ChemicalHelper.get(dust, PlutoniumRadioactive))
    //                 .save(provider);
    // 
    //         THERMAL_CENTRIFUGE_RECIPES.recipeBuilder("plutonium_waste_to_nuclear_waste_plutonium_radioactive_americium_radioactive").duration(300).EUt(240)
    //                 .inputItems(PLUTONIUM_WASTE.asStack())
    //                 .chancedOutput(NUCLEAR_WASTE.asStack(), 1330)
    //                 .chancedOutput(ChemicalHelper.get(dust, PlutoniumRadioactive, 1), 3000, 0)
    //                 .outputItems(ChemicalHelper.get(dust, AmericiumRadioactive))
    //                 .save(provider);
    // 
    //         THERMAL_CENTRIFUGE_RECIPES.recipeBuilder("americium_waste_to_nuclear_waste_americium_radioactive_curium").duration(300).EUt(480)
    //                 .inputItems(AMERICIUM_WASTE.asStack())
    //                 .chancedOutput(NUCLEAR_WASTE.asStack(), 1780)
    //                 .chancedOutput(ChemicalHelper.get(dust, AmericiumRadioactive, 1), 3000, 0)
    //                 .outputItems(ChemicalHelper.get(dust, Curium))
    //                 .save(provider);
    // 
    //         THERMAL_CENTRIFUGE_RECIPES.recipeBuilder("curium_waste_to_nuclear_waste_curium_berkelium").duration(300).EUt(960)
    //                 .inputItems(CURIUM_WASTE.asStack())
    //                 .chancedOutput(NUCLEAR_WASTE.asStack(), 2370)
    //                 .chancedOutput(ChemicalHelper.get(dust, Curium, 1), 3000, 0)
    //                 .outputItems(ChemicalHelper.get(dust, Berkelium))
    //                 .save(provider);
    // 
    //         THERMAL_CENTRIFUGE_RECIPES.recipeBuilder("berkelium_waste_to_nuclear_waste_berkelium_californium").duration(300).EUt(1920)
    //                 .inputItems(BERKELIUM_WASTE.asStack())
    //                 .chancedOutput(NUCLEAR_WASTE.asStack(), 3160)
    //                 .chancedOutput(ChemicalHelper.get(dust, Berkelium, 1), 3000, 0)
    //                 .outputItems(ChemicalHelper.get(dust, Californium))
    //                 .save(provider);
    // 
    //         THERMAL_CENTRIFUGE_RECIPES.recipeBuilder("californium_waste_to_nuclear_waste_californium_einsteinium").duration(300).EUt(3840)
    //                 .inputItems(CALIFORNIUM_WASTE.asStack())
    //                 .chancedOutput(NUCLEAR_WASTE.asStack(), 4220)
    //                 .chancedOutput(ChemicalHelper.get(dust, Californium, 1), 3000, 0)
    //                 .outputItems(ChemicalHelper.get(dust, Einsteinium))
    //                 .save(provider);
    // 
    //         THERMAL_CENTRIFUGE_RECIPES.recipeBuilder("einsteinium_waste_to_nuclear_waste_einsteinium_fermium").duration(300).EUt(7680)
    //                 .inputItems(EINSTEINIUM_WASTE.asStack())
    //                 .chancedOutput(NUCLEAR_WASTE.asStack(), 5630)
    //                 .chancedOutput(ChemicalHelper.get(dust, Einsteinium, 1), 3000, 0)
    //                 .outputItems(ChemicalHelper.get(dust, Fermium))
    //                 .save(provider);
    // 
    //         THERMAL_CENTRIFUGE_RECIPES.recipeBuilder("fermium_waste_to_nuclear_waste_fermium_mendelevium").duration(300).EUt(15360)
    //                 .inputItems(FERMIUM_WASTE.asStack())
    //                 .chancedOutput(NUCLEAR_WASTE.asStack(), 7500)
    //                 .chancedOutput(ChemicalHelper.get(dust, Fermium, 1), 3000, 0)
    //                 .outputItems(ChemicalHelper.get(dust, Mendelevium))
    //                 .save(provider);
    // 
    //         THERMAL_CENTRIFUGE_RECIPES.recipeBuilder("mendelevium_waste_to_nuclear_waste_mendelevium").duration(300).EUt(30720)
    //                 .inputItems(MENDELEVIUM_WASTE.asStack())
    //                 .chancedOutput(NUCLEAR_WASTE.asStack(), 10000)
    //                 .outputItems(ChemicalHelper.get(dust, Mendelevium))
    //                 .save(provider);
    //   

}
}
