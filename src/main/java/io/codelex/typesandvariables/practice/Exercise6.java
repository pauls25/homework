package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please input a single digit number:");
        System.out.println("To stop the program input \"stop\"");

        String value = userInput.nextLine();

        int sum = 0;
        while (!value.equals("stop")){

            if (value.length() > 1) {

                System.out.println("A multiple digit number was inputted!");
                System.out.println("The program will terminate.");
                break;

            } else {
                sum = sum + Integer.parseInt(value);
            }
            System.out.println("Current sum is " + sum);
            value = userInput.nextLine();
        }
    }
}
