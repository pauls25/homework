package io.codelex.arithmetic.practice;

public class CozaLozaWoza {
    public static void main(String[] args) {

        int i = 1;
        while (i < 111) {
            for (int l = 0; l < 10; l++) {
                for (int j = 0; j < 11; j++) {
                    if (i % 3 == 0 && i % 5 == 0) {
                        System.out.print("CozaLoza ");
                    } else if (i % 5 == 0 && i % 7 == 0) {
                        System.out.print("LozaWoza ");
                    } else if (i % 3 == 0) {
                        System.out.print("Coza ");
                    } else if (i % 5 == 0) {
                        System.out.print("Loza ");
                    } else if (i % 7 == 0) {
                        System.out.print("Woza ");
                    } else {
                        System.out.print(i + " ");
                    }
                    i += 1;

                }
                System.out.print("\n");
            }
        }
    }
}
