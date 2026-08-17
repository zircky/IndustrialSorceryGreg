package com.zircky.industrialsorcerygreg.common.data.materials;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.ToolProperty;
import com.gregtechceu.gtceu.api.fluids.FluidBuilder;
import com.gregtechceu.gtceu.api.fluids.attribute.FluidAttributes;
import com.gregtechceu.gtceu.common.data.GTElements;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.zircky.industrialsorcerygreg.api.ISGValues;
import com.zircky.industrialsorcerygreg.api.data.material.ISGMaterialFlags;
import com.zircky.industrialsorcerygreg.common.data.ISGElement;
import com.zircky.industrialsorcerygreg.common.data.ISGMaterials;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.FLUID;
import static com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty.GasTier.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.SNDART_FLAGS;
import static com.zircky.industrialsorcerygreg.common.data.materials.ISGMaterialIconSet.CHAOS;
import static com.zircky.industrialsorcerygreg.common.data.materials.ISGMaterialIconSet.INFINITY;
import static com.zircky.industrialsorcerygreg.utils.register.MaterialsRegisterUtils.material;


public final class AlloyAndPolymerMaterials {
  private AlloyAndPolymerMaterials() {
  }

  public static void register() {
    EglinSteel = builderISG("eglin_steel")
        .ingot(6).fluid()
        .color(0x8B4513)
        .iconSet(METALLIC)
        .components(ISGMaterials.EglinSteelBase, 10, GTMaterials.Sulfur, 1, GTMaterials.Silicon, 1, GTMaterials.Carbon, 1)
        .appendFlags(SNDART_FLAGS)
        .blastTemp(1048)
        .buildAndRegister();

    Grisium = builderISG("grisium")
        .ingot(6).fluid()
        .color(0x355D6A)
        .iconSet(METALLIC)
        .components(GTMaterials.Titanium, 9, GTMaterials.Carbon, 9, GTMaterials.Potassium, 9, GTMaterials.Lithium, 9, GTMaterials.Sulfur, 9, GTMaterials.Hydrogen, 5)
        .appendFlags(SNDART_FLAGS)
        .blastTemp(3850)
        .buildAndRegister();

    Inconel625 = builderISG("inconel_625")
        .ingot(6).fluid()
        .color(0x80C880)
        .iconSet(METALLIC)
        .components(GTMaterials.Nickel, 3, GTMaterials.Chromium, 7, GTMaterials.Molybdenum, 10, GTMaterials.Invar, 10, GTMaterials.Nichrome, 13)
        .appendFlags(SNDART_FLAGS)
        .blastTemp(2425)
        .buildAndRegister();

    MaragingSteel250 = builderISG("maraging_steel_250")
        .ingot(6).fluid()
        .color(0x92918D)
        .iconSet(METALLIC)
        .components(GTMaterials.Steel, 16, GTMaterials.Molybdenum, 1, GTMaterials.Titanium, 1, GTMaterials.Nickel, 4, GTMaterials.Cobalt, 2)
        .appendFlags(SNDART_FLAGS)
        .blastTemp(2413)
        .buildAndRegister();

    Staballoy = builderISG("staballoy")
        .ingot(6).fluid()
        .color(0x444B42)
        .iconSet(METALLIC)
        .components(GTMaterials.Uranium238, 9, GTMaterials.Titanium, 1)
        .flags(DISABLE_DECOMPOSITION)
        .appendFlags(SNDART_FLAGS)
        .blastTemp(3450)
        .buildAndRegister();

    HastelloyN = builderISG("hastelloy_n")
        .langValue("Hastelloy N")
        .ingot(6).fluid()
        .color(0xDDDDDD)
        .iconSet(METALLIC)
        .components(GTMaterials.Yttrium, 2, GTMaterials.Molybdenum, 4, GTMaterials.Chromium, 2, GTMaterials.Titanium, 2, GTMaterials.Nickel, 15)
        .appendFlags(SNDART_FLAGS)
        .blastTemp(4350)
        .buildAndRegister();

    Tumbaga = builderISG("tumbaga")
        .ingot(6).fluid()
        .color(0xFFB20F)
        .iconSet(METALLIC)
        .components(GTMaterials.Gold, 7, GTMaterials.Bronze, 3)
        .appendFlags(SNDART_FLAGS)
        .blastTemp(1200)
        .buildAndRegister();

    Stellite = builderISG("stellite")
        .ingot(6).fluid()
        .color(0x9991A5)
        .iconSet(METALLIC)
        .components(GTMaterials.Cobalt, 9, GTMaterials.Chromium, 9, GTMaterials.Manganese, 5, GTMaterials.Titanium, 2)
        .appendFlags(SNDART_FLAGS)
        .blastTemp(4310)
        .buildAndRegister();

    Talonite = builderISG("talonite")
        .ingot(6).fluid()
        .color(0x9991A5)
        .iconSet(SHINY)
        .components(GTMaterials.Cobalt, 4, GTMaterials.Chromium, 3, GTMaterials.Phosphorus, 2, GTMaterials.Molybdenum, 1)
        .appendFlags(SNDART_FLAGS)
        .blastTemp(3454)
        .buildAndRegister();

    Enderium = builderISG("enderium")
        .ingot(3).fluid()
        .color(0x23524a)
        .iconSet(METALLIC)
        .fluidPipeProperties(650, 1500, true)
        .components(GTMaterials.Lead, 3, GTMaterials.Platinum, 1, GTMaterials.EnderPearl, 1)
        .appendFlags(SNDART_FLAGS, DISABLE_DECOMPOSITION)
        .toolStats(ToolProperty.Builder.of(8.0F, 3.0F, 1280, 3).build())
        .blastTemp(4500)
        .buildAndRegister();

    Nitinol60 = builderISG("nitinol_60")
        .ingot(4).fluid()
        .color(0xCCB0EC)
        .iconSet(METALLIC)
        .components(GTMaterials.Nickel, 2, GTMaterials.Titanium, 3)
        .appendFlags(SNDART_FLAGS)
        .blastTemp(GTMaterials.Titanium.getBlastTemperature())
        .buildAndRegister();

    BabbittAlloy = builderISG("babbitt_alloy")
        .ingot(4).fluid()
        .color(0xA19CA4)
        .iconSet(METALLIC)
        .components(GTMaterials.Tin, 5, GTMaterials.Lead, 36, GTMaterials.Antimony, 8, GTMaterials.Arsenic, 1)
        .appendFlags(SNDART_FLAGS)
        .blastTemp(737)
        .buildAndRegister();

    HG1223 = builderISG("hg_1223")
        .ingot(4).fluid()
        .color(0x245397)
        .iconSet(METALLIC)
        .components(GTMaterials.Mercury, 1, GTMaterials.Barium, 2, GTMaterials.Calcium, 2, GTMaterials.Copper, 3, GTMaterials.Oxygen, 8)
        .appendFlags(SNDART_FLAGS)
        .blastTemp(5325)
        .buildAndRegister();

    ZirconiumCarbide = builderISG("zirconium_carbide")
        .ingot(2).fluid()
        .color(0xFFDACD)
        .iconSet(SHINY)
        .components(GTMaterials.Zirconium, 1, GTMaterials.Carbon, 1)
        .appendFlags(SNDART_FLAGS)
        .blastTemp(1200)
        .buildAndRegister();

    GoldAlloy = builderISG("gold_alloy")
        .ingot(2).fluid()
        .color(0xBBA52B)
        .iconSet(SHINY)
        .components(GTMaterials.Copper, 3, GTMaterials.Gold, 1, GTMaterials.RareEarth, 1)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    PreciousMetal = builderISG("precious_metal")
        .ore()
        .ingot(2).fluid()
        .color(0xB99023)
        .iconSet(SHINY)
        .components(GTMaterials.Gold, 1, GTMaterials.RareEarth, 1)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    LithiumFluoride = builderISG("lithium_fluoride")
        .ingot(2).fluid()
        .color(0x757575)
        .iconSet(SHINY)
        .components(GTMaterials.Lithium, 1, GTMaterials.Fluorine, 1)
        .buildAndRegister();

    LeadBismuthEutectic = builderISG("lead_bismuth_eutatic")
        .ingot(2).fluid()
        .color(0x757575)
        .iconSet(SHINY)
        .components(GTMaterials.Lead, 3, GTMaterials.Bismuth, 7)
        .buildAndRegister();

    AbyssalAlloy = builderISG("abyssal_alloy")
        .ingot(6).fluid()
        .color(0x9E706A)
        .iconSet(METALLIC)
        .radioactiveHazard(10)
        .blastTemp(10800, HIGHER, GTValues.VA[GTValues.UV], 1800)
        .components(GTMaterials.StainlessSteel, 5,
            GTMaterials.TungstenCarbide, 5, GTMaterials.Nichrome, 5, GTMaterials.Bronze, 5,
            GTMaterials.IncoloyMA956, 5, GTMaterials.Iodine, 1, GTMaterials.Germanium, 1, GTMaterials.Radon, 1, GTMaterials.Hafnium, 1)
        .appendFlags(SNDART_FLAGS, DISABLE_DECOMPOSITION)
        .cableProperties(GTValues.V[GTValues.UHV], 4, 64)
        .buildAndRegister();

    ReactorSteel = builderISG("reactor_steel")
        .ingot(2).fluid()
        .color(0xB4B3B0)
        .iconSet(SHINY)
        .components(GTMaterials.Iron, 15, GTMaterials.Niobium, 1, GTMaterials.Vanadium, 4, GTMaterials.Carbon, 2)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    Incoloy813 = builderISG("incoloy_813")
        .ingot(2).fluid()
        .color(0x37bf7e)
        .iconSet(SHINY)
        .components(GTMaterials.VanadiumSteel, 4, GTMaterials.Osmiridium, 2, GTMaterials.Technetium, 3, GTMaterials.Germanium, 4, GTMaterials.Iridium, 7, GTMaterials.Duranium, 5, ISGMaterials.Californium252, 1)
        .appendFlags(SNDART_FLAGS, DISABLE_DECOMPOSITION)
        .blastTemp(10000)
        .buildAndRegister();

    EnrichedNaquadahAlloy = builderISG("enriched_naquadah_alloy")
        .ingot(2).fluid()
        .color(0x403f3d)
        .iconSet(SHINY)
        .components(GTMaterials.NaquadahEnriched, 4, GTMaterials.Rhodium, 2, GTMaterials.Ruthenium, 2, GTMaterials.Dubnium, 1, GTMaterials.Rubidium, 2, ISGMaterials.Einsteinium255, 1)
        .appendFlags(SNDART_FLAGS, DISABLE_DECOMPOSITION)
        .blastTemp(10000)
        .fluidPipeProperties(2200, 2500, true)
        .buildAndRegister();

    HastelloyX78 = builderISG("hastelloy_x78")
        .ingot(2).fluid()
        .color(0x6ba3e3)
        .iconSet(SHINY)
        .components(GTMaterials.NaquadahAlloy, 10, Rhenium, 5, GTMaterials.Naquadria, 4, GTMaterials.Gadolinium, 3, GTMaterials.Strontium, 2, GTMaterials.Polonium, 3, GTMaterials.Rutherfordium, 2, ISGMaterials.Fermium258, 1)
        .appendFlags(SNDART_FLAGS, DISABLE_DECOMPOSITION)
        .blastTemp(12000)
        .buildAndRegister();

    HastelloyK243 = builderISG("hastelloy_k243")
        .ingot(2).fluid()
        .color(0xa5f564)
        .iconSet(SHINY)
        .components(ISGMaterials.HastelloyX78, 5, GTMaterials.NiobiumNitride, 2, GTMaterials.Tritanium, 4, GTMaterials.TungstenCarbide, 4, GTMaterials.Promethium, 4, ISGMaterials.Mendelevium261, 1)
        .appendFlags(SNDART_FLAGS, DISABLE_DECOMPOSITION)
        .blastTemp(12100)
        .buildAndRegister();

    Polyetheretherketone = builderISG("polyetheretherketone")
        .polymer(2)
        .fluid()
        .color(0x403e37)
        .iconSet(DULL)
        .components(GTMaterials.Carbon, 20, GTMaterials.Hydrogen, 12, GTMaterials.Oxygen, 3)
        .flags(DISABLE_DECOMPOSITION, GENERATE_PLATE)
        .buildAndRegister();

    Zylon = builderISG("zylon")
        .polymer(2)
        .fluid()
        .color(0xFFE000)
        .iconSet(SHINY)
        .components(GTMaterials.Carbon, 14, GTMaterials.Hydrogen, 6, GTMaterials.Nitrogen, 2, GTMaterials.Oxygen, 2)
        .flags(DISABLE_DECOMPOSITION, GENERATE_PLATE)
        .buildAndRegister();

    FullerenePolymerMatrix = builderISG("fullerene_polymer_matrix")
        .polymer(2)
        .fluid()
        .color(0x403e37)
        .iconSet(DULL)
        .components(GTMaterials.Palladium, 1, GTMaterials.Iron, 1, GTMaterials.Carbon, 153, GTMaterials.Hydrogen, 36, GTMaterials.Nitrogen, 1, GTMaterials.Oxygen, 2)
        .flags(DISABLE_DECOMPOSITION, GENERATE_PLATE)
        .buildAndRegister();

    CarbonNanotubes = builderISG("carbon_nanotubes")
        .polymer(5).fluid()
        .color(0x2c2c2c)
        .iconSet(SHINY)
        .components(GTMaterials.Carbon, 1)
        .flags(DISABLE_DECOMPOSITION, GENERATE_PLATE, GENERATE_FINE_WIRE, GENERATE_FOIL)
        .buildAndRegister();

    BlackTitanium = builderISG("black_titanium")
        .ingot(7).fluid()
        .color(0x6C003B)
        .iconSet(SHINY)
        .components(GTMaterials.Titanium, 26, GTMaterials.Lanthanum, 6, GTMaterials.Tungsten, 4, GTMaterials.Cobalt, 3, GTMaterials.Manganese, 2, GTMaterials.Phosphorus, 2, GTMaterials.Palladium, 2, GTMaterials.Niobium, 1, GTMaterials.Argon, 5)
        .flags(DISABLE_DECOMPOSITION)
        .blastTemp(11500)
        .buildAndRegister();

    TungstenTitaniumCarbide = builderISG("tungsten_titanium_carbide")
        .ingot(7).fluid()
        .color(0x800d0d)
        .iconSet(SHINY)
        .components(GTMaterials.TungstenCarbide, 7, GTMaterials.Titanium, 3)
        .flags(DISABLE_DECOMPOSITION)
        .blastTemp(4422)
        .buildAndRegister();

    TitanSteel = builderISG("titan_steel")
        .ingot(7).fluid()
        .color(0xAA0d0d)
        .iconSet(SHINY)
        .components(TitaniumTungstenCarbide, 4, Plutonium241, 1, Einsteinium, 2, Rhenium, 1, Erbium, 1, Jasper, 3, UuAmplifier, 1)
        .flags(DISABLE_DECOMPOSITION)
        .blastTemp(12600, HIGHER, GTValues.VA[GTValues.UHV], 1200)
        .cableProperties(GTValues.V[GTValues.UEV], 4, 64)
        .buildAndRegister();

    Inconel792 = builderISG("inconel_792")
        .langValue("Inconel 792")
        .ingot(5).fluid()
        .color(0x6CF076)
        .iconSet(SHINY)
        .components(GTMaterials.Nickel, 2, GTMaterials.Niobium, 1, GTMaterials.Aluminium, 2, GTMaterials.Nichrome, 1)
        .flags(DISABLE_DECOMPOSITION)
        .blastTemp(6200)
        .buildAndRegister();

    Pikyonium = builderISG("pikyonium")
        .ingot(7).fluid()
        .color(0x3467BA)
        .iconSet(SHINY)
        .components(ISGMaterials.Inconel792, 8, ISGMaterials.EglinSteel, 5, GTMaterials.NaquadahEnriched, 4, GTMaterials.Cerium, 3, GTMaterials.Antimony, 2, GTMaterials.Platinum, 2, GTMaterials.Ytterbium, 1, GTMaterials.TungstenSteel, 4)
        .flags(DISABLE_DECOMPOSITION)
        .blastTemp(10400)
        .buildAndRegister();

    Lafium = builderISG("lafium")
        .ingot(7).fluid()
        .color(0x0d0d60)
        .iconSet(SHINY)
        .fluidPipeProperties(2000, 23000, true)
        .components(ISGMaterials.HastelloyN, 8, GTMaterials.Naquadah, 4, GTMaterials.Samarium, 2, GTMaterials.Tungsten, 4, GTMaterials.Argon, 2, GTMaterials.Aluminium, 6, GTMaterials.Nickel, 8, GTMaterials.Carbon, 2)
        .flags(DISABLE_DECOMPOSITION)
        .blastTemp(9865)
        .buildAndRegister();

    Cinobite = builderISG("cinobite")
        .ingot(5).fluid()
        .color(0x010101)
        .iconSet(SHINY)
        .components(GTMaterials.Zeron100, 8, GTMaterials.Naquadria, 4, GTMaterials.Gadolinium, 3, GTMaterials.Aluminium, 2, GTMaterials.Mercury, 1, GTMaterials.Tin, 1, GTMaterials.Titanium, 6, GTMaterials.Osmiridium, 1)
        .flags(DISABLE_DECOMPOSITION)
        .blastTemp(11465)
        .buildAndRegister();

    HDCS = builderISG("hdcs")
        .langValue("High Durability Compound Steel")
        .ingot(5).fluid()
        .color(0x334433)
        .iconSet(SHINY)
        .components(GTMaterials.TungstenSteel, 12, GTMaterials.HSSS, 9, GTMaterials.HSSG, 6, GTMaterials.Ruridit, 3, ISGMaterials.MagnetoResonatic, 2, GTMaterials.Plutonium241, 1)
        .flags(DISABLE_DECOMPOSITION)
        .blastTemp(9900)
        .buildAndRegister();

    ProtoAdamantium = builderISG("proto_adamantium")
        .ingot(7).fluid()
        .color(0x4662d4)
        .iconSet(SHINY)
        .components(/**ISGMaterials.Adamantium, 3,*/GTMaterials.Promethium, 2)
        .blastTemp(11244)
        .buildAndRegister()
        .setFormula("Ad3Pm2", true);

    TriniumTitanium = builderISG("trinium_titanium")
        .ingot(7).fluid()
        .color(0x9986a3)
        .iconSet(SHINY)
        .components(GTMaterials.Trinium, 2, GTMaterials.Titanium, 1)
        .blastTemp(11000)
        .buildAndRegister();

    LithiumTitanate = builderISG("lithium_titanate")
        .ingot(5).fluid()
        .color(0xfe71a9)
        .iconSet(SHINY)
        .components(GTMaterials.Lithium, 2, GTMaterials.Titanium, 1, GTMaterials.Oxygen, 3)
        .flags(DISABLE_DECOMPOSITION)
        .blastTemp(2500)
        .buildAndRegister();

    Titanium50 = builderISG("titanium_50")
        .ingot(5).fluid()
        .color(GTMaterials.Titanium.getMaterialRGB())
        .iconSet(SHINY)
        .blastTemp(2000)
        .buildAndRegister();

    ElectricallyImpureCopper = builderISG("electrically_impure_copper")
        .ingot(2).fluid()
        .color(0x765A30)
        .iconSet(DULL)
        .components(GTMaterials.Copper, 1, GTMaterials.RareEarth, 1)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    Polyurethane = builderISG("polyurethane")
        .ingot(2).fluid()
        .color(0xeffcef)
        .iconSet(DULL)
        .components(GTMaterials.Carbon, 17, GTMaterials.Hydrogen, 16, GTMaterials.Nitrogen, 2, GTMaterials.Oxygen, 4)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    ThoriumDopedTungsten = builderISG("thoria_doped_tungsten")
        .ingot(2).fluid()
        .color(GTMaterials.Tungsten.getMaterialRGB())
        .iconSet(SHINY)
        .components(GTMaterials.Thorium, 1, GTMaterials.Tungsten, 9)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    WoodsGlass = builderISG("woods_glass")
        .ingot(2).fluid()
        .color(0x730099)
        .iconSet(SHINY)
        .components(GTMaterials.SiliconDioxide, 1, GTMaterials.Barium, 1, GTMaterials.Oxygen, 1, GTMaterials.Garnierite, 1, GTMaterials.SodaAsh, 1)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    BariumTitanate = builderISG("barium_titanate")
        .ingot(2).fluid()
        .color(0x99FF99)
        .iconSet(SHINY)
        .components(GTMaterials.Barium, 1, GTMaterials.Titanium, 1, GTMaterials.Oxygen, 3)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    TantalumHafniumSeaborgiumCarbide = builderISG("tantalum_hafnium_seaborgium_carbide")
        .ingot(6).fluid()
        .color(0x2c2c2c)
        .iconSet(SHINY)
        .components(GTMaterials.Tantalum, 12, GTMaterials.Hafnium, 3, GTMaterials.Seaborgium, 1, GTMaterials.Carbon, 16)
        .flags(DISABLE_DECOMPOSITION)
        .fluidPipeProperties(2400, 500000, true)
        .blastTemp(5200)
        .buildAndRegister();

    BismuthRuthenate = builderISG("bismuth_ruthenate")
        .ingot(2).fluid()
        .color(0x94cf5c)
        .iconSet(DULL)
        .components(GTMaterials.Bismuth, 2, GTMaterials.Ruthenium, 2, GTMaterials.Oxygen, 7)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    BismuthIridiate = builderISG("bismuth_iridiate")
        .ingot(5).fluid()
        .color(0x478a6b)
        .iconSet(DULL)
        .components(GTMaterials.Bismuth, 2, GTMaterials.Iridium, 2, GTMaterials.Oxygen, 7)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    PEDOT = builderISG("pedot")
        .polymer(5).fluid()
        .color(0x5cef20)
        .iconSet(DULL)
        .components(GTMaterials.Carbon, 6, GTMaterials.Hydrogen, 6, GTMaterials.Oxygen, 2, GTMaterials.Sulfur, 1)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    RutheniumDioxide = builderISG("ruthenium_dioxide")
        .ingot(2).fluid()
        .color(GTMaterials.RutheniumTetroxide.getMaterialRGB())
        .iconSet(DULL)
        .components(GTMaterials.Ruthenium, 1, GTMaterials.Oxygen, 2)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    GermaniumTungstenNitride = builderISG("germanium_tungsten_nitride")
        .ingot(2).fluid()
        .color(0x8f8fcf)
        .iconSet(DULL)
        .components(GTMaterials.Germanium, 3, GTMaterials.Tungsten, 3, GTMaterials.Nitrogen, 10)
        .blastTemp(5400)
        .buildAndRegister();

    LithiumNiobate = builderISG("lithium_niobate")
        .ingot(6).fluid()
        .color(0xcfcf3a)
        .iconSet(SHINY)
        .components(GTMaterials.Lithium, 1, GTMaterials.Niobium, 1, GTMaterials.Oxygen, 4)
        .flags(DISABLE_DECOMPOSITION)
        .blastTemp(6700)
        .buildAndRegister();

    HeavyQuarkDegenerateMatter = builderISG("heavy_quark_degenerate_matter")
        .ingot(6).fluid()
        .color(0x5dbd3a)
        .iconSet(SHINY)
        .blastTemp(13000)
        .buildAndRegister();

    SuperheavyHAlloy = builderISG("superheavy_h_alloy")
        .langValue("Superheavy-H Alloy")
        .ingot(6).fluid()
        .color(0xE84B36)
        .iconSet(SHINY)
        .components(GTMaterials.Copernicium, 1, GTMaterials.Nihonium, 1, ISGMaterials.MetastableFlerovium, 1, GTMaterials.Moscovium, 1, GTMaterials.Livermorium, 1, GTMaterials.Tennessine, 1, ISGMaterials.MetastableOganesson, 1)
        .flags(DISABLE_DECOMPOSITION)
        .blastTemp(10600)
        .buildAndRegister();

    SuperheavyLAlloy = builderISG("superheavy_l_alloy")
        .langValue("Superheavy-L Alloy")
        .ingot(6).fluid()
        .color(0x2B45DF)
        .iconSet(SHINY)
        .components(GTMaterials.Rutherfordium, 1, GTMaterials.Dubnium, 1, GTMaterials.Seaborgium, 1, GTMaterials.Bohrium, 1, ISGMaterials.MetastableHassium, 1, GTMaterials.Meitnerium, 1, GTMaterials.Roentgenium, 1)
        .flags(DISABLE_DECOMPOSITION)
        .blastTemp(10600)
        .buildAndRegister();

    QCDMatter = builderISG("qcd_confined_matter")
        .langValue("Quantumchromodynamically Confined Matter")
        .ingot(7).fluid()
        .color(0xeb9e3f)
        .iconSet(SHINY)
        .blastTemp(13100)
        .buildAndRegister();

    Periodicium = builderISG("periodicium")
        .ingot(6).fluid()
        .color(0x3d4bf6)
        .iconSet(SHINY)
        .components(GTMaterials.Hydrogen, 1, GTMaterials.Helium, 1, GTMaterials.Lithium, 1, GTMaterials.Beryllium, 1, GTMaterials.Boron, 1, GTMaterials.Carbon, 1, GTMaterials.Nitrogen, 1, GTMaterials.Oxygen, 1, GTMaterials.Fluorine, 1, GTMaterials.Neon, 1, GTMaterials.Sodium, 1, GTMaterials.Magnesium, 1, GTMaterials.Aluminium, 1, GTMaterials.Silicon, 1, GTMaterials.Phosphorus, 1, GTMaterials.Sulfur, 1, GTMaterials.Chlorine, 1, GTMaterials.Argon, 1, GTMaterials.Potassium, 1, GTMaterials.Calcium, 1, GTMaterials.Scandium, 1, GTMaterials.Titanium, 1, GTMaterials.Vanadium, 1, GTMaterials.Chromium, 1, GTMaterials.Manganese, 1, GTMaterials.Iron, 1, GTMaterials.Cobalt, 1, GTMaterials.Nickel, 1, GTMaterials.Copper, 1, GTMaterials.Zinc, 1, GTMaterials.Gallium, 1, GTMaterials.Germanium, 1, GTMaterials.Arsenic, 1, GTMaterials.Selenium, 1, GTMaterials.Bromine, 1, GTMaterials.Krypton, 1, GTMaterials.Rubidium, 1, GTMaterials.Strontium, 1, GTMaterials.Yttrium, 1, GTMaterials.Zirconium, 1, GTMaterials.Niobium, 1, GTMaterials.Molybdenum, 1, GTMaterials.Technetium, 1, GTMaterials.Ruthenium, 1, GTMaterials.Rhodium, 1, GTMaterials.Palladium, 1, GTMaterials.Silver, 1, GTMaterials.Cadmium, 1, GTMaterials.Indium, 1, GTMaterials.Tin, 1, GTMaterials.Antimony, 1, GTMaterials.Tellurium, 1, GTMaterials.Iodine, 1, GTMaterials.Xenon, 1, GTMaterials.Caesium, 1, GTMaterials.Barium, 1, GTMaterials.Lanthanum, 1, GTMaterials.Cerium, 1, GTMaterials.Praseodymium, 1, GTMaterials.Neodymium, 1, GTMaterials.Promethium, 1, GTMaterials.Samarium, 1, GTMaterials.Europium, 1, GTMaterials.Gadolinium, 1, GTMaterials.Terbium, 1, GTMaterials.Dysprosium, 1, GTMaterials.Holmium, 1, Erbium, 1, GTMaterials.Thulium, 1, GTMaterials.Ytterbium, 1, GTMaterials.Lutetium, 1, GTMaterials.Hafnium, 1, GTMaterials.Tantalum, 1, GTMaterials.Tungsten, 1, Rhenium, 1, GTMaterials.Osmium, 1, GTMaterials.Iridium, 1, GTMaterials.Platinum, 1, GTMaterials.Gold, 1, GTMaterials.Mercury, 1, GTMaterials.Thallium, 1, GTMaterials.Lead, 1, GTMaterials.Bismuth, 1, GTMaterials.Polonium, 1, GTMaterials.Astatine, 1, GTMaterials.Radon, 1, GTMaterials.Francium, 1, GTMaterials.Radium, 1, GTMaterials.Actinium, 1, GTMaterials.Thorium, 1, GTMaterials.Protactinium, 1, GTMaterials.Uranium238, 1, GTMaterials.Neptunium, 1, GTMaterials.Plutonium241, 1, GTMaterials.Americium, 1, GTMaterials.Curium, 1, GTMaterials.Berkelium, 1, GTMaterials.Californium, 1, Einsteinium, 1, GTMaterials.Fermium, 1, GTMaterials.Mendelevium, 1, GTMaterials.Rutherfordium, 1, GTMaterials.Dubnium, 1, GTMaterials.Seaborgium, 1, GTMaterials.Bohrium, 1, ISGMaterials.MetastableHassium, 1, GTMaterials.Meitnerium, 1, GTMaterials.Roentgenium, 1, GTMaterials.Copernicium, 1, GTMaterials.Nihonium, 1, ISGMaterials.MetastableFlerovium, 1, GTMaterials.Moscovium, 1, GTMaterials.Livermorium, 1, GTMaterials.Tennessine, 1, ISGMaterials.MetastableOganesson, 1)
        .flags(DISABLE_DECOMPOSITION)
        .blastTemp(13500)
        .buildAndRegister();

    CosmicNeutronium = builderISG("cosmic_neutronium")
        .ingot(7).liquid(new FluidBuilder().temperature(1000000).customStill())
        .color(0x323232)
        .iconSet(SHINY)
        .radioactiveHazard(50)
        .components(GTMaterials.Neutronium, 1)
        .flags(ISGMaterialFlags.GENERATE_NANITES, GENERATE_SPRING, GENERATE_FINE_WIRE,
            GENERATE_SPRING_SMALL)
        .blastTemp(14100, HIGHEST, GTValues.VA[GTValues.UIV], ISGValues.HOURS * 6)
        .cableProperties(Integer.MAX_VALUE, 2, 128)
        .buildAndRegister();

    NaquadriaticTaranium = builderISG("naquadriatictaranium")
        .ingot(1).fluid()
        .color((GTMaterials.Naquadria.getMaterialRGB() + ISGMaterials.Taranium.getMaterialRGB()) / 2)
        .iconSet(RADIOACTIVE)
        .components(GTMaterials.Naquadria, 1, ISGMaterials.Taranium, 1)
        .blastTemp(16200, HIGHEST, GTValues.VA[GTValues.UXV], 1400)
        .appendFlags(SNDART_FLAGS, DISABLE_DECOMPOSITION)
        .cableProperties(GTValues.V[GTValues.UXV], 4, 128)
        .buildAndRegister();

    Polyimide = builderISG("polyimide")
        .polymer(1).fluid()
        .color(0xFF7F50)
        .iconSet(DULL)
        .components(GTMaterials.Carbon, 22, GTMaterials.Hydrogen, 12, GTMaterials.Nitrogen, 2, GTMaterials.Oxygen, 6)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

    FluorinatedEthylenePropylene = builderISG("fluorinated_ethylene_propylene")
        .ingot(1).fluid()
        .color(0xC8C8C8)
        .iconSet(DULL)
        .components(GTMaterials.Carbon, 5, GTMaterials.Fluorine, 10)
        .flags(DISABLE_DECOMPOSITION)
        .buildAndRegister();

  }
}
