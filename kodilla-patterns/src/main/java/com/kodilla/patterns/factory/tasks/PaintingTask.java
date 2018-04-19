package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task{

    final String taskName;
    final String color;
    final String whatToPaint;

    PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String executeTask() {
        return "Painting task is executing";
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if(executeTask() != null) {
            return true;
        } else {
            return false;
        }
    }
}
