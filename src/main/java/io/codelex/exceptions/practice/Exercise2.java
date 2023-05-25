package io.codelex.exceptions.practice;

public class Exercise2 {
    public static void main(String[] args) {
        try {
            methodA();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    public static void methodA() throws ArithmeticException {
        try {
            methodB();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    public static void methodB() throws ArithmeticException {
        try {
            methodC();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    public static void methodC() throws ArithmeticException {
        int a = 1;
        int b = 0;
        try {
            int c = a / b;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

    }
}
