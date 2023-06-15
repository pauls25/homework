package io.codelex.oop.summary.generics;

import java.math.BigDecimal;

public class Combiner {

    public static <T> String combineTwoItems(T first, T second) {
        return "First item: " + first.toString() + "; Second item: " + second.toString();
    }

}
