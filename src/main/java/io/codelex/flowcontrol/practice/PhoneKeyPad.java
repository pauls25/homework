package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {

/*
        Letter to number mapping:
        ABC(2), DEF(3), GHI(4), JKL(5),
        MNO(6), PQRS(7), TUV(8), WXYZ(9)
*/

        Scanner input = new Scanner(System.in);
        System.out.println("Please input a string!");

        String string = input.nextLine().toUpperCase();
        String[] splitString = string.split("");

        String numberString = "";
        for (String s : splitString) {
            switch (s) {
                case "A":
                case "B":
                case "C":
                    numberString = numberString.concat("2");
                case "D":
                case "E":
                case "F":
                    numberString = numberString.concat("3");
                case "G":
                case "H":
                case "I":
                    numberString = numberString.concat("4");
                case "J":
                case "K":
                case "L":
                    numberString = numberString.concat("5");
                case "M":
                case "N":
                case "O":
                    numberString = numberString.concat("6");
                case "P":
                case "R":
                case "S":
                    numberString = numberString.concat("7");
                case "T":
                case "U":
                case "V":
                    numberString = numberString.concat("8");
                case "W":
                case "X":
                case "Y":
                case "Z":
                    numberString = numberString.concat("9");
                default:
                    System.out.println("bad letter inputted");
            }
        }
        System.out.println(numberString);
    }
}
