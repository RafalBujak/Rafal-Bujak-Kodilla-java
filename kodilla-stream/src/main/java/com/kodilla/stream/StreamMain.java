package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;


public class StreamMain {

    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("New text to checking", String::toUpperCase);
        poemBeautifier.beautify("Up and Down", (text)-> {return "# @ ~~~~ {" + text.toUpperCase() +"} ~~~~ @ #";});
        poemBeautifier.beautify("I like This Task", String::toLowerCase);
        poemBeautifier.beautify("Si vis pacem, para bellum", (text)->{return "#" + "@" + text + "#" + "@";});


        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
