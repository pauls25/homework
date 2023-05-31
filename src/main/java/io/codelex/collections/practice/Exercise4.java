package io.codelex.collections.practice;

import java.util.*;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Start entering names one per line! ");
        Set<String> names = new HashSet<>();

        while (true) {
            System.out.print("Enter name: ");
            String input = userInput.nextLine();

            if (input.isEmpty()) {
                break;
            }
            names.add(input);
        }
        ArrayList<String> namesArray = new ArrayList<>(names);
        Collections.sort(namesArray);

        System.out.print("Unique names given: ");
        for (String name : namesArray) {
            System.out.print(name + " ");
        }
    }
}
