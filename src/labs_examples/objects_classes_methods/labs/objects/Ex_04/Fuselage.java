package labs_examples.objects_classes_methods.labs.objects.Ex_04;

// Fuselage also called as a airplane body
// Fuselage construction ever made is : Geodetic, Pratt Truss, Warren, Monocoque, Semi Monocoque
public class Fuselage {
    String construction;

    public Fuselage(String construction) {
        this.construction = construction;
    }

    public String getConstruction() {
        return construction;
    }

    public void setConstruction(String construction) {
        this.construction = construction;
    }

    @Override
    public String toString() {
        return "Construction = '" + construction + '\'';
    }
}
