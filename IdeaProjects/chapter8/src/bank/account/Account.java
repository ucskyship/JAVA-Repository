package bank.account;

import java.util.Objects;

public class Account {
    private String name;
    private double balance;
    private String pin;
    public Account(int accountNumber, String accountName, String pin){
        name = accountName;
        this.pin = "1234";
    }

    public String getAccountName() {
        System.out.println(name);
        return name;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance(String pin) {
        if (Objects.equals(this.pin, pin)) {
            System.out.println(name + balance);
        }
            return balance;
    }

     public void withdraw(double amount, String pin) {
        if(Objects.equals(this.pin, pin)) {
            balance -= amount;
        }
    }
}
