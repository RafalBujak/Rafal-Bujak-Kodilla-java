package com.kodilla.testing.calculator;

public class Calculator {
    private int a, b;
    private int result;

   public Calculator (int a, int b){
        this.a = a;
        this.b = b;
    }

    public int add(){
        return a + b;
    }

    public int subtract(){
        return a - b;
    }

    public int getResultAdding(){
       return result = a + b;
    }

    public int getResultsubtraction(){
        return result = a - b;
    }

}
