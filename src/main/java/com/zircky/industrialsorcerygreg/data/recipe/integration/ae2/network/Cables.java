package com.zircky.industrialsorcerygreg.data.recipe.integration.ae2.network;

import appeng.api.util.AEColor;
import appeng.core.definitions.AEItems;
import appeng.core.definitions.AEParts;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.data.recipe.CustomTags;
import com.zircky.industrialsorcerygreg.common.data.ISGMaterials;
import com.zircky.industrialsorcerygreg.data.recipe.tag.AE2Tags;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.ASSEMBLER_RECIPES;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.CHEMICAL_BATH_RECIPES;

public class Cables {
  public static void init(Consumer<FinishedRecipe> provider) {
    cables(provider);
    colors(provider);
    clean(provider);
  }

  public static void cables(Consumer<FinishedRecipe> provider) {
    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/cables/glass_fluix_1")
        .inputItems(new ItemStack(AEParts.QUARTZ_FIBER, 3))
        .inputItems(new ItemStack(AEItems.FLUIX_DUST, 2))
        .inputItems(TagPrefix.plate, GTMaterials.CertusQuartz)
        .circuitMeta(1)
        .outputItems(new ItemStack(AEParts.GLASS_CABLE.item(AEColor.TRANSPARENT), 2))
        .duration(250).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/cables/glass_fluix_2")
        .inputItems(new ItemStack(AEParts.QUARTZ_FIBER, 3))
        .inputItems(new ItemStack(AEItems.FLUIX_DUST, 2))
        .inputItems(TagPrefix.plate, GTMaterials.CertusQuartz)
        .circuitMeta(2)
        .outputItems(new ItemStack(AEParts.GLASS_CABLE.item(AEColor.TRANSPARENT), 8))
        .duration(250).EUt(GTValues.VA[GTValues.UV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/cables/covered_fluix_rubber")
        .inputItems(new ItemStack(AEParts.GLASS_CABLE.item(AEColor.TRANSPARENT)))
        .inputFluids(GTMaterials.Rubber.getFluid(144))
        .circuitMeta(32)
        .outputItems(new ItemStack(AEParts.COVERED_CABLE.item(AEColor.TRANSPARENT)))
        .duration(350).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/cables/covered_fluix_styrene_butadiene_rubber")
        .inputItems(new ItemStack(AEParts.GLASS_CABLE.item(AEColor.TRANSPARENT)))
        .inputFluids(GTMaterials.StyreneButadieneRubber.getFluid(108))
        .circuitMeta(32)
        .outputItems(new ItemStack(AEParts.COVERED_CABLE.item(AEColor.TRANSPARENT)))
        .duration(350).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/cables/covered_fluix_silicone_rubber")
        .inputItems(new ItemStack(AEParts.GLASS_CABLE.item(AEColor.TRANSPARENT)))
        .inputFluids(GTMaterials.SiliconeRubber.getFluid(72))
        .circuitMeta(32)
        .outputItems(new ItemStack(AEParts.COVERED_CABLE.item(AEColor.TRANSPARENT)))
        .duration(350).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/cables/smart_fluix")
        .inputItems(new ItemStack(AEParts.COVERED_CABLE.item(AEColor.TRANSPARENT), 3))
        .inputItems(CustomTags.EV_CIRCUITS)
        .inputFluids(GTMaterials.Cupronickel.getFluid(144))
        .circuitMeta(1)
        .outputItems(new ItemStack(AEParts.SMART_CABLE.item(AEColor.TRANSPARENT), 3))
        .duration(350).EUt(GTValues.VA[GTValues.IV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/cables/dense_covered_fluix_styrene_butadiene_rubber")
        .inputItems(new ItemStack(AEParts.COVERED_CABLE.item(AEColor.TRANSPARENT), 4))
        .inputFluids(GTMaterials.StyreneButadieneRubber.getFluid(216))
        .circuitMeta(32)
        .outputItems(new ItemStack(AEParts.COVERED_DENSE_CABLE.item(AEColor.TRANSPARENT)))
        .duration(350).EUt(GTValues.VA[GTValues.LuV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/cables/dense_covered_fluix_silicone_rubber")
        .inputItems(new ItemStack(AEParts.COVERED_CABLE.item(AEColor.TRANSPARENT), 4))
        .inputFluids(GTMaterials.SiliconeRubber.getFluid(144))
        .circuitMeta(32)
        .outputItems(new ItemStack(AEParts.COVERED_DENSE_CABLE.item(AEColor.TRANSPARENT)))
        .duration(350).EUt(GTValues.VA[GTValues.LuV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/cables/dense_smart_fluix")
        .inputItems(new ItemStack(AEParts.COVERED_DENSE_CABLE.item(AEColor.TRANSPARENT)))
        .inputItems(CustomTags.ZPM_CIRCUITS)
        .inputFluids(ISGMaterials.CortenSteel.getFluid(144))
        .outputItems(new ItemStack(AEParts.SMART_DENSE_CABLE.item(AEColor.TRANSPARENT)))
        .duration(350).EUt(GTValues.VA[GTValues.LuV]).save(provider);

  }

  public static void colors(Consumer<FinishedRecipe> provider) {
    cablesColor("ae2/network/cables/glass_black", new ItemStack(AEParts.GLASS_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeBlack.getFluid(144), new ItemStack(AEParts.GLASS_CABLE.item(AEColor.BLACK)), provider);
    cablesColor("ae2/network/cables/glass_blue", new ItemStack(AEParts.GLASS_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeBlue.getFluid(144), new ItemStack(AEParts.GLASS_CABLE.item(AEColor.BLUE)), provider);
    cablesColor("ae2/network/cables/glass_brown", new ItemStack(AEParts.GLASS_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeBrown.getFluid(144), new ItemStack(AEParts.GLASS_CABLE.item(AEColor.BROWN)), provider);
    cablesColor("ae2/network/cables/glass_cyan", new ItemStack(AEParts.GLASS_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeCyan.getFluid(144), new ItemStack(AEParts.GLASS_CABLE.item(AEColor.CYAN)), provider);
    cablesColor("ae2/network/cables/glass_gray", new ItemStack(AEParts.GLASS_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeGray.getFluid(144), new ItemStack(AEParts.GLASS_CABLE.item(AEColor.GRAY)), provider);
    cablesColor("ae2/network/cables/glass_green", new ItemStack(AEParts.GLASS_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeGreen.getFluid(144), new ItemStack(AEParts.GLASS_CABLE.item(AEColor.GREEN)), provider);
    cablesColor("ae2/network/cables/glass_light_blue", new ItemStack(AEParts.GLASS_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeLightBlue.getFluid(144), new ItemStack(AEParts.GLASS_CABLE.item(AEColor.LIGHT_BLUE)), provider);
    cablesColor("ae2/network/cables/glass_light_gray", new ItemStack(AEParts.GLASS_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeLightGray.getFluid(144), new ItemStack(AEParts.GLASS_CABLE.item(AEColor.LIGHT_GRAY)), provider);
    cablesColor("ae2/network/cables/glass_lime", new ItemStack(AEParts.GLASS_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeLime.getFluid(144), new ItemStack(AEParts.GLASS_CABLE.item(AEColor.LIME)), provider);
    cablesColor("ae2/network/cables/glass_magenta", new ItemStack(AEParts.GLASS_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeMagenta.getFluid(144), new ItemStack(AEParts.GLASS_CABLE.item(AEColor.MAGENTA)), provider);
    cablesColor("ae2/network/cables/glass_orange", new ItemStack(AEParts.GLASS_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeOrange.getFluid(144), new ItemStack(AEParts.GLASS_CABLE.item(AEColor.ORANGE)), provider);
    cablesColor("ae2/network/cables/glass_pink", new ItemStack(AEParts.GLASS_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyePink.getFluid(144), new ItemStack(AEParts.GLASS_CABLE.item(AEColor.PINK)), provider);
    cablesColor("ae2/network/cables/glass_purple", new ItemStack(AEParts.GLASS_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyePurple.getFluid(144), new ItemStack(AEParts.GLASS_CABLE.item(AEColor.PURPLE)), provider);
    cablesColor("ae2/network/cables/glass_red", new ItemStack(AEParts.GLASS_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeRed.getFluid(144), new ItemStack(AEParts.GLASS_CABLE.item(AEColor.RED)), provider);
    cablesColor("ae2/network/cables/glass_white", new ItemStack(AEParts.GLASS_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeWhite.getFluid(144), new ItemStack(AEParts.GLASS_CABLE.item(AEColor.WHITE)), provider);
    cablesColor("ae2/network/cables/glass_yellow", new ItemStack(AEParts.GLASS_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeYellow.getFluid(144), new ItemStack(AEParts.GLASS_CABLE.item(AEColor.YELLOW)), provider);

    cablesColor("ae2/network/cables/covered_black", new ItemStack(AEParts.COVERED_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeBlack.getFluid(144), new ItemStack(AEParts.COVERED_CABLE.item(AEColor.BLACK)), provider);
    cablesColor("ae2/network/cables/covered_blue", new ItemStack(AEParts.COVERED_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeBlue.getFluid(144), new ItemStack(AEParts.COVERED_CABLE.item(AEColor.BLUE)), provider);
    cablesColor("ae2/network/cables/covered_brown", new ItemStack(AEParts.COVERED_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeBrown.getFluid(144), new ItemStack(AEParts.COVERED_CABLE.item(AEColor.BROWN)), provider);
    cablesColor("ae2/network/cables/covered_cyan", new ItemStack(AEParts.COVERED_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeCyan.getFluid(144), new ItemStack(AEParts.COVERED_CABLE.item(AEColor.CYAN)), provider);
    cablesColor("ae2/network/cables/covered_gray", new ItemStack(AEParts.COVERED_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeGray.getFluid(144), new ItemStack(AEParts.COVERED_CABLE.item(AEColor.GRAY)), provider);
    cablesColor("ae2/network/cables/covered_green", new ItemStack(AEParts.COVERED_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeGreen.getFluid(144), new ItemStack(AEParts.COVERED_CABLE.item(AEColor.GREEN)), provider);
    cablesColor("ae2/network/cables/covered_light_blue", new ItemStack(AEParts.COVERED_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeLightBlue.getFluid(144), new ItemStack(AEParts.COVERED_CABLE.item(AEColor.LIGHT_BLUE)), provider);
    cablesColor("ae2/network/cables/covered_light_gray", new ItemStack(AEParts.COVERED_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeLightGray.getFluid(144), new ItemStack(AEParts.COVERED_CABLE.item(AEColor.LIGHT_GRAY)), provider);
    cablesColor("ae2/network/cables/covered_lime", new ItemStack(AEParts.COVERED_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeLime.getFluid(144), new ItemStack(AEParts.COVERED_CABLE.item(AEColor.LIME)), provider);
    cablesColor("ae2/network/cables/covered_magenta", new ItemStack(AEParts.COVERED_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeMagenta.getFluid(144), new ItemStack(AEParts.COVERED_CABLE.item(AEColor.MAGENTA)), provider);
    cablesColor("ae2/network/cables/covered_orange", new ItemStack(AEParts.COVERED_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeOrange.getFluid(144), new ItemStack(AEParts.COVERED_CABLE.item(AEColor.ORANGE)), provider);
    cablesColor("ae2/network/cables/covered_pink", new ItemStack(AEParts.COVERED_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyePink.getFluid(144), new ItemStack(AEParts.COVERED_CABLE.item(AEColor.PINK)), provider);
    cablesColor("ae2/network/cables/covered_purple", new ItemStack(AEParts.COVERED_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyePurple.getFluid(144), new ItemStack(AEParts.COVERED_CABLE.item(AEColor.PURPLE)), provider);
    cablesColor("ae2/network/cables/covered_red", new ItemStack(AEParts.COVERED_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeRed.getFluid(144), new ItemStack(AEParts.COVERED_CABLE.item(AEColor.RED)), provider);
    cablesColor("ae2/network/cables/covered_white", new ItemStack(AEParts.COVERED_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeWhite.getFluid(144), new ItemStack(AEParts.COVERED_CABLE.item(AEColor.WHITE)), provider);
    cablesColor("ae2/network/cables/covered_yellow", new ItemStack(AEParts.COVERED_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeYellow.getFluid(144), new ItemStack(AEParts.COVERED_CABLE.item(AEColor.YELLOW)), provider);

    cablesColor("ae2/network/cables/smart_black", new ItemStack(AEParts.SMART_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeBlack.getFluid(144), new ItemStack(AEParts.SMART_CABLE.item(AEColor.BLACK)), provider);
    cablesColor("ae2/network/cables/smart_blue", new ItemStack(AEParts.SMART_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeBlue.getFluid(144), new ItemStack(AEParts.SMART_CABLE.item(AEColor.BLUE)), provider);
    cablesColor("ae2/network/cables/smart_brown", new ItemStack(AEParts.SMART_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeBrown.getFluid(144), new ItemStack(AEParts.SMART_CABLE.item(AEColor.BROWN)), provider);
    cablesColor("ae2/network/cables/smart_cyan", new ItemStack(AEParts.SMART_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeCyan.getFluid(144), new ItemStack(AEParts.SMART_CABLE.item(AEColor.CYAN)), provider);
    cablesColor("ae2/network/cables/smart_gray", new ItemStack(AEParts.SMART_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeGray.getFluid(144), new ItemStack(AEParts.SMART_CABLE.item(AEColor.GRAY)), provider);
    cablesColor("ae2/network/cables/smart_green", new ItemStack(AEParts.SMART_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeGreen.getFluid(144), new ItemStack(AEParts.SMART_CABLE.item(AEColor.GREEN)), provider);
    cablesColor("ae2/network/cables/smart_light_blue", new ItemStack(AEParts.SMART_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeLightBlue.getFluid(144), new ItemStack(AEParts.SMART_CABLE.item(AEColor.LIGHT_BLUE)), provider);
    cablesColor("ae2/network/cables/smart_light_gray", new ItemStack(AEParts.SMART_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeLightGray.getFluid(144), new ItemStack(AEParts.SMART_CABLE.item(AEColor.LIGHT_GRAY)), provider);
    cablesColor("ae2/network/cables/smart_lime", new ItemStack(AEParts.SMART_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeLime.getFluid(144), new ItemStack(AEParts.SMART_CABLE.item(AEColor.LIME)), provider);
    cablesColor("ae2/network/cables/smart_magenta", new ItemStack(AEParts.SMART_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeMagenta.getFluid(144), new ItemStack(AEParts.SMART_CABLE.item(AEColor.MAGENTA)), provider);
    cablesColor("ae2/network/cables/smart_orange", new ItemStack(AEParts.SMART_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeOrange.getFluid(144), new ItemStack(AEParts.SMART_CABLE.item(AEColor.ORANGE)), provider);
    cablesColor("ae2/network/cables/smart_pink", new ItemStack(AEParts.SMART_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyePink.getFluid(144), new ItemStack(AEParts.SMART_CABLE.item(AEColor.PINK)), provider);
    cablesColor("ae2/network/cables/smart_purple", new ItemStack(AEParts.SMART_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyePurple.getFluid(144), new ItemStack(AEParts.SMART_CABLE.item(AEColor.PURPLE)), provider);
    cablesColor("ae2/network/cables/smart_red", new ItemStack(AEParts.SMART_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeRed.getFluid(144), new ItemStack(AEParts.SMART_CABLE.item(AEColor.RED)), provider);
    cablesColor("ae2/network/cables/smart_white", new ItemStack(AEParts.SMART_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeWhite.getFluid(144), new ItemStack(AEParts.SMART_CABLE.item(AEColor.WHITE)), provider);
    cablesColor("ae2/network/cables/smart_yellow", new ItemStack(AEParts.SMART_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeYellow.getFluid(144), new ItemStack(AEParts.SMART_CABLE.item(AEColor.YELLOW)), provider);

    cablesColor("ae2/network/cables/dense_covered_black", new ItemStack(AEParts.COVERED_DENSE_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeBlack.getFluid(144), new ItemStack(AEParts.COVERED_DENSE_CABLE.item(AEColor.BLACK)), provider);
    cablesColor("ae2/network/cables/dense_covered_blue", new ItemStack(AEParts.COVERED_DENSE_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeBlue.getFluid(144), new ItemStack(AEParts.COVERED_DENSE_CABLE.item(AEColor.BLUE)), provider);
    cablesColor("ae2/network/cables/dense_covered_brown", new ItemStack(AEParts.COVERED_DENSE_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeBrown.getFluid(144), new ItemStack(AEParts.COVERED_DENSE_CABLE.item(AEColor.BROWN)), provider);
    cablesColor("ae2/network/cables/dense_covered_cyan", new ItemStack(AEParts.COVERED_DENSE_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeCyan.getFluid(144), new ItemStack(AEParts.COVERED_DENSE_CABLE.item(AEColor.CYAN)), provider);
    cablesColor("ae2/network/cables/dense_covered_gray", new ItemStack(AEParts.COVERED_DENSE_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeGray.getFluid(144), new ItemStack(AEParts.COVERED_DENSE_CABLE.item(AEColor.GRAY)), provider);
    cablesColor("ae2/network/cables/dense_covered_green", new ItemStack(AEParts.COVERED_DENSE_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeGreen.getFluid(144), new ItemStack(AEParts.COVERED_DENSE_CABLE.item(AEColor.GREEN)), provider);
    cablesColor("ae2/network/cables/dense_covered_light_blue", new ItemStack(AEParts.COVERED_DENSE_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeLightBlue.getFluid(144), new ItemStack(AEParts.COVERED_DENSE_CABLE.item(AEColor.LIGHT_BLUE)), provider);
    cablesColor("ae2/network/cables/dense_covered_light_gray", new ItemStack(AEParts.COVERED_DENSE_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeLightGray.getFluid(144), new ItemStack(AEParts.COVERED_DENSE_CABLE.item(AEColor.LIGHT_GRAY)), provider);
    cablesColor("ae2/network/cables/dense_covered_lime", new ItemStack(AEParts.COVERED_DENSE_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeLime.getFluid(144), new ItemStack(AEParts.COVERED_DENSE_CABLE.item(AEColor.LIME)), provider);
    cablesColor("ae2/network/cables/dense_covered_magenta", new ItemStack(AEParts.COVERED_DENSE_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeMagenta.getFluid(144), new ItemStack(AEParts.COVERED_DENSE_CABLE.item(AEColor.MAGENTA)), provider);
    cablesColor("ae2/network/cables/dense_covered_orange", new ItemStack(AEParts.COVERED_DENSE_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeOrange.getFluid(144), new ItemStack(AEParts.COVERED_DENSE_CABLE.item(AEColor.ORANGE)), provider);
    cablesColor("ae2/network/cables/dense_covered_pink", new ItemStack(AEParts.COVERED_DENSE_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyePink.getFluid(144), new ItemStack(AEParts.COVERED_DENSE_CABLE.item(AEColor.PINK)), provider);
    cablesColor("ae2/network/cables/dense_covered_purple", new ItemStack(AEParts.COVERED_DENSE_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyePurple.getFluid(144), new ItemStack(AEParts.COVERED_DENSE_CABLE.item(AEColor.PURPLE)), provider);
    cablesColor("ae2/network/cables/dense_covered_red", new ItemStack(AEParts.COVERED_DENSE_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeRed.getFluid(144), new ItemStack(AEParts.COVERED_DENSE_CABLE.item(AEColor.RED)), provider);
    cablesColor("ae2/network/cables/dense_covered_white", new ItemStack(AEParts.COVERED_DENSE_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeWhite.getFluid(144), new ItemStack(AEParts.COVERED_DENSE_CABLE.item(AEColor.WHITE)), provider);
    cablesColor("ae2/network/cables/dense_covered_yellow", new ItemStack(AEParts.COVERED_DENSE_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeYellow.getFluid(144), new ItemStack(AEParts.COVERED_DENSE_CABLE.item(AEColor.YELLOW)), provider);

    cablesColor("ae2/network/cables/dense_smart_black", new ItemStack(AEParts.SMART_DENSE_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeBlack.getFluid(144), new ItemStack(AEParts.SMART_DENSE_CABLE.item(AEColor.BLACK)), provider);
    cablesColor("ae2/network/cables/dense_smart_blue", new ItemStack(AEParts.SMART_DENSE_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeBlue.getFluid(144), new ItemStack(AEParts.SMART_DENSE_CABLE.item(AEColor.BLUE)), provider);
    cablesColor("ae2/network/cables/dense_smart_brown", new ItemStack(AEParts.SMART_DENSE_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeBrown.getFluid(144), new ItemStack(AEParts.SMART_DENSE_CABLE.item(AEColor.BROWN)), provider);
    cablesColor("ae2/network/cables/dense_smart_cyan", new ItemStack(AEParts.SMART_DENSE_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeCyan.getFluid(144), new ItemStack(AEParts.SMART_DENSE_CABLE.item(AEColor.CYAN)), provider);
    cablesColor("ae2/network/cables/dense_smart_gray", new ItemStack(AEParts.SMART_DENSE_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeGray.getFluid(144), new ItemStack(AEParts.SMART_DENSE_CABLE.item(AEColor.GRAY)), provider);
    cablesColor("ae2/network/cables/dense_smart_green", new ItemStack(AEParts.SMART_DENSE_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeGreen.getFluid(144), new ItemStack(AEParts.SMART_DENSE_CABLE.item(AEColor.GREEN)), provider);
    cablesColor("ae2/network/cables/dense_smart_light_blue", new ItemStack(AEParts.SMART_DENSE_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeLightBlue.getFluid(144), new ItemStack(AEParts.SMART_DENSE_CABLE.item(AEColor.LIGHT_BLUE)), provider);
    cablesColor("ae2/network/cables/dense_smart_light_gray", new ItemStack(AEParts.SMART_DENSE_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeLightGray.getFluid(144), new ItemStack(AEParts.SMART_DENSE_CABLE.item(AEColor.LIGHT_GRAY)), provider);
    cablesColor("ae2/network/cables/dense_smart_lime", new ItemStack(AEParts.SMART_DENSE_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeLime.getFluid(144), new ItemStack(AEParts.SMART_DENSE_CABLE.item(AEColor.LIME)), provider);
    cablesColor("ae2/network/cables/dense_smart_magenta", new ItemStack(AEParts.SMART_DENSE_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeMagenta.getFluid(144), new ItemStack(AEParts.SMART_DENSE_CABLE.item(AEColor.MAGENTA)), provider);
    cablesColor("ae2/network/cables/dense_smart_orange", new ItemStack(AEParts.SMART_DENSE_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeOrange.getFluid(144), new ItemStack(AEParts.SMART_DENSE_CABLE.item(AEColor.ORANGE)), provider);
    cablesColor("ae2/network/cables/dense_smart_pink", new ItemStack(AEParts.SMART_DENSE_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyePink.getFluid(144), new ItemStack(AEParts.SMART_DENSE_CABLE.item(AEColor.PINK)), provider);
    cablesColor("ae2/network/cables/dense_smart_purple", new ItemStack(AEParts.SMART_DENSE_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyePurple.getFluid(144), new ItemStack(AEParts.SMART_DENSE_CABLE.item(AEColor.PURPLE)), provider);
    cablesColor("ae2/network/cables/dense_smart_red", new ItemStack(AEParts.SMART_DENSE_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeRed.getFluid(144), new ItemStack(AEParts.SMART_DENSE_CABLE.item(AEColor.RED)), provider);
    cablesColor("ae2/network/cables/dense_smart_white", new ItemStack(AEParts.SMART_DENSE_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeWhite.getFluid(144), new ItemStack(AEParts.SMART_DENSE_CABLE.item(AEColor.WHITE)), provider);
    cablesColor("ae2/network/cables/dense_smart_yellow", new ItemStack(AEParts.SMART_DENSE_CABLE.item(AEColor.TRANSPARENT)), GTMaterials.DyeYellow.getFluid(144), new ItemStack(AEParts.SMART_DENSE_CABLE.item(AEColor.YELLOW)), provider);

  }

  public static void clean(Consumer<FinishedRecipe> provider) {
    CHEMICAL_BATH_RECIPES.recipeBuilder("ae2/network/cables/clean")
        .inputItems(AE2Tags.AE2_GLASS_CABLE)
        .inputFluids(GTMaterials.Water.getFluid(1000))
        .outputItems(new ItemStack(AEParts.GLASS_CABLE.item(AEColor.TRANSPARENT)))
        .duration(350).EUt(GTValues.VA[GTValues.HV]).save(provider);

    CHEMICAL_BATH_RECIPES.recipeBuilder("ae2/network/cables/clean_covered_cable")
        .inputItems(AE2Tags.AE2_COVERED_CABLE)
        .inputFluids(GTMaterials.Water.getFluid(1000))
        .outputItems(new ItemStack(AEParts.COVERED_CABLE.item(AEColor.TRANSPARENT)))
        .duration(350).EUt(GTValues.VA[GTValues.HV]).save(provider);

    CHEMICAL_BATH_RECIPES.recipeBuilder("ae2/network/cables/clean_covered_dense_cable")
        .inputItems(AE2Tags.AE2_COVERED_DENCE_CABLE)
        .inputFluids(GTMaterials.Water.getFluid(1000))
        .outputItems(new ItemStack(AEParts.COVERED_DENSE_CABLE.item(AEColor.TRANSPARENT)))
        .duration(350).EUt(GTValues.VA[GTValues.HV]).save(provider);

    CHEMICAL_BATH_RECIPES.recipeBuilder("ae2/network/cables/clean_smart_cable")
        .inputItems(AE2Tags.AE2_SMART_CABLE)
        .inputFluids(GTMaterials.Water.getFluid(1000))
        .outputItems(new ItemStack(AEParts.SMART_CABLE.item(AEColor.TRANSPARENT)))
        .duration(350).EUt(GTValues.VA[GTValues.HV]).save(provider);

    CHEMICAL_BATH_RECIPES.recipeBuilder("ae2/network/cables/clean_dense_smart")
        .inputItems(AE2Tags.AE2_SMART_DENCE_CABLE)
        .inputFluids(GTMaterials.Water.getFluid(1000))
        .outputItems(new ItemStack(AEParts.SMART_DENSE_CABLE.item(AEColor.TRANSPARENT)))
        .duration(350).EUt(GTValues.VA[GTValues.HV]).save(provider);
  }


  private static void cablesColor(String id, ItemStack inputItem, FluidStack inputFluid, ItemStack outputItem, Consumer<FinishedRecipe> provider) {
    CHEMICAL_BATH_RECIPES.recipeBuilder(id)
        .inputItems(inputItem)
        .inputFluids(inputFluid)
        .outputItems(outputItem)
        .duration(350).EUt(GTValues.VA[GTValues.HV]).save(provider);
  }

  private static void cleanColor(String id, ItemStack itemStack) {

  }
}
