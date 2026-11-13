package com.zircky.industrialsorcerygreg;

import com.gregtechceu.gtceu.utils.FormattingUtil;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.ModList;

import appeng.core.AppEng;

import static com.zircky.industrialsorcerygreg.api.ISGValues.*;

public class ISGIntegration {

    private static final ResourceLocation TEMPLATE_LOCATION_AE2 = ResourceLocation.fromNamespaceAndPath(AppEng.MOD_ID,
            "");

    public static boolean isAdAstraLoaded() {
        return isLoaded(MODID_AD_ASTRA);
    }

    public static boolean isAE2Loaded() {
        return isLoaded(MODID_APPENG);
    }

    private static boolean isLoaded(String mod) {
        return ModList.get().isLoaded(mod);
    }

    public static ResourceLocation idAE2(String path) {
        if (path.isBlank()) {
            return TEMPLATE_LOCATION_AE2;
        }

        int i = path.indexOf(':');
        if (i > 0) {
            return ResourceLocation.parse(path);
        } else if (i == 0) {
            path = path.substring(i + 1);
        }
        // only convert it to camel_case if it has any uppercase to begin with
        if (FormattingUtil.hasUpperCase(path)) {
            path = FormattingUtil.toLowerCaseUnderscore(path);
        }
        return TEMPLATE_LOCATION_AE2.withPath(path);
    }
}
