package labs_examples.objects_classes_methods.labs.methods.Exer_02;

public class Main {
    public static void main(String[] args) {
        PowerPlant powerPlant = new PowerPlant("Jet Engine");
        Fuselage fuselage = new Fuselage("Geodetic");
        Wings wings = new Wings("Middle Wing", "Monoplanes");
        LandingGear landingGear = new LandingGear("Tricycle Type Landing Gear", "Retractable");

        Airplane airplane = new Airplane(powerPlant, fuselage, wings, landingGear, "Boeing", "737", 560);

        System.out.println(airplane.toString());
    }
}
