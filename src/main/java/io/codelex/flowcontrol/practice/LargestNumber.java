package io.codelex.flowcontrol.practice;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.Collection;
import java.util.Scanner;

public class LargestNumber {

    //TODO: Write a Java program to to find the largest of three numbers.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        int num1 = in.nextInt();

        System.out.print("Input the 2nd number: ");
        int num2 = in.nextInt();

        System.out.print("Input the 3rd number: ");
        int num3 = in.nextInt();

        int[] nums = {num1, num2, num3};

        System.out.println("Input the 1st number: " + num1);
        System.out.println("Input the 2st number: " + num2);
        System.out.println("Input the 3st number: " + num3);

        System.out.println("Largest of 3 numbers is: " + NumberUtils.max(nums));
    }

}
