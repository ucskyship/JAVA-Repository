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

public class SemicolonStores {
    private String customerName;
    private String productName;
    private int numberOfItems;
    private double unitPrice;
    private String cashierName;
    private int amountIssued;
    private double discountAmount;
    private double balanceRemains;
    private double totalPrice;

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setNumberOfItem(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public int getNumberOfItem() {
        return numberOfItems;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setCashierName(String cashierName) {
        this.cashierName = cashierName;
    }

    public String getCashierName() {
        return cashierName;
    }

    public void setAmountIssued(int amountIssued) {
        this.amountIssued = amountIssued;
    }

    public int getAmountIssued() {
        return amountIssued;
    }

    public void discountRate(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public double getDiscountRate() {
        return discountAmount;
    }

    public void excessBalance(double balanceRemains) {
        this.balanceRemains = balanceRemains;
    }

    public double getExcessBalance() {
        return balanceRemains;
    }

    public void setTototalPrice(double totalCost) {
        totalPrice = unitPrice * numberOfItems;
    }
}
