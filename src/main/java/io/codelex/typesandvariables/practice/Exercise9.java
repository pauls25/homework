package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {

        int METERS_IN_MILE = 1609;

        Scanner userInput = new Scanner(System.in);

        // User input
        System.out.println("Input a distance in meters! ");
        int distanceInMeters = userInput.nextInt();

        System.out.println("Input time in hours: ");
        int numberOfHours = userInput.nextInt();
        System.out.println("Input time in minutes: ");
        int numberOfMinutes = userInput.nextInt();
        System.out.println("Input time in seconds: ");
        int numberOfSeconds = userInput.nextInt();

        // Conversions
        int distanceInMiles = distanceInMeters / METERS_IN_MILE;
        int distanceInKM = distanceInMeters / 1000;
        int timeInSeconds = numberOfHours * 60 * 60 + numberOfMinutes * 60 + numberOfSeconds;
        int timeInHours = (timeInSeconds /3600);

        // Outut
        System.out.printf("Your speed in meters/second is %f%n",(float)(distanceInMeters / timeInSeconds));
        System.out.printf("Your speed in km/h is %f%n",(float)(distanceInKM / timeInHours));
        System.out.printf("Your speed in miles/h is %f%n",(float)(distanceInMiles / timeInHours));
    }
}
