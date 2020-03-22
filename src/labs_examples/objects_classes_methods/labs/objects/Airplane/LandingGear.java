package labs_examples.objects_classes_methods.labs.objects.Airplane;

public class LandingGear {
    String arrangement; //Tail wheel type landing gear, Tandem landing gear, Tricycle type landing gear
    String category; //Fixed, Retractable

    public LandingGear(String arrangement, String category) {
        this.arrangement = arrangement;
        this.category = category;
    }

    public String getArrangement() {
        return arrangement;
    }

    public void setArrangement(String arrangement) {
        this.arrangement = arrangement;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Arrangement = '" + arrangement + '\'' +
                ", Landing Gear Category='" + category + '\'';
    }
}
