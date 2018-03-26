package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;


public class StreamMain {

    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("New text to checking", String::toUpperCase);
        poemBeautifier.beautify("Up and Down", (text)-> {return "# @ ~~~~ {" + text.toUpperCase() +"} ~~~~ @ #";});
        poemBeautifier.beautify("I like This Task", String::toLowerCase);
        poemBeautifier.beautify("Si vis pacem, para bellum", (text)->{return "#" + "@" + text + "#" + "@";});

    }
}
