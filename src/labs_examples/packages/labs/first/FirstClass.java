package labs_examples.packages.labs.first;

import labs_examples.packages.labs.second.SecondClass;

public class FirstClass extends SecondClass {
    public int one = 1;
    protected int two = 2;
    int three = 3;
    private int four = 4;

    public int addition() {
        return one + two + three + four;
    }

    protected int subtraction() {
        return four - one;
    }



    public static void main(String[] args) {
        SecondClass secondClass = new SecondClass();
        int div = secondClass.division();
        System.out.println("Example division on Second Class : " + div);

        FirstClass firstClass = new FirstClass();
        int mult = firstClass.multiplication();
        System.out.println("Example multiplication on Second Class : " + mult);
    }

}
