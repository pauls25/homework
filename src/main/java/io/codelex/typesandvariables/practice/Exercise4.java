package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your name: ");
        String name = scanner.nextLine();

        System.out.println("Input your year of birth: ");
        int yearOfBirth = scanner.nextInt();

        System.out.printf("My name is %s and I was born in %d.", name, yearOfBirth);
    }
}
