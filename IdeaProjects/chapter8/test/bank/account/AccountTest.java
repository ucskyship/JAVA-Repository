package bank.account;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    Account account, account2;

    @BeforeEach
    public void setUp(){
        account = new Account(1, "UCJ Account", "1234");
        account2 = new Account(2, "Nifemi Account", "1234");

    }


    @Test
    public void thatAnAccountCanBeCreatedTest(){
        assertEquals("UCJ Account", account.getAccountName());
        assertEquals("Nifemi Account", account2.getAccountName());
    }

    @Test
    public void accountCanDepositTest(){
        account.deposit(5_000.00);
        assertEquals(5000, account.getBalance("1234"));
        account2.deposit(10000);
        assertEquals(10000, account2.getBalance("1234"));
    }

    @Test
    public void accountCanWithdrawTest(){
        account.deposit(99_000);
        account.deposit(15_000);
        account.withdraw(5000,"1234");
        assertEquals(109_000, account.getBalance("1234"));
    }

    @Test
    public void accountBalanceDoesNotChangeWhenPinIsIncorrect(){
        account.deposit(100_000);
        account.withdraw(3_000,"2345");
        assertEquals(100_000, account.getBalance("1234"));
    }
}
