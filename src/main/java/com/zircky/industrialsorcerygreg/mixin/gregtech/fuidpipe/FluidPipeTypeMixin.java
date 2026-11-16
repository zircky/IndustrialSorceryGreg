package com.zircky.industrialsorcerygreg.mixin.gregtech.fuidpipe;

import com.zircky.industrialsorcerygreg.ISGCore;
import com.zircky.industrialsorcerygreg.common.data.ISGMaterials;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.block.PipeBlock;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
import com.gregtechceu.gtceu.api.registry.registrate.provider.GTBlockstateProvider;
import com.gregtechceu.gtceu.client.model.pipe.PipeModel;
import com.gregtechceu.gtceu.common.pipelike.fluidpipe.FluidPipeType;

import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(FluidPipeType.class)
public class FluidPipeTypeMixin {

    @Shadow(remap = false)
    @Final
    public float thickness;

    @Shadow(remap = false)
    @Final
    public String name;

    @Shadow(remap = false)
    @Final
    public int capacityMultiplier;

    @Shadow(remap = false)
    @Final
    public int channels;

    /**
     * @author .
     * @reason .
     */
    @Overwrite(remap = false)
    public PipeModel createPipeModel(
                                     PipeBlock<?, ?, ?> block,
                                     Material material,
                                     GTBlockstateProvider provider) {
        final boolean isSpaceTime = material == ISGMaterials.SpaceTime;

        String side = isSpaceTime ? "block/material_sets/spacetime/pipe%s_side" : "block/pipe/pipe%s_side";

        String end = isSpaceTime ? "block/material_sets/spacetime/pipe_%s_in".formatted(name) :
                "block/pipe/pipe_%s_in".formatted(name);

        if (!isSpaceTime && material.hasProperty(PropertyKey.WOOD)) {
            side += "_wood";
            end += "_wood";
        }

        final String channelSuffix = switch (channels) {
            case 9 -> "_non";
            case 4 -> "_quad";
            default -> "";
        };

        side = side.formatted(channelSuffix);

        return new PipeModel(
                block,
                provider,
                thickness,
                isSpaceTime ? ISGCore.id(side) : GTCEu.id(side),
                isSpaceTime ? ISGCore.id(end) : GTCEu.id(end));
    }
}
