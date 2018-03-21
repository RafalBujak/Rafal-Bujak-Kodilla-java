package com.kodilla.testing.shape;

public class Square implements Shape {

    String name;
    double field;

    Square (String name, double field){
        this.name = name;
        this.field = field;
    }
    @Override
    public String getShapeName() {

        return name;
    }

    @Override
    public double getField(double n) {
        field = n * n;
        return field;
    }

    public double getField1() {
        return field;
    }
    @Override
    public String toString(){
        return getShapeName() + " " + getField1();
    }
}
