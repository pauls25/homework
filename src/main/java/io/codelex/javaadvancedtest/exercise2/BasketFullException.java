package io.codelex.javaadvancedtest.exercise2;

public class BasketFullException extends Exception {

    public BasketFullException() {
        super("The basket can contain only 10 items! Basket is full!");
    }
}
