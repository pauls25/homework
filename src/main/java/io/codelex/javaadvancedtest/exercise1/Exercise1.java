package io.codelex.javaadvancedtest.exercise1;

import java.math.BigDecimal;

public class Exercise1 {
    public static void main(String[] args) {

        CreditCard creditCard = new CreditCard("000111", "Pēteris Ozols", "000", new BigDecimal("1000.0"));

        // should not raise exception but print warning
        try {
            creditCard.removeMoney(new BigDecimal("950"));
        } catch (NotEnoughFundsException e) {
            System.out.println("Not enough funds for withdrawal");
        }
        System.out.println("Credit card current balance: " + creditCard.getCardBalance());

        //Should throw NotEnoughFunds exception
        try {
            creditCard.removeMoney(new BigDecimal("150"));
        } catch (NotEnoughFundsException e) {
            System.out.println("Not enough funds for withdrawal");
        }

        
        DebitCard debitCard = new DebitCard("000222", "Ieva Liepa", "111", new BigDecimal("1100.0"));
        // should print warning
        debitCard.addMoney(new BigDecimal("10000"));
        System.out.println("Debit card current balance: " + debitCard.getCardBalance());

        //Should throw NotEnoughFunds exception
        try {
            debitCard.removeMoney(new BigDecimal("100000"));
        } catch (NotEnoughFundsException e) {
            System.out.println("Not enough funds for withdrawal");
        }

    }
}
