package com.kodilla.testing;

import com.kodilla.testing.user.SimplerUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {
       SimplerUser simpleUser = new SimplerUser("The User");

       String result = simpleUser.getUserName();

       if (result.equals("The User")) {
           System.out.println("Test OK");
       } else {
           System.out.println("Error");
       }

       // New unit test for class Calculator

        Calculator calculate = new Calculator(5, 7);

       // Test for add methods
       int resultOfCalculationAdd = calculate.getResultAdding();

       if (resultOfCalculationAdd == calculate.add()){
           System.out.println("Test OK for adding a + b = " + calculate.add());
       } else {
           System.out.println("Test was not OK fo adding");
       }

       // Test for subtraction methods

        int resultOfCalculationSubtract = calculate.getResultsubtraction();

        if (resultOfCalculationSubtract == calculate.subtract()){
            System.out.println("Test OK for subtract a - b = " + calculate.subtract());
        } else {
            System.out.println("Test was not OK fo subtract");
        }

    }
}
