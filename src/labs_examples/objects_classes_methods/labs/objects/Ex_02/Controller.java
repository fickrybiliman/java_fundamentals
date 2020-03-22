package labs_examples.objects_classes_methods.labs.objects.Ex_02;

public class Controller {
    public static void main(String[] args) {
        User fickry = new User();
        Project sakd = new Project();

        fickry.setName("Fickry");
        fickry.setPhone("080989999");
        fickry.setEmail("fickry@gmail.com");
        fickry.setPassword("secret_agen");

        sakd.setName("Sakd");
        sakd.setLocation("Brunei Darussalam");
        sakd.setBudget(90000);

        System.out.println("User Data : " +
                            "\n------------" +
                            "\n User Name = " + fickry.getName() +
                            ",\n Phone Number = " + fickry.getPhone() +
                            ",\n Email = " + fickry.getEmail() +
                            "\n" +
                            "\nProject Data : " +
                            "\n------------" +
                            "\n Project Name = " + sakd.getName() +
                            "\n Project Budget = $" + sakd.getBudget() +
                            "\n Project Location = " + sakd.getLocation()
                );
    }
}
