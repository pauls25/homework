package io.codelex.loops.practice;

public class AsciiFigure {
    public static void main(String[] args) {

        final int HEIGHT = 7;

        for (int i = 0; i < HEIGHT; i++) {
            String stars = "****".repeat(i);
            String firstDashes = "////".repeat(HEIGHT - 1 - i);
            String secondDashes = "\\\\\\\\".repeat(HEIGHT - 1 - i);

            String lineToPrint = firstDashes + stars + stars + secondDashes;
            System.out.println(lineToPrint);
        }
    }

}
