package io.codelex.loops.practice;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input a max value!");
        int timesToPrint = in.nextInt();

        int i = 1;
        while (i <= timesToPrint) {
            for (int j = 0; j < 20; j++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.print("FizzBuzz ");
                    i++;
                } else if (i % 3 == 0) {
                    System.out.print("Fizz ");
                    i++;
                } else if (i % 5 == 0) {
                    System.out.print("Buzz ");
                    i++;
                } else {
                    System.out.print(i + " ");
                    i++;
                }
            }
            System.out.print("\n");
        }
    }
}
