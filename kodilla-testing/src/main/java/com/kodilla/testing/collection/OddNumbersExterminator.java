package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {



    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++){
            if (numbers.get(i)%2 == 0){
                Integer temp = 0;

               temp = numbers.get(i);
               evenNumbers.add(temp);

            }
        }
        return evenNumbers;
    }



    }






