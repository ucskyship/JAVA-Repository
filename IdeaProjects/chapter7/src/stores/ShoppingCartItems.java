package stores;

public class ShoppingCartItems {
    private String items;
    private double price;
    private int quantity;
    private int amountPaid;

    public int getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(int amountPaid) {
        this.amountPaid = amountPaid;
    }



    public ShoppingCartItems(String items, double price, int quantity) {
        this.items = items;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItems() {
        return items;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
