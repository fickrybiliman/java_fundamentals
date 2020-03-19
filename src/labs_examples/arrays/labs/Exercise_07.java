package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(7);
        numbers.add(8);
        numbers.add(2);
        numbers.add(11);
        numbers.add((int) 20.25);

        for (Integer number: numbers) {
            System.out.println(number);
        }

        System.out.println("Size or length of array list = " + numbers.size());
    }
}
