package com.zircky.industrialsorcerygreg.utils.register;

import com.zircky.industrialsorcerygreg.ISGCore;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;

public final class MaterialsRegisterUtils {

    private MaterialsRegisterUtils() {
        /* This utility class should not be instantiated */
    }

    public static Material.Builder material(String name, String en) {
        return new Material.Builder(ISGCore.id(name))
                .langValue(en);
    }

    public static Material.Builder material(String name) {
        return new Material.Builder(ISGCore.id(name));
    }
}
