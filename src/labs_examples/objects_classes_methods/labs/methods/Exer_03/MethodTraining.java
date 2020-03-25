package labs_examples.objects_classes_methods.labs.methods.Exer_03;

import videos_source_code.classes.Person;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Arrays;

public class MethodTraining {

    public static void main(String[] args) {
        // 1) Demonstrate method overloading in this class
        int overload_1 = methodOverload(2, 5);
        int overload_2 = methodOverload(10, 2, 5);
        System.out.println(overload_1);
        System.out.println(overload_2);


        // 2) Demonstrate the difference between "pass by value" and "pass by reference"
        // Pass By Value
        int x = 25;
        int y = 34;
        System.out.println("before call method passByValue, x = " + x);
        System.out.println("before call method passByValue, y = " + y);
        passByValue(x, y);
        System.out.println("after call method passByValue, x = " + x);
        System.out.println("after call method passByValue, y = " + y);
        // Pass By Reference
        Person john = new Person(42, 180, "John");
        System.out.println(john.toString());
        addYearPlusOne(john);
        System.out.println(john.toString());


        // 3) Create a method that will return the largest of 4 numbers (all of which are passed in as arguments)
        largestOf4Numbers(10, 2, 343, 75, 85, 35, 124, 215, 658, 12, 35, 6);


        // 4) Write a method to count all consonants (the opposite of vowels) in a String
        int startCountConsonant = countConsonants("Hello World, I Love Java");
        System.out.println(startCountConsonant);


        // 5) Write a method that will print some kind of ascii art to the console (Google "ascii art" if needed)
         AsciiArt();


        //6) Write a method that will determine whether or not a number is prime
        isPrimeNumber(0);


        //7) Write a method that will return a small array containing the highest and lowest numbers in a given numeric array,
        //   which is passed in as an argument
        int[] numbers = {10, 2, 343, 75, 85, 35, 124, 215, 658, 12, 35, 6};
        String highestAndLowestNumbers = highestAndLowest(numbers);
        System.out.println("hHighest And Lowest Numbers = " + highestAndLowestNumbers);


        // 8) Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
        //    In this method create an Integer ArrayList and populate it with each number between zero and maxNum that is
        //    divisible by both divisor1 and divisor2. Then return this ArrayList. After calling this method, print out the
        //    length of the returned list
        ArrayList populate = populaterrayList(7, 3, 2);
        System.out.println(populate);


        // 9) Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot
        //    instantiate a second array. You must reverse the array in place using only one extra temp variable. Hint: this
        //    variable is used to temporarily store individual values in the array
        String reverse = reverse("Makan", "Nasi", "Goreng", "di", "Pasar", "Induk");
        System.out.println(reverse);
    }


    // === === === === === === === === === === === === === === === === === === === === //

    // 1) Demonstrate method overloading in this class
    public static int methodOverload(int a, int b) {
        return a + b;
    }
    public static int methodOverload(int a, int b, int c) {
        return a + b + c;
    }


    // 2) Demonstrate the difference between "pass by value" and "pass by reference"
    public static void passByValue(int x, int y) {
        x *= 7;
        System.out.println("x = " + x);
        y *= 7;
        System.out.println("y = " + y);
    }

    public static void addYearPlusOne(Person person) {
        person.age = person.age + 1;
    }


    // 3) Create a method that will return the largest of 4 numbers (all of which are passed in as arguments)
    public static void largestOf4Numbers(int ...numbers) {
        Arrays.sort(numbers);
        int[] lastFour = new int[4];
        lastFour[0] = (numbers[numbers.length - 1]);
        lastFour[1] = (numbers[numbers.length - 2]);
        lastFour[2] = (numbers[numbers.length - 3]);
        lastFour[3] = (numbers[numbers.length - 4]);
        for (int number: lastFour) {
            System.out.println(number);
        }
    }


    // 4) Write a method to count all consonants (the opposite of vowels) in a String
    public static int countConsonants(String string) {
        int count = 0;
        System.out.println(string.indexOf("e"));
        System.out.println(Character.toString(string.charAt(1)).equalsIgnoreCase("e"));
        for (int i = 0; i < string.length(); i++) {
            if (Character.toString(string.charAt(i)).equalsIgnoreCase("b") ||
                Character.toString(string.charAt(i)).equalsIgnoreCase("c") ||
                Character.toString(string.charAt(i)).equalsIgnoreCase("d") ||
                Character.toString(string.charAt(i)).equalsIgnoreCase("e") ||
                Character.toString(string.charAt(i)).equalsIgnoreCase("f") ||
                Character.toString(string.charAt(i)).equalsIgnoreCase("g") ||
                Character.toString(string.charAt(i)).equalsIgnoreCase("h") ||
                Character.toString(string.charAt(i)).equalsIgnoreCase("j") ||
                Character.toString(string.charAt(i)).equalsIgnoreCase("k") ||
                Character.toString(string.charAt(i)).equalsIgnoreCase("l") ||
                Character.toString(string.charAt(i)).equalsIgnoreCase("m") ||
                Character.toString(string.charAt(i)).equalsIgnoreCase("n") ||
                Character.toString(string.charAt(i)).equalsIgnoreCase("p") ||
                Character.toString(string.charAt(i)).equalsIgnoreCase("q") ||
                Character.toString(string.charAt(i)).equalsIgnoreCase("r") ||
                Character.toString(string.charAt(i)).equalsIgnoreCase("s") ||
                Character.toString(string.charAt(i)).equalsIgnoreCase("t") ||
                Character.toString(string.charAt(i)).equalsIgnoreCase("v") ||
                Character.toString(string.charAt(i)).equalsIgnoreCase("w") ||
                Character.toString(string.charAt(i)).equalsIgnoreCase("x") ||
                Character.toString(string.charAt(i)).equalsIgnoreCase("y") ||
                Character.toString(string.charAt(i)).equalsIgnoreCase("z")
            ) {
                count++;
            }
        }
        return count;
    }


    // 5) Write a method that will print some kind of ascii art to the console (Google "ascii art" if needed)
    public static void AsciiArt() {
        int width = 100;
        int height = 30;

        //BufferedImage image = ImageIO.read(new File("your path/logo.jpg"));
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        g.setFont(new Font("SansSerif", Font.BOLD, 24));

        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics.drawString("Java", 10, 20);

        //save this image
        //ImageIO.write(image, "png", new File("your path/ascii-art.png"));

        for (int y = 0; y < height; y++) {
            StringBuilder sb = new StringBuilder();
            for (int x = 0; x < width; x++) {
                sb.append(image.getRGB(x, y) == -16777216 ? " " : "$");
            }

            if (sb.toString().trim().isEmpty()) {
                continue;
            }

            System.out.println(sb);
        }
    }


    // 6) Write a method that will determine whether or not a number is prime
    public static void isPrimeNumber(int number) {
        int sqrt = (int) Math.sqrt(number) + 1;
        boolean isPrime = true;

        for (int i = 2; i < sqrt; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (number == 1) {
            isPrime = false;
        }

        if (number < 1) {
            System.out.println("Cant determine whether or not a number " + number + " is prime");
        } else {
            System.out.println(number + " is "+ (isPrime ? "Prime number" : "not Prime number"));
        }
    }


    // 7) Write a method that will return a small array containing the highest and lowest numbers in a given numeric array,
    //    which is passed in as an argument
    public static String highestAndLowest(int ...numbers) {
        Arrays.sort(numbers);
        int[] result = new int[2];
        result[0] = numbers[numbers.length - 1];
        result[1] = numbers[0];
        return Arrays.toString(result);
    }


    // 8) Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
    //    In this method create an Integer ArrayList and populate it with each number between zero and maxNum that is
    //    divisible by both divisor1 and divisor2. Then return this ArrayList. After calling this method, print out the
    //    length of the returned list
    public static ArrayList populaterrayList(int maxNum, int divisor1, int divisor2) {
        ArrayList<Integer> ArrListOfInteger = new ArrayList<>();
        for (int i = 0; i < maxNum; i++) {
            if (i % divisor1 == 0 && i % divisor2 == 0) {
                ArrListOfInteger.add(i);
            }
        }
        return ArrListOfInteger;
    }

    // 9) Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot
    //    instantiate a second array. You must reverse the array in place using only one extra temp variable. Hint: this
    //    variable is used to temporarily store individual values in the array
    public static String reverse(String ...strings) {
        System.out.println(strings.length);
        int half = strings.length / 2;
        String temp;
        for (int i = 0; i < half; i++) {
            temp = strings[i];
            strings[i] = strings[strings.length - 1 - i];
            strings[strings.length - 1 - i] = temp;
        }
        return Arrays.toString(strings);
    }
}



