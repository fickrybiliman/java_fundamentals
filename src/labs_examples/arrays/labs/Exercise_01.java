package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int sumAllNumbers = 0;
        double average;
        System.out.println("Enter 10 numbers");

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter number " + (i + 1) + " :");
            int input = scanner.nextInt();
            numbers[i] = input;
        }

        for (int number : numbers) {
            System.out.println(number);
            sumAllNumbers += number;
        }

        average = (double) sumAllNumbers / numbers.length;
        System.out.println("Sum of Numbers = " + sumAllNumbers);
        System.out.println("Average of Numbers = " + average);
    }

}