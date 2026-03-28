package com.zircky.industrialsorcerygreg;

import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.data.chemical.material.event.MaterialEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.event.MaterialRegistryEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.event.PostMaterialEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.registry.MaterialRegistry;
import com.gregtechceu.gtceu.api.machine.MachineDefinition;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.gregtechceu.gtceu.utils.FormattingUtil;
import com.lowdragmc.lowdraglib.Platform;
import com.mojang.logging.LogUtils;
import com.zircky.industrialsorcerygreg.api.gregtech.AddonTierNamePatcher;
import com.zircky.industrialsorcerygreg.api.registries.ISGRegistries;
import com.zircky.industrialsorcerygreg.client.ClientProxy;
import com.zircky.industrialsorcerygreg.common.data.*;
import com.zircky.industrialsorcerygreg.data.ISGDatagen;
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
    bus.addGenericListener(GTRecipeType.class, this::registerRecipeTypes);
    bus.addGenericListener(MachineDefinition.class, this::registerMachines);

    bus.addListener(this::commonSetup);

    if (Platform.isClient()) {
      ClientProxy.init(bus);
    }
  }

  public static void init() {
    ISGCreativeModeTabs.init();
    ISGItems.init();

    ISGPlaceholders.register();

    ISGDatagen.initPost();

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
    event.enqueueWork(AddonTierNamePatcher::apply);
  }

  @SubscribeEvent
  public void registerMaterialRegistryEvent(MaterialRegistryEvent event) {
    MATERIAL_REGISTRY = GTCEuAPI.materialManager.createRegistry(MODID);
  }

  @SubscribeEvent
  public void registerMaterials(MaterialEvent event) {
    ISGMaterials.init();
  }

  @SubscribeEvent
  public void modifyMaterials(PostMaterialEvent event) {
    ISGMaterials.modifyMaterials();
  }

  @SubscribeEvent
  public void registerRecipeTypes(GTCEuAPI.RegisterEvent<ResourceLocation, GTRecipeType> event) {
    ISGRecipeTypes.init();
  }

  @SubscribeEvent
  public void registerMachines(GTCEuAPI.RegisterEvent<ResourceLocation, MachineDefinition> event) {
    ISGMachines.init();
  }

}
