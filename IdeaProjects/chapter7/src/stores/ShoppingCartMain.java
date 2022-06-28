package stores;

import stores.ShoppingCartItems;

import java.util.Scanner;

public class ShoppingCartMain {
    public static void main(String[] args) {
        String userInput = "";
        Scanner scanner = new Scanner(System.in);
        String customerName = "";
        String cashierName = "";
        ShoppingCartFile cart = new ShoppingCartFile();

        ShoppingCartItems item;

        System.out.println("Enter customer name");
        customerName = scanner.next();

        do {

            System.out.println("Enter item name");
            String itemName = scanner.next();

            System.out.println("Enter price per unit");
            double pricePerUnit = scanner.nextDouble();


            System.out.println("Enter quantity");
            int quantity = scanner.nextInt();


            System.out.println("do you want to enter another item");
            userInput = scanner.next();

            item = new ShoppingCartItems(itemName, pricePerUnit, quantity);


            cart.addItem(item);
        } while (!"no".equalsIgnoreCase(userInput));

        System.out.println("Enter cashier name");
        cashierName = scanner.next();

        CustomerAndCashierName names = new CustomerAndCashierName(customerName, cashierName);
        cart.setNames(names);

        System.out.println("How much did the customer give you?");
        item.setAmountPaid(scanner.nextInt());

        System.out.println(cart);
    }
}