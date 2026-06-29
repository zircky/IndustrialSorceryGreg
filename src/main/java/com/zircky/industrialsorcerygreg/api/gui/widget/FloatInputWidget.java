package com.zircky.industrialsorcerygreg.api.gui.widget;

import brachy.modularui.utils.FloatConsumer;
import brachy.modularui.utils.FloatSupplier;
import brachy.modularui.value.sync.FloatSyncValue;
import brachy.modularui.widgets.textfield.TextFieldWidget;

public class FloatInputWidget extends TextFieldWidget {

  public FloatInputWidget(int x, int y, int width, int height, FloatSupplier valueSupplier,
                          FloatConsumer onChanged) {
    pos(x, y);
    size(width, height);
    value(new FloatSyncValue(valueSupplier, onChanged));
    setNumbersDouble(() -> 0, () -> Float.MAX_VALUE);
  }
}
