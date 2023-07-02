package io.codelex.classesandobjects.practice;

public class SavingsAccount {

    private double accountBalance;
    private double annualInterestRate;
    private double totalDeposited = 0;
    private double totalWithdrawn = 0;
    private double interestEarned = 0;

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public double getTotalDeposited() {
        return totalDeposited;
    }

    public double getTotalWithdrawn() {
        return totalWithdrawn;
    }

    public double getInterestEarned() {
        return interestEarned;
    }

    public SavingsAccount(double startingBalance) {
        this.accountBalance = startingBalance;
    }

    public void addMonthlyInterest() {
        double interestAmount = this.accountBalance * (this.annualInterestRate / 12) / 100;
        this.accountBalance += interestAmount;
        this.interestEarned += interestAmount;
    }

    public void addDeposit(double depositAmount) {
        this.accountBalance += depositAmount;
        this.totalDeposited += depositAmount;
    }

    public void subtractWithdrawn(double withdrawalAmount) {
        this.accountBalance -= withdrawalAmount;
        this.totalWithdrawn += withdrawalAmount;
    }

}
