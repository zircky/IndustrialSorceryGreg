package com.zircky.industrialsorcerygreg.mixin.gregtech.config;

import com.gregtechceu.gtceu.config.ConfigHolder;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = ConfigHolder.RecipeConfigs.class, remap = false)
public abstract class ISGRecipeConfigsMixin {

    @Shadow
    public boolean harderBrickRecipes;

    @Shadow
    public boolean nerfWoodCrafting;

    @Shadow
    public boolean hardWoodRecipes;

    @Shadow
    public boolean hardRedstoneRecipes;

    @Shadow
    public boolean hardToolArmorRecipes;

    @Shadow
    public boolean hardMiscRecipes;

    @Shadow
    public boolean hardDyeRecipes;

    @Shadow
    public boolean harderCircuitRecipes;

    @Shadow
    public int casingsPerCraft;

    @Inject(method = "<init>", at = @At("TAIL"))
    private void isg$setRecipeDefaults(final CallbackInfo ci) {
        this.harderBrickRecipes = true;
        this.nerfWoodCrafting = true;
        this.hardWoodRecipes = true;
        this.hardRedstoneRecipes = true;
        this.hardToolArmorRecipes = true;
        this.hardMiscRecipes = true;
        this.hardDyeRecipes = true;
        this.harderCircuitRecipes = true;
        this.casingsPerCraft = 1;
    }
}
