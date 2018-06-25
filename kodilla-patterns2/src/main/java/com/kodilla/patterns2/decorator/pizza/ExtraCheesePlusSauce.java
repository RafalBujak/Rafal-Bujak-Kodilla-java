package com.kodilla.patterns2.decorator.pizza;

public class ExtraCheesePlusSauce extends AbstractPizzaOrderDecorator {
    public ExtraCheesePlusSauce(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public double getPizzaCost() {
        // stub extra 2.00 pln
        return super.getPizzaCost() + 2;
    }

    @Override
    public String getPizzaDescription() {
        return super.getPizzaDescription() + " cheese and garlic sauce";
    }
}
