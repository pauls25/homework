package io.codelex.typesandvariables.practice;

import java.util.Locale;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please input a string: ");

        String inputtedWord = userInput.nextLine();

        int upperCaseCount = 0;

        for (int i = 0; i < inputtedWord.length(); i++) {
            if (Character.isUpperCase(inputtedWord.charAt(i))){
                upperCaseCount += 1;
            }
        }
        System.out.printf("The given string contains %d upper case letters.%n", upperCaseCount);
    }
}
