package Bank;

import User.User;

public class BankAccount {

    //Variables
    private User owner;
    private Currency currency;
    private double balance;
    private double interestRate;
    private double creditLimit;

    //Functions
    public BankAccount(User owner, Currency currency, double balance, double interestRate, double creditLimit) {
        this.owner = owner;
        this.currency = currency;
        this.balance = balance;
        this.interestRate = interestRate;
        this.creditLimit = creditLimit;
    }
    public void performTransaction(double amount) {
        if (amount > 0) {
            deposit(amount);
        } else {
            withdraw(amount);
        }
    }
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance + creditLimit) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void convertBalance(Currency newCurrency, double amount) {
        double newBalance = currency.convert(amount, currency, newCurrency);
        balance = newBalance;
        currency = newCurrency;
    }

    public void displayAccountInfo() {
        System.out.println("Account Owner: " + owner.getFullName() + ", Email: " + owner.getEmail());
        System.out.println("Balance: " + balance + " " + currency.getCode());
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Credit Limit: " + creditLimit);
    }
}
