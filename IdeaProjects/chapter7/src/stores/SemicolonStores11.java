package stores;

import java.util.Objects;
import java.util.Scanner;

/**
     * This program prompts the user(cashier) to enter a customer's name
     * next prompt, what the customer bought,
     * how many piece the customer bought,
     * how much per unit of items the customer bought
     * and keep iterating while the items bought by the customer has not finished (add more?)
     * next prompt, is what is the cashier's name,
     * how much was issued by the customer
     * how much discount
     * and outputs result
 * */

public class SemicolonStores11 {
    public static void main(String[] args) {

        double sumOfProductBought = 0;
        String[] productName = new String[50];
        double[] productPrice = new double[50];
        int[] productNumber = new int[1000];
        String[] customerName = new String[1000];
        int i = 0;


        Scanner input = new Scanner(System.in);
        String userResponse = "yes";

        System.out.println("What is the customer's name?");
        customerName[i] = input.next();


        while (Objects.equals(userResponse, "yes")) {
            System.out.println("What did the customer buy?");
            productName[i] = input.next();

            System.out.println("How many pieces");
            productNumber[i] = input.nextInt();

            System.out.println("How much per unit");
            productPrice[i] = input.nextDouble();

            System.out.println("Add more Item(s)?");
            userResponse = input.next();
            i++;
        }
        System.out.println("What is your name?");
        String cashierName = input.next();

        System.out.println("How much did the customer give you?");
        double moneyIssued = input.nextDouble();

        System.out.println("How much discount will customer get?");
        double discountAmount = input.nextInt();


        for (i = 0; i < productPrice.length; i++) {
            sumOfProductBought += productPrice[i] * productNumber[i];
        }
        double discount = 0;
        for (i = 0; i < productPrice.length; i++) {
            discount = sumOfProductBought * discountAmount / 100;
        }
        double excessBal = 0;
        for (i = 0; i < productPrice.length; i++) {
            excessBal = moneyIssued - sumOfProductBought;
        }
//        String[] name;
//        for (i = 0; i < productName.length; i++) {
//            name = productName[i];
//        }
        System.out.printf("Customer's name: %s%n", customerName);
        System.out.println("Total: " + sumOfProductBought);
        System.out.println("Discount: " + discount);
        System.out.println("Customer's excess balance: " + excessBal);
        System.out.println("Items: " + productName[0 ]);
        System.out.println("Cashier's name: " + cashierName);
    }
}
