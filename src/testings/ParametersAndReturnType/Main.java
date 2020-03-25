package testings.ParametersAndReturnType;

public class Main {
    public static void main(String[] args) {

        // please write the four methods as instructed below
        // then call each method from here within the main()
        int multiply = multiply(2, 8);
        int divide = divide(8, 2);
        boolean isOdd = isOdd(7);
        String reverse = reverse("Programming is cool");

        System.out.println(multiply);
        System.out.println(divide);
        System.out.println(isOdd);
        System.out.println(reverse);
    }

    // please write a static multiply() method below that takes
    // two parameters (argumets) and returns the result of
    // multiplying them together
    public static int multiply(int a, int b) {
        return a * b;
    }

    // please write a static divide() method below that takes
    // two parameters (argumets) and returns the result of
    // dividing the first parameter by the second parameters
    public static int divide(int a, int b) {
        return a / b;
    }

    // please write a static isOdd() method that takes one numeric
    // parameter and returns a true (boolean) if the parameter is odd
    public static boolean isOdd(int num) {
        return num % 2 != 0;
    }

    // please write a method that will take in a String (as an argument)
    // and return that String in reverse order. For instance, if you pass
    // in the String "programming is cool" the method will return the
    // String "looc si gnimmargorp"
    public static String reverse(String str) {
        String result = "";
        for (int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);
        }

        return result;
    }
}
