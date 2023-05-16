package io.codelex.classesandobjects.practice;

// Each BankAccount object represents one user's account
// information including name and balance of money.

public class BankAccount {
    public String name;
    public double balance;

    public static void main(String[] args) {
        BankAccount ben = new BankAccount("Benson", 17.25);
        System.out.println(ben);

        BankAccount benNegative = new BankAccount("Benson", -17.25);
        System.out.println(benNegative);
    }

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
