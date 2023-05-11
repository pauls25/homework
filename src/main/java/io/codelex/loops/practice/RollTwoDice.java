package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class RollTwoDice {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Desired sum: ");
        int desiredSum = userInput.nextInt();

        while (true) {
            Random random = new Random();
            int first = random.nextInt(1, 7);
            int second = random.nextInt(1, 7);

            int guessedSum = first + second;
            System.out.printf("%d and %d = %d%n", first, second, guessedSum);
            if (guessedSum == desiredSum) {
                break;
            }
        }
    }
}
