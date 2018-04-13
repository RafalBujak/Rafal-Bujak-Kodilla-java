package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public class Display {

    public String displayValue(double val){
        System.out.println("Value: " + val);
        return String.valueOf(val);
    }
}
