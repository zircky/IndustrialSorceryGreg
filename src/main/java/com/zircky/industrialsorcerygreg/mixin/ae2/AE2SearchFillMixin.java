package com.zircky.industrialsorcerygreg.mixin.ae2;

import com.zircky.industrialsorcerygreg.integration.search.SearchFillHelper;

import appeng.client.gui.me.common.MEStorageScreen;
import appeng.client.gui.widgets.AETextField;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MEStorageScreen.class)
public abstract class AE2SearchFillMixin {

    @Shadow(remap = false)
    private AETextField searchField;

    @Shadow(remap = false)
    private void setSearchText(String text) {}

    @Inject(method = "mouseClicked(DDI)Z", at = @At("HEAD"), cancellable = true)
    private void industrialsorcerygreg$fillSearchFromCarriedItem(
                                                                 double xCoord, double yCoord, int button,
                                                                 CallbackInfoReturnable<Boolean> cir) {
        if (button != 0 || !searchField.isMouseOver(xCoord, yCoord)) return;

        SearchFillHelper.carriedItemName().ifPresent(name -> {
            searchField.setValue(name);
            searchField.setFocused(true);
            setSearchText(name);
            cir.setReturnValue(true);
        });
    }
}
