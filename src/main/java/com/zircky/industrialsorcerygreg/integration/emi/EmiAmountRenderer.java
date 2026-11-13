package com.zircky.industrialsorcerygreg.integration.emi;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;

import dev.emi.emi.runtime.EmiDrawContext;

public final class EmiAmountRenderer {

    private static final int ICON_SIZE = 16;
    private static final int TEXT_LAYER = 200;
    private static final long COMPACT_THRESHOLD = 10_000;
    private static final int UNIT_BASE = 1_000;
    private static final String[] SUFFIXES = { "", "k", "m", "B", "T", "P", "E" };

    private EmiAmountRenderer() {}

    public static void render(EmiDrawContext context, int x, int y, long amount) {
        if (amount == 1) {
            return;
        }
        final String text = format(amount);
        final Font font = Minecraft.getInstance().font;
        final int width = font.width(text);
        final float scale = Math.min(1.0F, (float) ICON_SIZE / width);
        context.push();
        context.matrices().translate(x + ICON_SIZE - width * scale,
                y + ICON_SIZE - font.lineHeight * scale, TEXT_LAYER);
        context.matrices().scale(scale, scale, 1.0F);
        context.raw().drawString(font, text, 0, 0, -1, true);
        context.pop();
    }

    public static String format(long amount) {
        if (amount < COMPACT_THRESHOLD) {
            return Long.toString(amount);
        }
        long divisor = UNIT_BASE;
        int unit = 1;
        // Dividing before comparing avoids overflow at the largest long values.
        while (unit < SUFFIXES.length - 1 && amount / divisor >= UNIT_BASE) {
            divisor *= UNIT_BASE;
            unit++;
        }
        final long whole = amount / divisor;
        final long decimal = amount % divisor / (divisor / 10);
        return whole + (decimal == 0 ? "" : "." + decimal) + SUFFIXES[unit];
    }
}
