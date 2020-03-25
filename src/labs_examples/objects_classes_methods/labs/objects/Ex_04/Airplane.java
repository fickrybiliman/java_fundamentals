package labs_examples.objects_classes_methods.labs.objects.Ex_04;

public class Airplane {
    PowerPlant powerPlant;
    Fuselage fuselage;
    Wings wings;
    LandingGear landingGear;
    String factory; // Boeing, Airbus
    String type;
    double fuelCapacity;

    public Airplane(PowerPlant powerPlant, Fuselage fuselage, Wings wings, LandingGear landingGear, String factory, String type, double fuelCapacity) {
        this.powerPlant = powerPlant;
        this.fuselage = fuselage;
        this.wings = wings;
        this.landingGear = landingGear;
        this.factory = factory;
        this.type = type;
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public String toString() {
        return "Exer_02 Specifications : " +
                "\n Power Plant " + powerPlant +
                ",\n Fuselage " + fuselage +
                ",\n Wings " + wings +
                ",\n Landing Gear " + landingGear +
                ",\n Factory = '" + factory + '\'' + ", Type = " + type +
                ",\n Current Fuel Capacity = " + fuelCapacity + " Liters";
    }
}
