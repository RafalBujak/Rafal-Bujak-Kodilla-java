package com.kodilla.patterns2.decorator.pizza;

public class BasicPizzaOrder implements PizzaOrder {
    @Override
    public double getPizzaCost() {
        double cost = 15;
        return cost;
    }

    @Override
    public String getPizzaDescription() {
        return "Pizza with tomato sauce and cheese";
    }
}
