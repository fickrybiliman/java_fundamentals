package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here
        final double pi = Math.PI;
        double radius = 3.14;
        double height = 5;

        double volume = pi * Math.pow(radius, 2) * height;
        double surfaceArea = (2 * pi * Math.pow(radius, 2)) + (2 * pi * radius * height);

        System.out.println(volume);
        System.out.println(surfaceArea);

    }
}