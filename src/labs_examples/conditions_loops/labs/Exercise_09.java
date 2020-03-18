package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args) {
        int number = 1;
        while (number < 10) {
            if (number == 7) {
                System.out.println(number);
                break;
            } else {
                System.out.println(number);
            }
            number++;
        }
    }
}
