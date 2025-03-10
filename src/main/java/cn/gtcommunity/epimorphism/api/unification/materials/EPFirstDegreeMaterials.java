package cn.gtcommunity.epimorphism.api.unification.materials;

import gregtech.api.fluids.FluidBuilder;
import gregtech.api.fluids.FluidState;
import static gregtech.api.fluids.attribute.FluidAttributes.ACID;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.properties.BlastProperty;
import gregtech.api.unification.material.properties.PropertyKey;
import gregtech.api.unification.material.properties.ToolProperty;
import net.minecraft.util.text.TextFormatting;

import static cn.gtcommunity.epimorphism.api.unification.material.info.EPMaterialFlags.*;
import static cn.gtcommunity.epimorphism.api.unification.material.info.EPMaterialIconSet.*;
import static gregtech.api.GTValues.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.info.MaterialIconSet.*;
import static gregtech.api.util.GTUtility.*;
import static cn.gtcommunity.epimorphism.api.unification.EPMaterials.*;

public class EPFirstDegreeMaterials {
    //  Range 24001-24500
    private static int startId = 24001;
    private static final int END_ID = startId + 500;

    public static void register() {
        //  24001 GrapheneOxide
        GrapheneOxide = new Material.Builder(getMaterialsId(), gregtechId("graphene_oxide"))
                .dust()
                .color(0x777777)
                .iconSet(ROUGH)
                .flags(DISABLE_DECOMPOSITION)
                .components(Graphene, 1, Oxygen, 1)
                .build();
        //  24002 Hydrazine
        Hydrazine = new Material.Builder(getMaterialsId(), gregtechId("hydrazine"))
                .fluid()
                .color(0xB50707)
                .flags(DISABLE_DECOMPOSITION)
                .components(Nitrogen, 2, Hydrogen, 4)
                .build();

        //  24003 BerylliumOxide
        BerylliumOxide = new Material.Builder(getMaterialsId(), gregtechId("beryllium_oxide"))
                .ingot()
                .color(0x54C757)
                .flags(GENERATE_ROD, GENERATE_RING)
                .components(Beryllium, 1, Oxygen, 1)
                .build();

        //  24004 Hydrogen Peroxide
        HydrogenPeroxide = new Material.Builder(getMaterialsId(), gregtechId("hydrogen_peroxide"))
                .fluid()
                .color(0xD2FFFF)
                .flags(DISABLE_DECOMPOSITION)
                .components(Hydrogen, 2, Oxygen, 2)
                .build();

        //  24005 Tungsten Trioxide
        TungstenTrioxide = new Material.Builder(getMaterialsId(), gregtechId("tungsten_trioxide"))
                .dust()
                .color(0xC7D300)
                .iconSet(DULL)
                .flags(DISABLE_DECOMPOSITION)
                .components(Tungsten, 1, Oxygen, 3)
                .build();
        //  24006 Hexagonal Boron Nitride
        HexagonalBoronNitride = new Material.Builder(getMaterialsId(), gregtechId("hexagonal_boron_nitride"))
                .gem()
                .color(0x6A6A72)
                .iconSet(GEM_VERTICAL)
                .flags(GENERATE_PLATE, DISABLE_DECOMPOSITION)
                .components(Boron, 1, Nitrogen, 1)
                .build()
                .setFormula("h-BN", true);

        //  24007  Cubic Boron Nitride
        CubicBoronNitride = new Material.Builder(getMaterialsId(), gregtechId("cubic_boron_nitride"))
                .gem()
                .color(0x545572)
                .iconSet(DIAMOND)
                .flags(GENERATE_PLATE, DISABLE_DECOMPOSITION, DISABLE_CRYSTALLIZATION, FLAMMABLE, EXPLOSIVE)
                .components(Boron, 1, Nitrogen, 1)
                .toolStats(new ToolProperty(14.0F, 9.0F, 12400, 15))
                .build()
                .setFormula("c-BN", true);
        //  24008 Boric Acid
        BoricAcid = new Material.Builder(getMaterialsId(), gregtechId("boric_acid"))
                .dust()
                .fluid()
                .color(0xFAFAFA)
                .iconSet(SHINY)
                .flags(DISABLE_DECOMPOSITION)
                .components(Hydrogen, 3, Boron, 1, Oxygen, 3)
                .build();
        //  24009 Boron Trioxide
        BoronTrioxide = new Material.Builder(getMaterialsId(), gregtechId("boron_trioxide"))
                .dust()
                .color(0xE9FAC0)
                .iconSet(METALLIC)
                .components(Boron, 2, Oxygen, 3)
                .build();
        //  24010 Boron Trifluoride
        BoronTrifluoride = new Material.Builder(getMaterialsId(), gregtechId("boron_trifluoride"))
                .gas()
                .color(0xFAF191)
                .components(Boron, 1, Fluorine, 3)
                .build();
        //  24011 Lithium Hydride
        LithiumHydride = new Material.Builder(getMaterialsId(), gregtechId("lithium_hydride"))
                .ingot()
                .color(0x9BAFDB)
                .iconSet(METALLIC)
                .components(Lithium, 1, Hydrogen, 1)
                .build();
        //  24012 Lithium Tetrafluoroborate
        LithiumTetrafluoroborate = new Material.Builder(getMaterialsId(), gregtechId("lithium_tetrafluoroborate"))
                .dust()
                .color(0x90FAF6)
                .iconSet(SHINY)
                .flags(DISABLE_DECOMPOSITION)
                .components(Lithium, 1, Boron, 1, Fluorine, 4)
                .build();
        //  24013 Diborane
        Diborane = new Material.Builder(getMaterialsId(), gregtechId("diborane"))
                .gas()
                .color(0x3F3131)
                .flags(DISABLE_DECOMPOSITION)
                .components(Boron, 2, Hydrogen, 6)
                .build();
        //  24014 Borazine
        Borazine = new Material.Builder(getMaterialsId(), gregtechId("borazine"))
                .fluid()
                .color(0x542828)
                .flags(DISABLE_DECOMPOSITION)
                .components(Boron, 3, Hydrogen, 6, Nitrogen, 3)
                .build();
        //  24015 Boron Trichloride
        BoronTrichloride = new Material.Builder(getMaterialsId(), gregtechId("boron_trichloride"))
                .gas()
                .color(0x033F1B)
                .components(Boron, 1, Chlorine, 3)
                .build();
        //  24016 Trichloroborazine
        Trichloroborazine = new Material.Builder(getMaterialsId(), gregtechId("trichloroborazine"))
                .fluid()
                .color(0xD62929)
                .flags(DISABLE_DECOMPOSITION)
                .components(Boron, 3, Chlorine, 3, Hydrogen, 3, Nitrogen, 3)
                .build();
        //  24017 Amorphous Boron Nitride
        AmorphousBoronNitride = new Material.Builder(getMaterialsId(), gregtechId("amorphous_boron_nitride"))
                .ingot()
                .color(0x9193C5)
                .iconSet(SHINY)
                .flags(GENERATE_PLATE, DISABLE_DECOMPOSITION, NO_SMASHING, NO_SMELTING)
                .components(Boron, 1, Nitrogen, 1)
                .build()
                .setFormula("a-BN", true);
        //  24018 Heterodiamond
        Heterodiamond = new Material.Builder(getMaterialsId(), gregtechId("heterodiamond"))
                .gem()
                .color(0x512A72)
                .iconSet(GEM_HORIZONTAL)
                .flags(GENERATE_PLATE, DISABLE_DECOMPOSITION)
                .components(Boron, 1, Carbon, 1, Nitrogen, 1)
                .build();
        //  24019 Cubic Heterodiamond
        CubicHeterodiamond = new Material.Builder(getMaterialsId(), gregtechId("cubic_heterodiamond"))
                .gem()
                .color(0x753DA6)
                .iconSet(DIAMOND)
                .flags(GENERATE_PLATE, DISABLE_DECOMPOSITION)
                .components(Boron, 1, Carbon, 2, Nitrogen, 1)
                .build()
                .setFormula("c-BC2N", true);
        //  24020 Carbon Nanotube
        CarbonNanotube = new Material.Builder(getMaterialsId(), gregtechId("carbon_nanotube"))
                .ingot()
                .fluid()
                .color(0x05090C)
                .iconSet(BRIGHT)
                .flags(DISABLE_DECOMPOSITION, NO_SMELTING, GENERATE_PLATE, GENERATE_ROD, GENERATE_LONG_ROD, GENERATE_FINE_WIRE, GENERATE_SPRING, GENERATE_COIL)
                .cableProperties(V[UEV], 8, 6)
                .components(Carbon, 48)
                .build()
                .setFormula("CNT", false);
        //  24021 Silver Tetrafluoroborate
        SilverTetrafluoroborate = new Material.Builder(getMaterialsId(), gregtechId("silver_tetrafluoroborate"))
                .fluid()
                .color(0x818024)
                .flags(DISABLE_DECOMPOSITION)
                .components(Silver, 1, Boron, 1, Fluorine, 4)
                .build()
                .setFormula("AgBF4", true);
        //  24022 Trimethyltin Chloride
        TrimethyltinChloride = new Material.Builder(getMaterialsId(), gregtechId("trimethyltin_chloride"))
                .fluid()
                .color(0x7F776F)
                .flags(DISABLE_DECOMPOSITION)
                .components(Carbon, 3, Hydrogen, 6, Tin, 1, Chlorine, 1)
                .build()
                .setFormula("(CH3)3SnCl", true);
        //  24023 Silver Chloride
        SilverChloride = new Material.Builder(getMaterialsId(), gregtechId("silver_chloride"))
                .dust()
                .color(0x8D8D8D)
                .iconSet(METALLIC)
                .components(Silver, 1, Chlorine, 1)
                .build();
        //  24024 Chloroplatinic Acid
        ChloroplatinicAcid = new Material.Builder(getMaterialsId(), gregtechId("chloroplatinic_acid"))
                .liquid(new FluidBuilder().attributes(ACID))
                .color(0xFFB546)
                .components(Hydrogen, 2, Platinum, 1, Chlorine, 6)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24025 Potassium Tetrachloroplatinate
        PotassiumTetrachloroplatinate = new Material.Builder(getMaterialsId(), gregtechId("potassium_tetrachloroplatinate"))
                .dust()
                .color(0xF1B04F)
                .iconSet(SHINY)
                .components(Potassium, 2, Platinum, 1, Chlorine, 4)
                .flags(DISABLE_DECOMPOSITION)
                .build()
                .setFormula("K2PtCl4", true);
        //  24026 Nickel Triphenylphosphite
        NickelTriphenylphosphite = new Material.Builder(getMaterialsId(), gregtechId("nickel_triphenylphosphite"))
                .dust()
                .color(0xCCCC66)
                .iconSet(SHINY)
                .flags(DISABLE_DECOMPOSITION)
                .components(Carbon, 36, Hydrogen, 30, Chlorine, 2, Nickel, 1, Phosphorus, 2)
                .build()
                .setFormula("C36H30Cl2NiP2", true);
        //  24027 Nickel Chloride
        NickelChloride = new Material.Builder(getMaterialsId(), gregtechId("nickel_chloride"))
                .dust()
                .color(0x898A07)
                .iconSet(DULL)
                .components(Nickel, 1, Chlorine, 2)
                .build();
        //  24028 Phosphorus Trichloride
        PhosphorusTrichloride = new Material.Builder(getMaterialsId(), gregtechId("phosphorus_trichloride"))
                .fluid()
                .color(0xD8D85B)
                .components(Phosphorus, 1, Chlorine, 3)
                .build();
        //  24029 Ammonium Sulfate
        AmmoniumSulfate = new Material.Builder(getMaterialsId(), gregtechId("ammonium_sulfate"))
                .fluid()
                .color(0x5858F4)
                .build()
                .setFormula("(NH2)4SO4", true);
        //  24030 Ammonium Persulfate
        AmmoniumPersulfate = new Material.Builder(getMaterialsId(), gregtechId("ammonium_persulfate"))
                .fluid()
                .color(0x4242B7)
                .build()
                .setFormula("(NH4)2S2O8", true);
        //  24031 Hydroxylamine Disulfate
        HydroxylamineDisulfate = new Material.Builder(getMaterialsId(), gregtechId("hydroxylamine_disulfate"))
                .fluid()
                .color(0x91A6D2)
                .build()
                .setFormula("(NH3OH)2(NH4)2(SO4)2", true);
        //  24032 Hydroxylamine
        Hydroxylamine = new Material.Builder(getMaterialsId(), gregtechId("hydroxylamine"))
                .fluid()
                .color(0x91C791)
                .components(Hydrogen, 3, Nitrogen, 1, Oxygen, 1)
                .build()
                .setFormula("H3NO", true);
        //  24033 Ammonium Nitrate
        AmmoniumNitrate = new Material.Builder(getMaterialsId(), gregtechId("ammonium_nitrate"))
                .fluid()
                .color(0x454066)
                .components(Nitrogen, 2, Hydrogen, 4, Oxygen, 3)
                .build()
                .setFormula("NH4NO3", true);
        //  24034 Thallium Sulfate
        ThalliumSulfate = new Material.Builder(getMaterialsId(), gregtechId("thallium_sulfate"))
                .dust()
                .color(0x9C222C)
                .iconSet(METALLIC)
                .flags(DISABLE_DECOMPOSITION)
                .components(Thallium, 2, Sulfur, 1, Oxygen, 4)
                .build();
        //  24035 Thallium Chloride
        ThalliumChloride = new Material.Builder(getMaterialsId(), gregtechId("thallium_chloride"))
                .dust()
                .color(0xCC5350)
                .iconSet(SHINY)
                .components(Thallium, 1, Chlorine, 1)
                .build();
        //  24036 Iodized Brine
        IodizedBrine = new Material.Builder(getMaterialsId(), gregtechId("iodized_brine"))
                .fluid()
                .color(0x525246)
                .build()
                .setFormula("I?", false);
        //  24037 Iodine Brine Mixture
        IodineBrineMixture = new Material.Builder(getMaterialsId(), gregtechId("iodine_brine_mixture"))
                .fluid()
                .color(0x525234)
                .build()
                .setFormula("I?Cl", false);
        //  24038 Brominated Brine
        BrominatedBrine = new Material.Builder(getMaterialsId(), gregtechId("brominated_brine"))
                .fluid()
                .color(0xA9A990)
                .build()
                .setFormula("Br?", false);
        //  24039 Iodine Slurry
        IodineSlurry = new Material.Builder(getMaterialsId(), gregtechId("iodine_slurry"))
                .fluid()
                .color(0x292923)
                .build()
                .setFormula("I?", false);
        //  24040 Sodium Iodate
        SodiumIodate = new Material.Builder(getMaterialsId(), gregtechId("sodium_iodate"))
                .dust()
                .color(0x0B0B47)
                .iconSet(DULL)
                .components(Sodium, 1, Iodine, 1, Oxygen, 3)
                .build();
        //  24041 Sodium Iodide
        SodiumIodide = new Material.Builder(getMaterialsId(), gregtechId("sodium_iodide"))
                .dust()
                .color(0x1919A3)
                .iconSet(METALLIC)
                .components(Sodium, 1, Iodine, 1)
                .build();
        //  24042 Sodium Hypochlorite
        SodiumHypochlorite = new Material.Builder(getMaterialsId(), gregtechId("sodium_hypochlorite"))
                .dust()
                .color(0x2828FF)
                .components(Sodium, 1, Chlorine, 1, Oxygen, 1)
                .build();
        //  24043 Sodium Periodate
        SodiumPeriodate = new Material.Builder(getMaterialsId(), gregtechId("sodium_periodate"))
                .dust()
                .color(0x050547)
                .iconSet(BRIGHT)
                .components(Sodium, 1, Iodine, 1, Oxygen, 4)
                .build();
        //  24044 Acidic Brominated Brine
        AcidicBrominatedBrine = new Material.Builder(getMaterialsId(), gregtechId("acidic_brominated_brine"))
                .liquid(new FluidBuilder().attributes(ACID))
                .color(0xC6A76F)
                .build()
                .setFormula("Br?(H2SO4)Cl", true);
        //  24045 Bromine Sulfate Solution
        BromineSulfateSolution = new Material.Builder(getMaterialsId(), gregtechId("bromine_sulfate_solution"))
                .fluid()
                .color(0xCC9966)
                .build()
                .setFormula("H2SO4Br(H2O)Cl2", true);
        //  24046 Overheated Bromine Sulfate Solution
        OverheatedBromineSulfateSolution = new Material.Builder(getMaterialsId(), gregtechId("overheated_bromine_sulfate_solution"))
                .fluid()
                .color(0xC69337)
                .iconSet(DULL)
                .build()
                .setFormula("H2SO4Br(H2O)2Cl2", true);
        //  24047 Wet Bromine
        WetBromine = new Material.Builder(getMaterialsId(), gregtechId("wet_bromine"))
                .fluid()
                .color(0xDB5C5C)
                .iconSet(DULL)
                .build()
                .setFormula("Br(H2O)", true);
        //  24048 Debrominated Water
        DebrominatedWater = new Material.Builder(getMaterialsId(), gregtechId("debrominated_water"))
                .fluid()
                .color(0x24A3A3)
                .components(Hydrogen, 2, Oxygen, 1)
                .build();
        //  24049 Palladium Chloride
        PalladiumChloride = new Material.Builder(getMaterialsId(), gregtechId("palladium_chloride"))
                .dust()
                .color(0xAFB5BC)
                .iconSet(SHINY)
                .components(Palladium, 1, Chlorine, 2)
                .build();
        //  24050 Palladium on Carbon
        PalladiumOnCarbon = new Material.Builder(getMaterialsId(), gregtechId("palladium_on_carbon"))
                .dust()
                .color(0x480104)
                .iconSet(DULL)
                .flags(DISABLE_DECOMPOSITION)
                .components(Palladium, 1, Carbon, 1)
                .build();
        //  24051 Potassium Permanganate
        PotassiumPermanganate = new Material.Builder(getMaterialsId(), gregtechId("potassium_permanganate"))
                .dust()
                .color(0x871D82)
                .iconSet(DULL)
                .components(Potassium, 1, Manganese, 1, Oxygen, 4)
                .build();
        //  24052 Potassium Manganate
        PotassiumManganate = new Material.Builder(getMaterialsId(), gregtechId("potassium_manganate"))
                .dust()
                .color(0x873883)
                .iconSet(METALLIC)
                .components(Potassium, 2, Manganese, 1, Oxygen, 4)
                .build();
        //  24053 Tin Chloride
        TinChloride = new Material.Builder(getMaterialsId(), gregtechId("tin_chloride"))
                .dust()
                .fluid()
                .color(0xDBDBDB)
                .iconSet(METALLIC)
                .components(Tin, 1, Chlorine, 2)
                .build();
        //  24054 Silver Oxide
        SilverOxide = new Material.Builder(getMaterialsId(), gregtechId("silver_oxide"))
                .dust()
                .color(0xA4A4A4)
                .components(Silver, 2, Oxygen, 1)
                .build();
        //  24055 Sodium Fluoride
        SodiumFluoride = new Material.Builder(getMaterialsId(), gregtechId("sodium_fluoride"))
                .dust()
                .color(0x460012)
                .iconSet(DULL)
                .components(Sodium, 1, Fluorine, 1)
                .build();
        //  24056 Zn-Fe-Al-Cl Catalyst
        ZnFeAlClCatalyst = new Material.Builder(getMaterialsId(), gregtechId("zn_fe_al_cl_catalyst"))
                .dust()
                .color(0xC522A9)
                .iconSet(DULL)
                .components(Zinc, 1, Iron, 1, Aluminium, 1, Chlorine, 1)
                .build();
        //  24057 Sodium Nitrite
        SodiumNitrite = new Material.Builder(getMaterialsId(), gregtechId("sodium_nitrite"))
                .dust()
                .color(0x205CA4)
                .iconSet(DULL)
                .components(Sodium, 1, Nitrogen, 1, Oxygen, 2)
                .build();
        //  24058 Sodium Nitrate
        SodiumNitrate = new Material.Builder(getMaterialsId(), gregtechId("sodium_nitrate"))
                .dust()
                .fluid()
                .color(0xEB9E3F)
                .iconSet(METALLIC)
                .components(Sodium, 1, Nitrogen, 1, Oxygen, 3)
                .build();
        //  24059 Fluoroboric Acid
        FluoroboricAcid = new Material.Builder(getMaterialsId(), gregtechId("fluoroboric_acid"))
                .liquid(new FluidBuilder().attributes(ACID))
                .color(0xD5811B)
                .components(Hydrogen, 1, Boron, 1, Fluorine, 4)
                .build();
        //  24060 Benzenediazonium Tetrafluoroborate
        BenzenediazoniumTetrafluoroborate = new Material.Builder(getMaterialsId(), gregtechId("benzenediazonium_tetrafluoroborate"))
                .fluid()
                .color(0xD5C5B2)
                .components(Carbon, 6, Hydrogen, 5, Boron, 1, Fluorine, 4, Nitrogen, 2)
                .build();
        //  24061 Gallium Trichloride
        GalliumTrichloride = new Material.Builder(getMaterialsId(), gregtechId("gallium_trichloride"))
                .dust()
                .color(0x6EB4FF)
                .iconSet(ROUGH)
                .components(Gallium, 1, Chlorine, 3)
                .build();
        //  24062 Aluminium Trichloride
        AluminiumTrichloride = new Material.Builder(getMaterialsId(), gregtechId("aluminium_trichloride"))
                .dust()
                .color(0x78C3EB)
                .iconSet(SHINY)
                .flags(DISABLE_DECOMPOSITION)
                .components(Aluminium, 1, Chlorine, 3)
                .build();
        //  24063 Aluminium Hydroxide
        AluminiumHydroxide = new Material.Builder(getMaterialsId(), gregtechId("aluminium_hydroxide"))
                .dust()
                .color(0xBEBEC8)
                .flags(DISABLE_DECOMPOSITION)
                .components(Aluminium, 1, Oxygen, 3, Hydrogen, 3)
                .build()
                .setFormula("Al(OH)3", true);
        //  24064 Alumina
        Alumina = new Material.Builder(getMaterialsId(), gregtechId("alumina"))
                .dust()
                .color(0x78c3eb)
                .iconSet(METALLIC)
                .components(Aluminium, 2, Oxygen, 3)
                .build();
        //  24065 Gallium Trioxide
        GalliumTrioxide = new Material.Builder(getMaterialsId(), gregtechId("gallium_trioxide"))
                .dust()
                .liquid(new FluidBuilder().temperature(2170))
                .color(0xE4CDFF)
                .iconSet(METALLIC)
                .components(Gallium, 1, Oxygen, 3)
                .build();
        //  24066 Gallium Nitride
        GalliumNitride = new Material.Builder(getMaterialsId(), gregtechId("gallium_nitride"))
                .ingot()
                .color(0xFFF458)
                .iconSet(SHINY)
                .flags(GENERATE_PLATE)
                .components(Gallium, 1, Nitrogen, 1)
                .build();
        //  24067 Fullerene
        Fullerene = new Material.Builder(getMaterialsId(), gregtechId("fullerene"))
                .ingot()
                .color(0x72556A)
                .iconSet(BRIGHT)
                .flags(DISABLE_DECOMPOSITION, NO_SMELTING, GENERATE_PLATE, GENERATE_FOIL, GENERATE_ROD, GENERATE_RING, GENERATE_FRAME)
                .components(Carbon, 60)
                .build();
        //  24068 Geodesic Polyarene
        GeodesicPolyarene = new Material.Builder(getMaterialsId(), gregtechId("geodesic_polyarene"))
                .dust()
                .color(0x9E81A8)
                .iconSet(METALLIC)
                .flags(DISABLE_DECOMPOSITION)
                .components(Carbon, 60, Hydrogen, 30)
                .build();
        //  24069 Ti-Al Catalyst
        TiAlCatalyst = new Material.Builder(getMaterialsId(), gregtechId("ti_al_catalyst"))
                .dust()
                .color(0x6600CC)
                .iconSet(DULL)
                .components(Titanium, 1, Aluminium, 1)
                .build();
        //  24070 Potassium Cyanide
        PotassiumCyanide = new Material.Builder(getMaterialsId(), gregtechId("potassium_cyanide"))
                .dust()
                .color(0x9EF3D0)
                .iconSet(ROUGH)
                .components(Potassium, 1, Carbon, 1, Nitrogen, 1)
                .build();
        //  24071 Potassium Bromide
        PotassiumBromide = new Material.Builder(getMaterialsId(), gregtechId("potassium_bromide"))
                .dust()
                .color(0x615057)
                .iconSet(DULL)
                .components(Potassium, 1, Bromine, 1)
                .build();
        //  24072 Bismuth Vanadate
        BismuthVanadate = new Material.Builder(getMaterialsId(), gregtechId("bismuth_vanadate"))
                .dust()
                .color(0xFFAF33)
                .iconSet(SHINY)
                .components(Bismuth, 1, Vanadium, 1, Oxygen, 4)
                .build();
        //  24073 Bismuth Vanadate Solution
        BismuthVanadateSolution = new Material.Builder(getMaterialsId(), gregtechId("bismuth_vanadate_solution"))
                .fluid()
                .color(0xFFAF33)
                .flags(DISABLE_DECOMPOSITION)
                .components(Bismuth, 1, Vanadium, 1, Hydrogen, 2, Oxygen, 5)
                .build()
                .setFormula("BiVO4(H2O)", true);
        //  24074 Ammonium Vanadate
        AmmoniumVanadate = new Material.Builder(getMaterialsId(), gregtechId("ammonium_vanadate"))
                .dust()
                .color(0xCC9933)
                .iconSet(ROUGH)
                .flags(DISABLE_DECOMPOSITION)
                .components(Nitrogen, 1, Hydrogen, 4, Vanadium, 1, Oxygen, 3)
                .build();
        //  24075 Vanadium Slag
        VanadiumSlag = new Material.Builder(getMaterialsId(), gregtechId("vanadium_slag"))
                .dust()
                .color(0xCC9933)
                .iconSet(DULL)
                .flags(DISABLE_DECOMPOSITION)
                .components(Vanadium, 1, Oxygen, 1)
                .build();
        //  24076 Bismuth Nitrate Solution
        BismuthNitrateSolution = new Material.Builder(getMaterialsId(), gregtechId("bismuth_nitrate_solution"))
                .fluid()
                .color(0x3ABF50)
                .components(Bismuth, 1, Nitrogen, 3, Oxygen, 10, Hydrogen, 2)
                .flags(DISABLE_DECOMPOSITION)
                .build()
                .setFormula("Bi(NO3)3(H2O)");
        //  24077 Sodium Vanadate
        SodiumVanadate = new Material.Builder(getMaterialsId(), gregtechId("sodium_vanadate"))
                .dust()
                .color(0xCC9933)
                .iconSet(BRIGHT)
                .flags(DISABLE_DECOMPOSITION)
                .components(Sodium, 3, Vanadium, 1, Oxygen, 4)
                .build();
        //  24078 Vanadium Waste Solution
        VanadiumWasteSolution = new Material.Builder(getMaterialsId(), gregtechId("vanadium_waste_solution"))
                .fluid()
                .color(0xA28097)
                .flags(DISABLE_DECOMPOSITION)
                .build()
                .setFormula("NaCl(Na2SO4)(SiO2)(Al(OH)3)");
        //  24079 Sodium Bromide
        SodiumBromide = new Material.Builder(getMaterialsId(), gregtechId("sodium_bromide"))
                .dust()
                .color(0x830B2B)
                .iconSet(ROUGH)
                .components(Sodium, 1, Bromine, 1)
                .build();
        //  24080 White Phosphorus
        WhitePhosphorus = new Material.Builder(getMaterialsId(), gregtechId("white_phosphorus"))
                .gem()
                .color(0xECEADD)
                .iconSet(FLINT)
                .flags(DISABLE_DECOMPOSITION)
                .components(Phosphorus, 4)
                .build();
        //  24081 Red Phosphorus
        RedPhosphorus = new Material.Builder(getMaterialsId(), gregtechId("red_phosphorus"))
                .gem()
                .color(0x77040E)
                .iconSet(FLINT)
                .flags(DISABLE_DECOMPOSITION)
                .components(Phosphorus, 4)
                .build();
        //  24082 Violet Phosphorus
        VioletPhosphorus = new Material.Builder(getMaterialsId(), gregtechId("violet_phosphorus"))
                .gem()
                .color(0x8000FF)
                .iconSet(FLINT)
                .flags(DISABLE_DECOMPOSITION)
                .components(Phosphorus, 4)
                .build();
        //  24083 Black Phosphorus
        BlackPhosphorus = new Material.Builder(getMaterialsId(), gregtechId("black_phosphorus"))
                .gem()
                .color(0x36454F)
                .iconSet(FLINT)
                .flags(DISABLE_DECOMPOSITION)
                .components(Phosphorus, 4)
                .build();
        //  24084 Blue Phosphorus
        BluePhosphorus = new Material.Builder(getMaterialsId(), gregtechId("blue_phosphorus"))
                .gem()
                .color(0x9BE3E4)
                .iconSet(FLINT)
                .flags(DISABLE_DECOMPOSITION)
                .components(Phosphorus, 4)
                .build();
        //  24085 Wollastonite
        Wollastonite = new Material.Builder(getMaterialsId(), gregtechId("wollastonite"))
                .dust()
                .color(0xF0F0F0)
                .flags(DECOMPOSITION_BY_CENTRIFUGING)
                .components(Quicklime, 2, SiliconDioxide, 3)
                .build()
                .setFormula("CaSiO3", true);
        //  24086 Phosphorene
        Phosphorene = new Material.Builder(getMaterialsId(), gregtechId("phosphorene"))
                .ingot()
                .color(0x273239)
                .iconSet(SHINY)
                .flags(DISABLE_DECOMPOSITION, GENERATE_FOIL)
                .components(Phosphorus, 4)
                .build();
        //  24087 Phosphoryl Chloride
        PhosphorylChloride = new Material.Builder(getMaterialsId(), gregtechId("phosphoryl_chloride"))
                .fluid()
                .color(0xE8BB5B)
                .components(Phosphorus, 1, Oxygen, 1, Chlorine, 3)
                .build();
        //  24088 Phosphine
        Phosphine = new Material.Builder(getMaterialsId(), gregtechId("phosphine"))
                .gas()
                .color(0xACB330)
                .flags(DECOMPOSITION_BY_ELECTROLYZING, FLAMMABLE)
                .components(Phosphorus, 1, Hydrogen, 3)
                .build();
        //  24089 Copper Chloride
        CopperChloride = new Material.Builder(getMaterialsId(), gregtechId("copper_chloride"))
                .dust()
                .color(0x3FB3B8)
                .iconSet(ROUGH)
                .components(Copper, 1, Chlorine, 2)
                .build();
        //  24090 Lithium Hydroxide
        LithiumHydroxide = new Material.Builder(getMaterialsId(), gregtechId("lithium_hydroxide"))
                .dust()
                .color(0xDECAFA)
                .iconSet(FINE)
                .components(Lithium, 1, Oxygen, 1, Hydrogen, 1)
                .build();

        //  24091 Lithiuim Amalgam
        LithiumAmalgam = new Material.Builder(getMaterialsId(), gregtechId("lithium_amalgam"))
                .fluid()
                .color(0xAEA7D4)
                .iconSet(FINE)
                .flags(DISABLE_DECOMPOSITION)
                .components(Mercury, 1, Lithium, 1)
                .build();
        //  24092 Hexafluoride Enriched Naquadah Solution
        HexafluorideEnrichedNaquadahSolution = new Material.Builder(getMaterialsId(), gregtechId("hexafluoride_enriched_naquadah_solution"))
                .fluid()
                .color(0x868D7F)
                .components(NaquadahEnriched, 1, Fluorine, 6)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24093 Xenon Hexafluoro Enriched Naquadate
        XenonHexafluoroEnrichedNaquadate = new Material.Builder(getMaterialsId(), gregtechId("xenon_hexafluoro_enriched_naquadate"))
                .fluid()
                .color(0x255A55)
                .components(Xenon, 1, NaquadahEnriched, 1, Fluorine, 6)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24094 Enriched Naquadah Residue Solution
        EnrichedNaquadahResidueSolution = new Material.Builder(getMaterialsId(), gregtechId("enriched_naquadah_residue_solution"))
                .fluid()
                .color(0x868D7F)
                .iconSet(DULL)
                .flags(DISABLE_DECOMPOSITION)
                .build()
                .setFormula("XeAuSbKeF6S2?");
        //  24095 Xenoauric Fluoroantimonic Acid
        XenoauricFluoroantimonicAcid = new Material.Builder(getMaterialsId(), gregtechId("xenoauric_fluoroantimonic_acid"))
                .liquid(new FluidBuilder().attributes(ACID))
                .color(0xE0BD74)
                .components(Xenon, 1, Gold, 1, Antimony, 1, Fluorine, 6)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24096 Gold Chloride
        GoldChloride = new Material.Builder(getMaterialsId(), gregtechId("gold_chloride"))
                .fluid()
                .color(0xCCCC66)
                .components(Gold, 2, Chlorine, 6)
                .build();
        //  24097 Bromine Trifluoride
        BromineTrifluoride = new Material.Builder(getMaterialsId(), gregtechId("bromine_trifluoride"))
                .fluid()
                .color(0xA88E57)
                .components(Bromine, 1, Fluorine, 3)
                .build();
        //  24098 Gold Trifluoride
        GoldTrifluoride = new Material.Builder(getMaterialsId(), gregtechId("gold_trifluoride"))
                .dust()
                .color(0xE8C478)
                .iconSet(BRIGHT)
                .components(Gold, 1, Fluorine, 3)
                .build();
        //  24099 Naquadria Caesiumfluoride
        NaquadriaCaesiumfluoride = new Material.Builder(getMaterialsId(), gregtechId("naquadria_caesiumfluoride"))
                .fluid()
                .color(0xAAEB69)
                .components(Naquadria, 1, Fluorine, 3, Caesium, 1)
                .flags(DISABLE_DECOMPOSITION)
                .build()
                .setFormula("*Nq*F2CsF", true);
        //  24100 Acidic Naquadria Caesiumfluoride
        AcidicNaquadriaCaesiumfluoride = new Material.Builder(getMaterialsId(), gregtechId("acidic_naquadria_caesiumfluoride"))
                .fluid()
                .color(0x75EB00)
                .components(Naquadria, 1, Fluorine, 3, Caesium, 1, Sulfur, 2, Oxygen, 8)
                .flags(DISABLE_DECOMPOSITION)
                .build()
                .setFormula("*Nq*F2CsF(SO4)2", true);
        //  24101 Nitrosonium Octafluoroxenate
        NitrosoniumOctafluoroxenate = new Material.Builder(getMaterialsId(), gregtechId("nitrosonium_octafluoroxenate"))
                .fluid()
                .color(0x953D9F)
                .components(NitrogenDioxide, 2, Xenon, 1, Fluorine, 8)
                .build()
                .setFormula("(NO2)2XeF8", true);
        //  24102 Naquadria Caesium Xenonnonfluoride
        NaquadriaCaesiumXenonnonfluoride = new Material.Builder(getMaterialsId(), gregtechId("naquadria_caesium_xenonnonfluoride"))
                .fluid()
                .color(0x54C248)
                .components(Naquadria, 1, Caesium, 1, Xenon, 1, Fluorine, 9)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24103 Radon Naquadria Octafluoride
        RadonNaquadriaOctafluoride = new Material.Builder(getMaterialsId(), gregtechId("radon_naquadria_octafluoride"))
                .fluid()
                .color(0x85F378)
                .components(Radon, 1, Naquadria, 1, Fluorine, 8)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24104 Caesium Xenontrioxide Fluoride
        CaesiumXenontrioxideFluoride = new Material.Builder(getMaterialsId(), gregtechId("caesium_xenontrioxide_fluoride"))
                .fluid()
                .color(0x5067D7)
                .flags(DISABLE_DECOMPOSITION)
                .components(Caesium, 1, Xenon, 1, Oxygen, 3, Fluorine, 1)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24105 Radon Trioxide
        RadonTrioxide = new Material.Builder(getMaterialsId(), gregtechId("radon_trioxide"))
                .fluid()
                .color(0x9A6DD7)
                .components(Radon, 1, Oxygen, 3)
                .build();
        //  24106 Cesium Fluoride
        CaesiumFluoride = new Material.Builder(getMaterialsId(), gregtechId("caesium_fluoride"))
                .fluid()
                .color(0xFF7A5F)
                .components(Caesium, 1, Fluorine, 1)
                .build();
        //  24107 Xenon Trioxide
        XenonTrioxide = new Material.Builder(getMaterialsId(), gregtechId("xenon_trioxide"))
                .fluid()
                .color(0x359FC3)
                .components(Xenon, 1, Oxygen, 3)
                .build();
        //  24108 Hexafluoride Naquadria Solution
        HexafluorideNaquadriaSolution = new Material.Builder(getMaterialsId(), gregtechId("hexafluoride_naquadria_solution"))
                .fluid()
                .color(0x25C213)
                .components(Naquadria, 1, Fluorine, 6)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24109 Naquadria Residue Solution
        NaquadriaResidueSolution = new Material.Builder(getMaterialsId(), gregtechId("naquadria_residue_solution"))
                .fluid()
                .color(0x25C213)
                .iconSet(DULL)
                .flags(DISABLE_DECOMPOSITION)
                .build()
                .setFormula("InPS6?", true);
        //  24110 Radon Difluoride
        RadonDifluoride = new Material.Builder(getMaterialsId(), gregtechId("radon_difluoride"))
                .fluid()
                .color(0x8B7EFF)
                .components(Radon, 1, Fluorine, 2)
                .build();
        //  24111 Heavy Alkali Chloride Solution
        HeavyAlkaliChlorideSolution = new Material.Builder(getMaterialsId(), gregtechId("heavy_alkali_chloride_solution"))
                .fluid()
                .color(0x8F5353)
                .flags(DISABLE_DECOMPOSITION)
                .components(Rubidium, 1, Caesium, 2, Chlorine, 6, Water, 2)
                .build()
                .setFormula("RbCl(CsCl)2Cl3(H2O)2", true);
        //  24112 Stannic Chloride
        StannicChloride = new Material.Builder(getMaterialsId(), gregtechId("stannic_chloride"))
                .fluid()
                .color(0x33BBF5)
                .components(Tin, 1, Chlorine, 4)
                .build();
        //  24113 Rubidium Chlorostannate
        RubidiumChlorostannate = new Material.Builder(getMaterialsId(), gregtechId("rubidium_chlorostannate"))
                .dust()
                .color(0xBD888A)
                .iconSet(METALLIC)
                .components(Rubidium, 2, Tin, 1, Chlorine, 6)
                .build();
        //  24114 Caesium Chlorostannate
        CaesiumChlorostannate = new Material.Builder(getMaterialsId(), gregtechId("caesium_chlorostannate"))
                .dust()
                .color(0xBDAD88)
                .iconSet(SHINY)
                .components(Caesium, 2, Tin, 1, Chlorine, 6)
                .build();
        //  24115 Germanium Dioxide
        GermaniumDioxide = new Material.Builder(getMaterialsId(), gregtechId("germanium_dioxide"))
                .dust()
                .color(0x666666)
                .flags(DISABLE_DECOMPOSITION)
                .components(Germanium, 1, Oxygen, 2)
                .build();
        //  24116 Roasted Sphalerite
        RoastedSphalerite = new Material.Builder(getMaterialsId(), gregtechId("roasted_sphalerite"))
                .dust()
                .color(0xAC8B5C)
                .iconSet(FINE)
                .flags(DISABLE_DECOMPOSITION)
                .components(Gallium, 1, GermaniumDioxide, 1)
                .build();
        //  24117 Zinc Rich Sphalerite
        ZincRichSphalerite = new Material.Builder(getMaterialsId(), gregtechId("zinc_rich_sphalerite"))
                .dust()
                .color(0xC3AC8F)
                .iconSet(METALLIC)
                .flags(DISABLE_DECOMPOSITION)
                .components(Zinc, 2, RoastedSphalerite, 3)
                .build()
                .setFormula("Zn2(GaGeO2)", true);
        //  24118 Zinc Oxide
        ZincOxide = new Material.Builder(getMaterialsId(), gregtechId("zinc_oxide"))
                .dust()
                .color(0xB85C34)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .components(Zinc, 1, Oxygen, 1)
                .build();
        //  24119 Waelz Oxide
        WaelzOxide = new Material.Builder(getMaterialsId(), gregtechId("waelz_oxide"))
                .dust()
                .color(0xB8B8B8)
                .iconSet(FINE)
                .flags(DISABLE_DECOMPOSITION)
                .components(Zinc, 1, GermaniumDioxide, 1)
                .build();
        //  24120 Waelz Slag
        WaelzSlag = new Material.Builder(getMaterialsId(), gregtechId("waelz_slag"))
                .dust()
                .color(0xAC8B5C)
                .iconSet(ROUGH)
                .flags(DISABLE_DECOMPOSITION)
                .components(Gallium, 1, Zinc, 1, Sulfur, 1, Oxygen, 4)
                .build();
        //  24121 Impure Germanium Dioxide
        ImpureGermaniumDioxide = new Material.Builder(getMaterialsId(), gregtechId("impure_germanium_dioxide"))
                .dust()
                .color(0x666666)
                .iconSet(ROUGH)
                .flags(DISABLE_DECOMPOSITION)
                .components(GermaniumDioxide, 1)
                .build()
                .setFormula("GeO2?", true);
        //  24122 Germanium Tetrachloride
        GermaniumTetrachloride = new Material.Builder(getMaterialsId(), gregtechId("germanium_tetrachloride"))
                .fluid()
                .color(0x787878)
                .flags(DISABLE_DECOMPOSITION)
                .components(Germanium, 1, Chlorine, 4)
                .build();
        //  24123 Molybdenum Trioxide
        MolybdenumTrioxide = new Material.Builder(getMaterialsId(), gregtechId("molybdenum_trioxide"))
                .dust()
                .color(0xCBCFDA)
                .iconSet(ROUGH)
                .flags(DISABLE_DECOMPOSITION)
                .components(Molybdenum, 1, Oxygen, 3)
                .build();
        //  24124 Lead Chloride
        LeadChloride = new Material.Builder(getMaterialsId(), gregtechId("lead_chloride"))
                .dust()
                .color(0xF3F3F3)
                .iconSet(ROUGH)
                .components(Lead, 1, Chlorine, 2)
                .build();
        //  24125 Perrhenic Acid
        PerrhenicAcid = new Material.Builder(getMaterialsId(), gregtechId("perrhenic_acid"))
                .dust()
                .color(0xE6DC70)
                .iconSet(SHINY)
                .flags(DISABLE_DECOMPOSITION)
                .components(Hydrogen, 1, Rhenium, 1, Oxygen, 4)
                .build();
        //  24126 Ammonium Perrhenate
        AmmoniumPerrhenate = new Material.Builder(getMaterialsId(), gregtechId("ammonium_perrhenate"))
                .dust()
                .fluid()
                .color(0xA69970)
                .iconSet(METALLIC)
                .flags(DISABLE_DECOMPOSITION)
                .components(Nitrogen, 1, Hydrogen, 4, Rhenium, 1, Oxygen, 4)
                .build();
        //  24127 Niobium Pentoxide
        NiobiumPentoxide = new Material.Builder(getMaterialsId(), gregtechId("niobium_pentoxide"))
                .dust()
                .color(0xBAB0C3)
                .iconSet(ROUGH)
                .components(Niobium, 2, Oxygen, 5)
                .build();
        //  24128 Tantalum Pentoxide
        TantalumPentoxide = new Material.Builder(getMaterialsId(), gregtechId("tantalum_pentoxide"))
                .dust()
                .color(0x72728A)
                .iconSet(ROUGH)
                .components(Tantalum, 2, Oxygen, 5)
                .build();
        //  24129 Calcium Difluoride
        CalciumDifluoride = new Material.Builder(getMaterialsId(), gregtechId("calcium_difluoride"))
                .dust()
                .color(0xFFFC9E)
                .iconSet(ROUGH)
                .components(Calcium, 1, Fluorine, 2)
                .build();
        //  24130 Manganese Difluoride
        ManganeseDifluoride = new Material.Builder(getMaterialsId(), gregtechId("manganese_difluoride"))
                .dust()
                .color(0xEF4B3D)
                .iconSet(ROUGH)
                .components(Manganese, 1, Fluorine, 2)
                .build();
        //  24131 Calcium Carbide
        CalciumCarbide = new Material.Builder(getMaterialsId(), gregtechId("calcium_carbide"))
                .dust()
                .color(0x807B70)
                .iconSet(DULL)
                .components(Calcium, 1, Carbon, 2)
                .build();
        //  24132 Calcium Hydroxide
        CalciumHydroxide = new Material.Builder(getMaterialsId(), gregtechId("calcium_hydroxide"))
                .dust()
                .color(0x5F8764)
                .iconSet(ROUGH)
                .flags(DISABLE_DECOMPOSITION)
                .components(Calcium, 1, Hydrogen, 2, Oxygen, 2)
                .build()
                .setFormula("Ca(OH)2", true);
        //  24133 Sodium Tellurite
        SodiumTellurite = new Material.Builder(getMaterialsId(), gregtechId("sodium_tellurite"))
                .dust()
                .color(0xC6C9BE)
                .iconSet(ROUGH)
                .flags(DISABLE_DECOMPOSITION)
                .components(Sodium, 2, Tellurium, 1, Oxygen, 3)
                .build();
        //  24134 Selenium Dioxide
        SeleniumDioxide = new Material.Builder(getMaterialsId(), gregtechId("selenium_dioxide"))
                .dust()
                .color(0xE0DDD8)
                .iconSet(METALLIC)
                .flags(DISABLE_DECOMPOSITION)
                .components(Selenium, 1, Oxygen, 2)
                .build();
        //  24135 Tellurium Dioxide
        TelluriumDioxide = new Material.Builder(getMaterialsId(), gregtechId("tellurium_dioxide"))
                .dust()
                .color(0xE3DDB8)
                .iconSet(METALLIC)
                .flags(DISABLE_DECOMPOSITION)
                .components(Tellurium, 1, Oxygen, 2)
                .build();
        //  24136 Selenous Acid
        SelenousAcid = new Material.Builder(getMaterialsId(), gregtechId("selenous_acid"))
                .dust()
                .color(0xE0E083)
                .iconSet(SHINY)
                .flags(DISABLE_DECOMPOSITION)
                .components(Hydrogen, 2, Selenium, 1, Oxygen, 3)
                .build();
        //  24137 GST Glass
        GSTGlass = new Material.Builder(getMaterialsId(), gregtechId("gst_glass"))
                .ingot()
                .fluid()
                .color(0xCFFFFF)
                .iconSet(SHINY)
                .flags(GENERATE_PLATE, NO_SMASHING, NO_WORKING, DECOMPOSITION_BY_CENTRIFUGING)
                .components(Germanium, 2, Antimony, 2, Tellurium, 5)
                .blast(873, BlastProperty.GasTier.MID)
                .build();
        //  24138 ZBLAN Glass
        ZBLANGlass = new Material.Builder(getMaterialsId(), gregtechId("zblan_glass"))
                .ingot()
                .fluid()
                .color(0xACB4BC)
                .iconSet(SHINY)
                .flags(NO_SMASHING, NO_WORKING, DISABLE_DECOMPOSITION, GENERATE_FINE_WIRE)
                .components(Zirconium, 5, Barium, 2, Lanthanum, 1, Aluminium, 1, Sodium, 2, Fluorine, 6)
                .build()
                .setFormula("(ZrF4)5(BaF2)2(LaF3)(AlF3)(NaF)2", true);
        //  24139 Erbium-doped ZBLAN Glass
        ErbiumDopedZBLANGlass = new Material.Builder(getMaterialsId(), gregtechId("erbium_doped_zblan_glass"))
                .ingot()
                .color(0x505444)
                .iconSet(BRIGHT)
                .flags(NO_SMASHING, NO_WORKING, DISABLE_DECOMPOSITION, GENERATE_PLATE)
                .components(ZBLANGlass, 1, Erbium, 1)
                .build()
                .setFormula("(ZrF4)5(BaF2)2(LaF3)(AlF3)(NaF)2Er", true);
        //  24140 PraseodymiumDopedZBLANGlass
        PraseodymiumDopedZBLANGlass = new Material.Builder(getMaterialsId(), gregtechId("praseodymium_doped_zblan_glass"))
                .ingot()
                .color(0xC5C88D)
                .iconSet(BRIGHT)
                .flags(NO_SMASHING, NO_WORKING, DISABLE_DECOMPOSITION, GENERATE_PLATE)
                .components(ZBLANGlass, 1, Praseodymium, 1)
                .build()
                .setFormula("(ZrF4)5(BaF2)2(LaF3)(AlF3)(NaF)2Pr", true);
        //  24141 Silicon Tetrachloride
        SiliconTetrachloride = new Material.Builder(getMaterialsId(), gregtechId("silicon_tetrachloride"))
                .fluid()
                .color(0x5B5B7A)
                .flags(DISABLE_DECOMPOSITION)
                .components(Silicon, 1, Chlorine, 4)
                .build();
        //  24142 Cadmium Sulfide
        CadmiumSulfide = new Material.Builder(getMaterialsId(), gregtechId("cadmium_sulfide"))
                .dust()
                .color(0xC8C43C)
                .flags(DECOMPOSITION_BY_ELECTROLYZING, GENERATE_PLATE)
                .iconSet(METALLIC)
                .components(Cadmium, 1, Sulfur, 1)
                .build();
        //  24143 Silicon Carbide
        SiliconCarbide = new Material.Builder(getMaterialsId(), gregtechId("silicon_carbide"))
                .dust()
                .fluid()
                .color(0x4D4D4D)
                .iconSet(METALLIC)
                .flags(GENERATE_FINE_WIRE)
                .components(Silicon, 1, Carbon, 1)
                .blast(b -> b.temp(2500, BlastProperty.GasTier.HIGH).blastStats(VA[UV]))
                .cableProperties(V[UHV], 6, 8)
                .build();
        //  24144 Chromium Germanium Telluride
        ChromiumGermaniumTelluride = new Material.Builder(getMaterialsId(), gregtechId("chromium_germanium_telluride"))
                .ingot()
                .fluid()
                .color(0x8F103E)
                .iconSet(METALLIC)
                .flags(GENERATE_ROD, GENERATE_LONG_ROD)
                .components(Chrome, 1, Germanium, 1, Tellurium, 3)
                .blast(2900, BlastProperty.GasTier.HIGHER)
                .build();
        //  24145 Magnetic Chromium Germanium Telluride
        ChromiumGermaniumTellurideMagnetic = new Material.Builder(getMaterialsId(), gregtechId("magnetic_chromium_germanium_telluride"))
                .ingot()
                .color(0x8F103E)
                .iconSet(MAGNETIC)
                .flags(GENERATE_ROD, GENERATE_LONG_ROD, IS_MAGNETIC)
                .components(ChromiumGermaniumTelluride, 1)
                .ingotSmeltInto(ChromiumGermaniumTelluride)
                .arcSmeltInto(ChromiumGermaniumTelluride)
                .macerateInto(ChromiumGermaniumTelluride)
                .build();
        ChromiumGermaniumTelluride.getProperty(PropertyKey.INGOT).setMagneticMaterial(ChromiumGermaniumTellurideMagnetic);
        //  24146 Lithium Fluoride
        LithiumFluoride = new Material.Builder(getMaterialsId(), gregtechId("lithium_fluoride"))
                .dust()
                .color(0x9BAFDB)
                .iconSet(ROUGH)
                .components(Lithium, 1, Fluorine, 1)
                .build();
        //  24147 Barium Carbonate
        BariumCarbonate = new Material.Builder(getMaterialsId(), gregtechId("barium_carbonate"))
                .dust()
                .color(0x425A73)
                .iconSet(ROUGH)
                .components(Barium, 1, Carbon, 1, Oxygen, 3)
                .build();
        //  24148 Carbon Disulfide
        CarbonDisulfide = new Material.Builder(getMaterialsId(), gregtechId("carbon_disulfide"))
                .fluid()
                .color(0x1F80C8)
                .components(Carbon, 1, Sulfur, 2)
                .build();
        //  24149 Sodium Thiosulfate
        SodiumThiosulfate = new Material.Builder(getMaterialsId(), gregtechId("sodium_thiosulfate"))
                .dust()
                .color(0x1436A7)
                .iconSet(ROUGH)
                .components(Sodium, 2, Sulfur, 2, Oxygen, 3)
                .build();
        //  24150 Cadmium Selenide
        CadmiumSelenide = new Material.Builder(getMaterialsId(), gregtechId("cadmium_selenide"))
                .dust()
                .color(0x983034)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .iconSet(METALLIC)
                .components(Cadmium, 1, Selenium, 1)
                .build();
        //  24151 Thallium Copper Chloride Antiferromagnetic
        ThalliumCopperChloride = new Material.Builder(getMaterialsId(), gregtechId("thallium_copper_chloride"))
                .ingot()
                .fluid()
                .color(0x3C5CB5)
                .iconSet(MAGNETIC)
                .flags(GENERATE_FINE_WIRE)
                .components(Thallium, 1, Copper, 1, Chlorine, 3)
                .build();
        //  24152 Plutonium Trihydride
        PlutoniumTrihydride = new Material.Builder(getMaterialsId(), gregtechId("plutonium_trihydride"))
                .dust()
                .color(0x140002)
                .iconSet(SHINY)
                .flags(DISABLE_DECOMPOSITION)
                .components(Plutonium239, 1, Hydrogen, 3)
                .build()
                .setFormula("PuH3", true);
        //  24153 Plutonium Phosphide
        PlutoniumPhosphide = new Material.Builder(getMaterialsId(), gregtechId("plutonium_phosphide"))
                .ingot()
                .color(0x1F0104)
                .iconSet(MAGNETIC)
                .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_LONG_ROD)
                .components(Plutonium239, 1, Phosphorus, 1)
                .build()
                .setFormula("PuP", true);
        //  24154 Neptunium Aluminide
        NeptuniumAluminide = new Material.Builder(getMaterialsId(), gregtechId("neptunium_aluminide"))
                .ingot()
                .fluid()
                .color(0x5E228F)
                .iconSet(MAGNETIC)
                .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_LONG_ROD)
                .components(Neptunium, 1, Aluminium, 3)
                .blast(b -> b.temp(1568, BlastProperty.GasTier.HIGHER).blastStats(VA[ZPM]))
                .build()
                .setFormula("NpAl3", true);
        //  24155 Bismuth Trioxide
        BismuthTrioxide = new Material.Builder(getMaterialsId(), gregtechId("bismuth_trioxide"))
                .dust()
                .color(0xF5EF42)
                .iconSet(FINE)
                .components(Bismuth, 2, Oxygen, 3)
                .build();
        //  24156 Ferric Oxide
        FerricOxide = new Material.Builder(getMaterialsId(), gregtechId("ferric_oxide"))
                .dust()
                .color(0x915A5A)
                .iconSet(ROUGH)
                .components(Iron, 2, Oxygen, 3)
                .build();
        //  24157 Bismuth Ferrite
        BismuthFerrite = new Material.Builder(getMaterialsId(), gregtechId("bismuth_ferrite"))
                .gem()
                .color(0x43634B)
                .iconSet(MAGNETIC)
                .flags(CRYSTALLIZABLE, GENERATE_PLATE)
                .components(BismuthTrioxide, 2, FerricOxide, 2)
                .build()
                .setFormula("BiFeO3", true);
        //  24158 Bismuth Chalcogenide
        BismuthChalcogenide = new Material.Builder(getMaterialsId(), gregtechId("bismuth_chalcogenide"))
                .ingot()
                .color(0x91994D)
                .iconSet(SHINY)
                .flags(GENERATE_PLATE, GENERATE_FOIL, DECOMPOSITION_BY_ELECTROLYZING)
                .components(Bismuth, 1, Antimony, 1, Tellurium, 2, Sulfur, 1)
                .build();
        //  24159 Mercury Cadmium Telluride
        MercuryCadmiumTelluride = new Material.Builder(getMaterialsId(), gregtechId("mercury_cadmium_telluride"))
                .ingot()
                .fluid()
                .color(0x823C80)
                .iconSet(BRIGHT)
                .flags(GENERATE_PLATE, GENERATE_FOIL, GENERATE_FINE_WIRE)
                .components(Mercury, 2, Cadmium, 1, Tellurium, 2)
                .blast(b -> b.temp(2170, BlastProperty.GasTier.HIGHER).blastStats(VA[UHV]))
                .build();
        //  24160 Cubic Zirconia
        CubicZirconia = new Material.Builder(getMaterialsId(), gregtechId("cubic_zirconia"))
                .gem()
                .color(0xFFDFE2)
                .iconSet(DIAMOND)
                .flags(CRYSTALLIZABLE, DISABLE_DECOMPOSITION)
                .components(Zirconium, 1, Oxygen, 2)
                .build();
        //  24161 Bismuth Tellurite
        BismuthTellurite = new Material.Builder(getMaterialsId(), gregtechId("bismuth_tellurite"))
                .dust()
                .color(0x0E8933)
                .iconSet(DULL)
                .components(Bismuth, 2, Tellurium, 3)
                .build();
        //  24162 Prasiolite
        Prasiolite = new Material.Builder(getMaterialsId(), gregtechId("prasiolite"))
                .gem()
                .ore(1, 3, false)
                .addOreByproducts(SiliconDioxide)
                .color(0x9EB749)
                .iconSet(QUARTZ)
                .flags(CRYSTALLIZABLE, GENERATE_LENS)
                .components(SiliconDioxide, 5, Iron, 1)
                .build();
        //  24163 Magneto Resonatic
        MagnetoResonatic = new Material.Builder(getMaterialsId(), gregtechId("magneto_resonatic"))
                .gem()
                .color(0xFF97FF)
                .iconSet(MAGNETIC)
                .components(Prasiolite, 3, BismuthTellurite, 6, CubicZirconia, 1, SteelMagnetic, 1)
                .flags(GENERATE_LENS)
                .build();
        //  24164 Yttrium Trioxide
        YttriumTrioxide = new Material.Builder(getMaterialsId(), gregtechId("yttrium_trioxide"))
                .dust()
                .color(0x765320)
                .iconSet(DULL)
                .components(Yttrium, 2, Oxygen, 3)
                .build();
        //  24165 Heavy Taranium Fuel
        HeavyTaraniumFuel = new Material.Builder(getMaterialsId(), gregtechId("heavy_taranium_fuel"))
                .fluid()
                .color(0x141414)
                .flags(DISABLE_DECOMPOSITION)
                .components(Taranium, 1)
                .build();
        //  24166 Medium Taranium Fuel
        MediumTaraniumFuel = new Material.Builder(getMaterialsId(), gregtechId("medium_taranium_fuel"))
                .fluid()
                .color(0x181818)
                .flags(DISABLE_DECOMPOSITION)
                .components(Taranium, 1)
                .build();
        //  24167 Light Taraniumm Fuel
        LightTaraniumFuel = new Material.Builder(getMaterialsId(), gregtechId("light_taranium_fuel"))
                .fluid()
                .color(0x1C1C1C)
                .flags(DISABLE_DECOMPOSITION)
                .components(Taranium, 1)
                .build();
        //  24168 Heavy Enriched Taranium Fuel
        HeavyEnrichedTaraniumFuel = new Material.Builder(getMaterialsId(), gregtechId("heavy_enriched_taranium_fuel"))
                .fluid()
                .color(0x0F1414)
                .flags(DISABLE_DECOMPOSITION)
                .components(Taranium, 1)
                .build();
        //  24169 Medium Enriched Taranium Fuel
        MediumEnrichedTaraniumFuel = new Material.Builder(getMaterialsId(), gregtechId("medium_enriched_taranium_fuel"))
                .fluid()
                .color(0x0F1818)
                .flags(DISABLE_DECOMPOSITION)
                .components(Taranium, 1)
                .build();
        //  24170 Light Enriched Taranium Fuel
        LightEnrichedTaraniumFuel = new Material.Builder(getMaterialsId(), gregtechId("light_enriched_taranium_fuel"))
                .fluid()
                .color(0x0F1C1C)
                .flags(DISABLE_DECOMPOSITION)
                .components(Taranium, 1)
                .build();
        //  24171 Adamantite
        Adamantite = new Material.Builder(getMaterialsId(), gregtechId("adamantite"))
                .dust()
                .color(0xC83C3C)
                .iconSet(ROUGH)
                .components(Adamantium, 3, Oxygen, 4)
                .build();
        //  24172 Unstable Adamantium
        AdamantiumUnstable = new Material.Builder(getMaterialsId(), gregtechId("adamantium_unstable"))
                .fluid()
                .color(0xFF763C)
                .flags(DISABLE_DECOMPOSITION)
                .components(Adamantium, 1)
                .build();
        //  24173 Energized Orichalcum
        OrichalcumEnergized = new Material.Builder(getMaterialsId(), gregtechId("orichalcum_energized"))
                .dust()
                .color(0xF4FC0C)
                .iconSet(BRIGHT)
                .flags(DISABLE_DECOMPOSITION)
                .components(Orichalcum, 1)
                .build();
        //  24174 Enriched Adamantium
        AdamantiumEnriched = new Material.Builder(getMaterialsId(), gregtechId("adamantium_enriched"))
                .dust()
                .color(0x64B4FF)
                .iconSet(ROUGH)
                .flags(DISABLE_DECOMPOSITION)
                .components(Vibranium, 1, RareEarth, 1)
                .build();
        //  24175 Deep Iron
        DeepIron = new Material.Builder(getMaterialsId(), gregtechId("deep_iron"))
                .dust()
                .color(0x968C8C)
                .iconSet(METALLIC)
                .flags(DISABLE_DECOMPOSITION)
                .components(Iron, 2, Trinium, 1, Indium, 1)
                .build();
        //  24176 Unstable Vibranium
        VibraniumUnstable = new Material.Builder(getMaterialsId(), gregtechId("vibranium_unstable"))
                .fluid()
                .color(0xFF7832)
                .flags(DISABLE_DECOMPOSITION)
                .components(Vibranium, 1)
                .build();
        //  24177 Lanthanum Oxide
        LanthanumOxide = new Material.Builder(getMaterialsId(), gregtechId("lanthanum_oxide"))
                .dust()
                .color(0x5F7777)
                .iconSet(SHINY)
                .components(Lanthanum, 2, Oxygen, 3)
                .build();
        //  24178 Praseodymium Oxide
        PraseodymiumOxide = new Material.Builder(getMaterialsId(), gregtechId("praseodymium_oxide"))
                .dust()
                .color(0xD0D0D0)
                .iconSet(METALLIC)
                .components(Praseodymium, 2, Oxygen, 3)
                .build();
        //  24179 Neodymium Oxide
        NeodymiumOxide = new Material.Builder(getMaterialsId(), gregtechId("neodymium_oxide"))
                .dust()
                .color(0x868686)
                .components(Neodymium, 2, Oxygen, 3)
                .build();
        //  24180 Cerium Oxide
        CeriumOxide = new Material.Builder(getMaterialsId(), gregtechId("cerium_oxide"))
                .dust()
                .color(0x10937F)
                .iconSet(METALLIC)
                .components(Cerium, 1, Oxygen, 2)
                .build();
        //  24181 Scandium Oxide
        ScandiumOxide = new Material.Builder(getMaterialsId(), gregtechId("scandium_oxide"))
                .dust()
                .color(0x43964F)
                .iconSet(METALLIC)
                .components(Scandium, 2, Oxygen, 3)
                .build();
        //  24182 Europium Oxide
        EuropiumOxide = new Material.Builder(getMaterialsId(), gregtechId("europium_oxide"))
                .dust()
                .color(0x20AAAA)
                .iconSet(SHINY)
                .components(Europium, 2, Oxygen, 3)
                .build();
        //  24183 Gadolinium Oxide
        GadoliniumOxide = new Material.Builder(getMaterialsId(), gregtechId("gadolinium_oxide"))
                .dust()
                .color(0xEEEEFF)
                .iconSet(METALLIC)
                .components(Gadolinium, 2, Oxygen, 3)
                .build();
        //  24184 Samarium Oxide
        SamariumOxide = new Material.Builder(getMaterialsId(), gregtechId("samarium_oxide"))
                .dust()
                .color(0xFFFFDD)
                .components(Samarium, 2, Oxygen, 3)
                .build();
        //  24185 Yttrium Oxide
        YttriumOxide = new Material.Builder(getMaterialsId(), gregtechId("yttrium_oxide"))
                .dust()
                .color(0x78544E)
                .iconSet(SHINY)
                .components(Yttrium, 2, Oxygen, 3)
                .build();
        //  24186 Terbium Oxide
        TerbiumOxide = new Material.Builder(getMaterialsId(), gregtechId("terbium_oxide"))
                .dust()
                .color(0xA264A2)
                .iconSet(METALLIC)
                .components(Terbium, 2, Oxygen, 3)
                .build();
        //  24187 Dysprosium Oxide
        DysprosiumOxide = new Material.Builder(getMaterialsId(), gregtechId("dysprosium_oxide"))
                .dust()
                .color(0xD273D2)
                .iconSet(METALLIC)
                .components(Dysprosium, 2, Oxygen, 3)
                .build();
        //  24188 Holmium Oxide
        HolmiumOxide = new Material.Builder(getMaterialsId(), gregtechId("holmium_oxide"))
                .dust()
                .color(0xAF7F2A)
                .iconSet(SHINY)
                .components(Holmium, 2, Oxygen, 3)
                .build();
        //  24189 Erbium Oxide
        ErbiumOxide = new Material.Builder(getMaterialsId(), gregtechId("erbium_oxide"))
                .dust()
                .color(0xE07A32)
                .iconSet(METALLIC)
                .components(Erbium, 2, Oxygen, 3)
                .build();
        //  24190 Thulium Oxide
        ThuliumOxide = new Material.Builder(getMaterialsId(), gregtechId("thulium_oxide"))
                .dust()
                .color(0x3B9E8B)
                .components(Thulium, 2, Oxygen, 3)
                .build();
        //  24191 Ytterbium Oxide
        YtterbiumOxide = new Material.Builder(getMaterialsId(), gregtechId("ytterbium_oxide"))
                .dust()
                .color(0xA9A9A9)
                .components(Ytterbium, 2, Oxygen, 3)
                .build();
        //  24192 Lutetium Oxide
        LutetiumOxide = new Material.Builder(getMaterialsId(), gregtechId("lutetium_oxide"))
                .dust()
                .color(0x11BBFF)
                .iconSet(METALLIC)
                .components(Lutetium, 2, Oxygen, 3)
                .build();
        //  24193 Manganese Sulfate
        ManganeseSulfate = new Material.Builder(getMaterialsId(), gregtechId("manganese_sulfate"))
                .dust()
                .color(0xF0F895)
                .iconSet(ROUGH)
                .components(Manganese, 1, Sulfur, 1, Oxygen, 4)
                .build();
        //  24194 Potassium Sulfate
        PotassiumSulfate = new Material.Builder(getMaterialsId(), gregtechId("potassium_sulfate"))
                .dust()
                .color(0xF4FBB0)
                .iconSet(DULL)
                .components(Potassium, 2, Sulfur, 1, Oxygen, 4)
                .build();
        //  24195 Ammonium Cyanate
        AmmoniumCyanate = new Material.Builder(getMaterialsId(), gregtechId("ammonium_cyanate"))
                .fluid()
                .color(0x3a5dcf)
                .components(Hydrogen, 4, Nitrogen, 2, Carbon, 1, Oxygen, 1)
                .build()
                .setFormula("NH4CNO", true);
        //  24196 Carbamide
        Carbamide = new Material.Builder(getMaterialsId(), gregtechId("carbamide"))
                .dust()
                .color(0x16EF57)
                .iconSet(ROUGH)
                .components(Carbon, 1, Hydrogen, 4, Nitrogen, 2, Oxygen, 1)
                .build();
        //  24197 Neodymium-Doped Yttrium Oxide
        NeodymiumDopedYttriumOxide = new Material.Builder(getMaterialsId(), gregtechId("neodymium_doped_yttrium_oxide"))
                .dust()
                .color(0x5AD55F)
                .iconSet(DULL)
                .build()
                .setFormula("Nd:Y?", false);
        //  24198 Alumina Solution
        AluminaSolution = new Material.Builder(getMaterialsId(), gregtechId("alumina_solution"))
                .fluid()
                .color(0x6C4DC1)
                .build()
                .setFormula("(Al2O3)(CH2Cl2)(C12H27N)2", true);
        //  24199 Crude Alumina Solution
        CrudeAluminaSolution = new Material.Builder(getMaterialsId(), gregtechId("crude_alumina_solution"))
                .fluid()
                .color(0x8974C1)
                .build()
                .setFormula("(Al(NO3)3)2(CH2Cl2)(C12H27N)", true);
        //  24200 Carbon Tetrachloride
        CarbonTetrachloride = new Material.Builder(getMaterialsId(), gregtechId("carbon_tetrachloride"))
                .fluid()
                .color(0x2d8020)
                .components(Carbon, 1, Chlorine, 4)
                .build();
        //  24201 Aluminium Nitrate
        AluminiumNitrate = new Material.Builder(getMaterialsId(), gregtechId("aluminium_nitrate"))
                .dust()
                .color(0x3AB3AA)
                .iconSet(SHINY)
                .components(Aluminium, 1, Nitrogen, 3, Oxygen, 9)
                .build()
                .setFormula("Al(NO3)3", true);
        //  24202 Unprocessed Nd:YAG Solution
        UnprocessedNdYAGSolution = new Material.Builder(getMaterialsId(), gregtechId("unprocessed_nd_yag_solution"))
                .fluid()
                .color(0x6f20af)
                .iconSet(DULL)
                .build()
                .setFormula("Nd:YAG", false);
        //  24203 Nd:YAG
        NdYAG = new Material.Builder(getMaterialsId(), gregtechId("nd_yag"))
                .gem()
                .color(0xD99DE4)
                .iconSet(GEM_VERTICAL)
                .flags(CRYSTALLIZABLE, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_LENS)
                .components(YttriumOxide, 2, NeodymiumOxide, 1, Alumina, 5)
                .build()
                .setFormula("NdY2Al5O12", true);
        //  24204 Au-Pd-C Catalyst
        AuPdCCatalyst = new Material.Builder(getMaterialsId(), gregtechId("au_pd_c_catalyst"))
                .dust()
                .color(0xB7B305)
                .iconSet(SHINY)
                .components(Gold, 1, PalladiumOnCarbon, 1)
                .build();
        //  24205 Sodium Oxide
        SodiumOxide = new Material.Builder(getMaterialsId(), gregtechId("sodium_oxide"))
                .dust()
                .color(0x2C96FC)
                .iconSet(BRIGHT)
                .components(Sodium, 2, Oxygen, 1)
                .build();
        //  24206 Sodium Tungstate
        SodiumTungstate = new Material.Builder(getMaterialsId(), gregtechId("sodium_tungstate"))
                .fluid()
                .color(0x595E54)
                .components(Sodium, 1, Tungsten, 1, Oxygen, 4)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24207 Sodium Phosphotungstate
        SodiumPhosphotungstate = new Material.Builder(getMaterialsId(), gregtechId("sodium_phosphotungstate"))
                .dust()
                .color(0x4D3635)
                .components(Oxygen, 40, Tungsten, 12, Sodium, 3, Phosphorus, 1)
                .flags(DISABLE_DECOMPOSITION)
                .build()
                .setFormula("(WO3)12Na3PO4", true);
        //  24208 Sodium Molybdate
        SodiumMolybdate = new Material.Builder(getMaterialsId(), gregtechId("sodium_molybdate"))
                .dust()
                .color(0xCCCC99)
                .iconSet(ROUGH)
                .components(Sodium, 2, Molybdenum, 1, Oxygen, 4)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24209 Sodium Phosphomolybdate
        SodiumPhosphomolybdate = new Material.Builder(getMaterialsId(), gregtechId("sodium_phosphomolybdate"))
                .dust()
                .color(0xF3E0A8)
                .iconSet(BRIGHT)
                .components(Oxygen, 40, Molybdenum, 12, Sodium, 3, Phosphorus, 1)
                .flags(DISABLE_DECOMPOSITION)
                .build()
                .setFormula("(MoO3)12Na3PO4", true);
        //  24210 Sodium Acetate
        SodiumAcetate = new Material.Builder(getMaterialsId(), gregtechId("sodium_acetate"))
                .fluid()
                .color(0xC5D624)
                .components(SodiumHydroxide, 1, Ethenone, 1)
                .build()
                .setFormula("C2H3NaO2", true);
        //  24211 Neutron Star Core Material
        NeutronStarCoreMaterial = new Material.Builder(getMaterialsId(), gregtechId("neutron_star_core_material"))
                .ingot()
                .liquid(new FluidBuilder().temperature(2147483647))
                .color(0x70ecff)
                .iconSet(BRIGHT)
                .flags(NO_SMASHING, NO_SMELTING, GENERATE_PLATE, GENERATE_CURVED_PLATE, GENERATE_ROTOR, GENERATE_FRAME, GENERATE_DOUBLE_PLATE)
                .build();
        //  24212 Magneto Hydrodynamically Constrained Star Matter
        MagnetoHydrodynamicallyConstrainedStarMatter = new Material.Builder(getMaterialsId(), gregtechId("magneto_hydrodynamically_constrained_star_matter"))
                .ingot()
                .liquid(new FluidBuilder().temperature(600000000))
                .iconSet(CUSTOM_MHCSM)
                .flags(NO_SMELTING, GENERATE_PLATE, GENERATE_DOUBLE_PLATE, GENERATE_ROD, GENERATE_LONG_ROD, GENERATE_RING, GENERATE_ROUND, GENERATE_BOLT_SCREW, GENERATE_FRAME, GENERATE_GEAR, GENERATE_SMALL_GEAR)
                .build();
        //  24213 White Dwarf Matter
        WhiteDwarfMatter = new Material.Builder(getMaterialsId(), gregtechId("white_dwarf_matter"))
                .ingot()
                .liquid(new FluidBuilder().temperature(288000000))
                .iconSet(MAGNETIC)
                .flags(GENERATE_ROD, GENERATE_LONG_ROD)
                .build();
        //  24214 BlackDwarfMatter
        BlackDwarfMatter = new Material.Builder(getMaterialsId(), gregtechId("black_dwarf_matter"))
                .ingot()
                .liquid(new FluidBuilder().temperature(266000000))
                .color(0x000000)
                .iconSet(BRIGHT)
                .cableProperties(V[UIV], 144, 72, false)
                .build();
        //  24215 Raw Star Matter
        RawStarMatter = new Material.Builder(getMaterialsId(), gregtechId("raw_star_matter"))
                .liquid(new FluidBuilder().temperature(600000000))
                .build();
        //  24216 Dimensionally Transcendent Residue
        DimensionallyTranscendentResidue = new Material.Builder(getMaterialsId(), gregtechId("dimensionally_transcendent_residue"))
                .liquid(new FluidBuilder().temperature(999999999))
                .build();
        //  24217 Heavy Lepton Mixture
        HeavyLeptonMixture = new Material.Builder(getMaterialsId(), gregtechId("heavy_lepton_mixture"))
                .liquid(new FluidBuilder().temperature(524288))
                .build()
                .setFormula(TextFormatting.OBFUSCATED  + "a" + TextFormatting.RESET + "§e(t2)u" + TextFormatting.OBFUSCATED  + "a", true);
        //  24218 Heavy Quarks
        HeavyQuarks = new Material.Builder(getMaterialsId(), gregtechId("heavy_quarks"))
                .liquid(new FluidBuilder().temperature(131072))
                .build()
                .setFormula(TextFormatting.OBFUSCATED  + "a"  + TextFormatting.RESET + "§e(u2)ds" + TextFormatting.OBFUSCATED  + "a" , true);
        //  24219 Gluons
        Gluons = new Material.Builder(getMaterialsId(), gregtechId("gluons"))
                .liquid(new FluidBuilder().temperature(2097152))
                .build()
                .setFormula(TextFormatting.OBFUSCATED  + "a" + TextFormatting.RESET + "§eg" + TextFormatting.OBFUSCATED  + "a", false);
        //  24220 Instantons
        Instantons = new Material.Builder(getMaterialsId(), gregtechId("instantons"))
                .liquid(new FluidBuilder().temperature(8388608))
                .build()
                .setFormula(TextFormatting.OBFUSCATED  + "a" + TextFormatting.RESET + "§ei" + TextFormatting.OBFUSCATED  + "a", false);
        //  24221 Temporal Fluid
        TemporalFluid = new Material.Builder(getMaterialsId(), gregtechId("temporal_fluid"))
                .liquid(new FluidBuilder().temperature(134217728))
                .build()
                .setFormula(TextFormatting.OBFUSCATED  + "a"  + TextFormatting.RESET + "§et" + TextFormatting.OBFUSCATED  + "a", false);
        //  24222 Higgs Bosons
        HiggsBosons = new Material.Builder(getMaterialsId(), gregtechId("higgs_bosons"))
                .liquid(new FluidBuilder().temperature(1))
                .build()
                .setFormula(TextFormatting.OBFUSCATED  + "a" + TextFormatting.RESET + "§eh" + TextFormatting.OBFUSCATED + "a", false);
        //  24223 Cosmic Computing Mixture
        CosmicComputingMixture = new Material.Builder(getMaterialsId(), gregtechId("cosmic_computing_mixture"))
                .liquid(new FluidBuilder().temperature(536870912))
                .components(HeavyLeptonMixture, 32, HeavyQuarks, 8, Gluons, 8, Instantons, 4, TemporalFluid, 4, HiggsBosons, 4)
                .flags(DISABLE_DECOMPOSITION)
                .build()
                .setFormula(TextFormatting.OBFUSCATED + "aaaaaa", false);
        //  24224 Silica Gel
        SilicaGel = new Material.Builder(getMaterialsId(), gregtechId("silica_gel"))
                .dust()
                .color(0x9695FD)
                .iconSet(SHINY)
                .components(Silicon, 1, Oxygen, 2)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24225 Silica Gel Base
        SilicaGelBase = new Material.Builder(getMaterialsId(), gregtechId("silica_gel_base"))
                .fluid()
                .color(0x9695FD)
                .iconSet(ROUGH)
                .components(SiliconDioxide, 1, HydrochloricAcid, 1, SodiumHydroxide, 1, Water, 1)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24226 Nitronium Tetrafluoroborate
        NitroniumTetrafluoroborate = new Material.Builder(getMaterialsId(), gregtechId("nitronium_tetrafluoroborate"))
                .dust()
                .color(0x787449)
                .iconSet(DULL)
                .components(Sodium, 1, Oxygen, 2, Boron, 1, Fluorine, 4)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24227 Nitrosonium Tetrafluoroborate
        NitrosoniumTetrafluoroborate = new Material.Builder(getMaterialsId(), gregtechId("nitrosonium_tetrafluoroborate"))
                .dust()
                .color(0xA32A8C)
                .iconSet(ROUGH)
                .components(Sodium, 1, Oxygen, 1, Boron, 1, Fluorine, 4)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24228 Tetrafluoroboric Acid
        TetrafluoroboricAcid = new Material.Builder(getMaterialsId(), gregtechId("tetrafluoroboric_acid"))
                .fluid()
                .color(0x83A731)
                .components(Hydrogen, 1, Boron, 1, Fluorine, 4)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24229 Nitrogen Monoxide
        NitrogenMonoxide = new Material.Builder(getMaterialsId(), gregtechId("nitrogen_monoxide"))
                .fluid()
                .color(0x98BCDA)
                .components(Nitrogen, 1, Oxygen, 1)
                .build();
        //  24230 Hydroxylammonium Sulfate
        HydroxylammoniumSulfate = new Material.Builder(getMaterialsId(), gregtechId("hydroxylammonium_sulfate"))
                .dust()
                .color(0x999933)
                .iconSet(DULL)
                .components(Nitrogen, 2, Hydrogen, 8, Oxygen, 6, Sulfur, 1)
                .flags(DISABLE_DECOMPOSITION)
                .build()
                .setFormula("(NH3OH)2SO4", true);
        //  24231 Potassium Hydroxylaminedisulfonate
        PotassiumHydroxylaminedisulfonate = new Material.Builder(getMaterialsId(), gregtechId("potassium_hydroxylaminedisulfonate"))
                .dust()
                .color(0x627D25)
                .iconSet(ROUGH)
                .components(Potassium, 2, Nitrogen, 1, Hydrogen, 1, Sulfur, 2, Oxygen, 7)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24232 Potassium Bisulfite
        PotassiumBisulfite = new Material.Builder(getMaterialsId(), gregtechId("potassium_bisulfite"))
                .dust()
                .color(344314)
                .iconSet(DULL)
                .components(Potassium, 1, Hydrogen, 1, Sulfur, 1, Oxygen, 3)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24233 Potassium Carbonate
        PotassiumCarbonate = new Material.Builder(getMaterialsId(), gregtechId("potassium_carbonate"))
                .dust()
                .color(0x7C89D9)
                .iconSet(ROUGH)
                .components(Potassium, 2, Carbon, 1, Oxygen, 3)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24234 Nitrous Acid
        NitrousAcid = new Material.Builder(getMaterialsId(), gregtechId("nitrous_acid"))
                .liquid(new FluidBuilder().attributes(ACID))
                .color(0x7D82A3)
                .components(Hydrogen, 1, Nitrogen, 1, Oxygen, 2)
                .build();
        //  24235 Potassium Nitrite
        PotassiumNitrite = new Material.Builder(getMaterialsId(), gregtechId("potassium_nitrite"))
                .dust()
                .color(0xB9B9B9)
                .components(Potassium, 1, Nitrogen, 1, Oxygen, 2)
                .build();
        //  24236 Barium Dichloride
        BariumDichloride = new Material.Builder(getMaterialsId(), gregtechId("barium_dichloride"))
                .dust()
                .color(0xBF6700)
                .iconSet(BRIGHT)
                .components(Barium, 1, Chlorine, 2)
                .build();
        //  24237 Hydroxylamine Hydrochloride
        HydroxylamineHydrochloride = new Material.Builder(getMaterialsId(), gregtechId("hydroxylamine_hydrochloride"))
                .fluid()
                .color(0x893E28)
                .components(Hydrogen, 4, Oxygen, 1, Nitrogen, 1, Chlorine,1 )
                .build()
                .setFormula("HONH2HCl", true);
        //  24238 Barium Sulfate Suspension
        BariumSulfateSuspension = new Material.Builder(getMaterialsId(), gregtechId("barium_sulfate_suspension"))
                .fluid()
                .color(0x71560B)
                .components(Barium, 1, Sulfur, 1, Oxygen, 4, Water, 1)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24239 Ammonium Acetate
        AmmoniumAcetate = new Material.Builder(getMaterialsId(), gregtechId("ammonium_acetate"))
                .dust()
                .color(0x646882)
                .components(Carbon, 2, Hydrogen, 7, Oxygen, 2, Nitrogen, 1)
                .build()
                .setFormula("NH4CH3CO2", true);
        //  24240 Ammonium Carbonate
        AmmoniumCarbonate = new Material.Builder(getMaterialsId(), gregtechId("ammonium_carbonate"))
                .dust()
                .color(0x7C89D9)
                .components(Carbon, 1, Hydrogen, 8, Oxygen, 3, Nitrogen, 2)
                .build()
                .setFormula("(NH4)2CO3", true);
        //  24241 Free Electron Gas
        FreeElectronGas = new Material.Builder(getMaterialsId(), gregtechId("free_electron_gas"))
                .gas()
                .color(0x507BB3)
                .build()
                .setFormula(TextFormatting.OBFUSCATED  + "a" + TextFormatting.RESET + "§ee" + TextFormatting.OBFUSCATED + "a", false);
        //  24242 Quark Gluon Plasma
        QuarkGluonPlasma = new Material.Builder(getMaterialsId(), gregtechId("quark_gluon_plasma"))
                .liquid(new FluidBuilder().state(FluidState.PLASMA).temperature((int) (V[ZPM] + V[UHV])/2))
                .color(HeavyQuarks.getMaterialRGB() + Gluons.getMaterialRGB())
                .build()
                .setFormula(TextFormatting.OBFUSCATED  + "a" + TextFormatting.RESET + "§e(u2)d(c2)s(t2)bg" + TextFormatting.OBFUSCATED + "a", false);
        //  24243 Light Quarks
        LightQuarks = new Material.Builder(getMaterialsId(), gregtechId("light_quarks"))
                .liquid(new FluidBuilder().temperature((VA[ZPM] + VA[UHV])/2))
                .color(QuarkGluonPlasma.getMaterialRGB() - HeavyQuarks.getMaterialRGB())
                .build()
                .setFormula(TextFormatting.OBFUSCATED  + "a" + TextFormatting.RESET + "§e(c2)(t2)b" + TextFormatting.OBFUSCATED + "a", false);
        //  24244 Ferric Catalyst
        FerricCatalyst = new Material.Builder(getMaterialsId(), gregtechId("ferric_catalyst"))
                .dust()
                .color(FerricOxide.getMaterialRGB() + HydrogenPeroxide.getMaterialRGB())
                .components(FerricOxide, 1, HydrogenPeroxide, 1)
                .build();
        //  24245 Neutron
        Neutron = new Material.Builder(getMaterialsId(), gregtechId("neutron"))
                .plasma(new FluidBuilder().temperature((int) V[UXV]))
                .color(0xFCFCFC)
                .build()
                .setFormula(TextFormatting.OBFUSCATED  + "a" + TextFormatting.RESET + "n§e" + TextFormatting.OBFUSCATED + "a", false);
        //  24246 Helium-Neon Gas
        HeliumNeon = new Material.Builder(getMaterialsId(), gregtechId("helium_neon"))
                .liquid(new FluidBuilder().state(FluidState.GAS))
                .color(0xFF0080)
                .flags(DECOMPOSITION_BY_CENTRIFUGING)
                .components(Helium, 1, Neon, 1)
                .build();
        //  24247 Polonium Nitrate
        PoloniumNitrate = new Material.Builder(getMaterialsId(), gregtechId("polonium_nitrate"))
                .fluid()
                .color(Polonium.getMaterialRGB() + NitricAcid.getMaterialRGB())
                .components(Polonium, 1, Nitrogen, 4, Oxygen, 12)
                .flags(DISABLE_DECOMPOSITION)
                .build()
                .setFormula("Po(NO3)4", true);
        //  24248 Polonium Chloride
        PoloniumChloride = new Material.Builder(getMaterialsId(), gregtechId("polonium_chloride"))
                .dust()
                .color(Polonium.getMaterialRGB() + Chlorine.getMaterialRGB())
                .components(Polonium, 1, Chlorine, 2)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24249 Celestite
        Celestite = new Material.Builder(getMaterialsId(), gregtechId("celestite"))
                .gem()
                .color(0x4AE3E6)
                .iconSet(OPAL)
                .components(Strontium, 1, Sulfur, 1, Oxygen, 4)
                .flags(CRYSTALLIZABLE, DISABLE_DECOMPOSITION, GENERATE_LENS)
                .build();
        //  24250 Strontium Carbonate
        StrontiumCarbonate = new Material.Builder(getMaterialsId(), gregtechId("strontium_carbonate"))
                .dust()
                .color(0x1DAFD3)
                .iconSet(SAND)
                .components(Strontium, 1, Carbon, 1, Oxygen, 3)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24251 Strontium Oxide
        StrontiumOxide = new Material.Builder(getMaterialsId(), gregtechId("stronium_oxide"))
                .dust()
                .color(0x16839E)
                .iconSet(BRIGHT)
                .components(Strontium, 1, Oxygen, 1)
                .build();
        //  24252 Acidic Pyrochlore
        AcidicPyrochlore = new Material.Builder(getMaterialsId(), gregtechId("acidic_pyrochlore"))
                .dust()
                .color(Pyrochlore.getMaterialRGB() + SulfuricAcid.getMaterialRGB())
                .iconSet(SHINY)
                .components(Pyrochlore, 1, SulfuricAcid, 1)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24253 Thorium-Uranium Solution
        ThoriumUraniumSolution = new Material.Builder(getMaterialsId(), gregtechId("thorium_uranium_solution"))
                .fluid()
                .color(Thorium.getMaterialRGB() + Uranium235.getMaterialRGB())
                .iconSet(DULL)
                .build()
                .setFormula("?SO4", true);
        //  24254 Leaching Pyrochlore
        LeachingPyrochlore = new Material.Builder(getMaterialsId(), gregtechId("leaching_pyrochlore"))
                .dust()
                .color(0xE2502C)
                .iconSet(BRIGHT)
                .build()
                .setFormula("(Nb2O5)9Ta2O5?", true);
        //  24255 Barium-Strontium-Radium Solution
        BariumStrontiumRadiumSolution = new Material.Builder(getMaterialsId(), gregtechId("barium_strontium_radium_solution"))
                .fluid()
                .color(Barite.getMaterialRGB())
                .components(Barite, 1, Gypsum, 1, Celestite, 1, Radium, 1, Water, 4)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24256 Fluoroniobic Acid
        FluoroniobicAcid = new Material.Builder(getMaterialsId(), gregtechId("fluoroniobic_acid"))
                .liquid(new FluidBuilder().attributes(ACID))
                .color(Niobium.getMaterialRGB() + HydrofluoricAcid.getMaterialRGB())
                .components(Niobium, 1, Hydrogen, 1, Fluorine, 7)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24257 Oxypentafluoroniobate
        Oxypentafluoroniobate = new Material.Builder(getMaterialsId(), gregtechId("oxypentafluoroniobate"))
                .fluid()
                .color(0x17F742)
                .components(Hydrogen, 2, Niobium, 1, Oxygen, 1, Fluorine, 5)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24258 Heptafluorotantalate
        Heptafluorotantalate = new Material.Builder(getMaterialsId(), gregtechId("heptafluorotantalate"))
                .fluid()
                .color(0x16EB3F)
                .components(Hydrogen, 2, Tantalum, 1, Fluorine, 7)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24259 Potassium Fluoride
        PotassiumFluoride = new Material.Builder(getMaterialsId(), gregtechId("potassium_fluoride"))
                .dust()
                .color(Potassium.getMaterialRGB() + Fluorine.getMaterialRGB())
                .iconSet(ROUGH)
                .components(Potassium, 1, Fluorine, 1)
                .build();
        //  24260 Potassium Fluoniobate
        PotassiumFluoniobate = new Material.Builder(getMaterialsId(), gregtechId("potassium_fluoniobate"))
                .dust()
                .color(PotassiumFluoride.getMaterialRGB() + FluoroniobicAcid.getMaterialRGB())
                .iconSet(BRIGHT)
                .components(Potassium, 2, Niobium, 1, Fluorine, 7)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24261 Potassium Fluotantalate
        PotassiumFluotantalate = new Material.Builder(getMaterialsId(), gregtechId("potassium_fluotantalate"))
                .dust()
                .color(Tantalum.getMaterialRGB() + PotassiumFluoniobate.getMaterialRGB())
                .iconSet(BRIGHT)
                .components(Potassium, 2, Tantalum, 1, Fluorine, 7)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24262 Uranium Thorium Nitrate
        UraniumThoriumNitrate = new Material.Builder(getMaterialsId(), gregtechId("uranium_thorium_nitrate"))
                .dust()
                .color(Uranium238.getMaterialRGB() + Thorium.getMaterialRGB() + Nitrogen.getMaterialRGB())
                .iconSet(SHINY)
                .build()
                .setFormula("UO2(NO3)2Th(NO3)4", true);
        //  24263 Uranium Oxide Thorium Nitrate
        UraniumOxideThoriumNitrate = new Material.Builder(getMaterialsId(), gregtechId("uranium_oxide_thorium_nitrate"))
                .dust()
                .color(Uranium238.getMaterialRGB() + Oxygen.getMaterialRGB())
                .iconSet(SHINY)
                .build()
                .setFormula("UO2Th(NO3)4", true);
        //  24264 Thorium Nitrate Solution
        ThoriumNitrateSolution = new Material.Builder(getMaterialsId(), gregtechId("thorium_nitrate_solution"))
                .fluid()
                .color(Thorium.getMaterialRGB())
                .build()
                .setFormula("Th(NO3)4(H2O)", true);
        //  24265 Thorium Oxide
        ThoriumOxide = new Material.Builder(getMaterialsId(), gregtechId("thorium_oxide"))
                .dust()
                .color(Thorium.getMaterialRGB() + Oxygen.getMaterialRGB())
                .components(Thorium, 1, Oxygen, 1)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24266 Gold Copper Mixture
        GoldCopperMixture = new Material.Builder(getMaterialsId(), gregtechId("gold_copper_mixture"))
                .dust()
                .color(0xD2D242)
                .iconSet(SHINY)
                .components(Copper, 3, Gold, 1)
                .flags(DISABLE_DECOMPOSITION)
                .build()
                .setFormula("Cu3Au?", true);
        //  24267 Leaching Gold
        LeachingGold = new Material.Builder(getMaterialsId(), gregtechId("leaching_gold"))
                .dust()
                .color(0xA7650F)
                .iconSet(ROUGH)
                .components(Copper, 3, Gold, 1)
                .flags(DISABLE_DECOMPOSITION)
                .build()
                .setFormula("Cu3Au?", true);
        //  24268 Chloroauric Acid
        ChloroauricAcid = new Material.Builder(getMaterialsId(), gregtechId("chloroauric_acid"))
                .fluid()
                .color(LeachingGold.getMaterialRGB() + HydrochloricAcid.getMaterialRGB())
                .components(Hydrogen, 1, Gold, 1, Chlorine, 1)
                .flags(DISABLE_DECOMPOSITION)
                .build()
                .setFormula("HAuCl?", false);
        //  24269 Leaching Copper
        LeachingCopper = new Material.Builder(getMaterialsId(), gregtechId("leaching_copper"))
                .dust()
                .color(Copper.getMaterialRGB() + LeachingGold.getMaterialRGB())
                .iconSet(SHINY)
                .components(Copper, 3)
                .flags(DISABLE_DECOMPOSITION)
                .build()
                .setFormula("Cu3?", true);
        //  24270 Potassium Metabisulfite
        PotassiumMetabisulfite = new Material.Builder(getMaterialsId(), gregtechId("potassium_metabisulfite"))
                .dust()
                .color(Potassium.getMaterialRGB() + Sulfur.getMaterialRGB())
                .iconSet(SAND)
                .components(Potassium, 2, Sulfur, 2, Oxygen, 5)
                .build();
        //  24271 Platinum Metal
        PlatinumMetal = new Material.Builder(getMaterialsId(), gregtechId("platinum_metal"))
                .dust()
                .color(PlatinumRaw.getMaterialRGB())
                .iconSet(SAND)
                .components(Platinum, 1)
                .flags(DISABLE_DECOMPOSITION)
                .build()
                .setFormula("Pt?", false);
        //  24272 Platinum Slag
        PlatinumSlag = new Material.Builder(getMaterialsId(), gregtechId("platinum_slag"))
                .dust()
                .color(PlatinumRaw.getMaterialRGB())
                .iconSet(DULL)
                .components(Platinum, 1)
                .flags(DISABLE_DECOMPOSITION)
                .build()
                .setFormula("Pt?", false);
        //  24273 Palladium Metal
        PalladiumMetal = new Material.Builder(getMaterialsId(), gregtechId("palladium_metal"))
                .dust()
                .color(Palladium.getMaterialRGB())
                .iconSet(DULL)
                .components(Palladium, 1)
                .flags(DISABLE_DECOMPOSITION)
                .build()
                .setFormula("Pd?", false);
        //  24274 Concentrate Platinum
        ConcentratePlatinum = new Material.Builder(getMaterialsId(), gregtechId("concentrate_platinum"))
                .fluid()
                .color(Platinum.getMaterialRGB())
                .iconSet(DULL)
                .components(Platinum, 1)
                .flags(DISABLE_DECOMPOSITION)
                .build()
                .setFormula("Pt?", false);
        //  24275 Crude Platinum
        CrudePlatinum = new Material.Builder(getMaterialsId(), gregtechId("crude_platinum"))
                .dust()
                .color(PlatinumRaw.getMaterialRGB())
                .iconSet(SAND)
                .components(Platinum, 1, Chlorine, 2)
                .flags(DISABLE_DECOMPOSITION)
                .build()
                .setFormula("PtCl2?", true);
        //  24276 Palladium Rich Ammonia
        PalladiumRichAmmonia = new Material.Builder(getMaterialsId(), gregtechId("palladium_rich_ammonia"))
                .gas()
                .color(Palladium.getMaterialRGB() + Ammonia.getMaterialRGB())
                .components(Palladium, 1, Ammonia, 1)
                .flags(DISABLE_DECOMPOSITION)
                .build()
                .setFormula("Pd(NH3)?", true);
        //  24277 Iridium Dioxide
        IridiumDioxide = new Material.Builder(getMaterialsId(), gregtechId("iridium_dioxide"))
                .dust()
                .color(Iridium.getMaterialRGB() + Oxygen.getMaterialRGB())
                .iconSet(SAND)
                .components(Iridium, 1, Oxygen, 2)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24278 Acidic Iridium Solution
        AcidicIridiumSolution = new Material.Builder(getMaterialsId(), gregtechId("acidic_iridium_solution"))
                .fluid()
                .color(IridiumDioxide.getMaterialRGB() + HydrochloricAcid.getMaterialRGB())
                .components(IridiumDioxide, 2, HydrochloricAcid, 2)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24279 Osmium Tetrachloride
        OsmiumTetrachloride = new Material.Builder(getMaterialsId(), gregtechId("osmium_tetrachloride"))
                .dust()
                .color(0x29080A)
                .iconSet(METALLIC)
                .components(Osmium, 1, Chlorine, 4)
                .build();
        //  24280 Ruthenium Chloride
        RutheniumChloride = new Material.Builder(getMaterialsId(), gregtechId("ruthenium_chloride"))
                .dust()
                .color(0x605C6C)
                .iconSet(METALLIC)
                .flags(DISABLE_DECOMPOSITION)
                .components(Ruthenium, 1, Chlorine, 3)
                .build();
        //  24281 Sodium Peroxide
        SodiumPeroxide = new Material.Builder(getMaterialsId(), gregtechId("sodium_peroxide"))
                .dust()
                .color(0xECFF80)
                .iconSet(ROUGH)
                .components(Sodium, 2, Oxygen, 2)
                .build();
        //  24282 Rhodium Oxide
        RhodiumOxide = new Material.Builder(getMaterialsId(), gregtechId("rhodium_oxide"))
                .dust()
                .color(0xD93D16)
                .iconSet(METALLIC)
                .components(Rhodium, 2, Oxygen, 3)
                .build();
        //  24283 Platinum Group Sludge Solution
        PlatinumGroupSludgeSolution = new Material.Builder(getMaterialsId(), gregtechId("platinum_group_sludge_solution"))
                .fluid()
                .color(PlatinumGroupSludge.getMaterialRGB())
                .iconSet(DULL)
                .build();
        //  24284 Ammonium Hexachloro Platinum Group Sludge
        AmmoniumHexachloroPlatinumGroupSludge = new Material.Builder(getMaterialsId(), gregtechId("ammonium_hexachloro_platinum_group_sludge"))
                .fluid()
                .color(0xFEF0C2)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24285 Leaching Nickel
        LeachingNickel = new Material.Builder(getMaterialsId(), gregtechId("leaching_nickel"))
                .dust()
                .color(LeachingCopper.getMaterialRGB() + Nickel.getMaterialRGB())
                .iconSet(BRIGHT)
                .components(Nickel, 3)
                .flags(DISABLE_DECOMPOSITION)
                .build()
                .setFormula("Ni3?", true);
        //  24286 Gold Nickel Mixture
        GoldNickelMixture = new Material.Builder(getMaterialsId(), gregtechId("gold_nickel_mixture"))
                .dust()
                .color(GoldCopperMixture.getMaterialRGB() + Nickel.getMaterialRGB())
                .iconSet(SAND)
                .components(Nickel, 3, Gold, 1)
                .flags(DISABLE_DECOMPOSITION)
                .build()
                .setFormula("Ni3Au?", true);
        //  24287 Lanthanum Fullerene Mixture
        LanthanumFullereneMixture = new Material.Builder(getMaterialsId(), gregtechId("lanthanum_fullerene_mixture"))
                .dust()
                .color(0xD26D8E)
                .iconSet(BRIGHT)
                .components(Lanthanum, 2, GeodesicPolyarene, 2)
                .build();
        //  24288 Lanthanum Embedded Fullerene
        LanthanumEmbeddedFullerene = new Material.Builder(getMaterialsId(), gregtechId("lanthanum_embedded_fullerene"))
                .dust()
                .color(0x84FFAC)
                .iconSet(BRIGHT)
                .components(Lanthanum, 2, GeodesicPolyarene, 2)
                .build();
        //  24289 Lanthanum Fullerene Nanotube
        LanthanumFullereneNanotube = new Material.Builder(getMaterialsId(), gregtechId("lanthanum_fullerene_nanotube"))
                .ingot()
                .color(0xD24473)
                .iconSet(BRIGHT)
                .components(Lanthanum, 2, GeodesicPolyarene, 2, CarbonNanotube, 1)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24290 HRA Magnesium
        HRAMagnesium = new Material.Builder(getMaterialsId(), gregtechId("hra_magnesium"))
                .dust()
                .color(Magnesium.getMaterialRGB())
                .iconSet(SHINY)
                .components(Magnesium, 1)
                .build();
        //  24291 Cadium Bromide
        CadmiumBromide = new Material.Builder(getMaterialsId(), gregtechId("cadmium_bromide"))
                .dust()
                .color(0xFF1774)
                .iconSet(SHINY)
                .components(Cadmium, 1, Bromine, 2)
                .build();
        //  24292 Magnesium Bromide
        MagnesiumBromide = new Material.Builder(getMaterialsId(), gregtechId("magnesium_bromide"))
                .dust()
                .color(0x5F4C32)
                .iconSet(METALLIC)
                .components(Magnesium, 1, Bromine, 2)
                .build();
        //  24293 Oganesson Breeding Base
        OganessonBreedingBase = new Material.Builder(getMaterialsId(), gregtechId("oganesson_breeding_base"))
                .fluid()
                .color(0xA65A7F)
                .components(Oganesson, 1)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24294 Hot Oganesson
        HotOganesson = new Material.Builder(getMaterialsId(), gregtechId("hot_oganesson"))
                .liquid(new FluidBuilder().temperature(14118))
                .color(Oganesson.getMaterialRGB())
                .components(Oganesson, 1)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24295 Dragon Dust
        DragonDust = new Material.Builder(getMaterialsId(), gregtechId("dragon_dust"))
                .ore(1, 1, true)
                .addOreByproducts(Amethyst)
                .dust()
                .color(Draconium.getMaterialRGB())
                .iconSet(DULL)
                .build()
                .setFormula("Dc3Ac3Se4At4?", false);
        //  24296 Californium Nitrite
        CaliforniumNitrite = new Material.Builder(getMaterialsId(), gregtechId("californium_nitrite"))
                .dust()
                .color(0x914626)
                .iconSet(ROUGH)
                .components(Californium, 1, Nitrogen, 3, Oxygen, 6)
                .flags(DISABLE_DECOMPOSITION)
                .build()
                .setFormula("Cf(NO2)3", true);
        //  24297 Californium Dioxide
        CaliforniumDioxide = new Material.Builder(getMaterialsId(), gregtechId("californium_dioxide"))
                .dust()
                .color(0x912D01)
                .iconSet(DULL)
                .components(Californium, 1, Oxygen, 2)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24298 Californium Hexachloride
        CaliforniumHexachloride = new Material.Builder(getMaterialsId(), gregtechId("californium_hexachloride"))
                .fluid()
                .color(Californium.getMaterialRGB() + Chlorine.getMaterialRGB())
                .components(Californium, 2, Chlorine, 6)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24299 Californium Hexafluoride
        CaliforniumHexafluoride = new Material.Builder(getMaterialsId(), gregtechId("californium_hexafluoride"))
                .gas()
                .color(Californium.getMaterialRGB() + Fluorine.getMaterialRGB())
                .components(Californium, 2, Fluorine, 6)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24300 Californium-252 Hexafluoride
        Californium252Hexafluoride = new Material.Builder(getMaterialsId(), gregtechId("californium_252_hexafluoride"))
                .gas()
                .color(Californium252.getMaterialRGB() + Fluorine.getMaterialRGB())
                .components(Californium252, 2, Fluorine, 6)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24301 Steam Cracked Californium-252 Hexafluoride
        SteamCrackedCalifornium252Hexafluoride = new Material.Builder(getMaterialsId(), gregtechId("steam_cracked_californium_252_hexafluoride"))
                .gas()
                .color(Californium252Hexafluoride.getMaterialRGB() + Steam.getMaterialRGB())
                .components(Californium252, 2, Fluorine, 6)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24302 Californium-252 Dioxide
        Californium252Dioxide = new Material.Builder(getMaterialsId(), gregtechId("californium_252_dioxide"))
                .dust()
                .color(0x912D01)
                .iconSet(ROUGH)
                .components(Californium252, 1, Oxygen, 2)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24303 Actinium Draconium Hydroxides
        ActiniumDraconiumHydroxides = new Material.Builder(getMaterialsId(), gregtechId("actinium_draconium_hydroxides"))
                .dust()
                .color(0xB613BF)
                .iconSet(ROUGH)
                .components(Draconium, 3, Actinium, 2, Oxygen, 12, Hydrogen, 12)
                .flags(DISABLE_DECOMPOSITION)
                .build()
                .setFormula("Dc3Ac3(OH)12", true);
        //  24304 Actinium Nitrate
        ActiniumNitrate = new Material.Builder(getMaterialsId(), gregtechId("actinium_nitrate"))
                .dust()
                .color(Actinium.getMaterialRGB() + NitricAcid.getMaterialRGB())
                .iconSet(ROUGH)
                .components(Actinium, 1, Nitrogen, 3, Oxygen, 9)
                .flags(DISABLE_DECOMPOSITION)
                .build()
                .setFormula("Ac(NO3)3", true);
        //  24305 Radium Nitrate
        RadiumNitrate = new Material.Builder(getMaterialsId(), gregtechId("radium_nitrate"))
                .dust()
                .color(Radium.getMaterialRGB() + NitricAcid.getMaterialRGB())
                .iconSet(SHINY)
                .components(Radium, 1, Nitrogen, 2, Oxygen, 6)
                .flags(DISABLE_DECOMPOSITION)
                .build()
                .setFormula("Ra(NO3)2", true);
        //  24306 Caesium Carborane
        CaesiumCarborane = new Material.Builder(getMaterialsId(), gregtechId("caesium_carborane"))
                .dust()
                .color(Caesium.getMaterialRGB() + Carbon.getMaterialRGB())
                .iconSet(DULL)
                .components(Caesium, 1, Carbon, 1, Boron, 11, Hydrogen, 12)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24307 Silver Nitrate
        SilverNitrate = new Material.Builder(getMaterialsId(), gregtechId("silver_nitrate"))
                .dust()
                .color(Silver.getMaterialRGB() + NitricAcid.getMaterialRGB())
                .iconSet(SHINY)
                .components(Silver, 1, Nitrogen, 1, Oxygen, 3)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24308 Caesium Nitrate
        CaesiumNitrate = new Material.Builder(getMaterialsId(), gregtechId("caesium_nitrate"))
                .dust()
                .color(Caesium.getMaterialRGB() + NitricAcid.getMaterialRGB())
                .iconSet(ROUGH)
                .components(Caesium, 1, Nitrogen, 1, Oxygen, 3)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .build();
        //  24309 Silver Iodide
        SilverIodide = new Material.Builder(getMaterialsId(), gregtechId("silver_iodide"))
                .dust()
                .iconSet(SHINY)
                .color(Silver.getMaterialRGB() + Iodine.getMaterialRGB())
                .components(Silver, 1, Iodine, 1)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24310 Caesium Hydroxide
        CaesiumHydroxide = new Material.Builder(getMaterialsId(), gregtechId("caesium_hydroxide"))
                .dust()
                .color(Caesium.getMaterialRGB() + Hydrogen.getMaterialRGB() + Oxygen.getMaterialRGB())
                .components(Caesium, 1, Oxygen, 1, Hydrogen, 1)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .build();
        //  24311 Sodium Tetrafluoroborate
        SodiumTetrafluoroborate = new Material.Builder(getMaterialsId(), gregtechId("sodium_tetrafluoroborate"))
                .dust()
                .color(Sodium.getMaterialRGB() + BoronTrifluoride.getMaterialRGB())
                .iconSet(SAND)
                .components(Sodium, 1, Boron, 1, Fluorine, 4)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24312 Sodium Borohydride
        SodiumBorohydride = new Material.Builder(getMaterialsId(), gregtechId("sodium_borohydride"))
                .dust()
                .color(Sodium.getMaterialRGB() + Boron.getMaterialRGB())
                .iconSet(ROUGH)
                .components(Sodium, 1, Boron, 1, Hydrogen, 4)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24313 Sodium Ethoxide
        SodiumEthoxide = new Material.Builder(getMaterialsId(), gregtechId("sodium_ethoxide"))
                .dust()
                .color(Sodium.getMaterialRGB() + Ethanol.getMaterialRGB())
                .iconSet(DULL)
                .components(Carbon, 2, Hydrogen, 5, Oxygen, 1, Sodium, 1)
                .build();
        //  24314 Krypton Difluoride
        KryptonDifluoride = new Material.Builder(getMaterialsId(), gregtechId("krypton_difluoride"))
                .gas()
                .color(Krypton.getMaterialRGB() + Fluorine.getMaterialRGB())
                .components(Krypton, 1, Fluorine, 2)
                .build();
        //  24315 Draconium Tetrafluoride
        DraconiumTetrafluoride = new Material.Builder(getMaterialsId(), gregtechId("draconium_tetrafluoride"))
                .dust()
                .color(0xBA16A6)
                .iconSet(DULL)
                .components(Draconium, 1, Fluorine, 4)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24316 Actinium Oxalate
        ActiniumOxalate = new Material.Builder(getMaterialsId(), gregtechId("actinium_oxalate"))
                .dust()
                .color(0x7971BF)
                .iconSet(SHINY)
                .components(Actinium, 1, Carbon, 4, Oxygen, 8)
                .build()
                .setFormula("Ac(CO2)4", true);
        //  24317 Actinium Hydride
        ActiniumHydride = new Material.Builder(getMaterialsId(), gregtechId("actinium_hydride"))
                .dust()
                .color(0x86DAF0)
                .iconSet(BRIGHT)
                .components(Actinium, 1, Hydrogen, 3)
                .build();
        //  24318 Actinium Superhydride
        ActiniumSuperhydride = new Material.Builder(getMaterialsId(), gregtechId("actinium_superhydride"))
                .dust()
                .liquid(new FluidBuilder().state(FluidState.PLASMA))
                .color(0xCC3300)
                .iconSet(BRIGHT)
                .components(Actinium, 1, Hydrogen, 12)
                .build();
        //  24319 Francium Carbide
        FranciumCarbide = new Material.Builder(getMaterialsId(), gregtechId("francium_carbide"))
                .dust()
                .color(Francium.getMaterialRGB() + Carbon.getMaterialRGB())
                .iconSet(SHINY)
                .components(Francium, 2, Carbon, 2)
                .build();
        //  24320 Boron Francium Mixture
        BoronFranciumMixture = new Material.Builder(getMaterialsId(), gregtechId("boron_francium_mixture"))
                .dust()
                .color(Boron.getMaterialRGB() + FranciumCarbide.getMaterialRGB())
                .iconSet(BRIGHT)
                .components(FranciumCarbide, 2, CubicBoronNitride, 1, AmorphousBoronNitride, 1)
                .build();
        //  24321 Flerovium-Ytterbium Plasma
        FleroviumYtterbiumPlasma = new Material.Builder(getMaterialsId(), gregtechId("flerovium_ytterbium_plasma"))
                .liquid(new FluidBuilder().state(FluidState.PLASMA).temperature(300))
                .components(MetastableFlerovium, 1, Ytterbium178, 1)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24322 Solar-Grade Silicon
        SolarGradeSilicon = new Material.Builder(getMaterialsId(), gregtechId("solar_grade_silicon"))
                .ingot()
                .color(Silicon.getMaterialRGB())
                .iconSet(BRIGHT)
                .components(Silicon, 1)
                .build();
        //  24323 Dense Hydrazine Mixture Fuel
        DenseHydrazineMixtureFuel = new Material.Builder(getMaterialsId(), gregtechId("dense_hydrazine_mixture_fuel"))
                .fluid()
                .color(0x912565)
                .components(Dimethylhydrazine, 1, Methanol, 1)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24324 Highly Purified Coal Tar
        HighlyPurifiedCoalTar = new Material.Builder(getMaterialsId(), gregtechId("highly_purified_coal_tar"))
                .fluid()
                .color(0x7F811D)
                .components(CoalTar, 1)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24325 RP-1 Rocket Fuel
        RP1RocketFuel = new Material.Builder(getMaterialsId(), gregtechId("rp_1_rocket_fuel"))
                .fluid()
                .color(0xFB2A08)
                .components(HighlyPurifiedCoalTar, 1, Oxygen, 1)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24326 Methylhydrazine
        Methylhydrazine = new Material.Builder(getMaterialsId(), gregtechId("methylhydrazine"))
                .fluid()
                .color(0x321452)
                .components(Carbon, 1, Hydrogen, 6, Nitrogen, 2)
                .build();
        //  24327 Methylhydrazine Nitrate Rocket Fuel
        MethylhydrazineNitrateRocketFuel = new Material.Builder(getMaterialsId(), gregtechId("methylhydrazine_nitrate_rocket_fuel"))
                .fluid()
                .color(0x607186)
                .components(Methylhydrazine, 1, Tetranitromethane, 1)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24328 Lithium Niobate
        LithiumNiobate = new Material.Builder(getMaterialsId(), gregtechId("lithium_niobate"))
                .ingot()
                .color(0xD27700)
                .iconSet(SHINY)
                .components(Lithium, 1, Niobium, 1, Oxygen, 4)
                .blast(6700)
                .flags(DISABLE_DECOMPOSITION)
                .flags(GENERATE_PLATE, GENERATE_LENS)
                .build();
        //  24329 Niobium Pentachloride
        NiobiumPentachloride = new Material.Builder(getMaterialsId(), gregtechId("niobium_pentachloride"))
                .dust()
                .color(Niobium.getMaterialRGB() + Chlorine.getMaterialRGB())
                .iconSet(SHINY)
                .components(Niobium, 1, Chlorine, 5)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24330 High Purity Sodium Vanadate
        HighPuritySodiumVanadate = new Material.Builder(getMaterialsId(), gregtechId("high_purity_sodium_vanadate"))
                .dust()
                .color(0xE3E147)
                .iconSet(BRIGHT)
                .components(Sodium, 3, Vanadium, 1, Oxygen, 4)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24331 Lutetium Thulium Yttrium Chlorides Solution
        LutetiumThuliumYttriumChloridesSolution = new Material.Builder(getMaterialsId(), gregtechId("lutetium_thulium_yttrium_chlorides_solution"))
                .fluid()
                .color(Lutetium.getMaterialRGB() + Thulium.getMaterialRGB() + Yttrium.getMaterialRGB())
                .components(Lutetium, 2, Thulium, 2, Yttrium, 6, Chlorine, 30, Hydrogen, 30, Oxygen, 15)
                .flags(DISABLE_DECOMPOSITION)
                .build()
                .setFormula("(LuCl3)2(TmCl3)2(YCl3)6(H2O)15", true);
        //  24332 Lu-Tm-droped Yttrium Vanadate Deposition
        YttriumVanadateLuTmDeposition = new Material.Builder(getMaterialsId(), gregtechId("yttrium_vanadate_lu_tm_deposition"))
                .dust()
                .color(Yttrium.getMaterialRGB() + Vanadium.getMaterialRGB() + Lutetium.getMaterialRGB() + Thulium.getMaterialRGB())
                .iconSet(DULL)
                .build()
                .setFormula("Lu/TM:YVO?", false);
        //  24333 Lu-Tm-droped Yttrium Vanadate
        YttriumVanadateLuTm = new Material.Builder(getMaterialsId(), gregtechId("yttrium_vanadate_lu_tm"))
                .gem()
                .color(0x8C1B23)
                .iconSet(GEM_HORIZONTAL)
                .flags(DISABLE_DECOMPOSITION, GENERATE_LENS, CRYSTALLIZABLE)
                .components(Yttrium, 1, Vanadium, 1, Oxygen, 1, Lutetium, 1, Thulium, 1)
                .build()
                .setFormula("Lu/Tm:YVO", false);
        //  24334 Heavy Quark Enriched Mixture
        HeavyQuarkEnrichedMixture = new Material.Builder(getMaterialsId(), gregtechId("heavy_quark_enriched_mixture"))
                .fluid()
                .color(HeavyQuarks.getMaterialRGB() + LightQuarks.getMaterialRGB())
                .components(LightQuarks, 1, HeavyQuarks, 3)
                .flags(DECOMPOSITION_BY_CENTRIFUGING)
                .build()
                .setFormula(TextFormatting.OBFUSCATED  + "a"  + TextFormatting.RESET + "§e(u2)d(c2)s(t2)b" + TextFormatting.OBFUSCATED  + "a" , true);
        //  24335 Deuterium-Superheavy Mixture
        DeuteriumSuperHeavyMixture = new Material.Builder(getMaterialsId(), gregtechId("deuterium_superheavy_mixture"))
                .fluid()
                .color(0x7B9F8E)
                .components(Deuterium, 2, MetastableHassium, 1, MetastableFlerovium, 1, MetastableOganesson, 1)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24336 Heavy Quark Degenerate Matter
        HeavyQuarkDegenerateMatter = new Material.Builder(getMaterialsId(), gregtechId("heavy_quark_degenerate_matter"))
                .ingot()
                .fluid()
                .plasma()
                .color(0x5DBD3A)
                .iconSet(BRIGHT)
                .blast(b -> b.temp(12960, BlastProperty.GasTier.HIGHEST).blastStats(VA[UEV]))
                .flags(DISABLE_DECOMPOSITION, GENERATE_PLATE)
                .build();
        //  24337 Fullerene Polymer Matrix
        FullerenePolymerMatrix = new Material.Builder(getMaterialsId(), gregtechId("fullerene_polymer_matrix"))
                .polymer()
                .fluid()
                .color(0x2F0B01)
                .iconSet(SHINY)
                .blast(500)
                .components(Lead, 1, Iron, 1, Carbon, 153, Hydrogen, 36, Nitrogen, 1, Oxygen, 2)
                .flags(DISABLE_DECOMPOSITION, NO_SMASHING, NO_SMELTING, GENERATE_PLATE, GENERATE_FOIL)
                .build();
        //  24338 Radium-Radon Mixture
        RadiumRadonMixture = new Material.Builder(getMaterialsId(), gregtechId("radium_radon_mixture"))
                .fluid()
                .color(Radium.getMaterialRGB() + Radon.getMaterialRGB())
                .components(Radium, 1, Radon, 1)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24339 Scandium-Titanium Mixture
        ScandiumTitaniumMixture = new Material.Builder(getMaterialsId(), gregtechId("scandium_titanium_mixture"))
                .fluid()
                .color(Scandium.getMaterialRGB() + Titanium.getMaterialRGB())
                .components(Scandium, 1, Titanium, 1)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24340 Caesium Iodide
        CaesiumIodide = new Material.Builder(getMaterialsId(), gregtechId("caesium_iodide"))
                .dust()
                .color(Caesium.getMaterialRGB() + Iodine.getMaterialRGB())
                .iconSet(SHINY)
                .components(Caesium, 1, Iodine, 1)
                .build();
        //  24341 Tl-Tm-Droped Caesium Iodide
        TlTmDropedCaesiumIodide = new Material.Builder(getMaterialsId(), gregtechId("tl_tm_droped_caesium_iodide"))
                .dust()
                .color(Thallium.getMaterialRGB() + Thulium.getMaterialRGB() + CaesiumIodide.getMaterialRGB())
                .iconSet(BRIGHT)
                .components(Thallium, 1, Thulium, 1, CaesiumIodide, 1)
                .flags(DISABLE_DECOMPOSITION)
                .build()
                .setFormula("Tl/Tm:CsI");
        //  24342 Cadmium Tungstate
        CadmiumTungstate = new Material.Builder(getMaterialsId(), gregtechId("cadmium_tungstate"))
                .dust()
                .color(Cadmium.getMaterialRGB() + Tungsten.getMaterialRGB())
                .iconSet(BRIGHT)
                .components(Cadmium, 1, Tungsten, 1, Oxygen, 4)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24343 Bismuth Germanate
        BismuthGermanate = new Material.Builder(getMaterialsId(), gregtechId("bismuth_germanate"))
                .dust()
                .color(Bismuth.getMaterialRGB() + Germanium.getMaterialRGB())
                .iconSet(ROUGH)
                .components(Bismuth, 12, Germanium, 1, Oxygen, 20)
                .flags(DISABLE_DECOMPOSITION)
                .build();
        //  24344 Iodine Monochloride
        IodineMonochloride = new Material.Builder(getMaterialsId(), gregtechId("iodine_monochloride"))
                .fluid()
                .color(Iodine.getMaterialRGB() + Chlorine.getMaterialRGB())
                .components(Iodine, 1, Chlorine, 1)
                .build();
        //  24345 Magnesium Chloride Bromide
        MagnesiumChlorideBromide = new Material.Builder(getMaterialsId(), gregtechId("magnesium_chloride_bromide"))
                .dust()
                .color(Magnesium.getMaterialRGB() + Chlorine.getMaterialRGB() + Bromine.getMaterialRGB())
                .components(Magnesium, 1, Chlorine, 1, Bromine, 1)
                .build();
        //  24346 Rh-Re-Nq Catalyst
        RhReNqCatalyst = new Material.Builder(getMaterialsId(), gregtechId("rh_re_nq_catalyst"))
                .dust()
                .color(Rhodium.getMaterialRGB() + Rhenium.getMaterialRGB() + Naquadah.getMaterialRGB())
                .iconSet(SHINY)
                .components(Rhodium, 1, Rhenium, 1, Naquadah, 1)
                .build();
        //  24347 Lithium Titanate
        LithiumTitanate = new Material.Builder(getMaterialsId(), gregtechId("lithium_titanate"))
                .ingot()
                .fluid()
                .color(0xFE71A9)
                .iconSet(SHINY)
                .blast(3100)
                .components(Lithium, 2, Titanium, 1, Oxygen, 3)
                .flags(DISABLE_DECOMPOSITION, GENERATE_FINE_WIRE)
                .build();
        //  24348 Titanium Nitrate
        TitaniumNitrate = new Material.Builder(getMaterialsId(), gregtechId("titanium_nitrate"))
                .dust()
                .color(Titanium.getMaterialRGB() + NitricAcid.getMaterialRGB())
                .iconSet(DULL)
                .components(Titanium, 1, Nitrogen, 4, Oxygen, 12)
                .flags(DISABLE_DECOMPOSITION)
                .build()
                .setFormula("Ti(NO3)4", true);

        //  24349 PalladiumLoadedRutileNanoparticles

    }

    private static int getMaterialsId() {
        if (startId < END_ID) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
