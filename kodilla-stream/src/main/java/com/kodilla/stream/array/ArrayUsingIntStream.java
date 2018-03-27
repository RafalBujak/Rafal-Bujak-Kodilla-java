package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public final class ArrayUsingIntStream implements ArrayOperations {

    int[] numbers;

    ArrayUsingIntStream(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] getNumbers() {
        return numbers;
    }

    @Override
    public OptionalDouble getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .map(index -> numbers[index])
                .forEach(System.out::println);
        return IntStream.range(0, numbers.length)
                .map(index -> numbers[index])
                .average();
    }
}
