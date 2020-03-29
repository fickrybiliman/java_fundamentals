package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exerc_01;

public class Patient {
    private String name;
    private int age;
    private String disease;
    private String phone;

    public Patient(String name, int age, String disease, String phone) {
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.phone = phone;
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

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
