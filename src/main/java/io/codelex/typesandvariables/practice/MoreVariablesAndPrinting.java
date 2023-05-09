package io.codelex.typesandvariables.practice;

import java.text.DecimalFormat;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {
        String name;
        String eyes;
        String teeth;
        String hair;
        int age;
        int heightInInches;
        int weightInPounds;
        double heightInCM;
        double weightInKG;

        double INCH_TO_CM = 2.54D;
        double POUNDS_TO_KG = 0.453592D;

        name = "Zed A. Shaw";
        age = 35;
        heightInInches = 74;
        heightInCM = heightInInches * INCH_TO_CM;
        weightInPounds = 180;
        weightInKG = weightInPounds * POUNDS_TO_KG;
        eyes = "Blue";
        teeth = "White";
        hair = "Brown";

        DecimalFormat decimalFormat = new DecimalFormat("##.##");

        System.out.println("Let's talk about " + name + ".");
        System.out.println("He's " + heightInCM + " centimeters tall.");
        System.out.println("He's " + weightInKG + " kilograms heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
        System.out.println("His teeth are usually " + teeth + " depending on the coffee.");

        System.out.printf("If I add %d, %.2f, and %.2f I get %.2f.%n",
                age, heightInCM, weightInKG, (age + heightInCM + weightInKG));
    }
}