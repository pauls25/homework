package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();

        String[] stringElements = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla", "Red", "Blue", "Green"};

        for (String elem : stringElements) {
            strings.add(elem);
        }

        strings.add(4, "FifthElement");

        strings.add(strings.size() - 1, "LastElement");

        Collections.sort(strings);

        if (strings.contains("Foobar")) {
            System.out.println("Contains 'Foobar'");
        } else {
            System.out.println("Doesn't contain 'Foobar'");
        }

        for (String s : strings) {
            System.out.println(s);
        }
    }

}
