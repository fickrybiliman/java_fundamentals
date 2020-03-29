package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Why does the output print in the order it does?
 *
 * You answer: Because method on C_1 class inherits from B_1 class and B_1 class inherits from A_1 class,
 *             that's why it will print from highest class method.
 *
 */

class A_1 {
    public A_1() {
        System.out.println("Class A Constructor");
    }
}

class B_1 extends A_1 {
    public B_1() {
        System.out.println("Class B Constructor");
    }
}

class C_1 extends B_1 {
    public C_1() {
        System.out.println("Class C Constructor");
    }
}

public class Exercise_03 {
    public static void main(String[] args) {
        C_1 c = new C_1();
    }
}
