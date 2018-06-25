package com.kodilla.patterns2.decorator.pizza;

public class ExtraPizzaMushrooms extends AbstractPizzaOrderDecorator {

    public ExtraPizzaMushrooms(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public double getPizzaCost() {
        //Hardcoded stub cost 2.00
        return super.getPizzaCost() + 2.00;
    }

    @Override
    public String getPizzaDescription() {
        return super.getPizzaDescription() + " extra mushrooms";
    }
}
