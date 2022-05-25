import java.util.Scanner;
/**
 *  this program calculates cost of driving distance by prompting user to enter:
 *      driving distance
 *      miles per gallon
 *      price per gallon
 *  outputs result for cost of driving in dollars
 * */

public class CostOfDriving {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the driving distance: ");
        double drivingDistance = sc.nextDouble();

        System.out.println("Enter miles per gallon: ");
        double milesPerGallon = sc.nextDouble();

        System.out.println("Enter price per gallon: ");
        double pricePerGallon = sc.nextDouble();

        double costOfDriving = (drivingDistance/milesPerGallon) * pricePerGallon;

        System.out.printf("The cost of driving is $%.2f", costOfDriving);
    }
}
