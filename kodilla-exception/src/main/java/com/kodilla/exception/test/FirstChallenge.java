package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(int a, int b) {

        double resultOfDividing = 0;
        try {
            if (b == 0) {
                // DO nothing and go to block catch, else divide a / b
            }
            resultOfDividing = a / b;
            return resultOfDividing;
        } catch (ArithmeticException e) {
            System.out.println("You cant divide by 0 " + e);
        } finally {
            System.out.println("I try divide: " + a + " / " + b);
        }
        return resultOfDividing;
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
