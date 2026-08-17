package com.zircky.industrialsorcerygreg.data.recipe.builder;


import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.capability.recipe.*;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.MaterialEntry;
import com.gregtechceu.gtceu.api.data.medicalcondition.MedicalCondition;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.item.component.IDataItem;
import com.gregtechceu.gtceu.api.machine.MachineDefinition;
import com.gregtechceu.gtceu.api.machine.multiblock.CleanroomType;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.gregtechceu.gtceu.api.recipe.ResearchRecipeBuilder;
import com.gregtechceu.gtceu.api.recipe.chance.logic.ChanceLogic;
import com.gregtechceu.gtceu.api.recipe.ingredient.*;
import com.gregtechceu.gtceu.api.recipe.ingredient.nbtpredicate.NBTPredicate;
import com.gregtechceu.gtceu.data.recipe.builder.GTRecipeBuilder;
import com.zircky.industrialsorcerygreg.api.recipe.ISGRecipeType;
import com.zircky.industrialsorcerygreg.api.recipe.LayeredRecipeHelper;
import com.zircky.industrialsorcerygreg.common.data.recipe.NeutronActivatorCondition;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.nbt.Tag;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.fluids.FluidStack;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class ISGRecipeBuilder extends GTRecipeBuilder {
  public ISGRecipeBuilder(ResourceLocation id, GTRecipeType recipeType) {
    super(id, recipeType);
  }

  @Override
  public FinishedRecipe build() {
    LayeredRecipeHelper.applyLayeredRecipeModifications(this);
    return super.build();
  }

  @Override
  public void save(Consumer<FinishedRecipe> consumer) {
    LayeredRecipeHelper.applyLayeredRecipeModifications(this);
    super.save(consumer);
  }

  @Override
  public ISGRecipeBuilder duration(int duration) {
    super.duration(duration);
    return this;
  }

  @Override
  public ISGRecipeBuilder inputEU(long eu) {
    super.inputEU(eu);
    return this;
  }

  @Override
  public ISGRecipeBuilder inputEU(long voltage, long amperage) {
    super.inputEU(voltage, amperage);
    return this;
  }

  @Override
  public ISGRecipeBuilder EUt(long eu) {
    super.EUt(eu);
    return this;
  }

  @Override
  public ISGRecipeBuilder EUt(long voltage, long amperage) {
    super.EUt(voltage, amperage);
    return this;
  }

  @Override
  public ISGRecipeBuilder outputEU(long eu) {
    super.outputEU(eu);
    return this;
  }

  @Override
  public ISGRecipeBuilder outputEU(long voltage, long amperage) {
    super.outputEU(voltage, amperage);
    return this;
  }

  @Override
  public ISGRecipeBuilder inputCWU(int cwu) {
    super.inputCWU(cwu);
    return this;
  }

  @Override
  public ISGRecipeBuilder CWUt(int cwu) {
    super.CWUt(cwu);
    return this;
  }

  @Override
  public ISGRecipeBuilder totalCWU(int cwu) {
    super.totalCWU(cwu);
    return this;
  }

  @Override
  public ISGRecipeBuilder outputCWU(int cwu) {
    super.outputCWU(cwu);
    return this;
  }

  @Override
  public ISGRecipeBuilder inputItems(Object input) {
    super.inputItems(input);
    return this;
  }

  @Override
  public ISGRecipeBuilder inputItems(Object input, int count) {
    super.inputItems(input, count);
    return this;
  }

  @Override
  public ISGRecipeBuilder inputItems(Ingredient inputs) {
    super.inputItems(inputs);
    return this;
  }

  @Override
  public ISGRecipeBuilder inputItems(Ingredient... inputs) {
    super.inputItems(inputs);
    return this;
  }

  @Override
  public ISGRecipeBuilder inputItems(Ingredient inputs, int count) {
    super.inputItems(inputs, count);
    return this;
  }

  @Override
  public ISGRecipeBuilder inputItems(ItemStack input) {
    super.inputItems(input);
    return this;
  }

  @Override
  public ISGRecipeBuilder inputItems(ItemStack... inputs) {
    super.inputItems(inputs);
    return this;
  }

  @Override
  public ISGRecipeBuilder inputItems(TagKey<Item> tag, int amount) {
    super.inputItems(tag, amount);
    return this;
  }

  @Override
  public ISGRecipeBuilder inputItems(TagKey<Item> tag) {
    super.inputItems(tag);
    return this;
  }

  @Override
  public ISGRecipeBuilder inputItems(Item input, int amount) {
    super.inputItems(input, amount);
    return this;
  }

  @Override
  public ISGRecipeBuilder inputItems(Item input) {
    super.inputItems(input);
    return this;
  }

  @Override
  public ISGRecipeBuilder inputItems(Supplier<? extends Item> input) {
    super.inputItems(input);
    return this;
  }

  @Override
  public ISGRecipeBuilder inputItems(Supplier<? extends Item> input, int amount) {
    super.inputItems(input, amount);
    return this;
  }

  @Override
  public ISGRecipeBuilder inputItems(TagPrefix orePrefix, Material material) {
    super.inputItems(orePrefix, material);
    return this;
  }

  @Override
  public ISGRecipeBuilder inputItems(MaterialEntry input) {
    super.inputItems(input);
    return this;
  }

  @Override
  public ISGRecipeBuilder inputItems(MaterialEntry input, int count) {
    super.inputItems(input, count);
    return this;
  }

  @Override
  public ISGRecipeBuilder inputItems(TagPrefix tagPrefix, @NotNull Material material, int count) {
    super.inputItems(tagPrefix, material, count);
    return this;
  }

  @Override
  public ISGRecipeBuilder inputItems(MachineDefinition machine) {
    super.inputItems(machine);
    return this;
  }

  @Override
  public ISGRecipeBuilder inputItems(MachineDefinition machine, int count) {
    super.inputItems(machine, count);
    return this;
  }

  @Override
  public ISGRecipeBuilder inputItemRanged(IntProviderIngredient provider) {
    super.inputItemRanged(provider);
    return this;
  }

  @Override
  public ISGRecipeBuilder inputItemsRanged(ItemStack input, IntProvider intProvider) {
    super.inputItemsRanged(input, intProvider);
    return this;
  }

  @Override
  public ISGRecipeBuilder inputItemsRanged(Item input, IntProvider intProvider) {
    super.inputItemsRanged(input, intProvider);
    return this;
  }

  @Override
  public ISGRecipeBuilder inputItemsRanged(Supplier<? extends ItemLike> input, IntProvider intProvider) {
    super.inputItemsRanged(input, intProvider);
    return this;
  }

  @Override
  public ISGRecipeBuilder inputItemsRanged(TagPrefix orePrefix, Material material, IntProvider intProvider) {
    super.inputItemsRanged(orePrefix, material, intProvider);
    return this;
  }

  @Override
  public ISGRecipeBuilder inputItemsRanged(MachineDefinition machine, IntProvider intProvider) {
    super.inputItemsRanged(machine, intProvider);
    return this;
  }

  @Override
  public ISGRecipeBuilder inputItemNbtPredicate(ItemStack stack, NBTPredicate predicate) {
    super.inputItemNbtPredicate(stack, predicate);
    return this;
  }

  @Override
  public ISGRecipeBuilder outputItems(Object output) {
    super.outputItems(output);
    return this;
  }

  @Override
  public ISGRecipeBuilder outputItems(Object output, int count) {
    super.outputItems(output, count);
    return this;
  }

  @Override
  public ISGRecipeBuilder outputItems(ItemStack output) {
    super.outputItems(output);
    return this;
  }

  @Override
  public ISGRecipeBuilder outputItems(ItemStack... outputs) {
    super.outputItems(outputs);
    return this;
  }

  @Override
  public ISGRecipeBuilder outputItems(Item output, int amount) {
    super.outputItems(output, amount);
    return this;
  }

  @Override
  public ISGRecipeBuilder outputItems(Item output) {
    super.outputItems(output);
    return this;
  }

  @Override
  public ISGRecipeBuilder outputItems(Supplier<? extends ItemLike> input) {
    super.outputItems(input);
    return this;
  }

  @Override
  public ISGRecipeBuilder outputItems(Supplier<? extends ItemLike> input, int amount) {
    super.outputItems(input, amount);
    return this;
  }

  @Override
  public ISGRecipeBuilder outputItems(TagPrefix orePrefix, Material material) {
    super.outputItems(orePrefix, material);
    return this;
  }

  @Override
  public ISGRecipeBuilder outputItems(TagPrefix orePrefix, @NotNull Material material, int count) {
    super.outputItems(orePrefix, material, count);
    return this;
  }

  @Override
  public ISGRecipeBuilder outputItems(MaterialEntry entry) {
    super.outputItems(entry);
    return this;
  }

  @Override
  public ISGRecipeBuilder outputItems(MaterialEntry entry, int count) {
    super.outputItems(entry, count);
    return this;
  }

  @Override
  public ISGRecipeBuilder outputItems(MachineDefinition machine) {
    super.outputItems(machine);
    return this;
  }

  @Override
  public ISGRecipeBuilder outputItems(MachineDefinition machine, int count) {
    super.outputItems(machine, count);
    return this;
  }

  @Override
  protected ISGRecipeBuilder outputItems(Ingredient ingredient) {
    super.outputItems(ingredient);
    return this;
  }

  @Override
  public ISGRecipeBuilder outputItemRanged(IntProviderIngredient provider) {
    super.outputItemRanged(provider);
    return this;
  }

  @Override
  public ISGRecipeBuilder outputItemsRanged(ItemStack output, IntProvider intProvider) {
    super.outputItemsRanged(output, intProvider);
    return this;
  }

  @Override
  public ISGRecipeBuilder outputItemsRanged(Item input, IntProvider intProvider) {
    super.outputItemsRanged(input, intProvider);
    return this;
  }

  @Override
  public ISGRecipeBuilder outputItemsRanged(Supplier<? extends ItemLike> output, IntProvider intProvider) {
    super.outputItemsRanged(output, intProvider);
    return this;
  }

  @Override
  public ISGRecipeBuilder outputItemsRanged(TagPrefix orePrefix, Material material, IntProvider intProvider) {
    super.outputItemsRanged(orePrefix, material, intProvider);
    return this;
  }

  @Override
  public ISGRecipeBuilder outputItemsRanged(MachineDefinition machine, IntProvider intProvider) {
    super.outputItemsRanged(machine, intProvider);
    return this;
  }

  @Override
  public ISGRecipeBuilder notConsumable(ItemStack itemStack) {
    super.notConsumable(itemStack);
    return this;
  }

  @Override
  public ISGRecipeBuilder notConsumable(Ingredient ingredient) {
    super.notConsumable(ingredient);
    return this;
  }

  @Override
  public ISGRecipeBuilder notConsumable(Item item) {
    super.notConsumable(item);
    return this;
  }

  @Override
  public ISGRecipeBuilder notConsumable(Supplier<? extends Item> item) {
    super.notConsumable(item);
    return this;
  }

  @Override
  public ISGRecipeBuilder notConsumable(TagPrefix orePrefix, Material material) {
    super.notConsumable(orePrefix, material);
    return this;
  }

  @Override
  public ISGRecipeBuilder notConsumable(TagPrefix orePrefix, Material material, int count) {
    super.notConsumable(orePrefix, material, count);
    return this;
  }

  @Override
  public ISGRecipeBuilder notConsumableFluid(FluidStack fluid) {
    super.notConsumableFluid(fluid);
    return this;
  }

  @Override
  public ISGRecipeBuilder notConsumableFluid(FluidIngredient ingredient) {
    super.notConsumableFluid(ingredient);
    return this;
  }

  @Override
  public ISGRecipeBuilder circuitMeta(int configuration) {
    super.circuitMeta(configuration);
    return this;
  }

  @Override
  public ISGRecipeBuilder chancedInput(Ingredient stack, int chance) {
    super.chancedInput(stack, chance);
    return this;
  }

  @Override
  public ISGRecipeBuilder chancedInput(FluidIngredient stack, int chance) {
    super.chancedInput(stack, chance);
    return this;
  }

  @Override
  public ISGRecipeBuilder chancedOutput(Ingredient stack, int chance) {
    super.chancedOutput(stack, chance);
    return this;
  }

  @Override
  public ISGRecipeBuilder chancedOutput(FluidIngredient stack, int chance) {
    super.chancedOutput(stack, chance);
    return this;
  }

  @Override
  public ISGRecipeBuilder chancedInput(ItemStack stack, int chance) {
    super.chancedInput(stack, chance);
    return this;
  }

  @Override
  public ISGRecipeBuilder chancedInput(FluidStack stack, int chance) {
    super.chancedInput(stack, chance);
    return this;
  }

  @Override
  public ISGRecipeBuilder chancedOutput(ItemStack stack, int chance) {
    super.chancedOutput(stack, chance);
    return this;
  }

  @Override
  public ISGRecipeBuilder chancedOutput(FluidStack stack, int chance) {
    super.chancedOutput(stack, chance);
    return this;
  }

  @Override
  public ISGRecipeBuilder chancedOutput(TagPrefix tag, Material mat, int chance) {
    super.chancedOutput(tag, mat, chance);
    return this;
  }

  @Override
  public ISGRecipeBuilder chancedOutput(TagPrefix tag, Material mat, int count, int chance) {
    super.chancedOutput(tag, mat, count, chance);
    return this;
  }

  @Override
  public ISGRecipeBuilder chancedOutput(ItemStack stack, String fraction) {
    super.chancedOutput(stack, fraction);
    return this;
  }

  @Override
  public ISGRecipeBuilder chancedOutput(TagPrefix prefix, Material material, int count, String fraction) {
    super.chancedOutput(prefix, material, count, fraction);
    return this;
  }

  @Override
  public ISGRecipeBuilder chancedOutput(TagPrefix prefix, Material material, String fraction) {
    super.chancedOutput(prefix, material, fraction);
    return this;
  }

  @Override
  public ISGRecipeBuilder chancedOutput(Item item, int count, String fraction) {
    super.chancedOutput(new ItemStack(item, count), fraction);
    return this;
  }

  @Override
  public ISGRecipeBuilder chancedOutput(Item item, String fraction) {
    super.chancedOutput(item, fraction);
    return this;
  }

  @Override
  public ISGRecipeBuilder chancedFluidOutput(FluidStack stack, String fraction) {
    super.chancedFluidOutput(stack, fraction);
    return this;
  }

  /**
   * Set a chanced output logic for a specific capability.
   * all capabilities default to OR logic if not set.
   *
   * @param cap   the {@link RecipeCapability} to set the logic for
   * @param logic the {@link ChanceLogic} to use
   * @return this builder
   */
  @Override
  public ISGRecipeBuilder chancedOutputLogic(RecipeCapability<?> cap, ChanceLogic logic) {
    super.chancedOutputLogic(cap, logic);
    return this;
  }

  @Override
  public ISGRecipeBuilder chancedItemOutputLogic(ChanceLogic logic) {
    super.chancedItemOutputLogic(logic);
    return this;
  }

  @Override
  public ISGRecipeBuilder chancedFluidOutputLogic(ChanceLogic logic) {
    super.chancedFluidOutputLogic(logic);
    return this;
  }

  @Override
  public ISGRecipeBuilder chancedInputLogic(RecipeCapability<?> cap, ChanceLogic logic) {
    super.chancedInputLogic(cap, logic);
    return this;
  }

  @Override
  public ISGRecipeBuilder chancedItemInputLogic(ChanceLogic logic) {
    super.chancedItemInputLogic(logic);
    return this;
  }

  @Override
  public ISGRecipeBuilder chancedFluidInputLogic(ChanceLogic logic) {
    super.chancedFluidInputLogic(logic);
    return this;
  }

  @Override
  public ISGRecipeBuilder chancedTickOutputLogic(RecipeCapability<?> cap, ChanceLogic logic) {
    super.chancedTickOutputLogic(cap, logic);
    return this;
  }

  @Override
  public ISGRecipeBuilder chancedTickInputLogic(RecipeCapability<?> cap, ChanceLogic logic) {
    super.chancedTickInputLogic(cap, logic);
    return this;
  }

  @Override
  public ISGRecipeBuilder inputFluids(@NotNull Material material, int amount) {
    super.inputFluids(material, amount);
    return this;
  }

  @Override
  public ISGRecipeBuilder inputFluids(FluidStack input) {
    super.inputFluids(input);
    return this;
  }

  @Override
  public ISGRecipeBuilder inputFluids(FluidStack... inputs) {
    super.inputFluids(inputs);
    return this;
  }

  @Override
  public ISGRecipeBuilder inputFluidsRanged(IntProviderFluidIngredient provider) {
    super.inputFluidsRanged(provider);
    return this;
  }

  @Override
  protected ISGRecipeBuilder inputFluidsRanged(FluidIngredient input, IntProvider intProvider) {
    super.inputFluidsRanged(input, intProvider);
    return this;
  }

  @Override
  public ISGRecipeBuilder inputFluidsRanged(FluidStack input, IntProvider intProvider) {
    super.inputFluidsRanged(input, intProvider);
    return this;
  }

  @Override
  public ISGRecipeBuilder inputFluids(FluidIngredient... inputs) {
    super.inputFluids(inputs);
    return this;
  }

  @Override
  public ISGRecipeBuilder outputFluids(FluidStack output) {
    super.outputFluids(output);
    return this;
  }

  @Override
  public ISGRecipeBuilder outputFluids(FluidStack... outputs) {
    super.outputFluids(outputs);
    return this;
  }

  @Override
  public ISGRecipeBuilder outputFluids(FluidIngredient... outputs) {
    super.outputFluids(outputs);
    return this;
  }

  @Override
  public ISGRecipeBuilder outputFluidsRanged(IntProviderFluidIngredient provider) {
    super.outputFluidsRanged(provider);
    return this;
  }

  @Override
  protected ISGRecipeBuilder outputFluidsRanged(FluidIngredient output, IntProvider intProvider) {
    super.outputFluidsRanged(output, intProvider);
    return this;
  }

  @Override
  public ISGRecipeBuilder outputFluidsRanged(FluidStack output, IntProvider intProvider) {
    super.outputFluidsRanged(output, intProvider);
    return this;
  }

  //////////////////////////////////////
  // ********** DATA ***********//
  //////////////////////////////////////
  @Override
  public ISGRecipeBuilder addData(String key, Tag data) {
    super.addData(key, data);
    return this;
  }

  @Override
  public ISGRecipeBuilder addData(String key, int data) {
    super.addData(key, data);
    return this;
  }

  @Override
  public ISGRecipeBuilder addData(String key, long data) {
    super.addData(key, data);
    return this;
  }

  @Override
  public ISGRecipeBuilder addData(String key, String data) {
    super.addData(key, data);
    return this;
  }

  @Override
  public ISGRecipeBuilder addData(String key, float data) {
    super.addData(key, data);
    return this;
  }

  @Override
  public ISGRecipeBuilder addData(String key, boolean data) {
    super.addData(key, data);
    return this;
  }

  public ISGRecipeBuilder neutronKineticEnergy(int minMeV, int maxMeV) {
    return neutronKineticEnergy(minMeV, maxMeV, 0);
  }

  public ISGRecipeBuilder neutronKineticEnergy(int minMeV, int maxMeV, int eVt) {
    if (minMeV > maxMeV) {
      throw new IllegalArgumentException("Minimum neutron kinetic energy cannot be greater than maximum");
    }
    addData(NeutronActivatorCondition.KEY_EV_MIN, minMeV);
    addData(NeutronActivatorCondition.KEY_EV_MAX, maxMeV);
    if (eVt > 0) {
      addData(NeutronActivatorCondition.KEY_EVT, eVt);
    }
    return this;
  }

  @Override
  public ISGRecipeBuilder blastFurnaceTemp(int blastTemp) {
    super.blastFurnaceTemp(blastTemp);
    return this;
  }

  @Override
  public ISGRecipeBuilder explosivesAmount(int explosivesAmount) {
    super.explosivesAmount(explosivesAmount);
    return this;
  }

  @Override
  public ISGRecipeBuilder explosivesType(ItemStack explosivesType) {
    super.explosivesType(explosivesType);
    return this;
  }

  @Override
  public ISGRecipeBuilder solderMultiplier(int multiplier) {
    super.solderMultiplier(multiplier);
    return this;
  }

  @Override
  public ISGRecipeBuilder disableDistilleryRecipes(boolean flag) {
    super.disableDistilleryRecipes(flag);
    return this;
  }

  @Override
  public ISGRecipeBuilder fusionStartEU(long eu) {
    super.fusionStartEU(eu);
    return this;
  }

  @Override
  public ISGRecipeBuilder researchScan(boolean isScan) {
    super.researchScan(isScan);
    return this;
  }

  @Override
  public ISGRecipeBuilder durationIsTotalCWU(boolean durationIsTotalCWU) {
    super.durationIsTotalCWU(durationIsTotalCWU);
    return this;
  }

  @Override
  public ISGRecipeBuilder hideDuration(boolean hideDuration) {
    super.hideDuration(hideDuration);
    return this;
  }

  //////////////////////////////////////
  // ******* CONDITIONS ********//
  //////////////////////////////////////
  @Override
  public ISGRecipeBuilder cleanroom(CleanroomType cleanroomType) {
    super.cleanroom(cleanroomType);
    return this;
  }

  @Override
  public ISGRecipeBuilder dimension(ResourceLocation dimension, boolean reverse) {
    super.dimension(dimension, reverse);
    return this;
  }

  @Override
  public ISGRecipeBuilder dimension(ResourceLocation dimension) {
    super.dimension(dimension);
    return this;
  }

  @Override
  public ISGRecipeBuilder dimension(ResourceKey<Level> dimension, boolean reverse) {
    super.dimension(dimension, reverse);
    return this;
  }

  @Override
  public ISGRecipeBuilder dimension(ResourceKey<Level> dimension) {
    super.dimension(dimension);
    return this;
  }

  @Override
  public ISGRecipeBuilder biome(ResourceLocation biome, boolean reverse) {
    super.biome(biome, reverse);
    return this;
  }

  @Override
  public ISGRecipeBuilder biome(ResourceLocation biome) {
    super.biome(biome);
    return this;
  }

  @Override
  public ISGRecipeBuilder biome(ResourceKey<Biome> biome, boolean reverse) {
    super.biome(biome, reverse);
    return this;
  }

  @Override
  public ISGRecipeBuilder biome(ResourceKey<Biome> biome) {
    super.biome(biome);
    return this;
  }

  @Override
  public ISGRecipeBuilder biomeTag(TagKey<Biome> biome, boolean reverse) {
    super.biomeTag(biome, reverse);
    return this;
  }

  @Override
  public ISGRecipeBuilder biomeTag(TagKey<Biome> biome) {
    biomeTag(biome);
    return this;
  }

  @Override
  public ISGRecipeBuilder environmentalHazard(MedicalCondition condition, boolean reverse) {
    super.environmentalHazard(condition, reverse);
    return this;
  }

  @Override
  public ISGRecipeBuilder environmentalHazard(MedicalCondition condition) {
    super.environmentalHazard(condition);
    return this;
  }

  @Override
  public ISGRecipeBuilder daytime(boolean isNight) {
    super.daytime(isNight);
    return this;
  }

  @Override
  public ISGRecipeBuilder daytime() {
    super.daytime();
    return this;
  }

  @Override
  public ISGRecipeBuilder heraclesQuest(String questId, boolean isReverse) {
    super.heraclesQuest(questId, isReverse);
    return this;
  }

  @Override
  public ISGRecipeBuilder heraclesQuest(String questId) {
    super.heraclesQuest(questId);
    return this;
  }

  @Override
  public ISGRecipeBuilder gameStage(String stageName) {
    super.gameStage(stageName);
    return this;
  }

  @Override
  public ISGRecipeBuilder gameStage(String stageName, boolean isReverse) {
    super.gameStage(stageName, isReverse);
    return this;
  }

  @Override
  public ISGRecipeBuilder ftbQuest(String questId, boolean isReverse) {
    super.ftbQuest(questId, isReverse);
    return this;
  }

  @Override
  public ISGRecipeBuilder ftbQuest(String questId) {
    super.ftbQuest(questId);
    return this;
  }


  /**
   * Does not generate a research recipe.
   *
   * @param researchId the researchId for the recipe
   * @return this
   */

  @Override
  public ISGRecipeBuilder researchWithoutRecipe(@NotNull String researchId) {
    super.researchWithoutRecipe(researchId);
    return this;
  }

  /**
   * Does not generate a research recipe.
   *
   * @param researchId the researchId for the recipe
   * @param dataStack  the stack to hold the data. Must have the {@link IDataItem} behavior.
   * @return this
   */

  @Override
  public ISGRecipeBuilder researchWithoutRecipe(@NotNull String researchId, @NotNull ItemStack dataStack) {
    super.researchWithoutRecipe(researchId, dataStack);
    return this;
  }

  /**
   * Generates a research recipe for the Scanner.
   */

  @Override
  public ISGRecipeBuilder scannerResearch(UnaryOperator<ResearchRecipeBuilder.ScannerRecipeBuilder> research) {
    super.scannerResearch(research);
    return this;
  }

  /**
   * Generates a research recipe for the Scanner. All values are defaults other than the research stack.
   *
   * @param researchStack the stack to use for research
   * @return this
   */

  @Override
  public ISGRecipeBuilder scannerResearch(@NotNull ItemStack researchStack) {
    super.scannerResearch(researchStack);
    return this;
  }

  /**
   * Generates a research recipe for the Research Station.
   */

  @Override
  public ISGRecipeBuilder stationResearch(UnaryOperator<ResearchRecipeBuilder.StationRecipeBuilder> research) {
    super.stationResearch(research);
    return this;
  }

  public ISGRecipeBuilder layeredRecipe(Consumer<LayeredRecipeInfo.Builder> config) {
    if (!(recipeType instanceof ISGRecipeType isgRecipeType) || !isgRecipeType.isLayered()) {
      GTCEu.LOGGER.error("Can't use layeredRecipe on a non-layered recipe type");
      return this;
    }
    var layered = new LayeredRecipeInfo.Builder(this);
    config.accept(layered);
    layered.apply();
    return this;
  }

  public ISGRecipeBuilder inputDust(Material material) {
    inputItems(TagPrefix.dust, material);
    return this;
  }

  public ISGRecipeBuilder inputDust(Material material, int count) {
    inputItems(TagPrefix.dust, material, count);
    return this;
  }

  public ISGRecipeBuilder outputDust(Material material) {
    outputItems(TagPrefix.dust, material);
    return this;
  }

  public ISGRecipeBuilder outputDust(Material material, int count) {
    outputItems(TagPrefix.dust, material, count);
    return this;
  }

  public ISGRecipeBuilder notConsumableDust(Material material) {
    notConsumable(TagPrefix.dust, material);
    return this;
  }

  public ISGRecipeBuilder notConsumableDust(Material material, int count) {
    notConsumable(TagPrefix.dust, material, count);
    return this;
  }

}
