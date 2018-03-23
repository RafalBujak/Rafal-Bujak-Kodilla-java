package com.kodilla.stream.beautifier;

public class ExtraCharsForMakeBeautyfier {
    public static String beauteText(String text){
        return "#" + "@" + text + "#" + "@";
    }
    public static String beauteText2(String text){
        return "#" + "@" + text.toUpperCase() + "#" + "@";
    }
}
