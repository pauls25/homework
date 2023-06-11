package io.codelex.oop.summary.generics;

import java.math.BigDecimal;

public class Combiner {

    public static void main(String[] args) {
        System.out.println(combineTwoItems("first Item", 2));
        System.out.println(combineTwoItems(2.0, new BigDecimal("2")));
    }

    public static <T> String combineTwoItems(T first, T second) {
        return "First item: " + first.toString() + "; Second item: " + second.toString();
    }

}
