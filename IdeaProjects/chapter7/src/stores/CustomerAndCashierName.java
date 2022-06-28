package stores;

public class CustomerAndCashierName {
    String customerName;
    String cashierName;

    public CustomerAndCashierName(String customerName, String cashierName){
        this.cashierName = cashierName;
        this.customerName = customerName;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getCustomerName(){
        return customerName;
    }

    public void setCashierName(String cashierName){
        this.cashierName = cashierName;
    }

    public String getCashierName(){
        return cashierName;
    }
}
