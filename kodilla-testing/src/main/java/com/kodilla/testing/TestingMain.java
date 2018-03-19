package com.kodilla.testing;

import com.kodilla.testing.collection.OddNumbersExterminator;
import com.kodilla.testing.user.SimplerUser;
import com.kodilla.testing.calculator.Calculator;

import java.util.ArrayList;

public class TestingMain {

    public static void main(String[] args) {

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


        OddNumbersExterminator numbTempForTest = new OddNumbersExterminator();
        ArrayList<Integer> tempNumbers = new ArrayList<>();

        tempNumbers.add(2);
        tempNumbers.add(4);
        tempNumbers.add(3);
        tempNumbers.add(5);
        tempNumbers.add(8);
        tempNumbers.add(1);



        System.out.println(numbTempForTest.exterminate(tempNumbers));




    }
}
