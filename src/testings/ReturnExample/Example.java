package testings.ReturnExample;

public class Example {
    public static void main(String[] args) {
        int x = multiply(2, 2);
        int y = multiply(4, 4);

        int z = multiply(x, y);
        System.out.println(z);
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}
