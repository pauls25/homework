package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int n1 = userInput.nextInt();
        int n2 = userInput.nextInt();

        if (n1 == 15 || n2 == 15) {
            System.out.println(true); // can't return from main method
        } else if ((n1 + n2) == 15) {
            System.out.println(true);
        } else if ((n1 - n2) == 15 || (n2 - n1) == 15) {
            System.out.println(true);
        }

    }
}
