import java.util.Scanner;

/**
 * prompt user to input radius of a circle
 * calculate the circle's diameter, circumference and area and output result
 * do not store the result in a variable
 * */

public class DiameterCircumferenceAreaOfACircle {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        int radius = sc.nextInt();

        int diameter = 2*radius;
        float circumference = (float) (2*Math.PI* radius);
        float area = (float) (Math.PI*Math.pow(radius, 2));

        System.out.printf("The diameter of the circle is: %d\n", diameter);
        System.out.printf("The circumference of the circle is: %.3f%n", circumference);
        System.out.printf("The area of th circle is %.3f\n", area);
    }
}
