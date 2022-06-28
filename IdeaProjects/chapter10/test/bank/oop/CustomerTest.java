package bank.oop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    Customer customer;

    @BeforeEach
    void setUp() {
        customer = new Customer("Uzo", "Chi", "Jay", Gender.MALE,
                20, "1-1-2000", "uc@gmail.com", "12212212");
    }

    @Test
    void testThatCustomerCanSetName(){
        assertEquals("Uzo", customer.getFirstName());
        assertEquals("Chi", customer.getMiddleName());
        assertEquals("Jay", customer.getLastName());
    }

    @Test
    void testThatCustomerCanSetAge(){
        assertEquals(20, customer.getAge());
    }

    @Test
    void testThatCustomerHasDateOfBirth(){
        assertEquals("1-1-2000", customer.getDateOfBirth());
        assertEquals("MALE", customer.getGender());
    }

    @Test
    void testThatCustomerCanSetOtherInfo(){
        assertEquals("uc@gmail.com", customer.getEmail());
        assertEquals("12212212", customer.getPhoneNumber());
    }

    @Test
    void testThatCustomerCanAddAccount(){
        Account Joe = new Account("Boyo Mike", "by@gmail.com", "1212");
        customer.setAccountsArray(Joe);
        List<Account> accountList = customer.getAccountsArray();

        for (Account account: accountList) {
            System.out.println(account);
        }
        assertEquals(1, customer.getNoOfAccounts());
    }
}