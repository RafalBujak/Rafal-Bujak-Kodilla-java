package com.kodilla.testing.collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.AfterClass;

import java.util.ArrayList;

public class CollectionTestSuite {
    // TODO

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test

    public void testOddNumbersExterminatorEmptyList(){
         /*
        check if the class behaves correctly when the list is empty
         */

        // Given
        OddNumbersExterminator exterminatorTest = new OddNumbersExterminator();
        // When
        ArrayList <Integer> newArrayListForClassOddNumbersExterminator = new ArrayList<>();
        ArrayList <Integer> results = new ArrayList<>();
        // Then
        Assert.assertEquals(exterminatorTest.exterminate(newArrayListForClassOddNumbersExterminator), results);


    }

    @Test

    public void testOddNumbersExterminatorNormalList(){


         /*
        check if the class behaves correctly when the list contains even and odd numbers
         */


        // Given
        OddNumbersExterminator exterminatorTest = new OddNumbersExterminator();

        // When
        ArrayList <Integer> newArrayListForClassOddNumbersExterminator = new ArrayList<>();

        // initialization ArrayList for test

        newArrayListForClassOddNumbersExterminator.add(2);
        newArrayListForClassOddNumbersExterminator.add(1);
        newArrayListForClassOddNumbersExterminator.add(3);
        newArrayListForClassOddNumbersExterminator.add(4);
        newArrayListForClassOddNumbersExterminator.add(5);


        // New Array List for checking result of Test

        ArrayList <Integer> results = new ArrayList<>();

        // Checking if return result is OK

        results = exterminatorTest.exterminate(newArrayListForClassOddNumbersExterminator);


        // Then
        Assert.assertEquals(exterminatorTest.exterminate(newArrayListForClassOddNumbersExterminator), results);

    }
}
