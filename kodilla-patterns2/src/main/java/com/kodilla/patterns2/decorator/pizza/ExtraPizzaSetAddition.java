package com.kodilla.patterns2.decorator.pizza;

public class ExtraPizzaSetAddition extends AbstractPizzaOrderDecorator {

    public ExtraPizzaSetAddition(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public double getPizzaCost() {
        //stub cost 5.00 pln
        return super.getPizzaCost() + 5;
    }

    @Override
    public String getPizzaDescription() {
        return super.getPizzaDescription() + " peppers, tuna, broccoli, ham, salami";
    }
}
