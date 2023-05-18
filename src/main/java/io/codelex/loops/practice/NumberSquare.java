package io.codelex.loops.practice;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Min? ");
        int min = userInput.nextInt();
        System.out.print("Max? ");
        int max = userInput.nextInt();

        // create array of ints
        int[] intArray = IntStream.rangeClosed(min, max).toArray();

        for (int i = 0; i < max; i++) {

            // print out the array by elements
            for (int j = 0; j < (intArray.length); j++) {
                System.out.print(intArray[j]);
            }
            System.out.print("\n");

            // reorder array elements
            int firstElement = intArray[0];
            for (int j = 0; j < (intArray.length - 1); j++) {
                intArray[j] = intArray[j + 1];
            }
            intArray[max - 1] = firstElement;
        }
    }
}
