package io.codelex.demotrivia;

public class EmptyLetterOptions extends Exception {

    public EmptyLetterOptions() {
        super("Ran out of letters for answer options!");
    }
}
