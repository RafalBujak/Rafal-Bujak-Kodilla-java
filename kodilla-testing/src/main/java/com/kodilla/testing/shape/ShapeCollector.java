package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.*;

public class ShapeCollector {

    private Shape shape;

    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }

    ArrayList<String> figure = new ArrayList<>();

   public ArrayList<String> addFigure(Shape shape) {
    figure.add(shape.toString());
    return figure;
    }

    List<String> removeFigure(Shape shape){
        figure.remove(shape.toString());
        return figure;
    }

    String getFigure(int n){
        String temp;
               temp = figure.get(n);
        return temp;
    }

    String showFigures() {
        return null;
    }

}
