package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        double calculatedCost = theOrder.getPizzaCost();
        //then
        assertEquals(15, calculatedCost, 0);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getPizzaDescription();
        //then
        assertEquals("Pizza with tomato sauce and cheese", description);
    }

    @Test
    public void testMushroomsPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraPizzaMushrooms(theOrder);
        //When
        double calculatedCost = theOrder.getPizzaCost();
        //then
        assertEquals(17, calculatedCost, 0);
    }

    @Test
    public void testMushroomsPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraPizzaMushrooms(theOrder);
        //When
        String description = theOrder.getPizzaDescription();
        //then
        assertEquals("Pizza with tomato sauce and cheese extra mushrooms", description);
    }

    @Test
    public void testAdditivesPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraPizzaMushrooms(theOrder);
        theOrder = new ExtraPizzaSetAddition(theOrder);
        theOrder = new ExtraCheesePlusSauce(theOrder);
        //When
        double calculatedCost = theOrder.getPizzaCost();
        //then
        assertEquals(24, calculatedCost, 0);
    }

    @Test
    public void testAdditivesPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraPizzaMushrooms(theOrder);
        theOrder = new ExtraPizzaSetAddition(theOrder);
        theOrder = new ExtraCheesePlusSauce(theOrder);
        //When
        String description = theOrder.getPizzaDescription();
        //then
        assertEquals("Pizza with tomato sauce and cheese extra mushrooms " +
                "peppers, tuna, broccoli, ham, salami " +
                "cheese and garlic sauce", description);
    }
}
