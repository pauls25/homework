package io.codelex.oop.summary.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StorageHouse {

    List<Object> items = new ArrayList<>();

    public StorageHouse(Object firstItem) {
        items.add(firstItem);
    }

    public void addMoreItems(Object item) {
        items.add(item);
    }

    public Optional<Object> getMaybeFirstItem() {
        return items.stream().findFirst();
    }

    public void printItems() {
        items.forEach(System.out::println);
    }

}
