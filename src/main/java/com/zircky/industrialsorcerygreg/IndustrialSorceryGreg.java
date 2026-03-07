package com.zircky.industrialsorcerygreg;

import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.data.chemical.material.event.MaterialEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.event.MaterialRegistryEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.event.PostMaterialEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.registry.MaterialRegistry;
import com.gregtechceu.gtceu.api.machine.MachineDefinition;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.gregtechceu.gtceu.utils.FormattingUtil;
import com.mojang.logging.LogUtils;
import com.zircky.industrialsorcerygreg.api.registries.ISGRegistries;
import com.zircky.industrialsorcerygreg.common.data.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(IndustrialSorceryGreg.MODID)
public class IndustrialSorceryGreg {

  public static final String MODID = "industrialsorcerygreg";
  private static final ResourceLocation TEMPLATE_LOCATION = new ResourceLocation(MODID, "");
  public static final String NAME = "IndustrialSorceryGreg";
  public static final Logger LOGGER = LogUtils.getLogger();
  public static MaterialRegistry MATERIAL_REGISTRY;

  public IndustrialSorceryGreg() {
    IndustrialSorceryGreg.init();
    var bus = FMLJavaModLoadingContext.get().getModEventBus();
    bus.register(this);

    bus.addListener(this::commonSetup);
  }

  public static void init() {

    ISGPlaceholders.register();

    ISGRegistries.REGISTRATE.registerRegistrate();
  }

  public static ResourceLocation id(String path) {
    if (path.isBlank()) {
      return TEMPLATE_LOCATION;
    }

    int i = path.indexOf(':');
    if (i > 0) {
      return new ResourceLocation(path);
    } else if (i == 0) {
      path = path.substring(i + 1);
    }
    // only convert it to camel_case if it has any uppercase to begin with
    if (FormattingUtil.hasUpperCase(path)) {
      path = FormattingUtil.toLowerCaseUnderscore(path);
    }
    return TEMPLATE_LOCATION.withPath(path);
  }

  private void commonSetup(final FMLCommonSetupEvent event) {
//    event.enqueueWork(AddonTierNamePatcher::apply);
  }

  @SubscribeEvent
  public void registerMaterialRegistryEvent(MaterialRegistryEvent event) {
  }

  @SubscribeEvent
  public void registerMaterials(MaterialEvent event) {
  }

  @SubscribeEvent
  public void modifyMaterials(PostMaterialEvent event) {
  }

  @SubscribeEvent
  public void registerRecipeTypes(GTCEuAPI.RegisterEvent<ResourceLocation, GTRecipeType> event) {
  }

  @SubscribeEvent
  public void registerMachines(GTCEuAPI.RegisterEvent<ResourceLocation, MachineDefinition> event) {
  }

}
