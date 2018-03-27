package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public final class ArrayUsingIntStream implements ArrayOperations {

    int[] numbers;

    ArrayUsingIntStream(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] getNumbers() { return numbers;}

    @Override
    public double getAverage(int[] numbers) {
        if(numbers.length == 0){
            return 0.0;
        }
        double averageGetFromIntStream;
        IntStream.range(0, numbers.length)
                .map(index -> numbers[index])
                .forEach(System.out::println);
        averageGetFromIntStream = IntStream.range(0, numbers.length)
                .map(index -> numbers[index])
                .average().getAsDouble();
        return averageGetFromIntStream;
    }
}
