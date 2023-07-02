package io.codelex.arrays.practice;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a min number");
        int minNumber = input.nextInt();

        System.out.println("Please enter a max number");
        int maxNumber = input.nextInt();

        int[] myArray;
        int sum = 0;

        int arraySize = maxNumber - minNumber + 1;
        myArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            myArray[i] = minNumber + i;
            sum += myArray[i];
        }

        System.out.println("The sum is " + sum);
    }
}
