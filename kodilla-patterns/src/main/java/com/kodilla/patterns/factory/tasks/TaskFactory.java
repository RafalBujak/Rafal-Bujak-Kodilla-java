package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";


    public final Task makeTask(final String taskClass) {
        switch(taskClass) {
            case SHOPPING:
                return new ShoppingTask("Shopping task", "Cheese" + "Bread", 2 + 1);
            case PAINTING:
                return new PaintingTask("Painting task", "black", "blue");
            case DRIVING:
                return new DrivingTask("Driving task", "Main Station", "Train");
            default:
                return null;
        }
    }
}
