package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import com.gregtechceu.gtceu.api.machine.multiblock.CleanroomType;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.ingot;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.POLYMERIZATION_REACTOR_RECIPES;

public class PolymerizationReactor {
  public static void init(Consumer<FinishedRecipe> provider) {

    POLYMERIZATION_REACTOR_RECIPES.recipeBuilder("epoxy_from_bisphenol_a")
        .inputDust(SodiumHydroxide, 3)
        .inputFluids(Epichlorohydrin, 1000)
        .inputFluids(BisphenolA, 1000)
        .outputFluids(Epoxy.getFluid(1000))
        .outputFluids(SaltWater.getFluid(1000))
        .duration(200).EUt(VA[LV]).save(provider);

    POLYMERIZATION_REACTOR_RECIPES.recipeBuilder("make_p507_2")
        .inputDust(Sodium, 2)
        .inputFluids(EthylHexanol, 2000)
        .inputFluids(PhosphoricAcid, 2000)
        .inputFluids(Ethanol, 2000)
        .outputFluids(P507.getFluid(1000))
        .duration(1200)
        .EUt(1920)
        .save(provider);

    POLYMERIZATION_REACTOR_RECIPES.recipeBuilder("pre_zylon_dust")
        .inputDust(Terephthalaldehyde, 16)
        .inputFluids(Dinitrodipropanyloxybenzene, 1000)
        .outputDust(PreZylon)
        .outputFluids(Oxygen, 6000)
        .EUt(7864320)
        .duration(50)
        .cleanroom(CleanroomType.CLEANROOM)
        .save(provider);

    POLYMERIZATION_REACTOR_RECIPES.recipeBuilder("polyetheretherketone")
        .inputDust(Difluorobenzophenone, 24)
        .inputDust(SodaAsh, 6)
        .inputFluids(Hydroquinone, 1000)
        .outputDust(SodiumFluoride, 4)
        .outputFluids(Polyetheretherketone, 2592)
        .outputFluids(CarbonDioxide, 1000)
        .EUt(122880)
        .duration(250)
        .cleanroom(CleanroomType.CLEANROOM)
        .save(provider);

//    POLYMERIZATION_REACTOR_RECIPES.recipeBuilder("polyurethaneresin")
//        .inputDust(Pentaerythritol)
//        .inputDust(DiphenylmethaneDiisocyanate, 5)
//        .inputFluids(EthyleneGlycol, 4000)
//        .inputFluids(Siliconoil, 1000)
//        .outputFluids(PolyurethaneResin, 1000)
//        .EUt(7680)
//        .duration(600)
//        .cleanroom(CleanroomType.CLEANROOM)
//        .save(provider);

    POLYMERIZATION_REACTOR_RECIPES.recipeBuilder("polyurethane")
        .inputFluids(Oxygen, 1000)
        .inputFluids(EthyleneGlycol, 4000)
        .inputFluids(TolueneDiisocyanate, 1000)
        .outputFluids(Polyurethane, 1000)
        .outputFluids(Water, 7000)
        .EUt(480)
        .duration(110)
        .save(provider);

    // C6H2(C2O3)2 + C12H12N2O -> C22H14N2O7
    POLYMERIZATION_REACTOR_RECIPES.recipeBuilder("polyamic_acid")
        .inputDust(PyromelliticDianhydride, 18)
        .inputFluids(Oxydianiline.getFluid(1000))
        .outputFluids(PolyamicAcid.getFluid(1000))
        .EUt(122880)
        .duration(400)
        .cleanroom(CleanroomType.CLEANROOM)
        .save(provider);


    POLYMERIZATION_REACTOR_RECIPES.recipeBuilder("polyphenylene_sulfide_from_oxygen")
        .inputDust(SodiumSulfide, 3)
        .inputFluids(Dichlorobenzene, 1000)
        .inputFluids(Oxygen, 8000)
        .outputDust(Salt, 4)
        .outputFluids(PolyphenyleneSulfide.getFluid(1500))
        .duration(240).EUt(360).save(provider);

    POLYMERIZATION_REACTOR_RECIPES.recipeBuilder("polybenzimidazole").EUt(VA[IV]).duration(100)
        .inputFluids(Diaminobenzidine, 1000)
        .inputFluids(DiphenylIsophtalate, 1000)
        .outputFluids(Phenol.getFluid(1000))
        .outputFluids(Polybenzimidazole.getFluid(1008))
        .cleanroom(CleanroomType.CLEANROOM)
        .save(provider);

    POLYMERIZATION_REACTOR_RECIPES.recipeBuilder("polycaprolactam").EUt(VA[MV]).duration(450)
        .inputDust(Caprolactam, 1)
        .inputFluids(Nitrogen, 1000)
        .outputItems(ingot, Polycaprolactam, 1)
        .save(provider);

    POLYMERIZATION_REACTOR_RECIPES.recipeBuilder("polyvinyl_butyral")
        .inputFluids(Butyraldehyde, 250)
        .inputFluids(PolyvinylAcetate.getFluid(L))
        .outputFluids(PolyvinylButyral.getFluid(L))
        .duration(400).EUt(VA[HV]).save(provider);

    POLYMERIZATION_REACTOR_RECIPES.recipeBuilder("raw_rubber_from_oxygen")
        .circuitMeta(1)
        .inputFluids(Oxygen, 4000)
        .inputFluids(Isoprene, 288)
        .outputDust(RawRubber, 9)
        .duration(320).EUt(VA[LV]).save(provider);

    POLYMERIZATION_REACTOR_RECIPES.recipeBuilder("raw_rubber_from_tetrachloride_oxygen")
        .circuitMeta(2)
        .inputFluids(Oxygen, 7500)
        .inputFluids(Isoprene, 1080)
        .inputFluids(TitaniumTetrachloride, 50)
        .outputDust(RawRubber, 45)
        .duration(480).EUt(VA[LV]).save(provider);

    POLYMERIZATION_REACTOR_RECIPES.recipeBuilder("raw_sbr_from_oxygen")
        .circuitMeta(3)
        .inputFluids(Butadiene, 3000)
        .inputFluids(Styrene, 1000)
        .inputFluids(Oxygen, 15000)
        .outputDust(RawStyreneButadieneRubber, 41)
        .duration(480).EUt(240).save(provider);

    POLYMERIZATION_REACTOR_RECIPES.recipeBuilder("pva_from_oxygen")
        .circuitMeta(1)
        .inputFluids(Oxygen, 1000)
        .inputFluids(VinylAcetate.getFluid(L))
        .outputFluids(PolyvinylAcetate.getFluid(216))
        .duration(160).EUt(VA[LV]).save(provider);

    POLYMERIZATION_REACTOR_RECIPES.recipeBuilder("pva_from_tetrachloride_oxygen")
        .circuitMeta(2)
        .inputFluids(Oxygen, 7500)
        .inputFluids(VinylAcetate, 2160)
        .inputFluids(TitaniumTetrachloride, 100)
        .outputFluids(PolyvinylAcetate.getFluid(4320))
        .duration(800).EUt(VA[LV]).save(provider);

    POLYMERIZATION_REACTOR_RECIPES.recipeBuilder("polyethylene_from_oxygen")
        .circuitMeta(1)
        .inputFluids(Oxygen, 1000)
        .inputFluids(Ethylene.getFluid(L))
        .outputFluids(Polyethylene.getFluid(216))
        .duration(160).EUt(VA[LV]).save(provider);

    POLYMERIZATION_REACTOR_RECIPES.recipeBuilder("polyethylene_from_tetrachloride_oxygen")
        .circuitMeta(2)
        .inputFluids(Oxygen, 7500)
        .inputFluids(Ethylene, 2160)
        .inputFluids(TitaniumTetrachloride, 100)
        .outputFluids(Polyethylene.getFluid(4320))
        .duration(800).EUt(VA[LV]).save(provider);

    POLYMERIZATION_REACTOR_RECIPES.recipeBuilder("polyvinyl_chloride_from_oxygen")
        .circuitMeta(1)
        .inputFluids(Oxygen, 1000)
        .inputFluids(VinylChloride.getFluid(L))
        .outputFluids(PolyvinylChloride.getFluid(216))
        .duration(160).EUt(VA[LV]).save(provider);

    POLYMERIZATION_REACTOR_RECIPES.recipeBuilder("polyvinyl_chloride_from_tetrachloride_oxygen")
        .circuitMeta(2)
        .inputFluids(Oxygen, 7500)
        .inputFluids(VinylChloride, 2160)
        .inputFluids(TitaniumTetrachloride, 100)
        .outputFluids(PolyvinylChloride.getFluid(4320))
        .duration(800).EUt(VA[LV]).save(provider);

    POLYMERIZATION_REACTOR_RECIPES.recipeBuilder("ptfe_from_oxygen")
        .circuitMeta(1)
        .inputFluids(Oxygen, 1000)
        .inputFluids(Tetrafluoroethylene.getFluid(L))
        .outputFluids(Polytetrafluoroethylene.getFluid(216))
        .duration(160).EUt(VA[LV]).save(provider);

    POLYMERIZATION_REACTOR_RECIPES.recipeBuilder("ptfe_from_tetrachloride_oxygen")
        .circuitMeta(2)
        .inputFluids(Oxygen, 7500)
        .inputFluids(Tetrafluoroethylene, 2160)
        .inputFluids(TitaniumTetrachloride, 100)
        .outputFluids(Polytetrafluoroethylene.getFluid(4320))
        .duration(800).EUt(VA[LV]).save(provider);
    // TODO migrated disabled: unresolved old test symbol `Polystyrene`.
    // 
    // //    POLYMERIZATION_REACTOR_RECIPES.recipeBuilder("styrene_from_oxygen")
    // //        .circuitMeta(1)
    // //        .inputFluids(Oxygen, 1000)
    // //        .inputFluids(Styrene.getFluid(L))
    // //        .outputFluids(Polystyrene.getFluid(216))
    // //        .duration(160).EUt(VA[LV]).save(provider);
    // //
    // //    POLYMERIZATION_REACTOR_RECIPES.recipeBuilder("polystyrene_from_tetrachloride_oxygen")
    // //        .circuitMeta(2)
    // //        .inputFluids(Oxygen, 7500)
    // //        .inputFluids(Styrene, 2160)
    // //        .inputFluids(TitaniumTetrachloride, 100)
    // //        .outputFluids(Polystyrene.getFluid(4320))
    // //        .duration(800).EUt(VA[LV]).save(provider);

//
//    POLYMERIZATION_REACTOR_RECIPES.recipeBuilder("abs")
//        .inputFluids(AcryloNitrile, 1000)
//        .inputFluids(Butadiene, 1000)
//        .inputFluids(Styrene, 2000)
//        .outputFluids(Abs, 4000)
//        .EUt(480)
//        .duration(420)
//        .save(provider);
//
//    POLYMERIZATION_REACTOR_RECIPES.recipeBuilder("polyvinylpyrrolidone")
//        .inputDust(Sodium, 2)
//        .inputFluids(GammaButyrolactone, 1000)
//        .inputFluids(Acetaldehyde, 1000)
//        .inputFluids(Ammonia, 1000)
//        .outputFluids(Polyvinylpyrrolidone, 3000)
//        .EUt(19200)
//        .duration(1220)
//        .save(provider);
//    POLYMERIZATION_REACTOR_RECIPES.recipeBuilder("polous_polyolefin_sulfonate_dust")
//        .inputDust(SodiumHydride)
//        .outputDust(PolousPolyolefinSulfonate, 8)
//        .inputFluids(SodiumAllylsulfonate, 10000)
//        .inputFluids(Acetone, 1000)
//        .EUt(19200)
//        .duration(1200)
//        .save(provider);

    
    // C2F4 + C3F6 -> C5F10
    POLYMERIZATION_REACTOR_RECIPES.recipeBuilder("fluorinated_ethylene_propylene")
        .inputFluids(Tetrafluoroethylene.getFluid(1000))
        .inputFluids(Hexafluoropropylene.getFluid(1000))
        .outputFluids(FluorinatedEthylenePropylene.getFluid(1000))
        .EUt(1920)
        .duration(125)
        .save(provider);
  }

}
