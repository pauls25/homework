package io.codelex.exceptions.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the numerator: ");
            String numeratorInput = scanner.next();
            if (numeratorInput.charAt(0) == 'q' || numeratorInput.charAt(0) == 'Q') {
                System.exit(0);
            }
            int numerator;
            try {
                numerator = Integer.parseInt(numeratorInput);
            } catch (NumberFormatException e) {
                System.out.println("You entered bad data.");
                System.out.println("Please try again.");
                continue;
            }
            System.out.println("Enter the divisor");
            int divisor = scanner.nextInt();
            try {
                System.out.println(numerator + " / " + divisor + " = " + numerator / divisor);
            } catch (ArithmeticException e) {
                System.out.println("You can't divide " + numerator + " by " + divisor);
            }
        }
    }
}
