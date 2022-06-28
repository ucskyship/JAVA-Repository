package stores;

import stores.ShoppingCartItems;

import java.util.ArrayList;
import java.util.Date;

public class ShoppingCartFile {
    private ArrayList<ShoppingCartItems> totalItems;
    private ArrayList<CustomerAndCashierName> names;
    private ShoppingCartItems item;

    public void setTotalItems(ArrayList<ShoppingCartItems> totalItems){
        this.totalItems = totalItems;
    }
    private ArrayList<CustomerAndCashierName> getNames() {
        return names;
    }
    public void setNames(CustomerAndCashierName newNames){
        names.add(newNames);
    }
    public ShoppingCartFile(){
        totalItems = new ArrayList<ShoppingCartItems>();
        names = new ArrayList<>();
    }

    public void addItem(ShoppingCartItems newItem){
        totalItems.add(newItem);
    }
    public ArrayList<ShoppingCartItems> getTotalItems(){
        return totalItems;
    }

    public double calculateSubTotal(){
        double subTotal = 0.0;
        for(ShoppingCartItems items : totalItems){
            double itemsPrice = item.getPrice() * items.getQuantity();
            subTotal += itemsPrice;
        }
        return subTotal;
    }

    public double discount(double percentage){
        double total = calculateSubTotal();
        return (percentage * total)/100;
    }

    public double vat(){
        double vatPercentage = 17.5 / 100;
        double total = calculateSubTotal();
        return  vatPercentage * total;
    }

    public String toString(){
        System.out.println("""
                SEMICOLON STORES
                MAIN BRANCH
                LOCATION: 312, HERBERT MACAULAY WAY, SABO, YABA, LAGOS
                TEL: 032938285
                """);
        Date date = new Date();
        System.out.println(date);

        String name = "";
        for (CustomerAndCashierName customerAndCashierName : names){
            name = """
                    Cashier : %s
                    Customer Name : %s
                    """;
            name = name.formatted(customerAndCashierName.getCashierName(), customerAndCashierName.getCustomerName());
        }
        String header = "               ITEM    QTY PRICE   QTY(NGN)";

        String totalItem = "";
        for (int i = 0; i < totalItems.size(); i++) {
            String item = """
                    %14s %6d %9.2f
                    """;
            ShoppingCartItems items = totalItems.get(i);
//            item = items.formatted(items.getItems(), items.getQuantity(), items.getPrice(), (items.getQuantity()*items.getPrice()));
            totalItem += item;
        }
        double total = 0;
        for (ShoppingCartItems items : totalItems) {
            double result = items.getPrice() * items.getQuantity();
            total += result;
        }

        String subTotal = """
                                 Sub Total :      %.2f
                                 Discount :       %.2f
                                 Vat @ 17.5 :     %.2f
                """;
        subTotal = subTotal.formatted(total,discount(12),vat());

        double billTotal = total+vat()-discount(12);
        return name + "\n"+"=".repeat(44)+ "\n"+header+"\n"+"-".repeat(44)+"\n"+  totalItem +"-".repeat(44)+"\n"+subTotal+"\n"+ " ".repeat(28)+"Bill Total:     "+billTotal;
    }
}
