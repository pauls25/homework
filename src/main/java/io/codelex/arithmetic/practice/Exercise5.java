package io.codelex.arithmetic.practice;

import java.util.Random;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;

        int randInt = (int) ((Math.random() * (max - min)) + min);

        System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
        Scanner userInput = new Scanner(System.in);
        int userGuess = userInput.nextInt();

        if (userGuess == randInt) {
            System.out.println("You guessed correctly! :O");
        } else if (userGuess > randInt) {
            System.out.println("Too high");
        } else {
            System.out.println("Too low");
        }
    }
}
