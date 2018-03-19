package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {


    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

        ArrayList<Integer> evenNumbers = new ArrayList<>();

        /*
        for (Integer  index: numbers) {
            if ( index % 2 == 0){

                evenNumbers.add(numbers.get(index));

            }
        }
        return evenNumbers;
        }

        */
        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i) % 2 == 0) {
                int temp;
                temp = numbers.get(i);
                evenNumbers.add(temp);
            }
        }
        return evenNumbers;
    }

}








