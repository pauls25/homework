package io.codelex.exceptions.practice;

public class NonPositiveNumberException extends Exception {
    public NonPositiveNumberException() {
        super("A negative number was passed to Double!");
    }

}
