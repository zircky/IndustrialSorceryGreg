package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;

import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTBlocks;
import com.gregtechceu.gtceu.common.data.GTItems;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.zircky.industrialsorcerygreg.ISGCore;
import com.zircky.industrialsorcerygreg.common.data.ISGCasings;
import com.zircky.industrialsorcerygreg.common.data.ISGItems;
import com.zircky.industrialsorcerygreg.common.data.ISGMaterials;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTItems.ELECTRIC_MOTOR_UV;
import static com.gregtechceu.gtceu.common.data.GTItems.SENSOR_UV;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGItems.NANOTOME;
import static com.zircky.industrialsorcerygreg.common.data.ISGItems.SEPARATION_ELECTROMAGNET;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.Piezoelectric;
import static com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes.ASSEMBLER_RECIPES;

public class AssemblerRecipes {
  public static void init(Consumer<FinishedRecipe> provider) {
    ASSEMBLER_RECIPES.recipeBuilder(GTCEu.id("coil_cupronickel")).EUt(VA[LV])
        .inputItems(wireGtDouble, Cupronickel, 8)
        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 8)
        .inputItems(foil, Bronze, 8).inputFluids(TinAlloy, GTValues.L)
        .outputItems(GTBlocks.COIL_CUPRONICKEL.asItem()).duration(200)
        .save(provider);
    ASSEMBLER_RECIPES.recipeBuilder(GTCEu.id("coil_kanthal")).EUt(VA[MV])
        .inputItems(wireGtDouble, Kanthal, 8)
        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 8)
        .inputItems(foil, Aluminium, 8).inputFluids(Copper, GTValues.L)
        .outputItems(GTBlocks.COIL_KANTHAL.asItem()).duration(300)
        .save(provider);
    ASSEMBLER_RECIPES.recipeBuilder(GTCEu.id("coil_nichrome")).EUt(VA[HV])
        .inputItems(wireGtDouble, Nichrome, 8)
        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 8)
        .inputItems(foil, StainlessSteel, 8).inputFluids(Aluminium, GTValues.L)
        .outputItems(GTBlocks.COIL_NICHROME.asItem()).duration(400)
        .save(provider);
    ASSEMBLER_RECIPES.recipeBuilder(GTCEu.id("coil_rtm_alloy")).EUt(VA[EV])
        .inputItems(wireGtDouble, RTMAlloy, 8)
        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 8)
        .inputItems(foil, VanadiumSteel, 8).inputFluids(Nichrome, GTValues.L)
        .outputItems(GTBlocks.COIL_RTMALLOY.asItem()).duration(500)
        .save(provider);
    ASSEMBLER_RECIPES.recipeBuilder(GTCEu.id("coil_hssg")).EUt(VA[IV])
        .inputItems(wireGtDouble, HSSG, 8)
        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 8)
        .inputItems(foil, TungstenCarbide, 8).inputFluids(Tungsten, GTValues.L)
        .outputItems(GTBlocks.COIL_HSSG.asItem()).duration(600)
        .save(provider);
    ASSEMBLER_RECIPES.recipeBuilder(GTCEu.id("coil_naquadah")).EUt(VA[LuV]).inputItems(wireGtDouble, Naquadah, 8)
        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 8)
        .inputItems(foil, Osmium, 8).inputFluids(TungstenSteel, GTValues.L)
        .outputItems(GTBlocks.COIL_NAQUADAH.asItem()).duration(700)
        .save(provider);
    ASSEMBLER_RECIPES.recipeBuilder(GTCEu.id("coil_trinium")).EUt(VA[ZPM]).inputItems(wireGtDouble, Trinium, 8)
        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 8)
        .inputItems(foil, NaquadahEnriched, 8).inputFluids(Naquadah, GTValues.L)
        .outputItems(GTBlocks.COIL_TRINIUM.asItem()).duration(800)
        .save(provider);
    ASSEMBLER_RECIPES.recipeBuilder(GTCEu.id("coil_tritanium")).EUt(VA[UV]).inputItems(wireGtDouble, Tritanium, 8)
        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 8)
        .inputItems(foil, Naquadria, 8).inputFluids(Trinium, GTValues.L)
        .outputItems(GTBlocks.COIL_TRITANIUM.asItem()).duration(900)
        .save(provider);
    ASSEMBLER_RECIPES.recipeBuilder("abyssalalloy_coil_block")
        .inputItems(TagPrefix.wireGtDouble, ISGMaterials.AbyssalAlloy, 8)
        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 8)
        .inputItems(TagPrefix.foil, GTMaterials.Europium, 8)
        .inputFluids(GTMaterials.Tritanium, 144)
        .outputItems(ISGCasings.ABYSSALALLOY_COIL_BLOCK.asItem())
        .EUt(VA[UHV])
        .duration(800)
        .save(provider);
    ASSEMBLER_RECIPES.recipeBuilder("titansteel_coil_block")
        .inputItems(TagPrefix.wireGtDouble, ISGMaterials.TitanSteel, 8)
        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 8)
        .inputItems(TagPrefix.foil, ISGMaterials.Mithril, 8)
        .inputFluids(ISGMaterials.AbyssalAlloy, 144)
        .outputItems(ISGCasings.TITANSTEEL_COIL_BLOCK.asItem())
        .EUt(VA[UEV])
        .duration(800)
        .save(provider);
    ASSEMBLER_RECIPES.recipeBuilder("adamantine_coil_block")
        .inputItems(TagPrefix.wireGtDouble, ISGMaterials.Adamantine, 8)
        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 8)
        .inputItems(TagPrefix.foil, GTMaterials.Neutronium, 8)
        .inputFluids(ISGMaterials.TitanSteel, 144)
        .outputItems(ISGCasings.ADAMANTINE_COIL_BLOCK.asItem())
        .EUt(VA[UIV])
        .duration(800)
        .save(provider);
    ASSEMBLER_RECIPES.recipeBuilder("naquadriatictaranium_coil_block")
        .inputItems(TagPrefix.wireGtDouble, ISGMaterials.NaquadriaticTaranium, 8)
        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 8)
        .inputItems(TagPrefix.foil, ISGMaterials.Taranium, 8)
        .inputFluids(ISGMaterials.Adamantine, 144)
        .outputItems(ISGCasings.NAQUADRIATICTARANIUM_COIL_BLOCK.asItem())
        .EUt(VA[UXV])
        .duration(800)
        .save(provider);
    ASSEMBLER_RECIPES.recipeBuilder("starmetal_coil_block")
        .inputItems(TagPrefix.wireGtDouble, ISGMaterials.Starmetal, 8)
        .inputItems(ISGItems.MICA_INSULATOR_FOIL, 8)
        .inputItems(TagPrefix.foil, ISGMaterials.CrystalMatrix, 8)
        .inputFluids(ISGMaterials.NaquadriaticTaranium, 144)
        .outputItems(ISGCasings.STARMETAL_COIL_BLOCK.asItem())
        .EUt(VA[OpV])
        .duration(800)
        .save(provider);

    ASSEMBLER_RECIPES.recipeBuilder(ISGCore.id("space_nanomuscle_chestplate"))
        .inputItems(GTItems.NANO_CHESTPLATE)
        .inputItems("ad_astra:oxygen_gear")
        .inputItems("ad_astra:large_gas_tank", 2)
        .inputItems(GTItems.FLUID_CELL_LARGE_ALUMINIUM.asStack())
        .inputItems(GTItems.ELECTRIC_PUMP_HV, 2)
        .inputItems(GTItems.SENSOR_HV.asStack())
        .inputItems(plate, GTMaterials.SterlingSilver, 4)
        .outputItems(ISGItems.SPACE_NANOMUSCLE_CHESTPLATE)
        .inputFluids(GTMaterials.StainlessSteel, 288)
        .EUt(VA[GTValues.HV]).duration(800).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder(ISGCore.id("space_advanced_nanomuscle_chestplate"))
        .inputItems(GTItems.NANO_CHESTPLATE_ADVANCED)
        .inputItems("ad_astra:oxygen_distributor")
        .inputItems("ad_astra:large_gas_tank", 2)
        .inputItems(GTItems.FLUID_CELL_LARGE_STAINLESS_STEEL)
        .inputItems(GTItems.ELECTRIC_PUMP_EV, 2)
        .inputItems(GTItems.SENSOR_EV)
        .inputItems(plate, GTMaterials.Chromium, 4)
        .outputItems(ISGItems.SPACE_ADVANCED_NANOMUSCLE_CHESTPLATE.asItem())
        .inputFluids(GTMaterials.Titanium, 288)
        .EUt(VA[GTValues.EV]).duration(800).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder(ISGCore.id("space_quarktech_chestplate"))
        .inputItems(GTItems.QUANTUM_CHESTPLATE)
        .inputItems("ad_astra:oxygen_distributor", 2)
        .inputItems("ad_astra:large_gas_tank", 2)
        .inputItems(GTItems.FLUID_CELL_LARGE_TITANIUM)
        .inputItems(GTItems.ELECTRIC_PUMP_IV, 2)
        .inputItems(GTItems.SENSOR_IV)
        .inputItems(GTItems.FIELD_GENERATOR_IV)
        .inputItems(plate, GTMaterials.Ruthenium, 4)
        .outputItems(ISGItems.SPACE_QUARKTECH_CHESTPLATE.asItem())
        .inputFluids(GTMaterials.TungstenSteel, 576)
        .EUt(VA[GTValues.IV]).duration(800).save(provider);


    ASSEMBLER_RECIPES.recipeBuilder(ISGCore.id("space_advanced_quarktech_chestplate"))
        .inputItems(GTItems.QUANTUM_CHESTPLATE_ADVANCED)
        .inputItems("ad_astra:oxygen_distributor", 4)
        .inputItems("ad_astra:large_gas_tank", 2)
        .inputItems(GTItems.FLUID_CELL_LARGE_TUNGSTEN_STEEL)
        .inputItems(GTItems.ELECTRIC_PUMP_LuV, 2)
        .inputItems(GTItems.SENSOR_LuV, 4)
        .inputItems(GTItems.FIELD_GENERATOR_ZPM)
        .inputItems(plate, Trinium, 4)
        .outputItems(ISGItems.SPACE_ADVANCED_QUARKTECH_CHESTPLATE.asItem())
        .inputFluids(GTMaterials.RhodiumPlatedPalladium, 2304)
        .EUt(VA[GTValues.ZPM]).duration(800).save(provider);


    ASSEMBLER_RECIPES.recipeBuilder("uruium_coil_block")
        .inputItems(TagPrefix.wireGtDouble, ISGMaterials.Uruium, 64)
        .inputItems(TagPrefix.wireGtDouble, ISGMaterials.Uruium, 64)
        .inputItems(TagPrefix.ring, GTMaterials.Neutronium, 16)
        .inputItems(TagPrefix.bolt, ISGMaterials.Vibramantium, 32)
        .inputItems(TagPrefix.foil, GTMaterials.BlackSteel, 64)
        .inputItems(TagPrefix.foil, GTMaterials.Cupronickel, 64)
        .inputItems(TagPrefix.foil, GTMaterials.RutheniumTriniumAmericiumNeutronate, 64)
        .inputItems(TagPrefix.foil, GTMaterials.HSSG, 64)
        .inputItems(TagPrefix.foil, GTMaterials.StyreneButadieneRubber, 64)
        .inputFluids(GTMaterials.Molybdenum.getFluid(576))
        .outputItems(ISGCasings.URUIUM_COIL_BLOCK.asStack())
        .EUt(VA[UIV])
        .duration(600)
        .save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("separation_electromagnet").duration(600).EUt(122880)
        .inputItems(wireFine, YttriumBariumCuprate, 64)
        .inputItems(wireFine, NiobiumTitanium, 64)
        .inputItems(plate, NiobiumNitride, 8)
        .inputItems(foil, Polybenzimidazole, 16)
        .inputItems(rod, VanadiumGallium)
        .outputItems(SEPARATION_ELECTROMAGNET)
        .save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("nanotome").duration(300).EUt(200000)
        .inputItems(ELECTRIC_MOTOR_UV)
        .inputItems(SENSOR_UV)
        .inputItems(gemExquisite, Diamond)
        .inputItems(gemExquisite, Piezoelectric)
        .inputItems(rod, Duranium, 2)
        .inputItems(plate, Polybenzimidazole)
        .inputFluids(SolderingAlloy.getFluid(432))
        .outputItems(NANOTOME)
        .save(provider);


    testRecipes(provider);
  }

  private static void testRecipes(Consumer<FinishedRecipe> provider) {
    // Migrated from misc/test recipes.
    // TODO migrated disabled: unresolved old test symbol `ELECTRIC_MOTOR_LUV`.
    //         ASSEMBLER_RECIPES.recipeBuilder("rhodium_plated_palladium_electric_motor_luv_to_rapidly_rotating_crucible").duration(240).EUt(7680)
    //                 .inputItems(plate, RhodiumPlatedPalladium, 4)
    //                 .inputItems(ELECTRIC_MOTOR_LUV.asStack())
    //                 .outputItems(RAPIDLY_ROTATING_CRUCIBLE.asStack())
    //                 .save(provider);
    // 
    //         ASSEMBLER_RECIPES.recipeBuilder("acrylic_fibers_gold_to_acrylic_yarn").duration(60).EUt(24)
    //                 .inputDust(AcrylicFibers)
    //                 .inputItems(wireFine, Gold)
    //                 .outputItems(ACRYLIC_YARN.asStack())
    //                 .save(provider);
    // 
    //         ASSEMBLER_RECIPES.recipeBuilder("glucosamine_gold_polystyrene_to_boron_retaining_yarn").duration(50).EUt(480)
    //                 .inputDust(Glucosamine, 2)
    //                 .inputItems(wireFine, Gold)
    //                 .inputFluids(Polystyrene.getFluid(144))
    //                 .outputItems(BORON_RETAINING_YARN.asStack())
    //                 .save(provider);
    // 
    //         ASSEMBLER_RECIPES.recipeBuilder("polyurethane_reinforced_epoxy_resin_memory_foam_block_highly_insulating_foil_aerographene_argon_to_insulation_wire_assembly").duration(210).EUt(30720)
    //                 .inputItems(rod, Polyurethane)
    //                 .inputItems(rod, ReinforcedEpoxyResin)
    //                 .inputItems(MEMORY_FOAM_BLOCK.asStack())
    //                 .inputItems(HIGHLY_INSULATING_FOIL.asStack())
    //                 .inputItems(AEROGRAPHENE.asStack())
    //                 .inputFluids(Argon.getFluid(1000))
    //                 .outputItems(INSULATION_WIRE_ASSEMBLY.asStack(2))
    //                 .save(provider);
    // 
    //         ASSEMBLER_RECIPES.recipeBuilder("lead_zirconate_titanate_gold_soldering_alloy_to_piezoelectric_crystal").duration(430).EUt(30720)
    //                 .inputItems(gemExquisite, LeadZirconateTitanate, 2)
    //                 .inputItems(wireFine, Gold)
    //                 .inputFluids(SolderingAlloy.getFluid(288))
    //                 .outputItems(PIEZOELECTRIC_CRYSTAL.asStack())
    //                 .save(provider);
    // 
    //         ASSEMBLER_RECIPES.recipeBuilder("small_coil_carbonyl_purified_iron_annealed_copper_soldering_alloy_to_inductor").duration(290).EUt(1920)
    //                 .inputItems(SMALL_COIL.asStack(4))
    //                 .inputDust(CarbonylPurifiedIron)
    //                 .inputItems(wireFine, AnnealedCopper, 2)
    //                 .inputFluids(SolderingAlloy.getFluid(144))
    //                 .outputItems(INDUCTOR.asStack())
    //                 .save(provider);
    // 
    //         ASSEMBLER_RECIPES.recipeBuilder("resistor_inductor_cupronickel_to_ballast").duration(290).EUt(1920)
    //                 .inputItems(RESISTOR.asStack())
    //                 .inputItems(INDUCTOR.asStack())
    //                 .inputItems(wireFine, Cupronickel, 2)
    //                 .outputItems(BALLAST.asStack())
    //                 .save(provider);
    // 
    //             ASSEMBLER_RECIPES.recipeBuilder("mixtures_molybdenum_thorium_doped_tungsten_alumino_silicate_glass_tube_cubic_zirconia_argon_to_i").duration(240).EUt(1920)
    //                     .inputItems(mixtures[i].getItemStack())
    //                     .inputItems(foil, Molybdenum, 2)
    //                     .inputItems(wireFine, ThoriumDopedTungsten, 4)
    //                     .inputItems(ALUMINO_SILICATE_GLASS_TUBE.asStack())
    //                     .inputItems(plate, CubicZirconia, 2)
    //                     .inputFluids(Argon.getFluid(1000))
    //                     .outputItems(lamp_cores[i])
    //                     .save(provider);
    // 
    //                 ASSEMBLER_RECIPES.recipeBuilder("i_maraging_steel250_ballast_electrum_woods_glass_yttrium_europium_vanadate_nitrogen_to_halide_lamp").duration(290).EUt(1920)
    //                         .inputItems(lamp_cores[i])
    //                         .inputItems(rod, MaragingSteel250, 4)
    //                         .inputItems(BALLAST.asStack())
    //                         .inputItems(foil, Electrum, 2)
    //                         .inputItems(plate, WoodsGlass, 2)
    //                         .inputDust(YttriumEuropiumVanadate, 7)
    //                         .inputFluids(Nitrogen.getFluid(1000))
    //                         .outputItems(halide_lamp[i].asStack())
    //                         .save(provider);
    // 
    //                 ASSEMBLER_RECIPES.recipeBuilder("i_maraging_steel250_ballast_electrum_woods_glass_strontium_europium_aluminate_nitrogen_to_halide_lamp").duration(290).EUt(1920)
    //                         .inputItems(lamp_cores[i])
    //                         .inputItems(rod, MaragingSteel250, 4)
    //                         .inputItems(BALLAST.asStack())
    //                         .inputItems(foil, Electrum, 2)
    //                         .inputItems(plate, WoodsGlass, 2)
    //                         .inputDust(StrontiumEuropiumAluminate, 4)
    //                         .inputFluids(Nitrogen.getFluid(1000))
    //                         .outputItems(halide_lamp[i].asStack())
    //                         .save(provider);
    // 
    //                 ASSEMBLER_RECIPES.recipeBuilder("i_maraging_steel250_ballast_electrum_borosilicate_glass_yttrium_europium_vanadate_nitrogen_to_halide_lamp").duration(290).EUt(1920)
    //                         .inputItems(lamp_cores[i])
    //                         .inputItems(rod, MaragingSteel250, 4)
    //                         .inputItems(BALLAST.asStack())
    //                         .inputItems(foil, Electrum, 2)
    //                         .inputItems(plate, BorosilicateGlass, 2)
    //                         .inputDust(YttriumEuropiumVanadate, 7)
    //                         .inputFluids(Nitrogen.getFluid(1000))
    //                         .outputItems(halide_lamp[i].asStack())
    //                         .save(provider);
    // 
    //                 ASSEMBLER_RECIPES.recipeBuilder("i_maraging_steel250_ballast_electrum_borosilicate_glass_strontium_europium_aluminate_nitrogen_to_halide_lamp").duration(290).EUt(1920)
    //                         .inputItems(lamp_cores[i])
    //                         .inputItems(rod, MaragingSteel250, 4)
    //                         .inputItems(BALLAST.asStack())
    //                         .inputItems(foil, Electrum, 2)
    //                         .inputItems(plate, BorosilicateGlass, 2)
    //                         .inputDust(StrontiumEuropiumAluminate, 4)
    //                         .inputFluids(Nitrogen.getFluid(1000))
    //                         .outputItems(halide_lamp[i].asStack())
    //                         .save(provider);
    // 
    // 
    //         

// 2Th + 2Ba + 3Cu + 2Ca -> TBCC
    ASSEMBLER_RECIPES.recipeBuilder("thallium_barium_copper_calcium_to_piled_tbcc").duration(360).EUt(122880)
        .inputItems(foil, Thallium, 2)
        .inputItems(foil, Barium, 2)
        .inputItems(foil, Copper, 3)
        .inputItems(foil, Calcium, 2)
        .outputItems(ChemicalHelper.get(dust, PiledTBCC, 9))
        .save(provider);

    // TODO migrated disabled: unresolved old test symbol `GAExplosive`.
    //         ASSEMBLER_RECIPES.recipeBuilder("naquadria_gelled_toluene_uranium238_isotope_osmium_titanium_hexanitro_hexaazaisowurtzitane_glyceryl_to_naquadria_charge")
    //                 .inputDust(Naquadria)
    //                 .inputItems(GELLED_TOLUENE.asStack(2))
    //                 .inputItems(plate, Uranium238Isotope, 1)
    //                 .inputItems(bolt, Osmium, 1)
    //                 .inputItems(bolt, Titanium, 4)
    //                 .inputDust(HexanitroHexaazaisowurtzitane)
    //                 .inputFluids(Glyceryl.getFluid(1000))
    //                 .outputItems(GAMetaBlocks.EXPLOSIVE.getItemVariant(GAExplosive.ExplosiveType.NAQUADRIA_CHARGE))
    //                 .EUt(1966080)
    //                 .duration(100)
    //                 .save(provider);
    // 
    //         ASSEMBLER_RECIPES.recipeBuilder("mendelevium_gelled_toluene_naquadriatic_taranium_taranium_tritanium_degenerate_rhenium_dust_glyceryl_to_taranium_charge")
    //                 .inputItems(plate, Mendelevium)
    //                 .inputItems(GELLED_TOLUENE.asStack(4))
    //                 .inputItems(rodLong, NaquadriaticTaranium)
    //                 .inputDust(Taranium)
    //                 .inputItems(plate, Tritanium)
    //                 .inputItems(DEGENERATE_RHENIUM_DUST.asStack())
    //                 .inputFluids(Glyceryl.getFluid(2500))
    //                 .outputItems(GAMetaBlocks.EXPLOSIVE.getItemVariant(GAExplosive.ExplosiveType.TARANIUM_CHARGE))
    //                 .EUt(7_864_320)
    //                 .duration(20)
    //                 .save(provider);
    // 
    //         ASSEMBLER_RECIPES.recipeBuilder("carbon_nanotubes_cosmic_neutronium_fullerene_polymer_matrix_neutronium_doped_nanotubes_to_highly_dense_polymer_plate").duration(350).EUt(84500000)
    //                 .inputItems(plate, CarbonNanotubes, 3)
    //                 .inputItems(plate, CosmicNeutronium, 3)
    //                 .inputItems(plate, FullerenePolymerMatrix, 3)
    //                 .inputFluids(NeutroniumDopedNanotubes.getFluid(2000))
    //                 .outputItems(HIGHLY_DENSE_POLYMER_PLATE.asStack())
    //                 .save(provider);
    // 
    //             ASSEMBLER_RECIPES.recipeBuilder("molds_polybenzimidazole_polyetheretherketone_marker_materials_to_field_shapes").duration(340).EUt(122880)
    //                     .inputItems(molds[i].asStack())
    //                     .inputItems(plate, Polybenzimidazole, 2)
    //                     .inputItems(plate, Polyetheretherketone, 2)
    //                     .inputItems(circuit, MarkerMaterials.Tier.Master)
    //                     .outputItems(fieldShapes[i].asStack())
    //                     .save(provider);
    // 
    //         ASSEMBLER_RECIPES.recipeBuilder("wood_memory_foam_block_to_red_bed").duration(260).EUt(8)
    //                 .inputItems(rod, Wood, 3)
    //                 .inputItems(MEMORY_FOAM_BLOCK.asStack(3))
    //                 .outputItems(new ItemStack(Items.RED_BED))
    //                 .save(provider);
    // 
    //         ASSEMBLER_RECIPES.recipeBuilder("free_electron_gas_metastable_oganesson_vibranium_trinium_mendelevium_taranium_charge_to_leptonic_charge").duration(200).EUt(100000)
    //                 .inputFluids(FreeElectronGas.getFluid(1000))
    //                 .inputItems(plate, MetastableOganesson, 1)
    //                 .inputItems(plate, Vibranium, 1)
    //                 .inputItems(plate, Trinium)
    //                 .inputItems(dustSmall, Mendelevium, 1)
    //                 .inputItems(GAMetaBlocks.EXPLOSIVE.getItemVariant(GAExplosive.ExplosiveType.TARANIUM_CHARGE))
    //                 .outputItems(GAMetaBlocks.EXPLOSIVE.getItemVariant(GAExplosive.ExplosiveType.LEPTONIC_CHARGE))
    //                 .save(provider);
    //   

  }

}
