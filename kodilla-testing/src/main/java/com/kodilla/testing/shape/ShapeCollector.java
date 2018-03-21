package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.*;

public class ShapeCollector {

    private Shape shape;

    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }

    ArrayList<Shape> figure = new ArrayList<>();

    public ArrayList<Shape> addFigure(Shape shape) {
        figure.add(shape);
        return figure;
    }

    List<Shape> removeFigure(Shape shape) {
        figure.remove(shape);
        return figure;
    }

    Shape getFigure(int n) {

        shape = figure.get(n);
        return shape;
    }

    public void showFigures() {


        System.out.println(figure);


    }

}
