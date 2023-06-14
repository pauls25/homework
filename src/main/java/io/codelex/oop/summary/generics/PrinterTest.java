package io.codelex.oop.summary.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrinterTest {
    public static void main(String[] args) {
        Printer<Integer> integerPrinter = new Printer<>(Integer.valueOf("1"));
        Printer<String> stringPrinter = new Printer<>("1");
        List<Integer> integerList = new ArrayList<Integer>(Arrays.asList(12, 3, 4));
        Printer<List<Integer>> listPrinter = new Printer<>(integerList);

        integerPrinter.print();
        stringPrinter.print();
        listPrinter.print();
    }
}
