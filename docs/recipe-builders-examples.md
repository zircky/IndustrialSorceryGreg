# Примеры рецептов Blood Magic и Botania

Примеры соответствуют публичным методам билдеров в этом проекте. Это учебные рецепты: количество ресурсов, стоимость и результаты нужно подбирать под баланс сборки. Копирование примеров в Markdown само по себе не добавляет рецепты в игру.

## Где писать и подключать рецепты

Botania уже подключена через `BotaniaRecipe.init(provider)` в [Data.java](../src/main/java/com/zircky/industrialsorcerygreg/data/Data.java). Рецепты можно добавлять в [BotaniaRecipe.java](../src/main/java/com/zircky/industrialsorcerygreg/data/recipe/integration/botania/BotaniaRecipe.java).

Для Blood Magic создайте отдельный класс, например `data/recipe/integration/bloodmagic/BloodMagicRecipe.java`:

```java
package com.zircky.industrialsorcerygreg.data.recipe.integration.bloodmagic;

import com.zircky.industrialsorcerygreg.data.recipe.builder.bloodmagic.BloodAltarRecipeBuilder;

import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.Items;

import java.util.function.Consumer;

public final class BloodMagicRecipe {

    private BloodMagicRecipe() {}

    public static void init(Consumer<FinishedRecipe> provider) {
        BloodAltarRecipeBuilder.builder("example/diamond")
                .input(Items.COAL)
                .output(Items.DIAMOND)
                .minimumTier(2)
                .syphon(5000)
                .consumeRate(20)
                .drainRate(10)
                .save(provider);
    }
}
```

Затем импортируйте этот класс в `Data.java` и добавьте `BloodMagicRecipe.init(provider);` в `commonInit`. Этот новый класс и его подключение здесь только показаны; документация не изменяет Java-код проекта.

Все фрагменты ниже выполняются внутри метода с параметром `Consumer<FinishedRecipe> provider`. Вызывайте каждый рецепт один раз: пример алтаря выше повторяется ниже для справки.

## Импорты для примеров

Импортируйте только используемые классы. Билдеры берите из пакетов ISG, поскольку штатные билдеры Blood Magic имеют такие же имена:

```java
import com.zircky.industrialsorcerygreg.data.recipe.builder.bloodmagic.*;
import com.zircky.industrialsorcerygreg.data.recipe.builder.botania.*;

import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.fluids.FluidStack;

import vazkii.botania.api.BotaniaAPI;
import vazkii.botania.common.item.BotaniaItems;
import wayoftime.bloodmagic.common.meteor.MeteorLayer;
import wayoftime.bloodmagic.recipe.helper.FluidStackIngredient;

import java.util.Objects;
import java.util.function.Consumer;
```

## Имена и сохранение

`builder("example/diamond")` принимает путь без namespace и расширения `.json`. Билдер сам добавляет namespace `industrialsorcerygreg` и свою папку. Например, алтарь получает ID `industrialsorcerygreg:blood_altar/example/diamond`.

`save(provider)` передаёт готовый рецепт потребителю. Один ID должен соответствовать одному рецепту. Название примера можно повторять у разных билдеров, поскольку их префиксы различаются.

## Список билдеров

| Мод | Билдер | Префикс ID |
| --- | --- | --- |
| Blood Magic | [AlchemyArrayRecipeBuilder](#alchemyarrayrecipebuilder) | `alchemy_array/` |
| Blood Magic | [AlchemyTableRecipeBuilder](#alchemytablerecipebuilder) | `alchemy_table/` |
| Blood Magic | [ARCPotionRecipeBuilder](#arcpotionrecipebuilder) | `arc_potion/` |
| Blood Magic | [BloodAltarRecipeBuilder](#bloodaltarrecipebuilder) | `blood_altar/` |
| Blood Magic | [MeteorRecipeBuilder](#meteorrecipebuilder) | `meteor/` |
| Blood Magic | [LivingDowngradeRecipeBuilder](#livingdowngraderecipebuilder) | `living_downgrade/` |
| Blood Magic | [PotionRecipeBuilder](#potionrecipebuilder) | `potion/` |
| Blood Magic | [TartaricForgeRecipeBuilder](#tartaricforgerecipebuilder) | `tartaric_forge/` |
| Botania | [ManaInfusionRecipeBuilder](#manainfusionrecipebuilder) | `mana_infusion/` |
| Botania | [PetalApothecaryRecipeBuilder](#petalapothecaryrecipebuilder) | `petal_apothecary/` |
| Botania | [RunicAltarRecipeBuilder](#runicaltarrecipebuilder) | `runic_altar/` |
| Botania | [TerrestrialAgglomerationRecipeBuilder](#terrestrialagglomerationrecipebuilder) | `terra_plate/` |
| Botania | [ElvenTradeRecipeBuilder](#elventraderecipebuilder) | `elven_trade/` |
| Botania | [BrewRecipeBuilder](#brewrecipebuilder) | `brew/` |
| Botania | [PureDaisyRecipeBuilder](#puredaisyrecipebuilder) | `pure_daisy/` |
| Botania | [OrechidRecipeBuilder](#orechidrecipebuilder) | `orechid/` |
| Botania | [OrechidIgnemRecipeBuilder](#orechidignemrecipebuilder) | `orechid_ignem/` |
| Botania | [MarimorphosisRecipeBuilder](#marimorphosisrecipebuilder) | `marimorphosis/` |
| Botania | [PedestalRecipeBuilder](#pedestalrecipebuilder) | `pedestal/` |
| Botania | [RuneRitualRecipeBuilder](#runeritualrecipebuilder) | `rune_ritual/` |

## Blood Magic

### AlchemyArrayRecipeBuilder

Алхимический массив.

```java
AlchemyArrayRecipeBuilder.builder("example/gold")
        .input(Items.IRON_INGOT)
        .catalyst(Items.REDSTONE)
        .output(Items.GOLD_INGOT)
        .texture(new ResourceLocation(
                "bloodmagic", "textures/models/alchemyarrays/basearray.png"))
        .save(provider);
```

`input` — основной предмет, `catalyst` — второй ингредиент, `texture` — текстура массива. Все эти поля и `output` нужно задать.

### AlchemyTableRecipeBuilder

Алхимический стол.

```java
AlchemyTableRecipeBuilder.builder("example/gunpowder")
        .output(new ItemStack(Items.GUNPOWDER, 2))
        .syphon(100)
        .ticks(100)
        .minimumTier(1)
        .addIngredient(Items.COAL)
        .addIngredient(Items.REDSTONE)
        .save(provider);
```

`syphon` — стоимость LP, `ticks` — время обработки, `minimumTier` — минимальный уровень стола. От 1 до 6 ингредиентов; повторный `addIngredient` добавляет отдельный ингредиент.

### ARCPotionRecipeBuilder

ARC с жидкостями.

```java
ARCPotionRecipeBuilder.builder("example/arc")
        .input(Items.ROTTEN_FLESH)
        .tool(Items.IRON_SWORD)
        .inputFluid(FluidStackIngredient.from(Fluids.WATER, 1000))
        .output(Items.BONE_MEAL)
        .outputFluid(new FluidStack(Fluids.WATER, 500))
        .save(provider);
```

Обязательны основной вход, инструмент, входная жидкость, непустой предметный выход и выходная жидкость. Объёмы указаны в mB. Это демонстрация API с обычной водой; для реального рецепта замените ингредиенты, инструмент и жидкости. Текущая обёртка использует штатный `arc`, не предоставляет `arcConsume`, случайные выходы и настройку количества входа.

### BloodAltarRecipeBuilder

Кровавый алтарь.

```java
BloodAltarRecipeBuilder.builder("example/diamond")
        .input(Items.COAL)
        .output(Items.DIAMOND)
        .minimumTier(2)
        .syphon(5000)
        .consumeRate(20)
        .drainRate(10)
        .save(provider);
```

`syphon` — общая стоимость LP; `consumeRate` — скорость обработки при наличии крови, `drainRate` — параметр потери прогресса при её нехватке. Значения передаются штатному билдеру Blood Magic. Задайте требуемый уровень через `minimumTier`.

### MeteorRecipeBuilder

Метеорит.

```java
final MeteorLayer layer = new MeteorLayer(3, 100, Blocks.STONE)
        .addWeightedBlock(Blocks.IRON_ORE, 20)
        .addWeightedBlock(Blocks.GOLD_ORE, 5)
        .addShellBlock(Blocks.DEEPSLATE);

MeteorRecipeBuilder.builder("example/iron_meteor")
        .input(Items.IRON_BLOCK)
        .syphon(100000)
        .explosionRadius(5.0F)
        .addLayer(layer)
        .save(provider);
```

`MeteorLayer` задаёт слой метеорита: радиус, дополнительный общий вес и блок заполнения. Взвешенные блоки добавляются через `addWeightedBlock`; оболочка — через `addShellBlock`. Это относительные веса, не проценты. Обёртке нужен минимум один слой. `syphon` — стоимость LP, `explosionRadius` — радиус взрыва; геометрический радиус слоя задаётся отдельно в `MeteorLayer`.

### LivingDowngradeRecipeBuilder

Ухудшение живой брони.

```java
LivingDowngradeRecipeBuilder.builder("example/speed_decrease")
        .input(Items.SOUL_SAND)
        .downgrade(new ResourceLocation("bloodmagic", "speed_decrease"))
        .save(provider);
```

`downgrade` ссылается на существующее ухудшение живой брони. Билдер создаёт рецепт получения ухудшения, а не регистрирует новое ухудшение. Здесь используется идентификатор ухудшения Blood Magic.

### PotionRecipeBuilder

Эффект алхимической фляги.

```java
PotionRecipeBuilder.builder("example/speed")
        .effect(MobEffects.MOVEMENT_SPEED)
        .baseDuration(1200)
        .syphon(200)
        .ticks(100)
        .minimumTier(1)
        .addIngredient(Items.SUGAR)
        .save(provider);
```

`effect` — эффект, `baseDuration` — базовая длительность, `syphon` — LP, `ticks` — время обработки, `minimumTier` — уровень стола. Допустимо от 1 до 5 ингредиентов. Обёртка использует `PotionEffectRecipeBuilder`: она добавляет эффект во флягу. Наполнение, увеличение длительности/силы и преобразование эффектов требуют других штатных билдеров и этой обёрткой пока не поддерживаются.

### TartaricForgeRecipeBuilder

Адская кузня.

```java
TartaricForgeRecipeBuilder.builder("example/diamond")
        .output(Items.DIAMOND)
        .minimumSouls(60.0)
        .soulDrain(10.0)
        .addIngredient(Items.COAL)
        .addIngredient(Items.IRON_INGOT)
        .save(provider);
```

`minimumSouls` — минимально необходимое количество душ, `soulDrain` — расход душ. Это разные параметры. Обязателен непустой выход и от 1 до 4 ингредиентов.

## Botania

### ManaInfusionRecipeBuilder

Наполнение маной.

```java
ManaInfusionRecipeBuilder.builder("example/manasteel")
        .input(Items.IRON_INGOT)
        .output(BotaniaItems.manaSteel)
        .mana(3000)
        .group("example_metals")
        .save(provider);
```

Обязательны `input` и `output`; `mana` задаёт стоимость. `group` необязателен. Для преобразования с катализатором добавьте перед `save` один из вызовов: `.alchemyCatalyst()`, `.conjurationCatalyst()` или `.customCatalyst(Blocks.GOLD_BLOCK)`. Катализатор здесь — блок под бассейном.

### PetalApothecaryRecipeBuilder

Лепестковый аптекарь.

```java
PetalApothecaryRecipeBuilder.builder("example/flower")
        .output(Items.POPPY)
        .reagent(Items.WHEAT_SEEDS)
        .addIngredient(Items.RED_DYE)
        .addIngredient(Items.WHITE_DYE)
        .save(provider);
```

`reagent` — завершающий реагент, например семена; `addIngredient` — ингредиенты рецепта. В примере использованы ванильные предметы для демонстрации. Для рабочего баланса замените их лепестками и нужным цветком.

### RunicAltarRecipeBuilder

Рунический алтарь.

```java
RunicAltarRecipeBuilder.builder("example/rune")
        .output(BotaniaItems.runeEarth)
        .mana(5000)
        .addIngredient(Items.STONE)
        .addIngredient(Items.COAL)
        .setHeadRecipe(false)
        .save(provider);
```

Нужны выход и хотя бы один ингредиент. `mana` задаёт стоимость. `setHeadRecipe(false)` использует обычный сериализатор; `true` переключает его на `RUNE_HEAD_SERIALIZER`. Для обычных рецептов оставляйте `false` или не вызывайте этот метод.

### TerrestrialAgglomerationRecipeBuilder

Земная агломерационная плита.

```java
TerrestrialAgglomerationRecipeBuilder.builder("example/terrasteel")
        .output(BotaniaItems.terrasteel)
        .mana(500000)
        .addIngredient(BotaniaItems.manaSteel)
        .addIngredient(BotaniaItems.manaPearl)
        .addIngredient(BotaniaItems.manaDiamond)
        .save(provider);
```

Задайте выход, стоимость маны и ингредиенты для плиты. Пример показывает стандартный набор предметов для террастали; значения являются примером настройки.

### ElvenTradeRecipeBuilder

Обмен с эльфами.

```java
ElvenTradeRecipeBuilder.builder("example/elven_trade")
        .addInput(Items.IRON_INGOT)
        .addInput(Items.GOLD_INGOT)
        .addOutput(Items.EMERALD, 2)
        .save(provider);
```

Можно добавлять несколько входов и выходов. Для количества выхода используйте `addOutput(ItemLike, int)`. Перегрузки с `Ingredient` для входа и `ItemStack` для выхода приватные: из класса рецептов их вызвать нельзя.

### BrewRecipeBuilder

Зельеварение Botania.

```java
final var brew = Objects.requireNonNull(
        BotaniaAPI.instance().getBrewRegistry()
                .get(new ResourceLocation("botania", "speed")),
        "Brew botania:speed is not registered");

BrewRecipeBuilder.builder("example/speed")
        .brew(brew)
        .addIngredient(Items.SUGAR)
        .addIngredient(Items.REDSTONE)
        .save(provider);
```

Нужен уже зарегистрированный объект `Brew` и хотя бы один ингредиент. Этот билдер не создаёт новый вид зелья. Здесь он получается из реестра; используйте идентификатор существующего зелья вашей сборки. Вход через произвольный `Ingredient` приватный; доступны предмет и тег.

### PureDaisyRecipeBuilder

Чистая маргаритка.

```java
PureDaisyRecipeBuilder.builder("example/moss")
        .input(Blocks.STONE)
        .output(Blocks.MOSS_BLOCK)
        .time(150)
        .save(provider);
```

Вход — блок, тег блоков или `StateIngredient`; выход — блок. `time` — время преобразования в тиках, по умолчанию 150.

### OrechidRecipeBuilder

Рудоцвет.

```java
OrechidRecipeBuilder.builder("example/iron_ore")
        .input(Blocks.STONE)
        .output(Blocks.IRON_ORE)
        .weight(100)
        .save(provider);
```

Вход задаётся блоком или тегом блоков, выход — блоком руды. `weight` — относительный вес выбора среди подходящих рецептов, не процент; по умолчанию 1.

### OrechidIgnemRecipeBuilder

Огненный рудоцвет.

```java
OrechidIgnemRecipeBuilder.builder("example/quartz")
        .input(Blocks.NETHERRACK)
        .output(Blocks.NETHER_QUARTZ_ORE)
        .weight(100)
        .save(provider);
```

Аналог рудоцвета для огненного варианта. Задайте вход, выход и относительный вес.

### MarimorphosisRecipeBuilder

Морфоцвет.

```java
MarimorphosisRecipeBuilder.builder("example/andesite")
        .input(Blocks.STONE)
        .output(Blocks.ANDESITE)
        .weight(10)
        .biomeBonus(11)
        .biomeTag(BiomeTags.IS_FOREST)
        .save(provider);
```

`weight` — базовый вес, `biomeBonus` — прибавка веса в биомах из `biomeTag`. Тег нужно задать явно: текущая реализация обращается к нему при сохранении. Значения по умолчанию: вес 1, бонус 11.

### PedestalRecipeBuilder

Пьедестал ExtraBotany.

```java
PedestalRecipeBuilder.builder("example/gravel")
        .input(Items.COBBLESTONE)
        .smashTools(Items.IRON_PICKAXE)
        .output(new ItemStack(Items.GRAVEL, 2))
        .strike(3)
        .exp(1)
        .save(provider);
```

Это рецепт ExtraBotany. Обязательны вход, выход и инструмент `smashTools`. `strike` — число ударов (по умолчанию 1), `exp` — опыт (по умолчанию 0).

### RuneRitualRecipeBuilder

Рунический ритуал MythicBotany.

```java
RuneRitualRecipeBuilder.builder("example/ritual")
        .centerRune(BotaniaItems.runeMana)
        .addOuterRune(BotaniaItems.runeEarth, 2, 0, false)
        .addOuterRune(BotaniaItems.runeFire, -2, 0, true)
        .mana(100000)
        .ticks(200)
        .addInput(Items.IRON_INGOT)
        .addOutput(new ItemStack(Items.GOLD_INGOT, 2))
        .save(provider);
```

Это рецепт MythicBotany. `centerRune` — центральная руна, `addOuterRune(rune, x, z, consume)` — внешняя руна со смещением относительно центра и признаком расходования. `addInput` и `addOutput` задают дополнительные входы и результаты. Нужны центральная руна и хотя бы один выход; время по умолчанию 200 тиков.

## Предметы, теги, количество и материалы GregTech

Там, где у метода есть перегрузка с `TagKey<Item>`, вместо конкретного предмета можно использовать тег:

```java
AlchemyTableRecipeBuilder.builder("example/tag_input")
        .output(Items.GOLD_INGOT)
        .syphon(100)
        .ticks(100)
        .minimumTier(1)
        .addIngredient(net.minecraftforge.common.Tags.Items.INGOTS_IRON)
        .addIngredient(Items.REDSTONE)
        .save(provider);
```

Для альтернативных предметов в одном слоте используйте `Ingredient.of`, если метод принимает `Ingredient`:

```java
BloodAltarRecipeBuilder.builder("example/alternative_input")
        .input(net.minecraft.world.item.crafting.Ingredient.of(
                Items.COAL, Items.CHARCOAL))
        .output(Items.DIAMOND)
        .minimumTier(2)
        .syphon(5000)
        .consumeRate(20)
        .drainRate(10)
        .save(provider);
```

Это «уголь ИЛИ древесный уголь», а не два входных предмета. Для двух отдельных ингредиентов вызывайте `addIngredient` два раза. У `BrewRecipeBuilder` и `ElvenTradeRecipeBuilder` перегрузки с `Ingredient` приватные — используйте их публичные перегрузки с предметом или тегом.

Количество результата обычно задаётся через `new ItemStack(item, count)`. Исключение — обмен эльфов: у него публичный метод `addOutput(item, count)`. Обычный `Ingredient` не задаёт количество потребляемых предметов.

Материал GregTech можно получить через существующий в проекте `ChemicalHelper`:

```java
import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMaterials;

// Внутри init(provider):
BloodAltarRecipeBuilder.builder("example/gt_steel")
        .input(ChemicalHelper.getItem(TagPrefix.ingot, GTMaterials.Steel))
        .output(Items.DIAMOND)
        .minimumTier(2)
        .syphon(5000)
        .consumeRate(20)
        .drainRate(10)
        .save(provider);
```

Здесь `ChemicalHelper.getItem` возвращает предмет выбранной формы материала. Для собственного материала замените `GTMaterials.Steel` на поле из `ISGMaterials`, убедившись, что для материала доступна нужная форма.

В рецептах преобразования блоков используйте `Blocks` или `TagKey<Block>`, а не предметные теги. Вызов `output(Items.X)` доступен у предметных рецептов, `output(Blocks.X)` нужен у маргаритки, рудоцветов и морфоцвета.

## Проверка после добавления рецептов

1. Проверьте уникальность ID, обязательные параметры и существование предметов, жидкостей, зелий и ухудшений.
2. Выполните `.\\gradlew.bat compileJava` для проверки Java-кода.
3. Если требуется сгенерировать ресурсы рецептов, выполните `.\\gradlew.bat runData`. Результат ищите в `src/generated/resources/data/industrialsorcerygreg/recipes/<префикс>/<имя>.json`; сгенерированные JSON вручную не редактируйте.
4. Проверьте рецепт в игре и просмотрщике рецептов. Успешная компиляция сама по себе не проверяет баланс, доступность инструмента или поведение машины.

Для обычного времени в Minecraft 20 тиков соответствуют одной секунде при нормальной скорости сервера. Не смешивайте время обработки `ticks` с расходом LP `syphon` или стоимостью маны `mana`.

Эта инструкция добавляет только документацию. Примеры не подключались как игровые рецепты, `runData` и проверка в игре для них не выполнялись.
