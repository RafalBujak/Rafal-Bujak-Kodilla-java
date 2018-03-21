package com.kodilla.testing.shape;

public class Circle implements Shape{

    String name;
    double field;

    Circle (String name, double field){
        this.name = name;
        this.field = field;
    }
    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField(double n) {
        double pi = 3.1415;
        field = pi * (n * 2);
        return field;
    }

    public double getField1(){
        return field;
    }
    @Override
    public String toString(){
        return getShapeName() + " " + getField1();
    }
}
