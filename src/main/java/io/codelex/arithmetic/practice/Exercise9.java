package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Input your weight in kg: ");
        int weightKG = userInput.nextInt();
        System.out.println("Input your height in meters: ");
        double heightMeters = userInput.nextDouble();

        double KG_TO_POUNDS = 2.20462262185;
        double METERS_TO_INCHES = 39.3700787402;
        double weightInPounds = weightKG * KG_TO_POUNDS;
        double heightInInches = heightMeters * METERS_TO_INCHES;

        double BMI = weightInPounds * 703 / Math.pow(heightInInches, 2);
        System.out.println("Your BMI is " + BMI);

        if (BMI < 18.5) {
            System.out.println("Your BMI is too low, you are underweight");
        } else if ((18.5 <= BMI) && (BMI < 26)) {
            System.out.println("Your BMI is good");
        } else if (BMI >= 26) {
            System.out.println("Your BMI is too high!");
        }

    }
}
