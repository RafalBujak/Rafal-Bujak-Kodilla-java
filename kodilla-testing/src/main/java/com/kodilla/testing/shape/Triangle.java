package com.kodilla.testing.shape;

public class Triangle implements Shape {

    String name;
    double field;

    Triangle (String name, double field){
        this.name = name;
        this.field = field;
    }

    @Override
    public String getShapeName() {

        return name;
    }

    @Override
    public double getField(double n) {
        field = (n * n) / 4;
        return field;
    }

    //public double getField1() {
       //return field;
   // }

    @Override
    public String toString(){
        return getShapeName() + " " + getField(field);
    }
}
