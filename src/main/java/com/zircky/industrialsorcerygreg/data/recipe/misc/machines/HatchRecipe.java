package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import com.gregtechceu.gtceu.common.data.GTMachines;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.zircky.industrialsorcerygreg.api.ISGValues;
import com.zircky.industrialsorcerygreg.common.data.ISGMaterials;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.ASSEMBLER_RECIPES;

public class HatchRecipe {
  public static void init(Consumer<FinishedRecipe> provider) {
    ASSEMBLER_RECIPES.recipeBuilder("rotor_holder_hv")
        .inputItems(GTMachines.HULL[HV])
        .inputItems(gear, GTMaterials.BlackSteel, 4)
        .inputItems(gearSmall, GTMaterials.StainlessSteel, 4)
        .outputItems(GTMachines.ROTOR_HOLDER[HV])
        .duration(ISGValues.SECONDS * 30).EUt(VH[HV]).save(provider);
    ASSEMBLER_RECIPES.recipeBuilder("rotor_holder_ev")
        .inputItems(GTMachines.HULL[EV])
        .inputItems(gear, GTMaterials.Ultimet, 4)
        .inputItems(gearSmall, GTMaterials.Titanium, 4)
        .outputItems(GTMachines.ROTOR_HOLDER[EV])
        .duration(ISGValues.SECONDS * 30).EUt(VH[EV]).save(provider);
    ASSEMBLER_RECIPES.recipeBuilder("rotor_holder_iv")
        .inputItems(GTMachines.HULL[IV])
        .inputItems(gear, GTMaterials.HSSG, 4)
        .inputItems(gear, GTMaterials.TungstenSteel, 4)
        .outputItems(GTMachines.ROTOR_HOLDER[IV])
        .duration(ISGValues.SECONDS * 30).EUt(VH[IV]).save(provider);
    ASSEMBLER_RECIPES.recipeBuilder("rotor_holder_luv")
        .inputItems(GTMachines.HULL[LuV])
        .inputItems(gear, GTMaterials.Ruthenium, 4)
        .inputItems(gear, GTMaterials.RhodiumPlatedPalladium, 4)
        .outputItems(GTMachines.ROTOR_HOLDER[LuV])
        .duration(ISGValues.SECONDS * 30).EUt(VH[LuV]).save(provider);
    ASSEMBLER_RECIPES.recipeBuilder("rotor_holder_zpm")
        .inputItems(GTMachines.HULL[ZPM])
        .inputItems(gear, GTMaterials.Trinium, 4)
        .inputItems(gear, GTMaterials.NaquadahAlloy, 4)
        .outputItems(GTMachines.ROTOR_HOLDER[ZPM])
        .duration(ISGValues.SECONDS * 30).EUt(VH[ZPM]).save(provider);
    ASSEMBLER_RECIPES.recipeBuilder("rotor_holder_uv")
        .inputItems(GTMachines.HULL[UV])
        .inputItems(gear, GTMaterials.Tritanium, 4)
        .inputItems(gear, GTMaterials.Darmstadtium, 4)
        .outputItems(GTMachines.ROTOR_HOLDER[UV])
        .duration(ISGValues.SECONDS * 30).EUt(VH[UV]).save(provider);
    ASSEMBLER_RECIPES.recipeBuilder("rotor_holder_uhv")
        .inputItems(GTMachines.HULL[UHV])
        .inputItems(gear, ISGMaterials.Orichalcum, 4)
        .inputItems(gear, GTMaterials.Neutronium, 4)
        .outputItems(GTMachines.ROTOR_HOLDER[UHV])
        .duration(ISGValues.SECONDS * 30).EUt(VH[UHV]).save(provider);
    ASSEMBLER_RECIPES.recipeBuilder("rotor_holder_uev")
        .inputItems(GTMachines.HULL[UEV])
        .inputItems(gear, ISGMaterials.AstralTitanium, 4)
        .inputItems(gear, ISGMaterials.Quantanium, 4)
        .outputItems(GTMachines.ROTOR_HOLDER[UEV])
        .duration(ISGValues.SECONDS * 30).EUt(VH[UEV]).save(provider);
    ASSEMBLER_RECIPES.recipeBuilder("rotor_holder_uiv")
        .inputItems(GTMachines.HULL[UIV])
        .inputItems(gear, ISGMaterials.CelestialTungsten, 4)
        .inputItems(gear, ISGMaterials.Infuscolium, 4)
        .outputItems(GTMachines.ROTOR_HOLDER[UIV])
        .duration(ISGValues.SECONDS * 30).EUt(VH[UIV]).save(provider);
    ASSEMBLER_RECIPES.recipeBuilder("rotor_holder_uxv")
        .inputItems(GTMachines.HULL[UXV])
        .inputItems(gear, ISGMaterials.Vibramantium, 4)
        .inputItems(gear, ISGMaterials.HastelloyK243, 4)
        .outputItems(GTMachines.ROTOR_HOLDER[UXV])
        .duration(ISGValues.SECONDS * 30).EUt(VH[UXV]).save(provider);
    ASSEMBLER_RECIPES.recipeBuilder("rotor_holder_opv")
        .inputItems(GTMachines.HULL[OpV])
        .inputItems(gear, ISGMaterials.HexaphaseCopper, 4)
        .inputItems(gear, ISGMaterials.TranscendentMetal, 4)
        .outputItems(GTMachines.ROTOR_HOLDER[OpV])
        .duration(ISGValues.SECONDS * 30).EUt(VH[OpV]).save(provider);
  }

}
