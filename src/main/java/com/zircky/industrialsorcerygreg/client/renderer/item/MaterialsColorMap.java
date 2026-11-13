package com.zircky.industrialsorcerygreg.client.renderer.item;

import com.zircky.industrialsorcerygreg.common.data.ISGMaterials;
import com.zircky.industrialsorcerygreg.utils.ColorUtils;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;

import net.minecraft.util.Mth;

import vazkii.botania.client.core.handler.ClientTickHandler;

import java.util.function.IntSupplier;

public class MaterialsColorMap {


    static final IntSupplier quantumColor = () -> {
        float spot = (float) ((System.currentTimeMillis() / 500) % 10) / 10;
        if (spot > 0.5) {
            spot = 1 - spot;
        }
        return ColorUtils.getInterpolatedColor(0x00FF84, 0xFF7E00, spot * 2); // * 2 以确保spot在0到1之间平滑过渡
    };

    private static final IntSupplier shimmer = () -> {
        float time = ClientTickHandler.ticksInGame + ClientTickHandler.partialTicks;
        return Mth.hsvToRgb(time % 200 / 200, 0.4F, 0.9F);
    };

    private static final IntSupplier gaiaColor =
            () -> Mth.hsvToRgb((ClientTickHandler.ticksInGame << 1) % 360 / 360F, 0.25F, 1F);
    private static final IntSupplier rainbowColor = MaterialsColorMap::getCurrentRainbowColor;
    private static final IntSupplier hypogenColor = () -> ColorUtils.getInterpolatedColor(0xFF3D00, 0xDA9100,
            Math.abs(1 - (System.currentTimeMillis() % 6000) / 3000.0F));
    private static final IntSupplier hexaphaseCopperColor = () -> {
        float spot = (System.currentTimeMillis() % 4000) / 4000.0F;
        return ColorUtils.getInterpolatedColor(0xEC7916, 0x00FF15,
                (spot > 0.1 && spot < 0.15 || spot > 0.18 && spot < 0.22) ? 1 : 0);
    };

    public static IntSupplier getColorSupplier(Material material) {
        // Material colors can be queried while ISG's material fields are still being registered.
        if (material == ISGMaterials.Gaia) return gaiaColor;
        if (material == ISGMaterials.Shimmerwood || material == ISGMaterials.Shimmerrock
                || material == ISGMaterials.BifrostPerm) return shimmer;
        if (material == ISGMaterials.ChromaticGlass) return rainbowColor;
        if (material == ISGMaterials.Hypogen) return hypogenColor;
        if (material == ISGMaterials.HexaphaseCopper) return hexaphaseCopperColor;
        if (material == ISGMaterials.HeavyQuarkDegenerateMatter
                || material == ISGMaterials.QuantumChromoDynamicallyConfinedMatter) return quantumColor;
        return null;
    }

    public static int getCurrentRainbowColor() {
        return HSBToRGB((System.currentTimeMillis() % 18000) / 18000F);
    }

    private static int HSBToRGB(float hue) {
        int r = 0, g = 0, b = 0;
        float h = (hue - (float) Math.floor(hue)) * 6.0f;
        float f = h - (float) Math.floor(h);
        float q = 1.0f - f;
        float t = 1.0f - (1.0f - f);
        switch ((int) h) {
            case 0 -> {
                r = (int) (255.0f + 0.5f);
                g = (int) (t * 255.0f + 0.5f);
            }
            case 1 -> {
                r = (int) (q * 255.0f + 0.5f);
                g = (int) (255.0f + 0.5f);
            }
            case 2 -> {
                g = (int) (255.0f + 0.5f);
                b = (int) (t * 255.0f + 0.5f);
            }
            case 3 -> {
                g = (int) (q * 255.0f + 0.5f);
                b = (int) (255.0f + 0.5f);
            }
            case 4 -> {
                r = (int) (t * 255.0f + 0.5f);
                b = (int) (255.0f + 0.5f);
            }
            case 5 -> {
                r = (int) (255.0f + 0.5f);
                b = (int) (q * 255.0f + 0.5f);
            }
        }

        return 0xff000000 | (r << 16) | (g << 8) | b;
    }
}
