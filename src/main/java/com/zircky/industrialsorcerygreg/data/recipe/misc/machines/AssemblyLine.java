package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import com.gregtechceu.gtceu.data.recipe.CustomTags;
import com.zircky.industrialsorcerygreg.api.data.tag.ISGTagPrefix;

import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTItems.*;
import static com.gregtechceu.gtceu.common.data.GTItems.EMITTER_UV;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGCasings.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGItems.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;

import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.zircky.industrialsorcerygreg.common.data.ISGCasings;
import com.zircky.industrialsorcerygreg.common.data.ISGItems;
import com.zircky.industrialsorcerygreg.common.data.ISGMaterials;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.ASSEMBLY_LINE_RECIPES;


public class AssemblyLine {
  public static void init(Consumer<FinishedRecipe> provider) {
    ASSEMBLY_LINE_RECIPES.recipeBuilder("infinity_coil_block")
        .inputItems(ISGCasings.QUANTUM_FORCE_TRANSFORMER_COIL.asStack())
        .inputItems(TagPrefix.wireGtDouble, ISGMaterials.Infinity, 8)
        .inputItems(TagPrefix.screw, ISGMaterials.Draconium, 16)
        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 64)
        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 64)
        .inputItems(TagPrefix.foil, ISGMaterials.Kevlar, 64)
        .inputItems(TagPrefix.foil, ISGMaterials.Radox, 32)
        .inputFluids(ISGMaterials.Starmetal.getFluid(576))
        .inputFluids(ISGMaterials.CrystalMatrix.getFluid(576))
        .outputItems(ISGCasings.INFINITY_COIL_BLOCK.asStack())
        .EUt(2013265920)
        .duration(800)
        .stationResearch(b -> b.researchStack(ISGCasings.STARMETAL_COIL_BLOCK.asStack())
            .CWUt(2048)
            .EUt(2013265920))
        .save(provider);

    ASSEMBLY_LINE_RECIPES.recipeBuilder("hypogen_coil_block")
        .inputItems(ISGCasings.QUANTUM_FORCE_TRANSFORMER_COIL.asStack())
        .inputItems(TagPrefix.wireGtDouble, ISGMaterials.Hypogen, 8)
        .inputItems(TagPrefix.screw, ISGMaterials.TranscendentMetal, 16)
        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 64)
        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 64)
        .inputItems(TagPrefix.foil, ISGMaterials.Radox, 64)
        .inputItems(TagPrefix.foil, ISGMaterials.Chaos, 32)
        .inputFluids(ISGMaterials.Infinity.getFluid(576))
        .inputFluids(ISGMaterials.CosmicNeutronium.getFluid(576))
        .outputItems(ISGCasings.HYPOGEN_COIL_BLOCK.asStack())
        .EUt(8053063680L)
        .duration(800)
        .stationResearch(b -> b.researchStack(ISGCasings.INFINITY_COIL_BLOCK.asStack())
            .CWUt(4096)
            .EUt(2013265920))
        .save(provider);

    ASSEMBLY_LINE_RECIPES.recipeBuilder("eternity_coil_block")
        .inputItems(ISGCasings.QUANTUM_FORCE_TRANSFORMER_COIL.asStack())
        .inputItems(TagPrefix.wireGtDouble, ISGMaterials.SpaceTime, 8)
        .inputItems(TagPrefix.rod, ISGMaterials.Eternity, 4)
        .inputItems(ISGItems.INFINITY_SINGULARITY)
        .inputItems(ISGItems.COSMIC_FABRIC, 64)
        .inputItems(TagPrefix.screw, ISGMaterials.Infinity, 64)
        .inputItems(TagPrefix.foil, ISGMaterials.Radox, 64)
        .inputItems(TagPrefix.foil, ISGMaterials.Chaos, 64)
        .inputFluids(ISGMaterials.Hypogen.getFluid(576))
        .inputFluids(ISGMaterials.SpaceTime.getFluid(576))
        .outputItems(ISGCasings.ETERNITY_COIL_BLOCK.asStack())
        .EUt(32212254720L)
        .duration(800)
        .stationResearch(b -> b.researchStack(ISGCasings.HYPOGEN_COIL_BLOCK.asStack())
            .CWUt(8192)
            .EUt(2013265920))
        .save(provider);

    testRecipes(provider);
  }

  private static void testRecipes(Consumer<FinishedRecipe> provider) {
    // TODO migrated disabled: unresolved old test symbol `mixtures`.
    ASSEMBLY_LINE_RECIPES.recipeBuilder("uva_halide_mix_molybdenum_thorium_doped_tungsten_alumino_silicate_glass_tube_cubic_zirconia_xenon_soldering_alloy_maraging_steel250_ballast_electrum_woods_glass_yttrium_europium_vanadate_nitrogen_to_uva_halide_lamp").duration(210).EUt(7680)
        .inputDust(UVAHalideMix)
        .inputItems(foil, Molybdenum, 2)
        .inputItems(wireFine, ThoriumDopedTungsten, 4)
        .inputItems(ALUMINO_SILICATE_GLASS_TUBE.asStack())
        .inputItems(plate, CubicZirconia, 2)
        .inputFluids(Xenon.getFluid(250))
        .inputFluids(SolderingAlloy.getFluid(432))
        .inputItems(rod, MaragingSteel250, 4)
        .inputItems(BALLAST.asStack())
        .inputItems(foil, Electrum, 2)
        .inputItems(plate, WoodsGlass, 2)
        .inputDust(YttriumEuropiumVanadate, 7)
        .inputFluids(Nitrogen.getFluid(1000))
        .outputItems(UVA_HALIDE_LAMP, 2)
//        .scannerResearch(b -> b.researchStack())
        .save(provider);

    ASSEMBLY_LINE_RECIPES.recipeBuilder("uva_halide_mix_molybdenum_thorium_doped_tungsten_alumino_silicate_glass_tube_cubic_zirconia_xenon_soldering_alloy_maraging_steel250_ballast_electrum_woods_glass_strontium_europium_aluminate_nitrogen_to_uva_halide_lamp").duration(210).EUt(7680)
        .inputDust(UVAHalideMix)
        .inputItems(foil, Molybdenum, 2)
        .inputItems(wireFine, ThoriumDopedTungsten, 4)
        .inputItems(ALUMINO_SILICATE_GLASS_TUBE.asStack())
        .inputItems(plate, CubicZirconia, 2)
        .inputFluids(Xenon.getFluid(250))
        .inputFluids(SolderingAlloy.getFluid(432))
        .inputItems(rod, MaragingSteel250, 4)
        .inputItems(BALLAST.asStack())
        .inputItems(foil, Electrum, 2)
        .inputItems(plate, WoodsGlass, 2)
        .inputDust(StrontiumEuropiumAluminate, 4)
        .inputFluids(Nitrogen.getFluid(1000))
        .outputItems(UVA_HALIDE_LAMP, 2)
        .save(provider);

    ASSEMBLY_LINE_RECIPES.recipeBuilder("green_halide_mix_molybdenum_thorium_doped_tungsten_alumino_silicate_glass_tube_cubic_zirconia_xenon_soldering_alloy_maraging_steel250_ballast_electrum_borosilicate_glass_yttrium_europium_vanadate_nitrogen_to_green_halide_lamp").duration(210).EUt(7680)
        .inputDust(GreenHalideMix)
        .inputItems(foil, Molybdenum, 2)
        .inputItems(wireFine, ThoriumDopedTungsten, 4)
        .inputItems(ALUMINO_SILICATE_GLASS_TUBE.asStack())
        .inputItems(plate, CubicZirconia, 2)
        .inputFluids(Xenon.getFluid(250))
        .inputFluids(SolderingAlloy.getFluid(432))
        .inputItems(rod, MaragingSteel250, 4)
        .inputItems(BALLAST.asStack())
        .inputItems(foil, Electrum, 2)
        .inputItems(plate, BorosilicateGlass, 2)
        .inputDust(YttriumEuropiumVanadate, 7)
        .inputFluids(Nitrogen.getFluid(1000))
        .outputItems(GREEN_HALIDE_LAMP, 2)
        .save(provider);

    ASSEMBLY_LINE_RECIPES.recipeBuilder("red_halide_mix_molybdenum_thorium_doped_tungsten_alumino_silicate_glass_tube_cubic_zirconia_xenon_soldering_alloy_maraging_steel250_ballast_electrum_borosilicate_glass_yttrium_europium_vanadate_nitrogen_to_red_halide_lamp").duration(210).EUt(7680)
        .inputDust(RedHalideMix)
        .inputItems(foil, Molybdenum, 2)
        .inputItems(wireFine, ThoriumDopedTungsten, 4)
        .inputItems(ALUMINO_SILICATE_GLASS_TUBE.asStack())
        .inputItems(plate, CubicZirconia, 2)
        .inputFluids(Xenon.getFluid(250))
        .inputFluids(SolderingAlloy.getFluid(432))
        .inputItems(rod, MaragingSteel250, 4)
        .inputItems(BALLAST.asStack())
        .inputItems(foil, Electrum, 2)
        .inputItems(plate, BorosilicateGlass, 2)
        .inputDust(YttriumEuropiumVanadate, 7)
        .inputFluids(Nitrogen.getFluid(1000))
        .outputItems(RED_HALIDE_LAMP, 2)
        .save(provider);

    ASSEMBLY_LINE_RECIPES.recipeBuilder("blue_halide_mix_molybdenum_thorium_doped_tungsten_alumino_silicate_glass_tube_cubic_zirconia_xenon_soldering_alloy_maraging_steel250_ballast_electrum_borosilicate_glass_yttrium_europium_vanadate_nitrogen_to_blue_halide_lamp").duration(210).EUt(7680)
        .inputDust(BlueHalideMix)
        .inputItems(foil, Molybdenum, 2)
        .inputItems(wireFine, ThoriumDopedTungsten, 4)
        .inputItems(ALUMINO_SILICATE_GLASS_TUBE.asStack())
        .inputItems(plate, CubicZirconia, 2)
        .inputFluids(Xenon.getFluid(250))
        .inputFluids(SolderingAlloy.getFluid(432))
        .inputItems(rod, MaragingSteel250, 4)
        .inputItems(BALLAST.asStack())
        .inputItems(foil, Electrum, 2)
        .inputItems(plate, BorosilicateGlass, 2)
        .inputDust(YttriumEuropiumVanadate, 7)
        .inputFluids(Nitrogen.getFluid(1000))
        .outputItems(BLUE_HALIDE_LAMP, 2)
        .save(provider);

    ASSEMBLY_LINE_RECIPES.recipeBuilder("white_halide_mix_molybdenum_thorium_doped_tungsten_alumino_silicate_glass_tube_cubic_zirconia_xenon_soldering_alloy_maraging_steel250_ballast_electrum_borosilicate_glass_yttrium_europium_vanadate_nitrogen_to_white_halide_lamp").duration(210).EUt(7680)
        .inputDust(WhiteHalideMix)
        .inputItems(foil, Molybdenum, 2)
        .inputItems(wireFine, ThoriumDopedTungsten, 4)
        .inputItems(ALUMINO_SILICATE_GLASS_TUBE.asStack())
        .inputItems(plate, CubicZirconia, 2)
        .inputFluids(Xenon.getFluid(250))
        .inputFluids(SolderingAlloy.getFluid(432))
        .inputItems(rod, MaragingSteel250, 4)
        .inputItems(BALLAST.asStack())
        .inputItems(foil, Electrum, 2)
        .inputItems(plate, BorosilicateGlass, 2)
        .inputDust(YttriumEuropiumVanadate, 7)
        .inputFluids(Nitrogen.getFluid(1000))
        .outputItems(WHITE_HALIDE_LAMP, 2)
        .save(provider);

    ASSEMBLY_LINE_RECIPES.recipeBuilder("green_halide_mix_mixtures_molybdenum_thorium_doped_tungsten_alumino_silicate_glass_tube_cubic_zirconia_xenon_soldering_alloy_maraging_steel250_ballast_electrum_borosilicate_glass_strontium_europium_aluminate_nitrogen_to_green_halide_lamp").duration(210).EUt(7680)
        .inputItems(GreenHalideMix)
        .inputItems(foil, Molybdenum, 2)
        .inputItems(wireFine, ThoriumDopedTungsten, 4)
        .inputItems(ALUMINO_SILICATE_GLASS_TUBE.asStack())
        .inputItems(plate, CubicZirconia, 2)
        .inputFluids(Xenon.getFluid(250))
        .inputFluids(SolderingAlloy.getFluid(432))
        .inputItems(rod, MaragingSteel250, 4)
        .inputItems(BALLAST.asStack())
        .inputItems(foil, Electrum, 2)
        .inputItems(plate, BorosilicateGlass, 2)
        .inputDust(StrontiumEuropiumAluminate, 4)
        .inputFluids(Nitrogen.getFluid(1000))
        .outputItems(GREEN_HALIDE_LAMP, 2)
        .save(provider);

    ASSEMBLY_LINE_RECIPES.recipeBuilder("red_halide_mix_mixtures_molybdenum_thorium_doped_tungsten_alumino_silicate_glass_tube_cubic_zirconia_xenon_soldering_alloy_maraging_steel250_ballast_electrum_borosilicate_glass_strontium_europium_aluminate_nitrogen_to_red_halide_lamp").duration(210).EUt(7680)
        .inputItems(RedHalideMix)
        .inputItems(foil, Molybdenum, 2)
        .inputItems(wireFine, ThoriumDopedTungsten, 4)
        .inputItems(ALUMINO_SILICATE_GLASS_TUBE.asStack())
        .inputItems(plate, CubicZirconia, 2)
        .inputFluids(Xenon.getFluid(250))
        .inputFluids(SolderingAlloy.getFluid(432))
        .inputItems(rod, MaragingSteel250, 4)
        .inputItems(BALLAST.asStack())
        .inputItems(foil, Electrum, 2)
        .inputItems(plate, BorosilicateGlass, 2)
        .inputDust(StrontiumEuropiumAluminate, 4)
        .inputFluids(Nitrogen.getFluid(1000))
        .outputItems(RED_HALIDE_LAMP, 2)
        .save(provider);

    ASSEMBLY_LINE_RECIPES.recipeBuilder("blue_halide_mix_mixtures_molybdenum_thorium_doped_tungsten_alumino_silicate_glass_tube_cubic_zirconia_xenon_soldering_alloy_maraging_steel250_ballast_electrum_borosilicate_glass_strontium_europium_aluminate_nitrogen_to_blue_halide_lamp").duration(210).EUt(7680)
        .inputItems(BlueHalideMix)
        .inputItems(foil, Molybdenum, 2)
        .inputItems(wireFine, ThoriumDopedTungsten, 4)
        .inputItems(ALUMINO_SILICATE_GLASS_TUBE.asStack())
        .inputItems(plate, CubicZirconia, 2)
        .inputFluids(Xenon.getFluid(250))
        .inputFluids(SolderingAlloy.getFluid(432))
        .inputItems(rod, MaragingSteel250, 4)
        .inputItems(BALLAST.asStack())
        .inputItems(foil, Electrum, 2)
        .inputItems(plate, BorosilicateGlass, 2)
        .inputDust(StrontiumEuropiumAluminate, 4)
        .inputFluids(Nitrogen.getFluid(1000))
        .outputItems(BLUE_HALIDE_LAMP, 2)
        .save(provider);

    ASSEMBLY_LINE_RECIPES.recipeBuilder("white_halide_mix_mixtures_molybdenum_thorium_doped_tungsten_alumino_silicate_glass_tube_cubic_zirconia_xenon_soldering_alloy_maraging_steel250_ballast_electrum_borosilicate_glass_strontium_europium_aluminate_nitrogen_to_white_halide_lamp").duration(210).EUt(7680)
        .inputItems(WhiteHalideMix)
        .inputItems(foil, Molybdenum, 2)
        .inputItems(wireFine, ThoriumDopedTungsten, 4)
        .inputItems(ALUMINO_SILICATE_GLASS_TUBE.asStack())
        .inputItems(plate, CubicZirconia, 2)
        .inputFluids(Xenon.getFluid(250))
        .inputFluids(SolderingAlloy.getFluid(432))
        .inputItems(rod, MaragingSteel250, 4)
        .inputItems(BALLAST.asStack())
        .inputItems(foil, Electrum, 2)
        .inputItems(plate, BorosilicateGlass, 2)
        .inputDust(StrontiumEuropiumAluminate, 4)
        .inputFluids(Nitrogen.getFluid(1000))
        .outputItems(WHITE_HALIDE_LAMP, 2)
        .save(provider);

    ASSEMBLY_LINE_RECIPES.recipeBuilder("neodymium_magnetic_uv_superconductor_ultimet_naquadah_alloy_titanium_naquadah_enriched_to_plasma_containment_cell")
        .inputItems(rodLong, NeodymiumMagnetic, 2)
        .inputItems(wireGtSingle, EnrichedNaquadahTriniumEuropiumDuranide, 16)
        .inputItems(pipeLargeFluid, Ultimet, 4)
        .inputItems(ISGTagPrefix.CURVED_PLATE, NaquadahAlloy, 8)
        .inputFluids(Titanium.getFluid(2592))
        .inputFluids(NaquadahEnriched.getFluid(1584))
        .outputItems(PLASMA_CONTAINMENT_CELL.asStack())
        .EUt(983040)
        .duration(50)
        .save(provider);

    ASSEMBLY_LINE_RECIPES.recipeBuilder("qcd_matter_adv_fusion_coil_3_electric_pump_umv_uiv_neutronium_proto_adamantium_taranium_to_extremely_durable_plasma_cell").duration(150).EUt(15000000)
        .inputItems(frameGt, QCDMatter)
        .inputItems(FUSION_CASING_MK5)
        .inputItems(ELECTRIC_PUMP_UXV, 2)
        .inputItems(CustomTags.UIV_CIRCUITS)
        .inputItems(pipeLargeFluid, Neutronium, 4)
        .inputItems(ISGTagPrefix.CURVED_PLATE, Neutronium, 12)
        .inputFluids(ProtoAdamantium.getFluid(2592))
        .inputFluids(Taranium.getFluid(1584))
        .outputItems(EXTREMELY_DURABLE_PLASMA_CELL.asStack())
        .save(provider);

    ASSEMBLY_LINE_RECIPES.recipeBuilder("tritanium_naquadah_alloy_uv_superconductor_degenerate_rhenium_plate_emitter_uv_to_time_dilation_containment_unit").duration(100).EUt(100000)
        .inputFluids(Tritanium.getFluid(144))
        .inputItems(rod, NaquadahAlloy, 4)
        .inputItems(wireGtSingle, EnrichedNaquadahTriniumEuropiumDuranide, 2)
        .inputItems(plate, ElectronDegenerateRhenium, 4)
        .inputItems(EMITTER_UV, 2)
        .outputItems(TIME_DILATION_CONTAINMENT_UNIT.asStack())
        .save(provider);

//             ASSEMBLY_LINE_RECIPES.recipeBuilder("tritanium_naquadah_alloy_uhv_superconductor_degenerate_rhenium_plate_emitter_uhv_to_time_dilation_containment_unit").duration(100).EUt(800000)
//                     .inputFluids(Tritanium.getFluid(144))
//                     .inputItems(rod, NaquadahAlloy, 4)
//                     .inputItems(wireGtSingle, UHVSuperconductor, 2)
//                     .inputItems(plate, ElectronDegenerateRhenium, 4)
//                     .inputItems(EMITTER_UHV, 2)
//                     .outputItems(TIME_DILATION_CONTAINMENT_UNIT.asStack(4))
//                     .save(provider);
//
//             ASSEMBLY_LINE_RECIPES.recipeBuilder("tritanium_naquadah_alloy_uev_superconductor_qcd_protective_plating_field_generator_uhv_charged_lepton_trap_crystal_to_time_dilation_containment_unit").duration(100).EUt(12800000)
//                     .inputFluids(Tritanium.getFluid(144))
//                     .inputItems(rod, NaquadahAlloy, 4)
//                     .inputItems(wireGtSingle, UEVSuperconductor, 2)
//                     .inputItems(QCD_PROTECTIVE_PLATING.asStack())
//                     .inputItems(FIELD_GENERATOR_UHV.asStack(2))
//                     .inputItems(CHARGED_LEPTON_TRAP_CRYSTAL, 2)
//                     .outputItems(TIME_DILATION_CONTAINMENT_UNIT.asStack(16))
//                     .save(provider);

    // 
    //         ASSEMBLY_LINE_RECIPES.recipeBuilder("tritanium_emitter_zpm_field_generator_zpm_contained_kerr_singularity_uv_superconductor_neutronium_to_microwormhole_generator").duration(100).EUt(100000)
    //                 .inputFluids(Tritanium.getFluid(576))
    //                 .inputItems(EMITTER_ZPM.asStack(2))
    //                 .inputItems(FIELD_GENERATOR_ZPM.asStack())
    //                 .inputItems(CONTAINED_KERR_SINGULARITY.asStack())
    //                 .inputItems(wireGtSingle, UVSuperconductor, 2)
    //                 .inputItems(plate, Neutronium, 2)
    //                 .outputItems(MICROWORMHOLE_GENERATOR.asStack())
    //                 .save(provider);
    // 
    //         ASSEMBLY_LINE_RECIPES.recipeBuilder("naquadah_alloy_contained_high_density_protonic_matter_microwormhole_generator_contained_kerr_singularity_emitter_uv_field_generator_uv_sensor_uv_battery_small_lis_to_macrowormhole_generator").duration(200).EUt(1000000)
    //                 .inputFluids(NaquadahAlloy.getFluid(576))
    //                 .inputItems(CONTAINED_HIGH_DENSITY_PROTONIC_MATTER.asStack())
    //                 .inputItems(MICROWORMHOLE_GENERATOR.asStack())
    //                 .inputItems(CONTAINED_KERR_SINGULARITY.asStack())
    //                 .inputItems(EMITTER_UV.asStack(4))
    //                 .inputItems(FIELD_GENERATOR_UV.asStack(2))
    //                 .inputItems(SENSOR_UV.asStack(4))
    //                 .inputItems(BATTERY_SMALL_LIS.asStack())
    //                 .outputItems(MACROWORMHOLE_GENERATOR.asStack())
    //                 .save(provider);
    // 
    //         ASSEMBLY_LINE_RECIPES.recipeBuilder("naquadria_enriched_naquadah_alloy_neutronium_taranium_emitter_uhv_field_generator_uhv_sensor_uhv_battery_small_fluoride_contained_exotic_matter_macrowormhole_generator_to_stabilized_wormhole_generator").duration(400).EUt(6000000)
    //                 .inputFluids(Naquadria.getFluid(288))
    //                 .inputFluids(EnrichedNaquadahAlloy.getFluid(144))
    //                 .inputFluids(Neutronium.getFluid(144))
    //                 .inputFluids(Taranium.getFluid(72))
    //                 .inputItems(EMITTER_UHV.asStack(2))
    //                 .inputItems(FIELD_GENERATOR_UHV.asStack(2))
    //                 .inputItems(SENSOR_UHV.asStack(2))
    //                 .inputItems(BATTERY_SMALL_FLUORIDE.asStack())
    //                 .inputItems(CONTAINED_EXOTIC_MATTER.asStack())
    //                 .inputItems(MACROWORMHOLE_GENERATOR.asStack())
    //                 .outputItems(STABILIZED_WORMHOLE_GENERATOR.asStack())
    //                 .save(provider);
    //   

  }

}
