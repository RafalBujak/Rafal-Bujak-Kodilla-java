package com.kodilla.testing.shape;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {

    ShapeCollector test = new ShapeCollector(new Circle("new Circle", 12));
    @Test

    public void testAddFigure(){



        Triangle triangle = new Triangle("triangle 1", 16);
       Triangle triangle1 = new Triangle ("nazwa1", 123);
        Triangle triangle2 = new Triangle ("nazwa2", 234);

        test.addFigure(triangle);
       test.addFigure(triangle1);
        test.addFigure(triangle2);



        ArrayList<Shape> forTesting = new ArrayList<>();
        forTesting.add(triangle);
       forTesting.add(triangle1);
        forTesting.add(triangle2);

       Assert.assertEquals(forTesting.get(0), test.getFigure(0));
       //System.out.println(test.getFigure(2));
    }

    @Test
    public void testRemoveFigure() {


        Triangle triangle1 = new Triangle ("nazwa1", 123);
        Triangle triangle2 = new Triangle ("nazwa2", 234);

        test.addFigure(triangle1);
        test.addFigure(triangle2);

        test.removeFigure(triangle1);

        Assert.assertEquals(test.getFigure(0), triangle2);
    }

    @Test
    public void testGetFigure() {
        Triangle triangle1 = new Triangle ("nazwa1", 123);
        test.addFigure(triangle1);

        Assert.assertEquals(triangle1, test.getFigure(0));
    }


}
