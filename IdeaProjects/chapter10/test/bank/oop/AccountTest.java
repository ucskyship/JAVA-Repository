package bank.oop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Account account;

    @BeforeEach
    void setUp() {
        account = new Account("Boyo Mike", "by@gmail.com", "1212");
    }

    @Test
    void testThatAccountCanBeCreated(){
        assertEquals("Boyo Mike", account.getAccountName());
        assertEquals("by@gmail.com", account.getEmail());
        assertEquals("SAVINGS_ACCOUNT", account.getAccountType());
        assertEquals(1000000001,account.getAccountNumber());
    }

    @Test
    void testThatAccountCanDepositMoney(){
        account.deposit(50000);
        assertEquals(50000, account.getBalance("1212"));
    }

    @Test
    void testThatAccountCanWithdrawMoney(){
        account.deposit(6000);
        account.withdraw(500, "1212");
        assertEquals(5500, account.getBalance("1212"));
    }

    @Test
    void testThatAccountGeneratesAccountNumber(){
        assertEquals(1000000001, account.getAccountNumber());

         account = new Account("Boyo Mikk", "boyo@gmail.com", "1212");
        assertEquals(1000000002,account.getAccountNumber());

        account = new Account("Boyo Mikk", "boyo@gmail.com", "1212");
        assertEquals(1000000003,account.getAccountNumber());
    }
}