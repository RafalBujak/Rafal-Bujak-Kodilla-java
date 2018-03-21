package com.kodilla.testing;

import com.kodilla.testing.collection.OddNumbersExterminator;

import com.kodilla.testing.forum.statistics.StatisticsCounter;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.ShapeCollector;
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

        OddNumbersExterminator exterminatorTest = new OddNumbersExterminator();

           ArrayList <Integer> testExterminator = new ArrayList<>();

        // initialization ArrayList for test

        testExterminator.add(2);
        testExterminator.add(3);
        testExterminator.add(3);
        testExterminator.add(4);
        testExterminator.add(7);
        testExterminator.add(9);
        testExterminator.add(1);
        testExterminator.add(2);
        testExterminator.add(4);
        testExterminator.add(15);
        testExterminator.add(38);
        testExterminator.add(59);
        testExterminator.add(48);
        testExterminator.add(2);





        System.out.println(exterminatorTest.exterminate(testExterminator));


        StatisticsCounter counter = new StatisticsCounter(null);
        counter.showStatistics();
    }

}
