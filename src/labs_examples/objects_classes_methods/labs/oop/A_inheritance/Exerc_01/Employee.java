package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exerc_01;

public class Employee {
    private String name;
    private int age;
    private int yearsOfWork;
    private double salary;
    private double bonus;

    public Employee(String name, int age, int yearsOfWork, double salary, double bonus) {
        this.name = name;
        this.age = age;
        this.yearsOfWork = yearsOfWork;
        this.salary = salary;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearsOfWork() {
        return yearsOfWork;
    }

    public void setYearsOfWork(int yearsOfWork) {
        this.yearsOfWork = yearsOfWork;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
