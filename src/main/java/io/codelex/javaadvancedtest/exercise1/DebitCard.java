package io.codelex.javaadvancedtest.exercise1;

import java.math.BigDecimal;

public class DebitCard extends Card {
    private final BigDecimal debitWarningLimit = new BigDecimal("10000");

    public DebitCard(String cardNumber, String cardOwner, String CCVCode, BigDecimal initialBalance) {
        super(cardNumber, cardOwner, CCVCode, initialBalance);
    }

    @Override
    public void addMoney(BigDecimal amount) {
        super.addMoney(amount);
        if (getCardBalance().compareTo(debitWarningLimit) > 0) {
            System.out.println("Warning: Too much money");
        }
    }
}
