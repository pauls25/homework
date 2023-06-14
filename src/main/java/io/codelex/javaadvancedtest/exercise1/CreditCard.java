package io.codelex.javaadvancedtest.exercise1;

import java.math.BigDecimal;

public class CreditCard extends Card {
    private final BigDecimal cardWarningLimit = new BigDecimal("100.0");

    public CreditCard(String cardNumber, String cardOwner, String CCVCode, BigDecimal initialBalance) {
        super(cardNumber, cardOwner, CCVCode, initialBalance);
    }

    @Override
    public void removeMoney(BigDecimal amount) throws NotEnoughFundsException {
        super.removeMoney(amount);
        if (getCardBalance().compareTo(cardWarningLimit) < 0) {
            System.out.println("Warning: Low funds");
        }
    }
}
