package com.zircky.industrialsorcerygreg.data.recipe.integration.ae2;

import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class AppliedEnergistics2Remove {
  public static void init(Consumer<ResourceLocation> consumer) {
    ae2Remove(consumer);
    MEGACELLRemove(consumer);
  }

  private static void ae2Remove(Consumer<ResourceLocation> consumer) {
    consumer.accept(ResourceLocation.tryParse("ae2:decorative/quartz_block"));
    consumer.accept(ResourceLocation.tryParse("ae2:decorative/quartz_glass"));
    consumer.accept(ResourceLocation.tryParse("ae2:decorative/cut_quartz_block"));
    consumer.accept(ResourceLocation.tryParse("ae2:decorative/certus_quartz_bricks"));
    consumer.accept(ResourceLocation.tryParse("ae2:decorative/quartz_vibrant_glass"));
    consumer.accept(ResourceLocation.tryParse("ae2:decorative/quartz_fixture"));
    consumer.accept(ResourceLocation.tryParse("ae2:decorative/fluix_block"));
    consumer.accept(ResourceLocation.tryParse("ae2:decorative/light_detector"));

    consumer.accept(ResourceLocation.tryParse("ae2:misc/chests_sky_stone"));
    consumer.accept(ResourceLocation.tryParse("ae2:misc/chests_smooth_sky_stone"));
    consumer.accept(ResourceLocation.tryParse("ae2:misc/tiny_tnt"));

    consumer.accept(ResourceLocation.tryParse("ae2:shaped/slabs/chiseled_quartz_block"));
    consumer.accept(ResourceLocation.tryParse("ae2:shaped/slabs/cut_quartz_block"));
    consumer.accept(ResourceLocation.tryParse("ae2:shaped/slabs/fluix_block"));
    consumer.accept(ResourceLocation.tryParse("ae2:shaped/slabs/quartz_block"));
    consumer.accept(ResourceLocation.tryParse("ae2:shaped/slabs/quartz_bricks"));
    consumer.accept(ResourceLocation.tryParse("ae2:shaped/slabs/quartz_pillar"));
    consumer.accept(ResourceLocation.tryParse("ae2:shaped/slabs/sky_stone_block"));
    consumer.accept(ResourceLocation.tryParse("ae2:shaped/slabs/sky_stone_brick"));
    consumer.accept(ResourceLocation.tryParse("ae2:shaped/slabs/sky_stone_small_brick"));
    consumer.accept(ResourceLocation.tryParse("ae2:shaped/slabs/smooth_quartz_block"));
    consumer.accept(ResourceLocation.tryParse("ae2:shaped/slabs/smooth_sky_stone_block"));


    consumer.accept(ResourceLocation.tryParse("ae2:inscriber/calculation_processor_print"));
    consumer.accept(ResourceLocation.tryParse("ae2:inscriber/engineering_processor_print"));
    consumer.accept(ResourceLocation.tryParse("ae2:inscriber/logic_processor_print"));
    consumer.accept(ResourceLocation.tryParse("ae2:inscriber/silicon_print"));
    consumer.accept(ResourceLocation.tryParse("ae2:inscriber/calculation_processor"));
    consumer.accept(ResourceLocation.tryParse("ae2:inscriber/engineering_processor"));
    consumer.accept(ResourceLocation.tryParse("ae2:inscriber/logic_processor"));
    consumer.accept(ResourceLocation.tryParse("ae2:inscriber/certus_quartz_dust"));

    consumer.accept(ResourceLocation.tryParse("ae2:network/blocks/inscribers"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/blocks/crystal_processing_charger"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/blocks/quantum_ring"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/blocks/quantum_link"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/blocks/spatial_io_pylon"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/blocks/spatial_io_port"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/blocks/controller"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/blocks/storage_drive"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/blocks/storage_chest"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/blocks/interfaces_interface"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/blocks/pattern_providers_interface"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/blocks/cell_workbench"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/blocks/io_port"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/blocks/io_condenser"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/blocks/energy_energy_acceptor"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/blocks/energy_vibration_chamber"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/blocks/crystal_processing_growth_accelerator"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/blocks/energy_energy_cell"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/blocks/energy_dense_energy_cell"));

    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/glass_fluix"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/glass_fluix_clean"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/glass_black"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/glass_blue"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/glass_brown"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/glass_cyan"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/glass_gray"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/glass_green"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/glass_light_blue"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/glass_light_gray"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/glass_lime"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/glass_magenta"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/glass_orange"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/glass_pink"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/glass_purple"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/glass_red"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/glass_white"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/glass_yellow"));

    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/covered_fluix"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/covered_fluix_clean"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/covered_black"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/covered_blue"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/covered_brown"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/covered_cyan"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/covered_gray"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/covered_green"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/covered_light_blue"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/covered_light_gray"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/covered_lime"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/covered_magenta"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/covered_orange"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/covered_pink"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/covered_purple"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/covered_red"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/covered_white"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/covered_yellow"));

    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/smart_fluix"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/smart_fluix_clean"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/smart_black"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/smart_blue"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/smart_brown"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/smart_cyan"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/smart_gray"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/smart_green"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/smart_light_blue"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/smart_light_gray"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/smart_lime"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/smart_magenta"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/smart_orange"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/smart_pink"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/smart_purple"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/smart_red"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/smart_white"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/smart_yellow"));

    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/dense_covered_fluix"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/dense_covered_fluix_clean"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/dense_covered_black"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/dense_covered_blue"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/dense_covered_brown"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/dense_covered_cyan"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/dense_covered_gray"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/dense_covered_green"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/dense_covered_light_blue"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/dense_covered_light_gray"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/dense_covered_lime"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/dense_covered_magenta"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/dense_covered_orange"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/dense_covered_pink"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/dense_covered_purple"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/dense_covered_red"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/dense_covered_white"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/dense_covered_yellow"));

    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/dense_smart_fluix"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/dense_smart_from_smart"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/dense_smart_fluix_clean"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/dense_smart_black"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/dense_smart_blue"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/dense_smart_brown"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/dense_smart_cyan"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/dense_smart_gray"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/dense_smart_green"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/dense_smart_light_blue"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/dense_smart_light_gray"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/dense_smart_lime"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/dense_smart_magenta"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/dense_smart_orange"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/dense_smart_pink"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/dense_smart_purple"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/dense_smart_red"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/dense_smart_white"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cables/dense_smart_yellow"));

    consumer.accept(ResourceLocation.tryParse("ae2:network/crafting/1k_cpu_crafting_storage"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/crafting/4k_cpu_crafting_storage"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/crafting/16k_cpu_crafting_storage"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/crafting/64k_cpu_crafting_storage"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/crafting/256k_cpu_crafting_storage"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/crafting/cpu_crafting_accelerator"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/crafting/cpu_crafting_monitor"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/crafting/cpu_crafting_unit"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/crafting/molecular_assembler"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/crafting/patterns_blank"));

    consumer.accept(ResourceLocation.tryParse("ae2:network/cells/item_storage_components_cell_1k_part"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cells/item_storage_components_cell_4k_part"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cells/item_storage_components_cell_16k_part"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cells/item_storage_components_cell_64k_part"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cells/item_storage_components_cell_256k_part"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cells/item_cell_housing"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cells/fluid_cell_housing"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cells/fluid_storage_cell_1k"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cells/fluid_storage_cell_4k"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cells/fluid_storage_cell_16k"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cells/fluid_storage_cell_64k"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cells/fluid_storage_cell_256k"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cells/item_storage_cell_1k"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cells/item_storage_cell_4k"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cells/item_storage_cell_16k"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cells/item_storage_cell_64k"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cells/item_storage_cell_256k"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cells/view_cell"));

    //
    consumer.accept(ResourceLocation.tryParse("ae2:network/cells/spatial_storage_cell_2_cubed"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cells/spatial_storage_cell_2_cubed_storage"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cells/spatial_storage_cell_16_cubed"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cells/spatial_storage_cell_16_cubed_storage"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cells/spatial_storage_cell_128_cubed"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cells/spatial_storage_cell_128_cubed_storage"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cells/spatial_components"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cells/spatial_components_0"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/cells/spatial_components_1"));

    consumer.accept(ResourceLocation.tryParse("ae2:network/wireless_access_point"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/wireless_terminal"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/upgrade_wireless_crafting_terminal"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/wireless_crafting_terminal"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/wireless_crafting_terminal"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/wireless_part"));

    consumer.accept(ResourceLocation.tryParse("ae2:materials/annihilationcore"));
    consumer.accept(ResourceLocation.tryParse("ae2:materials/formationcore"));
    consumer.accept(ResourceLocation.tryParse("ae2:materials/basiccard"));
    consumer.accept(ResourceLocation.tryParse("ae2:materials/advancedcard"));
    consumer.accept(ResourceLocation.tryParse("ae2:materials/cardcapacity"));
    consumer.accept(ResourceLocation.tryParse("ae2:materials/cardcrafting"));
    consumer.accept(ResourceLocation.tryParse("ae2:materials/carddistribution"));
    consumer.accept(ResourceLocation.tryParse("ae2:materials/cardenergy"));
    consumer.accept(ResourceLocation.tryParse("ae2:materials/cardfuzzy"));
    consumer.accept(ResourceLocation.tryParse("ae2:materials/cardinverter"));
    consumer.accept(ResourceLocation.tryParse("ae2:materials/cardredstone"));
    consumer.accept(ResourceLocation.tryParse("ae2:materials/cardspeed"));
    consumer.accept(ResourceLocation.tryParse("ae2:materials/cardvoid"));

    consumer.accept(ResourceLocation.tryParse("ae2:network/parts/terminals_crafting"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/parts/quartz_fiber_part"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/parts/toggle_bus"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/parts/toggle_bus_alt"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/parts/toggle_bus_inverted_alt"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/parts/level_emitter"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/parts/energy_level_emitter"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/parts/cable_anchor"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/parts/panels_monitor"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/parts/panels_semi_dark_monitor"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/parts/panels_dark_monitor"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/parts/storage_bus"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/parts/import_bus"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/parts/export_bus"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/parts/tunnels_me"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/parts/annihilation_plane_alt"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/parts/annihilation_plane_alt2"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/parts/formation_plane"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/parts/formation_plane_alt"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/parts/terminals"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/parts/terminals_pattern_encoding"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/parts/terminals_pattern_access"));

    //надо начинать сделать срафт
    consumer.accept(ResourceLocation.tryParse("ae2:network/parts/monitors_storage"));
    consumer.accept(ResourceLocation.tryParse("ae2:network/parts/monitors_conversion"));

    consumer.accept(ResourceLocation.tryParse("ae2:tools/paintballs_black"));
    consumer.accept(ResourceLocation.tryParse("ae2:tools/paintballs_blue"));
    consumer.accept(ResourceLocation.tryParse("ae2:tools/paintballs_brown"));
    consumer.accept(ResourceLocation.tryParse("ae2:tools/paintballs_cyan"));
    consumer.accept(ResourceLocation.tryParse("ae2:tools/paintballs_gray"));
    consumer.accept(ResourceLocation.tryParse("ae2:tools/paintballs_green"));
    consumer.accept(ResourceLocation.tryParse("ae2:tools/paintballs_light_blue"));
    consumer.accept(ResourceLocation.tryParse("ae2:tools/paintballs_light_gray"));
    consumer.accept(ResourceLocation.tryParse("ae2:tools/paintballs_lime"));
    consumer.accept(ResourceLocation.tryParse("ae2:tools/paintballs_magenta"));
    consumer.accept(ResourceLocation.tryParse("ae2:tools/paintballs_orange"));
    consumer.accept(ResourceLocation.tryParse("ae2:tools/paintballs_purple"));
    consumer.accept(ResourceLocation.tryParse("ae2:tools/paintballs_pink"));
    consumer.accept(ResourceLocation.tryParse("ae2:tools/paintballs_red"));
    consumer.accept(ResourceLocation.tryParse("ae2:tools/paintballs_white"));
    consumer.accept(ResourceLocation.tryParse("ae2:tools/paintballs_yellow"));
    consumer.accept(ResourceLocation.tryParse("ae2:tools/network_color_applicator"));
    consumer.accept(ResourceLocation.tryParse("ae2:tools/network_memory_card"));

    consumer.accept(ResourceLocation.tryParse("ae2:tools/paintballs_lumen_black"));
    consumer.accept(ResourceLocation.tryParse("ae2:tools/paintballs_lumen_blue"));
    consumer.accept(ResourceLocation.tryParse("ae2:tools/paintballs_lumen_brown"));
    consumer.accept(ResourceLocation.tryParse("ae2:tools/paintballs_lumen_cyan"));
    consumer.accept(ResourceLocation.tryParse("ae2:tools/paintballs_lumen_gray"));
    consumer.accept(ResourceLocation.tryParse("ae2:tools/paintballs_lumen_green"));
    consumer.accept(ResourceLocation.tryParse("ae2:tools/paintballs_lumen_light_blue"));
    consumer.accept(ResourceLocation.tryParse("ae2:tools/paintballs_lumen_light_gray"));
    consumer.accept(ResourceLocation.tryParse("ae2:tools/paintballs_lumen_lime"));
    consumer.accept(ResourceLocation.tryParse("ae2:tools/paintballs_lumen_magenta"));
    consumer.accept(ResourceLocation.tryParse("ae2:tools/paintballs_lumen_orange"));
    consumer.accept(ResourceLocation.tryParse("ae2:tools/paintballs_lumen_pink"));
    consumer.accept(ResourceLocation.tryParse("ae2:tools/paintballs_lumen_purple"));
    consumer.accept(ResourceLocation.tryParse("ae2:tools/paintballs_lumen_red"));
    consumer.accept(ResourceLocation.tryParse("ae2:tools/paintballs_lumen_white"));
    consumer.accept(ResourceLocation.tryParse("ae2:tools/paintballs_lumen_yellow"));
    consumer.accept(ResourceLocation.tryParse("ae2:tools/certus_quartz_wrench"));
    consumer.accept(ResourceLocation.tryParse("ae2:tools/nether_quartz_wrench"));
    consumer.accept(ResourceLocation.tryParse("ae2:tools/nether_quartz_cutting_knife"));
    consumer.accept(ResourceLocation.tryParse("ae2:tools/certus_quartz_cutting_knife"));
    consumer.accept(ResourceLocation.tryParse("ae2:tools/misctools_entropy_manipulator"));

    consumer.accept(ResourceLocation.tryParse("ae2:smelting/silicon_from_certus_quartz_dust"));



  }

  private static void MEGACELLRemove(Consumer<ResourceLocation> consumer) {
    consumer.accept(ResourceLocation.tryParse("megacells:cells/cell_component_1m"));
    consumer.accept(ResourceLocation.tryParse("megacells:cells/cell_component_4m"));
    consumer.accept(ResourceLocation.tryParse("megacells:cells/cell_component_16m"));
    consumer.accept(ResourceLocation.tryParse("megacells:cells/cell_component_64m"));
    consumer.accept(ResourceLocation.tryParse("megacells:cells/cell_component_256m"));
    consumer.accept(ResourceLocation.tryParse("megacells:cells/mega_item_cell_housing"));
    consumer.accept(ResourceLocation.tryParse("megacells:cells/mega_fluid_cell_housing"));
    consumer.accept(ResourceLocation.tryParse("megacells:cells/standard/fluid_storage_cell_1m"));
    consumer.accept(ResourceLocation.tryParse("megacells:cells/standard/fluid_storage_cell_4m"));
    consumer.accept(ResourceLocation.tryParse("megacells:cells/standard/fluid_storage_cell_16m"));
    consumer.accept(ResourceLocation.tryParse("megacells:cells/standard/fluid_storage_cell_64m"));
    consumer.accept(ResourceLocation.tryParse("megacells:cells/standard/fluid_storage_cell_256m"));
    consumer.accept(ResourceLocation.tryParse("megacells:cells/standard/item_storage_cell_1m"));
    consumer.accept(ResourceLocation.tryParse("megacells:cells/standard/item_storage_cell_4m"));
    consumer.accept(ResourceLocation.tryParse("megacells:cells/standard/item_storage_cell_16m"));
    consumer.accept(ResourceLocation.tryParse("megacells:cells/standard/item_storage_cell_64m"));
    consumer.accept(ResourceLocation.tryParse("megacells:cells/standard/item_storage_cell_256m"));
    consumer.accept(ResourceLocation.tryParse("megacells:cells/standard/fluid_storage_cell_1m_with_housing"));
    consumer.accept(ResourceLocation.tryParse("megacells:cells/standard/fluid_storage_cell_4m_with_housing"));
    consumer.accept(ResourceLocation.tryParse("megacells:cells/standard/fluid_storage_cell_16m_with_housing"));
    consumer.accept(ResourceLocation.tryParse("megacells:cells/standard/fluid_storage_cell_64m_with_housing"));
    consumer.accept(ResourceLocation.tryParse("megacells:cells/standard/fluid_storage_cell_256m_with_housing"));
    consumer.accept(ResourceLocation.tryParse("megacells:cells/standard/item_storage_cell_1m_with_housing"));
    consumer.accept(ResourceLocation.tryParse("megacells:cells/standard/item_storage_cell_4m_with_housing"));
    consumer.accept(ResourceLocation.tryParse("megacells:cells/standard/item_storage_cell_16m_with_housing"));
    consumer.accept(ResourceLocation.tryParse("megacells:cells/standard/item_storage_cell_64m_with_housing"));
    consumer.accept(ResourceLocation.tryParse("megacells:cells/standard/item_storage_cell_256m_with_housing"));

    consumer.accept(ResourceLocation.tryParse("megacells:crafting/1m_crafting_storage"));
    consumer.accept(ResourceLocation.tryParse("megacells:crafting/4m_crafting_storage"));
    consumer.accept(ResourceLocation.tryParse("megacells:crafting/16m_crafting_storage"));
    consumer.accept(ResourceLocation.tryParse("megacells:crafting/64m_crafting_storage"));
    consumer.accept(ResourceLocation.tryParse("megacells:crafting/256m_crafting_storage"));

    consumer.accept(ResourceLocation.tryParse("megacells:inscriber/accumulation_processor"));
    consumer.accept(ResourceLocation.tryParse("megacells:inscriber/accumulation_processor_print"));
    consumer.accept(ResourceLocation.tryParse("megacells:inscriber/accumulation_processor_press"));
  }
}
