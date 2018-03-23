package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String beautyText, PoemDecorator poemDecorator){
        String textAfterDecoration = poemDecorator.decorate(beautyText);
        System.out.println(textAfterDecoration);
    }
}
