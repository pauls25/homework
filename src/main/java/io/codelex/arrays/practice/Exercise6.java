package io.codelex.arrays.practice;

import java.util.Arrays;
import java.util.Random;

public class Exercise6 {
    public static void main(String[] args) {

        int[] array1 = new int[10];
        Random random = new Random();
        array1 = random.ints(10, 1, 101).toArray();

        int[] array2 = new int[10];

        System.arraycopy(array1, 0, array2, 0, 10);
        array1[9] = -7;

        System.out.println("First array:  " + Arrays.toString(array1));
        System.out.println("Second array:  " + Arrays.toString(array2));
    }
}
