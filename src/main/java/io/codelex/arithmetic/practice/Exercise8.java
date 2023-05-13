package io.codelex.arithmetic.practice;

public class Exercise8 {
    public static void main(String[] args) {

        calculateTotalPay(7.50, 35);
        calculateTotalPay(8.20, 47);
        calculateTotalPay(10.00, 73);
    }

    public static void calculateTotalPay(double basePay, int hoursWorked) {
        double salary;

        int overTimeHours = hoursWorked - 40;

        if (hoursWorked > 60) {
            System.out.println("Employee has worked too many hours!");
            return;
        }
        if (overTimeHours > 0) {
            salary = 40 * basePay + overTimeHours * basePay * 1.5;
        } else {
            salary = hoursWorked * basePay;
        }
        System.out.println("Salary is " + salary + " USD.");
    }
}
