package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task {

    final String taskName;
    final String whatToBuy;
    final double quantity;

    ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;

    }

    @Override
    public String executeTask() {
        return "Shopping task is executing";
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (quantity > 0) {
            return true;
        } return false;
    }
}
