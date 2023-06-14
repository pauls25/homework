package io.codelex.oop.summary.generics;

import java.math.BigDecimal;

import static io.codelex.oop.summary.generics.Combiner.combineTwoItems;

public class CombinerTest {
    public static void main(String[] args) {
        System.out.println(combineTwoItems("first Item", 2));
        System.out.println(combineTwoItems(2.0, new BigDecimal("2")));
    }
}
