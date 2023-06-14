package io.codelex.summary.generics;

import io.codelex.oop.summary.generics.Printer;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("SimplifiableJUnitAssertion")
public class PrinterTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @After
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    public void testIntegerPrinter() {
        Printer<Integer> integerPrinter = new Printer<>(Integer.valueOf("1"));

        integerPrinter.print();
        Assert.assertEquals("1", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testStringPrinter() {
        Printer<String> stringPrinter = new Printer<>("1");

        stringPrinter.print();
        Assert.assertEquals("1", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testIntegerListPrinter() {

        List<Integer> integerList = new ArrayList<>(Arrays.asList(12, 3, 4));
        Printer<List<Integer>> integerListPrinter = new Printer<>(integerList);

        integerListPrinter.print();
        Assert.assertEquals("[12, 3, 4]", outputStreamCaptor.toString().trim());
    }
}
