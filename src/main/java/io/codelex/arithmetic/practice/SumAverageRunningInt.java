package io.codelex.arithmetic.practice;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        double average;
        int lowerBound = 1;
        int upperBound = 100;

        for (int number = lowerBound; number <= upperBound; ++number) {
            sum += number;
            average = (double) sum / number;
            System.out.printf("The sum of 1 to %d is %d.%n", number, sum);
            System.out.printf("The average is %.1f.%n", average);
        }
    }
}
