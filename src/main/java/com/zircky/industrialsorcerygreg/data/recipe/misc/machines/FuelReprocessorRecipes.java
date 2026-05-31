package com.zircky.industrialsorcerygreg.data.recipe.misc.machines;

import com.gregtechceu.gtceu.api.GTValues;
import com.zircky.industrialsorcerygreg.ISGCore;
import com.zircky.industrialsorcerygreg.common.data.ISGRecipeTypes;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Consumer;

import static com.zircky.industrialsorcerygreg.api.ISGValues.MODID_NUCLERCRAFT;

public class FuelReprocessorRecipes {
  public static void init(Consumer<FinishedRecipe> provider) {
    nuclerFuelReprocessor(provider, "depleted_fuel_americium_hea_242",
        "depleted_fuel_americium_hea_242", GTValues.EV,
        new ItemOutput("americium_243", 3),
        new ItemOutput("americium_242", 1),
        new ItemOutput("curium_246", 2),
        new ItemOutput("berkelium_247", 1),
        new ItemOutput("molybdenum_dust", 1),
        new ItemOutput("promethium_147_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_americium_hea_242_tr",
        "depleted_fuel_americium_hea_242_tr", GTValues.EV,
        new ItemOutput("americium_243", 3),
        new ItemOutput("americium_242", 1),
        new ItemOutput("curium_246", 2),
        new ItemOutput("berkelium_247", 1),
        new ItemOutput("molybdenum_dust", 1),
        new ItemOutput("promethium_147_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_americium_lea_242",
        "depleted_fuel_americium_lea_242", GTValues.EV,
        new ItemOutput("americium_243", 3),
        new ItemOutput("curium_243", 1),
        new ItemOutput("curium_246", 3),
        new ItemOutput("berkelium_248", 1),
        new ItemOutput("molybdenum_dust", 1),
        new ItemOutput("promethium_147_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_americium_lea_242_tr",
        "depleted_fuel_americium_lea_242_tr", GTValues.EV,
        new ItemOutput("americium_243", 3),
        new ItemOutput("curium_243", 1),
        new ItemOutput("curium_246", 3),
        new ItemOutput("berkelium_248", 1),
        new ItemOutput("molybdenum_dust", 1),
        new ItemOutput("promethium_147_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_thorium_tbu",
        "depleted_fuel_thorium_tbu", GTValues.EV,
        new ItemOutput("uranium_233", 1),
        new ItemOutput("uranium_238", 5),
        new ItemOutput("neptunium_236", 1),
        new ItemOutput("neptunium_237", 1),
        new ItemOutput("strontium_90_dust", 1),
        new ItemOutput("caesium_137_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_thorium_tbu_tr",
        "depleted_fuel_thorium_tbu_tr", GTValues.EV,
        new ItemOutput("uranium_233", 1),
        new ItemOutput("uranium_238", 5),
        new ItemOutput("neptunium_236", 1),
        new ItemOutput("neptunium_237", 1),
        new ItemOutput("strontium_90_dust", 1),
        new ItemOutput("caesium_137_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_uranium_leu_233",
        "depleted_fuel_uranium_leu_233", GTValues.EV,
        new ItemOutput("uranium_238", 5),
        new ItemOutput("plutonium_241", 1),
        new ItemOutput("plutonium_242", 1),
        new ItemOutput("americium_243", 1),
        new ItemOutput("strontium_90_dust", 1),
        new ItemOutput("caesium_137_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_uranium_leu_233_tr",
        "depleted_fuel_uranium_leu_233_tr", GTValues.EV,
        new ItemOutput("uranium_238", 5),
        new ItemOutput("plutonium_241", 1),
        new ItemOutput("plutonium_242", 1),
        new ItemOutput("americium_243", 1),
        new ItemOutput("strontium_90_dust", 1),
        new ItemOutput("caesium_137_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_uranium_heu_233",
        "depleted_fuel_uranium_heu_233", GTValues.EV,
        new ItemOutput("uranium_235", 1),
        new ItemOutput("uranium_238", 2),
        new ItemOutput("plutonium_242", 3),
        new ItemOutput("americium_243", 1),
        new ItemOutput("strontium_90_dust", 1),
        new ItemOutput("caesium_137_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_uranium_heu_233_tr",
        "depleted_fuel_uranium_heu_233_tr", GTValues.EV,
        new ItemOutput("uranium_235", 1),
        new ItemOutput("uranium_238", 2),
        new ItemOutput("plutonium_242", 3),
        new ItemOutput("americium_243", 1),
        new ItemOutput("strontium_90_dust", 1),
        new ItemOutput("caesium_137_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_uranium_leu_235",
        "depleted_fuel_uranium_leu_235", GTValues.EV,
        new ItemOutput("uranium_238", 4),
        new ItemOutput("plutonium_239", 1),
        new ItemOutput("plutonium_242", 1),
        new ItemOutput("americium_243", 1),
        new ItemOutput("strontium_90_dust", 1),
        new ItemOutput("caesium_137_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_uranium_leu_235_tr",
        "depleted_fuel_uranium_leu_235_tr", GTValues.EV,
        new ItemOutput("uranium_238", 4),
        new ItemOutput("plutonium_239", 1),
        new ItemOutput("plutonium_242", 1),
        new ItemOutput("americium_243", 1),
        new ItemOutput("strontium_90_dust", 1),
        new ItemOutput("caesium_137_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_uranium_heu_235",
        "depleted_fuel_uranium_heu_235", GTValues.EV,
        new ItemOutput("uranium_238", 2),
        new ItemOutput("plutonium_239", 1),
        new ItemOutput("plutonium_242", 3),
        new ItemOutput("americium_243", 1),
        new ItemOutput("strontium_90_dust", 1),
        new ItemOutput("caesium_137_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_uranium_heu_235_tr",
        "depleted_fuel_uranium_heu_235_tr", GTValues.EV,
        new ItemOutput("uranium_238", 2),
        new ItemOutput("plutonium_239", 1),
        new ItemOutput("plutonium_242", 3),
        new ItemOutput("americium_243", 1),
        new ItemOutput("strontium_90_dust", 1),
        new ItemOutput("caesium_137_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_neptunium_hen_236",
        "depleted_fuel_neptunium_hen_236", GTValues.EV,
        new ItemOutput("uranium_238", 4),
        new ItemOutput("neptunium_237", 1),
        new ItemOutput("plutonium_241", 1),
        new ItemOutput("plutonium_242", 1),
        new ItemOutput("molybdenum_dust", 1),
        new ItemOutput("caesium_137_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_neptunium_hen_236_tr",
        "depleted_fuel_neptunium_hen_236_tr", GTValues.EV,
        new ItemOutput("uranium_238", 4),
        new ItemOutput("neptunium_237", 1),
        new ItemOutput("plutonium_241", 1),
        new ItemOutput("plutonium_242", 1),
        new ItemOutput("molybdenum_dust", 1),
        new ItemOutput("caesium_137_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_neptunium_len_236",
        "depleted_fuel_neptunium_len_236", GTValues.EV,
        new ItemOutput("plutonium_242", 5),
        new ItemOutput("neptunium_237", 1),
        new ItemOutput("plutonium_241", 1),
        new ItemOutput("plutonium_242", 1),
        new ItemOutput("molybdenum_dust", 1),
        new ItemOutput("caesium_137_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_neptunium_len_236_tr",
        "depleted_fuel_neptunium_len_236_tr", GTValues.EV,
        new ItemOutput("plutonium_242", 5),
        new ItemOutput("neptunium_237", 1),
        new ItemOutput("plutonium_241", 1),
        new ItemOutput("plutonium_242", 1),
        new ItemOutput("molybdenum_dust", 1),
        new ItemOutput("caesium_137_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_plutonium_lep_239",
        "depleted_fuel_plutonium_lep_239", GTValues.EV,
        new ItemOutput("uranium_238", 4),
        new ItemOutput("americium_243", 1),
        new ItemOutput("curium_246", 1),
        new ItemOutput("plutonium_242", 1),
        new ItemOutput("promethium_147_dust", 1),
        new ItemOutput("strontium_90_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_plutonium_lep_239_tr",
        "depleted_fuel_plutonium_lep_239_tr", GTValues.EV,
        new ItemOutput("uranium_238", 4),
        new ItemOutput("americium_243", 1),
        new ItemOutput("curium_246", 1),
        new ItemOutput("plutonium_242", 1),
        new ItemOutput("promethium_147_dust", 1),
        new ItemOutput("strontium_90_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_plutonium_hep_239",
        "depleted_fuel_plutonium_hep_239", GTValues.EV,
        new ItemOutput("americium_243", 4),
        new ItemOutput("curium_243", 1),
        new ItemOutput("plutonium_241", 1),
        new ItemOutput("plutonium_242", 1),
        new ItemOutput("promethium_147_dust", 1),
        new ItemOutput("strontium_90_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_plutonium_hep_239_tr",
        "depleted_fuel_plutonium_hep_239_tr", GTValues.EV,
        new ItemOutput("americium_243", 4),
        new ItemOutput("curium_243", 1),
        new ItemOutput("plutonium_241", 1),
        new ItemOutput("plutonium_242", 1),
        new ItemOutput("promethium_147_dust", 1),
        new ItemOutput("strontium_90_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_plutonium_lep_241",
        "depleted_fuel_plutonium_lep_241", GTValues.EV,
        new ItemOutput("plutonium_242", 5),
        new ItemOutput("americium_243", 1),
        new ItemOutput("curium_246", 1),
        new ItemOutput("berkelium_247", 1),
        new ItemOutput("promethium_147_dust", 1),
        new ItemOutput("strontium_90_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_plutonium_lep_241_tr",
        "depleted_fuel_plutonium_lep_241_tr", GTValues.EV,
        new ItemOutput("plutonium_242", 5),
        new ItemOutput("americium_243", 1),
        new ItemOutput("curium_246", 1),
        new ItemOutput("berkelium_247", 1),
        new ItemOutput("promethium_147_dust", 1),
        new ItemOutput("strontium_90_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_plutonium_hep_241",
        "depleted_fuel_plutonium_hep_241", GTValues.EV,
        new ItemOutput("americium_243", 3),
        new ItemOutput("americium_241", 1),
        new ItemOutput("curium_246", 2),
        new ItemOutput("plutonium_242", 1),
        new ItemOutput("promethium_147_dust", 1),
        new ItemOutput("strontium_90_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_plutonium_hep_241_tr",
        "depleted_fuel_plutonium_hep_241_tr", GTValues.EV,
        new ItemOutput("americium_243", 3),
        new ItemOutput("americium_241", 1),
        new ItemOutput("curium_246", 2),
        new ItemOutput("plutonium_242", 1),
        new ItemOutput("promethium_147_dust", 1),
        new ItemOutput("strontium_90_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_mixed_mix_239",
        "depleted_fuel_mixed_mix_239", GTValues.EV,
        new ItemOutput("uranium_238", 4),
        new ItemOutput("plutonium_239", 1),
        new ItemOutput("plutonium_242", 1),
        new ItemOutput("americium_243", 1),
        new ItemOutput("strontium_90_dust", 1),
        new ItemOutput("caesium_137_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_mixed_mix_239_tr",
        "depleted_fuel_mixed_mix_239_tr", GTValues.EV,
        new ItemOutput("uranium_238", 4),
        new ItemOutput("plutonium_239", 1),
        new ItemOutput("plutonium_242", 1),
        new ItemOutput("americium_243", 1),
        new ItemOutput("strontium_90_dust", 1),
        new ItemOutput("caesium_137_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_mixed_mix_241",
        "depleted_fuel_mixed_mix_241", GTValues.EV,
        new ItemOutput("uranium_238", 4),
        new ItemOutput("neptunium_237", 1),
        new ItemOutput("plutonium_241", 1),
        new ItemOutput("plutonium_242", 1),
        new ItemOutput("molybdenum_dust", 1),
        new ItemOutput("caesium_137_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_mixed_mix_241_tr",
        "depleted_fuel_mixed_mix_241_tr", GTValues.EV,
        new ItemOutput("uranium_238", 4),
        new ItemOutput("neptunium_237", 1),
        new ItemOutput("plutonium_241", 1),
        new ItemOutput("plutonium_242", 1),
        new ItemOutput("molybdenum_dust", 1),
        new ItemOutput("caesium_137_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_curium_lecm_243",
        "depleted_fuel_curium_lecm_243", GTValues.EV,
        new ItemOutput("curium_246", 4),
        new ItemOutput("curium_247", 1),
        new ItemOutput("berkelium_247", 2),
        new ItemOutput("berkelium_248", 1),
        new ItemOutput("molybdenum_dust", 1),
        new ItemOutput("promethium_147_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_curium_lecm_243_tr",
        "depleted_fuel_curium_lecm_243_tr", GTValues.EV,
        new ItemOutput("curium_246", 4),
        new ItemOutput("curium_247", 1),
        new ItemOutput("berkelium_247", 2),
        new ItemOutput("berkelium_248", 1),
        new ItemOutput("molybdenum_dust", 1),
        new ItemOutput("promethium_147_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_curium_hecm_243",
        "depleted_fuel_curium_hecm_243", GTValues.EV,
        new ItemOutput("curium_245", 3),
        new ItemOutput("curium_245", 1),
        new ItemOutput("berkelium_247", 2),
        new ItemOutput("berkelium_248", 1),
        new ItemOutput("molybdenum_dust", 1),
        new ItemOutput("promethium_147_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_curium_hecm_243_tr",
        "depleted_fuel_curium_hecm_243_tr", GTValues.EV,
        new ItemOutput("curium_245", 3),
        new ItemOutput("curium_245", 1),
        new ItemOutput("berkelium_247", 2),
        new ItemOutput("berkelium_248", 1),
        new ItemOutput("molybdenum_dust", 1),
        new ItemOutput("promethium_147_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_curium_lecm_245",
        "depleted_fuel_curium_lecm_245", GTValues.EV,
        new ItemOutput("curium_246", 4),
        new ItemOutput("curium_247", 1),
        new ItemOutput("berkelium_247", 2),
        new ItemOutput("californium_249", 1),
        new ItemOutput("molybdenum_dust", 1),
        new ItemOutput("europium_155_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_curium_lecm_245_tr",
        "depleted_fuel_curium_lecm_245_tr", GTValues.EV,
        new ItemOutput("curium_246", 4),
        new ItemOutput("curium_247", 1),
        new ItemOutput("berkelium_247", 2),
        new ItemOutput("californium_249", 1),
        new ItemOutput("molybdenum_dust", 1),
        new ItemOutput("europium_155_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_curium_hecm_245",
        "depleted_fuel_curium_hecm_245", GTValues.EV,
        new ItemOutput("curium_246", 3),
        new ItemOutput("curium_247", 1),
        new ItemOutput("berkelium_247", 2),
        new ItemOutput("californium_249", 1),
        new ItemOutput("molybdenum_dust", 1),
        new ItemOutput("europium_155_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_curium_hecm_245_tr",
        "depleted_fuel_curium_hecm_245_tr", GTValues.EV,
        new ItemOutput("curium_246", 3),
        new ItemOutput("curium_247", 1),
        new ItemOutput("berkelium_247", 2),
        new ItemOutput("californium_249", 1),
        new ItemOutput("molybdenum_dust", 1),
        new ItemOutput("europium_155_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_curium_lecm_247",
        "depleted_fuel_curium_lecm_247", GTValues.EV,
        new ItemOutput("curium_246", 5),
        new ItemOutput("berkelium_247", 1),
        new ItemOutput("californium_249", 1),
        new ItemOutput("berkelium_248", 1),
        new ItemOutput("molybdenum_dust", 1),
        new ItemOutput("europium_155_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_curium_lecm_247_tr",
        "depleted_fuel_curium_lecm_247_tr", GTValues.EV,
        new ItemOutput("curium_246", 5),
        new ItemOutput("berkelium_247", 1),
        new ItemOutput("californium_249", 1),
        new ItemOutput("berkelium_248", 1),
        new ItemOutput("molybdenum_dust", 1),
        new ItemOutput("europium_155_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_curium_hecm_247",
        "depleted_fuel_curium_hecm_247", GTValues.EV,
        new ItemOutput("californium_251", 1),
        new ItemOutput("californium_249", 1),
        new ItemOutput("berkelium_247", 4),
        new ItemOutput("berkelium_248", 1),
        new ItemOutput("molybdenum_dust", 1),
        new ItemOutput("europium_155_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_curium_hecm_247_tr",
        "depleted_fuel_curium_hecm_247_tr", GTValues.EV,
        new ItemOutput("californium_251", 1),
        new ItemOutput("californium_249", 1),
        new ItemOutput("berkelium_247", 4),
        new ItemOutput("berkelium_248", 1),
        new ItemOutput("molybdenum_dust", 1),
        new ItemOutput("europium_155_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_berkelium_leb_248",
        "depleted_fuel_berkelium_leb_248", GTValues.EV,
        new ItemOutput("berkelium_247", 5),
        new ItemOutput("berkelium_248", 1),
        new ItemOutput("californium_249", 1),
        new ItemOutput("californium_251", 1),
        new ItemOutput("ruthenium_106_dust", 1),
        new ItemOutput("promethium_147_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_berkelium_leb_248_tr",
        "depleted_fuel_berkelium_leb_248_tr", GTValues.EV,
        new ItemOutput("berkelium_247", 5),
        new ItemOutput("berkelium_248", 1),
        new ItemOutput("californium_249", 1),
        new ItemOutput("californium_251", 1),
        new ItemOutput("ruthenium_106_dust", 1),
        new ItemOutput("promethium_147_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_berkelium_heb_248",
        "depleted_fuel_berkelium_heb_248", GTValues.EV,
        new ItemOutput("berkelium_248", 1),
        new ItemOutput("californium_249", 1),
        new ItemOutput("californium_251", 2),
        new ItemOutput("californium_252", 3),
        new ItemOutput("ruthenium_106_dust", 1),
        new ItemOutput("promethium_147_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_berkelium_heb_248_tr",
        "depleted_fuel_berkelium_heb_248_tr", GTValues.EV,
        new ItemOutput("berkelium_248", 1),
        new ItemOutput("californium_249", 1),
        new ItemOutput("californium_251", 2),
        new ItemOutput("californium_252", 3),
        new ItemOutput("ruthenium_106_dust", 1),
        new ItemOutput("promethium_147_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_californium_lecf_249",
        "depleted_fuel_californium_lecf_249", GTValues.EV,
        new ItemOutput("californium_252", 8),
        new ItemOutput("ruthenium_106_dust", 1),
        new ItemOutput("promethium_147_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_californium_lecf_249_tr",
        "depleted_fuel_californium_lecf_249_tr", GTValues.EV,
        new ItemOutput("californium_252", 8),
        new ItemOutput("ruthenium_106_dust", 1),
        new ItemOutput("promethium_147_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_californium_hecf_249",
        "depleted_fuel_californium_hecf_249", GTValues.EV,
        new ItemOutput("californium_252", 6),
        new ItemOutput("californium_250", 2),
        new ItemOutput("ruthenium_106_dust", 1),
        new ItemOutput("promethium_147_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_californium_hecf_249_tr",
        "depleted_fuel_californium_hecf_249_tr", GTValues.EV,
        new ItemOutput("californium_252", 6),
        new ItemOutput("californium_250", 2),
        new ItemOutput("ruthenium_106_dust", 1),
        new ItemOutput("promethium_147_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_californium_lecf_251",
        "depleted_fuel_californium_lecf_251", GTValues.EV,
        new ItemOutput("californium_252", 8),
        new ItemOutput("ruthenium_106_dust", 1),
        new ItemOutput("promethium_147_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_californium_lecf_251_tr",
        "depleted_fuel_californium_lecf_251_tr", GTValues.EV,
        new ItemOutput("californium_252", 8),
        new ItemOutput("ruthenium_106_dust", 1),
        new ItemOutput("promethium_147_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_californium_hecf_251",
        "depleted_fuel_californium_hecf_251", GTValues.EV,
        new ItemOutput("californium_252", 7),
        new ItemOutput("ruthenium_106_dust", 1),
        new ItemOutput("promethium_147_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_californium_hecf_251_tr",
        "depleted_fuel_californium_hecf_251_tr", GTValues.EV,
        new ItemOutput("californium_252", 7),
        new ItemOutput("ruthenium_106_dust", 1),
        new ItemOutput("promethium_147_dust", 1));

    nuclerFuelReprocessor(provider, "depleted_fuel_xenorium_xen_298",
        "depleted_fuel_xenorium_xen_298", GTValues.EV,
        new ItemOutput("quantite", 1),
        new ItemOutput("berkelium_247", 1),
        new ItemOutput("promethium_147_dust", 1));
  }

  private static void nuclerFuelReprocessor(Consumer<FinishedRecipe> provider, String name, String input, int eu, ItemOutput... outputs) {
    if (name == null || name.isBlank()) {
      throw new IllegalArgumentException("name must not be blank");
    }
    if (input == null || input.isBlank()) {
      throw new IllegalArgumentException("input must not be blank");
    }
    if (outputs == null || outputs.length == 0) {
      throw new IllegalArgumentException("outputs must not be empty");
    }

    final var builder = ISGRecipeTypes.FUEL_REPROCESSOR_RECIPES.recipeBuilder(ISGCore.id(name))
        .inputItems(getItem(MODID_NUCLERCRAFT, input));

    for (final ItemOutput output : outputs) {
      builder.outputItems(getItem(MODID_NUCLERCRAFT, output.itemName()), output.count());
    }

    builder.duration((int) (GTValues.MINUTES * 4))
        .EUt(GTValues.VA[eu])
        .save(provider);
  }

  private record ItemOutput(String itemName, int count) {
    private ItemOutput {
      if (itemName == null || itemName.isBlank()) {
        throw new IllegalArgumentException("itemName must not be blank");
      }
      if (count <= 0) {
        throw new IllegalArgumentException("count must be > 0");
      }
    }
  }

  private static Item getItem(final String modId, final String itemName) {
    final ResourceLocation id = ResourceLocation.fromNamespaceAndPath(modId, itemName);
    final Item item = ForgeRegistries.ITEMS.getValue(id);

    if (item == null || item == Items.AIR) {
      throw new IllegalArgumentException("Item not found: " + id);
    }

    return item;
  }


}
