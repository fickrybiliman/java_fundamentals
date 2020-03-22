package labs_examples.objects_classes_methods.labs.objects.Ex_03;

public class controller {
    public static void main(String[] args) {
        User fickry = new User("Fickry", "fickry_secret", "08123456789");
        User john = new User("John", "john_secret", "08910111213");
        User dani = new User("Dani", "dani_secret", "08345678910");

        System.out.println(fickry);
        System.out.println(john);
        System.out.println(dani);
    }
}
