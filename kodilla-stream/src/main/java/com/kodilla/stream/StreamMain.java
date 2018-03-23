package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.ExtraCharsForMakeBeautyfier;


public class StreamMain {

    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        // Expression with method reference
        poemBeautifier.beautify("New text to checking", String::toUpperCase);
        poemBeautifier.beautify("Up and Down", ExtraCharsForMakeBeautyfier::beauteText);
        poemBeautifier.beautify("I like This Task", String::toLowerCase);
        poemBeautifier.beautify("Si vis pacem, para bellum", ExtraCharsForMakeBeautyfier::beauteText2);

    }
}
