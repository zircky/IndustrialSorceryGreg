package com.zircky.industrialsorcerygreg.utils.register;

import appeng.block.crafting.AbstractCraftingUnitBlock;
import appeng.block.crafting.CraftingUnitBlock;
import appeng.block.crafting.CraftingUnitType;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableTable;
import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.block.ActiveBlock;
import com.gregtechceu.gtceu.api.block.IFusionCasingType;
import com.gregtechceu.gtceu.api.block.MaterialBlock;
import com.gregtechceu.gtceu.api.block.OreBlock;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.item.MaterialBlockItem;
import com.gregtechceu.gtceu.api.item.tool.GTToolType;
import com.gregtechceu.gtceu.api.registry.registrate.GTBlockBuilder;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import com.gregtechceu.gtceu.api.registry.registrate.provider.GTBlockstateProvider;
import com.gregtechceu.gtceu.common.block.CleanroomFilterType;
import com.gregtechceu.gtceu.common.block.CoilBlock;
import com.gregtechceu.gtceu.common.block.FusionCasingBlock;
import com.gregtechceu.gtceu.common.data.GTBlocks;
import com.gregtechceu.gtceu.common.data.models.GTModels;
import com.gregtechceu.gtceu.core.mixins.BlockPropertiesAccessor;
import com.gregtechceu.gtceu.data.recipe.CustomTags;
import com.gregtechceu.gtceu.utils.FormattingUtil;
import com.tterrag.registrate.providers.DataGenContext;
import com.tterrag.registrate.providers.ProviderType;
import com.tterrag.registrate.providers.RegistrateBlockstateProvider;
import com.tterrag.registrate.util.entry.BlockEntry;
import com.tterrag.registrate.util.nullness.NonNullBiConsumer;
import com.tterrag.registrate.util.nullness.NonNullFunction;
import com.tterrag.registrate.util.nullness.NonNullSupplier;
import com.zircky.industrialsorcerygreg.ISGCore;
import com.zircky.industrialsorcerygreg.api.data.tag.ISGTagPrefix;
import com.zircky.industrialsorcerygreg.common.block.CoilType;
import com.zircky.industrialsorcerygreg.common.block.FusionCasings;
import com.zircky.industrialsorcerygreg.common.data.models.ISGModels;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.function.Supplier;

import static com.gregtechceu.gtceu.api.GTValues.VN;
import static com.gregtechceu.gtceu.api.block.property.GTBlockStateProperties.ACTIVE;
import static com.gregtechceu.gtceu.common.data.GTBlocks.ALL_FUSION_CASINGS;
import static com.zircky.industrialsorcerygreg.api.registries.ISGRegistries.REGISTRATE;
import static com.zircky.industrialsorcerygreg.common.block.BlockMap.GLASSMAP;

public class BlockRegisterUtils {

  private BlockRegisterUtils() {}

  public static BlockEntry<Block> REACTOR_CORE;

  public static final Map<String, String> LANG = GTCEu.isDataGen() ? new HashMap<>() : null;

  public static void addLang(String name, String cn) {
    if (LANG == null) return;
    if (LANG.containsKey(name)) {
      ISGCore.LOGGER.error("Repetitive Key: {}", name);
      throw new IllegalStateException();
    }
    LANG.put(name, cn);
  }

  public static <T extends Block> GTBlockBuilder<T, GTRegistrate> block(String name, NonNullFunction<BlockBehaviour.Properties, T> factory) {
    return REGISTRATE.block(name, factory);
  }

  public static void registerOreBlock(Material material, GTRegistrate registrate, ImmutableMap<Material, Set<TagPrefix>> ORE_MAP, Set<TagPrefix> iSGCore$DEEPSLATE, ImmutableTable.Builder<TagPrefix, Material, BlockEntry<? extends MaterialBlock>> MATERIAL_BLOCKS_BUILDER) {
    float destroyTime = (float) material.getMass() / 50;
    float explosionResistance = (float) material.getBlastTemperature() / 500;
    for (var ore : TagPrefix.ORES.entrySet()) {
      if (ore.getKey().isIgnored(material)) continue;
      var oreTag = ore.getKey();
      if (oreTag != TagPrefix.ore) {
        Set<TagPrefix> tagPrefixes = ORE_MAP.get(material);
        if (tagPrefixes == null || (!iSGCore$DEEPSLATE.contains(oreTag) && !tagPrefixes.contains(oreTag))) continue;
      }
      final TagPrefix.OreType oreType = ore.getValue();
      if (ore.getKey() instanceof ISGTagPrefix) registrate = REGISTRATE;
      var entry = registrate.block("%s%s_ore".formatted(oreTag != TagPrefix.ore ? FormattingUtil.toLowerCaseUnderscore(oreTag.name()) + "_" : "", material.getName()), properties -> new OreBlock(properties, oreTag, material))
          .initialProperties(() -> {
            if (oreType.stoneType().get().isAir()) {
              return Blocks.IRON_ORE;
            }
            return oreType.stoneType().get().getBlock();
          })
          .properties(properties -> {
            BlockBehaviour.Properties p = GTBlocks.copy(oreType.template().get(), properties).noLootTable();
            p.destroyTime(((BlockPropertiesAccessor) p).getDestroyTime() + destroyTime);
            p.explosionResistance(((BlockPropertiesAccessor) p).getExplosionResistance() + explosionResistance);
            return p;
          })
          .blockstate(NonNullBiConsumer.noop())
          .setData(ProviderType.LANG, NonNullBiConsumer.noop())
          .setData(ProviderType.LOOT, NonNullBiConsumer.noop())
          .transform(GTBlocks.unificationBlock(oreTag, material))
          .color(() -> MaterialBlock::tintedColor)
          .item((b, p) -> oreTag.blockItemConstructor().create(b, p, oreTag, material))
          .model(NonNullBiConsumer.noop())
//          .onRegister(MaterialBlockItem::onRegister)
          .color(() -> () -> MaterialBlockItem.tintColor(material))
          .build()
          .register();
      MATERIAL_BLOCKS_BUILDER.put(oreTag, material, entry);
    }
  }

  public static BlockEntry<CraftingUnitBlock> registerCraftingUnitBlock(int tier, CraftingUnitType Type) {
    return block("crafting_storage_" + (tier == -1 ? "max" : tier + "m"),  p -> new CraftingUnitBlock(Type))
        .blockstate((ctx, provider) -> {
          String formed = "block/crafting/" + ctx.getName() + "_formed";
          String unformed = "block/crafting/" + ctx.getName();
          provider.models().cubeAll(unformed, provider.modLoc("block/crafting/" + ctx.getName()));
          provider.models().getBuilder(formed);
          provider.getVariantBuilder(ctx.get()).forAllStatesExcept(state -> ConfiguredModel.builder().modelFile(provider.models().getExistingFile(provider.modLoc(state.getValue(AbstractCraftingUnitBlock.FORMED) ? formed : unformed))).build(), AbstractCraftingUnitBlock.POWERED);
        })
        .item(BlockItem::new)
        .model((ctx, provider) -> provider.withExistingParent(ctx.getName(), provider.modLoc("block/crafting/" + ctx.getName())))
        .build()
        .register();
  }

  public static BlockEntry<Block> createTierCasings(String name, ResourceLocation texture,
                                                    Int2ObjectMap<Supplier<?>> map, int tier) {
    return createTierCasings(name, texture, () -> Blocks.IRON_BLOCK, p -> new Block(p) {

      @Override
      public void appendHoverText(@NotNull ItemStack stack, @Nullable BlockGetter level,
                                  @NotNull List<Component> tooltip, @NotNull TooltipFlag flag) {
        tooltip.add(Component.translatable("tooltip.avaritia.tier", tier));
      }
    }, () -> RenderType::cutoutMipped, map, tier);
  }

  public static BlockEntry<Block> createTierGlassCasings(String name, ResourceLocation texture, int tier) {
    return createTierCasings(name, texture, () -> Blocks.GLASS, p -> new GlassBlock(p) {

      @Override
      public void appendHoverText(@NotNull ItemStack stack, @Nullable BlockGetter level, @NotNull List<Component> tooltip, @NotNull TooltipFlag flag) {
        super.appendHoverText(stack, level, tooltip, flag);
        tooltip.add(Component.translatable("tooltip.avaritia.tier", tier));
      }
    }, () -> RenderType::translucent, GLASSMAP, tier);
  }

  private static BlockEntry<Block> createTierCasings(String name, ResourceLocation texture,
                                                     NonNullSupplier<? extends Block> block,
                                                     NonNullFunction<BlockBehaviour.Properties, Block> blockSupplier,
                                                     Supplier<Supplier<RenderType>> type,
                                                     Int2ObjectMap<Supplier<?>> map, int tier) {
    BlockEntry<Block> Block = block(name, blockSupplier)
        .initialProperties(block)
        .properties(p -> p.isValidSpawn((state, level, pos, ent) -> false))
        .addLayer(type)
        .exBlockstate(GTModels.cubeAllModel(texture))
        .tag(GTToolType.WRENCH.harvestTags.get(0), BlockTags.MINEABLE_WITH_PICKAXE)
        .item(BlockItem::new)
        .build()
        .register();
    map.put(tier, Block);
    return Block;
  }

  public static BlockEntry<ActiveBlock> createActiveCasing(String name, String baseModelPath) {
    return block(name, ActiveBlock::new)
        .initialProperties(() -> Blocks.IRON_BLOCK)
        .addLayer(() -> RenderType::cutoutMipped)
        .blockstate(GTModels.createActiveModel(ISGCore.id(baseModelPath)))
        .tag(GTToolType.WRENCH.harvestTags.get(0), BlockTags.MINEABLE_WITH_PICKAXE)
        .item(BlockItem::new)
        .model((ctx, prov) -> prov.withExistingParent(prov.name(ctx), ISGCore.id(baseModelPath)))
        .build()
        .register();
  }

  public static BlockEntry<ActiveBlock> createActiveTierCasing(String name, String baseModelPath, Int2ObjectMap<Supplier<?>> map, int tier) {
    BlockEntry<ActiveBlock> Block = block(name, p -> (ActiveBlock) new ActiveBlock(p) {

      @Override
      public void appendHoverText(@NotNull ItemStack stack, @Nullable BlockGetter level, @NotNull List<Component> tooltip, @NotNull TooltipFlag flag) {
        super.appendHoverText(stack, level, tooltip, flag);
        tooltip.add(Component.translatable("tooltip.avaritia.tier", tier));
      }
    })
        .initialProperties(() -> Blocks.IRON_BLOCK)
        .addLayer(() -> RenderType::cutoutMipped)
        .blockstate(GTModels.createActiveModel(ISGCore.id(baseModelPath)))
        .tag(GTToolType.WRENCH.harvestTags.get(0), BlockTags.MINEABLE_WITH_PICKAXE)
        .item(BlockItem::new)
        .model((ctx, prov) -> prov.withExistingParent(prov.name(ctx), ISGCore.id(baseModelPath)))
        .build()
        .register();
    map.put(tier, Block);
    return Block;
  }

  public static BlockEntry<Block> createCleanroomFilter() {
    var filterBlock = block(CleanroomFilterType.FILTER_CASING.getSerializedName(), Block::new)
        .initialProperties(() -> Blocks.IRON_BLOCK)
        .properties(properties -> properties.strength(2.0f, 8.0f).sound(SoundType.METAL)
            .isValidSpawn((blockState, blockGetter, blockPos, entityType) -> false))
        .addLayer(() -> RenderType::solid)
        .blockstate(NonNullBiConsumer.noop())
        .tag(GTToolType.WRENCH.harvestTags.get(0), CustomTags.TOOL_TIERS[1])
        .item(BlockItem::new)
        .build()
        .register();
    GTCEuAPI.CLEANROOM_FILTERS.put(CleanroomFilterType.FILTER_CASING, filterBlock);
    return filterBlock;
  }

  public static BlockEntry<Block> createGlassCasingBlock(String name, ResourceLocation texture) {
    return createCasingBlock(name, GTModels.cubeAllModel(texture), GlassBlock::new, () -> Blocks.GLASS, () -> RenderType::translucent);
  }

  public static BlockEntry<Block> createCasingBlock(String name,  ResourceLocation texture) {
    return createCasingBlock(name, GTModels.cubeAllModel(texture), Block::new, () -> Blocks.IRON_BLOCK,
        () -> RenderType::solid);
  }

  public static BlockEntry<Block> createCustomModelCasingBlock(String name) {
    return createCasingBlock(name, NonNullBiConsumer.noop(), Block::new, () -> Blocks.IRON_BLOCK,
        () -> RenderType::solid);
  }

  private static BlockEntry<Block> createCasingBlock(String name, NonNullBiConsumer<DataGenContext<Block, ? extends Block>, GTBlockstateProvider> cons,
                                                     NonNullFunction<BlockBehaviour.Properties, Block> blockSupplier,
                                                     NonNullSupplier<? extends Block> properties,
                                                     Supplier<Supplier<RenderType>> type) {
    return block(name, blockSupplier)
        .initialProperties(properties)
        .properties(p -> p.isValidSpawn((state, level, pos, ent) -> false))
        .addLayer(type)
        .exBlockstate(cons)
        .tag(GTToolType.WRENCH.harvestTags.get(0), BlockTags.MINEABLE_WITH_PICKAXE)
        .item(BlockItem::new)
        .build()
        .register();
  }

  public static BlockEntry<Block> createSidedCasingBlock(String name, ResourceLocation texture) {
    return block(name, Block::new)
        .initialProperties(() -> Blocks.IRON_BLOCK)
        .properties(p -> p.isValidSpawn((state, level, pos, ent) -> false))
        .addLayer(() -> RenderType::solid)
        .blockstate((ctx, prov) -> prov.simpleBlock(ctx.getEntry(), prov.models().cubeBottomTop(name,
            texture.withSuffix("/side"),
            texture.withSuffix("/top"),
            texture.withSuffix("/top"))))
        .tag(GTToolType.WRENCH.harvestTags.get(0), BlockTags.MINEABLE_WITH_PICKAXE)
        .item(BlockItem::new)
        .build()
        .register();
  }

  public static BlockEntry<Block> createStoneBlock(String name, ResourceLocation texture) {
    return block(name, Block::new)
        .initialProperties(() -> Blocks.STONE)
        .addLayer(() -> RenderType::solid)
        .exBlockstate(GTModels.cubeAllModel(texture))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .item(BlockItem::new)
        .build()
        .register();
  }

  public static BlockEntry<Block> createSandBlock(String name, ResourceLocation texture) {
    return block(name, Block::new)
        .initialProperties(() -> Blocks.SAND)
        .addLayer(() -> RenderType::solid)
        .exBlockstate(GTModels.cubeAllModel(texture))
        .tag(BlockTags.MINEABLE_WITH_SHOVEL)
        .item(BlockItem::new)
        .build()
        .register();
  }

  public static BlockEntry<FusionCasingBlock> createFusionCasing(IFusionCasingType casingType) {
    BlockEntry<FusionCasingBlock> casingBlock = block(casingType.getSerializedName(), p -> (FusionCasingBlock) new FusionCasings(p, casingType))
        .initialProperties(() -> Blocks.IRON_BLOCK)
        .properties(properties -> properties.strength(5.0f, 10.0f).sound(SoundType.METAL))
        .addLayer(() -> RenderType::solid)
        .blockstate((ctx, prov) -> {
          ActiveBlock block = ctx.getEntry();
          ModelFile inactive = prov.models().getExistingFile(ISGCore.id(casingType.getSerializedName()));
          ModelFile active = prov.models().getExistingFile(ISGCore.id(casingType.getSerializedName()).withSuffix("_active"));
          prov.getVariantBuilder(block).partialState().with(ACTIVE, false).modelForState().modelFile(inactive).addModel().partialState().with(ACTIVE, true).modelForState().modelFile(active).addModel();
        })
        .tag(GTToolType.WRENCH.harvestTags.get(0), CustomTags.TOOL_TIERS[casingType.getHarvestLevel()])
        .item(BlockItem::new)
        .build()
        .register();
    ALL_FUSION_CASINGS.put(casingType, casingBlock);
    return casingBlock;
  }

  public static BlockEntry<Block> createHermeticCasing(int tier) {
    String tierName = VN[tier].toLowerCase(Locale.ROOT);
    return block("%s_hermetic_casing".formatted(tierName), Block::new)
        .lang("Hermetic Casing %s".formatted(GTValues.LVT[tier]))
        .initialProperties(() -> Blocks.IRON_BLOCK)
        .properties(p -> p.isValidSpawn((state, level, pos, ent) -> false))
        .addLayer(() -> RenderType::solid)
        .blockstate(NonNullBiConsumer.noop())
        .tag(GTToolType.WRENCH.harvestTags.get(0), BlockTags.MINEABLE_WITH_PICKAXE)
        .item(BlockItem::new)
        .build()
        .register();
  }

  public static BlockEntry<CoilBlock> createCoilBlock(CoilType coilType) {
    BlockEntry<CoilBlock> coilBlock = block("%s_coil_block".formatted(coilType.getName()), p -> new CoilBlock(p, coilType))
        .initialProperties(() -> Blocks.IRON_BLOCK)
        .properties(p -> p.isValidSpawn((state, level, pos, ent) -> false))
        .addLayer(() -> RenderType::cutoutMipped)
        .blockstate((ctx, prov) -> {
          ActiveBlock block = ctx.getEntry();
          ModelFile inactive = prov.models().getExistingFile(coilType.getTexture());
          ModelFile active = prov.models().getExistingFile(coilType.getTexture().withSuffix("_bloom"));
          prov.getVariantBuilder(block).partialState().with(ACTIVE, false).modelForState().modelFile(inactive).addModel().partialState().with(ACTIVE, true).modelForState().modelFile(active).addModel();
        })
        .tag(GTToolType.WRENCH.harvestTags.get(0), BlockTags.MINEABLE_WITH_PICKAXE)
        .item(BlockItem::new)
        .model((ctx, prov) -> prov.withExistingParent(prov.name(ctx), coilType.getTexture()))
        .build()
        .register();
    GTCEuAPI.HEATING_COILS.put(coilType, coilBlock);
    return coilBlock;
  }

//  public static BlockEntry<WirelessEnergyUnitBlock> createWirelessEnergyUnit(int tier) {
//    String t = VN[tier].toLowerCase(Locale.ROOT);
//    String name = t + "_wireless_energy_unit";
//    return block(name, GTEValues.VNFR[tier] + "无线能量单元", p -> new WirelessEnergyUnitBlock(p, tier))
//        .initialProperties(() -> Blocks.IRON_BLOCK)
//        .addLayer(() -> RenderType::cutoutMipped)
//        .blockstate((ctx, prov) -> prov.simpleBlock(ctx.getEntry(), prov.models().cubeAll(name, ISGCore.id("block/casings/wireless_energy_unit/" + t))))
//        .tag(GTToolType.WRENCH.harvestTags.get(0))
//        .item(BlockItem::new)
//        .build()
//        .register();
//  }
}
