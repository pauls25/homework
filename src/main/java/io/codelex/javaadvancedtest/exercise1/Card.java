package io.codelex.javaadvancedtest.exercise1;

import java.math.BigDecimal;

public abstract class Card {
    private final String cardNumber;
    private final String cardOwner;
    private final String CCVCode;
    private BigDecimal cardBalance;

    public Card(String cardNumber, String cardOwner, String CCVCode, BigDecimal initialBalance) {
        this.cardNumber = cardNumber;
        this.cardOwner = cardOwner;
        this.CCVCode = CCVCode;
        this.cardBalance = initialBalance;
    }


    public void addMoney(BigDecimal amount) {
        cardBalance = getCardBalance().add(amount);
    }

    public void removeMoney(BigDecimal amount) throws NotEnoughFundsException {
        if (getCardBalance().subtract(amount).compareTo(BigDecimal.ZERO) < 0) {
            throw new NotEnoughFundsException();
        } else {
            cardBalance = getCardBalance().subtract(amount);
        }
    }

    public BigDecimal getCardBalance() {
        return this.cardBalance;
    }
}
