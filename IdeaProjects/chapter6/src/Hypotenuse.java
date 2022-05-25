import java.util.Scanner;

/**             Pseudocode
 * declare instance variable side1, side2, hypo of type double
 * this method prompts user twice to enter sides of a triangle of type double
 * calculate hypotenuse using the 2 sides provided
 * output hypotenuse
 *
 * */

public class Hypotenuse {
    public static void main(String... args){

        double side1, side2, hypo;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for side1: ");
            side1 = input.nextDouble();

        System.out.print("Enter a value for side2: ");
            side2 = input.nextDouble();

        hypo = hypoCal(side1,side2);

        System.out.println("\nThe length of the hypotenuse is: " + hypo);

    }

    private static double hypoCal(double side1, double side2) {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }
}
