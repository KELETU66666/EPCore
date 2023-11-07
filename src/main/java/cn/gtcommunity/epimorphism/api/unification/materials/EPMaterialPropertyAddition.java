package cn.gtcommunity.epimorphism.api.unification.materials;

import gregtech.api.unification.material.info.MaterialIconSet;
import gregtech.api.unification.material.properties.*;

import static cn.gtcommunity.epimorphism.api.unification.material.info.EPMaterialFlags.*;
import static gregicality.multiblocks.api.unification.GCYMMaterials.*;
import static gregtech.api.GTValues.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;

public class EPMaterialPropertyAddition {
    public static void init() {
        //  Properties
        Iodine.setProperty(PropertyKey.DUST, new DustProperty());
        Iodine.setProperty(PropertyKey.FLUID, new FluidProperty());
        Thallium.setProperty(PropertyKey.DUST, new DustProperty());
        Bromine.setProperty(PropertyKey.FLUID, new FluidProperty());
        Rhenium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Germanium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Germanium.setProperty(PropertyKey.BLAST, new BlastProperty(1211, BlastProperty.GasTier.HIGH, VA[EV], 1200));
        Germanium.setProperty(PropertyKey.FLUID, new FluidProperty());
        Rubidium.setProperty(PropertyKey.DUST, new DustProperty());
        SodiumHydroxide.setProperty(PropertyKey.FLUID, new FluidProperty());
        AmmoniumChloride.setProperty(PropertyKey.FLUID, new FluidProperty());
        Selenium.setProperty(PropertyKey.DUST, new DustProperty());
        Tellurium.setProperty(PropertyKey.DUST, new DustProperty());
        Erbium.setProperty(PropertyKey.DUST, new DustProperty());
        Praseodymium.setProperty(PropertyKey.DUST, new DustProperty());
        Terbium.setProperty(PropertyKey.DUST, new DustProperty());
        Scandium.setProperty(PropertyKey.DUST, new DustProperty());
        Neptunium.setProperty(PropertyKey.DUST, new DustProperty());
        Neptunium.setProperty(PropertyKey.FLUID, new FluidProperty());
        Zirconium.setProperty(PropertyKey.DUST, new DustProperty());
        Calcium.setProperty(PropertyKey.FLUID, new FluidProperty());
        Dubnium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Dubnium.setProperty(PropertyKey.FLUID, new FluidProperty());
        Seaborgium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Seaborgium.setProperty(PropertyKey.FLUID, new FluidProperty());
        Seaborgium.setProperty(PropertyKey.WIRE, new WireProperties((int) V[UEV], 32, 32, false));
        Rutherfordium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Rutherfordium.setProperty(PropertyKey.FLUID, new FluidProperty());
        Livermorium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Livermorium.setProperty(PropertyKey.FLUID, new FluidProperty());
        Gadolinium.setProperty(PropertyKey.DUST, new DustProperty());
        Dysprosium.setProperty(PropertyKey.DUST, new DustProperty());
        Holmium.setProperty(PropertyKey.DUST, new DustProperty());
        Thulium.setProperty(PropertyKey.DUST, new DustProperty());
        Ytterbium.setProperty(PropertyKey.DUST, new DustProperty());
        Strontium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Polonium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Fermium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Promethium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Mendelevium.setProperty(PropertyKey.INGOT, new IngotProperty());

        //  IconSets
        Bromine.setMaterialIconSet(MaterialIconSet.FLUID);

        //  Flags
        WroughtIron.addFlags(GENERATE_ROTOR, GENERATE_SMALL_GEAR);
        Rhenium.addFlags(GENERATE_PLATE, GENERATE_DOUBLE_PLATE, GENERATE_DENSE);
        Nickel.addFlags(GENERATE_FOIL);
        Titanium.addFlags(GENERATE_FOIL);
        Germanium.addFlags(GENERATE_FOIL);
        Tungsten.addFlags(GENERATE_FINE_WIRE);
        RhodiumPlatedPalladium.addFlags(GENERATE_FRAME);
        Darmstadtium.addFlags(GENERATE_FRAME);
        Naquadria.addFlags(GENERATE_FRAME);
        Neutronium.addFlags(GENERATE_FRAME);
        Neutronium.addFlags(GENERATE_ROTOR, GENERATE_SMALL_GEAR);
        HSSE.addFlags(GENERATE_DOUBLE_PLATE);
        Dubnium.addFlags(GENERATE_ROD, GENERATE_BOLT_SCREW);
        Rutherfordium.addFlags(GENERATE_ROD, GENERATE_BOLT_SCREW);
        Livermorium.addFlags(GENERATE_ROD, GENERATE_BOLT_SCREW);
        Stellite100.addFlags(GENERATE_DOUBLE_PLATE);
        MaragingSteel300.addFlags(GENERATE_DOUBLE_PLATE);
        TitaniumTungstenCarbide.addFlags(GENERATE_DOUBLE_PLATE);
        WatertightSteel.addFlags(GENERATE_DOUBLE_PLATE);
        HSLASteel.addFlags(GENERATE_DOUBLE_PLATE);
        Trinaquadalloy.addFlags(GENERATE_FRAME);
        CobaltBrass.addFlags(GENERATE_FRAME);
        Trinium.addFlags(GENERATE_SPRING);
        Tritanium.addFlags(GENERATE_SPRING);
        RedSteel.addFlags(GENERATE_DOUBLE_PLATE);
        Ruthenium.addFlags(GENERATE_DOUBLE_PLATE);
        TitaniumCarbide.addFlags(GENERATE_DOUBLE_PLATE);
        Tritanium.addFlags(GENERATE_CURVED_PLATE, GENERATE_ROTOR);
        Nichrome.addFlags(GENERATE_FINE_WIRE);
        Uranium238.addFlags(GENERATE_FRAME);
        Plutonium241.addFlags(GENERATE_FRAME);
        HastelloyX.addFlags(GENERATE_DOUBLE_PLATE);
        RutheniumTriniumAmericiumNeutronate.addFlags(GENERATE_FINE_WIRE);
        IncoloyMA956.addFlags(GENERATE_DOUBLE_PLATE);

        Pyrochlore.addFlags(DISABLE_DECOMPOSITION);
        Tantalite.addFlags(DISABLE_DECOMPOSITION);
        Molybdenite.addFlags(DISABLE_DECOMPOSITION);
        OreProperty oreProp = Molybdenite.getProperty(PropertyKey.ORE);
        oreProp.setDirectSmeltResult(null);
        Powellite.addFlags(DISABLE_DECOMPOSITION);
        Wulfenite.addFlags(DISABLE_DECOMPOSITION);

        RockSalt.addFlags(DISABLE_DECOMPOSITION);
        Salt.addFlags(DISABLE_DECOMPOSITION);

        Pollucite.addFlags(DISABLE_DECOMPOSITION);
        Pollucite.getProperty(PropertyKey.ORE).setOreByProducts(Aluminium, Potassium, Caesium, Pollucite);

        //  Fluid Temperatures
        FluidProperty prop = new FluidProperty();
        prop.setFluidTemperature(332);
        SodiumBisulfate.setProperty(PropertyKey.FLUID, prop);

        //  Wire Properties
        WireProperties wireProp = RutheniumTriniumAmericiumNeutronate.getProperty(PropertyKey.WIRE);
        wireProp.setSuperconductor(false);
        wireProp.setLossPerBlock(32);
        wireProp.setVoltage((int) V[UIV]);
    }
}