package io.codelex.oop.summary.generics;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Printer<T> {

    private final T thingToPrint;


    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }

    public T getThingToPrint() {
        return thingToPrint;
    }
}
