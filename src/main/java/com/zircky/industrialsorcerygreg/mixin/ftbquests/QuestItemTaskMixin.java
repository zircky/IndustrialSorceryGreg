package com.zircky.industrialsorcerygreg.mixin.ftbquests;

import com.zircky.industrialsorcerygreg.integration.ftbquests.QuestRecipeViewer;

import net.minecraft.world.item.ItemStack;

import dev.ftb.mods.ftblibrary.ui.Button;
import dev.ftb.mods.ftbquests.quest.task.ItemTask;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

@Pseudo
@Mixin(targets = "dev.ftb.mods.ftbquests.quest.task.ItemTask", remap = false)
public abstract class QuestItemTaskMixin {

    @Inject(method = "onButtonClicked", at = @At("HEAD"), cancellable = true)
    private void isg$showRecipes(Button button, boolean canSubmit, CallbackInfo ci) {
        final ItemTask task = (ItemTask) (Object) this;
        if (task.consumesResources()) {
            return;
        }
        final List<ItemStack> items = task.getValidDisplayItems();
        if (items.size() == 1 && QuestRecipeViewer.showRecipes(items.get(0))) {
            button.playClickSound();
            ci.cancel();
        }
    }
}
