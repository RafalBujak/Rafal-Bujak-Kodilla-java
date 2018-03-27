package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverageWhenArrayHaveSomeNumbers() {
        //given
        ArrayUsingIntStream usingIntStream = new ArrayUsingIntStream(new int[]{1, 4, 5, 8, 9, 15, 43, 15, 89});

        //When
        int[] tempArray = usingIntStream.getNumbers();
        double sum = 0;
        for (int i = 0; i < tempArray.length; i++) {
            sum += tempArray[i];
        }

        double expected = sum / tempArray.length;

        //Then

        double result = usingIntStream.getAverage(new int[]{1, 4, 5, 8, 9, 15, 43, 15, 89});
        Assert.assertEquals(expected, result, 0.01);
    }
    @Test
    public void testGetAverageWhenArrayIsEmpty(){
        //given
        ArrayUsingIntStream usingIntStream = new ArrayUsingIntStream(new int[]{});

        //When
        int[] tempArray = usingIntStream.getNumbers();
        double sum = 0;

        if(tempArray.length == 0){
           sum = 0.0;
        } else {

            for (int i = 0; i < tempArray.length; i++) {
                sum += tempArray[i];
            }
        }

        double expected;
        if (sum == 0.0){
            expected = 0.0;
        } else {
            expected = sum / tempArray.length;
        }

        //Then

        double result = usingIntStream.getAverage(new int[]{});
        Assert.assertEquals(expected, result, 0.01);

    }
}
