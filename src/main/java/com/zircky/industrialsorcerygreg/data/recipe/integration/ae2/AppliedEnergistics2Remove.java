package com.zircky.industrialsorcerygreg.data.recipe.integration.ae2;

import net.minecraft.resources.ResourceLocation;

import appeng.core.AppEng;
import gripe._90.megacells.MEGACells;

import java.util.function.Consumer;

public class AppliedEnergistics2Remove {

    public static void init(Consumer<ResourceLocation> consumer) {
        ae2Remove(consumer);
        MEGACELLRemove(consumer);
    }

    private static void ae2Remove(Consumer<ResourceLocation> consumer) {
        consumer.accept(AppEng.makeId("decorative/quartz_block"));
        consumer.accept(AppEng.makeId("decorative/quartz_glass"));
        consumer.accept(AppEng.makeId("decorative/cut_quartz_block"));
        consumer.accept(AppEng.makeId("decorative/certus_quartz_bricks"));
        consumer.accept(AppEng.makeId("decorative/quartz_vibrant_glass"));
        consumer.accept(AppEng.makeId("decorative/quartz_fixture"));
        consumer.accept(AppEng.makeId("decorative/fluix_block"));
        consumer.accept(AppEng.makeId("decorative/light_detector"));

        consumer.accept(AppEng.makeId("misc/chests_sky_stone"));
        consumer.accept(AppEng.makeId("misc/chests_smooth_sky_stone"));
        consumer.accept(AppEng.makeId("misc/tiny_tnt"));

        consumer.accept(AppEng.makeId("shaped/slabs/chiseled_quartz_block"));
        consumer.accept(AppEng.makeId("shaped/slabs/cut_quartz_block"));
        consumer.accept(AppEng.makeId("shaped/slabs/fluix_block"));
        consumer.accept(AppEng.makeId("shaped/slabs/quartz_block"));
        consumer.accept(AppEng.makeId("shaped/slabs/quartz_bricks"));
        consumer.accept(AppEng.makeId("shaped/slabs/quartz_pillar"));
        consumer.accept(AppEng.makeId("shaped/slabs/sky_stone_block"));
        consumer.accept(AppEng.makeId("shaped/slabs/sky_stone_brick"));
        consumer.accept(AppEng.makeId("shaped/slabs/sky_stone_small_brick"));
        consumer.accept(AppEng.makeId("shaped/slabs/smooth_quartz_block"));
        consumer.accept(AppEng.makeId("shaped/slabs/smooth_sky_stone_block"));

        consumer.accept(AppEng.makeId("inscriber/calculation_processor_print"));
        consumer.accept(AppEng.makeId("inscriber/engineering_processor_print"));
        consumer.accept(AppEng.makeId("inscriber/logic_processor_print"));
        consumer.accept(AppEng.makeId("inscriber/silicon_print"));
        consumer.accept(AppEng.makeId("inscriber/calculation_processor"));
        consumer.accept(AppEng.makeId("inscriber/engineering_processor"));
        consumer.accept(AppEng.makeId("inscriber/logic_processor"));
        consumer.accept(AppEng.makeId("inscriber/certus_quartz_dust"));

        consumer.accept(AppEng.makeId("network/blocks/inscribers"));
        consumer.accept(AppEng.makeId("network/blocks/crystal_processing_charger"));
        consumer.accept(AppEng.makeId("network/blocks/quantum_ring"));
        consumer.accept(AppEng.makeId("network/blocks/quantum_link"));
        consumer.accept(AppEng.makeId("network/blocks/spatial_io_pylon"));
        consumer.accept(AppEng.makeId("network/blocks/spatial_io_port"));
        consumer.accept(AppEng.makeId("network/blocks/controller"));
        consumer.accept(AppEng.makeId("network/blocks/storage_drive"));
        consumer.accept(AppEng.makeId("network/blocks/storage_chest"));
        consumer.accept(AppEng.makeId("network/blocks/interfaces_interface"));
        consumer.accept(AppEng.makeId("network/blocks/pattern_providers_interface"));
        consumer.accept(AppEng.makeId("network/blocks/cell_workbench"));
        consumer.accept(AppEng.makeId("network/blocks/io_port"));
        consumer.accept(AppEng.makeId("network/blocks/io_condenser"));
        consumer.accept(AppEng.makeId("network/blocks/energy_energy_acceptor"));
        consumer.accept(AppEng.makeId("network/blocks/energy_vibration_chamber"));
        consumer.accept(AppEng.makeId("network/blocks/crystal_processing_growth_accelerator"));
        consumer.accept(AppEng.makeId("network/blocks/energy_energy_cell"));
        consumer.accept(AppEng.makeId("network/blocks/energy_dense_energy_cell"));

        consumer.accept(AppEng.makeId("network/cables/glass_fluix"));
        consumer.accept(AppEng.makeId("network/cables/glass_fluix_clean"));
        consumer.accept(AppEng.makeId("network/cables/glass_black"));
        consumer.accept(AppEng.makeId("network/cables/glass_blue"));
        consumer.accept(AppEng.makeId("network/cables/glass_brown"));
        consumer.accept(AppEng.makeId("network/cables/glass_cyan"));
        consumer.accept(AppEng.makeId("network/cables/glass_gray"));
        consumer.accept(AppEng.makeId("network/cables/glass_green"));
        consumer.accept(AppEng.makeId("network/cables/glass_light_blue"));
        consumer.accept(AppEng.makeId("network/cables/glass_light_gray"));
        consumer.accept(AppEng.makeId("network/cables/glass_lime"));
        consumer.accept(AppEng.makeId("network/cables/glass_magenta"));
        consumer.accept(AppEng.makeId("network/cables/glass_orange"));
        consumer.accept(AppEng.makeId("network/cables/glass_pink"));
        consumer.accept(AppEng.makeId("network/cables/glass_purple"));
        consumer.accept(AppEng.makeId("network/cables/glass_red"));
        consumer.accept(AppEng.makeId("network/cables/glass_white"));
        consumer.accept(AppEng.makeId("network/cables/glass_yellow"));

        consumer.accept(AppEng.makeId("network/cables/covered_fluix"));
        consumer.accept(AppEng.makeId("network/cables/covered_fluix_clean"));
        consumer.accept(AppEng.makeId("network/cables/covered_black"));
        consumer.accept(AppEng.makeId("network/cables/covered_blue"));
        consumer.accept(AppEng.makeId("network/cables/covered_brown"));
        consumer.accept(AppEng.makeId("network/cables/covered_cyan"));
        consumer.accept(AppEng.makeId("network/cables/covered_gray"));
        consumer.accept(AppEng.makeId("network/cables/covered_green"));
        consumer.accept(AppEng.makeId("network/cables/covered_light_blue"));
        consumer.accept(AppEng.makeId("network/cables/covered_light_gray"));
        consumer.accept(AppEng.makeId("network/cables/covered_lime"));
        consumer.accept(AppEng.makeId("network/cables/covered_magenta"));
        consumer.accept(AppEng.makeId("network/cables/covered_orange"));
        consumer.accept(AppEng.makeId("network/cables/covered_pink"));
        consumer.accept(AppEng.makeId("network/cables/covered_purple"));
        consumer.accept(AppEng.makeId("network/cables/covered_red"));
        consumer.accept(AppEng.makeId("network/cables/covered_white"));
        consumer.accept(AppEng.makeId("network/cables/covered_yellow"));

        consumer.accept(AppEng.makeId("network/cables/smart_fluix"));
        consumer.accept(AppEng.makeId("network/cables/smart_fluix_clean"));
        consumer.accept(AppEng.makeId("network/cables/smart_black"));
        consumer.accept(AppEng.makeId("network/cables/smart_blue"));
        consumer.accept(AppEng.makeId("network/cables/smart_brown"));
        consumer.accept(AppEng.makeId("network/cables/smart_cyan"));
        consumer.accept(AppEng.makeId("network/cables/smart_gray"));
        consumer.accept(AppEng.makeId("network/cables/smart_green"));
        consumer.accept(AppEng.makeId("network/cables/smart_light_blue"));
        consumer.accept(AppEng.makeId("network/cables/smart_light_gray"));
        consumer.accept(AppEng.makeId("network/cables/smart_lime"));
        consumer.accept(AppEng.makeId("network/cables/smart_magenta"));
        consumer.accept(AppEng.makeId("network/cables/smart_orange"));
        consumer.accept(AppEng.makeId("network/cables/smart_pink"));
        consumer.accept(AppEng.makeId("network/cables/smart_purple"));
        consumer.accept(AppEng.makeId("network/cables/smart_red"));
        consumer.accept(AppEng.makeId("network/cables/smart_white"));
        consumer.accept(AppEng.makeId("network/cables/smart_yellow"));

        consumer.accept(AppEng.makeId("network/cables/dense_covered_fluix"));
        consumer.accept(AppEng.makeId("network/cables/dense_covered_fluix_clean"));
        consumer.accept(AppEng.makeId("network/cables/dense_covered_black"));
        consumer.accept(AppEng.makeId("network/cables/dense_covered_blue"));
        consumer.accept(AppEng.makeId("network/cables/dense_covered_brown"));
        consumer.accept(AppEng.makeId("network/cables/dense_covered_cyan"));
        consumer.accept(AppEng.makeId("network/cables/dense_covered_gray"));
        consumer.accept(AppEng.makeId("network/cables/dense_covered_green"));
        consumer.accept(AppEng.makeId("network/cables/dense_covered_light_blue"));
        consumer.accept(AppEng.makeId("network/cables/dense_covered_light_gray"));
        consumer.accept(AppEng.makeId("network/cables/dense_covered_lime"));
        consumer.accept(AppEng.makeId("network/cables/dense_covered_magenta"));
        consumer.accept(AppEng.makeId("network/cables/dense_covered_orange"));
        consumer.accept(AppEng.makeId("network/cables/dense_covered_pink"));
        consumer.accept(AppEng.makeId("network/cables/dense_covered_purple"));
        consumer.accept(AppEng.makeId("network/cables/dense_covered_red"));
        consumer.accept(AppEng.makeId("network/cables/dense_covered_white"));
        consumer.accept(AppEng.makeId("network/cables/dense_covered_yellow"));

        consumer.accept(AppEng.makeId("network/cables/dense_smart_fluix"));
        consumer.accept(AppEng.makeId("network/cables/dense_smart_from_smart"));
        consumer.accept(AppEng.makeId("network/cables/dense_smart_fluix_clean"));
        consumer.accept(AppEng.makeId("network/cables/dense_smart_black"));
        consumer.accept(AppEng.makeId("network/cables/dense_smart_blue"));
        consumer.accept(AppEng.makeId("network/cables/dense_smart_brown"));
        consumer.accept(AppEng.makeId("network/cables/dense_smart_cyan"));
        consumer.accept(AppEng.makeId("network/cables/dense_smart_gray"));
        consumer.accept(AppEng.makeId("network/cables/dense_smart_green"));
        consumer.accept(AppEng.makeId("network/cables/dense_smart_light_blue"));
        consumer.accept(AppEng.makeId("network/cables/dense_smart_light_gray"));
        consumer.accept(AppEng.makeId("network/cables/dense_smart_lime"));
        consumer.accept(AppEng.makeId("network/cables/dense_smart_magenta"));
        consumer.accept(AppEng.makeId("network/cables/dense_smart_orange"));
        consumer.accept(AppEng.makeId("network/cables/dense_smart_pink"));
        consumer.accept(AppEng.makeId("network/cables/dense_smart_purple"));
        consumer.accept(AppEng.makeId("network/cables/dense_smart_red"));
        consumer.accept(AppEng.makeId("network/cables/dense_smart_white"));
        consumer.accept(AppEng.makeId("network/cables/dense_smart_yellow"));

        consumer.accept(AppEng.makeId("network/crafting/1k_cpu_crafting_storage"));
        consumer.accept(AppEng.makeId("network/crafting/4k_cpu_crafting_storage"));
        consumer.accept(AppEng.makeId("network/crafting/16k_cpu_crafting_storage"));
        consumer.accept(AppEng.makeId("network/crafting/64k_cpu_crafting_storage"));
        consumer.accept(AppEng.makeId("network/crafting/256k_cpu_crafting_storage"));
        consumer.accept(AppEng.makeId("network/crafting/cpu_crafting_accelerator"));
        consumer.accept(AppEng.makeId("network/crafting/cpu_crafting_monitor"));
        consumer.accept(AppEng.makeId("network/crafting/cpu_crafting_unit"));
        consumer.accept(AppEng.makeId("network/crafting/molecular_assembler"));
        consumer.accept(AppEng.makeId("network/crafting/patterns_blank"));

        consumer.accept(AppEng.makeId("network/cells/item_storage_components_cell_1k_part"));
        consumer.accept(AppEng.makeId("network/cells/item_storage_components_cell_4k_part"));
        consumer.accept(AppEng.makeId("network/cells/item_storage_components_cell_16k_part"));
        consumer.accept(AppEng.makeId("network/cells/item_storage_components_cell_64k_part"));
        consumer.accept(AppEng.makeId("network/cells/item_storage_components_cell_256k_part"));
        consumer.accept(AppEng.makeId("network/cells/item_cell_housing"));
        consumer.accept(AppEng.makeId("network/cells/fluid_cell_housing"));
        consumer.accept(AppEng.makeId("network/cells/fluid_storage_cell_1k"));
        consumer.accept(AppEng.makeId("network/cells/fluid_storage_cell_4k"));
        consumer.accept(AppEng.makeId("network/cells/fluid_storage_cell_16k"));
        consumer.accept(AppEng.makeId("network/cells/fluid_storage_cell_64k"));
        consumer.accept(AppEng.makeId("network/cells/fluid_storage_cell_256k"));
        consumer.accept(AppEng.makeId("network/cells/item_storage_cell_1k"));
        consumer.accept(AppEng.makeId("network/cells/item_storage_cell_4k"));
        consumer.accept(AppEng.makeId("network/cells/item_storage_cell_16k"));
        consumer.accept(AppEng.makeId("network/cells/item_storage_cell_64k"));
        consumer.accept(AppEng.makeId("network/cells/item_storage_cell_256k"));
        consumer.accept(AppEng.makeId("network/cells/view_cell"));

        //
        consumer.accept(AppEng.makeId("network/cells/spatial_storage_cell_2_cubed"));
        consumer.accept(AppEng.makeId("network/cells/spatial_storage_cell_2_cubed_storage"));
        consumer.accept(AppEng.makeId("network/cells/spatial_storage_cell_16_cubed"));
        consumer.accept(AppEng.makeId("network/cells/spatial_storage_cell_16_cubed_storage"));
        consumer.accept(AppEng.makeId("network/cells/spatial_storage_cell_128_cubed"));
        consumer.accept(AppEng.makeId("network/cells/spatial_storage_cell_128_cubed_storage"));
        consumer.accept(AppEng.makeId("network/cells/spatial_components"));
        consumer.accept(AppEng.makeId("network/cells/spatial_components_0"));
        consumer.accept(AppEng.makeId("network/cells/spatial_components_1"));

        consumer.accept(AppEng.makeId("network/wireless_access_point"));
        consumer.accept(AppEng.makeId("network/wireless_terminal"));
        consumer.accept(AppEng.makeId("network/upgrade_wireless_crafting_terminal"));
        consumer.accept(AppEng.makeId("network/wireless_crafting_terminal"));
        consumer.accept(AppEng.makeId("network/wireless_crafting_terminal"));
        consumer.accept(AppEng.makeId("network/wireless_part"));

        consumer.accept(AppEng.makeId("materials/annihilationcore"));
        consumer.accept(AppEng.makeId("materials/formationcore"));
        consumer.accept(AppEng.makeId("materials/basiccard"));
        consumer.accept(AppEng.makeId("materials/advancedcard"));
        consumer.accept(AppEng.makeId("materials/cardcapacity"));
        consumer.accept(AppEng.makeId("materials/cardcrafting"));
        consumer.accept(AppEng.makeId("materials/carddistribution"));
        consumer.accept(AppEng.makeId("materials/cardenergy"));
        consumer.accept(AppEng.makeId("materials/cardfuzzy"));
        consumer.accept(AppEng.makeId("materials/cardinverter"));
        consumer.accept(AppEng.makeId("materials/cardredstone"));
        consumer.accept(AppEng.makeId("materials/cardspeed"));
        consumer.accept(AppEng.makeId("materials/cardvoid"));

        consumer.accept(AppEng.makeId("network/parts/terminals_crafting"));
        consumer.accept(AppEng.makeId("network/parts/quartz_fiber_part"));
        consumer.accept(AppEng.makeId("network/parts/toggle_bus"));
        consumer.accept(AppEng.makeId("network/parts/toggle_bus_alt"));
        consumer.accept(AppEng.makeId("network/parts/toggle_bus_inverted_alt"));
        consumer.accept(AppEng.makeId("network/parts/level_emitter"));
        consumer.accept(AppEng.makeId("network/parts/energy_level_emitter"));
        consumer.accept(AppEng.makeId("network/parts/cable_anchor"));
        consumer.accept(AppEng.makeId("network/parts/panels_monitor"));
        consumer.accept(AppEng.makeId("network/parts/panels_semi_dark_monitor"));
        consumer.accept(AppEng.makeId("network/parts/panels_dark_monitor"));
        consumer.accept(AppEng.makeId("network/parts/storage_bus"));
        consumer.accept(AppEng.makeId("network/parts/import_bus"));
        consumer.accept(AppEng.makeId("network/parts/export_bus"));
        consumer.accept(AppEng.makeId("network/parts/tunnels_me"));
        consumer.accept(AppEng.makeId("network/parts/annihilation_plane_alt"));
        consumer.accept(AppEng.makeId("network/parts/annihilation_plane_alt2"));
        consumer.accept(AppEng.makeId("network/parts/formation_plane"));
        consumer.accept(AppEng.makeId("network/parts/formation_plane_alt"));
        consumer.accept(AppEng.makeId("network/parts/terminals"));
        consumer.accept(AppEng.makeId("network/parts/terminals_pattern_encoding"));
        consumer.accept(AppEng.makeId("network/parts/terminals_pattern_access"));

        // надо начинать сделать срафт
        consumer.accept(AppEng.makeId("network/parts/monitors_storage"));
        consumer.accept(AppEng.makeId("network/parts/monitors_conversion"));

        consumer.accept(AppEng.makeId("tools/paintballs_black"));
        consumer.accept(AppEng.makeId("tools/paintballs_blue"));
        consumer.accept(AppEng.makeId("tools/paintballs_brown"));
        consumer.accept(AppEng.makeId("tools/paintballs_cyan"));
        consumer.accept(AppEng.makeId("tools/paintballs_gray"));
        consumer.accept(AppEng.makeId("tools/paintballs_green"));
        consumer.accept(AppEng.makeId("tools/paintballs_light_blue"));
        consumer.accept(AppEng.makeId("tools/paintballs_light_gray"));
        consumer.accept(AppEng.makeId("tools/paintballs_lime"));
        consumer.accept(AppEng.makeId("tools/paintballs_magenta"));
        consumer.accept(AppEng.makeId("tools/paintballs_orange"));
        consumer.accept(AppEng.makeId("tools/paintballs_purple"));
        consumer.accept(AppEng.makeId("tools/paintballs_pink"));
        consumer.accept(AppEng.makeId("tools/paintballs_red"));
        consumer.accept(AppEng.makeId("tools/paintballs_white"));
        consumer.accept(AppEng.makeId("tools/paintballs_yellow"));
        consumer.accept(AppEng.makeId("tools/network_color_applicator"));
        consumer.accept(AppEng.makeId("tools/network_memory_card"));

        consumer.accept(AppEng.makeId("tools/paintballs_lumen_black"));
        consumer.accept(AppEng.makeId("tools/paintballs_lumen_blue"));
        consumer.accept(AppEng.makeId("tools/paintballs_lumen_brown"));
        consumer.accept(AppEng.makeId("tools/paintballs_lumen_cyan"));
        consumer.accept(AppEng.makeId("tools/paintballs_lumen_gray"));
        consumer.accept(AppEng.makeId("tools/paintballs_lumen_green"));
        consumer.accept(AppEng.makeId("tools/paintballs_lumen_light_blue"));
        consumer.accept(AppEng.makeId("tools/paintballs_lumen_light_gray"));
        consumer.accept(AppEng.makeId("tools/paintballs_lumen_lime"));
        consumer.accept(AppEng.makeId("tools/paintballs_lumen_magenta"));
        consumer.accept(AppEng.makeId("tools/paintballs_lumen_orange"));
        consumer.accept(AppEng.makeId("tools/paintballs_lumen_pink"));
        consumer.accept(AppEng.makeId("tools/paintballs_lumen_purple"));
        consumer.accept(AppEng.makeId("tools/paintballs_lumen_red"));
        consumer.accept(AppEng.makeId("tools/paintballs_lumen_white"));
        consumer.accept(AppEng.makeId("tools/paintballs_lumen_yellow"));
        consumer.accept(AppEng.makeId("tools/certus_quartz_wrench"));
        consumer.accept(AppEng.makeId("tools/nether_quartz_wrench"));
        consumer.accept(AppEng.makeId("tools/nether_quartz_cutting_knife"));
        consumer.accept(AppEng.makeId("tools/certus_quartz_cutting_knife"));
        consumer.accept(AppEng.makeId("tools/misctools_entropy_manipulator"));

        consumer.accept(AppEng.makeId("smelting/silicon_from_certus_quartz_dust"));
    }

    private static void MEGACELLRemove(Consumer<ResourceLocation> consumer) {
        consumer.accept(MEGACells.makeId("cells/cell_component_1m"));
        consumer.accept(MEGACells.makeId("cells/cell_component_4m"));
        consumer.accept(MEGACells.makeId("cells/cell_component_16m"));
        consumer.accept(MEGACells.makeId("cells/cell_component_64m"));
        consumer.accept(MEGACells.makeId("cells/cell_component_256m"));
        consumer.accept(MEGACells.makeId("cells/mega_item_cell_housing"));
        consumer.accept(MEGACells.makeId("cells/mega_fluid_cell_housing"));
        consumer.accept(MEGACells.makeId("cells/standard/fluid_storage_cell_1m"));
        consumer.accept(MEGACells.makeId("cells/standard/fluid_storage_cell_4m"));
        consumer.accept(MEGACells.makeId("cells/standard/fluid_storage_cell_16m"));
        consumer.accept(MEGACells.makeId("cells/standard/fluid_storage_cell_64m"));
        consumer.accept(MEGACells.makeId("cells/standard/fluid_storage_cell_256m"));
        consumer.accept(MEGACells.makeId("cells/standard/item_storage_cell_1m"));
        consumer.accept(MEGACells.makeId("cells/standard/item_storage_cell_4m"));
        consumer.accept(MEGACells.makeId("cells/standard/item_storage_cell_16m"));
        consumer.accept(MEGACells.makeId("cells/standard/item_storage_cell_64m"));
        consumer.accept(MEGACells.makeId("cells/standard/item_storage_cell_256m"));
        consumer.accept(MEGACells.makeId("cells/standard/fluid_storage_cell_1m_with_housing"));
        consumer.accept(MEGACells.makeId("cells/standard/fluid_storage_cell_4m_with_housing"));
        consumer.accept(MEGACells.makeId("cells/standard/fluid_storage_cell_16m_with_housing"));
        consumer.accept(MEGACells.makeId("cells/standard/fluid_storage_cell_64m_with_housing"));
        consumer.accept(MEGACells.makeId("cells/standard/fluid_storage_cell_256m_with_housing"));
        consumer.accept(MEGACells.makeId("cells/standard/item_storage_cell_1m_with_housing"));
        consumer.accept(MEGACells.makeId("cells/standard/item_storage_cell_4m_with_housing"));
        consumer.accept(MEGACells.makeId("cells/standard/item_storage_cell_16m_with_housing"));
        consumer.accept(MEGACells.makeId("cells/standard/item_storage_cell_64m_with_housing"));
        consumer.accept(MEGACells.makeId("cells/standard/item_storage_cell_256m_with_housing"));

        consumer.accept(MEGACells.makeId("crafting/1m_crafting_storage"));
        consumer.accept(MEGACells.makeId("crafting/4m_crafting_storage"));
        consumer.accept(MEGACells.makeId("crafting/16m_crafting_storage"));
        consumer.accept(MEGACells.makeId("crafting/64m_crafting_storage"));
        consumer.accept(MEGACells.makeId("crafting/256m_crafting_storage"));

        consumer.accept(MEGACells.makeId("inscriber/accumulation_processor"));
        consumer.accept(MEGACells.makeId("inscriber/accumulation_processor_print"));
        consumer.accept(MEGACells.makeId("inscriber/accumulation_processor_press"));
    }
}
