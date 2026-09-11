package com.zircky.industrialsorcerygreg.integration.ae2.machine;

import com.gregtechceu.gtceu.api.blockentity.BlockEntityCreationInfo;
import com.gregtechceu.gtceu.integration.ae2.machine.MEPatternBufferPartMachine;
import com.gregtechceu.gtceu.common.mui.GTGuiTextures;
import net.minecraft.network.chat.Component;

import appeng.crafting.pattern.EncodedPatternItem;
import brachy.modularui.factory.PosGuiData;
import brachy.modularui.screen.UISettings;
import brachy.modularui.value.sync.BooleanSyncValue;
import brachy.modularui.value.sync.PanelSyncManager;
import brachy.modularui.value.sync.SyncHandlers;
import brachy.modularui.widget.ParentWidget;
import brachy.modularui.widgets.PageButton;
import brachy.modularui.widgets.PagedWidget;
import brachy.modularui.widgets.layout.Flow;
import brachy.modularui.widgets.layout.Grid;
import brachy.modularui.widgets.slot.ItemSlot;
import brachy.modularui.widgets.slot.SlotGroup;
import brachy.modularui.api.drawable.Text;

public class MEExtendedPatternBufferPartMachine extends MEPatternBufferPartMachine implements MEPatternBufferSizeProvider {
  public static final int PATTERN_BUFFER_SIZE = 108;
  private static final int PATTERN_SLOTS_PER_PAGE = 36;
  private static final int PATTERN_SLOTS_PER_ROW = 9;

  public MEExtendedPatternBufferPartMachine(BlockEntityCreationInfo info) {
    super(info);
  }

  @Override
  public int getPatternBufferSize() {
    return PATTERN_BUFFER_SIZE;
  }

  @Override
  public void buildMainUI(ParentWidget<?> mainWidget, PosGuiData guiData, PanelSyncManager syncManager,
                          UISettings settings) {
    SlotGroup patternSlotGroup = new SlotGroup("pattern_slots", PATTERN_SLOTS_PER_ROW, 0, true);

    BooleanSyncValue isOnlineValue = new BooleanSyncValue(this::isOnline, this::setOnline);
    syncManager.syncValue("is_online", isOnlineValue);

    var flow = Flow.col().coverChildren();
    flow.child(Text.dynamic(() -> isOnlineValue.getBoolValue() ?
            Component.translatable("gtceu.gui.me_network.online") :
            Component.translatable("gtceu.gui.me_network.offline"))
        .asWidget().marginTop(2).marginBottom(4));

    var pageController = new PagedWidget.Controller();
    var pages = new PagedWidget<>().size(18 * PATTERN_SLOTS_PER_ROW, 18 * 4).controller(pageController);
    int pageCount = (getPatternBufferSize() + PATTERN_SLOTS_PER_PAGE - 1) / PATTERN_SLOTS_PER_PAGE;

    for (int page = 0; page < pageCount; page++) {
      int pageStart = page * PATTERN_SLOTS_PER_PAGE;
      int slotsOnPage = Math.min(PATTERN_SLOTS_PER_PAGE, getPatternBufferSize() - pageStart);
      pages.addPage(new Grid()
          .height(18 * 4)
          .minElementMargin(0, 0)
          .minColWidth(18).minRowHeight(18)
          .leftRel(0.5f)
          .gridOfSizeWidth(slotsOnPage, PATTERN_SLOTS_PER_ROW, (x, y, pageIndex) -> {
            int index = pageStart + pageIndex;
            return new ItemSlot()
                .slot(SyncHandlers.itemSlot(getPatternInventory(), index)
                    .slotGroup(patternSlotGroup)
                    .accessibility(true, true)
                    .filter(stack -> stack.getItem() instanceof EncodedPatternItem)
                    .changeListener((i, o, c, init) -> onPatternChange(index)))
                .background(GTGuiTextures.SLOT, GTGuiTextures.PATTERN_OVERLAY);
          }));
    }

    flow.child(pages);
    flow.child(Flow.row()
        .coverChildren()
        .childPadding(2)
        .children(pageCount, page -> new PageButton(page, pageController)
            .size(18)
            .overlay(Text.str(Integer.toString(page + 1)).asIcon().size(12))));

    mainWidget.child(flow.center());
  }
}
