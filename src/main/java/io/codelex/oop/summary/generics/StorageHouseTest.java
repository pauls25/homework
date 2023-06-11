package io.codelex.oop.summary.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StorageHouseTest {
    public static void main(String[] args) {
        StorageHouse storageHouse = new StorageHouse(Integer.valueOf("1"));

        String stringItem = "Some string item";
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        storageHouse.addMoreItems(stringItem);
        storageHouse.addMoreItems(integerList);

        Optional<Object> firstItem = storageHouse.getMaybeFirstItem();
        System.out.println("Type of maybe first item" + firstItem.get().getClass());
        System.out.println("Value of maybe first item: " + firstItem.get());
        System.out.println("All items: ");
        storageHouse.printItems();
    }
}
