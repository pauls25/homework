package io.codelex.enums.practice;

import java.util.*;

public class Exercise2 {
    private static final List<String> validUserInput = new ArrayList<String>(
            Arrays.asList("p", "s", "t", "q"));
    private static final String computerChoice = getComputerChoice();
    private static boolean gameIsRunning = true;

    public static void main(String[] args) {
        System.out.println("Let us begin...\n" + "Scissor-Paper-Stone");
        Scanner userInput = new Scanner(System.in);

        while (gameIsRunning) {
            handleUserInput(userInput);
        }
    }

    public enum choices {
        SCISSORS("s"), PAPER("p"), STONE("t");
        private final String shortName;

        choices(String shortName) {
            this.shortName = shortName;
        }

        public String getShortName() {
            return shortName;
        }
    }

    private static void handleUserInput(Scanner userInput) {
        System.out.print("\tYour turn (Enter s for scissor, p for paper, t for stone, q to quit): ");

        String userChoice = userInput.nextLine();
        if (!validUserInput.contains(userChoice)) {
            System.out.println("\n\tInvalid input, try again...");

        } else {
            if (userChoice.equals(computerChoice)) {
                System.out.println("\tIts a draw");
                endGame();

            } else if (userChoice.equals("p") && computerChoice.equals("t") ||
                    userChoice.equals("s") && computerChoice.equals("p") ||
                    userChoice.equals("t") && computerChoice.equals("s")) {
                System.out.println("\tYou won!");
                endGame();

            } else if (userChoice.equals("p") && computerChoice.equals("s") ||
                    userChoice.equals("t") && computerChoice.equals("p") ||
                    userChoice.equals("s") && computerChoice.equals("t")) {
                System.out.println("\tYou lost!");
                endGame();
            }
        }
    }

    private static String getComputerChoice() {
        Random random = new Random();
        choices computerChoice = choices.values()[random.nextInt(choices.values().length)];
        return computerChoice.getShortName();
    }

    private static void endGame() {
        gameIsRunning = false;
    }
}
