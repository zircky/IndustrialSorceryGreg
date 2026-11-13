package com.zircky.industrialsorcerygreg.integration.jei;

import com.zircky.industrialsorcerygreg.ISGCore;

import net.minecraft.resources.ResourceLocation;

import dev.emi.emi.jemi.JemiPlugin;
import mezz.jei.api.IModPlugin;
import mezz.jei.library.plugins.jei.JeiInternalPlugin;
import mythicbotany.jei.MythicJei;
import org.jetbrains.annotations.NotNull;
import wayoftime.bloodmagic.compat.jei.BloodMagicJEIPlugin;

import java.util.List;

public final class GTJEIPlugin implements IModPlugin {

    public static void addJEIPlugin(List<IModPlugin> list) {
        list.add(new GTJEIPlugin());
        list.add(new mezz.jei.library.plugins.vanilla.VanillaPlugin());
        list.add(new JeiInternalPlugin());
        list.add(new JemiPlugin());
        list.add(new MythicJei());
        list.add(new de.mari_023.ae2wtlib.reijei.JEIPlugin());
        list.add(new BloodMagicJEIPlugin());
    }

    @Override
    public @NotNull ResourceLocation getPluginUid() {
        return ISGCore.id("jei_plugin");
    }
}
