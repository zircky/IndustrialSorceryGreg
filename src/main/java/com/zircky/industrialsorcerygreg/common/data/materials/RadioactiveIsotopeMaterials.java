package com.zircky.industrialsorcerygreg.common.data.materials;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlag;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.GENERATE_BOLT_SCREW;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.GENERATE_DENSE;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.GENERATE_FINE_WIRE;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.GENERATE_FOIL;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.GENERATE_FRAME;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.GENERATE_GEAR;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.GENERATE_LONG_ROD;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.GENERATE_PLATE;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.GENERATE_ROD;
import static com.zircky.industrialsorcerygreg.api.data.material.ISGMaterialFlags.GENERATE_DOUBLE_PLATE;
import static com.zircky.industrialsorcerygreg.api.data.material.ISGMaterialFlags.GENERATE_FUEL;
import static com.zircky.industrialsorcerygreg.common.data.ISGMaterials.*;
import static com.zircky.industrialsorcerygreg.utils.register.MaterialsRegisterUtils.material;

public final class RadioactiveIsotopeMaterials {
  private static final List<MaterialFlag> RADIOACTIVE = new ArrayList<>();

  static {
    RADIOACTIVE.addAll(Arrays.asList(GENERATE_PLATE, GENERATE_DENSE, GENERATE_ROD, GENERATE_BOLT_SCREW,
        GENERATE_GEAR, GENERATE_FOIL, GENERATE_FINE_WIRE, GENERATE_LONG_ROD, GENERATE_DOUBLE_PLATE,
        GENERATE_FRAME));
  }

  private RadioactiveIsotopeMaterials() {
  }

  public static void register() {
    fuel();
    Thorium230 = isotope("thorium_230", "Thorium 230", 0x303735, 0x202625, 1);
    Thorium230Ox = isotope("thorium_230_ox", "Thorium 230 Oxide", 0x343832, 0x20231F, 1);
    Thorium230Ni = isotope("thorium_230_ni", "Thorium 230 Nitride", 0x30342B, 0x1E221B, 1);
    Thorium230Za = isotope("thorium_230_za", "Thorium 230 Zr", 0x393A31, 0x24251F, 1);
    Thorium232 = isotope("thorium_232", "Thorium 232", 0x354138, 0x232B25, 1);
    Thorium232Ox = isotope("thorium_232_ox", "Thorium 232 Oxide", 0x2E3140, 0x1D202A, 1);
    Thorium232Ni = isotope("thorium_232_ni", "Thorium 232 Nitride", 0x344337, 0x222C25, 1);
    Thorium232Za = isotope("thorium_232_za", "Thorium 232 Zr", 0x3A3A30, 0x25251F, 1);
    Thorium233 = isotope("thorium_233", "Thorium 233", 0x3B4A3F, 0x27312A, 1);
    Protactinium233 = isotope("protactinium_233", "Protactinium 233", 0x8A876E, 0x5C5948, 2);

    Uranium233 = isotope("uranium_233", "Uranium 233", 0x1B3A21, 0x112615, 1);
    Uranium233Ox = isotope("uranium_233_ox", "Uranium 233 Oxide", 0x173D2E, 0x0E281D, 1);
    Uranium233Ni = isotope("uranium_233_ni", "Uranium 233 Nitride", 0x1E5522, 0x143916, 1);
    Uranium233Za = isotope("uranium_233_za", "Uranium 233 Zr", 0x2C4D28, 0x1D331B, 1);
    Uranium234 = isotope("uranium_234", "Uranium 234", 0x0D431D, 0x092D14, 1);
    Uranium234Ox = isotope("uranium_234_ox", "Uranium 234 Oxide", 0x0E4A4A, 0x093131, 1);
    Uranium234Ni = isotope("uranium_234_ni", "Uranium 234 Nitride", 0x54171B, 0x370F12, 1);
    Uranium234Za = isotope("uranium_234_za", "Uranium 234 Zr", 0x39420D, 0x262C09, 1);
    Uranium235Ox = isotope("uranium_235_ox", "Uranium 235 Oxide", 0x11412C, 0x0B2B1D, 1);
    Uranium235Ni = isotope("uranium_235_ni", "Uranium 235 Nitride", 0x195021, 0x103516, 1);
    Uranium235Za = isotope("uranium_235_za", "Uranium 235 Zr", 0x1D4A1F, 0x133115, 1);
    Uranium238Ox = isotope("uranium_238_ox", "Uranium 238 Oxide", 0x224A3B, 0x173127, 1);
    Uranium238Ni = isotope("uranium_238_ni", "Uranium 238 Nitride", 0x276B2B, 0x1A471D, 1);
    Uranium238Za = isotope("uranium_238_za", "Uranium 238 Zr", 0x315727, 0x203A1A, 1);
    Uranium239 = isotope("uranium_239", "Uranium 239", 0x284329, 0x1B2D1C, 1);

    Neptunium235 = isotope("neptunium_235", "Neptunium 235", 0x2D4651, 0x1E2F36, 2);
    Neptunium236 = isotope("neptunium_236", "Neptunium 236", 0x2D4651, 0x1E2F36, 2);
    Neptunium236Ox = isotope("neptunium_236_ox", "Neptunium 236 Oxide", 0x2A4164, 0x1C2B43, 2);
    Neptunium236Ni = isotope("neptunium_236_ni", "Neptunium 236 Nitride", 0x2C6658, 0x1D443B, 2);
    Neptunium236Za = isotope("neptunium_236_za", "Neptunium 236 Zr", 0x3A5F5B, 0x263F3D, 2);
    Neptunium237 = isotope("neptunium_237", "Neptunium 237", 0x2D4651, 0x1E2F36, 2);
    Neptunium237Ox = isotope("neptunium_237_ox", "Neptunium 237 Oxide", 0x2A4164, 0x1C2B43, 2);
    Neptunium237Ni = isotope("neptunium_237_ni", "Neptunium 237 Nitride", 0x2C6658, 0x1D443B, 2);
    Neptunium237Za = isotope("neptunium_237_za", "Neptunium 237 Zr", 0x3A5F5B, 0x263F3D, 2);
    Neptunium239 = isotope("neptunium_239", "Neptunium 239", 0x2D4651, 0x1E2F36, 2);

    Plutonium239Ox = isotope("plutonium_239_ox", "Plutonium 239 Oxide", 0xB9C1DD, 0x7B8194, 2);
    Plutonium239Ni = isotope("plutonium_239_ni", "Plutonium 239 Nitride", 0xACD6B3, 0x738F77, 2);
    Plutonium239Za = isotope("plutonium_239_za", "Plutonium 239 Zr", 0xD0D0B8, 0x8B8B7B, 2);
    Plutonium240 = isotope("plutonium_240", "Plutonium 240", 0xD5D7D3, 0x8E908D, 2);
    Plutonium241Ox = isotope("plutonium_241_ox", "Plutonium 241 Oxide", 0xB9C1DD, 0x7B8194, 2);
    Plutonium241Ni = isotope("plutonium_241_ni", "Plutonium 241 Nitride", 0xACD6B3, 0x738F77, 2);
    Plutonium241Za = isotope("plutonium_241_za", "Plutonium 241 Zr", 0xD0D0B8, 0x8B8B7B, 2);
    Plutonium242 = isotope("plutonium_242", "Plutonium 242", 0xD5D7D3, 0x8E908D, 2);
    Plutonium242Ox = isotope("plutonium_242_ox", "Plutonium 242 Oxide", 0xB9C1DD, 0x7B8194, 2);
    Plutonium242Ni = isotope("plutonium_242_ni", "Plutonium 242 Nitride", 0xACD6B3, 0x738F77, 2);
    Plutonium242Za = isotope("plutonium_242_za", "Plutonium 242 Zr", 0xD0D0B8, 0x8B8B7B, 2);
    Plutonium244 = isotope("plutonium_244", "Plutonium 244", 0xD5D7D3, 0x8E908D, 2);
    Plutonium245 = isotope("plutonium_245", "Plutonium 245", 0xD5D7D3, 0x8E908D, 2);

    Americium241 = isotope("americium_241", "Americium 241", 0x53533B, 0x373727, 3);
    Americium241Ox = isotope("americium_241_ox", "Americium 241 Oxide", 0x4C5046, 0x33352E, 3);
    Americium241Ni = isotope("americium_241_ni", "Americium 241 Nitride", 0x4A5E2D, 0x313F1E, 3);
    Americium241Za = isotope("americium_241_za", "Americium 241 Zr", 0x69672E, 0x46451F, 3);
    Americium242 = isotope("americium_242", "Americium 242", 0x4F4934, 0x353123, 3);
    Americium242Ox = isotope("americium_242_ox", "Americium 242 Oxide", 0x444842, 0x2D302C, 3);
    Americium242Ni = isotope("americium_242_ni", "Americium 242 Nitride", 0x415A29, 0x2B3C1B, 3);
    Americium242Za = isotope("americium_242_za", "Americium 242 Zr", 0x5E5A35, 0x3F3C23, 3);
    Americium243 = isotope("americium_243", "Americium 243", 0x5A512D, 0x3C361E, 3);
    Americium243Ox = isotope("americium_243_ox", "Americium 243 Oxide", 0x4B4D3F, 0x32332A, 3);
    Americium243Ni = isotope("americium_243_ni", "Americium 243 Nitride", 0x536728, 0x37451B, 3);
    Americium243Za = isotope("americium_243_za", "Americium 243 Zr", 0x676021, 0x454016, 3);
    Americium245 = isotope("americium_245", "Americium 245", 0x5A512D, 0x3C361E, 3);

    Curium243 = isotope("curium_243", "Curium 243", 0x4B2456, 0x321839, 3);
    Curium243Ox = isotope("curium_243_ox", "Curium 243 Oxide", 0x42236F, 0x2C174A, 3);
    Curium243Ni = isotope("curium_243_ni", "Curium 243 Nitride", 0x39263F, 0x261A2A, 3);
    Curium243Za = isotope("curium_243_za", "Curium 243 Zr", 0x6B2C63, 0x471D42, 3);
    Curium245 = isotope("curium_245", "Curium 245", 0x542D5D, 0x381E3E, 3);
    Curium245Ox = isotope("curium_245_ox", "Curium 245 Oxide", 0x4B2871, 0x321B4B, 3);
    Curium245Ni = isotope("curium_245_ni", "Curium 245 Nitride", 0x45324D, 0x2E2133, 3);
    Curium245Za = isotope("curium_245_za", "Curium 245 Zr", 0x6C3C6A, 0x482847, 3);
    Curium246 = isotope("curium_246", "Curium 246", 0x4B2B58, 0x321D3B, 3);
    Curium246Ox = isotope("curium_246_ox", "Curium 246 Oxide", 0x43236B, 0x2D1747, 3);
    Curium246Ni = isotope("curium_246_ni", "Curium 246 Nitride", 0x3D3341, 0x29222B, 3);
    Curium246Za = isotope("curium_246_za", "Curium 246 Zr", 0x62345D, 0x41233E, 3);
    Curium247 = isotope("curium_247", "Curium 247", 0x44234F, 0x2D1735, 3);
    Curium247Ox = isotope("curium_247_ox", "Curium 247 Oxide", 0x3E2063, 0x291542, 3);
    Curium247Ni = isotope("curium_247_ni", "Curium 247 Nitride", 0x3B303E, 0x272029, 3);
    Curium247Za = isotope("curium_247_za", "Curium 247 Zr", 0x643056, 0x432039, 3);
    Curium250 = isotope("curium_250", "Curium 250", 0x4B2B58, 0x321D3B, 3);
    Curium251 = isotope("curium_251", "Curium 251", 0x44234F, 0x2D1735, 3);

    Berkelium247 = isotope("berkelium_247", "Berkelium 247", 0x7D3A0E, 0x542709, 3);
    Berkelium247Ox = isotope("berkelium_247_ox", "Berkelium 247 Oxide", 0x74434A, 0x4D2D31, 3);
    Berkelium247Ni = isotope("berkelium_247_ni", "Berkelium 247 Nitride", 0x75500D, 0x4E3509, 3);
    Berkelium247Za = isotope("berkelium_247_za", "Berkelium 247 Zr", 0x9A470B, 0x663007, 3);
    Berkelium248 = isotope("berkelium_248", "Berkelium 248", 0x8E4215, 0x5F2C0E, 3);
    Berkelium248Ox = isotope("berkelium_248_ox", "Berkelium 248 Oxide", 0x704148, 0x4B2B30, 3);
    Berkelium248Ni = isotope("berkelium_248_ni", "Berkelium 248 Nitride", 0x7A530C, 0x513708, 3);
    Berkelium248Za = isotope("berkelium_248_za", "Berkelium 248 Zr", 0xA24C0C, 0x6C3308, 3);
    Berkelium249 = isotope("berkelium_249", "Berkelium 249", 0x7D3A0E, 0x542709, 3);
    Berkelium251 = isotope("berkelium_251", "Berkelium 251", 0x8E4215, 0x5F2C0E, 3);

    Californium249 = isotope("californium_249", "Californium 249", 0x621D22, 0x411317, 3);
    Californium249Ox = isotope("californium_249_ox", "Californium 249 Oxide", 0x5F1A50, 0x3F1135, 3);
    Californium249Ni = isotope("californium_249_ni", "Californium 249 Nitride", 0x67401D, 0x452B13, 3);
    Californium249Za = isotope("californium_249_za", "Californium 249 Zr", 0x8D1F23, 0x5E1517, 3);
    Californium250 = isotope("californium_250", "Californium 250", 0x621D28, 0x41131B, 3);
    Californium250Ox = isotope("californium_250_ox", "Californium 250 Oxide", 0x5B1D49, 0x3D1331, 3);
    Californium250Ni = isotope("californium_250_ni", "Californium 250 Nitride", 0x5E3B20, 0x3F2715, 3);
    Californium250Za = isotope("californium_250_za", "Californium 250 Zr", 0x8A1B23, 0x5C1217, 3);
    Californium251 = isotope("californium_251", "Californium 251", 0x5A0E20, 0x3C0915, 3);
    Californium251Ox = isotope("californium_251_ox", "Californium 251 Oxide", 0x57184B, 0x3A1032, 3);
    Californium251Ni = isotope("californium_251_ni", "Californium 251 Nitride", 0x4D3827, 0x33251A, 3);
    Californium251Za = isotope("californium_251_za", "Californium 251 Zr", 0x741522, 0x4D0E17, 3);
    Californium252 = isotope("californium_252", "Californium 252", 0x5D1823, 0x3E1017, 3);
    Californium252Ox = isotope("californium_252_ox", "Californium 252 Oxide", 0x542349, 0x381731, 3);
    Californium252Ni = isotope("californium_252_ni", "Californium 252 Nitride", 0x63401F, 0x422B14, 3);
    Californium252Za = isotope("californium_252_za", "Californium 252 Zr", 0x8E1922, 0x5F1117, 3);
    Californium253 = isotope("californium_253", "Californium 253", 0x5D1823, 0x3E1017, 3);
    Californium256 = isotope("californium_256", "Californium 256", 0x621D22, 0x411317, 3);
    Californium257 = isotope("californium_257", "Californium 257", 0x5A0E20, 0x3C0915, 3);

    Einsteinium253 = isotope("einsteinium_253", "Einsteinium 253", 0x6C4A84, 0x483158, 3);
    Einsteinium255 = isotope("einsteinium_255", "Einsteinium 255", 0x73508B, 0x4D355D, 3);
    Einsteinium257 = isotope("einsteinium_257", "Einsteinium 257", 0x65417F, 0x432B55, 3);
    Fermium257 = isotope("fermium_257", "Fermium 257", 0x8A688E, 0x5C455F, 3);
    Fermium258 = isotope("fermium_258", "Fermium 258", 0x7A5A82, 0x513C57, 3);
    Fermium259 = isotope("fermium_259", "Fermium 259", 0x6F4E79, 0x4A3451, 3);
    Fermium262 = isotope("fermium_262", "Fermium 262", 0x765986, 0x4F3B59, 3);
    Fermium263 = isotope("fermium_263", "Fermium 263", 0x684D76, 0x45334F, 3);
    Mendelevium259 = isotope("mendelevium_259", "Mendelevium 259", 0x73637F, 0x4D4255, 3);
    Mendelevium261 = isotope("mendelevium_261", "Mendelevium 261", 0x665875, 0x443B4E, 3);
    Mendelevium263 = isotope("mendelevium_263", "Mendelevium 263", 0x5D516C, 0x3E3648, 3);

    Copernicium291 = isotope("copernicium_291", "Copernicium 291", 0x66620A, 0x444107, 3);
    Copernicium291Ox = isotope("copernicium_291_ox", "Copernicium 291 Oxide", 0x5F5D08, 0x3F3E05, 3);
    Copernicium291Ni = isotope("copernicium_291_ni", "Copernicium 291 Nitride", 0x706C0B, 0x4B4807, 3);
    Copernicium291Za = isotope("copernicium_291_za", "Copernicium 291 Zr", 0x77720C, 0x4F4C08, 3);
    Iridium192 = isotope("iridium_192", "Iridium 192", 0xF0B1E4, 0xA07698, 2);
    Xenorium298 = isotope("xenorium_298", "Xenorium 298", 0x0B1118, 0x00A8FF, 3);

    Lithium6 = isotope("lithium_6", "Lithium 6", 0xF2F2EC, 0xA1A19D, 0);
    Lithium6Ox = isotope("lithium_6_ox", "Lithium 6 Oxide", 0xF2F2EC, 0xA1A19D, 0);
    Lithium6Ni = isotope("lithium_6_ni", "Lithium 6 Nitride", 0xF2F2EC, 0xA1A19D, 0);
    Lithium6Za = isotope("lithium_6_za", "Lithium 6 Zr", 0xF2F2EC, 0xA1A19D, 0);
    Lithium7 = isotope("lithium_7", "Lithium 7", 0xF2F2EC, 0xA1A19D, 0);
    Lithium7Ox = isotope("lithium_7_ox", "Lithium 7 Oxide", 0xF2F2EC, 0xA1A19D, 0);
    Lithium7Ni = isotope("lithium_7_ni", "Lithium 7 Nitride", 0xF2F2EC, 0xA1A19D, 0);
    Lithium7Za = isotope("lithium_7_za", "Lithium 7 Zr", 0xF2F2EC, 0xA1A19D, 0);
    Quantite = isotope("quantite", "Quantite", 0x008B8B, 0x1BC7C7, 0);
    Sodium22 = isotope("sodium_22", "Sodium 22", 0xD97982, 0x915057, 1);
    Boron10 = isotope("boron_10", "Boron 10", 0x8B8B86, 0x5D5D59, 0);
    Boron11 = isotope("boron_11", "Boron 11", 0x565B56, 0x393D39, 0);
    Beryllium7 = isotope("beryllium_7", "Beryllium 7", 0xD7F5A8, 0x8FA370, 1);
    Magnesium24 = isotope("magnesium_24", "Magnesium 24", 0xE8A7D9, 0x9B6F91, 0);
    Magnesium26 = isotope("magnesium_26", "Magnesium 26", 0xE8A7D9, 0x9B6F91, 0);
    Calcium48 = isotope("calcium_48", "Calcium 48", 0xFFF5AA, 0xAAA371, 0);
  }

  public static void fuel() {
    NeptuniumLEN236 = fuel("neptunium_len_236", "Neptunium LEN-236", 0x173C3D, 0x0F2829);
    NeptuniumLEN236Ox = fuel("neptunium_len_236_ox", "Neptunium LEN-236 Oxide", 0x133446, 0x0D2330);
    NeptuniumLEN236Ni = fuel("neptunium_len_236_ni", "Neptunium LEN-236 Nitride", 0x1B4F3F, 0x12352A);
    NeptuniumLEN236Za = fuel("neptunium_len_236_za", "Neptunium LEN-236 Zr", 0x236057, 0x17403A);
    NeptuniumLEN236TR = fuel("neptunium_len_236_tr", "Neptunium LEN-236 TRISO", 0xBFC0BA, 0x7F807C);

    NeptuniumHEN236 = fuel("neptunium_hen_236", "Neptunium HEN-236", 0x0F4747, 0x0A2F2F);
    NeptuniumHEN236Ox = fuel("neptunium_hen_236_ox", "Neptunium HEN-236 Oxide", 0x0E3F52, 0x092A37);
    NeptuniumHEN236Ni = fuel("neptunium_hen_236_ni", "Neptunium HEN-236 Nitride", 0x145B43, 0x0D3D2D);
    NeptuniumHEN236Za = fuel("neptunium_hen_236_za", "Neptunium HEN-236 Zr", 0x1A7165, 0x114B43);
    NeptuniumHEN236TR = fuel("neptunium_hen_236_tr", "Neptunium HEN-236 TRISO", 0xBFC0BA, 0x7F807C);

    CuriumLECM243 = fuel("curium_lecm_243", "Curium LECM-243", 0x3F204D, 0x2A1533);
    CuriumLECM243Ox = fuel("curium_lecm_243_ox", "Curium LECM-243 Oxide", 0x35204F, 0x231535);
    CuriumLECM243Ni = fuel("curium_lecm_243_ni", "Curium LECM-243 Nitride", 0x343838, 0x232525);
    CuriumLECM243Za = fuel("curium_lecm_243_za", "Curium LECM-243 Zr", 0x5C2A55, 0x3D1C39);
    CuriumLECM243TR = fuel("curium_lecm_243_tr", "Curium LECM-243 TRISO", 0xBFC0BA, 0x7F807C);

    CuriumHECM243 = fuel("curium_hecm_243", "Curium HECM-243", 0x4E1761, 0x340F41);
    CuriumHECM243Ox = fuel("curium_hecm_243_ox", "Curium HECM-243 Oxide", 0x46146B, 0x2F0D47);
    CuriumHECM243Ni = fuel("curium_hecm_243_ni", "Curium HECM-243 Nitride", 0x352F3A, 0x231F27);
    CuriumHECM243Za = fuel("curium_hecm_243_za", "Curium HECM-243 Zr", 0x71196C, 0x4B1148);
    CuriumHECM243TR = fuel("curium_hecm_243_tr", "Curium HECM-243 TRISO", 0xBFC0BA, 0x7F807C);

    CuriumLECM245 = fuel("curium_lecm_245", "Curium LECM-245", 0x3F204D, 0x2A1533);
    CuriumLECM245Ox = fuel("curium_lecm_245_ox", "Curium LECM-245 Oxide", 0x35204F, 0x231535);
    CuriumLECM245Ni = fuel("curium_lecm_245_ni", "Curium LECM-245 Nitride", 0x343838, 0x232525);
    CuriumLECM245Za = fuel("curium_lecm_245_za", "Curium LECM-245 Zr", 0x5C2A55, 0x3D1C39);
    CuriumLECM245TR = fuel("curium_lecm_245_tr", "Curium LECM-245 TRISO", 0xBFC0BA, 0x7F807C);

    CuriumHECM245 = fuel("curium_hecm_245", "Curium HECM-245", 0x4E1761, 0x340F41);
    CuriumHECM245Ox = fuel("curium_hecm_245_ox", "Curium HECM-245 Oxide", 0x46146B, 0x2F0D47);
    CuriumHECM245Ni = fuel("curium_hecm_245_ni", "Curium HECM-245 Nitride", 0x352F3A, 0x231F27);
    CuriumHECM245Za = fuel("curium_hecm_245_za", "Curium HECM-245 Zr", 0x71196C, 0x4B1148);
    CuriumHECM245TR = fuel("curium_hecm_245_tr", "Curium HECM-245 TRISO", 0xBFC0BA, 0x7F807C);

    CuriumLECM247 = fuel("curium_lecm_247", "Curium LECM-247", 0x41264C, 0x2B1933);
    CuriumLECM247Ox = fuel("curium_lecm_247_ox", "Curium LECM-247 Oxide", 0x39215A, 0x26163C);
    CuriumLECM247Ni = fuel("curium_lecm_247_ni", "Curium LECM-247 Nitride", 0x303434, 0x202323);
    CuriumLECM247Za = fuel("curium_lecm_247_za", "Curium LECM-247 Zr", 0x613B57, 0x41273A);
    CuriumLECM247TR = fuel("curium_lecm_247_tr", "Curium LECM-247 TRISO", 0xBFC0BA, 0x7F807C);

    CuriumHECM247 = fuel("curium_hecm_247", "Curium HECM-247", 0x4D175D, 0x330F3E);
    CuriumHECM247Ox = fuel("curium_hecm_247_ox", "Curium HECM-247 Oxide", 0x421466, 0x2C0D44);
    CuriumHECM247Ni = fuel("curium_hecm_247_ni", "Curium HECM-247 Nitride", 0x343238, 0x232126);
    CuriumHECM247Za = fuel("curium_hecm_247_za", "Curium HECM-247 Zr", 0x6B1967, 0x471145);
    CuriumHECM247TR = fuel("curium_hecm_247_tr", "Curium HECM-247 TRISO", 0xBFC0BA, 0x7F807C);

    BerkeliumLEB248 = fuel("berkelium_leb_248", "Berkelium LEB-248", 0x6B2E0D, 0x471F09);
    BerkeliumLEB248Ox = fuel("berkelium_leb_248_ox", "Berkelium LEB-248 Oxide", 0x5A3030, 0x3C2020);
    BerkeliumLEB248Ni = fuel("berkelium_leb_248_ni", "Berkelium LEB-248 Nitride", 0x5E4B0F, 0x3F320A);
    BerkeliumLEB248Za = fuel("berkelium_leb_248_za", "Berkelium LEB-248 Zr", 0xA13E0C, 0x6B2908);
    BerkeliumLEB248TR = fuel("berkelium_leb_248_tr", "Berkelium LEB-248 TRISO", 0xBFC0BA, 0x7F807C);

    BerkeliumHEB248 = fuel("berkelium_heb_248", "Berkelium HEB-248", 0x7A2E0B, 0x511F07);
    BerkeliumHEB248Ox = fuel("berkelium_heb_248_ox", "Berkelium HEB-248 Oxide", 0x5B2F31, 0x3D2021);
    BerkeliumHEB248Ni = fuel("berkelium_heb_248_ni", "Berkelium HEB-248 Nitride", 0x68570B, 0x463A07);
    BerkeliumHEB248Za = fuel("berkelium_heb_248_za", "Berkelium HEB-248 Zr", 0xA63B09, 0x6F2706);
    BerkeliumHEB248TR = fuel("berkelium_heb_248_tr", "Berkelium HEB-248 TRISO", 0xBFC0BA, 0x7F807C);

    ThoriumTBU = fuel("thorium_tbu", "Thorium TBU", 0x272929, 0x1A1B1B);
    ThoriumTBUOx = fuel("thorium_tbu_ox", "Thorium TBU Oxide", 0x2C2F3C, 0x1D2028);
    ThoriumTBUNi = fuel("thorium_tbu_ni", "Thorium TBU Nitride", 0x2D3C32, 0x1E2821);
    ThoriumTBUZa = fuel("thorium_tbu_za", "Thorium TBU Zr", 0x333734, 0x222523);
    ThoriumTBUTR = fuel("thorium_tbu_tr", "Thorium TBU TRISO", 0xBFC0BA, 0x7F807C);

    MixedMIX239 = fuel("mixed_mix_239", "Mixed MIX-239", 0x60745F, 0x404D3F);
    MixedMIX239Ox = fuel("mixed_mix_239_ox", "Mixed MIX-239 Oxide", 0x526D6D, 0x374949);
    MixedMIX239Ni = fuel("mixed_mix_239_ni", "Mixed MIX-239 Nitride", 0x5A8259, 0x3C573B);
    MixedMIX239Za = fuel("mixed_mix_239_za", "Mixed MIX-239 Zr", 0x72895D, 0x4C5B3E);
    MixedMIX239TR = fuel("mixed_mix_239_tr", "Mixed MIX-239 TRISO", 0xBFC0BA, 0x7F807C);

    MixedMIX241 = fuel("mixed_mix_241", "Mixed MIX-241", 0x60745F, 0x404D3F);
    MixedMIX241Ox = fuel("mixed_mix_241_ox", "Mixed MIX-241 Oxide", 0x526D6D, 0x374949);
    MixedMIX241Ni = fuel("mixed_mix_241_ni", "Mixed MIX-241 Nitride", 0x5A8259, 0x3C573B);
    MixedMIX241Za = fuel("mixed_mix_241_za", "Mixed MIX-241 Zr", 0x72895D, 0x4C5B3E);
    MixedMIX241TR = fuel("mixed_mix_241_tr", "Mixed MIX-241 TRISO", 0xBFC0BA, 0x7F807C);

    UraniumLEU233 = fuel("uranium_leu_233", "Uranium LEU-233", 0x1D4B22, 0x133217);
    UraniumLEU233Ox = fuel("uranium_leu_233_ox", "Uranium LEU-233 Oxide", 0x194B36, 0x113224);
    UraniumLEU233Ni = fuel("uranium_leu_233_ni", "Uranium LEU-233 Nitride", 0x1C611F, 0x134115);
    UraniumLEU233Za = fuel("uranium_leu_233_za", "Uranium LEU-233 Zr", 0x2C6726, 0x1D4519);
    UraniumLEU233TR = fuel("uranium_leu_233_tr", "Uranium LEU-233 TRISO", 0xBFC0BA, 0x7F807C);

    UraniumLEU235 = fuel("uranium_leu_235", "Uranium LEU-235", 0x244A23, 0x183118);
    UraniumLEU235Ox = fuel("uranium_leu_235_ox", "Uranium LEU-235 Oxide", 0x1E4B3D, 0x143229);
    UraniumLEU235Ni = fuel("uranium_leu_235_ni", "Uranium LEU-235 Nitride", 0x1E651E, 0x144314);
    UraniumLEU235Za = fuel("uranium_leu_235_za", "Uranium LEU-235 Zr", 0x2E632A, 0x1F421C);
    UraniumLEU235TR = fuel("uranium_leu_235_tr", "Uranium LEU-235 TRISO", 0xBFC0BA, 0x7F807C);

    UraniumHEU235 = fuel("uranium_heu_235", "Uranium HEU-235", 0x154715, 0x0E2F0E);
    UraniumHEU235Ox = fuel("uranium_heu_235_ox", "Uranium HEU-235 Oxide", 0x124F34, 0x0C3523);
    UraniumHEU235Ni = fuel("uranium_heu_235_ni", "Uranium HEU-235 Nitride", 0x126812, 0x0C460C);
    UraniumHEU235Za = fuel("uranium_heu_235_za", "Uranium HEU-235 Zr", 0x246B20, 0x184715);
    UraniumHEU235TR = fuel("uranium_heu_235_tr", "Uranium HEU-235 TRISO", 0xBFC0BA, 0x7F807C);

    UraniumHEU233 = fuel("uranium_heu_233", "Uranium HEU-233", 0x154715, 0x0E2F0E);
    UraniumHEU233Ox = fuel("uranium_heu_233_ox", "Uranium HEU-233 Oxide", 0x124F34, 0x0C3523);
    UraniumHEU233Ni = fuel("uranium_heu_233_ni", "Uranium HEU-233 Nitride", 0x126812, 0x0C460C);
    UraniumHEU233Za = fuel("uranium_heu_233_za", "Uranium HEU-233 Zr", 0x246B20, 0x184715);
    UraniumHEU233TR = fuel("uranium_heu_233_tr", "Uranium HEU-233 TRISO", 0xBFC0BA, 0x7F807C);

    AmericiumHEA242 = fuel("americium_hea_242", "Americium HEA-242", 0x554917, 0x39310F);
    AmericiumHEA242Ox = fuel("americium_hea_242_ox", "Americium HEA-242 Oxide", 0x4B4A32, 0x323121);
    AmericiumHEA242Ni = fuel("americium_hea_242_ni", "Americium HEA-242 Nitride", 0x51670F, 0x36450A);
    AmericiumHEA242Za = fuel("americium_hea_242_za", "Americium HEA-242 Zr", 0x716019, 0x4B4011);
    AmericiumHEA242TR = fuel("americium_hea_242_tr", "Americium HEA-242 TRISO", 0xBFC0BA, 0x7F807C);

    AmericiumLEA242 = fuel("americium_lea_242", "Americium LEA-242", 0x554917, 0x39310F);
    AmericiumLEA242Ox = fuel("americium_lea_242_ox", "Americium LEA-242 Oxide", 0x4B4A32, 0x323121);
    AmericiumLEA242Ni = fuel("americium_lea_242_ni", "Americium LEA-242 Nitride", 0x51670F, 0x36450A);
    AmericiumLEA242Za = fuel("americium_lea_242_za", "Americium LEA-242 Zr", 0x716019, 0x4B4011);
    AmericiumLEA242TR = fuel("americium_lea_242_tr", "Americium LEA-242 TRISO", 0xBFC0BA, 0x7F807C);

    PlutoniumLEP241 = fuel("plutonium_lep_241", "Plutonium LEP-241", 0xD1D4D2, 0x8B8D8C);
    PlutoniumLEP241Ox = fuel("plutonium_lep_241_ox", "Plutonium LEP-241 Oxide", 0xB8C0DC, 0x7B8093);
    PlutoniumLEP241Ni = fuel("plutonium_lep_241_ni", "Plutonium LEP-241 Nitride", 0xA8D0A9, 0x708B71);
    PlutoniumLEP241Za = fuel("plutonium_lep_241_za", "Plutonium LEP-241 Zr", 0xCFCEB5, 0x8A8979);
    PlutoniumLEP241TR = fuel("plutonium_lep_241_tr", "Plutonium LEP-241 TRISO", 0xBFC0BA, 0x7F807C);

    PlutoniumHEP241 = fuel("plutonium_hep_241", "Plutonium HEP-241", 0xD1D4D2, 0x8B8D8C);
    PlutoniumHEP241Ox = fuel("plutonium_hep_241_ox", "Plutonium HEP-241 Oxide", 0xB8C0DC, 0x7B8093);
    PlutoniumHEP241Ni = fuel("plutonium_hep_241_ni", "Plutonium HEP-241 Nitride", 0xA8D0A9, 0x708B71);
    PlutoniumHEP241Za = fuel("plutonium_hep_241_za", "Plutonium HEP-241 Zr", 0xCFCEB5, 0x8A8979);
    PlutoniumHEP241TR = fuel("plutonium_hep_241_tr", "Plutonium HEP-241 TRISO", 0xBFC0BA, 0x7F807C);

    PlutoniumHEP239 = fuel("plutonium_hep_239", "Plutonium HEP-239", 0xD1D4D2, 0x8B8D8C);
    PlutoniumHEP239Ox = fuel("plutonium_hep_239_ox", "Plutonium HEP-239 Oxide", 0xB8C0DC, 0x7B8093);
    PlutoniumHEP239Ni = fuel("plutonium_hep_239_ni", "Plutonium HEP-239 Nitride", 0xA8D0A9, 0x708B71);
    PlutoniumHEP239Za = fuel("plutonium_hep_239_za", "Plutonium HEP-239 Zr", 0xCFCEB5, 0x8A8979);
    PlutoniumHEP239TR = fuel("plutonium_hep_239_tr", "Plutonium HEP-239 TRISO", 0xBFC0BA, 0x7F807C);

    PlutoniumLEP239 = fuel("plutonium_lep_239", "Plutonium LEP-239", 0xD1D4D2, 0x8B8D8C);
    PlutoniumLEP239Ox = fuel("plutonium_lep_239_ox", "Plutonium LEP-239 Oxide", 0xB8C0DC, 0x7B8093);
    PlutoniumLEP239Ni = fuel("plutonium_lep_239_ni", "Plutonium LEP-239 Nitride", 0xA8D0A9, 0x708B71);
    PlutoniumLEP239Za = fuel("plutonium_lep_239_za", "Plutonium LEP-239 Zr", 0xCFCEB5, 0x8A8979);
    PlutoniumLEP239TR = fuel("plutonium_lep_239_tr", "Plutonium LEP-239 TRISO", 0xBFC0BA, 0x7F807C);

    CaliforniumLECF251 = fuel("californium_lecf_251", "Californium LECF-251", 0x67040A, 0x450307);
    CaliforniumLECF251Ox = fuel("californium_lecf_251_ox", "Californium LECF-251 Oxide", 0x611035, 0x410B23);
    CaliforniumLECF251Ni = fuel("californium_lecf_251_ni", "Californium LECF-251 Nitride", 0x5C2D16, 0x3D1E0F);
    CaliforniumLECF251Za = fuel("californium_lecf_251_za", "Californium LECF-251 Zr", 0x950409, 0x630306);
    CaliforniumLECF251TR = fuel("californium_lecf_251_tr", "Californium LECF-251 TRISO", 0xBFC0BA, 0x7F807C);

    CaliforniumHECF251 = fuel("californium_hecf_251", "Californium HECF-251", 0x67040A, 0x450307);
    CaliforniumHECF251Ox = fuel("californium_hecf_251_ox", "Californium HECF-251 Oxide", 0x611035, 0x410B23);
    CaliforniumHECF251Ni = fuel("californium_hecf_251_ni", "Californium HECF-251 Nitride", 0x5C2D16, 0x3D1E0F);
    CaliforniumHECF251Za = fuel("californium_hecf_251_za", "Californium HECF-251 Zr", 0x950409, 0x630306);
    CaliforniumHECF251TR = fuel("californium_hecf_251_tr", "Californium HECF-251 TRISO", 0xBFC0BA, 0x7F807C);

    CaliforniumLECF249 = fuel("californium_lecf_249", "Californium LECF-249", 0x67040A, 0x450307);
    CaliforniumLECF249Ox = fuel("californium_lecf_249_ox", "Californium LECF-249 Oxide", 0x611035, 0x410B23);
    CaliforniumLECF249Ni = fuel("californium_lecf_249_ni", "Californium LECF-249 Nitride", 0x5C2D16, 0x3D1E0F);
    CaliforniumLECF249Za = fuel("californium_lecf_249_za", "Californium LECF-249 Zr", 0x950409, 0x630306);
    CaliforniumLECF249TR = fuel("californium_lecf_249_tr", "Californium LECF-249 TRISO", 0xBFC0BA, 0x7F807C);

    CaliforniumHECF249 = fuel("californium_hecf_249", "Californium HECF-249", 0x67040A, 0x450307);
    CaliforniumHECF249Ox = fuel("californium_hecf_249_ox", "Californium HECF-249 Oxide", 0x611035, 0x410B23);
    CaliforniumHECF249Ni = fuel("californium_hecf_249_ni", "Californium HECF-249 Nitride", 0x5C2D16, 0x3D1E0F);
    CaliforniumHECF249Za = fuel("californium_hecf_249_za", "Californium HECF-249 Zr", 0x950409, 0x630306);
    CaliforniumHECF249TR = fuel("californium_hecf_249_tr", "Californium HECF-249 TRISO", 0xBFC0BA, 0x7F807C);

    XenoriumXEN298 = fuel("xenorium_xen_298", "Xenorium XEN-298", 0xB3A1B8, 0x776B7B);
  }

  private static Material isotope(String id, String langValue, int color, int secondaryColor, int hazard) {
    Material.Builder builder = material(id, langValue)
        .ingot()
        .liquid()
        .color(color)
        .secondaryColor(secondaryColor)
        .iconSet(MaterialIconSet.RADIOACTIVE)
        .appendFlags(RADIOACTIVE);

    if (hazard > 0) {
      builder.radioactiveHazard(hazard);
    }

    return builder.buildAndRegister();
  }

  private static Material fuel(String id, String longValue, int color, int secondaryColor) {
    return material(id, longValue)
        .liquid()
        .color(color).secondaryColor(secondaryColor)
        .iconSet(MaterialIconSet.RADIOACTIVE)
        .flags(GENERATE_FUEL)
        .buildAndRegister();
  }

}
