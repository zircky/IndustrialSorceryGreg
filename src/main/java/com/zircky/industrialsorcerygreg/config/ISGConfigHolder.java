package com.zircky.industrialsorcerygreg.config;

import com.zircky.industrialsorcerygreg.ISGCore;
import dev.toma.configuration.Configuration;
import dev.toma.configuration.config.Config;
import dev.toma.configuration.config.Configurable;
import dev.toma.configuration.config.UpdateRestrictions;
import dev.toma.configuration.config.format.ConfigFormats;
import org.jetbrains.annotations.ApiStatus;

@Config(id = ISGCore.MODID)
public class ISGConfigHolder {
  public static ISGConfigHolder INSTANCE;
  private static final Object LOCK = new Object();

  @ApiStatus.Internal
  public static dev.toma.configuration.config.ConfigHolder<ISGConfigHolder> INTERNAL_INSTANCE;

  public static void init() {
    synchronized (LOCK) {
      if (INSTANCE == null || INTERNAL_INSTANCE == null) {
        INTERNAL_INSTANCE = Configuration.registerConfig(ISGConfigHolder.class, ConfigFormats.YAML);
        INSTANCE = INTERNAL_INSTANCE.getConfigInstance();
      }
    }
  }

  public static ISGConfigHolder getInstance() {
    init();
    return INSTANCE;
  }

  @Configurable
  public ISGRecipeConfigs recipes = new ISGRecipeConfigs();

  public static class ISGRecipeConfigs {

    @Configurable
    @Configurable.Comment({
        "Change the recipe of Rods in the Lathe to 1 Rod and 2 Small Piles of Dust, instead of 2 Rods.",
        "Default: true"})
    @Configurable.UpdateRestriction(UpdateRestrictions.MAIN_MENU)
    public boolean harderRods = true; // default true

  }
}
