package io.codelex.javaadvancedtest.exercise1;

public class NotEnoughFundsException extends Exception {
    public NotEnoughFundsException() {
        super("Warning: Low funds");
    }
}
