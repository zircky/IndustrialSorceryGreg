package com.zircky.industrialsorcerygreg.mixin.gregtech.recipe;

import com.gregtechceu.gtceu.api.data.chemical.material.stack.MaterialStack;
import com.gregtechceu.gtceu.data.recipe.builder.GTRecipeBuilder;

import net.minecraft.world.item.ItemStack;

import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.List;

@Mixin(value = GTRecipeBuilder.class, remap = false)
public interface GTRecipeBuilderAccessor {

    @Accessor("itemMaterialInfo")
    boolean isg$getItemMaterialInfo();

    @Accessor("itemMaterialInfo")
    void isg$setItemMaterialInfo(boolean value);

    @Accessor("fluidMaterialInfo")
    boolean isg$getFluidMaterialInfo();

    @Accessor("fluidMaterialInfo")
    void isg$setFluidMaterialInfo(boolean value);

    @Accessor("removePreviousMatInfo")
    boolean isg$getRemovePreviousMatInfo();

    @Accessor("removePreviousMatInfo")
    void isg$setRemovePreviousMatInfo(boolean value);

    @Accessor("generatingRecipes")
    boolean isg$getGeneratingRecipes();

    @Accessor("generatingRecipes")
    void isg$setGeneratingRecipes(boolean value);

    @Accessor("tempItemStacks")
    @Nullable
    List<ItemStack> isg$getTempItemStacks();

    @Accessor("tempItemStacks")
    void isg$setTempItemStacks(@Nullable List<ItemStack> value);

    @Accessor("tempItemMaterialStacks")
    @Nullable
    List<MaterialStack> isg$getTempItemMaterialStacks();

    @Accessor("tempItemMaterialStacks")
    void isg$setTempItemMaterialStacks(@Nullable List<MaterialStack> value);

    @Accessor("tempFluidStacks")
    @Nullable
    List<MaterialStack> isg$getTempFluidStacks();

    @Accessor("tempFluidStacks")
    void isg$setTempFluidStacks(@Nullable List<MaterialStack> value);
}
