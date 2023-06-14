package io.codelex.javaadvancedtest.exercise2;

public class BasketEmptyException extends Exception {

    public BasketEmptyException() {
        super("Basket is already empty!");
    }
}
