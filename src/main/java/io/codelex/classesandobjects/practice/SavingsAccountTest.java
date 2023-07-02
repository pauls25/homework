package io.codelex.classesandobjects.practice;

import java.util.Scanner;

public class SavingsAccountTest {
    public static void main(String[] args) {

        //
        Scanner userInput = new Scanner(System.in);
        System.out.print("How much money is in the account?: ");
        double startingBalance = userInput.nextDouble();

        System.out.print("Enter the annual interest rate: ");
        double annualInterestRate = userInput.nextFloat();

        System.out.print("How long has the account been opened?: ");
        int months = userInput.nextInt();

        SavingsAccount acc = new SavingsAccount(startingBalance);
        acc.setAnnualInterestRate(annualInterestRate);

        for (int m = 0; m < months; m++) {
            System.out.print(String.format("Enter amount deposited for month: %d: ", m + 1));
            acc.addDeposit(userInput.nextDouble());

            System.out.print(String.format("Enter amount withdrawn for %d: ", m + 1));
            acc.subtractWithdrawn(userInput.nextDouble());

            acc.addMonthlyInterest();
        }

        // totals
        System.out.println("Total deposited: $" + acc.getTotalDeposited());
        System.out.println("Total withdrawn: $" + acc.getTotalWithdrawn());
        System.out.println("Interest earned: $" + acc.getInterestEarned());
        System.out.println("Ending balance: $" + acc.getAccountBalance());
    }
}
