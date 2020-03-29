package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exerc_01;

public class Structural extends Employee {
    private String department;

    public Structural(String name, int age, int yearsOfWork, double salary, double bonus, String department) {
        super(name, age, yearsOfWork, salary, bonus);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
