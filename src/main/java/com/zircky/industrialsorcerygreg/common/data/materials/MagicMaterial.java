package com.zircky.industrialsorcerygreg.common.data.materials;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.ToolProperty;
import com.gregtechceu.gtceu.api.item.tool.GTToolType;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.zircky.industrialsorcerygreg.api.data.material.ISGMaterialFlags;
import com.zircky.industrialsorcerygreg.common.data.ISGElement;
import com.zircky.industrialsorcerygreg.common.data.ISGMaterialItems;
import net.minecraft.ChatFormatting;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty.GasTier.LOW;
import static com.zircky.industrialsorcerygreg.api.data.material.ISGMaterialFlags.CAN_BE_COOLED_DOWN_BY_BATHING;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.builderISG;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;

public class MagicMaterial {
  public static void register() {
    ManaDiamond = magicMaterial("mana_diamond")
        .gem()
        .ore()
        .components(GTMaterials.Diamond, 1)
        .flags(DISABLE_DECOMPOSITION)
        .color(0x00daef)
        .secondaryColor(0xa0f8ff)
        .iconSet(BRIGHT)
        .buildAndRegister()
        .setFormula("*Ma*C");

    Dragonstone = magicMaterial("dragonstone")
        .gem()
        .ore()
        .components(GTMaterials.SiliconDioxide, 2)
        .flags(DISABLE_DECOMPOSITION)
        .color(0xbb0067)
        .iconSet(BRIGHT)
        .buildAndRegister()
        .setFormula("*Em*4(SiO2)2");

    Livingclay = magicMaterial("livingclay")
        .ingot()
        .flags(MORTAR_GRINDABLE, GENERATE_ROD, GENERATE_PLATE)
        .color(0x391a12)
        .iconSet(ROUGH)
        .buildAndRegister();

    Livingwood = magicMaterial("livingwood")
        .wood()
        .flags(GENERATE_FRAME, GENERATE_PLATE)
        .color(0x391a12)
        .iconSet(WOOD)
        .toolStats(ToolProperty.Builder.of(2.0f, 1.0f, 256, 0, new GTToolType[] { GTToolType.SOFT_MALLET }).build())
        .buildAndRegister();

    Dreamwood = magicMaterial("dreamwood")
        .wood()
        .flags(GENERATE_FRAME, GENERATE_PLATE)
        .color(0xa6bcb6)
        .iconSet(WOOD)
        .toolStats(ToolProperty.Builder.of(4.0f, 2.0f, 1200, 0, new GTToolType[] { GTToolType.SOFT_MALLET }).build())
        .buildAndRegister();

    Shimmerwood = magicMaterial("shimmerwood")
        .wood()
        .flags(GENERATE_FRAME, GENERATE_PLATE)
        .iconSet(WOOD)
        .toolStats(ToolProperty.Builder.of(6.0f, 3.0f, 4500, 0, new GTToolType[] { GTToolType.SOFT_MALLET }).build())
        .buildAndRegister();

    Livingrock = magicMaterial("livingrock")
        .dust()
        .flags(FORCE_GENERATE_BLOCK, GENERATE_PLATE)
        .color(0xcbcdbb)
        .iconSet(FINE)
        .toolStats(ToolProperty.Builder.of(1.0F, 1, 512, 0, new GTToolType[] { GTToolType.MORTAR }).build())
        .buildAndRegister();

    Runerock = magicMaterial("runerock")
        .dust()
        .flags(FORCE_GENERATE_BLOCK, GENERATE_PLATE)
        .color(0xbcf7e5)
        .iconSet(FINE)
        .toolStats(ToolProperty.Builder.of(3.0F, 2, 18000, 0, new GTToolType[] { GTToolType.MORTAR }).build())
        .buildAndRegister();

    Shimmerrock = magicMaterial("shimmerrock")
        .dust()
        .flags(FORCE_GENERATE_BLOCK, GENERATE_PLATE)
        .iconSet(FINE)
        .toolStats(ToolProperty.Builder.of(4.0F, 3, 4500, 0, new GTToolType[] { GTToolType.MORTAR }).build())
        .buildAndRegister();

    StarStone = magicMaterial("star_stone")
        .dust()
        .iconSet(FINE)
        .buildAndRegister();

    ManaGlass = magicMaterial("mana_glass")
        .dust()
        .fluid()
        .flags(FORCE_GENERATE_BLOCK, GENERATE_PLATE, GENERATE_LENS)
        .color(0x00A7F7)
        .iconSet(GLASS)
        .buildAndRegister();

    ElfGlass = magicMaterial("elf_glass")
        .dust()
        .fluid()
        .flags(FORCE_GENERATE_BLOCK, GENERATE_PLATE, GENERATE_LENS)
        .color(0x93a2a2)
        .iconSet(GLASS)
        .buildAndRegister();

    BifrostPerm = magicMaterial("bifrost_perm")
        .dust()
        .fluid()
        .flags(FORCE_GENERATE_BLOCK, GENERATE_PLATE, GENERATE_LENS)
        .iconSet(GLASS)
        .buildAndRegister();

    Livingsteel = magicMaterial("livingsteel")
        .ingot()
        .fluid()
        .components(GTMaterials.Iron, 1)
        .flags(ISGMaterialFlags.GENERATE_CURVED_PLATE, GENERATE_FRAME, GENERATE_LONG_ROD, GENERATE_FOIL, GENERATE_GEAR, GENERATE_BOLT_SCREW)
        .color(0x2ae870)
        .iconSet(METALLIC)
        .buildAndRegister()
        .setFormula("?Fe", false);

    Manasteel = magicMaterial("manasteel")
        .ingot()
        .fluid()
        .ore()
        .element(ISGElement.MANASTEEL)
        .flags(ISGMaterialFlags.GENERATE_CURVED_PLATE, GENERATE_FRAME, GENERATE_LONG_ROD, GENERATE_FOIL, GENERATE_GEAR, GENERATE_BOLT_SCREW)
        .color(0x3396fe)
        .blastTemp(1700, LOW)
        .secondaryColor(0x2e56d7)
        .iconSet(BRIGHT)
        .toolStats(ToolProperty.Builder.of(2.0F, 6, 2500, 3, GTToolType.SWORD, GTToolType.PICKAXE, GTToolType.SHOVEL, GTToolType.AXE, GTToolType.HOE, GTToolType.MINING_HAMMER, GTToolType.SPADE, GTToolType.SAW, GTToolType.HARD_HAMMER, GTToolType.WRENCH, GTToolType.FILE, GTToolType.CROWBAR, GTToolType.SCREWDRIVER, GTToolType.WIRE_CUTTER, GTToolType.SCYTHE, GTToolType.KNIFE, GTToolType.BUTCHERY_KNIFE, GTToolType.DRILL_LV, GTToolType.DRILL_MV, GTToolType.DRILL_HV, GTToolType.DRILL_EV, GTToolType.DRILL_IV, GTToolType.CHAINSAW_LV, GTToolType.WRENCH_LV, GTToolType.WRENCH_HV, GTToolType.WRENCH_IV, GTToolType.BUZZSAW, GTToolType.SCREWDRIVER_LV, GTToolType.WIRE_CUTTER_LV, GTToolType.WIRE_CUTTER_HV, GTToolType.WIRE_CUTTER_IV).build())
        .rotorStats(160, 130, 5.0f, 400)
        .buildAndRegister();

    Terrasteel = magicMaterial("terrasteel")
        .ingot()
        .fluid()
        .flags(ISGMaterialFlags.GENERATE_CURVED_PLATE, GENERATE_FRAME, GENERATE_LONG_ROD, GENERATE_FOIL, GENERATE_GEAR, GENERATE_BOLT_SCREW, CAN_BE_COOLED_DOWN_BY_BATHING)
        .element(ISGElement.TERRASTEEL)
        .color(0x5cd12b)
        .blastTemp(2500, LOW)
        .secondaryColor(0x28b739)
        .iconSet(BRIGHT)
        .buildAndRegister();

    Elementium = magicMaterial("elementium")
        .ingot()
        .fluid()
        .ore()
        .flags(ISGMaterialFlags.GENERATE_CURVED_PLATE, GENERATE_FRAME, GENERATE_LONG_ROD, GENERATE_FOIL, GENERATE_GEAR, GENERATE_BOLT_SCREW)
        .element(ISGElement.ELEMENTIUM)
        .blastTemp(3400, LOW)
        .color(0xf766a7)
        .secondaryColor(0xf768d4)
        .iconSet(BRIGHT)
        .toolStats(ToolProperty.Builder.of(6.0F, 7, 8000, 5, GTToolType.SWORD, GTToolType.PICKAXE, GTToolType.SHOVEL, GTToolType.AXE, GTToolType.HOE, GTToolType.MINING_HAMMER, GTToolType.SPADE, GTToolType.SAW, GTToolType.HARD_HAMMER, GTToolType.WRENCH, GTToolType.FILE, GTToolType.CROWBAR, GTToolType.SCREWDRIVER, GTToolType.WIRE_CUTTER, GTToolType.SCYTHE, GTToolType.KNIFE, GTToolType.BUTCHERY_KNIFE, GTToolType.DRILL_LV, GTToolType.DRILL_MV, GTToolType.DRILL_HV, GTToolType.DRILL_EV, GTToolType.DRILL_IV, GTToolType.CHAINSAW_LV, GTToolType.WRENCH_LV, GTToolType.WRENCH_HV, GTToolType.WRENCH_IV, GTToolType.BUZZSAW, GTToolType.SCREWDRIVER_LV, GTToolType.WIRE_CUTTER_LV, GTToolType.WIRE_CUTTER_HV, GTToolType.WIRE_CUTTER_IV).build())
        .rotorStats(200, 150, 7.0f, 1600)
        .buildAndRegister();

    Alfsteel = magicMaterial("alfsteel")
        .ingot()
        .fluid()
        .blastTemp(3400, LOW)
        .element(ISGElement.ALFSTEEL)
        .flags(ISGMaterialFlags.GENERATE_CURVED_PLATE, GENERATE_FRAME, GENERATE_LONG_ROD, GENERATE_FOIL, GENERATE_GEAR, GENERATE_BOLT_SCREW)
        .color(0xffb700)
        .iconSet(BRIGHT)
        .buildAndRegister();

    Gaiasteel = magicMaterial("gaiasteel")
        .ingot()
        .fluid()
        .radioactiveHazard(1)
        .element(ISGElement.GAIASTEEL)
        .blastTemp(4300, LOW)
        .flags(ISGMaterialFlags.GENERATE_CURVED_PLATE, GENERATE_FRAME, GENERATE_LONG_ROD, GENERATE_FOIL, GENERATE_GEAR, GENERATE_BOLT_SCREW)
        .color(0x660404)
        .iconSet(BRIGHT)
        .toolStats(ToolProperty.Builder.of(16.0F, 12, 32000, 7, GTToolType.SWORD, GTToolType.PICKAXE, GTToolType.SHOVEL, GTToolType.AXE, GTToolType.HOE, GTToolType.MINING_HAMMER, GTToolType.SPADE, GTToolType.SAW, GTToolType.HARD_HAMMER, GTToolType.WRENCH, GTToolType.FILE, GTToolType.CROWBAR, GTToolType.SCREWDRIVER, GTToolType.WIRE_CUTTER, GTToolType.SCYTHE, GTToolType.KNIFE, GTToolType.BUTCHERY_KNIFE, GTToolType.DRILL_LV, GTToolType.DRILL_MV, GTToolType.DRILL_HV, GTToolType.DRILL_EV, GTToolType.DRILL_IV, GTToolType.CHAINSAW_LV, GTToolType.WRENCH_LV, GTToolType.WRENCH_HV, GTToolType.WRENCH_IV, GTToolType.BUZZSAW, GTToolType.SCREWDRIVER_LV, GTToolType.WIRE_CUTTER_LV, GTToolType.WIRE_CUTTER_HV, GTToolType.WIRE_CUTTER_IV).build())
        .rotorStats(250, 180, 9.0f, 5000)
        .buildAndRegister();

    GaiaCore = magicMaterial("gaia_core")
        .color(0x888888)
        .ore()
        .buildAndRegister();

    Gaia = magicMaterial("gaia")
        .ingot()
        .fluid()
        .element(ISGElement.GAIA)
        .blastTemp(5300, LOW)
        .flags(ISGMaterialFlags.GENERATE_CURVED_PLATE, GENERATE_FRAME, GENERATE_LONG_ROD, GENERATE_FOIL, GENERATE_GEAR, GENERATE_BOLT_SCREW)
        .iconSet(BRIGHT)
        .buildAndRegister();
  }

  public static Material.Builder magicMaterial(String name) {
    return builderISG(name).flags(ISGMaterialFlags.MAGICAL);
  }
}
