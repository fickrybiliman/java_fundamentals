package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exerc_01;

public class Doctor extends Functional {
    private String specialist;

    public Doctor(String name, int age, int yearsOfWork, double salary, double bonus, String profession, String specialist) {
        super(name, age, yearsOfWork, salary, bonus, profession);
        this.specialist = specialist;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

}
