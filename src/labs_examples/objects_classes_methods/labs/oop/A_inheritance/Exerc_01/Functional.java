package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exerc_01;

public class Functional extends Employee{
    private String profession;

    public Functional(String name, int age, int yearsOfWork, double salary, double bonus, String profession) {
        super(name, age, yearsOfWork, salary, bonus);
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
