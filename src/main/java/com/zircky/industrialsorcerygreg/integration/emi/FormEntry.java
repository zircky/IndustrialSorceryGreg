package com.zircky.industrialsorcerygreg.integration.emi;

import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import dev.emi.emi.api.stack.EmiStack;

public record FormEntry(TagPrefix prefix, EmiStack stack) {
}
