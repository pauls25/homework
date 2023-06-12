package io.codelex.classesandobjects.practice;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount ben = new BankAccount("Benson", 17.25);
        System.out.println(ben);

        BankAccount benNegative = new BankAccount("Benson", -17.25);
        System.out.println(benNegative);
    }
}
