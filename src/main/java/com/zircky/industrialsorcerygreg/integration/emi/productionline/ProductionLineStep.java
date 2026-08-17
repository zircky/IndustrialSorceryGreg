package com.zircky.industrialsorcerygreg.integration.emi.productionline;

import dev.emi.emi.api.stack.EmiStack;

public record ProductionLineStep(String machine, EmiStack stack) {
}
