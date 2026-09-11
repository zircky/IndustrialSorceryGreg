package com.zircky.industrialsorcerygreg.integration.ae2.machine;

import appeng.api.crafting.IPatternDetails;
import appeng.api.networking.crafting.ICraftingProvider;
import com.gregtechceu.gtceu.api.blockentity.BlockEntityCreationInfo;
import com.gregtechceu.gtceu.api.machine.multiblock.MultiblockControllerMachine;
import com.gregtechceu.gtceu.integration.ae2.machine.MEPatternBufferPartMachine;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.nbt.CompoundTag;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MEWildcardPatternBufferPartMachine extends MEPatternBufferPartMachine {

    private int scannedPatterns;

    @Setter
    private int patternPriority;

    @Getter
    private int maxFluidsOutput = 1;

    @Getter
    private int maxItemsOutput = 1;

    public MEWildcardPatternBufferPartMachine(BlockEntityCreationInfo info) {
        super(info);
    }

    @Override
    public int getPatternPriority() {
        return patternPriority;
    }

    @Override
    public void onPatternChange(int index) {
        super.onPatternChange(index);
        requestPatternUpdate();
    }

    @Override
    public @NotNull List<IPatternDetails> getAvailablePatterns() {
        List<IPatternDetails> patterns = super.getAvailablePatterns();
        scannedPatterns = patterns.size();
        return patterns;
    }

    @Override
    public void loadFromItem(@NotNull CompoundTag tag) {
        super.loadFromItem(tag);
        patternPriority = tag.getInt("patternPriority");
        maxFluidsOutput = Math.max(0, tag.getInt("maxFluidsOutput"));
        maxItemsOutput = Math.max(0, tag.getInt("maxItemsOutput"));
    }

    @Override
    public void saveToItem(@NotNull CompoundTag tag, boolean clone) {
        super.saveToItem(tag, clone);
        tag.putInt("patternPriority", patternPriority);
        tag.putInt("maxFluidsOutput", maxFluidsOutput);
        tag.putInt("maxItemsOutput", maxItemsOutput);
    }

    public int getScannedPatterns() {
        return scannedPatterns;
    }

    public void setMaxFluidsOutput(int maxFluidsOutput) {
        int value = Math.max(0, maxFluidsOutput);
        if (this.maxFluidsOutput != value) {
            this.maxFluidsOutput = value;
            requestPatternUpdate();
        }
    }

    public void setMaxItemsOutput(int maxItemsOutput) {
        int value = Math.max(0, maxItemsOutput);
        if (this.maxItemsOutput != value) {
            this.maxItemsOutput = value;
            requestPatternUpdate();
        }
    }

    private void requestPatternUpdate() {
        ICraftingProvider.requestUpdate(getMainNode());
    }

    public static void onMultiblockRecipeTypeChange(@NotNull MultiblockControllerMachine machine) {
        machine.getParts().stream()
                .filter(MEWildcardPatternBufferPartMachine.class::isInstance)
                .map(MEWildcardPatternBufferPartMachine.class::cast)
                .forEach(MEWildcardPatternBufferPartMachine::requestPatternUpdate);
    }
}
