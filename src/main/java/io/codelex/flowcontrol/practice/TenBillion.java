package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class TenBillion {

    //TODO: Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer number less than ten billion: ");

//        todo - check if Long
        if (in.hasNextLong()) {
            long n = in.nextLong();
            if (n < 0) {
                n *= -1;
            }
            if (n >= 10_000_000_000L) {
                System.out.println("Number is greater or equals 10,000,000,000!");
            } else {
                int length = Long.toString(n).length();

                System.out.println("Number of digits in the number: " + length);
            }
        } else {
            System.out.println("The number is not a long");
        }
    }
}


