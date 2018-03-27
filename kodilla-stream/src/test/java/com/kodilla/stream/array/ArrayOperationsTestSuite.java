package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
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

        OptionalDouble result = usingIntStream.getAverage(new int[]{1, 4, 5, 8, 9, 15, 43, 15, 89});
        Assert.assertEquals(expected, result.getAsDouble(), 0.01);
    }
}
