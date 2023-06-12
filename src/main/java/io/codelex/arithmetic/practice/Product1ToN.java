package io.codelex.arithmetic.practice;

public class Product1ToN {
    public static void main(String[] args) {
        int product = 1;
        int upperBound = 10;

        for (int number = 1; number <= upperBound; ++number) {
            product *= number;
            System.out.printf("The product is %d.%n", product);
        }
    }
}
