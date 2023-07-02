package io.codelex.collections.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please input a single number!");
        String[] digitArray = String.valueOf(userInput.nextInt()).split("");

        while (digitArray.length >= 1) {
            String line = "";
            int sum = 0;
            String stringElem = "";
            List<Integer> elements = new ArrayList<>();

            List<String> stringElements = new ArrayList<>();

            for (int i = 0; i < digitArray.length; i++) {

                stringElem = Integer.parseInt(digitArray[i]) + "^2";
                stringElements.add(stringElem);
                sum += Math.pow(Integer.parseInt(digitArray[i]), 2);
            }

            line = String.join(" + ", stringElements) + " = " + sum;
            System.out.println(line);
            digitArray = String.valueOf(sum).split("");

            if (digitArray.length == 1) {
                break;
            }
        }
    }
}
