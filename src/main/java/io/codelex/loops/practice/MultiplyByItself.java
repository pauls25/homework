package io.codelex.loops.practice;

import java.util.Scanner;

public class MultiplyByItself {

    public static void main(String[] args) {
        int i = 2;
        int n;

        System.out.print("Input number of terms : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        // todo - complete loop to multiply i with itself n times, it is NOT allowed to use Math.pow()
        for (int j = 0; j < n; j++) {
            i *= i;
            System.out.println("Now i equals: " + i);
        }
    }

}
