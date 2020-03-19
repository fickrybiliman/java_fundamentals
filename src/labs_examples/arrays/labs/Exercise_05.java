package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        int[] numbers = new int[7];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i+1;
        }

        for (int i = numbers.length-1; i >=0; i--) {
            System.out.println(numbers[i]);
        }
    }

}
