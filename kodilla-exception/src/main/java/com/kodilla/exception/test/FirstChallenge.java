package com.kodilla.exception.test;

import java.io.IOException;

public class FirstChallenge {

    public double divide(double a, double b) {

        double divideReturn = 0;
        try {
            divideReturn = a / b;
            return divideReturn;
        } catch (ArithmeticException e) {
            System.out.println("You cant divide by 0" + e);
        } finally {
            System.out.println("I try divide: " + a + " / " + b);
        }
        return divideReturn;
    }

    /*
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = firstChallenge.divide(3, 0);
        System.out.println(result);
    }
}
