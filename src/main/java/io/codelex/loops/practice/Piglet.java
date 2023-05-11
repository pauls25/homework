package io.codelex.loops.practice;

import java.util.Scanner;

public class Piglet {
    public static void main(String[] args) {
        System.out.println("Let's play Piglet with a 6-sided dice");
        int score = 0;
        boolean playAgain = false;

        while (true) {
            int diceRoll = rollDice();

            if (diceRoll == 1) {
                System.out.println("You rolled a 1! Game over :( ");
                score = 0;
                System.out.println("Your score is: " + score);
                break;
            } else {
                score += diceRoll;
                System.out.printf("You rolled a %d! Roll again? ", diceRoll);

                Scanner input = new Scanner(System.in);
                String choice = input.next();

                if (choice.equals("n")) {
                    System.out.println("Your score is: " + score);
                    break;
                } else if (choice.equals("y")) {
                    continue;
                } else {
                    System.out.println("Please input only 'y' or 'n'!");
                }
            }
        }
    }

    public static int rollDice() {
        return (int) ((Math.random() * (6 - 1)) + 1);
    }

}
