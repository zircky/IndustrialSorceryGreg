package com.zircky.industrialsorcerygreg.common.machine.multiblock.part;

import com.zircky.industrialsorcerygreg.api.machine.trait.notifiable.NotifiableCatalystHandler;

import com.gregtechceu.gtceu.api.blockentity.BlockEntityCreationInfo;
import com.gregtechceu.gtceu.api.capability.recipe.IO;
import com.gregtechceu.gtceu.api.machine.feature.IMuiMachine;
import com.gregtechceu.gtceu.api.machine.multiblock.MultiblockControllerMachine;
import com.gregtechceu.gtceu.api.machine.multiblock.part.TieredIOPartMachine;
import com.gregtechceu.gtceu.api.machine.trait.notifiable.NotifiableItemStackHandler;
import com.gregtechceu.gtceu.api.sync_system.annotations.SaveField;
import com.gregtechceu.gtceu.common.mui.GTGuiTextures;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.world.item.ItemStack;

import brachy.modularui.factory.PosGuiData;
import brachy.modularui.screen.UISettings;
import brachy.modularui.value.sync.PanelSyncManager;
import brachy.modularui.value.sync.SyncHandlers;
import brachy.modularui.widget.ParentWidget;
import brachy.modularui.widgets.layout.Grid;
import brachy.modularui.widgets.slot.ItemSlot;
import brachy.modularui.widgets.slot.SlotGroup;

import javax.annotation.ParametersAreNonnullByDefault;

import static com.gregtechceu.gtceu.api.GTValues.ZPM;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public final class CatalystHatchPartMachine extends TieredIOPartMachine implements IMuiMachine {

    private static final int ROW_SIZE = 6;
    private static final int INVENTORY_SIZE = ROW_SIZE * ROW_SIZE;

    @SaveField
    private final NotifiableItemStackHandler inventory;

    public CatalystHatchPartMachine(BlockEntityCreationInfo info) {
        super(info, ZPM, IO.IN);
        this.inventory = attachTrait(new NotifiableCatalystHandler(INVENTORY_SIZE, true));
    }

    @Override
    public void buildMainUI(ParentWidget<?> mainWidget, PosGuiData guiData, PanelSyncManager syncManager,
                            UISettings settings) {
        SlotGroup group = new SlotGroup("catalyst_inventory", ROW_SIZE, 0, true);
        Grid grid = new Grid()
                .coverChildren()
                .margin(7, 5)
                .gridOfSizeHeight(INVENTORY_SIZE, ROW_SIZE, (x, y, index) -> new ItemSlot()
                        .slot(SyncHandlers.itemSlot(inventory.storage, index)
                                .slotGroup(group)
                                .changeListener((oldStack, newStack, client, init) -> {
                                    if (ItemStack.isSameItem(oldStack, newStack)) {
                                        inventory.onContentsChanged();
                                    }
                                })
                                .accessibility(io.support(IO.IN), true))
                        .background(GTGuiTextures.SLOT));
        mainWidget.child(grid.center());
    }

    @Override
    public boolean canShared(MultiblockControllerMachine controller, String substructureName) {
        return false;
    }
}
