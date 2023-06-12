package io.codelex.classesandobjects.practice;

// Each BankAccount object represents one user's account
// information including name and balance of money.

public class BankAccount {
    public String name;
    public double balance;


    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public final void deposit(double amount) {
        this.balance += amount;
    }

    public final void withdraw(double amount) {
        this.balance -= amount;
    }

    @Override
    public String toString() {
        String balanceString;

        if (balance < 0) {
            balanceString = name + ", -$" + balance * -1;
        } else {
            balanceString = name + ", " + "$" + balance;
        }
        return balanceString;
    }
}
