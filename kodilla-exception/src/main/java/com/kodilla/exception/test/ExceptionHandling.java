package com.kodilla.exception.test;

public class ExceptionHandling extends Exception {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            System.out.println(secondChallenge.propablyIWillThrowException(2, 1.0));
        } catch (Exception e) {
            System.out.println("Sorry this is not OK");
        } finally {
            System.out.println("I can do something for you :) ");
        }
    }
}
