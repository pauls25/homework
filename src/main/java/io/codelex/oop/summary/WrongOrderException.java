package io.codelex.oop.summary;

public class WrongOrderException extends Exception {

    public WrongOrderException() {
        super("Invoice created with an empty order list!");
    }
}
