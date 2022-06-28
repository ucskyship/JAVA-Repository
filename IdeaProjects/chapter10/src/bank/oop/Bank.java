package bank.oop;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Customer> customersArray = new ArrayList<>();

    public List<Customer> getCustomersArray() {
        return customersArray;
    }

    public void setCustomersArray(Customer customer) {
       customersArray.add(customer);
    }
    public int getNoOfCustomers(){
        return customersArray.size();
    }

    public Customer findCustomer(String email, String pin) {
        for (Customer customer: customersArray){
            if (customer.getEmail().equalsIgnoreCase(email)){
                if(customer.getEmail().equals(pin)){
                    return customer;
                }
            }
        }
        throw new IllegalArgumentException(String.format("Customer with email \"%s\" not found ",email));
    }
}

