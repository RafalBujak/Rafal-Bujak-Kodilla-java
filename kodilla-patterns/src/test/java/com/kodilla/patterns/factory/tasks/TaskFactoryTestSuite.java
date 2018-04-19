package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals("Shopping task", shopping.getTaskName());
        Assert.assertEquals("Shopping task is executing", shopping.executeTask());
        Assert.assertEquals(true, shopping.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals("Painting task", painting.getTaskName());
        Assert.assertEquals("Painting task is executing", painting.executeTask());
        Assert.assertEquals(true, painting.isTaskExecuted());
    }

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals("Driving task", driving.getTaskName());
        Assert.assertEquals("Driving Task is executing", driving.executeTask());
        Assert.assertEquals(true, driving.isTaskExecuted());
    }
}
