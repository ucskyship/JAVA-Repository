package bank.oop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    Bank bank;

    @BeforeEach
    void setUp() {
        bank = new Bank();
    }

    @Test
    void testThatBankCanAddCustomer(){
        Customer Jay = new Customer("Uzo", "Chi", "Jay", Gender.MALE,
                20, "1-1-2000", "uc@gmail.com", "12212456432");
        bank.setCustomersArray(Jay);

       Jay = new Customer("Uzo", "Chi", "Jay", Gender.MALE,
                20, "1-1-2000", "uc@gmail.com", "12212456432");
        bank.setCustomersArray(Jay);

        List<Customer> customerList = bank.getCustomersArray();

        for (Customer customer: customerList){
            System.out.println(customer);
        }
        assertEquals(2,bank.getNoOfCustomers());
    }
}