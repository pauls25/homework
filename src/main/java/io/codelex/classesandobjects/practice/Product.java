package io.codelex.classesandobjects.practice;

import java.util.Locale;

public class Product {
    private String name;
    private double priceAtStart;
    private int amountAtStart;

    public Product(String name, double priceAtStart, int amountAtStart) {
        this.name = name;
        this.priceAtStart = priceAtStart;
        this.amountAtStart = amountAtStart;
    }

    public void printProduct() {
        System.out.printf(Locale.ENGLISH, "%s, price %.2f, amount %d%n", name, priceAtStart, amountAtStart);
    }
}
