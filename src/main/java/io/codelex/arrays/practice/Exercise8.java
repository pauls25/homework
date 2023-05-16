package io.codelex.arrays.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise8 {

    private static final String[] WORDS = {"codelex", "programing", "apple"};
    private static final int N_MISTAKES_ALLOWED = 4;
    private static int errorsLeft = N_MISTAKES_ALLOWED;
    //    private static String currentGuess;
    private static ArrayList<String> missedGuesses = new ArrayList<String>();
    private static String[] displayArray;
    public static String[] wordStringArray;
    private static boolean gameIsWon = false;


    public static void main(String[] args) {

        // pick work at random
        Random random = new Random();
        int wordIndex = random.nextInt(WORDS.length);
        String wordToGuess = WORDS[wordIndex];
        wordStringArray = wordToGuess.split("");


        System.out.println("You have " + N_MISTAKES_ALLOWED + " mistakes allowed");

        Scanner keyboard = new Scanner(System.in);

        // game loop
        initGame(wordToGuess);
        displayGameAtStart(displayArray, missedGuesses);
        while (!gameIsWon) {
            String guess = makeGuess(keyboard);
            checkGuessedLetter(guess);
            displayGame(displayArray, missedGuesses, guess);
            checkIfGameIsWon(displayArray);
        }
    }

    public static void initGame(String wordToGuess) {
        // create array with "_" that will be filled with guessed letters
        displayArray = new String[wordToGuess.length()];

        Arrays.fill(displayArray, "_");
    }

    public static String makeGuess(Scanner keyboard) {
        // it is assumed that only one letter will be inputted by user.
        return String.valueOf(keyboard.nextLine().charAt(0));
    }

    public static void checkGuessedLetter(String guess) {

        ArrayList<Integer> matchedLetterIndexes = new ArrayList<>();
        if (errorsLeft <= 0) {
            System.out.println("You ran out of tries! Game Over!");
            System.exit(0);
        }
        for (int i = 0; i < wordStringArray.length; i++) {
            if (wordStringArray[i].equals(guess)) {
                matchedLetterIndexes.add(i);
                displayArray[i] = guess;
            }
        }
        if (matchedLetterIndexes.isEmpty()) {
            missedGuesses.add(guess);
            errorsLeft--;
        }
    }

    public static void checkIfGameIsWon(String[] displayArray) {

        // check if display array has any hidden letters
        int underscoreCount = 0;
        for (String elem : displayArray) {
            if (elem.equals("_")) {
                underscoreCount += 1;
            }
        }
        // game is won when there aren't any hidden letters left
        if (underscoreCount == 0) {
            gameIsWon = true;
            System.out.println("You won the game! Congratulations!");
        }
    }

    public static void displayGame(String[] displayArray, ArrayList<String> misses, String guess) {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        String displayArrayString = String.join(" ", displayArray);

        System.out.println("Word: " + displayArrayString);

        System.out.println("Misses: " + String.join("", misses));

        System.out.println("Guess: " + guess);

    }

    public static void displayGameAtStart(String[] displayArray, ArrayList<String> misses) {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        String displayArrayString = Arrays.stream(displayArray)
                .collect(Collectors.joining(" "));

        System.out.println("Word: " + displayArrayString);

        System.out.println("Misses: " + String.join("", misses));

        System.out.println("Guess: ");

    }


}
