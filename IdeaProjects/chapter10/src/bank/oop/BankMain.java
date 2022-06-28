package bank.oop;

import java.util.List;
import java.util.Scanner;

public class BankMain {
    static Bank mayBank = new Bank();
    public static void main(String[] args) {

        try {
            mainAppMenu();
        } catch (IllegalArgumentException err) {
            System.out.printf("""
                                                  
                                %s
                     <> kindly fill in correct details <>
                     
                     """, err.getMessage());

            mainAppMenu();
        }

    }

    private static void mainAppMenu() {
        Scanner input = new Scanner(System.in);
        int endApp = 0;
        while (endApp!= -1){

            System.out.println("""                          
                            
                            @ WELCOME TO MAY_BANK
                
                Enter 1 -> Create an account
                Enter 2 -> SignIn to an existing account
                Enter 3 -> View all Accounts
                Enter 4 -> Close an Account
                Enter 0 -> Cancel
                
                """);
            int userInput = input.nextInt();
            AccountType accountType;
            System.out.println("""
                        To create an account

                    Select account type -
                        1 Savings Account
                        2 Current Account
                        3 Fixed Account
                    """);
            switch (userInput) {
                case 1 -> {
                    int type = input.nextInt();

                    switch (type){
                        case 1 -> {
                            System.out.println("Saving Account selected \n");
                            registrationPrompt(input);
                        }
                        case 2 -> {
                            System.out.println("Current Account selected \n");
                            registrationPrompt(input);
                        }
                        case 3 -> {
                            System.out.println("Fixed Account selected \n");
                            registrationPrompt(input);
                        }
                    }
                }

                case 2 -> {
                    System.out.println("        To SignIn to an Existing Account -\n===");

                    System.out.println("Enter email");
                    String email = input.next();
                    System.out.println("Enter pin");
                    String pin = input.next();
                    Customer customer = mayBank.findCustomer(email, pin);
                    Account account = customer.findAccount(email, pin);
                    transactions(input,account);
                }

                case 3 -> {
                    System.out.println("        View All Account(s) Here -\n");
                    System.out.println();
                    List<Customer> customers = mayBank.getCustomersArray();
                    for (Customer customer: customers){
                        System.out.println(customer);
                    }
                    System.out.println("0 Back");
                    int inputResponse = input.nextInt();
                    if (inputResponse == 0){
                        mainAppMenu();
                    }
                }

                case 4 -> {
                    System.out.println("        To Close An Account -\n");
                    System.out.println();
                }

                case 0 -> {
                    System.out.println("Thank You for Banking with @MayBank");
                    endApp = -1;
                }
                default -> endApp = -1;
            }
        }
    }

    private static void registrationPrompt(Scanner input) {
        int userInput;
        System.out.println("Enter first name: ");
        String firstName = input.next();

        System.out.println("Enter middle name: ");
        String middleName = input.next();

        System.out.println("Enter last name: ");
        String lastName = input.next();

        Gender gender;
        System.out.println("""
                -> Select gender -
                1 Male
                2 Female
                3 Non-binary
                """);
        int sex = input.nextInt();
        switch (sex){
            default -> gender = Gender.MALE;
            case 2 ->gender = Gender.FEMALE;
            case 3 ->gender= Gender.NON_BINARY;
        }

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        System.out.println("Enter date of birth(dd-mm-yy): ");
        String dateOfBirth = input.next();

        System.out.println("Enter phone number: ");
        String phoneNumber = input.next();

        System.out.println("Enter email: ");
        String email = input.next();

        System.out.println("Enter pin to activate account");
        String pin = input.next();
        Account account = new Account(firstName,email,pin);
        Customer customer = new Customer(firstName, middleName, lastName, gender,age,
                dateOfBirth,email,phoneNumber);

        customer.setAccountsArray(account);
        mayBank.setCustomersArray(customer);
        System.out.printf("""
                
                >>>>>>  Account created successfully  <<<<<<
                - kindly keep this info safe as we will need them -
                    
                    . account number: %d
                    . name of account: %s %s
                    . account type: %s
                    . email: %s
                                         
                
                """, account.getAccountNumber(),customer.getFirstName(), customer.getLastName(),account.getAccountType(),customer.getEmail());
        System.out.println("0 Continue Banking");
        userInput = input.nextInt();
        if (userInput == 0){
            mainAppMenu();
        }
    }

    private static void transactions(Scanner input, Account account) {
        int closeAccountApp = 0;
        while (closeAccountApp != -1){
            System.out.printf("""
                           >>> %s's MayBank-Account <<<
                ===
                1 Deposit
                2 Withdraw
                3 Balance
                4 Account details
                0 Cancel
                
                """, account.getAccountName());
            int choice = input.nextInt();
            switch (choice){
                case 1->{
                    System.out.println("Enter amount");
                        int amount = input.nextInt();
                    account.deposit(amount);
                    System.out.printf("    \nAwesome! $%d Deposit Successful\n\n", amount);
                    System.out.println("0 Back");
                    int userInput = input.nextInt();
                    if (userInput == 0){
                        transactions(input, account);
                    }
                }

                case 2 ->{
                    System.out.println("Enter Withdraw Amount: ");
                        int withdrawAmount = input.nextInt();
                    System.out.println("Enter correct pin: ");
                        String pin = input.next();
                        account.withdraw(withdrawAmount, pin);
                    System.out.println("0 Back");
                    int userInput = input.nextInt();
                    if (userInput == 0){
                        transactions(input, account);
                    }
                }

                case 3 ->{
                    System.out.println("Enter pin to View Balance");
                    String pin = input.next();
                    System.out.print("\nAccount balance is: $" + account.getBalance(pin) + "\n\n");
                    System.out.println("0 Back");
                    int userInput = input.nextInt();
                    if (userInput == 0){
                        transactions(input, account);
                    }
                }

                case 4 -> {
                    System.out.println(account);
                    System.out.println("0 Back");
                    int userInput = input.nextInt();
                    if (userInput == 0) {
                        transactions(input, account);
                    }
                }
                default  -> closeAccountApp = -1;
                case 0 -> mainAppMenu();
            }
        }
    }
}
