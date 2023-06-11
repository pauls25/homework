package io.codelex.oop.summary;

public class BadFoodException extends Exception {
    public BadFoodException() {
        super("An expired FoodItem was almost added to items list!");
    }
}
