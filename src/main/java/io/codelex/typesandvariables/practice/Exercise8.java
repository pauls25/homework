package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a some number of minutes! ");

        double numberOfMinutes = input.nextDouble();

        int MINUTES_IN_YEAR = 60 * 24 * 356;

        long numberOfYears = (long) (numberOfMinutes / MINUTES_IN_YEAR);
        long numberOfDays = (long)(numberOfMinutes / 60 / 24) % 365;

        System.out.printf("%d minutes is equal to %d years and %d days .%n",
                (int) numberOfMinutes, numberOfYears, numberOfDays);
    }
}
