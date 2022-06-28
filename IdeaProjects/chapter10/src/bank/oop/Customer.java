package bank.oop;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final int age;
    private final String gender;
    private final String dateOfBirth;
    private final String phoneNumber;
    private final String email;
    private final List<Account> accountsArray = new ArrayList<>();

    public Customer(String firstName, String middleName, String lastName,
                    Gender gender, int age, String dateOfBirth, String email, String phoneNumber) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gender = String.valueOf(gender);
        this.age = age;
        if (dateOfBirth.contains("-") | dateOfBirth.contains("/")){
            this.dateOfBirth = dateOfBirth;
        } else throw new IllegalArgumentException("invalid date please enter valid date (dd:mm:yy)!!");
        if (!(email.contains("@") | email.contains(".com"))){
            throw new IllegalArgumentException("invalid email");
        } else this.email = email;
        if (phoneNumber.length() < 11){
            throw new IllegalArgumentException("phone number is not valid");
        } else this.phoneNumber = phoneNumber;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setAccountsArray(Account account){
        accountsArray.add(account);
    }

    public List<Account> getAccountsArray() {
        return accountsArray;
    }

    public int getNoOfAccounts(){
        return accountsArray.size();
    }

    public Account findAccount(String email, String pin) {
        for(Account account : accountsArray){
            if(account.getEmail().equalsIgnoreCase(email)){
                if(account.getEmail().equalsIgnoreCase(pin)){
                    return account;
                }
            }
        }
        throw new IllegalArgumentException(String.format("Account with email %s not found", email));
    }

    @Override
    public String toString() {
        return String.format("""
                mame: %s %s %s
                gender: %s
                email: %s
                age: %d
                dob: %s
                phone number: %s
                
                """,getFirstName(),getMiddleName(),getLastName(),getGender(),getEmail(),getAge(),
                getDateOfBirth(),getPhoneNumber());
    }
}
