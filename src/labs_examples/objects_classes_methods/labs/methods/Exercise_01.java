package labs_examples.objects_classes_methods.labs.methods;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        int multiply = multiply(3, 7);
        int divide = divide(49, 7);
        int year = yearInSeconds(1);
        String daysOnYears = daysOnCurrentYear(2020);
        int varargs = varargs("Hello", "World", "I", "Love", "Java");

        System.out.println(multiply);
        System.out.println(divide);
        joke();
        System.out.println("Year in seconds is : " + year);
        System.out.println(daysOnYears);
        System.out.println("Number of parameter on this method is : " + varargs + " Parameters.");
    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static int multiply(int a, int b) {
        return a * b;
    }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static int divide(int a, int b) {
        return a / b;
    }

    // 3) Create a static void method that will print of joke of your choice to the console
    public static void joke() {
        System.out.println("What did the 0 say to the 8? Nice belt!");
    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    Date data = new Date();
    public static int yearInSeconds (int years) {
        return years * 365 * 24 * 60 * 60;
    }

    public static String daysOnCurrentYear(int num) {
        String result = "Number of days on year " + num + " is : ";
        Calendar gregorianCalendar = new GregorianCalendar(num, 11, 31);
        return result + gregorianCalendar.get(Calendar.DAY_OF_YEAR) + " Days.";
    }

    // 5) Create a varargs method that will return the length of the varargs array passed in
    public static int varargs(String ...str) {
        int count = 0;
        for (String s: str) {
            count++;
        }
        return count;
    }





}
