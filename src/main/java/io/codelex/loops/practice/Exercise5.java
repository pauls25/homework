package io.codelex.loops.practice;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word:");
        String firstWord = input.nextLine();

        System.out.println("Enter second word:");
        String secondWord = input.nextLine();

        String dots = ".".repeat(30 - firstWord.length() - secondWord.length());
        System.out.printf("%s%s%s", firstWord, dots, secondWord);

    }
}
