package bank.oop;

import java.util.Objects;

public class Account {
    public double balance;
    private static long number = 1000000000;
    private long accountNumber;
    private final String accountName;
    private final String email;
    private String accountType;
    private String pin;

    public Account(String accountName, String email, String pin){
        this.accountName = accountName;
        this.email = email;
        this.accountNumber += ++number;
        this.pin = pin;
        accountType = String.valueOf(AccountType.SAVINGS_ACCOUNT);
    }

    public Account(AccountType accountType, String accountName, String email, String pin){
        this(accountName, email, pin);
        this.accountType = String.valueOf(accountType);
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getEmail() {
        return email;
    }

    public String getAccountType() {
        return accountType;
    }

    public void deposit(int amount) {
        if(amount<0){
            throw new IllegalArgumentException("invalid amount");
        }
        balance = balance + amount;
    }

    public double getBalance(String pin) {
        if (Objects.equals(this.pin, pin)){
            return balance;
        }
        else throw new IllegalArgumentException("Invalid pin, please try again");
    }

    public void withdraw(int withdrawAmount, String pin) {
        if(withdrawAmount > balance){
            System.out.println("\nInsufficient fund");
        } else System.out.printf("    \nCongratulations! $%d Withdrawal Done Successful\n\n\n", withdrawAmount);
        if (Objects.equals(this.pin, pin)){
            balance = balance - withdrawAmount;
        }else throw new IllegalArgumentException("Invalid pin, please try again");

    }

    @Override
    public String toString() {
        return String.format("""
                account name: %s
                account number: %d
                account balance: %.2f
                account type: %s
                email: %s
               
                """, getAccountName(), getAccountNumber(),getBalance(pin),
                getAccountType(),getEmail());
    }
}
