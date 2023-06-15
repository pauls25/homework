package io.codelex.summary.generics;

import io.codelex.oop.summary.generics.StorageHouse;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StorageHouseTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Test
    public void testContainsFirstItem() {
        StorageHouse storageHouse = new StorageHouse(Integer.valueOf("1"));

        String stringItem = "Some string item";
        storageHouse.addMoreItems(stringItem);

        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        storageHouse.addMoreItems(integerList);

        Optional<Object> maybeFirstItem = storageHouse.getMaybeFirstItem();
        Assert.assertTrue(maybeFirstItem.isPresent());
        Assert.assertEquals(1, maybeFirstItem.get());
    }

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @After
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    public void testPrintItems() {
        StorageHouse storageHouse = new StorageHouse(Integer.valueOf("1"));

        String stringItem = "Some string item";
        storageHouse.addMoreItems(stringItem);

        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        storageHouse.addMoreItems(integerList);


        String expectedOutput = "1\r\nSome string item\r\n[1, 2, 3, 4]\r\n";
        storageHouse.printItems();
        Assert.assertEquals(expectedOutput, outputStreamCaptor.toString());
    }
}
